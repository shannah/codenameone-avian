package com.apple.jobjc.foundation;

public  class NSNotificationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSNotificationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNotificationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNotificationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend notificationWithName_object_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notificationWithName_object_CMetInst(){
		return ((notificationWithName_object_CMetInst != null)
	? (notificationWithName_object_CMetInst)
	: (notificationWithName_object_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notificationWithName:object:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T notificationWithName_object(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend notificationWithName_object_CMetInst = get_notificationWithName_object_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notificationWithName_object_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		notificationWithName_object_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notificationWithName_object_userInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notificationWithName_object_userInfo_CMetInst(){
		return ((notificationWithName_object_userInfo_CMetInst != null)
	? (notificationWithName_object_userInfo_CMetInst)
	: (notificationWithName_object_userInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notificationWithName:object:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T notificationWithName_object_userInfo(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSDictionary aUserInfo){
			final com.apple.jobjc.Invoke.MsgSend notificationWithName_object_userInfo_CMetInst = get_notificationWithName_object_userInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notificationWithName_object_userInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aUserInfo);
		notificationWithName_object_userInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
