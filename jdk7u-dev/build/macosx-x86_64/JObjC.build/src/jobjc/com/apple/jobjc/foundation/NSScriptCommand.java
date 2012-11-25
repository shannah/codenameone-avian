package com.apple.jobjc.foundation;

public  class NSScriptCommand extends com.apple.jobjc.foundation.NSObject {
	public NSScriptCommand(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptCommand(final NSScriptCommand obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appleEvent_IMetInst(){
		return ((appleEvent_IMetInst != null)
	? (appleEvent_IMetInst)
	: (appleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appleEvent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor appleEvent(){
			final com.apple.jobjc.Invoke.MsgSend appleEvent_IMetInst = get_appleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appleEvent_IMetInst.init(nativeBuffer, this);
		appleEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arguments_IMetInst(){
		return ((arguments_IMetInst != null)
	? (arguments_IMetInst)
	: (arguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arguments", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary arguments(){
			final com.apple.jobjc.Invoke.MsgSend arguments_IMetInst = get_arguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arguments_IMetInst.init(nativeBuffer, this);
		arguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commandDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commandDescription_IMetInst(){
		return ((commandDescription_IMetInst != null)
	? (commandDescription_IMetInst)
	: (commandDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commandDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptCommandDescription commandDescription(){
			final com.apple.jobjc.Invoke.MsgSend commandDescription_IMetInst = get_commandDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commandDescription_IMetInst.init(nativeBuffer, this);
		commandDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCommandDescription returnValue = (com.apple.jobjc.foundation.NSScriptCommandDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend directParameter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_directParameter_IMetInst(){
		return ((directParameter_IMetInst != null)
	? (directParameter_IMetInst)
	: (directParameter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "directParameter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T directParameter(){
			final com.apple.jobjc.Invoke.MsgSend directParameter_IMetInst = get_directParameter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		directParameter_IMetInst.init(nativeBuffer, this);
		directParameter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evaluatedArguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluatedArguments_IMetInst(){
		return ((evaluatedArguments_IMetInst != null)
	? (evaluatedArguments_IMetInst)
	: (evaluatedArguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluatedArguments", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary evaluatedArguments(){
			final com.apple.jobjc.Invoke.MsgSend evaluatedArguments_IMetInst = get_evaluatedArguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluatedArguments_IMetInst.init(nativeBuffer, this);
		evaluatedArguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evaluatedReceivers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluatedReceivers_IMetInst(){
		return ((evaluatedReceivers_IMetInst != null)
	? (evaluatedReceivers_IMetInst)
	: (evaluatedReceivers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluatedReceivers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T evaluatedReceivers(){
			final com.apple.jobjc.Invoke.MsgSend evaluatedReceivers_IMetInst = get_evaluatedReceivers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluatedReceivers_IMetInst.init(nativeBuffer, this);
		evaluatedReceivers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executeCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executeCommand_IMetInst(){
		return ((executeCommand_IMetInst != null)
	? (executeCommand_IMetInst)
	: (executeCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executeCommand", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T executeCommand(){
			final com.apple.jobjc.Invoke.MsgSend executeCommand_IMetInst = get_executeCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executeCommand_IMetInst.init(nativeBuffer, this);
		executeCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCommandDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCommandDescription_IMetInst(){
		return ((initWithCommandDescription_IMetInst != null)
	? (initWithCommandDescription_IMetInst)
	: (initWithCommandDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCommandDescription:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCommandDescription(final com.apple.jobjc.foundation.NSScriptCommandDescription commandDef){
			final com.apple.jobjc.Invoke.MsgSend initWithCommandDescription_IMetInst = get_initWithCommandDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCommandDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, commandDef);
		initWithCommandDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isWellFormed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isWellFormed_IMetInst(){
		return ((isWellFormed_IMetInst != null)
	? (isWellFormed_IMetInst)
	: (isWellFormed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isWellFormed", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isWellFormed(){
			final com.apple.jobjc.Invoke.MsgSend isWellFormed_IMetInst = get_isWellFormed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isWellFormed_IMetInst.init(nativeBuffer, this);
		isWellFormed_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performDefaultImplementation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performDefaultImplementation_IMetInst(){
		return ((performDefaultImplementation_IMetInst != null)
	? (performDefaultImplementation_IMetInst)
	: (performDefaultImplementation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performDefaultImplementation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T performDefaultImplementation(){
			final com.apple.jobjc.Invoke.MsgSend performDefaultImplementation_IMetInst = get_performDefaultImplementation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performDefaultImplementation_IMetInst.init(nativeBuffer, this);
		performDefaultImplementation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend receiversSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_receiversSpecifier_IMetInst(){
		return ((receiversSpecifier_IMetInst != null)
	? (receiversSpecifier_IMetInst)
	: (receiversSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "receiversSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier receiversSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend receiversSpecifier_IMetInst = get_receiversSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		receiversSpecifier_IMetInst.init(nativeBuffer, this);
		receiversSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resumeExecutionWithResult_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resumeExecutionWithResult_IMetInst(){
		return ((resumeExecutionWithResult_IMetInst != null)
	? (resumeExecutionWithResult_IMetInst)
	: (resumeExecutionWithResult_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resumeExecutionWithResult:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void resumeExecutionWithResult(final com.apple.jobjc.ID result){
			final com.apple.jobjc.Invoke.MsgSend resumeExecutionWithResult_IMetInst = get_resumeExecutionWithResult_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resumeExecutionWithResult_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, result);
		resumeExecutionWithResult_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptErrorExpectedTypeDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptErrorExpectedTypeDescriptor_IMetInst(){
		return ((scriptErrorExpectedTypeDescriptor_IMetInst != null)
	? (scriptErrorExpectedTypeDescriptor_IMetInst)
	: (scriptErrorExpectedTypeDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptErrorExpectedTypeDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor scriptErrorExpectedTypeDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend scriptErrorExpectedTypeDescriptor_IMetInst = get_scriptErrorExpectedTypeDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptErrorExpectedTypeDescriptor_IMetInst.init(nativeBuffer, this);
		scriptErrorExpectedTypeDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptErrorNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptErrorNumber_IMetInst(){
		return ((scriptErrorNumber_IMetInst != null)
	? (scriptErrorNumber_IMetInst)
	: (scriptErrorNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptErrorNumber", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int scriptErrorNumber(){
			final com.apple.jobjc.Invoke.MsgSend scriptErrorNumber_IMetInst = get_scriptErrorNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptErrorNumber_IMetInst.init(nativeBuffer, this);
		scriptErrorNumber_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptErrorOffendingObjectDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptErrorOffendingObjectDescriptor_IMetInst(){
		return ((scriptErrorOffendingObjectDescriptor_IMetInst != null)
	? (scriptErrorOffendingObjectDescriptor_IMetInst)
	: (scriptErrorOffendingObjectDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptErrorOffendingObjectDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor scriptErrorOffendingObjectDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend scriptErrorOffendingObjectDescriptor_IMetInst = get_scriptErrorOffendingObjectDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptErrorOffendingObjectDescriptor_IMetInst.init(nativeBuffer, this);
		scriptErrorOffendingObjectDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptErrorString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptErrorString_IMetInst(){
		return ((scriptErrorString_IMetInst != null)
	? (scriptErrorString_IMetInst)
	: (scriptErrorString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptErrorString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString scriptErrorString(){
			final com.apple.jobjc.Invoke.MsgSend scriptErrorString_IMetInst = get_scriptErrorString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptErrorString_IMetInst.init(nativeBuffer, this);
		scriptErrorString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setArguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArguments_IMetInst(){
		return ((setArguments_IMetInst != null)
	? (setArguments_IMetInst)
	: (setArguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArguments:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setArguments(final com.apple.jobjc.foundation.NSDictionary args){
			final com.apple.jobjc.Invoke.MsgSend setArguments_IMetInst = get_setArguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArguments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, args);
		setArguments_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDirectParameter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDirectParameter_IMetInst(){
		return ((setDirectParameter_IMetInst != null)
	? (setDirectParameter_IMetInst)
	: (setDirectParameter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDirectParameter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDirectParameter(final com.apple.jobjc.ID directParameter){
			final com.apple.jobjc.Invoke.MsgSend setDirectParameter_IMetInst = get_setDirectParameter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDirectParameter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, directParameter);
		setDirectParameter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReceiversSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReceiversSpecifier_IMetInst(){
		return ((setReceiversSpecifier_IMetInst != null)
	? (setReceiversSpecifier_IMetInst)
	: (setReceiversSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReceiversSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setReceiversSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier receiversRef){
			final com.apple.jobjc.Invoke.MsgSend setReceiversSpecifier_IMetInst = get_setReceiversSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReceiversSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receiversRef);
		setReceiversSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScriptErrorExpectedTypeDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScriptErrorExpectedTypeDescriptor_IMetInst(){
		return ((setScriptErrorExpectedTypeDescriptor_IMetInst != null)
	? (setScriptErrorExpectedTypeDescriptor_IMetInst)
	: (setScriptErrorExpectedTypeDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScriptErrorExpectedTypeDescriptor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScriptErrorExpectedTypeDescriptor(final com.apple.jobjc.foundation.NSAppleEventDescriptor errorExpectedTypeDescriptor){
			final com.apple.jobjc.Invoke.MsgSend setScriptErrorExpectedTypeDescriptor_IMetInst = get_setScriptErrorExpectedTypeDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScriptErrorExpectedTypeDescriptor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorExpectedTypeDescriptor);
		setScriptErrorExpectedTypeDescriptor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScriptErrorNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScriptErrorNumber_IMetInst(){
		return ((setScriptErrorNumber_IMetInst != null)
	? (setScriptErrorNumber_IMetInst)
	: (setScriptErrorNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScriptErrorNumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setScriptErrorNumber(final int errorNumber){
			final com.apple.jobjc.Invoke.MsgSend setScriptErrorNumber_IMetInst = get_setScriptErrorNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScriptErrorNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, errorNumber);
		setScriptErrorNumber_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScriptErrorOffendingObjectDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScriptErrorOffendingObjectDescriptor_IMetInst(){
		return ((setScriptErrorOffendingObjectDescriptor_IMetInst != null)
	? (setScriptErrorOffendingObjectDescriptor_IMetInst)
	: (setScriptErrorOffendingObjectDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScriptErrorOffendingObjectDescriptor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScriptErrorOffendingObjectDescriptor(final com.apple.jobjc.foundation.NSAppleEventDescriptor errorOffendingObjectDescriptor){
			final com.apple.jobjc.Invoke.MsgSend setScriptErrorOffendingObjectDescriptor_IMetInst = get_setScriptErrorOffendingObjectDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScriptErrorOffendingObjectDescriptor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorOffendingObjectDescriptor);
		setScriptErrorOffendingObjectDescriptor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScriptErrorString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScriptErrorString_IMetInst(){
		return ((setScriptErrorString_IMetInst != null)
	? (setScriptErrorString_IMetInst)
	: (setScriptErrorString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScriptErrorString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScriptErrorString(final com.apple.jobjc.foundation.NSString errorString){
			final com.apple.jobjc.Invoke.MsgSend setScriptErrorString_IMetInst = get_setScriptErrorString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScriptErrorString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorString);
		setScriptErrorString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suspendExecution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspendExecution_IMetInst(){
		return ((suspendExecution_IMetInst != null)
	? (suspendExecution_IMetInst)
	: (suspendExecution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspendExecution", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void suspendExecution(){
			final com.apple.jobjc.Invoke.MsgSend suspendExecution_IMetInst = get_suspendExecution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspendExecution_IMetInst.init(nativeBuffer, this);
		suspendExecution_IMetInst.invoke(nativeBuffer);
		
		
	}

}
