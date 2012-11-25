package com.apple.jobjc.foundation;

public  class NSInvocationOperation extends com.apple.jobjc.foundation.NSOperation {
	public NSInvocationOperation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSInvocationOperation(final NSInvocationOperation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithInvocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithInvocation_IMetInst(){
		return ((initWithInvocation_IMetInst != null)
	? (initWithInvocation_IMetInst)
	: (initWithInvocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithInvocation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithInvocation(final com.apple.jobjc.foundation.NSInvocation inv){
			final com.apple.jobjc.Invoke.MsgSend initWithInvocation_IMetInst = get_initWithInvocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithInvocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inv);
		initWithInvocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTarget_selector_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTarget_selector_object_IMetInst(){
		return ((initWithTarget_selector_object_IMetInst != null)
	? (initWithTarget_selector_object_IMetInst)
	: (initWithTarget_selector_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTarget:selector:object:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTarget_selector_object(final com.apple.jobjc.ID target, final com.apple.jobjc.SEL sel, final com.apple.jobjc.ID arg){
			final com.apple.jobjc.Invoke.MsgSend initWithTarget_selector_object_IMetInst = get_initWithTarget_selector_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTarget_selector_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		initWithTarget_selector_object_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invocation_IMetInst(){
		return ((invocation_IMetInst != null)
	? (invocation_IMetInst)
	: (invocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invocation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSInvocation invocation(){
			final com.apple.jobjc.Invoke.MsgSend invocation_IMetInst = get_invocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invocation_IMetInst.init(nativeBuffer, this);
		invocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSInvocation returnValue = (com.apple.jobjc.foundation.NSInvocation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend result_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_result_IMetInst(){
		return ((result_IMetInst != null)
	? (result_IMetInst)
	: (result_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "result", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T result(){
			final com.apple.jobjc.Invoke.MsgSend result_IMetInst = get_result_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		result_IMetInst.init(nativeBuffer, this);
		result_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
