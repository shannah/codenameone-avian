package com.apple.jobjc.foundation;

public  class NSUserUnixTask extends com.apple.jobjc.foundation.NSUserScriptTask {
	public NSUserUnixTask(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserUnixTask(final NSUserUnixTask obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend executeWithArguments_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeWithArguments_completionHandler_IMetInst(){
		return ((executeWithArguments_completionHandler_IMetInst != null)
	? (executeWithArguments_completionHandler_IMetInst)
	: (executeWithArguments_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeWithArguments:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void executeWithArguments_completionHandler(final com.apple.jobjc.foundation.NSArray arguments, final Object /* NSUserUnixTaskCompletionHandler (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend executeWithArguments_completionHandler_IMetInst = get_executeWithArguments_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeWithArguments_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		executeWithArguments_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardError_IMetInst(){
		return ((setStandardError_IMetInst != null)
	? (setStandardError_IMetInst)
	: (setStandardError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardError(final com.apple.jobjc.foundation.NSFileHandle standardError){
			final com.apple.jobjc.Invoke.MsgSend setStandardError_IMetInst = get_setStandardError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, standardError);
		setStandardError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardInput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardInput_IMetInst(){
		return ((setStandardInput_IMetInst != null)
	? (setStandardInput_IMetInst)
	: (setStandardInput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardInput:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardInput(final com.apple.jobjc.foundation.NSFileHandle standardInput){
			final com.apple.jobjc.Invoke.MsgSend setStandardInput_IMetInst = get_setStandardInput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardInput_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, standardInput);
		setStandardInput_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardOutput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardOutput_IMetInst(){
		return ((setStandardOutput_IMetInst != null)
	? (setStandardOutput_IMetInst)
	: (setStandardOutput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardOutput:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardOutput(final com.apple.jobjc.foundation.NSFileHandle standardOutput){
			final com.apple.jobjc.Invoke.MsgSend setStandardOutput_IMetInst = get_setStandardOutput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardOutput_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, standardOutput);
		setStandardOutput_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend standardError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardError_IMetInst(){
		return ((standardError_IMetInst != null)
	? (standardError_IMetInst)
	: (standardError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardError", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileHandle standardError(){
			final com.apple.jobjc.Invoke.MsgSend standardError_IMetInst = get_standardError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardError_IMetInst.init(nativeBuffer, this);
		standardError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileHandle returnValue = (com.apple.jobjc.foundation.NSFileHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardInput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardInput_IMetInst(){
		return ((standardInput_IMetInst != null)
	? (standardInput_IMetInst)
	: (standardInput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardInput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileHandle standardInput(){
			final com.apple.jobjc.Invoke.MsgSend standardInput_IMetInst = get_standardInput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardInput_IMetInst.init(nativeBuffer, this);
		standardInput_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileHandle returnValue = (com.apple.jobjc.foundation.NSFileHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardOutput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardOutput_IMetInst(){
		return ((standardOutput_IMetInst != null)
	? (standardOutput_IMetInst)
	: (standardOutput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardOutput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileHandle standardOutput(){
			final com.apple.jobjc.Invoke.MsgSend standardOutput_IMetInst = get_standardOutput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardOutput_IMetInst.init(nativeBuffer, this);
		standardOutput_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileHandle returnValue = (com.apple.jobjc.foundation.NSFileHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
