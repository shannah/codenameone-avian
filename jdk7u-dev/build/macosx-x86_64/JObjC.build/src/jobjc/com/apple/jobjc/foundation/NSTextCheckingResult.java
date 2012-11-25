package com.apple.jobjc.foundation;

public  class NSTextCheckingResult extends com.apple.jobjc.foundation.NSObject {
	public NSTextCheckingResult(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextCheckingResult(final NSTextCheckingResult obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addressComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addressComponents_IMetInst(){
		return ((addressComponents_IMetInst != null)
	? (addressComponents_IMetInst)
	: (addressComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addressComponents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary addressComponents(){
			final com.apple.jobjc.Invoke.MsgSend addressComponents_IMetInst = get_addressComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addressComponents_IMetInst.init(nativeBuffer, this);
		addressComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend components_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_components_IMetInst(){
		return ((components_IMetInst != null)
	? (components_IMetInst)
	: (components_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "components", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary components(){
			final com.apple.jobjc.Invoke.MsgSend components_IMetInst = get_components_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		components_IMetInst.init(nativeBuffer, this);
		components_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend date_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_date_IMetInst(){
		return ((date_IMetInst != null)
	? (date_IMetInst)
	: (date_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "date", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate date(){
			final com.apple.jobjc.Invoke.MsgSend date_IMetInst = get_date_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		date_IMetInst.init(nativeBuffer, this);
		date_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duration_IMetInst(){
		return ((duration_IMetInst != null)
	? (duration_IMetInst)
	: (duration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duration", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double duration(){
			final com.apple.jobjc.Invoke.MsgSend duration_IMetInst = get_duration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duration_IMetInst.init(nativeBuffer, this);
		duration_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend grammarDetails_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_grammarDetails_IMetInst(){
		return ((grammarDetails_IMetInst != null)
	? (grammarDetails_IMetInst)
	: (grammarDetails_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "grammarDetails", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray grammarDetails(){
			final com.apple.jobjc.Invoke.MsgSend grammarDetails_IMetInst = get_grammarDetails_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		grammarDetails_IMetInst.init(nativeBuffer, this);
		grammarDetails_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfRanges_IMetInst(){
		return ((numberOfRanges_IMetInst != null)
	? (numberOfRanges_IMetInst)
	: (numberOfRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfRanges", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberOfRanges(){
			final com.apple.jobjc.Invoke.MsgSend numberOfRanges_IMetInst = get_numberOfRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfRanges_IMetInst.init(nativeBuffer, this);
		numberOfRanges_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orthography_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orthography_IMetInst(){
		return ((orthography_IMetInst != null)
	? (orthography_IMetInst)
	: (orthography_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orthography", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSOrthography orthography(){
			final com.apple.jobjc.Invoke.MsgSend orthography_IMetInst = get_orthography_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orthography_IMetInst.init(nativeBuffer, this);
		orthography_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSOrthography returnValue = (com.apple.jobjc.foundation.NSOrthography) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend phoneNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_phoneNumber_IMetInst(){
		return ((phoneNumber_IMetInst != null)
	? (phoneNumber_IMetInst)
	: (phoneNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "phoneNumber", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString phoneNumber(){
			final com.apple.jobjc.Invoke.MsgSend phoneNumber_IMetInst = get_phoneNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		phoneNumber_IMetInst.init(nativeBuffer, this);
		phoneNumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_range_IMetInst(){
		return ((range_IMetInst != null)
	? (range_IMetInst)
	: (range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "range", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange range(){
			final com.apple.jobjc.Invoke.MsgSend range_IMetInst = get_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		range_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		range_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeAtIndex_IMetInst(){
		return ((rangeAtIndex_IMetInst != null)
	? (rangeAtIndex_IMetInst)
	: (rangeAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeAtIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend rangeAtIndex_IMetInst = get_rangeAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend regularExpression_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_regularExpression_IMetInst(){
		return ((regularExpression_IMetInst != null)
	? (regularExpression_IMetInst)
	: (regularExpression_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "regularExpression", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRegularExpression regularExpression(){
			final com.apple.jobjc.Invoke.MsgSend regularExpression_IMetInst = get_regularExpression_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		regularExpression_IMetInst.init(nativeBuffer, this);
		regularExpression_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSRegularExpression returnValue = (com.apple.jobjc.foundation.NSRegularExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementString_IMetInst(){
		return ((replacementString_IMetInst != null)
	? (replacementString_IMetInst)
	: (replacementString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString replacementString(){
			final com.apple.jobjc.Invoke.MsgSend replacementString_IMetInst = get_replacementString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementString_IMetInst.init(nativeBuffer, this);
		replacementString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultByAdjustingRangesWithOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultByAdjustingRangesWithOffset_IMetInst(){
		return ((resultByAdjustingRangesWithOffset_IMetInst != null)
	? (resultByAdjustingRangesWithOffset_IMetInst)
	: (resultByAdjustingRangesWithOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultByAdjustingRangesWithOffset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSTextCheckingResult resultByAdjustingRangesWithOffset(final long offset){
			final com.apple.jobjc.Invoke.MsgSend resultByAdjustingRangesWithOffset_IMetInst = get_resultByAdjustingRangesWithOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultByAdjustingRangesWithOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, offset);
		resultByAdjustingRangesWithOffset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTextCheckingResult returnValue = (com.apple.jobjc.foundation.NSTextCheckingResult) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultType_IMetInst(){
		return ((resultType_IMetInst != null)
	? (resultType_IMetInst)
	: (resultType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultType", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long resultType(){
			final com.apple.jobjc.Invoke.MsgSend resultType_IMetInst = get_resultType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultType_IMetInst.init(nativeBuffer, this);
		resultType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeZone_IMetInst(){
		return ((timeZone_IMetInst != null)
	? (timeZone_IMetInst)
	: (timeZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeZone", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimeZone timeZone(){
			final com.apple.jobjc.Invoke.MsgSend timeZone_IMetInst = get_timeZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeZone_IMetInst.init(nativeBuffer, this);
		timeZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimeZone returnValue = (com.apple.jobjc.foundation.NSTimeZone) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
