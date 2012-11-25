package com.apple.jobjc.foundation;

public  class NSByteCountFormatter extends com.apple.jobjc.foundation.NSFormatter {
	public NSByteCountFormatter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSByteCountFormatter(final NSByteCountFormatter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowedUnits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedUnits_IMetInst(){
		return ((allowedUnits_IMetInst != null)
	? (allowedUnits_IMetInst)
	: (allowedUnits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedUnits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long allowedUnits(){
			final com.apple.jobjc.Invoke.MsgSend allowedUnits_IMetInst = get_allowedUnits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedUnits_IMetInst.init(nativeBuffer, this);
		allowedUnits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsNonnumericFormatting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsNonnumericFormatting_IMetInst(){
		return ((allowsNonnumericFormatting_IMetInst != null)
	? (allowsNonnumericFormatting_IMetInst)
	: (allowsNonnumericFormatting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsNonnumericFormatting", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsNonnumericFormatting(){
			final com.apple.jobjc.Invoke.MsgSend allowsNonnumericFormatting_IMetInst = get_allowsNonnumericFormatting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsNonnumericFormatting_IMetInst.init(nativeBuffer, this);
		allowsNonnumericFormatting_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countStyle_IMetInst(){
		return ((countStyle_IMetInst != null)
	? (countStyle_IMetInst)
	: (countStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long countStyle(){
			final com.apple.jobjc.Invoke.MsgSend countStyle_IMetInst = get_countStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countStyle_IMetInst.init(nativeBuffer, this);
		countStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend includesActualByteCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_includesActualByteCount_IMetInst(){
		return ((includesActualByteCount_IMetInst != null)
	? (includesActualByteCount_IMetInst)
	: (includesActualByteCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "includesActualByteCount", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean includesActualByteCount(){
			final com.apple.jobjc.Invoke.MsgSend includesActualByteCount_IMetInst = get_includesActualByteCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		includesActualByteCount_IMetInst.init(nativeBuffer, this);
		includesActualByteCount_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend includesCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_includesCount_IMetInst(){
		return ((includesCount_IMetInst != null)
	? (includesCount_IMetInst)
	: (includesCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "includesCount", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean includesCount(){
			final com.apple.jobjc.Invoke.MsgSend includesCount_IMetInst = get_includesCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		includesCount_IMetInst.init(nativeBuffer, this);
		includesCount_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend includesUnit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_includesUnit_IMetInst(){
		return ((includesUnit_IMetInst != null)
	? (includesUnit_IMetInst)
	: (includesUnit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "includesUnit", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean includesUnit(){
			final com.apple.jobjc.Invoke.MsgSend includesUnit_IMetInst = get_includesUnit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		includesUnit_IMetInst.init(nativeBuffer, this);
		includesUnit_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAdaptive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAdaptive_IMetInst(){
		return ((isAdaptive_IMetInst != null)
	? (isAdaptive_IMetInst)
	: (isAdaptive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAdaptive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAdaptive(){
			final com.apple.jobjc.Invoke.MsgSend isAdaptive_IMetInst = get_isAdaptive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAdaptive_IMetInst.init(nativeBuffer, this);
		isAdaptive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAdaptive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAdaptive_IMetInst(){
		return ((setAdaptive_IMetInst != null)
	? (setAdaptive_IMetInst)
	: (setAdaptive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAdaptive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAdaptive(final boolean adaptive){
			final com.apple.jobjc.Invoke.MsgSend setAdaptive_IMetInst = get_setAdaptive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAdaptive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, adaptive);
		setAdaptive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowedUnits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedUnits_IMetInst(){
		return ((setAllowedUnits_IMetInst != null)
	? (setAllowedUnits_IMetInst)
	: (setAllowedUnits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedUnits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAllowedUnits(final long allowedUnits){
			final com.apple.jobjc.Invoke.MsgSend setAllowedUnits_IMetInst = get_setAllowedUnits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedUnits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, allowedUnits);
		setAllowedUnits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsNonnumericFormatting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsNonnumericFormatting_IMetInst(){
		return ((setAllowsNonnumericFormatting_IMetInst != null)
	? (setAllowsNonnumericFormatting_IMetInst)
	: (setAllowsNonnumericFormatting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsNonnumericFormatting:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsNonnumericFormatting(final boolean allowsNonnumericFormatting){
			final com.apple.jobjc.Invoke.MsgSend setAllowsNonnumericFormatting_IMetInst = get_setAllowsNonnumericFormatting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsNonnumericFormatting_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowsNonnumericFormatting);
		setAllowsNonnumericFormatting_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCountStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCountStyle_IMetInst(){
		return ((setCountStyle_IMetInst != null)
	? (setCountStyle_IMetInst)
	: (setCountStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCountStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setCountStyle(final long countStyle){
			final com.apple.jobjc.Invoke.MsgSend setCountStyle_IMetInst = get_setCountStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCountStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, countStyle);
		setCountStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncludesActualByteCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncludesActualByteCount_IMetInst(){
		return ((setIncludesActualByteCount_IMetInst != null)
	? (setIncludesActualByteCount_IMetInst)
	: (setIncludesActualByteCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncludesActualByteCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncludesActualByteCount(final boolean includesActualByteCount){
			final com.apple.jobjc.Invoke.MsgSend setIncludesActualByteCount_IMetInst = get_setIncludesActualByteCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncludesActualByteCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, includesActualByteCount);
		setIncludesActualByteCount_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncludesCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncludesCount_IMetInst(){
		return ((setIncludesCount_IMetInst != null)
	? (setIncludesCount_IMetInst)
	: (setIncludesCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncludesCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncludesCount(final boolean includesCount){
			final com.apple.jobjc.Invoke.MsgSend setIncludesCount_IMetInst = get_setIncludesCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncludesCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, includesCount);
		setIncludesCount_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncludesUnit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncludesUnit_IMetInst(){
		return ((setIncludesUnit_IMetInst != null)
	? (setIncludesUnit_IMetInst)
	: (setIncludesUnit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncludesUnit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncludesUnit(final boolean includesUnit){
			final com.apple.jobjc.Invoke.MsgSend setIncludesUnit_IMetInst = get_setIncludesUnit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncludesUnit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, includesUnit);
		setIncludesUnit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setZeroPadsFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setZeroPadsFractionDigits_IMetInst(){
		return ((setZeroPadsFractionDigits_IMetInst != null)
	? (setZeroPadsFractionDigits_IMetInst)
	: (setZeroPadsFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setZeroPadsFractionDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setZeroPadsFractionDigits(final boolean zeroPadsFractionDigits){
			final com.apple.jobjc.Invoke.MsgSend setZeroPadsFractionDigits_IMetInst = get_setZeroPadsFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setZeroPadsFractionDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, zeroPadsFractionDigits);
		setZeroPadsFractionDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringFromByteCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringFromByteCount_IMetInst(){
		return ((stringFromByteCount_IMetInst != null)
	? (stringFromByteCount_IMetInst)
	: (stringFromByteCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringFromByteCount:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringFromByteCount(final long byteCount){
			final com.apple.jobjc.Invoke.MsgSend stringFromByteCount_IMetInst = get_stringFromByteCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringFromByteCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, byteCount);
		stringFromByteCount_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend zeroPadsFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zeroPadsFractionDigits_IMetInst(){
		return ((zeroPadsFractionDigits_IMetInst != null)
	? (zeroPadsFractionDigits_IMetInst)
	: (zeroPadsFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zeroPadsFractionDigits", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean zeroPadsFractionDigits(){
			final com.apple.jobjc.Invoke.MsgSend zeroPadsFractionDigits_IMetInst = get_zeroPadsFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zeroPadsFractionDigits_IMetInst.init(nativeBuffer, this);
		zeroPadsFractionDigits_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
