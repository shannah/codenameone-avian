package com.apple.jobjc.foundation;

public  class NSScriptCommandDescription extends com.apple.jobjc.foundation.NSObject {
	public NSScriptCommandDescription(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptCommandDescription(final NSScriptCommandDescription obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appleEventClassCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventClassCode_IMetInst(){
		return ((appleEventClassCode_IMetInst != null)
	? (appleEventClassCode_IMetInst)
	: (appleEventClassCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventClassCode", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int appleEventClassCode(){
			final com.apple.jobjc.Invoke.MsgSend appleEventClassCode_IMetInst = get_appleEventClassCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventClassCode_IMetInst.init(nativeBuffer, this);
		appleEventClassCode_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend appleEventCodeForArgumentWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventCodeForArgumentWithName_IMetInst(){
		return ((appleEventCodeForArgumentWithName_IMetInst != null)
	? (appleEventCodeForArgumentWithName_IMetInst)
	: (appleEventCodeForArgumentWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventCodeForArgumentWithName:", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int appleEventCodeForArgumentWithName(final com.apple.jobjc.foundation.NSString argumentName){
			final com.apple.jobjc.Invoke.MsgSend appleEventCodeForArgumentWithName_IMetInst = get_appleEventCodeForArgumentWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventCodeForArgumentWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argumentName);
		appleEventCodeForArgumentWithName_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend appleEventCodeForReturnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEventCodeForReturnType_IMetInst(){
		return ((appleEventCodeForReturnType_IMetInst != null)
	? (appleEventCodeForReturnType_IMetInst)
	: (appleEventCodeForReturnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEventCodeForReturnType", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int appleEventCodeForReturnType(){
			final com.apple.jobjc.Invoke.MsgSend appleEventCodeForReturnType_IMetInst = get_appleEventCodeForReturnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEventCodeForReturnType_IMetInst.init(nativeBuffer, this);
		appleEventCodeForReturnType_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend argumentNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_argumentNames_IMetInst(){
		return ((argumentNames_IMetInst != null)
	? (argumentNames_IMetInst)
	: (argumentNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "argumentNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray argumentNames(){
			final com.apple.jobjc.Invoke.MsgSend argumentNames_IMetInst = get_argumentNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		argumentNames_IMetInst.init(nativeBuffer, this);
		argumentNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commandClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commandClassName_IMetInst(){
		return ((commandClassName_IMetInst != null)
	? (commandClassName_IMetInst)
	: (commandClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commandClassName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString commandClassName(){
			final com.apple.jobjc.Invoke.MsgSend commandClassName_IMetInst = get_commandClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commandClassName_IMetInst.init(nativeBuffer, this);
		commandClassName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commandName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commandName_IMetInst(){
		return ((commandName_IMetInst != null)
	? (commandName_IMetInst)
	: (commandName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commandName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString commandName(){
			final com.apple.jobjc.Invoke.MsgSend commandName_IMetInst = get_commandName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commandName_IMetInst.init(nativeBuffer, this);
		commandName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createCommandInstance_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createCommandInstance_IMetInst(){
		return ((createCommandInstance_IMetInst != null)
	? (createCommandInstance_IMetInst)
	: (createCommandInstance_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createCommandInstance", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptCommand createCommandInstance(){
			final com.apple.jobjc.Invoke.MsgSend createCommandInstance_IMetInst = get_createCommandInstance_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createCommandInstance_IMetInst.init(nativeBuffer, this);
		createCommandInstance_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCommand returnValue = (com.apple.jobjc.foundation.NSScriptCommand) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createCommandInstanceWithZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createCommandInstanceWithZone_IMetInst(){
		return ((createCommandInstanceWithZone_IMetInst != null)
	? (createCommandInstanceWithZone_IMetInst)
	: (createCommandInstanceWithZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createCommandInstanceWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptCommand createCommandInstanceWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend createCommandInstanceWithZone_IMetInst = get_createCommandInstanceWithZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createCommandInstanceWithZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		createCommandInstanceWithZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCommand returnValue = (com.apple.jobjc.foundation.NSScriptCommand) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSuiteName_commandName_dictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSuiteName_commandName_dictionary_IMetInst(){
		return ((initWithSuiteName_commandName_dictionary_IMetInst != null)
	? (initWithSuiteName_commandName_dictionary_IMetInst)
	: (initWithSuiteName_commandName_dictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSuiteName:commandName:dictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSuiteName_commandName_dictionary(final com.apple.jobjc.foundation.NSString suiteName, final com.apple.jobjc.foundation.NSString commandName, final com.apple.jobjc.foundation.NSDictionary commandDeclaration){
			final com.apple.jobjc.Invoke.MsgSend initWithSuiteName_commandName_dictionary_IMetInst = get_initWithSuiteName_commandName_dictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSuiteName_commandName_dictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandDeclaration);
		initWithSuiteName_commandName_dictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOptionalArgumentWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOptionalArgumentWithName_IMetInst(){
		return ((isOptionalArgumentWithName_IMetInst != null)
	? (isOptionalArgumentWithName_IMetInst)
	: (isOptionalArgumentWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOptionalArgumentWithName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isOptionalArgumentWithName(final com.apple.jobjc.foundation.NSString argumentName){
			final com.apple.jobjc.Invoke.MsgSend isOptionalArgumentWithName_IMetInst = get_isOptionalArgumentWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOptionalArgumentWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argumentName);
		isOptionalArgumentWithName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend returnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_returnType_IMetInst(){
		return ((returnType_IMetInst != null)
	? (returnType_IMetInst)
	: (returnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "returnType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString returnType(){
			final com.apple.jobjc.Invoke.MsgSend returnType_IMetInst = get_returnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		returnType_IMetInst.init(nativeBuffer, this);
		returnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend typeForArgumentWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeForArgumentWithName_IMetInst(){
		return ((typeForArgumentWithName_IMetInst != null)
	? (typeForArgumentWithName_IMetInst)
	: (typeForArgumentWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeForArgumentWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString typeForArgumentWithName(final com.apple.jobjc.foundation.NSString argumentName){
			final com.apple.jobjc.Invoke.MsgSend typeForArgumentWithName_IMetInst = get_typeForArgumentWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeForArgumentWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argumentName);
		typeForArgumentWithName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
