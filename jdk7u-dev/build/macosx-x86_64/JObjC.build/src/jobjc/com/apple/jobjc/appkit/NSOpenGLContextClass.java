package com.apple.jobjc.appkit;

public  class NSOpenGLContextClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSOpenGLContextClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOpenGLContextClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOpenGLContextClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend clearCurrentContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearCurrentContext_CMetInst(){
		return ((clearCurrentContext_CMetInst != null)
	? (clearCurrentContext_CMetInst)
	: (clearCurrentContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearCurrentContext", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void clearCurrentContext(){
			final com.apple.jobjc.Invoke.MsgSend clearCurrentContext_CMetInst = get_clearCurrentContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearCurrentContext_CMetInst.init(nativeBuffer, this);
		clearCurrentContext_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentContext_CMetInst(){
		return ((currentContext_CMetInst != null)
	? (currentContext_CMetInst)
	: (currentContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenGLContext currentContext(){
			final com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst = get_currentContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentContext_CMetInst.init(nativeBuffer, this);
		currentContext_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenGLContext returnValue = (com.apple.jobjc.appkit.NSOpenGLContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
