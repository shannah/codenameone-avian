package com.apple.jobjc.appkit;

public  class NSPrintPanelClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPrintPanelClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPrintPanelClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPrintPanelClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend printPanel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printPanel_CMetInst(){
		return ((printPanel_CMetInst != null)
	? (printPanel_CMetInst)
	: (printPanel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintPanel printPanel(){
			final com.apple.jobjc.Invoke.MsgSend printPanel_CMetInst = get_printPanel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printPanel_CMetInst.init(nativeBuffer, this);
		printPanel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintPanel returnValue = (com.apple.jobjc.appkit.NSPrintPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
