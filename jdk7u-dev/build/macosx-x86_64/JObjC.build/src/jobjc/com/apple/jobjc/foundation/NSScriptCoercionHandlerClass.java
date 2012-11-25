package com.apple.jobjc.foundation;

public  class NSScriptCoercionHandlerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScriptCoercionHandlerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptCoercionHandlerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptCoercionHandlerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedCoercionHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedCoercionHandler_CMetInst(){
		return ((sharedCoercionHandler_CMetInst != null)
	? (sharedCoercionHandler_CMetInst)
	: (sharedCoercionHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedCoercionHandler", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptCoercionHandler sharedCoercionHandler(){
			final com.apple.jobjc.Invoke.MsgSend sharedCoercionHandler_CMetInst = get_sharedCoercionHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedCoercionHandler_CMetInst.init(nativeBuffer, this);
		sharedCoercionHandler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCoercionHandler returnValue = (com.apple.jobjc.foundation.NSScriptCoercionHandler) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
