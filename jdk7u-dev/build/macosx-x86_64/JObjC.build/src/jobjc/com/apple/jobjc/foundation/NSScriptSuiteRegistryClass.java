package com.apple.jobjc.foundation;

public  class NSScriptSuiteRegistryClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScriptSuiteRegistryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptSuiteRegistryClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptSuiteRegistryClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend setSharedScriptSuiteRegistry_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSharedScriptSuiteRegistry_CMetInst(){
		return ((setSharedScriptSuiteRegistry_CMetInst != null)
	? (setSharedScriptSuiteRegistry_CMetInst)
	: (setSharedScriptSuiteRegistry_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSharedScriptSuiteRegistry:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSharedScriptSuiteRegistry(final com.apple.jobjc.foundation.NSScriptSuiteRegistry registry){
			final com.apple.jobjc.Invoke.MsgSend setSharedScriptSuiteRegistry_CMetInst = get_setSharedScriptSuiteRegistry_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSharedScriptSuiteRegistry_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, registry);
		setSharedScriptSuiteRegistry_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedScriptSuiteRegistry_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedScriptSuiteRegistry_CMetInst(){
		return ((sharedScriptSuiteRegistry_CMetInst != null)
	? (sharedScriptSuiteRegistry_CMetInst)
	: (sharedScriptSuiteRegistry_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedScriptSuiteRegistry", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptSuiteRegistry sharedScriptSuiteRegistry(){
			final com.apple.jobjc.Invoke.MsgSend sharedScriptSuiteRegistry_CMetInst = get_sharedScriptSuiteRegistry_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedScriptSuiteRegistry_CMetInst.init(nativeBuffer, this);
		sharedScriptSuiteRegistry_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptSuiteRegistry returnValue = (com.apple.jobjc.foundation.NSScriptSuiteRegistry) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
