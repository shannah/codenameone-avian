package com.apple.jobjc.appkit;

public  class NSLayoutManager extends com.apple.jobjc.foundation.NSObject {
	public NSLayoutManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLayoutManager(final NSLayoutManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTemporaryAttribute_value_forCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTemporaryAttribute_value_forCharacterRange_IMetInst(){
		return ((addTemporaryAttribute_value_forCharacterRange_IMetInst != null)
	? (addTemporaryAttribute_value_forCharacterRange_IMetInst)
	: (addTemporaryAttribute_value_forCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTemporaryAttribute:value:forCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addTemporaryAttribute_value_forCharacterRange(final com.apple.jobjc.foundation.NSString attrName, final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend addTemporaryAttribute_value_forCharacterRange_IMetInst = get_addTemporaryAttribute_value_forCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTemporaryAttribute_value_forCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		addTemporaryAttribute_value_forCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addTemporaryAttributes_forCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTemporaryAttributes_forCharacterRange_IMetInst(){
		return ((addTemporaryAttributes_forCharacterRange_IMetInst != null)
	? (addTemporaryAttributes_forCharacterRange_IMetInst)
	: (addTemporaryAttributes_forCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTemporaryAttributes:forCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addTemporaryAttributes_forCharacterRange(final com.apple.jobjc.foundation.NSDictionary attrs, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend addTemporaryAttributes_forCharacterRange_IMetInst = get_addTemporaryAttributes_forCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTemporaryAttributes_forCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		addTemporaryAttributes_forCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTextContainer_IMetInst(){
		return ((addTextContainer_IMetInst != null)
	? (addTextContainer_IMetInst)
	: (addTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTextContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTextContainer(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend addTextContainer_IMetInst = get_addTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		addTextContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsNonContiguousLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsNonContiguousLayout_IMetInst(){
		return ((allowsNonContiguousLayout_IMetInst != null)
	? (allowsNonContiguousLayout_IMetInst)
	: (allowsNonContiguousLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsNonContiguousLayout", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsNonContiguousLayout(){
			final com.apple.jobjc.Invoke.MsgSend allowsNonContiguousLayout_IMetInst = get_allowsNonContiguousLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsNonContiguousLayout_IMetInst.init(nativeBuffer, this);
		allowsNonContiguousLayout_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attachmentSizeForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachmentSizeForGlyphAtIndex_IMetInst(){
		return ((attachmentSizeForGlyphAtIndex_IMetInst != null)
	? (attachmentSizeForGlyphAtIndex_IMetInst)
	: (attachmentSizeForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachmentSizeForGlyphAtIndex:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize attachmentSizeForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend attachmentSizeForGlyphAtIndex_IMetInst = get_attachmentSizeForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachmentSizeForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		attachmentSizeForGlyphAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend backgroundLayoutEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundLayoutEnabled_IMetInst(){
		return ((backgroundLayoutEnabled_IMetInst != null)
	? (backgroundLayoutEnabled_IMetInst)
	: (backgroundLayoutEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundLayoutEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean backgroundLayoutEnabled(){
			final com.apple.jobjc.Invoke.MsgSend backgroundLayoutEnabled_IMetInst = get_backgroundLayoutEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundLayoutEnabled_IMetInst.init(nativeBuffer, this);
		backgroundLayoutEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingRectForGlyphRange_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingRectForGlyphRange_inTextContainer_IMetInst(){
		return ((boundingRectForGlyphRange_inTextContainer_IMetInst != null)
	? (boundingRectForGlyphRange_inTextContainer_IMetInst)
	: (boundingRectForGlyphRange_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingRectForGlyphRange:inTextContainer:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect boundingRectForGlyphRange_inTextContainer(final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend boundingRectForGlyphRange_inTextContainer_IMetInst = get_boundingRectForGlyphRange_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingRectForGlyphRange_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingRectForGlyphRange_inTextContainer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundsRectForTextBlock_atIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundsRectForTextBlock_atIndex_effectiveRange_IMetInst(){
		return ((boundsRectForTextBlock_atIndex_effectiveRange_IMetInst != null)
	? (boundsRectForTextBlock_atIndex_effectiveRange_IMetInst)
	: (boundsRectForTextBlock_atIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundsRectForTextBlock:atIndex:effectiveRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect boundsRectForTextBlock_atIndex_effectiveRange(final com.apple.jobjc.appkit.NSTextBlock block, final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend boundsRectForTextBlock_atIndex_effectiveRange_IMetInst = get_boundsRectForTextBlock_atIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundsRectForTextBlock_atIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundsRectForTextBlock_atIndex_effectiveRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundsRectForTextBlock_glyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundsRectForTextBlock_glyphRange_IMetInst(){
		return ((boundsRectForTextBlock_glyphRange_IMetInst != null)
	? (boundsRectForTextBlock_glyphRange_IMetInst)
	: (boundsRectForTextBlock_glyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundsRectForTextBlock:glyphRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect boundsRectForTextBlock_glyphRange(final com.apple.jobjc.appkit.NSTextBlock block, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend boundsRectForTextBlock_glyphRange_IMetInst = get_boundsRectForTextBlock_glyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundsRectForTextBlock_glyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundsRectForTextBlock_glyphRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIndexForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIndexForGlyphAtIndex_IMetInst(){
		return ((characterIndexForGlyphAtIndex_IMetInst != null)
	? (characterIndexForGlyphAtIndex_IMetInst)
	: (characterIndexForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIndexForGlyphAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long characterIndexForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend characterIndexForGlyphAtIndex_IMetInst = get_characterIndexForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIndexForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		characterIndexForGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst(){
		return ((characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst != null)
	? (characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst)
	: (characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSTextContainer container, final com.apple.jobjc.Pointer<java.lang.Double> partialFraction){
			final com.apple.jobjc.Invoke.MsgSend characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst = get_characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, partialFraction);
		characterIndexForPoint_inTextContainer_fractionOfDistanceBetweenInsertionPoints_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend defaultAttachmentScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultAttachmentScaling_IMetInst(){
		return ((defaultAttachmentScaling_IMetInst != null)
	? (defaultAttachmentScaling_IMetInst)
	: (defaultAttachmentScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultAttachmentScaling", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultAttachmentScaling(){
			final com.apple.jobjc.Invoke.MsgSend defaultAttachmentScaling_IMetInst = get_defaultAttachmentScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultAttachmentScaling_IMetInst.init(nativeBuffer, this);
		defaultAttachmentScaling_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultBaselineOffsetForFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultBaselineOffsetForFont_IMetInst(){
		return ((defaultBaselineOffsetForFont_IMetInst != null)
	? (defaultBaselineOffsetForFont_IMetInst)
	: (defaultBaselineOffsetForFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultBaselineOffsetForFont:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double defaultBaselineOffsetForFont(final com.apple.jobjc.appkit.NSFont theFont){
			final com.apple.jobjc.Invoke.MsgSend defaultBaselineOffsetForFont_IMetInst = get_defaultBaselineOffsetForFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultBaselineOffsetForFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theFont);
		defaultBaselineOffsetForFont_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultLineHeightForFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultLineHeightForFont_IMetInst(){
		return ((defaultLineHeightForFont_IMetInst != null)
	? (defaultLineHeightForFont_IMetInst)
	: (defaultLineHeightForFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultLineHeightForFont:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double defaultLineHeightForFont(final com.apple.jobjc.appkit.NSFont theFont){
			final com.apple.jobjc.Invoke.MsgSend defaultLineHeightForFont_IMetInst = get_defaultLineHeightForFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultLineHeightForFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theFont);
		defaultLineHeightForFont_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend drawBackgroundForGlyphRange_atPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBackgroundForGlyphRange_atPoint_IMetInst(){
		return ((drawBackgroundForGlyphRange_atPoint_IMetInst != null)
	? (drawBackgroundForGlyphRange_atPoint_IMetInst)
	: (drawBackgroundForGlyphRange_atPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBackgroundForGlyphRange:atPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawBackgroundForGlyphRange_atPoint(final com.apple.jobjc.foundation.NSRange glyphsToShow, final com.apple.jobjc.foundation.NSPoint origin){
			final com.apple.jobjc.Invoke.MsgSend drawBackgroundForGlyphRange_atPoint_IMetInst = get_drawBackgroundForGlyphRange_atPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBackgroundForGlyphRange_atPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphsToShow);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, origin);
		drawBackgroundForGlyphRange_atPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawGlyphsForGlyphRange_atPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawGlyphsForGlyphRange_atPoint_IMetInst(){
		return ((drawGlyphsForGlyphRange_atPoint_IMetInst != null)
	? (drawGlyphsForGlyphRange_atPoint_IMetInst)
	: (drawGlyphsForGlyphRange_atPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawGlyphsForGlyphRange:atPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawGlyphsForGlyphRange_atPoint(final com.apple.jobjc.foundation.NSRange glyphsToShow, final com.apple.jobjc.foundation.NSPoint origin){
			final com.apple.jobjc.Invoke.MsgSend drawGlyphsForGlyphRange_atPoint_IMetInst = get_drawGlyphsForGlyphRange_atPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawGlyphsForGlyphRange_atPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphsToShow);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, origin);
		drawGlyphsForGlyphRange_atPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst(){
		return ((drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst != null)
	? (drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst)
	: (drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(final com.apple.jobjc.foundation.NSRange glyphRange, final long strikethroughVal, final double baselineOffset, final com.apple.jobjc.foundation.NSRect lineRect, final com.apple.jobjc.foundation.NSRange lineGlyphRange, final com.apple.jobjc.foundation.NSPoint containerOrigin){
			final com.apple.jobjc.Invoke.MsgSend drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = get_drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, strikethroughVal);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, baselineOffset);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, lineRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, lineGlyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, containerOrigin);
		drawStrikethroughForGlyphRange_strikethroughType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst(){
		return ((drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst != null)
	? (drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst)
	: (drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(final com.apple.jobjc.foundation.NSRange glyphRange, final long underlineVal, final double baselineOffset, final com.apple.jobjc.foundation.NSRect lineRect, final com.apple.jobjc.foundation.NSRange lineGlyphRange, final com.apple.jobjc.foundation.NSPoint containerOrigin){
			final com.apple.jobjc.Invoke.MsgSend drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = get_drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, underlineVal);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, baselineOffset);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, lineRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, lineGlyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, containerOrigin);
		drawUnderlineForGlyphRange_underlineType_baselineOffset_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsOutsideLineFragmentForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsOutsideLineFragmentForGlyphAtIndex_IMetInst(){
		return ((drawsOutsideLineFragmentForGlyphAtIndex_IMetInst != null)
	? (drawsOutsideLineFragmentForGlyphAtIndex_IMetInst)
	: (drawsOutsideLineFragmentForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsOutsideLineFragmentForGlyphAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean drawsOutsideLineFragmentForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend drawsOutsideLineFragmentForGlyphAtIndex_IMetInst = get_drawsOutsideLineFragmentForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsOutsideLineFragmentForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		drawsOutsideLineFragmentForGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureGlyphsForCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureGlyphsForCharacterRange_IMetInst(){
		return ((ensureGlyphsForCharacterRange_IMetInst != null)
	? (ensureGlyphsForCharacterRange_IMetInst)
	: (ensureGlyphsForCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureGlyphsForCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void ensureGlyphsForCharacterRange(final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend ensureGlyphsForCharacterRange_IMetInst = get_ensureGlyphsForCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureGlyphsForCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		ensureGlyphsForCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureGlyphsForGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureGlyphsForGlyphRange_IMetInst(){
		return ((ensureGlyphsForGlyphRange_IMetInst != null)
	? (ensureGlyphsForGlyphRange_IMetInst)
	: (ensureGlyphsForGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureGlyphsForGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void ensureGlyphsForGlyphRange(final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend ensureGlyphsForGlyphRange_IMetInst = get_ensureGlyphsForGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureGlyphsForGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		ensureGlyphsForGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureLayoutForBoundingRect_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureLayoutForBoundingRect_inTextContainer_IMetInst(){
		return ((ensureLayoutForBoundingRect_inTextContainer_IMetInst != null)
	? (ensureLayoutForBoundingRect_inTextContainer_IMetInst)
	: (ensureLayoutForBoundingRect_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureLayoutForBoundingRect:inTextContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void ensureLayoutForBoundingRect_inTextContainer(final com.apple.jobjc.foundation.NSRect bounds, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend ensureLayoutForBoundingRect_inTextContainer_IMetInst = get_ensureLayoutForBoundingRect_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureLayoutForBoundingRect_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bounds);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		ensureLayoutForBoundingRect_inTextContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureLayoutForCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureLayoutForCharacterRange_IMetInst(){
		return ((ensureLayoutForCharacterRange_IMetInst != null)
	? (ensureLayoutForCharacterRange_IMetInst)
	: (ensureLayoutForCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureLayoutForCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void ensureLayoutForCharacterRange(final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend ensureLayoutForCharacterRange_IMetInst = get_ensureLayoutForCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureLayoutForCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		ensureLayoutForCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureLayoutForGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureLayoutForGlyphRange_IMetInst(){
		return ((ensureLayoutForGlyphRange_IMetInst != null)
	? (ensureLayoutForGlyphRange_IMetInst)
	: (ensureLayoutForGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureLayoutForGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void ensureLayoutForGlyphRange(final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend ensureLayoutForGlyphRange_IMetInst = get_ensureLayoutForGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureLayoutForGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		ensureLayoutForGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend ensureLayoutForTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ensureLayoutForTextContainer_IMetInst(){
		return ((ensureLayoutForTextContainer_IMetInst != null)
	? (ensureLayoutForTextContainer_IMetInst)
	: (ensureLayoutForTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ensureLayoutForTextContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void ensureLayoutForTextContainer(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend ensureLayoutForTextContainer_IMetInst = get_ensureLayoutForTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ensureLayoutForTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		ensureLayoutForTextContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend extraLineFragmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_extraLineFragmentRect_IMetInst(){
		return ((extraLineFragmentRect_IMetInst != null)
	? (extraLineFragmentRect_IMetInst)
	: (extraLineFragmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "extraLineFragmentRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect extraLineFragmentRect(){
			final com.apple.jobjc.Invoke.MsgSend extraLineFragmentRect_IMetInst = get_extraLineFragmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		extraLineFragmentRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		extraLineFragmentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend extraLineFragmentTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_extraLineFragmentTextContainer_IMetInst(){
		return ((extraLineFragmentTextContainer_IMetInst != null)
	? (extraLineFragmentTextContainer_IMetInst)
	: (extraLineFragmentTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "extraLineFragmentTextContainer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextContainer extraLineFragmentTextContainer(){
			final com.apple.jobjc.Invoke.MsgSend extraLineFragmentTextContainer_IMetInst = get_extraLineFragmentTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		extraLineFragmentTextContainer_IMetInst.init(nativeBuffer, this);
		extraLineFragmentTextContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextContainer returnValue = (com.apple.jobjc.appkit.NSTextContainer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend extraLineFragmentUsedRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_extraLineFragmentUsedRect_IMetInst(){
		return ((extraLineFragmentUsedRect_IMetInst != null)
	? (extraLineFragmentUsedRect_IMetInst)
	: (extraLineFragmentUsedRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "extraLineFragmentUsedRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect extraLineFragmentUsedRect(){
			final com.apple.jobjc.Invoke.MsgSend extraLineFragmentUsedRect_IMetInst = get_extraLineFragmentUsedRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		extraLineFragmentUsedRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		extraLineFragmentUsedRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fillBackgroundRectArray_count_forCharacterRange_color_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fillBackgroundRectArray_count_forCharacterRange_color_IMetInst(){
		return ((fillBackgroundRectArray_count_forCharacterRange_color_IMetInst != null)
	? (fillBackgroundRectArray_count_forCharacterRange_color_IMetInst)
	: (fillBackgroundRectArray_count_forCharacterRange_color_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fillBackgroundRectArray:count:forCharacterRange:color:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void fillBackgroundRectArray_count_forCharacterRange_color(final Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ rectArray, final long rectCount, final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend fillBackgroundRectArray_count_forCharacterRange_color_IMetInst = get_fillBackgroundRectArray_count_forCharacterRange_color_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fillBackgroundRectArray_count_forCharacterRange_color_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, rectArray);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, rectCount);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		fillBackgroundRectArray_count_forCharacterRange_color_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstTextView_IMetInst(){
		return ((firstTextView_IMetInst != null)
	? (firstTextView_IMetInst)
	: (firstTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstTextView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextView firstTextView(){
			final com.apple.jobjc.Invoke.MsgSend firstTextView_IMetInst = get_firstTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstTextView_IMetInst.init(nativeBuffer, this);
		firstTextView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextView returnValue = (com.apple.jobjc.appkit.NSTextView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstUnlaidCharacterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstUnlaidCharacterIndex_IMetInst(){
		return ((firstUnlaidCharacterIndex_IMetInst != null)
	? (firstUnlaidCharacterIndex_IMetInst)
	: (firstUnlaidCharacterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstUnlaidCharacterIndex", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long firstUnlaidCharacterIndex(){
			final com.apple.jobjc.Invoke.MsgSend firstUnlaidCharacterIndex_IMetInst = get_firstUnlaidCharacterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstUnlaidCharacterIndex_IMetInst.init(nativeBuffer, this);
		firstUnlaidCharacterIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstUnlaidGlyphIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstUnlaidGlyphIndex_IMetInst(){
		return ((firstUnlaidGlyphIndex_IMetInst != null)
	? (firstUnlaidGlyphIndex_IMetInst)
	: (firstUnlaidGlyphIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstUnlaidGlyphIndex", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long firstUnlaidGlyphIndex(){
			final com.apple.jobjc.Invoke.MsgSend firstUnlaidGlyphIndex_IMetInst = get_firstUnlaidGlyphIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstUnlaidGlyphIndex_IMetInst.init(nativeBuffer, this);
		firstUnlaidGlyphIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst(){
		return ((fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst != null)
	? (fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst)
	: (fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fractionOfDistanceThroughGlyphForPoint:inTextContainer:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double fractionOfDistanceThroughGlyphForPoint_inTextContainer(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst = get_fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		fractionOfDistanceThroughGlyphForPoint_inTextContainer_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getFirstUnlaidCharacterIndex_glyphIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getFirstUnlaidCharacterIndex_glyphIndex_IMetInst(){
		return ((getFirstUnlaidCharacterIndex_glyphIndex_IMetInst != null)
	? (getFirstUnlaidCharacterIndex_glyphIndex_IMetInst)
	: (getFirstUnlaidCharacterIndex_glyphIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getFirstUnlaidCharacterIndex:glyphIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getFirstUnlaidCharacterIndex_glyphIndex(final com.apple.jobjc.Pointer<java.lang.Long> charIndex, final com.apple.jobjc.Pointer<java.lang.Long> glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend getFirstUnlaidCharacterIndex_glyphIndex_IMetInst = get_getFirstUnlaidCharacterIndex_glyphIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getFirstUnlaidCharacterIndex_glyphIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphIndex);
		getFirstUnlaidCharacterIndex_glyphIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getGlyphs_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getGlyphs_range_IMetInst(){
		return ((getGlyphs_range_IMetInst != null)
	? (getGlyphs_range_IMetInst)
	: (getGlyphs_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getGlyphs:range:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long getGlyphs_range(final com.apple.jobjc.Pointer<java.lang.Integer> glyphArray, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend getGlyphs_range_IMetInst = get_getGlyphs_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getGlyphs_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphArray);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		getGlyphs_range_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst(){
		return ((getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst != null)
	? (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst)
	: (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits(final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.Pointer<java.lang.Integer> glyphBuffer, final com.apple.jobjc.Pointer<java.lang.Long> charIndexBuffer, final Object /* NSGlyphInscription* (^I, ^Q) */ inscribeBuffer, final com.apple.jobjc.Pointer<java.lang.Boolean> elasticBuffer){
			final com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst = get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndexBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, inscribeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, elasticBuffer);
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst(){
		return ((getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst != null)
	? (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst)
	: (getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getGlyphsInRange:glyphs:characterIndexes:glyphInscriptions:elasticBits:bidiLevels:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels(final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.Pointer<java.lang.Integer> glyphBuffer, final com.apple.jobjc.Pointer<java.lang.Long> charIndexBuffer, final Object /* NSGlyphInscription* (^I, ^Q) */ inscribeBuffer, final com.apple.jobjc.Pointer<java.lang.Boolean> elasticBuffer, final com.apple.jobjc.Pointer<java.lang.Byte> bidiLevelBuffer){
			final com.apple.jobjc.Invoke.MsgSend getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst = get_getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndexBuffer);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, inscribeBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, elasticBuffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bidiLevelBuffer);
		getGlyphsInRange_glyphs_characterIndexes_glyphInscriptions_elasticBits_bidiLevels_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst(){
		return ((getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst != null)
	? (getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst)
	: (getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes(final long charIndex, final boolean aFlag, final boolean dFlag, final com.apple.jobjc.Pointer<java.lang.Double> positions, final com.apple.jobjc.Pointer<java.lang.Long> charIndexes){
			final com.apple.jobjc.Invoke.MsgSend getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst = get_getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, aFlag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, dFlag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, positions);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, charIndexes);
		getLineFragmentInsertionPointsForCharacterAtIndex_alternatePositions_inDisplayOrder_positions_characterIndexes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphAtIndex_IMetInst(){
		return ((glyphAtIndex_IMetInst != null)
	? (glyphAtIndex_IMetInst)
	: (glyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphAtIndex:", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public int glyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend glyphAtIndex_IMetInst = get_glyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		glyphAtIndex_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphAtIndex_isValidIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphAtIndex_isValidIndex_IMetInst(){
		return ((glyphAtIndex_isValidIndex_IMetInst != null)
	? (glyphAtIndex_isValidIndex_IMetInst)
	: (glyphAtIndex_isValidIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphAtIndex:isValidIndex:", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public int glyphAtIndex_isValidIndex(final long glyphIndex, final com.apple.jobjc.Pointer<java.lang.Boolean> isValidIndex){
			final com.apple.jobjc.Invoke.MsgSend glyphAtIndex_isValidIndex_IMetInst = get_glyphAtIndex_isValidIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphAtIndex_isValidIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, isValidIndex);
		glyphAtIndex_isValidIndex_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphGenerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphGenerator_IMetInst(){
		return ((glyphGenerator_IMetInst != null)
	? (glyphGenerator_IMetInst)
	: (glyphGenerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphGenerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGlyphGenerator glyphGenerator(){
			final com.apple.jobjc.Invoke.MsgSend glyphGenerator_IMetInst = get_glyphGenerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphGenerator_IMetInst.init(nativeBuffer, this);
		glyphGenerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGlyphGenerator returnValue = (com.apple.jobjc.appkit.NSGlyphGenerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphIndexForCharacterAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphIndexForCharacterAtIndex_IMetInst(){
		return ((glyphIndexForCharacterAtIndex_IMetInst != null)
	? (glyphIndexForCharacterAtIndex_IMetInst)
	: (glyphIndexForCharacterAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphIndexForCharacterAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long glyphIndexForCharacterAtIndex(final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend glyphIndexForCharacterAtIndex_IMetInst = get_glyphIndexForCharacterAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphIndexForCharacterAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		glyphIndexForCharacterAtIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphIndexForPoint_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphIndexForPoint_inTextContainer_IMetInst(){
		return ((glyphIndexForPoint_inTextContainer_IMetInst != null)
	? (glyphIndexForPoint_inTextContainer_IMetInst)
	: (glyphIndexForPoint_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphIndexForPoint:inTextContainer:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long glyphIndexForPoint_inTextContainer(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend glyphIndexForPoint_inTextContainer_IMetInst = get_glyphIndexForPoint_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphIndexForPoint_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		glyphIndexForPoint_inTextContainer_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst(){
		return ((glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst != null)
	? (glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst)
	: (glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph(final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSTextContainer container, final com.apple.jobjc.Pointer<java.lang.Double> partialFraction){
			final com.apple.jobjc.Invoke.MsgSend glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst = get_glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, partialFraction);
		glyphIndexForPoint_inTextContainer_fractionOfDistanceThroughGlyph_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphRangeForBoundingRect_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphRangeForBoundingRect_inTextContainer_IMetInst(){
		return ((glyphRangeForBoundingRect_inTextContainer_IMetInst != null)
	? (glyphRangeForBoundingRect_inTextContainer_IMetInst)
	: (glyphRangeForBoundingRect_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphRangeForBoundingRect:inTextContainer:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange glyphRangeForBoundingRect_inTextContainer(final com.apple.jobjc.foundation.NSRect bounds, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend glyphRangeForBoundingRect_inTextContainer_IMetInst = get_glyphRangeForBoundingRect_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphRangeForBoundingRect_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bounds);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		glyphRangeForBoundingRect_inTextContainer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst(){
		return ((glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst != null)
	? (glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst)
	: (glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer(final com.apple.jobjc.foundation.NSRect bounds, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst = get_glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, bounds);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		glyphRangeForBoundingRectWithoutAdditionalLayout_inTextContainer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend glyphRangeForTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_glyphRangeForTextContainer_IMetInst(){
		return ((glyphRangeForTextContainer_IMetInst != null)
	? (glyphRangeForTextContainer_IMetInst)
	: (glyphRangeForTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "glyphRangeForTextContainer:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange glyphRangeForTextContainer(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend glyphRangeForTextContainer_IMetInst = get_glyphRangeForTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		glyphRangeForTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		glyphRangeForTextContainer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasNonContiguousLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasNonContiguousLayout_IMetInst(){
		return ((hasNonContiguousLayout_IMetInst != null)
	? (hasNonContiguousLayout_IMetInst)
	: (hasNonContiguousLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasNonContiguousLayout", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasNonContiguousLayout(){
			final com.apple.jobjc.Invoke.MsgSend hasNonContiguousLayout_IMetInst = get_hasNonContiguousLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasNonContiguousLayout_IMetInst.init(nativeBuffer, this);
		hasNonContiguousLayout_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertGlyph_atGlyphIndex_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertGlyph_atGlyphIndex_characterIndex_IMetInst(){
		return ((insertGlyph_atGlyphIndex_characterIndex_IMetInst != null)
	? (insertGlyph_atGlyphIndex_characterIndex_IMetInst)
	: (insertGlyph_atGlyphIndex_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertGlyph:atGlyphIndex:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertGlyph_atGlyphIndex_characterIndex(final int glyph, final long glyphIndex, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend insertGlyph_atGlyphIndex_characterIndex_IMetInst = get_insertGlyph_atGlyphIndex_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertGlyph_atGlyphIndex_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, glyph);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		insertGlyph_atGlyphIndex_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst(){
		return ((insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst != null)
	? (insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst)
	: (insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertGlyphs:length:forStartingGlyphAtIndex:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertGlyphs_length_forStartingGlyphAtIndex_characterIndex(final com.apple.jobjc.Pointer<java.lang.Integer> glyphs, final long length, final long glyphIndex, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst = get_insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		insertGlyphs_length_forStartingGlyphAtIndex_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertTextContainer_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertTextContainer_atIndex_IMetInst(){
		return ((insertTextContainer_atIndex_IMetInst != null)
	? (insertTextContainer_atIndex_IMetInst)
	: (insertTextContainer_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertTextContainer:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertTextContainer_atIndex(final com.apple.jobjc.appkit.NSTextContainer container, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertTextContainer_atIndex_IMetInst = get_insertTextContainer_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertTextContainer_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		insertTextContainer_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intAttribute_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intAttribute_forGlyphAtIndex_IMetInst(){
		return ((intAttribute_forGlyphAtIndex_IMetInst != null)
	? (intAttribute_forGlyphAtIndex_IMetInst)
	: (intAttribute_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intAttribute:forGlyphAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long intAttribute_forGlyphAtIndex(final long attributeTag, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend intAttribute_forGlyphAtIndex_IMetInst = get_intAttribute_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intAttribute_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attributeTag);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		intAttribute_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateDisplayForCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateDisplayForCharacterRange_IMetInst(){
		return ((invalidateDisplayForCharacterRange_IMetInst != null)
	? (invalidateDisplayForCharacterRange_IMetInst)
	: (invalidateDisplayForCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateDisplayForCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void invalidateDisplayForCharacterRange(final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateDisplayForCharacterRange_IMetInst = get_invalidateDisplayForCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateDisplayForCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		invalidateDisplayForCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateDisplayForGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateDisplayForGlyphRange_IMetInst(){
		return ((invalidateDisplayForGlyphRange_IMetInst != null)
	? (invalidateDisplayForGlyphRange_IMetInst)
	: (invalidateDisplayForGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateDisplayForGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void invalidateDisplayForGlyphRange(final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateDisplayForGlyphRange_IMetInst = get_invalidateDisplayForGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateDisplayForGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		invalidateDisplayForGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst(){
		return ((invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst != null)
	? (invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst)
	: (invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange(final com.apple.jobjc.foundation.NSRange charRange, final long delta, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualCharRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst = get_invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, delta);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualCharRange);
		invalidateGlyphsForCharacterRange_changeInLength_actualCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst(){
		return ((invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst != null)
	? (invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst)
	: (invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateGlyphsOnLayoutInvalidationForGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void invalidateGlyphsOnLayoutInvalidationForGlyphRange(final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst = get_invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		invalidateGlyphsOnLayoutInvalidationForGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst(){
		return ((invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst != null)
	? (invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst)
	: (invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateLayoutForCharacterRange:actualCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void invalidateLayoutForCharacterRange_actualCharacterRange(final com.apple.jobjc.foundation.NSRange charRange, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualCharRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst = get_invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualCharRange);
		invalidateLayoutForCharacterRange_actualCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst(){
		return ((invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst != null)
	? (invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst)
	: (invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateLayoutForCharacterRange:isSoft:actualCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void invalidateLayoutForCharacterRange_isSoft_actualCharacterRange(final com.apple.jobjc.foundation.NSRange charRange, final boolean flag, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ actualCharRange){
			final com.apple.jobjc.Invoke.MsgSend invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst = get_invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, actualCharRange);
		invalidateLayoutForCharacterRange_isSoft_actualCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isValidGlyphIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValidGlyphIndex_IMetInst(){
		return ((isValidGlyphIndex_IMetInst != null)
	? (isValidGlyphIndex_IMetInst)
	: (isValidGlyphIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValidGlyphIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean isValidGlyphIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend isValidGlyphIndex_IMetInst = get_isValidGlyphIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValidGlyphIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		isValidGlyphIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManagerOwnsFirstResponderInWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManagerOwnsFirstResponderInWindow_IMetInst(){
		return ((layoutManagerOwnsFirstResponderInWindow_IMetInst != null)
	? (layoutManagerOwnsFirstResponderInWindow_IMetInst)
	: (layoutManagerOwnsFirstResponderInWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManagerOwnsFirstResponderInWindow:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean layoutManagerOwnsFirstResponderInWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend layoutManagerOwnsFirstResponderInWindow_IMetInst = get_layoutManagerOwnsFirstResponderInWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManagerOwnsFirstResponderInWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		layoutManagerOwnsFirstResponderInWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutOptions_IMetInst(){
		return ((layoutOptions_IMetInst != null)
	? (layoutOptions_IMetInst)
	: (layoutOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long layoutOptions(){
			final com.apple.jobjc.Invoke.MsgSend layoutOptions_IMetInst = get_layoutOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutOptions_IMetInst.init(nativeBuffer, this);
		layoutOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutRectForTextBlock_atIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutRectForTextBlock_atIndex_effectiveRange_IMetInst(){
		return ((layoutRectForTextBlock_atIndex_effectiveRange_IMetInst != null)
	? (layoutRectForTextBlock_atIndex_effectiveRange_IMetInst)
	: (layoutRectForTextBlock_atIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutRectForTextBlock:atIndex:effectiveRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect layoutRectForTextBlock_atIndex_effectiveRange(final com.apple.jobjc.appkit.NSTextBlock block, final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend layoutRectForTextBlock_atIndex_effectiveRange_IMetInst = get_layoutRectForTextBlock_atIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutRectForTextBlock_atIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		layoutRectForTextBlock_atIndex_effectiveRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutRectForTextBlock_glyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutRectForTextBlock_glyphRange_IMetInst(){
		return ((layoutRectForTextBlock_glyphRange_IMetInst != null)
	? (layoutRectForTextBlock_glyphRange_IMetInst)
	: (layoutRectForTextBlock_glyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutRectForTextBlock:glyphRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect layoutRectForTextBlock_glyphRange(final com.apple.jobjc.appkit.NSTextBlock block, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend layoutRectForTextBlock_glyphRange_IMetInst = get_layoutRectForTextBlock_glyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutRectForTextBlock_glyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		layoutRectForTextBlock_glyphRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst(){
		return ((lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst != null)
	? (lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst)
	: (lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentRectForGlyphAtIndex:effectiveRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentRectForGlyphAtIndex_effectiveRange(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst = get_lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentRectForGlyphAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst(){
		return ((lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst != null)
	? (lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst)
	: (lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = get_lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst(){
		return ((lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst != null)
	? (lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst)
	: (lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentUsedRectForGlyphAtIndex:effectiveRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentUsedRectForGlyphAtIndex_effectiveRange(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst = get_lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentUsedRectForGlyphAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst(){
		return ((lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst != null)
	? (lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst)
	: (lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = get_lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentUsedRectForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locationForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locationForGlyphAtIndex_IMetInst(){
		return ((locationForGlyphAtIndex_IMetInst != null)
	? (locationForGlyphAtIndex_IMetInst)
	: (locationForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locationForGlyphAtIndex:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSPoint locationForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend locationForGlyphAtIndex_IMetInst = get_locationForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locationForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		locationForGlyphAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notShownAttributeForGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notShownAttributeForGlyphAtIndex_IMetInst(){
		return ((notShownAttributeForGlyphAtIndex_IMetInst != null)
	? (notShownAttributeForGlyphAtIndex_IMetInst)
	: (notShownAttributeForGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notShownAttributeForGlyphAtIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean notShownAttributeForGlyphAtIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend notShownAttributeForGlyphAtIndex_IMetInst = get_notShownAttributeForGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notShownAttributeForGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		notShownAttributeForGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend rangeOfNominallySpacedGlyphsContainingIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfNominallySpacedGlyphsContainingIndex_IMetInst(){
		return ((rangeOfNominallySpacedGlyphsContainingIndex_IMetInst != null)
	? (rangeOfNominallySpacedGlyphsContainingIndex_IMetInst)
	: (rangeOfNominallySpacedGlyphsContainingIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfNominallySpacedGlyphsContainingIndex:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfNominallySpacedGlyphsContainingIndex(final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend rangeOfNominallySpacedGlyphsContainingIndex_IMetInst = get_rangeOfNominallySpacedGlyphsContainingIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfNominallySpacedGlyphsContainingIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfNominallySpacedGlyphsContainingIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst(){
		return ((rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst != null)
	? (rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst)
	: (rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectArrayForCharacterRange:withinSelectedCharacterRange:inTextContainer:rectCount:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount(final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.foundation.NSRange selCharRange, final com.apple.jobjc.appkit.NSTextContainer container, final com.apple.jobjc.Pointer<java.lang.Long> rectCount){
			final com.apple.jobjc.Invoke.MsgSend rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst = get_rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, selCharRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rectCount);
		rectArrayForCharacterRange_withinSelectedCharacterRange_inTextContainer_rectCount_IMetInst.invoke(nativeBuffer);
		final Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ returnValue = (Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst(){
		return ((rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst != null)
	? (rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst)
	: (rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectArrayForGlyphRange:withinSelectedGlyphRange:inTextContainer:rectCount:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount(final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.foundation.NSRange selGlyphRange, final com.apple.jobjc.appkit.NSTextContainer container, final com.apple.jobjc.Pointer<java.lang.Long> rectCount){
			final com.apple.jobjc.Invoke.MsgSend rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst = get_rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, selGlyphRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rectCount);
		rectArrayForGlyphRange_withinSelectedGlyphRange_inTextContainer_rectCount_IMetInst.invoke(nativeBuffer);
		final Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ returnValue = (Object /* NSRectArray (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTemporaryAttribute_forCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTemporaryAttribute_forCharacterRange_IMetInst(){
		return ((removeTemporaryAttribute_forCharacterRange_IMetInst != null)
	? (removeTemporaryAttribute_forCharacterRange_IMetInst)
	: (removeTemporaryAttribute_forCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTemporaryAttribute:forCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeTemporaryAttribute_forCharacterRange(final com.apple.jobjc.foundation.NSString attrName, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend removeTemporaryAttribute_forCharacterRange_IMetInst = get_removeTemporaryAttribute_forCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTemporaryAttribute_forCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		removeTemporaryAttribute_forCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTextContainerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTextContainerAtIndex_IMetInst(){
		return ((removeTextContainerAtIndex_IMetInst != null)
	? (removeTextContainerAtIndex_IMetInst)
	: (removeTextContainerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTextContainerAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeTextContainerAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeTextContainerAtIndex_IMetInst = get_removeTextContainerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTextContainerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		removeTextContainerAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceGlyphAtIndex_withGlyph_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceGlyphAtIndex_withGlyph_IMetInst(){
		return ((replaceGlyphAtIndex_withGlyph_IMetInst != null)
	? (replaceGlyphAtIndex_withGlyph_IMetInst)
	: (replaceGlyphAtIndex_withGlyph_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceGlyphAtIndex:withGlyph:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public void replaceGlyphAtIndex_withGlyph(final long glyphIndex, final int newGlyph){
			final com.apple.jobjc.Invoke.MsgSend replaceGlyphAtIndex_withGlyph_IMetInst = get_replaceGlyphAtIndex_withGlyph_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceGlyphAtIndex_withGlyph_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, newGlyph);
		replaceGlyphAtIndex_withGlyph_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceTextStorage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceTextStorage_IMetInst(){
		return ((replaceTextStorage_IMetInst != null)
	? (replaceTextStorage_IMetInst)
	: (replaceTextStorage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceTextStorage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceTextStorage(final com.apple.jobjc.appkit.NSTextStorage newTextStorage){
			final com.apple.jobjc.Invoke.MsgSend replaceTextStorage_IMetInst = get_replaceTextStorage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceTextStorage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTextStorage);
		replaceTextStorage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst(){
		return ((rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst != null)
	? (rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst)
	: (rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerAccessoryViewForTextView:paragraphStyle:ruler:enabled:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.appkit.NSParagraphStyle style, final com.apple.jobjc.appkit.NSRulerView ruler, final boolean isEnabled){
			final com.apple.jobjc.Invoke.MsgSend rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst = get_rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, style);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isEnabled);
		rulerAccessoryViewForTextView_paragraphStyle_ruler_enabled_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerMarkersForTextView_paragraphStyle_ruler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerMarkersForTextView_paragraphStyle_ruler_IMetInst(){
		return ((rulerMarkersForTextView_paragraphStyle_ruler_IMetInst != null)
	? (rulerMarkersForTextView_paragraphStyle_ruler_IMetInst)
	: (rulerMarkersForTextView_paragraphStyle_ruler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerMarkersForTextView:paragraphStyle:ruler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rulerMarkersForTextView_paragraphStyle_ruler(final com.apple.jobjc.appkit.NSTextView view, final com.apple.jobjc.appkit.NSParagraphStyle style, final com.apple.jobjc.appkit.NSRulerView ruler){
			final com.apple.jobjc.Invoke.MsgSend rulerMarkersForTextView_paragraphStyle_ruler_IMetInst = get_rulerMarkersForTextView_paragraphStyle_ruler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerMarkersForTextView_paragraphStyle_ruler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, style);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		rulerMarkersForTextView_paragraphStyle_ruler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsNonContiguousLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsNonContiguousLayout_IMetInst(){
		return ((setAllowsNonContiguousLayout_IMetInst != null)
	? (setAllowsNonContiguousLayout_IMetInst)
	: (setAllowsNonContiguousLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsNonContiguousLayout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsNonContiguousLayout(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsNonContiguousLayout_IMetInst = get_setAllowsNonContiguousLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsNonContiguousLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsNonContiguousLayout_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundLayoutEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundLayoutEnabled_IMetInst(){
		return ((setBackgroundLayoutEnabled_IMetInst != null)
	? (setBackgroundLayoutEnabled_IMetInst)
	: (setBackgroundLayoutEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundLayoutEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBackgroundLayoutEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundLayoutEnabled_IMetInst = get_setBackgroundLayoutEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundLayoutEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBackgroundLayoutEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBoundsRect_forTextBlock_glyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBoundsRect_forTextBlock_glyphRange_IMetInst(){
		return ((setBoundsRect_forTextBlock_glyphRange_IMetInst != null)
	? (setBoundsRect_forTextBlock_glyphRange_IMetInst)
	: (setBoundsRect_forTextBlock_glyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBoundsRect:forTextBlock:glyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setBoundsRect_forTextBlock_glyphRange(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextBlock block, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setBoundsRect_forTextBlock_glyphRange_IMetInst = get_setBoundsRect_forTextBlock_glyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBoundsRect_forTextBlock_glyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setBoundsRect_forTextBlock_glyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCharacterIndex_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCharacterIndex_forGlyphAtIndex_IMetInst(){
		return ((setCharacterIndex_forGlyphAtIndex_IMetInst != null)
	? (setCharacterIndex_forGlyphAtIndex_IMetInst)
	: (setCharacterIndex_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCharacterIndex:forGlyphAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCharacterIndex_forGlyphAtIndex(final long charIndex, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend setCharacterIndex_forGlyphAtIndex_IMetInst = get_setCharacterIndex_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCharacterIndex_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		setCharacterIndex_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultAttachmentScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultAttachmentScaling_IMetInst(){
		return ((setDefaultAttachmentScaling_IMetInst != null)
	? (setDefaultAttachmentScaling_IMetInst)
	: (setDefaultAttachmentScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultAttachmentScaling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDefaultAttachmentScaling(final long scaling){
			final com.apple.jobjc.Invoke.MsgSend setDefaultAttachmentScaling_IMetInst = get_setDefaultAttachmentScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultAttachmentScaling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, scaling);
		setDefaultAttachmentScaling_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst(){
		return ((setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst != null)
	? (setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst)
	: (setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsOutsideLineFragment:forGlyphAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDrawsOutsideLineFragment_forGlyphAtIndex(final boolean flag, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst = get_setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		setDrawsOutsideLineFragment_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExtraLineFragmentRect_usedRect_textContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExtraLineFragmentRect_usedRect_textContainer_IMetInst(){
		return ((setExtraLineFragmentRect_usedRect_textContainer_IMetInst != null)
	? (setExtraLineFragmentRect_usedRect_textContainer_IMetInst)
	: (setExtraLineFragmentRect_usedRect_textContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExtraLineFragmentRect:usedRect:textContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExtraLineFragmentRect_usedRect_textContainer(final com.apple.jobjc.foundation.NSRect fragmentRect, final com.apple.jobjc.foundation.NSRect usedRect, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend setExtraLineFragmentRect_usedRect_textContainer_IMetInst = get_setExtraLineFragmentRect_usedRect_textContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExtraLineFragmentRect_usedRect_textContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fragmentRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, usedRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		setExtraLineFragmentRect_usedRect_textContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGlyphGenerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGlyphGenerator_IMetInst(){
		return ((setGlyphGenerator_IMetInst != null)
	? (setGlyphGenerator_IMetInst)
	: (setGlyphGenerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGlyphGenerator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setGlyphGenerator(final com.apple.jobjc.appkit.NSGlyphGenerator glyphGenerator){
			final com.apple.jobjc.Invoke.MsgSend setGlyphGenerator_IMetInst = get_setGlyphGenerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGlyphGenerator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, glyphGenerator);
		setGlyphGenerator_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setIntAttribute_value_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntAttribute_value_forGlyphAtIndex_IMetInst(){
		return ((setIntAttribute_value_forGlyphAtIndex_IMetInst != null)
	? (setIntAttribute_value_forGlyphAtIndex_IMetInst)
	: (setIntAttribute_value_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntAttribute:value:forGlyphAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setIntAttribute_value_forGlyphAtIndex(final long attributeTag, final long val, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend setIntAttribute_value_forGlyphAtIndex_IMetInst = get_setIntAttribute_value_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntAttribute_value_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attributeTag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		setIntAttribute_value_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayoutRect_forTextBlock_glyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayoutRect_forTextBlock_glyphRange_IMetInst(){
		return ((setLayoutRect_forTextBlock_glyphRange_IMetInst != null)
	? (setLayoutRect_forTextBlock_glyphRange_IMetInst)
	: (setLayoutRect_forTextBlock_glyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayoutRect:forTextBlock:glyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setLayoutRect_forTextBlock_glyphRange(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextBlock block, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setLayoutRect_forTextBlock_glyphRange_IMetInst = get_setLayoutRect_forTextBlock_glyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayoutRect_forTextBlock_glyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setLayoutRect_forTextBlock_glyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineFragmentRect_forGlyphRange_usedRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineFragmentRect_forGlyphRange_usedRect_IMetInst(){
		return ((setLineFragmentRect_forGlyphRange_usedRect_IMetInst != null)
	? (setLineFragmentRect_forGlyphRange_usedRect_IMetInst)
	: (setLineFragmentRect_forGlyphRange_usedRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineFragmentRect:forGlyphRange:usedRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setLineFragmentRect_forGlyphRange_usedRect(final com.apple.jobjc.foundation.NSRect fragmentRect, final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.foundation.NSRect usedRect){
			final com.apple.jobjc.Invoke.MsgSend setLineFragmentRect_forGlyphRange_usedRect_IMetInst = get_setLineFragmentRect_forGlyphRange_usedRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineFragmentRect_forGlyphRange_usedRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, fragmentRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, usedRect);
		setLineFragmentRect_forGlyphRange_usedRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocation_forStartOfGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocation_forStartOfGlyphRange_IMetInst(){
		return ((setLocation_forStartOfGlyphRange_IMetInst != null)
	? (setLocation_forStartOfGlyphRange_IMetInst)
	: (setLocation_forStartOfGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocation:forStartOfGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setLocation_forStartOfGlyphRange(final com.apple.jobjc.foundation.NSPoint location, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setLocation_forStartOfGlyphRange_IMetInst = get_setLocation_forStartOfGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocation_forStartOfGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setLocation_forStartOfGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst(){
		return ((setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst != null)
	? (setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst)
	: (setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocations:startingGlyphIndexes:count:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setLocations_startingGlyphIndexes_count_forGlyphRange(final Object /* NSPointArray (^{_NSPoint="x"f"y"f}, ^{CGPoint="x"d"y"d}) */ locations, final com.apple.jobjc.Pointer<java.lang.Long> glyphIndexes, final long count, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst = get_setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, locations);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setLocations_startingGlyphIndexes_count_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNotShownAttribute_forGlyphAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNotShownAttribute_forGlyphAtIndex_IMetInst(){
		return ((setNotShownAttribute_forGlyphAtIndex_IMetInst != null)
	? (setNotShownAttribute_forGlyphAtIndex_IMetInst)
	: (setNotShownAttribute_forGlyphAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNotShownAttribute:forGlyphAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setNotShownAttribute_forGlyphAtIndex(final boolean flag, final long glyphIndex){
			final com.apple.jobjc.Invoke.MsgSend setNotShownAttribute_forGlyphAtIndex_IMetInst = get_setNotShownAttribute_forGlyphAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNotShownAttribute_forGlyphAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		setNotShownAttribute_forGlyphAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsControlCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsControlCharacters_IMetInst(){
		return ((setShowsControlCharacters_IMetInst != null)
	? (setShowsControlCharacters_IMetInst)
	: (setShowsControlCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsControlCharacters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsControlCharacters(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsControlCharacters_IMetInst = get_setShowsControlCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsControlCharacters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsControlCharacters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsInvisibleCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsInvisibleCharacters_IMetInst(){
		return ((setShowsInvisibleCharacters_IMetInst != null)
	? (setShowsInvisibleCharacters_IMetInst)
	: (setShowsInvisibleCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsInvisibleCharacters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsInvisibleCharacters(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsInvisibleCharacters_IMetInst = get_setShowsInvisibleCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsInvisibleCharacters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsInvisibleCharacters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTemporaryAttributes_forCharacterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTemporaryAttributes_forCharacterRange_IMetInst(){
		return ((setTemporaryAttributes_forCharacterRange_IMetInst != null)
	? (setTemporaryAttributes_forCharacterRange_IMetInst)
	: (setTemporaryAttributes_forCharacterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTemporaryAttributes:forCharacterRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setTemporaryAttributes_forCharacterRange(final com.apple.jobjc.foundation.NSDictionary attrs, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend setTemporaryAttributes_forCharacterRange_IMetInst = get_setTemporaryAttributes_forCharacterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTemporaryAttributes_forCharacterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		setTemporaryAttributes_forCharacterRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextContainer_forGlyphRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextContainer_forGlyphRange_IMetInst(){
		return ((setTextContainer_forGlyphRange_IMetInst != null)
	? (setTextContainer_forGlyphRange_IMetInst)
	: (setTextContainer_forGlyphRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextContainer:forGlyphRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setTextContainer_forGlyphRange(final com.apple.jobjc.appkit.NSTextContainer container, final com.apple.jobjc.foundation.NSRange glyphRange){
			final com.apple.jobjc.Invoke.MsgSend setTextContainer_forGlyphRange_IMetInst = get_setTextContainer_forGlyphRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextContainer_forGlyphRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		setTextContainer_forGlyphRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextStorage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextStorage_IMetInst(){
		return ((setTextStorage_IMetInst != null)
	? (setTextStorage_IMetInst)
	: (setTextStorage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextStorage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextStorage(final com.apple.jobjc.appkit.NSTextStorage textStorage){
			final com.apple.jobjc.Invoke.MsgSend setTextStorage_IMetInst = get_setTextStorage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextStorage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textStorage);
		setTextStorage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTypesetter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTypesetter_IMetInst(){
		return ((setTypesetter_IMetInst != null)
	? (setTypesetter_IMetInst)
	: (setTypesetter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTypesetter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTypesetter(final com.apple.jobjc.appkit.NSTypesetter typesetter){
			final com.apple.jobjc.Invoke.MsgSend setTypesetter_IMetInst = get_setTypesetter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTypesetter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typesetter);
		setTypesetter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTypesetterBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTypesetterBehavior_IMetInst(){
		return ((setTypesetterBehavior_IMetInst != null)
	? (setTypesetterBehavior_IMetInst)
	: (setTypesetterBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTypesetterBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTypesetterBehavior(final long theBehavior){
			final com.apple.jobjc.Invoke.MsgSend setTypesetterBehavior_IMetInst = get_setTypesetterBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTypesetterBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, theBehavior);
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

	private static com.apple.jobjc.Invoke.MsgSend setUsesScreenFonts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesScreenFonts_IMetInst(){
		return ((setUsesScreenFonts_IMetInst != null)
	? (setUsesScreenFonts_IMetInst)
	: (setUsesScreenFonts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesScreenFonts:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesScreenFonts(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesScreenFonts_IMetInst = get_setUsesScreenFonts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesScreenFonts_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesScreenFonts_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showAttachmentCell_inRect_characterIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showAttachmentCell_inRect_characterIndex_IMetInst(){
		return ((showAttachmentCell_inRect_characterIndex_IMetInst != null)
	? (showAttachmentCell_inRect_characterIndex_IMetInst)
	: (showAttachmentCell_inRect_characterIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showAttachmentCell:inRect:characterIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void showAttachmentCell_inRect_characterIndex(final com.apple.jobjc.appkit.NSCell cell, final com.apple.jobjc.foundation.NSRect rect, final long attachmentIndex){
			final com.apple.jobjc.Invoke.MsgSend showAttachmentCell_inRect_characterIndex_IMetInst = get_showAttachmentCell_inRect_characterIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showAttachmentCell_inRect_characterIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, attachmentIndex);
		showAttachmentCell_inRect_characterIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst(){
		return ((showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst != null)
	? (showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst)
	: (showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showCGGlyphs:positions:count:font:matrix:attributes:inContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showCGGlyphs_positions_count_font_matrix_attributes_inContext(final Object /* CGGlyph* (^S, ^S) */ glyphs, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSPoint> positions, final long glyphCount, final com.apple.jobjc.appkit.NSFont font, final com.apple.jobjc.foundation.NSAffineTransform textMatrix, final com.apple.jobjc.foundation.NSDictionary attributes, final com.apple.jobjc.appkit.NSGraphicsContext graphicsContext){
			final com.apple.jobjc.Invoke.MsgSend showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst = get_showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, positions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphCount);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textMatrix);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, graphicsContext);
		showCGGlyphs_positions_count_font_matrix_attributes_inContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst(){
		return ((showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst != null)
	? (showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst)
	: (showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showPackedGlyphs:length:glyphRange:atPoint:font:color:printingAdjustment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment(final com.apple.jobjc.Pointer<java.lang.Byte> glyphs, final long glyphLen, final com.apple.jobjc.foundation.NSRange glyphRange, final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSFont font, final com.apple.jobjc.appkit.NSColor color, final com.apple.jobjc.foundation.NSSize printingAdjustment){
			final com.apple.jobjc.Invoke.MsgSend showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst = get_showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, glyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphLen);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, printingAdjustment);
		showPackedGlyphs_length_glyphRange_atPoint_font_color_printingAdjustment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsControlCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsControlCharacters_IMetInst(){
		return ((showsControlCharacters_IMetInst != null)
	? (showsControlCharacters_IMetInst)
	: (showsControlCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsControlCharacters", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsControlCharacters(){
			final com.apple.jobjc.Invoke.MsgSend showsControlCharacters_IMetInst = get_showsControlCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsControlCharacters_IMetInst.init(nativeBuffer, this);
		showsControlCharacters_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsInvisibleCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsInvisibleCharacters_IMetInst(){
		return ((showsInvisibleCharacters_IMetInst != null)
	? (showsInvisibleCharacters_IMetInst)
	: (showsInvisibleCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsInvisibleCharacters", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsInvisibleCharacters(){
			final com.apple.jobjc.Invoke.MsgSend showsInvisibleCharacters_IMetInst = get_showsInvisibleCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsInvisibleCharacters_IMetInst.init(nativeBuffer, this);
		showsInvisibleCharacters_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst(){
		return ((strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst != null)
	? (strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst)
	: (strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(final com.apple.jobjc.foundation.NSRange glyphRange, final long strikethroughVal, final com.apple.jobjc.foundation.NSRect lineRect, final com.apple.jobjc.foundation.NSRange lineGlyphRange, final com.apple.jobjc.foundation.NSPoint containerOrigin){
			final com.apple.jobjc.Invoke.MsgSend strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = get_strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, strikethroughVal);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, lineRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, lineGlyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, containerOrigin);
		strikethroughGlyphRange_strikethroughType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst(){
		return ((temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst != null)
	? (temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst)
	: (temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "temporaryAttribute:atCharacterIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T temporaryAttribute_atCharacterIndex_effectiveRange(final com.apple.jobjc.foundation.NSString attrName, final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range){
			final com.apple.jobjc.Invoke.MsgSend temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst = get_temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		temporaryAttribute_atCharacterIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst(){
		return ((temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst != null)
	? (temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst)
	: (temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "temporaryAttribute:atCharacterIndex:longestEffectiveRange:inRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange(final com.apple.jobjc.foundation.NSString attrName, final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range, final com.apple.jobjc.foundation.NSRange rangeLimit){
			final com.apple.jobjc.Invoke.MsgSend temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst = get_temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, rangeLimit);
		temporaryAttribute_atCharacterIndex_longestEffectiveRange_inRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst(){
		return ((temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst != null)
	? (temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst)
	: (temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "temporaryAttributesAtCharacterIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary temporaryAttributesAtCharacterIndex_effectiveRange(final long charIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveCharRange){
			final com.apple.jobjc.Invoke.MsgSend temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst = get_temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveCharRange);
		temporaryAttributesAtCharacterIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst(){
		return ((temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst != null)
	? (temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst)
	: (temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "temporaryAttributesAtCharacterIndex:longestEffectiveRange:inRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSDictionary temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange(final long location, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range, final com.apple.jobjc.foundation.NSRange rangeLimit){
			final com.apple.jobjc.Invoke.MsgSend temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst = get_temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, rangeLimit);
		temporaryAttributesAtCharacterIndex_longestEffectiveRange_inRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerChangedGeometry_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerChangedGeometry_IMetInst(){
		return ((textContainerChangedGeometry_IMetInst != null)
	? (textContainerChangedGeometry_IMetInst)
	: (textContainerChangedGeometry_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerChangedGeometry:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textContainerChangedGeometry(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend textContainerChangedGeometry_IMetInst = get_textContainerChangedGeometry_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerChangedGeometry_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		textContainerChangedGeometry_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerChangedTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerChangedTextView_IMetInst(){
		return ((textContainerChangedTextView_IMetInst != null)
	? (textContainerChangedTextView_IMetInst)
	: (textContainerChangedTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerChangedTextView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textContainerChangedTextView(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend textContainerChangedTextView_IMetInst = get_textContainerChangedTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerChangedTextView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		textContainerChangedTextView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerForGlyphAtIndex_effectiveRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerForGlyphAtIndex_effectiveRange_IMetInst(){
		return ((textContainerForGlyphAtIndex_effectiveRange_IMetInst != null)
	? (textContainerForGlyphAtIndex_effectiveRange_IMetInst)
	: (textContainerForGlyphAtIndex_effectiveRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerForGlyphAtIndex:effectiveRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextContainer textContainerForGlyphAtIndex_effectiveRange(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange){
			final com.apple.jobjc.Invoke.MsgSend textContainerForGlyphAtIndex_effectiveRange_IMetInst = get_textContainerForGlyphAtIndex_effectiveRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerForGlyphAtIndex_effectiveRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
		textContainerForGlyphAtIndex_effectiveRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextContainer returnValue = (com.apple.jobjc.appkit.NSTextContainer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst(){
		return ((textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst != null)
	? (textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst)
	: (textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextContainer textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout(final long glyphIndex, final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ effectiveGlyphRange, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst = get_textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, glyphIndex);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, effectiveGlyphRange);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		textContainerForGlyphAtIndex_effectiveRange_withoutAdditionalLayout_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextContainer returnValue = (com.apple.jobjc.appkit.NSTextContainer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainers_IMetInst(){
		return ((textContainers_IMetInst != null)
	? (textContainers_IMetInst)
	: (textContainers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textContainers(){
			final com.apple.jobjc.Invoke.MsgSend textContainers_IMetInst = get_textContainers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainers_IMetInst.init(nativeBuffer, this);
		textContainers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textStorage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textStorage_IMetInst(){
		return ((textStorage_IMetInst != null)
	? (textStorage_IMetInst)
	: (textStorage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textStorage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextStorage textStorage(){
			final com.apple.jobjc.Invoke.MsgSend textStorage_IMetInst = get_textStorage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textStorage_IMetInst.init(nativeBuffer, this);
		textStorage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextStorage returnValue = (com.apple.jobjc.appkit.NSTextStorage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textStorage_edited_range_changeInLength_invalidatedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textStorage_edited_range_changeInLength_invalidatedRange_IMetInst(){
		return ((textStorage_edited_range_changeInLength_invalidatedRange_IMetInst != null)
	? (textStorage_edited_range_changeInLength_invalidatedRange_IMetInst)
	: (textStorage_edited_range_changeInLength_invalidatedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textStorage:edited:range:changeInLength:invalidatedRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void textStorage_edited_range_changeInLength_invalidatedRange(final com.apple.jobjc.appkit.NSTextStorage str, final long editedMask, final com.apple.jobjc.foundation.NSRange newCharRange, final long delta, final com.apple.jobjc.foundation.NSRange invalidatedCharRange){
			final com.apple.jobjc.Invoke.MsgSend textStorage_edited_range_changeInLength_invalidatedRange_IMetInst = get_textStorage_edited_range_changeInLength_invalidatedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textStorage_edited_range_changeInLength_invalidatedRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, editedMask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, newCharRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, delta);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, invalidatedCharRange);
		textStorage_edited_range_changeInLength_invalidatedRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textViewForBeginningOfSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textViewForBeginningOfSelection_IMetInst(){
		return ((textViewForBeginningOfSelection_IMetInst != null)
	? (textViewForBeginningOfSelection_IMetInst)
	: (textViewForBeginningOfSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textViewForBeginningOfSelection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextView textViewForBeginningOfSelection(){
			final com.apple.jobjc.Invoke.MsgSend textViewForBeginningOfSelection_IMetInst = get_textViewForBeginningOfSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textViewForBeginningOfSelection_IMetInst.init(nativeBuffer, this);
		textViewForBeginningOfSelection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextView returnValue = (com.apple.jobjc.appkit.NSTextView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typesetter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typesetter_IMetInst(){
		return ((typesetter_IMetInst != null)
	? (typesetter_IMetInst)
	: (typesetter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typesetter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTypesetter typesetter(){
			final com.apple.jobjc.Invoke.MsgSend typesetter_IMetInst = get_typesetter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typesetter_IMetInst.init(nativeBuffer, this);
		typesetter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTypesetter returnValue = (com.apple.jobjc.appkit.NSTypesetter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst(){
		return ((underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst != null)
	? (underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst)
	: (underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin(final com.apple.jobjc.foundation.NSRange glyphRange, final long underlineVal, final com.apple.jobjc.foundation.NSRect lineRect, final com.apple.jobjc.foundation.NSRange lineGlyphRange, final com.apple.jobjc.foundation.NSPoint containerOrigin){
			final com.apple.jobjc.Invoke.MsgSend underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst = get_underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, glyphRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, underlineVal);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, lineRect);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, lineGlyphRange);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, containerOrigin);
		underlineGlyphRange_underlineType_lineFragmentRect_lineFragmentGlyphRange_containerOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usedRectForTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usedRectForTextContainer_IMetInst(){
		return ((usedRectForTextContainer_IMetInst != null)
	? (usedRectForTextContainer_IMetInst)
	: (usedRectForTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usedRectForTextContainer:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect usedRectForTextContainer(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend usedRectForTextContainer_IMetInst = get_usedRectForTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usedRectForTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		usedRectForTextContainer_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend usesScreenFonts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesScreenFonts_IMetInst(){
		return ((usesScreenFonts_IMetInst != null)
	? (usesScreenFonts_IMetInst)
	: (usesScreenFonts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesScreenFonts", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesScreenFonts(){
			final com.apple.jobjc.Invoke.MsgSend usesScreenFonts_IMetInst = get_usesScreenFonts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesScreenFonts_IMetInst.init(nativeBuffer, this);
		usesScreenFonts_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
