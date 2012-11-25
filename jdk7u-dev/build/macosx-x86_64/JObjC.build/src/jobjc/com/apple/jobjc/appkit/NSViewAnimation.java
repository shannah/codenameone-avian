package com.apple.jobjc.appkit;

public  class NSViewAnimation extends com.apple.jobjc.appkit.NSAnimation {
	public NSViewAnimation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSViewAnimation(final NSViewAnimation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithViewAnimations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithViewAnimations_IMetInst(){
		return ((initWithViewAnimations_IMetInst != null)
	? (initWithViewAnimations_IMetInst)
	: (initWithViewAnimations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithViewAnimations:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithViewAnimations(final com.apple.jobjc.foundation.NSArray viewAnimations){
			final com.apple.jobjc.Invoke.MsgSend initWithViewAnimations_IMetInst = get_initWithViewAnimations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithViewAnimations_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, viewAnimations);
		initWithViewAnimations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setViewAnimations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setViewAnimations_IMetInst(){
		return ((setViewAnimations_IMetInst != null)
	? (setViewAnimations_IMetInst)
	: (setViewAnimations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setViewAnimations:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setViewAnimations(final com.apple.jobjc.foundation.NSArray viewAnimations){
			final com.apple.jobjc.Invoke.MsgSend setViewAnimations_IMetInst = get_setViewAnimations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setViewAnimations_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, viewAnimations);
		setViewAnimations_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewAnimations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewAnimations_IMetInst(){
		return ((viewAnimations_IMetInst != null)
	? (viewAnimations_IMetInst)
	: (viewAnimations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewAnimations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray viewAnimations(){
			final com.apple.jobjc.Invoke.MsgSend viewAnimations_IMetInst = get_viewAnimations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewAnimations_IMetInst.init(nativeBuffer, this);
		viewAnimations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
