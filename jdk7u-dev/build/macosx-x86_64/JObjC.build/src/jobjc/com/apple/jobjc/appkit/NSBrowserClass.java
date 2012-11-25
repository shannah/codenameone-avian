package com.apple.jobjc.appkit;

public  class NSBrowserClass extends com.apple.jobjc.appkit.NSControlClass {
	public NSBrowserClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBrowserClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBrowserClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cellClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellClass_CMetInst(){
		return ((cellClass_CMetInst != null)
	? (cellClass_CMetInst)
	: (cellClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T cellClass(){
			final com.apple.jobjc.Invoke.MsgSend cellClass_CMetInst = get_cellClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellClass_CMetInst.init(nativeBuffer, this);
		cellClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeSavedColumnsWithAutosaveName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeSavedColumnsWithAutosaveName_CMetInst(){
		return ((removeSavedColumnsWithAutosaveName_CMetInst != null)
	? (removeSavedColumnsWithAutosaveName_CMetInst)
	: (removeSavedColumnsWithAutosaveName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeSavedColumnsWithAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeSavedColumnsWithAutosaveName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend removeSavedColumnsWithAutosaveName_CMetInst = get_removeSavedColumnsWithAutosaveName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeSavedColumnsWithAutosaveName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		removeSavedColumnsWithAutosaveName_CMetInst.invoke(nativeBuffer);
		
		
	}

}
