package com.apple.jobjc.appkit;

public  class NSControl extends com.apple.jobjc.appkit.NSView {
	public NSControl(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSControl(final NSControl obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend abortEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abortEditing_IMetInst(){
		return ((abortEditing_IMetInst != null)
	? (abortEditing_IMetInst)
	: (abortEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abortEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean abortEditing(){
			final com.apple.jobjc.Invoke.MsgSend abortEditing_IMetInst = get_abortEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abortEditing_IMetInst.init(nativeBuffer, this);
		abortEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend action_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_action_IMetInst(){
		return ((action_IMetInst != null)
	? (action_IMetInst)
	: (action_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "action", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL action(){
			final com.apple.jobjc.Invoke.MsgSend action_IMetInst = get_action_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		action_IMetInst.init(nativeBuffer, this);
		action_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignment_IMetInst(){
		return ((alignment_IMetInst != null)
	? (alignment_IMetInst)
	: (alignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long alignment(){
			final com.apple.jobjc.Invoke.MsgSend alignment_IMetInst = get_alignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignment_IMetInst.init(nativeBuffer, this);
		alignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsExpansionToolTips_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsExpansionToolTips_IMetInst(){
		return ((allowsExpansionToolTips_IMetInst != null)
	? (allowsExpansionToolTips_IMetInst)
	: (allowsExpansionToolTips_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsExpansionToolTips", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsExpansionToolTips(){
			final com.apple.jobjc.Invoke.MsgSend allowsExpansionToolTips_IMetInst = get_allowsExpansionToolTips_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsExpansionToolTips_IMetInst.init(nativeBuffer, this);
		allowsExpansionToolTips_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedStringValue_IMetInst(){
		return ((attributedStringValue_IMetInst != null)
	? (attributedStringValue_IMetInst)
	: (attributedStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedStringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedStringValue(){
			final com.apple.jobjc.Invoke.MsgSend attributedStringValue_IMetInst = get_attributedStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedStringValue_IMetInst.init(nativeBuffer, this);
		attributedStringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend baseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baseWritingDirection_IMetInst(){
		return ((baseWritingDirection_IMetInst != null)
	? (baseWritingDirection_IMetInst)
	: (baseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baseWritingDirection", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long baseWritingDirection(){
			final com.apple.jobjc.Invoke.MsgSend baseWritingDirection_IMetInst = get_baseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baseWritingDirection_IMetInst.init(nativeBuffer, this);
		baseWritingDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend calcSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calcSize_IMetInst(){
		return ((calcSize_IMetInst != null)
	? (calcSize_IMetInst)
	: (calcSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calcSize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void calcSize(){
			final com.apple.jobjc.Invoke.MsgSend calcSize_IMetInst = get_calcSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calcSize_IMetInst.init(nativeBuffer, this);
		calcSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cell_IMetInst(){
		return ((cell_IMetInst != null)
	? (cell_IMetInst)
	: (cell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T cell(){
			final com.apple.jobjc.Invoke.MsgSend cell_IMetInst = get_cell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cell_IMetInst.init(nativeBuffer, this);
		cell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentEditor_IMetInst(){
		return ((currentEditor_IMetInst != null)
	? (currentEditor_IMetInst)
	: (currentEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentEditor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSText currentEditor(){
			final com.apple.jobjc.Invoke.MsgSend currentEditor_IMetInst = get_currentEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentEditor_IMetInst.init(nativeBuffer, this);
		currentEditor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSText returnValue = (com.apple.jobjc.appkit.NSText) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleValue_IMetInst(){
		return ((doubleValue_IMetInst != null)
	? (doubleValue_IMetInst)
	: (doubleValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double doubleValue(){
			final com.apple.jobjc.Invoke.MsgSend doubleValue_IMetInst = get_doubleValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleValue_IMetInst.init(nativeBuffer, this);
		doubleValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawCell_IMetInst(){
		return ((drawCell_IMetInst != null)
	? (drawCell_IMetInst)
	: (drawCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawCell(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend drawCell_IMetInst = get_drawCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		drawCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawCellInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawCellInside_IMetInst(){
		return ((drawCellInside_IMetInst != null)
	? (drawCellInside_IMetInst)
	: (drawCellInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawCellInside:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawCellInside(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend drawCellInside_IMetInst = get_drawCellInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawCellInside_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		drawCellInside_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend floatValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_floatValue_IMetInst(){
		return ((floatValue_IMetInst != null)
	? (floatValue_IMetInst)
	: (floatValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "floatValue", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float floatValue(){
			final com.apple.jobjc.Invoke.MsgSend floatValue_IMetInst = get_floatValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		floatValue_IMetInst.init(nativeBuffer, this);
		floatValue_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend font_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_font_IMetInst(){
		return ((font_IMetInst != null)
	? (font_IMetInst)
	: (font_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "font", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont font(){
			final com.apple.jobjc.Invoke.MsgSend font_IMetInst = get_font_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		font_IMetInst.init(nativeBuffer, this);
		font_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend formatter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formatter_IMetInst(){
		return ((formatter_IMetInst != null)
	? (formatter_IMetInst)
	: (formatter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formatter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T formatter(){
			final com.apple.jobjc.Invoke.MsgSend formatter_IMetInst = get_formatter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formatter_IMetInst.init(nativeBuffer, this);
		formatter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoresMultiClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoresMultiClick_IMetInst(){
		return ((ignoresMultiClick_IMetInst != null)
	? (ignoresMultiClick_IMetInst)
	: (ignoresMultiClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoresMultiClick", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ignoresMultiClick(){
			final com.apple.jobjc.Invoke.MsgSend ignoresMultiClick_IMetInst = get_ignoresMultiClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoresMultiClick_IMetInst.init(nativeBuffer, this);
		ignoresMultiClick_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend intValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intValue_IMetInst(){
		return ((intValue_IMetInst != null)
	? (intValue_IMetInst)
	: (intValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intValue", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int intValue(){
			final com.apple.jobjc.Invoke.MsgSend intValue_IMetInst = get_intValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intValue_IMetInst.init(nativeBuffer, this);
		intValue_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend integerValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_integerValue_IMetInst(){
		return ((integerValue_IMetInst != null)
	? (integerValue_IMetInst)
	: (integerValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "integerValue", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long integerValue(){
			final com.apple.jobjc.Invoke.MsgSend integerValue_IMetInst = get_integerValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		integerValue_IMetInst.init(nativeBuffer, this);
		integerValue_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateIntrinsicContentSizeForCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateIntrinsicContentSizeForCell_IMetInst(){
		return ((invalidateIntrinsicContentSizeForCell_IMetInst != null)
	? (invalidateIntrinsicContentSizeForCell_IMetInst)
	: (invalidateIntrinsicContentSizeForCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateIntrinsicContentSizeForCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void invalidateIntrinsicContentSizeForCell(final com.apple.jobjc.appkit.NSCell cell){
			final com.apple.jobjc.Invoke.MsgSend invalidateIntrinsicContentSizeForCell_IMetInst = get_invalidateIntrinsicContentSizeForCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateIntrinsicContentSizeForCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		invalidateIntrinsicContentSizeForCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isContinuous_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isContinuous_IMetInst(){
		return ((isContinuous_IMetInst != null)
	? (isContinuous_IMetInst)
	: (isContinuous_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isContinuous", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isContinuous(){
			final com.apple.jobjc.Invoke.MsgSend isContinuous_IMetInst = get_isContinuous_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isContinuous_IMetInst.init(nativeBuffer, this);
		isContinuous_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnabled_IMetInst(){
		return ((isEnabled_IMetInst != null)
	? (isEnabled_IMetInst)
	: (isEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst = get_isEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnabled_IMetInst.init(nativeBuffer, this);
		isEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDown_IMetInst(){
		return ((mouseDown_IMetInst != null)
	? (mouseDown_IMetInst)
	: (mouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst = get_mouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectValue_IMetInst(){
		return ((objectValue_IMetInst != null)
	? (objectValue_IMetInst)
	: (objectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectValue(){
			final com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst = get_objectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectValue_IMetInst.init(nativeBuffer, this);
		objectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performClick_IMetInst(){
		return ((performClick_IMetInst != null)
	? (performClick_IMetInst)
	: (performClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performClick:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performClick(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performClick_IMetInst = get_performClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performClick_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performClick_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend refusesFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_refusesFirstResponder_IMetInst(){
		return ((refusesFirstResponder_IMetInst != null)
	? (refusesFirstResponder_IMetInst)
	: (refusesFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "refusesFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean refusesFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend refusesFirstResponder_IMetInst = get_refusesFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		refusesFirstResponder_IMetInst.init(nativeBuffer, this);
		refusesFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectCell_IMetInst(){
		return ((selectCell_IMetInst != null)
	? (selectCell_IMetInst)
	: (selectCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectCell(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend selectCell_IMetInst = get_selectCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		selectCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedCell_IMetInst(){
		return ((selectedCell_IMetInst != null)
	? (selectedCell_IMetInst)
	: (selectedCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T selectedCell(){
			final com.apple.jobjc.Invoke.MsgSend selectedCell_IMetInst = get_selectedCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedCell_IMetInst.init(nativeBuffer, this);
		selectedCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedTag_IMetInst(){
		return ((selectedTag_IMetInst != null)
	? (selectedTag_IMetInst)
	: (selectedTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedTag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedTag(){
			final com.apple.jobjc.Invoke.MsgSend selectedTag_IMetInst = get_selectedTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedTag_IMetInst.init(nativeBuffer, this);
		selectedTag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendAction_to_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAction_to_IMetInst(){
		return ((sendAction_to_IMetInst != null)
	? (sendAction_to_IMetInst)
	: (sendAction_to_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAction:to:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean sendAction_to(final com.apple.jobjc.SEL theAction, final com.apple.jobjc.ID theTarget){
			final com.apple.jobjc.Invoke.MsgSend sendAction_to_IMetInst = get_sendAction_to_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAction_to_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, theAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theTarget);
		sendAction_to_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendActionOn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendActionOn_IMetInst(){
		return ((sendActionOn_IMetInst != null)
	? (sendActionOn_IMetInst)
	: (sendActionOn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendActionOn:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long sendActionOn(final long mask){
			final com.apple.jobjc.Invoke.MsgSend sendActionOn_IMetInst = get_sendActionOn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendActionOn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mask);
		sendActionOn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAction_IMetInst(){
		return ((setAction_IMetInst != null)
	? (setAction_IMetInst)
	: (setAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setAction(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend setAction_IMetInst = get_setAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		setAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlignment_IMetInst(){
		return ((setAlignment_IMetInst != null)
	? (setAlignment_IMetInst)
	: (setAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAlignment(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst = get_setAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsExpansionToolTips_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsExpansionToolTips_IMetInst(){
		return ((setAllowsExpansionToolTips_IMetInst != null)
	? (setAllowsExpansionToolTips_IMetInst)
	: (setAllowsExpansionToolTips_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsExpansionToolTips:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsExpansionToolTips(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend setAllowsExpansionToolTips_IMetInst = get_setAllowsExpansionToolTips_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsExpansionToolTips_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		setAllowsExpansionToolTips_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedStringValue_IMetInst(){
		return ((setAttributedStringValue_IMetInst != null)
	? (setAttributedStringValue_IMetInst)
	: (setAttributedStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedStringValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedStringValue(final com.apple.jobjc.foundation.NSAttributedString obj){
			final com.apple.jobjc.Invoke.MsgSend setAttributedStringValue_IMetInst = get_setAttributedStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setAttributedStringValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBaseWritingDirection_IMetInst(){
		return ((setBaseWritingDirection_IMetInst != null)
	? (setBaseWritingDirection_IMetInst)
	: (setBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBaseWritingDirection(final long writingDirection){
			final com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_IMetInst = get_setBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		setBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCell_IMetInst(){
		return ((setCell_IMetInst != null)
	? (setCell_IMetInst)
	: (setCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCell(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend setCell_IMetInst = get_setCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		setCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContinuous_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContinuous_IMetInst(){
		return ((setContinuous_IMetInst != null)
	? (setContinuous_IMetInst)
	: (setContinuous_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContinuous:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContinuous(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setContinuous_IMetInst = get_setContinuous_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContinuous_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setContinuous_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDoubleValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoubleValue_IMetInst(){
		return ((setDoubleValue_IMetInst != null)
	? (setDoubleValue_IMetInst)
	: (setDoubleValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoubleValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setDoubleValue(final double aDouble){
			final com.apple.jobjc.Invoke.MsgSend setDoubleValue_IMetInst = get_setDoubleValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoubleValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, aDouble);
		setDoubleValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabled_IMetInst(){
		return ((setEnabled_IMetInst != null)
	? (setEnabled_IMetInst)
	: (setEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst = get_setEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloatValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloatValue_IMetInst(){
		return ((setFloatValue_IMetInst != null)
	? (setFloatValue_IMetInst)
	: (setFloatValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloatValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setFloatValue(final float aFloat){
			final com.apple.jobjc.Invoke.MsgSend setFloatValue_IMetInst = get_setFloatValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloatValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, aFloat);
		setFloatValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloatingPointFormat_left_right_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloatingPointFormat_left_right_IMetInst(){
		return ((setFloatingPointFormat_left_right_IMetInst != null)
	? (setFloatingPointFormat_left_right_IMetInst)
	: (setFloatingPointFormat_left_right_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloatingPointFormat:left:right:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFloatingPointFormat_left_right(final boolean autoRange, final long leftDigits, final long rightDigits){
			final com.apple.jobjc.Invoke.MsgSend setFloatingPointFormat_left_right_IMetInst = get_setFloatingPointFormat_left_right_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloatingPointFormat_left_right_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, autoRange);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, leftDigits);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, rightDigits);
		setFloatingPointFormat_left_right_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFormatter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFormatter_IMetInst(){
		return ((setFormatter_IMetInst != null)
	? (setFormatter_IMetInst)
	: (setFormatter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFormatter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFormatter(final com.apple.jobjc.foundation.NSFormatter newFormatter){
			final com.apple.jobjc.Invoke.MsgSend setFormatter_IMetInst = get_setFormatter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFormatter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newFormatter);
		setFormatter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIgnoresMultiClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIgnoresMultiClick_IMetInst(){
		return ((setIgnoresMultiClick_IMetInst != null)
	? (setIgnoresMultiClick_IMetInst)
	: (setIgnoresMultiClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIgnoresMultiClick:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIgnoresMultiClick(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIgnoresMultiClick_IMetInst = get_setIgnoresMultiClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIgnoresMultiClick_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIgnoresMultiClick_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIntValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntValue_IMetInst(){
		return ((setIntValue_IMetInst != null)
	? (setIntValue_IMetInst)
	: (setIntValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setIntValue(final int anInt){
			final com.apple.jobjc.Invoke.MsgSend setIntValue_IMetInst = get_setIntValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, anInt);
		setIntValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIntegerValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntegerValue_IMetInst(){
		return ((setIntegerValue_IMetInst != null)
	? (setIntegerValue_IMetInst)
	: (setIntegerValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntegerValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setIntegerValue(final long anInteger){
			final com.apple.jobjc.Invoke.MsgSend setIntegerValue_IMetInst = get_setIntegerValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntegerValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInteger);
		setIntegerValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsDisplay_IMetInst(){
		return ((setNeedsDisplay_IMetInst != null)
	? (setNeedsDisplay_IMetInst)
	: (setNeedsDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsDisplay", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setNeedsDisplay(){
			final com.apple.jobjc.Invoke.MsgSend setNeedsDisplay_IMetInst = get_setNeedsDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsDisplay_IMetInst.init(nativeBuffer, this);
		setNeedsDisplay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectValue_IMetInst(){
		return ((setObjectValue_IMetInst != null)
	? (setObjectValue_IMetInst)
	: (setObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObjectValue(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst = get_setObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRefusesFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRefusesFirstResponder_IMetInst(){
		return ((setRefusesFirstResponder_IMetInst != null)
	? (setRefusesFirstResponder_IMetInst)
	: (setRefusesFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRefusesFirstResponder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRefusesFirstResponder(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRefusesFirstResponder_IMetInst = get_setRefusesFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRefusesFirstResponder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRefusesFirstResponder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStringValue_IMetInst(){
		return ((setStringValue_IMetInst != null)
	? (setStringValue_IMetInst)
	: (setStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStringValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStringValue(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setStringValue_IMetInst = get_setStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setStringValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTag_IMetInst(){
		return ((setTag_IMetInst != null)
	? (setTag_IMetInst)
	: (setTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTag(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend setTag_IMetInst = get_setTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		setTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeToFit_IMetInst(){
		return ((sizeToFit_IMetInst != null)
	? (sizeToFit_IMetInst)
	: (sizeToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeToFit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeToFit(){
			final com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst = get_sizeToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeToFit_IMetInst.init(nativeBuffer, this);
		sizeToFit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringValue_IMetInst(){
		return ((stringValue_IMetInst != null)
	? (stringValue_IMetInst)
	: (stringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringValue(){
			final com.apple.jobjc.Invoke.MsgSend stringValue_IMetInst = get_stringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringValue_IMetInst.init(nativeBuffer, this);
		stringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tag_IMetInst(){
		return ((tag_IMetInst != null)
	? (tag_IMetInst)
	: (tag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long tag(){
			final com.apple.jobjc.Invoke.MsgSend tag_IMetInst = get_tag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tag_IMetInst.init(nativeBuffer, this);
		tag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend takeDoubleValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeDoubleValueFrom_IMetInst(){
		return ((takeDoubleValueFrom_IMetInst != null)
	? (takeDoubleValueFrom_IMetInst)
	: (takeDoubleValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeDoubleValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeDoubleValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeDoubleValueFrom_IMetInst = get_takeDoubleValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeDoubleValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeDoubleValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeFloatValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeFloatValueFrom_IMetInst(){
		return ((takeFloatValueFrom_IMetInst != null)
	? (takeFloatValueFrom_IMetInst)
	: (takeFloatValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeFloatValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeFloatValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeFloatValueFrom_IMetInst = get_takeFloatValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeFloatValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeFloatValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeIntValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeIntValueFrom_IMetInst(){
		return ((takeIntValueFrom_IMetInst != null)
	? (takeIntValueFrom_IMetInst)
	: (takeIntValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeIntValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeIntValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeIntValueFrom_IMetInst = get_takeIntValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeIntValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeIntValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeIntegerValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeIntegerValueFrom_IMetInst(){
		return ((takeIntegerValueFrom_IMetInst != null)
	? (takeIntegerValueFrom_IMetInst)
	: (takeIntegerValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeIntegerValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeIntegerValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeIntegerValueFrom_IMetInst = get_takeIntegerValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeIntegerValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeIntegerValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeObjectValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeObjectValueFrom_IMetInst(){
		return ((takeObjectValueFrom_IMetInst != null)
	? (takeObjectValueFrom_IMetInst)
	: (takeObjectValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeObjectValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeObjectValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeObjectValueFrom_IMetInst = get_takeObjectValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeObjectValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeObjectValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeStringValueFrom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeStringValueFrom_IMetInst(){
		return ((takeStringValueFrom_IMetInst != null)
	? (takeStringValueFrom_IMetInst)
	: (takeStringValueFrom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeStringValueFrom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeStringValueFrom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend takeStringValueFrom_IMetInst = get_takeStringValueFrom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeStringValueFrom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		takeStringValueFrom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend target_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_target_IMetInst(){
		return ((target_IMetInst != null)
	? (target_IMetInst)
	: (target_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "target", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T target(){
			final com.apple.jobjc.Invoke.MsgSend target_IMetInst = get_target_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		target_IMetInst.init(nativeBuffer, this);
		target_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend updateCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateCell_IMetInst(){
		return ((updateCell_IMetInst != null)
	? (updateCell_IMetInst)
	: (updateCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateCell(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend updateCell_IMetInst = get_updateCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		updateCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateCellInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateCellInside_IMetInst(){
		return ((updateCellInside_IMetInst != null)
	? (updateCellInside_IMetInst)
	: (updateCellInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateCellInside:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateCellInside(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend updateCellInside_IMetInst = get_updateCellInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateCellInside_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		updateCellInside_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validateEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateEditing_IMetInst(){
		return ((validateEditing_IMetInst != null)
	? (validateEditing_IMetInst)
	: (validateEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void validateEditing(){
			final com.apple.jobjc.Invoke.MsgSend validateEditing_IMetInst = get_validateEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateEditing_IMetInst.init(nativeBuffer, this);
		validateEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

}
