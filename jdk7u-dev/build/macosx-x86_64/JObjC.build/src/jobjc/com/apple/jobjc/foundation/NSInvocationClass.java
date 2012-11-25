package com.apple.jobjc.foundation;

public  class NSInvocationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSInvocationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSInvocationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSInvocationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend invocationWithMethodSignature_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invocationWithMethodSignature_CMetInst(){
		return ((invocationWithMethodSignature_CMetInst != null)
	? (invocationWithMethodSignature_CMetInst)
	: (invocationWithMethodSignature_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invocationWithMethodSignature:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSInvocation invocationWithMethodSignature(final com.apple.jobjc.foundation.NSMethodSignature sig){
			final com.apple.jobjc.Invoke.MsgSend invocationWithMethodSignature_CMetInst = get_invocationWithMethodSignature_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invocationWithMethodSignature_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sig);
		invocationWithMethodSignature_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSInvocation returnValue = (com.apple.jobjc.foundation.NSInvocation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
