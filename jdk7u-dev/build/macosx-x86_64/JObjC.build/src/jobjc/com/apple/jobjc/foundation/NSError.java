package com.apple.jobjc.foundation;

public  class NSError extends com.apple.jobjc.foundation.NSObject {
	public NSError(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSError(final NSError obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend code_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_code_IMetInst(){
		return ((code_IMetInst != null)
	? (code_IMetInst)
	: (code_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "code", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long code(){
			final com.apple.jobjc.Invoke.MsgSend code_IMetInst = get_code_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		code_IMetInst.init(nativeBuffer, this);
		code_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend domain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_domain_IMetInst(){
		return ((domain_IMetInst != null)
	? (domain_IMetInst)
	: (domain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "domain", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString domain(){
			final com.apple.jobjc.Invoke.MsgSend domain_IMetInst = get_domain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		domain_IMetInst.init(nativeBuffer, this);
		domain_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend helpAnchor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_helpAnchor_IMetInst(){
		return ((helpAnchor_IMetInst != null)
	? (helpAnchor_IMetInst)
	: (helpAnchor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "helpAnchor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString helpAnchor(){
			final com.apple.jobjc.Invoke.MsgSend helpAnchor_IMetInst = get_helpAnchor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		helpAnchor_IMetInst.init(nativeBuffer, this);
		helpAnchor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDomain_code_userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDomain_code_userInfo_IMetInst(){
		return ((initWithDomain_code_userInfo_IMetInst != null)
	? (initWithDomain_code_userInfo_IMetInst)
	: (initWithDomain_code_userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDomain:code:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDomain_code_userInfo(final com.apple.jobjc.foundation.NSString domain, final long code, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend initWithDomain_code_userInfo_IMetInst = get_initWithDomain_code_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDomain_code_userInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, code);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		initWithDomain_code_userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedDescription_IMetInst(){
		return ((localizedDescription_IMetInst != null)
	? (localizedDescription_IMetInst)
	: (localizedDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedDescription(){
			final com.apple.jobjc.Invoke.MsgSend localizedDescription_IMetInst = get_localizedDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedDescription_IMetInst.init(nativeBuffer, this);
		localizedDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedFailureReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedFailureReason_IMetInst(){
		return ((localizedFailureReason_IMetInst != null)
	? (localizedFailureReason_IMetInst)
	: (localizedFailureReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedFailureReason", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedFailureReason(){
			final com.apple.jobjc.Invoke.MsgSend localizedFailureReason_IMetInst = get_localizedFailureReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedFailureReason_IMetInst.init(nativeBuffer, this);
		localizedFailureReason_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedRecoveryOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedRecoveryOptions_IMetInst(){
		return ((localizedRecoveryOptions_IMetInst != null)
	? (localizedRecoveryOptions_IMetInst)
	: (localizedRecoveryOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedRecoveryOptions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray localizedRecoveryOptions(){
			final com.apple.jobjc.Invoke.MsgSend localizedRecoveryOptions_IMetInst = get_localizedRecoveryOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedRecoveryOptions_IMetInst.init(nativeBuffer, this);
		localizedRecoveryOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedRecoverySuggestion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedRecoverySuggestion_IMetInst(){
		return ((localizedRecoverySuggestion_IMetInst != null)
	? (localizedRecoverySuggestion_IMetInst)
	: (localizedRecoverySuggestion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedRecoverySuggestion", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedRecoverySuggestion(){
			final com.apple.jobjc.Invoke.MsgSend localizedRecoverySuggestion_IMetInst = get_localizedRecoverySuggestion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedRecoverySuggestion_IMetInst.init(nativeBuffer, this);
		localizedRecoverySuggestion_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recoveryAttempter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recoveryAttempter_IMetInst(){
		return ((recoveryAttempter_IMetInst != null)
	? (recoveryAttempter_IMetInst)
	: (recoveryAttempter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recoveryAttempter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T recoveryAttempter(){
			final com.apple.jobjc.Invoke.MsgSend recoveryAttempter_IMetInst = get_recoveryAttempter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recoveryAttempter_IMetInst.init(nativeBuffer, this);
		recoveryAttempter_IMetInst.invoke(nativeBuffer);
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
