package com.apple.jobjc.foundation;

public  class NSAssertionHandlerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAssertionHandlerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAssertionHandlerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAssertionHandlerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentHandler_CMetInst(){
		return ((currentHandler_CMetInst != null)
	? (currentHandler_CMetInst)
	: (currentHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentHandler", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAssertionHandler currentHandler(){
			final com.apple.jobjc.Invoke.MsgSend currentHandler_CMetInst = get_currentHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentHandler_CMetInst.init(nativeBuffer, this);
		currentHandler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAssertionHandler returnValue = (com.apple.jobjc.foundation.NSAssertionHandler) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
