package com.apple.jobjc.appkit;

public  class NSAnimation extends com.apple.jobjc.foundation.NSObject {
	public NSAnimation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAnimation(final NSAnimation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addProgressMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addProgressMark_IMetInst(){
		return ((addProgressMark_IMetInst != null)
	? (addProgressMark_IMetInst)
	: (addProgressMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addProgressMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void addProgressMark(final float progressMark){
			final com.apple.jobjc.Invoke.MsgSend addProgressMark_IMetInst = get_addProgressMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addProgressMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, progressMark);
		addProgressMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend animationBlockingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationBlockingMode_IMetInst(){
		return ((animationBlockingMode_IMetInst != null)
	? (animationBlockingMode_IMetInst)
	: (animationBlockingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationBlockingMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long animationBlockingMode(){
			final com.apple.jobjc.Invoke.MsgSend animationBlockingMode_IMetInst = get_animationBlockingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationBlockingMode_IMetInst.init(nativeBuffer, this);
		animationBlockingMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animationCurve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationCurve_IMetInst(){
		return ((animationCurve_IMetInst != null)
	? (animationCurve_IMetInst)
	: (animationCurve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationCurve", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long animationCurve(){
			final com.apple.jobjc.Invoke.MsgSend animationCurve_IMetInst = get_animationCurve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationCurve_IMetInst.init(nativeBuffer, this);
		animationCurve_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clearStartAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearStartAnimation_IMetInst(){
		return ((clearStartAnimation_IMetInst != null)
	? (clearStartAnimation_IMetInst)
	: (clearStartAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearStartAnimation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void clearStartAnimation(){
			final com.apple.jobjc.Invoke.MsgSend clearStartAnimation_IMetInst = get_clearStartAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearStartAnimation_IMetInst.init(nativeBuffer, this);
		clearStartAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend clearStopAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearStopAnimation_IMetInst(){
		return ((clearStopAnimation_IMetInst != null)
	? (clearStopAnimation_IMetInst)
	: (clearStopAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearStopAnimation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void clearStopAnimation(){
			final com.apple.jobjc.Invoke.MsgSend clearStopAnimation_IMetInst = get_clearStopAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearStopAnimation_IMetInst.init(nativeBuffer, this);
		clearStopAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentProgress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentProgress_IMetInst(){
		return ((currentProgress_IMetInst != null)
	? (currentProgress_IMetInst)
	: (currentProgress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentProgress", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float currentProgress(){
			final com.apple.jobjc.Invoke.MsgSend currentProgress_IMetInst = get_currentProgress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentProgress_IMetInst.init(nativeBuffer, this);
		currentProgress_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentValue_IMetInst(){
		return ((currentValue_IMetInst != null)
	? (currentValue_IMetInst)
	: (currentValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentValue", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float currentValue(){
			final com.apple.jobjc.Invoke.MsgSend currentValue_IMetInst = get_currentValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentValue_IMetInst.init(nativeBuffer, this);
		currentValue_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend duration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duration_IMetInst(){
		return ((duration_IMetInst != null)
	? (duration_IMetInst)
	: (duration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duration", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double duration(){
			final com.apple.jobjc.Invoke.MsgSend duration_IMetInst = get_duration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duration_IMetInst.init(nativeBuffer, this);
		duration_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameRate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameRate_IMetInst(){
		return ((frameRate_IMetInst != null)
	? (frameRate_IMetInst)
	: (frameRate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameRate", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float frameRate(){
			final com.apple.jobjc.Invoke.MsgSend frameRate_IMetInst = get_frameRate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameRate_IMetInst.init(nativeBuffer, this);
		frameRate_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDuration_animationCurve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDuration_animationCurve_IMetInst(){
		return ((initWithDuration_animationCurve_IMetInst != null)
	? (initWithDuration_animationCurve_IMetInst)
	: (initWithDuration_animationCurve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDuration:animationCurve:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDuration_animationCurve(final double duration, final long animationCurve){
			final com.apple.jobjc.Invoke.MsgSend initWithDuration_animationCurve_IMetInst = get_initWithDuration_animationCurve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDuration_animationCurve_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, duration);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationCurve);
		initWithDuration_animationCurve_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAnimating_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAnimating_IMetInst(){
		return ((isAnimating_IMetInst != null)
	? (isAnimating_IMetInst)
	: (isAnimating_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAnimating", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAnimating(){
			final com.apple.jobjc.Invoke.MsgSend isAnimating_IMetInst = get_isAnimating_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAnimating_IMetInst.init(nativeBuffer, this);
		isAnimating_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend progressMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_progressMarks_IMetInst(){
		return ((progressMarks_IMetInst != null)
	? (progressMarks_IMetInst)
	: (progressMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "progressMarks", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray progressMarks(){
			final com.apple.jobjc.Invoke.MsgSend progressMarks_IMetInst = get_progressMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		progressMarks_IMetInst.init(nativeBuffer, this);
		progressMarks_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeProgressMark_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeProgressMark_IMetInst(){
		return ((removeProgressMark_IMetInst != null)
	? (removeProgressMark_IMetInst)
	: (removeProgressMark_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeProgressMark:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void removeProgressMark(final float progressMark){
			final com.apple.jobjc.Invoke.MsgSend removeProgressMark_IMetInst = get_removeProgressMark_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeProgressMark_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, progressMark);
		removeProgressMark_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runLoopModesForAnimating_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runLoopModesForAnimating_IMetInst(){
		return ((runLoopModesForAnimating_IMetInst != null)
	? (runLoopModesForAnimating_IMetInst)
	: (runLoopModesForAnimating_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runLoopModesForAnimating", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray runLoopModesForAnimating(){
			final com.apple.jobjc.Invoke.MsgSend runLoopModesForAnimating_IMetInst = get_runLoopModesForAnimating_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runLoopModesForAnimating_IMetInst.init(nativeBuffer, this);
		runLoopModesForAnimating_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimationBlockingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimationBlockingMode_IMetInst(){
		return ((setAnimationBlockingMode_IMetInst != null)
	? (setAnimationBlockingMode_IMetInst)
	: (setAnimationBlockingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimationBlockingMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAnimationBlockingMode(final long animationBlockingMode){
			final com.apple.jobjc.Invoke.MsgSend setAnimationBlockingMode_IMetInst = get_setAnimationBlockingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimationBlockingMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationBlockingMode);
		setAnimationBlockingMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimationCurve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimationCurve_IMetInst(){
		return ((setAnimationCurve_IMetInst != null)
	? (setAnimationCurve_IMetInst)
	: (setAnimationCurve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimationCurve:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAnimationCurve(final long curve){
			final com.apple.jobjc.Invoke.MsgSend setAnimationCurve_IMetInst = get_setAnimationCurve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimationCurve_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, curve);
		setAnimationCurve_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentProgress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentProgress_IMetInst(){
		return ((setCurrentProgress_IMetInst != null)
	? (setCurrentProgress_IMetInst)
	: (setCurrentProgress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentProgress:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setCurrentProgress(final float progress){
			final com.apple.jobjc.Invoke.MsgSend setCurrentProgress_IMetInst = get_setCurrentProgress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentProgress_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, progress);
		setCurrentProgress_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setDuration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDuration_IMetInst(){
		return ((setDuration_IMetInst != null)
	? (setDuration_IMetInst)
	: (setDuration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDuration:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setDuration(final double duration){
			final com.apple.jobjc.Invoke.MsgSend setDuration_IMetInst = get_setDuration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDuration_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, duration);
		setDuration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameRate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameRate_IMetInst(){
		return ((setFrameRate_IMetInst != null)
	? (setFrameRate_IMetInst)
	: (setFrameRate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameRate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setFrameRate(final float framesPerSecond){
			final com.apple.jobjc.Invoke.MsgSend setFrameRate_IMetInst = get_setFrameRate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameRate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, framesPerSecond);
		setFrameRate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setProgressMarks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProgressMarks_IMetInst(){
		return ((setProgressMarks_IMetInst != null)
	? (setProgressMarks_IMetInst)
	: (setProgressMarks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProgressMarks:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setProgressMarks(final com.apple.jobjc.foundation.NSArray progressMarks){
			final com.apple.jobjc.Invoke.MsgSend setProgressMarks_IMetInst = get_setProgressMarks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProgressMarks_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, progressMarks);
		setProgressMarks_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startAnimation_IMetInst(){
		return ((startAnimation_IMetInst != null)
	? (startAnimation_IMetInst)
	: (startAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startAnimation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void startAnimation(){
			final com.apple.jobjc.Invoke.MsgSend startAnimation_IMetInst = get_startAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startAnimation_IMetInst.init(nativeBuffer, this);
		startAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startWhenAnimation_reachesProgress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startWhenAnimation_reachesProgress_IMetInst(){
		return ((startWhenAnimation_reachesProgress_IMetInst != null)
	? (startWhenAnimation_reachesProgress_IMetInst)
	: (startWhenAnimation_reachesProgress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startWhenAnimation:reachesProgress:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void startWhenAnimation_reachesProgress(final com.apple.jobjc.appkit.NSAnimation animation, final float startProgress){
			final com.apple.jobjc.Invoke.MsgSend startWhenAnimation_reachesProgress_IMetInst = get_startWhenAnimation_reachesProgress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startWhenAnimation_reachesProgress_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, startProgress);
		startWhenAnimation_reachesProgress_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopAnimation_IMetInst(){
		return ((stopAnimation_IMetInst != null)
	? (stopAnimation_IMetInst)
	: (stopAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopAnimation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopAnimation(){
			final com.apple.jobjc.Invoke.MsgSend stopAnimation_IMetInst = get_stopAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopAnimation_IMetInst.init(nativeBuffer, this);
		stopAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopWhenAnimation_reachesProgress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopWhenAnimation_reachesProgress_IMetInst(){
		return ((stopWhenAnimation_reachesProgress_IMetInst != null)
	? (stopWhenAnimation_reachesProgress_IMetInst)
	: (stopWhenAnimation_reachesProgress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopWhenAnimation:reachesProgress:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void stopWhenAnimation_reachesProgress(final com.apple.jobjc.appkit.NSAnimation animation, final float stopProgress){
			final com.apple.jobjc.Invoke.MsgSend stopWhenAnimation_reachesProgress_IMetInst = get_stopWhenAnimation_reachesProgress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopWhenAnimation_reachesProgress_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, animation);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, stopProgress);
		stopWhenAnimation_reachesProgress_IMetInst.invoke(nativeBuffer);
		
		
	}

}
