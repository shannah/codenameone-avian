package com.apple.jobjc.foundation;

public  class NSErrorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSErrorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSErrorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSErrorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend errorWithDomain_code_userInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_errorWithDomain_code_userInfo_CMetInst(){
		return ((errorWithDomain_code_userInfo_CMetInst != null)
	? (errorWithDomain_code_userInfo_CMetInst)
	: (errorWithDomain_code_userInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "errorWithDomain:code:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T errorWithDomain_code_userInfo(final com.apple.jobjc.foundation.NSString domain, final long code, final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend errorWithDomain_code_userInfo_CMetInst = get_errorWithDomain_code_userInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		errorWithDomain_code_userInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, code);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		errorWithDomain_code_userInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
