package com.apple.jobjc.foundation;

public  class NSLocaleClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSLocaleClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSLocaleClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSLocaleClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend ISOCountryCodes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ISOCountryCodes_CMetInst(){
		return ((ISOCountryCodes_CMetInst != null)
	? (ISOCountryCodes_CMetInst)
	: (ISOCountryCodes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ISOCountryCodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray ISOCountryCodes(){
			final com.apple.jobjc.Invoke.MsgSend ISOCountryCodes_CMetInst = get_ISOCountryCodes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ISOCountryCodes_CMetInst.init(nativeBuffer, this);
		ISOCountryCodes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ISOCurrencyCodes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ISOCurrencyCodes_CMetInst(){
		return ((ISOCurrencyCodes_CMetInst != null)
	? (ISOCurrencyCodes_CMetInst)
	: (ISOCurrencyCodes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ISOCurrencyCodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray ISOCurrencyCodes(){
			final com.apple.jobjc.Invoke.MsgSend ISOCurrencyCodes_CMetInst = get_ISOCurrencyCodes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ISOCurrencyCodes_CMetInst.init(nativeBuffer, this);
		ISOCurrencyCodes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ISOLanguageCodes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ISOLanguageCodes_CMetInst(){
		return ((ISOLanguageCodes_CMetInst != null)
	? (ISOLanguageCodes_CMetInst)
	: (ISOLanguageCodes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ISOLanguageCodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray ISOLanguageCodes(){
			final com.apple.jobjc.Invoke.MsgSend ISOLanguageCodes_CMetInst = get_ISOLanguageCodes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ISOLanguageCodes_CMetInst.init(nativeBuffer, this);
		ISOLanguageCodes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoupdatingCurrentLocale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoupdatingCurrentLocale_CMetInst(){
		return ((autoupdatingCurrentLocale_CMetInst != null)
	? (autoupdatingCurrentLocale_CMetInst)
	: (autoupdatingCurrentLocale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoupdatingCurrentLocale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T autoupdatingCurrentLocale(){
			final com.apple.jobjc.Invoke.MsgSend autoupdatingCurrentLocale_CMetInst = get_autoupdatingCurrentLocale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoupdatingCurrentLocale_CMetInst.init(nativeBuffer, this);
		autoupdatingCurrentLocale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableLocaleIdentifiers_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableLocaleIdentifiers_CMetInst(){
		return ((availableLocaleIdentifiers_CMetInst != null)
	? (availableLocaleIdentifiers_CMetInst)
	: (availableLocaleIdentifiers_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableLocaleIdentifiers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableLocaleIdentifiers(){
			final com.apple.jobjc.Invoke.MsgSend availableLocaleIdentifiers_CMetInst = get_availableLocaleIdentifiers_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableLocaleIdentifiers_CMetInst.init(nativeBuffer, this);
		availableLocaleIdentifiers_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canonicalLanguageIdentifierFromString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canonicalLanguageIdentifierFromString_CMetInst(){
		return ((canonicalLanguageIdentifierFromString_CMetInst != null)
	? (canonicalLanguageIdentifierFromString_CMetInst)
	: (canonicalLanguageIdentifierFromString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canonicalLanguageIdentifierFromString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString canonicalLanguageIdentifierFromString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend canonicalLanguageIdentifierFromString_CMetInst = get_canonicalLanguageIdentifierFromString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canonicalLanguageIdentifierFromString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		canonicalLanguageIdentifierFromString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canonicalLocaleIdentifierFromString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canonicalLocaleIdentifierFromString_CMetInst(){
		return ((canonicalLocaleIdentifierFromString_CMetInst != null)
	? (canonicalLocaleIdentifierFromString_CMetInst)
	: (canonicalLocaleIdentifierFromString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canonicalLocaleIdentifierFromString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString canonicalLocaleIdentifierFromString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend canonicalLocaleIdentifierFromString_CMetInst = get_canonicalLocaleIdentifierFromString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canonicalLocaleIdentifierFromString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		canonicalLocaleIdentifierFromString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterDirectionForLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterDirectionForLanguage_CMetInst(){
		return ((characterDirectionForLanguage_CMetInst != null)
	? (characterDirectionForLanguage_CMetInst)
	: (characterDirectionForLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterDirectionForLanguage:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long characterDirectionForLanguage(final com.apple.jobjc.foundation.NSString isoLangCode){
			final com.apple.jobjc.Invoke.MsgSend characterDirectionForLanguage_CMetInst = get_characterDirectionForLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterDirectionForLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, isoLangCode);
		characterDirectionForLanguage_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commonISOCurrencyCodes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commonISOCurrencyCodes_CMetInst(){
		return ((commonISOCurrencyCodes_CMetInst != null)
	? (commonISOCurrencyCodes_CMetInst)
	: (commonISOCurrencyCodes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commonISOCurrencyCodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray commonISOCurrencyCodes(){
			final com.apple.jobjc.Invoke.MsgSend commonISOCurrencyCodes_CMetInst = get_commonISOCurrencyCodes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commonISOCurrencyCodes_CMetInst.init(nativeBuffer, this);
		commonISOCurrencyCodes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend componentsFromLocaleIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_componentsFromLocaleIdentifier_CMetInst(){
		return ((componentsFromLocaleIdentifier_CMetInst != null)
	? (componentsFromLocaleIdentifier_CMetInst)
	: (componentsFromLocaleIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "componentsFromLocaleIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary componentsFromLocaleIdentifier(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend componentsFromLocaleIdentifier_CMetInst = get_componentsFromLocaleIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		componentsFromLocaleIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		componentsFromLocaleIdentifier_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentLocale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentLocale_CMetInst(){
		return ((currentLocale_CMetInst != null)
	? (currentLocale_CMetInst)
	: (currentLocale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentLocale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T currentLocale(){
			final com.apple.jobjc.Invoke.MsgSend currentLocale_CMetInst = get_currentLocale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentLocale_CMetInst.init(nativeBuffer, this);
		currentLocale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineDirectionForLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineDirectionForLanguage_CMetInst(){
		return ((lineDirectionForLanguage_CMetInst != null)
	? (lineDirectionForLanguage_CMetInst)
	: (lineDirectionForLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineDirectionForLanguage:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long lineDirectionForLanguage(final com.apple.jobjc.foundation.NSString isoLangCode){
			final com.apple.jobjc.Invoke.MsgSend lineDirectionForLanguage_CMetInst = get_lineDirectionForLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineDirectionForLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, isoLangCode);
		lineDirectionForLanguage_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localeIdentifierFromComponents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localeIdentifierFromComponents_CMetInst(){
		return ((localeIdentifierFromComponents_CMetInst != null)
	? (localeIdentifierFromComponents_CMetInst)
	: (localeIdentifierFromComponents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localeIdentifierFromComponents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localeIdentifierFromComponents(final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend localeIdentifierFromComponents_CMetInst = get_localeIdentifierFromComponents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localeIdentifierFromComponents_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		localeIdentifierFromComponents_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localeIdentifierFromWindowsLocaleCode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localeIdentifierFromWindowsLocaleCode_CMetInst(){
		return ((localeIdentifierFromWindowsLocaleCode_CMetInst != null)
	? (localeIdentifierFromWindowsLocaleCode_CMetInst)
	: (localeIdentifierFromWindowsLocaleCode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localeIdentifierFromWindowsLocaleCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localeIdentifierFromWindowsLocaleCode(final int lcid){
			final com.apple.jobjc.Invoke.MsgSend localeIdentifierFromWindowsLocaleCode_CMetInst = get_localeIdentifierFromWindowsLocaleCode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localeIdentifierFromWindowsLocaleCode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, lcid);
		localeIdentifierFromWindowsLocaleCode_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredLanguages_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredLanguages_CMetInst(){
		return ((preferredLanguages_CMetInst != null)
	? (preferredLanguages_CMetInst)
	: (preferredLanguages_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredLanguages", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray preferredLanguages(){
			final com.apple.jobjc.Invoke.MsgSend preferredLanguages_CMetInst = get_preferredLanguages_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredLanguages_CMetInst.init(nativeBuffer, this);
		preferredLanguages_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemLocale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemLocale_CMetInst(){
		return ((systemLocale_CMetInst != null)
	? (systemLocale_CMetInst)
	: (systemLocale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemLocale", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T systemLocale(){
			final com.apple.jobjc.Invoke.MsgSend systemLocale_CMetInst = get_systemLocale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemLocale_CMetInst.init(nativeBuffer, this);
		systemLocale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowsLocaleCodeFromLocaleIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowsLocaleCodeFromLocaleIdentifier_CMetInst(){
		return ((windowsLocaleCodeFromLocaleIdentifier_CMetInst != null)
	? (windowsLocaleCodeFromLocaleIdentifier_CMetInst)
	: (windowsLocaleCodeFromLocaleIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowsLocaleCodeFromLocaleIdentifier:", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int windowsLocaleCodeFromLocaleIdentifier(final com.apple.jobjc.foundation.NSString localeIdentifier){
			final com.apple.jobjc.Invoke.MsgSend windowsLocaleCodeFromLocaleIdentifier_CMetInst = get_windowsLocaleCodeFromLocaleIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowsLocaleCodeFromLocaleIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localeIdentifier);
		windowsLocaleCodeFromLocaleIdentifier_CMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

}
