package com.apple.jobjc.foundation;

public  class NSDecimalNumberClass extends com.apple.jobjc.foundation.NSNumberClass {
	public NSDecimalNumberClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDecimalNumberClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDecimalNumberClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend decimalNumberWithDecimal_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberWithDecimal_CMetInst(){
		return ((decimalNumberWithDecimal_CMetInst != null)
	? (decimalNumberWithDecimal_CMetInst)
	: (decimalNumberWithDecimal_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberWithDecimal:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSDecimal.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberWithDecimal(final com.apple.jobjc.foundation.NSDecimal dcm){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberWithDecimal_CMetInst = get_decimalNumberWithDecimal_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberWithDecimal_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSDecimal.getStructCoder().push(nativeBuffer, dcm);
		decimalNumberWithDecimal_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberWithMantissa_exponent_isNegative_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberWithMantissa_exponent_isNegative_CMetInst(){
		return ((decimalNumberWithMantissa_exponent_isNegative_CMetInst != null)
	? (decimalNumberWithMantissa_exponent_isNegative_CMetInst)
	: (decimalNumberWithMantissa_exponent_isNegative_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberWithMantissa:exponent:isNegative:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberWithMantissa_exponent_isNegative(final long mantissa, final short exponent, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberWithMantissa_exponent_isNegative_CMetInst = get_decimalNumberWithMantissa_exponent_isNegative_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberWithMantissa_exponent_isNegative_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, mantissa);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, exponent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		decimalNumberWithMantissa_exponent_isNegative_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberWithString_CMetInst(){
		return ((decimalNumberWithString_CMetInst != null)
	? (decimalNumberWithString_CMetInst)
	: (decimalNumberWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberWithString(final com.apple.jobjc.foundation.NSString numberValue){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberWithString_CMetInst = get_decimalNumberWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, numberValue);
		decimalNumberWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalNumberWithString_locale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberWithString_locale_CMetInst(){
		return ((decimalNumberWithString_locale_CMetInst != null)
	? (decimalNumberWithString_locale_CMetInst)
	: (decimalNumberWithString_locale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberWithString:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber decimalNumberWithString_locale(final com.apple.jobjc.foundation.NSString numberValue, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberWithString_locale_CMetInst = get_decimalNumberWithString_locale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberWithString_locale_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, numberValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		decimalNumberWithString_locale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultBehavior_CMetInst(){
		return ((defaultBehavior_CMetInst != null)
	? (defaultBehavior_CMetInst)
	: (defaultBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultBehavior", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultBehavior(){
			final com.apple.jobjc.Invoke.MsgSend defaultBehavior_CMetInst = get_defaultBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultBehavior_CMetInst.init(nativeBuffer, this);
		defaultBehavior_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumDecimalNumber_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumDecimalNumber_CMetInst(){
		return ((maximumDecimalNumber_CMetInst != null)
	? (maximumDecimalNumber_CMetInst)
	: (maximumDecimalNumber_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumDecimalNumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber maximumDecimalNumber(){
			final com.apple.jobjc.Invoke.MsgSend maximumDecimalNumber_CMetInst = get_maximumDecimalNumber_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumDecimalNumber_CMetInst.init(nativeBuffer, this);
		maximumDecimalNumber_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumDecimalNumber_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumDecimalNumber_CMetInst(){
		return ((minimumDecimalNumber_CMetInst != null)
	? (minimumDecimalNumber_CMetInst)
	: (minimumDecimalNumber_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumDecimalNumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber minimumDecimalNumber(){
			final com.apple.jobjc.Invoke.MsgSend minimumDecimalNumber_CMetInst = get_minimumDecimalNumber_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumDecimalNumber_CMetInst.init(nativeBuffer, this);
		minimumDecimalNumber_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notANumber_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notANumber_CMetInst(){
		return ((notANumber_CMetInst != null)
	? (notANumber_CMetInst)
	: (notANumber_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notANumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber notANumber(){
			final com.apple.jobjc.Invoke.MsgSend notANumber_CMetInst = get_notANumber_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notANumber_CMetInst.init(nativeBuffer, this);
		notANumber_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend one_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_one_CMetInst(){
		return ((one_CMetInst != null)
	? (one_CMetInst)
	: (one_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "one", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber one(){
			final com.apple.jobjc.Invoke.MsgSend one_CMetInst = get_one_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		one_CMetInst.init(nativeBuffer, this);
		one_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultBehavior_CMetInst(){
		return ((setDefaultBehavior_CMetInst != null)
	? (setDefaultBehavior_CMetInst)
	: (setDefaultBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultBehavior(final com.apple.jobjc.ID behavior){
			final com.apple.jobjc.Invoke.MsgSend setDefaultBehavior_CMetInst = get_setDefaultBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultBehavior_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, behavior);
		setDefaultBehavior_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend zero_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zero_CMetInst(){
		return ((zero_CMetInst != null)
	? (zero_CMetInst)
	: (zero_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zero", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber zero(){
			final com.apple.jobjc.Invoke.MsgSend zero_CMetInst = get_zero_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zero_CMetInst.init(nativeBuffer, this);
		zero_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
