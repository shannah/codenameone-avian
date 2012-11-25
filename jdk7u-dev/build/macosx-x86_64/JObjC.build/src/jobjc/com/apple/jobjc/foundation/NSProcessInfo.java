package com.apple.jobjc.foundation;

public  class NSProcessInfo extends com.apple.jobjc.foundation.NSObject {
	public NSProcessInfo(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSProcessInfo(final NSProcessInfo obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend activeProcessorCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activeProcessorCount_IMetInst(){
		return ((activeProcessorCount_IMetInst != null)
	? (activeProcessorCount_IMetInst)
	: (activeProcessorCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activeProcessorCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long activeProcessorCount(){
			final com.apple.jobjc.Invoke.MsgSend activeProcessorCount_IMetInst = get_activeProcessorCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activeProcessorCount_IMetInst.init(nativeBuffer, this);
		activeProcessorCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend automaticTerminationSupportEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticTerminationSupportEnabled_IMetInst(){
		return ((automaticTerminationSupportEnabled_IMetInst != null)
	? (automaticTerminationSupportEnabled_IMetInst)
	: (automaticTerminationSupportEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticTerminationSupportEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean automaticTerminationSupportEnabled(){
			final com.apple.jobjc.Invoke.MsgSend automaticTerminationSupportEnabled_IMetInst = get_automaticTerminationSupportEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticTerminationSupportEnabled_IMetInst.init(nativeBuffer, this);
		automaticTerminationSupportEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend disableAutomaticTermination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableAutomaticTermination_IMetInst(){
		return ((disableAutomaticTermination_IMetInst != null)
	? (disableAutomaticTermination_IMetInst)
	: (disableAutomaticTermination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableAutomaticTermination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void disableAutomaticTermination(final com.apple.jobjc.foundation.NSString reason){
			final com.apple.jobjc.Invoke.MsgSend disableAutomaticTermination_IMetInst = get_disableAutomaticTermination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableAutomaticTermination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		disableAutomaticTermination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableSuddenTermination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableSuddenTermination_IMetInst(){
		return ((disableSuddenTermination_IMetInst != null)
	? (disableSuddenTermination_IMetInst)
	: (disableSuddenTermination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableSuddenTermination", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableSuddenTermination(){
			final com.apple.jobjc.Invoke.MsgSend disableSuddenTermination_IMetInst = get_disableSuddenTermination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableSuddenTermination_IMetInst.init(nativeBuffer, this);
		disableSuddenTermination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableAutomaticTermination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableAutomaticTermination_IMetInst(){
		return ((enableAutomaticTermination_IMetInst != null)
	? (enableAutomaticTermination_IMetInst)
	: (enableAutomaticTermination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableAutomaticTermination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void enableAutomaticTermination(final com.apple.jobjc.foundation.NSString reason){
			final com.apple.jobjc.Invoke.MsgSend enableAutomaticTermination_IMetInst = get_enableAutomaticTermination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableAutomaticTermination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		enableAutomaticTermination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableSuddenTermination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableSuddenTermination_IMetInst(){
		return ((enableSuddenTermination_IMetInst != null)
	? (enableSuddenTermination_IMetInst)
	: (enableSuddenTermination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableSuddenTermination", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableSuddenTermination(){
			final com.apple.jobjc.Invoke.MsgSend enableSuddenTermination_IMetInst = get_enableSuddenTermination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableSuddenTermination_IMetInst.init(nativeBuffer, this);
		enableSuddenTermination_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend globallyUniqueString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_globallyUniqueString_IMetInst(){
		return ((globallyUniqueString_IMetInst != null)
	? (globallyUniqueString_IMetInst)
	: (globallyUniqueString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "globallyUniqueString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString globallyUniqueString(){
			final com.apple.jobjc.Invoke.MsgSend globallyUniqueString_IMetInst = get_globallyUniqueString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		globallyUniqueString_IMetInst.init(nativeBuffer, this);
		globallyUniqueString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hostName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hostName_IMetInst(){
		return ((hostName_IMetInst != null)
	? (hostName_IMetInst)
	: (hostName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hostName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString hostName(){
			final com.apple.jobjc.Invoke.MsgSend hostName_IMetInst = get_hostName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hostName_IMetInst.init(nativeBuffer, this);
		hostName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operatingSystem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operatingSystem_IMetInst(){
		return ((operatingSystem_IMetInst != null)
	? (operatingSystem_IMetInst)
	: (operatingSystem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operatingSystem", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long operatingSystem(){
			final com.apple.jobjc.Invoke.MsgSend operatingSystem_IMetInst = get_operatingSystem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operatingSystem_IMetInst.init(nativeBuffer, this);
		operatingSystem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operatingSystemName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operatingSystemName_IMetInst(){
		return ((operatingSystemName_IMetInst != null)
	? (operatingSystemName_IMetInst)
	: (operatingSystemName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operatingSystemName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString operatingSystemName(){
			final com.apple.jobjc.Invoke.MsgSend operatingSystemName_IMetInst = get_operatingSystemName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operatingSystemName_IMetInst.init(nativeBuffer, this);
		operatingSystemName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operatingSystemVersionString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operatingSystemVersionString_IMetInst(){
		return ((operatingSystemVersionString_IMetInst != null)
	? (operatingSystemVersionString_IMetInst)
	: (operatingSystemVersionString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operatingSystemVersionString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString operatingSystemVersionString(){
			final com.apple.jobjc.Invoke.MsgSend operatingSystemVersionString_IMetInst = get_operatingSystemVersionString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operatingSystemVersionString_IMetInst.init(nativeBuffer, this);
		operatingSystemVersionString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend physicalMemory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_physicalMemory_IMetInst(){
		return ((physicalMemory_IMetInst != null)
	? (physicalMemory_IMetInst)
	: (physicalMemory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "physicalMemory", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long physicalMemory(){
			final com.apple.jobjc.Invoke.MsgSend physicalMemory_IMetInst = get_physicalMemory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		physicalMemory_IMetInst.init(nativeBuffer, this);
		physicalMemory_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend processName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processName_IMetInst(){
		return ((processName_IMetInst != null)
	? (processName_IMetInst)
	: (processName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString processName(){
			final com.apple.jobjc.Invoke.MsgSend processName_IMetInst = get_processName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processName_IMetInst.init(nativeBuffer, this);
		processName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend processorCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processorCount_IMetInst(){
		return ((processorCount_IMetInst != null)
	? (processorCount_IMetInst)
	: (processorCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processorCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long processorCount(){
			final com.apple.jobjc.Invoke.MsgSend processorCount_IMetInst = get_processorCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processorCount_IMetInst.init(nativeBuffer, this);
		processorCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticTerminationSupportEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticTerminationSupportEnabled_IMetInst(){
		return ((setAutomaticTerminationSupportEnabled_IMetInst != null)
	? (setAutomaticTerminationSupportEnabled_IMetInst)
	: (setAutomaticTerminationSupportEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticTerminationSupportEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticTerminationSupportEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticTerminationSupportEnabled_IMetInst = get_setAutomaticTerminationSupportEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticTerminationSupportEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticTerminationSupportEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setProcessName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProcessName_IMetInst(){
		return ((setProcessName_IMetInst != null)
	? (setProcessName_IMetInst)
	: (setProcessName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProcessName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setProcessName(final com.apple.jobjc.foundation.NSString newName){
			final com.apple.jobjc.Invoke.MsgSend setProcessName_IMetInst = get_setProcessName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProcessName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newName);
		setProcessName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemUptime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemUptime_IMetInst(){
		return ((systemUptime_IMetInst != null)
	? (systemUptime_IMetInst)
	: (systemUptime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemUptime", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double systemUptime(){
			final com.apple.jobjc.Invoke.MsgSend systemUptime_IMetInst = get_systemUptime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemUptime_IMetInst.init(nativeBuffer, this);
		systemUptime_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
