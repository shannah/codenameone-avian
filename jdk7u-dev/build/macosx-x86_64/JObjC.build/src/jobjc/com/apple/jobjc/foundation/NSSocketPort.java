package com.apple.jobjc.foundation;

public  class NSSocketPort extends com.apple.jobjc.foundation.NSPort {
	public NSSocketPort(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSocketPort(final NSSocketPort obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend address_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_address_IMetInst(){
		return ((address_IMetInst != null)
	? (address_IMetInst)
	: (address_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "address", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData address(){
			final com.apple.jobjc.Invoke.MsgSend address_IMetInst = get_address_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		address_IMetInst.init(nativeBuffer, this);
		address_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst(){
		return ((initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst != null)
	? (initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst)
	: (initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initRemoteWithProtocolFamily:socketType:protocol:address:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initRemoteWithProtocolFamily_socketType_protocol_address(final int family, final int type, final int protocol, final com.apple.jobjc.foundation.NSData address){
			final com.apple.jobjc.Invoke.MsgSend initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst = get_initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, address);
		initRemoteWithProtocolFamily_socketType_protocol_address_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initRemoteWithTCPPort_host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initRemoteWithTCPPort_host_IMetInst(){
		return ((initRemoteWithTCPPort_host_IMetInst != null)
	? (initRemoteWithTCPPort_host_IMetInst)
	: (initRemoteWithTCPPort_host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initRemoteWithTCPPort:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initRemoteWithTCPPort_host(final short port, final com.apple.jobjc.foundation.NSString hostName){
			final com.apple.jobjc.Invoke.MsgSend initRemoteWithTCPPort_host_IMetInst = get_initRemoteWithTCPPort_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initRemoteWithTCPPort_host_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hostName);
		initRemoteWithTCPPort_host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithProtocolFamily_socketType_protocol_address_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithProtocolFamily_socketType_protocol_address_IMetInst(){
		return ((initWithProtocolFamily_socketType_protocol_address_IMetInst != null)
	? (initWithProtocolFamily_socketType_protocol_address_IMetInst)
	: (initWithProtocolFamily_socketType_protocol_address_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithProtocolFamily:socketType:protocol:address:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithProtocolFamily_socketType_protocol_address(final int family, final int type, final int protocol, final com.apple.jobjc.foundation.NSData address){
			final com.apple.jobjc.Invoke.MsgSend initWithProtocolFamily_socketType_protocol_address_IMetInst = get_initWithProtocolFamily_socketType_protocol_address_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithProtocolFamily_socketType_protocol_address_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, address);
		initWithProtocolFamily_socketType_protocol_address_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithProtocolFamily_socketType_protocol_socket_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithProtocolFamily_socketType_protocol_socket_IMetInst(){
		return ((initWithProtocolFamily_socketType_protocol_socket_IMetInst != null)
	? (initWithProtocolFamily_socketType_protocol_socket_IMetInst)
	: (initWithProtocolFamily_socketType_protocol_socket_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithProtocolFamily:socketType:protocol:socket:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithProtocolFamily_socketType_protocol_socket(final int family, final int type, final int protocol, final int sock){
			final com.apple.jobjc.Invoke.MsgSend initWithProtocolFamily_socketType_protocol_socket_IMetInst = get_initWithProtocolFamily_socketType_protocol_socket_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithProtocolFamily_socketType_protocol_socket_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, sock);
		initWithProtocolFamily_socketType_protocol_socket_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTCPPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTCPPort_IMetInst(){
		return ((initWithTCPPort_IMetInst != null)
	? (initWithTCPPort_IMetInst)
	: (initWithTCPPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTCPPort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTCPPort(final short port){
			final com.apple.jobjc.Invoke.MsgSend initWithTCPPort_IMetInst = get_initWithTCPPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTCPPort_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, port);
		initWithTCPPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocol_IMetInst(){
		return ((protocol_IMetInst != null)
	? (protocol_IMetInst)
	: (protocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocol", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int protocol(){
			final com.apple.jobjc.Invoke.MsgSend protocol_IMetInst = get_protocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocol_IMetInst.init(nativeBuffer, this);
		protocol_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocolFamily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocolFamily_IMetInst(){
		return ((protocolFamily_IMetInst != null)
	? (protocolFamily_IMetInst)
	: (protocolFamily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocolFamily", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int protocolFamily(){
			final com.apple.jobjc.Invoke.MsgSend protocolFamily_IMetInst = get_protocolFamily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocolFamily_IMetInst.init(nativeBuffer, this);
		protocolFamily_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend socket_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_socket_IMetInst(){
		return ((socket_IMetInst != null)
	? (socket_IMetInst)
	: (socket_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "socket", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int socket(){
			final com.apple.jobjc.Invoke.MsgSend socket_IMetInst = get_socket_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		socket_IMetInst.init(nativeBuffer, this);
		socket_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend socketType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_socketType_IMetInst(){
		return ((socketType_IMetInst != null)
	? (socketType_IMetInst)
	: (socketType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "socketType", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int socketType(){
			final com.apple.jobjc.Invoke.MsgSend socketType_IMetInst = get_socketType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		socketType_IMetInst.init(nativeBuffer, this);
		socketType_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

}
