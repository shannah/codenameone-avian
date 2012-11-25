package com.apple.jobjc.foundation;

public  class NSLinguisticTagger extends com.apple.jobjc.foundation.NSObject {
	public NSLinguisticTagger(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLinguisticTagger(final NSLinguisticTagger obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend enumerateTagsInRange_scheme_options_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateTagsInRange_scheme_options_usingBlock_IMetInst(){
		return ((enumerateTagsInRange_scheme_options_usingBlock_IMetInst != null)
	? (enumerateTagsInRange_scheme_options_usingBlock_IMetInst)
	: (enumerateTagsInRange_scheme_options_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateTagsInRange:scheme:options:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateTagsInRange_scheme_options_usingBlock(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString tagScheme, final long opts, final Object /* void(^)(NSString*,NSRange,NSRange,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateTagsInRange_scheme_options_usingBlock_IMetInst = get_enumerateTagsInRange_scheme_options_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateTagsInRange_scheme_options_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateTagsInRange_scheme_options_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTagSchemes_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTagSchemes_options_IMetInst(){
		return ((initWithTagSchemes_options_IMetInst != null)
	? (initWithTagSchemes_options_IMetInst)
	: (initWithTagSchemes_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTagSchemes:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTagSchemes_options(final com.apple.jobjc.foundation.NSArray tagSchemes, final long opts){
			final com.apple.jobjc.Invoke.MsgSend initWithTagSchemes_options_IMetInst = get_initWithTagSchemes_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTagSchemes_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagSchemes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		initWithTagSchemes_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orthographyAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orthographyAtIndex_effectiveRange_IMetInst(){
		return ((orthographyAtIndex_effectiveRange_IMetInst != null)
	? (orthographyAtIndex_effectiveRange_IMetInst)
	: (orthographyAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orthographyAtIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSOrthography orthographyAtIndex_effectiveRange(final long charIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveRange){
			final com.apple.jobjc.Invoke.MsgSend orthographyAtIndex_effectiveRange_IMetInst = get_orthographyAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orthographyAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveRange);
		orthographyAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSOrthography returnValue = (com.apple.jobjc.foundation.NSOrthography) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst(){
		return ((possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst != null)
	? (possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst)
	: (possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores(final long charIndex, final com.apple.jobjc.foundation.NSString tagScheme, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ tokenRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ sentenceRange, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> scores){
			final com.apple.jobjc.Invoke.MsgSend possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst = get_possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, tokenRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, sentenceRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, scores);
		possibleTagsAtIndex_scheme_tokenRange_sentenceRange_scores_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sentenceRangeForRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sentenceRangeForRange_IMetInst(){
		return ((sentenceRangeForRange_IMetInst != null)
	? (sentenceRangeForRange_IMetInst)
	: (sentenceRangeForRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sentenceRangeForRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange sentenceRangeForRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend sentenceRangeForRange_IMetInst = get_sentenceRangeForRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sentenceRangeForRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		sentenceRangeForRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setOrthography_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOrthography_range_IMetInst(){
		return ((setOrthography_range_IMetInst != null)
	? (setOrthography_range_IMetInst)
	: (setOrthography_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOrthography:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setOrthography_range(final com.apple.jobjc.foundation.NSOrthography orthography, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setOrthography_range_IMetInst = get_setOrthography_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOrthography_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setOrthography_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setString_IMetInst(){
		return ((setString_IMetInst != null)
	? (setString_IMetInst)
	: (setString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setString_IMetInst = get_setString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend string_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_string_IMetInst(){
		return ((string_IMetInst != null)
	? (string_IMetInst)
	: (string_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "string", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString string(){
			final com.apple.jobjc.Invoke.MsgSend string_IMetInst = get_string_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		string_IMetInst.init(nativeBuffer, this);
		string_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringEditedInRange_changeInLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringEditedInRange_changeInLength_IMetInst(){
		return ((stringEditedInRange_changeInLength_IMetInst != null)
	? (stringEditedInRange_changeInLength_IMetInst)
	: (stringEditedInRange_changeInLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringEditedInRange:changeInLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void stringEditedInRange_changeInLength(final com.apple.jobjc.foundation.NSRange newRange, final long delta){
			final com.apple.jobjc.Invoke.MsgSend stringEditedInRange_changeInLength_IMetInst = get_stringEditedInRange_changeInLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringEditedInRange_changeInLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, newRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, delta);
		stringEditedInRange_changeInLength_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst(){
		return ((tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst != null)
	? (tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst)
	: (tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tagAtIndex:scheme:tokenRange:sentenceRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString tagAtIndex_scheme_tokenRange_sentenceRange(final long charIndex, final com.apple.jobjc.foundation.NSString tagScheme, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ tokenRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ sentenceRange){
			final com.apple.jobjc.Invoke.MsgSend tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst = get_tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, tokenRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, sentenceRange);
		tagAtIndex_scheme_tokenRange_sentenceRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tagSchemes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tagSchemes_IMetInst(){
		return ((tagSchemes_IMetInst != null)
	? (tagSchemes_IMetInst)
	: (tagSchemes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tagSchemes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tagSchemes(){
			final com.apple.jobjc.Invoke.MsgSend tagSchemes_IMetInst = get_tagSchemes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tagSchemes_IMetInst.init(nativeBuffer, this);
		tagSchemes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tagsInRange_scheme_options_tokenRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tagsInRange_scheme_options_tokenRanges_IMetInst(){
		return ((tagsInRange_scheme_options_tokenRanges_IMetInst != null)
	? (tagsInRange_scheme_options_tokenRanges_IMetInst)
	: (tagsInRange_scheme_options_tokenRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tagsInRange:scheme:options:tokenRanges:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tagsInRange_scheme_options_tokenRanges(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString tagScheme, final long opts, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> tokenRanges){
			final com.apple.jobjc.Invoke.MsgSend tagsInRange_scheme_options_tokenRanges_IMetInst = get_tagsInRange_scheme_options_tokenRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tagsInRange_scheme_options_tokenRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tagScheme);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, tokenRanges);
		tagsInRange_scheme_options_tokenRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
