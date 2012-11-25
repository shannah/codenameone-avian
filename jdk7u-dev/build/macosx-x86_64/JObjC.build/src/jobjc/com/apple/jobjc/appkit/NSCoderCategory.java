package com.apple.jobjc.appkit;

public  class NSCoderCategory extends com.apple.jobjc.foundation.NSCoder {
	public NSCoderCategory(final com.apple.jobjc.foundation.NSCoder obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSCoderCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCoderCategory(final NSCoderCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend decodeNXColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeNXColor_IMetInst(){
		return ((decodeNXColor_IMetInst != null)
	? (decodeNXColor_IMetInst)
	: (decodeNXColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeNXColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor decodeNXColor(){
			final com.apple.jobjc.Invoke.MsgSend decodeNXColor_IMetInst = get_decodeNXColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeNXColor_IMetInst.init(nativeBuffer, this);
		decodeNXColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
