package com.apple.jobjc.foundation;

public  class NSMachBootstrapServerClass extends com.apple.jobjc.foundation.NSPortNameServerClass {
	public NSMachBootstrapServerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMachBootstrapServerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMachBootstrapServerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedInstance_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedInstance_CMetInst(){
		return ((sharedInstance_CMetInst != null)
	? (sharedInstance_CMetInst)
	: (sharedInstance_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedInstance", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedInstance(){
			final com.apple.jobjc.Invoke.MsgSend sharedInstance_CMetInst = get_sharedInstance_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedInstance_CMetInst.init(nativeBuffer, this);
		sharedInstance_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
