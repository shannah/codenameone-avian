package com.apple.jobjc.foundation;

public  class NSHTTPCookieStorageClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSHTTPCookieStorageClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHTTPCookieStorageClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHTTPCookieStorageClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedHTTPCookieStorage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedHTTPCookieStorage_CMetInst(){
		return ((sharedHTTPCookieStorage_CMetInst != null)
	? (sharedHTTPCookieStorage_CMetInst)
	: (sharedHTTPCookieStorage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedHTTPCookieStorage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSHTTPCookieStorage sharedHTTPCookieStorage(){
			final com.apple.jobjc.Invoke.MsgSend sharedHTTPCookieStorage_CMetInst = get_sharedHTTPCookieStorage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedHTTPCookieStorage_CMetInst.init(nativeBuffer, this);
		sharedHTTPCookieStorage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSHTTPCookieStorage returnValue = (com.apple.jobjc.foundation.NSHTTPCookieStorage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
