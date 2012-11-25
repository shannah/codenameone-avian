package com.apple.jobjc.foundation;

public  class NSUserAutomatorTask extends com.apple.jobjc.foundation.NSUserScriptTask {
	public NSUserAutomatorTask(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserAutomatorTask(final NSUserAutomatorTask obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend executeWithInput_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeWithInput_completionHandler_IMetInst(){
		return ((executeWithInput_completionHandler_IMetInst != null)
	? (executeWithInput_completionHandler_IMetInst)
	: (executeWithInput_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeWithInput:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void executeWithInput_completionHandler(final com.apple.jobjc.ID input, final Object /* NSUserAutomatorTaskCompletionHandler (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend executeWithInput_completionHandler_IMetInst = get_executeWithInput_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeWithInput_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, input);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		executeWithInput_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVariables_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVariables_IMetInst(){
		return ((setVariables_IMetInst != null)
	? (setVariables_IMetInst)
	: (setVariables_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVariables:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVariables(final com.apple.jobjc.foundation.NSDictionary variables){
			final com.apple.jobjc.Invoke.MsgSend setVariables_IMetInst = get_setVariables_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVariables_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, variables);
		setVariables_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend variables_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_variables_IMetInst(){
		return ((variables_IMetInst != null)
	? (variables_IMetInst)
	: (variables_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "variables", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary variables(){
			final com.apple.jobjc.Invoke.MsgSend variables_IMetInst = get_variables_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		variables_IMetInst.init(nativeBuffer, this);
		variables_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
