package com.apple.jobjc.foundation;

public  class NSCachedURLResponse extends com.apple.jobjc.foundation.NSObject {
	public NSCachedURLResponse(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCachedURLResponse(final NSCachedURLResponse obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data_IMetInst(){
		return ((data_IMetInst != null)
	? (data_IMetInst)
	: (data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData data(){
			final com.apple.jobjc.Invoke.MsgSend data_IMetInst = get_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data_IMetInst.init(nativeBuffer, this);
		data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithResponse_data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithResponse_data_IMetInst(){
		return ((initWithResponse_data_IMetInst != null)
	? (initWithResponse_data_IMetInst)
	: (initWithResponse_data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithResponse:data:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithResponse_data(final com.apple.jobjc.foundation.NSURLResponse response, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithResponse_data_IMetInst = get_initWithResponse_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithResponse_data_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithResponse_data_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithResponse_data_userInfo_storagePolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithResponse_data_userInfo_storagePolicy_IMetInst(){
		return ((initWithResponse_data_userInfo_storagePolicy_IMetInst != null)
	? (initWithResponse_data_userInfo_storagePolicy_IMetInst)
	: (initWithResponse_data_userInfo_storagePolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithResponse:data:userInfo:storagePolicy:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithResponse_data_userInfo_storagePolicy(final com.apple.jobjc.foundation.NSURLResponse response, final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary userInfo, final long storagePolicy){
			final com.apple.jobjc.Invoke.MsgSend initWithResponse_data_userInfo_storagePolicy_IMetInst = get_initWithResponse_data_userInfo_storagePolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithResponse_data_userInfo_storagePolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, storagePolicy);
		initWithResponse_data_userInfo_storagePolicy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend response_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_response_IMetInst(){
		return ((response_IMetInst != null)
	? (response_IMetInst)
	: (response_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "response", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLResponse response(){
			final com.apple.jobjc.Invoke.MsgSend response_IMetInst = get_response_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		response_IMetInst.init(nativeBuffer, this);
		response_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLResponse returnValue = (com.apple.jobjc.foundation.NSURLResponse) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend storagePolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_storagePolicy_IMetInst(){
		return ((storagePolicy_IMetInst != null)
	? (storagePolicy_IMetInst)
	: (storagePolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "storagePolicy", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long storagePolicy(){
			final com.apple.jobjc.Invoke.MsgSend storagePolicy_IMetInst = get_storagePolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		storagePolicy_IMetInst.init(nativeBuffer, this);
		storagePolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
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
