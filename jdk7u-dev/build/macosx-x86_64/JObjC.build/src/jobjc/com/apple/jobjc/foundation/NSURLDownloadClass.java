package com.apple.jobjc.foundation;

public  class NSURLDownloadClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLDownloadClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLDownloadClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLDownloadClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canResumeDownloadDecodedWithEncodingMIMEType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canResumeDownloadDecodedWithEncodingMIMEType_CMetInst(){
		return ((canResumeDownloadDecodedWithEncodingMIMEType_CMetInst != null)
	? (canResumeDownloadDecodedWithEncodingMIMEType_CMetInst)
	: (canResumeDownloadDecodedWithEncodingMIMEType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canResumeDownloadDecodedWithEncodingMIMEType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canResumeDownloadDecodedWithEncodingMIMEType(final com.apple.jobjc.foundation.NSString MIMEType){
			final com.apple.jobjc.Invoke.MsgSend canResumeDownloadDecodedWithEncodingMIMEType_CMetInst = get_canResumeDownloadDecodedWithEncodingMIMEType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canResumeDownloadDecodedWithEncodingMIMEType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, MIMEType);
		canResumeDownloadDecodedWithEncodingMIMEType_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
