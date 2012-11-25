package com.apple.jobjc.appkit;

public  class NSPathCellClass extends com.apple.jobjc.appkit.NSActionCellClass {
	public NSPathCellClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPathCellClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPathCellClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend pathComponentCellClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathComponentCellClass_CMetInst(){
		return ((pathComponentCellClass_CMetInst != null)
	? (pathComponentCellClass_CMetInst)
	: (pathComponentCellClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathComponentCellClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T pathComponentCellClass(){
			final com.apple.jobjc.Invoke.MsgSend pathComponentCellClass_CMetInst = get_pathComponentCellClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathComponentCellClass_CMetInst.init(nativeBuffer, this);
		pathComponentCellClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
