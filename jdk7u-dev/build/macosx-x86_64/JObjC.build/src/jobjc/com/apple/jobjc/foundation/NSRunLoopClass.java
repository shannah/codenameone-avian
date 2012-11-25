package com.apple.jobjc.foundation;

public  class NSRunLoopClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSRunLoopClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSRunLoopClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSRunLoopClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentRunLoop_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentRunLoop_CMetInst(){
		return ((currentRunLoop_CMetInst != null)
	? (currentRunLoop_CMetInst)
	: (currentRunLoop_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentRunLoop", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRunLoop currentRunLoop(){
			final com.apple.jobjc.Invoke.MsgSend currentRunLoop_CMetInst = get_currentRunLoop_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentRunLoop_CMetInst.init(nativeBuffer, this);
		currentRunLoop_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSRunLoop returnValue = (com.apple.jobjc.foundation.NSRunLoop) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainRunLoop_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainRunLoop_CMetInst(){
		return ((mainRunLoop_CMetInst != null)
	? (mainRunLoop_CMetInst)
	: (mainRunLoop_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainRunLoop", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRunLoop mainRunLoop(){
			final com.apple.jobjc.Invoke.MsgSend mainRunLoop_CMetInst = get_mainRunLoop_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainRunLoop_CMetInst.init(nativeBuffer, this);
		mainRunLoop_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSRunLoop returnValue = (com.apple.jobjc.foundation.NSRunLoop) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
