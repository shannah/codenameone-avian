package com.apple.jobjc.appkit;

public  class NSSliderCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSSliderCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSliderCell(final NSSliderCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsTickMarkValuesOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsTickMarkValuesOnly_IMetInst(){
		return ((allowsTickMarkValuesOnly_IMetInst != null)
	? (allowsTickMarkValuesOnly_IMetInst)
	: (allowsTickMarkValuesOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsTickMarkValuesOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsTickMarkValuesOnly(){
			final com.apple.jobjc.Invoke.MsgSend allowsTickMarkValuesOnly_IMetInst = get_allowsTickMarkValuesOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsTickMarkValuesOnly_IMetInst.init(nativeBuffer, this);
		allowsTickMarkValuesOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend altIncrementValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_altIncrementValue_IMetInst(){
		return ((altIncrementValue_IMetInst != null)
	? (altIncrementValue_IMetInst)
	: (altIncrementValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "altIncrementValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double altIncrementValue(){
			final com.apple.jobjc.Invoke.MsgSend altIncrementValue_IMetInst = get_altIncrementValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		altIncrementValue_IMetInst.init(nativeBuffer, this);
		altIncrementValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend closestTickMarkValueToValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closestTickMarkValueToValue_IMetInst(){
		return ((closestTickMarkValueToValue_IMetInst != null)
	? (closestTickMarkValueToValue_IMetInst)
	: (closestTickMarkValueToValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closestTickMarkValueToValue:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double closestTickMarkValueToValue(final double value){
			final com.apple.jobjc.Invoke.MsgSend closestTickMarkValueToValue_IMetInst = get_closestTickMarkValueToValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closestTickMarkValueToValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, value);
		closestTickMarkValueToValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBarInside_flipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBarInside_flipped_IMetInst(){
		return ((drawBarInside_flipped_IMetInst != null)
	? (drawBarInside_flipped_IMetInst)
	: (drawBarInside_flipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBarInside:flipped:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void drawBarInside_flipped(final com.apple.jobjc.foundation.NSRect aRect, final boolean flipped){
			final com.apple.jobjc.Invoke.MsgSend drawBarInside_flipped_IMetInst = get_drawBarInside_flipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBarInside_flipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
		drawBarInside_flipped_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend drawKnobVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawKnobVoid_IMetInst(){
		return ((drawKnobVoid_IMetInst != null)
	? (drawKnobVoid_IMetInst)
	: (drawKnobVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawKnob:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawKnobVoid(final com.apple.jobjc.foundation.NSRect knobRect){
			final com.apple.jobjc.Invoke.MsgSend drawKnobVoid_IMetInst = get_drawKnobVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawKnobVoid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, knobRect);
		drawKnobVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfTickMarkAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfTickMarkAtPoint_IMetInst(){
		return ((indexOfTickMarkAtPoint_IMetInst != null)
	? (indexOfTickMarkAtPoint_IMetInst)
	: (indexOfTickMarkAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfTickMarkAtPoint:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long indexOfTickMarkAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend indexOfTickMarkAtPoint_IMetInst = get_indexOfTickMarkAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfTickMarkAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		indexOfTickMarkAtPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVertical_IMetInst(){
		return ((isVertical_IMetInst != null)
	? (isVertical_IMetInst)
	: (isVertical_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVertical", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long isVertical(){
			final com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst = get_isVertical_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVertical_IMetInst.init(nativeBuffer, this);
		isVertical_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knobRectFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knobRectFlipped_IMetInst(){
		return ((knobRectFlipped_IMetInst != null)
	? (knobRectFlipped_IMetInst)
	: (knobRectFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knobRectFlipped:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect knobRectFlipped(final boolean flipped){
			final com.apple.jobjc.Invoke.MsgSend knobRectFlipped_IMetInst = get_knobRectFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knobRectFlipped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flipped);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		knobRectFlipped_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knobThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knobThickness_IMetInst(){
		return ((knobThickness_IMetInst != null)
	? (knobThickness_IMetInst)
	: (knobThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knobThickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double knobThickness(){
			final com.apple.jobjc.Invoke.MsgSend knobThickness_IMetInst = get_knobThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knobThickness_IMetInst.init(nativeBuffer, this);
		knobThickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxValue_IMetInst(){
		return ((maxValue_IMetInst != null)
	? (maxValue_IMetInst)
	: (maxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double maxValue(){
			final com.apple.jobjc.Invoke.MsgSend maxValue_IMetInst = get_maxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxValue_IMetInst.init(nativeBuffer, this);
		maxValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minValue_IMetInst(){
		return ((minValue_IMetInst != null)
	? (minValue_IMetInst)
	: (minValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double minValue(){
			final com.apple.jobjc.Invoke.MsgSend minValue_IMetInst = get_minValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minValue_IMetInst.init(nativeBuffer, this);
		minValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfTickMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfTickMarks_IMetInst(){
		return ((numberOfTickMarks_IMetInst != null)
	? (numberOfTickMarks_IMetInst)
	: (numberOfTickMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfTickMarks", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfTickMarks(){
			final com.apple.jobjc.Invoke.MsgSend numberOfTickMarks_IMetInst = get_numberOfTickMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfTickMarks_IMetInst.init(nativeBuffer, this);
		numberOfTickMarks_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectOfTickMarkAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectOfTickMarkAtIndex_IMetInst(){
		return ((rectOfTickMarkAtIndex_IMetInst != null)
	? (rectOfTickMarkAtIndex_IMetInst)
	: (rectOfTickMarkAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectOfTickMarkAtIndex:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect rectOfTickMarkAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend rectOfTickMarkAtIndex_IMetInst = get_rectOfTickMarkAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectOfTickMarkAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectOfTickMarkAtIndex_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsTickMarkValuesOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsTickMarkValuesOnly_IMetInst(){
		return ((setAllowsTickMarkValuesOnly_IMetInst != null)
	? (setAllowsTickMarkValuesOnly_IMetInst)
	: (setAllowsTickMarkValuesOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsTickMarkValuesOnly:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsTickMarkValuesOnly(final boolean yorn){
			final com.apple.jobjc.Invoke.MsgSend setAllowsTickMarkValuesOnly_IMetInst = get_setAllowsTickMarkValuesOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsTickMarkValuesOnly_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yorn);
		setAllowsTickMarkValuesOnly_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAltIncrementValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAltIncrementValue_IMetInst(){
		return ((setAltIncrementValue_IMetInst != null)
	? (setAltIncrementValue_IMetInst)
	: (setAltIncrementValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAltIncrementValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setAltIncrementValue(final double incValue){
			final com.apple.jobjc.Invoke.MsgSend setAltIncrementValue_IMetInst = get_setAltIncrementValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAltIncrementValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, incValue);
		setAltIncrementValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKnobThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKnobThickness_IMetInst(){
		return ((setKnobThickness_IMetInst != null)
	? (setKnobThickness_IMetInst)
	: (setKnobThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKnobThickness:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setKnobThickness(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setKnobThickness_IMetInst = get_setKnobThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKnobThickness_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setKnobThickness_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxValue_IMetInst(){
		return ((setMaxValue_IMetInst != null)
	? (setMaxValue_IMetInst)
	: (setMaxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMaxValue(final double aDouble){
			final com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst = get_setMaxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, aDouble);
		setMaxValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinValue_IMetInst(){
		return ((setMinValue_IMetInst != null)
	? (setMinValue_IMetInst)
	: (setMinValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMinValue(final double aDouble){
			final com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst = get_setMinValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, aDouble);
		setMinValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberOfTickMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberOfTickMarks_IMetInst(){
		return ((setNumberOfTickMarks_IMetInst != null)
	? (setNumberOfTickMarks_IMetInst)
	: (setNumberOfTickMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberOfTickMarks:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setNumberOfTickMarks(final long count){
			final com.apple.jobjc.Invoke.MsgSend setNumberOfTickMarks_IMetInst = get_setNumberOfTickMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberOfTickMarks_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		setNumberOfTickMarks_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSliderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSliderType_IMetInst(){
		return ((setSliderType_IMetInst != null)
	? (setSliderType_IMetInst)
	: (setSliderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSliderType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setSliderType(final long sliderType){
			final com.apple.jobjc.Invoke.MsgSend setSliderType_IMetInst = get_setSliderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSliderType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, sliderType);
		setSliderType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTickMarkPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTickMarkPosition_IMetInst(){
		return ((setTickMarkPosition_IMetInst != null)
	? (setTickMarkPosition_IMetInst)
	: (setTickMarkPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTickMarkPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTickMarkPosition(final long position){
			final com.apple.jobjc.Invoke.MsgSend setTickMarkPosition_IMetInst = get_setTickMarkPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTickMarkPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, position);
		setTickMarkPosition_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTitleCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleCell_IMetInst(){
		return ((setTitleCell_IMetInst != null)
	? (setTitleCell_IMetInst)
	: (setTitleCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleCell(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend setTitleCell_IMetInst = get_setTitleCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		setTitleCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleColor_IMetInst(){
		return ((setTitleColor_IMetInst != null)
	? (setTitleColor_IMetInst)
	: (setTitleColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleColor(final com.apple.jobjc.appkit.NSColor newColor){
			final com.apple.jobjc.Invoke.MsgSend setTitleColor_IMetInst = get_setTitleColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newColor);
		setTitleColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleFont_IMetInst(){
		return ((setTitleFont_IMetInst != null)
	? (setTitleFont_IMetInst)
	: (setTitleFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst = get_setTitleFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setTitleFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sliderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sliderType_IMetInst(){
		return ((sliderType_IMetInst != null)
	? (sliderType_IMetInst)
	: (sliderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sliderType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long sliderType(){
			final com.apple.jobjc.Invoke.MsgSend sliderType_IMetInst = get_sliderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sliderType_IMetInst.init(nativeBuffer, this);
		sliderType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tickMarkPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tickMarkPosition_IMetInst(){
		return ((tickMarkPosition_IMetInst != null)
	? (tickMarkPosition_IMetInst)
	: (tickMarkPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tickMarkPosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tickMarkPosition(){
			final com.apple.jobjc.Invoke.MsgSend tickMarkPosition_IMetInst = get_tickMarkPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tickMarkPosition_IMetInst.init(nativeBuffer, this);
		tickMarkPosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tickMarkValueAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tickMarkValueAtIndex_IMetInst(){
		return ((tickMarkValueAtIndex_IMetInst != null)
	? (tickMarkValueAtIndex_IMetInst)
	: (tickMarkValueAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tickMarkValueAtIndex:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double tickMarkValueAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend tickMarkValueAtIndex_IMetInst = get_tickMarkValueAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tickMarkValueAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		tickMarkValueAtIndex_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend titleCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleCell_IMetInst(){
		return ((titleCell_IMetInst != null)
	? (titleCell_IMetInst)
	: (titleCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T titleCell(){
			final com.apple.jobjc.Invoke.MsgSend titleCell_IMetInst = get_titleCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleCell_IMetInst.init(nativeBuffer, this);
		titleCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleColor_IMetInst(){
		return ((titleColor_IMetInst != null)
	? (titleColor_IMetInst)
	: (titleColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor titleColor(){
			final com.apple.jobjc.Invoke.MsgSend titleColor_IMetInst = get_titleColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleColor_IMetInst.init(nativeBuffer, this);
		titleColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleFont_IMetInst(){
		return ((titleFont_IMetInst != null)
	? (titleFont_IMetInst)
	: (titleFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont titleFont(){
			final com.apple.jobjc.Invoke.MsgSend titleFont_IMetInst = get_titleFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleFont_IMetInst.init(nativeBuffer, this);
		titleFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trackRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackRect_IMetInst(){
		return ((trackRect_IMetInst != null)
	? (trackRect_IMetInst)
	: (trackRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect trackRect(){
			final com.apple.jobjc.Invoke.MsgSend trackRect_IMetInst = get_trackRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		trackRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
