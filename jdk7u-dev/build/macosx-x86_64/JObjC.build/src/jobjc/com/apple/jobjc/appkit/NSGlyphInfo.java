package com.apple.jobjc.appkit;

public  class NSGlyphInfo extends com.apple.jobjc.foundation.NSObject {
	public NSGlyphInfo(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSGlyphInfo(final NSGlyphInfo obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend characterCollection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterCollection_IMetInst(){
		return ((characterCollection_IMetInst != null)
	? (characterCollection_IMetInst)
	: (characterCollection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterCollection", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long characterCollection(){
			final com.apple.jobjc.Invoke.MsgSend characterCollection_IMetInst = get_characterCollection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterCollection_IMetInst.init(nativeBuffer, this);
		characterCollection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIdentifier_IMetInst(){
		return ((characterIdentifier_IMetInst != null)
	? (characterIdentifier_IMetInst)
	: (characterIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIdentifier", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long characterIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend characterIdentifier_IMetInst = get_characterIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIdentifier_IMetInst.init(nativeBuffer, this);
		characterIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphName_IMetInst(){
		return ((glyphName_IMetInst != null)
	? (glyphName_IMetInst)
	: (glyphName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString glyphName(){
			final com.apple.jobjc.Invoke.MsgSend glyphName_IMetInst = get_glyphName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphName_IMetInst.init(nativeBuffer, this);
		glyphName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
