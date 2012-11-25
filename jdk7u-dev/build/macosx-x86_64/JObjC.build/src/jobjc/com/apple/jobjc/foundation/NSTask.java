package com.apple.jobjc.foundation;

public  class NSTask extends com.apple.jobjc.foundation.NSObject {
	public NSTask(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTask(final NSTask obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arguments_IMetInst(){
		return ((arguments_IMetInst != null)
	? (arguments_IMetInst)
	: (arguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arguments", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arguments(){
			final com.apple.jobjc.Invoke.MsgSend arguments_IMetInst = get_arguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arguments_IMetInst.init(nativeBuffer, this);
		arguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentDirectoryPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentDirectoryPath_IMetInst(){
		return ((currentDirectoryPath_IMetInst != null)
	? (currentDirectoryPath_IMetInst)
	: (currentDirectoryPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentDirectoryPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currentDirectoryPath(){
			final com.apple.jobjc.Invoke.MsgSend currentDirectoryPath_IMetInst = get_currentDirectoryPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentDirectoryPath_IMetInst.init(nativeBuffer, this);
		currentDirectoryPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend environment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_environment_IMetInst(){
		return ((environment_IMetInst != null)
	? (environment_IMetInst)
	: (environment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "environment", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary environment(){
			final com.apple.jobjc.Invoke.MsgSend environment_IMetInst = get_environment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		environment_IMetInst.init(nativeBuffer, this);
		environment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interrupt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interrupt_IMetInst(){
		return ((interrupt_IMetInst != null)
	? (interrupt_IMetInst)
	: (interrupt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interrupt", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void interrupt(){
			final com.apple.jobjc.Invoke.MsgSend interrupt_IMetInst = get_interrupt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interrupt_IMetInst.init(nativeBuffer, this);
		interrupt_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isRunning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRunning_IMetInst(){
		return ((isRunning_IMetInst != null)
	? (isRunning_IMetInst)
	: (isRunning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRunning", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRunning(){
			final com.apple.jobjc.Invoke.MsgSend isRunning_IMetInst = get_isRunning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRunning_IMetInst.init(nativeBuffer, this);
		isRunning_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launch_IMetInst(){
		return ((launch_IMetInst != null)
	? (launch_IMetInst)
	: (launch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launch", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void launch(){
			final com.apple.jobjc.Invoke.MsgSend launch_IMetInst = get_launch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launch_IMetInst.init(nativeBuffer, this);
		launch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend launchPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchPath_IMetInst(){
		return ((launchPath_IMetInst != null)
	? (launchPath_IMetInst)
	: (launchPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString launchPath(){
			final com.apple.jobjc.Invoke.MsgSend launchPath_IMetInst = get_launchPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchPath_IMetInst.init(nativeBuffer, this);
		launchPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend processIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processIdentifier_IMetInst(){
		return ((processIdentifier_IMetInst != null)
	? (processIdentifier_IMetInst)
	: (processIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processIdentifier", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int processIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend processIdentifier_IMetInst = get_processIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processIdentifier_IMetInst.init(nativeBuffer, this);
		processIdentifier_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resume_IMetInst(){
		return ((resume_IMetInst != null)
	? (resume_IMetInst)
	: (resume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resume", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean resume(){
			final com.apple.jobjc.Invoke.MsgSend resume_IMetInst = get_resume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resume_IMetInst.init(nativeBuffer, this);
		resume_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setArguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArguments_IMetInst(){
		return ((setArguments_IMetInst != null)
	? (setArguments_IMetInst)
	: (setArguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArguments:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setArguments(final com.apple.jobjc.foundation.NSArray arguments){
			final com.apple.jobjc.Invoke.MsgSend setArguments_IMetInst = get_setArguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArguments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		setArguments_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentDirectoryPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentDirectoryPath_IMetInst(){
		return ((setCurrentDirectoryPath_IMetInst != null)
	? (setCurrentDirectoryPath_IMetInst)
	: (setCurrentDirectoryPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentDirectoryPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrentDirectoryPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend setCurrentDirectoryPath_IMetInst = get_setCurrentDirectoryPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentDirectoryPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		setCurrentDirectoryPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnvironment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnvironment_IMetInst(){
		return ((setEnvironment_IMetInst != null)
	? (setEnvironment_IMetInst)
	: (setEnvironment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnvironment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setEnvironment(final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend setEnvironment_IMetInst = get_setEnvironment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnvironment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		setEnvironment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLaunchPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLaunchPath_IMetInst(){
		return ((setLaunchPath_IMetInst != null)
	? (setLaunchPath_IMetInst)
	: (setLaunchPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLaunchPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLaunchPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend setLaunchPath_IMetInst = get_setLaunchPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLaunchPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		setLaunchPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardError_IMetInst(){
		return ((setStandardError_IMetInst != null)
	? (setStandardError_IMetInst)
	: (setStandardError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardError(final com.apple.jobjc.ID error){
			final com.apple.jobjc.Invoke.MsgSend setStandardError_IMetInst = get_setStandardError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		setStandardError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardInput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardInput_IMetInst(){
		return ((setStandardInput_IMetInst != null)
	? (setStandardInput_IMetInst)
	: (setStandardInput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardInput:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardInput(final com.apple.jobjc.ID input){
			final com.apple.jobjc.Invoke.MsgSend setStandardInput_IMetInst = get_setStandardInput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardInput_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, input);
		setStandardInput_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandardOutput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandardOutput_IMetInst(){
		return ((setStandardOutput_IMetInst != null)
	? (setStandardOutput_IMetInst)
	: (setStandardOutput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandardOutput:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStandardOutput(final com.apple.jobjc.ID output){
			final com.apple.jobjc.Invoke.MsgSend setStandardOutput_IMetInst = get_setStandardOutput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandardOutput_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, output);
		setStandardOutput_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTerminationHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTerminationHandler_IMetInst(){
		return ((setTerminationHandler_IMetInst != null)
	? (setTerminationHandler_IMetInst)
	: (setTerminationHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTerminationHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setTerminationHandler(final Object /* void(^)(NSTask*) (@, @) */ terminationHandler){
			final com.apple.jobjc.Invoke.MsgSend setTerminationHandler_IMetInst = get_setTerminationHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTerminationHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, terminationHandler);
		setTerminationHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend standardError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardError_IMetInst(){
		return ((standardError_IMetInst != null)
	? (standardError_IMetInst)
	: (standardError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardError", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T standardError(){
			final com.apple.jobjc.Invoke.MsgSend standardError_IMetInst = get_standardError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardError_IMetInst.init(nativeBuffer, this);
		standardError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardInput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardInput_IMetInst(){
		return ((standardInput_IMetInst != null)
	? (standardInput_IMetInst)
	: (standardInput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardInput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T standardInput(){
			final com.apple.jobjc.Invoke.MsgSend standardInput_IMetInst = get_standardInput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardInput_IMetInst.init(nativeBuffer, this);
		standardInput_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardOutput_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardOutput_IMetInst(){
		return ((standardOutput_IMetInst != null)
	? (standardOutput_IMetInst)
	: (standardOutput_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardOutput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T standardOutput(){
			final com.apple.jobjc.Invoke.MsgSend standardOutput_IMetInst = get_standardOutput_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardOutput_IMetInst.init(nativeBuffer, this);
		standardOutput_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend suspend_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspend_IMetInst(){
		return ((suspend_IMetInst != null)
	? (suspend_IMetInst)
	: (suspend_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspend", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean suspend(){
			final com.apple.jobjc.Invoke.MsgSend suspend_IMetInst = get_suspend_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspend_IMetInst.init(nativeBuffer, this);
		suspend_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminate_IMetInst(){
		return ((terminate_IMetInst != null)
	? (terminate_IMetInst)
	: (terminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void terminate(){
			final com.apple.jobjc.Invoke.MsgSend terminate_IMetInst = get_terminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminate_IMetInst.init(nativeBuffer, this);
		terminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend terminationHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminationHandler_IMetInst(){
		return ((terminationHandler_IMetInst != null)
	? (terminationHandler_IMetInst)
	: (terminationHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminationHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(NSTask*) (@, @) */ terminationHandler(){
			final com.apple.jobjc.Invoke.MsgSend terminationHandler_IMetInst = get_terminationHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminationHandler_IMetInst.init(nativeBuffer, this);
		terminationHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(NSTask*) (@, @) */ returnValue = (Object /* void(^)(NSTask*) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminationReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminationReason_IMetInst(){
		return ((terminationReason_IMetInst != null)
	? (terminationReason_IMetInst)
	: (terminationReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminationReason", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long terminationReason(){
			final com.apple.jobjc.Invoke.MsgSend terminationReason_IMetInst = get_terminationReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminationReason_IMetInst.init(nativeBuffer, this);
		terminationReason_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminationStatus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminationStatus_IMetInst(){
		return ((terminationStatus_IMetInst != null)
	? (terminationStatus_IMetInst)
	: (terminationStatus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminationStatus", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int terminationStatus(){
			final com.apple.jobjc.Invoke.MsgSend terminationStatus_IMetInst = get_terminationStatus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminationStatus_IMetInst.init(nativeBuffer, this);
		terminationStatus_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend waitUntilExit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitUntilExit_IMetInst(){
		return ((waitUntilExit_IMetInst != null)
	? (waitUntilExit_IMetInst)
	: (waitUntilExit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitUntilExit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void waitUntilExit(){
			final com.apple.jobjc.Invoke.MsgSend waitUntilExit_IMetInst = get_waitUntilExit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitUntilExit_IMetInst.init(nativeBuffer, this);
		waitUntilExit_IMetInst.invoke(nativeBuffer);
		
		
	}

}
