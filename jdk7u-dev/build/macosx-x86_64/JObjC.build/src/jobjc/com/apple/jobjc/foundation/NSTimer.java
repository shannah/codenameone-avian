package com.apple.jobjc.foundation;

public  class NSTimer extends com.apple.jobjc.foundation.NSObject {
	public NSTimer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTimer(final NSTimer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend fire_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fire_IMetInst(){
		return ((fire_IMetInst != null)
	? (fire_IMetInst)
	: (fire_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fire", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void fire(){
			final com.apple.jobjc.Invoke.MsgSend fire_IMetInst = get_fire_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fire_IMetInst.init(nativeBuffer, this);
		fire_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fireDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fireDate_IMetInst(){
		return ((fireDate_IMetInst != null)
	? (fireDate_IMetInst)
	: (fireDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fireDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate fireDate(){
			final com.apple.jobjc.Invoke.MsgSend fireDate_IMetInst = get_fireDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fireDate_IMetInst.init(nativeBuffer, this);
		fireDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst(){
		return ((initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst != null)
	? (initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst)
	: (initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFireDate:interval:target:selector:userInfo:repeats:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFireDate_interval_target_selector_userInfo_repeats(final com.apple.jobjc.foundation.NSDate date, final double ti, final com.apple.jobjc.ID t, final com.apple.jobjc.SEL s, final com.apple.jobjc.ID ui, final boolean rep){
			final com.apple.jobjc.Invoke.MsgSend initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst = get_initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, t);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, s);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ui);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, rep);
		initWithFireDate_interval_target_selector_userInfo_repeats_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidate_IMetInst(){
		return ((invalidate_IMetInst != null)
	? (invalidate_IMetInst)
	: (invalidate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidate(){
			final com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst = get_invalidate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidate_IMetInst.init(nativeBuffer, this);
		invalidate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValid_IMetInst(){
		return ((isValid_IMetInst != null)
	? (isValid_IMetInst)
	: (isValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValid", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isValid(){
			final com.apple.jobjc.Invoke.MsgSend isValid_IMetInst = get_isValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValid_IMetInst.init(nativeBuffer, this);
		isValid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setFireDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFireDate_IMetInst(){
		return ((setFireDate_IMetInst != null)
	? (setFireDate_IMetInst)
	: (setFireDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFireDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFireDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend setFireDate_IMetInst = get_setFireDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFireDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		setFireDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend timeInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeInterval_IMetInst(){
		return ((timeInterval_IMetInst != null)
	? (timeInterval_IMetInst)
	: (timeInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeInterval(){
			final com.apple.jobjc.Invoke.MsgSend timeInterval_IMetInst = get_timeInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeInterval_IMetInst.init(nativeBuffer, this);
		timeInterval_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userInfo_IMetInst(){
		return ((userInfo_IMetInst != null)
	? (userInfo_IMetInst)
	: (userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T userInfo(){
			final com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst = get_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userInfo_IMetInst.init(nativeBuffer, this);
		userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
