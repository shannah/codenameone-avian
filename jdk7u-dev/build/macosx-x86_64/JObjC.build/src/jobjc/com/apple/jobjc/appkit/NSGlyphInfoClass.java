package com.apple.jobjc.appkit;

public  class NSGlyphInfoClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSGlyphInfoClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSGlyphInfoClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSGlyphInfoClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst(){
		return ((glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst != null)
	? (glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst)
	: (glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphInfoWithCharacterIdentifier:collection:baseString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGlyphInfo glyphInfoWithCharacterIdentifier_collection_baseString(final long cid, final long characterCollection, final com.apple.jobjc.foundation.NSString theString){
			final com.apple.jobjc.Invoke.MsgSend glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst = get_glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cid);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, characterCollection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theString);
		glyphInfoWithCharacterIdentifier_collection_baseString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGlyphInfo returnValue = (com.apple.jobjc.appkit.NSGlyphInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphInfoWithGlyph_forFont_baseString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphInfoWithGlyph_forFont_baseString_CMetInst(){
		return ((glyphInfoWithGlyph_forFont_baseString_CMetInst != null)
	? (glyphInfoWithGlyph_forFont_baseString_CMetInst)
	: (glyphInfoWithGlyph_forFont_baseString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphInfoWithGlyph:forFont:baseString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGlyphInfo glyphInfoWithGlyph_forFont_baseString(final int glyph, final com.apple.jobjc.appkit.NSFont font, final com.apple.jobjc.foundation.NSString theString){
			final com.apple.jobjc.Invoke.MsgSend glyphInfoWithGlyph_forFont_baseString_CMetInst = get_glyphInfoWithGlyph_forFont_baseString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphInfoWithGlyph_forFont_baseString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, glyph);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theString);
		glyphInfoWithGlyph_forFont_baseString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGlyphInfo returnValue = (com.apple.jobjc.appkit.NSGlyphInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphInfoWithGlyphName_forFont_baseString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphInfoWithGlyphName_forFont_baseString_CMetInst(){
		return ((glyphInfoWithGlyphName_forFont_baseString_CMetInst != null)
	? (glyphInfoWithGlyphName_forFont_baseString_CMetInst)
	: (glyphInfoWithGlyphName_forFont_baseString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphInfoWithGlyphName:forFont:baseString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGlyphInfo glyphInfoWithGlyphName_forFont_baseString(final com.apple.jobjc.foundation.NSString glyphName, final com.apple.jobjc.appkit.NSFont font, final com.apple.jobjc.foundation.NSString theString){
			final com.apple.jobjc.Invoke.MsgSend glyphInfoWithGlyphName_forFont_baseString_CMetInst = get_glyphInfoWithGlyphName_forFont_baseString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphInfoWithGlyphName_forFont_baseString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, glyphName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theString);
		glyphInfoWithGlyphName_forFont_baseString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGlyphInfo returnValue = (com.apple.jobjc.appkit.NSGlyphInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
