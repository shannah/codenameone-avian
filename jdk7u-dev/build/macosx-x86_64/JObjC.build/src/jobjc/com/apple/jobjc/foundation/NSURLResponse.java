package com.apple.jobjc.foundation;

public  class NSURLResponse extends com.apple.jobjc.foundation.NSObject {
	public NSURLResponse(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLResponse(final NSURLResponse obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend MIMEType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_MIMEType_IMetInst(){
		return ((MIMEType_IMetInst != null)
	? (MIMEType_IMetInst)
	: (MIMEType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "MIMEType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString MIMEType(){
			final com.apple.jobjc.Invoke.MsgSend MIMEType_IMetInst = get_MIMEType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		MIMEType_IMetInst.init(nativeBuffer, this);
		MIMEType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expectedContentLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expectedContentLength_IMetInst(){
		return ((expectedContentLength_IMetInst != null)
	? (expectedContentLength_IMetInst)
	: (expectedContentLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expectedContentLength", com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public long expectedContentLength(){
			final com.apple.jobjc.Invoke.MsgSend expectedContentLength_IMetInst = get_expectedContentLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expectedContentLength_IMetInst.init(nativeBuffer, this);
		expectedContentLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst(){
		return ((initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst != null)
	? (initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst)
	: (initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:MIMEType:expectedContentLength:textEncodingName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_MIMEType_expectedContentLength_textEncodingName(final com.apple.jobjc.foundation.NSURL URL, final com.apple.jobjc.foundation.NSString MIMEType, final long length, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst = get_initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, MIMEType);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithURL_MIMEType_expectedContentLength_textEncodingName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend suggestedFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suggestedFilename_IMetInst(){
		return ((suggestedFilename_IMetInst != null)
	? (suggestedFilename_IMetInst)
	: (suggestedFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suggestedFilename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString suggestedFilename(){
			final com.apple.jobjc.Invoke.MsgSend suggestedFilename_IMetInst = get_suggestedFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suggestedFilename_IMetInst.init(nativeBuffer, this);
		suggestedFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textEncodingName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textEncodingName_IMetInst(){
		return ((textEncodingName_IMetInst != null)
	? (textEncodingName_IMetInst)
	: (textEncodingName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textEncodingName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString textEncodingName(){
			final com.apple.jobjc.Invoke.MsgSend textEncodingName_IMetInst = get_textEncodingName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textEncodingName_IMetInst.init(nativeBuffer, this);
		textEncodingName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
