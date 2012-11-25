package com.apple.jobjc.foundation;

public  class NSScriptExecutionContextClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScriptExecutionContextClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptExecutionContextClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptExecutionContextClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedScriptExecutionContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedScriptExecutionContext_CMetInst(){
		return ((sharedScriptExecutionContext_CMetInst != null)
	? (sharedScriptExecutionContext_CMetInst)
	: (sharedScriptExecutionContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedScriptExecutionContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptExecutionContext sharedScriptExecutionContext(){
			final com.apple.jobjc.Invoke.MsgSend sharedScriptExecutionContext_CMetInst = get_sharedScriptExecutionContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedScriptExecutionContext_CMetInst.init(nativeBuffer, this);
		sharedScriptExecutionContext_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptExecutionContext returnValue = (com.apple.jobjc.foundation.NSScriptExecutionContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
