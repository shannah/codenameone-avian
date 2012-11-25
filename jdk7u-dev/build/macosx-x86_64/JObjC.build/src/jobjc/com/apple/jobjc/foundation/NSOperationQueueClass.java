package com.apple.jobjc.foundation;

public  class NSOperationQueueClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSOperationQueueClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOperationQueueClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOperationQueueClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentQueue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentQueue_CMetInst(){
		return ((currentQueue_CMetInst != null)
	? (currentQueue_CMetInst)
	: (currentQueue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentQueue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T currentQueue(){
			final com.apple.jobjc.Invoke.MsgSend currentQueue_CMetInst = get_currentQueue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentQueue_CMetInst.init(nativeBuffer, this);
		currentQueue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainQueue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainQueue_CMetInst(){
		return ((mainQueue_CMetInst != null)
	? (mainQueue_CMetInst)
	: (mainQueue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainQueue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mainQueue(){
			final com.apple.jobjc.Invoke.MsgSend mainQueue_CMetInst = get_mainQueue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainQueue_CMetInst.init(nativeBuffer, this);
		mainQueue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
