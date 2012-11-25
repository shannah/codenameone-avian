package com.apple.jobjc.foundation;

public  class NSScriptSuiteRegistry extends com.apple.jobjc.foundation.NSObject {
	public NSScriptSuiteRegistry(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptSuiteRegistry(final NSScriptSuiteRegistry obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend aeteResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_aeteResource_IMetInst(){
		return ((aeteResource_IMetInst != null)
	? (aeteResource_IMetInst)
	: (aeteResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "aeteResource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData aeteResource(final com.apple.jobjc.foundation.NSString languageName){
			final com.apple.jobjc.Invoke.MsgSend aeteResource_IMetInst = get_aeteResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		aeteResource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, languageName);
		aeteResource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend appleEventCodeForSuite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventCodeForSuite_IMetInst(){
		return ((appleEventCodeForSuite_IMetInst != null)
	? (appleEventCodeForSuite_IMetInst)
	: (appleEventCodeForSuite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventCodeForSuite:", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int appleEventCodeForSuite(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend appleEventCodeForSuite_IMetInst = get_appleEventCodeForSuite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventCodeForSuite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		appleEventCodeForSuite_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleForSuite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleForSuite_IMetInst(){
		return ((bundleForSuite_IMetInst != null)
	? (bundleForSuite_IMetInst)
	: (bundleForSuite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleForSuite:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle bundleForSuite(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend bundleForSuite_IMetInst = get_bundleForSuite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleForSuite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		bundleForSuite_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classDescriptionWithAppleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescriptionWithAppleEventCode_IMetInst(){
		return ((classDescriptionWithAppleEventCode_IMetInst != null)
	? (classDescriptionWithAppleEventCode_IMetInst)
	: (classDescriptionWithAppleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescriptionWithAppleEventCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription classDescriptionWithAppleEventCode(final int appleEventCode){
			final com.apple.jobjc.Invoke.MsgSend classDescriptionWithAppleEventCode_IMetInst = get_classDescriptionWithAppleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescriptionWithAppleEventCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventCode);
		classDescriptionWithAppleEventCode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classDescriptionsInSuite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescriptionsInSuite_IMetInst(){
		return ((classDescriptionsInSuite_IMetInst != null)
	? (classDescriptionsInSuite_IMetInst)
	: (classDescriptionsInSuite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescriptionsInSuite:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary classDescriptionsInSuite(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend classDescriptionsInSuite_IMetInst = get_classDescriptionsInSuite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescriptionsInSuite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		classDescriptionsInSuite_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst(){
		return ((commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst != null)
	? (commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst)
	: (commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commandDescriptionWithAppleEventClass:andAppleEventCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSScriptCommandDescription commandDescriptionWithAppleEventClass_andAppleEventCode(final int appleEventClassCode, final int appleEventIDCode){
			final com.apple.jobjc.Invoke.MsgSend commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst = get_commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventClassCode);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventIDCode);
		commandDescriptionWithAppleEventClass_andAppleEventCode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCommandDescription returnValue = (com.apple.jobjc.foundation.NSScriptCommandDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commandDescriptionsInSuite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commandDescriptionsInSuite_IMetInst(){
		return ((commandDescriptionsInSuite_IMetInst != null)
	? (commandDescriptionsInSuite_IMetInst)
	: (commandDescriptionsInSuite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commandDescriptionsInSuite:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary commandDescriptionsInSuite(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend commandDescriptionsInSuite_IMetInst = get_commandDescriptionsInSuite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commandDescriptionsInSuite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		commandDescriptionsInSuite_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadSuiteWithDictionary_fromBundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadSuiteWithDictionary_fromBundle_IMetInst(){
		return ((loadSuiteWithDictionary_fromBundle_IMetInst != null)
	? (loadSuiteWithDictionary_fromBundle_IMetInst)
	: (loadSuiteWithDictionary_fromBundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadSuiteWithDictionary:fromBundle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void loadSuiteWithDictionary_fromBundle(final com.apple.jobjc.foundation.NSDictionary suiteDeclaration, final com.apple.jobjc.foundation.NSBundle bundle){
			final com.apple.jobjc.Invoke.MsgSend loadSuiteWithDictionary_fromBundle_IMetInst = get_loadSuiteWithDictionary_fromBundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadSuiteWithDictionary_fromBundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteDeclaration);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundle);
		loadSuiteWithDictionary_fromBundle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend loadSuitesFromBundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadSuitesFromBundle_IMetInst(){
		return ((loadSuitesFromBundle_IMetInst != null)
	? (loadSuitesFromBundle_IMetInst)
	: (loadSuitesFromBundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadSuitesFromBundle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void loadSuitesFromBundle(final com.apple.jobjc.foundation.NSBundle bundle){
			final com.apple.jobjc.Invoke.MsgSend loadSuitesFromBundle_IMetInst = get_loadSuitesFromBundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadSuitesFromBundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundle);
		loadSuitesFromBundle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerClassDescription_IMetInst(){
		return ((registerClassDescription_IMetInst != null)
	? (registerClassDescription_IMetInst)
	: (registerClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerClassDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerClassDescription(final com.apple.jobjc.foundation.NSScriptClassDescription classDescription){
			final com.apple.jobjc.Invoke.MsgSend registerClassDescription_IMetInst = get_registerClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerClassDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDescription);
		registerClassDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerCommandDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerCommandDescription_IMetInst(){
		return ((registerCommandDescription_IMetInst != null)
	? (registerCommandDescription_IMetInst)
	: (registerCommandDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerCommandDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerCommandDescription(final com.apple.jobjc.foundation.NSScriptCommandDescription commandDescription){
			final com.apple.jobjc.Invoke.MsgSend registerCommandDescription_IMetInst = get_registerCommandDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerCommandDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandDescription);
		registerCommandDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suiteForAppleEventCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suiteForAppleEventCode_IMetInst(){
		return ((suiteForAppleEventCode_IMetInst != null)
	? (suiteForAppleEventCode_IMetInst)
	: (suiteForAppleEventCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suiteForAppleEventCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public com.apple.jobjc.foundation.NSString suiteForAppleEventCode(final int appleEventCode){
			final com.apple.jobjc.Invoke.MsgSend suiteForAppleEventCode_IMetInst = get_suiteForAppleEventCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suiteForAppleEventCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.push(nativeBuffer, appleEventCode);
		suiteForAppleEventCode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend suiteNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suiteNames_IMetInst(){
		return ((suiteNames_IMetInst != null)
	? (suiteNames_IMetInst)
	: (suiteNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suiteNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray suiteNames(){
			final com.apple.jobjc.Invoke.MsgSend suiteNames_IMetInst = get_suiteNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suiteNames_IMetInst.init(nativeBuffer, this);
		suiteNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
