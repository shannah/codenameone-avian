package com.apple.jobjc.appkit;

public  class NSMutableAttributedStringCategory extends com.apple.jobjc.foundation.NSMutableAttributedString {
	public NSMutableAttributedStringCategory(final com.apple.jobjc.foundation.NSMutableAttributedString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSMutableAttributedStringCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableAttributedStringCategory(final NSMutableAttributedStringCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend applyFontTraits_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applyFontTraits_range_IMetInst(){
		return ((applyFontTraits_range_IMetInst != null)
	? (applyFontTraits_range_IMetInst)
	: (applyFontTraits_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applyFontTraits:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void applyFontTraits_range(final long traitMask, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend applyFontTraits_range_IMetInst = get_applyFontTraits_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applyFontTraits_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, traitMask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		applyFontTraits_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fixAttachmentAttributeInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fixAttachmentAttributeInRange_IMetInst(){
		return ((fixAttachmentAttributeInRange_IMetInst != null)
	? (fixAttachmentAttributeInRange_IMetInst)
	: (fixAttachmentAttributeInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fixAttachmentAttributeInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void fixAttachmentAttributeInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend fixAttachmentAttributeInRange_IMetInst = get_fixAttachmentAttributeInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fixAttachmentAttributeInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		fixAttachmentAttributeInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fixAttributesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fixAttributesInRange_IMetInst(){
		return ((fixAttributesInRange_IMetInst != null)
	? (fixAttributesInRange_IMetInst)
	: (fixAttributesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fixAttributesInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void fixAttributesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend fixAttributesInRange_IMetInst = get_fixAttributesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fixAttributesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		fixAttributesInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fixFontAttributeInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fixFontAttributeInRange_IMetInst(){
		return ((fixFontAttributeInRange_IMetInst != null)
	? (fixFontAttributeInRange_IMetInst)
	: (fixFontAttributeInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fixFontAttributeInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void fixFontAttributeInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend fixFontAttributeInRange_IMetInst = get_fixFontAttributeInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fixFontAttributeInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		fixFontAttributeInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fixParagraphStyleAttributeInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fixParagraphStyleAttributeInRange_IMetInst(){
		return ((fixParagraphStyleAttributeInRange_IMetInst != null)
	? (fixParagraphStyleAttributeInRange_IMetInst)
	: (fixParagraphStyleAttributeInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fixParagraphStyleAttributeInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void fixParagraphStyleAttributeInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend fixParagraphStyleAttributeInRange_IMetInst = get_fixParagraphStyleAttributeInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fixParagraphStyleAttributeInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		fixParagraphStyleAttributeInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromData_options_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromData_options_documentAttributes_IMetInst(){
		return ((readFromData_options_documentAttributes_IMetInst != null)
	? (readFromData_options_documentAttributes_IMetInst)
	: (readFromData_options_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromData:options:documentAttributes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromData_options_documentAttributes(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend readFromData_options_documentAttributes_IMetInst = get_readFromData_options_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromData_options_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		readFromData_options_documentAttributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromData_options_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromData_options_documentAttributes_error_IMetInst(){
		return ((readFromData_options_documentAttributes_error_IMetInst != null)
	? (readFromData_options_documentAttributes_error_IMetInst)
	: (readFromData_options_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromData:options:documentAttributes:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromData_options_documentAttributes_error(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary opts, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend readFromData_options_documentAttributes_error_IMetInst = get_readFromData_options_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromData_options_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		readFromData_options_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_options_documentAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_options_documentAttributes_IMetInst(){
		return ((readFromURL_options_documentAttributes_IMetInst != null)
	? (readFromURL_options_documentAttributes_IMetInst)
	: (readFromURL_options_documentAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:options:documentAttributes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromURL_options_documentAttributes(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_options_documentAttributes_IMetInst = get_readFromURL_options_documentAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_options_documentAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		readFromURL_options_documentAttributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_options_documentAttributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_options_documentAttributes_error_IMetInst(){
		return ((readFromURL_options_documentAttributes_error_IMetInst != null)
	? (readFromURL_options_documentAttributes_error_IMetInst)
	: (readFromURL_options_documentAttributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:options:documentAttributes:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromURL_options_documentAttributes_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSDictionary opts, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDictionary> dict, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_options_documentAttributes_error_IMetInst = get_readFromURL_options_documentAttributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_options_documentAttributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, dict);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		readFromURL_options_documentAttributes_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlignment_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlignment_range_IMetInst(){
		return ((setAlignment_range_IMetInst != null)
	? (setAlignment_range_IMetInst)
	: (setAlignment_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlignment:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setAlignment_range(final long alignment, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setAlignment_range_IMetInst = get_setAlignment_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlignment_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, alignment);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setAlignment_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBaseWritingDirection_range_IMetInst(){
		return ((setBaseWritingDirection_range_IMetInst != null)
	? (setBaseWritingDirection_range_IMetInst)
	: (setBaseWritingDirection_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBaseWritingDirection:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setBaseWritingDirection_range(final long writingDirection, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_range_IMetInst = get_setBaseWritingDirection_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBaseWritingDirection_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setBaseWritingDirection_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend subscriptRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subscriptRange_IMetInst(){
		return ((subscriptRange_IMetInst != null)
	? (subscriptRange_IMetInst)
	: (subscriptRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subscriptRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void subscriptRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend subscriptRange_IMetInst = get_subscriptRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subscriptRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		subscriptRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend superscriptRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superscriptRange_IMetInst(){
		return ((superscriptRange_IMetInst != null)
	? (superscriptRange_IMetInst)
	: (superscriptRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superscriptRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void superscriptRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend superscriptRange_IMetInst = get_superscriptRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superscriptRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		superscriptRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unscriptRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unscriptRange_IMetInst(){
		return ((unscriptRange_IMetInst != null)
	? (unscriptRange_IMetInst)
	: (unscriptRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unscriptRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void unscriptRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend unscriptRange_IMetInst = get_unscriptRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unscriptRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		unscriptRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateAttachmentsFromPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateAttachmentsFromPath_IMetInst(){
		return ((updateAttachmentsFromPath_IMetInst != null)
	? (updateAttachmentsFromPath_IMetInst)
	: (updateAttachmentsFromPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateAttachmentsFromPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateAttachmentsFromPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend updateAttachmentsFromPath_IMetInst = get_updateAttachmentsFromPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateAttachmentsFromPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		updateAttachmentsFromPath_IMetInst.invoke(nativeBuffer);
		
		
	}

}
