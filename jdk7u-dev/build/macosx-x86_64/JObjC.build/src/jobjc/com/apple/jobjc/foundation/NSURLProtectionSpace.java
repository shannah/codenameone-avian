package com.apple.jobjc.foundation;

public  class NSURLProtectionSpace extends com.apple.jobjc.foundation.NSObject {
	public NSURLProtectionSpace(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLProtectionSpace(final NSURLProtectionSpace obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend authenticationMethod_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_authenticationMethod_IMetInst(){
		return ((authenticationMethod_IMetInst != null)
	? (authenticationMethod_IMetInst)
	: (authenticationMethod_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "authenticationMethod", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString authenticationMethod(){
			final com.apple.jobjc.Invoke.MsgSend authenticationMethod_IMetInst = get_authenticationMethod_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		authenticationMethod_IMetInst.init(nativeBuffer, this);
		authenticationMethod_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend distinguishedNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_distinguishedNames_IMetInst(){
		return ((distinguishedNames_IMetInst != null)
	? (distinguishedNames_IMetInst)
	: (distinguishedNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "distinguishedNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray distinguishedNames(){
			final com.apple.jobjc.Invoke.MsgSend distinguishedNames_IMetInst = get_distinguishedNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		distinguishedNames_IMetInst.init(nativeBuffer, this);
		distinguishedNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_host_IMetInst(){
		return ((host_IMetInst != null)
	? (host_IMetInst)
	: (host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "host", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString host(){
			final com.apple.jobjc.Invoke.MsgSend host_IMetInst = get_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		host_IMetInst.init(nativeBuffer, this);
		host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithHost_port_protocol_realm_authenticationMethod_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithHost_port_protocol_realm_authenticationMethod_IMetInst(){
		return ((initWithHost_port_protocol_realm_authenticationMethod_IMetInst != null)
	? (initWithHost_port_protocol_realm_authenticationMethod_IMetInst)
	: (initWithHost_port_protocol_realm_authenticationMethod_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithHost:port:protocol:realm:authenticationMethod:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithHost_port_protocol_realm_authenticationMethod(final com.apple.jobjc.foundation.NSString host, final long port, final com.apple.jobjc.foundation.NSString protocol, final com.apple.jobjc.foundation.NSString realm, final com.apple.jobjc.foundation.NSString authenticationMethod){
			final com.apple.jobjc.Invoke.MsgSend initWithHost_port_protocol_realm_authenticationMethod_IMetInst = get_initWithHost_port_protocol_realm_authenticationMethod_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithHost_port_protocol_realm_authenticationMethod_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, realm);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, authenticationMethod);
		initWithHost_port_protocol_realm_authenticationMethod_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithProxyHost_port_type_realm_authenticationMethod_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithProxyHost_port_type_realm_authenticationMethod_IMetInst(){
		return ((initWithProxyHost_port_type_realm_authenticationMethod_IMetInst != null)
	? (initWithProxyHost_port_type_realm_authenticationMethod_IMetInst)
	: (initWithProxyHost_port_type_realm_authenticationMethod_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithProxyHost:port:type:realm:authenticationMethod:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithProxyHost_port_type_realm_authenticationMethod(final com.apple.jobjc.foundation.NSString host, final long port, final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString realm, final com.apple.jobjc.foundation.NSString authenticationMethod){
			final com.apple.jobjc.Invoke.MsgSend initWithProxyHost_port_type_realm_authenticationMethod_IMetInst = get_initWithProxyHost_port_type_realm_authenticationMethod_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithProxyHost_port_type_realm_authenticationMethod_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, realm);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, authenticationMethod);
		initWithProxyHost_port_type_realm_authenticationMethod_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isProxy_IMetInst(){
		return ((isProxy_IMetInst != null)
	? (isProxy_IMetInst)
	: (isProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isProxy", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isProxy(){
			final com.apple.jobjc.Invoke.MsgSend isProxy_IMetInst = get_isProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isProxy_IMetInst.init(nativeBuffer, this);
		isProxy_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend port_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_port_IMetInst(){
		return ((port_IMetInst != null)
	? (port_IMetInst)
	: (port_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "port", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long port(){
			final com.apple.jobjc.Invoke.MsgSend port_IMetInst = get_port_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		port_IMetInst.init(nativeBuffer, this);
		port_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocol_IMetInst(){
		return ((protocol_IMetInst != null)
	? (protocol_IMetInst)
	: (protocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocol", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString protocol(){
			final com.apple.jobjc.Invoke.MsgSend protocol_IMetInst = get_protocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocol_IMetInst.init(nativeBuffer, this);
		protocol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend proxyType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_proxyType_IMetInst(){
		return ((proxyType_IMetInst != null)
	? (proxyType_IMetInst)
	: (proxyType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "proxyType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString proxyType(){
			final com.apple.jobjc.Invoke.MsgSend proxyType_IMetInst = get_proxyType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		proxyType_IMetInst.init(nativeBuffer, this);
		proxyType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend realm_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_realm_IMetInst(){
		return ((realm_IMetInst != null)
	? (realm_IMetInst)
	: (realm_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "realm", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString realm(){
			final com.apple.jobjc.Invoke.MsgSend realm_IMetInst = get_realm_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		realm_IMetInst.init(nativeBuffer, this);
		realm_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend receivesCredentialSecurely_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_receivesCredentialSecurely_IMetInst(){
		return ((receivesCredentialSecurely_IMetInst != null)
	? (receivesCredentialSecurely_IMetInst)
	: (receivesCredentialSecurely_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "receivesCredentialSecurely", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean receivesCredentialSecurely(){
			final com.apple.jobjc.Invoke.MsgSend receivesCredentialSecurely_IMetInst = get_receivesCredentialSecurely_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		receivesCredentialSecurely_IMetInst.init(nativeBuffer, this);
		receivesCredentialSecurely_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend serverTrust_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serverTrust_IMetInst(){
		return ((serverTrust_IMetInst != null)
	? (serverTrust_IMetInst)
	: (serverTrust_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serverTrust", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* SecTrustRef (^{OpaqueSecTrustRef}, ^{OpaqueSecTrustRef}) */ serverTrust(){
			final com.apple.jobjc.Invoke.MsgSend serverTrust_IMetInst = get_serverTrust_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serverTrust_IMetInst.init(nativeBuffer, this);
		serverTrust_IMetInst.invoke(nativeBuffer);
		final Object /* SecTrustRef (^{OpaqueSecTrustRef}, ^{OpaqueSecTrustRef}) */ returnValue = (Object /* SecTrustRef (^{OpaqueSecTrustRef}, ^{OpaqueSecTrustRef}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
