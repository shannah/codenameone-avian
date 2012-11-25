package com.apple.jobjc.foundation;

public  class NSHostClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSHostClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHostClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHostClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentHost_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentHost_CMetInst(){
		return ((currentHost_CMetInst != null)
	? (currentHost_CMetInst)
	: (currentHost_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentHost", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHost currentHost(){
			final com.apple.jobjc.Invoke.MsgSend currentHost_CMetInst = get_currentHost_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentHost_CMetInst.init(nativeBuffer, this);
		currentHost_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHost returnValue = (com.apple.jobjc.foundation.NSHost) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flushHostCache_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushHostCache_CMetInst(){
		return ((flushHostCache_CMetInst != null)
	? (flushHostCache_CMetInst)
	: (flushHostCache_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushHostCache", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushHostCache(){
			final com.apple.jobjc.Invoke.MsgSend flushHostCache_CMetInst = get_flushHostCache_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushHostCache_CMetInst.init(nativeBuffer, this);
		flushHostCache_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hostWithAddress_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hostWithAddress_CMetInst(){
		return ((hostWithAddress_CMetInst != null)
	? (hostWithAddress_CMetInst)
	: (hostWithAddress_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hostWithAddress:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHost hostWithAddress(final com.apple.jobjc.foundation.NSString address){
			final com.apple.jobjc.Invoke.MsgSend hostWithAddress_CMetInst = get_hostWithAddress_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hostWithAddress_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, address);
		hostWithAddress_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHost returnValue = (com.apple.jobjc.foundation.NSHost) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hostWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hostWithName_CMetInst(){
		return ((hostWithName_CMetInst != null)
	? (hostWithName_CMetInst)
	: (hostWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hostWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHost hostWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend hostWithName_CMetInst = get_hostWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hostWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		hostWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHost returnValue = (com.apple.jobjc.foundation.NSHost) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHostCacheEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHostCacheEnabled_CMetInst(){
		return ((isHostCacheEnabled_CMetInst != null)
	? (isHostCacheEnabled_CMetInst)
	: (isHostCacheEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHostCacheEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHostCacheEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isHostCacheEnabled_CMetInst = get_isHostCacheEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHostCacheEnabled_CMetInst.init(nativeBuffer, this);
		isHostCacheEnabled_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setHostCacheEnabled_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHostCacheEnabled_CMetInst(){
		return ((setHostCacheEnabled_CMetInst != null)
	? (setHostCacheEnabled_CMetInst)
	: (setHostCacheEnabled_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHostCacheEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHostCacheEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHostCacheEnabled_CMetInst = get_setHostCacheEnabled_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHostCacheEnabled_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHostCacheEnabled_CMetInst.invoke(nativeBuffer);
		
		
	}

}
