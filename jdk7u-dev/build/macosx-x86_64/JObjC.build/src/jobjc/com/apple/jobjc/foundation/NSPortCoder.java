package com.apple.jobjc.foundation;

public  class NSPortCoder extends com.apple.jobjc.foundation.NSCoder {
	public NSPortCoder(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPortCoder(final NSPortCoder obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend connection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_IMetInst(){
		return ((connection_IMetInst != null)
	? (connection_IMetInst)
	: (connection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSConnection connection(){
			final com.apple.jobjc.Invoke.MsgSend connection_IMetInst = get_connection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_IMetInst.init(nativeBuffer, this);
		connection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSConnection returnValue = (com.apple.jobjc.foundation.NSConnection) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodePortObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodePortObject_IMetInst(){
		return ((decodePortObject_IMetInst != null)
	? (decodePortObject_IMetInst)
	: (decodePortObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodePortObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort decodePortObject(){
			final com.apple.jobjc.Invoke.MsgSend decodePortObject_IMetInst = get_decodePortObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodePortObject_IMetInst.init(nativeBuffer, this);
		decodePortObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dispatch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dispatch_IMetInst(){
		return ((dispatch_IMetInst != null)
	? (dispatch_IMetInst)
	: (dispatch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dispatch", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void dispatch(){
			final com.apple.jobjc.Invoke.MsgSend dispatch_IMetInst = get_dispatch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dispatch_IMetInst.init(nativeBuffer, this);
		dispatch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodePortObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodePortObject_IMetInst(){
		return ((encodePortObject_IMetInst != null)
	? (encodePortObject_IMetInst)
	: (encodePortObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodePortObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodePortObject(final com.apple.jobjc.foundation.NSPort aport){
			final com.apple.jobjc.Invoke.MsgSend encodePortObject_IMetInst = get_encodePortObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodePortObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aport);
		encodePortObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithReceivePort_sendPort_components_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithReceivePort_sendPort_components_IMetInst(){
		return ((initWithReceivePort_sendPort_components_IMetInst != null)
	? (initWithReceivePort_sendPort_components_IMetInst)
	: (initWithReceivePort_sendPort_components_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithReceivePort:sendPort:components:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithReceivePort_sendPort_components(final com.apple.jobjc.foundation.NSPort rcvPort, final com.apple.jobjc.foundation.NSPort sndPort, final com.apple.jobjc.foundation.NSArray comps){
			final com.apple.jobjc.Invoke.MsgSend initWithReceivePort_sendPort_components_IMetInst = get_initWithReceivePort_sendPort_components_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithReceivePort_sendPort_components_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rcvPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sndPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comps);
		initWithReceivePort_sendPort_components_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBycopy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBycopy_IMetInst(){
		return ((isBycopy_IMetInst != null)
	? (isBycopy_IMetInst)
	: (isBycopy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBycopy", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBycopy(){
			final com.apple.jobjc.Invoke.MsgSend isBycopy_IMetInst = get_isBycopy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBycopy_IMetInst.init(nativeBuffer, this);
		isBycopy_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isByref_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isByref_IMetInst(){
		return ((isByref_IMetInst != null)
	? (isByref_IMetInst)
	: (isByref_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isByref", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isByref(){
			final com.apple.jobjc.Invoke.MsgSend isByref_IMetInst = get_isByref_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isByref_IMetInst.init(nativeBuffer, this);
		isByref_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
