package com.apple.jobjc.appkit;

public  class NSSpellChecker extends com.apple.jobjc.foundation.NSObject {
	public NSSpellChecker(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSpellChecker(final NSSpellChecker obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryView_IMetInst(){
		return ((accessoryView_IMetInst != null)
	? (accessoryView_IMetInst)
	: (accessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView accessoryView(){
			final com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst = get_accessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryView_IMetInst.init(nativeBuffer, this);
		accessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend automaticallyIdentifiesLanguages_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticallyIdentifiesLanguages_IMetInst(){
		return ((automaticallyIdentifiesLanguages_IMetInst != null)
	? (automaticallyIdentifiesLanguages_IMetInst)
	: (automaticallyIdentifiesLanguages_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticallyIdentifiesLanguages", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean automaticallyIdentifiesLanguages(){
			final com.apple.jobjc.Invoke.MsgSend automaticallyIdentifiesLanguages_IMetInst = get_automaticallyIdentifiesLanguages_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticallyIdentifiesLanguages_IMetInst.init(nativeBuffer, this);
		automaticallyIdentifiesLanguages_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableLanguages_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableLanguages_IMetInst(){
		return ((availableLanguages_IMetInst != null)
	? (availableLanguages_IMetInst)
	: (availableLanguages_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableLanguages", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableLanguages(){
			final com.apple.jobjc.Invoke.MsgSend availableLanguages_IMetInst = get_availableLanguages_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableLanguages_IMetInst.init(nativeBuffer, this);
		availableLanguages_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst(){
		return ((checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst != null)
	? (checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst)
	: (checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkGrammarOfString:startingAt:language:wrap:inSpellDocumentWithTag:details:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details(final com.apple.jobjc.foundation.NSString stringToCheck, final long startingOffset, final com.apple.jobjc.foundation.NSString language, final boolean wrapFlag, final long tag, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> details){
			final com.apple.jobjc.Invoke.MsgSend checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst = get_checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startingOffset);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wrapFlag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, details);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		checkGrammarOfString_startingAt_language_wrap_inSpellDocumentWithTag_details_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkSpellingOfString_startingAt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkSpellingOfString_startingAt_IMetInst(){
		return ((checkSpellingOfString_startingAt_IMetInst != null)
	? (checkSpellingOfString_startingAt_IMetInst)
	: (checkSpellingOfString_startingAt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkSpellingOfString:startingAt:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange checkSpellingOfString_startingAt(final com.apple.jobjc.foundation.NSString stringToCheck, final long startingOffset){
			final com.apple.jobjc.Invoke.MsgSend checkSpellingOfString_startingAt_IMetInst = get_checkSpellingOfString_startingAt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkSpellingOfString_startingAt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startingOffset);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		checkSpellingOfString_startingAt_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst(){
		return ((checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst != null)
	? (checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst)
	: (checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkSpellingOfString:startingAt:language:wrap:inSpellDocumentWithTag:wordCount:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount(final com.apple.jobjc.foundation.NSString stringToCheck, final long startingOffset, final com.apple.jobjc.foundation.NSString language, final boolean wrapFlag, final long tag, final com.apple.jobjc.Pointer<java.lang.Long> wordCount){
			final com.apple.jobjc.Invoke.MsgSend checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst = get_checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startingOffset);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wrapFlag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, wordCount);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		checkSpellingOfString_startingAt_language_wrap_inSpellDocumentWithTag_wordCount_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst(){
		return ((checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst != null)
	? (checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst)
	: (checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkString:range:types:options:inSpellDocumentWithTag:orthography:wordCount:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount(final com.apple.jobjc.foundation.NSString stringToCheck, final com.apple.jobjc.foundation.NSRange range, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options, final long tag, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSOrthography> orthography, final com.apple.jobjc.Pointer<java.lang.Long> wordCount){
			final com.apple.jobjc.Invoke.MsgSend checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst = get_checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, wordCount);
		checkString_range_types_options_inSpellDocumentWithTag_orthography_wordCount_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend closeSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closeSpellDocumentWithTag_IMetInst(){
		return ((closeSpellDocumentWithTag_IMetInst != null)
	? (closeSpellDocumentWithTag_IMetInst)
	: (closeSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closeSpellDocumentWithTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void closeSpellDocumentWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend closeSpellDocumentWithTag_IMetInst = get_closeSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closeSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		closeSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst(){
		return ((completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst != null)
	? (completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst)
	: (completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completionsForPartialWordRange:inString:language:inSpellDocumentWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray completionsForPartialWordRange_inString_language_inSpellDocumentWithTag(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString language, final long tag){
			final com.apple.jobjc.Invoke.MsgSend completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst = get_completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		completionsForPartialWordRange_inString_language_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst(){
		return ((correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst != null)
	? (correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst)
	: (correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "correctionForWordRange:inString:language:inSpellDocumentWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString correctionForWordRange_inString_language_inSpellDocumentWithTag(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString language, final long tag){
			final com.apple.jobjc.Invoke.MsgSend correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst = get_correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		correctionForWordRange_inString_language_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countWordsInString_language_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countWordsInString_language_IMetInst(){
		return ((countWordsInString_language_IMetInst != null)
	? (countWordsInString_language_IMetInst)
	: (countWordsInString_language_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countWordsInString:language:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long countWordsInString_language(final com.apple.jobjc.foundation.NSString stringToCount, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend countWordsInString_language_IMetInst = get_countWordsInString_language_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countWordsInString_language_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCount);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		countWordsInString_language_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dismissCorrectionIndicatorForView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dismissCorrectionIndicatorForView_IMetInst(){
		return ((dismissCorrectionIndicatorForView_IMetInst != null)
	? (dismissCorrectionIndicatorForView_IMetInst)
	: (dismissCorrectionIndicatorForView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dismissCorrectionIndicatorForView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void dismissCorrectionIndicatorForView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend dismissCorrectionIndicatorForView_IMetInst = get_dismissCorrectionIndicatorForView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dismissCorrectionIndicatorForView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		dismissCorrectionIndicatorForView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend forgetWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_forgetWord_IMetInst(){
		return ((forgetWord_IMetInst != null)
	? (forgetWord_IMetInst)
	: (forgetWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "forgetWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void forgetWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend forgetWord_IMetInst = get_forgetWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		forgetWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		forgetWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend guessesForWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_guessesForWord_IMetInst(){
		return ((guessesForWord_IMetInst != null)
	? (guessesForWord_IMetInst)
	: (guessesForWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "guessesForWord:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray guessesForWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend guessesForWord_IMetInst = get_guessesForWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		guessesForWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		guessesForWord_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst(){
		return ((guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst != null)
	? (guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst)
	: (guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "guessesForWordRange:inString:language:inSpellDocumentWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray guessesForWordRange_inString_language_inSpellDocumentWithTag(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString language, final long tag){
			final com.apple.jobjc.Invoke.MsgSend guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst = get_guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		guessesForWordRange_inString_language_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasLearnedWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasLearnedWord_IMetInst(){
		return ((hasLearnedWord_IMetInst != null)
	? (hasLearnedWord_IMetInst)
	: (hasLearnedWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasLearnedWord:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasLearnedWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend hasLearnedWord_IMetInst = get_hasLearnedWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasLearnedWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		hasLearnedWord_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoreWord_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoreWord_inSpellDocumentWithTag_IMetInst(){
		return ((ignoreWord_inSpellDocumentWithTag_IMetInst != null)
	? (ignoreWord_inSpellDocumentWithTag_IMetInst)
	: (ignoreWord_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoreWord:inSpellDocumentWithTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void ignoreWord_inSpellDocumentWithTag(final com.apple.jobjc.foundation.NSString wordToIgnore, final long tag){
			final com.apple.jobjc.Invoke.MsgSend ignoreWord_inSpellDocumentWithTag_IMetInst = get_ignoreWord_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoreWord_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, wordToIgnore);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		ignoreWord_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoredWordsInSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoredWordsInSpellDocumentWithTag_IMetInst(){
		return ((ignoredWordsInSpellDocumentWithTag_IMetInst != null)
	? (ignoredWordsInSpellDocumentWithTag_IMetInst)
	: (ignoredWordsInSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoredWordsInSpellDocumentWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray ignoredWordsInSpellDocumentWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend ignoredWordsInSpellDocumentWithTag_IMetInst = get_ignoredWordsInSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoredWordsInSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		ignoredWordsInSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend language_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_language_IMetInst(){
		return ((language_IMetInst != null)
	? (language_IMetInst)
	: (language_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "language", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString language(){
			final com.apple.jobjc.Invoke.MsgSend language_IMetInst = get_language_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		language_IMetInst.init(nativeBuffer, this);
		language_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend languageForWordRange_inString_orthography_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_languageForWordRange_inString_orthography_IMetInst(){
		return ((languageForWordRange_inString_orthography_IMetInst != null)
	? (languageForWordRange_inString_orthography_IMetInst)
	: (languageForWordRange_inString_orthography_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "languageForWordRange:inString:orthography:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString languageForWordRange_inString_orthography(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSOrthography orthography){
			final com.apple.jobjc.Invoke.MsgSend languageForWordRange_inString_orthography_IMetInst = get_languageForWordRange_inString_orthography_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		languageForWordRange_inString_orthography_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		languageForWordRange_inString_orthography_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend learnWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_learnWord_IMetInst(){
		return ((learnWord_IMetInst != null)
	? (learnWord_IMetInst)
	: (learnWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "learnWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void learnWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend learnWord_IMetInst = get_learnWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		learnWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		learnWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend menuForResult_string_options_atLocation_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuForResult_string_options_atLocation_inView_IMetInst(){
		return ((menuForResult_string_options_atLocation_inView_IMetInst != null)
	? (menuForResult_string_options_atLocation_inView_IMetInst)
	: (menuForResult_string_options_atLocation_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuForResult:string:options:atLocation:inView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menuForResult_string_options_atLocation_inView(final com.apple.jobjc.foundation.NSTextCheckingResult result, final com.apple.jobjc.foundation.NSString checkedString, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.foundation.NSPoint location, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend menuForResult_string_options_atLocation_inView_IMetInst = get_menuForResult_string_options_atLocation_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuForResult_string_options_atLocation_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, result);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, checkedString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		menuForResult_string_options_atLocation_inView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst(){
		return ((recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst != null)
	? (recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst)
	: (recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recordResponse:toCorrection:forWord:language:inSpellDocumentWithTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag(final long response, final com.apple.jobjc.foundation.NSString correction, final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSString language, final long tag){
			final com.apple.jobjc.Invoke.MsgSend recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst = get_recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, response);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, correction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		recordResponse_toCorrection_forWord_language_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst(){
		return ((requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst != null)
	? (requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst)
	: (requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestCheckingOfString:range:types:options:inSpellDocumentWithTag:completionHandler:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler(final com.apple.jobjc.foundation.NSString stringToCheck, final com.apple.jobjc.foundation.NSRange range, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options, final long tag, final Object /* void(^)(NSInteger,NSArray*,NSOrthography*,NSInteger) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst = get_requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		requestCheckingOfString_range_types_options_inSpellDocumentWithTag_completionHandler_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticallyIdentifiesLanguages_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticallyIdentifiesLanguages_IMetInst(){
		return ((setAutomaticallyIdentifiesLanguages_IMetInst != null)
	? (setAutomaticallyIdentifiesLanguages_IMetInst)
	: (setAutomaticallyIdentifiesLanguages_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticallyIdentifiesLanguages:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticallyIdentifiesLanguages(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticallyIdentifiesLanguages_IMetInst = get_setAutomaticallyIdentifiesLanguages_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticallyIdentifiesLanguages_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticallyIdentifiesLanguages_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIgnoredWords_inSpellDocumentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIgnoredWords_inSpellDocumentWithTag_IMetInst(){
		return ((setIgnoredWords_inSpellDocumentWithTag_IMetInst != null)
	? (setIgnoredWords_inSpellDocumentWithTag_IMetInst)
	: (setIgnoredWords_inSpellDocumentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIgnoredWords:inSpellDocumentWithTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setIgnoredWords_inSpellDocumentWithTag(final com.apple.jobjc.foundation.NSArray words, final long tag){
			final com.apple.jobjc.Invoke.MsgSend setIgnoredWords_inSpellDocumentWithTag_IMetInst = get_setIgnoredWords_inSpellDocumentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIgnoredWords_inSpellDocumentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, words);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		setIgnoredWords_inSpellDocumentWithTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLanguage_IMetInst(){
		return ((setLanguage_IMetInst != null)
	? (setLanguage_IMetInst)
	: (setLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLanguage:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setLanguage(final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend setLanguage_IMetInst = get_setLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		setLanguage_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubstitutionsPanelAccessoryViewController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubstitutionsPanelAccessoryViewController_IMetInst(){
		return ((setSubstitutionsPanelAccessoryViewController_IMetInst != null)
	? (setSubstitutionsPanelAccessoryViewController_IMetInst)
	: (setSubstitutionsPanelAccessoryViewController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubstitutionsPanelAccessoryViewController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubstitutionsPanelAccessoryViewController(final com.apple.jobjc.appkit.NSViewController accessoryController){
			final com.apple.jobjc.Invoke.MsgSend setSubstitutionsPanelAccessoryViewController_IMetInst = get_setSubstitutionsPanelAccessoryViewController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubstitutionsPanelAccessoryViewController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, accessoryController);
		setSubstitutionsPanelAccessoryViewController_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWordFieldStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWordFieldStringValue_IMetInst(){
		return ((setWordFieldStringValue_IMetInst != null)
	? (setWordFieldStringValue_IMetInst)
	: (setWordFieldStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWordFieldStringValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWordFieldStringValue(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setWordFieldStringValue_IMetInst = get_setWordFieldStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWordFieldStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setWordFieldStringValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst(){
		return ((showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst != null)
	? (showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst)
	: (showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showCorrectionIndicatorOfType:primaryString:alternativeStrings:forStringInRect:view:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler(final long type, final com.apple.jobjc.foundation.NSString primaryString, final com.apple.jobjc.foundation.NSArray alternativeStrings, final com.apple.jobjc.foundation.NSRect rectOfTypedString, final com.apple.jobjc.appkit.NSView view, final Object /* void(^)(NSString*) (@, @) */ completionBlock){
			final com.apple.jobjc.Invoke.MsgSend showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst = get_showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, primaryString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternativeStrings);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rectOfTypedString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionBlock);
		showCorrectionIndicatorOfType_primaryString_alternativeStrings_forStringInRect_view_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellingPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellingPanel_IMetInst(){
		return ((spellingPanel_IMetInst != null)
	? (spellingPanel_IMetInst)
	: (spellingPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellingPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPanel spellingPanel(){
			final com.apple.jobjc.Invoke.MsgSend spellingPanel_IMetInst = get_spellingPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellingPanel_IMetInst.init(nativeBuffer, this);
		spellingPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPanel returnValue = (com.apple.jobjc.appkit.NSPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substitutionsPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substitutionsPanel_IMetInst(){
		return ((substitutionsPanel_IMetInst != null)
	? (substitutionsPanel_IMetInst)
	: (substitutionsPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substitutionsPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPanel substitutionsPanel(){
			final com.apple.jobjc.Invoke.MsgSend substitutionsPanel_IMetInst = get_substitutionsPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substitutionsPanel_IMetInst.init(nativeBuffer, this);
		substitutionsPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPanel returnValue = (com.apple.jobjc.appkit.NSPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substitutionsPanelAccessoryViewController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substitutionsPanelAccessoryViewController_IMetInst(){
		return ((substitutionsPanelAccessoryViewController_IMetInst != null)
	? (substitutionsPanelAccessoryViewController_IMetInst)
	: (substitutionsPanelAccessoryViewController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substitutionsPanelAccessoryViewController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController substitutionsPanelAccessoryViewController(){
			final com.apple.jobjc.Invoke.MsgSend substitutionsPanelAccessoryViewController_IMetInst = get_substitutionsPanelAccessoryViewController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substitutionsPanelAccessoryViewController_IMetInst.init(nativeBuffer, this);
		substitutionsPanelAccessoryViewController_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unlearnWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlearnWord_IMetInst(){
		return ((unlearnWord_IMetInst != null)
	? (unlearnWord_IMetInst)
	: (unlearnWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlearnWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unlearnWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend unlearnWord_IMetInst = get_unlearnWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlearnWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		unlearnWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updatePanels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updatePanels_IMetInst(){
		return ((updatePanels_IMetInst != null)
	? (updatePanels_IMetInst)
	: (updatePanels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updatePanels", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updatePanels(){
			final com.apple.jobjc.Invoke.MsgSend updatePanels_IMetInst = get_updatePanels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updatePanels_IMetInst.init(nativeBuffer, this);
		updatePanels_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateSpellingPanelWithGrammarString_detail_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateSpellingPanelWithGrammarString_detail_IMetInst(){
		return ((updateSpellingPanelWithGrammarString_detail_IMetInst != null)
	? (updateSpellingPanelWithGrammarString_detail_IMetInst)
	: (updateSpellingPanelWithGrammarString_detail_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateSpellingPanelWithGrammarString:detail:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateSpellingPanelWithGrammarString_detail(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSDictionary detail){
			final com.apple.jobjc.Invoke.MsgSend updateSpellingPanelWithGrammarString_detail_IMetInst = get_updateSpellingPanelWithGrammarString_detail_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateSpellingPanelWithGrammarString_detail_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, detail);
		updateSpellingPanelWithGrammarString_detail_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateSpellingPanelWithMisspelledWord_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateSpellingPanelWithMisspelledWord_IMetInst(){
		return ((updateSpellingPanelWithMisspelledWord_IMetInst != null)
	? (updateSpellingPanelWithMisspelledWord_IMetInst)
	: (updateSpellingPanelWithMisspelledWord_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateSpellingPanelWithMisspelledWord:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateSpellingPanelWithMisspelledWord(final com.apple.jobjc.foundation.NSString word){
			final com.apple.jobjc.Invoke.MsgSend updateSpellingPanelWithMisspelledWord_IMetInst = get_updateSpellingPanelWithMisspelledWord_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateSpellingPanelWithMisspelledWord_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		updateSpellingPanelWithMisspelledWord_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userPreferredLanguages_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userPreferredLanguages_IMetInst(){
		return ((userPreferredLanguages_IMetInst != null)
	? (userPreferredLanguages_IMetInst)
	: (userPreferredLanguages_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userPreferredLanguages", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray userPreferredLanguages(){
			final com.apple.jobjc.Invoke.MsgSend userPreferredLanguages_IMetInst = get_userPreferredLanguages_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userPreferredLanguages_IMetInst.init(nativeBuffer, this);
		userPreferredLanguages_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userQuotesArrayForLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userQuotesArrayForLanguage_IMetInst(){
		return ((userQuotesArrayForLanguage_IMetInst != null)
	? (userQuotesArrayForLanguage_IMetInst)
	: (userQuotesArrayForLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userQuotesArrayForLanguage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray userQuotesArrayForLanguage(final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend userQuotesArrayForLanguage_IMetInst = get_userQuotesArrayForLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userQuotesArrayForLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		userQuotesArrayForLanguage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userReplacementsDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userReplacementsDictionary_IMetInst(){
		return ((userReplacementsDictionary_IMetInst != null)
	? (userReplacementsDictionary_IMetInst)
	: (userReplacementsDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userReplacementsDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary userReplacementsDictionary(){
			final com.apple.jobjc.Invoke.MsgSend userReplacementsDictionary_IMetInst = get_userReplacementsDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userReplacementsDictionary_IMetInst.init(nativeBuffer, this);
		userReplacementsDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
