package com.apple.jobjc.appkit;

public  class NSScroller extends com.apple.jobjc.appkit.NSControl {
	public NSScroller(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScroller(final NSScroller obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arrowsPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrowsPosition_IMetInst(){
		return ((arrowsPosition_IMetInst != null)
	? (arrowsPosition_IMetInst)
	: (arrowsPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrowsPosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long arrowsPosition(){
			final com.apple.jobjc.Invoke.MsgSend arrowsPosition_IMetInst = get_arrowsPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrowsPosition_IMetInst.init(nativeBuffer, this);
		arrowsPosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkSpaceForParts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkSpaceForParts_IMetInst(){
		return ((checkSpaceForParts_IMetInst != null)
	? (checkSpaceForParts_IMetInst)
	: (checkSpaceForParts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkSpaceForParts", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void checkSpaceForParts(){
			final com.apple.jobjc.Invoke.MsgSend checkSpaceForParts_IMetInst = get_checkSpaceForParts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkSpaceForParts_IMetInst.init(nativeBuffer, this);
		checkSpaceForParts_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend drawArrow_highlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawArrow_highlight_IMetInst(){
		return ((drawArrow_highlight_IMetInst != null)
	? (drawArrow_highlight_IMetInst)
	: (drawArrow_highlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawArrow:highlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void drawArrow_highlight(final long whichArrow, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend drawArrow_highlight_IMetInst = get_drawArrow_highlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawArrow_highlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, whichArrow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		drawArrow_highlight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawKnob_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawKnob_IMetInst(){
		return ((drawKnob_IMetInst != null)
	? (drawKnob_IMetInst)
	: (drawKnob_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawKnob", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void drawKnob(){
			final com.apple.jobjc.Invoke.MsgSend drawKnob_IMetInst = get_drawKnob_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawKnob_IMetInst.init(nativeBuffer, this);
		drawKnob_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawKnobSlotInRect_highlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawKnobSlotInRect_highlight_IMetInst(){
		return ((drawKnobSlotInRect_highlight_IMetInst != null)
	? (drawKnobSlotInRect_highlight_IMetInst)
	: (drawKnobSlotInRect_highlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawKnobSlotInRect:highlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void drawKnobSlotInRect_highlight(final com.apple.jobjc.foundation.NSRect slotRect, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend drawKnobSlotInRect_highlight_IMetInst = get_drawKnobSlotInRect_highlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawKnobSlotInRect_highlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, slotRect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		drawKnobSlotInRect_highlight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawParts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawParts_IMetInst(){
		return ((drawParts_IMetInst != null)
	? (drawParts_IMetInst)
	: (drawParts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawParts", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void drawParts(){
			final com.apple.jobjc.Invoke.MsgSend drawParts_IMetInst = get_drawParts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawParts_IMetInst.init(nativeBuffer, this);
		drawParts_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlight_IMetInst(){
		return ((highlight_IMetInst != null)
	? (highlight_IMetInst)
	: (highlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void highlight(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend highlight_IMetInst = get_highlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		highlight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hitPart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hitPart_IMetInst(){
		return ((hitPart_IMetInst != null)
	? (hitPart_IMetInst)
	: (hitPart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hitPart", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long hitPart(){
			final com.apple.jobjc.Invoke.MsgSend hitPart_IMetInst = get_hitPart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hitPart_IMetInst.init(nativeBuffer, this);
		hitPart_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knobProportion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knobProportion_IMetInst(){
		return ((knobProportion_IMetInst != null)
	? (knobProportion_IMetInst)
	: (knobProportion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knobProportion", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double knobProportion(){
			final com.apple.jobjc.Invoke.MsgSend knobProportion_IMetInst = get_knobProportion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knobProportion_IMetInst.init(nativeBuffer, this);
		knobProportion_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knobStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knobStyle_IMetInst(){
		return ((knobStyle_IMetInst != null)
	? (knobStyle_IMetInst)
	: (knobStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knobStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long knobStyle(){
			final com.apple.jobjc.Invoke.MsgSend knobStyle_IMetInst = get_knobStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knobStyle_IMetInst.init(nativeBuffer, this);
		knobStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForPart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForPart_IMetInst(){
		return ((rectForPart_IMetInst != null)
	? (rectForPart_IMetInst)
	: (rectForPart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForPart:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect rectForPart(final long partCode){
			final com.apple.jobjc.Invoke.MsgSend rectForPart_IMetInst = get_rectForPart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForPart_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, partCode);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForPart_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerStyle_IMetInst(){
		return ((scrollerStyle_IMetInst != null)
	? (scrollerStyle_IMetInst)
	: (scrollerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long scrollerStyle(){
			final com.apple.jobjc.Invoke.MsgSend scrollerStyle_IMetInst = get_scrollerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerStyle_IMetInst.init(nativeBuffer, this);
		scrollerStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setArrowsPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArrowsPosition_IMetInst(){
		return ((setArrowsPosition_IMetInst != null)
	? (setArrowsPosition_IMetInst)
	: (setArrowsPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArrowsPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setArrowsPosition(final long where){
			final com.apple.jobjc.Invoke.MsgSend setArrowsPosition_IMetInst = get_setArrowsPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArrowsPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, where);
		setArrowsPosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setControlSize_IMetInst(){
		return ((setControlSize_IMetInst != null)
	? (setControlSize_IMetInst)
	: (setControlSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setControlSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setControlSize(final long controlSize){
			final com.apple.jobjc.Invoke.MsgSend setControlSize_IMetInst = get_setControlSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
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

	private static com.apple.jobjc.Invoke.MsgSend setFloatValue_knobProportion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloatValue_knobProportion_IMetInst(){
		return ((setFloatValue_knobProportion_IMetInst != null)
	? (setFloatValue_knobProportion_IMetInst)
	: (setFloatValue_knobProportion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloatValue:knobProportion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFloatValue_knobProportion(final float aFloat, final double proportion){
			final com.apple.jobjc.Invoke.MsgSend setFloatValue_knobProportion_IMetInst = get_setFloatValue_knobProportion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloatValue_knobProportion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, aFloat);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, proportion);
		setFloatValue_knobProportion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKnobProportion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKnobProportion_IMetInst(){
		return ((setKnobProportion_IMetInst != null)
	? (setKnobProportion_IMetInst)
	: (setKnobProportion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKnobProportion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setKnobProportion(final double proportion){
			final com.apple.jobjc.Invoke.MsgSend setKnobProportion_IMetInst = get_setKnobProportion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKnobProportion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, proportion);
		setKnobProportion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKnobStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKnobStyle_IMetInst(){
		return ((setKnobStyle_IMetInst != null)
	? (setKnobStyle_IMetInst)
	: (setKnobStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKnobStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setKnobStyle(final long newKnobStyle){
			final com.apple.jobjc.Invoke.MsgSend setKnobStyle_IMetInst = get_setKnobStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKnobStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newKnobStyle);
		setKnobStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollerStyle_IMetInst(){
		return ((setScrollerStyle_IMetInst != null)
	? (setScrollerStyle_IMetInst)
	: (setScrollerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollerStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setScrollerStyle(final long newScrollerStyle){
			final com.apple.jobjc.Invoke.MsgSend setScrollerStyle_IMetInst = get_setScrollerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollerStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newScrollerStyle);
		setScrollerStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend testPart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_testPart_IMetInst(){
		return ((testPart_IMetInst != null)
	? (testPart_IMetInst)
	: (testPart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "testPart:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long testPart(final com.apple.jobjc.foundation.NSPoint thePoint){
			final com.apple.jobjc.Invoke.MsgSend testPart_IMetInst = get_testPart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		testPart_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, thePoint);
		testPart_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackKnob_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackKnob_IMetInst(){
		return ((trackKnob_IMetInst != null)
	? (trackKnob_IMetInst)
	: (trackKnob_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackKnob:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void trackKnob(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend trackKnob_IMetInst = get_trackKnob_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackKnob_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		trackKnob_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend trackScrollButtons_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackScrollButtons_IMetInst(){
		return ((trackScrollButtons_IMetInst != null)
	? (trackScrollButtons_IMetInst)
	: (trackScrollButtons_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackScrollButtons:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void trackScrollButtons(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend trackScrollButtons_IMetInst = get_trackScrollButtons_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackScrollButtons_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		trackScrollButtons_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usableParts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usableParts_IMetInst(){
		return ((usableParts_IMetInst != null)
	? (usableParts_IMetInst)
	: (usableParts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usableParts", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long usableParts(){
			final com.apple.jobjc.Invoke.MsgSend usableParts_IMetInst = get_usableParts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usableParts_IMetInst.init(nativeBuffer, this);
		usableParts_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
