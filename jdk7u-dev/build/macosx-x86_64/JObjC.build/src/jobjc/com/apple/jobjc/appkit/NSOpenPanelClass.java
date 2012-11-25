package com.apple.jobjc.appkit;

public  class NSOpenPanelClass extends com.apple.jobjc.appkit.NSSavePanelClass {
	public NSOpenPanelClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOpenPanelClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOpenPanelClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend openPanel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openPanel_CMetInst(){
		return ((openPanel_CMetInst != null)
	? (openPanel_CMetInst)
	: (openPanel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSOpenPanel openPanel(){
			final com.apple.jobjc.Invoke.MsgSend openPanel_CMetInst = get_openPanel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openPanel_CMetInst.init(nativeBuffer, this);
		openPanel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSOpenPanel returnValue = (com.apple.jobjc.appkit.NSOpenPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
