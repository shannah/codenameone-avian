package com.apple.jobjc.foundation;

public  class NSAutoreleasePool extends com.apple.jobjc.foundation.NSObject {
	public NSAutoreleasePool(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAutoreleasePool(final NSAutoreleasePool obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	@Override
	protected com.apple.jobjc.NativeObjectLifecycleManager getNativeObjectLifecycleManager() {
		return com.apple.jobjc.NativeObjectLifecycleManager.Nothing.INST;
	}
	private static com.apple.jobjc.Invoke.MsgSend addObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_IMetInst(){
		return ((addObject_IMetInst != null)
	? (addObject_IMetInst)
	: (addObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend addObject_IMetInst = get_addObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drain_IMetInst(){
		return ((drain_IMetInst != null)
	? (drain_IMetInst)
	: (drain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drain", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void drain(){
			final com.apple.jobjc.Invoke.MsgSend drain_IMetInst = get_drain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drain_IMetInst.init(nativeBuffer, this);
		drain_IMetInst.invoke(nativeBuffer);
		
		
	}

}
