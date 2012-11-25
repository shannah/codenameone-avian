package com.apple.jobjc.foundation;

public  class NSPortNameServerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPortNameServerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPortNameServerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPortNameServerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend systemDefaultPortNameServer_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemDefaultPortNameServer_CMetInst(){
		return ((systemDefaultPortNameServer_CMetInst != null)
	? (systemDefaultPortNameServer_CMetInst)
	: (systemDefaultPortNameServer_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemDefaultPortNameServer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPortNameServer systemDefaultPortNameServer(){
			final com.apple.jobjc.Invoke.MsgSend systemDefaultPortNameServer_CMetInst = get_systemDefaultPortNameServer_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemDefaultPortNameServer_CMetInst.init(nativeBuffer, this);
		systemDefaultPortNameServer_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPortNameServer returnValue = (com.apple.jobjc.foundation.NSPortNameServer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
