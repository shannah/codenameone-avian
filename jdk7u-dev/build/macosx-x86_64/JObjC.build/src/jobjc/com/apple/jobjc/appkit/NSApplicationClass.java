package com.apple.jobjc.appkit;

public  class NSApplicationClass extends com.apple.jobjc.appkit.NSResponderClass {
	public NSApplicationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSApplicationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSApplicationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend detachDrawingThread_toTarget_withObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachDrawingThread_toTarget_withObject_CMetInst(){
		return ((detachDrawingThread_toTarget_withObject_CMetInst != null)
	? (detachDrawingThread_toTarget_withObject_CMetInst)
	: (detachDrawingThread_toTarget_withObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachDrawingThread:toTarget:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void detachDrawingThread_toTarget_withObject(final com.apple.jobjc.SEL selector, final com.apple.jobjc.ID target, final com.apple.jobjc.ID argument){
			final com.apple.jobjc.Invoke.MsgSend detachDrawingThread_toTarget_withObject_CMetInst = get_detachDrawingThread_toTarget_withObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachDrawingThread_toTarget_withObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		detachDrawingThread_toTarget_withObject_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedApplication_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedApplication_CMetInst(){
		return ((sharedApplication_CMetInst != null)
	? (sharedApplication_CMetInst)
	: (sharedApplication_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedApplication", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSApplication sharedApplication(){
			final com.apple.jobjc.Invoke.MsgSend sharedApplication_CMetInst = get_sharedApplication_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedApplication_CMetInst.init(nativeBuffer, this);
		sharedApplication_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSApplication returnValue = (com.apple.jobjc.appkit.NSApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
