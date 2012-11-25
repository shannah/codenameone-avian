package com.apple.jobjc.appkit;

public  class NSCell extends com.apple.jobjc.foundation.NSObject {
	public NSCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCell(final NSCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsFirstResponder_IMetInst(){
		return ((acceptsFirstResponder_IMetInst != null)
	? (acceptsFirstResponder_IMetInst)
	: (acceptsFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend acceptsFirstResponder_IMetInst = get_acceptsFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsFirstResponder_IMetInst.init(nativeBuffer, this);
		acceptsFirstResponder_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend allowsEditingTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsEditingTextAttributes_IMetInst(){
		return ((allowsEditingTextAttributes_IMetInst != null)
	? (allowsEditingTextAttributes_IMetInst)
	: (allowsEditingTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsEditingTextAttributes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsEditingTextAttributes(){
			final com.apple.jobjc.Invoke.MsgSend allowsEditingTextAttributes_IMetInst = get_allowsEditingTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsEditingTextAttributes_IMetInst.init(nativeBuffer, this);
		allowsEditingTextAttributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsMixedState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMixedState_IMetInst(){
		return ((allowsMixedState_IMetInst != null)
	? (allowsMixedState_IMetInst)
	: (allowsMixedState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMixedState", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMixedState(){
			final com.apple.jobjc.Invoke.MsgSend allowsMixedState_IMetInst = get_allowsMixedState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMixedState_IMetInst.init(nativeBuffer, this);
		allowsMixedState_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend backgroundStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundStyle_IMetInst(){
		return ((backgroundStyle_IMetInst != null)
	? (backgroundStyle_IMetInst)
	: (backgroundStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long backgroundStyle(){
			final com.apple.jobjc.Invoke.MsgSend backgroundStyle_IMetInst = get_backgroundStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundStyle_IMetInst.init(nativeBuffer, this);
		backgroundStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend calcDrawInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calcDrawInfo_IMetInst(){
		return ((calcDrawInfo_IMetInst != null)
	? (calcDrawInfo_IMetInst)
	: (calcDrawInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calcDrawInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void calcDrawInfo(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend calcDrawInfo_IMetInst = get_calcDrawInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calcDrawInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		calcDrawInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cellAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellAttribute_IMetInst(){
		return ((cellAttribute_IMetInst != null)
	? (cellAttribute_IMetInst)
	: (cellAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellAttribute:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long cellAttribute(final long aParameter){
			final com.apple.jobjc.Invoke.MsgSend cellAttribute_IMetInst = get_cellAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellAttribute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aParameter);
		cellAttribute_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellSize_IMetInst(){
		return ((cellSize_IMetInst != null)
	? (cellSize_IMetInst)
	: (cellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize cellSize(){
			final com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst = get_cellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		cellSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellSizeForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellSizeForBounds_IMetInst(){
		return ((cellSizeForBounds_IMetInst != null)
	? (cellSizeForBounds_IMetInst)
	: (cellSizeForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellSizeForBounds:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize cellSizeForBounds(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend cellSizeForBounds_IMetInst = get_cellSizeForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellSizeForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		cellSizeForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.ID otherCell){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherCell);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend continueTracking_at_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_continueTracking_at_inView_IMetInst(){
		return ((continueTracking_at_inView_IMetInst != null)
	? (continueTracking_at_inView_IMetInst)
	: (continueTracking_at_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "continueTracking:at:inView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean continueTracking_at_inView(final com.apple.jobjc.foundation.NSPoint lastPoint, final com.apple.jobjc.foundation.NSPoint currentPoint, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend continueTracking_at_inView_IMetInst = get_continueTracking_at_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		continueTracking_at_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, lastPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, currentPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		continueTracking_at_inView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlSize_IMetInst(){
		return ((controlSize_IMetInst != null)
	? (controlSize_IMetInst)
	: (controlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long controlSize(){
			final com.apple.jobjc.Invoke.MsgSend controlSize_IMetInst = get_controlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlSize_IMetInst.init(nativeBuffer, this);
		controlSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlTint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlTint_IMetInst(){
		return ((controlTint_IMetInst != null)
	? (controlTint_IMetInst)
	: (controlTint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlTint", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long controlTint(){
			final com.apple.jobjc.Invoke.MsgSend controlTint_IMetInst = get_controlTint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlTint_IMetInst.init(nativeBuffer, this);
		controlTint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlView_IMetInst(){
		return ((controlView_IMetInst != null)
	? (controlView_IMetInst)
	: (controlView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView controlView(){
			final com.apple.jobjc.Invoke.MsgSend controlView_IMetInst = get_controlView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlView_IMetInst.init(nativeBuffer, this);
		controlView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend draggingImageComponentsWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingImageComponentsWithFrame_inView_IMetInst(){
		return ((draggingImageComponentsWithFrame_inView_IMetInst != null)
	? (draggingImageComponentsWithFrame_inView_IMetInst)
	: (draggingImageComponentsWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingImageComponentsWithFrame:inView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray draggingImageComponentsWithFrame_inView(final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend draggingImageComponentsWithFrame_inView_IMetInst = get_draggingImageComponentsWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingImageComponentsWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		draggingImageComponentsWithFrame_inView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawFocusRingMaskWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawFocusRingMaskWithFrame_inView_IMetInst(){
		return ((drawFocusRingMaskWithFrame_inView_IMetInst != null)
	? (drawFocusRingMaskWithFrame_inView_IMetInst)
	: (drawFocusRingMaskWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawFocusRingMaskWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawFocusRingMaskWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawFocusRingMaskWithFrame_inView_IMetInst = get_drawFocusRingMaskWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawFocusRingMaskWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawFocusRingMaskWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawInteriorWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawInteriorWithFrame_inView_IMetInst(){
		return ((drawInteriorWithFrame_inView_IMetInst != null)
	? (drawInteriorWithFrame_inView_IMetInst)
	: (drawInteriorWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawInteriorWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawInteriorWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawInteriorWithFrame_inView_IMetInst = get_drawInteriorWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawInteriorWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawInteriorWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithExpansionFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithExpansionFrame_inView_IMetInst(){
		return ((drawWithExpansionFrame_inView_IMetInst != null)
	? (drawWithExpansionFrame_inView_IMetInst)
	: (drawWithExpansionFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithExpansionFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawWithExpansionFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend drawWithExpansionFrame_inView_IMetInst = get_drawWithExpansionFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithExpansionFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		drawWithExpansionFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawWithFrame_inView_IMetInst(){
		return ((drawWithFrame_inView_IMetInst != null)
	? (drawWithFrame_inView_IMetInst)
	: (drawWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawWithFrame_inView_IMetInst = get_drawWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawingRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawingRectForBounds_IMetInst(){
		return ((drawingRectForBounds_IMetInst != null)
	? (drawingRectForBounds_IMetInst)
	: (drawingRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawingRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect drawingRectForBounds(final com.apple.jobjc.foundation.NSRect theRect){
			final com.apple.jobjc.Invoke.MsgSend drawingRectForBounds_IMetInst = get_drawingRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawingRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, theRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		drawingRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend editWithFrame_inView_editor_delegate_event_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editWithFrame_inView_editor_delegate_event_IMetInst(){
		return ((editWithFrame_inView_editor_delegate_event_IMetInst != null)
	? (editWithFrame_inView_editor_delegate_event_IMetInst)
	: (editWithFrame_inView_editor_delegate_event_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editWithFrame:inView:editor:delegate:event:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void editWithFrame_inView_editor_delegate_event(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSView controlView, final com.apple.jobjc.appkit.NSText textObj, final com.apple.jobjc.ID anObject, final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend editWithFrame_inView_editor_delegate_event_IMetInst = get_editWithFrame_inView_editor_delegate_event_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editWithFrame_inView_editor_delegate_event_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		editWithFrame_inView_editor_delegate_event_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endEditing_IMetInst(){
		return ((endEditing_IMetInst != null)
	? (endEditing_IMetInst)
	: (endEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void endEditing(final com.apple.jobjc.appkit.NSText textObj){
			final com.apple.jobjc.Invoke.MsgSend endEditing_IMetInst = get_endEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObj);
		endEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend entryType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_entryType_IMetInst(){
		return ((entryType_IMetInst != null)
	? (entryType_IMetInst)
	: (entryType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "entryType", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long entryType(){
			final com.apple.jobjc.Invoke.MsgSend entryType_IMetInst = get_entryType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		entryType_IMetInst.init(nativeBuffer, this);
		entryType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expansionFrameWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expansionFrameWithFrame_inView_IMetInst(){
		return ((expansionFrameWithFrame_inView_IMetInst != null)
	? (expansionFrameWithFrame_inView_IMetInst)
	: (expansionFrameWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expansionFrameWithFrame:inView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect expansionFrameWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend expansionFrameWithFrame_inView_IMetInst = get_expansionFrameWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expansionFrameWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		expansionFrameWithFrame_inView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fieldEditorForView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fieldEditorForView_IMetInst(){
		return ((fieldEditorForView_IMetInst != null)
	? (fieldEditorForView_IMetInst)
	: (fieldEditorForView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fieldEditorForView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextView fieldEditorForView(final com.apple.jobjc.appkit.NSView aControlView){
			final com.apple.jobjc.Invoke.MsgSend fieldEditorForView_IMetInst = get_fieldEditorForView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fieldEditorForView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aControlView);
		fieldEditorForView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextView returnValue = (com.apple.jobjc.appkit.NSTextView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend focusRingMaskBoundsForFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusRingMaskBoundsForFrame_inView_IMetInst(){
		return ((focusRingMaskBoundsForFrame_inView_IMetInst != null)
	? (focusRingMaskBoundsForFrame_inView_IMetInst)
	: (focusRingMaskBoundsForFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusRingMaskBoundsForFrame:inView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect focusRingMaskBoundsForFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend focusRingMaskBoundsForFrame_inView_IMetInst = get_focusRingMaskBoundsForFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusRingMaskBoundsForFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		focusRingMaskBoundsForFrame_inView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend focusRingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusRingType_IMetInst(){
		return ((focusRingType_IMetInst != null)
	? (focusRingType_IMetInst)
	: (focusRingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusRingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long focusRingType(){
			final com.apple.jobjc.Invoke.MsgSend focusRingType_IMetInst = get_focusRingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusRingType_IMetInst.init(nativeBuffer, this);
		focusRingType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend getPeriodicDelay_interval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getPeriodicDelay_interval_IMetInst(){
		return ((getPeriodicDelay_interval_IMetInst != null)
	? (getPeriodicDelay_interval_IMetInst)
	: (getPeriodicDelay_interval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getPeriodicDelay:interval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getPeriodicDelay_interval(final com.apple.jobjc.Pointer<java.lang.Float> delay, final com.apple.jobjc.Pointer<java.lang.Float> interval){
			final com.apple.jobjc.Invoke.MsgSend getPeriodicDelay_interval_IMetInst = get_getPeriodicDelay_interval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getPeriodicDelay_interval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, delay);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, interval);
		getPeriodicDelay_interval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hasValidObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasValidObjectValue_IMetInst(){
		return ((hasValidObjectValue_IMetInst != null)
	? (hasValidObjectValue_IMetInst)
	: (hasValidObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasValidObjectValue", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasValidObjectValue(){
			final com.apple.jobjc.Invoke.MsgSend hasValidObjectValue_IMetInst = get_hasValidObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasValidObjectValue_IMetInst.init(nativeBuffer, this);
		hasValidObjectValue_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlight_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlight_withFrame_inView_IMetInst(){
		return ((highlight_withFrame_inView_IMetInst != null)
	? (highlight_withFrame_inView_IMetInst)
	: (highlight_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlight:withFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void highlight_withFrame_inView(final boolean flag, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend highlight_withFrame_inView_IMetInst = get_highlight_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlight_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		highlight_withFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightColorWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightColorWithFrame_inView_IMetInst(){
		return ((highlightColorWithFrame_inView_IMetInst != null)
	? (highlightColorWithFrame_inView_IMetInst)
	: (highlightColorWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightColorWithFrame:inView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor highlightColorWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend highlightColorWithFrame_inView_IMetInst = get_highlightColorWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightColorWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		highlightColorWithFrame_inView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hitTestForEvent_inRect_ofView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hitTestForEvent_inRect_ofView_IMetInst(){
		return ((hitTestForEvent_inRect_ofView_IMetInst != null)
	? (hitTestForEvent_inRect_ofView_IMetInst)
	: (hitTestForEvent_inRect_ofView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hitTestForEvent:inRect:ofView:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long hitTestForEvent_inRect_ofView(final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend hitTestForEvent_inRect_ofView_IMetInst = get_hitTestForEvent_inRect_ofView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hitTestForEvent_inRect_ofView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		hitTestForEvent_inRect_ofView_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRectForBounds_IMetInst(){
		return ((imageRectForBounds_IMetInst != null)
	? (imageRectForBounds_IMetInst)
	: (imageRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect imageRectForBounds(final com.apple.jobjc.foundation.NSRect theRect){
			final com.apple.jobjc.Invoke.MsgSend imageRectForBounds_IMetInst = get_imageRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, theRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		imageRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initImageCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initImageCell_IMetInst(){
		return ((initImageCell_IMetInst != null)
	? (initImageCell_IMetInst)
	: (initImageCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initImageCell:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initImageCell(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend initImageCell_IMetInst = get_initImageCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initImageCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		initImageCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initTextCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initTextCell_IMetInst(){
		return ((initTextCell_IMetInst != null)
	? (initTextCell_IMetInst)
	: (initTextCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initTextCell:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initTextCell(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend initTextCell_IMetInst = get_initTextCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initTextCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		initTextCell_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isBezeled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBezeled_IMetInst(){
		return ((isBezeled_IMetInst != null)
	? (isBezeled_IMetInst)
	: (isBezeled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBezeled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBezeled(){
			final com.apple.jobjc.Invoke.MsgSend isBezeled_IMetInst = get_isBezeled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBezeled_IMetInst.init(nativeBuffer, this);
		isBezeled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBordered_IMetInst(){
		return ((isBordered_IMetInst != null)
	? (isBordered_IMetInst)
	: (isBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBordered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBordered(){
			final com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst = get_isBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBordered_IMetInst.init(nativeBuffer, this);
		isBordered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend isEntryAcceptable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEntryAcceptable_IMetInst(){
		return ((isEntryAcceptable_IMetInst != null)
	? (isEntryAcceptable_IMetInst)
	: (isEntryAcceptable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEntryAcceptable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEntryAcceptable(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend isEntryAcceptable_IMetInst = get_isEntryAcceptable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEntryAcceptable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		isEntryAcceptable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHighlighted_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHighlighted_IMetInst(){
		return ((isHighlighted_IMetInst != null)
	? (isHighlighted_IMetInst)
	: (isHighlighted_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHighlighted", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHighlighted(){
			final com.apple.jobjc.Invoke.MsgSend isHighlighted_IMetInst = get_isHighlighted_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHighlighted_IMetInst.init(nativeBuffer, this);
		isHighlighted_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOpaque_IMetInst(){
		return ((isOpaque_IMetInst != null)
	? (isOpaque_IMetInst)
	: (isOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOpaque", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOpaque(){
			final com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst = get_isOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOpaque_IMetInst.init(nativeBuffer, this);
		isOpaque_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isScrollable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isScrollable_IMetInst(){
		return ((isScrollable_IMetInst != null)
	? (isScrollable_IMetInst)
	: (isScrollable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isScrollable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isScrollable(){
			final com.apple.jobjc.Invoke.MsgSend isScrollable_IMetInst = get_isScrollable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isScrollable_IMetInst.init(nativeBuffer, this);
		isScrollable_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalent_IMetInst(){
		return ((keyEquivalent_IMetInst != null)
	? (keyEquivalent_IMetInst)
	: (keyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString keyEquivalent(){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalent_IMetInst = get_keyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalent_IMetInst.init(nativeBuffer, this);
		keyEquivalent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineBreakMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineBreakMode_IMetInst(){
		return ((lineBreakMode_IMetInst != null)
	? (lineBreakMode_IMetInst)
	: (lineBreakMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineBreakMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lineBreakMode(){
			final com.apple.jobjc.Invoke.MsgSend lineBreakMode_IMetInst = get_lineBreakMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineBreakMode_IMetInst.init(nativeBuffer, this);
		lineBreakMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_IMetInst(){
		return ((menu_IMetInst != null)
	? (menu_IMetInst)
	: (menu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menu(){
			final com.apple.jobjc.Invoke.MsgSend menu_IMetInst = get_menu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_IMetInst.init(nativeBuffer, this);
		menu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuForEvent_inRect_ofView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuForEvent_inRect_ofView_IMetInst(){
		return ((menuForEvent_inRect_ofView_IMetInst != null)
	? (menuForEvent_inRect_ofView_IMetInst)
	: (menuForEvent_inRect_ofView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuForEvent:inRect:ofView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menuForEvent_inRect_ofView(final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend menuForEvent_inRect_ofView_IMetInst = get_menuForEvent_inRect_ofView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuForEvent_inRect_ofView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		menuForEvent_inRect_ofView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mnemonic_IMetInst(){
		return ((mnemonic_IMetInst != null)
	? (mnemonic_IMetInst)
	: (mnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mnemonic", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString mnemonic(){
			final com.apple.jobjc.Invoke.MsgSend mnemonic_IMetInst = get_mnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mnemonic_IMetInst.init(nativeBuffer, this);
		mnemonic_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mnemonicLocation_IMetInst(){
		return ((mnemonicLocation_IMetInst != null)
	? (mnemonicLocation_IMetInst)
	: (mnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mnemonicLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long mnemonicLocation(){
			final com.apple.jobjc.Invoke.MsgSend mnemonicLocation_IMetInst = get_mnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mnemonicLocation_IMetInst.init(nativeBuffer, this);
		mnemonicLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDownFlags_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDownFlags_IMetInst(){
		return ((mouseDownFlags_IMetInst != null)
	? (mouseDownFlags_IMetInst)
	: (mouseDownFlags_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDownFlags", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long mouseDownFlags(){
			final com.apple.jobjc.Invoke.MsgSend mouseDownFlags_IMetInst = get_mouseDownFlags_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDownFlags_IMetInst.init(nativeBuffer, this);
		mouseDownFlags_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextState_IMetInst(){
		return ((nextState_IMetInst != null)
	? (nextState_IMetInst)
	: (nextState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextState", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long nextState(){
			final com.apple.jobjc.Invoke.MsgSend nextState_IMetInst = get_nextState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextState_IMetInst.init(nativeBuffer, this);
		nextState_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedObject_IMetInst(){
		return ((representedObject_IMetInst != null)
	? (representedObject_IMetInst)
	: (representedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T representedObject(){
			final com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst = get_representedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedObject_IMetInst.init(nativeBuffer, this);
		representedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resetCursorRect_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetCursorRect_inView_IMetInst(){
		return ((resetCursorRect_inView_IMetInst != null)
	? (resetCursorRect_inView_IMetInst)
	: (resetCursorRect_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetCursorRect:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void resetCursorRect_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend resetCursorRect_inView_IMetInst = get_resetCursorRect_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetCursorRect_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		resetCursorRect_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectWithFrame_inView_editor_delegate_start_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectWithFrame_inView_editor_delegate_start_length_IMetInst(){
		return ((selectWithFrame_inView_editor_delegate_start_length_IMetInst != null)
	? (selectWithFrame_inView_editor_delegate_start_length_IMetInst)
	: (selectWithFrame_inView_editor_delegate_start_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectWithFrame:inView:editor:delegate:start:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectWithFrame_inView_editor_delegate_start_length(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSView controlView, final com.apple.jobjc.appkit.NSText textObj, final com.apple.jobjc.ID anObject, final long selStart, final long selLength){
			final com.apple.jobjc.Invoke.MsgSend selectWithFrame_inView_editor_delegate_start_length_IMetInst = get_selectWithFrame_inView_editor_delegate_start_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectWithFrame_inView_editor_delegate_start_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selStart);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selLength);
		selectWithFrame_inView_editor_delegate_start_length_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend sendsActionOnEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendsActionOnEndEditing_IMetInst(){
		return ((sendsActionOnEndEditing_IMetInst != null)
	? (sendsActionOnEndEditing_IMetInst)
	: (sendsActionOnEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendsActionOnEndEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendsActionOnEndEditing(){
			final com.apple.jobjc.Invoke.MsgSend sendsActionOnEndEditing_IMetInst = get_sendsActionOnEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendsActionOnEndEditing_IMetInst.init(nativeBuffer, this);
		sendsActionOnEndEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setAllowsEditingTextAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsEditingTextAttributes_IMetInst(){
		return ((setAllowsEditingTextAttributes_IMetInst != null)
	? (setAllowsEditingTextAttributes_IMetInst)
	: (setAllowsEditingTextAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsEditingTextAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsEditingTextAttributes(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsEditingTextAttributes_IMetInst = get_setAllowsEditingTextAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsEditingTextAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsEditingTextAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMixedState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMixedState_IMetInst(){
		return ((setAllowsMixedState_IMetInst != null)
	? (setAllowsMixedState_IMetInst)
	: (setAllowsMixedState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMixedState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMixedState(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMixedState_IMetInst = get_setAllowsMixedState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMixedState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsMixedState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsUndo_IMetInst(){
		return ((setAllowsUndo_IMetInst != null)
	? (setAllowsUndo_IMetInst)
	: (setAllowsUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsUndo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsUndo(final boolean allowsUndo){
			final com.apple.jobjc.Invoke.MsgSend setAllowsUndo_IMetInst = get_setAllowsUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsUndo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowsUndo);
		setAllowsUndo_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundStyle_IMetInst(){
		return ((setBackgroundStyle_IMetInst != null)
	? (setBackgroundStyle_IMetInst)
	: (setBackgroundStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBackgroundStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundStyle_IMetInst = get_setBackgroundStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, style);
		setBackgroundStyle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBezeled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBezeled_IMetInst(){
		return ((setBezeled_IMetInst != null)
	? (setBezeled_IMetInst)
	: (setBezeled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBezeled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBezeled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBezeled_IMetInst = get_setBezeled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBezeled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBezeled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBordered_IMetInst(){
		return ((setBordered_IMetInst != null)
	? (setBordered_IMetInst)
	: (setBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBordered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst = get_setBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCellAttribute_to_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellAttribute_to_IMetInst(){
		return ((setCellAttribute_to_IMetInst != null)
	? (setCellAttribute_to_IMetInst)
	: (setCellAttribute_to_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellAttribute:to:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setCellAttribute_to(final long aParameter, final long value){
			final com.apple.jobjc.Invoke.MsgSend setCellAttribute_to_IMetInst = get_setCellAttribute_to_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellAttribute_to_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aParameter);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		setCellAttribute_to_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlSize_IMetInst(){
		return ((setControlSize_IMetInst != null)
	? (setControlSize_IMetInst)
	: (setControlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlSize(final long size){
			final com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst = get_setControlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, size);
		setControlSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setControlTint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlTint_IMetInst(){
		return ((setControlTint_IMetInst != null)
	? (setControlTint_IMetInst)
	: (setControlTint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlTint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlTint(final long controlTint){
			final com.apple.jobjc.Invoke.MsgSend setControlTint_IMetInst = get_setControlTint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlTint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlTint);
		setControlTint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setControlView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlView_IMetInst(){
		return ((setControlView_IMetInst != null)
	? (setControlView_IMetInst)
	: (setControlView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setControlView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setControlView_IMetInst = get_setControlView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setControlView_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setEntryType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEntryType_IMetInst(){
		return ((setEntryType_IMetInst != null)
	? (setEntryType_IMetInst)
	: (setEntryType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEntryType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setEntryType(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setEntryType_IMetInst = get_setEntryType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEntryType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aType);
		setEntryType_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setFocusRingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFocusRingType_IMetInst(){
		return ((setFocusRingType_IMetInst != null)
	? (setFocusRingType_IMetInst)
	: (setFocusRingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFocusRingType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFocusRingType(final long focusRingType){
			final com.apple.jobjc.Invoke.MsgSend setFocusRingType_IMetInst = get_setFocusRingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFocusRingType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, focusRingType);
		setFocusRingType_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHighlighted_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHighlighted_IMetInst(){
		return ((setHighlighted_IMetInst != null)
	? (setHighlighted_IMetInst)
	: (setHighlighted_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHighlighted:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHighlighted(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHighlighted_IMetInst = get_setHighlighted_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHighlighted_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHighlighted_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setLineBreakMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineBreakMode_IMetInst(){
		return ((setLineBreakMode_IMetInst != null)
	? (setLineBreakMode_IMetInst)
	: (setLineBreakMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineBreakMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLineBreakMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setLineBreakMode_IMetInst = get_setLineBreakMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineBreakMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setLineBreakMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenu_IMetInst(){
		return ((setMenu_IMetInst != null)
	? (setMenu_IMetInst)
	: (setMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenu(final com.apple.jobjc.appkit.NSMenu aMenu){
			final com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst = get_setMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aMenu);
		setMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMnemonicLocation_IMetInst(){
		return ((setMnemonicLocation_IMetInst != null)
	? (setMnemonicLocation_IMetInst)
	: (setMnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMnemonicLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMnemonicLocation(final long location){
			final com.apple.jobjc.Invoke.MsgSend setMnemonicLocation_IMetInst = get_setMnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMnemonicLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		setMnemonicLocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNextState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNextState_IMetInst(){
		return ((setNextState_IMetInst != null)
	? (setNextState_IMetInst)
	: (setNextState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNextState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setNextState(){
			final com.apple.jobjc.Invoke.MsgSend setNextState_IMetInst = get_setNextState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNextState_IMetInst.init(nativeBuffer, this);
		setNextState_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedObject_IMetInst(){
		return ((setRepresentedObject_IMetInst != null)
	? (setRepresentedObject_IMetInst)
	: (setRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst = get_setRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setRepresentedObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollable_IMetInst(){
		return ((setScrollable_IMetInst != null)
	? (setScrollable_IMetInst)
	: (setScrollable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setScrollable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setScrollable_IMetInst = get_setScrollable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setScrollable_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setSendsActionOnEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSendsActionOnEndEditing_IMetInst(){
		return ((setSendsActionOnEndEditing_IMetInst != null)
	? (setSendsActionOnEndEditing_IMetInst)
	: (setSendsActionOnEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSendsActionOnEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSendsActionOnEndEditing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSendsActionOnEndEditing_IMetInst = get_setSendsActionOnEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSendsActionOnEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSendsActionOnEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsFirstResponder_IMetInst(){
		return ((setShowsFirstResponder_IMetInst != null)
	? (setShowsFirstResponder_IMetInst)
	: (setShowsFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsFirstResponder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsFirstResponder(final boolean showFR){
			final com.apple.jobjc.Invoke.MsgSend setShowsFirstResponder_IMetInst = get_setShowsFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsFirstResponder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showFR);
		setShowsFirstResponder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setState_IMetInst(){
		return ((setState_IMetInst != null)
	? (setState_IMetInst)
	: (setState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setState(final long value){
			final com.apple.jobjc.Invoke.MsgSend setState_IMetInst = get_setState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		setState_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWithMnemonic_IMetInst(){
		return ((setTitleWithMnemonic_IMetInst != null)
	? (setTitleWithMnemonic_IMetInst)
	: (setTitleWithMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWithMnemonic:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleWithMnemonic(final com.apple.jobjc.foundation.NSString stringWithAmpersand){
			final com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst = get_setTitleWithMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWithMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringWithAmpersand);
		setTitleWithMnemonic_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTruncatesLastVisibleLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTruncatesLastVisibleLine_IMetInst(){
		return ((setTruncatesLastVisibleLine_IMetInst != null)
	? (setTruncatesLastVisibleLine_IMetInst)
	: (setTruncatesLastVisibleLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTruncatesLastVisibleLine:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTruncatesLastVisibleLine(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTruncatesLastVisibleLine_IMetInst = get_setTruncatesLastVisibleLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTruncatesLastVisibleLine_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTruncatesLastVisibleLine_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setType_IMetInst(){
		return ((setType_IMetInst != null)
	? (setType_IMetInst)
	: (setType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setType(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setType_IMetInst = get_setType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		setType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUpFieldEditorAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUpFieldEditorAttributes_IMetInst(){
		return ((setUpFieldEditorAttributes_IMetInst != null)
	? (setUpFieldEditorAttributes_IMetInst)
	: (setUpFieldEditorAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUpFieldEditorAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSText setUpFieldEditorAttributes(final com.apple.jobjc.appkit.NSText textObj){
			final com.apple.jobjc.Invoke.MsgSend setUpFieldEditorAttributes_IMetInst = get_setUpFieldEditorAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUpFieldEditorAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObj);
		setUpFieldEditorAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSText returnValue = (com.apple.jobjc.appkit.NSText) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setUserInterfaceLayoutDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUserInterfaceLayoutDirection_IMetInst(){
		return ((setUserInterfaceLayoutDirection_IMetInst != null)
	? (setUserInterfaceLayoutDirection_IMetInst)
	: (setUserInterfaceLayoutDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUserInterfaceLayoutDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setUserInterfaceLayoutDirection(final long layoutDirection){
			final com.apple.jobjc.Invoke.MsgSend setUserInterfaceLayoutDirection_IMetInst = get_setUserInterfaceLayoutDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUserInterfaceLayoutDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, layoutDirection);
		setUserInterfaceLayoutDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesSingleLineMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesSingleLineMode_IMetInst(){
		return ((setUsesSingleLineMode_IMetInst != null)
	? (setUsesSingleLineMode_IMetInst)
	: (setUsesSingleLineMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesSingleLineMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesSingleLineMode(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesSingleLineMode_IMetInst = get_setUsesSingleLineMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesSingleLineMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesSingleLineMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWraps_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWraps_IMetInst(){
		return ((setWraps_IMetInst != null)
	? (setWraps_IMetInst)
	: (setWraps_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWraps:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWraps(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWraps_IMetInst = get_setWraps_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWraps_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWraps_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsFirstResponder_IMetInst(){
		return ((showsFirstResponder_IMetInst != null)
	? (showsFirstResponder_IMetInst)
	: (showsFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsFirstResponder", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend showsFirstResponder_IMetInst = get_showsFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsFirstResponder_IMetInst.init(nativeBuffer, this);
		showsFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startTrackingAt_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startTrackingAt_inView_IMetInst(){
		return ((startTrackingAt_inView_IMetInst != null)
	? (startTrackingAt_inView_IMetInst)
	: (startTrackingAt_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startTrackingAt:inView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean startTrackingAt_inView(final com.apple.jobjc.foundation.NSPoint startPoint, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend startTrackingAt_inView_IMetInst = get_startTrackingAt_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startTrackingAt_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, startPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		startTrackingAt_inView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend state_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_state_IMetInst(){
		return ((state_IMetInst != null)
	? (state_IMetInst)
	: (state_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "state", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long state(){
			final com.apple.jobjc.Invoke.MsgSend state_IMetInst = get_state_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		state_IMetInst.init(nativeBuffer, this);
		state_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stopTracking_at_inView_mouseIsUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopTracking_at_inView_mouseIsUp_IMetInst(){
		return ((stopTracking_at_inView_mouseIsUp_IMetInst != null)
	? (stopTracking_at_inView_mouseIsUp_IMetInst)
	: (stopTracking_at_inView_mouseIsUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopTracking:at:inView:mouseIsUp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void stopTracking_at_inView_mouseIsUp(final com.apple.jobjc.foundation.NSPoint lastPoint, final com.apple.jobjc.foundation.NSPoint stopPoint, final com.apple.jobjc.appkit.NSView controlView, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend stopTracking_at_inView_mouseIsUp_IMetInst = get_stopTracking_at_inView_mouseIsUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopTracking_at_inView_mouseIsUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, lastPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, stopPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		stopTracking_at_inView_mouseIsUp_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleRectForBounds_IMetInst(){
		return ((titleRectForBounds_IMetInst != null)
	? (titleRectForBounds_IMetInst)
	: (titleRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect titleRectForBounds(final com.apple.jobjc.foundation.NSRect theRect){
			final com.apple.jobjc.Invoke.MsgSend titleRectForBounds_IMetInst = get_titleRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, theRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		titleRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_untilMouseUp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackMouse_inRect_ofView_untilMouseUp_IMetInst(){
		return ((trackMouse_inRect_ofView_untilMouseUp_IMetInst != null)
	? (trackMouse_inRect_ofView_untilMouseUp_IMetInst)
	: (trackMouse_inRect_ofView_untilMouseUp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackMouse:inRect:ofView:untilMouseUp:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean trackMouse_inRect_ofView_untilMouseUp(final com.apple.jobjc.appkit.NSEvent theEvent, final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend trackMouse_inRect_ofView_untilMouseUp_IMetInst = get_trackMouse_inRect_ofView_untilMouseUp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackMouse_inRect_ofView_untilMouseUp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		trackMouse_inRect_ofView_untilMouseUp_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend truncatesLastVisibleLine_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_truncatesLastVisibleLine_IMetInst(){
		return ((truncatesLastVisibleLine_IMetInst != null)
	? (truncatesLastVisibleLine_IMetInst)
	: (truncatesLastVisibleLine_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "truncatesLastVisibleLine", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean truncatesLastVisibleLine(){
			final com.apple.jobjc.Invoke.MsgSend truncatesLastVisibleLine_IMetInst = get_truncatesLastVisibleLine_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		truncatesLastVisibleLine_IMetInst.init(nativeBuffer, this);
		truncatesLastVisibleLine_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_type_IMetInst(){
		return ((type_IMetInst != null)
	? (type_IMetInst)
	: (type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "type", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long type(){
			final com.apple.jobjc.Invoke.MsgSend type_IMetInst = get_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		type_IMetInst.init(nativeBuffer, this);
		type_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userInterfaceLayoutDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userInterfaceLayoutDirection_IMetInst(){
		return ((userInterfaceLayoutDirection_IMetInst != null)
	? (userInterfaceLayoutDirection_IMetInst)
	: (userInterfaceLayoutDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userInterfaceLayoutDirection", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long userInterfaceLayoutDirection(){
			final com.apple.jobjc.Invoke.MsgSend userInterfaceLayoutDirection_IMetInst = get_userInterfaceLayoutDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userInterfaceLayoutDirection_IMetInst.init(nativeBuffer, this);
		userInterfaceLayoutDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesSingleLineMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesSingleLineMode_IMetInst(){
		return ((usesSingleLineMode_IMetInst != null)
	? (usesSingleLineMode_IMetInst)
	: (usesSingleLineMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesSingleLineMode", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesSingleLineMode(){
			final com.apple.jobjc.Invoke.MsgSend usesSingleLineMode_IMetInst = get_usesSingleLineMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesSingleLineMode_IMetInst.init(nativeBuffer, this);
		usesSingleLineMode_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsNotificationForMarkedText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsNotificationForMarkedText_IMetInst(){
		return ((wantsNotificationForMarkedText_IMetInst != null)
	? (wantsNotificationForMarkedText_IMetInst)
	: (wantsNotificationForMarkedText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsNotificationForMarkedText", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsNotificationForMarkedText(){
			final com.apple.jobjc.Invoke.MsgSend wantsNotificationForMarkedText_IMetInst = get_wantsNotificationForMarkedText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsNotificationForMarkedText_IMetInst.init(nativeBuffer, this);
		wantsNotificationForMarkedText_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wraps_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wraps_IMetInst(){
		return ((wraps_IMetInst != null)
	? (wraps_IMetInst)
	: (wraps_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wraps", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wraps(){
			final com.apple.jobjc.Invoke.MsgSend wraps_IMetInst = get_wraps_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wraps_IMetInst.init(nativeBuffer, this);
		wraps_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
