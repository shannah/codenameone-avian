package com.apple.jobjc.appkit;

public  class NSBrowserCellClass extends com.apple.jobjc.appkit.NSCellClass {
	public NSBrowserCellClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBrowserCellClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBrowserCellClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend branchImage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_branchImage_CMetInst(){
		return ((branchImage_CMetInst != null)
	? (branchImage_CMetInst)
	: (branchImage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "branchImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage branchImage(){
			final com.apple.jobjc.Invoke.MsgSend branchImage_CMetInst = get_branchImage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		branchImage_CMetInst.init(nativeBuffer, this);
		branchImage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightedBranchImage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightedBranchImage_CMetInst(){
		return ((highlightedBranchImage_CMetInst != null)
	? (highlightedBranchImage_CMetInst)
	: (highlightedBranchImage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightedBranchImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage highlightedBranchImage(){
			final com.apple.jobjc.Invoke.MsgSend highlightedBranchImage_CMetInst = get_highlightedBranchImage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightedBranchImage_CMetInst.init(nativeBuffer, this);
		highlightedBranchImage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
