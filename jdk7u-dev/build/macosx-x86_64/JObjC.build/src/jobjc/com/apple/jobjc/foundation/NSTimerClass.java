package com.apple.jobjc.foundation;

public  class NSTimerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTimerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTimerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTimerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend scheduledTimerWithTimeInterval_invocation_repeats_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduledTimerWithTimeInterval_invocation_repeats_CMetInst(){
		return ((scheduledTimerWithTimeInterval_invocation_repeats_CMetInst != null)
	? (scheduledTimerWithTimeInterval_invocation_repeats_CMetInst)
	: (scheduledTimerWithTimeInterval_invocation_repeats_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduledTimerWithTimeInterval:invocation:repeats:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimer scheduledTimerWithTimeInterval_invocation_repeats(final double ti, final com.apple.jobjc.foundation.NSInvocation invocation, final boolean yesOrNo){
			final com.apple.jobjc.Invoke.MsgSend scheduledTimerWithTimeInterval_invocation_repeats_CMetInst = get_scheduledTimerWithTimeInterval_invocation_repeats_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduledTimerWithTimeInterval_invocation_repeats_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, invocation);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yesOrNo);
		scheduledTimerWithTimeInterval_invocation_repeats_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimer returnValue = (com.apple.jobjc.foundation.NSTimer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst(){
		return ((scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst != null)
	? (scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst)
	: (scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimer scheduledTimerWithTimeInterval_target_selector_userInfo_repeats(final double ti, final com.apple.jobjc.ID aTarget, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID userInfo, final boolean yesOrNo){
			final com.apple.jobjc.Invoke.MsgSend scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst = get_scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTarget);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yesOrNo);
		scheduledTimerWithTimeInterval_target_selector_userInfo_repeats_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimer returnValue = (com.apple.jobjc.foundation.NSTimer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timerWithTimeInterval_invocation_repeats_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timerWithTimeInterval_invocation_repeats_CMetInst(){
		return ((timerWithTimeInterval_invocation_repeats_CMetInst != null)
	? (timerWithTimeInterval_invocation_repeats_CMetInst)
	: (timerWithTimeInterval_invocation_repeats_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timerWithTimeInterval:invocation:repeats:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimer timerWithTimeInterval_invocation_repeats(final double ti, final com.apple.jobjc.foundation.NSInvocation invocation, final boolean yesOrNo){
			final com.apple.jobjc.Invoke.MsgSend timerWithTimeInterval_invocation_repeats_CMetInst = get_timerWithTimeInterval_invocation_repeats_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timerWithTimeInterval_invocation_repeats_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, invocation);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yesOrNo);
		timerWithTimeInterval_invocation_repeats_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimer returnValue = (com.apple.jobjc.foundation.NSTimer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst(){
		return ((timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst != null)
	? (timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst)
	: (timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timerWithTimeInterval:target:selector:userInfo:repeats:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSTimer timerWithTimeInterval_target_selector_userInfo_repeats(final double ti, final com.apple.jobjc.ID aTarget, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID userInfo, final boolean yesOrNo){
			final com.apple.jobjc.Invoke.MsgSend timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst = get_timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTarget);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yesOrNo);
		timerWithTimeInterval_target_selector_userInfo_repeats_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSTimer returnValue = (com.apple.jobjc.foundation.NSTimer) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
