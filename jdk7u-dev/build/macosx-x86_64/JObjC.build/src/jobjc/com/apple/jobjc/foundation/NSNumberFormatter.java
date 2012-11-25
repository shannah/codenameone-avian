package com.apple.jobjc.foundation;

public  class NSNumberFormatter extends com.apple.jobjc.foundation.NSFormatter {
	public NSNumberFormatter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNumberFormatter(final NSNumberFormatter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsFloats_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsFloats_IMetInst(){
		return ((allowsFloats_IMetInst != null)
	? (allowsFloats_IMetInst)
	: (allowsFloats_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsFloats", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsFloats(){
			final com.apple.jobjc.Invoke.MsgSend allowsFloats_IMetInst = get_allowsFloats_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsFloats_IMetInst.init(nativeBuffer, this);
		allowsFloats_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alwaysShowsDecimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alwaysShowsDecimalSeparator_IMetInst(){
		return ((alwaysShowsDecimalSeparator_IMetInst != null)
	? (alwaysShowsDecimalSeparator_IMetInst)
	: (alwaysShowsDecimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alwaysShowsDecimalSeparator", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean alwaysShowsDecimalSeparator(){
			final com.apple.jobjc.Invoke.MsgSend alwaysShowsDecimalSeparator_IMetInst = get_alwaysShowsDecimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alwaysShowsDecimalSeparator_IMetInst.init(nativeBuffer, this);
		alwaysShowsDecimalSeparator_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedStringForNil_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringForNil_IMetInst(){
		return ((attributedStringForNil_IMetInst != null)
	? (attributedStringForNil_IMetInst)
	: (attributedStringForNil_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringForNil", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringForNil(){
			final com.apple.jobjc.Invoke.MsgSend attributedStringForNil_IMetInst = get_attributedStringForNil_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringForNil_IMetInst.init(nativeBuffer, this);
		attributedStringForNil_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedStringForNotANumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringForNotANumber_IMetInst(){
		return ((attributedStringForNotANumber_IMetInst != null)
	? (attributedStringForNotANumber_IMetInst)
	: (attributedStringForNotANumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringForNotANumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringForNotANumber(){
			final com.apple.jobjc.Invoke.MsgSend attributedStringForNotANumber_IMetInst = get_attributedStringForNotANumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringForNotANumber_IMetInst.init(nativeBuffer, this);
		attributedStringForNotANumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedStringForZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringForZero_IMetInst(){
		return ((attributedStringForZero_IMetInst != null)
	? (attributedStringForZero_IMetInst)
	: (attributedStringForZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringForZero", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringForZero(){
			final com.apple.jobjc.Invoke.MsgSend attributedStringForZero_IMetInst = get_attributedStringForZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringForZero_IMetInst.init(nativeBuffer, this);
		attributedStringForZero_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currencyCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currencyCode_IMetInst(){
		return ((currencyCode_IMetInst != null)
	? (currencyCode_IMetInst)
	: (currencyCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currencyCode", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currencyCode(){
			final com.apple.jobjc.Invoke.MsgSend currencyCode_IMetInst = get_currencyCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currencyCode_IMetInst.init(nativeBuffer, this);
		currencyCode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currencyDecimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currencyDecimalSeparator_IMetInst(){
		return ((currencyDecimalSeparator_IMetInst != null)
	? (currencyDecimalSeparator_IMetInst)
	: (currencyDecimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currencyDecimalSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currencyDecimalSeparator(){
			final com.apple.jobjc.Invoke.MsgSend currencyDecimalSeparator_IMetInst = get_currencyDecimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currencyDecimalSeparator_IMetInst.init(nativeBuffer, this);
		currencyDecimalSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currencyGroupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currencyGroupingSeparator_IMetInst(){
		return ((currencyGroupingSeparator_IMetInst != null)
	? (currencyGroupingSeparator_IMetInst)
	: (currencyGroupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currencyGroupingSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currencyGroupingSeparator(){
			final com.apple.jobjc.Invoke.MsgSend currencyGroupingSeparator_IMetInst = get_currencyGroupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currencyGroupingSeparator_IMetInst.init(nativeBuffer, this);
		currencyGroupingSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currencySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currencySymbol_IMetInst(){
		return ((currencySymbol_IMetInst != null)
	? (currencySymbol_IMetInst)
	: (currencySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currencySymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currencySymbol(){
			final com.apple.jobjc.Invoke.MsgSend currencySymbol_IMetInst = get_currencySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currencySymbol_IMetInst.init(nativeBuffer, this);
		currencySymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalSeparator_IMetInst(){
		return ((decimalSeparator_IMetInst != null)
	? (decimalSeparator_IMetInst)
	: (decimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString decimalSeparator(){
			final com.apple.jobjc.Invoke.MsgSend decimalSeparator_IMetInst = get_decimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalSeparator_IMetInst.init(nativeBuffer, this);
		decimalSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend exponentSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exponentSymbol_IMetInst(){
		return ((exponentSymbol_IMetInst != null)
	? (exponentSymbol_IMetInst)
	: (exponentSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exponentSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString exponentSymbol(){
			final com.apple.jobjc.Invoke.MsgSend exponentSymbol_IMetInst = get_exponentSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exponentSymbol_IMetInst.init(nativeBuffer, this);
		exponentSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend format_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_format_IMetInst(){
		return ((format_IMetInst != null)
	? (format_IMetInst)
	: (format_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "format", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString format(){
			final com.apple.jobjc.Invoke.MsgSend format_IMetInst = get_format_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		format_IMetInst.init(nativeBuffer, this);
		format_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formatWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formatWidth_IMetInst(){
		return ((formatWidth_IMetInst != null)
	? (formatWidth_IMetInst)
	: (formatWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formatWidth", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long formatWidth(){
			final com.apple.jobjc.Invoke.MsgSend formatWidth_IMetInst = get_formatWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formatWidth_IMetInst.init(nativeBuffer, this);
		formatWidth_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formatterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formatterBehavior_IMetInst(){
		return ((formatterBehavior_IMetInst != null)
	? (formatterBehavior_IMetInst)
	: (formatterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formatterBehavior", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long formatterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend formatterBehavior_IMetInst = get_formatterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formatterBehavior_IMetInst.init(nativeBuffer, this);
		formatterBehavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend generatesDecimalNumbers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_generatesDecimalNumbers_IMetInst(){
		return ((generatesDecimalNumbers_IMetInst != null)
	? (generatesDecimalNumbers_IMetInst)
	: (generatesDecimalNumbers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "generatesDecimalNumbers", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean generatesDecimalNumbers(){
			final com.apple.jobjc.Invoke.MsgSend generatesDecimalNumbers_IMetInst = get_generatesDecimalNumbers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		generatesDecimalNumbers_IMetInst.init(nativeBuffer, this);
		generatesDecimalNumbers_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_range_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjectValue_forString_range_error_IMetInst(){
		return ((getObjectValue_forString_range_error_IMetInst != null)
	? (getObjectValue_forString_range_error_IMetInst)
	: (getObjectValue_forString_range_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjectValue:forString:range:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getObjectValue_forString_range_error(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> obj, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRange> rangep, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend getObjectValue_forString_range_error_IMetInst = get_getObjectValue_forString_range_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjectValue_forString_range_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rangep);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		getObjectValue_forString_range_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend groupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupingSeparator_IMetInst(){
		return ((groupingSeparator_IMetInst != null)
	? (groupingSeparator_IMetInst)
	: (groupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupingSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString groupingSeparator(){
			final com.apple.jobjc.Invoke.MsgSend groupingSeparator_IMetInst = get_groupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupingSeparator_IMetInst.init(nativeBuffer, this);
		groupingSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend groupingSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupingSize_IMetInst(){
		return ((groupingSize_IMetInst != null)
	? (groupingSize_IMetInst)
	: (groupingSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupingSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long groupingSize(){
			final com.apple.jobjc.Invoke.MsgSend groupingSize_IMetInst = get_groupingSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupingSize_IMetInst.init(nativeBuffer, this);
		groupingSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasThousandSeparators_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasThousandSeparators_IMetInst(){
		return ((hasThousandSeparators_IMetInst != null)
	? (hasThousandSeparators_IMetInst)
	: (hasThousandSeparators_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasThousandSeparators", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasThousandSeparators(){
			final com.apple.jobjc.Invoke.MsgSend hasThousandSeparators_IMetInst = get_hasThousandSeparators_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasThousandSeparators_IMetInst.init(nativeBuffer, this);
		hasThousandSeparators_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend internationalCurrencySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_internationalCurrencySymbol_IMetInst(){
		return ((internationalCurrencySymbol_IMetInst != null)
	? (internationalCurrencySymbol_IMetInst)
	: (internationalCurrencySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "internationalCurrencySymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString internationalCurrencySymbol(){
			final com.apple.jobjc.Invoke.MsgSend internationalCurrencySymbol_IMetInst = get_internationalCurrencySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		internationalCurrencySymbol_IMetInst.init(nativeBuffer, this);
		internationalCurrencySymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLenient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLenient_IMetInst(){
		return ((isLenient_IMetInst != null)
	? (isLenient_IMetInst)
	: (isLenient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLenient", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLenient(){
			final com.apple.jobjc.Invoke.MsgSend isLenient_IMetInst = get_isLenient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLenient_IMetInst.init(nativeBuffer, this);
		isLenient_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPartialStringValidationEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPartialStringValidationEnabled_IMetInst(){
		return ((isPartialStringValidationEnabled_IMetInst != null)
	? (isPartialStringValidationEnabled_IMetInst)
	: (isPartialStringValidationEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPartialStringValidationEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isPartialStringValidationEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isPartialStringValidationEnabled_IMetInst = get_isPartialStringValidationEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPartialStringValidationEnabled_IMetInst.init(nativeBuffer, this);
		isPartialStringValidationEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locale_IMetInst(){
		return ((locale_IMetInst != null)
	? (locale_IMetInst)
	: (locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSLocale locale(){
			final com.apple.jobjc.Invoke.MsgSend locale_IMetInst = get_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locale_IMetInst.init(nativeBuffer, this);
		locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSLocale returnValue = (com.apple.jobjc.foundation.NSLocale) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizesFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizesFormat_IMetInst(){
		return ((localizesFormat_IMetInst != null)
	? (localizesFormat_IMetInst)
	: (localizesFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizesFormat", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean localizesFormat(){
			final com.apple.jobjc.Invoke.MsgSend localizesFormat_IMetInst = get_localizesFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizesFormat_IMetInst.init(nativeBuffer, this);
		localizesFormat_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximum_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximum_IMetInst(){
		return ((maximum_IMetInst != null)
	? (maximum_IMetInst)
	: (maximum_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximum", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber maximum(){
			final com.apple.jobjc.Invoke.MsgSend maximum_IMetInst = get_maximum_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximum_IMetInst.init(nativeBuffer, this);
		maximum_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumFractionDigits_IMetInst(){
		return ((maximumFractionDigits_IMetInst != null)
	? (maximumFractionDigits_IMetInst)
	: (maximumFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumFractionDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maximumFractionDigits(){
			final com.apple.jobjc.Invoke.MsgSend maximumFractionDigits_IMetInst = get_maximumFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumFractionDigits_IMetInst.init(nativeBuffer, this);
		maximumFractionDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumIntegerDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumIntegerDigits_IMetInst(){
		return ((maximumIntegerDigits_IMetInst != null)
	? (maximumIntegerDigits_IMetInst)
	: (maximumIntegerDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumIntegerDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maximumIntegerDigits(){
			final com.apple.jobjc.Invoke.MsgSend maximumIntegerDigits_IMetInst = get_maximumIntegerDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumIntegerDigits_IMetInst.init(nativeBuffer, this);
		maximumIntegerDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumSignificantDigits_IMetInst(){
		return ((maximumSignificantDigits_IMetInst != null)
	? (maximumSignificantDigits_IMetInst)
	: (maximumSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumSignificantDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maximumSignificantDigits(){
			final com.apple.jobjc.Invoke.MsgSend maximumSignificantDigits_IMetInst = get_maximumSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumSignificantDigits_IMetInst.init(nativeBuffer, this);
		maximumSignificantDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimum_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimum_IMetInst(){
		return ((minimum_IMetInst != null)
	? (minimum_IMetInst)
	: (minimum_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimum", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber minimum(){
			final com.apple.jobjc.Invoke.MsgSend minimum_IMetInst = get_minimum_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimum_IMetInst.init(nativeBuffer, this);
		minimum_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumFractionDigits_IMetInst(){
		return ((minimumFractionDigits_IMetInst != null)
	? (minimumFractionDigits_IMetInst)
	: (minimumFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumFractionDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long minimumFractionDigits(){
			final com.apple.jobjc.Invoke.MsgSend minimumFractionDigits_IMetInst = get_minimumFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumFractionDigits_IMetInst.init(nativeBuffer, this);
		minimumFractionDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumIntegerDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumIntegerDigits_IMetInst(){
		return ((minimumIntegerDigits_IMetInst != null)
	? (minimumIntegerDigits_IMetInst)
	: (minimumIntegerDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumIntegerDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long minimumIntegerDigits(){
			final com.apple.jobjc.Invoke.MsgSend minimumIntegerDigits_IMetInst = get_minimumIntegerDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumIntegerDigits_IMetInst.init(nativeBuffer, this);
		minimumIntegerDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumSignificantDigits_IMetInst(){
		return ((minimumSignificantDigits_IMetInst != null)
	? (minimumSignificantDigits_IMetInst)
	: (minimumSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumSignificantDigits", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long minimumSignificantDigits(){
			final com.apple.jobjc.Invoke.MsgSend minimumSignificantDigits_IMetInst = get_minimumSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumSignificantDigits_IMetInst.init(nativeBuffer, this);
		minimumSignificantDigits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minusSign_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minusSign_IMetInst(){
		return ((minusSign_IMetInst != null)
	? (minusSign_IMetInst)
	: (minusSign_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minusSign", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString minusSign(){
			final com.apple.jobjc.Invoke.MsgSend minusSign_IMetInst = get_minusSign_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minusSign_IMetInst.init(nativeBuffer, this);
		minusSign_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend multiplier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_multiplier_IMetInst(){
		return ((multiplier_IMetInst != null)
	? (multiplier_IMetInst)
	: (multiplier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "multiplier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber multiplier(){
			final com.apple.jobjc.Invoke.MsgSend multiplier_IMetInst = get_multiplier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		multiplier_IMetInst.init(nativeBuffer, this);
		multiplier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend negativeFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_negativeFormat_IMetInst(){
		return ((negativeFormat_IMetInst != null)
	? (negativeFormat_IMetInst)
	: (negativeFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "negativeFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString negativeFormat(){
			final com.apple.jobjc.Invoke.MsgSend negativeFormat_IMetInst = get_negativeFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		negativeFormat_IMetInst.init(nativeBuffer, this);
		negativeFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend negativeInfinitySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_negativeInfinitySymbol_IMetInst(){
		return ((negativeInfinitySymbol_IMetInst != null)
	? (negativeInfinitySymbol_IMetInst)
	: (negativeInfinitySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "negativeInfinitySymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString negativeInfinitySymbol(){
			final com.apple.jobjc.Invoke.MsgSend negativeInfinitySymbol_IMetInst = get_negativeInfinitySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		negativeInfinitySymbol_IMetInst.init(nativeBuffer, this);
		negativeInfinitySymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend negativePrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_negativePrefix_IMetInst(){
		return ((negativePrefix_IMetInst != null)
	? (negativePrefix_IMetInst)
	: (negativePrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "negativePrefix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString negativePrefix(){
			final com.apple.jobjc.Invoke.MsgSend negativePrefix_IMetInst = get_negativePrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		negativePrefix_IMetInst.init(nativeBuffer, this);
		negativePrefix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend negativeSuffix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_negativeSuffix_IMetInst(){
		return ((negativeSuffix_IMetInst != null)
	? (negativeSuffix_IMetInst)
	: (negativeSuffix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "negativeSuffix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString negativeSuffix(){
			final com.apple.jobjc.Invoke.MsgSend negativeSuffix_IMetInst = get_negativeSuffix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		negativeSuffix_IMetInst.init(nativeBuffer, this);
		negativeSuffix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nilSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nilSymbol_IMetInst(){
		return ((nilSymbol_IMetInst != null)
	? (nilSymbol_IMetInst)
	: (nilSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nilSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString nilSymbol(){
			final com.apple.jobjc.Invoke.MsgSend nilSymbol_IMetInst = get_nilSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nilSymbol_IMetInst.init(nativeBuffer, this);
		nilSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notANumberSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notANumberSymbol_IMetInst(){
		return ((notANumberSymbol_IMetInst != null)
	? (notANumberSymbol_IMetInst)
	: (notANumberSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notANumberSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString notANumberSymbol(){
			final com.apple.jobjc.Invoke.MsgSend notANumberSymbol_IMetInst = get_notANumberSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notANumberSymbol_IMetInst.init(nativeBuffer, this);
		notANumberSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberFromString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberFromString_IMetInst(){
		return ((numberFromString_IMetInst != null)
	? (numberFromString_IMetInst)
	: (numberFromString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberFromString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber numberFromString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend numberFromString_IMetInst = get_numberFromString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberFromString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		numberFromString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberStyle_IMetInst(){
		return ((numberStyle_IMetInst != null)
	? (numberStyle_IMetInst)
	: (numberStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberStyle(){
			final com.apple.jobjc.Invoke.MsgSend numberStyle_IMetInst = get_numberStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberStyle_IMetInst.init(nativeBuffer, this);
		numberStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paddingCharacter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paddingCharacter_IMetInst(){
		return ((paddingCharacter_IMetInst != null)
	? (paddingCharacter_IMetInst)
	: (paddingCharacter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paddingCharacter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString paddingCharacter(){
			final com.apple.jobjc.Invoke.MsgSend paddingCharacter_IMetInst = get_paddingCharacter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paddingCharacter_IMetInst.init(nativeBuffer, this);
		paddingCharacter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paddingPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paddingPosition_IMetInst(){
		return ((paddingPosition_IMetInst != null)
	? (paddingPosition_IMetInst)
	: (paddingPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paddingPosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long paddingPosition(){
			final com.apple.jobjc.Invoke.MsgSend paddingPosition_IMetInst = get_paddingPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paddingPosition_IMetInst.init(nativeBuffer, this);
		paddingPosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend perMillSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_perMillSymbol_IMetInst(){
		return ((perMillSymbol_IMetInst != null)
	? (perMillSymbol_IMetInst)
	: (perMillSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "perMillSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString perMillSymbol(){
			final com.apple.jobjc.Invoke.MsgSend perMillSymbol_IMetInst = get_perMillSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		perMillSymbol_IMetInst.init(nativeBuffer, this);
		perMillSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend percentSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_percentSymbol_IMetInst(){
		return ((percentSymbol_IMetInst != null)
	? (percentSymbol_IMetInst)
	: (percentSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "percentSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString percentSymbol(){
			final com.apple.jobjc.Invoke.MsgSend percentSymbol_IMetInst = get_percentSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		percentSymbol_IMetInst.init(nativeBuffer, this);
		percentSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend plusSign_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_plusSign_IMetInst(){
		return ((plusSign_IMetInst != null)
	? (plusSign_IMetInst)
	: (plusSign_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "plusSign", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString plusSign(){
			final com.apple.jobjc.Invoke.MsgSend plusSign_IMetInst = get_plusSign_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		plusSign_IMetInst.init(nativeBuffer, this);
		plusSign_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positiveFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positiveFormat_IMetInst(){
		return ((positiveFormat_IMetInst != null)
	? (positiveFormat_IMetInst)
	: (positiveFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positiveFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString positiveFormat(){
			final com.apple.jobjc.Invoke.MsgSend positiveFormat_IMetInst = get_positiveFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positiveFormat_IMetInst.init(nativeBuffer, this);
		positiveFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positiveInfinitySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positiveInfinitySymbol_IMetInst(){
		return ((positiveInfinitySymbol_IMetInst != null)
	? (positiveInfinitySymbol_IMetInst)
	: (positiveInfinitySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positiveInfinitySymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString positiveInfinitySymbol(){
			final com.apple.jobjc.Invoke.MsgSend positiveInfinitySymbol_IMetInst = get_positiveInfinitySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positiveInfinitySymbol_IMetInst.init(nativeBuffer, this);
		positiveInfinitySymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positivePrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positivePrefix_IMetInst(){
		return ((positivePrefix_IMetInst != null)
	? (positivePrefix_IMetInst)
	: (positivePrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positivePrefix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString positivePrefix(){
			final com.apple.jobjc.Invoke.MsgSend positivePrefix_IMetInst = get_positivePrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positivePrefix_IMetInst.init(nativeBuffer, this);
		positivePrefix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positiveSuffix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positiveSuffix_IMetInst(){
		return ((positiveSuffix_IMetInst != null)
	? (positiveSuffix_IMetInst)
	: (positiveSuffix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positiveSuffix", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString positiveSuffix(){
			final com.apple.jobjc.Invoke.MsgSend positiveSuffix_IMetInst = get_positiveSuffix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positiveSuffix_IMetInst.init(nativeBuffer, this);
		positiveSuffix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend roundingBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_roundingBehavior_IMetInst(){
		return ((roundingBehavior_IMetInst != null)
	? (roundingBehavior_IMetInst)
	: (roundingBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "roundingBehavior", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumberHandler roundingBehavior(){
			final com.apple.jobjc.Invoke.MsgSend roundingBehavior_IMetInst = get_roundingBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		roundingBehavior_IMetInst.init(nativeBuffer, this);
		roundingBehavior_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumberHandler returnValue = (com.apple.jobjc.foundation.NSDecimalNumberHandler) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend roundingIncrement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_roundingIncrement_IMetInst(){
		return ((roundingIncrement_IMetInst != null)
	? (roundingIncrement_IMetInst)
	: (roundingIncrement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "roundingIncrement", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber roundingIncrement(){
			final com.apple.jobjc.Invoke.MsgSend roundingIncrement_IMetInst = get_roundingIncrement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		roundingIncrement_IMetInst.init(nativeBuffer, this);
		roundingIncrement_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend roundingModeLong_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_roundingModeLong_IMetInst(){
		return ((roundingModeLong_IMetInst != null)
	? (roundingModeLong_IMetInst)
	: (roundingModeLong_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "roundingMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long roundingModeLong(){
			final com.apple.jobjc.Invoke.MsgSend roundingModeLong_IMetInst = get_roundingModeLong_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		roundingModeLong_IMetInst.init(nativeBuffer, this);
		roundingModeLong_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondaryGroupingSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondaryGroupingSize_IMetInst(){
		return ((secondaryGroupingSize_IMetInst != null)
	? (secondaryGroupingSize_IMetInst)
	: (secondaryGroupingSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondaryGroupingSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long secondaryGroupingSize(){
			final com.apple.jobjc.Invoke.MsgSend secondaryGroupingSize_IMetInst = get_secondaryGroupingSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondaryGroupingSize_IMetInst.init(nativeBuffer, this);
		secondaryGroupingSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsFloats_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsFloats_IMetInst(){
		return ((setAllowsFloats_IMetInst != null)
	? (setAllowsFloats_IMetInst)
	: (setAllowsFloats_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsFloats:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsFloats(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsFloats_IMetInst = get_setAllowsFloats_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsFloats_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsFloats_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlwaysShowsDecimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlwaysShowsDecimalSeparator_IMetInst(){
		return ((setAlwaysShowsDecimalSeparator_IMetInst != null)
	? (setAlwaysShowsDecimalSeparator_IMetInst)
	: (setAlwaysShowsDecimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlwaysShowsDecimalSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAlwaysShowsDecimalSeparator(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setAlwaysShowsDecimalSeparator_IMetInst = get_setAlwaysShowsDecimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlwaysShowsDecimalSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setAlwaysShowsDecimalSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedStringForNil_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedStringForNil_IMetInst(){
		return ((setAttributedStringForNil_IMetInst != null)
	? (setAttributedStringForNil_IMetInst)
	: (setAttributedStringForNil_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedStringForNil:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedStringForNil(final com.apple.jobjc.foundation.NSAttributedString newAttributedString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedStringForNil_IMetInst = get_setAttributedStringForNil_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedStringForNil_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributedString);
		setAttributedStringForNil_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedStringForNotANumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedStringForNotANumber_IMetInst(){
		return ((setAttributedStringForNotANumber_IMetInst != null)
	? (setAttributedStringForNotANumber_IMetInst)
	: (setAttributedStringForNotANumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedStringForNotANumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedStringForNotANumber(final com.apple.jobjc.foundation.NSAttributedString newAttributedString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedStringForNotANumber_IMetInst = get_setAttributedStringForNotANumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedStringForNotANumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributedString);
		setAttributedStringForNotANumber_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedStringForZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedStringForZero_IMetInst(){
		return ((setAttributedStringForZero_IMetInst != null)
	? (setAttributedStringForZero_IMetInst)
	: (setAttributedStringForZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedStringForZero:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedStringForZero(final com.apple.jobjc.foundation.NSAttributedString newAttributedString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedStringForZero_IMetInst = get_setAttributedStringForZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedStringForZero_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributedString);
		setAttributedStringForZero_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrencyCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrencyCode_IMetInst(){
		return ((setCurrencyCode_IMetInst != null)
	? (setCurrencyCode_IMetInst)
	: (setCurrencyCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrencyCode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrencyCode(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setCurrencyCode_IMetInst = get_setCurrencyCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrencyCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setCurrencyCode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrencyDecimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrencyDecimalSeparator_IMetInst(){
		return ((setCurrencyDecimalSeparator_IMetInst != null)
	? (setCurrencyDecimalSeparator_IMetInst)
	: (setCurrencyDecimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrencyDecimalSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrencyDecimalSeparator(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setCurrencyDecimalSeparator_IMetInst = get_setCurrencyDecimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrencyDecimalSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setCurrencyDecimalSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrencyGroupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrencyGroupingSeparator_IMetInst(){
		return ((setCurrencyGroupingSeparator_IMetInst != null)
	? (setCurrencyGroupingSeparator_IMetInst)
	: (setCurrencyGroupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrencyGroupingSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrencyGroupingSeparator(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setCurrencyGroupingSeparator_IMetInst = get_setCurrencyGroupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrencyGroupingSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setCurrencyGroupingSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrencySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrencySymbol_IMetInst(){
		return ((setCurrencySymbol_IMetInst != null)
	? (setCurrencySymbol_IMetInst)
	: (setCurrencySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrencySymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrencySymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setCurrencySymbol_IMetInst = get_setCurrencySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrencySymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setCurrencySymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDecimalSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDecimalSeparator_IMetInst(){
		return ((setDecimalSeparator_IMetInst != null)
	? (setDecimalSeparator_IMetInst)
	: (setDecimalSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDecimalSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDecimalSeparator(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setDecimalSeparator_IMetInst = get_setDecimalSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDecimalSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setDecimalSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExponentSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExponentSymbol_IMetInst(){
		return ((setExponentSymbol_IMetInst != null)
	? (setExponentSymbol_IMetInst)
	: (setExponentSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExponentSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExponentSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setExponentSymbol_IMetInst = get_setExponentSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExponentSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setExponentSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormat_IMetInst(){
		return ((setFormat_IMetInst != null)
	? (setFormat_IMetInst)
	: (setFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFormat(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setFormat_IMetInst = get_setFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormatWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormatWidth_IMetInst(){
		return ((setFormatWidth_IMetInst != null)
	? (setFormatWidth_IMetInst)
	: (setFormatWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormatWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFormatWidth(final long number){
			final com.apple.jobjc.Invoke.MsgSend setFormatWidth_IMetInst = get_setFormatWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormatWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setFormatWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormatterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormatterBehavior_IMetInst(){
		return ((setFormatterBehavior_IMetInst != null)
	? (setFormatterBehavior_IMetInst)
	: (setFormatterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormatterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFormatterBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setFormatterBehavior_IMetInst = get_setFormatterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormatterBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, behavior);
		setFormatterBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGeneratesDecimalNumbers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGeneratesDecimalNumbers_IMetInst(){
		return ((setGeneratesDecimalNumbers_IMetInst != null)
	? (setGeneratesDecimalNumbers_IMetInst)
	: (setGeneratesDecimalNumbers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGeneratesDecimalNumbers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setGeneratesDecimalNumbers(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setGeneratesDecimalNumbers_IMetInst = get_setGeneratesDecimalNumbers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGeneratesDecimalNumbers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setGeneratesDecimalNumbers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGroupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGroupingSeparator_IMetInst(){
		return ((setGroupingSeparator_IMetInst != null)
	? (setGroupingSeparator_IMetInst)
	: (setGroupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGroupingSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setGroupingSeparator(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setGroupingSeparator_IMetInst = get_setGroupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGroupingSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setGroupingSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGroupingSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGroupingSize_IMetInst(){
		return ((setGroupingSize_IMetInst != null)
	? (setGroupingSize_IMetInst)
	: (setGroupingSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGroupingSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setGroupingSize(final long number){
			final com.apple.jobjc.Invoke.MsgSend setGroupingSize_IMetInst = get_setGroupingSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGroupingSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setGroupingSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasThousandSeparators_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasThousandSeparators_IMetInst(){
		return ((setHasThousandSeparators_IMetInst != null)
	? (setHasThousandSeparators_IMetInst)
	: (setHasThousandSeparators_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasThousandSeparators:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasThousandSeparators(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasThousandSeparators_IMetInst = get_setHasThousandSeparators_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasThousandSeparators_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasThousandSeparators_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInternationalCurrencySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInternationalCurrencySymbol_IMetInst(){
		return ((setInternationalCurrencySymbol_IMetInst != null)
	? (setInternationalCurrencySymbol_IMetInst)
	: (setInternationalCurrencySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInternationalCurrencySymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInternationalCurrencySymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setInternationalCurrencySymbol_IMetInst = get_setInternationalCurrencySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInternationalCurrencySymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setInternationalCurrencySymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLenient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLenient_IMetInst(){
		return ((setLenient_IMetInst != null)
	? (setLenient_IMetInst)
	: (setLenient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLenient:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLenient(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setLenient_IMetInst = get_setLenient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLenient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setLenient_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocale_IMetInst(){
		return ((setLocale_IMetInst != null)
	? (setLocale_IMetInst)
	: (setLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocale:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend setLocale_IMetInst = get_setLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		setLocale_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocalizesFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocalizesFormat_IMetInst(){
		return ((setLocalizesFormat_IMetInst != null)
	? (setLocalizesFormat_IMetInst)
	: (setLocalizesFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocalizesFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setLocalizesFormat(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setLocalizesFormat_IMetInst = get_setLocalizesFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocalizesFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setLocalizesFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximum_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximum_IMetInst(){
		return ((setMaximum_IMetInst != null)
	? (setMaximum_IMetInst)
	: (setMaximum_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximum:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMaximum(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend setMaximum_IMetInst = get_setMaximum_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximum_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		setMaximum_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximumFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximumFractionDigits_IMetInst(){
		return ((setMaximumFractionDigits_IMetInst != null)
	? (setMaximumFractionDigits_IMetInst)
	: (setMaximumFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximumFractionDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMaximumFractionDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMaximumFractionDigits_IMetInst = get_setMaximumFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximumFractionDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMaximumFractionDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximumIntegerDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximumIntegerDigits_IMetInst(){
		return ((setMaximumIntegerDigits_IMetInst != null)
	? (setMaximumIntegerDigits_IMetInst)
	: (setMaximumIntegerDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximumIntegerDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMaximumIntegerDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMaximumIntegerDigits_IMetInst = get_setMaximumIntegerDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximumIntegerDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMaximumIntegerDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximumSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximumSignificantDigits_IMetInst(){
		return ((setMaximumSignificantDigits_IMetInst != null)
	? (setMaximumSignificantDigits_IMetInst)
	: (setMaximumSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximumSignificantDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMaximumSignificantDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMaximumSignificantDigits_IMetInst = get_setMaximumSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximumSignificantDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMaximumSignificantDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimum_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimum_IMetInst(){
		return ((setMinimum_IMetInst != null)
	? (setMinimum_IMetInst)
	: (setMinimum_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimum:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMinimum(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend setMinimum_IMetInst = get_setMinimum_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimum_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		setMinimum_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumFractionDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumFractionDigits_IMetInst(){
		return ((setMinimumFractionDigits_IMetInst != null)
	? (setMinimumFractionDigits_IMetInst)
	: (setMinimumFractionDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumFractionDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMinimumFractionDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMinimumFractionDigits_IMetInst = get_setMinimumFractionDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumFractionDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMinimumFractionDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumIntegerDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumIntegerDigits_IMetInst(){
		return ((setMinimumIntegerDigits_IMetInst != null)
	? (setMinimumIntegerDigits_IMetInst)
	: (setMinimumIntegerDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumIntegerDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMinimumIntegerDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMinimumIntegerDigits_IMetInst = get_setMinimumIntegerDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumIntegerDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMinimumIntegerDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumSignificantDigits_IMetInst(){
		return ((setMinimumSignificantDigits_IMetInst != null)
	? (setMinimumSignificantDigits_IMetInst)
	: (setMinimumSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumSignificantDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMinimumSignificantDigits(final long number){
			final com.apple.jobjc.Invoke.MsgSend setMinimumSignificantDigits_IMetInst = get_setMinimumSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumSignificantDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setMinimumSignificantDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinusSign_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinusSign_IMetInst(){
		return ((setMinusSign_IMetInst != null)
	? (setMinusSign_IMetInst)
	: (setMinusSign_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinusSign:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMinusSign(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setMinusSign_IMetInst = get_setMinusSign_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinusSign_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setMinusSign_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMultiplier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMultiplier_IMetInst(){
		return ((setMultiplier_IMetInst != null)
	? (setMultiplier_IMetInst)
	: (setMultiplier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMultiplier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMultiplier(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend setMultiplier_IMetInst = get_setMultiplier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMultiplier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		setMultiplier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNegativeFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNegativeFormat_IMetInst(){
		return ((setNegativeFormat_IMetInst != null)
	? (setNegativeFormat_IMetInst)
	: (setNegativeFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNegativeFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNegativeFormat(final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend setNegativeFormat_IMetInst = get_setNegativeFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNegativeFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		setNegativeFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNegativeInfinitySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNegativeInfinitySymbol_IMetInst(){
		return ((setNegativeInfinitySymbol_IMetInst != null)
	? (setNegativeInfinitySymbol_IMetInst)
	: (setNegativeInfinitySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNegativeInfinitySymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNegativeInfinitySymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setNegativeInfinitySymbol_IMetInst = get_setNegativeInfinitySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNegativeInfinitySymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setNegativeInfinitySymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNegativePrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNegativePrefix_IMetInst(){
		return ((setNegativePrefix_IMetInst != null)
	? (setNegativePrefix_IMetInst)
	: (setNegativePrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNegativePrefix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNegativePrefix(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setNegativePrefix_IMetInst = get_setNegativePrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNegativePrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setNegativePrefix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNegativeSuffix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNegativeSuffix_IMetInst(){
		return ((setNegativeSuffix_IMetInst != null)
	? (setNegativeSuffix_IMetInst)
	: (setNegativeSuffix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNegativeSuffix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNegativeSuffix(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setNegativeSuffix_IMetInst = get_setNegativeSuffix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNegativeSuffix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setNegativeSuffix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNilSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNilSymbol_IMetInst(){
		return ((setNilSymbol_IMetInst != null)
	? (setNilSymbol_IMetInst)
	: (setNilSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNilSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNilSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setNilSymbol_IMetInst = get_setNilSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNilSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setNilSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNotANumberSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNotANumberSymbol_IMetInst(){
		return ((setNotANumberSymbol_IMetInst != null)
	? (setNotANumberSymbol_IMetInst)
	: (setNotANumberSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNotANumberSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNotANumberSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setNotANumberSymbol_IMetInst = get_setNotANumberSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNotANumberSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setNotANumberSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberStyle_IMetInst(){
		return ((setNumberStyle_IMetInst != null)
	? (setNumberStyle_IMetInst)
	: (setNumberStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setNumberStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setNumberStyle_IMetInst = get_setNumberStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setNumberStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPaddingCharacter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPaddingCharacter_IMetInst(){
		return ((setPaddingCharacter_IMetInst != null)
	? (setPaddingCharacter_IMetInst)
	: (setPaddingCharacter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPaddingCharacter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPaddingCharacter(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPaddingCharacter_IMetInst = get_setPaddingCharacter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPaddingCharacter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPaddingCharacter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPaddingPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPaddingPosition_IMetInst(){
		return ((setPaddingPosition_IMetInst != null)
	? (setPaddingPosition_IMetInst)
	: (setPaddingPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPaddingPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setPaddingPosition(final long position){
			final com.apple.jobjc.Invoke.MsgSend setPaddingPosition_IMetInst = get_setPaddingPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPaddingPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, position);
		setPaddingPosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPartialStringValidationEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPartialStringValidationEnabled_IMetInst(){
		return ((setPartialStringValidationEnabled_IMetInst != null)
	? (setPartialStringValidationEnabled_IMetInst)
	: (setPartialStringValidationEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPartialStringValidationEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPartialStringValidationEnabled(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setPartialStringValidationEnabled_IMetInst = get_setPartialStringValidationEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPartialStringValidationEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setPartialStringValidationEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPerMillSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPerMillSymbol_IMetInst(){
		return ((setPerMillSymbol_IMetInst != null)
	? (setPerMillSymbol_IMetInst)
	: (setPerMillSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPerMillSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPerMillSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPerMillSymbol_IMetInst = get_setPerMillSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPerMillSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPerMillSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPercentSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPercentSymbol_IMetInst(){
		return ((setPercentSymbol_IMetInst != null)
	? (setPercentSymbol_IMetInst)
	: (setPercentSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPercentSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPercentSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPercentSymbol_IMetInst = get_setPercentSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPercentSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPercentSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlusSign_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlusSign_IMetInst(){
		return ((setPlusSign_IMetInst != null)
	? (setPlusSign_IMetInst)
	: (setPlusSign_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlusSign:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlusSign(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPlusSign_IMetInst = get_setPlusSign_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlusSign_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPlusSign_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPositiveFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPositiveFormat_IMetInst(){
		return ((setPositiveFormat_IMetInst != null)
	? (setPositiveFormat_IMetInst)
	: (setPositiveFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPositiveFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPositiveFormat(final com.apple.jobjc.foundation.NSString format){
			final com.apple.jobjc.Invoke.MsgSend setPositiveFormat_IMetInst = get_setPositiveFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPositiveFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		setPositiveFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPositiveInfinitySymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPositiveInfinitySymbol_IMetInst(){
		return ((setPositiveInfinitySymbol_IMetInst != null)
	? (setPositiveInfinitySymbol_IMetInst)
	: (setPositiveInfinitySymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPositiveInfinitySymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPositiveInfinitySymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPositiveInfinitySymbol_IMetInst = get_setPositiveInfinitySymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPositiveInfinitySymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPositiveInfinitySymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPositivePrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPositivePrefix_IMetInst(){
		return ((setPositivePrefix_IMetInst != null)
	? (setPositivePrefix_IMetInst)
	: (setPositivePrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPositivePrefix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPositivePrefix(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPositivePrefix_IMetInst = get_setPositivePrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPositivePrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPositivePrefix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPositiveSuffix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPositiveSuffix_IMetInst(){
		return ((setPositiveSuffix_IMetInst != null)
	? (setPositiveSuffix_IMetInst)
	: (setPositiveSuffix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPositiveSuffix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPositiveSuffix(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPositiveSuffix_IMetInst = get_setPositiveSuffix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPositiveSuffix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPositiveSuffix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRoundingBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRoundingBehavior_IMetInst(){
		return ((setRoundingBehavior_IMetInst != null)
	? (setRoundingBehavior_IMetInst)
	: (setRoundingBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRoundingBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRoundingBehavior(final com.apple.jobjc.foundation.NSDecimalNumberHandler newRoundingBehavior){
			final com.apple.jobjc.Invoke.MsgSend setRoundingBehavior_IMetInst = get_setRoundingBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRoundingBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newRoundingBehavior);
		setRoundingBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRoundingIncrement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRoundingIncrement_IMetInst(){
		return ((setRoundingIncrement_IMetInst != null)
	? (setRoundingIncrement_IMetInst)
	: (setRoundingIncrement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRoundingIncrement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRoundingIncrement(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend setRoundingIncrement_IMetInst = get_setRoundingIncrement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRoundingIncrement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		setRoundingIncrement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRoundingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRoundingMode_IMetInst(){
		return ((setRoundingMode_IMetInst != null)
	? (setRoundingMode_IMetInst)
	: (setRoundingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRoundingMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setRoundingMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setRoundingMode_IMetInst = get_setRoundingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRoundingMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setRoundingMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSecondaryGroupingSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSecondaryGroupingSize_IMetInst(){
		return ((setSecondaryGroupingSize_IMetInst != null)
	? (setSecondaryGroupingSize_IMetInst)
	: (setSecondaryGroupingSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSecondaryGroupingSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setSecondaryGroupingSize(final long number){
			final com.apple.jobjc.Invoke.MsgSend setSecondaryGroupingSize_IMetInst = get_setSecondaryGroupingSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSecondaryGroupingSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, number);
		setSecondaryGroupingSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForNegativeInfinity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForNegativeInfinity_IMetInst(){
		return ((setTextAttributesForNegativeInfinity_IMetInst != null)
	? (setTextAttributesForNegativeInfinity_IMetInst)
	: (setTextAttributesForNegativeInfinity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForNegativeInfinity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForNegativeInfinity(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForNegativeInfinity_IMetInst = get_setTextAttributesForNegativeInfinity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForNegativeInfinity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForNegativeInfinity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForNegativeValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForNegativeValues_IMetInst(){
		return ((setTextAttributesForNegativeValues_IMetInst != null)
	? (setTextAttributesForNegativeValues_IMetInst)
	: (setTextAttributesForNegativeValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForNegativeValues:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForNegativeValues(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForNegativeValues_IMetInst = get_setTextAttributesForNegativeValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForNegativeValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForNegativeValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForNil_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForNil_IMetInst(){
		return ((setTextAttributesForNil_IMetInst != null)
	? (setTextAttributesForNil_IMetInst)
	: (setTextAttributesForNil_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForNil:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForNil(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForNil_IMetInst = get_setTextAttributesForNil_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForNil_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForNil_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForNotANumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForNotANumber_IMetInst(){
		return ((setTextAttributesForNotANumber_IMetInst != null)
	? (setTextAttributesForNotANumber_IMetInst)
	: (setTextAttributesForNotANumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForNotANumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForNotANumber(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForNotANumber_IMetInst = get_setTextAttributesForNotANumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForNotANumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForNotANumber_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForPositiveInfinity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForPositiveInfinity_IMetInst(){
		return ((setTextAttributesForPositiveInfinity_IMetInst != null)
	? (setTextAttributesForPositiveInfinity_IMetInst)
	: (setTextAttributesForPositiveInfinity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForPositiveInfinity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForPositiveInfinity(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForPositiveInfinity_IMetInst = get_setTextAttributesForPositiveInfinity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForPositiveInfinity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForPositiveInfinity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForPositiveValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForPositiveValues_IMetInst(){
		return ((setTextAttributesForPositiveValues_IMetInst != null)
	? (setTextAttributesForPositiveValues_IMetInst)
	: (setTextAttributesForPositiveValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForPositiveValues:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForPositiveValues(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForPositiveValues_IMetInst = get_setTextAttributesForPositiveValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForPositiveValues_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForPositiveValues_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextAttributesForZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextAttributesForZero_IMetInst(){
		return ((setTextAttributesForZero_IMetInst != null)
	? (setTextAttributesForZero_IMetInst)
	: (setTextAttributesForZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextAttributesForZero:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextAttributesForZero(final com.apple.jobjc.foundation.NSDictionary newAttributes){
			final com.apple.jobjc.Invoke.MsgSend setTextAttributesForZero_IMetInst = get_setTextAttributesForZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextAttributesForZero_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newAttributes);
		setTextAttributesForZero_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setThousandSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setThousandSeparator_IMetInst(){
		return ((setThousandSeparator_IMetInst != null)
	? (setThousandSeparator_IMetInst)
	: (setThousandSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setThousandSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setThousandSeparator(final com.apple.jobjc.foundation.NSString newSeparator){
			final com.apple.jobjc.Invoke.MsgSend setThousandSeparator_IMetInst = get_setThousandSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setThousandSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newSeparator);
		setThousandSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesGroupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesGroupingSeparator_IMetInst(){
		return ((setUsesGroupingSeparator_IMetInst != null)
	? (setUsesGroupingSeparator_IMetInst)
	: (setUsesGroupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesGroupingSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesGroupingSeparator(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setUsesGroupingSeparator_IMetInst = get_setUsesGroupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesGroupingSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setUsesGroupingSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesSignificantDigits_IMetInst(){
		return ((setUsesSignificantDigits_IMetInst != null)
	? (setUsesSignificantDigits_IMetInst)
	: (setUsesSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesSignificantDigits:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesSignificantDigits(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setUsesSignificantDigits_IMetInst = get_setUsesSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesSignificantDigits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setUsesSignificantDigits_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setZeroSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setZeroSymbol_IMetInst(){
		return ((setZeroSymbol_IMetInst != null)
	? (setZeroSymbol_IMetInst)
	: (setZeroSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setZeroSymbol:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setZeroSymbol(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setZeroSymbol_IMetInst = get_setZeroSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setZeroSymbol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setZeroSymbol_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringFromNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringFromNumber_IMetInst(){
		return ((stringFromNumber_IMetInst != null)
	? (stringFromNumber_IMetInst)
	: (stringFromNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringFromNumber:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringFromNumber(final com.apple.jobjc.foundation.NSNumber number){
			final com.apple.jobjc.Invoke.MsgSend stringFromNumber_IMetInst = get_stringFromNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringFromNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, number);
		stringFromNumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForNegativeInfinity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForNegativeInfinity_IMetInst(){
		return ((textAttributesForNegativeInfinity_IMetInst != null)
	? (textAttributesForNegativeInfinity_IMetInst)
	: (textAttributesForNegativeInfinity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForNegativeInfinity", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForNegativeInfinity(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForNegativeInfinity_IMetInst = get_textAttributesForNegativeInfinity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForNegativeInfinity_IMetInst.init(nativeBuffer, this);
		textAttributesForNegativeInfinity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForNegativeValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForNegativeValues_IMetInst(){
		return ((textAttributesForNegativeValues_IMetInst != null)
	? (textAttributesForNegativeValues_IMetInst)
	: (textAttributesForNegativeValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForNegativeValues", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForNegativeValues(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForNegativeValues_IMetInst = get_textAttributesForNegativeValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForNegativeValues_IMetInst.init(nativeBuffer, this);
		textAttributesForNegativeValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForNil_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForNil_IMetInst(){
		return ((textAttributesForNil_IMetInst != null)
	? (textAttributesForNil_IMetInst)
	: (textAttributesForNil_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForNil", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForNil(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForNil_IMetInst = get_textAttributesForNil_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForNil_IMetInst.init(nativeBuffer, this);
		textAttributesForNil_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForNotANumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForNotANumber_IMetInst(){
		return ((textAttributesForNotANumber_IMetInst != null)
	? (textAttributesForNotANumber_IMetInst)
	: (textAttributesForNotANumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForNotANumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForNotANumber(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForNotANumber_IMetInst = get_textAttributesForNotANumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForNotANumber_IMetInst.init(nativeBuffer, this);
		textAttributesForNotANumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForPositiveInfinity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForPositiveInfinity_IMetInst(){
		return ((textAttributesForPositiveInfinity_IMetInst != null)
	? (textAttributesForPositiveInfinity_IMetInst)
	: (textAttributesForPositiveInfinity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForPositiveInfinity", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForPositiveInfinity(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForPositiveInfinity_IMetInst = get_textAttributesForPositiveInfinity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForPositiveInfinity_IMetInst.init(nativeBuffer, this);
		textAttributesForPositiveInfinity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForPositiveValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForPositiveValues_IMetInst(){
		return ((textAttributesForPositiveValues_IMetInst != null)
	? (textAttributesForPositiveValues_IMetInst)
	: (textAttributesForPositiveValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForPositiveValues", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForPositiveValues(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForPositiveValues_IMetInst = get_textAttributesForPositiveValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForPositiveValues_IMetInst.init(nativeBuffer, this);
		textAttributesForPositiveValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textAttributesForZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textAttributesForZero_IMetInst(){
		return ((textAttributesForZero_IMetInst != null)
	? (textAttributesForZero_IMetInst)
	: (textAttributesForZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textAttributesForZero", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary textAttributesForZero(){
			final com.apple.jobjc.Invoke.MsgSend textAttributesForZero_IMetInst = get_textAttributesForZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textAttributesForZero_IMetInst.init(nativeBuffer, this);
		textAttributesForZero_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend thousandSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_thousandSeparator_IMetInst(){
		return ((thousandSeparator_IMetInst != null)
	? (thousandSeparator_IMetInst)
	: (thousandSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "thousandSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString thousandSeparator(){
			final com.apple.jobjc.Invoke.MsgSend thousandSeparator_IMetInst = get_thousandSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		thousandSeparator_IMetInst.init(nativeBuffer, this);
		thousandSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesGroupingSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesGroupingSeparator_IMetInst(){
		return ((usesGroupingSeparator_IMetInst != null)
	? (usesGroupingSeparator_IMetInst)
	: (usesGroupingSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesGroupingSeparator", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesGroupingSeparator(){
			final com.apple.jobjc.Invoke.MsgSend usesGroupingSeparator_IMetInst = get_usesGroupingSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesGroupingSeparator_IMetInst.init(nativeBuffer, this);
		usesGroupingSeparator_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesSignificantDigits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesSignificantDigits_IMetInst(){
		return ((usesSignificantDigits_IMetInst != null)
	? (usesSignificantDigits_IMetInst)
	: (usesSignificantDigits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesSignificantDigits", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesSignificantDigits(){
			final com.apple.jobjc.Invoke.MsgSend usesSignificantDigits_IMetInst = get_usesSignificantDigits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesSignificantDigits_IMetInst.init(nativeBuffer, this);
		usesSignificantDigits_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend zeroSymbol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zeroSymbol_IMetInst(){
		return ((zeroSymbol_IMetInst != null)
	? (zeroSymbol_IMetInst)
	: (zeroSymbol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zeroSymbol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString zeroSymbol(){
			final com.apple.jobjc.Invoke.MsgSend zeroSymbol_IMetInst = get_zeroSymbol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zeroSymbol_IMetInst.init(nativeBuffer, this);
		zeroSymbol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
