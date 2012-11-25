package com.apple.jobjc.foundation;

public  class NSString extends com.apple.jobjc.foundation.NSObject {
	public NSString(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSString(final NSString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend UTF8String_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_UTF8String_IMetInst(){
		return ((UTF8String_IMetInst != null)
	? (UTF8String_IMetInst)
	: (UTF8String_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "UTF8String", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> UTF8String(){
			final com.apple.jobjc.Invoke.MsgSend UTF8String_IMetInst = get_UTF8String_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		UTF8String_IMetInst.init(nativeBuffer, this);
		UTF8String_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend cString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cString_IMetInst(){
		return ((cString_IMetInst != null)
	? (cString_IMetInst)
	: (cString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cString", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> cString(){
			final com.apple.jobjc.Invoke.MsgSend cString_IMetInst = get_cString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cString_IMetInst.init(nativeBuffer, this);
		cString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cStringLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cStringLength_IMetInst(){
		return ((cStringLength_IMetInst != null)
	? (cStringLength_IMetInst)
	: (cStringLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cStringLength", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long cStringLength(){
			final com.apple.jobjc.Invoke.MsgSend cStringLength_IMetInst = get_cStringLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cStringLength_IMetInst.init(nativeBuffer, this);
		cStringLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cStringUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cStringUsingEncoding_IMetInst(){
		return ((cStringUsingEncoding_IMetInst != null)
	? (cStringUsingEncoding_IMetInst)
	: (cStringUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cStringUsingEncoding:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> cStringUsingEncoding(final long encoding){
			final com.apple.jobjc.Invoke.MsgSend cStringUsingEncoding_IMetInst = get_cStringUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cStringUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		cStringUsingEncoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBeConvertedToEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBeConvertedToEncoding_IMetInst(){
		return ((canBeConvertedToEncoding_IMetInst != null)
	? (canBeConvertedToEncoding_IMetInst)
	: (canBeConvertedToEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBeConvertedToEncoding:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean canBeConvertedToEncoding(final long encoding){
			final com.apple.jobjc.Invoke.MsgSend canBeConvertedToEncoding_IMetInst = get_canBeConvertedToEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBeConvertedToEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		canBeConvertedToEncoding_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend capitalizedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capitalizedString_IMetInst(){
		return ((capitalizedString_IMetInst != null)
	? (capitalizedString_IMetInst)
	: (capitalizedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capitalizedString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString capitalizedString(){
			final com.apple.jobjc.Invoke.MsgSend capitalizedString_IMetInst = get_capitalizedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capitalizedString_IMetInst.init(nativeBuffer, this);
		capitalizedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend capitalizedStringWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capitalizedStringWithLocale_IMetInst(){
		return ((capitalizedStringWithLocale_IMetInst != null)
	? (capitalizedStringWithLocale_IMetInst)
	: (capitalizedStringWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capitalizedStringWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString capitalizedStringWithLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend capitalizedStringWithLocale_IMetInst = get_capitalizedStringWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capitalizedStringWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		capitalizedStringWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend caseInsensitiveCompare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_caseInsensitiveCompare_IMetInst(){
		return ((caseInsensitiveCompare_IMetInst != null)
	? (caseInsensitiveCompare_IMetInst)
	: (caseInsensitiveCompare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "caseInsensitiveCompare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long caseInsensitiveCompare(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend caseInsensitiveCompare_IMetInst = get_caseInsensitiveCompare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		caseInsensitiveCompare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		caseInsensitiveCompare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterAtIndex_IMetInst(){
		return ((characterAtIndex_IMetInst != null)
	? (characterAtIndex_IMetInst)
	: (characterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterAtIndex:", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public short characterAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend characterAtIndex_IMetInst = get_characterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		characterAtIndex_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commonPrefixWithString_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commonPrefixWithString_options_IMetInst(){
		return ((commonPrefixWithString_options_IMetInst != null)
	? (commonPrefixWithString_options_IMetInst)
	: (commonPrefixWithString_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commonPrefixWithString:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString commonPrefixWithString_options(final com.apple.jobjc.foundation.NSString aString, final long mask){
			final com.apple.jobjc.Invoke.MsgSend commonPrefixWithString_options_IMetInst = get_commonPrefixWithString_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commonPrefixWithString_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		commonPrefixWithString_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_options_IMetInst(){
		return ((compare_options_IMetInst != null)
	? (compare_options_IMetInst)
	: (compare_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:options:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long compare_options(final com.apple.jobjc.foundation.NSString string, final long mask){
			final com.apple.jobjc.Invoke.MsgSend compare_options_IMetInst = get_compare_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		compare_options_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_options_range_IMetInst(){
		return ((compare_options_range_IMetInst != null)
	? (compare_options_range_IMetInst)
	: (compare_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:options:range:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long compare_options_range(final com.apple.jobjc.foundation.NSString string, final long mask, final com.apple.jobjc.foundation.NSRange compareRange){
			final com.apple.jobjc.Invoke.MsgSend compare_options_range_IMetInst = get_compare_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, compareRange);
		compare_options_range_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_options_range_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_options_range_locale_IMetInst(){
		return ((compare_options_range_locale_IMetInst != null)
	? (compare_options_range_locale_IMetInst)
	: (compare_options_range_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:options:range:locale:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare_options_range_locale(final com.apple.jobjc.foundation.NSString string, final long mask, final com.apple.jobjc.foundation.NSRange compareRange, final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend compare_options_range_locale_IMetInst = get_compare_options_range_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_options_range_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, compareRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		compare_options_range_locale_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst(){
		return ((completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst != null)
	? (completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst)
	: (completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long completePathIntoString_caseSensitive_matchesIntoArray_filterTypes(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> outputName, final boolean flag, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> outputArray, final com.apple.jobjc.foundation.NSArray filterTypes){
			final com.apple.jobjc.Invoke.MsgSend completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst = get_completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outputName);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outputArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filterTypes);
		completePathIntoString_caseSensitive_matchesIntoArray_filterTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend componentsSeparatedByCharactersInSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_componentsSeparatedByCharactersInSet_IMetInst(){
		return ((componentsSeparatedByCharactersInSet_IMetInst != null)
	? (componentsSeparatedByCharactersInSet_IMetInst)
	: (componentsSeparatedByCharactersInSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "componentsSeparatedByCharactersInSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray componentsSeparatedByCharactersInSet(final com.apple.jobjc.foundation.NSCharacterSet separator){
			final com.apple.jobjc.Invoke.MsgSend componentsSeparatedByCharactersInSet_IMetInst = get_componentsSeparatedByCharactersInSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		componentsSeparatedByCharactersInSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, separator);
		componentsSeparatedByCharactersInSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend componentsSeparatedByString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_componentsSeparatedByString_IMetInst(){
		return ((componentsSeparatedByString_IMetInst != null)
	? (componentsSeparatedByString_IMetInst)
	: (componentsSeparatedByString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "componentsSeparatedByString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray componentsSeparatedByString(final com.apple.jobjc.foundation.NSString separator){
			final com.apple.jobjc.Invoke.MsgSend componentsSeparatedByString_IMetInst = get_componentsSeparatedByString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		componentsSeparatedByString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, separator);
		componentsSeparatedByString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataUsingEncoding_IMetInst(){
		return ((dataUsingEncoding_IMetInst != null)
	? (dataUsingEncoding_IMetInst)
	: (dataUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataUsingEncoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSData dataUsingEncoding(final long encoding){
			final com.apple.jobjc.Invoke.MsgSend dataUsingEncoding_IMetInst = get_dataUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		dataUsingEncoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataUsingEncoding_allowLossyConversion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataUsingEncoding_allowLossyConversion_IMetInst(){
		return ((dataUsingEncoding_allowLossyConversion_IMetInst != null)
	? (dataUsingEncoding_allowLossyConversion_IMetInst)
	: (dataUsingEncoding_allowLossyConversion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataUsingEncoding:allowLossyConversion:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataUsingEncoding_allowLossyConversion(final long encoding, final boolean lossy){
			final com.apple.jobjc.Invoke.MsgSend dataUsingEncoding_allowLossyConversion_IMetInst = get_dataUsingEncoding_allowLossyConversion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataUsingEncoding_allowLossyConversion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, lossy);
		dataUsingEncoding_allowLossyConversion_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decomposedStringWithCanonicalMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decomposedStringWithCanonicalMapping_IMetInst(){
		return ((decomposedStringWithCanonicalMapping_IMetInst != null)
	? (decomposedStringWithCanonicalMapping_IMetInst)
	: (decomposedStringWithCanonicalMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decomposedStringWithCanonicalMapping", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString decomposedStringWithCanonicalMapping(){
			final com.apple.jobjc.Invoke.MsgSend decomposedStringWithCanonicalMapping_IMetInst = get_decomposedStringWithCanonicalMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decomposedStringWithCanonicalMapping_IMetInst.init(nativeBuffer, this);
		decomposedStringWithCanonicalMapping_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decomposedStringWithCompatibilityMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decomposedStringWithCompatibilityMapping_IMetInst(){
		return ((decomposedStringWithCompatibilityMapping_IMetInst != null)
	? (decomposedStringWithCompatibilityMapping_IMetInst)
	: (decomposedStringWithCompatibilityMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decomposedStringWithCompatibilityMapping", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString decomposedStringWithCompatibilityMapping(){
			final com.apple.jobjc.Invoke.MsgSend decomposedStringWithCompatibilityMapping_IMetInst = get_decomposedStringWithCompatibilityMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decomposedStringWithCompatibilityMapping_IMetInst.init(nativeBuffer, this);
		decomposedStringWithCompatibilityMapping_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend enumerateLinesUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateLinesUsingBlock_IMetInst(){
		return ((enumerateLinesUsingBlock_IMetInst != null)
	? (enumerateLinesUsingBlock_IMetInst)
	: (enumerateLinesUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateLinesUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateLinesUsingBlock(final Object /* void(^)(NSString*,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateLinesUsingBlock_IMetInst = get_enumerateLinesUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateLinesUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateLinesUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst(){
		return ((enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst != null)
	? (enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst)
	: (enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString tagScheme, final long opts, final com.apple.jobjc.foundation.NSOrthography orthography, final Object /* void(^)(NSString*,NSRange,NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst = get_enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateLinguisticTagsInRange_scheme_options_orthography_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateSubstringsInRange_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateSubstringsInRange_options_usingBlock_IMetInst(){
		return ((enumerateSubstringsInRange_options_usingBlock_IMetInst != null)
	? (enumerateSubstringsInRange_options_usingBlock_IMetInst)
	: (enumerateSubstringsInRange_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateSubstringsInRange:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateSubstringsInRange_options_usingBlock(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* void(^)(NSString*,NSRange,NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateSubstringsInRange_options_usingBlock_IMetInst = get_enumerateSubstringsInRange_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateSubstringsInRange_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateSubstringsInRange_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fastestEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fastestEncoding_IMetInst(){
		return ((fastestEncoding_IMetInst != null)
	? (fastestEncoding_IMetInst)
	: (fastestEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fastestEncoding", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long fastestEncoding(){
			final com.apple.jobjc.Invoke.MsgSend fastestEncoding_IMetInst = get_fastestEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fastestEncoding_IMetInst.init(nativeBuffer, this);
		fastestEncoding_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemRepresentation_IMetInst(){
		return ((fileSystemRepresentation_IMetInst != null)
	? (fileSystemRepresentation_IMetInst)
	: (fileSystemRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemRepresentation", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> fileSystemRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend fileSystemRepresentation_IMetInst = get_fileSystemRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemRepresentation_IMetInst.init(nativeBuffer, this);
		fileSystemRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst(){
		return ((getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst != null)
	? (getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst)
	: (getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBytes:maxLength:usedLength:encoding:options:range:remainingRange:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean getBytes_maxLength_usedLength_encoding_options_range_remainingRange(final com.apple.jobjc.Pointer<Void> buffer, final long maxBufferCount, final com.apple.jobjc.Pointer<java.lang.Long> usedBufferCount, final long encoding, final long options, final com.apple.jobjc.foundation.NSRange range, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ leftover){
			final com.apple.jobjc.Invoke.MsgSend getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst = get_getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, maxBufferCount);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, usedBufferCount);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, leftover);
		getBytes_maxLength_usedLength_encoding_options_range_remainingRange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getCString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCString_IMetInst(){
		return ((getCString_IMetInst != null)
	? (getCString_IMetInst)
	: (getCString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getCString(final com.apple.jobjc.Pointer<java.lang.Byte> bytes){
			final com.apple.jobjc.Invoke.MsgSend getCString_IMetInst = get_getCString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		getCString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCString_maxLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCString_maxLength_IMetInst(){
		return ((getCString_maxLength_IMetInst != null)
	? (getCString_maxLength_IMetInst)
	: (getCString_maxLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCString:maxLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void getCString_maxLength(final com.apple.jobjc.Pointer<java.lang.Byte> bytes, final long maxLength){
			final com.apple.jobjc.Invoke.MsgSend getCString_maxLength_IMetInst = get_getCString_maxLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCString_maxLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, maxLength);
		getCString_maxLength_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCString_maxLength_encoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCString_maxLength_encoding_IMetInst(){
		return ((getCString_maxLength_encoding_IMetInst != null)
	? (getCString_maxLength_encoding_IMetInst)
	: (getCString_maxLength_encoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCString:maxLength:encoding:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean getCString_maxLength_encoding(final com.apple.jobjc.Pointer<java.lang.Byte> buffer, final long maxBufferCount, final long encoding){
			final com.apple.jobjc.Invoke.MsgSend getCString_maxLength_encoding_IMetInst = get_getCString_maxLength_encoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCString_maxLength_encoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, maxBufferCount);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		getCString_maxLength_encoding_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getCString_maxLength_range_remainingRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCString_maxLength_range_remainingRange_IMetInst(){
		return ((getCString_maxLength_range_remainingRange_IMetInst != null)
	? (getCString_maxLength_range_remainingRange_IMetInst)
	: (getCString_maxLength_range_remainingRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCString:maxLength:range:remainingRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void getCString_maxLength_range_remainingRange(final com.apple.jobjc.Pointer<java.lang.Byte> bytes, final long maxLength, final com.apple.jobjc.foundation.NSRange aRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ leftoverRange){
			final com.apple.jobjc.Invoke.MsgSend getCString_maxLength_range_remainingRange_IMetInst = get_getCString_maxLength_range_remainingRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCString_maxLength_range_remainingRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, maxLength);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, leftoverRange);
		getCString_maxLength_range_remainingRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCharacters_IMetInst(){
		return ((getCharacters_IMetInst != null)
	? (getCharacters_IMetInst)
	: (getCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCharacters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getCharacters(final com.apple.jobjc.Pointer<java.lang.Short> buffer){
			final com.apple.jobjc.Invoke.MsgSend getCharacters_IMetInst = get_getCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCharacters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		getCharacters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getCharacters_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCharacters_range_IMetInst(){
		return ((getCharacters_range_IMetInst != null)
	? (getCharacters_range_IMetInst)
	: (getCharacters_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCharacters:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void getCharacters_range(final com.apple.jobjc.Pointer<java.lang.Short> buffer, final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend getCharacters_range_IMetInst = get_getCharacters_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCharacters_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		getCharacters_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getFileSystemRepresentation_maxLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getFileSystemRepresentation_maxLength_IMetInst(){
		return ((getFileSystemRepresentation_maxLength_IMetInst != null)
	? (getFileSystemRepresentation_maxLength_IMetInst)
	: (getFileSystemRepresentation_maxLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getFileSystemRepresentation:maxLength:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean getFileSystemRepresentation_maxLength(final com.apple.jobjc.Pointer<java.lang.Byte> cname, final long max){
			final com.apple.jobjc.Invoke.MsgSend getFileSystemRepresentation_maxLength_IMetInst = get_getFileSystemRepresentation_maxLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getFileSystemRepresentation_maxLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, cname);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, max);
		getFileSystemRepresentation_maxLength_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getLineStart_end_contentsEnd_forRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getLineStart_end_contentsEnd_forRange_IMetInst(){
		return ((getLineStart_end_contentsEnd_forRange_IMetInst != null)
	? (getLineStart_end_contentsEnd_forRange_IMetInst)
	: (getLineStart_end_contentsEnd_forRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getLineStart:end:contentsEnd:forRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void getLineStart_end_contentsEnd_forRange(final com.apple.jobjc.Pointer<java.lang.Long> startPtr, final com.apple.jobjc.Pointer<java.lang.Long> lineEndPtr, final com.apple.jobjc.Pointer<java.lang.Long> contentsEndPtr, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend getLineStart_end_contentsEnd_forRange_IMetInst = get_getLineStart_end_contentsEnd_forRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getLineStart_end_contentsEnd_forRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, startPtr);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lineEndPtr);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contentsEndPtr);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		getLineStart_end_contentsEnd_forRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getParagraphStart_end_contentsEnd_forRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getParagraphStart_end_contentsEnd_forRange_IMetInst(){
		return ((getParagraphStart_end_contentsEnd_forRange_IMetInst != null)
	? (getParagraphStart_end_contentsEnd_forRange_IMetInst)
	: (getParagraphStart_end_contentsEnd_forRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getParagraphStart:end:contentsEnd:forRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void getParagraphStart_end_contentsEnd_forRange(final com.apple.jobjc.Pointer<java.lang.Long> startPtr, final com.apple.jobjc.Pointer<java.lang.Long> parEndPtr, final com.apple.jobjc.Pointer<java.lang.Long> contentsEndPtr, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend getParagraphStart_end_contentsEnd_forRange_IMetInst = get_getParagraphStart_end_contentsEnd_forRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getParagraphStart_end_contentsEnd_forRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, startPtr);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, parEndPtr);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contentsEndPtr);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		getParagraphStart_end_contentsEnd_forRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hasPrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasPrefix_IMetInst(){
		return ((hasPrefix_IMetInst != null)
	? (hasPrefix_IMetInst)
	: (hasPrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasPrefix:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasPrefix(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend hasPrefix_IMetInst = get_hasPrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasPrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		hasPrefix_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasSuffix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasSuffix_IMetInst(){
		return ((hasSuffix_IMetInst != null)
	? (hasSuffix_IMetInst)
	: (hasSuffix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasSuffix:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasSuffix(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend hasSuffix_IMetInst = get_hasSuffix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasSuffix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		hasSuffix_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hash_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hash_IMetInst(){
		return ((hash_IMetInst != null)
	? (hash_IMetInst)
	: (hash_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hash", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long hash(){
			final com.apple.jobjc.Invoke.MsgSend hash_IMetInst = get_hash_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hash_IMetInst.init(nativeBuffer, this);
		hash_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytes_length_encoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytes_length_encoding_IMetInst(){
		return ((initWithBytes_length_encoding_IMetInst != null)
	? (initWithBytes_length_encoding_IMetInst)
	: (initWithBytes_length_encoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytes:length:encoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytes_length_encoding(final com.apple.jobjc.Pointer<Void> bytes, final long len, final long encoding){
			final com.apple.jobjc.Invoke.MsgSend initWithBytes_length_encoding_IMetInst = get_initWithBytes_length_encoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytes_length_encoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		initWithBytes_length_encoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst(){
		return ((initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst != null)
	? (initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst)
	: (initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytesNoCopy:length:encoding:freeWhenDone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytesNoCopy_length_encoding_freeWhenDone(final com.apple.jobjc.Pointer<Void> bytes, final long len, final long encoding, final boolean freeBuffer){
			final com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst = get_initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, freeBuffer);
		initWithBytesNoCopy_length_encoding_freeWhenDone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCString_IMetInst(){
		return ((initWithCString_IMetInst != null)
	? (initWithCString_IMetInst)
	: (initWithCString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCString(final com.apple.jobjc.Pointer<java.lang.Byte> bytes){
			final com.apple.jobjc.Invoke.MsgSend initWithCString_IMetInst = get_initWithCString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		initWithCString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCString_encoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCString_encoding_IMetInst(){
		return ((initWithCString_encoding_IMetInst != null)
	? (initWithCString_encoding_IMetInst)
	: (initWithCString_encoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCString:encoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCString_encoding(final com.apple.jobjc.Pointer<java.lang.Byte> nullTerminatedCString, final long encoding){
			final com.apple.jobjc.Invoke.MsgSend initWithCString_encoding_IMetInst = get_initWithCString_encoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCString_encoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, nullTerminatedCString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		initWithCString_encoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCString_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCString_length_IMetInst(){
		return ((initWithCString_length_IMetInst != null)
	? (initWithCString_length_IMetInst)
	: (initWithCString_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCString:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCString_length(final com.apple.jobjc.Pointer<java.lang.Byte> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithCString_length_IMetInst = get_initWithCString_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCString_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithCString_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCStringNoCopy_length_freeWhenDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCStringNoCopy_length_freeWhenDone_IMetInst(){
		return ((initWithCStringNoCopy_length_freeWhenDone_IMetInst != null)
	? (initWithCStringNoCopy_length_freeWhenDone_IMetInst)
	: (initWithCStringNoCopy_length_freeWhenDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCStringNoCopy:length:freeWhenDone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCStringNoCopy_length_freeWhenDone(final com.apple.jobjc.Pointer<java.lang.Byte> bytes, final long length, final boolean freeBuffer){
			final com.apple.jobjc.Invoke.MsgSend initWithCStringNoCopy_length_freeWhenDone_IMetInst = get_initWithCStringNoCopy_length_freeWhenDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCStringNoCopy_length_freeWhenDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, freeBuffer);
		initWithCStringNoCopy_length_freeWhenDone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCharacters_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCharacters_length_IMetInst(){
		return ((initWithCharacters_length_IMetInst != null)
	? (initWithCharacters_length_IMetInst)
	: (initWithCharacters_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCharacters:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCharacters_length(final com.apple.jobjc.Pointer<java.lang.Short> characters, final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithCharacters_length_IMetInst = get_initWithCharacters_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCharacters_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, characters);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithCharacters_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCharactersNoCopy_length_freeWhenDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCharactersNoCopy_length_freeWhenDone_IMetInst(){
		return ((initWithCharactersNoCopy_length_freeWhenDone_IMetInst != null)
	? (initWithCharactersNoCopy_length_freeWhenDone_IMetInst)
	: (initWithCharactersNoCopy_length_freeWhenDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCharactersNoCopy:length:freeWhenDone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCharactersNoCopy_length_freeWhenDone(final com.apple.jobjc.Pointer<java.lang.Short> characters, final long length, final boolean freeBuffer){
			final com.apple.jobjc.Invoke.MsgSend initWithCharactersNoCopy_length_freeWhenDone_IMetInst = get_initWithCharactersNoCopy_length_freeWhenDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCharactersNoCopy_length_freeWhenDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, characters);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, freeBuffer);
		initWithCharactersNoCopy_length_freeWhenDone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_IMetInst(){
		return ((initWithContentsOfFile_IMetInst != null)
	? (initWithContentsOfFile_IMetInst)
	: (initWithContentsOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst = get_initWithContentsOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithContentsOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_encoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_encoding_error_IMetInst(){
		return ((initWithContentsOfFile_encoding_error_IMetInst != null)
	? (initWithContentsOfFile_encoding_error_IMetInst)
	: (initWithContentsOfFile_encoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:encoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile_encoding_error(final com.apple.jobjc.foundation.NSString path, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_encoding_error_IMetInst = get_initWithContentsOfFile_encoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_encoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithContentsOfFile_encoding_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_usedEncoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_usedEncoding_error_IMetInst(){
		return ((initWithContentsOfFile_usedEncoding_error_IMetInst != null)
	? (initWithContentsOfFile_usedEncoding_error_IMetInst)
	: (initWithContentsOfFile_usedEncoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:usedEncoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile_usedEncoding_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<java.lang.Long> enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_usedEncoding_error_IMetInst = get_initWithContentsOfFile_usedEncoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_usedEncoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithContentsOfFile_usedEncoding_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_encoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_encoding_error_IMetInst(){
		return ((initWithContentsOfURL_encoding_error_IMetInst != null)
	? (initWithContentsOfURL_encoding_error_IMetInst)
	: (initWithContentsOfURL_encoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:encoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_encoding_error(final com.apple.jobjc.foundation.NSURL url, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_encoding_error_IMetInst = get_initWithContentsOfURL_encoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_encoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithContentsOfURL_encoding_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_usedEncoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_usedEncoding_error_IMetInst(){
		return ((initWithContentsOfURL_usedEncoding_error_IMetInst != null)
	? (initWithContentsOfURL_usedEncoding_error_IMetInst)
	: (initWithContentsOfURL_usedEncoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:usedEncoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_usedEncoding_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<java.lang.Long> enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_usedEncoding_error_IMetInst = get_initWithContentsOfURL_usedEncoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_usedEncoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithContentsOfURL_usedEncoding_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_encoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_encoding_IMetInst(){
		return ((initWithData_encoding_IMetInst != null)
	? (initWithData_encoding_IMetInst)
	: (initWithData_encoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:encoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData_encoding(final com.apple.jobjc.foundation.NSData data, final long encoding){
			final com.apple.jobjc.Invoke.MsgSend initWithData_encoding_IMetInst = get_initWithData_encoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_encoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		initWithData_encoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithFormat(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend initWithFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		initWithFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFormat_arguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFormat_arguments_IMetInst(){
		return ((initWithFormat_arguments_IMetInst != null)
	? (initWithFormat_arguments_IMetInst)
	: (initWithFormat_arguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFormat:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFormat_arguments(final com.apple.jobjc.foundation.NSString format, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ argList){
			final com.apple.jobjc.Invoke.MsgSend initWithFormat_arguments_IMetInst = get_initWithFormat_arguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFormat_arguments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, argList);
		initWithFormat_arguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithFormat_locale(final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.ID locale, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[2 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 2; i < (2 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 2]);
final com.apple.jobjc.Invoke.MsgSend initWithFormat_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFormat:locale:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFormat_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		for(int i = 2; i < (2 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 2]);
		initWithFormat_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFormat_locale_arguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFormat_locale_arguments_IMetInst(){
		return ((initWithFormat_locale_arguments_IMetInst != null)
	? (initWithFormat_locale_arguments_IMetInst)
	: (initWithFormat_locale_arguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFormat:locale:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFormat_locale_arguments(final com.apple.jobjc.foundation.NSString format, final com.apple.jobjc.ID locale, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ argList){
			final com.apple.jobjc.Invoke.MsgSend initWithFormat_locale_arguments_IMetInst = get_initWithFormat_locale_arguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFormat_locale_arguments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, argList);
		initWithFormat_locale_arguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUTF8String_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUTF8String_IMetInst(){
		return ((initWithUTF8String_IMetInst != null)
	? (initWithUTF8String_IMetInst)
	: (initWithUTF8String_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUTF8String:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUTF8String(final com.apple.jobjc.Pointer<java.lang.Byte> nullTerminatedCString){
			final com.apple.jobjc.Invoke.MsgSend initWithUTF8String_IMetInst = get_initWithUTF8String_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUTF8String_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, nullTerminatedCString);
		initWithUTF8String_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isAbsolutePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAbsolutePath_IMetInst(){
		return ((isAbsolutePath_IMetInst != null)
	? (isAbsolutePath_IMetInst)
	: (isAbsolutePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAbsolutePath", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAbsolutePath(){
			final com.apple.jobjc.Invoke.MsgSend isAbsolutePath_IMetInst = get_isAbsolutePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAbsolutePath_IMetInst.init(nativeBuffer, this);
		isAbsolutePath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToString_IMetInst(){
		return ((isEqualToString_IMetInst != null)
	? (isEqualToString_IMetInst)
	: (isEqualToString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend isEqualToString_IMetInst = get_isEqualToString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		isEqualToString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastPathComponent_IMetInst(){
		return ((lastPathComponent_IMetInst != null)
	? (lastPathComponent_IMetInst)
	: (lastPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastPathComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString lastPathComponent(){
			final com.apple.jobjc.Invoke.MsgSend lastPathComponent_IMetInst = get_lastPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastPathComponent_IMetInst.init(nativeBuffer, this);
		lastPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_length_IMetInst(){
		return ((length_IMetInst != null)
	? (length_IMetInst)
	: (length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "length", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long length(){
			final com.apple.jobjc.Invoke.MsgSend length_IMetInst = get_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		length_IMetInst.init(nativeBuffer, this);
		length_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lengthOfBytesUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lengthOfBytesUsingEncoding_IMetInst(){
		return ((lengthOfBytesUsingEncoding_IMetInst != null)
	? (lengthOfBytesUsingEncoding_IMetInst)
	: (lengthOfBytesUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lengthOfBytesUsingEncoding:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lengthOfBytesUsingEncoding(final long enc){
			final com.apple.jobjc.Invoke.MsgSend lengthOfBytesUsingEncoding_IMetInst = get_lengthOfBytesUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lengthOfBytesUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		lengthOfBytesUsingEncoding_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineRangeForRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineRangeForRange_IMetInst(){
		return ((lineRangeForRange_IMetInst != null)
	? (lineRangeForRange_IMetInst)
	: (lineRangeForRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineRangeForRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange lineRangeForRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend lineRangeForRange_IMetInst = get_lineRangeForRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineRangeForRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		lineRangeForRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst(){
		return ((linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst != null)
	? (linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst)
	: (linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linguisticTagsInRange:scheme:options:orthography:tokenRanges:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray linguisticTagsInRange_scheme_options_orthography_tokenRanges(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString tagScheme, final long opts, final com.apple.jobjc.foundation.NSOrthography orthography, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> tokenRanges){
			final com.apple.jobjc.Invoke.MsgSend linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst = get_linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, tokenRanges);
		linguisticTagsInRange_scheme_options_orthography_tokenRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedCaseInsensitiveCompare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedCaseInsensitiveCompare_IMetInst(){
		return ((localizedCaseInsensitiveCompare_IMetInst != null)
	? (localizedCaseInsensitiveCompare_IMetInst)
	: (localizedCaseInsensitiveCompare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedCaseInsensitiveCompare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long localizedCaseInsensitiveCompare(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend localizedCaseInsensitiveCompare_IMetInst = get_localizedCaseInsensitiveCompare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedCaseInsensitiveCompare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		localizedCaseInsensitiveCompare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedCompare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedCompare_IMetInst(){
		return ((localizedCompare_IMetInst != null)
	? (localizedCompare_IMetInst)
	: (localizedCompare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedCompare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long localizedCompare(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend localizedCompare_IMetInst = get_localizedCompare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedCompare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		localizedCompare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedStandardCompare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedStandardCompare_IMetInst(){
		return ((localizedStandardCompare_IMetInst != null)
	? (localizedStandardCompare_IMetInst)
	: (localizedStandardCompare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStandardCompare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long localizedStandardCompare(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend localizedStandardCompare_IMetInst = get_localizedStandardCompare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStandardCompare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		localizedStandardCompare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend lossyCString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lossyCString_IMetInst(){
		return ((lossyCString_IMetInst != null)
	? (lossyCString_IMetInst)
	: (lossyCString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lossyCString", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> lossyCString(){
			final com.apple.jobjc.Invoke.MsgSend lossyCString_IMetInst = get_lossyCString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lossyCString_IMetInst.init(nativeBuffer, this);
		lossyCString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lowercaseString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lowercaseString_IMetInst(){
		return ((lowercaseString_IMetInst != null)
	? (lowercaseString_IMetInst)
	: (lowercaseString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lowercaseString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString lowercaseString(){
			final com.apple.jobjc.Invoke.MsgSend lowercaseString_IMetInst = get_lowercaseString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lowercaseString_IMetInst.init(nativeBuffer, this);
		lowercaseString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lowercaseStringWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lowercaseStringWithLocale_IMetInst(){
		return ((lowercaseStringWithLocale_IMetInst != null)
	? (lowercaseStringWithLocale_IMetInst)
	: (lowercaseStringWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lowercaseStringWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString lowercaseStringWithLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend lowercaseStringWithLocale_IMetInst = get_lowercaseStringWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lowercaseStringWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		lowercaseStringWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumLengthOfBytesUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumLengthOfBytesUsingEncoding_IMetInst(){
		return ((maximumLengthOfBytesUsingEncoding_IMetInst != null)
	? (maximumLengthOfBytesUsingEncoding_IMetInst)
	: (maximumLengthOfBytesUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumLengthOfBytesUsingEncoding:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maximumLengthOfBytesUsingEncoding(final long enc){
			final com.apple.jobjc.Invoke.MsgSend maximumLengthOfBytesUsingEncoding_IMetInst = get_maximumLengthOfBytesUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumLengthOfBytesUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		maximumLengthOfBytesUsingEncoding_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphRangeForRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphRangeForRange_IMetInst(){
		return ((paragraphRangeForRange_IMetInst != null)
	? (paragraphRangeForRange_IMetInst)
	: (paragraphRangeForRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphRangeForRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange paragraphRangeForRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend paragraphRangeForRange_IMetInst = get_paragraphRangeForRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphRangeForRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		paragraphRangeForRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathComponents_IMetInst(){
		return ((pathComponents_IMetInst != null)
	? (pathComponents_IMetInst)
	: (pathComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathComponents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathComponents(){
			final com.apple.jobjc.Invoke.MsgSend pathComponents_IMetInst = get_pathComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathComponents_IMetInst.init(nativeBuffer, this);
		pathComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathExtension_IMetInst(){
		return ((pathExtension_IMetInst != null)
	? (pathExtension_IMetInst)
	: (pathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathExtension", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathExtension(){
			final com.apple.jobjc.Invoke.MsgSend pathExtension_IMetInst = get_pathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathExtension_IMetInst.init(nativeBuffer, this);
		pathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend precomposedStringWithCanonicalMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_precomposedStringWithCanonicalMapping_IMetInst(){
		return ((precomposedStringWithCanonicalMapping_IMetInst != null)
	? (precomposedStringWithCanonicalMapping_IMetInst)
	: (precomposedStringWithCanonicalMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "precomposedStringWithCanonicalMapping", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString precomposedStringWithCanonicalMapping(){
			final com.apple.jobjc.Invoke.MsgSend precomposedStringWithCanonicalMapping_IMetInst = get_precomposedStringWithCanonicalMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		precomposedStringWithCanonicalMapping_IMetInst.init(nativeBuffer, this);
		precomposedStringWithCanonicalMapping_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend precomposedStringWithCompatibilityMapping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_precomposedStringWithCompatibilityMapping_IMetInst(){
		return ((precomposedStringWithCompatibilityMapping_IMetInst != null)
	? (precomposedStringWithCompatibilityMapping_IMetInst)
	: (precomposedStringWithCompatibilityMapping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "precomposedStringWithCompatibilityMapping", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString precomposedStringWithCompatibilityMapping(){
			final com.apple.jobjc.Invoke.MsgSend precomposedStringWithCompatibilityMapping_IMetInst = get_precomposedStringWithCompatibilityMapping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		precomposedStringWithCompatibilityMapping_IMetInst.init(nativeBuffer, this);
		precomposedStringWithCompatibilityMapping_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyList_IMetInst(){
		return ((propertyList_IMetInst != null)
	? (propertyList_IMetInst)
	: (propertyList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyList", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyList(){
			final com.apple.jobjc.Invoke.MsgSend propertyList_IMetInst = get_propertyList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyList_IMetInst.init(nativeBuffer, this);
		propertyList_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListFromStringsFileFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListFromStringsFileFormat_IMetInst(){
		return ((propertyListFromStringsFileFormat_IMetInst != null)
	? (propertyListFromStringsFileFormat_IMetInst)
	: (propertyListFromStringsFileFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListFromStringsFileFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary propertyListFromStringsFileFormat(){
			final com.apple.jobjc.Invoke.MsgSend propertyListFromStringsFileFormat_IMetInst = get_propertyListFromStringsFileFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListFromStringsFileFormat_IMetInst.init(nativeBuffer, this);
		propertyListFromStringsFileFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfCharacterFromSet_IMetInst(){
		return ((rangeOfCharacterFromSet_IMetInst != null)
	? (rangeOfCharacterFromSet_IMetInst)
	: (rangeOfCharacterFromSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfCharacterFromSet:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfCharacterFromSet(final com.apple.jobjc.foundation.NSCharacterSet aSet){
			final com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_IMetInst = get_rangeOfCharacterFromSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfCharacterFromSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSet);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfCharacterFromSet_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfCharacterFromSet_options_IMetInst(){
		return ((rangeOfCharacterFromSet_options_IMetInst != null)
	? (rangeOfCharacterFromSet_options_IMetInst)
	: (rangeOfCharacterFromSet_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfCharacterFromSet:options:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfCharacterFromSet_options(final com.apple.jobjc.foundation.NSCharacterSet aSet, final long mask){
			final com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_options_IMetInst = get_rangeOfCharacterFromSet_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfCharacterFromSet_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSet);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfCharacterFromSet_options_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfCharacterFromSet_options_range_IMetInst(){
		return ((rangeOfCharacterFromSet_options_range_IMetInst != null)
	? (rangeOfCharacterFromSet_options_range_IMetInst)
	: (rangeOfCharacterFromSet_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfCharacterFromSet:options:range:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfCharacterFromSet_options_range(final com.apple.jobjc.foundation.NSCharacterSet aSet, final long mask, final com.apple.jobjc.foundation.NSRange searchRange){
			final com.apple.jobjc.Invoke.MsgSend rangeOfCharacterFromSet_options_range_IMetInst = get_rangeOfCharacterFromSet_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfCharacterFromSet_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSet);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfCharacterFromSet_options_range_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfComposedCharacterSequenceAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfComposedCharacterSequenceAtIndex_IMetInst(){
		return ((rangeOfComposedCharacterSequenceAtIndex_IMetInst != null)
	? (rangeOfComposedCharacterSequenceAtIndex_IMetInst)
	: (rangeOfComposedCharacterSequenceAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfComposedCharacterSequenceAtIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfComposedCharacterSequenceAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend rangeOfComposedCharacterSequenceAtIndex_IMetInst = get_rangeOfComposedCharacterSequenceAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfComposedCharacterSequenceAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfComposedCharacterSequenceAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfComposedCharacterSequencesForRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfComposedCharacterSequencesForRange_IMetInst(){
		return ((rangeOfComposedCharacterSequencesForRange_IMetInst != null)
	? (rangeOfComposedCharacterSequencesForRange_IMetInst)
	: (rangeOfComposedCharacterSequencesForRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfComposedCharacterSequencesForRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfComposedCharacterSequencesForRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend rangeOfComposedCharacterSequencesForRange_IMetInst = get_rangeOfComposedCharacterSequencesForRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfComposedCharacterSequencesForRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfComposedCharacterSequencesForRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfString_IMetInst(){
		return ((rangeOfString_IMetInst != null)
	? (rangeOfString_IMetInst)
	: (rangeOfString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfString:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend rangeOfString_IMetInst = get_rangeOfString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfString_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfString_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfString_options_IMetInst(){
		return ((rangeOfString_options_IMetInst != null)
	? (rangeOfString_options_IMetInst)
	: (rangeOfString_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfString:options:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfString_options(final com.apple.jobjc.foundation.NSString aString, final long mask){
			final com.apple.jobjc.Invoke.MsgSend rangeOfString_options_IMetInst = get_rangeOfString_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfString_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfString_options_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfString_options_range_IMetInst(){
		return ((rangeOfString_options_range_IMetInst != null)
	? (rangeOfString_options_range_IMetInst)
	: (rangeOfString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfString:options:range:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfString_options_range(final com.apple.jobjc.foundation.NSString aString, final long mask, final com.apple.jobjc.foundation.NSRange searchRange){
			final com.apple.jobjc.Invoke.MsgSend rangeOfString_options_range_IMetInst = get_rangeOfString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfString_options_range_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfString_options_range_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfString_options_range_locale_IMetInst(){
		return ((rangeOfString_options_range_locale_IMetInst != null)
	? (rangeOfString_options_range_locale_IMetInst)
	: (rangeOfString_options_range_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfString:options:range:locale:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfString_options_range_locale(final com.apple.jobjc.foundation.NSString aString, final long mask, final com.apple.jobjc.foundation.NSRange searchRange, final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend rangeOfString_options_range_locale_IMetInst = get_rangeOfString_options_range_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfString_options_range_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfString_options_range_locale_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend smallestEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smallestEncoding_IMetInst(){
		return ((smallestEncoding_IMetInst != null)
	? (smallestEncoding_IMetInst)
	: (smallestEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smallestEncoding", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long smallestEncoding(){
			final com.apple.jobjc.Invoke.MsgSend smallestEncoding_IMetInst = get_smallestEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smallestEncoding_IMetInst.init(nativeBuffer, this);
		smallestEncoding_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByAbbreviatingWithTildeInPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByAbbreviatingWithTildeInPath_IMetInst(){
		return ((stringByAbbreviatingWithTildeInPath_IMetInst != null)
	? (stringByAbbreviatingWithTildeInPath_IMetInst)
	: (stringByAbbreviatingWithTildeInPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAbbreviatingWithTildeInPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByAbbreviatingWithTildeInPath(){
			final com.apple.jobjc.Invoke.MsgSend stringByAbbreviatingWithTildeInPath_IMetInst = get_stringByAbbreviatingWithTildeInPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAbbreviatingWithTildeInPath_IMetInst.init(nativeBuffer, this);
		stringByAbbreviatingWithTildeInPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByAddingPercentEscapesUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByAddingPercentEscapesUsingEncoding_IMetInst(){
		return ((stringByAddingPercentEscapesUsingEncoding_IMetInst != null)
	? (stringByAddingPercentEscapesUsingEncoding_IMetInst)
	: (stringByAddingPercentEscapesUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAddingPercentEscapesUsingEncoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString stringByAddingPercentEscapesUsingEncoding(final long enc){
			final com.apple.jobjc.Invoke.MsgSend stringByAddingPercentEscapesUsingEncoding_IMetInst = get_stringByAddingPercentEscapesUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAddingPercentEscapesUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		stringByAddingPercentEscapesUsingEncoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public com.apple.jobjc.foundation.NSString stringByAppendingFormat(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend stringByAppendingFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAppendingFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAppendingFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		stringByAppendingFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByAppendingPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByAppendingPathComponent_IMetInst(){
		return ((stringByAppendingPathComponent_IMetInst != null)
	? (stringByAppendingPathComponent_IMetInst)
	: (stringByAppendingPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAppendingPathComponent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByAppendingPathComponent(final com.apple.jobjc.foundation.NSString str){
			final com.apple.jobjc.Invoke.MsgSend stringByAppendingPathComponent_IMetInst = get_stringByAppendingPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAppendingPathComponent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		stringByAppendingPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByAppendingPathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByAppendingPathExtension_IMetInst(){
		return ((stringByAppendingPathExtension_IMetInst != null)
	? (stringByAppendingPathExtension_IMetInst)
	: (stringByAppendingPathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAppendingPathExtension:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByAppendingPathExtension(final com.apple.jobjc.foundation.NSString str){
			final com.apple.jobjc.Invoke.MsgSend stringByAppendingPathExtension_IMetInst = get_stringByAppendingPathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAppendingPathExtension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		stringByAppendingPathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByAppendingString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByAppendingString_IMetInst(){
		return ((stringByAppendingString_IMetInst != null)
	? (stringByAppendingString_IMetInst)
	: (stringByAppendingString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByAppendingString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByAppendingString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend stringByAppendingString_IMetInst = get_stringByAppendingString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByAppendingString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		stringByAppendingString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByDeletingLastPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByDeletingLastPathComponent_IMetInst(){
		return ((stringByDeletingLastPathComponent_IMetInst != null)
	? (stringByDeletingLastPathComponent_IMetInst)
	: (stringByDeletingLastPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByDeletingLastPathComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByDeletingLastPathComponent(){
			final com.apple.jobjc.Invoke.MsgSend stringByDeletingLastPathComponent_IMetInst = get_stringByDeletingLastPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByDeletingLastPathComponent_IMetInst.init(nativeBuffer, this);
		stringByDeletingLastPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByDeletingPathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByDeletingPathExtension_IMetInst(){
		return ((stringByDeletingPathExtension_IMetInst != null)
	? (stringByDeletingPathExtension_IMetInst)
	: (stringByDeletingPathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByDeletingPathExtension", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByDeletingPathExtension(){
			final com.apple.jobjc.Invoke.MsgSend stringByDeletingPathExtension_IMetInst = get_stringByDeletingPathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByDeletingPathExtension_IMetInst.init(nativeBuffer, this);
		stringByDeletingPathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByExpandingTildeInPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByExpandingTildeInPath_IMetInst(){
		return ((stringByExpandingTildeInPath_IMetInst != null)
	? (stringByExpandingTildeInPath_IMetInst)
	: (stringByExpandingTildeInPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByExpandingTildeInPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByExpandingTildeInPath(){
			final com.apple.jobjc.Invoke.MsgSend stringByExpandingTildeInPath_IMetInst = get_stringByExpandingTildeInPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByExpandingTildeInPath_IMetInst.init(nativeBuffer, this);
		stringByExpandingTildeInPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByFoldingWithOptions_locale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByFoldingWithOptions_locale_IMetInst(){
		return ((stringByFoldingWithOptions_locale_IMetInst != null)
	? (stringByFoldingWithOptions_locale_IMetInst)
	: (stringByFoldingWithOptions_locale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByFoldingWithOptions:locale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByFoldingWithOptions_locale(final long options, final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend stringByFoldingWithOptions_locale_IMetInst = get_stringByFoldingWithOptions_locale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByFoldingWithOptions_locale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		stringByFoldingWithOptions_locale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByPaddingToLength_withString_startingAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByPaddingToLength_withString_startingAtIndex_IMetInst(){
		return ((stringByPaddingToLength_withString_startingAtIndex_IMetInst != null)
	? (stringByPaddingToLength_withString_startingAtIndex_IMetInst)
	: (stringByPaddingToLength_withString_startingAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByPaddingToLength:withString:startingAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString stringByPaddingToLength_withString_startingAtIndex(final long newLength, final com.apple.jobjc.foundation.NSString padString, final long padIndex){
			final com.apple.jobjc.Invoke.MsgSend stringByPaddingToLength_withString_startingAtIndex_IMetInst = get_stringByPaddingToLength_withString_startingAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByPaddingToLength_withString_startingAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newLength);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, padString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, padIndex);
		stringByPaddingToLength_withString_startingAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByReplacingCharactersInRange_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByReplacingCharactersInRange_withString_IMetInst(){
		return ((stringByReplacingCharactersInRange_withString_IMetInst != null)
	? (stringByReplacingCharactersInRange_withString_IMetInst)
	: (stringByReplacingCharactersInRange_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByReplacingCharactersInRange:withString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByReplacingCharactersInRange_withString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString replacement){
			final com.apple.jobjc.Invoke.MsgSend stringByReplacingCharactersInRange_withString_IMetInst = get_stringByReplacingCharactersInRange_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByReplacingCharactersInRange_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacement);
		stringByReplacingCharactersInRange_withString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByReplacingOccurrencesOfString_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByReplacingOccurrencesOfString_withString_IMetInst(){
		return ((stringByReplacingOccurrencesOfString_withString_IMetInst != null)
	? (stringByReplacingOccurrencesOfString_withString_IMetInst)
	: (stringByReplacingOccurrencesOfString_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByReplacingOccurrencesOfString:withString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByReplacingOccurrencesOfString_withString(final com.apple.jobjc.foundation.NSString target, final com.apple.jobjc.foundation.NSString replacement){
			final com.apple.jobjc.Invoke.MsgSend stringByReplacingOccurrencesOfString_withString_IMetInst = get_stringByReplacingOccurrencesOfString_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByReplacingOccurrencesOfString_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacement);
		stringByReplacingOccurrencesOfString_withString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByReplacingOccurrencesOfString_withString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByReplacingOccurrencesOfString_withString_options_range_IMetInst(){
		return ((stringByReplacingOccurrencesOfString_withString_options_range_IMetInst != null)
	? (stringByReplacingOccurrencesOfString_withString_options_range_IMetInst)
	: (stringByReplacingOccurrencesOfString_withString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByReplacingOccurrencesOfString:withString:options:range:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString stringByReplacingOccurrencesOfString_withString_options_range(final com.apple.jobjc.foundation.NSString target, final com.apple.jobjc.foundation.NSString replacement, final long options, final com.apple.jobjc.foundation.NSRange searchRange){
			final com.apple.jobjc.Invoke.MsgSend stringByReplacingOccurrencesOfString_withString_options_range_IMetInst = get_stringByReplacingOccurrencesOfString_withString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByReplacingOccurrencesOfString_withString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacement);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
		stringByReplacingOccurrencesOfString_withString_options_range_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByReplacingPercentEscapesUsingEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByReplacingPercentEscapesUsingEncoding_IMetInst(){
		return ((stringByReplacingPercentEscapesUsingEncoding_IMetInst != null)
	? (stringByReplacingPercentEscapesUsingEncoding_IMetInst)
	: (stringByReplacingPercentEscapesUsingEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByReplacingPercentEscapesUsingEncoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString stringByReplacingPercentEscapesUsingEncoding(final long enc){
			final com.apple.jobjc.Invoke.MsgSend stringByReplacingPercentEscapesUsingEncoding_IMetInst = get_stringByReplacingPercentEscapesUsingEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByReplacingPercentEscapesUsingEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		stringByReplacingPercentEscapesUsingEncoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByResolvingSymlinksInPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByResolvingSymlinksInPath_IMetInst(){
		return ((stringByResolvingSymlinksInPath_IMetInst != null)
	? (stringByResolvingSymlinksInPath_IMetInst)
	: (stringByResolvingSymlinksInPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByResolvingSymlinksInPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByResolvingSymlinksInPath(){
			final com.apple.jobjc.Invoke.MsgSend stringByResolvingSymlinksInPath_IMetInst = get_stringByResolvingSymlinksInPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByResolvingSymlinksInPath_IMetInst.init(nativeBuffer, this);
		stringByResolvingSymlinksInPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByStandardizingPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByStandardizingPath_IMetInst(){
		return ((stringByStandardizingPath_IMetInst != null)
	? (stringByStandardizingPath_IMetInst)
	: (stringByStandardizingPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByStandardizingPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByStandardizingPath(){
			final com.apple.jobjc.Invoke.MsgSend stringByStandardizingPath_IMetInst = get_stringByStandardizingPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByStandardizingPath_IMetInst.init(nativeBuffer, this);
		stringByStandardizingPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByTrimmingCharactersInSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByTrimmingCharactersInSet_IMetInst(){
		return ((stringByTrimmingCharactersInSet_IMetInst != null)
	? (stringByTrimmingCharactersInSet_IMetInst)
	: (stringByTrimmingCharactersInSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByTrimmingCharactersInSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByTrimmingCharactersInSet(final com.apple.jobjc.foundation.NSCharacterSet set){
			final com.apple.jobjc.Invoke.MsgSend stringByTrimmingCharactersInSet_IMetInst = get_stringByTrimmingCharactersInSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByTrimmingCharactersInSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		stringByTrimmingCharactersInSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringsByAppendingPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringsByAppendingPaths_IMetInst(){
		return ((stringsByAppendingPaths_IMetInst != null)
	? (stringsByAppendingPaths_IMetInst)
	: (stringsByAppendingPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringsByAppendingPaths:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray stringsByAppendingPaths(final com.apple.jobjc.foundation.NSArray paths){
			final com.apple.jobjc.Invoke.MsgSend stringsByAppendingPaths_IMetInst = get_stringsByAppendingPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringsByAppendingPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paths);
		stringsByAppendingPaths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substringFromIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substringFromIndex_IMetInst(){
		return ((substringFromIndex_IMetInst != null)
	? (substringFromIndex_IMetInst)
	: (substringFromIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substringFromIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString substringFromIndex(final long from){
			final com.apple.jobjc.Invoke.MsgSend substringFromIndex_IMetInst = get_substringFromIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substringFromIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, from);
		substringFromIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substringToIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substringToIndex_IMetInst(){
		return ((substringToIndex_IMetInst != null)
	? (substringToIndex_IMetInst)
	: (substringToIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substringToIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString substringToIndex(final long to){
			final com.apple.jobjc.Invoke.MsgSend substringToIndex_IMetInst = get_substringToIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substringToIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, to);
		substringToIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substringWithRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substringWithRange_IMetInst(){
		return ((substringWithRange_IMetInst != null)
	? (substringWithRange_IMetInst)
	: (substringWithRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substringWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString substringWithRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend substringWithRange_IMetInst = get_substringWithRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substringWithRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		substringWithRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uppercaseString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uppercaseString_IMetInst(){
		return ((uppercaseString_IMetInst != null)
	? (uppercaseString_IMetInst)
	: (uppercaseString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uppercaseString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString uppercaseString(){
			final com.apple.jobjc.Invoke.MsgSend uppercaseString_IMetInst = get_uppercaseString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uppercaseString_IMetInst.init(nativeBuffer, this);
		uppercaseString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uppercaseStringWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uppercaseStringWithLocale_IMetInst(){
		return ((uppercaseStringWithLocale_IMetInst != null)
	? (uppercaseStringWithLocale_IMetInst)
	: (uppercaseStringWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uppercaseStringWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString uppercaseStringWithLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend uppercaseStringWithLocale_IMetInst = get_uppercaseStringWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uppercaseStringWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		uppercaseStringWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_IMetInst(){
		return ((writeToFile_atomically_IMetInst != null)
	? (writeToFile_atomically_IMetInst)
	: (writeToFile_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToFile_atomically(final com.apple.jobjc.foundation.NSString path, final boolean useAuxiliaryFile){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst = get_writeToFile_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		writeToFile_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_encoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_encoding_error_IMetInst(){
		return ((writeToFile_atomically_encoding_error_IMetInst != null)
	? (writeToFile_atomically_encoding_error_IMetInst)
	: (writeToFile_atomically_encoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:encoding:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToFile_atomically_encoding_error(final com.apple.jobjc.foundation.NSString path, final boolean useAuxiliaryFile, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_encoding_error_IMetInst = get_writeToFile_atomically_encoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_encoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writeToFile_atomically_encoding_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_atomically_IMetInst(){
		return ((writeToURL_atomically_IMetInst != null)
	? (writeToURL_atomically_IMetInst)
	: (writeToURL_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToURL_atomically(final com.apple.jobjc.foundation.NSURL url, final boolean atomically){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst = get_writeToURL_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, atomically);
		writeToURL_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_encoding_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_atomically_encoding_error_IMetInst(){
		return ((writeToURL_atomically_encoding_error_IMetInst != null)
	? (writeToURL_atomically_encoding_error_IMetInst)
	: (writeToURL_atomically_encoding_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:atomically:encoding:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_atomically_encoding_error(final com.apple.jobjc.foundation.NSURL url, final boolean useAuxiliaryFile, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_encoding_error_IMetInst = get_writeToURL_atomically_encoding_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_atomically_encoding_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writeToURL_atomically_encoding_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
