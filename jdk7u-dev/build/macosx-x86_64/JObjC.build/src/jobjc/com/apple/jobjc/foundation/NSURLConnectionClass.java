package com.apple.jobjc.foundation;

public  class NSURLConnectionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLConnectionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLConnectionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLConnectionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canHandleRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canHandleRequest_CMetInst(){
		return ((canHandleRequest_CMetInst != null)
	? (canHandleRequest_CMetInst)
	: (canHandleRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canHandleRequest:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canHandleRequest(final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend canHandleRequest_CMetInst = get_canHandleRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canHandleRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		canHandleRequest_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionWithRequest_delegate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionWithRequest_delegate_CMetInst(){
		return ((connectionWithRequest_delegate_CMetInst != null)
	? (connectionWithRequest_delegate_CMetInst)
	: (connectionWithRequest_delegate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionWithRequest:delegate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLConnection connectionWithRequest_delegate(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend connectionWithRequest_delegate_CMetInst = get_connectionWithRequest_delegate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionWithRequest_delegate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		connectionWithRequest_delegate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLConnection returnValue = (com.apple.jobjc.foundation.NSURLConnection) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendAsynchronousRequest_queue_completionHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAsynchronousRequest_queue_completionHandler_CMetInst(){
		return ((sendAsynchronousRequest_queue_completionHandler_CMetInst != null)
	? (sendAsynchronousRequest_queue_completionHandler_CMetInst)
	: (sendAsynchronousRequest_queue_completionHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAsynchronousRequest:queue:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void sendAsynchronousRequest_queue_completionHandler(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.foundation.NSOperationQueue queue, final Object /* void(^)(NSURLResponse*,NSData*,NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend sendAsynchronousRequest_queue_completionHandler_CMetInst = get_sendAsynchronousRequest_queue_completionHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAsynchronousRequest_queue_completionHandler_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, queue);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		sendAsynchronousRequest_queue_completionHandler_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendSynchronousRequest_returningResponse_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendSynchronousRequest_returningResponse_error_CMetInst(){
		return ((sendSynchronousRequest_returningResponse_error_CMetInst != null)
	? (sendSynchronousRequest_returningResponse_error_CMetInst)
	: (sendSynchronousRequest_returningResponse_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendSynchronousRequest:returningResponse:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData sendSynchronousRequest_returningResponse_error(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSURLResponse> response, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend sendSynchronousRequest_returningResponse_error_CMetInst = get_sendSynchronousRequest_returningResponse_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendSynchronousRequest_returningResponse_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		sendSynchronousRequest_returningResponse_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
