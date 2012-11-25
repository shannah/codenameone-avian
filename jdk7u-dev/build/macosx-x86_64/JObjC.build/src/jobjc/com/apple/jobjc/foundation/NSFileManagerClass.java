package com.apple.jobjc.foundation;

public  class NSFileManagerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFileManagerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFileManagerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFileManagerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultManager_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultManager_CMetInst(){
		return ((defaultManager_CMetInst != null)
	? (defaultManager_CMetInst)
	: (defaultManager_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileManager defaultManager(){
			final com.apple.jobjc.Invoke.MsgSend defaultManager_CMetInst = get_defaultManager_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultManager_CMetInst.init(nativeBuffer, this);
		defaultManager_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileManager returnValue = (com.apple.jobjc.foundation.NSFileManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
