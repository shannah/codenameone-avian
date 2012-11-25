package com.apple.jobjc.foundation;

public  class NSScriptClassDescription extends com.apple.jobjc.foundation.NSClassDescription {
	public NSScriptClassDescription(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptClassDescription(final NSScriptClassDescription obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventCode_IMetInst(){
		return ((appleEventCode_IMetInst != null)
	? (appleEventCode_IMetInst)
	: (appleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventCode", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int appleEventCode(){
			final com.apple.jobjc.Invoke.MsgSend appleEventCode_IMetInst = get_appleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventCode_IMetInst.init(nativeBuffer, this);
		appleEventCode_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend appleEventCodeForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventCodeForKey_IMetInst(){
		return ((appleEventCodeForKey_IMetInst != null)
	? (appleEventCodeForKey_IMetInst)
	: (appleEventCodeForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventCodeForKey:", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int appleEventCodeForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend appleEventCodeForKey_IMetInst = get_appleEventCodeForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventCodeForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		appleEventCodeForKey_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classDescriptionForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescriptionForKey_IMetInst(){
		return ((classDescriptionForKey_IMetInst != null)
	? (classDescriptionForKey_IMetInst)
	: (classDescriptionForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescriptionForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription classDescriptionForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend classDescriptionForKey_IMetInst = get_classDescriptionForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescriptionForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		classDescriptionForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend className_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_className_IMetInst(){
		return ((className_IMetInst != null)
	? (className_IMetInst)
	: (className_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "className", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString className(){
			final com.apple.jobjc.Invoke.MsgSend className_IMetInst = get_className_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		className_IMetInst.init(nativeBuffer, this);
		className_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultSubcontainerAttributeKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultSubcontainerAttributeKey_IMetInst(){
		return ((defaultSubcontainerAttributeKey_IMetInst != null)
	? (defaultSubcontainerAttributeKey_IMetInst)
	: (defaultSubcontainerAttributeKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultSubcontainerAttributeKey", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString defaultSubcontainerAttributeKey(){
			final com.apple.jobjc.Invoke.MsgSend defaultSubcontainerAttributeKey_IMetInst = get_defaultSubcontainerAttributeKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultSubcontainerAttributeKey_IMetInst.init(nativeBuffer, this);
		defaultSubcontainerAttributeKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasOrderedToManyRelationshipForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasOrderedToManyRelationshipForKey_IMetInst(){
		return ((hasOrderedToManyRelationshipForKey_IMetInst != null)
	? (hasOrderedToManyRelationshipForKey_IMetInst)
	: (hasOrderedToManyRelationshipForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasOrderedToManyRelationshipForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasOrderedToManyRelationshipForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend hasOrderedToManyRelationshipForKey_IMetInst = get_hasOrderedToManyRelationshipForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasOrderedToManyRelationshipForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		hasOrderedToManyRelationshipForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasPropertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasPropertyForKey_IMetInst(){
		return ((hasPropertyForKey_IMetInst != null)
	? (hasPropertyForKey_IMetInst)
	: (hasPropertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasPropertyForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasPropertyForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend hasPropertyForKey_IMetInst = get_hasPropertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasPropertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		hasPropertyForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasReadablePropertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasReadablePropertyForKey_IMetInst(){
		return ((hasReadablePropertyForKey_IMetInst != null)
	? (hasReadablePropertyForKey_IMetInst)
	: (hasReadablePropertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasReadablePropertyForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasReadablePropertyForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend hasReadablePropertyForKey_IMetInst = get_hasReadablePropertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasReadablePropertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		hasReadablePropertyForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasWritablePropertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasWritablePropertyForKey_IMetInst(){
		return ((hasWritablePropertyForKey_IMetInst != null)
	? (hasWritablePropertyForKey_IMetInst)
	: (hasWritablePropertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasWritablePropertyForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean hasWritablePropertyForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend hasWritablePropertyForKey_IMetInst = get_hasWritablePropertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasWritablePropertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		hasWritablePropertyForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend implementationClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_implementationClassName_IMetInst(){
		return ((implementationClassName_IMetInst != null)
	? (implementationClassName_IMetInst)
	: (implementationClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "implementationClassName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString implementationClassName(){
			final com.apple.jobjc.Invoke.MsgSend implementationClassName_IMetInst = get_implementationClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		implementationClassName_IMetInst.init(nativeBuffer, this);
		implementationClassName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSuiteName_className_dictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSuiteName_className_dictionary_IMetInst(){
		return ((initWithSuiteName_className_dictionary_IMetInst != null)
	? (initWithSuiteName_className_dictionary_IMetInst)
	: (initWithSuiteName_className_dictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSuiteName:className:dictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSuiteName_className_dictionary(final com.apple.jobjc.foundation.NSString suiteName, final com.apple.jobjc.foundation.NSString className, final com.apple.jobjc.foundation.NSDictionary classDeclaration){
			final com.apple.jobjc.Invoke.MsgSend initWithSuiteName_className_dictionary_IMetInst = get_initWithSuiteName_className_dictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSuiteName_className_dictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, className);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDeclaration);
		initWithSuiteName_className_dictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLocationRequiredToCreateForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLocationRequiredToCreateForKey_IMetInst(){
		return ((isLocationRequiredToCreateForKey_IMetInst != null)
	? (isLocationRequiredToCreateForKey_IMetInst)
	: (isLocationRequiredToCreateForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLocationRequiredToCreateForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isLocationRequiredToCreateForKey(final com.apple.jobjc.foundation.NSString toManyRelationshipKey){
			final com.apple.jobjc.Invoke.MsgSend isLocationRequiredToCreateForKey_IMetInst = get_isLocationRequiredToCreateForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLocationRequiredToCreateForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toManyRelationshipKey);
		isLocationRequiredToCreateForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isReadOnlyKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isReadOnlyKey_IMetInst(){
		return ((isReadOnlyKey_IMetInst != null)
	? (isReadOnlyKey_IMetInst)
	: (isReadOnlyKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isReadOnlyKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isReadOnlyKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend isReadOnlyKey_IMetInst = get_isReadOnlyKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isReadOnlyKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		isReadOnlyKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyWithAppleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyWithAppleEventCode_IMetInst(){
		return ((keyWithAppleEventCode_IMetInst != null)
	? (keyWithAppleEventCode_IMetInst)
	: (keyWithAppleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyWithAppleEventCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSString keyWithAppleEventCode(final int appleEventCode){
			final com.apple.jobjc.Invoke.MsgSend keyWithAppleEventCode_IMetInst = get_keyWithAppleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyWithAppleEventCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventCode);
		keyWithAppleEventCode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchesAppleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchesAppleEventCode_IMetInst(){
		return ((matchesAppleEventCode_IMetInst != null)
	? (matchesAppleEventCode_IMetInst)
	: (matchesAppleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchesAppleEventCode:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public boolean matchesAppleEventCode(final int appleEventCode){
			final com.apple.jobjc.Invoke.MsgSend matchesAppleEventCode_IMetInst = get_matchesAppleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchesAppleEventCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventCode);
		matchesAppleEventCode_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectorForCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectorForCommand_IMetInst(){
		return ((selectorForCommand_IMetInst != null)
	? (selectorForCommand_IMetInst)
	: (selectorForCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectorForCommand:", com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.SEL selectorForCommand(final com.apple.jobjc.foundation.NSScriptCommandDescription commandDescription){
			final com.apple.jobjc.Invoke.MsgSend selectorForCommand_IMetInst = get_selectorForCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectorForCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandDescription);
		selectorForCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend suiteName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suiteName_IMetInst(){
		return ((suiteName_IMetInst != null)
	? (suiteName_IMetInst)
	: (suiteName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suiteName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString suiteName(){
			final com.apple.jobjc.Invoke.MsgSend suiteName_IMetInst = get_suiteName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suiteName_IMetInst.init(nativeBuffer, this);
		suiteName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend superclassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superclassDescription_IMetInst(){
		return ((superclassDescription_IMetInst != null)
	? (superclassDescription_IMetInst)
	: (superclassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superclassDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription superclassDescription(){
			final com.apple.jobjc.Invoke.MsgSend superclassDescription_IMetInst = get_superclassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superclassDescription_IMetInst.init(nativeBuffer, this);
		superclassDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend supportsCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supportsCommand_IMetInst(){
		return ((supportsCommand_IMetInst != null)
	? (supportsCommand_IMetInst)
	: (supportsCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supportsCommand:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean supportsCommand(final com.apple.jobjc.foundation.NSScriptCommandDescription commandDescription){
			final com.apple.jobjc.Invoke.MsgSend supportsCommand_IMetInst = get_supportsCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supportsCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandDescription);
		supportsCommand_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typeForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeForKey_IMetInst(){
		return ((typeForKey_IMetInst != null)
	? (typeForKey_IMetInst)
	: (typeForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString typeForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend typeForKey_IMetInst = get_typeForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		typeForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
