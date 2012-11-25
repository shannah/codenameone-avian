package com.apple.jobjc.appkit;

public  class NSProgressIndicator extends com.apple.jobjc.appkit.NSView {
	public NSProgressIndicator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSProgressIndicator(final NSProgressIndicator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend animate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animate_IMetInst(){
		return ((animate_IMetInst != null)
	? (animate_IMetInst)
	: (animate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void animate(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend animate_IMetInst = get_animate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		animate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animationDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationDelay_IMetInst(){
		return ((animationDelay_IMetInst != null)
	? (animationDelay_IMetInst)
	: (animationDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationDelay", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double animationDelay(){
			final com.apple.jobjc.Invoke.MsgSend animationDelay_IMetInst = get_animationDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationDelay_IMetInst.init(nativeBuffer, this);
		animationDelay_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend incrementBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_incrementBy_IMetInst(){
		return ((incrementBy_IMetInst != null)
	? (incrementBy_IMetInst)
	: (incrementBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "incrementBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void incrementBy(final double delta){
			final com.apple.jobjc.Invoke.MsgSend incrementBy_IMetInst = get_incrementBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		incrementBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delta);
		incrementBy_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend isDisplayedWhenStopped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDisplayedWhenStopped_IMetInst(){
		return ((isDisplayedWhenStopped_IMetInst != null)
	? (isDisplayedWhenStopped_IMetInst)
	: (isDisplayedWhenStopped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDisplayedWhenStopped", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDisplayedWhenStopped(){
			final com.apple.jobjc.Invoke.MsgSend isDisplayedWhenStopped_IMetInst = get_isDisplayedWhenStopped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDisplayedWhenStopped_IMetInst.init(nativeBuffer, this);
		isDisplayedWhenStopped_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isIndeterminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isIndeterminate_IMetInst(){
		return ((isIndeterminate_IMetInst != null)
	? (isIndeterminate_IMetInst)
	: (isIndeterminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isIndeterminate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isIndeterminate(){
			final com.apple.jobjc.Invoke.MsgSend isIndeterminate_IMetInst = get_isIndeterminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isIndeterminate_IMetInst.init(nativeBuffer, this);
		isIndeterminate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setAnimationDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimationDelay_IMetInst(){
		return ((setAnimationDelay_IMetInst != null)
	? (setAnimationDelay_IMetInst)
	: (setAnimationDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimationDelay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setAnimationDelay(final double delay){
			final com.apple.jobjc.Invoke.MsgSend setAnimationDelay_IMetInst = get_setAnimationDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimationDelay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delay);
		setAnimationDelay_IMetInst.invoke(nativeBuffer);
		
		
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

	 public void setControlTint(final long tint){
			final com.apple.jobjc.Invoke.MsgSend setControlTint_IMetInst = get_setControlTint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setControlTint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, tint);
		setControlTint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplayedWhenStopped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplayedWhenStopped_IMetInst(){
		return ((setDisplayedWhenStopped_IMetInst != null)
	? (setDisplayedWhenStopped_IMetInst)
	: (setDisplayedWhenStopped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplayedWhenStopped:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDisplayedWhenStopped(final boolean isDisplayed){
			final com.apple.jobjc.Invoke.MsgSend setDisplayedWhenStopped_IMetInst = get_setDisplayedWhenStopped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplayedWhenStopped_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isDisplayed);
		setDisplayedWhenStopped_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDoubleValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoubleValue_IMetInst(){
		return ((setDoubleValue_IMetInst != null)
	? (setDoubleValue_IMetInst)
	: (setDoubleValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoubleValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setDoubleValue(final double doubleValue){
			final com.apple.jobjc.Invoke.MsgSend setDoubleValue_IMetInst = get_setDoubleValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoubleValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, doubleValue);
		setDoubleValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndeterminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndeterminate_IMetInst(){
		return ((setIndeterminate_IMetInst != null)
	? (setIndeterminate_IMetInst)
	: (setIndeterminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndeterminate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIndeterminate(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIndeterminate_IMetInst = get_setIndeterminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndeterminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIndeterminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxValue_IMetInst(){
		return ((setMaxValue_IMetInst != null)
	? (setMaxValue_IMetInst)
	: (setMaxValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMaxValue(final double newMaximum){
			final com.apple.jobjc.Invoke.MsgSend setMaxValue_IMetInst = get_setMaxValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, newMaximum);
		setMaxValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinValue_IMetInst(){
		return ((setMinValue_IMetInst != null)
	? (setMinValue_IMetInst)
	: (setMinValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setMinValue(final double newMinimum){
			final com.apple.jobjc.Invoke.MsgSend setMinValue_IMetInst = get_setMinValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, newMinimum);
		setMinValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStyle_IMetInst(){
		return ((setStyle_IMetInst != null)
	? (setStyle_IMetInst)
	: (setStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setStyle_IMetInst = get_setStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesThreadedAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesThreadedAnimation_IMetInst(){
		return ((setUsesThreadedAnimation_IMetInst != null)
	? (setUsesThreadedAnimation_IMetInst)
	: (setUsesThreadedAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesThreadedAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesThreadedAnimation(final boolean threadedAnimation){
			final com.apple.jobjc.Invoke.MsgSend setUsesThreadedAnimation_IMetInst = get_setUsesThreadedAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesThreadedAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, threadedAnimation);
		setUsesThreadedAnimation_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend startAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startAnimation_IMetInst(){
		return ((startAnimation_IMetInst != null)
	? (startAnimation_IMetInst)
	: (startAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void startAnimation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend startAnimation_IMetInst = get_startAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		startAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopAnimation_IMetInst(){
		return ((stopAnimation_IMetInst != null)
	? (stopAnimation_IMetInst)
	: (stopAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void stopAnimation(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend stopAnimation_IMetInst = get_stopAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		stopAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend style_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_style_IMetInst(){
		return ((style_IMetInst != null)
	? (style_IMetInst)
	: (style_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "style", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long style(){
			final com.apple.jobjc.Invoke.MsgSend style_IMetInst = get_style_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		style_IMetInst.init(nativeBuffer, this);
		style_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesThreadedAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesThreadedAnimation_IMetInst(){
		return ((usesThreadedAnimation_IMetInst != null)
	? (usesThreadedAnimation_IMetInst)
	: (usesThreadedAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesThreadedAnimation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesThreadedAnimation(){
			final com.apple.jobjc.Invoke.MsgSend usesThreadedAnimation_IMetInst = get_usesThreadedAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesThreadedAnimation_IMetInst.init(nativeBuffer, this);
		usesThreadedAnimation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
