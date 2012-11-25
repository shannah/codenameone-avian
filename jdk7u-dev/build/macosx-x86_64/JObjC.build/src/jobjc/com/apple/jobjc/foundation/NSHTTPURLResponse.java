package com.apple.jobjc.foundation;

public  class NSHTTPURLResponse extends com.apple.jobjc.foundation.NSURLResponse {
	public NSHTTPURLResponse(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHTTPURLResponse(final NSHTTPURLResponse obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allHeaderFields_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allHeaderFields_IMetInst(){
		return ((allHeaderFields_IMetInst != null)
	? (allHeaderFields_IMetInst)
	: (allHeaderFields_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allHeaderFields", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary allHeaderFields(){
			final com.apple.jobjc.Invoke.MsgSend allHeaderFields_IMetInst = get_allHeaderFields_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allHeaderFields_IMetInst.init(nativeBuffer, this);
		allHeaderFields_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_statusCode_HTTPVersion_headerFields_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_statusCode_HTTPVersion_headerFields_IMetInst(){
		return ((initWithURL_statusCode_HTTPVersion_headerFields_IMetInst != null)
	? (initWithURL_statusCode_HTTPVersion_headerFields_IMetInst)
	: (initWithURL_statusCode_HTTPVersion_headerFields_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:statusCode:HTTPVersion:headerFields:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_statusCode_HTTPVersion_headerFields(final com.apple.jobjc.foundation.NSURL url, final long statusCode, final com.apple.jobjc.foundation.NSString HTTPVersion, final com.apple.jobjc.foundation.NSDictionary headerFields){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_statusCode_HTTPVersion_headerFields_IMetInst = get_initWithURL_statusCode_HTTPVersion_headerFields_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_statusCode_HTTPVersion_headerFields_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, statusCode);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, HTTPVersion);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, headerFields);
		initWithURL_statusCode_HTTPVersion_headerFields_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend statusCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_statusCode_IMetInst(){
		return ((statusCode_IMetInst != null)
	? (statusCode_IMetInst)
	: (statusCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "statusCode", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long statusCode(){
			final com.apple.jobjc.Invoke.MsgSend statusCode_IMetInst = get_statusCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		statusCode_IMetInst.init(nativeBuffer, this);
		statusCode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
