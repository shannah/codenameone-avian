package com.apple.jobjc.appkit;

public  class NSOpenGLViewClass extends com.apple.jobjc.appkit.NSViewClass {
	public NSOpenGLViewClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOpenGLViewClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOpenGLViewClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultPixelFormat_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultPixelFormat_CMetInst(){
		return ((defaultPixelFormat_CMetInst != null)
	? (defaultPixelFormat_CMetInst)
	: (defaultPixelFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultPixelFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLPixelFormat defaultPixelFormat(){
			final com.apple.jobjc.Invoke.MsgSend defaultPixelFormat_CMetInst = get_defaultPixelFormat_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultPixelFormat_CMetInst.init(nativeBuffer, this);
		defaultPixelFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLPixelFormat returnValue = (com.apple.jobjc.appkit.NSOpenGLPixelFormat) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
