package com.apple.jobjc.foundation;

public  class NSHTTPCookieClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSHTTPCookieClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHTTPCookieClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHTTPCookieClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cookieWithProperties_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cookieWithProperties_CMetInst(){
		return ((cookieWithProperties_CMetInst != null)
	? (cookieWithProperties_CMetInst)
	: (cookieWithProperties_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cookieWithProperties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T cookieWithProperties(final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend cookieWithProperties_CMetInst = get_cookieWithProperties_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cookieWithProperties_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		cookieWithProperties_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cookiesWithResponseHeaderFields_forURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cookiesWithResponseHeaderFields_forURL_CMetInst(){
		return ((cookiesWithResponseHeaderFields_forURL_CMetInst != null)
	? (cookiesWithResponseHeaderFields_forURL_CMetInst)
	: (cookiesWithResponseHeaderFields_forURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cookiesWithResponseHeaderFields:forURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray cookiesWithResponseHeaderFields_forURL(final com.apple.jobjc.foundation.NSDictionary headerFields, final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend cookiesWithResponseHeaderFields_forURL_CMetInst = get_cookiesWithResponseHeaderFields_forURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cookiesWithResponseHeaderFields_forURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, headerFields);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		cookiesWithResponseHeaderFields_forURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requestHeaderFieldsWithCookies_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestHeaderFieldsWithCookies_CMetInst(){
		return ((requestHeaderFieldsWithCookies_CMetInst != null)
	? (requestHeaderFieldsWithCookies_CMetInst)
	: (requestHeaderFieldsWithCookies_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestHeaderFieldsWithCookies:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary requestHeaderFieldsWithCookies(final com.apple.jobjc.foundation.NSArray cookies){
			final com.apple.jobjc.Invoke.MsgSend requestHeaderFieldsWithCookies_CMetInst = get_requestHeaderFieldsWithCookies_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestHeaderFieldsWithCookies_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cookies);
		requestHeaderFieldsWithCookies_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
