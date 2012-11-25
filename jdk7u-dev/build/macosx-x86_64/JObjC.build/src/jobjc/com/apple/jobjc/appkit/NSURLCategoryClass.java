package com.apple.jobjc.appkit;

public final class NSURLCategoryClass extends com.apple.jobjc.foundation.NSURLClass {
	NSURLCategoryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super("NSURL", runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLFromPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLFromPasteboard_CMetInst(){
		return ((URLFromPasteboard_CMetInst != null)
	? (URLFromPasteboard_CMetInst)
	: (URLFromPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLFromPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLFromPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteBoard){
			final com.apple.jobjc.Invoke.MsgSend URLFromPasteboard_CMetInst = get_URLFromPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLFromPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteBoard);
		URLFromPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
