//
//  ScanCodeImpl.m
//  KitchenSink
//
//  Created by Shai Almog on 05/11/12.
//
//

#import "ScanCodeImpl.h"
//#import "QRCodeReaderOC.h"
extern jstring fromNSString(JNIEnv*, NSString*);

@implementation ScanCodeImpl
- (void) imagePickerController: (UIImagePickerController*) reader didFinishPickingMediaWithInfo: (NSDictionary*) info
{
    return;
    /*
        // DISABLED BY steve@weblite.ca temporarily to get it to build.
        // Was having trouble linking with libzbar.  Need to find
        // source of libzbar so I can try to build it with i386 support
     
     
        // ADD: get the decode results
        id<NSFastEnumeration> results = [info objectForKey: ZBarReaderControllerResults];
        ZBarSymbol *symbol = nil;
        for(symbol in results)
            // EXAMPLE: just grab the first barcode
            break;
    JNIEnv *env = [CodenameOne_GLAppDelegate jniEnv];
    jclass IOSImplementation = (*env)->FindClass(env, "com/codename1/impl/ios/IOSImplementation");
    jmethodID scanCompleted = (*env)->GetStaticMethodID(env, IOSImplementation, "scanCompleted", "(Ljava/lang/String;Ljava/lang/String;)V");
    (*env)->CallStaticVoidMethod(env, IOSImplementation, scanCompleted, fromNSString(env, symbol.data), fromNSString(env, symbol.typeName));

        
        
        // EXAMPLE: do something useful with the barcode data
        //resultText.text = symbol.data;
        
        // EXAMPLE: do something useful with the barcode image
        //resultImage.image = [info objectForKey: UIImagePickerControllerOriginalImage];
        
        // ADD: dismiss the controller (NB dismiss from the *reader*!)
        [reader dismissModalViewControllerAnimated: YES];
     */
}

/*- (void)zxingController:(ZXingWidgetController*)controller didScanResult:(NSString *)result {
    com_codename1_impl_ios_IOSImplementation_scanCompleted___java_lang_String_java_lang_String(fromNSString(result), nil);
    [[CodenameOne_GLViewController instance] dismissModalViewControllerAnimated:NO];
}

- (void)zxingControllerDidCancel:(ZXingWidgetController*)controller {
    com_codename1_impl_ios_IOSImplementation_scanCanceled__();
    [[CodenameOne_GLViewController instance] dismissModalViewControllerAnimated:YES];
}*/

@end
