package com.apple.jobjc.foundation;

public  class NSURLCredentialClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLCredentialClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLCredentialClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLCredentialClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend credentialForTrust_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_credentialForTrust_CMetInst(){
		return ((credentialForTrust_CMetInst != null)
	? (credentialForTrust_CMetInst)
	: (credentialForTrust_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "credentialForTrust:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLCredential credentialForTrust(final Object /* SecTrustRef (^{OpaqueSecTrustRef}, ^{OpaqueSecTrustRef}) */ trust){
			final com.apple.jobjc.Invoke.MsgSend credentialForTrust_CMetInst = get_credentialForTrust_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		credentialForTrust_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, trust);
		credentialForTrust_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredential returnValue = (com.apple.jobjc.foundation.NSURLCredential) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend credentialWithIdentity_certificates_persistence_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_credentialWithIdentity_certificates_persistence_CMetInst(){
		return ((credentialWithIdentity_certificates_persistence_CMetInst != null)
	? (credentialWithIdentity_certificates_persistence_CMetInst)
	: (credentialWithIdentity_certificates_persistence_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "credentialWithIdentity:certificates:persistence:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSURLCredential credentialWithIdentity_certificates_persistence(final Object /* SecIdentityRef (^{OpaqueSecIdentityRef}, ^{OpaqueSecIdentityRef}) */ identity, final com.apple.jobjc.foundation.NSArray certArray, final long persistence){
			final com.apple.jobjc.Invoke.MsgSend credentialWithIdentity_certificates_persistence_CMetInst = get_credentialWithIdentity_certificates_persistence_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		credentialWithIdentity_certificates_persistence_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, identity);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, certArray);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, persistence);
		credentialWithIdentity_certificates_persistence_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredential returnValue = (com.apple.jobjc.foundation.NSURLCredential) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend credentialWithUser_password_persistence_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_credentialWithUser_password_persistence_CMetInst(){
		return ((credentialWithUser_password_persistence_CMetInst != null)
	? (credentialWithUser_password_persistence_CMetInst)
	: (credentialWithUser_password_persistence_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "credentialWithUser:password:persistence:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSURLCredential credentialWithUser_password_persistence(final com.apple.jobjc.foundation.NSString user, final com.apple.jobjc.foundation.NSString password, final long persistence){
			final com.apple.jobjc.Invoke.MsgSend credentialWithUser_password_persistence_CMetInst = get_credentialWithUser_password_persistence_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		credentialWithUser_password_persistence_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, user);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, password);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, persistence);
		credentialWithUser_password_persistence_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredential returnValue = (com.apple.jobjc.foundation.NSURLCredential) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
