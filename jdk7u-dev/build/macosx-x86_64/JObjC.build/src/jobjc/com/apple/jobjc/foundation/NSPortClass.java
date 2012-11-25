package com.apple.jobjc.foundation;

public  class NSPortClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPortClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPortClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPortClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend port_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_port_CMetInst(){
		return ((port_CMetInst != null)
	? (port_CMetInst)
	: (port_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "port", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort port(){
			final com.apple.jobjc.Invoke.MsgSend port_CMetInst = get_port_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		port_CMetInst.init(nativeBuffer, this);
		port_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
