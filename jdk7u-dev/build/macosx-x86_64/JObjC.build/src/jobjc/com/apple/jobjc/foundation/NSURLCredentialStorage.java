package com.apple.jobjc.foundation;

public  class NSURLCredentialStorage extends com.apple.jobjc.foundation.NSObject {
	public NSURLCredentialStorage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLCredentialStorage(final NSURLCredentialStorage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allCredentials_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allCredentials_IMetInst(){
		return ((allCredentials_IMetInst != null)
	? (allCredentials_IMetInst)
	: (allCredentials_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allCredentials", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary allCredentials(){
			final com.apple.jobjc.Invoke.MsgSend allCredentials_IMetInst = get_allCredentials_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allCredentials_IMetInst.init(nativeBuffer, this);
		allCredentials_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend credentialsForProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_credentialsForProtectionSpace_IMetInst(){
		return ((credentialsForProtectionSpace_IMetInst != null)
	? (credentialsForProtectionSpace_IMetInst)
	: (credentialsForProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "credentialsForProtectionSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary credentialsForProtectionSpace(final com.apple.jobjc.foundation.NSURLProtectionSpace space){
			final com.apple.jobjc.Invoke.MsgSend credentialsForProtectionSpace_IMetInst = get_credentialsForProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		credentialsForProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		credentialsForProtectionSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultCredentialForProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultCredentialForProtectionSpace_IMetInst(){
		return ((defaultCredentialForProtectionSpace_IMetInst != null)
	? (defaultCredentialForProtectionSpace_IMetInst)
	: (defaultCredentialForProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultCredentialForProtectionSpace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLCredential defaultCredentialForProtectionSpace(final com.apple.jobjc.foundation.NSURLProtectionSpace space){
			final com.apple.jobjc.Invoke.MsgSend defaultCredentialForProtectionSpace_IMetInst = get_defaultCredentialForProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultCredentialForProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		defaultCredentialForProtectionSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredential returnValue = (com.apple.jobjc.foundation.NSURLCredential) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCredential_forProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCredential_forProtectionSpace_IMetInst(){
		return ((removeCredential_forProtectionSpace_IMetInst != null)
	? (removeCredential_forProtectionSpace_IMetInst)
	: (removeCredential_forProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCredential:forProtectionSpace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeCredential_forProtectionSpace(final com.apple.jobjc.foundation.NSURLCredential credential, final com.apple.jobjc.foundation.NSURLProtectionSpace space){
			final com.apple.jobjc.Invoke.MsgSend removeCredential_forProtectionSpace_IMetInst = get_removeCredential_forProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCredential_forProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, credential);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		removeCredential_forProtectionSpace_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCredential_forProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCredential_forProtectionSpace_IMetInst(){
		return ((setCredential_forProtectionSpace_IMetInst != null)
	? (setCredential_forProtectionSpace_IMetInst)
	: (setCredential_forProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCredential:forProtectionSpace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCredential_forProtectionSpace(final com.apple.jobjc.foundation.NSURLCredential credential, final com.apple.jobjc.foundation.NSURLProtectionSpace space){
			final com.apple.jobjc.Invoke.MsgSend setCredential_forProtectionSpace_IMetInst = get_setCredential_forProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCredential_forProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, credential);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		setCredential_forProtectionSpace_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultCredential_forProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultCredential_forProtectionSpace_IMetInst(){
		return ((setDefaultCredential_forProtectionSpace_IMetInst != null)
	? (setDefaultCredential_forProtectionSpace_IMetInst)
	: (setDefaultCredential_forProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultCredential:forProtectionSpace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultCredential_forProtectionSpace(final com.apple.jobjc.foundation.NSURLCredential credential, final com.apple.jobjc.foundation.NSURLProtectionSpace space){
			final com.apple.jobjc.Invoke.MsgSend setDefaultCredential_forProtectionSpace_IMetInst = get_setDefaultCredential_forProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultCredential_forProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, credential);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		setDefaultCredential_forProtectionSpace_IMetInst.invoke(nativeBuffer);
		
		
	}

}
