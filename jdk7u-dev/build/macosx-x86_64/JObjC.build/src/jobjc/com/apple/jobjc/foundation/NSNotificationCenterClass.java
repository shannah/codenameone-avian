package com.apple.jobjc.foundation;

public  class NSNotificationCenterClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSNotificationCenterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNotificationCenterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNotificationCenterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultCenter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultCenter_CMetInst(){
		return ((defaultCenter_CMetInst != null)
	? (defaultCenter_CMetInst)
	: (defaultCenter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultCenter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultCenter(){
			final com.apple.jobjc.Invoke.MsgSend defaultCenter_CMetInst = get_defaultCenter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultCenter_CMetInst.init(nativeBuffer, this);
		defaultCenter_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
