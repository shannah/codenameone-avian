package com.apple.jobjc.foundation;

public  class NSUserScriptTask extends com.apple.jobjc.foundation.NSObject {
	public NSUserScriptTask(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserScriptTask(final NSUserScriptTask obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend executeWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeWithCompletionHandler_IMetInst(){
		return ((executeWithCompletionHandler_IMetInst != null)
	? (executeWithCompletionHandler_IMetInst)
	: (executeWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void executeWithCompletionHandler(final Object /* NSUserScriptTaskCompletionHandler (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend executeWithCompletionHandler_IMetInst = get_executeWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		executeWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_error_IMetInst(){
		return ((initWithURL_error_IMetInst != null)
	? (initWithURL_error_IMetInst)
	: (initWithURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_error_IMetInst = get_initWithURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithURL_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptURL_IMetInst(){
		return ((scriptURL_IMetInst != null)
	? (scriptURL_IMetInst)
	: (scriptURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL scriptURL(){
			final com.apple.jobjc.Invoke.MsgSend scriptURL_IMetInst = get_scriptURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptURL_IMetInst.init(nativeBuffer, this);
		scriptURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
