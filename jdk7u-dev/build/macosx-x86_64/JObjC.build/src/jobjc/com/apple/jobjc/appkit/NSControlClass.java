package com.apple.jobjc.appkit;

public  class NSControlClass extends com.apple.jobjc.appkit.NSViewClass {
	public NSControlClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSControlClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSControlClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend setCellClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellClass_CMetInst(){
		return ((setCellClass_CMetInst != null)
	? (setCellClass_CMetInst)
	: (setCellClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setCellClass(final com.apple.jobjc.NSClass factoryId){
			final com.apple.jobjc.Invoke.MsgSend setCellClass_CMetInst = get_setCellClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		setCellClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
