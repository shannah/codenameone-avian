package com.apple.jobjc.foundation;

public  class NSTextCheckingResultClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTextCheckingResultClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTextCheckingResultClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTextCheckingResultClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addressCheckingResultWithRange_components_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addressCheckingResultWithRange_components_CMetInst(){
		return ((addressCheckingResultWithRange_components_CMetInst != null)
	? (addressCheckingResultWithRange_components_CMetInst)
	: (addressCheckingResultWithRange_components_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addressCheckingResultWithRange:components:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult addressCheckingResultWithRange_components(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary components){
			final com.apple.jobjc.Invoke.MsgSend addressCheckingResultWithRange_components_CMetInst = get_addressCheckingResultWithRange_components_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addressCheckingResultWithRange_components_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		addressCheckingResultWithRange_components_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend correctionCheckingResultWithRange_replacementString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_correctionCheckingResultWithRange_replacementString_CMetInst(){
		return ((correctionCheckingResultWithRange_replacementString_CMetInst != null)
	? (correctionCheckingResultWithRange_replacementString_CMetInst)
	: (correctionCheckingResultWithRange_replacementString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "correctionCheckingResultWithRange:replacementString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult correctionCheckingResultWithRange_replacementString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend correctionCheckingResultWithRange_replacementString_CMetInst = get_correctionCheckingResultWithRange_replacementString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		correctionCheckingResultWithRange_replacementString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		correctionCheckingResultWithRange_replacementString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dashCheckingResultWithRange_replacementString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dashCheckingResultWithRange_replacementString_CMetInst(){
		return ((dashCheckingResultWithRange_replacementString_CMetInst != null)
	? (dashCheckingResultWithRange_replacementString_CMetInst)
	: (dashCheckingResultWithRange_replacementString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dashCheckingResultWithRange:replacementString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult dashCheckingResultWithRange_replacementString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend dashCheckingResultWithRange_replacementString_CMetInst = get_dashCheckingResultWithRange_replacementString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dashCheckingResultWithRange_replacementString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		dashCheckingResultWithRange_replacementString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateCheckingResultWithRange_date_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateCheckingResultWithRange_date_CMetInst(){
		return ((dateCheckingResultWithRange_date_CMetInst != null)
	? (dateCheckingResultWithRange_date_CMetInst)
	: (dateCheckingResultWithRange_date_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateCheckingResultWithRange:date:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult dateCheckingResultWithRange_date(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend dateCheckingResultWithRange_date_CMetInst = get_dateCheckingResultWithRange_date_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateCheckingResultWithRange_date_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		dateCheckingResultWithRange_date_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dateCheckingResultWithRange_date_timeZone_duration_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dateCheckingResultWithRange_date_timeZone_duration_CMetInst(){
		return ((dateCheckingResultWithRange_date_timeZone_duration_CMetInst != null)
	? (dateCheckingResultWithRange_date_timeZone_duration_CMetInst)
	: (dateCheckingResultWithRange_date_timeZone_duration_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dateCheckingResultWithRange:date:timeZone:duration:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult dateCheckingResultWithRange_date_timeZone_duration(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDate date, final com.apple.jobjc.foundation.NSTimeZone timeZone, final double duration){
			final com.apple.jobjc.Invoke.MsgSend dateCheckingResultWithRange_date_timeZone_duration_CMetInst = get_dateCheckingResultWithRange_date_timeZone_duration_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dateCheckingResultWithRange_date_timeZone_duration_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, timeZone);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, duration);
		dateCheckingResultWithRange_date_timeZone_duration_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend grammarCheckingResultWithRange_details_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_grammarCheckingResultWithRange_details_CMetInst(){
		return ((grammarCheckingResultWithRange_details_CMetInst != null)
	? (grammarCheckingResultWithRange_details_CMetInst)
	: (grammarCheckingResultWithRange_details_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "grammarCheckingResultWithRange:details:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult grammarCheckingResultWithRange_details(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSArray details){
			final com.apple.jobjc.Invoke.MsgSend grammarCheckingResultWithRange_details_CMetInst = get_grammarCheckingResultWithRange_details_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		grammarCheckingResultWithRange_details_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, details);
		grammarCheckingResultWithRange_details_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend linkCheckingResultWithRange_URL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linkCheckingResultWithRange_URL_CMetInst(){
		return ((linkCheckingResultWithRange_URL_CMetInst != null)
	? (linkCheckingResultWithRange_URL_CMetInst)
	: (linkCheckingResultWithRange_URL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linkCheckingResultWithRange:URL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult linkCheckingResultWithRange_URL(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend linkCheckingResultWithRange_URL_CMetInst = get_linkCheckingResultWithRange_URL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linkCheckingResultWithRange_URL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		linkCheckingResultWithRange_URL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orthographyCheckingResultWithRange_orthography_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orthographyCheckingResultWithRange_orthography_CMetInst(){
		return ((orthographyCheckingResultWithRange_orthography_CMetInst != null)
	? (orthographyCheckingResultWithRange_orthography_CMetInst)
	: (orthographyCheckingResultWithRange_orthography_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orthographyCheckingResultWithRange:orthography:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult orthographyCheckingResultWithRange_orthography(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSOrthography orthography){
			final com.apple.jobjc.Invoke.MsgSend orthographyCheckingResultWithRange_orthography_CMetInst = get_orthographyCheckingResultWithRange_orthography_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orthographyCheckingResultWithRange_orthography_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		orthographyCheckingResultWithRange_orthography_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend phoneNumberCheckingResultWithRange_phoneNumber_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_phoneNumberCheckingResultWithRange_phoneNumber_CMetInst(){
		return ((phoneNumberCheckingResultWithRange_phoneNumber_CMetInst != null)
	? (phoneNumberCheckingResultWithRange_phoneNumber_CMetInst)
	: (phoneNumberCheckingResultWithRange_phoneNumber_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "phoneNumberCheckingResultWithRange:phoneNumber:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult phoneNumberCheckingResultWithRange_phoneNumber(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString phoneNumber){
			final com.apple.jobjc.Invoke.MsgSend phoneNumberCheckingResultWithRange_phoneNumber_CMetInst = get_phoneNumberCheckingResultWithRange_phoneNumber_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		phoneNumberCheckingResultWithRange_phoneNumber_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, phoneNumber);
		phoneNumberCheckingResultWithRange_phoneNumber_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend quoteCheckingResultWithRange_replacementString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quoteCheckingResultWithRange_replacementString_CMetInst(){
		return ((quoteCheckingResultWithRange_replacementString_CMetInst != null)
	? (quoteCheckingResultWithRange_replacementString_CMetInst)
	: (quoteCheckingResultWithRange_replacementString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quoteCheckingResultWithRange:replacementString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult quoteCheckingResultWithRange_replacementString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend quoteCheckingResultWithRange_replacementString_CMetInst = get_quoteCheckingResultWithRange_replacementString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quoteCheckingResultWithRange_replacementString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		quoteCheckingResultWithRange_replacementString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst(){
		return ((regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst != null)
	? (regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst)
	: (regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "regularExpressionCheckingResultWithRanges:count:regularExpression:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult regularExpressionCheckingResultWithRanges_count_regularExpression(final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ ranges, final long count, final com.apple.jobjc.foundation.NSRegularExpression regularExpression){
			final com.apple.jobjc.Invoke.MsgSend regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst = get_regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, ranges);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, regularExpression);
		regularExpressionCheckingResultWithRanges_count_regularExpression_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementCheckingResultWithRange_replacementString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementCheckingResultWithRange_replacementString_CMetInst(){
		return ((replacementCheckingResultWithRange_replacementString_CMetInst != null)
	? (replacementCheckingResultWithRange_replacementString_CMetInst)
	: (replacementCheckingResultWithRange_replacementString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementCheckingResultWithRange:replacementString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult replacementCheckingResultWithRange_replacementString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend replacementCheckingResultWithRange_replacementString_CMetInst = get_replacementCheckingResultWithRange_replacementString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementCheckingResultWithRange_replacementString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		replacementCheckingResultWithRange_replacementString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend spellCheckingResultWithRange_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellCheckingResultWithRange_CMetInst(){
		return ((spellCheckingResultWithRange_CMetInst != null)
	? (spellCheckingResultWithRange_CMetInst)
	: (spellCheckingResultWithRange_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellCheckingResultWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult spellCheckingResultWithRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend spellCheckingResultWithRange_CMetInst = get_spellCheckingResultWithRange_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellCheckingResultWithRange_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		spellCheckingResultWithRange_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend transitInformationCheckingResultWithRange_components_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transitInformationCheckingResultWithRange_components_CMetInst(){
		return ((transitInformationCheckingResultWithRange_components_CMetInst != null)
	? (transitInformationCheckingResultWithRange_components_CMetInst)
	: (transitInformationCheckingResultWithRange_components_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transitInformationCheckingResultWithRange:components:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult transitInformationCheckingResultWithRange_components(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSDictionary components){
			final com.apple.jobjc.Invoke.MsgSend transitInformationCheckingResultWithRange_components_CMetInst = get_transitInformationCheckingResultWithRange_components_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transitInformationCheckingResultWithRange_components_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		transitInformationCheckingResultWithRange_components_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
