package com.apple.jobjc.appkit;

public  class NSRunningApplicationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSRunningApplicationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSRunningApplicationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSRunningApplicationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentApplication_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentApplication_CMetInst(){
		return ((currentApplication_CMetInst != null)
	? (currentApplication_CMetInst)
	: (currentApplication_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentApplication", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRunningApplication currentApplication(){
			final com.apple.jobjc.Invoke.MsgSend currentApplication_CMetInst = get_currentApplication_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentApplication_CMetInst.init(nativeBuffer, this);
		currentApplication_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRunningApplication returnValue = (com.apple.jobjc.appkit.NSRunningApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runningApplicationWithProcessIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runningApplicationWithProcessIdentifier_CMetInst(){
		return ((runningApplicationWithProcessIdentifier_CMetInst != null)
	? (runningApplicationWithProcessIdentifier_CMetInst)
	: (runningApplicationWithProcessIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runningApplicationWithProcessIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRunningApplication runningApplicationWithProcessIdentifier(final int pid){
			final com.apple.jobjc.Invoke.MsgSend runningApplicationWithProcessIdentifier_CMetInst = get_runningApplicationWithProcessIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runningApplicationWithProcessIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, pid);
		runningApplicationWithProcessIdentifier_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRunningApplication returnValue = (com.apple.jobjc.appkit.NSRunningApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runningApplicationsWithBundleIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runningApplicationsWithBundleIdentifier_CMetInst(){
		return ((runningApplicationsWithBundleIdentifier_CMetInst != null)
	? (runningApplicationsWithBundleIdentifier_CMetInst)
	: (runningApplicationsWithBundleIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runningApplicationsWithBundleIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray runningApplicationsWithBundleIdentifier(final com.apple.jobjc.foundation.NSString bundleIdentifier){
			final com.apple.jobjc.Invoke.MsgSend runningApplicationsWithBundleIdentifier_CMetInst = get_runningApplicationsWithBundleIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runningApplicationsWithBundleIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleIdentifier);
		runningApplicationsWithBundleIdentifier_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminateAutomaticallyTerminableApplications_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminateAutomaticallyTerminableApplications_CMetInst(){
		return ((terminateAutomaticallyTerminableApplications_CMetInst != null)
	? (terminateAutomaticallyTerminableApplications_CMetInst)
	: (terminateAutomaticallyTerminableApplications_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminateAutomaticallyTerminableApplications", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void terminateAutomaticallyTerminableApplications(){
			final com.apple.jobjc.Invoke.MsgSend terminateAutomaticallyTerminableApplications_CMetInst = get_terminateAutomaticallyTerminableApplications_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminateAutomaticallyTerminableApplications_CMetInst.init(nativeBuffer, this);
		terminateAutomaticallyTerminableApplications_CMetInst.invoke(nativeBuffer);
		
		
	}

}
