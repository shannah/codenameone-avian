package com.apple.jobjc.appkit;

public  class NSSpellCheckerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSpellCheckerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSpellCheckerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSpellCheckerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend isAutomaticSpellingCorrectionEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticSpellingCorrectionEnabled_CMetInst(){
		return ((isAutomaticSpellingCorrectionEnabled_CMetInst != null)
	? (isAutomaticSpellingCorrectionEnabled_CMetInst)
	: (isAutomaticSpellingCorrectionEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticSpellingCorrectionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticSpellingCorrectionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticSpellingCorrectionEnabled_CMetInst = get_isAutomaticSpellingCorrectionEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticSpellingCorrectionEnabled_CMetInst.init(nativeBuffer, this);
		isAutomaticSpellingCorrectionEnabled_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticTextReplacementEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticTextReplacementEnabled_CMetInst(){
		return ((isAutomaticTextReplacementEnabled_CMetInst != null)
	? (isAutomaticTextReplacementEnabled_CMetInst)
	: (isAutomaticTextReplacementEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticTextReplacementEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticTextReplacementEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticTextReplacementEnabled_CMetInst = get_isAutomaticTextReplacementEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticTextReplacementEnabled_CMetInst.init(nativeBuffer, this);
		isAutomaticTextReplacementEnabled_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSpellChecker_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSpellChecker_CMetInst(){
		return ((sharedSpellChecker_CMetInst != null)
	? (sharedSpellChecker_CMetInst)
	: (sharedSpellChecker_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSpellChecker", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSSpellChecker sharedSpellChecker(){
			final com.apple.jobjc.Invoke.MsgSend sharedSpellChecker_CMetInst = get_sharedSpellChecker_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSpellChecker_CMetInst.init(nativeBuffer, this);
		sharedSpellChecker_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSSpellChecker returnValue = (com.apple.jobjc.appkit.NSSpellChecker) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSpellCheckerExists_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSpellCheckerExists_CMetInst(){
		return ((sharedSpellCheckerExists_CMetInst != null)
	? (sharedSpellCheckerExists_CMetInst)
	: (sharedSpellCheckerExists_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSpellCheckerExists", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sharedSpellCheckerExists(){
			final com.apple.jobjc.Invoke.MsgSend sharedSpellCheckerExists_CMetInst = get_sharedSpellCheckerExists_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSpellCheckerExists_CMetInst.init(nativeBuffer, this);
		sharedSpellCheckerExists_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend uniqueSpellDocumentTag_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uniqueSpellDocumentTag_CMetInst(){
		return ((uniqueSpellDocumentTag_CMetInst != null)
	? (uniqueSpellDocumentTag_CMetInst)
	: (uniqueSpellDocumentTag_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uniqueSpellDocumentTag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long uniqueSpellDocumentTag(){
			final com.apple.jobjc.Invoke.MsgSend uniqueSpellDocumentTag_CMetInst = get_uniqueSpellDocumentTag_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uniqueSpellDocumentTag_CMetInst.init(nativeBuffer, this);
		uniqueSpellDocumentTag_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
