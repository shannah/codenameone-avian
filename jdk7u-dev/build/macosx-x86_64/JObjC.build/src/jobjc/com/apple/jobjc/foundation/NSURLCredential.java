package com.apple.jobjc.foundation;

public  class NSURLCredential extends com.apple.jobjc.foundation.NSObject {
	public NSURLCredential(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLCredential(final NSURLCredential obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend certificates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_certificates_IMetInst(){
		return ((certificates_IMetInst != null)
	? (certificates_IMetInst)
	: (certificates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "certificates", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray certificates(){
			final com.apple.jobjc.Invoke.MsgSend certificates_IMetInst = get_certificates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		certificates_IMetInst.init(nativeBuffer, this);
		certificates_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasPassword_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasPassword_IMetInst(){
		return ((hasPassword_IMetInst != null)
	? (hasPassword_IMetInst)
	: (hasPassword_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasPassword", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasPassword(){
			final com.apple.jobjc.Invoke.MsgSend hasPassword_IMetInst = get_hasPassword_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasPassword_IMetInst.init(nativeBuffer, this);
		hasPassword_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend identity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identity_IMetInst(){
		return ((identity_IMetInst != null)
	? (identity_IMetInst)
	: (identity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identity", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* SecIdentityRef (^{OpaqueSecIdentityRef}, ^{OpaqueSecIdentityRef}) */ identity(){
			final com.apple.jobjc.Invoke.MsgSend identity_IMetInst = get_identity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identity_IMetInst.init(nativeBuffer, this);
		identity_IMetInst.invoke(nativeBuffer);
		final Object /* SecIdentityRef (^{OpaqueSecIdentityRef}, ^{OpaqueSecIdentityRef}) */ returnValue = (Object /* SecIdentityRef (^{OpaqueSecIdentityRef}, ^{OpaqueSecIdentityRef}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIdentity_certificates_persistence_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIdentity_certificates_persistence_IMetInst(){
		return ((initWithIdentity_certificates_persistence_IMetInst != null)
	? (initWithIdentity_certificates_persistence_IMetInst)
	: (initWithIdentity_certificates_persistence_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIdentity:certificates:persistence:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIdentity_certificates_persistence(final Object /* SecIdentityRef (^{OpaqueSecIdentityRef}, ^{OpaqueSecIdentityRef}) */ identity, final com.apple.jobjc.foundation.NSArray certArray, final long persistence){
			final com.apple.jobjc.Invoke.MsgSend initWithIdentity_certificates_persistence_IMetInst = get_initWithIdentity_certificates_persistence_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIdentity_certificates_persistence_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, identity);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, certArray);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, persistence);
		initWithIdentity_certificates_persistence_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTrust_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTrust_IMetInst(){
		return ((initWithTrust_IMetInst != null)
	? (initWithTrust_IMetInst)
	: (initWithTrust_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTrust:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTrust(final Object /* SecTrustRef (^{OpaqueSecTrustRef}, ^{OpaqueSecTrustRef}) */ trust){
			final com.apple.jobjc.Invoke.MsgSend initWithTrust_IMetInst = get_initWithTrust_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTrust_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, trust);
		initWithTrust_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUser_password_persistence_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUser_password_persistence_IMetInst(){
		return ((initWithUser_password_persistence_IMetInst != null)
	? (initWithUser_password_persistence_IMetInst)
	: (initWithUser_password_persistence_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUser:password:persistence:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUser_password_persistence(final com.apple.jobjc.foundation.NSString user, final com.apple.jobjc.foundation.NSString password, final long persistence){
			final com.apple.jobjc.Invoke.MsgSend initWithUser_password_persistence_IMetInst = get_initWithUser_password_persistence_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUser_password_persistence_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, user);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, password);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, persistence);
		initWithUser_password_persistence_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend password_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_password_IMetInst(){
		return ((password_IMetInst != null)
	? (password_IMetInst)
	: (password_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "password", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString password(){
			final com.apple.jobjc.Invoke.MsgSend password_IMetInst = get_password_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		password_IMetInst.init(nativeBuffer, this);
		password_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend persistence_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_persistence_IMetInst(){
		return ((persistence_IMetInst != null)
	? (persistence_IMetInst)
	: (persistence_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "persistence", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long persistence(){
			final com.apple.jobjc.Invoke.MsgSend persistence_IMetInst = get_persistence_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		persistence_IMetInst.init(nativeBuffer, this);
		persistence_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend user_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_user_IMetInst(){
		return ((user_IMetInst != null)
	? (user_IMetInst)
	: (user_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "user", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString user(){
			final com.apple.jobjc.Invoke.MsgSend user_IMetInst = get_user_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		user_IMetInst.init(nativeBuffer, this);
		user_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
