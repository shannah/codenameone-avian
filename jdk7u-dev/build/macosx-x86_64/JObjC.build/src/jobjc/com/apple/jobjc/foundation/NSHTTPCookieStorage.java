package com.apple.jobjc.foundation;

public  class NSHTTPCookieStorage extends com.apple.jobjc.foundation.NSObject {
	public NSHTTPCookieStorage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHTTPCookieStorage(final NSHTTPCookieStorage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cookieAcceptPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cookieAcceptPolicy_IMetInst(){
		return ((cookieAcceptPolicy_IMetInst != null)
	? (cookieAcceptPolicy_IMetInst)
	: (cookieAcceptPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cookieAcceptPolicy", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long cookieAcceptPolicy(){
			final com.apple.jobjc.Invoke.MsgSend cookieAcceptPolicy_IMetInst = get_cookieAcceptPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cookieAcceptPolicy_IMetInst.init(nativeBuffer, this);
		cookieAcceptPolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cookies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cookies_IMetInst(){
		return ((cookies_IMetInst != null)
	? (cookies_IMetInst)
	: (cookies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cookies", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray cookies(){
			final com.apple.jobjc.Invoke.MsgSend cookies_IMetInst = get_cookies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cookies_IMetInst.init(nativeBuffer, this);
		cookies_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cookiesForURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cookiesForURL_IMetInst(){
		return ((cookiesForURL_IMetInst != null)
	? (cookiesForURL_IMetInst)
	: (cookiesForURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cookiesForURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray cookiesForURL(final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend cookiesForURL_IMetInst = get_cookiesForURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cookiesForURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		cookiesForURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteCookie_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteCookie_IMetInst(){
		return ((deleteCookie_IMetInst != null)
	? (deleteCookie_IMetInst)
	: (deleteCookie_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteCookie:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deleteCookie(final com.apple.jobjc.foundation.NSHTTPCookie cookie){
			final com.apple.jobjc.Invoke.MsgSend deleteCookie_IMetInst = get_deleteCookie_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteCookie_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cookie);
		deleteCookie_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCookie_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCookie_IMetInst(){
		return ((setCookie_IMetInst != null)
	? (setCookie_IMetInst)
	: (setCookie_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCookie:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCookie(final com.apple.jobjc.foundation.NSHTTPCookie cookie){
			final com.apple.jobjc.Invoke.MsgSend setCookie_IMetInst = get_setCookie_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCookie_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cookie);
		setCookie_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCookieAcceptPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCookieAcceptPolicy_IMetInst(){
		return ((setCookieAcceptPolicy_IMetInst != null)
	? (setCookieAcceptPolicy_IMetInst)
	: (setCookieAcceptPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCookieAcceptPolicy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCookieAcceptPolicy(final long cookieAcceptPolicy){
			final com.apple.jobjc.Invoke.MsgSend setCookieAcceptPolicy_IMetInst = get_setCookieAcceptPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCookieAcceptPolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cookieAcceptPolicy);
		setCookieAcceptPolicy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCookies_forURL_mainDocumentURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCookies_forURL_mainDocumentURL_IMetInst(){
		return ((setCookies_forURL_mainDocumentURL_IMetInst != null)
	? (setCookies_forURL_mainDocumentURL_IMetInst)
	: (setCookies_forURL_mainDocumentURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCookies:forURL:mainDocumentURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCookies_forURL_mainDocumentURL(final com.apple.jobjc.foundation.NSArray cookies, final com.apple.jobjc.foundation.NSURL URL, final com.apple.jobjc.foundation.NSURL mainDocumentURL){
			final com.apple.jobjc.Invoke.MsgSend setCookies_forURL_mainDocumentURL_IMetInst = get_setCookies_forURL_mainDocumentURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCookies_forURL_mainDocumentURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cookies);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mainDocumentURL);
		setCookies_forURL_mainDocumentURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedCookiesUsingDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedCookiesUsingDescriptors_IMetInst(){
		return ((sortedCookiesUsingDescriptors_IMetInst != null)
	? (sortedCookiesUsingDescriptors_IMetInst)
	: (sortedCookiesUsingDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedCookiesUsingDescriptors:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedCookiesUsingDescriptors(final com.apple.jobjc.foundation.NSArray sortOrder){
			final com.apple.jobjc.Invoke.MsgSend sortedCookiesUsingDescriptors_IMetInst = get_sortedCookiesUsingDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedCookiesUsingDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortOrder);
		sortedCookiesUsingDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
