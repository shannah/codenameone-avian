package com.apple.jobjc.foundation;

public  class NSDistantObject extends com.apple.jobjc.foundation.NSProxy {
	public NSDistantObject(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDistantObject(final NSDistantObject obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend connectionForProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionForProxy_IMetInst(){
		return ((connectionForProxy_IMetInst != null)
	? (connectionForProxy_IMetInst)
	: (connectionForProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionForProxy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSConnection connectionForProxy(){
			final com.apple.jobjc.Invoke.MsgSend connectionForProxy_IMetInst = get_connectionForProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionForProxy_IMetInst.init(nativeBuffer, this);
		connectionForProxy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSConnection returnValue = (com.apple.jobjc.foundation.NSConnection) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLocal_connection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLocal_connection_IMetInst(){
		return ((initWithLocal_connection_IMetInst != null)
	? (initWithLocal_connection_IMetInst)
	: (initWithLocal_connection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLocal:connection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLocal_connection(final com.apple.jobjc.ID target, final com.apple.jobjc.foundation.NSConnection connection){
			final com.apple.jobjc.Invoke.MsgSend initWithLocal_connection_IMetInst = get_initWithLocal_connection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLocal_connection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		initWithLocal_connection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTarget_connection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTarget_connection_IMetInst(){
		return ((initWithTarget_connection_IMetInst != null)
	? (initWithTarget_connection_IMetInst)
	: (initWithTarget_connection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTarget:connection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTarget_connection(final com.apple.jobjc.ID target, final com.apple.jobjc.foundation.NSConnection connection){
			final com.apple.jobjc.Invoke.MsgSend initWithTarget_connection_IMetInst = get_initWithTarget_connection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTarget_connection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		initWithTarget_connection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setProtocolForProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProtocolForProxy_IMetInst(){
		return ((setProtocolForProxy_IMetInst != null)
	? (setProtocolForProxy_IMetInst)
	: (setProtocolForProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProtocolForProxy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setProtocolForProxy(final Object /* Protocol* (@, @) */ proto){
			final com.apple.jobjc.Invoke.MsgSend setProtocolForProxy_IMetInst = get_setProtocolForProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProtocolForProxy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, proto);
		setProtocolForProxy_IMetInst.invoke(nativeBuffer);
		
		
	}

}
