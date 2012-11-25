package com.apple.jobjc.foundation;

public  class NSURLAuthenticationChallenge extends com.apple.jobjc.foundation.NSObject {
	public NSURLAuthenticationChallenge(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLAuthenticationChallenge(final NSURLAuthenticationChallenge obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_error_IMetInst(){
		return ((error_IMetInst != null)
	? (error_IMetInst)
	: (error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "error", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError error(){
			final com.apple.jobjc.Invoke.MsgSend error_IMetInst = get_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		error_IMetInst.init(nativeBuffer, this);
		error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend failureResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_failureResponse_IMetInst(){
		return ((failureResponse_IMetInst != null)
	? (failureResponse_IMetInst)
	: (failureResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "failureResponse", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLResponse failureResponse(){
			final com.apple.jobjc.Invoke.MsgSend failureResponse_IMetInst = get_failureResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		failureResponse_IMetInst.init(nativeBuffer, this);
		failureResponse_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLResponse returnValue = (com.apple.jobjc.foundation.NSURLResponse) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithAuthenticationChallenge_sender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithAuthenticationChallenge_sender_IMetInst(){
		return ((initWithAuthenticationChallenge_sender_IMetInst != null)
	? (initWithAuthenticationChallenge_sender_IMetInst)
	: (initWithAuthenticationChallenge_sender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithAuthenticationChallenge:sender:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithAuthenticationChallenge_sender(final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend initWithAuthenticationChallenge_sender_IMetInst = get_initWithAuthenticationChallenge_sender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithAuthenticationChallenge_sender_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		initWithAuthenticationChallenge_sender_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst(){
		return ((initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst != null)
	? (initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst)
	: (initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender(final com.apple.jobjc.foundation.NSURLProtectionSpace space, final com.apple.jobjc.foundation.NSURLCredential credential, final long previousFailureCount, final com.apple.jobjc.foundation.NSURLResponse response, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst = get_initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, space);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, credential);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, previousFailureCount);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		initWithProtectionSpace_proposedCredential_previousFailureCount_failureResponse_error_sender_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend previousFailureCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_previousFailureCount_IMetInst(){
		return ((previousFailureCount_IMetInst != null)
	? (previousFailureCount_IMetInst)
	: (previousFailureCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "previousFailureCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long previousFailureCount(){
			final com.apple.jobjc.Invoke.MsgSend previousFailureCount_IMetInst = get_previousFailureCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		previousFailureCount_IMetInst.init(nativeBuffer, this);
		previousFailureCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend proposedCredential_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_proposedCredential_IMetInst(){
		return ((proposedCredential_IMetInst != null)
	? (proposedCredential_IMetInst)
	: (proposedCredential_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "proposedCredential", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLCredential proposedCredential(){
			final com.apple.jobjc.Invoke.MsgSend proposedCredential_IMetInst = get_proposedCredential_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		proposedCredential_IMetInst.init(nativeBuffer, this);
		proposedCredential_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLCredential returnValue = (com.apple.jobjc.foundation.NSURLCredential) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend protectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_protectionSpace_IMetInst(){
		return ((protectionSpace_IMetInst != null)
	? (protectionSpace_IMetInst)
	: (protectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "protectionSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLProtectionSpace protectionSpace(){
			final com.apple.jobjc.Invoke.MsgSend protectionSpace_IMetInst = get_protectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		protectionSpace_IMetInst.init(nativeBuffer, this);
		protectionSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLProtectionSpace returnValue = (com.apple.jobjc.foundation.NSURLProtectionSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sender_IMetInst(){
		return ((sender_IMetInst != null)
	? (sender_IMetInst)
	: (sender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sender", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sender(){
			final com.apple.jobjc.Invoke.MsgSend sender_IMetInst = get_sender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sender_IMetInst.init(nativeBuffer, this);
		sender_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
