package com.apple.jobjc.foundation;

public  class NSNumberClass extends com.apple.jobjc.foundation.NSValueClass {
	public NSNumberClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNumberClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNumberClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend numberWithBool_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithBool_CMetInst(){
		return ((numberWithBool_CMetInst != null)
	? (numberWithBool_CMetInst)
	: (numberWithBool_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithBool:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithBool(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend numberWithBool_CMetInst = get_numberWithBool_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithBool_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		numberWithBool_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithChar_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithChar_CMetInst(){
		return ((numberWithChar_CMetInst != null)
	? (numberWithChar_CMetInst)
	: (numberWithChar_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithChar:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SCharCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithChar(final byte value){
			final com.apple.jobjc.Invoke.MsgSend numberWithChar_CMetInst = get_numberWithChar_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithChar_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SCharCoder.INST.push(nativeBuffer, value);
		numberWithChar_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithDouble_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithDouble_CMetInst(){
		return ((numberWithDouble_CMetInst != null)
	? (numberWithDouble_CMetInst)
	: (numberWithDouble_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithDouble:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithDouble(final double value){
			final com.apple.jobjc.Invoke.MsgSend numberWithDouble_CMetInst = get_numberWithDouble_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithDouble_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, value);
		numberWithDouble_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithFloat_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithFloat_CMetInst(){
		return ((numberWithFloat_CMetInst != null)
	? (numberWithFloat_CMetInst)
	: (numberWithFloat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithFloat:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithFloat(final float value){
			final com.apple.jobjc.Invoke.MsgSend numberWithFloat_CMetInst = get_numberWithFloat_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithFloat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, value);
		numberWithFloat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithInt_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithInt_CMetInst(){
		return ((numberWithInt_CMetInst != null)
	? (numberWithInt_CMetInst)
	: (numberWithInt_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithInt:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithInt(final int value){
			final com.apple.jobjc.Invoke.MsgSend numberWithInt_CMetInst = get_numberWithInt_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithInt_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, value);
		numberWithInt_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithInteger_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithInteger_CMetInst(){
		return ((numberWithInteger_CMetInst != null)
	? (numberWithInteger_CMetInst)
	: (numberWithInteger_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithInteger:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithInteger(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithInteger_CMetInst = get_numberWithInteger_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithInteger_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		numberWithInteger_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithLong_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithLong_CMetInst(){
		return ((numberWithLong_CMetInst != null)
	? (numberWithLong_CMetInst)
	: (numberWithLong_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithLong_CMetInst = get_numberWithLong_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithLong_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SLongSLongLongCoder.push(nativeBuffer, value);
		numberWithLong_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithLongLong_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithLongLong_CMetInst(){
		return ((numberWithLongLong_CMetInst != null)
	? (numberWithLongLong_CMetInst)
	: (numberWithLongLong_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithLongLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithLongLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithLongLong_CMetInst = get_numberWithLongLong_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithLongLong_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, value);
		numberWithLongLong_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithShort_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithShort_CMetInst(){
		return ((numberWithShort_CMetInst != null)
	? (numberWithShort_CMetInst)
	: (numberWithShort_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithShort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithShort(final short value){
			final com.apple.jobjc.Invoke.MsgSend numberWithShort_CMetInst = get_numberWithShort_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithShort_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, value);
		numberWithShort_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedChar_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedChar_CMetInst(){
		return ((numberWithUnsignedChar_CMetInst != null)
	? (numberWithUnsignedChar_CMetInst)
	: (numberWithUnsignedChar_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedChar:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UCharCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedChar(final byte value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedChar_CMetInst = get_numberWithUnsignedChar_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedChar_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UCharCoder.INST.push(nativeBuffer, value);
		numberWithUnsignedChar_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedInt_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedInt_CMetInst(){
		return ((numberWithUnsignedInt_CMetInst != null)
	? (numberWithUnsignedInt_CMetInst)
	: (numberWithUnsignedInt_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedInt:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedInt(final int value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedInt_CMetInst = get_numberWithUnsignedInt_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedInt_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, value);
		numberWithUnsignedInt_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedInteger_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedInteger_CMetInst(){
		return ((numberWithUnsignedInteger_CMetInst != null)
	? (numberWithUnsignedInteger_CMetInst)
	: (numberWithUnsignedInteger_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedInteger:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedInteger(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedInteger_CMetInst = get_numberWithUnsignedInteger_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedInteger_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		numberWithUnsignedInteger_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedLong_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedLong_CMetInst(){
		return ((numberWithUnsignedLong_CMetInst != null)
	? (numberWithUnsignedLong_CMetInst)
	: (numberWithUnsignedLong_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedLong_CMetInst = get_numberWithUnsignedLong_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedLong_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongULongLongCoder.push(nativeBuffer, value);
		numberWithUnsignedLong_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedLongLong_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedLongLong_CMetInst(){
		return ((numberWithUnsignedLongLong_CMetInst != null)
	? (numberWithUnsignedLongLong_CMetInst)
	: (numberWithUnsignedLongLong_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedLongLong:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedLongLong(final long value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedLongLong_CMetInst = get_numberWithUnsignedLongLong_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedLongLong_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, value);
		numberWithUnsignedLongLong_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberWithUnsignedShort_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberWithUnsignedShort_CMetInst(){
		return ((numberWithUnsignedShort_CMetInst != null)
	? (numberWithUnsignedShort_CMetInst)
	: (numberWithUnsignedShort_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberWithUnsignedShort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberWithUnsignedShort(final short value){
			final com.apple.jobjc.Invoke.MsgSend numberWithUnsignedShort_CMetInst = get_numberWithUnsignedShort_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberWithUnsignedShort_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, value);
		numberWithUnsignedShort_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
