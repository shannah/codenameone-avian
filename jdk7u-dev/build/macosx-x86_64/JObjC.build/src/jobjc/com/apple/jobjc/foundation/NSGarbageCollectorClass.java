package com.apple.jobjc.foundation;

public  class NSGarbageCollectorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSGarbageCollectorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSGarbageCollectorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSGarbageCollectorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultCollector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultCollector_CMetInst(){
		return ((defaultCollector_CMetInst != null)
	? (defaultCollector_CMetInst)
	: (defaultCollector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultCollector", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultCollector(){
			final com.apple.jobjc.Invoke.MsgSend defaultCollector_CMetInst = get_defaultCollector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultCollector_CMetInst.init(nativeBuffer, this);
		defaultCollector_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
