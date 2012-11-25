package com.apple.jobjc.appkit;

public  class NSFont extends com.apple.jobjc.foundation.NSObject {
	public NSFont(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFont(final NSFont obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend advancementForGlyph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_advancementForGlyph_IMetInst(){
		return ((advancementForGlyph_IMetInst != null)
	? (advancementForGlyph_IMetInst)
	: (advancementForGlyph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "advancementForGlyph:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize advancementForGlyph(final int ag){
			final com.apple.jobjc.Invoke.MsgSend advancementForGlyph_IMetInst = get_advancementForGlyph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		advancementForGlyph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, ag);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		advancementForGlyph_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend afmDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_afmDictionary_IMetInst(){
		return ((afmDictionary_IMetInst != null)
	? (afmDictionary_IMetInst)
	: (afmDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "afmDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary afmDictionary(){
			final com.apple.jobjc.Invoke.MsgSend afmDictionary_IMetInst = get_afmDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		afmDictionary_IMetInst.init(nativeBuffer, this);
		afmDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ascender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ascender_IMetInst(){
		return ((ascender_IMetInst != null)
	? (ascender_IMetInst)
	: (ascender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ascender", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double ascender(){
			final com.apple.jobjc.Invoke.MsgSend ascender_IMetInst = get_ascender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ascender_IMetInst.init(nativeBuffer, this);
		ascender_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingRectForFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingRectForFont_IMetInst(){
		return ((boundingRectForFont_IMetInst != null)
	? (boundingRectForFont_IMetInst)
	: (boundingRectForFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingRectForFont", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect boundingRectForFont(){
			final com.apple.jobjc.Invoke.MsgSend boundingRectForFont_IMetInst = get_boundingRectForFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingRectForFont_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingRectForFont_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingRectForGlyph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingRectForGlyph_IMetInst(){
		return ((boundingRectForGlyph_IMetInst != null)
	? (boundingRectForGlyph_IMetInst)
	: (boundingRectForGlyph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingRectForGlyph:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect boundingRectForGlyph(final int aGlyph){
			final com.apple.jobjc.Invoke.MsgSend boundingRectForGlyph_IMetInst = get_boundingRectForGlyph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingRectForGlyph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, aGlyph);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingRectForGlyph_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend capHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_capHeight_IMetInst(){
		return ((capHeight_IMetInst != null)
	? (capHeight_IMetInst)
	: (capHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "capHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double capHeight(){
			final com.apple.jobjc.Invoke.MsgSend capHeight_IMetInst = get_capHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		capHeight_IMetInst.init(nativeBuffer, this);
		capHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend coveredCharacterSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coveredCharacterSet_IMetInst(){
		return ((coveredCharacterSet_IMetInst != null)
	? (coveredCharacterSet_IMetInst)
	: (coveredCharacterSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coveredCharacterSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCharacterSet coveredCharacterSet(){
			final com.apple.jobjc.Invoke.MsgSend coveredCharacterSet_IMetInst = get_coveredCharacterSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coveredCharacterSet_IMetInst.init(nativeBuffer, this);
		coveredCharacterSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCharacterSet returnValue = (com.apple.jobjc.foundation.NSCharacterSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultLineHeightForFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultLineHeightForFont_IMetInst(){
		return ((defaultLineHeightForFont_IMetInst != null)
	? (defaultLineHeightForFont_IMetInst)
	: (defaultLineHeightForFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultLineHeightForFont", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultLineHeightForFont(){
			final com.apple.jobjc.Invoke.MsgSend defaultLineHeightForFont_IMetInst = get_defaultLineHeightForFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultLineHeightForFont_IMetInst.init(nativeBuffer, this);
		defaultLineHeightForFont_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descender_IMetInst(){
		return ((descender_IMetInst != null)
	? (descender_IMetInst)
	: (descender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descender", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double descender(){
			final com.apple.jobjc.Invoke.MsgSend descender_IMetInst = get_descender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descender_IMetInst.init(nativeBuffer, this);
		descender_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayName_IMetInst(){
		return ((displayName_IMetInst != null)
	? (displayName_IMetInst)
	: (displayName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayName(){
			final com.apple.jobjc.Invoke.MsgSend displayName_IMetInst = get_displayName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayName_IMetInst.init(nativeBuffer, this);
		displayName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend encodingScheme_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodingScheme_IMetInst(){
		return ((encodingScheme_IMetInst != null)
	? (encodingScheme_IMetInst)
	: (encodingScheme_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodingScheme", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString encodingScheme(){
			final com.apple.jobjc.Invoke.MsgSend encodingScheme_IMetInst = get_encodingScheme_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodingScheme_IMetInst.init(nativeBuffer, this);
		encodingScheme_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend familyName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_familyName_IMetInst(){
		return ((familyName_IMetInst != null)
	? (familyName_IMetInst)
	: (familyName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "familyName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString familyName(){
			final com.apple.jobjc.Invoke.MsgSend familyName_IMetInst = get_familyName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		familyName_IMetInst.init(nativeBuffer, this);
		familyName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptor_IMetInst(){
		return ((fontDescriptor_IMetInst != null)
	? (fontDescriptor_IMetInst)
	: (fontDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontDescriptor fontDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptor_IMetInst = get_fontDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptor_IMetInst.init(nativeBuffer, this);
		fontDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontDescriptor returnValue = (com.apple.jobjc.appkit.NSFontDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontName_IMetInst(){
		return ((fontName_IMetInst != null)
	? (fontName_IMetInst)
	: (fontName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fontName(){
			final com.apple.jobjc.Invoke.MsgSend fontName_IMetInst = get_fontName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontName_IMetInst.init(nativeBuffer, this);
		fontName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getAdvancements_forGlyphs_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getAdvancements_forGlyphs_count_IMetInst(){
		return ((getAdvancements_forGlyphs_count_IMetInst != null)
	? (getAdvancements_forGlyphs_count_IMetInst)
	: (getAdvancements_forGlyphs_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getAdvancements:forGlyphs:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void getAdvancements_forGlyphs_count(final Object /* NSSizeArray (^{_NSSize=ff}, ^{CGSize=dd}) */ advancements, final com.apple.jobjc.Pointer<java.lang.Integer> glyphs, final long glyphCount){
			final com.apple.jobjc.Invoke.MsgSend getAdvancements_forGlyphs_count_IMetInst = get_getAdvancements_forGlyphs_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getAdvancements_forGlyphs_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, advancements);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphCount);
		getAdvancements_forGlyphs_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getAdvancements_forPackedGlyphs_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getAdvancements_forPackedGlyphs_length_IMetInst(){
		return ((getAdvancements_forPackedGlyphs_length_IMetInst != null)
	? (getAdvancements_forPackedGlyphs_length_IMetInst)
	: (getAdvancements_forPackedGlyphs_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getAdvancements:forPackedGlyphs:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void getAdvancements_forPackedGlyphs_length(final Object /* NSSizeArray (^{_NSSize=ff}, ^{CGSize=dd}) */ advancements, final com.apple.jobjc.Pointer<Void> packedGlyphs, final long length){
			final com.apple.jobjc.Invoke.MsgSend getAdvancements_forPackedGlyphs_length_IMetInst = get_getAdvancements_forPackedGlyphs_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getAdvancements_forPackedGlyphs_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, advancements);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, packedGlyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		getAdvancements_forPackedGlyphs_length_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getBoundingRects_forGlyphs_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBoundingRects_forGlyphs_count_IMetInst(){
		return ((getBoundingRects_forGlyphs_count_IMetInst != null)
	? (getBoundingRects_forGlyphs_count_IMetInst)
	: (getBoundingRects_forGlyphs_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBoundingRects:forGlyphs:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void getBoundingRects_forGlyphs_count(final Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ bounds, final com.apple.jobjc.Pointer<java.lang.Integer> glyphs, final long glyphCount){
			final com.apple.jobjc.Invoke.MsgSend getBoundingRects_forGlyphs_count_IMetInst = get_getBoundingRects_forGlyphs_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBoundingRects_forGlyphs_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, bounds);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphCount);
		getBoundingRects_forGlyphs_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphIsEncoded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphIsEncoded_IMetInst(){
		return ((glyphIsEncoded_IMetInst != null)
	? (glyphIsEncoded_IMetInst)
	: (glyphIsEncoded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphIsEncoded:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public boolean glyphIsEncoded(final int aGlyph){
			final com.apple.jobjc.Invoke.MsgSend glyphIsEncoded_IMetInst = get_glyphIsEncoded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphIsEncoded_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, aGlyph);
		glyphIsEncoded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphPacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphPacking_IMetInst(){
		return ((glyphPacking_IMetInst != null)
	? (glyphPacking_IMetInst)
	: (glyphPacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphPacking", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long glyphPacking(){
			final com.apple.jobjc.Invoke.MsgSend glyphPacking_IMetInst = get_glyphPacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphPacking_IMetInst.init(nativeBuffer, this);
		glyphPacking_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphWithName_IMetInst(){
		return ((glyphWithName_IMetInst != null)
	? (glyphWithName_IMetInst)
	: (glyphWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphWithName:", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public int glyphWithName(final com.apple.jobjc.foundation.NSString aName){
			final com.apple.jobjc.Invoke.MsgSend glyphWithName_IMetInst = get_glyphWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		glyphWithName_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBaseFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBaseFont_IMetInst(){
		return ((isBaseFont_IMetInst != null)
	? (isBaseFont_IMetInst)
	: (isBaseFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBaseFont", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBaseFont(){
			final com.apple.jobjc.Invoke.MsgSend isBaseFont_IMetInst = get_isBaseFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBaseFont_IMetInst.init(nativeBuffer, this);
		isBaseFont_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFixedPitch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFixedPitch_IMetInst(){
		return ((isFixedPitch_IMetInst != null)
	? (isFixedPitch_IMetInst)
	: (isFixedPitch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFixedPitch", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFixedPitch(){
			final com.apple.jobjc.Invoke.MsgSend isFixedPitch_IMetInst = get_isFixedPitch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFixedPitch_IMetInst.init(nativeBuffer, this);
		isFixedPitch_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVertical_IMetInst(){
		return ((isVertical_IMetInst != null)
	? (isVertical_IMetInst)
	: (isVertical_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVertical", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVertical(){
			final com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst = get_isVertical_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVertical_IMetInst.init(nativeBuffer, this);
		isVertical_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend italicAngle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_italicAngle_IMetInst(){
		return ((italicAngle_IMetInst != null)
	? (italicAngle_IMetInst)
	: (italicAngle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "italicAngle", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double italicAngle(){
			final com.apple.jobjc.Invoke.MsgSend italicAngle_IMetInst = get_italicAngle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		italicAngle_IMetInst.init(nativeBuffer, this);
		italicAngle_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leading_IMetInst(){
		return ((leading_IMetInst != null)
	? (leading_IMetInst)
	: (leading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leading", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double leading(){
			final com.apple.jobjc.Invoke.MsgSend leading_IMetInst = get_leading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leading_IMetInst.init(nativeBuffer, this);
		leading_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matrix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matrix_IMetInst(){
		return ((matrix_IMetInst != null)
	? (matrix_IMetInst)
	: (matrix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matrix", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Double> matrix(){
			final com.apple.jobjc.Invoke.MsgSend matrix_IMetInst = get_matrix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matrix_IMetInst.init(nativeBuffer, this);
		matrix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Double> returnValue = (com.apple.jobjc.Pointer<java.lang.Double>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumAdvancement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumAdvancement_IMetInst(){
		return ((maximumAdvancement_IMetInst != null)
	? (maximumAdvancement_IMetInst)
	: (maximumAdvancement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumAdvancement", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize maximumAdvancement(){
			final com.apple.jobjc.Invoke.MsgSend maximumAdvancement_IMetInst = get_maximumAdvancement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumAdvancement_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		maximumAdvancement_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mostCompatibleStringEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mostCompatibleStringEncoding_IMetInst(){
		return ((mostCompatibleStringEncoding_IMetInst != null)
	? (mostCompatibleStringEncoding_IMetInst)
	: (mostCompatibleStringEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mostCompatibleStringEncoding", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long mostCompatibleStringEncoding(){
			final com.apple.jobjc.Invoke.MsgSend mostCompatibleStringEncoding_IMetInst = get_mostCompatibleStringEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mostCompatibleStringEncoding_IMetInst.init(nativeBuffer, this);
		mostCompatibleStringEncoding_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfGlyphs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfGlyphs_IMetInst(){
		return ((numberOfGlyphs_IMetInst != null)
	? (numberOfGlyphs_IMetInst)
	: (numberOfGlyphs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfGlyphs", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberOfGlyphs(){
			final com.apple.jobjc.Invoke.MsgSend numberOfGlyphs_IMetInst = get_numberOfGlyphs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfGlyphs_IMetInst.init(nativeBuffer, this);
		numberOfGlyphs_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointSize_IMetInst(){
		return ((pointSize_IMetInst != null)
	? (pointSize_IMetInst)
	: (pointSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointSize", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double pointSize(){
			final com.apple.jobjc.Invoke.MsgSend pointSize_IMetInst = get_pointSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointSize_IMetInst.init(nativeBuffer, this);
		pointSize_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionOfGlyph_forCharacter_struckOverRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionOfGlyph_forCharacter_struckOverRect_IMetInst(){
		return ((positionOfGlyph_forCharacter_struckOverRect_IMetInst != null)
	? (positionOfGlyph_forCharacter_struckOverRect_IMetInst)
	: (positionOfGlyph_forCharacter_struckOverRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionOfGlyph:forCharacter:struckOverRect:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UShortCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint positionOfGlyph_forCharacter_struckOverRect(final int aGlyph, final short aChar, final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend positionOfGlyph_forCharacter_struckOverRect_IMetInst = get_positionOfGlyph_forCharacter_struckOverRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionOfGlyph_forCharacter_struckOverRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, aGlyph);
		com.apple.jobjc.PrimitiveCoder.UShortCoder.INST.push(nativeBuffer, aChar);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		positionOfGlyph_forCharacter_struckOverRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionOfGlyph_precededByGlyph_isNominal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionOfGlyph_precededByGlyph_isNominal_IMetInst(){
		return ((positionOfGlyph_precededByGlyph_isNominal_IMetInst != null)
	? (positionOfGlyph_precededByGlyph_isNominal_IMetInst)
	: (positionOfGlyph_precededByGlyph_isNominal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionOfGlyph:precededByGlyph:isNominal:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint positionOfGlyph_precededByGlyph_isNominal(final int curGlyph, final int prevGlyph, final com.apple.jobjc.Pointer<java.lang.Boolean> nominal){
			final com.apple.jobjc.Invoke.MsgSend positionOfGlyph_precededByGlyph_isNominal_IMetInst = get_positionOfGlyph_precededByGlyph_isNominal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionOfGlyph_precededByGlyph_isNominal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, curGlyph);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, prevGlyph);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, nominal);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		positionOfGlyph_precededByGlyph_isNominal_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionOfGlyph_struckOverGlyph_metricsExist_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionOfGlyph_struckOverGlyph_metricsExist_IMetInst(){
		return ((positionOfGlyph_struckOverGlyph_metricsExist_IMetInst != null)
	? (positionOfGlyph_struckOverGlyph_metricsExist_IMetInst)
	: (positionOfGlyph_struckOverGlyph_metricsExist_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionOfGlyph:struckOverGlyph:metricsExist:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint positionOfGlyph_struckOverGlyph_metricsExist(final int curGlyph, final int prevGlyph, final com.apple.jobjc.Pointer<java.lang.Boolean> exist){
			final com.apple.jobjc.Invoke.MsgSend positionOfGlyph_struckOverGlyph_metricsExist_IMetInst = get_positionOfGlyph_struckOverGlyph_metricsExist_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionOfGlyph_struckOverGlyph_metricsExist_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, curGlyph);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, prevGlyph);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, exist);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		positionOfGlyph_struckOverGlyph_metricsExist_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionOfGlyph_struckOverRect_metricsExist_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionOfGlyph_struckOverRect_metricsExist_IMetInst(){
		return ((positionOfGlyph_struckOverRect_metricsExist_IMetInst != null)
	? (positionOfGlyph_struckOverRect_metricsExist_IMetInst)
	: (positionOfGlyph_struckOverRect_metricsExist_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionOfGlyph:struckOverRect:metricsExist:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint positionOfGlyph_struckOverRect_metricsExist(final int aGlyph, final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.Pointer<java.lang.Boolean> exist){
			final com.apple.jobjc.Invoke.MsgSend positionOfGlyph_struckOverRect_metricsExist_IMetInst = get_positionOfGlyph_struckOverRect_metricsExist_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionOfGlyph_struckOverRect_metricsExist_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, aGlyph);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, exist);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		positionOfGlyph_struckOverRect_metricsExist_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst(){
		return ((positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst != null)
	? (positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst)
	: (positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionOfGlyph:withRelation:toBaseGlyph:totalAdvancement:metricsExist:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist(final int thisGlyph, final int rel, final int baseGlyph, final Object /* NSSizePointer (^{_NSSize=ff}, ^{_NSSize=ff}) */ adv, final com.apple.jobjc.Pointer<java.lang.Boolean> exist){
			final com.apple.jobjc.Invoke.MsgSend positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst = get_positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, thisGlyph);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, rel);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, baseGlyph);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, adv);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, exist);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		positionOfGlyph_withRelation_toBaseGlyph_totalAdvancement_metricsExist_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst(){
		return ((positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst != null)
	? (positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst)
	: (positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positionsForCompositeSequence:numberOfGlyphs:pointArray:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public long positionsForCompositeSequence_numberOfGlyphs_pointArray(final com.apple.jobjc.Pointer<java.lang.Integer> someGlyphs, final long numGlyphs, final Object /* NSPointArray (^{_NSPoint="x"f"y"f}, ^{CGPoint="x"d"y"d}) */ points){
			final com.apple.jobjc.Invoke.MsgSend positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst = get_positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, someGlyphs);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, numGlyphs);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, points);
		positionsForCompositeSequence_numberOfGlyphs_pointArray_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printerFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerFont_IMetInst(){
		return ((printerFont_IMetInst != null)
	? (printerFont_IMetInst)
	: (printerFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont printerFont(){
			final com.apple.jobjc.Invoke.MsgSend printerFont_IMetInst = get_printerFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerFont_IMetInst.init(nativeBuffer, this);
		printerFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend renderingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_renderingMode_IMetInst(){
		return ((renderingMode_IMetInst != null)
	? (renderingMode_IMetInst)
	: (renderingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "renderingMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long renderingMode(){
			final com.apple.jobjc.Invoke.MsgSend renderingMode_IMetInst = get_renderingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		renderingMode_IMetInst.init(nativeBuffer, this);
		renderingMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend screenFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_screenFont_IMetInst(){
		return ((screenFont_IMetInst != null)
	? (screenFont_IMetInst)
	: (screenFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "screenFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont screenFont(){
			final com.apple.jobjc.Invoke.MsgSend screenFont_IMetInst = get_screenFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		screenFont_IMetInst.init(nativeBuffer, this);
		screenFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend screenFontWithRenderingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_screenFontWithRenderingMode_IMetInst(){
		return ((screenFontWithRenderingMode_IMetInst != null)
	? (screenFontWithRenderingMode_IMetInst)
	: (screenFontWithRenderingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "screenFontWithRenderingMode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont screenFontWithRenderingMode(final long renderingMode){
			final com.apple.jobjc.Invoke.MsgSend screenFontWithRenderingMode_IMetInst = get_screenFontWithRenderingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		screenFontWithRenderingMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, renderingMode);
		screenFontWithRenderingMode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend set_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_IMetInst(){
		return ((set_IMetInst != null)
	? (set_IMetInst)
	: (set_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void set(){
			final com.apple.jobjc.Invoke.MsgSend set_IMetInst = get_set_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_IMetInst.init(nativeBuffer, this);
		set_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInContext_IMetInst(){
		return ((setInContext_IMetInst != null)
	? (setInContext_IMetInst)
	: (setInContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInContext(final com.apple.jobjc.appkit.NSGraphicsContext graphicsContext){
			final com.apple.jobjc.Invoke.MsgSend setInContext_IMetInst = get_setInContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, graphicsContext);
		setInContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textTransform_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textTransform_IMetInst(){
		return ((textTransform_IMetInst != null)
	? (textTransform_IMetInst)
	: (textTransform_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textTransform", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAffineTransform textTransform(){
			final com.apple.jobjc.Invoke.MsgSend textTransform_IMetInst = get_textTransform_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textTransform_IMetInst.init(nativeBuffer, this);
		textTransform_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAffineTransform returnValue = (com.apple.jobjc.foundation.NSAffineTransform) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend underlinePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_underlinePosition_IMetInst(){
		return ((underlinePosition_IMetInst != null)
	? (underlinePosition_IMetInst)
	: (underlinePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "underlinePosition", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double underlinePosition(){
			final com.apple.jobjc.Invoke.MsgSend underlinePosition_IMetInst = get_underlinePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		underlinePosition_IMetInst.init(nativeBuffer, this);
		underlinePosition_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend underlineThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_underlineThickness_IMetInst(){
		return ((underlineThickness_IMetInst != null)
	? (underlineThickness_IMetInst)
	: (underlineThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "underlineThickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double underlineThickness(){
			final com.apple.jobjc.Invoke.MsgSend underlineThickness_IMetInst = get_underlineThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		underlineThickness_IMetInst.init(nativeBuffer, this);
		underlineThickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalFont_IMetInst(){
		return ((verticalFont_IMetInst != null)
	? (verticalFont_IMetInst)
	: (verticalFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont verticalFont(){
			final com.apple.jobjc.Invoke.MsgSend verticalFont_IMetInst = get_verticalFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalFont_IMetInst.init(nativeBuffer, this);
		verticalFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend widthOfString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthOfString_IMetInst(){
		return ((widthOfString_IMetInst != null)
	? (widthOfString_IMetInst)
	: (widthOfString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthOfString:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double widthOfString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend widthOfString_IMetInst = get_widthOfString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthOfString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		widthOfString_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend xHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_xHeight_IMetInst(){
		return ((xHeight_IMetInst != null)
	? (xHeight_IMetInst)
	: (xHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "xHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double xHeight(){
			final com.apple.jobjc.Invoke.MsgSend xHeight_IMetInst = get_xHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		xHeight_IMetInst.init(nativeBuffer, this);
		xHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
