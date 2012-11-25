package com.apple.jobjc.appkit;

public  class NSTokenField extends com.apple.jobjc.appkit.NSTextField {
	public NSTokenField(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTokenField(final NSTokenField obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend completionDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completionDelay_IMetInst(){
		return ((completionDelay_IMetInst != null)
	? (completionDelay_IMetInst)
	: (completionDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completionDelay", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double completionDelay(){
			final com.apple.jobjc.Invoke.MsgSend completionDelay_IMetInst = get_completionDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completionDelay_IMetInst.init(nativeBuffer, this);
		completionDelay_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompletionDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompletionDelay_IMetInst(){
		return ((setCompletionDelay_IMetInst != null)
	? (setCompletionDelay_IMetInst)
	: (setCompletionDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompletionDelay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setCompletionDelay(final double delay){
			final com.apple.jobjc.Invoke.MsgSend setCompletionDelay_IMetInst = get_setCompletionDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompletionDelay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delay);
		setCompletionDelay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTokenStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTokenStyle_IMetInst(){
		return ((setTokenStyle_IMetInst != null)
	? (setTokenStyle_IMetInst)
	: (setTokenStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTokenStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTokenStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setTokenStyle_IMetInst = get_setTokenStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTokenStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setTokenStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTokenizingCharacterSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTokenizingCharacterSet_IMetInst(){
		return ((setTokenizingCharacterSet_IMetInst != null)
	? (setTokenizingCharacterSet_IMetInst)
	: (setTokenizingCharacterSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTokenizingCharacterSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTokenizingCharacterSet(final com.apple.jobjc.foundation.NSCharacterSet characterSet){
			final com.apple.jobjc.Invoke.MsgSend setTokenizingCharacterSet_IMetInst = get_setTokenizingCharacterSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTokenizingCharacterSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, characterSet);
		setTokenizingCharacterSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenStyle_IMetInst(){
		return ((tokenStyle_IMetInst != null)
	? (tokenStyle_IMetInst)
	: (tokenStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tokenStyle(){
			final com.apple.jobjc.Invoke.MsgSend tokenStyle_IMetInst = get_tokenStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenStyle_IMetInst.init(nativeBuffer, this);
		tokenStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tokenizingCharacterSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tokenizingCharacterSet_IMetInst(){
		return ((tokenizingCharacterSet_IMetInst != null)
	? (tokenizingCharacterSet_IMetInst)
	: (tokenizingCharacterSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tokenizingCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCharacterSet tokenizingCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend tokenizingCharacterSet_IMetInst = get_tokenizingCharacterSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tokenizingCharacterSet_IMetInst.init(nativeBuffer, this);
		tokenizingCharacterSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCharacterSet returnValue = (com.apple.jobjc.foundation.NSCharacterSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
