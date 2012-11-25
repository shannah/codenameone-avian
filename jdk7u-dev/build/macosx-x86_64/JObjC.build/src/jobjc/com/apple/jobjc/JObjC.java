package com.apple.jobjc;

public  class JObjC extends java.lang.Object {
	private static JObjC instance;
	final private com.apple.jobjc.JObjCRuntime runtime;
	 public static JObjC getInstance(final JObjCRuntime runtime){
		if(runtime == null) throw new NullPointerException("runtime");
		if(instance == null) instance = new JObjC(runtime);
		return instance;
	}
	 public static JObjC getInstance(){
		return getInstance(JObjCRuntime.getInstance());
	}
	 private  JObjC(final JObjCRuntime runtime){
		this.runtime = runtime;
		runtime.registerPackage("com.apple.jobjc.appkit");
		runtime.registerPackage("com.apple.jobjc.corefoundation");
		runtime.registerPackage("com.apple.jobjc.foundation");
	}
	private com.apple.jobjc.appkit.AppKitFramework _AppKit = null;
	public com.apple.jobjc.appkit.AppKitFramework AppKit() {
		return _AppKit != null ? _AppKit : (_AppKit = new com.apple.jobjc.appkit.AppKitFramework(runtime));
	}

	private com.apple.jobjc.corefoundation.CoreFoundationFramework _CoreFoundation = null;
	public com.apple.jobjc.corefoundation.CoreFoundationFramework CoreFoundation() {
		return _CoreFoundation != null ? _CoreFoundation : (_CoreFoundation = new com.apple.jobjc.corefoundation.CoreFoundationFramework(runtime));
	}

	private com.apple.jobjc.foundation.FoundationFramework _Foundation = null;
	public com.apple.jobjc.foundation.FoundationFramework Foundation() {
		return _Foundation != null ? _Foundation : (_Foundation = new com.apple.jobjc.foundation.FoundationFramework(runtime));
	}

}
