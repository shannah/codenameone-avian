package com.apple.jobjc.appkit;

public  class NSTokenFieldClass extends com.apple.jobjc.appkit.NSTextFieldClass {
	public NSTokenFieldClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTokenFieldClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTokenFieldClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultCompletionDelay_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultCompletionDelay_CMetInst(){
		return ((defaultCompletionDelay_CMetInst != null)
	? (defaultCompletionDelay_CMetInst)
	: (defaultCompletionDelay_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultCompletionDelay", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double defaultCompletionDelay(){
			final com.apple.jobjc.Invoke.MsgSend defaultCompletionDelay_CMetInst = get_defaultCompletionDelay_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultCompletionDelay_CMetInst.init(nativeBuffer, this);
		defaultCompletionDelay_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultTokenizingCharacterSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultTokenizingCharacterSet_CMetInst(){
		return ((defaultTokenizingCharacterSet_CMetInst != null)
	? (defaultTokenizingCharacterSet_CMetInst)
	: (defaultTokenizingCharacterSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultTokenizingCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCharacterSet defaultTokenizingCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend defaultTokenizingCharacterSet_CMetInst = get_defaultTokenizingCharacterSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultTokenizingCharacterSet_CMetInst.init(nativeBuffer, this);
		defaultTokenizingCharacterSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCharacterSet returnValue = (com.apple.jobjc.foundation.NSCharacterSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
