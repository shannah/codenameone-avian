package com.apple.jobjc.foundation;

public  class NSSocketPortNameServer extends com.apple.jobjc.foundation.NSPortNameServer {
	public NSSocketPortNameServer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSocketPortNameServer(final NSSocketPortNameServer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultNameServerPortNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultNameServerPortNumber_IMetInst(){
		return ((defaultNameServerPortNumber_IMetInst != null)
	? (defaultNameServerPortNumber_IMetInst)
	: (defaultNameServerPortNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultNameServerPortNumber", com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public short defaultNameServerPortNumber(){
			final com.apple.jobjc.Invoke.MsgSend defaultNameServerPortNumber_IMetInst = get_defaultNameServerPortNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultNameServerPortNumber_IMetInst.init(nativeBuffer, this);
		defaultNameServerPortNumber_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portForName_IMetInst(){
		return ((portForName_IMetInst != null)
	? (portForName_IMetInst)
	: (portForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend portForName_IMetInst = get_portForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		portForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portForName_host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portForName_host_IMetInst(){
		return ((portForName_host_IMetInst != null)
	? (portForName_host_IMetInst)
	: (portForName_host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portForName:host:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portForName_host(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString host){
			final com.apple.jobjc.Invoke.MsgSend portForName_host_IMetInst = get_portForName_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portForName_host_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		portForName_host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portForName_host_nameServerPortNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portForName_host_nameServerPortNumber_IMetInst(){
		return ((portForName_host_nameServerPortNumber_IMetInst != null)
	? (portForName_host_nameServerPortNumber_IMetInst)
	: (portForName_host_nameServerPortNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portForName:host:nameServerPortNumber:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portForName_host_nameServerPortNumber(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString host, final short portNumber){
			final com.apple.jobjc.Invoke.MsgSend portForName_host_nameServerPortNumber_IMetInst = get_portForName_host_nameServerPortNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portForName_host_nameServerPortNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, portNumber);
		portForName_host_nameServerPortNumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerPort_name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerPort_name_IMetInst(){
		return ((registerPort_name_IMetInst != null)
	? (registerPort_name_IMetInst)
	: (registerPort_name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerPort:name:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerPort_name(final com.apple.jobjc.foundation.NSPort port, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend registerPort_name_IMetInst = get_registerPort_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerPort_name_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		registerPort_name_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerPort_name_nameServerPortNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerPort_name_nameServerPortNumber_IMetInst(){
		return ((registerPort_name_nameServerPortNumber_IMetInst != null)
	? (registerPort_name_nameServerPortNumber_IMetInst)
	: (registerPort_name_nameServerPortNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerPort:name:nameServerPortNumber:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public boolean registerPort_name_nameServerPortNumber(final com.apple.jobjc.foundation.NSPort port, final com.apple.jobjc.foundation.NSString name, final short portNumber){
			final com.apple.jobjc.Invoke.MsgSend registerPort_name_nameServerPortNumber_IMetInst = get_registerPort_name_nameServerPortNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerPort_name_nameServerPortNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, port);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, portNumber);
		registerPort_name_nameServerPortNumber_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removePortForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removePortForName_IMetInst(){
		return ((removePortForName_IMetInst != null)
	? (removePortForName_IMetInst)
	: (removePortForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removePortForName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removePortForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend removePortForName_IMetInst = get_removePortForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removePortForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		removePortForName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultNameServerPortNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultNameServerPortNumber_IMetInst(){
		return ((setDefaultNameServerPortNumber_IMetInst != null)
	? (setDefaultNameServerPortNumber_IMetInst)
	: (setDefaultNameServerPortNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultNameServerPortNumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST)));
	}

	 public void setDefaultNameServerPortNumber(final short portNumber){
			final com.apple.jobjc.Invoke.MsgSend setDefaultNameServerPortNumber_IMetInst = get_setDefaultNameServerPortNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultNameServerPortNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, portNumber);
		setDefaultNameServerPortNumber_IMetInst.invoke(nativeBuffer);
		
		
	}

}
