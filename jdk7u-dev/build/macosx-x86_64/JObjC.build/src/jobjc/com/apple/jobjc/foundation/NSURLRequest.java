package com.apple.jobjc.foundation;

public  class NSURLRequest extends com.apple.jobjc.foundation.NSObject {
	public NSURLRequest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLRequest(final NSURLRequest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend HTTPBody_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_HTTPBody_IMetInst(){
		return ((HTTPBody_IMetInst != null)
	? (HTTPBody_IMetInst)
	: (HTTPBody_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "HTTPBody", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData HTTPBody(){
			final com.apple.jobjc.Invoke.MsgSend HTTPBody_IMetInst = get_HTTPBody_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		HTTPBody_IMetInst.init(nativeBuffer, this);
		HTTPBody_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend HTTPBodyStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_HTTPBodyStream_IMetInst(){
		return ((HTTPBodyStream_IMetInst != null)
	? (HTTPBodyStream_IMetInst)
	: (HTTPBodyStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "HTTPBodyStream", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSInputStream HTTPBodyStream(){
			final com.apple.jobjc.Invoke.MsgSend HTTPBodyStream_IMetInst = get_HTTPBodyStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		HTTPBodyStream_IMetInst.init(nativeBuffer, this);
		HTTPBodyStream_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSInputStream returnValue = (com.apple.jobjc.foundation.NSInputStream) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend HTTPMethod_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_HTTPMethod_IMetInst(){
		return ((HTTPMethod_IMetInst != null)
	? (HTTPMethod_IMetInst)
	: (HTTPMethod_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "HTTPMethod", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString HTTPMethod(){
			final com.apple.jobjc.Invoke.MsgSend HTTPMethod_IMetInst = get_HTTPMethod_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		HTTPMethod_IMetInst.init(nativeBuffer, this);
		HTTPMethod_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend HTTPShouldHandleCookies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_HTTPShouldHandleCookies_IMetInst(){
		return ((HTTPShouldHandleCookies_IMetInst != null)
	? (HTTPShouldHandleCookies_IMetInst)
	: (HTTPShouldHandleCookies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "HTTPShouldHandleCookies", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean HTTPShouldHandleCookies(){
			final com.apple.jobjc.Invoke.MsgSend HTTPShouldHandleCookies_IMetInst = get_HTTPShouldHandleCookies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		HTTPShouldHandleCookies_IMetInst.init(nativeBuffer, this);
		HTTPShouldHandleCookies_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend HTTPShouldUsePipelining_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_HTTPShouldUsePipelining_IMetInst(){
		return ((HTTPShouldUsePipelining_IMetInst != null)
	? (HTTPShouldUsePipelining_IMetInst)
	: (HTTPShouldUsePipelining_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "HTTPShouldUsePipelining", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean HTTPShouldUsePipelining(){
			final com.apple.jobjc.Invoke.MsgSend HTTPShouldUsePipelining_IMetInst = get_HTTPShouldUsePipelining_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		HTTPShouldUsePipelining_IMetInst.init(nativeBuffer, this);
		HTTPShouldUsePipelining_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend allHTTPHeaderFields_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allHTTPHeaderFields_IMetInst(){
		return ((allHTTPHeaderFields_IMetInst != null)
	? (allHTTPHeaderFields_IMetInst)
	: (allHTTPHeaderFields_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allHTTPHeaderFields", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary allHTTPHeaderFields(){
			final com.apple.jobjc.Invoke.MsgSend allHTTPHeaderFields_IMetInst = get_allHTTPHeaderFields_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allHTTPHeaderFields_IMetInst.init(nativeBuffer, this);
		allHTTPHeaderFields_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsCellularAccess_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsCellularAccess_IMetInst(){
		return ((allowsCellularAccess_IMetInst != null)
	? (allowsCellularAccess_IMetInst)
	: (allowsCellularAccess_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsCellularAccess", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsCellularAccess(){
			final com.apple.jobjc.Invoke.MsgSend allowsCellularAccess_IMetInst = get_allowsCellularAccess_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsCellularAccess_IMetInst.init(nativeBuffer, this);
		allowsCellularAccess_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cachePolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cachePolicy_IMetInst(){
		return ((cachePolicy_IMetInst != null)
	? (cachePolicy_IMetInst)
	: (cachePolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cachePolicy", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long cachePolicy(){
			final com.apple.jobjc.Invoke.MsgSend cachePolicy_IMetInst = get_cachePolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cachePolicy_IMetInst.init(nativeBuffer, this);
		cachePolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_IMetInst(){
		return ((initWithURL_IMetInst != null)
	? (initWithURL_IMetInst)
	: (initWithURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL(final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst = get_initWithURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		initWithURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_cachePolicy_timeoutInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_cachePolicy_timeoutInterval_IMetInst(){
		return ((initWithURL_cachePolicy_timeoutInterval_IMetInst != null)
	? (initWithURL_cachePolicy_timeoutInterval_IMetInst)
	: (initWithURL_cachePolicy_timeoutInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:cachePolicy:timeoutInterval:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_cachePolicy_timeoutInterval(final com.apple.jobjc.foundation.NSURL URL, final long cachePolicy, final double timeoutInterval){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_cachePolicy_timeoutInterval_IMetInst = get_initWithURL_cachePolicy_timeoutInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_cachePolicy_timeoutInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cachePolicy);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, timeoutInterval);
		initWithURL_cachePolicy_timeoutInterval_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainDocumentURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainDocumentURL_IMetInst(){
		return ((mainDocumentURL_IMetInst != null)
	? (mainDocumentURL_IMetInst)
	: (mainDocumentURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainDocumentURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL mainDocumentURL(){
			final com.apple.jobjc.Invoke.MsgSend mainDocumentURL_IMetInst = get_mainDocumentURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainDocumentURL_IMetInst.init(nativeBuffer, this);
		mainDocumentURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend networkServiceType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_networkServiceType_IMetInst(){
		return ((networkServiceType_IMetInst != null)
	? (networkServiceType_IMetInst)
	: (networkServiceType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "networkServiceType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long networkServiceType(){
			final com.apple.jobjc.Invoke.MsgSend networkServiceType_IMetInst = get_networkServiceType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		networkServiceType_IMetInst.init(nativeBuffer, this);
		networkServiceType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend timeoutInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_timeoutInterval_IMetInst(){
		return ((timeoutInterval_IMetInst != null)
	? (timeoutInterval_IMetInst)
	: (timeoutInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "timeoutInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double timeoutInterval(){
			final com.apple.jobjc.Invoke.MsgSend timeoutInterval_IMetInst = get_timeoutInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		timeoutInterval_IMetInst.init(nativeBuffer, this);
		timeoutInterval_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForHTTPHeaderField_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForHTTPHeaderField_IMetInst(){
		return ((valueForHTTPHeaderField_IMetInst != null)
	? (valueForHTTPHeaderField_IMetInst)
	: (valueForHTTPHeaderField_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForHTTPHeaderField:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString valueForHTTPHeaderField(final com.apple.jobjc.foundation.NSString field){
			final com.apple.jobjc.Invoke.MsgSend valueForHTTPHeaderField_IMetInst = get_valueForHTTPHeaderField_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForHTTPHeaderField_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, field);
		valueForHTTPHeaderField_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
