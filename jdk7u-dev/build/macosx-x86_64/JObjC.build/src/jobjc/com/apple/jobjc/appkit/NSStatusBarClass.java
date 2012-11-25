package com.apple.jobjc.appkit;

public  class NSStatusBarClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSStatusBarClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSStatusBarClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSStatusBarClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend systemStatusBar_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemStatusBar_CMetInst(){
		return ((systemStatusBar_CMetInst != null)
	? (systemStatusBar_CMetInst)
	: (systemStatusBar_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemStatusBar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSStatusBar systemStatusBar(){
			final com.apple.jobjc.Invoke.MsgSend systemStatusBar_CMetInst = get_systemStatusBar_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemStatusBar_CMetInst.init(nativeBuffer, this);
		systemStatusBar_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSStatusBar returnValue = (com.apple.jobjc.appkit.NSStatusBar) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
