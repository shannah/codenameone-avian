package com.apple.jobjc.appkit;

public  class NSLevelIndicator extends com.apple.jobjc.appkit.NSControl {
	public NSLevelIndicator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLevelIndicator(final NSLevelIndicator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend criticalValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_criticalValue_IMetInst(){
		return ((criticalValue_IMetInst != null)
	? (criticalValue_IMetInst)
	: (criticalValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "criticalValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double criticalValue(){
			final com.apple.jobjc.Invoke.MsgSend criticalValue_IMetInst = get_criticalValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		criticalValue_IMetInst.init(nativeBuffer, this);
		criticalValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend numberOfMajorTickMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfMajorTickMarks_IMetInst(){
		return ((numberOfMajorTickMarks_IMetInst != null)
	? (numberOfMajorTickMarks_IMetInst)
	: (numberOfMajorTickMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfMajorTickMarks", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfMajorTickMarks(){
			final com.apple.jobjc.Invoke.MsgSend numberOfMajorTickMarks_IMetInst = get_numberOfMajorTickMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfMajorTickMarks_IMetInst.init(nativeBuffer, this);
		numberOfMajorTickMarks_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setCriticalValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCriticalValue_IMetInst(){
		return ((setCriticalValue_IMetInst != null)
	? (setCriticalValue_IMetInst)
	: (setCriticalValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCriticalValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setCriticalValue(final double criticalValue){
			final com.apple.jobjc.Invoke.MsgSend setCriticalValue_IMetInst = get_setCriticalValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCriticalValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, criticalValue);
		setCriticalValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxValue_IMetInst(){
		return ((setMaxValue_IMetInst != null)
	? (setMaxValue_IMetInst)
	: (setMaxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMaxValue(final double maxValue){
			final com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst = get_setMaxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, maxValue);
		setMaxValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinValue_IMetInst(){
		return ((setMinValue_IMetInst != null)
	? (setMinValue_IMetInst)
	: (setMinValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMinValue(final double minValue){
			final com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst = get_setMinValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, minValue);
		setMinValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberOfMajorTickMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberOfMajorTickMarks_IMetInst(){
		return ((setNumberOfMajorTickMarks_IMetInst != null)
	? (setNumberOfMajorTickMarks_IMetInst)
	: (setNumberOfMajorTickMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberOfMajorTickMarks:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setNumberOfMajorTickMarks(final long count){
			final com.apple.jobjc.Invoke.MsgSend setNumberOfMajorTickMarks_IMetInst = get_setNumberOfMajorTickMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberOfMajorTickMarks_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		setNumberOfMajorTickMarks_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setWarningValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWarningValue_IMetInst(){
		return ((setWarningValue_IMetInst != null)
	? (setWarningValue_IMetInst)
	: (setWarningValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWarningValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setWarningValue(final double warningValue){
			final com.apple.jobjc.Invoke.MsgSend setWarningValue_IMetInst = get_setWarningValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWarningValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, warningValue);
		setWarningValue_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend warningValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_warningValue_IMetInst(){
		return ((warningValue_IMetInst != null)
	? (warningValue_IMetInst)
	: (warningValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "warningValue", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double warningValue(){
			final com.apple.jobjc.Invoke.MsgSend warningValue_IMetInst = get_warningValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		warningValue_IMetInst.init(nativeBuffer, this);
		warningValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
