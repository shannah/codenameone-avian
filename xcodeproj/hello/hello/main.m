#import <UIKit/UIKit.h>
#import <jni.h>

JavaVM *CodenameOne_VirtualMachine;

int main(int argc, char *argv[])
{
    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    //NSBundle *mainBundle = [NSBundle mainBundle];
    //NSDictionary *infoDictionary = [mainBundle infoDictionary];
    //NSString *mainClassName = [infoDictionary valueForKey:@"JVMMainClassName"];
    //NSString *mainClassPath = [mainClassName stringByReplacingOccurrencesOfString:@"." withString:@"/"];
    
    NSLog(@"App finished launching 2");
    // Override point for customization after application launch.
    //NSLog(@"Main class is %@", mainClassName);
    
    
    JavaVMInitArgs vmArgs;
    vmArgs.version = JNI_VERSION_1_2;
    vmArgs.nOptions = 4;
    vmArgs.ignoreUnrecognized = JNI_FALSE;
    
    JavaVMOption options[vmArgs.nOptions];
    vmArgs.options = options;
    
    options[0].optionString = (char*) "-Davian.bootimage=bootimageBin";
    options[1].optionString = (char*) "-Davian.codeimage=codeimageBin";
    options[2].optionString = (char*) "-Xbootclasspath:[bootJar]:[resourcesJar]";
    options[3].optionString = (char*) "-Djava.awt.headless=true";
    
    JavaVM* vm;
    void* env;
    NSLog(@"Creating Java VM");
    JNI_CreateJavaVM(&vm, &env, &vmArgs);
    CodenameOne_VirtualMachine = vm;
    NSLog(@"Finished creating Java VM");
    JNIEnv* e = (JNIEnv*) env;
    
    //com_codename1_impl_ios_IOSImplementation_callback__();
    NSLog(@"Getting IOSImplementation Class");
    jclass IOSImplementation = (*e)->FindClass(e, "ca/weblite/codename1/app/Main");
    if ( !(*e)->ExceptionCheck(e)){
        NSLog(@"Successfully retrieved IOSImplementation class");
        
        jmethodID callback = (*e)->GetStaticMethodID(e, IOSImplementation, "main", "([Ljava/lang/String;)V");
        if ( !(*e)->ExceptionCheck(e) ){
            NSLog(@"Callingn callback for finished launching");
            (*e)->CallStaticVoidMethod(e, IOSImplementation, callback);
            //exit(2);
        } else {
            (*e)->ExceptionDescribe(e);
        }
        
    } else {
        
        (*e)->ExceptionDescribe(e);
    }
    
    [pool release];
    return (*e)->ExceptionCheck(e) ? NO : YES;
    
}
