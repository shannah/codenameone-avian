package com.apple.jobjc.foundation;

public  class NSProtocolCheckerClass extends com.apple.jobjc.foundation.NSProxyClass {
	public NSProtocolCheckerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSProtocolCheckerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSProtocolCheckerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend protocolCheckerWithTarget_protocol_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protocolCheckerWithTarget_protocol_CMetInst(){
		return ((protocolCheckerWithTarget_protocol_CMetInst != null)
	? (protocolCheckerWithTarget_protocol_CMetInst)
	: (protocolCheckerWithTarget_protocol_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protocolCheckerWithTarget:protocol:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T protocolCheckerWithTarget_protocol(final com.apple.jobjc.foundation.NSObject anObject, final Object /* Protocol* (@, @) */ aProtocol){
			final com.apple.jobjc.Invoke.MsgSend protocolCheckerWithTarget_protocol_CMetInst = get_protocolCheckerWithTarget_protocol_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protocolCheckerWithTarget_protocol_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, aProtocol);
		protocolCheckerWithTarget_protocol_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
