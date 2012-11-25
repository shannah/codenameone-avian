package com.apple.jobjc.foundation;

public  class NSHTTPURLResponseClass extends com.apple.jobjc.foundation.NSURLResponseClass {
	public NSHTTPURLResponseClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHTTPURLResponseClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHTTPURLResponseClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend localizedStringForStatusCode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedStringForStatusCode_CMetInst(){
		return ((localizedStringForStatusCode_CMetInst != null)
	? (localizedStringForStatusCode_CMetInst)
	: (localizedStringForStatusCode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStringForStatusCode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString localizedStringForStatusCode(final long statusCode){
			final com.apple.jobjc.Invoke.MsgSend localizedStringForStatusCode_CMetInst = get_localizedStringForStatusCode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStringForStatusCode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, statusCode);
		localizedStringForStatusCode_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
