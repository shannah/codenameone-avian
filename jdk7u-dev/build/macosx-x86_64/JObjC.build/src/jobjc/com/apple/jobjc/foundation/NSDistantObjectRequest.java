package com.apple.jobjc.foundation;

public  class NSDistantObjectRequest extends com.apple.jobjc.foundation.NSObject {
	public NSDistantObjectRequest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDistantObjectRequest(final NSDistantObjectRequest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend connection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_IMetInst(){
		return ((connection_IMetInst != null)
	? (connection_IMetInst)
	: (connection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSConnection connection(){
			final com.apple.jobjc.Invoke.MsgSend connection_IMetInst = get_connection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_IMetInst.init(nativeBuffer, this);
		connection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSConnection returnValue = (com.apple.jobjc.foundation.NSConnection) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend conversation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_conversation_IMetInst(){
		return ((conversation_IMetInst != null)
	? (conversation_IMetInst)
	: (conversation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "conversation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T conversation(){
			final com.apple.jobjc.Invoke.MsgSend conversation_IMetInst = get_conversation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		conversation_IMetInst.init(nativeBuffer, this);
		conversation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invocation_IMetInst(){
		return ((invocation_IMetInst != null)
	? (invocation_IMetInst)
	: (invocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invocation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSInvocation invocation(){
			final com.apple.jobjc.Invoke.MsgSend invocation_IMetInst = get_invocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invocation_IMetInst.init(nativeBuffer, this);
		invocation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSInvocation returnValue = (com.apple.jobjc.foundation.NSInvocation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replyWithException_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replyWithException_IMetInst(){
		return ((replyWithException_IMetInst != null)
	? (replyWithException_IMetInst)
	: (replyWithException_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replyWithException:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replyWithException(final com.apple.jobjc.foundation.NSException exception){
			final com.apple.jobjc.Invoke.MsgSend replyWithException_IMetInst = get_replyWithException_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replyWithException_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, exception);
		replyWithException_IMetInst.invoke(nativeBuffer);
		
		
	}

}
