package com.apple.jobjc.appkit;

public  class NSResponderClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSResponderClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSResponderClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSResponderClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend restorableStateKeyPaths_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restorableStateKeyPaths_CMetInst(){
		return ((restorableStateKeyPaths_CMetInst != null)
	? (restorableStateKeyPaths_CMetInst)
	: (restorableStateKeyPaths_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restorableStateKeyPaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray restorableStateKeyPaths(){
			final com.apple.jobjc.Invoke.MsgSend restorableStateKeyPaths_CMetInst = get_restorableStateKeyPaths_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restorableStateKeyPaths_CMetInst.init(nativeBuffer, this);
		restorableStateKeyPaths_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
