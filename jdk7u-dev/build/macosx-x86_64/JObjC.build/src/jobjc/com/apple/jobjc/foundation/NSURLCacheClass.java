package com.apple.jobjc.foundation;

public  class NSURLCacheClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLCacheClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLCacheClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLCacheClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend setSharedURLCache_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSharedURLCache_CMetInst(){
		return ((setSharedURLCache_CMetInst != null)
	? (setSharedURLCache_CMetInst)
	: (setSharedURLCache_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSharedURLCache:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSharedURLCache(final com.apple.jobjc.foundation.NSURLCache cache){
			final com.apple.jobjc.Invoke.MsgSend setSharedURLCache_CMetInst = get_setSharedURLCache_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSharedURLCache_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cache);
		setSharedURLCache_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedURLCache_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedURLCache_CMetInst(){
		return ((sharedURLCache_CMetInst != null)
	? (sharedURLCache_CMetInst)
	: (sharedURLCache_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedURLCache", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLCache sharedURLCache(){
			final com.apple.jobjc.Invoke.MsgSend sharedURLCache_CMetInst = get_sharedURLCache_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedURLCache_CMetInst.init(nativeBuffer, this);
		sharedURLCache_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCache returnValue = (com.apple.jobjc.foundation.NSURLCache) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
