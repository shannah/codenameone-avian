package com.apple.jobjc.foundation;

public  class NSUserAppleScriptTask extends com.apple.jobjc.foundation.NSUserScriptTask {
	public NSUserAppleScriptTask(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserAppleScriptTask(final NSUserAppleScriptTask obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend executeWithAppleEvent_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeWithAppleEvent_completionHandler_IMetInst(){
		return ((executeWithAppleEvent_completionHandler_IMetInst != null)
	? (executeWithAppleEvent_completionHandler_IMetInst)
	: (executeWithAppleEvent_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeWithAppleEvent:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void executeWithAppleEvent_completionHandler(final com.apple.jobjc.foundation.NSAppleEventDescriptor event, final Object /* NSUserAppleScriptTaskCompletionHandler (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend executeWithAppleEvent_completionHandler_IMetInst = get_executeWithAppleEvent_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeWithAppleEvent_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		executeWithAppleEvent_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

}
