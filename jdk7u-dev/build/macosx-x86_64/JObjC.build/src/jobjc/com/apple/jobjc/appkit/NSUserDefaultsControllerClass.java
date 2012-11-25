package com.apple.jobjc.appkit;

public  class NSUserDefaultsControllerClass extends com.apple.jobjc.appkit.NSControllerClass {
	public NSUserDefaultsControllerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUserDefaultsControllerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUserDefaultsControllerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedUserDefaultsController_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedUserDefaultsController_CMetInst(){
		return ((sharedUserDefaultsController_CMetInst != null)
	? (sharedUserDefaultsController_CMetInst)
	: (sharedUserDefaultsController_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedUserDefaultsController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedUserDefaultsController(){
			final com.apple.jobjc.Invoke.MsgSend sharedUserDefaultsController_CMetInst = get_sharedUserDefaultsController_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedUserDefaultsController_CMetInst.init(nativeBuffer, this);
		sharedUserDefaultsController_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
