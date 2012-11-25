package com.apple.jobjc.appkit;

public  class NSAnimationContextClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAnimationContextClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAnimationContextClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAnimationContextClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend beginGrouping_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginGrouping_CMetInst(){
		return ((beginGrouping_CMetInst != null)
	? (beginGrouping_CMetInst)
	: (beginGrouping_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginGrouping", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginGrouping(){
			final com.apple.jobjc.Invoke.MsgSend beginGrouping_CMetInst = get_beginGrouping_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginGrouping_CMetInst.init(nativeBuffer, this);
		beginGrouping_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentContext_CMetInst(){
		return ((currentContext_CMetInst != null)
	? (currentContext_CMetInst)
	: (currentContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSAnimationContext currentContext(){
			final com.apple.jobjc.Invoke.MsgSend currentContext_CMetInst = get_currentContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentContext_CMetInst.init(nativeBuffer, this);
		currentContext_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSAnimationContext returnValue = (com.apple.jobjc.appkit.NSAnimationContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endGrouping_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endGrouping_CMetInst(){
		return ((endGrouping_CMetInst != null)
	? (endGrouping_CMetInst)
	: (endGrouping_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endGrouping", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endGrouping(){
			final com.apple.jobjc.Invoke.MsgSend endGrouping_CMetInst = get_endGrouping_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endGrouping_CMetInst.init(nativeBuffer, this);
		endGrouping_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runAnimationGroup_completionHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runAnimationGroup_completionHandler_CMetInst(){
		return ((runAnimationGroup_completionHandler_CMetInst != null)
	? (runAnimationGroup_completionHandler_CMetInst)
	: (runAnimationGroup_completionHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runAnimationGroup:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void runAnimationGroup_completionHandler(final Object /* void(^)(NSAnimationContext*) (@, @) */ changes, final Object /* void(^)(void) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend runAnimationGroup_completionHandler_CMetInst = get_runAnimationGroup_completionHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runAnimationGroup_completionHandler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, changes);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		runAnimationGroup_completionHandler_CMetInst.invoke(nativeBuffer);
		
		
	}

}
