package com.apple.jobjc.foundation;

public  class NSException extends com.apple.jobjc.foundation.NSObject {
	public NSException(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSException(final NSException obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend callStackReturnAddresses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_callStackReturnAddresses_IMetInst(){
		return ((callStackReturnAddresses_IMetInst != null)
	? (callStackReturnAddresses_IMetInst)
	: (callStackReturnAddresses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "callStackReturnAddresses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray callStackReturnAddresses(){
			final com.apple.jobjc.Invoke.MsgSend callStackReturnAddresses_IMetInst = get_callStackReturnAddresses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		callStackReturnAddresses_IMetInst.init(nativeBuffer, this);
		callStackReturnAddresses_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend callStackSymbols_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_callStackSymbols_IMetInst(){
		return ((callStackSymbols_IMetInst != null)
	? (callStackSymbols_IMetInst)
	: (callStackSymbols_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "callStackSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray callStackSymbols(){
			final com.apple.jobjc.Invoke.MsgSend callStackSymbols_IMetInst = get_callStackSymbols_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		callStackSymbols_IMetInst.init(nativeBuffer, this);
		callStackSymbols_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_reason_userInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_reason_userInfo_IMetInst(){
		return ((initWithName_reason_userInfo_IMetInst != null)
	? (initWithName_reason_userInfo_IMetInst)
	: (initWithName_reason_userInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:reason:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName_reason_userInfo(final com.apple.jobjc.foundation.NSString aName, final com.apple.jobjc.foundation.NSString aReason, final com.apple.jobjc.foundation.NSDictionary aUserInfo){
			final com.apple.jobjc.Invoke.MsgSend initWithName_reason_userInfo_IMetInst = get_initWithName_reason_userInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_reason_userInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aReason);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aUserInfo);
		initWithName_reason_userInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend raise_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_raise_IMetInst(){
		return ((raise_IMetInst != null)
	? (raise_IMetInst)
	: (raise_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "raise", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void raise(){
			final com.apple.jobjc.Invoke.MsgSend raise_IMetInst = get_raise_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		raise_IMetInst.init(nativeBuffer, this);
		raise_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reason_IMetInst(){
		return ((reason_IMetInst != null)
	? (reason_IMetInst)
	: (reason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reason", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString reason(){
			final com.apple.jobjc.Invoke.MsgSend reason_IMetInst = get_reason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reason_IMetInst.init(nativeBuffer, this);
		reason_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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
