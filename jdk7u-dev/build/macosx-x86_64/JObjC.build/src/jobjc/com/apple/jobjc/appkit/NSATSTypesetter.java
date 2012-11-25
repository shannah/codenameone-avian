package com.apple.jobjc.appkit;

public  class NSATSTypesetter extends com.apple.jobjc.appkit.NSTypesetter {
	public NSATSTypesetter(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSATSTypesetter(final NSATSTypesetter obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedString_IMetInst(){
		return ((attributedString_IMetInst != null)
	? (attributedString_IMetInst)
	: (attributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedString(){
			final com.apple.jobjc.Invoke.MsgSend attributedString_IMetInst = get_attributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedString_IMetInst.init(nativeBuffer, this);
		attributedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bidiProcessingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bidiProcessingEnabled_IMetInst(){
		return ((bidiProcessingEnabled_IMetInst != null)
	? (bidiProcessingEnabled_IMetInst)
	: (bidiProcessingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bidiProcessingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean bidiProcessingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend bidiProcessingEnabled_IMetInst = get_bidiProcessingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bidiProcessingEnabled_IMetInst.init(nativeBuffer, this);
		bidiProcessingEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst(){
		return ((boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst != null)
	? (boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst)
	: (boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex(final long glyphIndex, final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRect proposedRect, final com.apple.jobjc.foundation.NSPoint glyphPosition, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst = get_boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, proposedRect);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, glyphPosition);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingBoxForControlGlyphAtIndex_forTextContainer_proposedLineFragment_glyphPosition_characterIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterRangeForGlyphRange_actualGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterRangeForGlyphRange_actualGlyphRange_IMetInst(){
		return ((characterRangeForGlyphRange_actualGlyphRange_IMetInst != null)
	? (characterRangeForGlyphRange_actualGlyphRange_IMetInst)
	: (characterRangeForGlyphRange_actualGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterRangeForGlyphRange:actualGlyphRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange characterRangeForGlyphRange_actualGlyphRange(final com.apple.jobjc.foundation.NSRange glyphRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend characterRangeForGlyphRange_actualGlyphRange_IMetInst = get_characterRangeForGlyphRange_actualGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterRangeForGlyphRange_actualGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualGlyphRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		characterRangeForGlyphRange_actualGlyphRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentTextContainer_IMetInst(){
		return ((currentTextContainer_IMetInst != null)
	? (currentTextContainer_IMetInst)
	: (currentTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentTextContainer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextContainer currentTextContainer(){
			final com.apple.jobjc.Invoke.MsgSend currentTextContainer_IMetInst = get_currentTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentTextContainer_IMetInst.init(nativeBuffer, this);
		currentTextContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextContainer returnValue = (com.apple.jobjc.appkit.NSTextContainer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteGlyphsInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteGlyphsInRange_IMetInst(){
		return ((deleteGlyphsInRange_IMetInst != null)
	? (deleteGlyphsInRange_IMetInst)
	: (deleteGlyphsInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteGlyphsInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void deleteGlyphsInRange(final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend deleteGlyphsInRange_IMetInst = get_deleteGlyphsInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteGlyphsInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		deleteGlyphsInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst(){
		return ((getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst != null)
	? (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst)
	: (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(final com.apple.jobjc.foundation.NSRange glyphsRange, final com.apple.jobjc.Pointer<java.lang.Integer> glyphBuffer, final com.apple.jobjc.Pointer<java.lang.Long> charIndexBuffer, final Object /* NSGlyphInscription* (^I, ^Q) */ inscribeBuffer, final com.apple.jobjc.Pointer<java.lang.Boolean> elasticBuffer){
			final com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst = get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphsRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndexBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, inscribeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, elasticBuffer);
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst(){
		return ((getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst != null)
	? (getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst)
	: (getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getLineFragmentRect:usedRect:forParagraphSeparatorGlyphRange:atProposedOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> lineFragmentRect, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> lineFragmentUsedRect, final com.apple.jobjc.foundation.NSRange paragraphSeparatorGlyphRange, final com.apple.jobjc.foundation.NSPoint lineOrigin){
			final com.apple.jobjc.Invoke.MsgSend getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst = get_getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lineFragmentRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lineFragmentUsedRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, paragraphSeparatorGlyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, lineOrigin);
		getLineFragmentRect_usedRect_forParagraphSeparatorGlyphRange_atProposedOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphRangeForCharacterRange_actualCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphRangeForCharacterRange_actualCharacterRange_IMetInst(){
		return ((glyphRangeForCharacterRange_actualCharacterRange_IMetInst != null)
	? (glyphRangeForCharacterRange_actualCharacterRange_IMetInst)
	: (glyphRangeForCharacterRange_actualCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphRangeForCharacterRange:actualCharacterRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange glyphRangeForCharacterRange_actualCharacterRange(final com.apple.jobjc.foundation.NSRange charRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualCharRange){
			final com.apple.jobjc.Invoke.MsgSend glyphRangeForCharacterRange_actualCharacterRange_IMetInst = get_glyphRangeForCharacterRange_actualCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphRangeForCharacterRange_actualCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualCharRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		glyphRangeForCharacterRange_actualCharacterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hyphenCharacterForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hyphenCharacterForGlyphAtIndex_IMetInst(){
		return ((hyphenCharacterForGlyphAtIndex_IMetInst != null)
	? (hyphenCharacterForGlyphAtIndex_IMetInst)
	: (hyphenCharacterForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hyphenCharacterForGlyphAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public int hyphenCharacterForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend hyphenCharacterForGlyphAtIndex_IMetInst = get_hyphenCharacterForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hyphenCharacterForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		hyphenCharacterForGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hyphenationFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hyphenationFactor_IMetInst(){
		return ((hyphenationFactor_IMetInst != null)
	? (hyphenationFactor_IMetInst)
	: (hyphenationFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hyphenationFactor", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float hyphenationFactor(){
			final com.apple.jobjc.Invoke.MsgSend hyphenationFactor_IMetInst = get_hyphenationFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hyphenationFactor_IMetInst.init(nativeBuffer, this);
		hyphenationFactor_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hyphenationFactorForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hyphenationFactorForGlyphAtIndex_IMetInst(){
		return ((hyphenationFactorForGlyphAtIndex_IMetInst != null)
	? (hyphenationFactorForGlyphAtIndex_IMetInst)
	: (hyphenationFactorForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hyphenationFactorForGlyphAtIndex:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public float hyphenationFactorForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend hyphenationFactorForGlyphAtIndex_IMetInst = get_hyphenationFactorForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hyphenationFactorForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		hyphenationFactorForGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertGlyph_atGlyphIndex_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertGlyph_atGlyphIndex_characterIndex_IMetInst(){
		return ((insertGlyph_atGlyphIndex_characterIndex_IMetInst != null)
	? (insertGlyph_atGlyphIndex_characterIndex_IMetInst)
	: (insertGlyph_atGlyphIndex_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertGlyph:atGlyphIndex:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertGlyph_atGlyphIndex_characterIndex(final int glyph, final long glyphIndex, final long characterIndex){
			final com.apple.jobjc.Invoke.MsgSend insertGlyph_atGlyphIndex_characterIndex_IMetInst = get_insertGlyph_atGlyphIndex_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertGlyph_atGlyphIndex_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, glyph);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, characterIndex);
		insertGlyph_atGlyphIndex_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManager_IMetInst(){
		return ((layoutManager_IMetInst != null)
	? (layoutManager_IMetInst)
	: (layoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSLayoutManager layoutManager(){
			final com.apple.jobjc.Invoke.MsgSend layoutManager_IMetInst = get_layoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManager_IMetInst.init(nativeBuffer, this);
		layoutManager_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSLayoutManager returnValue = (com.apple.jobjc.appkit.NSLayoutManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutParagraphAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutParagraphAtPoint_IMetInst(){
		return ((layoutParagraphAtPoint_IMetInst != null)
	? (layoutParagraphAtPoint_IMetInst)
	: (layoutParagraphAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutParagraphAtPoint:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long layoutParagraphAtPoint(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSPoint> lineFragmentOrigin){
			final com.apple.jobjc.Invoke.MsgSend layoutParagraphAtPoint_IMetInst = get_layoutParagraphAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutParagraphAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lineFragmentOrigin);
		layoutParagraphAtPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentPadding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentPadding_IMetInst(){
		return ((lineFragmentPadding_IMetInst != null)
	? (lineFragmentPadding_IMetInst)
	: (lineFragmentPadding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentPadding", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineFragmentPadding(){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentPadding_IMetInst = get_lineFragmentPadding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentPadding_IMetInst.init(nativeBuffer, this);
		lineFragmentPadding_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentRectForProposedRect_remainingRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentRectForProposedRect_remainingRect_IMetInst(){
		return ((lineFragmentRectForProposedRect_remainingRect_IMetInst != null)
	? (lineFragmentRectForProposedRect_remainingRect_IMetInst)
	: (lineFragmentRectForProposedRect_remainingRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentRectForProposedRect:remainingRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentRectForProposedRect_remainingRect(final com.apple.jobjc.foundation.NSRect proposedRect, final Object /* NSRectPointer (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ remainingRect){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentRectForProposedRect_remainingRect_IMetInst = get_lineFragmentRectForProposedRect_remainingRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentRectForProposedRect_remainingRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, proposedRect);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, remainingRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentRectForProposedRect_remainingRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst(){
		return ((lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst != null)
	? (lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst)
	: (lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(final long glyphIndex, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst = get_lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		lineSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphGlyphRange_IMetInst(){
		return ((paragraphGlyphRange_IMetInst != null)
	? (paragraphGlyphRange_IMetInst)
	: (paragraphGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphGlyphRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange paragraphGlyphRange(){
			final com.apple.jobjc.Invoke.MsgSend paragraphGlyphRange_IMetInst = get_paragraphGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphGlyphRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		paragraphGlyphRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphSeparatorGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphSeparatorGlyphRange_IMetInst(){
		return ((paragraphSeparatorGlyphRange_IMetInst != null)
	? (paragraphSeparatorGlyphRange_IMetInst)
	: (paragraphSeparatorGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphSeparatorGlyphRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange paragraphSeparatorGlyphRange(){
			final com.apple.jobjc.Invoke.MsgSend paragraphSeparatorGlyphRange_IMetInst = get_paragraphSeparatorGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphSeparatorGlyphRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		paragraphSeparatorGlyphRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst(){
		return ((paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst != null)
	? (paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst)
	: (paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphSpacingAfterGlyphAtIndex:withProposedLineFragmentRect:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect(final long glyphIndex, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst = get_paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		paragraphSpacingAfterGlyphAtIndex_withProposedLineFragmentRect_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst(){
		return ((paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst != null)
	? (paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst)
	: (paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphSpacingBeforeGlyphAtIndex:withProposedLineFragmentRect:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect(final long glyphIndex, final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst = get_paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		paragraphSpacingBeforeGlyphAtIndex_withProposedLineFragmentRect_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttachmentSize_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttachmentSize_forGlyphRange_IMetInst(){
		return ((setAttachmentSize_forGlyphRange_IMetInst != null)
	? (setAttachmentSize_forGlyphRange_IMetInst)
	: (setAttachmentSize_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttachmentSize:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setAttachmentSize_forGlyphRange(final com.apple.jobjc.foundation.NSSize attachmentSize, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setAttachmentSize_forGlyphRange_IMetInst = get_setAttachmentSize_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttachmentSize_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, attachmentSize);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setAttachmentSize_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedString_IMetInst(){
		return ((setAttributedString_IMetInst != null)
	? (setAttributedString_IMetInst)
	: (setAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedString(final com.apple.jobjc.foundation.NSAttributedString attrString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedString_IMetInst = get_setAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		setAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBidiLevels_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBidiLevels_forGlyphRange_IMetInst(){
		return ((setBidiLevels_forGlyphRange_IMetInst != null)
	? (setBidiLevels_forGlyphRange_IMetInst)
	: (setBidiLevels_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBidiLevels:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setBidiLevels_forGlyphRange(final com.apple.jobjc.Pointer<java.lang.Byte> levels, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setBidiLevels_forGlyphRange_IMetInst = get_setBidiLevels_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBidiLevels_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, levels);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setBidiLevels_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBidiProcessingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBidiProcessingEnabled_IMetInst(){
		return ((setBidiProcessingEnabled_IMetInst != null)
	? (setBidiProcessingEnabled_IMetInst)
	: (setBidiProcessingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBidiProcessingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBidiProcessingEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBidiProcessingEnabled_IMetInst = get_setBidiProcessingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBidiProcessingEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBidiProcessingEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsOutsideLineFragment_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsOutsideLineFragment_forGlyphRange_IMetInst(){
		return ((setDrawsOutsideLineFragment_forGlyphRange_IMetInst != null)
	? (setDrawsOutsideLineFragment_forGlyphRange_IMetInst)
	: (setDrawsOutsideLineFragment_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsOutsideLineFragment:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setDrawsOutsideLineFragment_forGlyphRange(final boolean flag, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setDrawsOutsideLineFragment_forGlyphRange_IMetInst = get_setDrawsOutsideLineFragment_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsOutsideLineFragment_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setDrawsOutsideLineFragment_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHardInvalidation_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHardInvalidation_forGlyphRange_IMetInst(){
		return ((setHardInvalidation_forGlyphRange_IMetInst != null)
	? (setHardInvalidation_forGlyphRange_IMetInst)
	: (setHardInvalidation_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHardInvalidation:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setHardInvalidation_forGlyphRange(final boolean flag, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setHardInvalidation_forGlyphRange_IMetInst = get_setHardInvalidation_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHardInvalidation_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setHardInvalidation_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHyphenationFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHyphenationFactor_IMetInst(){
		return ((setHyphenationFactor_IMetInst != null)
	? (setHyphenationFactor_IMetInst)
	: (setHyphenationFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHyphenationFactor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setHyphenationFactor(final float factor){
			final com.apple.jobjc.Invoke.MsgSend setHyphenationFactor_IMetInst = get_setHyphenationFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHyphenationFactor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, factor);
		setHyphenationFactor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineFragmentPadding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineFragmentPadding_IMetInst(){
		return ((setLineFragmentPadding_IMetInst != null)
	? (setLineFragmentPadding_IMetInst)
	: (setLineFragmentPadding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineFragmentPadding:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineFragmentPadding(final double padding){
			final com.apple.jobjc.Invoke.MsgSend setLineFragmentPadding_IMetInst = get_setLineFragmentPadding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineFragmentPadding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, padding);
		setLineFragmentPadding_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst(){
		return ((setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst != null)
	? (setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst)
	: (setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineFragmentRect_forGlyphRange_usedRect_baselineOffset(final com.apple.jobjc.foundation.NSRect fragmentRect, final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.foundation.NSRect usedRect, final double baselineOffset){
			final com.apple.jobjc.Invoke.MsgSend setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst = get_setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fragmentRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, usedRect);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, baselineOffset);
		setLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocation_withAdvancements_forStartOfGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocation_withAdvancements_forStartOfGlyphRange_IMetInst(){
		return ((setLocation_withAdvancements_forStartOfGlyphRange_IMetInst != null)
	? (setLocation_withAdvancements_forStartOfGlyphRange_IMetInst)
	: (setLocation_withAdvancements_forStartOfGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocation:withAdvancements:forStartOfGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setLocation_withAdvancements_forStartOfGlyphRange(final com.apple.jobjc.foundation.NSPoint location, final com.apple.jobjc.Pointer<java.lang.Double> advancements, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setLocation_withAdvancements_forStartOfGlyphRange_IMetInst = get_setLocation_withAdvancements_forStartOfGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocation_withAdvancements_forStartOfGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, advancements);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setLocation_withAdvancements_forStartOfGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNotShownAttribute_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNotShownAttribute_forGlyphRange_IMetInst(){
		return ((setNotShownAttribute_forGlyphRange_IMetInst != null)
	? (setNotShownAttribute_forGlyphRange_IMetInst)
	: (setNotShownAttribute_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNotShownAttribute:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setNotShownAttribute_forGlyphRange(final boolean flag, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setNotShownAttribute_forGlyphRange_IMetInst = get_setNotShownAttribute_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNotShownAttribute_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setNotShownAttribute_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParagraphGlyphRange_separatorGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParagraphGlyphRange_separatorGlyphRange_IMetInst(){
		return ((setParagraphGlyphRange_separatorGlyphRange_IMetInst != null)
	? (setParagraphGlyphRange_separatorGlyphRange_IMetInst)
	: (setParagraphGlyphRange_separatorGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParagraphGlyphRange:separatorGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setParagraphGlyphRange_separatorGlyphRange(final com.apple.jobjc.foundation.NSRange paragraphRange, final com.apple.jobjc.foundation.NSRange paragraphSeparatorRange){
			final com.apple.jobjc.Invoke.MsgSend setParagraphGlyphRange_separatorGlyphRange_IMetInst = get_setParagraphGlyphRange_separatorGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParagraphGlyphRange_separatorGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, paragraphRange);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, paragraphSeparatorRange);
		setParagraphGlyphRange_separatorGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTypesetterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTypesetterBehavior_IMetInst(){
		return ((setTypesetterBehavior_IMetInst != null)
	? (setTypesetterBehavior_IMetInst)
	: (setTypesetterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTypesetterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTypesetterBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setTypesetterBehavior_IMetInst = get_setTypesetterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTypesetterBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, behavior);
		setTypesetterBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFontLeading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFontLeading_IMetInst(){
		return ((setUsesFontLeading_IMetInst != null)
	? (setUsesFontLeading_IMetInst)
	: (setUsesFontLeading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFontLeading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFontLeading(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFontLeading_IMetInst = get_setUsesFontLeading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFontLeading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFontLeading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst(){
		return ((shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst != null)
	? (shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst)
	: (shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldBreakLineByHyphenatingBeforeCharacterAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean shouldBreakLineByHyphenatingBeforeCharacterAtIndex(final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst = get_shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		shouldBreakLineByHyphenatingBeforeCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst(){
		return ((shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst != null)
	? (shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst)
	: (shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldBreakLineByWordBeforeCharacterAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean shouldBreakLineByWordBeforeCharacterAtIndex(final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst = get_shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		shouldBreakLineByWordBeforeCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substituteFontForFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substituteFontForFont_IMetInst(){
		return ((substituteFontForFont_IMetInst != null)
	? (substituteFontForFont_IMetInst)
	: (substituteFontForFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substituteFontForFont:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont substituteFontForFont(final com.apple.jobjc.appkit.NSFont originalFont){
			final com.apple.jobjc.Invoke.MsgSend substituteFontForFont_IMetInst = get_substituteFontForFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substituteFontForFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, originalFont);
		substituteFontForFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend substituteGlyphsInRange_withGlyphs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_substituteGlyphsInRange_withGlyphs_IMetInst(){
		return ((substituteGlyphsInRange_withGlyphs_IMetInst != null)
	? (substituteGlyphsInRange_withGlyphs_IMetInst)
	: (substituteGlyphsInRange_withGlyphs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "substituteGlyphsInRange:withGlyphs:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void substituteGlyphsInRange_withGlyphs(final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.Pointer<java.lang.Integer> glyphs){
			final com.apple.jobjc.Invoke.MsgSend substituteGlyphsInRange_withGlyphs_IMetInst = get_substituteGlyphsInRange_withGlyphs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		substituteGlyphsInRange_withGlyphs_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		substituteGlyphsInRange_withGlyphs_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textTabForGlyphLocation_writingDirection_maxLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textTabForGlyphLocation_writingDirection_maxLocation_IMetInst(){
		return ((textTabForGlyphLocation_writingDirection_maxLocation_IMetInst != null)
	? (textTabForGlyphLocation_writingDirection_maxLocation_IMetInst)
	: (textTabForGlyphLocation_writingDirection_maxLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textTabForGlyphLocation:writingDirection:maxLocation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSTextTab textTabForGlyphLocation_writingDirection_maxLocation(final double glyphLocation, final long direction, final double maxLocation){
			final com.apple.jobjc.Invoke.MsgSend textTabForGlyphLocation_writingDirection_maxLocation_IMetInst = get_textTabForGlyphLocation_writingDirection_maxLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textTabForGlyphLocation_writingDirection_maxLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, glyphLocation);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, direction);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, maxLocation);
		textTabForGlyphLocation_writingDirection_maxLocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextTab returnValue = (com.apple.jobjc.appkit.NSTextTab) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typesetterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typesetterBehavior_IMetInst(){
		return ((typesetterBehavior_IMetInst != null)
	? (typesetterBehavior_IMetInst)
	: (typesetterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typesetterBehavior", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long typesetterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend typesetterBehavior_IMetInst = get_typesetterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typesetterBehavior_IMetInst.init(nativeBuffer, this);
		typesetterBehavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFontLeading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFontLeading_IMetInst(){
		return ((usesFontLeading_IMetInst != null)
	? (usesFontLeading_IMetInst)
	: (usesFontLeading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFontLeading", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFontLeading(){
			final com.apple.jobjc.Invoke.MsgSend usesFontLeading_IMetInst = get_usesFontLeading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFontLeading_IMetInst.init(nativeBuffer, this);
		usesFontLeading_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst(){
		return ((willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst != null)
	? (willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst)
	: (willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willSetLineFragmentRect:forGlyphRange:usedRect:baselineOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> lineRect, final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> usedRect, final com.apple.jobjc.Pointer<java.lang.Double> baselineOffset){
			final com.apple.jobjc.Invoke.MsgSend willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst = get_willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, lineRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, usedRect);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, baselineOffset);
		willSetLineFragmentRect_forGlyphRange_usedRect_baselineOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

}
