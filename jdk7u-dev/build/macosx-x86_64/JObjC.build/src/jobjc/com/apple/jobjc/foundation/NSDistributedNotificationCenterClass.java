package com.apple.jobjc.foundation;

public  class NSDistributedNotificationCenterClass extends com.apple.jobjc.foundation.NSNotificationCenterClass {
	public NSDistributedNotificationCenterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDistributedNotificationCenterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDistributedNotificationCenterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend notificationCenterForType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notificationCenterForType_CMetInst(){
		return ((notificationCenterForType_CMetInst != null)
	? (notificationCenterForType_CMetInst)
	: (notificationCenterForType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notificationCenterForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistributedNotificationCenter notificationCenterForType(final com.apple.jobjc.foundation.NSString notificationCenterType){
			final com.apple.jobjc.Invoke.MsgSend notificationCenterForType_CMetInst = get_notificationCenterForType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notificationCenterForType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notificationCenterType);
		notificationCenterForType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistributedNotificationCenter returnValue = (com.apple.jobjc.foundation.NSDistributedNotificationCenter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
