package com.apple.jobjc.foundation;

public  class NSNotification extends com.apple.jobjc.foundation.NSObject {
	public NSNotification(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNotification(final NSNotification obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_object_IMetInst(){
		return ((object_IMetInst != null)
	? (object_IMetInst)
	: (object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "object", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T object(){
			final com.apple.jobjc.Invoke.MsgSend object_IMetInst = get_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		object_IMetInst.init(nativeBuffer, this);
		object_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userInfo_IMetInst(){
		return ((userInfo_IMetInst != null)
	? (userInfo_IMetInst)
	: (userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary userInfo(){
			final com.apple.jobjc.Invoke.MsgSend userInfo_IMetInst = get_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userInfo_IMetInst.init(nativeBuffer, this);
		userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
