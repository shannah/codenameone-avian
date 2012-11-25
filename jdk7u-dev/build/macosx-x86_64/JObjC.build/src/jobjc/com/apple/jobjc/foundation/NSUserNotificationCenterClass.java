package com.apple.jobjc.foundation;

public  class NSUserNotificationCenterClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSUserNotificationCenterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUserNotificationCenterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUserNotificationCenterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultUserNotificationCenter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultUserNotificationCenter_CMetInst(){
		return ((defaultUserNotificationCenter_CMetInst != null)
	? (defaultUserNotificationCenter_CMetInst)
	: (defaultUserNotificationCenter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultUserNotificationCenter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUserNotificationCenter defaultUserNotificationCenter(){
			final com.apple.jobjc.Invoke.MsgSend defaultUserNotificationCenter_CMetInst = get_defaultUserNotificationCenter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultUserNotificationCenter_CMetInst.init(nativeBuffer, this);
		defaultUserNotificationCenter_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUserNotificationCenter returnValue = (com.apple.jobjc.foundation.NSUserNotificationCenter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
