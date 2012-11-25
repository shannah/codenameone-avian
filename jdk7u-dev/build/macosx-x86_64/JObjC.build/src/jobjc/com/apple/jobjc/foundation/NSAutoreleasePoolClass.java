package com.apple.jobjc.foundation;

public  class NSAutoreleasePoolClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAutoreleasePoolClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAutoreleasePoolClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAutoreleasePoolClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_CMetInst(){
		return ((addObject_CMetInst != null)
	? (addObject_CMetInst)
	: (addObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend addObject_CMetInst = get_addObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addObject_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showPools_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showPools_CMetInst(){
		return ((showPools_CMetInst != null)
	? (showPools_CMetInst)
	: (showPools_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showPools", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void showPools(){
			final com.apple.jobjc.Invoke.MsgSend showPools_CMetInst = get_showPools_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showPools_CMetInst.init(nativeBuffer, this);
		showPools_CMetInst.invoke(nativeBuffer);
		
		
	}

}
