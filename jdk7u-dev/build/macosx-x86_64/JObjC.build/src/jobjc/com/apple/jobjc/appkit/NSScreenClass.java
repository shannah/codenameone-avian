package com.apple.jobjc.appkit;

public  class NSScreenClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScreenClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScreenClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScreenClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend deepestScreen_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deepestScreen_CMetInst(){
		return ((deepestScreen_CMetInst != null)
	? (deepestScreen_CMetInst)
	: (deepestScreen_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deepestScreen", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScreen deepestScreen(){
			final com.apple.jobjc.Invoke.MsgSend deepestScreen_CMetInst = get_deepestScreen_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deepestScreen_CMetInst.init(nativeBuffer, this);
		deepestScreen_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScreen returnValue = (com.apple.jobjc.appkit.NSScreen) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainScreen_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainScreen_CMetInst(){
		return ((mainScreen_CMetInst != null)
	? (mainScreen_CMetInst)
	: (mainScreen_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainScreen", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScreen mainScreen(){
			final com.apple.jobjc.Invoke.MsgSend mainScreen_CMetInst = get_mainScreen_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainScreen_CMetInst.init(nativeBuffer, this);
		mainScreen_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScreen returnValue = (com.apple.jobjc.appkit.NSScreen) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend screens_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_screens_CMetInst(){
		return ((screens_CMetInst != null)
	? (screens_CMetInst)
	: (screens_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "screens", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray screens(){
			final com.apple.jobjc.Invoke.MsgSend screens_CMetInst = get_screens_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		screens_CMetInst.init(nativeBuffer, this);
		screens_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
