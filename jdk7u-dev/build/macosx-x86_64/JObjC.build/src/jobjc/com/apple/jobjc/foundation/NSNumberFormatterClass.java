package com.apple.jobjc.foundation;

public  class NSNumberFormatterClass extends com.apple.jobjc.foundation.NSFormatterClass {
	public NSNumberFormatterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNumberFormatterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNumberFormatterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultFormatterBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultFormatterBehavior_CMetInst(){
		return ((defaultFormatterBehavior_CMetInst != null)
	? (defaultFormatterBehavior_CMetInst)
	: (defaultFormatterBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultFormatterBehavior", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultFormatterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend defaultFormatterBehavior_CMetInst = get_defaultFormatterBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultFormatterBehavior_CMetInst.init(nativeBuffer, this);
		defaultFormatterBehavior_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedStringFromNumber_numberStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedStringFromNumber_numberStyle_CMetInst(){
		return ((localizedStringFromNumber_numberStyle_CMetInst != null)
	? (localizedStringFromNumber_numberStyle_CMetInst)
	: (localizedStringFromNumber_numberStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStringFromNumber:numberStyle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString localizedStringFromNumber_numberStyle(final com.apple.jobjc.foundation.NSNumber num, final long nstyle){
			final com.apple.jobjc.Invoke.MsgSend localizedStringFromNumber_numberStyle_CMetInst = get_localizedStringFromNumber_numberStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStringFromNumber_numberStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, num);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, nstyle);
		localizedStringFromNumber_numberStyle_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultFormatterBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultFormatterBehavior_CMetInst(){
		return ((setDefaultFormatterBehavior_CMetInst != null)
	? (setDefaultFormatterBehavior_CMetInst)
	: (setDefaultFormatterBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultFormatterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultFormatterBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setDefaultFormatterBehavior_CMetInst = get_setDefaultFormatterBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultFormatterBehavior_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, behavior);
		setDefaultFormatterBehavior_CMetInst.invoke(nativeBuffer);
		
		
	}

}
