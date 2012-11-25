package com.apple.jobjc.foundation;

public  class NSURLProtocol extends com.apple.jobjc.foundation.NSObject {
	public NSURLProtocol(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLProtocol(final NSURLProtocol obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cachedResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cachedResponse_IMetInst(){
		return ((cachedResponse_IMetInst != null)
	? (cachedResponse_IMetInst)
	: (cachedResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cachedResponse", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCachedURLResponse cachedResponse(){
			final com.apple.jobjc.Invoke.MsgSend cachedResponse_IMetInst = get_cachedResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cachedResponse_IMetInst.init(nativeBuffer, this);
		cachedResponse_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCachedURLResponse returnValue = (com.apple.jobjc.foundation.NSCachedURLResponse) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_client_IMetInst(){
		return ((client_IMetInst != null)
	? (client_IMetInst)
	: (client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "client", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T client(){
			final com.apple.jobjc.Invoke.MsgSend client_IMetInst = get_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		client_IMetInst.init(nativeBuffer, this);
		client_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRequest_cachedResponse_client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRequest_cachedResponse_client_IMetInst(){
		return ((initWithRequest_cachedResponse_client_IMetInst != null)
	? (initWithRequest_cachedResponse_client_IMetInst)
	: (initWithRequest_cachedResponse_client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRequest:cachedResponse:client:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRequest_cachedResponse_client(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.foundation.NSCachedURLResponse cachedResponse, final com.apple.jobjc.ID client){
			final com.apple.jobjc.Invoke.MsgSend initWithRequest_cachedResponse_client_IMetInst = get_initWithRequest_cachedResponse_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRequest_cachedResponse_client_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cachedResponse);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		initWithRequest_cachedResponse_client_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend request_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_request_IMetInst(){
		return ((request_IMetInst != null)
	? (request_IMetInst)
	: (request_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "request", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLRequest request(){
			final com.apple.jobjc.Invoke.MsgSend request_IMetInst = get_request_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		request_IMetInst.init(nativeBuffer, this);
		request_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLRequest returnValue = (com.apple.jobjc.foundation.NSURLRequest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startLoading_IMetInst(){
		return ((startLoading_IMetInst != null)
	? (startLoading_IMetInst)
	: (startLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startLoading", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void startLoading(){
			final com.apple.jobjc.Invoke.MsgSend startLoading_IMetInst = get_startLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startLoading_IMetInst.init(nativeBuffer, this);
		startLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopLoading_IMetInst(){
		return ((stopLoading_IMetInst != null)
	? (stopLoading_IMetInst)
	: (stopLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopLoading", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopLoading(){
			final com.apple.jobjc.Invoke.MsgSend stopLoading_IMetInst = get_stopLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopLoading_IMetInst.init(nativeBuffer, this);
		stopLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

}
