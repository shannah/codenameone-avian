package com.apple.jobjc.foundation;

public  class NSNotificationQueueClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSNotificationQueueClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNotificationQueueClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNotificationQueueClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultQueue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultQueue_CMetInst(){
		return ((defaultQueue_CMetInst != null)
	? (defaultQueue_CMetInst)
	: (defaultQueue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultQueue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultQueue(){
			final com.apple.jobjc.Invoke.MsgSend defaultQueue_CMetInst = get_defaultQueue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultQueue_CMetInst.init(nativeBuffer, this);
		defaultQueue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
