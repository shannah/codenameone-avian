package com.apple.jobjc.appkit;

public  class NSURLCategory extends com.apple.jobjc.foundation.NSURL {
	public NSURLCategory(final com.apple.jobjc.foundation.NSURL obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSURLCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLCategory(final NSURLCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToPasteboard_IMetInst(){
		return ((writeToPasteboard_IMetInst != null)
	? (writeToPasteboard_IMetInst)
	: (writeToPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToPasteboard:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writeToPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteBoard){
			final com.apple.jobjc.Invoke.MsgSend writeToPasteboard_IMetInst = get_writeToPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteBoard);
		writeToPasteboard_IMetInst.invoke(nativeBuffer);
		
		
	}

}
