package com.apple.jobjc.foundation;

public  class NSProtocolChecker extends com.apple.jobjc.foundation.NSProxy {
	public NSProtocolChecker(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSProtocolChecker(final NSProtocolChecker obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithTarget_protocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTarget_protocol_IMetInst(){
		return ((initWithTarget_protocol_IMetInst != null)
	? (initWithTarget_protocol_IMetInst)
	: (initWithTarget_protocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTarget:protocol:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTarget_protocol(final com.apple.jobjc.foundation.NSObject anObject, final Object /* Protocol* (@, @) */ aProtocol){
			final com.apple.jobjc.Invoke.MsgSend initWithTarget_protocol_IMetInst = get_initWithTarget_protocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTarget_protocol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, aProtocol);
		initWithTarget_protocol_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocol_IMetInst(){
		return ((protocol_IMetInst != null)
	? (protocol_IMetInst)
	: (protocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocol", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* Protocol* (@, @) */ protocol(){
			final com.apple.jobjc.Invoke.MsgSend protocol_IMetInst = get_protocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocol_IMetInst.init(nativeBuffer, this);
		protocol_IMetInst.invoke(nativeBuffer);
		final Object /* Protocol* (@, @) */ returnValue = (Object /* Protocol* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend target_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_target_IMetInst(){
		return ((target_IMetInst != null)
	? (target_IMetInst)
	: (target_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "target", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSObject target(){
			final com.apple.jobjc.Invoke.MsgSend target_IMetInst = get_target_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		target_IMetInst.init(nativeBuffer, this);
		target_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSObject returnValue = (com.apple.jobjc.foundation.NSObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
