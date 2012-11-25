package com.apple.jobjc.appkit;

public  class NSAnimationContext extends com.apple.jobjc.foundation.NSObject {
	public NSAnimationContext(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAnimationContext(final NSAnimationContext obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsImplicitAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsImplicitAnimation_IMetInst(){
		return ((allowsImplicitAnimation_IMetInst != null)
	? (allowsImplicitAnimation_IMetInst)
	: (allowsImplicitAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsImplicitAnimation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsImplicitAnimation(){
			final com.apple.jobjc.Invoke.MsgSend allowsImplicitAnimation_IMetInst = get_allowsImplicitAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsImplicitAnimation_IMetInst.init(nativeBuffer, this);
		allowsImplicitAnimation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completionHandler_IMetInst(){
		return ((completionHandler_IMetInst != null)
	? (completionHandler_IMetInst)
	: (completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completionHandler", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(void) (@, @) */ completionHandler(){
			final com.apple.jobjc.Invoke.MsgSend completionHandler_IMetInst = get_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completionHandler_IMetInst.init(nativeBuffer, this);
		completionHandler_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(void) (@, @) */ returnValue = (Object /* void(^)(void) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setAllowsImplicitAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsImplicitAnimation_IMetInst(){
		return ((setAllowsImplicitAnimation_IMetInst != null)
	? (setAllowsImplicitAnimation_IMetInst)
	: (setAllowsImplicitAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsImplicitAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsImplicitAnimation(final boolean allowsImplicitAnimation){
			final com.apple.jobjc.Invoke.MsgSend setAllowsImplicitAnimation_IMetInst = get_setAllowsImplicitAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsImplicitAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowsImplicitAnimation);
		setAllowsImplicitAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompletionHandler_IMetInst(){
		return ((setCompletionHandler_IMetInst != null)
	? (setCompletionHandler_IMetInst)
	: (setCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setCompletionHandler(final Object /* void(^)(void) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend setCompletionHandler_IMetInst = get_setCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		setCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTimingFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTimingFunction_IMetInst(){
		return ((setTimingFunction_IMetInst != null)
	? (setTimingFunction_IMetInst)
	: (setTimingFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTimingFunction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setTimingFunction(final Object /* CAMediaTimingFunction* (@, @) */ timingFunction){
			final com.apple.jobjc.Invoke.MsgSend setTimingFunction_IMetInst = get_setTimingFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTimingFunction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, timingFunction);
		setTimingFunction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend timingFunction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timingFunction_IMetInst(){
		return ((timingFunction_IMetInst != null)
	? (timingFunction_IMetInst)
	: (timingFunction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timingFunction", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CAMediaTimingFunction* (@, @) */ timingFunction(){
			final com.apple.jobjc.Invoke.MsgSend timingFunction_IMetInst = get_timingFunction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timingFunction_IMetInst.init(nativeBuffer, this);
		timingFunction_IMetInst.invoke(nativeBuffer);
		final Object /* CAMediaTimingFunction* (@, @) */ returnValue = (Object /* CAMediaTimingFunction* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
