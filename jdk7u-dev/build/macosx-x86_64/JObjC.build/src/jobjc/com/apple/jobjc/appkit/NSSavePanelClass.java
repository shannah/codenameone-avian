package com.apple.jobjc.appkit;

public  class NSSavePanelClass extends com.apple.jobjc.appkit.NSPanelClass {
	public NSSavePanelClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSavePanelClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSavePanelClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend savePanel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_savePanel_CMetInst(){
		return ((savePanel_CMetInst != null)
	? (savePanel_CMetInst)
	: (savePanel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "savePanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSSavePanel savePanel(){
			final com.apple.jobjc.Invoke.MsgSend savePanel_CMetInst = get_savePanel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		savePanel_CMetInst.init(nativeBuffer, this);
		savePanel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSSavePanel returnValue = (com.apple.jobjc.appkit.NSSavePanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
