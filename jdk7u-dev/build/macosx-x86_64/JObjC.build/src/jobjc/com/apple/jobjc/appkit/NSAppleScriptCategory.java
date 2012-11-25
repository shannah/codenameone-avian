package com.apple.jobjc.appkit;

public  class NSAppleScriptCategory extends com.apple.jobjc.foundation.NSAppleScript {
	public NSAppleScriptCategory(final com.apple.jobjc.foundation.NSAppleScript obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSAppleScriptCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAppleScriptCategory(final NSAppleScriptCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend richTextSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_richTextSource_IMetInst(){
		return ((richTextSource_IMetInst != null)
	? (richTextSource_IMetInst)
	: (richTextSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "richTextSource", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString richTextSource(){
			final com.apple.jobjc.Invoke.MsgSend richTextSource_IMetInst = get_richTextSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		richTextSource_IMetInst.init(nativeBuffer, this);
		richTextSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
