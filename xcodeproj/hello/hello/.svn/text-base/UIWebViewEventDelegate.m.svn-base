/*
 * Copyright (c) 2012, Codename One and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Codename One designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *  
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 * 
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Please contact Codename One through http://www.codenameone.com/ if you 
 * need additional information or have any questions.
 */

#import "UIWebViewEventDelegate.h"
//#include "com_codename1_impl_ios_IOSImplementation.h"

@implementation UIWebViewEventDelegate

- (id)initWithCallback:(void*)callback {
    self = [super init];
    JNIEnv* env = [CodenameOne_GLAppDelegate jniEnv];
    IOSImplementation = (*env)->FindClass(env, "com/codename1/impl/ios/IOSImplementation");
    (*env)->NewGlobalRef(env, IOSImplementation);
    if (self) {
        c = callback;
        (*env)->NewGlobalRef(env, c);
    }
    
    return self;
}

- (void)webView:(UIWebView *)webView didFailLoadWithError:(NSError *)error {
    
    JNIEnv *env = [CodenameOne_GLAppDelegate jniEnv];
    jmethodID fireWebViewError = (*env)->GetStaticMethodID(env, IOSImplementation, "fireWebViewError",
                                                     "(Lcom/codename1/ui/BrowserComponent;)V");
    (*env)->CallStaticVoidMethod(env, IOSImplementation, fireWebViewError, c);

    
    //com_codename1_impl_ios_IOSImplementation_fireWebViewError___com_codename1_ui_BrowserComponent(c);
}

- (BOOL)webView:(UIWebView *)webView shouldStartLoadWithRequest:(NSURLRequest *)request navigationType:(UIWebViewNavigationType)navigationType {
    JNIEnv* env = [CodenameOne_GLAppDelegate jniEnv];
    
    jmethodID fireWebViewDidStartLoad = (*env)->GetStaticMethodID(env, IOSImplementation, "fireWebViewDidStartLoad", "(Lcom/codename1/ui/BrowserComponent;Ljava/lang/String;)V");

    (*env)->CallStaticVoidMethod(
         env,
         IOSImplementation,
         fireWebViewDidStartLoad,
         c,
         (*env)->NewStringUTF(env, request.URL.absoluteString.UTF8String)
    );
    return YES;
}

- (void)webViewDidFinishLoad:(UIWebView *)webView {
    JNIEnv* env = [CodenameOne_GLAppDelegate jniEnv];
    jmethodID  fireWebViewDidFinishLoad = (*env)->GetStaticMethodID(env, IOSImplementation, "fireWebViewDidFinishLoad", "(Lcom/codename1/ui/BrowserComponent;Ljava/lang/String;)V");
    (*env)->CallStaticVoidMethod(env, IOSImplementation,fireWebViewDidFinishLoad, c,  (*env)->NewStringUTF(env, webView.request.URL.absoluteString.UTF8String));
    
}

- (void)webViewDidStartLoad:(UIWebView *)webView {
}

@end
