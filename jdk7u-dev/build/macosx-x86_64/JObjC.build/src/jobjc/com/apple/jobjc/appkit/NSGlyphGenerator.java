package com.apple.jobjc.appkit;

public  class NSGlyphGenerator extends com.apple.jobjc.foundation.NSObject {
	public NSGlyphGenerator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSGlyphGenerator(final NSGlyphGenerator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst(){
		return ((generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst != null)
	? (generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst)
	: (generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "generateGlyphsForGlyphStorage:desiredNumberOfCharacters:glyphIndex:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex(final com.apple.jobjc.ID glyphStorage, final long nChars, final com.apple.jobjc.Pointer<java.lang.Long> glyphIndex, final com.apple.jobjc.Pointer<java.lang.Long> charIndex){
			final com.apple.jobjc.Invoke.MsgSend generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst = get_generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, glyphStorage);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, nChars);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndex);
		generateGlyphsForGlyphStorage_desiredNumberOfCharacters_glyphIndex_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

}
