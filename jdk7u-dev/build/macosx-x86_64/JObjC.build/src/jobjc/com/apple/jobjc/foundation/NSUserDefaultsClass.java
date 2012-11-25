package com.apple.jobjc.foundation;

public  class NSUserDefaultsClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSUserDefaultsClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUserDefaultsClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUserDefaultsClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend resetStandardUserDefaults_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetStandardUserDefaults_CMetInst(){
		return ((resetStandardUserDefaults_CMetInst != null)
	? (resetStandardUserDefaults_CMetInst)
	: (resetStandardUserDefaults_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetStandardUserDefaults", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetStandardUserDefaults(){
			final com.apple.jobjc.Invoke.MsgSend resetStandardUserDefaults_CMetInst = get_resetStandardUserDefaults_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetStandardUserDefaults_CMetInst.init(nativeBuffer, this);
		resetStandardUserDefaults_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend standardUserDefaults_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardUserDefaults_CMetInst(){
		return ((standardUserDefaults_CMetInst != null)
	? (standardUserDefaults_CMetInst)
	: (standardUserDefaults_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardUserDefaults", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUserDefaults standardUserDefaults(){
			final com.apple.jobjc.Invoke.MsgSend standardUserDefaults_CMetInst = get_standardUserDefaults_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardUserDefaults_CMetInst.init(nativeBuffer, this);
		standardUserDefaults_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUserDefaults returnValue = (com.apple.jobjc.foundation.NSUserDefaults) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
