package com.apple.jobjc.foundation;

public  class NSNumber extends com.apple.jobjc.foundation.NSValue {
	public NSNumber(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNumber(final NSNumber obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend boolValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boolValue_IMetInst(){
		return ((boolValue_IMetInst != null)
	? (boolValue_IMetInst)
	: (boolValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boolValue", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean boolValue(){
			final com.apple.jobjc.Invoke.MsgSend boolValue_IMetInst = get_boolValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boolValue_IMetInst.init(nativeBuffer, this);
		boolValue_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend charValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_charValue_IMetInst(){
		return ((charValue_IMetInst != null)
	? (charValue_IMetInst)
	: (charValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "charValue", com.apple.jobjc.PrimitiveCoder.SCharCoder.INST)));
	}

	 public byte charValue(){
			final com.apple.jobjc.Invoke.MsgSend charValue_IMetInst = get_charValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		charValue_IMetInst.init(nativeBuffer, this);
		charValue_IMetInst.invoke(nativeBuffer);
		final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.popByte(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.foundation.NSNumber otherNumber){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherNumber);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalValue_IMetInst(){
		return ((decimalValue_IMetInst != null)
	? (decimalValue_IMetInst)
	: (decimalValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalValue", com.apple.jobjc.foundation.NSDecimal.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDecimal decimalValue(){
			final com.apple.jobjc.Invoke.MsgSend decimalValue_IMetInst = get_decimalValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSDecimal returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSDecimal();
		decimalValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_IMetInst(){
		return ((descriptionWithLocale_IMetInst != null)
	? (descriptionWithLocale_IMetInst)
	: (descriptionWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst = get_descriptionWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleValue_IMetInst(){
		return ((doubleValue_IMetInst != null)
	? (doubleValue_IMetInst)
	: (doubleValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double doubleValue(){
			final com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst = get_doubleValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleValue_IMetInst.init(nativeBuffer, this);
		doubleValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend floatValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_floatValue_IMetInst(){
		return ((floatValue_IMetInst != null)
	? (floatValue_IMetInst)
	: (floatValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "floatValue", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float floatValue(){
			final com.apple.jobjc.Invoke.MsgSend floatValue_IMetInst = get_floatValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		floatValue_IMetInst.init(nativeBuffer, this);
		floatValue_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBool_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBool_IMetInst(){
		return ((initWithBool_IMetInst != null)
	? (initWithBool_IMetInst)
	: (initWithBool_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBool:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBool(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend initWithBool_IMetInst = get_initWithBool_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBool_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		initWithBool_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithChar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithChar_IMetInst(){
		return ((initWithChar_IMetInst != null)
	? (initWithChar_IMetInst)
	: (initWithChar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithChar:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SCharCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithChar(final byte value){
			final com.apple.jobjc.Invoke.MsgSend initWithChar_IMetInst = get_initWithChar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithChar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(nativeBuffer, value);
		initWithChar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDouble_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDouble_IMetInst(){
		return ((initWithDouble_IMetInst != null)
	? (initWithDouble_IMetInst)
	: (initWithDouble_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDouble:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDouble(final double value){
			final com.apple.jobjc.Invoke.MsgSend initWithDouble_IMetInst = get_initWithDouble_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDouble_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, value);
		initWithDouble_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFloat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFloat_IMetInst(){
		return ((initWithFloat_IMetInst != null)
	? (initWithFloat_IMetInst)
	: (initWithFloat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFloat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFloat(final float value){
			final com.apple.jobjc.Invoke.MsgSend initWithFloat_IMetInst = get_initWithFloat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFloat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, value);
		initWithFloat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithInt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithInt_IMetInst(){
		return ((initWithInt_IMetInst != null)
	? (initWithInt_IMetInst)
	: (initWithInt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithInt:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithInt(final int value){
			final com.apple.jobjc.Invoke.MsgSend initWithInt_IMetInst = get_initWithInt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithInt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, value);
		initWithInt_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithInteger_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithInteger_IMetInst(){
		return ((initWithInteger_IMetInst != null)
	? (initWithInteger_IMetInst)
	: (initWithInteger_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithInteger:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithInteger(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithInteger_IMetInst = get_initWithInteger_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithInteger_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		initWithInteger_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLong_IMetInst(){
		return ((initWithLong_IMetInst != null)
	? (initWithLong_IMetInst)
	: (initWithLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithLong_IMetInst = get_initWithLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder.push(nativeBuffer, value);
		initWithLong_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLongLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLongLong_IMetInst(){
		return ((initWithLongLong_IMetInst != null)
	? (initWithLongLong_IMetInst)
	: (initWithLongLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLongLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLongLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithLongLong_IMetInst = get_initWithLongLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLongLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, value);
		initWithLongLong_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithShort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithShort_IMetInst(){
		return ((initWithShort_IMetInst != null)
	? (initWithShort_IMetInst)
	: (initWithShort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithShort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithShort(final short value){
			final com.apple.jobjc.Invoke.MsgSend initWithShort_IMetInst = get_initWithShort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithShort_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, value);
		initWithShort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedChar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedChar_IMetInst(){
		return ((initWithUnsignedChar_IMetInst != null)
	? (initWithUnsignedChar_IMetInst)
	: (initWithUnsignedChar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedChar:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UCharCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedChar(final byte value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedChar_IMetInst = get_initWithUnsignedChar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedChar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(nativeBuffer, value);
		initWithUnsignedChar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedInt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedInt_IMetInst(){
		return ((initWithUnsignedInt_IMetInst != null)
	? (initWithUnsignedInt_IMetInst)
	: (initWithUnsignedInt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedInt:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedInt(final int value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedInt_IMetInst = get_initWithUnsignedInt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedInt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, value);
		initWithUnsignedInt_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedInteger_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedInteger_IMetInst(){
		return ((initWithUnsignedInteger_IMetInst != null)
	? (initWithUnsignedInteger_IMetInst)
	: (initWithUnsignedInteger_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedInteger:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedInteger(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedInteger_IMetInst = get_initWithUnsignedInteger_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedInteger_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		initWithUnsignedInteger_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedLong_IMetInst(){
		return ((initWithUnsignedLong_IMetInst != null)
	? (initWithUnsignedLong_IMetInst)
	: (initWithUnsignedLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedLong_IMetInst = get_initWithUnsignedLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, value);
		initWithUnsignedLong_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedLongLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedLongLong_IMetInst(){
		return ((initWithUnsignedLongLong_IMetInst != null)
	? (initWithUnsignedLongLong_IMetInst)
	: (initWithUnsignedLongLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedLongLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedLongLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedLongLong_IMetInst = get_initWithUnsignedLongLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedLongLong_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, value);
		initWithUnsignedLongLong_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUnsignedShort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUnsignedShort_IMetInst(){
		return ((initWithUnsignedShort_IMetInst != null)
	? (initWithUnsignedShort_IMetInst)
	: (initWithUnsignedShort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUnsignedShort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUnsignedShort(final short value){
			final com.apple.jobjc.Invoke.MsgSend initWithUnsignedShort_IMetInst = get_initWithUnsignedShort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUnsignedShort_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, value);
		initWithUnsignedShort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intValue_IMetInst(){
		return ((intValue_IMetInst != null)
	? (intValue_IMetInst)
	: (intValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intValue", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int intValue(){
			final com.apple.jobjc.Invoke.MsgSend intValue_IMetInst = get_intValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intValue_IMetInst.init(nativeBuffer, this);
		intValue_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend integerValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_integerValue_IMetInst(){
		return ((integerValue_IMetInst != null)
	? (integerValue_IMetInst)
	: (integerValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "integerValue", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long integerValue(){
			final com.apple.jobjc.Invoke.MsgSend integerValue_IMetInst = get_integerValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		integerValue_IMetInst.init(nativeBuffer, this);
		integerValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToNumber_IMetInst(){
		return ((isEqualToNumber_IMetInst != null)
	? (isEqualToNumber_IMetInst)
	: (isEqualToNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToNumber:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToNumber(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend isEqualToNumber_IMetInst = get_isEqualToNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		isEqualToNumber_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend longLongValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_longLongValue_IMetInst(){
		return ((longLongValue_IMetInst != null)
	? (longLongValue_IMetInst)
	: (longLongValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "longLongValue", com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public long longLongValue(){
			final com.apple.jobjc.Invoke.MsgSend longLongValue_IMetInst = get_longLongValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		longLongValue_IMetInst.init(nativeBuffer, this);
		longLongValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend longValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_longValue_IMetInst(){
		return ((longValue_IMetInst != null)
	? (longValue_IMetInst)
	: (longValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "longValue", com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder)));
	}

	 public long longValue(){
			final com.apple.jobjc.Invoke.MsgSend longValue_IMetInst = get_longValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		longValue_IMetInst.init(nativeBuffer, this);
		longValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shortValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shortValue_IMetInst(){
		return ((shortValue_IMetInst != null)
	? (shortValue_IMetInst)
	: (shortValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shortValue", com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public short shortValue(){
			final com.apple.jobjc.Invoke.MsgSend shortValue_IMetInst = get_shortValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shortValue_IMetInst.init(nativeBuffer, this);
		shortValue_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringValue_IMetInst(){
		return ((stringValue_IMetInst != null)
	? (stringValue_IMetInst)
	: (stringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringValue(){
			final com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst = get_stringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringValue_IMetInst.init(nativeBuffer, this);
		stringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedCharValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedCharValue_IMetInst(){
		return ((unsignedCharValue_IMetInst != null)
	? (unsignedCharValue_IMetInst)
	: (unsignedCharValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedCharValue", com.apple.jobjc.PrimitiveCoder.UCharCoder.INST)));
	}

	 public byte unsignedCharValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedCharValue_IMetInst = get_unsignedCharValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedCharValue_IMetInst.init(nativeBuffer, this);
		unsignedCharValue_IMetInst.invoke(nativeBuffer);
		final byte returnValue = (byte) (com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.popByte(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedIntValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedIntValue_IMetInst(){
		return ((unsignedIntValue_IMetInst != null)
	? (unsignedIntValue_IMetInst)
	: (unsignedIntValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedIntValue", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int unsignedIntValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedIntValue_IMetInst = get_unsignedIntValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedIntValue_IMetInst.init(nativeBuffer, this);
		unsignedIntValue_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedIntegerValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedIntegerValue_IMetInst(){
		return ((unsignedIntegerValue_IMetInst != null)
	? (unsignedIntegerValue_IMetInst)
	: (unsignedIntegerValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedIntegerValue", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long unsignedIntegerValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedIntegerValue_IMetInst = get_unsignedIntegerValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedIntegerValue_IMetInst.init(nativeBuffer, this);
		unsignedIntegerValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedLongLongValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedLongLongValue_IMetInst(){
		return ((unsignedLongLongValue_IMetInst != null)
	? (unsignedLongLongValue_IMetInst)
	: (unsignedLongLongValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedLongLongValue", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long unsignedLongLongValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedLongLongValue_IMetInst = get_unsignedLongLongValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedLongLongValue_IMetInst.init(nativeBuffer, this);
		unsignedLongLongValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedLongValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedLongValue_IMetInst(){
		return ((unsignedLongValue_IMetInst != null)
	? (unsignedLongValue_IMetInst)
	: (unsignedLongValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedLongValue", com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public long unsignedLongValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedLongValue_IMetInst = get_unsignedLongValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedLongValue_IMetInst.init(nativeBuffer, this);
		unsignedLongValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unsignedShortValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unsignedShortValue_IMetInst(){
		return ((unsignedShortValue_IMetInst != null)
	? (unsignedShortValue_IMetInst)
	: (unsignedShortValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unsignedShortValue", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short unsignedShortValue(){
			final com.apple.jobjc.Invoke.MsgSend unsignedShortValue_IMetInst = get_unsignedShortValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unsignedShortValue_IMetInst.init(nativeBuffer, this);
		unsignedShortValue_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

}
