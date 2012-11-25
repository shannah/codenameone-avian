package com.apple.jobjc.appkit;

public  class NSTableRowView extends com.apple.jobjc.appkit.NSView {
	public NSTableRowView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableRowView(final NSTableRowView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend draggingDestinationFeedbackStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingDestinationFeedbackStyle_IMetInst(){
		return ((draggingDestinationFeedbackStyle_IMetInst != null)
	? (draggingDestinationFeedbackStyle_IMetInst)
	: (draggingDestinationFeedbackStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingDestinationFeedbackStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingDestinationFeedbackStyle(){
			final com.apple.jobjc.Invoke.MsgSend draggingDestinationFeedbackStyle_IMetInst = get_draggingDestinationFeedbackStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingDestinationFeedbackStyle_IMetInst.init(nativeBuffer, this);
		draggingDestinationFeedbackStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBackgroundInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBackgroundInRect_IMetInst(){
		return ((drawBackgroundInRect_IMetInst != null)
	? (drawBackgroundInRect_IMetInst)
	: (drawBackgroundInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBackgroundInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawBackgroundInRect(final com.apple.jobjc.foundation.NSRect dirtyRect){
			final com.apple.jobjc.Invoke.MsgSend drawBackgroundInRect_IMetInst = get_drawBackgroundInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBackgroundInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dirtyRect);
		drawBackgroundInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawDraggingDestinationFeedbackInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawDraggingDestinationFeedbackInRect_IMetInst(){
		return ((drawDraggingDestinationFeedbackInRect_IMetInst != null)
	? (drawDraggingDestinationFeedbackInRect_IMetInst)
	: (drawDraggingDestinationFeedbackInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawDraggingDestinationFeedbackInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawDraggingDestinationFeedbackInRect(final com.apple.jobjc.foundation.NSRect dirtyRect){
			final com.apple.jobjc.Invoke.MsgSend drawDraggingDestinationFeedbackInRect_IMetInst = get_drawDraggingDestinationFeedbackInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawDraggingDestinationFeedbackInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dirtyRect);
		drawDraggingDestinationFeedbackInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSelectionInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSelectionInRect_IMetInst(){
		return ((drawSelectionInRect_IMetInst != null)
	? (drawSelectionInRect_IMetInst)
	: (drawSelectionInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSelectionInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawSelectionInRect(final com.apple.jobjc.foundation.NSRect dirtyRect){
			final com.apple.jobjc.Invoke.MsgSend drawSelectionInRect_IMetInst = get_drawSelectionInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSelectionInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dirtyRect);
		drawSelectionInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSeparatorInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSeparatorInRect_IMetInst(){
		return ((drawSeparatorInRect_IMetInst != null)
	? (drawSeparatorInRect_IMetInst)
	: (drawSeparatorInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSeparatorInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawSeparatorInRect(final com.apple.jobjc.foundation.NSRect dirtyRect){
			final com.apple.jobjc.Invoke.MsgSend drawSeparatorInRect_IMetInst = get_drawSeparatorInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSeparatorInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dirtyRect);
		drawSeparatorInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indentationForDropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indentationForDropOperation_IMetInst(){
		return ((indentationForDropOperation_IMetInst != null)
	? (indentationForDropOperation_IMetInst)
	: (indentationForDropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indentationForDropOperation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double indentationForDropOperation(){
			final com.apple.jobjc.Invoke.MsgSend indentationForDropOperation_IMetInst = get_indentationForDropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indentationForDropOperation_IMetInst.init(nativeBuffer, this);
		indentationForDropOperation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend interiorBackgroundStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interiorBackgroundStyle_IMetInst(){
		return ((interiorBackgroundStyle_IMetInst != null)
	? (interiorBackgroundStyle_IMetInst)
	: (interiorBackgroundStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interiorBackgroundStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long interiorBackgroundStyle(){
			final com.apple.jobjc.Invoke.MsgSend interiorBackgroundStyle_IMetInst = get_interiorBackgroundStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interiorBackgroundStyle_IMetInst.init(nativeBuffer, this);
		interiorBackgroundStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEmphasized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEmphasized_IMetInst(){
		return ((isEmphasized_IMetInst != null)
	? (isEmphasized_IMetInst)
	: (isEmphasized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEmphasized", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEmphasized(){
			final com.apple.jobjc.Invoke.MsgSend isEmphasized_IMetInst = get_isEmphasized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEmphasized_IMetInst.init(nativeBuffer, this);
		isEmphasized_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFloating_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFloating_IMetInst(){
		return ((isFloating_IMetInst != null)
	? (isFloating_IMetInst)
	: (isFloating_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFloating", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFloating(){
			final com.apple.jobjc.Invoke.MsgSend isFloating_IMetInst = get_isFloating_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFloating_IMetInst.init(nativeBuffer, this);
		isFloating_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isGroupRowStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isGroupRowStyle_IMetInst(){
		return ((isGroupRowStyle_IMetInst != null)
	? (isGroupRowStyle_IMetInst)
	: (isGroupRowStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isGroupRowStyle", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isGroupRowStyle(){
			final com.apple.jobjc.Invoke.MsgSend isGroupRowStyle_IMetInst = get_isGroupRowStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isGroupRowStyle_IMetInst.init(nativeBuffer, this);
		isGroupRowStyle_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelected_IMetInst(){
		return ((isSelected_IMetInst != null)
	? (isSelected_IMetInst)
	: (isSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelected", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelected(){
			final com.apple.jobjc.Invoke.MsgSend isSelected_IMetInst = get_isSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelected_IMetInst.init(nativeBuffer, this);
		isSelected_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTargetForDropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTargetForDropOperation_IMetInst(){
		return ((isTargetForDropOperation_IMetInst != null)
	? (isTargetForDropOperation_IMetInst)
	: (isTargetForDropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTargetForDropOperation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTargetForDropOperation(){
			final com.apple.jobjc.Invoke.MsgSend isTargetForDropOperation_IMetInst = get_isTargetForDropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTargetForDropOperation_IMetInst.init(nativeBuffer, this);
		isTargetForDropOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfColumns_IMetInst(){
		return ((numberOfColumns_IMetInst != null)
	? (numberOfColumns_IMetInst)
	: (numberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfColumns", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfColumns(){
			final com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst = get_numberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfColumns_IMetInst.init(nativeBuffer, this);
		numberOfColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionHighlightStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionHighlightStyle_IMetInst(){
		return ((selectionHighlightStyle_IMetInst != null)
	? (selectionHighlightStyle_IMetInst)
	: (selectionHighlightStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionHighlightStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectionHighlightStyle(){
			final com.apple.jobjc.Invoke.MsgSend selectionHighlightStyle_IMetInst = get_selectionHighlightStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionHighlightStyle_IMetInst.init(nativeBuffer, this);
		selectionHighlightStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor backgroundColor){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, backgroundColor);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingDestinationFeedbackStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingDestinationFeedbackStyle_IMetInst(){
		return ((setDraggingDestinationFeedbackStyle_IMetInst != null)
	? (setDraggingDestinationFeedbackStyle_IMetInst)
	: (setDraggingDestinationFeedbackStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingDestinationFeedbackStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDraggingDestinationFeedbackStyle(final long draggingDestinationFeedbackStyle){
			final com.apple.jobjc.Invoke.MsgSend setDraggingDestinationFeedbackStyle_IMetInst = get_setDraggingDestinationFeedbackStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingDestinationFeedbackStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, draggingDestinationFeedbackStyle);
		setDraggingDestinationFeedbackStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEmphasized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEmphasized_IMetInst(){
		return ((setEmphasized_IMetInst != null)
	? (setEmphasized_IMetInst)
	: (setEmphasized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEmphasized:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEmphasized(final boolean emphasized){
			final com.apple.jobjc.Invoke.MsgSend setEmphasized_IMetInst = get_setEmphasized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEmphasized_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, emphasized);
		setEmphasized_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloating_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloating_IMetInst(){
		return ((setFloating_IMetInst != null)
	? (setFloating_IMetInst)
	: (setFloating_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloating:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFloating(final boolean floating){
			final com.apple.jobjc.Invoke.MsgSend setFloating_IMetInst = get_setFloating_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloating_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, floating);
		setFloating_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGroupRowStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGroupRowStyle_IMetInst(){
		return ((setGroupRowStyle_IMetInst != null)
	? (setGroupRowStyle_IMetInst)
	: (setGroupRowStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGroupRowStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setGroupRowStyle(final boolean groupRowStyle){
			final com.apple.jobjc.Invoke.MsgSend setGroupRowStyle_IMetInst = get_setGroupRowStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGroupRowStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, groupRowStyle);
		setGroupRowStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndentationForDropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndentationForDropOperation_IMetInst(){
		return ((setIndentationForDropOperation_IMetInst != null)
	? (setIndentationForDropOperation_IMetInst)
	: (setIndentationForDropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndentationForDropOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setIndentationForDropOperation(final double indentationForDropOperation){
			final com.apple.jobjc.Invoke.MsgSend setIndentationForDropOperation_IMetInst = get_setIndentationForDropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndentationForDropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, indentationForDropOperation);
		setIndentationForDropOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelected_IMetInst(){
		return ((setSelected_IMetInst != null)
	? (setSelected_IMetInst)
	: (setSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelected:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelected(final boolean selected){
			final com.apple.jobjc.Invoke.MsgSend setSelected_IMetInst = get_setSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelected_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, selected);
		setSelected_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionHighlightStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionHighlightStyle_IMetInst(){
		return ((setSelectionHighlightStyle_IMetInst != null)
	? (setSelectionHighlightStyle_IMetInst)
	: (setSelectionHighlightStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionHighlightStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSelectionHighlightStyle(final long selectionHighlightStyle){
			final com.apple.jobjc.Invoke.MsgSend setSelectionHighlightStyle_IMetInst = get_setSelectionHighlightStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionHighlightStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selectionHighlightStyle);
		setSelectionHighlightStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTargetForDropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTargetForDropOperation_IMetInst(){
		return ((setTargetForDropOperation_IMetInst != null)
	? (setTargetForDropOperation_IMetInst)
	: (setTargetForDropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTargetForDropOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTargetForDropOperation(final boolean targetForDropOperation){
			final com.apple.jobjc.Invoke.MsgSend setTargetForDropOperation_IMetInst = get_setTargetForDropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTargetForDropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, targetForDropOperation);
		setTargetForDropOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewAtColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewAtColumn_IMetInst(){
		return ((viewAtColumn_IMetInst != null)
	? (viewAtColumn_IMetInst)
	: (viewAtColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewAtColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T viewAtColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend viewAtColumn_IMetInst = get_viewAtColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewAtColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		viewAtColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
