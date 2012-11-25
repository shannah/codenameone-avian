package com.apple.jobjc.foundation;

public  class NSMachPortClass extends com.apple.jobjc.foundation.NSPortClass {
	public NSMachPortClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMachPortClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMachPortClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend portWithMachPort_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portWithMachPort_CMetInst(){
		return ((portWithMachPort_CMetInst != null)
	? (portWithMachPort_CMetInst)
	: (portWithMachPort_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portWithMachPort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort portWithMachPort(final int machPort){
			final com.apple.jobjc.Invoke.MsgSend portWithMachPort_CMetInst = get_portWithMachPort_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portWithMachPort_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, machPort);
		portWithMachPort_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend portWithMachPort_options_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_portWithMachPort_options_CMetInst(){
		return ((portWithMachPort_options_CMetInst != null)
	? (portWithMachPort_options_CMetInst)
	: (portWithMachPort_options_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "portWithMachPort:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSPort portWithMachPort_options(final int machPort, final long f){
			final com.apple.jobjc.Invoke.MsgSend portWithMachPort_options_CMetInst = get_portWithMachPort_options_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		portWithMachPort_options_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, machPort);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, f);
		portWithMachPort_options_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
