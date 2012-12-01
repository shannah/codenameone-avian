CodeNameOne IOS Port Using Avian
=================

This project is an attempt at producing an iOS Port for CodeNameOne that runs on Avian. The default iOS port currently uses XMLVM which works well, but may leave some room to improve performance.  Avian provides AOT (Ahead of Time) compilation of Java source to native binaries that will run on iOS.  The hope of this project is to see if:

1. It is possible to produce a working port that runs on Avian.
2. Performance is better than the default iOS Port that runs on XMLVM.

Contents
--------

This project includes the following subdirectories/projects:

1. jdk7u-dev - The Mac port of OpenJDK 7 downloaded from the jdk7u SVN repository.  This has been prebuilt on OS X Mountain Lion with a small (hopefully temporary) patch that was necessary to make it work in this Avian project.
2. proguard4.7 - Proguard, which is used to remove unused portions of the JDK when building your application.
3. avian - The avian source downloaded from the Avian GitHub repository.
4. xcodeproj - The base XCode project that will be prepared using the build.xml file.

Building An Application
-----------------------

The project includes an ANT build script (build.xml) that will prepare the Xcode project for building.  Building an application is a two step process:

1. Run the ANT build script.
2. Open the xcodeproj project in XCode and build the executable.

Currently the ANT build script is not as automatic as I would like.  Before it will work properly, you need to make a change to the makefile so that the script will build.  By default, it prepares the project for the iOS simulator.  You can pass a command line parameter to, instead, prepare the build for an actual iOS device, but I haven't tested this at all yet.

###Before Running the ANT Build Script

The ANT build script performs a number of steps including running `make` on the `xcodeproj` directory.  Eventually I would like to remove the dependence on this make file, but for now, it is there and may require some modifications before the project will build correctly.

Hence, before you run the ANT build script, you may need to modify the `xcodeproj/makefile` file to point to some locations that may differ in your environment.  

#### Setting the Correct ios-version Variable

One variable that you will need to adjust is the `ios-version` variable which refers to the version of iOS SDK that you have installed on your system.  It is currently set to "6.0", which is the version that is installed with Xcode 4.5.  If you don't have this version installed then you'll receive an error when you try to run the build like:

> couldn't find SDK

You can adjust the SDK by modifying the following line in the `xcodeproj/makefile` file:

<verbatim>
ios-version := 6.0
</verbatim>

#### Setting the `JAVA_HOME` Environment Variable

Before running ANT, you'll need to set the `JAVA_HOME` environment variable.  
e.g.
<verbatim>
$ export JAVA_HOME=/Libary/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home
</verbatim>



###Running the ANT build script:

<verbatim>
$ ant -Dapp=/path/to/app/project \
	-Dmainclass=com.mycompany.myapp.MyApplication
</verbatim>

Where The `-Dapp` parameter should be set to the path to your Application's Netbeans project directory, and the `-Dmainclass` parameter is the fully qualified class name of your main application. class.

Running this command should build the application into a binary using Avian, and copy the necessary files to the Xcode project located in the `xcodeproj` directory.  After running 
the build (if it is successful), you should be able to open the xcodeproj in Xcode, and then build the project to run directly in the simulator.

