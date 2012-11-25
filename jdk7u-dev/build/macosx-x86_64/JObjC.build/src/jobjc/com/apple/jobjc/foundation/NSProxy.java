package com.apple.jobjc.foundation;

public  class NSProxy extends com.apple.jobjc.ID {
	public NSProxy(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSProxy(final NSProxy obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dealloc_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dealloc_IMetInst(){
		return ((dealloc_IMetInst != null)
	? (dealloc_IMetInst)
	: (dealloc_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dealloc", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void dealloc(){
			final com.apple.jobjc.Invoke.MsgSend dealloc_IMetInst = get_dealloc_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dealloc_IMetInst.init(nativeBuffer, this);
		dealloc_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend debugDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_debugDescription_IMetInst(){
		return ((debugDescription_IMetInst != null)
	? (debugDescription_IMetInst)
	: (debugDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "debugDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString debugDescription(){
			final com.apple.jobjc.Invoke.MsgSend debugDescription_IMetInst = get_debugDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		debugDescription_IMetInst.init(nativeBuffer, this);
		debugDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend finalizeVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finalizeVoid_IMetInst(){
		return ((finalizeVoid_IMetInst != null)
	? (finalizeVoid_IMetInst)
	: (finalizeVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finalize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finalizeVoid(){
			final com.apple.jobjc.Invoke.MsgSend finalizeVoid_IMetInst = get_finalizeVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finalizeVoid_IMetInst.init(nativeBuffer, this);
		finalizeVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend forwardInvocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_forwardInvocation_IMetInst(){
		return ((forwardInvocation_IMetInst != null)
	? (forwardInvocation_IMetInst)
	: (forwardInvocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "forwardInvocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void forwardInvocation(final com.apple.jobjc.foundation.NSInvocation invocation){
			final com.apple.jobjc.Invoke.MsgSend forwardInvocation_IMetInst = get_forwardInvocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		forwardInvocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, invocation);
		forwardInvocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend methodSignatureForSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodSignatureForSelector_IMetInst(){
		return ((methodSignatureForSelector_IMetInst != null)
	? (methodSignatureForSelector_IMetInst)
	: (methodSignatureForSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodSignatureForSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMethodSignature methodSignatureForSelector(final com.apple.jobjc.SEL sel){
			final com.apple.jobjc.Invoke.MsgSend methodSignatureForSelector_IMetInst = get_methodSignatureForSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodSignatureForSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		methodSignatureForSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMethodSignature returnValue = (com.apple.jobjc.foundation.NSMethodSignature) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
