package com.apple.jobjc.foundation;

public  class NSUbiquitousKeyValueStoreClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSUbiquitousKeyValueStoreClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUbiquitousKeyValueStoreClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUbiquitousKeyValueStoreClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultStore_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultStore_CMetInst(){
		return ((defaultStore_CMetInst != null)
	? (defaultStore_CMetInst)
	: (defaultStore_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultStore", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUbiquitousKeyValueStore defaultStore(){
			final com.apple.jobjc.Invoke.MsgSend defaultStore_CMetInst = get_defaultStore_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultStore_CMetInst.init(nativeBuffer, this);
		defaultStore_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUbiquitousKeyValueStore returnValue = (com.apple.jobjc.foundation.NSUbiquitousKeyValueStore) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
