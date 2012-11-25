package com.apple.jobjc.foundation;

public  class NSOrthography extends com.apple.jobjc.foundation.NSObject {
	public NSOrthography(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOrthography(final NSOrthography obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allLanguages_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allLanguages_IMetInst(){
		return ((allLanguages_IMetInst != null)
	? (allLanguages_IMetInst)
	: (allLanguages_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allLanguages", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allLanguages(){
			final com.apple.jobjc.Invoke.MsgSend allLanguages_IMetInst = get_allLanguages_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allLanguages_IMetInst.init(nativeBuffer, this);
		allLanguages_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allScripts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allScripts_IMetInst(){
		return ((allScripts_IMetInst != null)
	? (allScripts_IMetInst)
	: (allScripts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allScripts", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allScripts(){
			final com.apple.jobjc.Invoke.MsgSend allScripts_IMetInst = get_allScripts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allScripts_IMetInst.init(nativeBuffer, this);
		allScripts_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dominantLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dominantLanguage_IMetInst(){
		return ((dominantLanguage_IMetInst != null)
	? (dominantLanguage_IMetInst)
	: (dominantLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dominantLanguage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString dominantLanguage(){
			final com.apple.jobjc.Invoke.MsgSend dominantLanguage_IMetInst = get_dominantLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dominantLanguage_IMetInst.init(nativeBuffer, this);
		dominantLanguage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dominantLanguageForScript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dominantLanguageForScript_IMetInst(){
		return ((dominantLanguageForScript_IMetInst != null)
	? (dominantLanguageForScript_IMetInst)
	: (dominantLanguageForScript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dominantLanguageForScript:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString dominantLanguageForScript(final com.apple.jobjc.foundation.NSString script){
			final com.apple.jobjc.Invoke.MsgSend dominantLanguageForScript_IMetInst = get_dominantLanguageForScript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dominantLanguageForScript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, script);
		dominantLanguageForScript_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dominantScript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dominantScript_IMetInst(){
		return ((dominantScript_IMetInst != null)
	? (dominantScript_IMetInst)
	: (dominantScript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dominantScript", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString dominantScript(){
			final com.apple.jobjc.Invoke.MsgSend dominantScript_IMetInst = get_dominantScript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dominantScript_IMetInst.init(nativeBuffer, this);
		dominantScript_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDominantScript_languageMap_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDominantScript_languageMap_IMetInst(){
		return ((initWithDominantScript_languageMap_IMetInst != null)
	? (initWithDominantScript_languageMap_IMetInst)
	: (initWithDominantScript_languageMap_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDominantScript:languageMap:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDominantScript_languageMap(final com.apple.jobjc.foundation.NSString script, final com.apple.jobjc.foundation.NSDictionary map){
			final com.apple.jobjc.Invoke.MsgSend initWithDominantScript_languageMap_IMetInst = get_initWithDominantScript_languageMap_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDominantScript_languageMap_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, script);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, map);
		initWithDominantScript_languageMap_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend languageMap_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_languageMap_IMetInst(){
		return ((languageMap_IMetInst != null)
	? (languageMap_IMetInst)
	: (languageMap_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "languageMap", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary languageMap(){
			final com.apple.jobjc.Invoke.MsgSend languageMap_IMetInst = get_languageMap_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		languageMap_IMetInst.init(nativeBuffer, this);
		languageMap_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend languagesForScript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_languagesForScript_IMetInst(){
		return ((languagesForScript_IMetInst != null)
	? (languagesForScript_IMetInst)
	: (languagesForScript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "languagesForScript:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray languagesForScript(final com.apple.jobjc.foundation.NSString script){
			final com.apple.jobjc.Invoke.MsgSend languagesForScript_IMetInst = get_languagesForScript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		languagesForScript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, script);
		languagesForScript_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
