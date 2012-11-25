package com.apple.jobjc.foundation;

public  class NSURLCredentialStorageClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLCredentialStorageClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLCredentialStorageClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLCredentialStorageClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedCredentialStorage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedCredentialStorage_CMetInst(){
		return ((sharedCredentialStorage_CMetInst != null)
	? (sharedCredentialStorage_CMetInst)
	: (sharedCredentialStorage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedCredentialStorage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLCredentialStorage sharedCredentialStorage(){
			final com.apple.jobjc.Invoke.MsgSend sharedCredentialStorage_CMetInst = get_sharedCredentialStorage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedCredentialStorage_CMetInst.init(nativeBuffer, this);
		sharedCredentialStorage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredentialStorage returnValue = (com.apple.jobjc.foundation.NSURLCredentialStorage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
