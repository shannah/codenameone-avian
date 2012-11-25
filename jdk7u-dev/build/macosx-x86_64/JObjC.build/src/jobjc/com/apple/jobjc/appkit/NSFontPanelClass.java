package com.apple.jobjc.appkit;

public  class NSFontPanelClass extends com.apple.jobjc.appkit.NSPanelClass {
	public NSFontPanelClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFontPanelClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFontPanelClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedFontPanel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedFontPanel_CMetInst(){
		return ((sharedFontPanel_CMetInst != null)
	? (sharedFontPanel_CMetInst)
	: (sharedFontPanel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedFontPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontPanel sharedFontPanel(){
			final com.apple.jobjc.Invoke.MsgSend sharedFontPanel_CMetInst = get_sharedFontPanel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedFontPanel_CMetInst.init(nativeBuffer, this);
		sharedFontPanel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontPanel returnValue = (com.apple.jobjc.appkit.NSFontPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedFontPanelExists_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedFontPanelExists_CMetInst(){
		return ((sharedFontPanelExists_CMetInst != null)
	? (sharedFontPanelExists_CMetInst)
	: (sharedFontPanelExists_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedFontPanelExists", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sharedFontPanelExists(){
			final com.apple.jobjc.Invoke.MsgSend sharedFontPanelExists_CMetInst = get_sharedFontPanelExists_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedFontPanelExists_CMetInst.init(nativeBuffer, this);
		sharedFontPanelExists_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
