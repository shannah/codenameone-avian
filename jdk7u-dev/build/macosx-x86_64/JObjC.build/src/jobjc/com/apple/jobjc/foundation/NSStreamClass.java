package com.apple.jobjc.foundation;

public  class NSStreamClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSStreamClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSStreamClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSStreamClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend getStreamsToHost_port_inputStream_outputStream_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getStreamsToHost_port_inputStream_outputStream_CMetInst(){
		return ((getStreamsToHost_port_inputStream_outputStream_CMetInst != null)
	? (getStreamsToHost_port_inputStream_outputStream_CMetInst)
	: (getStreamsToHost_port_inputStream_outputStream_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getStreamsToHost:port:inputStream:outputStream:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getStreamsToHost_port_inputStream_outputStream(final com.apple.jobjc.foundation.NSHost host, final long port, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSInputStream> inputStream, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSOutputStream> outputStream){
			final com.apple.jobjc.Invoke.MsgSend getStreamsToHost_port_inputStream_outputStream_CMetInst = get_getStreamsToHost_port_inputStream_outputStream_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getStreamsToHost_port_inputStream_outputStream_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, port);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, inputStream);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outputStream);
		getStreamsToHost_port_inputStream_outputStream_CMetInst.invoke(nativeBuffer);
		
		
	}

}
