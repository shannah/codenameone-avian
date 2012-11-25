package com.apple.jobjc.foundation;

public  class NSPortCoderClass extends com.apple.jobjc.foundation.NSCoderClass {
	public NSPortCoderClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPortCoderClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPortCoderClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend portCoderWithReceivePort_sendPort_components_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portCoderWithReceivePort_sendPort_components_CMetInst(){
		return ((portCoderWithReceivePort_sendPort_components_CMetInst != null)
	? (portCoderWithReceivePort_sendPort_components_CMetInst)
	: (portCoderWithReceivePort_sendPort_components_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portCoderWithReceivePort:sendPort:components:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T portCoderWithReceivePort_sendPort_components(final com.apple.jobjc.foundation.NSPort rcvPort, final com.apple.jobjc.foundation.NSPort sndPort, final com.apple.jobjc.foundation.NSArray comps){
			final com.apple.jobjc.Invoke.MsgSend portCoderWithReceivePort_sendPort_components_CMetInst = get_portCoderWithReceivePort_sendPort_components_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portCoderWithReceivePort_sendPort_components_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rcvPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sndPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comps);
		portCoderWithReceivePort_sendPort_components_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
