package com.apple.jobjc.foundation;

public  class NSAppleEventManagerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAppleEventManagerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAppleEventManagerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAppleEventManagerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedAppleEventManager_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedAppleEventManager_CMetInst(){
		return ((sharedAppleEventManager_CMetInst != null)
	? (sharedAppleEventManager_CMetInst)
	: (sharedAppleEventManager_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedAppleEventManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventManager sharedAppleEventManager(){
			final com.apple.jobjc.Invoke.MsgSend sharedAppleEventManager_CMetInst = get_sharedAppleEventManager_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedAppleEventManager_CMetInst.init(nativeBuffer, this);
		sharedAppleEventManager_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventManager returnValue = (com.apple.jobjc.foundation.NSAppleEventManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
