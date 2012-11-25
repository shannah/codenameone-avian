package com.apple.jobjc.foundation;

public  class NSConnectionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSConnectionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSConnectionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSConnectionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allConnections_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allConnections_CMetInst(){
		return ((allConnections_CMetInst != null)
	? (allConnections_CMetInst)
	: (allConnections_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allConnections", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allConnections(){
			final com.apple.jobjc.Invoke.MsgSend allConnections_CMetInst = get_allConnections_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allConnections_CMetInst.init(nativeBuffer, this);
		allConnections_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionWithReceivePort_sendPort_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionWithReceivePort_sendPort_CMetInst(){
		return ((connectionWithReceivePort_sendPort_CMetInst != null)
	? (connectionWithReceivePort_sendPort_CMetInst)
	: (connectionWithReceivePort_sendPort_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionWithReceivePort:sendPort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T connectionWithReceivePort_sendPort(final com.apple.jobjc.foundation.NSPort receivePort, final com.apple.jobjc.foundation.NSPort sendPort){
			final com.apple.jobjc.Invoke.MsgSend connectionWithReceivePort_sendPort_CMetInst = get_connectionWithReceivePort_sendPort_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionWithReceivePort_sendPort_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receivePort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendPort);
		connectionWithReceivePort_sendPort_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionWithRegisteredName_host_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionWithRegisteredName_host_CMetInst(){
		return ((connectionWithRegisteredName_host_CMetInst != null)
	? (connectionWithRegisteredName_host_CMetInst)
	: (connectionWithRegisteredName_host_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionWithRegisteredName:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T connectionWithRegisteredName_host(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString hostName){
			final com.apple.jobjc.Invoke.MsgSend connectionWithRegisteredName_host_CMetInst = get_connectionWithRegisteredName_host_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionWithRegisteredName_host_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		connectionWithRegisteredName_host_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionWithRegisteredName_host_usingNameServer_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionWithRegisteredName_host_usingNameServer_CMetInst(){
		return ((connectionWithRegisteredName_host_usingNameServer_CMetInst != null)
	? (connectionWithRegisteredName_host_usingNameServer_CMetInst)
	: (connectionWithRegisteredName_host_usingNameServer_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionWithRegisteredName:host:usingNameServer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T connectionWithRegisteredName_host_usingNameServer(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString hostName, final com.apple.jobjc.foundation.NSPortNameServer server){
			final com.apple.jobjc.Invoke.MsgSend connectionWithRegisteredName_host_usingNameServer_CMetInst = get_connectionWithRegisteredName_host_usingNameServer_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionWithRegisteredName_host_usingNameServer_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, server);
		connectionWithRegisteredName_host_usingNameServer_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentConversation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentConversation_CMetInst(){
		return ((currentConversation_CMetInst != null)
	? (currentConversation_CMetInst)
	: (currentConversation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentConversation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T currentConversation(){
			final com.apple.jobjc.Invoke.MsgSend currentConversation_CMetInst = get_currentConversation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentConversation_CMetInst.init(nativeBuffer, this);
		currentConversation_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultConnection_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultConnection_CMetInst(){
		return ((defaultConnection_CMetInst != null)
	? (defaultConnection_CMetInst)
	: (defaultConnection_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultConnection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSConnection defaultConnection(){
			final com.apple.jobjc.Invoke.MsgSend defaultConnection_CMetInst = get_defaultConnection_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultConnection_CMetInst.init(nativeBuffer, this);
		defaultConnection_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSConnection returnValue = (com.apple.jobjc.foundation.NSConnection) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rootProxyForConnectionWithRegisteredName_host_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootProxyForConnectionWithRegisteredName_host_CMetInst(){
		return ((rootProxyForConnectionWithRegisteredName_host_CMetInst != null)
	? (rootProxyForConnectionWithRegisteredName_host_CMetInst)
	: (rootProxyForConnectionWithRegisteredName_host_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootProxyForConnectionWithRegisteredName:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistantObject rootProxyForConnectionWithRegisteredName_host(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString hostName){
			final com.apple.jobjc.Invoke.MsgSend rootProxyForConnectionWithRegisteredName_host_CMetInst = get_rootProxyForConnectionWithRegisteredName_host_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootProxyForConnectionWithRegisteredName_host_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		rootProxyForConnectionWithRegisteredName_host_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistantObject returnValue = (com.apple.jobjc.foundation.NSDistantObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst(){
		return ((rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst != null)
	? (rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst)
	: (rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootProxyForConnectionWithRegisteredName:host:usingNameServer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistantObject rootProxyForConnectionWithRegisteredName_host_usingNameServer(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString hostName, final com.apple.jobjc.foundation.NSPortNameServer server){
			final com.apple.jobjc.Invoke.MsgSend rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst = get_rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, server);
		rootProxyForConnectionWithRegisteredName_host_usingNameServer_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistantObject returnValue = (com.apple.jobjc.foundation.NSDistantObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend serviceConnectionWithName_rootObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serviceConnectionWithName_rootObject_CMetInst(){
		return ((serviceConnectionWithName_rootObject_CMetInst != null)
	? (serviceConnectionWithName_rootObject_CMetInst)
	: (serviceConnectionWithName_rootObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serviceConnectionWithName:rootObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T serviceConnectionWithName_rootObject(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.ID root){
			final com.apple.jobjc.Invoke.MsgSend serviceConnectionWithName_rootObject_CMetInst = get_serviceConnectionWithName_rootObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serviceConnectionWithName_rootObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, root);
		serviceConnectionWithName_rootObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend serviceConnectionWithName_rootObject_usingNameServer_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serviceConnectionWithName_rootObject_usingNameServer_CMetInst(){
		return ((serviceConnectionWithName_rootObject_usingNameServer_CMetInst != null)
	? (serviceConnectionWithName_rootObject_usingNameServer_CMetInst)
	: (serviceConnectionWithName_rootObject_usingNameServer_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serviceConnectionWithName:rootObject:usingNameServer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T serviceConnectionWithName_rootObject_usingNameServer(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.ID root, final com.apple.jobjc.foundation.NSPortNameServer server){
			final com.apple.jobjc.Invoke.MsgSend serviceConnectionWithName_rootObject_usingNameServer_CMetInst = get_serviceConnectionWithName_rootObject_usingNameServer_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serviceConnectionWithName_rootObject_usingNameServer_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, root);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, server);
		serviceConnectionWithName_rootObject_usingNameServer_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
