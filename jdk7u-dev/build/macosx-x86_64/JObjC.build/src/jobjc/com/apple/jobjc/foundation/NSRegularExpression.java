package com.apple.jobjc.foundation;

public  class NSRegularExpression extends com.apple.jobjc.foundation.NSObject {
	public NSRegularExpression(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRegularExpression(final NSRegularExpression obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend enumerateMatchesInString_options_range_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateMatchesInString_options_range_usingBlock_IMetInst(){
		return ((enumerateMatchesInString_options_range_usingBlock_IMetInst != null)
	? (enumerateMatchesInString_options_range_usingBlock_IMetInst)
	: (enumerateMatchesInString_options_range_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateMatchesInString:options:range:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateMatchesInString_options_range_usingBlock(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range, final Object /* void(^)(NSTextCheckingResult*,NSMatchingFlags,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateMatchesInString_options_range_usingBlock_IMetInst = get_enumerateMatchesInString_options_range_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateMatchesInString_options_range_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateMatchesInString_options_range_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstMatchInString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstMatchInString_options_range_IMetInst(){
		return ((firstMatchInString_options_range_IMetInst != null)
	? (firstMatchInString_options_range_IMetInst)
	: (firstMatchInString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstMatchInString:options:range:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult firstMatchInString_options_range(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend firstMatchInString_options_range_IMetInst = get_firstMatchInString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstMatchInString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		firstMatchInString_options_range_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPattern_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPattern_options_error_IMetInst(){
		return ((initWithPattern_options_error_IMetInst != null)
	? (initWithPattern_options_error_IMetInst)
	: (initWithPattern_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPattern:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPattern_options_error(final com.apple.jobjc.foundation.NSString pattern, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithPattern_options_error_IMetInst = get_initWithPattern_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPattern_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pattern);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithPattern_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchesInString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchesInString_options_range_IMetInst(){
		return ((matchesInString_options_range_IMetInst != null)
	? (matchesInString_options_range_IMetInst)
	: (matchesInString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchesInString:options:range:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSArray matchesInString_options_range(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend matchesInString_options_range_IMetInst = get_matchesInString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchesInString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		matchesInString_options_range_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfCaptureGroups_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfCaptureGroups_IMetInst(){
		return ((numberOfCaptureGroups_IMetInst != null)
	? (numberOfCaptureGroups_IMetInst)
	: (numberOfCaptureGroups_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfCaptureGroups", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberOfCaptureGroups(){
			final com.apple.jobjc.Invoke.MsgSend numberOfCaptureGroups_IMetInst = get_numberOfCaptureGroups_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfCaptureGroups_IMetInst.init(nativeBuffer, this);
		numberOfCaptureGroups_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfMatchesInString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfMatchesInString_options_range_IMetInst(){
		return ((numberOfMatchesInString_options_range_IMetInst != null)
	? (numberOfMatchesInString_options_range_IMetInst)
	: (numberOfMatchesInString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfMatchesInString:options:range:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long numberOfMatchesInString_options_range(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend numberOfMatchesInString_options_range_IMetInst = get_numberOfMatchesInString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfMatchesInString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		numberOfMatchesInString_options_range_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_options_IMetInst(){
		return ((options_IMetInst != null)
	? (options_IMetInst)
	: (options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "options", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long options(){
			final com.apple.jobjc.Invoke.MsgSend options_IMetInst = get_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		options_IMetInst.init(nativeBuffer, this);
		options_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pattern_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pattern_IMetInst(){
		return ((pattern_IMetInst != null)
	? (pattern_IMetInst)
	: (pattern_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pattern", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pattern(){
			final com.apple.jobjc.Invoke.MsgSend pattern_IMetInst = get_pattern_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pattern_IMetInst.init(nativeBuffer, this);
		pattern_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfFirstMatchInString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfFirstMatchInString_options_range_IMetInst(){
		return ((rangeOfFirstMatchInString_options_range_IMetInst != null)
	? (rangeOfFirstMatchInString_options_range_IMetInst)
	: (rangeOfFirstMatchInString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfFirstMatchInString:options:range:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfFirstMatchInString_options_range(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend rangeOfFirstMatchInString_options_range_IMetInst = get_rangeOfFirstMatchInString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfFirstMatchInString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfFirstMatchInString_options_range_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceMatchesInString_options_range_withTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceMatchesInString_options_range_withTemplate_IMetInst(){
		return ((replaceMatchesInString_options_range_withTemplate_IMetInst != null)
	? (replaceMatchesInString_options_range_withTemplate_IMetInst)
	: (replaceMatchesInString_options_range_withTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceMatchesInString:options:range:withTemplate:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long replaceMatchesInString_options_range_withTemplate(final com.apple.jobjc.foundation.NSMutableString string, final long options, final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString templ){
			final com.apple.jobjc.Invoke.MsgSend replaceMatchesInString_options_range_withTemplate_IMetInst = get_replaceMatchesInString_options_range_withTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceMatchesInString_options_range_withTemplate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, templ);
		replaceMatchesInString_options_range_withTemplate_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementStringForResult_inString_offset_template_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementStringForResult_inString_offset_template_IMetInst(){
		return ((replacementStringForResult_inString_offset_template_IMetInst != null)
	? (replacementStringForResult_inString_offset_template_IMetInst)
	: (replacementStringForResult_inString_offset_template_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementStringForResult:inString:offset:template:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString replacementStringForResult_inString_offset_template(final com.apple.jobjc.foundation.NSTextCheckingResult result, final com.apple.jobjc.foundation.NSString string, final long offset, final com.apple.jobjc.foundation.NSString templ){
			final com.apple.jobjc.Invoke.MsgSend replacementStringForResult_inString_offset_template_IMetInst = get_replacementStringForResult_inString_offset_template_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementStringForResult_inString_offset_template_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, offset);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, templ);
		replacementStringForResult_inString_offset_template_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringByReplacingMatchesInString_options_range_withTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringByReplacingMatchesInString_options_range_withTemplate_IMetInst(){
		return ((stringByReplacingMatchesInString_options_range_withTemplate_IMetInst != null)
	? (stringByReplacingMatchesInString_options_range_withTemplate_IMetInst)
	: (stringByReplacingMatchesInString_options_range_withTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringByReplacingMatchesInString:options:range:withTemplate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringByReplacingMatchesInString_options_range_withTemplate(final com.apple.jobjc.foundation.NSString string, final long options, final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString templ){
			final com.apple.jobjc.Invoke.MsgSend stringByReplacingMatchesInString_options_range_withTemplate_IMetInst = get_stringByReplacingMatchesInString_options_range_withTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringByReplacingMatchesInString_options_range_withTemplate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, templ);
		stringByReplacingMatchesInString_options_range_withTemplate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
