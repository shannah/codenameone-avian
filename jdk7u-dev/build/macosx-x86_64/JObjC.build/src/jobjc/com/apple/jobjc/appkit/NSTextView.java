package com.apple.jobjc.appkit;

public  class NSTextView extends com.apple.jobjc.appkit.NSText {
	public NSTextView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextView(final NSTextView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptableDragTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptableDragTypes_IMetInst(){
		return ((acceptableDragTypes_IMetInst != null)
	? (acceptableDragTypes_IMetInst)
	: (acceptableDragTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptableDragTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray acceptableDragTypes(){
			final com.apple.jobjc.Invoke.MsgSend acceptableDragTypes_IMetInst = get_acceptableDragTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptableDragTypes_IMetInst.init(nativeBuffer, this);
		acceptableDragTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend acceptsGlyphInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsGlyphInfo_IMetInst(){
		return ((acceptsGlyphInfo_IMetInst != null)
	? (acceptsGlyphInfo_IMetInst)
	: (acceptsGlyphInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsGlyphInfo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsGlyphInfo(){
			final com.apple.jobjc.Invoke.MsgSend acceptsGlyphInfo_IMetInst = get_acceptsGlyphInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsGlyphInfo_IMetInst.init(nativeBuffer, this);
		acceptsGlyphInfo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alignJustified_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignJustified_IMetInst(){
		return ((alignJustified_IMetInst != null)
	? (alignJustified_IMetInst)
	: (alignJustified_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignJustified:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void alignJustified(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend alignJustified_IMetInst = get_alignJustified_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignJustified_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		alignJustified_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedInputSourceLocales_IMetInst(){
		return ((allowedInputSourceLocales_IMetInst != null)
	? (allowedInputSourceLocales_IMetInst)
	: (allowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedInputSourceLocales", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allowedInputSourceLocales(){
			final com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst = get_allowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		allowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsDocumentBackgroundColorChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsDocumentBackgroundColorChange_IMetInst(){
		return ((allowsDocumentBackgroundColorChange_IMetInst != null)
	? (allowsDocumentBackgroundColorChange_IMetInst)
	: (allowsDocumentBackgroundColorChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsDocumentBackgroundColorChange", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsDocumentBackgroundColorChange(){
			final com.apple.jobjc.Invoke.MsgSend allowsDocumentBackgroundColorChange_IMetInst = get_allowsDocumentBackgroundColorChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsDocumentBackgroundColorChange_IMetInst.init(nativeBuffer, this);
		allowsDocumentBackgroundColorChange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsImageEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsImageEditing_IMetInst(){
		return ((allowsImageEditing_IMetInst != null)
	? (allowsImageEditing_IMetInst)
	: (allowsImageEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsImageEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsImageEditing(){
			final com.apple.jobjc.Invoke.MsgSend allowsImageEditing_IMetInst = get_allowsImageEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsImageEditing_IMetInst.init(nativeBuffer, this);
		allowsImageEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsUndo_IMetInst(){
		return ((allowsUndo_IMetInst != null)
	? (allowsUndo_IMetInst)
	: (allowsUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsUndo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsUndo(){
			final com.apple.jobjc.Invoke.MsgSend allowsUndo_IMetInst = get_allowsUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsUndo_IMetInst.init(nativeBuffer, this);
		allowsUndo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend breakUndoCoalescing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_breakUndoCoalescing_IMetInst(){
		return ((breakUndoCoalescing_IMetInst != null)
	? (breakUndoCoalescing_IMetInst)
	: (breakUndoCoalescing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "breakUndoCoalescing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void breakUndoCoalescing(){
			final com.apple.jobjc.Invoke.MsgSend breakUndoCoalescing_IMetInst = get_breakUndoCoalescing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		breakUndoCoalescing_IMetInst.init(nativeBuffer, this);
		breakUndoCoalescing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeAttributes_IMetInst(){
		return ((changeAttributes_IMetInst != null)
	? (changeAttributes_IMetInst)
	: (changeAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeAttributes(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeAttributes_IMetInst = get_changeAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeColor_IMetInst(){
		return ((changeColor_IMetInst != null)
	? (changeColor_IMetInst)
	: (changeColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeColor(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeColor_IMetInst = get_changeColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeDocumentBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeDocumentBackgroundColor_IMetInst(){
		return ((changeDocumentBackgroundColor_IMetInst != null)
	? (changeDocumentBackgroundColor_IMetInst)
	: (changeDocumentBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeDocumentBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeDocumentBackgroundColor(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeDocumentBackgroundColor_IMetInst = get_changeDocumentBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeDocumentBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeDocumentBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeLayoutOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeLayoutOrientation_IMetInst(){
		return ((changeLayoutOrientation_IMetInst != null)
	? (changeLayoutOrientation_IMetInst)
	: (changeLayoutOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeLayoutOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeLayoutOrientation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeLayoutOrientation_IMetInst = get_changeLayoutOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeLayoutOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeLayoutOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend characterIndexForInsertionAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterIndexForInsertionAtPoint_IMetInst(){
		return ((characterIndexForInsertionAtPoint_IMetInst != null)
	? (characterIndexForInsertionAtPoint_IMetInst)
	: (characterIndexForInsertionAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterIndexForInsertionAtPoint:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long characterIndexForInsertionAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend characterIndexForInsertionAtPoint_IMetInst = get_characterIndexForInsertionAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterIndexForInsertionAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		characterIndexForInsertionAtPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkTextInDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkTextInDocument_IMetInst(){
		return ((checkTextInDocument_IMetInst != null)
	? (checkTextInDocument_IMetInst)
	: (checkTextInDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkTextInDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void checkTextInDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend checkTextInDocument_IMetInst = get_checkTextInDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkTextInDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		checkTextInDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend checkTextInRange_types_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkTextInRange_types_options_IMetInst(){
		return ((checkTextInRange_types_options_IMetInst != null)
	? (checkTextInRange_types_options_IMetInst)
	: (checkTextInRange_types_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkTextInRange:types:options:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void checkTextInRange_types_options(final com.apple.jobjc.foundation.NSRange range, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend checkTextInRange_types_options_IMetInst = get_checkTextInRange_types_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkTextInRange_types_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		checkTextInRange_types_options_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend checkTextInSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkTextInSelection_IMetInst(){
		return ((checkTextInSelection_IMetInst != null)
	? (checkTextInSelection_IMetInst)
	: (checkTextInSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkTextInSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void checkTextInSelection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend checkTextInSelection_IMetInst = get_checkTextInSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkTextInSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		checkTextInSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cleanUpAfterDragOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cleanUpAfterDragOperation_IMetInst(){
		return ((cleanUpAfterDragOperation_IMetInst != null)
	? (cleanUpAfterDragOperation_IMetInst)
	: (cleanUpAfterDragOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cleanUpAfterDragOperation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cleanUpAfterDragOperation(){
			final com.apple.jobjc.Invoke.MsgSend cleanUpAfterDragOperation_IMetInst = get_cleanUpAfterDragOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cleanUpAfterDragOperation_IMetInst.init(nativeBuffer, this);
		cleanUpAfterDragOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend clickedOnLink_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clickedOnLink_atIndex_IMetInst(){
		return ((clickedOnLink_atIndex_IMetInst != null)
	? (clickedOnLink_atIndex_IMetInst)
	: (clickedOnLink_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clickedOnLink:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void clickedOnLink_atIndex(final com.apple.jobjc.ID link, final long charIndex){
			final com.apple.jobjc.Invoke.MsgSend clickedOnLink_atIndex_IMetInst = get_clickedOnLink_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clickedOnLink_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, link);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, charIndex);
		clickedOnLink_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend complete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_complete_IMetInst(){
		return ((complete_IMetInst != null)
	? (complete_IMetInst)
	: (complete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "complete:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void complete(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend complete_IMetInst = get_complete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		complete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		complete_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend completionsForPartialWordRange_indexOfSelectedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completionsForPartialWordRange_indexOfSelectedItem_IMetInst(){
		return ((completionsForPartialWordRange_indexOfSelectedItem_IMetInst != null)
	? (completionsForPartialWordRange_indexOfSelectedItem_IMetInst)
	: (completionsForPartialWordRange_indexOfSelectedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completionsForPartialWordRange:indexOfSelectedItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray completionsForPartialWordRange_indexOfSelectedItem(final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.Pointer<java.lang.Long> index){
			final com.apple.jobjc.Invoke.MsgSend completionsForPartialWordRange_indexOfSelectedItem_IMetInst = get_completionsForPartialWordRange_indexOfSelectedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completionsForPartialWordRange_indexOfSelectedItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, index);
		completionsForPartialWordRange_indexOfSelectedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultParagraphStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultParagraphStyle_IMetInst(){
		return ((defaultParagraphStyle_IMetInst != null)
	? (defaultParagraphStyle_IMetInst)
	: (defaultParagraphStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultParagraphStyle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSParagraphStyle defaultParagraphStyle(){
			final com.apple.jobjc.Invoke.MsgSend defaultParagraphStyle_IMetInst = get_defaultParagraphStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultParagraphStyle_IMetInst.init(nativeBuffer, this);
		defaultParagraphStyle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSParagraphStyle returnValue = (com.apple.jobjc.appkit.NSParagraphStyle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend didChangeText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didChangeText_IMetInst(){
		return ((didChangeText_IMetInst != null)
	? (didChangeText_IMetInst)
	: (didChangeText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didChangeText", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void didChangeText(){
			final com.apple.jobjc.Invoke.MsgSend didChangeText_IMetInst = get_didChangeText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didChangeText_IMetInst.init(nativeBuffer, this);
		didChangeText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displaysLinkToolTips_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displaysLinkToolTips_IMetInst(){
		return ((displaysLinkToolTips_IMetInst != null)
	? (displaysLinkToolTips_IMetInst)
	: (displaysLinkToolTips_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displaysLinkToolTips", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean displaysLinkToolTips(){
			final com.apple.jobjc.Invoke.MsgSend displaysLinkToolTips_IMetInst = get_displaysLinkToolTips_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displaysLinkToolTips_IMetInst.init(nativeBuffer, this);
		displaysLinkToolTips_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragImageForSelectionWithEvent_origin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragImageForSelectionWithEvent_origin_IMetInst(){
		return ((dragImageForSelectionWithEvent_origin_IMetInst != null)
	? (dragImageForSelectionWithEvent_origin_IMetInst)
	: (dragImageForSelectionWithEvent_origin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragImageForSelectionWithEvent:origin:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage dragImageForSelectionWithEvent_origin(final com.apple.jobjc.appkit.NSEvent event, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ origin){
			final com.apple.jobjc.Invoke.MsgSend dragImageForSelectionWithEvent_origin_IMetInst = get_dragImageForSelectionWithEvent_origin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragImageForSelectionWithEvent_origin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, origin);
		dragImageForSelectionWithEvent_origin_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragOperationForDraggingInfo_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragOperationForDraggingInfo_type_IMetInst(){
		return ((dragOperationForDraggingInfo_type_IMetInst != null)
	? (dragOperationForDraggingInfo_type_IMetInst)
	: (dragOperationForDraggingInfo_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragOperationForDraggingInfo:type:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long dragOperationForDraggingInfo_type(final com.apple.jobjc.ID dragInfo, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend dragOperationForDraggingInfo_type_IMetInst = get_dragOperationForDraggingInfo_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragOperationForDraggingInfo_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dragInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		dragOperationForDraggingInfo_type_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragSelectionWithEvent_offset_slideBack_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragSelectionWithEvent_offset_slideBack_IMetInst(){
		return ((dragSelectionWithEvent_offset_slideBack_IMetInst != null)
	? (dragSelectionWithEvent_offset_slideBack_IMetInst)
	: (dragSelectionWithEvent_offset_slideBack_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragSelectionWithEvent:offset:slideBack:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean dragSelectionWithEvent_offset_slideBack(final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSSize mouseOffset, final boolean slideBack){
			final com.apple.jobjc.Invoke.MsgSend dragSelectionWithEvent_offset_slideBack_IMetInst = get_dragSelectionWithEvent_offset_slideBack_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragSelectionWithEvent_offset_slideBack_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, mouseOffset);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, slideBack);
		dragSelectionWithEvent_offset_slideBack_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInsertionPointInRect_color_turnedOn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInsertionPointInRect_color_turnedOn_IMetInst(){
		return ((drawInsertionPointInRect_color_turnedOn_IMetInst != null)
	? (drawInsertionPointInRect_color_turnedOn_IMetInst)
	: (drawInsertionPointInRect_color_turnedOn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInsertionPointInRect:color:turnedOn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void drawInsertionPointInRect_color_turnedOn(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSColor color, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend drawInsertionPointInRect_color_turnedOn_IMetInst = get_drawInsertionPointInRect_color_turnedOn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInsertionPointInRect_color_turnedOn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		drawInsertionPointInRect_color_turnedOn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawViewBackgroundInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawViewBackgroundInRect_IMetInst(){
		return ((drawViewBackgroundInRect_IMetInst != null)
	? (drawViewBackgroundInRect_IMetInst)
	: (drawViewBackgroundInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawViewBackgroundInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawViewBackgroundInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawViewBackgroundInRect_IMetInst = get_drawViewBackgroundInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawViewBackgroundInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawViewBackgroundInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enabledTextCheckingTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enabledTextCheckingTypes_IMetInst(){
		return ((enabledTextCheckingTypes_IMetInst != null)
	? (enabledTextCheckingTypes_IMetInst)
	: (enabledTextCheckingTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enabledTextCheckingTypes", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long enabledTextCheckingTypes(){
			final com.apple.jobjc.Invoke.MsgSend enabledTextCheckingTypes_IMetInst = get_enabledTextCheckingTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enabledTextCheckingTypes_IMetInst.init(nativeBuffer, this);
		enabledTextCheckingTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst(){
		return ((handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst != null)
	? (handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst)
	: (handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleTextCheckingResults:forRange:types:options:orthography:wordCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void handleTextCheckingResults_forRange_types_options_orthography_wordCount(final com.apple.jobjc.foundation.NSArray results, final com.apple.jobjc.foundation.NSRange range, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.foundation.NSOrthography orthography, final long wordCount){
			final com.apple.jobjc.Invoke.MsgSend handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst = get_handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, results);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, wordCount);
		handleTextCheckingResults_forRange_types_options_orthography_wordCount_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_importsGraphics_IMetInst(){
		return ((importsGraphics_IMetInst != null)
	? (importsGraphics_IMetInst)
	: (importsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "importsGraphics", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean importsGraphics(){
			final com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst = get_importsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		importsGraphics_IMetInst.init(nativeBuffer, this);
		importsGraphics_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_IMetInst(){
		return ((initWithFrame_IMetInst != null)
	? (initWithFrame_IMetInst)
	: (initWithFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame(final com.apple.jobjc.foundation.NSRect frameRect){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst = get_initWithFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		initWithFrame_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_textContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_textContainer_IMetInst(){
		return ((initWithFrame_textContainer_IMetInst != null)
	? (initWithFrame_textContainer_IMetInst)
	: (initWithFrame_textContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:textContainer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame_textContainer(final com.apple.jobjc.foundation.NSRect frameRect, final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_textContainer_IMetInst = get_initWithFrame_textContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_textContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		initWithFrame_textContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertCompletion_forPartialWordRange_movement_isFinal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertCompletion_forPartialWordRange_movement_isFinal_IMetInst(){
		return ((insertCompletion_forPartialWordRange_movement_isFinal_IMetInst != null)
	? (insertCompletion_forPartialWordRange_movement_isFinal_IMetInst)
	: (insertCompletion_forPartialWordRange_movement_isFinal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertCompletion:forPartialWordRange:movement:isFinal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void insertCompletion_forPartialWordRange_movement_isFinal(final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSRange charRange, final long movement, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend insertCompletion_forPartialWordRange_movement_isFinal_IMetInst = get_insertCompletion_forPartialWordRange_movement_isFinal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertCompletion_forPartialWordRange_movement_isFinal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, movement);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		insertCompletion_forPartialWordRange_movement_isFinal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertText_IMetInst(){
		return ((insertText_IMetInst != null)
	? (insertText_IMetInst)
	: (insertText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertText(final com.apple.jobjc.ID insertString){
			final com.apple.jobjc.Invoke.MsgSend insertText_IMetInst = get_insertText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, insertString);
		insertText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertionPointColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertionPointColor_IMetInst(){
		return ((insertionPointColor_IMetInst != null)
	? (insertionPointColor_IMetInst)
	: (insertionPointColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertionPointColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor insertionPointColor(){
			final com.apple.jobjc.Invoke.MsgSend insertionPointColor_IMetInst = get_insertionPointColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertionPointColor_IMetInst.init(nativeBuffer, this);
		insertionPointColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateTextContainerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateTextContainerOrigin_IMetInst(){
		return ((invalidateTextContainerOrigin_IMetInst != null)
	? (invalidateTextContainerOrigin_IMetInst)
	: (invalidateTextContainerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateTextContainerOrigin", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateTextContainerOrigin(){
			final com.apple.jobjc.Invoke.MsgSend invalidateTextContainerOrigin_IMetInst = get_invalidateTextContainerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateTextContainerOrigin_IMetInst.init(nativeBuffer, this);
		invalidateTextContainerOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticDashSubstitutionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticDashSubstitutionEnabled_IMetInst(){
		return ((isAutomaticDashSubstitutionEnabled_IMetInst != null)
	? (isAutomaticDashSubstitutionEnabled_IMetInst)
	: (isAutomaticDashSubstitutionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticDashSubstitutionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticDashSubstitutionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticDashSubstitutionEnabled_IMetInst = get_isAutomaticDashSubstitutionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticDashSubstitutionEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticDashSubstitutionEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticDataDetectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticDataDetectionEnabled_IMetInst(){
		return ((isAutomaticDataDetectionEnabled_IMetInst != null)
	? (isAutomaticDataDetectionEnabled_IMetInst)
	: (isAutomaticDataDetectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticDataDetectionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticDataDetectionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticDataDetectionEnabled_IMetInst = get_isAutomaticDataDetectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticDataDetectionEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticDataDetectionEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticLinkDetectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticLinkDetectionEnabled_IMetInst(){
		return ((isAutomaticLinkDetectionEnabled_IMetInst != null)
	? (isAutomaticLinkDetectionEnabled_IMetInst)
	: (isAutomaticLinkDetectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticLinkDetectionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticLinkDetectionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticLinkDetectionEnabled_IMetInst = get_isAutomaticLinkDetectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticLinkDetectionEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticLinkDetectionEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticQuoteSubstitutionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticQuoteSubstitutionEnabled_IMetInst(){
		return ((isAutomaticQuoteSubstitutionEnabled_IMetInst != null)
	? (isAutomaticQuoteSubstitutionEnabled_IMetInst)
	: (isAutomaticQuoteSubstitutionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticQuoteSubstitutionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticQuoteSubstitutionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticQuoteSubstitutionEnabled_IMetInst = get_isAutomaticQuoteSubstitutionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticQuoteSubstitutionEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticQuoteSubstitutionEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticSpellingCorrectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticSpellingCorrectionEnabled_IMetInst(){
		return ((isAutomaticSpellingCorrectionEnabled_IMetInst != null)
	? (isAutomaticSpellingCorrectionEnabled_IMetInst)
	: (isAutomaticSpellingCorrectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticSpellingCorrectionEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticSpellingCorrectionEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticSpellingCorrectionEnabled_IMetInst = get_isAutomaticSpellingCorrectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticSpellingCorrectionEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticSpellingCorrectionEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutomaticTextReplacementEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutomaticTextReplacementEnabled_IMetInst(){
		return ((isAutomaticTextReplacementEnabled_IMetInst != null)
	? (isAutomaticTextReplacementEnabled_IMetInst)
	: (isAutomaticTextReplacementEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutomaticTextReplacementEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutomaticTextReplacementEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isAutomaticTextReplacementEnabled_IMetInst = get_isAutomaticTextReplacementEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutomaticTextReplacementEnabled_IMetInst.init(nativeBuffer, this);
		isAutomaticTextReplacementEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isCoalescingUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCoalescingUndo_IMetInst(){
		return ((isCoalescingUndo_IMetInst != null)
	? (isCoalescingUndo_IMetInst)
	: (isCoalescingUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCoalescingUndo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCoalescingUndo(){
			final com.apple.jobjc.Invoke.MsgSend isCoalescingUndo_IMetInst = get_isCoalescingUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCoalescingUndo_IMetInst.init(nativeBuffer, this);
		isCoalescingUndo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isContinuousSpellCheckingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isContinuousSpellCheckingEnabled_IMetInst(){
		return ((isContinuousSpellCheckingEnabled_IMetInst != null)
	? (isContinuousSpellCheckingEnabled_IMetInst)
	: (isContinuousSpellCheckingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isContinuousSpellCheckingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isContinuousSpellCheckingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isContinuousSpellCheckingEnabled_IMetInst = get_isContinuousSpellCheckingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isContinuousSpellCheckingEnabled_IMetInst.init(nativeBuffer, this);
		isContinuousSpellCheckingEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFieldEditor_IMetInst(){
		return ((isFieldEditor_IMetInst != null)
	? (isFieldEditor_IMetInst)
	: (isFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFieldEditor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFieldEditor(){
			final com.apple.jobjc.Invoke.MsgSend isFieldEditor_IMetInst = get_isFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFieldEditor_IMetInst.init(nativeBuffer, this);
		isFieldEditor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isGrammarCheckingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isGrammarCheckingEnabled_IMetInst(){
		return ((isGrammarCheckingEnabled_IMetInst != null)
	? (isGrammarCheckingEnabled_IMetInst)
	: (isGrammarCheckingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isGrammarCheckingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isGrammarCheckingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isGrammarCheckingEnabled_IMetInst = get_isGrammarCheckingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isGrammarCheckingEnabled_IMetInst.init(nativeBuffer, this);
		isGrammarCheckingEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isIncrementalSearchingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isIncrementalSearchingEnabled_IMetInst(){
		return ((isIncrementalSearchingEnabled_IMetInst != null)
	? (isIncrementalSearchingEnabled_IMetInst)
	: (isIncrementalSearchingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isIncrementalSearchingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isIncrementalSearchingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isIncrementalSearchingEnabled_IMetInst = get_isIncrementalSearchingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isIncrementalSearchingEnabled_IMetInst.init(nativeBuffer, this);
		isIncrementalSearchingEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRichText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRichText_IMetInst(){
		return ((isRichText_IMetInst != null)
	? (isRichText_IMetInst)
	: (isRichText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRichText", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRichText(){
			final com.apple.jobjc.Invoke.MsgSend isRichText_IMetInst = get_isRichText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRichText_IMetInst.init(nativeBuffer, this);
		isRichText_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRulerVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRulerVisible_IMetInst(){
		return ((isRulerVisible_IMetInst != null)
	? (isRulerVisible_IMetInst)
	: (isRulerVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRulerVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRulerVisible(){
			final com.apple.jobjc.Invoke.MsgSend isRulerVisible_IMetInst = get_isRulerVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRulerVisible_IMetInst.init(nativeBuffer, this);
		isRulerVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectable_IMetInst(){
		return ((isSelectable_IMetInst != null)
	? (isSelectable_IMetInst)
	: (isSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectable(){
			final com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst = get_isSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectable_IMetInst.init(nativeBuffer, this);
		isSelectable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend linkTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linkTextAttributes_IMetInst(){
		return ((linkTextAttributes_IMetInst != null)
	? (linkTextAttributes_IMetInst)
	: (linkTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linkTextAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary linkTextAttributes(){
			final com.apple.jobjc.Invoke.MsgSend linkTextAttributes_IMetInst = get_linkTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linkTextAttributes_IMetInst.init(nativeBuffer, this);
		linkTextAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loosenKerning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loosenKerning_IMetInst(){
		return ((loosenKerning_IMetInst != null)
	? (loosenKerning_IMetInst)
	: (loosenKerning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loosenKerning:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void loosenKerning(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend loosenKerning_IMetInst = get_loosenKerning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loosenKerning_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		loosenKerning_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lowerBaseline_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lowerBaseline_IMetInst(){
		return ((lowerBaseline_IMetInst != null)
	? (lowerBaseline_IMetInst)
	: (lowerBaseline_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lowerBaseline:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void lowerBaseline(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend lowerBaseline_IMetInst = get_lowerBaseline_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lowerBaseline_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		lowerBaseline_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend markedTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_markedTextAttributes_IMetInst(){
		return ((markedTextAttributes_IMetInst != null)
	? (markedTextAttributes_IMetInst)
	: (markedTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "markedTextAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary markedTextAttributes(){
			final com.apple.jobjc.Invoke.MsgSend markedTextAttributes_IMetInst = get_markedTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		markedTextAttributes_IMetInst.init(nativeBuffer, this);
		markedTextAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontLinkPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontLinkPanel_IMetInst(){
		return ((orderFrontLinkPanel_IMetInst != null)
	? (orderFrontLinkPanel_IMetInst)
	: (orderFrontLinkPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontLinkPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontLinkPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontLinkPanel_IMetInst = get_orderFrontLinkPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontLinkPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontLinkPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontListPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontListPanel_IMetInst(){
		return ((orderFrontListPanel_IMetInst != null)
	? (orderFrontListPanel_IMetInst)
	: (orderFrontListPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontListPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontListPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontListPanel_IMetInst = get_orderFrontListPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontListPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontListPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontSharingServicePicker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontSharingServicePicker_IMetInst(){
		return ((orderFrontSharingServicePicker_IMetInst != null)
	? (orderFrontSharingServicePicker_IMetInst)
	: (orderFrontSharingServicePicker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontSharingServicePicker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontSharingServicePicker(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontSharingServicePicker_IMetInst = get_orderFrontSharingServicePicker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontSharingServicePicker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontSharingServicePicker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontSpacingPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontSpacingPanel_IMetInst(){
		return ((orderFrontSpacingPanel_IMetInst != null)
	? (orderFrontSpacingPanel_IMetInst)
	: (orderFrontSpacingPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontSpacingPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontSpacingPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontSpacingPanel_IMetInst = get_orderFrontSpacingPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontSpacingPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontSpacingPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontSubstitutionsPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontSubstitutionsPanel_IMetInst(){
		return ((orderFrontSubstitutionsPanel_IMetInst != null)
	? (orderFrontSubstitutionsPanel_IMetInst)
	: (orderFrontSubstitutionsPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontSubstitutionsPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontSubstitutionsPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontSubstitutionsPanel_IMetInst = get_orderFrontSubstitutionsPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontSubstitutionsPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontSubstitutionsPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontTablePanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontTablePanel_IMetInst(){
		return ((orderFrontTablePanel_IMetInst != null)
	? (orderFrontTablePanel_IMetInst)
	: (orderFrontTablePanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontTablePanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontTablePanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontTablePanel_IMetInst = get_orderFrontTablePanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontTablePanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontTablePanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outline_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outline_IMetInst(){
		return ((outline_IMetInst != null)
	? (outline_IMetInst)
	: (outline_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outline:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void outline(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend outline_IMetInst = get_outline_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outline_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		outline_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteAsPlainText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteAsPlainText_IMetInst(){
		return ((pasteAsPlainText_IMetInst != null)
	? (pasteAsPlainText_IMetInst)
	: (pasteAsPlainText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteAsPlainText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteAsPlainText(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pasteAsPlainText_IMetInst = get_pasteAsPlainText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteAsPlainText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pasteAsPlainText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteAsRichText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteAsRichText_IMetInst(){
		return ((pasteAsRichText_IMetInst != null)
	? (pasteAsRichText_IMetInst)
	: (pasteAsRichText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteAsRichText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteAsRichText(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pasteAsRichText_IMetInst = get_pasteAsRichText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteAsRichText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pasteAsRichText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performFindPanelAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performFindPanelAction_IMetInst(){
		return ((performFindPanelAction_IMetInst != null)
	? (performFindPanelAction_IMetInst)
	: (performFindPanelAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performFindPanelAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performFindPanelAction(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performFindPanelAction_IMetInst = get_performFindPanelAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performFindPanelAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performFindPanelAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst(){
		return ((preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst != null)
	? (preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst)
	: (preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredPasteboardTypeFromArray:restrictedToTypesFromArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString preferredPasteboardTypeFromArray_restrictedToTypesFromArray(final com.apple.jobjc.foundation.NSArray availableTypes, final com.apple.jobjc.foundation.NSArray allowedTypes){
			final com.apple.jobjc.Invoke.MsgSend preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst = get_preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, availableTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, allowedTypes);
		preferredPasteboardTypeFromArray_restrictedToTypesFromArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend quickLookPreviewableItemsInRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_quickLookPreviewableItemsInRanges_IMetInst(){
		return ((quickLookPreviewableItemsInRanges_IMetInst != null)
	? (quickLookPreviewableItemsInRanges_IMetInst)
	: (quickLookPreviewableItemsInRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "quickLookPreviewableItemsInRanges:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray quickLookPreviewableItemsInRanges(final com.apple.jobjc.foundation.NSArray ranges){
			final com.apple.jobjc.Invoke.MsgSend quickLookPreviewableItemsInRanges_IMetInst = get_quickLookPreviewableItemsInRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		quickLookPreviewableItemsInRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ranges);
		quickLookPreviewableItemsInRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend raiseBaseline_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_raiseBaseline_IMetInst(){
		return ((raiseBaseline_IMetInst != null)
	? (raiseBaseline_IMetInst)
	: (raiseBaseline_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "raiseBaseline:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void raiseBaseline(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend raiseBaseline_IMetInst = get_raiseBaseline_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		raiseBaseline_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		raiseBaseline_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeForUserCharacterAttributeChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeForUserCharacterAttributeChange_IMetInst(){
		return ((rangeForUserCharacterAttributeChange_IMetInst != null)
	? (rangeForUserCharacterAttributeChange_IMetInst)
	: (rangeForUserCharacterAttributeChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeForUserCharacterAttributeChange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeForUserCharacterAttributeChange(){
			final com.apple.jobjc.Invoke.MsgSend rangeForUserCharacterAttributeChange_IMetInst = get_rangeForUserCharacterAttributeChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeForUserCharacterAttributeChange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeForUserCharacterAttributeChange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeForUserCompletion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeForUserCompletion_IMetInst(){
		return ((rangeForUserCompletion_IMetInst != null)
	? (rangeForUserCompletion_IMetInst)
	: (rangeForUserCompletion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeForUserCompletion", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeForUserCompletion(){
			final com.apple.jobjc.Invoke.MsgSend rangeForUserCompletion_IMetInst = get_rangeForUserCompletion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeForUserCompletion_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeForUserCompletion_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeForUserParagraphAttributeChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeForUserParagraphAttributeChange_IMetInst(){
		return ((rangeForUserParagraphAttributeChange_IMetInst != null)
	? (rangeForUserParagraphAttributeChange_IMetInst)
	: (rangeForUserParagraphAttributeChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeForUserParagraphAttributeChange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeForUserParagraphAttributeChange(){
			final com.apple.jobjc.Invoke.MsgSend rangeForUserParagraphAttributeChange_IMetInst = get_rangeForUserParagraphAttributeChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeForUserParagraphAttributeChange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeForUserParagraphAttributeChange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeForUserTextChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeForUserTextChange_IMetInst(){
		return ((rangeForUserTextChange_IMetInst != null)
	? (rangeForUserTextChange_IMetInst)
	: (rangeForUserTextChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeForUserTextChange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeForUserTextChange(){
			final com.apple.jobjc.Invoke.MsgSend rangeForUserTextChange_IMetInst = get_rangeForUserTextChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeForUserTextChange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeForUserTextChange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangesForUserCharacterAttributeChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangesForUserCharacterAttributeChange_IMetInst(){
		return ((rangesForUserCharacterAttributeChange_IMetInst != null)
	? (rangesForUserCharacterAttributeChange_IMetInst)
	: (rangesForUserCharacterAttributeChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangesForUserCharacterAttributeChange", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rangesForUserCharacterAttributeChange(){
			final com.apple.jobjc.Invoke.MsgSend rangesForUserCharacterAttributeChange_IMetInst = get_rangesForUserCharacterAttributeChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangesForUserCharacterAttributeChange_IMetInst.init(nativeBuffer, this);
		rangesForUserCharacterAttributeChange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangesForUserParagraphAttributeChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangesForUserParagraphAttributeChange_IMetInst(){
		return ((rangesForUserParagraphAttributeChange_IMetInst != null)
	? (rangesForUserParagraphAttributeChange_IMetInst)
	: (rangesForUserParagraphAttributeChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangesForUserParagraphAttributeChange", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rangesForUserParagraphAttributeChange(){
			final com.apple.jobjc.Invoke.MsgSend rangesForUserParagraphAttributeChange_IMetInst = get_rangesForUserParagraphAttributeChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangesForUserParagraphAttributeChange_IMetInst.init(nativeBuffer, this);
		rangesForUserParagraphAttributeChange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangesForUserTextChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangesForUserTextChange_IMetInst(){
		return ((rangesForUserTextChange_IMetInst != null)
	? (rangesForUserTextChange_IMetInst)
	: (rangesForUserTextChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangesForUserTextChange", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rangesForUserTextChange(){
			final com.apple.jobjc.Invoke.MsgSend rangesForUserTextChange_IMetInst = get_rangesForUserTextChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangesForUserTextChange_IMetInst.init(nativeBuffer, this);
		rangesForUserTextChange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readSelectionFromPasteboard_IMetInst(){
		return ((readSelectionFromPasteboard_IMetInst != null)
	? (readSelectionFromPasteboard_IMetInst)
	: (readSelectionFromPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readSelectionFromPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readSelectionFromPasteboard(final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_IMetInst = get_readSelectionFromPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readSelectionFromPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		readSelectionFromPasteboard_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readSelectionFromPasteboard_type_IMetInst(){
		return ((readSelectionFromPasteboard_type_IMetInst != null)
	? (readSelectionFromPasteboard_type_IMetInst)
	: (readSelectionFromPasteboard_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readSelectionFromPasteboard:type:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readSelectionFromPasteboard_type(final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend readSelectionFromPasteboard_type_IMetInst = get_readSelectionFromPasteboard_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readSelectionFromPasteboard_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		readSelectionFromPasteboard_type_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readablePasteboardTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readablePasteboardTypes_IMetInst(){
		return ((readablePasteboardTypes_IMetInst != null)
	? (readablePasteboardTypes_IMetInst)
	: (readablePasteboardTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readablePasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray readablePasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend readablePasteboardTypes_IMetInst = get_readablePasteboardTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readablePasteboardTypes_IMetInst.init(nativeBuffer, this);
		readablePasteboardTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceTextContainer_IMetInst(){
		return ((replaceTextContainer_IMetInst != null)
	? (replaceTextContainer_IMetInst)
	: (replaceTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceTextContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceTextContainer(final com.apple.jobjc.appkit.NSTextContainer newContainer){
			final com.apple.jobjc.Invoke.MsgSend replaceTextContainer_IMetInst = get_replaceTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newContainer);
		replaceTextContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didAddMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didAddMarker_IMetInst(){
		return ((rulerView_didAddMarker_IMetInst != null)
	? (rulerView_didAddMarker_IMetInst)
	: (rulerView_didAddMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didAddMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didAddMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didAddMarker_IMetInst = get_rulerView_didAddMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didAddMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didAddMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didMoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didMoveMarker_IMetInst(){
		return ((rulerView_didMoveMarker_IMetInst != null)
	? (rulerView_didMoveMarker_IMetInst)
	: (rulerView_didMoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didMoveMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didMoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didMoveMarker_IMetInst = get_rulerView_didMoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didMoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didMoveMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didRemoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didRemoveMarker_IMetInst(){
		return ((rulerView_didRemoveMarker_IMetInst != null)
	? (rulerView_didRemoveMarker_IMetInst)
	: (rulerView_didRemoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didRemoveMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didRemoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didRemoveMarker_IMetInst = get_rulerView_didRemoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didRemoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didRemoveMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_handleMouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_handleMouseDown_IMetInst(){
		return ((rulerView_handleMouseDown_IMetInst != null)
	? (rulerView_handleMouseDown_IMetInst)
	: (rulerView_handleMouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:handleMouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_handleMouseDown(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend rulerView_handleMouseDown_IMetInst = get_rulerView_handleMouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_handleMouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		rulerView_handleMouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldAddMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldAddMarker_IMetInst(){
		return ((rulerView_shouldAddMarker_IMetInst != null)
	? (rulerView_shouldAddMarker_IMetInst)
	: (rulerView_shouldAddMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldAddMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldAddMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldAddMarker_IMetInst = get_rulerView_shouldAddMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldAddMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldAddMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldMoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldMoveMarker_IMetInst(){
		return ((rulerView_shouldMoveMarker_IMetInst != null)
	? (rulerView_shouldMoveMarker_IMetInst)
	: (rulerView_shouldMoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldMoveMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldMoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldMoveMarker_IMetInst = get_rulerView_shouldMoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldMoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldMoveMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldRemoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldRemoveMarker_IMetInst(){
		return ((rulerView_shouldRemoveMarker_IMetInst != null)
	? (rulerView_shouldRemoveMarker_IMetInst)
	: (rulerView_shouldRemoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldRemoveMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldRemoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldRemoveMarker_IMetInst = get_rulerView_shouldRemoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldRemoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldRemoveMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_willAddMarker_atLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_willAddMarker_atLocation_IMetInst(){
		return ((rulerView_willAddMarker_atLocation_IMetInst != null)
	? (rulerView_willAddMarker_atLocation_IMetInst)
	: (rulerView_willAddMarker_atLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:willAddMarker:atLocation:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rulerView_willAddMarker_atLocation(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker, final double location){
			final com.apple.jobjc.Invoke.MsgSend rulerView_willAddMarker_atLocation_IMetInst = get_rulerView_willAddMarker_atLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_willAddMarker_atLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		rulerView_willAddMarker_atLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_willMoveMarker_toLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_willMoveMarker_toLocation_IMetInst(){
		return ((rulerView_willMoveMarker_toLocation_IMetInst != null)
	? (rulerView_willMoveMarker_toLocation_IMetInst)
	: (rulerView_willMoveMarker_toLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:willMoveMarker:toLocation:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rulerView_willMoveMarker_toLocation(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker, final double location){
			final com.apple.jobjc.Invoke.MsgSend rulerView_willMoveMarker_toLocation_IMetInst = get_rulerView_willMoveMarker_toLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_willMoveMarker_toLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		rulerView_willMoveMarker_toLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRanges_IMetInst(){
		return ((selectedRanges_IMetInst != null)
	? (selectedRanges_IMetInst)
	: (selectedRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRanges", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedRanges(){
			final com.apple.jobjc.Invoke.MsgSend selectedRanges_IMetInst = get_selectedRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRanges_IMetInst.init(nativeBuffer, this);
		selectedRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedTextAttributes_IMetInst(){
		return ((selectedTextAttributes_IMetInst != null)
	? (selectedTextAttributes_IMetInst)
	: (selectedTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedTextAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary selectedTextAttributes(){
			final com.apple.jobjc.Invoke.MsgSend selectedTextAttributes_IMetInst = get_selectedTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedTextAttributes_IMetInst.init(nativeBuffer, this);
		selectedTextAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionAffinity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionAffinity_IMetInst(){
		return ((selectionAffinity_IMetInst != null)
	? (selectionAffinity_IMetInst)
	: (selectionAffinity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionAffinity", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long selectionAffinity(){
			final com.apple.jobjc.Invoke.MsgSend selectionAffinity_IMetInst = get_selectionAffinity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionAffinity_IMetInst.init(nativeBuffer, this);
		selectionAffinity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionGranularity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionGranularity_IMetInst(){
		return ((selectionGranularity_IMetInst != null)
	? (selectionGranularity_IMetInst)
	: (selectionGranularity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionGranularity", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long selectionGranularity(){
			final com.apple.jobjc.Invoke.MsgSend selectionGranularity_IMetInst = get_selectionGranularity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionGranularity_IMetInst.init(nativeBuffer, this);
		selectionGranularity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionRangeForProposedRange_granularity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionRangeForProposedRange_granularity_IMetInst(){
		return ((selectionRangeForProposedRange_granularity_IMetInst != null)
	? (selectionRangeForProposedRange_granularity_IMetInst)
	: (selectionRangeForProposedRange_granularity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionRangeForProposedRange:granularity:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRange selectionRangeForProposedRange_granularity(final com.apple.jobjc.foundation.NSRange proposedCharRange, final long granularity){
			final com.apple.jobjc.Invoke.MsgSend selectionRangeForProposedRange_granularity_IMetInst = get_selectionRangeForProposedRange_granularity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionRangeForProposedRange_granularity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, proposedCharRange);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, granularity);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		selectionRangeForProposedRange_granularity_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcceptsGlyphInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcceptsGlyphInfo_IMetInst(){
		return ((setAcceptsGlyphInfo_IMetInst != null)
	? (setAcceptsGlyphInfo_IMetInst)
	: (setAcceptsGlyphInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcceptsGlyphInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAcceptsGlyphInfo(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAcceptsGlyphInfo_IMetInst = get_setAcceptsGlyphInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcceptsGlyphInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAcceptsGlyphInfo_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedInputSourceLocales_IMetInst(){
		return ((setAllowedInputSourceLocales_IMetInst != null)
	? (setAllowedInputSourceLocales_IMetInst)
	: (setAllowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedInputSourceLocales:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllowedInputSourceLocales(final com.apple.jobjc.foundation.NSArray localeIdentifiers){
			final com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst = get_setAllowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localeIdentifiers);
		setAllowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsDocumentBackgroundColorChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsDocumentBackgroundColorChange_IMetInst(){
		return ((setAllowsDocumentBackgroundColorChange_IMetInst != null)
	? (setAllowsDocumentBackgroundColorChange_IMetInst)
	: (setAllowsDocumentBackgroundColorChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsDocumentBackgroundColorChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsDocumentBackgroundColorChange(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsDocumentBackgroundColorChange_IMetInst = get_setAllowsDocumentBackgroundColorChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsDocumentBackgroundColorChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsDocumentBackgroundColorChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsImageEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsImageEditing_IMetInst(){
		return ((setAllowsImageEditing_IMetInst != null)
	? (setAllowsImageEditing_IMetInst)
	: (setAllowsImageEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsImageEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsImageEditing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsImageEditing_IMetInst = get_setAllowsImageEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsImageEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsImageEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsUndo_IMetInst(){
		return ((setAllowsUndo_IMetInst != null)
	? (setAllowsUndo_IMetInst)
	: (setAllowsUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsUndo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsUndo(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsUndo_IMetInst = get_setAllowsUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsUndo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsUndo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticDashSubstitutionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticDashSubstitutionEnabled_IMetInst(){
		return ((setAutomaticDashSubstitutionEnabled_IMetInst != null)
	? (setAutomaticDashSubstitutionEnabled_IMetInst)
	: (setAutomaticDashSubstitutionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticDashSubstitutionEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticDashSubstitutionEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticDashSubstitutionEnabled_IMetInst = get_setAutomaticDashSubstitutionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticDashSubstitutionEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticDashSubstitutionEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticDataDetectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticDataDetectionEnabled_IMetInst(){
		return ((setAutomaticDataDetectionEnabled_IMetInst != null)
	? (setAutomaticDataDetectionEnabled_IMetInst)
	: (setAutomaticDataDetectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticDataDetectionEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticDataDetectionEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticDataDetectionEnabled_IMetInst = get_setAutomaticDataDetectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticDataDetectionEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticDataDetectionEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticLinkDetectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticLinkDetectionEnabled_IMetInst(){
		return ((setAutomaticLinkDetectionEnabled_IMetInst != null)
	? (setAutomaticLinkDetectionEnabled_IMetInst)
	: (setAutomaticLinkDetectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticLinkDetectionEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticLinkDetectionEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticLinkDetectionEnabled_IMetInst = get_setAutomaticLinkDetectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticLinkDetectionEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticLinkDetectionEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticQuoteSubstitutionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticQuoteSubstitutionEnabled_IMetInst(){
		return ((setAutomaticQuoteSubstitutionEnabled_IMetInst != null)
	? (setAutomaticQuoteSubstitutionEnabled_IMetInst)
	: (setAutomaticQuoteSubstitutionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticQuoteSubstitutionEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticQuoteSubstitutionEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticQuoteSubstitutionEnabled_IMetInst = get_setAutomaticQuoteSubstitutionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticQuoteSubstitutionEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticQuoteSubstitutionEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticSpellingCorrectionEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticSpellingCorrectionEnabled_IMetInst(){
		return ((setAutomaticSpellingCorrectionEnabled_IMetInst != null)
	? (setAutomaticSpellingCorrectionEnabled_IMetInst)
	: (setAutomaticSpellingCorrectionEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticSpellingCorrectionEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticSpellingCorrectionEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticSpellingCorrectionEnabled_IMetInst = get_setAutomaticSpellingCorrectionEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticSpellingCorrectionEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticSpellingCorrectionEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticTextReplacementEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticTextReplacementEnabled_IMetInst(){
		return ((setAutomaticTextReplacementEnabled_IMetInst != null)
	? (setAutomaticTextReplacementEnabled_IMetInst)
	: (setAutomaticTextReplacementEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticTextReplacementEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticTextReplacementEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticTextReplacementEnabled_IMetInst = get_setAutomaticTextReplacementEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticTextReplacementEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticTextReplacementEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setConstrainedFrameSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setConstrainedFrameSize_IMetInst(){
		return ((setConstrainedFrameSize_IMetInst != null)
	? (setConstrainedFrameSize_IMetInst)
	: (setConstrainedFrameSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setConstrainedFrameSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setConstrainedFrameSize(final com.apple.jobjc.foundation.NSSize desiredSize){
			final com.apple.jobjc.Invoke.MsgSend setConstrainedFrameSize_IMetInst = get_setConstrainedFrameSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setConstrainedFrameSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, desiredSize);
		setConstrainedFrameSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContinuousSpellCheckingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContinuousSpellCheckingEnabled_IMetInst(){
		return ((setContinuousSpellCheckingEnabled_IMetInst != null)
	? (setContinuousSpellCheckingEnabled_IMetInst)
	: (setContinuousSpellCheckingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContinuousSpellCheckingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContinuousSpellCheckingEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setContinuousSpellCheckingEnabled_IMetInst = get_setContinuousSpellCheckingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContinuousSpellCheckingEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setContinuousSpellCheckingEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultParagraphStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultParagraphStyle_IMetInst(){
		return ((setDefaultParagraphStyle_IMetInst != null)
	? (setDefaultParagraphStyle_IMetInst)
	: (setDefaultParagraphStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultParagraphStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultParagraphStyle(final com.apple.jobjc.appkit.NSParagraphStyle paragraphStyle){
			final com.apple.jobjc.Invoke.MsgSend setDefaultParagraphStyle_IMetInst = get_setDefaultParagraphStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultParagraphStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paragraphStyle);
		setDefaultParagraphStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplaysLinkToolTips_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplaysLinkToolTips_IMetInst(){
		return ((setDisplaysLinkToolTips_IMetInst != null)
	? (setDisplaysLinkToolTips_IMetInst)
	: (setDisplaysLinkToolTips_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplaysLinkToolTips:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDisplaysLinkToolTips(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDisplaysLinkToolTips_IMetInst = get_setDisplaysLinkToolTips_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplaysLinkToolTips_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDisplaysLinkToolTips_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabledTextCheckingTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabledTextCheckingTypes_IMetInst(){
		return ((setEnabledTextCheckingTypes_IMetInst != null)
	? (setEnabledTextCheckingTypes_IMetInst)
	: (setEnabledTextCheckingTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabledTextCheckingTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public void setEnabledTextCheckingTypes(final long checkingTypes){
			final com.apple.jobjc.Invoke.MsgSend setEnabledTextCheckingTypes_IMetInst = get_setEnabledTextCheckingTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabledTextCheckingTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		setEnabledTextCheckingTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFieldEditor_IMetInst(){
		return ((setFieldEditor_IMetInst != null)
	? (setFieldEditor_IMetInst)
	: (setFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFieldEditor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFieldEditor(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setFieldEditor_IMetInst = get_setFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFieldEditor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setFieldEditor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGrammarCheckingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGrammarCheckingEnabled_IMetInst(){
		return ((setGrammarCheckingEnabled_IMetInst != null)
	? (setGrammarCheckingEnabled_IMetInst)
	: (setGrammarCheckingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGrammarCheckingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setGrammarCheckingEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setGrammarCheckingEnabled_IMetInst = get_setGrammarCheckingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGrammarCheckingEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setGrammarCheckingEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImportsGraphics_IMetInst(){
		return ((setImportsGraphics_IMetInst != null)
	? (setImportsGraphics_IMetInst)
	: (setImportsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImportsGraphics:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setImportsGraphics(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst = get_setImportsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImportsGraphics_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setImportsGraphics_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncrementalSearchingEnabled_IMetInst(){
		return ((setIncrementalSearchingEnabled_IMetInst != null)
	? (setIncrementalSearchingEnabled_IMetInst)
	: (setIncrementalSearchingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncrementalSearchingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncrementalSearchingEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingEnabled_IMetInst = get_setIncrementalSearchingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncrementalSearchingEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIncrementalSearchingEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInsertionPointColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInsertionPointColor_IMetInst(){
		return ((setInsertionPointColor_IMetInst != null)
	? (setInsertionPointColor_IMetInst)
	: (setInsertionPointColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInsertionPointColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInsertionPointColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setInsertionPointColor_IMetInst = get_setInsertionPointColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInsertionPointColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setInsertionPointColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayoutOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayoutOrientation_IMetInst(){
		return ((setLayoutOrientation_IMetInst != null)
	? (setLayoutOrientation_IMetInst)
	: (setLayoutOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayoutOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLayoutOrientation(final long theOrientation){
			final com.apple.jobjc.Invoke.MsgSend setLayoutOrientation_IMetInst = get_setLayoutOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayoutOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, theOrientation);
		setLayoutOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLinkTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLinkTextAttributes_IMetInst(){
		return ((setLinkTextAttributes_IMetInst != null)
	? (setLinkTextAttributes_IMetInst)
	: (setLinkTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLinkTextAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLinkTextAttributes(final com.apple.jobjc.foundation.NSDictionary attributeDictionary){
			final com.apple.jobjc.Invoke.MsgSend setLinkTextAttributes_IMetInst = get_setLinkTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLinkTextAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeDictionary);
		setLinkTextAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMarkedTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMarkedTextAttributes_IMetInst(){
		return ((setMarkedTextAttributes_IMetInst != null)
	? (setMarkedTextAttributes_IMetInst)
	: (setMarkedTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMarkedTextAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMarkedTextAttributes(final com.apple.jobjc.foundation.NSDictionary attributeDictionary){
			final com.apple.jobjc.Invoke.MsgSend setMarkedTextAttributes_IMetInst = get_setMarkedTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMarkedTextAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeDictionary);
		setMarkedTextAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst(){
		return ((setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst != null)
	? (setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst)
	: (setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsDisplayInRect:avoidAdditionalLayout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setNeedsDisplayInRect_avoidAdditionalLayout(final com.apple.jobjc.foundation.NSRect rect, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst = get_setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setNeedsDisplayInRect_avoidAdditionalLayout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRichText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRichText_IMetInst(){
		return ((setRichText_IMetInst != null)
	? (setRichText_IMetInst)
	: (setRichText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRichText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRichText(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRichText_IMetInst = get_setRichText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRichText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRichText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRulerVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRulerVisible_IMetInst(){
		return ((setRulerVisible_IMetInst != null)
	? (setRulerVisible_IMetInst)
	: (setRulerVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRulerVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRulerVisible(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRulerVisible_IMetInst = get_setRulerVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRulerVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRulerVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectable_IMetInst(){
		return ((setSelectable_IMetInst != null)
	? (setSelectable_IMetInst)
	: (setSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst = get_setSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRange_IMetInst(){
		return ((setSelectedRange_IMetInst != null)
	? (setSelectedRange_IMetInst)
	: (setSelectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setSelectedRange(final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRange_IMetInst = get_setSelectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		setSelectedRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRange_affinity_stillSelecting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRange_affinity_stillSelecting_IMetInst(){
		return ((setSelectedRange_affinity_stillSelecting_IMetInst != null)
	? (setSelectedRange_affinity_stillSelecting_IMetInst)
	: (setSelectedRange_affinity_stillSelecting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRange:affinity:stillSelecting:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectedRange_affinity_stillSelecting(final com.apple.jobjc.foundation.NSRange charRange, final long affinity, final boolean stillSelectingFlag){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRange_affinity_stillSelecting_IMetInst = get_setSelectedRange_affinity_stillSelecting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRange_affinity_stillSelecting_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, affinity);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, stillSelectingFlag);
		setSelectedRange_affinity_stillSelecting_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRanges_IMetInst(){
		return ((setSelectedRanges_IMetInst != null)
	? (setSelectedRanges_IMetInst)
	: (setSelectedRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRanges:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectedRanges(final com.apple.jobjc.foundation.NSArray ranges){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRanges_IMetInst = get_setSelectedRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ranges);
		setSelectedRanges_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRanges_affinity_stillSelecting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRanges_affinity_stillSelecting_IMetInst(){
		return ((setSelectedRanges_affinity_stillSelecting_IMetInst != null)
	? (setSelectedRanges_affinity_stillSelecting_IMetInst)
	: (setSelectedRanges_affinity_stillSelecting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRanges:affinity:stillSelecting:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectedRanges_affinity_stillSelecting(final com.apple.jobjc.foundation.NSArray ranges, final long affinity, final boolean stillSelectingFlag){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRanges_affinity_stillSelecting_IMetInst = get_setSelectedRanges_affinity_stillSelecting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRanges_affinity_stillSelecting_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ranges);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, affinity);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, stillSelectingFlag);
		setSelectedRanges_affinity_stillSelecting_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedTextAttributes_IMetInst(){
		return ((setSelectedTextAttributes_IMetInst != null)
	? (setSelectedTextAttributes_IMetInst)
	: (setSelectedTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedTextAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectedTextAttributes(final com.apple.jobjc.foundation.NSDictionary attributeDictionary){
			final com.apple.jobjc.Invoke.MsgSend setSelectedTextAttributes_IMetInst = get_setSelectedTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedTextAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeDictionary);
		setSelectedTextAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionGranularity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionGranularity_IMetInst(){
		return ((setSelectionGranularity_IMetInst != null)
	? (setSelectionGranularity_IMetInst)
	: (setSelectionGranularity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionGranularity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setSelectionGranularity(final long granularity){
			final com.apple.jobjc.Invoke.MsgSend setSelectionGranularity_IMetInst = get_setSelectionGranularity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionGranularity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, granularity);
		setSelectionGranularity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSmartInsertDeleteEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSmartInsertDeleteEnabled_IMetInst(){
		return ((setSmartInsertDeleteEnabled_IMetInst != null)
	? (setSmartInsertDeleteEnabled_IMetInst)
	: (setSmartInsertDeleteEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSmartInsertDeleteEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSmartInsertDeleteEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSmartInsertDeleteEnabled_IMetInst = get_setSmartInsertDeleteEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSmartInsertDeleteEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSmartInsertDeleteEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSpellingState_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSpellingState_range_IMetInst(){
		return ((setSpellingState_range_IMetInst != null)
	? (setSpellingState_range_IMetInst)
	: (setSpellingState_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSpellingState:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setSpellingState_range(final long value, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend setSpellingState_range_IMetInst = get_setSpellingState_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSpellingState_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		setSpellingState_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextContainer_IMetInst(){
		return ((setTextContainer_IMetInst != null)
	? (setTextContainer_IMetInst)
	: (setTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextContainer(final com.apple.jobjc.appkit.NSTextContainer container){
			final com.apple.jobjc.Invoke.MsgSend setTextContainer_IMetInst = get_setTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		setTextContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextContainerInset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextContainerInset_IMetInst(){
		return ((setTextContainerInset_IMetInst != null)
	? (setTextContainerInset_IMetInst)
	: (setTextContainerInset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextContainerInset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setTextContainerInset(final com.apple.jobjc.foundation.NSSize inset){
			final com.apple.jobjc.Invoke.MsgSend setTextContainerInset_IMetInst = get_setTextContainerInset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextContainerInset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, inset);
		setTextContainerInset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTypingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTypingAttributes_IMetInst(){
		return ((setTypingAttributes_IMetInst != null)
	? (setTypingAttributes_IMetInst)
	: (setTypingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTypingAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTypingAttributes(final com.apple.jobjc.foundation.NSDictionary attrs){
			final com.apple.jobjc.Invoke.MsgSend setTypingAttributes_IMetInst = get_setTypingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTypingAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		setTypingAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFindBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFindBar_IMetInst(){
		return ((setUsesFindBar_IMetInst != null)
	? (setUsesFindBar_IMetInst)
	: (setUsesFindBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFindBar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFindBar(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFindBar_IMetInst = get_setUsesFindBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFindBar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFindBar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFindPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFindPanel_IMetInst(){
		return ((setUsesFindPanel_IMetInst != null)
	? (setUsesFindPanel_IMetInst)
	: (setUsesFindPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFindPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFindPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFindPanel_IMetInst = get_setUsesFindPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFindPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFindPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFontPanel_IMetInst(){
		return ((setUsesFontPanel_IMetInst != null)
	? (setUsesFontPanel_IMetInst)
	: (setUsesFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFontPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFontPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFontPanel_IMetInst = get_setUsesFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFontPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFontPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesInspectorBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesInspectorBar_IMetInst(){
		return ((setUsesInspectorBar_IMetInst != null)
	? (setUsesInspectorBar_IMetInst)
	: (setUsesInspectorBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesInspectorBar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesInspectorBar(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesInspectorBar_IMetInst = get_setUsesInspectorBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesInspectorBar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesInspectorBar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesRuler_IMetInst(){
		return ((setUsesRuler_IMetInst != null)
	? (setUsesRuler_IMetInst)
	: (setUsesRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesRuler(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesRuler_IMetInst = get_setUsesRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldChangeTextInRange_replacementString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldChangeTextInRange_replacementString_IMetInst(){
		return ((shouldChangeTextInRange_replacementString_IMetInst != null)
	? (shouldChangeTextInRange_replacementString_IMetInst)
	: (shouldChangeTextInRange_replacementString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldChangeTextInRange:replacementString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldChangeTextInRange_replacementString(final com.apple.jobjc.foundation.NSRange affectedCharRange, final com.apple.jobjc.foundation.NSString replacementString){
			final com.apple.jobjc.Invoke.MsgSend shouldChangeTextInRange_replacementString_IMetInst = get_shouldChangeTextInRange_replacementString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldChangeTextInRange_replacementString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, affectedCharRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementString);
		shouldChangeTextInRange_replacementString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldChangeTextInRanges_replacementStrings_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldChangeTextInRanges_replacementStrings_IMetInst(){
		return ((shouldChangeTextInRanges_replacementStrings_IMetInst != null)
	? (shouldChangeTextInRanges_replacementStrings_IMetInst)
	: (shouldChangeTextInRanges_replacementStrings_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldChangeTextInRanges:replacementStrings:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldChangeTextInRanges_replacementStrings(final com.apple.jobjc.foundation.NSArray affectedRanges, final com.apple.jobjc.foundation.NSArray replacementStrings){
			final com.apple.jobjc.Invoke.MsgSend shouldChangeTextInRanges_replacementStrings_IMetInst = get_shouldChangeTextInRanges_replacementStrings_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldChangeTextInRanges_replacementStrings_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, affectedRanges);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacementStrings);
		shouldChangeTextInRanges_replacementStrings_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldDrawInsertionPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldDrawInsertionPoint_IMetInst(){
		return ((shouldDrawInsertionPoint_IMetInst != null)
	? (shouldDrawInsertionPoint_IMetInst)
	: (shouldDrawInsertionPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldDrawInsertionPoint", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldDrawInsertionPoint(){
			final com.apple.jobjc.Invoke.MsgSend shouldDrawInsertionPoint_IMetInst = get_shouldDrawInsertionPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldDrawInsertionPoint_IMetInst.init(nativeBuffer, this);
		shouldDrawInsertionPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showFindIndicatorForRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showFindIndicatorForRange_IMetInst(){
		return ((showFindIndicatorForRange_IMetInst != null)
	? (showFindIndicatorForRange_IMetInst)
	: (showFindIndicatorForRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showFindIndicatorForRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void showFindIndicatorForRange(final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend showFindIndicatorForRange_IMetInst = get_showFindIndicatorForRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showFindIndicatorForRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		showFindIndicatorForRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend smartDeleteRangeForProposedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartDeleteRangeForProposedRange_IMetInst(){
		return ((smartDeleteRangeForProposedRange_IMetInst != null)
	? (smartDeleteRangeForProposedRange_IMetInst)
	: (smartDeleteRangeForProposedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartDeleteRangeForProposedRange:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange smartDeleteRangeForProposedRange(final com.apple.jobjc.foundation.NSRange proposedCharRange){
			final com.apple.jobjc.Invoke.MsgSend smartDeleteRangeForProposedRange_IMetInst = get_smartDeleteRangeForProposedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartDeleteRangeForProposedRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, proposedCharRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		smartDeleteRangeForProposedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend smartInsertAfterStringForString_replacingRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartInsertAfterStringForString_replacingRange_IMetInst(){
		return ((smartInsertAfterStringForString_replacingRange_IMetInst != null)
	? (smartInsertAfterStringForString_replacingRange_IMetInst)
	: (smartInsertAfterStringForString_replacingRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartInsertAfterStringForString:replacingRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString smartInsertAfterStringForString_replacingRange(final com.apple.jobjc.foundation.NSString pasteString, final com.apple.jobjc.foundation.NSRange charRangeToReplace){
			final com.apple.jobjc.Invoke.MsgSend smartInsertAfterStringForString_replacingRange_IMetInst = get_smartInsertAfterStringForString_replacingRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartInsertAfterStringForString_replacingRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRangeToReplace);
		smartInsertAfterStringForString_replacingRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend smartInsertBeforeStringForString_replacingRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartInsertBeforeStringForString_replacingRange_IMetInst(){
		return ((smartInsertBeforeStringForString_replacingRange_IMetInst != null)
	? (smartInsertBeforeStringForString_replacingRange_IMetInst)
	: (smartInsertBeforeStringForString_replacingRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartInsertBeforeStringForString:replacingRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSString smartInsertBeforeStringForString_replacingRange(final com.apple.jobjc.foundation.NSString pasteString, final com.apple.jobjc.foundation.NSRange charRangeToReplace){
			final com.apple.jobjc.Invoke.MsgSend smartInsertBeforeStringForString_replacingRange_IMetInst = get_smartInsertBeforeStringForString_replacingRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartInsertBeforeStringForString_replacingRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRangeToReplace);
		smartInsertBeforeStringForString_replacingRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend smartInsertDeleteEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartInsertDeleteEnabled_IMetInst(){
		return ((smartInsertDeleteEnabled_IMetInst != null)
	? (smartInsertDeleteEnabled_IMetInst)
	: (smartInsertDeleteEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartInsertDeleteEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean smartInsertDeleteEnabled(){
			final com.apple.jobjc.Invoke.MsgSend smartInsertDeleteEnabled_IMetInst = get_smartInsertDeleteEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartInsertDeleteEnabled_IMetInst.init(nativeBuffer, this);
		smartInsertDeleteEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend smartInsertForString_replacingRange_beforeString_afterString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smartInsertForString_replacingRange_beforeString_afterString_IMetInst(){
		return ((smartInsertForString_replacingRange_beforeString_afterString_IMetInst != null)
	? (smartInsertForString_replacingRange_beforeString_afterString_IMetInst)
	: (smartInsertForString_replacingRange_beforeString_afterString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smartInsertForString:replacingRange:beforeString:afterString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void smartInsertForString_replacingRange_beforeString_afterString(final com.apple.jobjc.foundation.NSString pasteString, final com.apple.jobjc.foundation.NSRange charRangeToReplace, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> beforeString, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> afterString){
			final com.apple.jobjc.Invoke.MsgSend smartInsertForString_replacingRange_beforeString_afterString_IMetInst = get_smartInsertForString_replacingRange_beforeString_afterString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smartInsertForString_replacingRange_beforeString_afterString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRangeToReplace);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, beforeString);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, afterString);
		smartInsertForString_replacingRange_beforeString_afterString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellCheckerDocumentTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellCheckerDocumentTag_IMetInst(){
		return ((spellCheckerDocumentTag_IMetInst != null)
	? (spellCheckerDocumentTag_IMetInst)
	: (spellCheckerDocumentTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellCheckerDocumentTag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long spellCheckerDocumentTag(){
			final com.apple.jobjc.Invoke.MsgSend spellCheckerDocumentTag_IMetInst = get_spellCheckerDocumentTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellCheckerDocumentTag_IMetInst.init(nativeBuffer, this);
		spellCheckerDocumentTag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSpeaking_IMetInst(){
		return ((startSpeaking_IMetInst != null)
	? (startSpeaking_IMetInst)
	: (startSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSpeaking:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void startSpeaking(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend startSpeaking_IMetInst = get_startSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSpeaking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		startSpeaking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopSpeaking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopSpeaking_IMetInst(){
		return ((stopSpeaking_IMetInst != null)
	? (stopSpeaking_IMetInst)
	: (stopSpeaking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopSpeaking:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void stopSpeaking(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend stopSpeaking_IMetInst = get_stopSpeaking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopSpeaking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		stopSpeaking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainer_IMetInst(){
		return ((textContainer_IMetInst != null)
	? (textContainer_IMetInst)
	: (textContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextContainer textContainer(){
			final com.apple.jobjc.Invoke.MsgSend textContainer_IMetInst = get_textContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainer_IMetInst.init(nativeBuffer, this);
		textContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextContainer returnValue = (com.apple.jobjc.appkit.NSTextContainer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerInset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerInset_IMetInst(){
		return ((textContainerInset_IMetInst != null)
	? (textContainerInset_IMetInst)
	: (textContainerInset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerInset", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize textContainerInset(){
			final com.apple.jobjc.Invoke.MsgSend textContainerInset_IMetInst = get_textContainerInset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerInset_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		textContainerInset_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textContainerOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textContainerOrigin_IMetInst(){
		return ((textContainerOrigin_IMetInst != null)
	? (textContainerOrigin_IMetInst)
	: (textContainerOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textContainerOrigin", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint textContainerOrigin(){
			final com.apple.jobjc.Invoke.MsgSend textContainerOrigin_IMetInst = get_textContainerOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textContainerOrigin_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		textContainerOrigin_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend tightenKerning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tightenKerning_IMetInst(){
		return ((tightenKerning_IMetInst != null)
	? (tightenKerning_IMetInst)
	: (tightenKerning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tightenKerning:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void tightenKerning(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend tightenKerning_IMetInst = get_tightenKerning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tightenKerning_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		tightenKerning_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticDashSubstitution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticDashSubstitution_IMetInst(){
		return ((toggleAutomaticDashSubstitution_IMetInst != null)
	? (toggleAutomaticDashSubstitution_IMetInst)
	: (toggleAutomaticDashSubstitution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticDashSubstitution:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticDashSubstitution(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticDashSubstitution_IMetInst = get_toggleAutomaticDashSubstitution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticDashSubstitution_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticDashSubstitution_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticDataDetection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticDataDetection_IMetInst(){
		return ((toggleAutomaticDataDetection_IMetInst != null)
	? (toggleAutomaticDataDetection_IMetInst)
	: (toggleAutomaticDataDetection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticDataDetection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticDataDetection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticDataDetection_IMetInst = get_toggleAutomaticDataDetection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticDataDetection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticDataDetection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticLinkDetection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticLinkDetection_IMetInst(){
		return ((toggleAutomaticLinkDetection_IMetInst != null)
	? (toggleAutomaticLinkDetection_IMetInst)
	: (toggleAutomaticLinkDetection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticLinkDetection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticLinkDetection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticLinkDetection_IMetInst = get_toggleAutomaticLinkDetection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticLinkDetection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticLinkDetection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticQuoteSubstitution_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticQuoteSubstitution_IMetInst(){
		return ((toggleAutomaticQuoteSubstitution_IMetInst != null)
	? (toggleAutomaticQuoteSubstitution_IMetInst)
	: (toggleAutomaticQuoteSubstitution_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticQuoteSubstitution:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticQuoteSubstitution(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticQuoteSubstitution_IMetInst = get_toggleAutomaticQuoteSubstitution_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticQuoteSubstitution_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticQuoteSubstitution_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticSpellingCorrection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticSpellingCorrection_IMetInst(){
		return ((toggleAutomaticSpellingCorrection_IMetInst != null)
	? (toggleAutomaticSpellingCorrection_IMetInst)
	: (toggleAutomaticSpellingCorrection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticSpellingCorrection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticSpellingCorrection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticSpellingCorrection_IMetInst = get_toggleAutomaticSpellingCorrection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticSpellingCorrection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticSpellingCorrection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleAutomaticTextReplacement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleAutomaticTextReplacement_IMetInst(){
		return ((toggleAutomaticTextReplacement_IMetInst != null)
	? (toggleAutomaticTextReplacement_IMetInst)
	: (toggleAutomaticTextReplacement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleAutomaticTextReplacement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleAutomaticTextReplacement(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleAutomaticTextReplacement_IMetInst = get_toggleAutomaticTextReplacement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleAutomaticTextReplacement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleAutomaticTextReplacement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleBaseWritingDirection_IMetInst(){
		return ((toggleBaseWritingDirection_IMetInst != null)
	? (toggleBaseWritingDirection_IMetInst)
	: (toggleBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleBaseWritingDirection(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleBaseWritingDirection_IMetInst = get_toggleBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleContinuousSpellChecking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleContinuousSpellChecking_IMetInst(){
		return ((toggleContinuousSpellChecking_IMetInst != null)
	? (toggleContinuousSpellChecking_IMetInst)
	: (toggleContinuousSpellChecking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleContinuousSpellChecking:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleContinuousSpellChecking(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleContinuousSpellChecking_IMetInst = get_toggleContinuousSpellChecking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleContinuousSpellChecking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleContinuousSpellChecking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleGrammarChecking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleGrammarChecking_IMetInst(){
		return ((toggleGrammarChecking_IMetInst != null)
	? (toggleGrammarChecking_IMetInst)
	: (toggleGrammarChecking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleGrammarChecking:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleGrammarChecking(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleGrammarChecking_IMetInst = get_toggleGrammarChecking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleGrammarChecking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleGrammarChecking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleQuickLookPreviewPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleQuickLookPreviewPanel_IMetInst(){
		return ((toggleQuickLookPreviewPanel_IMetInst != null)
	? (toggleQuickLookPreviewPanel_IMetInst)
	: (toggleQuickLookPreviewPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleQuickLookPreviewPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleQuickLookPreviewPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleQuickLookPreviewPanel_IMetInst = get_toggleQuickLookPreviewPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleQuickLookPreviewPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleQuickLookPreviewPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleSmartInsertDelete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleSmartInsertDelete_IMetInst(){
		return ((toggleSmartInsertDelete_IMetInst != null)
	? (toggleSmartInsertDelete_IMetInst)
	: (toggleSmartInsertDelete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleSmartInsertDelete:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleSmartInsertDelete(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleSmartInsertDelete_IMetInst = get_toggleSmartInsertDelete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleSmartInsertDelete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleSmartInsertDelete_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleTraditionalCharacterShape_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleTraditionalCharacterShape_IMetInst(){
		return ((toggleTraditionalCharacterShape_IMetInst != null)
	? (toggleTraditionalCharacterShape_IMetInst)
	: (toggleTraditionalCharacterShape_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleTraditionalCharacterShape:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleTraditionalCharacterShape(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleTraditionalCharacterShape_IMetInst = get_toggleTraditionalCharacterShape_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleTraditionalCharacterShape_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleTraditionalCharacterShape_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend turnOffKerning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_turnOffKerning_IMetInst(){
		return ((turnOffKerning_IMetInst != null)
	? (turnOffKerning_IMetInst)
	: (turnOffKerning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "turnOffKerning:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void turnOffKerning(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend turnOffKerning_IMetInst = get_turnOffKerning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		turnOffKerning_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		turnOffKerning_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend turnOffLigatures_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_turnOffLigatures_IMetInst(){
		return ((turnOffLigatures_IMetInst != null)
	? (turnOffLigatures_IMetInst)
	: (turnOffLigatures_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "turnOffLigatures:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void turnOffLigatures(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend turnOffLigatures_IMetInst = get_turnOffLigatures_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		turnOffLigatures_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		turnOffLigatures_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend typingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typingAttributes_IMetInst(){
		return ((typingAttributes_IMetInst != null)
	? (typingAttributes_IMetInst)
	: (typingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typingAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary typingAttributes(){
			final com.apple.jobjc.Invoke.MsgSend typingAttributes_IMetInst = get_typingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typingAttributes_IMetInst.init(nativeBuffer, this);
		typingAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend updateDragTypeRegistration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateDragTypeRegistration_IMetInst(){
		return ((updateDragTypeRegistration_IMetInst != null)
	? (updateDragTypeRegistration_IMetInst)
	: (updateDragTypeRegistration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateDragTypeRegistration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateDragTypeRegistration(){
			final com.apple.jobjc.Invoke.MsgSend updateDragTypeRegistration_IMetInst = get_updateDragTypeRegistration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateDragTypeRegistration_IMetInst.init(nativeBuffer, this);
		updateDragTypeRegistration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateFontPanel_IMetInst(){
		return ((updateFontPanel_IMetInst != null)
	? (updateFontPanel_IMetInst)
	: (updateFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateFontPanel", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateFontPanel(){
			final com.apple.jobjc.Invoke.MsgSend updateFontPanel_IMetInst = get_updateFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateFontPanel_IMetInst.init(nativeBuffer, this);
		updateFontPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateInsertionPointStateAndRestartTimer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateInsertionPointStateAndRestartTimer_IMetInst(){
		return ((updateInsertionPointStateAndRestartTimer_IMetInst != null)
	? (updateInsertionPointStateAndRestartTimer_IMetInst)
	: (updateInsertionPointStateAndRestartTimer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateInsertionPointStateAndRestartTimer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void updateInsertionPointStateAndRestartTimer(final boolean restartFlag){
			final com.apple.jobjc.Invoke.MsgSend updateInsertionPointStateAndRestartTimer_IMetInst = get_updateInsertionPointStateAndRestartTimer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateInsertionPointStateAndRestartTimer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, restartFlag);
		updateInsertionPointStateAndRestartTimer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateQuickLookPreviewPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateQuickLookPreviewPanel_IMetInst(){
		return ((updateQuickLookPreviewPanel_IMetInst != null)
	? (updateQuickLookPreviewPanel_IMetInst)
	: (updateQuickLookPreviewPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateQuickLookPreviewPanel", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateQuickLookPreviewPanel(){
			final com.apple.jobjc.Invoke.MsgSend updateQuickLookPreviewPanel_IMetInst = get_updateQuickLookPreviewPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateQuickLookPreviewPanel_IMetInst.init(nativeBuffer, this);
		updateQuickLookPreviewPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateRuler_IMetInst(){
		return ((updateRuler_IMetInst != null)
	? (updateRuler_IMetInst)
	: (updateRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateRuler", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateRuler(){
			final com.apple.jobjc.Invoke.MsgSend updateRuler_IMetInst = get_updateRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateRuler_IMetInst.init(nativeBuffer, this);
		updateRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend useAllLigatures_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useAllLigatures_IMetInst(){
		return ((useAllLigatures_IMetInst != null)
	? (useAllLigatures_IMetInst)
	: (useAllLigatures_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useAllLigatures:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void useAllLigatures(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend useAllLigatures_IMetInst = get_useAllLigatures_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useAllLigatures_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		useAllLigatures_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend useStandardKerning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useStandardKerning_IMetInst(){
		return ((useStandardKerning_IMetInst != null)
	? (useStandardKerning_IMetInst)
	: (useStandardKerning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useStandardKerning:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void useStandardKerning(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend useStandardKerning_IMetInst = get_useStandardKerning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useStandardKerning_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		useStandardKerning_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend useStandardLigatures_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useStandardLigatures_IMetInst(){
		return ((useStandardLigatures_IMetInst != null)
	? (useStandardLigatures_IMetInst)
	: (useStandardLigatures_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useStandardLigatures:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void useStandardLigatures(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend useStandardLigatures_IMetInst = get_useStandardLigatures_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useStandardLigatures_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		useStandardLigatures_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFindBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFindBar_IMetInst(){
		return ((usesFindBar_IMetInst != null)
	? (usesFindBar_IMetInst)
	: (usesFindBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFindBar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFindBar(){
			final com.apple.jobjc.Invoke.MsgSend usesFindBar_IMetInst = get_usesFindBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFindBar_IMetInst.init(nativeBuffer, this);
		usesFindBar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFindPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFindPanel_IMetInst(){
		return ((usesFindPanel_IMetInst != null)
	? (usesFindPanel_IMetInst)
	: (usesFindPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFindPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFindPanel(){
			final com.apple.jobjc.Invoke.MsgSend usesFindPanel_IMetInst = get_usesFindPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFindPanel_IMetInst.init(nativeBuffer, this);
		usesFindPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFontPanel_IMetInst(){
		return ((usesFontPanel_IMetInst != null)
	? (usesFontPanel_IMetInst)
	: (usesFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFontPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFontPanel(){
			final com.apple.jobjc.Invoke.MsgSend usesFontPanel_IMetInst = get_usesFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFontPanel_IMetInst.init(nativeBuffer, this);
		usesFontPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesInspectorBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesInspectorBar_IMetInst(){
		return ((usesInspectorBar_IMetInst != null)
	? (usesInspectorBar_IMetInst)
	: (usesInspectorBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesInspectorBar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesInspectorBar(){
			final com.apple.jobjc.Invoke.MsgSend usesInspectorBar_IMetInst = get_usesInspectorBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesInspectorBar_IMetInst.init(nativeBuffer, this);
		usesInspectorBar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesRuler_IMetInst(){
		return ((usesRuler_IMetInst != null)
	? (usesRuler_IMetInst)
	: (usesRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesRuler", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesRuler(){
			final com.apple.jobjc.Invoke.MsgSend usesRuler_IMetInst = get_usesRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesRuler_IMetInst.init(nativeBuffer, this);
		usesRuler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validRequestorForSendType_returnType_IMetInst(){
		return ((validRequestorForSendType_returnType_IMetInst != null)
	? (validRequestorForSendType_returnType_IMetInst)
	: (validRequestorForSendType_returnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validRequestorForSendType:returnType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T validRequestorForSendType_returnType(final com.apple.jobjc.foundation.NSString sendType, final com.apple.jobjc.foundation.NSString returnType){
			final com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst = get_validRequestorForSendType_returnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validRequestorForSendType_returnType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, returnType);
		validRequestorForSendType_returnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writablePasteboardTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writablePasteboardTypes_IMetInst(){
		return ((writablePasteboardTypes_IMetInst != null)
	? (writablePasteboardTypes_IMetInst)
	: (writablePasteboardTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writablePasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray writablePasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend writablePasteboardTypes_IMetInst = get_writablePasteboardTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writablePasteboardTypes_IMetInst.init(nativeBuffer, this);
		writablePasteboardTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeSelectionToPasteboard_type_IMetInst(){
		return ((writeSelectionToPasteboard_type_IMetInst != null)
	? (writeSelectionToPasteboard_type_IMetInst)
	: (writeSelectionToPasteboard_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeSelectionToPasteboard:type:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeSelectionToPasteboard_type(final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_type_IMetInst = get_writeSelectionToPasteboard_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeSelectionToPasteboard_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		writeSelectionToPasteboard_type_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_types_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeSelectionToPasteboard_types_IMetInst(){
		return ((writeSelectionToPasteboard_types_IMetInst != null)
	? (writeSelectionToPasteboard_types_IMetInst)
	: (writeSelectionToPasteboard_types_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeSelectionToPasteboard:types:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeSelectionToPasteboard_types(final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend writeSelectionToPasteboard_types_IMetInst = get_writeSelectionToPasteboard_types_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeSelectionToPasteboard_types_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		writeSelectionToPasteboard_types_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
