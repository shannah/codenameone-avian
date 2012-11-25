package com.apple.jobjc.foundation;

public  class NSDistributedLockClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDistributedLockClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDistributedLockClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDistributedLockClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend lockWithPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockWithPath_CMetInst(){
		return ((lockWithPath_CMetInst != null)
	? (lockWithPath_CMetInst)
	: (lockWithPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistributedLock lockWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend lockWithPath_CMetInst = get_lockWithPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockWithPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		lockWithPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistributedLock returnValue = (com.apple.jobjc.foundation.NSDistributedLock) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
