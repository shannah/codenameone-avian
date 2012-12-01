CodeNameOne IOS Port Using Avian
=================

This project is an attempt at producing an iOS Port for CodeNameOne that runs on Avian. The default iOS port currently uses XMLVM which works well, but may leave some room to improve performance.  Avian provides AOT (Ahead of Time) compilation of Java source to native binaries that will run on iOS.  The hope of this project is to see if:

1. It is possible to produce a working port that runs on Avian.
2. Performance is better than the default iOS Port that runs on XMLVM.

Disclaimer: This Project is Experimental
----------

This software is currently just an experiment to see if it is possible to create an Avian port for CodeNameOne.  Currently it builds successfully and appears to work for many things, but there are consistent crashes occurring because of a problem with Avian's garbage collection.  I have posted a question in the Avian forums to try to solve this issue, but haven't received a response.  The question can be seen at
https://groups.google.com/d/msg/avian/o62nZ-wjerY/sXdiYgJU5Z8J

For more information about this project and its motivation, see my blog post at ...

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

	ios-version := 6.0


#### Setting the `JAVA_HOME` Environment Variable

Before running ANT, you'll need to set the `JAVA_HOME` environment variable.  
e.g.

	$ export JAVA_HOME=/Libary/Java/JavaVirtualMachines/1.7.0u.jdk/Contents/Home


###Running the ANT build script:


	$ ant -Dapp=/path/to/app/project \
		-Dmainclass=com.mycompany.myapp.MyApplication \
		-Dcn1=/path/to/codenameone-read-only

Where The `-Dapp` parameter should be set to the path to your Application's Netbeans project directory, and the `-Dmainclass` parameter is the fully qualified class name of your main application. class.  The `Dcn1` parameter should be the path to the root of the CodeNameOne repository (i.e. the result of checking out the http://codenameone.googlecode.com/svn/trunk SVN repository.

Running this command should build the application into a binary using Avian, and copy the necessary files to the Xcode project located in the `xcodeproj` directory.  After running 
the build (if it is successful), you should be able to open the `xcodeproj` project in Xcode, and then build the project to run directly in the simulator.

###Example: Building Kitchen Sink Demo Application

1. Create a new directory for building the application.  For this example, we'll call it `src`:
	$ mkdir src
	
2. Checkout the CodeNameOne Trunk into the src directory:
	$ cd src
	$ svn co http://codenameone.googlecode.com/svn/trunk codenameone-read-only
	
3. Clone the CodeNameOne-Avian port into the directory:
	$ git clone https://github.com/shannah/codenameone-avian.git
	
4. Change current working directory to codenameone-avian folder:
	$ cd codenameone-avian
	
5. Run the clean script just in case there are residual files that need to cleaned out first:
	$ ant clean
	
6. Set the JAVA_HOME environment variable to the location of your JDK7 installation:
	$ export JAVA_HOME=/Library/Java/JavaVirtualMachines/1.7.0jdk/Contents/Home
	
7. Run the ANT build script:
	$ ant -Dapp=../codenameone-read-only/Demos/KitchenSink \
		-Dmainclass=com.codename1.demos.kitchen.KitchenSink \
		-Dcn1=../codenameone-read-only
		
8. There will be lots of warnings (especially from Proguard), but it should build correct.  Assuming that is does build correctly, you can proceed to open the xcodeproj project in Xcode:
	$ open xcodeproj/hello/hello.xcodeproj
	
9. Build the project in Xcode and run on the simulator.
	

