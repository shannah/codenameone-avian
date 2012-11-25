package com.apple.jobjc.foundation;

public  class NSObject extends com.apple.jobjc.ID {
	public NSObject(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSObject(final NSObject obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URL_resourceDataDidBecomeAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_resourceDataDidBecomeAvailable_IMetInst(){
		return ((URL_resourceDataDidBecomeAvailable_IMetInst != null)
	? (URL_resourceDataDidBecomeAvailable_IMetInst)
	: (URL_resourceDataDidBecomeAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL:resourceDataDidBecomeAvailable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URL_resourceDataDidBecomeAvailable(final com.apple.jobjc.foundation.NSURL sender, final com.apple.jobjc.foundation.NSData newBytes){
			final com.apple.jobjc.Invoke.MsgSend URL_resourceDataDidBecomeAvailable_IMetInst = get_URL_resourceDataDidBecomeAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_resourceDataDidBecomeAvailable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newBytes);
		URL_resourceDataDidBecomeAvailable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URL_resourceDidFailLoadingWithReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_resourceDidFailLoadingWithReason_IMetInst(){
		return ((URL_resourceDidFailLoadingWithReason_IMetInst != null)
	? (URL_resourceDidFailLoadingWithReason_IMetInst)
	: (URL_resourceDidFailLoadingWithReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL:resourceDidFailLoadingWithReason:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URL_resourceDidFailLoadingWithReason(final com.apple.jobjc.foundation.NSURL sender, final com.apple.jobjc.foundation.NSString reason){
			final com.apple.jobjc.Invoke.MsgSend URL_resourceDidFailLoadingWithReason_IMetInst = get_URL_resourceDidFailLoadingWithReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_resourceDidFailLoadingWithReason_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		URL_resourceDidFailLoadingWithReason_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandle_resourceDataDidBecomeAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandle_resourceDataDidBecomeAvailable_IMetInst(){
		return ((URLHandle_resourceDataDidBecomeAvailable_IMetInst != null)
	? (URLHandle_resourceDataDidBecomeAvailable_IMetInst)
	: (URLHandle_resourceDataDidBecomeAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandle:resourceDataDidBecomeAvailable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLHandle_resourceDataDidBecomeAvailable(final com.apple.jobjc.foundation.NSURLHandle sender, final com.apple.jobjc.foundation.NSData newBytes){
			final com.apple.jobjc.Invoke.MsgSend URLHandle_resourceDataDidBecomeAvailable_IMetInst = get_URLHandle_resourceDataDidBecomeAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandle_resourceDataDidBecomeAvailable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newBytes);
		URLHandle_resourceDataDidBecomeAvailable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandle_resourceDidFailLoadingWithReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandle_resourceDidFailLoadingWithReason_IMetInst(){
		return ((URLHandle_resourceDidFailLoadingWithReason_IMetInst != null)
	? (URLHandle_resourceDidFailLoadingWithReason_IMetInst)
	: (URLHandle_resourceDidFailLoadingWithReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandle:resourceDidFailLoadingWithReason:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLHandle_resourceDidFailLoadingWithReason(final com.apple.jobjc.foundation.NSURLHandle sender, final com.apple.jobjc.foundation.NSString reason){
			final com.apple.jobjc.Invoke.MsgSend URLHandle_resourceDidFailLoadingWithReason_IMetInst = get_URLHandle_resourceDidFailLoadingWithReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandle_resourceDidFailLoadingWithReason_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		URLHandle_resourceDidFailLoadingWithReason_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidBeginLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandleResourceDidBeginLoading_IMetInst(){
		return ((URLHandleResourceDidBeginLoading_IMetInst != null)
	? (URLHandleResourceDidBeginLoading_IMetInst)
	: (URLHandleResourceDidBeginLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandleResourceDidBeginLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLHandleResourceDidBeginLoading(final com.apple.jobjc.foundation.NSURLHandle sender){
			final com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidBeginLoading_IMetInst = get_URLHandleResourceDidBeginLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandleResourceDidBeginLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		URLHandleResourceDidBeginLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidCancelLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandleResourceDidCancelLoading_IMetInst(){
		return ((URLHandleResourceDidCancelLoading_IMetInst != null)
	? (URLHandleResourceDidCancelLoading_IMetInst)
	: (URLHandleResourceDidCancelLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandleResourceDidCancelLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLHandleResourceDidCancelLoading(final com.apple.jobjc.foundation.NSURLHandle sender){
			final com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidCancelLoading_IMetInst = get_URLHandleResourceDidCancelLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandleResourceDidCancelLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		URLHandleResourceDidCancelLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidFinishLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandleResourceDidFinishLoading_IMetInst(){
		return ((URLHandleResourceDidFinishLoading_IMetInst != null)
	? (URLHandleResourceDidFinishLoading_IMetInst)
	: (URLHandleResourceDidFinishLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandleResourceDidFinishLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLHandleResourceDidFinishLoading(final com.apple.jobjc.foundation.NSURLHandle sender){
			final com.apple.jobjc.Invoke.MsgSend URLHandleResourceDidFinishLoading_IMetInst = get_URLHandleResourceDidFinishLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandleResourceDidFinishLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		URLHandleResourceDidFinishLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_cachedResponseIsValid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_cachedResponseIsValid_IMetInst(){
		return ((URLProtocol_cachedResponseIsValid_IMetInst != null)
	? (URLProtocol_cachedResponseIsValid_IMetInst)
	: (URLProtocol_cachedResponseIsValid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:cachedResponseIsValid:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_cachedResponseIsValid(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSCachedURLResponse cachedResponse){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_cachedResponseIsValid_IMetInst = get_URLProtocol_cachedResponseIsValid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_cachedResponseIsValid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cachedResponse);
		URLProtocol_cachedResponseIsValid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_didCancelAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_didCancelAuthenticationChallenge_IMetInst(){
		return ((URLProtocol_didCancelAuthenticationChallenge_IMetInst != null)
	? (URLProtocol_didCancelAuthenticationChallenge_IMetInst)
	: (URLProtocol_didCancelAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:didCancelAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_didCancelAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_didCancelAuthenticationChallenge_IMetInst = get_URLProtocol_didCancelAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_didCancelAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		URLProtocol_didCancelAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_didFailWithError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_didFailWithError_IMetInst(){
		return ((URLProtocol_didFailWithError_IMetInst != null)
	? (URLProtocol_didFailWithError_IMetInst)
	: (URLProtocol_didFailWithError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:didFailWithError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_didFailWithError(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_didFailWithError_IMetInst = get_URLProtocol_didFailWithError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_didFailWithError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		URLProtocol_didFailWithError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_didLoadData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_didLoadData_IMetInst(){
		return ((URLProtocol_didLoadData_IMetInst != null)
	? (URLProtocol_didLoadData_IMetInst)
	: (URLProtocol_didLoadData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:didLoadData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_didLoadData(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_didLoadData_IMetInst = get_URLProtocol_didLoadData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_didLoadData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		URLProtocol_didLoadData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_didReceiveAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_didReceiveAuthenticationChallenge_IMetInst(){
		return ((URLProtocol_didReceiveAuthenticationChallenge_IMetInst != null)
	? (URLProtocol_didReceiveAuthenticationChallenge_IMetInst)
	: (URLProtocol_didReceiveAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:didReceiveAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_didReceiveAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_didReceiveAuthenticationChallenge_IMetInst = get_URLProtocol_didReceiveAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_didReceiveAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		URLProtocol_didReceiveAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst(){
		return ((URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst != null)
	? (URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst)
	: (URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:didReceiveResponse:cacheStoragePolicy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void URLProtocol_didReceiveResponse_cacheStoragePolicy(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSURLResponse response, final long policy){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst = get_URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, policy);
		URLProtocol_didReceiveResponse_cacheStoragePolicy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst(){
		return ((URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst != null)
	? (URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst)
	: (URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocol:wasRedirectedToRequest:redirectResponse:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocol_wasRedirectedToRequest_redirectResponse(final com.apple.jobjc.foundation.NSURLProtocol protocol, final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.foundation.NSURLResponse redirectResponse){
			final com.apple.jobjc.Invoke.MsgSend URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst = get_URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, redirectResponse);
		URLProtocol_wasRedirectedToRequest_redirectResponse_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLProtocolDidFinishLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLProtocolDidFinishLoading_IMetInst(){
		return ((URLProtocolDidFinishLoading_IMetInst != null)
	? (URLProtocolDidFinishLoading_IMetInst)
	: (URLProtocolDidFinishLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLProtocolDidFinishLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLProtocolDidFinishLoading(final com.apple.jobjc.foundation.NSURLProtocol protocol){
			final com.apple.jobjc.Invoke.MsgSend URLProtocolDidFinishLoading_IMetInst = get_URLProtocolDidFinishLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLProtocolDidFinishLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protocol);
		URLProtocolDidFinishLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLResourceDidCancelLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLResourceDidCancelLoading_IMetInst(){
		return ((URLResourceDidCancelLoading_IMetInst != null)
	? (URLResourceDidCancelLoading_IMetInst)
	: (URLResourceDidCancelLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLResourceDidCancelLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLResourceDidCancelLoading(final com.apple.jobjc.foundation.NSURL sender){
			final com.apple.jobjc.Invoke.MsgSend URLResourceDidCancelLoading_IMetInst = get_URLResourceDidCancelLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLResourceDidCancelLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		URLResourceDidCancelLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend URLResourceDidFinishLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLResourceDidFinishLoading_IMetInst(){
		return ((URLResourceDidFinishLoading_IMetInst != null)
	? (URLResourceDidFinishLoading_IMetInst)
	: (URLResourceDidFinishLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLResourceDidFinishLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void URLResourceDidFinishLoading(final com.apple.jobjc.foundation.NSURL sender){
			final com.apple.jobjc.Invoke.MsgSend URLResourceDidFinishLoading_IMetInst = get_URLResourceDidFinishLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLResourceDidFinishLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		URLResourceDidFinishLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend accommodatePresentedItemDeletionWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accommodatePresentedItemDeletionWithCompletionHandler_IMetInst(){
		return ((accommodatePresentedItemDeletionWithCompletionHandler_IMetInst != null)
	? (accommodatePresentedItemDeletionWithCompletionHandler_IMetInst)
	: (accommodatePresentedItemDeletionWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accommodatePresentedItemDeletionWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void accommodatePresentedItemDeletionWithCompletionHandler(final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend accommodatePresentedItemDeletionWithCompletionHandler_IMetInst = get_accommodatePresentedItemDeletionWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accommodatePresentedItemDeletionWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		accommodatePresentedItemDeletionWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst(){
		return ((accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst != null)
	? (accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst)
	: (accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accommodatePresentedSubitemDeletionAtURL:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void accommodatePresentedSubitemDeletionAtURL_completionHandler(final com.apple.jobjc.foundation.NSURL url, final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst = get_accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		accommodatePresentedSubitemDeletionAtURL_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_forKeyPath_options_context_IMetInst(){
		return ((addObserver_forKeyPath_options_context_IMetInst != null)
	? (addObserver_forKeyPath_options_context_IMetInst)
	: (addObserver_forKeyPath_options_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:forKeyPath:options:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void addObserver_forKeyPath_options_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final long options, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst = get_addObserver_forKeyPath_options_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_forKeyPath_options_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		addObserver_forKeyPath_options_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend archiver_didEncodeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiver_didEncodeObject_IMetInst(){
		return ((archiver_didEncodeObject_IMetInst != null)
	? (archiver_didEncodeObject_IMetInst)
	: (archiver_didEncodeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiver:didEncodeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void archiver_didEncodeObject(final com.apple.jobjc.foundation.NSKeyedArchiver archiver, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend archiver_didEncodeObject_IMetInst = get_archiver_didEncodeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiver_didEncodeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		archiver_didEncodeObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend archiver_willEncodeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiver_willEncodeObject_IMetInst(){
		return ((archiver_willEncodeObject_IMetInst != null)
	? (archiver_willEncodeObject_IMetInst)
	: (archiver_willEncodeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiver:willEncodeObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T archiver_willEncodeObject(final com.apple.jobjc.foundation.NSKeyedArchiver archiver, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend archiver_willEncodeObject_IMetInst = get_archiver_willEncodeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiver_willEncodeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		archiver_willEncodeObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend archiver_willReplaceObject_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiver_willReplaceObject_withObject_IMetInst(){
		return ((archiver_willReplaceObject_withObject_IMetInst != null)
	? (archiver_willReplaceObject_withObject_IMetInst)
	: (archiver_willReplaceObject_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiver:willReplaceObject:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void archiver_willReplaceObject_withObject(final com.apple.jobjc.foundation.NSKeyedArchiver archiver, final com.apple.jobjc.ID object, final com.apple.jobjc.ID newObject){
			final com.apple.jobjc.Invoke.MsgSend archiver_willReplaceObject_withObject_IMetInst = get_archiver_willReplaceObject_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiver_willReplaceObject_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newObject);
		archiver_willReplaceObject_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend archiverDidFinish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiverDidFinish_IMetInst(){
		return ((archiverDidFinish_IMetInst != null)
	? (archiverDidFinish_IMetInst)
	: (archiverDidFinish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiverDidFinish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void archiverDidFinish(final com.apple.jobjc.foundation.NSKeyedArchiver archiver){
			final com.apple.jobjc.Invoke.MsgSend archiverDidFinish_IMetInst = get_archiverDidFinish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiverDidFinish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		archiverDidFinish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend archiverWillFinish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiverWillFinish_IMetInst(){
		return ((archiverWillFinish_IMetInst != null)
	? (archiverWillFinish_IMetInst)
	: (archiverWillFinish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiverWillFinish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void archiverWillFinish(final com.apple.jobjc.foundation.NSKeyedArchiver archiver){
			final com.apple.jobjc.Invoke.MsgSend archiverWillFinish_IMetInst = get_archiverWillFinish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiverWillFinish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		archiverWillFinish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attemptRecoveryFromError_optionIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attemptRecoveryFromError_optionIndex_IMetInst(){
		return ((attemptRecoveryFromError_optionIndex_IMetInst != null)
	? (attemptRecoveryFromError_optionIndex_IMetInst)
	: (attemptRecoveryFromError_optionIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attemptRecoveryFromError:optionIndex:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean attemptRecoveryFromError_optionIndex(final com.apple.jobjc.foundation.NSError error, final long recoveryOptionIndex){
			final com.apple.jobjc.Invoke.MsgSend attemptRecoveryFromError_optionIndex_IMetInst = get_attemptRecoveryFromError_optionIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attemptRecoveryFromError_optionIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, recoveryOptionIndex);
		attemptRecoveryFromError_optionIndex_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst(){
		return ((attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst != null)
	? (attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst)
	: (attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attemptRecoveryFromError:optionIndex:delegate:didRecoverSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo(final com.apple.jobjc.foundation.NSError error, final long recoveryOptionIndex, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didRecoverSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst = get_attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, recoveryOptionIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didRecoverSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		attemptRecoveryFromError_optionIndex_delegate_didRecoverSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeKeys_IMetInst(){
		return ((attributeKeys_IMetInst != null)
	? (attributeKeys_IMetInst)
	: (attributeKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray attributeKeys(){
			final com.apple.jobjc.Invoke.MsgSend attributeKeys_IMetInst = get_attributeKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeKeys_IMetInst.init(nativeBuffer, this);
		attributeKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend authenticateComponents_withData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_authenticateComponents_withData_IMetInst(){
		return ((authenticateComponents_withData_IMetInst != null)
	? (authenticateComponents_withData_IMetInst)
	: (authenticateComponents_withData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "authenticateComponents:withData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean authenticateComponents_withData(final com.apple.jobjc.foundation.NSArray components, final com.apple.jobjc.foundation.NSData signature){
			final com.apple.jobjc.Invoke.MsgSend authenticateComponents_withData_IMetInst = get_authenticateComponents_withData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		authenticateComponents_withData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, signature);
		authenticateComponents_withData_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend authenticationDataForComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_authenticationDataForComponents_IMetInst(){
		return ((authenticationDataForComponents_IMetInst != null)
	? (authenticationDataForComponents_IMetInst)
	: (authenticationDataForComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "authenticationDataForComponents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData authenticationDataForComponents(final com.apple.jobjc.foundation.NSArray components){
			final com.apple.jobjc.Invoke.MsgSend authenticationDataForComponents_IMetInst = get_authenticationDataForComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		authenticationDataForComponents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		authenticationDataForComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoContentAccessingProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoContentAccessingProxy_IMetInst(){
		return ((autoContentAccessingProxy_IMetInst != null)
	? (autoContentAccessingProxy_IMetInst)
	: (autoContentAccessingProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoContentAccessingProxy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T autoContentAccessingProxy(){
			final com.apple.jobjc.Invoke.MsgSend autoContentAccessingProxy_IMetInst = get_autoContentAccessingProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoContentAccessingProxy_IMetInst.init(nativeBuffer, this);
		autoContentAccessingProxy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autorelease_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autorelease_IMetInst(){
		return ((autorelease_IMetInst != null)
	? (autorelease_IMetInst)
	: (autorelease_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autorelease", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T autorelease(){
			final com.apple.jobjc.Invoke.MsgSend autorelease_IMetInst = get_autorelease_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autorelease_IMetInst.init(nativeBuffer, this);
		autorelease_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend awakeAfterUsingCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_awakeAfterUsingCoder_IMetInst(){
		return ((awakeAfterUsingCoder_IMetInst != null)
	? (awakeAfterUsingCoder_IMetInst)
	: (awakeAfterUsingCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "awakeAfterUsingCoder:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T awakeAfterUsingCoder(final com.apple.jobjc.foundation.NSCoder aDecoder){
			final com.apple.jobjc.Invoke.MsgSend awakeAfterUsingCoder_IMetInst = get_awakeAfterUsingCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		awakeAfterUsingCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDecoder);
		awakeAfterUsingCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginContentAccess_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginContentAccess_IMetInst(){
		return ((beginContentAccess_IMetInst != null)
	? (beginContentAccess_IMetInst)
	: (beginContentAccess_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginContentAccess", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean beginContentAccess(){
			final com.apple.jobjc.Invoke.MsgSend beginContentAccess_IMetInst = get_beginContentAccess_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginContentAccess_IMetInst.init(nativeBuffer, this);
		beginContentAccess_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cache_willEvictObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cache_willEvictObject_IMetInst(){
		return ((cache_willEvictObject_IMetInst != null)
	? (cache_willEvictObject_IMetInst)
	: (cache_willEvictObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cache:willEvictObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cache_willEvictObject(final com.apple.jobjc.foundation.NSCache cache, final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend cache_willEvictObject_IMetInst = get_cache_willEvictObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cache_willEvictObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cache);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		cache_willEvictObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelAuthenticationChallenge_IMetInst(){
		return ((cancelAuthenticationChallenge_IMetInst != null)
	? (cancelAuthenticationChallenge_IMetInst)
	: (cancelAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend cancelAuthenticationChallenge_IMetInst = get_cancelAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		cancelAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend classNSClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNSClass_IMetInst(){
		return ((classNSClass_IMetInst != null)
	? (classNSClass_IMetInst)
	: (classNSClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "class", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classNSClass(){
			final com.apple.jobjc.Invoke.MsgSend classNSClass_IMetInst = get_classNSClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNSClass_IMetInst.init(nativeBuffer, this);
		classNSClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classCode_IMetInst(){
		return ((classCode_IMetInst != null)
	? (classCode_IMetInst)
	: (classCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classCode", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int classCode(){
			final com.apple.jobjc.Invoke.MsgSend classCode_IMetInst = get_classCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classCode_IMetInst.init(nativeBuffer, this);
		classCode_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescription_IMetInst(){
		return ((classDescription_IMetInst != null)
	? (classDescription_IMetInst)
	: (classDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSClassDescription classDescription(){
			final com.apple.jobjc.Invoke.MsgSend classDescription_IMetInst = get_classDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescription_IMetInst.init(nativeBuffer, this);
		classDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSClassDescription returnValue = (com.apple.jobjc.foundation.NSClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classForArchiver_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForArchiver_IMetInst(){
		return ((classForArchiver_IMetInst != null)
	? (classForArchiver_IMetInst)
	: (classForArchiver_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForArchiver", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForArchiver(){
			final com.apple.jobjc.Invoke.MsgSend classForArchiver_IMetInst = get_classForArchiver_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForArchiver_IMetInst.init(nativeBuffer, this);
		classForArchiver_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classForCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForCoder_IMetInst(){
		return ((classForCoder_IMetInst != null)
	? (classForCoder_IMetInst)
	: (classForCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForCoder", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForCoder(){
			final com.apple.jobjc.Invoke.MsgSend classForCoder_IMetInst = get_classForCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForCoder_IMetInst.init(nativeBuffer, this);
		classForCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classForKeyedArchiver_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForKeyedArchiver_IMetInst(){
		return ((classForKeyedArchiver_IMetInst != null)
	? (classForKeyedArchiver_IMetInst)
	: (classForKeyedArchiver_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForKeyedArchiver", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForKeyedArchiver(){
			final com.apple.jobjc.Invoke.MsgSend classForKeyedArchiver_IMetInst = get_classForKeyedArchiver_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForKeyedArchiver_IMetInst.init(nativeBuffer, this);
		classForKeyedArchiver_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classForPortCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForPortCoder_IMetInst(){
		return ((classForPortCoder_IMetInst != null)
	? (classForPortCoder_IMetInst)
	: (classForPortCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForPortCoder", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForPortCoder(){
			final com.apple.jobjc.Invoke.MsgSend classForPortCoder_IMetInst = get_classForPortCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForPortCoder_IMetInst.init(nativeBuffer, this);
		classForPortCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend className_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_className_IMetInst(){
		return ((className_IMetInst != null)
	? (className_IMetInst)
	: (className_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "className", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString className(){
			final com.apple.jobjc.Invoke.MsgSend className_IMetInst = get_className_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		className_IMetInst.init(nativeBuffer, this);
		className_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend coerceValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coerceValue_forKey_IMetInst(){
		return ((coerceValue_forKey_IMetInst != null)
	? (coerceValue_forKey_IMetInst)
	: (coerceValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coerceValue:forKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T coerceValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend coerceValue_forKey_IMetInst = get_coerceValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coerceValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		coerceValue_forKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend conformsToProtocol_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_conformsToProtocol_IMetInst(){
		return ((conformsToProtocol_IMetInst != null)
	? (conformsToProtocol_IMetInst)
	: (conformsToProtocol_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "conformsToProtocol:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean conformsToProtocol(final Object /* Protocol* (@, @) */ aProtocol){
			final com.apple.jobjc.Invoke.MsgSend conformsToProtocol_IMetInst = get_conformsToProtocol_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		conformsToProtocol_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, aProtocol);
		conformsToProtocol_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_canAuthenticateAgainstProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_canAuthenticateAgainstProtectionSpace_IMetInst(){
		return ((connection_canAuthenticateAgainstProtectionSpace_IMetInst != null)
	? (connection_canAuthenticateAgainstProtectionSpace_IMetInst)
	: (connection_canAuthenticateAgainstProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:canAuthenticateAgainstProtectionSpace:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean connection_canAuthenticateAgainstProtectionSpace(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLProtectionSpace protectionSpace){
			final com.apple.jobjc.Invoke.MsgSend connection_canAuthenticateAgainstProtectionSpace_IMetInst = get_connection_canAuthenticateAgainstProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_canAuthenticateAgainstProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protectionSpace);
		connection_canAuthenticateAgainstProtectionSpace_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didCancelAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didCancelAuthenticationChallenge_IMetInst(){
		return ((connection_didCancelAuthenticationChallenge_IMetInst != null)
	? (connection_didCancelAuthenticationChallenge_IMetInst)
	: (connection_didCancelAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didCancelAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_didCancelAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend connection_didCancelAuthenticationChallenge_IMetInst = get_connection_didCancelAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didCancelAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		connection_didCancelAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didFailWithError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didFailWithError_IMetInst(){
		return ((connection_didFailWithError_IMetInst != null)
	? (connection_didFailWithError_IMetInst)
	: (connection_didFailWithError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didFailWithError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_didFailWithError(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend connection_didFailWithError_IMetInst = get_connection_didFailWithError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didFailWithError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		connection_didFailWithError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didReceiveAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didReceiveAuthenticationChallenge_IMetInst(){
		return ((connection_didReceiveAuthenticationChallenge_IMetInst != null)
	? (connection_didReceiveAuthenticationChallenge_IMetInst)
	: (connection_didReceiveAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didReceiveAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_didReceiveAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend connection_didReceiveAuthenticationChallenge_IMetInst = get_connection_didReceiveAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didReceiveAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		connection_didReceiveAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didReceiveData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didReceiveData_IMetInst(){
		return ((connection_didReceiveData_IMetInst != null)
	? (connection_didReceiveData_IMetInst)
	: (connection_didReceiveData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didReceiveData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_didReceiveData(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend connection_didReceiveData_IMetInst = get_connection_didReceiveData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didReceiveData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		connection_didReceiveData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didReceiveResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didReceiveResponse_IMetInst(){
		return ((connection_didReceiveResponse_IMetInst != null)
	? (connection_didReceiveResponse_IMetInst)
	: (connection_didReceiveResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didReceiveResponse:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_didReceiveResponse(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLResponse response){
			final com.apple.jobjc.Invoke.MsgSend connection_didReceiveResponse_IMetInst = get_connection_didReceiveResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didReceiveResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		connection_didReceiveResponse_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst(){
		return ((connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst != null)
	? (connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst)
	: (connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite(final com.apple.jobjc.foundation.NSURLConnection connection, final long bytesWritten, final long totalBytesWritten, final long totalBytesExpectedToWrite){
			final com.apple.jobjc.Invoke.MsgSend connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst = get_connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, bytesWritten);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, totalBytesWritten);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, totalBytesExpectedToWrite);
		connection_didSendBodyData_totalBytesWritten_totalBytesExpectedToWrite_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst(){
		return ((connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst != null)
	? (connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst)
	: (connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:didWriteData:totalBytesWritten:expectedTotalBytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public void connection_didWriteData_totalBytesWritten_expectedTotalBytes(final com.apple.jobjc.foundation.NSURLConnection connection, final long bytesWritten, final long totalBytesWritten, final long expectedTotalBytes){
			final com.apple.jobjc.Invoke.MsgSend connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst = get_connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, bytesWritten);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, totalBytesWritten);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, expectedTotalBytes);
		connection_didWriteData_totalBytesWritten_expectedTotalBytes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_handleRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_handleRequest_IMetInst(){
		return ((connection_handleRequest_IMetInst != null)
	? (connection_handleRequest_IMetInst)
	: (connection_handleRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:handleRequest:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean connection_handleRequest(final com.apple.jobjc.foundation.NSConnection connection, final com.apple.jobjc.foundation.NSDistantObjectRequest doreq){
			final com.apple.jobjc.Invoke.MsgSend connection_handleRequest_IMetInst = get_connection_handleRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_handleRequest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, doreq);
		connection_handleRequest_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_needNewBodyStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_needNewBodyStream_IMetInst(){
		return ((connection_needNewBodyStream_IMetInst != null)
	? (connection_needNewBodyStream_IMetInst)
	: (connection_needNewBodyStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:needNewBodyStream:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSInputStream connection_needNewBodyStream(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend connection_needNewBodyStream_IMetInst = get_connection_needNewBodyStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_needNewBodyStream_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		connection_needNewBodyStream_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSInputStream returnValue = (com.apple.jobjc.foundation.NSInputStream) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_shouldMakeNewConnection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_shouldMakeNewConnection_IMetInst(){
		return ((connection_shouldMakeNewConnection_IMetInst != null)
	? (connection_shouldMakeNewConnection_IMetInst)
	: (connection_shouldMakeNewConnection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:shouldMakeNewConnection:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean connection_shouldMakeNewConnection(final com.apple.jobjc.foundation.NSConnection ancestor, final com.apple.jobjc.foundation.NSConnection conn){
			final com.apple.jobjc.Invoke.MsgSend connection_shouldMakeNewConnection_IMetInst = get_connection_shouldMakeNewConnection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_shouldMakeNewConnection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ancestor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, conn);
		connection_shouldMakeNewConnection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_willCacheResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_willCacheResponse_IMetInst(){
		return ((connection_willCacheResponse_IMetInst != null)
	? (connection_willCacheResponse_IMetInst)
	: (connection_willCacheResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:willCacheResponse:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCachedURLResponse connection_willCacheResponse(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSCachedURLResponse cachedResponse){
			final com.apple.jobjc.Invoke.MsgSend connection_willCacheResponse_IMetInst = get_connection_willCacheResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_willCacheResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cachedResponse);
		connection_willCacheResponse_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCachedURLResponse returnValue = (com.apple.jobjc.foundation.NSCachedURLResponse) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_willSendRequest_redirectResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_willSendRequest_redirectResponse_IMetInst(){
		return ((connection_willSendRequest_redirectResponse_IMetInst != null)
	? (connection_willSendRequest_redirectResponse_IMetInst)
	: (connection_willSendRequest_redirectResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:willSendRequest:redirectResponse:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLRequest connection_willSendRequest_redirectResponse(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.foundation.NSURLResponse response){
			final com.apple.jobjc.Invoke.MsgSend connection_willSendRequest_redirectResponse_IMetInst = get_connection_willSendRequest_redirectResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_willSendRequest_redirectResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		connection_willSendRequest_redirectResponse_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLRequest returnValue = (com.apple.jobjc.foundation.NSURLRequest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend connection_willSendRequestForAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connection_willSendRequestForAuthenticationChallenge_IMetInst(){
		return ((connection_willSendRequestForAuthenticationChallenge_IMetInst != null)
	? (connection_willSendRequestForAuthenticationChallenge_IMetInst)
	: (connection_willSendRequestForAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connection:willSendRequestForAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connection_willSendRequestForAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend connection_willSendRequestForAuthenticationChallenge_IMetInst = get_connection_willSendRequestForAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connection_willSendRequestForAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		connection_willSendRequestForAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionDidFinishDownloading_destinationURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionDidFinishDownloading_destinationURL_IMetInst(){
		return ((connectionDidFinishDownloading_destinationURL_IMetInst != null)
	? (connectionDidFinishDownloading_destinationURL_IMetInst)
	: (connectionDidFinishDownloading_destinationURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionDidFinishDownloading:destinationURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connectionDidFinishDownloading_destinationURL(final com.apple.jobjc.foundation.NSURLConnection connection, final com.apple.jobjc.foundation.NSURL destinationURL){
			final com.apple.jobjc.Invoke.MsgSend connectionDidFinishDownloading_destinationURL_IMetInst = get_connectionDidFinishDownloading_destinationURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionDidFinishDownloading_destinationURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destinationURL);
		connectionDidFinishDownloading_destinationURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionDidFinishLoading_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionDidFinishLoading_IMetInst(){
		return ((connectionDidFinishLoading_IMetInst != null)
	? (connectionDidFinishLoading_IMetInst)
	: (connectionDidFinishLoading_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionDidFinishLoading:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void connectionDidFinishLoading(final com.apple.jobjc.foundation.NSURLConnection connection){
			final com.apple.jobjc.Invoke.MsgSend connectionDidFinishLoading_IMetInst = get_connectionDidFinishLoading_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionDidFinishLoading_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		connectionDidFinishLoading_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst(){
		return ((connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst != null)
	? (connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst)
	: (connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public void connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes(final com.apple.jobjc.foundation.NSURLConnection connection, final long totalBytesWritten, final long expectedTotalBytes){
			final com.apple.jobjc.Invoke.MsgSend connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst = get_connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, totalBytesWritten);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, expectedTotalBytes);
		connectionDidResumeDownloading_totalBytesWritten_expectedTotalBytes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend connectionShouldUseCredentialStorage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_connectionShouldUseCredentialStorage_IMetInst(){
		return ((connectionShouldUseCredentialStorage_IMetInst != null)
	? (connectionShouldUseCredentialStorage_IMetInst)
	: (connectionShouldUseCredentialStorage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "connectionShouldUseCredentialStorage:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean connectionShouldUseCredentialStorage(final com.apple.jobjc.foundation.NSURLConnection connection){
			final com.apple.jobjc.Invoke.MsgSend connectionShouldUseCredentialStorage_IMetInst = get_connectionShouldUseCredentialStorage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		connectionShouldUseCredentialStorage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		connectionShouldUseCredentialStorage_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend continueWithoutCredentialForAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_continueWithoutCredentialForAuthenticationChallenge_IMetInst(){
		return ((continueWithoutCredentialForAuthenticationChallenge_IMetInst != null)
	? (continueWithoutCredentialForAuthenticationChallenge_IMetInst)
	: (continueWithoutCredentialForAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "continueWithoutCredentialForAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void continueWithoutCredentialForAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend continueWithoutCredentialForAuthenticationChallenge_IMetInst = get_continueWithoutCredentialForAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		continueWithoutCredentialForAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		continueWithoutCredentialForAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend copy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copy_IMetInst(){
		return ((copy_IMetInst != null)
	? (copy_IMetInst)
	: (copy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T copy(){
			final com.apple.jobjc.Invoke.MsgSend copy_IMetInst = get_copy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copy_IMetInst.init(nativeBuffer, this);
		copy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyScriptingValue_forKey_withProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyScriptingValue_forKey_withProperties_IMetInst(){
		return ((copyScriptingValue_forKey_withProperties_IMetInst != null)
	? (copyScriptingValue_forKey_withProperties_IMetInst)
	: (copyScriptingValue_forKey_withProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyScriptingValue:forKey:withProperties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T copyScriptingValue_forKey_withProperties(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend copyScriptingValue_forKey_withProperties_IMetInst = get_copyScriptingValue_forKey_withProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyScriptingValue_forKey_withProperties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		copyScriptingValue_forKey_withProperties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyWithZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyWithZone_IMetInst(){
		return ((copyWithZone_IMetInst != null)
	? (copyWithZone_IMetInst)
	: (copyWithZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T copyWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend copyWithZone_IMetInst = get_copyWithZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyWithZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		copyWithZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countByEnumeratingWithState_objects_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countByEnumeratingWithState_objects_count_IMetInst(){
		return ((countByEnumeratingWithState_objects_count_IMetInst != null)
	? (countByEnumeratingWithState_objects_count_IMetInst)
	: (countByEnumeratingWithState_objects_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countByEnumeratingWithState:objects:count:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long countByEnumeratingWithState_objects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSFastEnumerationState> state, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> buffer, final long len){
			final com.apple.jobjc.Invoke.MsgSend countByEnumeratingWithState_objects_count_IMetInst = get_countByEnumeratingWithState_objects_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countByEnumeratingWithState_objects_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, state);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		countByEnumeratingWithState_objects_count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createConversationForConnection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createConversationForConnection_IMetInst(){
		return ((createConversationForConnection_IMetInst != null)
	? (createConversationForConnection_IMetInst)
	: (createConversationForConnection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createConversationForConnection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T createConversationForConnection(final com.apple.jobjc.foundation.NSConnection conn){
			final com.apple.jobjc.Invoke.MsgSend createConversationForConnection_IMetInst = get_createConversationForConnection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createConversationForConnection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, conn);
		createConversationForConnection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dealloc_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dealloc_IMetInst(){
		return ((dealloc_IMetInst != null)
	? (dealloc_IMetInst)
	: (dealloc_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dealloc", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void dealloc(){
			final com.apple.jobjc.Invoke.MsgSend dealloc_IMetInst = get_dealloc_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dealloc_IMetInst.init(nativeBuffer, this);
		dealloc_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend debugDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_debugDescription_IMetInst(){
		return ((debugDescription_IMetInst != null)
	? (debugDescription_IMetInst)
	: (debugDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "debugDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString debugDescription(){
			final com.apple.jobjc.Invoke.MsgSend debugDescription_IMetInst = get_debugDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		debugDescription_IMetInst.init(nativeBuffer, this);
		debugDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithValuesForKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithValuesForKeys_IMetInst(){
		return ((dictionaryWithValuesForKeys_IMetInst != null)
	? (dictionaryWithValuesForKeys_IMetInst)
	: (dictionaryWithValuesForKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithValuesForKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryWithValuesForKeys(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithValuesForKeys_IMetInst = get_dictionaryWithValuesForKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithValuesForKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		dictionaryWithValuesForKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend didChange_valuesAtIndexes_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didChange_valuesAtIndexes_forKey_IMetInst(){
		return ((didChange_valuesAtIndexes_forKey_IMetInst != null)
	? (didChange_valuesAtIndexes_forKey_IMetInst)
	: (didChange_valuesAtIndexes_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didChange:valuesAtIndexes:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void didChange_valuesAtIndexes_forKey(final long changeKind, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend didChange_valuesAtIndexes_forKey_IMetInst = get_didChange_valuesAtIndexes_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didChange_valuesAtIndexes_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, changeKind);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		didChange_valuesAtIndexes_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend didChangeValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didChangeValueForKey_IMetInst(){
		return ((didChangeValueForKey_IMetInst != null)
	? (didChangeValueForKey_IMetInst)
	: (didChangeValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didChangeValueForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void didChangeValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend didChangeValueForKey_IMetInst = get_didChangeValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didChangeValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		didChangeValueForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend didChangeValueForKey_withSetMutation_usingObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didChangeValueForKey_withSetMutation_usingObjects_IMetInst(){
		return ((didChangeValueForKey_withSetMutation_usingObjects_IMetInst != null)
	? (didChangeValueForKey_withSetMutation_usingObjects_IMetInst)
	: (didChangeValueForKey_withSetMutation_usingObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didChangeValueForKey:withSetMutation:usingObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void didChangeValueForKey_withSetMutation_usingObjects(final com.apple.jobjc.foundation.NSString key, final long mutationKind, final com.apple.jobjc.foundation.NSSet objects){
			final com.apple.jobjc.Invoke.MsgSend didChangeValueForKey_withSetMutation_usingObjects_IMetInst = get_didChangeValueForKey_withSetMutation_usingObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didChangeValueForKey_withSetMutation_usingObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mutationKind);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		didChangeValueForKey_withSetMutation_usingObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardContentIfPossible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardContentIfPossible_IMetInst(){
		return ((discardContentIfPossible_IMetInst != null)
	? (discardContentIfPossible_IMetInst)
	: (discardContentIfPossible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardContentIfPossible", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardContentIfPossible(){
			final com.apple.jobjc.Invoke.MsgSend discardContentIfPossible_IMetInst = get_discardContentIfPossible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardContentIfPossible_IMetInst.init(nativeBuffer, this);
		discardContentIfPossible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doesContain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doesContain_IMetInst(){
		return ((doesContain_IMetInst != null)
	? (doesContain_IMetInst)
	: (doesContain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doesContain:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean doesContain(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend doesContain_IMetInst = get_doesContain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doesContain_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		doesContain_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doesNotRecognizeSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doesNotRecognizeSelector_IMetInst(){
		return ((doesNotRecognizeSelector_IMetInst != null)
	? (doesNotRecognizeSelector_IMetInst)
	: (doesNotRecognizeSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doesNotRecognizeSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void doesNotRecognizeSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend doesNotRecognizeSelector_IMetInst = get_doesNotRecognizeSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doesNotRecognizeSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		doesNotRecognizeSelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_canAuthenticateAgainstProtectionSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_canAuthenticateAgainstProtectionSpace_IMetInst(){
		return ((download_canAuthenticateAgainstProtectionSpace_IMetInst != null)
	? (download_canAuthenticateAgainstProtectionSpace_IMetInst)
	: (download_canAuthenticateAgainstProtectionSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:canAuthenticateAgainstProtectionSpace:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean download_canAuthenticateAgainstProtectionSpace(final com.apple.jobjc.foundation.NSURLDownload connection, final com.apple.jobjc.foundation.NSURLProtectionSpace protectionSpace){
			final com.apple.jobjc.Invoke.MsgSend download_canAuthenticateAgainstProtectionSpace_IMetInst = get_download_canAuthenticateAgainstProtectionSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_canAuthenticateAgainstProtectionSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, protectionSpace);
		download_canAuthenticateAgainstProtectionSpace_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend download_decideDestinationWithSuggestedFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_decideDestinationWithSuggestedFilename_IMetInst(){
		return ((download_decideDestinationWithSuggestedFilename_IMetInst != null)
	? (download_decideDestinationWithSuggestedFilename_IMetInst)
	: (download_decideDestinationWithSuggestedFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:decideDestinationWithSuggestedFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_decideDestinationWithSuggestedFilename(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend download_decideDestinationWithSuggestedFilename_IMetInst = get_download_decideDestinationWithSuggestedFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_decideDestinationWithSuggestedFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		download_decideDestinationWithSuggestedFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didCancelAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didCancelAuthenticationChallenge_IMetInst(){
		return ((download_didCancelAuthenticationChallenge_IMetInst != null)
	? (download_didCancelAuthenticationChallenge_IMetInst)
	: (download_didCancelAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didCancelAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_didCancelAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend download_didCancelAuthenticationChallenge_IMetInst = get_download_didCancelAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didCancelAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		download_didCancelAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didCreateDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didCreateDestination_IMetInst(){
		return ((download_didCreateDestination_IMetInst != null)
	? (download_didCreateDestination_IMetInst)
	: (download_didCreateDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didCreateDestination:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_didCreateDestination(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend download_didCreateDestination_IMetInst = get_download_didCreateDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didCreateDestination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		download_didCreateDestination_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didFailWithError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didFailWithError_IMetInst(){
		return ((download_didFailWithError_IMetInst != null)
	? (download_didFailWithError_IMetInst)
	: (download_didFailWithError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didFailWithError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_didFailWithError(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend download_didFailWithError_IMetInst = get_download_didFailWithError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didFailWithError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		download_didFailWithError_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didReceiveAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didReceiveAuthenticationChallenge_IMetInst(){
		return ((download_didReceiveAuthenticationChallenge_IMetInst != null)
	? (download_didReceiveAuthenticationChallenge_IMetInst)
	: (download_didReceiveAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didReceiveAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_didReceiveAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend download_didReceiveAuthenticationChallenge_IMetInst = get_download_didReceiveAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didReceiveAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		download_didReceiveAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didReceiveDataOfLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didReceiveDataOfLength_IMetInst(){
		return ((download_didReceiveDataOfLength_IMetInst != null)
	? (download_didReceiveDataOfLength_IMetInst)
	: (download_didReceiveDataOfLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didReceiveDataOfLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void download_didReceiveDataOfLength(final com.apple.jobjc.foundation.NSURLDownload download, final long length){
			final com.apple.jobjc.Invoke.MsgSend download_didReceiveDataOfLength_IMetInst = get_download_didReceiveDataOfLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didReceiveDataOfLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		download_didReceiveDataOfLength_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_didReceiveResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_didReceiveResponse_IMetInst(){
		return ((download_didReceiveResponse_IMetInst != null)
	? (download_didReceiveResponse_IMetInst)
	: (download_didReceiveResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:didReceiveResponse:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void download_didReceiveResponse(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSURLResponse response){
			final com.apple.jobjc.Invoke.MsgSend download_didReceiveResponse_IMetInst = get_download_didReceiveResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_didReceiveResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		download_didReceiveResponse_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_shouldDecodeSourceDataOfMIMEType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_shouldDecodeSourceDataOfMIMEType_IMetInst(){
		return ((download_shouldDecodeSourceDataOfMIMEType_IMetInst != null)
	? (download_shouldDecodeSourceDataOfMIMEType_IMetInst)
	: (download_shouldDecodeSourceDataOfMIMEType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:shouldDecodeSourceDataOfMIMEType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean download_shouldDecodeSourceDataOfMIMEType(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSString encodingType){
			final com.apple.jobjc.Invoke.MsgSend download_shouldDecodeSourceDataOfMIMEType_IMetInst = get_download_shouldDecodeSourceDataOfMIMEType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_shouldDecodeSourceDataOfMIMEType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, encodingType);
		download_shouldDecodeSourceDataOfMIMEType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend download_willResumeWithResponse_fromByte_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_willResumeWithResponse_fromByte_IMetInst(){
		return ((download_willResumeWithResponse_fromByte_IMetInst != null)
	? (download_willResumeWithResponse_fromByte_IMetInst)
	: (download_willResumeWithResponse_fromByte_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:willResumeWithResponse:fromByte:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public void download_willResumeWithResponse_fromByte(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSURLResponse response, final long startingByte){
			final com.apple.jobjc.Invoke.MsgSend download_willResumeWithResponse_fromByte_IMetInst = get_download_willResumeWithResponse_fromByte_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_willResumeWithResponse_fromByte_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, response);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, startingByte);
		download_willResumeWithResponse_fromByte_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend download_willSendRequest_redirectResponse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_download_willSendRequest_redirectResponse_IMetInst(){
		return ((download_willSendRequest_redirectResponse_IMetInst != null)
	? (download_willSendRequest_redirectResponse_IMetInst)
	: (download_willSendRequest_redirectResponse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "download:willSendRequest:redirectResponse:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLRequest download_willSendRequest_redirectResponse(final com.apple.jobjc.foundation.NSURLDownload download, final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.foundation.NSURLResponse redirectResponse){
			final com.apple.jobjc.Invoke.MsgSend download_willSendRequest_redirectResponse_IMetInst = get_download_willSendRequest_redirectResponse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		download_willSendRequest_redirectResponse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, redirectResponse);
		download_willSendRequest_redirectResponse_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLRequest returnValue = (com.apple.jobjc.foundation.NSURLRequest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend downloadDidBegin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_downloadDidBegin_IMetInst(){
		return ((downloadDidBegin_IMetInst != null)
	? (downloadDidBegin_IMetInst)
	: (downloadDidBegin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "downloadDidBegin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void downloadDidBegin(final com.apple.jobjc.foundation.NSURLDownload download){
			final com.apple.jobjc.Invoke.MsgSend downloadDidBegin_IMetInst = get_downloadDidBegin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		downloadDidBegin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		downloadDidBegin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend downloadDidFinish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_downloadDidFinish_IMetInst(){
		return ((downloadDidFinish_IMetInst != null)
	? (downloadDidFinish_IMetInst)
	: (downloadDidFinish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "downloadDidFinish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void downloadDidFinish(final com.apple.jobjc.foundation.NSURLDownload download){
			final com.apple.jobjc.Invoke.MsgSend downloadDidFinish_IMetInst = get_downloadDidFinish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		downloadDidFinish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		downloadDidFinish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend downloadShouldUseCredentialStorage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_downloadShouldUseCredentialStorage_IMetInst(){
		return ((downloadShouldUseCredentialStorage_IMetInst != null)
	? (downloadShouldUseCredentialStorage_IMetInst)
	: (downloadShouldUseCredentialStorage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "downloadShouldUseCredentialStorage:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean downloadShouldUseCredentialStorage(final com.apple.jobjc.foundation.NSURLDownload download){
			final com.apple.jobjc.Invoke.MsgSend downloadShouldUseCredentialStorage_IMetInst = get_downloadShouldUseCredentialStorage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		downloadShouldUseCredentialStorage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, download);
		downloadShouldUseCredentialStorage_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeWithCoder_IMetInst(){
		return ((encodeWithCoder_IMetInst != null)
	? (encodeWithCoder_IMetInst)
	: (encodeWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeWithCoder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeWithCoder(final com.apple.jobjc.foundation.NSCoder aCoder){
			final com.apple.jobjc.Invoke.MsgSend encodeWithCoder_IMetInst = get_encodeWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCoder);
		encodeWithCoder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endContentAccess_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endContentAccess_IMetInst(){
		return ((endContentAccess_IMetInst != null)
	? (endContentAccess_IMetInst)
	: (endContentAccess_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endContentAccess", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endContentAccess(){
			final com.apple.jobjc.Invoke.MsgSend endContentAccess_IMetInst = get_endContentAccess_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endContentAccess_IMetInst.init(nativeBuffer, this);
		endContentAccess_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst(){
		return ((exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst != null)
	? (exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst)
	: (exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exceptionDuringOperation:error:leftOperand:rightOperand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDecimalNumber exceptionDuringOperation_error_leftOperand_rightOperand(final com.apple.jobjc.SEL operation, final long error, final com.apple.jobjc.foundation.NSDecimalNumber leftOperand, final com.apple.jobjc.foundation.NSDecimalNumber rightOperand){
			final com.apple.jobjc.Invoke.MsgSend exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst = get_exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, operation);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, leftOperand);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rightOperand);
		exceptionDuringOperation_error_leftOperand_rightOperand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDecimalNumber returnValue = (com.apple.jobjc.foundation.NSDecimalNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldCopyItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldCopyItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldCopyItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldCopyItemAtPath_toPath_IMetInst)
	: (fileManager_shouldCopyItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldCopyItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldCopyItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldCopyItemAtPath_toPath_IMetInst = get_fileManager_shouldCopyItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldCopyItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldCopyItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldCopyItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldCopyItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldCopyItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldCopyItemAtURL_toURL_IMetInst)
	: (fileManager_shouldCopyItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldCopyItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldCopyItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldCopyItemAtURL_toURL_IMetInst = get_fileManager_shouldCopyItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldCopyItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldCopyItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldLinkItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldLinkItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldLinkItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldLinkItemAtPath_toPath_IMetInst)
	: (fileManager_shouldLinkItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldLinkItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldLinkItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldLinkItemAtPath_toPath_IMetInst = get_fileManager_shouldLinkItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldLinkItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldLinkItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldLinkItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldLinkItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldLinkItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldLinkItemAtURL_toURL_IMetInst)
	: (fileManager_shouldLinkItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldLinkItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldLinkItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldLinkItemAtURL_toURL_IMetInst = get_fileManager_shouldLinkItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldLinkItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldLinkItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldMoveItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldMoveItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldMoveItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldMoveItemAtPath_toPath_IMetInst)
	: (fileManager_shouldMoveItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldMoveItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldMoveItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldMoveItemAtPath_toPath_IMetInst = get_fileManager_shouldMoveItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldMoveItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldMoveItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldMoveItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldMoveItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldMoveItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldMoveItemAtURL_toURL_IMetInst)
	: (fileManager_shouldMoveItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldMoveItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldMoveItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldMoveItemAtURL_toURL_IMetInst = get_fileManager_shouldMoveItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldMoveItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldMoveItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_IMetInst(){
		return ((fileManager_shouldProceedAfterError_IMetInst != null)
	? (fileManager_shouldProceedAfterError_IMetInst)
	: (fileManager_shouldProceedAfterError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError(final com.apple.jobjc.foundation.NSFileManager fm, final com.apple.jobjc.foundation.NSDictionary errorInfo){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_IMetInst = get_fileManager_shouldProceedAfterError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fm);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorInfo);
		fileManager_shouldProceedAfterError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst)
	: (fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:copyingItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_copyingItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst = get_fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldProceedAfterError_copyingItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst)
	: (fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:copyingItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_copyingItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst = get_fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldProceedAfterError_copyingItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst)
	: (fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:linkingItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_linkingItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst = get_fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldProceedAfterError_linkingItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst)
	: (fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:linkingItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_linkingItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst = get_fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldProceedAfterError_linkingItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst(){
		return ((fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst != null)
	? (fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst)
	: (fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:movingItemAtPath:toPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_movingItemAtPath_toPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst = get_fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		fileManager_shouldProceedAfterError_movingItemAtPath_toPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst(){
		return ((fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst != null)
	? (fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst)
	: (fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:movingItemAtURL:toURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_movingItemAtURL_toURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst = get_fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		fileManager_shouldProceedAfterError_movingItemAtURL_toURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst(){
		return ((fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst != null)
	? (fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst)
	: (fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:removingItemAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_removingItemAtPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst = get_fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileManager_shouldProceedAfterError_removingItemAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst(){
		return ((fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst != null)
	? (fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst)
	: (fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldProceedAfterError:removingItemAtURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldProceedAfterError_removingItemAtURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst = get_fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		fileManager_shouldProceedAfterError_removingItemAtURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldRemoveItemAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldRemoveItemAtPath_IMetInst(){
		return ((fileManager_shouldRemoveItemAtPath_IMetInst != null)
	? (fileManager_shouldRemoveItemAtPath_IMetInst)
	: (fileManager_shouldRemoveItemAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldRemoveItemAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldRemoveItemAtPath(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldRemoveItemAtPath_IMetInst = get_fileManager_shouldRemoveItemAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldRemoveItemAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileManager_shouldRemoveItemAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_shouldRemoveItemAtURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_shouldRemoveItemAtURL_IMetInst(){
		return ((fileManager_shouldRemoveItemAtURL_IMetInst != null)
	? (fileManager_shouldRemoveItemAtURL_IMetInst)
	: (fileManager_shouldRemoveItemAtURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:shouldRemoveItemAtURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileManager_shouldRemoveItemAtURL(final com.apple.jobjc.foundation.NSFileManager fileManager, final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend fileManager_shouldRemoveItemAtURL_IMetInst = get_fileManager_shouldRemoveItemAtURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_shouldRemoveItemAtURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileManager);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		fileManager_shouldRemoveItemAtURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileManager_willProcessPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileManager_willProcessPath_IMetInst(){
		return ((fileManager_willProcessPath_IMetInst != null)
	? (fileManager_willProcessPath_IMetInst)
	: (fileManager_willProcessPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileManager:willProcessPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void fileManager_willProcessPath(final com.apple.jobjc.foundation.NSFileManager fm, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileManager_willProcessPath_IMetInst = get_fileManager_willProcessPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileManager_willProcessPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fm);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileManager_willProcessPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend finalizeVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finalizeVoid_IMetInst(){
		return ((finalizeVoid_IMetInst != null)
	? (finalizeVoid_IMetInst)
	: (finalizeVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finalize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finalizeVoid(){
			final com.apple.jobjc.Invoke.MsgSend finalizeVoid_IMetInst = get_finalizeVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finalizeVoid_IMetInst.init(nativeBuffer, this);
		finalizeVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend forwardInvocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_forwardInvocation_IMetInst(){
		return ((forwardInvocation_IMetInst != null)
	? (forwardInvocation_IMetInst)
	: (forwardInvocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "forwardInvocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void forwardInvocation(final com.apple.jobjc.foundation.NSInvocation anInvocation){
			final com.apple.jobjc.Invoke.MsgSend forwardInvocation_IMetInst = get_forwardInvocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		forwardInvocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anInvocation);
		forwardInvocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend forwardingTargetForSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_forwardingTargetForSelector_IMetInst(){
		return ((forwardingTargetForSelector_IMetInst != null)
	? (forwardingTargetForSelector_IMetInst)
	: (forwardingTargetForSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "forwardingTargetForSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T forwardingTargetForSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend forwardingTargetForSelector_IMetInst = get_forwardingTargetForSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		forwardingTargetForSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		forwardingTargetForSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleMachMessage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleMachMessage_IMetInst(){
		return ((handleMachMessage_IMetInst != null)
	? (handleMachMessage_IMetInst)
	: (handleMachMessage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleMachMessage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void handleMachMessage(final com.apple.jobjc.Pointer<Void> msg){
			final com.apple.jobjc.Invoke.MsgSend handleMachMessage_IMetInst = get_handleMachMessage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleMachMessage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, msg);
		handleMachMessage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend handlePortMessage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handlePortMessage_IMetInst(){
		return ((handlePortMessage_IMetInst != null)
	? (handlePortMessage_IMetInst)
	: (handlePortMessage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handlePortMessage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void handlePortMessage(final com.apple.jobjc.foundation.NSPortMessage message){
			final com.apple.jobjc.Invoke.MsgSend handlePortMessage_IMetInst = get_handlePortMessage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handlePortMessage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, message);
		handlePortMessage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend handleQueryWithUnboundKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleQueryWithUnboundKey_IMetInst(){
		return ((handleQueryWithUnboundKey_IMetInst != null)
	? (handleQueryWithUnboundKey_IMetInst)
	: (handleQueryWithUnboundKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleQueryWithUnboundKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handleQueryWithUnboundKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend handleQueryWithUnboundKey_IMetInst = get_handleQueryWithUnboundKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleQueryWithUnboundKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		handleQueryWithUnboundKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleTakeValue_forUnboundKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleTakeValue_forUnboundKey_IMetInst(){
		return ((handleTakeValue_forUnboundKey_IMetInst != null)
	? (handleTakeValue_forUnboundKey_IMetInst)
	: (handleTakeValue_forUnboundKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleTakeValue:forUnboundKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void handleTakeValue_forUnboundKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend handleTakeValue_forUnboundKey_IMetInst = get_handleTakeValue_forUnboundKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleTakeValue_forUnboundKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		handleTakeValue_forUnboundKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hash_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hash_IMetInst(){
		return ((hash_IMetInst != null)
	? (hash_IMetInst)
	: (hash_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hash", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long hash(){
			final com.apple.jobjc.Invoke.MsgSend hash_IMetInst = get_hash_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hash_IMetInst.init(nativeBuffer, this);
		hash_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst(){
		return ((indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst != null)
	? (indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst)
	: (indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indicesOfObjectsByEvaluatingObjectSpecifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray indicesOfObjectsByEvaluatingObjectSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier specifier){
			final com.apple.jobjc.Invoke.MsgSend indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst = get_indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, specifier);
		indicesOfObjectsByEvaluatingObjectSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCoder_IMetInst(){
		return ((initWithCoder_IMetInst != null)
	? (initWithCoder_IMetInst)
	: (initWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCoder:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCoder(final com.apple.jobjc.foundation.NSCoder aDecoder){
			final com.apple.jobjc.Invoke.MsgSend initWithCoder_IMetInst = get_initWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDecoder);
		initWithCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertValue_atIndex_inPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertValue_atIndex_inPropertyWithKey_IMetInst(){
		return ((insertValue_atIndex_inPropertyWithKey_IMetInst != null)
	? (insertValue_atIndex_inPropertyWithKey_IMetInst)
	: (insertValue_atIndex_inPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertValue:atIndex:inPropertyWithKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertValue_atIndex_inPropertyWithKey(final com.apple.jobjc.ID value, final long index, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend insertValue_atIndex_inPropertyWithKey_IMetInst = get_insertValue_atIndex_inPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertValue_atIndex_inPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		insertValue_atIndex_inPropertyWithKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertValue_inPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertValue_inPropertyWithKey_IMetInst(){
		return ((insertValue_inPropertyWithKey_IMetInst != null)
	? (insertValue_inPropertyWithKey_IMetInst)
	: (insertValue_inPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertValue:inPropertyWithKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertValue_inPropertyWithKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend insertValue_inPropertyWithKey_IMetInst = get_insertValue_inPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertValue_inPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		insertValue_inPropertyWithKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend inverseForRelationshipKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inverseForRelationshipKey_IMetInst(){
		return ((inverseForRelationshipKey_IMetInst != null)
	? (inverseForRelationshipKey_IMetInst)
	: (inverseForRelationshipKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inverseForRelationshipKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString inverseForRelationshipKey(final com.apple.jobjc.foundation.NSString relationshipKey){
			final com.apple.jobjc.Invoke.MsgSend inverseForRelationshipKey_IMetInst = get_inverseForRelationshipKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inverseForRelationshipKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, relationshipKey);
		inverseForRelationshipKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isCaseInsensitiveLike_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCaseInsensitiveLike_IMetInst(){
		return ((isCaseInsensitiveLike_IMetInst != null)
	? (isCaseInsensitiveLike_IMetInst)
	: (isCaseInsensitiveLike_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCaseInsensitiveLike:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isCaseInsensitiveLike(final com.apple.jobjc.foundation.NSString object){
			final com.apple.jobjc.Invoke.MsgSend isCaseInsensitiveLike_IMetInst = get_isCaseInsensitiveLike_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCaseInsensitiveLike_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isCaseInsensitiveLike_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isContentDiscarded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isContentDiscarded_IMetInst(){
		return ((isContentDiscarded_IMetInst != null)
	? (isContentDiscarded_IMetInst)
	: (isContentDiscarded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isContentDiscarded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isContentDiscarded(){
			final com.apple.jobjc.Invoke.MsgSend isContentDiscarded_IMetInst = get_isContentDiscarded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isContentDiscarded_IMetInst.init(nativeBuffer, this);
		isContentDiscarded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqual_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqual_IMetInst(){
		return ((isEqual_IMetInst != null)
	? (isEqual_IMetInst)
	: (isEqual_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqual:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqual(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isEqual_IMetInst = get_isEqual_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqual_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isEqual_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualTo_IMetInst(){
		return ((isEqualTo_IMetInst != null)
	? (isEqualTo_IMetInst)
	: (isEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isEqualTo_IMetInst = get_isEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isGreaterThan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isGreaterThan_IMetInst(){
		return ((isGreaterThan_IMetInst != null)
	? (isGreaterThan_IMetInst)
	: (isGreaterThan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isGreaterThan:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isGreaterThan(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isGreaterThan_IMetInst = get_isGreaterThan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isGreaterThan_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isGreaterThan_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isGreaterThanOrEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isGreaterThanOrEqualTo_IMetInst(){
		return ((isGreaterThanOrEqualTo_IMetInst != null)
	? (isGreaterThanOrEqualTo_IMetInst)
	: (isGreaterThanOrEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isGreaterThanOrEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isGreaterThanOrEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isGreaterThanOrEqualTo_IMetInst = get_isGreaterThanOrEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isGreaterThanOrEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isGreaterThanOrEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isKindOfClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isKindOfClass_IMetInst(){
		return ((isKindOfClass_IMetInst != null)
	? (isKindOfClass_IMetInst)
	: (isKindOfClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isKindOfClass:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public boolean isKindOfClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend isKindOfClass_IMetInst = get_isKindOfClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isKindOfClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		isKindOfClass_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLessThan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLessThan_IMetInst(){
		return ((isLessThan_IMetInst != null)
	? (isLessThan_IMetInst)
	: (isLessThan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLessThan:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isLessThan(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isLessThan_IMetInst = get_isLessThan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLessThan_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isLessThan_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLessThanOrEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLessThanOrEqualTo_IMetInst(){
		return ((isLessThanOrEqualTo_IMetInst != null)
	? (isLessThanOrEqualTo_IMetInst)
	: (isLessThanOrEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLessThanOrEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isLessThanOrEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isLessThanOrEqualTo_IMetInst = get_isLessThanOrEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLessThanOrEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isLessThanOrEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLike_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLike_IMetInst(){
		return ((isLike_IMetInst != null)
	? (isLike_IMetInst)
	: (isLike_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLike:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isLike(final com.apple.jobjc.foundation.NSString object){
			final com.apple.jobjc.Invoke.MsgSend isLike_IMetInst = get_isLike_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLike_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isLike_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMemberOfClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMemberOfClass_IMetInst(){
		return ((isMemberOfClass_IMetInst != null)
	? (isMemberOfClass_IMetInst)
	: (isMemberOfClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMemberOfClass:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public boolean isMemberOfClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend isMemberOfClass_IMetInst = get_isMemberOfClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMemberOfClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		isMemberOfClass_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isNotEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isNotEqualTo_IMetInst(){
		return ((isNotEqualTo_IMetInst != null)
	? (isNotEqualTo_IMetInst)
	: (isNotEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isNotEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isNotEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend isNotEqualTo_IMetInst = get_isNotEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isNotEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		isNotEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isProxy_IMetInst(){
		return ((isProxy_IMetInst != null)
	? (isProxy_IMetInst)
	: (isProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isProxy", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isProxy(){
			final com.apple.jobjc.Invoke.MsgSend isProxy_IMetInst = get_isProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isProxy_IMetInst.init(nativeBuffer, this);
		isProxy_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend listener_shouldAcceptNewConnection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_listener_shouldAcceptNewConnection_IMetInst(){
		return ((listener_shouldAcceptNewConnection_IMetInst != null)
	? (listener_shouldAcceptNewConnection_IMetInst)
	: (listener_shouldAcceptNewConnection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "listener:shouldAcceptNewConnection:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean listener_shouldAcceptNewConnection(final com.apple.jobjc.foundation.NSXPCListener listener, final com.apple.jobjc.foundation.NSXPCConnection newConnection){
			final com.apple.jobjc.Invoke.MsgSend listener_shouldAcceptNewConnection_IMetInst = get_listener_shouldAcceptNewConnection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		listener_shouldAcceptNewConnection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, listener);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newConnection);
		listener_shouldAcceptNewConnection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lock_IMetInst(){
		return ((lock_IMetInst != null)
	? (lock_IMetInst)
	: (lock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lock", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void lock(){
			final com.apple.jobjc.Invoke.MsgSend lock_IMetInst = get_lock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lock_IMetInst.init(nativeBuffer, this);
		lock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeNewConnection_sender_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeNewConnection_sender_IMetInst(){
		return ((makeNewConnection_sender_IMetInst != null)
	? (makeNewConnection_sender_IMetInst)
	: (makeNewConnection_sender_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeNewConnection:sender:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean makeNewConnection_sender(final com.apple.jobjc.foundation.NSConnection conn, final com.apple.jobjc.foundation.NSConnection ancestor){
			final com.apple.jobjc.Invoke.MsgSend makeNewConnection_sender_IMetInst = get_makeNewConnection_sender_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeNewConnection_sender_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, conn);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ancestor);
		makeNewConnection_sender_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend metadataQuery_replacementObjectForResultObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_metadataQuery_replacementObjectForResultObject_IMetInst(){
		return ((metadataQuery_replacementObjectForResultObject_IMetInst != null)
	? (metadataQuery_replacementObjectForResultObject_IMetInst)
	: (metadataQuery_replacementObjectForResultObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "metadataQuery:replacementObjectForResultObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T metadataQuery_replacementObjectForResultObject(final com.apple.jobjc.foundation.NSMetadataQuery query, final com.apple.jobjc.foundation.NSMetadataItem result){
			final com.apple.jobjc.Invoke.MsgSend metadataQuery_replacementObjectForResultObject_IMetInst = get_metadataQuery_replacementObjectForResultObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		metadataQuery_replacementObjectForResultObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, query);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, result);
		metadataQuery_replacementObjectForResultObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend metadataQuery_replacementValueForAttribute_value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_metadataQuery_replacementValueForAttribute_value_IMetInst(){
		return ((metadataQuery_replacementValueForAttribute_value_IMetInst != null)
	? (metadataQuery_replacementValueForAttribute_value_IMetInst)
	: (metadataQuery_replacementValueForAttribute_value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "metadataQuery:replacementValueForAttribute:value:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T metadataQuery_replacementValueForAttribute_value(final com.apple.jobjc.foundation.NSMetadataQuery query, final com.apple.jobjc.foundation.NSString attrName, final com.apple.jobjc.ID attrValue){
			final com.apple.jobjc.Invoke.MsgSend metadataQuery_replacementValueForAttribute_value_IMetInst = get_metadataQuery_replacementValueForAttribute_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		metadataQuery_replacementValueForAttribute_value_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, query);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrValue);
		metadataQuery_replacementValueForAttribute_value_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend methodForSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodForSelector_IMetInst(){
		return ((methodForSelector_IMetInst != null)
	? (methodForSelector_IMetInst)
	: (methodForSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodForSelector:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public Object /* IMP (^?, ^?) */ methodForSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend methodForSelector_IMetInst = get_methodForSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodForSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		methodForSelector_IMetInst.invoke(nativeBuffer);
		final Object /* IMP (^?, ^?) */ returnValue = (Object /* IMP (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend methodSignatureForSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodSignatureForSelector_IMetInst(){
		return ((methodSignatureForSelector_IMetInst != null)
	? (methodSignatureForSelector_IMetInst)
	: (methodSignatureForSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodSignatureForSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMethodSignature methodSignatureForSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend methodSignatureForSelector_IMetInst = get_methodSignatureForSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodSignatureForSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		methodSignatureForSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMethodSignature returnValue = (com.apple.jobjc.foundation.NSMethodSignature) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableArrayValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableArrayValueForKey_IMetInst(){
		return ((mutableArrayValueForKey_IMetInst != null)
	? (mutableArrayValueForKey_IMetInst)
	: (mutableArrayValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableArrayValueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableArray mutableArrayValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend mutableArrayValueForKey_IMetInst = get_mutableArrayValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableArrayValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		mutableArrayValueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableArray returnValue = (com.apple.jobjc.foundation.NSMutableArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableArrayValueForKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableArrayValueForKeyPath_IMetInst(){
		return ((mutableArrayValueForKeyPath_IMetInst != null)
	? (mutableArrayValueForKeyPath_IMetInst)
	: (mutableArrayValueForKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableArrayValueForKeyPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableArray mutableArrayValueForKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend mutableArrayValueForKeyPath_IMetInst = get_mutableArrayValueForKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableArrayValueForKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		mutableArrayValueForKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableArray returnValue = (com.apple.jobjc.foundation.NSMutableArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableCopy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableCopy_IMetInst(){
		return ((mutableCopy_IMetInst != null)
	? (mutableCopy_IMetInst)
	: (mutableCopy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableCopy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mutableCopy(){
			final com.apple.jobjc.Invoke.MsgSend mutableCopy_IMetInst = get_mutableCopy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableCopy_IMetInst.init(nativeBuffer, this);
		mutableCopy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableCopyWithZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableCopyWithZone_IMetInst(){
		return ((mutableCopyWithZone_IMetInst != null)
	? (mutableCopyWithZone_IMetInst)
	: (mutableCopyWithZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableCopyWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mutableCopyWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend mutableCopyWithZone_IMetInst = get_mutableCopyWithZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableCopyWithZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		mutableCopyWithZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableOrderedSetValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableOrderedSetValueForKey_IMetInst(){
		return ((mutableOrderedSetValueForKey_IMetInst != null)
	? (mutableOrderedSetValueForKey_IMetInst)
	: (mutableOrderedSetValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableOrderedSetValueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableOrderedSet mutableOrderedSetValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend mutableOrderedSetValueForKey_IMetInst = get_mutableOrderedSetValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableOrderedSetValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		mutableOrderedSetValueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableOrderedSet returnValue = (com.apple.jobjc.foundation.NSMutableOrderedSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableOrderedSetValueForKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableOrderedSetValueForKeyPath_IMetInst(){
		return ((mutableOrderedSetValueForKeyPath_IMetInst != null)
	? (mutableOrderedSetValueForKeyPath_IMetInst)
	: (mutableOrderedSetValueForKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableOrderedSetValueForKeyPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableOrderedSet mutableOrderedSetValueForKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend mutableOrderedSetValueForKeyPath_IMetInst = get_mutableOrderedSetValueForKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableOrderedSetValueForKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		mutableOrderedSetValueForKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableOrderedSet returnValue = (com.apple.jobjc.foundation.NSMutableOrderedSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableSetValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableSetValueForKey_IMetInst(){
		return ((mutableSetValueForKey_IMetInst != null)
	? (mutableSetValueForKey_IMetInst)
	: (mutableSetValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableSetValueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableSet mutableSetValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend mutableSetValueForKey_IMetInst = get_mutableSetValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableSetValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		mutableSetValueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableSet returnValue = (com.apple.jobjc.foundation.NSMutableSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableSetValueForKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableSetValueForKeyPath_IMetInst(){
		return ((mutableSetValueForKeyPath_IMetInst != null)
	? (mutableSetValueForKeyPath_IMetInst)
	: (mutableSetValueForKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableSetValueForKeyPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableSet mutableSetValueForKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend mutableSetValueForKeyPath_IMetInst = get_mutableSetValueForKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableSetValueForKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		mutableSetValueForKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableSet returnValue = (com.apple.jobjc.foundation.NSMutableSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend netService_didNotPublish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netService_didNotPublish_IMetInst(){
		return ((netService_didNotPublish_IMetInst != null)
	? (netService_didNotPublish_IMetInst)
	: (netService_didNotPublish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netService:didNotPublish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netService_didNotPublish(final com.apple.jobjc.foundation.NSNetService sender, final com.apple.jobjc.foundation.NSDictionary errorDict){
			final com.apple.jobjc.Invoke.MsgSend netService_didNotPublish_IMetInst = get_netService_didNotPublish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netService_didNotPublish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorDict);
		netService_didNotPublish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netService_didNotResolve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netService_didNotResolve_IMetInst(){
		return ((netService_didNotResolve_IMetInst != null)
	? (netService_didNotResolve_IMetInst)
	: (netService_didNotResolve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netService:didNotResolve:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netService_didNotResolve(final com.apple.jobjc.foundation.NSNetService sender, final com.apple.jobjc.foundation.NSDictionary errorDict){
			final com.apple.jobjc.Invoke.MsgSend netService_didNotResolve_IMetInst = get_netService_didNotResolve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netService_didNotResolve_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorDict);
		netService_didNotResolve_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netService_didUpdateTXTRecordData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netService_didUpdateTXTRecordData_IMetInst(){
		return ((netService_didUpdateTXTRecordData_IMetInst != null)
	? (netService_didUpdateTXTRecordData_IMetInst)
	: (netService_didUpdateTXTRecordData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netService:didUpdateTXTRecordData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netService_didUpdateTXTRecordData(final com.apple.jobjc.foundation.NSNetService sender, final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend netService_didUpdateTXTRecordData_IMetInst = get_netService_didUpdateTXTRecordData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netService_didUpdateTXTRecordData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		netService_didUpdateTXTRecordData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didFindDomain_moreComing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowser_didFindDomain_moreComing_IMetInst(){
		return ((netServiceBrowser_didFindDomain_moreComing_IMetInst != null)
	? (netServiceBrowser_didFindDomain_moreComing_IMetInst)
	: (netServiceBrowser_didFindDomain_moreComing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowser:didFindDomain:moreComing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void netServiceBrowser_didFindDomain_moreComing(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser, final com.apple.jobjc.foundation.NSString domainString, final boolean moreComing){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didFindDomain_moreComing_IMetInst = get_netServiceBrowser_didFindDomain_moreComing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowser_didFindDomain_moreComing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainString);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, moreComing);
		netServiceBrowser_didFindDomain_moreComing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didFindService_moreComing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowser_didFindService_moreComing_IMetInst(){
		return ((netServiceBrowser_didFindService_moreComing_IMetInst != null)
	? (netServiceBrowser_didFindService_moreComing_IMetInst)
	: (netServiceBrowser_didFindService_moreComing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowser:didFindService:moreComing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void netServiceBrowser_didFindService_moreComing(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser, final com.apple.jobjc.foundation.NSNetService aNetService, final boolean moreComing){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didFindService_moreComing_IMetInst = get_netServiceBrowser_didFindService_moreComing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowser_didFindService_moreComing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetService);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, moreComing);
		netServiceBrowser_didFindService_moreComing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didNotSearch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowser_didNotSearch_IMetInst(){
		return ((netServiceBrowser_didNotSearch_IMetInst != null)
	? (netServiceBrowser_didNotSearch_IMetInst)
	: (netServiceBrowser_didNotSearch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowser:didNotSearch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceBrowser_didNotSearch(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser, final com.apple.jobjc.foundation.NSDictionary errorDict){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didNotSearch_IMetInst = get_netServiceBrowser_didNotSearch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowser_didNotSearch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, errorDict);
		netServiceBrowser_didNotSearch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didRemoveDomain_moreComing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowser_didRemoveDomain_moreComing_IMetInst(){
		return ((netServiceBrowser_didRemoveDomain_moreComing_IMetInst != null)
	? (netServiceBrowser_didRemoveDomain_moreComing_IMetInst)
	: (netServiceBrowser_didRemoveDomain_moreComing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowser:didRemoveDomain:moreComing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void netServiceBrowser_didRemoveDomain_moreComing(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser, final com.apple.jobjc.foundation.NSString domainString, final boolean moreComing){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didRemoveDomain_moreComing_IMetInst = get_netServiceBrowser_didRemoveDomain_moreComing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowser_didRemoveDomain_moreComing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainString);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, moreComing);
		netServiceBrowser_didRemoveDomain_moreComing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didRemoveService_moreComing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowser_didRemoveService_moreComing_IMetInst(){
		return ((netServiceBrowser_didRemoveService_moreComing_IMetInst != null)
	? (netServiceBrowser_didRemoveService_moreComing_IMetInst)
	: (netServiceBrowser_didRemoveService_moreComing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowser:didRemoveService:moreComing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void netServiceBrowser_didRemoveService_moreComing(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser, final com.apple.jobjc.foundation.NSNetService aNetService, final boolean moreComing){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowser_didRemoveService_moreComing_IMetInst = get_netServiceBrowser_didRemoveService_moreComing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowser_didRemoveService_moreComing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetService);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, moreComing);
		netServiceBrowser_didRemoveService_moreComing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowserDidStopSearch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowserDidStopSearch_IMetInst(){
		return ((netServiceBrowserDidStopSearch_IMetInst != null)
	? (netServiceBrowserDidStopSearch_IMetInst)
	: (netServiceBrowserDidStopSearch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowserDidStopSearch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceBrowserDidStopSearch(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowserDidStopSearch_IMetInst = get_netServiceBrowserDidStopSearch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowserDidStopSearch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		netServiceBrowserDidStopSearch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceBrowserWillSearch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceBrowserWillSearch_IMetInst(){
		return ((netServiceBrowserWillSearch_IMetInst != null)
	? (netServiceBrowserWillSearch_IMetInst)
	: (netServiceBrowserWillSearch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceBrowserWillSearch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceBrowserWillSearch(final com.apple.jobjc.foundation.NSNetServiceBrowser aNetServiceBrowser){
			final com.apple.jobjc.Invoke.MsgSend netServiceBrowserWillSearch_IMetInst = get_netServiceBrowserWillSearch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceBrowserWillSearch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNetServiceBrowser);
		netServiceBrowserWillSearch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceDidPublish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceDidPublish_IMetInst(){
		return ((netServiceDidPublish_IMetInst != null)
	? (netServiceDidPublish_IMetInst)
	: (netServiceDidPublish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceDidPublish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceDidPublish(final com.apple.jobjc.foundation.NSNetService sender){
			final com.apple.jobjc.Invoke.MsgSend netServiceDidPublish_IMetInst = get_netServiceDidPublish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceDidPublish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		netServiceDidPublish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceDidResolveAddress_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceDidResolveAddress_IMetInst(){
		return ((netServiceDidResolveAddress_IMetInst != null)
	? (netServiceDidResolveAddress_IMetInst)
	: (netServiceDidResolveAddress_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceDidResolveAddress:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceDidResolveAddress(final com.apple.jobjc.foundation.NSNetService sender){
			final com.apple.jobjc.Invoke.MsgSend netServiceDidResolveAddress_IMetInst = get_netServiceDidResolveAddress_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceDidResolveAddress_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		netServiceDidResolveAddress_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceDidStop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceDidStop_IMetInst(){
		return ((netServiceDidStop_IMetInst != null)
	? (netServiceDidStop_IMetInst)
	: (netServiceDidStop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceDidStop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceDidStop(final com.apple.jobjc.foundation.NSNetService sender){
			final com.apple.jobjc.Invoke.MsgSend netServiceDidStop_IMetInst = get_netServiceDidStop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceDidStop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		netServiceDidStop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceWillPublish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceWillPublish_IMetInst(){
		return ((netServiceWillPublish_IMetInst != null)
	? (netServiceWillPublish_IMetInst)
	: (netServiceWillPublish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceWillPublish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceWillPublish(final com.apple.jobjc.foundation.NSNetService sender){
			final com.apple.jobjc.Invoke.MsgSend netServiceWillPublish_IMetInst = get_netServiceWillPublish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceWillPublish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		netServiceWillPublish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend netServiceWillResolve_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_netServiceWillResolve_IMetInst(){
		return ((netServiceWillResolve_IMetInst != null)
	? (netServiceWillResolve_IMetInst)
	: (netServiceWillResolve_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "netServiceWillResolve:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void netServiceWillResolve(final com.apple.jobjc.foundation.NSNetService sender){
			final com.apple.jobjc.Invoke.MsgSend netServiceWillResolve_IMetInst = get_netServiceWillResolve_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		netServiceWillResolve_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		netServiceWillResolve_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst(){
		return ((newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst != null)
	? (newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst)
	: (newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newScriptingObjectOfClass:forValueForKey:withContentsValue:properties:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T newScriptingObjectOfClass_forValueForKey_withContentsValue_properties(final com.apple.jobjc.NSClass objectClass, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.ID contentsValue, final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst = get_newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, objectClass);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		newScriptingObjectOfClass_forValueForKey_withContentsValue_properties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectSpecifier_IMetInst(){
		return ((objectSpecifier_IMetInst != null)
	? (objectSpecifier_IMetInst)
	: (objectSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier objectSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst = get_objectSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectSpecifier_IMetInst.init(nativeBuffer, this);
		objectSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend observationInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_observationInfo_IMetInst(){
		return ((observationInfo_IMetInst != null)
	? (observationInfo_IMetInst)
	: (observationInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "observationInfo", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> observationInfo(){
			final com.apple.jobjc.Invoke.MsgSend observationInfo_IMetInst = get_observationInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		observationInfo_IMetInst.init(nativeBuffer, this);
		observationInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend observeValueForKeyPath_ofObject_change_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_observeValueForKeyPath_ofObject_change_context_IMetInst(){
		return ((observeValueForKeyPath_ofObject_change_context_IMetInst != null)
	? (observeValueForKeyPath_ofObject_change_context_IMetInst)
	: (observeValueForKeyPath_ofObject_change_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "observeValueForKeyPath:ofObject:change:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void observeValueForKeyPath_ofObject_change_context(final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSDictionary change, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend observeValueForKeyPath_ofObject_change_context_IMetInst = get_observeValueForKeyPath_ofObject_change_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		observeValueForKeyPath_ofObject_change_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, change);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		observeValueForKeyPath_ofObject_change_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_didEndElement_namespaceURI_qualifiedName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_didEndElement_namespaceURI_qualifiedName_IMetInst(){
		return ((parser_didEndElement_namespaceURI_qualifiedName_IMetInst != null)
	? (parser_didEndElement_namespaceURI_qualifiedName_IMetInst)
	: (parser_didEndElement_namespaceURI_qualifiedName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:didEndElement:namespaceURI:qualifiedName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_didEndElement_namespaceURI_qualifiedName(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString elementName, final com.apple.jobjc.foundation.NSString namespaceURI, final com.apple.jobjc.foundation.NSString qName){
			final com.apple.jobjc.Invoke.MsgSend parser_didEndElement_namespaceURI_qualifiedName_IMetInst = get_parser_didEndElement_namespaceURI_qualifiedName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_didEndElement_namespaceURI_qualifiedName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, elementName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namespaceURI);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, qName);
		parser_didEndElement_namespaceURI_qualifiedName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_didEndMappingPrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_didEndMappingPrefix_IMetInst(){
		return ((parser_didEndMappingPrefix_IMetInst != null)
	? (parser_didEndMappingPrefix_IMetInst)
	: (parser_didEndMappingPrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:didEndMappingPrefix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_didEndMappingPrefix(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString prefix){
			final com.apple.jobjc.Invoke.MsgSend parser_didEndMappingPrefix_IMetInst = get_parser_didEndMappingPrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_didEndMappingPrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, prefix);
		parser_didEndMappingPrefix_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst(){
		return ((parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst != null)
	? (parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst)
	: (parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:didStartElement:namespaceURI:qualifiedName:attributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_didStartElement_namespaceURI_qualifiedName_attributes(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString elementName, final com.apple.jobjc.foundation.NSString namespaceURI, final com.apple.jobjc.foundation.NSString qName, final com.apple.jobjc.foundation.NSDictionary attributeDict){
			final com.apple.jobjc.Invoke.MsgSend parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst = get_parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, elementName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namespaceURI);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, qName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeDict);
		parser_didStartElement_namespaceURI_qualifiedName_attributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_didStartMappingPrefix_toURI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_didStartMappingPrefix_toURI_IMetInst(){
		return ((parser_didStartMappingPrefix_toURI_IMetInst != null)
	? (parser_didStartMappingPrefix_toURI_IMetInst)
	: (parser_didStartMappingPrefix_toURI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:didStartMappingPrefix:toURI:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_didStartMappingPrefix_toURI(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString prefix, final com.apple.jobjc.foundation.NSString namespaceURI){
			final com.apple.jobjc.Invoke.MsgSend parser_didStartMappingPrefix_toURI_IMetInst = get_parser_didStartMappingPrefix_toURI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_didStartMappingPrefix_toURI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, prefix);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namespaceURI);
		parser_didStartMappingPrefix_toURI_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst(){
		return ((parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst != null)
	? (parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst)
	: (parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundAttributeDeclarationWithName:forElement:type:defaultValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundAttributeDeclarationWithName_forElement_type_defaultValue(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString attributeName, final com.apple.jobjc.foundation.NSString elementName, final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString defaultValue){
			final com.apple.jobjc.Invoke.MsgSend parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst = get_parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributeName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, elementName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultValue);
		parser_foundAttributeDeclarationWithName_forElement_type_defaultValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundCDATA_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundCDATA_IMetInst(){
		return ((parser_foundCDATA_IMetInst != null)
	? (parser_foundCDATA_IMetInst)
	: (parser_foundCDATA_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundCDATA:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundCDATA(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSData CDATABlock){
			final com.apple.jobjc.Invoke.MsgSend parser_foundCDATA_IMetInst = get_parser_foundCDATA_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundCDATA_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, CDATABlock);
		parser_foundCDATA_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundCharacters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundCharacters_IMetInst(){
		return ((parser_foundCharacters_IMetInst != null)
	? (parser_foundCharacters_IMetInst)
	: (parser_foundCharacters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundCharacters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundCharacters(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend parser_foundCharacters_IMetInst = get_parser_foundCharacters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundCharacters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		parser_foundCharacters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundComment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundComment_IMetInst(){
		return ((parser_foundComment_IMetInst != null)
	? (parser_foundComment_IMetInst)
	: (parser_foundComment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundComment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundComment(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString comment){
			final com.apple.jobjc.Invoke.MsgSend parser_foundComment_IMetInst = get_parser_foundComment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundComment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, comment);
		parser_foundComment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundElementDeclarationWithName_model_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundElementDeclarationWithName_model_IMetInst(){
		return ((parser_foundElementDeclarationWithName_model_IMetInst != null)
	? (parser_foundElementDeclarationWithName_model_IMetInst)
	: (parser_foundElementDeclarationWithName_model_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundElementDeclarationWithName:model:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundElementDeclarationWithName_model(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString elementName, final com.apple.jobjc.foundation.NSString model){
			final com.apple.jobjc.Invoke.MsgSend parser_foundElementDeclarationWithName_model_IMetInst = get_parser_foundElementDeclarationWithName_model_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundElementDeclarationWithName_model_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, elementName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, model);
		parser_foundElementDeclarationWithName_model_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst(){
		return ((parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst != null)
	? (parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst)
	: (parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundExternalEntityDeclarationWithName:publicID:systemID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundExternalEntityDeclarationWithName_publicID_systemID(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString publicID, final com.apple.jobjc.foundation.NSString systemID){
			final com.apple.jobjc.Invoke.MsgSend parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst = get_parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, publicID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		parser_foundExternalEntityDeclarationWithName_publicID_systemID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundIgnorableWhitespace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundIgnorableWhitespace_IMetInst(){
		return ((parser_foundIgnorableWhitespace_IMetInst != null)
	? (parser_foundIgnorableWhitespace_IMetInst)
	: (parser_foundIgnorableWhitespace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundIgnorableWhitespace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundIgnorableWhitespace(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString whitespaceString){
			final com.apple.jobjc.Invoke.MsgSend parser_foundIgnorableWhitespace_IMetInst = get_parser_foundIgnorableWhitespace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundIgnorableWhitespace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, whitespaceString);
		parser_foundIgnorableWhitespace_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundInternalEntityDeclarationWithName_value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundInternalEntityDeclarationWithName_value_IMetInst(){
		return ((parser_foundInternalEntityDeclarationWithName_value_IMetInst != null)
	? (parser_foundInternalEntityDeclarationWithName_value_IMetInst)
	: (parser_foundInternalEntityDeclarationWithName_value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundInternalEntityDeclarationWithName:value:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundInternalEntityDeclarationWithName_value(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString value){
			final com.apple.jobjc.Invoke.MsgSend parser_foundInternalEntityDeclarationWithName_value_IMetInst = get_parser_foundInternalEntityDeclarationWithName_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundInternalEntityDeclarationWithName_value_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		parser_foundInternalEntityDeclarationWithName_value_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst(){
		return ((parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst != null)
	? (parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst)
	: (parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundNotationDeclarationWithName:publicID:systemID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundNotationDeclarationWithName_publicID_systemID(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString publicID, final com.apple.jobjc.foundation.NSString systemID){
			final com.apple.jobjc.Invoke.MsgSend parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst = get_parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, publicID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		parser_foundNotationDeclarationWithName_publicID_systemID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundProcessingInstructionWithTarget_data_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundProcessingInstructionWithTarget_data_IMetInst(){
		return ((parser_foundProcessingInstructionWithTarget_data_IMetInst != null)
	? (parser_foundProcessingInstructionWithTarget_data_IMetInst)
	: (parser_foundProcessingInstructionWithTarget_data_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundProcessingInstructionWithTarget:data:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundProcessingInstructionWithTarget_data(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString target, final com.apple.jobjc.foundation.NSString data){
			final com.apple.jobjc.Invoke.MsgSend parser_foundProcessingInstructionWithTarget_data_IMetInst = get_parser_foundProcessingInstructionWithTarget_data_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundProcessingInstructionWithTarget_data_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		parser_foundProcessingInstructionWithTarget_data_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst(){
		return ((parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst != null)
	? (parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst)
	: (parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:foundUnparsedEntityDeclarationWithName:publicID:systemID:notationName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString publicID, final com.apple.jobjc.foundation.NSString systemID, final com.apple.jobjc.foundation.NSString notationName){
			final com.apple.jobjc.Invoke.MsgSend parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst = get_parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, publicID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notationName);
		parser_foundUnparsedEntityDeclarationWithName_publicID_systemID_notationName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_parseErrorOccurred_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_parseErrorOccurred_IMetInst(){
		return ((parser_parseErrorOccurred_IMetInst != null)
	? (parser_parseErrorOccurred_IMetInst)
	: (parser_parseErrorOccurred_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:parseErrorOccurred:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_parseErrorOccurred(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSError parseError){
			final com.apple.jobjc.Invoke.MsgSend parser_parseErrorOccurred_IMetInst = get_parser_parseErrorOccurred_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_parseErrorOccurred_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parseError);
		parser_parseErrorOccurred_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_resolveExternalEntityName_systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_resolveExternalEntityName_systemID_IMetInst(){
		return ((parser_resolveExternalEntityName_systemID_IMetInst != null)
	? (parser_resolveExternalEntityName_systemID_IMetInst)
	: (parser_resolveExternalEntityName_systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:resolveExternalEntityName:systemID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData parser_resolveExternalEntityName_systemID(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString systemID){
			final com.apple.jobjc.Invoke.MsgSend parser_resolveExternalEntityName_systemID_IMetInst = get_parser_resolveExternalEntityName_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_resolveExternalEntityName_systemID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		parser_resolveExternalEntityName_systemID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parser_validationErrorOccurred_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parser_validationErrorOccurred_IMetInst(){
		return ((parser_validationErrorOccurred_IMetInst != null)
	? (parser_validationErrorOccurred_IMetInst)
	: (parser_validationErrorOccurred_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parser:validationErrorOccurred:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parser_validationErrorOccurred(final com.apple.jobjc.foundation.NSXMLParser parser, final com.apple.jobjc.foundation.NSError validationError){
			final com.apple.jobjc.Invoke.MsgSend parser_validationErrorOccurred_IMetInst = get_parser_validationErrorOccurred_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parser_validationErrorOccurred_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, validationError);
		parser_validationErrorOccurred_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parserDidEndDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parserDidEndDocument_IMetInst(){
		return ((parserDidEndDocument_IMetInst != null)
	? (parserDidEndDocument_IMetInst)
	: (parserDidEndDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parserDidEndDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parserDidEndDocument(final com.apple.jobjc.foundation.NSXMLParser parser){
			final com.apple.jobjc.Invoke.MsgSend parserDidEndDocument_IMetInst = get_parserDidEndDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parserDidEndDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		parserDidEndDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parserDidStartDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parserDidStartDocument_IMetInst(){
		return ((parserDidStartDocument_IMetInst != null)
	? (parserDidStartDocument_IMetInst)
	: (parserDidStartDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parserDidStartDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void parserDidStartDocument(final com.apple.jobjc.foundation.NSXMLParser parser){
			final com.apple.jobjc.Invoke.MsgSend parserDidStartDocument_IMetInst = get_parserDidStartDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parserDidStartDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parser);
		parserDidStartDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performDefaultHandlingForAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performDefaultHandlingForAuthenticationChallenge_IMetInst(){
		return ((performDefaultHandlingForAuthenticationChallenge_IMetInst != null)
	? (performDefaultHandlingForAuthenticationChallenge_IMetInst)
	: (performDefaultHandlingForAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performDefaultHandlingForAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performDefaultHandlingForAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend performDefaultHandlingForAuthenticationChallenge_IMetInst = get_performDefaultHandlingForAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performDefaultHandlingForAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		performDefaultHandlingForAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_IMetInst(){
		return ((performSelector_IMetInst != null)
	? (performSelector_IMetInst)
	: (performSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T performSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend performSelector_IMetInst = get_performSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		performSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_onThread_withObject_waitUntilDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_onThread_withObject_waitUntilDone_IMetInst(){
		return ((performSelector_onThread_withObject_waitUntilDone_IMetInst != null)
	? (performSelector_onThread_withObject_waitUntilDone_IMetInst)
	: (performSelector_onThread_withObject_waitUntilDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:onThread:withObject:waitUntilDone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void performSelector_onThread_withObject_waitUntilDone(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSThread thr, final com.apple.jobjc.ID arg, final boolean wait3){
			final com.apple.jobjc.Invoke.MsgSend performSelector_onThread_withObject_waitUntilDone_IMetInst = get_performSelector_onThread_withObject_waitUntilDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_onThread_withObject_waitUntilDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, thr);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wait3);
		performSelector_onThread_withObject_waitUntilDone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_onThread_withObject_waitUntilDone_modes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_onThread_withObject_waitUntilDone_modes_IMetInst(){
		return ((performSelector_onThread_withObject_waitUntilDone_modes_IMetInst != null)
	? (performSelector_onThread_withObject_waitUntilDone_modes_IMetInst)
	: (performSelector_onThread_withObject_waitUntilDone_modes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:onThread:withObject:waitUntilDone:modes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performSelector_onThread_withObject_waitUntilDone_modes(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSThread thr, final com.apple.jobjc.ID arg, final boolean wait3, final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend performSelector_onThread_withObject_waitUntilDone_modes_IMetInst = get_performSelector_onThread_withObject_waitUntilDone_modes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_onThread_withObject_waitUntilDone_modes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, thr);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wait3);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		performSelector_onThread_withObject_waitUntilDone_modes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_withObject_IMetInst(){
		return ((performSelector_withObject_IMetInst != null)
	? (performSelector_withObject_IMetInst)
	: (performSelector_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:withObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T performSelector_withObject(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend performSelector_withObject_IMetInst = get_performSelector_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		performSelector_withObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_withObject_afterDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_withObject_afterDelay_IMetInst(){
		return ((performSelector_withObject_afterDelay_IMetInst != null)
	? (performSelector_withObject_afterDelay_IMetInst)
	: (performSelector_withObject_afterDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:withObject:afterDelay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void performSelector_withObject_afterDelay(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID anArgument, final double delay){
			final com.apple.jobjc.Invoke.MsgSend performSelector_withObject_afterDelay_IMetInst = get_performSelector_withObject_afterDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_withObject_afterDelay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anArgument);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delay);
		performSelector_withObject_afterDelay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_withObject_afterDelay_inModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_withObject_afterDelay_inModes_IMetInst(){
		return ((performSelector_withObject_afterDelay_inModes_IMetInst != null)
	? (performSelector_withObject_afterDelay_inModes_IMetInst)
	: (performSelector_withObject_afterDelay_inModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:withObject:afterDelay:inModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performSelector_withObject_afterDelay_inModes(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID anArgument, final double delay, final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend performSelector_withObject_afterDelay_inModes_IMetInst = get_performSelector_withObject_afterDelay_inModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_withObject_afterDelay_inModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anArgument);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, delay);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		performSelector_withObject_afterDelay_inModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_withObject_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_withObject_withObject_IMetInst(){
		return ((performSelector_withObject_withObject_IMetInst != null)
	? (performSelector_withObject_withObject_IMetInst)
	: (performSelector_withObject_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:withObject:withObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T performSelector_withObject_withObject(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID object1, final com.apple.jobjc.ID object2){
			final com.apple.jobjc.Invoke.MsgSend performSelector_withObject_withObject_IMetInst = get_performSelector_withObject_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_withObject_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object2);
		performSelector_withObject_withObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelectorInBackground_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelectorInBackground_withObject_IMetInst(){
		return ((performSelectorInBackground_withObject_IMetInst != null)
	? (performSelectorInBackground_withObject_IMetInst)
	: (performSelectorInBackground_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelectorInBackground:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performSelectorInBackground_withObject(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID arg){
			final com.apple.jobjc.Invoke.MsgSend performSelectorInBackground_withObject_IMetInst = get_performSelectorInBackground_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelectorInBackground_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		performSelectorInBackground_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelectorOnMainThread_withObject_waitUntilDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelectorOnMainThread_withObject_waitUntilDone_IMetInst(){
		return ((performSelectorOnMainThread_withObject_waitUntilDone_IMetInst != null)
	? (performSelectorOnMainThread_withObject_waitUntilDone_IMetInst)
	: (performSelectorOnMainThread_withObject_waitUntilDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelectorOnMainThread:withObject:waitUntilDone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void performSelectorOnMainThread_withObject_waitUntilDone(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID arg, final boolean wait2){
			final com.apple.jobjc.Invoke.MsgSend performSelectorOnMainThread_withObject_waitUntilDone_IMetInst = get_performSelectorOnMainThread_withObject_waitUntilDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelectorOnMainThread_withObject_waitUntilDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wait2);
		performSelectorOnMainThread_withObject_waitUntilDone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst(){
		return ((performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst != null)
	? (performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst)
	: (performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelectorOnMainThread:withObject:waitUntilDone:modes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performSelectorOnMainThread_withObject_waitUntilDone_modes(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID arg, final boolean wait2, final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst = get_performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wait2);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		performSelectorOnMainThread_withObject_waitUntilDone_modes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemDidChange_IMetInst(){
		return ((presentedItemDidChange_IMetInst != null)
	? (presentedItemDidChange_IMetInst)
	: (presentedItemDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemDidChange", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void presentedItemDidChange(){
			final com.apple.jobjc.Invoke.MsgSend presentedItemDidChange_IMetInst = get_presentedItemDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemDidChange_IMetInst.init(nativeBuffer, this);
		presentedItemDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemDidGainVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemDidGainVersion_IMetInst(){
		return ((presentedItemDidGainVersion_IMetInst != null)
	? (presentedItemDidGainVersion_IMetInst)
	: (presentedItemDidGainVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemDidGainVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedItemDidGainVersion(final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedItemDidGainVersion_IMetInst = get_presentedItemDidGainVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemDidGainVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedItemDidGainVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemDidLoseVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemDidLoseVersion_IMetInst(){
		return ((presentedItemDidLoseVersion_IMetInst != null)
	? (presentedItemDidLoseVersion_IMetInst)
	: (presentedItemDidLoseVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemDidLoseVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedItemDidLoseVersion(final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedItemDidLoseVersion_IMetInst = get_presentedItemDidLoseVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemDidLoseVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedItemDidLoseVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemDidMoveToURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemDidMoveToURL_IMetInst(){
		return ((presentedItemDidMoveToURL_IMetInst != null)
	? (presentedItemDidMoveToURL_IMetInst)
	: (presentedItemDidMoveToURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemDidMoveToURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedItemDidMoveToURL(final com.apple.jobjc.foundation.NSURL newURL){
			final com.apple.jobjc.Invoke.MsgSend presentedItemDidMoveToURL_IMetInst = get_presentedItemDidMoveToURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemDidMoveToURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newURL);
		presentedItemDidMoveToURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemDidResolveConflictVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemDidResolveConflictVersion_IMetInst(){
		return ((presentedItemDidResolveConflictVersion_IMetInst != null)
	? (presentedItemDidResolveConflictVersion_IMetInst)
	: (presentedItemDidResolveConflictVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemDidResolveConflictVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedItemDidResolveConflictVersion(final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedItemDidResolveConflictVersion_IMetInst = get_presentedItemDidResolveConflictVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemDidResolveConflictVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedItemDidResolveConflictVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemOperationQueue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemOperationQueue_IMetInst(){
		return ((presentedItemOperationQueue_IMetInst != null)
	? (presentedItemOperationQueue_IMetInst)
	: (presentedItemOperationQueue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemOperationQueue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSOperationQueue presentedItemOperationQueue(){
			final com.apple.jobjc.Invoke.MsgSend presentedItemOperationQueue_IMetInst = get_presentedItemOperationQueue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemOperationQueue_IMetInst.init(nativeBuffer, this);
		presentedItemOperationQueue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSOperationQueue returnValue = (com.apple.jobjc.foundation.NSOperationQueue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedItemURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedItemURL_IMetInst(){
		return ((presentedItemURL_IMetInst != null)
	? (presentedItemURL_IMetInst)
	: (presentedItemURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedItemURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL presentedItemURL(){
			final com.apple.jobjc.Invoke.MsgSend presentedItemURL_IMetInst = get_presentedItemURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedItemURL_IMetInst.init(nativeBuffer, this);
		presentedItemURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didGainVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemAtURL_didGainVersion_IMetInst(){
		return ((presentedSubitemAtURL_didGainVersion_IMetInst != null)
	? (presentedSubitemAtURL_didGainVersion_IMetInst)
	: (presentedSubitemAtURL_didGainVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemAtURL:didGainVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemAtURL_didGainVersion(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didGainVersion_IMetInst = get_presentedSubitemAtURL_didGainVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemAtURL_didGainVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedSubitemAtURL_didGainVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didLoseVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemAtURL_didLoseVersion_IMetInst(){
		return ((presentedSubitemAtURL_didLoseVersion_IMetInst != null)
	? (presentedSubitemAtURL_didLoseVersion_IMetInst)
	: (presentedSubitemAtURL_didLoseVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemAtURL:didLoseVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemAtURL_didLoseVersion(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didLoseVersion_IMetInst = get_presentedSubitemAtURL_didLoseVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemAtURL_didLoseVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedSubitemAtURL_didLoseVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didMoveToURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemAtURL_didMoveToURL_IMetInst(){
		return ((presentedSubitemAtURL_didMoveToURL_IMetInst != null)
	? (presentedSubitemAtURL_didMoveToURL_IMetInst)
	: (presentedSubitemAtURL_didMoveToURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemAtURL:didMoveToURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemAtURL_didMoveToURL(final com.apple.jobjc.foundation.NSURL oldURL, final com.apple.jobjc.foundation.NSURL newURL){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didMoveToURL_IMetInst = get_presentedSubitemAtURL_didMoveToURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemAtURL_didMoveToURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newURL);
		presentedSubitemAtURL_didMoveToURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didResolveConflictVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemAtURL_didResolveConflictVersion_IMetInst(){
		return ((presentedSubitemAtURL_didResolveConflictVersion_IMetInst != null)
	? (presentedSubitemAtURL_didResolveConflictVersion_IMetInst)
	: (presentedSubitemAtURL_didResolveConflictVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemAtURL:didResolveConflictVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemAtURL_didResolveConflictVersion(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSFileVersion version){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemAtURL_didResolveConflictVersion_IMetInst = get_presentedSubitemAtURL_didResolveConflictVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemAtURL_didResolveConflictVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		presentedSubitemAtURL_didResolveConflictVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemDidAppearAtURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemDidAppearAtURL_IMetInst(){
		return ((presentedSubitemDidAppearAtURL_IMetInst != null)
	? (presentedSubitemDidAppearAtURL_IMetInst)
	: (presentedSubitemDidAppearAtURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemDidAppearAtURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemDidAppearAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemDidAppearAtURL_IMetInst = get_presentedSubitemDidAppearAtURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemDidAppearAtURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		presentedSubitemDidAppearAtURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentedSubitemDidChangeAtURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentedSubitemDidChangeAtURL_IMetInst(){
		return ((presentedSubitemDidChangeAtURL_IMetInst != null)
	? (presentedSubitemDidChangeAtURL_IMetInst)
	: (presentedSubitemDidChangeAtURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentedSubitemDidChangeAtURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void presentedSubitemDidChangeAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend presentedSubitemDidChangeAtURL_IMetInst = get_presentedSubitemDidChangeAtURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentedSubitemDidChangeAtURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		presentedSubitemDidChangeAtURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend primaryPresentedItemURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_primaryPresentedItemURL_IMetInst(){
		return ((primaryPresentedItemURL_IMetInst != null)
	? (primaryPresentedItemURL_IMetInst)
	: (primaryPresentedItemURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "primaryPresentedItemURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL primaryPresentedItemURL(){
			final com.apple.jobjc.Invoke.MsgSend primaryPresentedItemURL_IMetInst = get_primaryPresentedItemURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		primaryPresentedItemURL_IMetInst.init(nativeBuffer, this);
		primaryPresentedItemURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rejectProtectionSpaceAndContinueWithChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rejectProtectionSpaceAndContinueWithChallenge_IMetInst(){
		return ((rejectProtectionSpaceAndContinueWithChallenge_IMetInst != null)
	? (rejectProtectionSpaceAndContinueWithChallenge_IMetInst)
	: (rejectProtectionSpaceAndContinueWithChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rejectProtectionSpaceAndContinueWithChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rejectProtectionSpaceAndContinueWithChallenge(final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend rejectProtectionSpaceAndContinueWithChallenge_IMetInst = get_rejectProtectionSpaceAndContinueWithChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rejectProtectionSpaceAndContinueWithChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		rejectProtectionSpaceAndContinueWithChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend release_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_release_IMetInst(){
		return ((release_IMetInst != null)
	? (release_IMetInst)
	: (release_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "release", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void release(){
			final com.apple.jobjc.Invoke.MsgSend release_IMetInst = get_release_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		release_IMetInst.init(nativeBuffer, this);
		release_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend relinquishPresentedItemToReader_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relinquishPresentedItemToReader_IMetInst(){
		return ((relinquishPresentedItemToReader_IMetInst != null)
	? (relinquishPresentedItemToReader_IMetInst)
	: (relinquishPresentedItemToReader_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relinquishPresentedItemToReader:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void relinquishPresentedItemToReader(final Object /* void(^)(void(^)(void)) (@, @) */ reader){
			final com.apple.jobjc.Invoke.MsgSend relinquishPresentedItemToReader_IMetInst = get_relinquishPresentedItemToReader_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relinquishPresentedItemToReader_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, reader);
		relinquishPresentedItemToReader_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend relinquishPresentedItemToWriter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relinquishPresentedItemToWriter_IMetInst(){
		return ((relinquishPresentedItemToWriter_IMetInst != null)
	? (relinquishPresentedItemToWriter_IMetInst)
	: (relinquishPresentedItemToWriter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relinquishPresentedItemToWriter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void relinquishPresentedItemToWriter(final Object /* void(^)(void(^)(void)) (@, @) */ writer){
			final com.apple.jobjc.Invoke.MsgSend relinquishPresentedItemToWriter_IMetInst = get_relinquishPresentedItemToWriter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relinquishPresentedItemToWriter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, writer);
		relinquishPresentedItemToWriter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjectProxy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjectProxy_IMetInst(){
		return ((remoteObjectProxy_IMetInst != null)
	? (remoteObjectProxy_IMetInst)
	: (remoteObjectProxy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjectProxy", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T remoteObjectProxy(){
			final com.apple.jobjc.Invoke.MsgSend remoteObjectProxy_IMetInst = get_remoteObjectProxy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjectProxy_IMetInst.init(nativeBuffer, this);
		remoteObjectProxy_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend remoteObjectProxyWithErrorHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remoteObjectProxyWithErrorHandler_IMetInst(){
		return ((remoteObjectProxyWithErrorHandler_IMetInst != null)
	? (remoteObjectProxyWithErrorHandler_IMetInst)
	: (remoteObjectProxyWithErrorHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remoteObjectProxyWithErrorHandler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T remoteObjectProxyWithErrorHandler(final Object /* void(^)(NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend remoteObjectProxyWithErrorHandler_IMetInst = get_remoteObjectProxyWithErrorHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remoteObjectProxyWithErrorHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		remoteObjectProxyWithErrorHandler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_IMetInst(){
		return ((removeObserver_forKeyPath_IMetInst != null)
	? (removeObserver_forKeyPath_IMetInst)
	: (removeObserver_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_forKeyPath(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst = get_removeObserver_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		removeObserver_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_context_IMetInst(){
		return ((removeObserver_forKeyPath_context_IMetInst != null)
	? (removeObserver_forKeyPath_context_IMetInst)
	: (removeObserver_forKeyPath_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void removeObserver_forKeyPath_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst = get_removeObserver_forKeyPath_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		removeObserver_forKeyPath_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeValueAtIndex_fromPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeValueAtIndex_fromPropertyWithKey_IMetInst(){
		return ((removeValueAtIndex_fromPropertyWithKey_IMetInst != null)
	? (removeValueAtIndex_fromPropertyWithKey_IMetInst)
	: (removeValueAtIndex_fromPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeValueAtIndex:fromPropertyWithKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeValueAtIndex_fromPropertyWithKey(final long index, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend removeValueAtIndex_fromPropertyWithKey_IMetInst = get_removeValueAtIndex_fromPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeValueAtIndex_fromPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		removeValueAtIndex_fromPropertyWithKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst(){
		return ((replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst != null)
	? (replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst)
	: (replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceValueAtIndex:inPropertyWithKey:withValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceValueAtIndex_inPropertyWithKey_withValue(final long index, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst = get_replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		replaceValueAtIndex_inPropertyWithKey_withValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementObjectForArchiver_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementObjectForArchiver_IMetInst(){
		return ((replacementObjectForArchiver_IMetInst != null)
	? (replacementObjectForArchiver_IMetInst)
	: (replacementObjectForArchiver_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementObjectForArchiver:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T replacementObjectForArchiver(final com.apple.jobjc.foundation.NSArchiver archiver){
			final com.apple.jobjc.Invoke.MsgSend replacementObjectForArchiver_IMetInst = get_replacementObjectForArchiver_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementObjectForArchiver_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		replacementObjectForArchiver_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementObjectForCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementObjectForCoder_IMetInst(){
		return ((replacementObjectForCoder_IMetInst != null)
	? (replacementObjectForCoder_IMetInst)
	: (replacementObjectForCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementObjectForCoder:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T replacementObjectForCoder(final com.apple.jobjc.foundation.NSCoder aCoder){
			final com.apple.jobjc.Invoke.MsgSend replacementObjectForCoder_IMetInst = get_replacementObjectForCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementObjectForCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCoder);
		replacementObjectForCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementObjectForKeyedArchiver_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementObjectForKeyedArchiver_IMetInst(){
		return ((replacementObjectForKeyedArchiver_IMetInst != null)
	? (replacementObjectForKeyedArchiver_IMetInst)
	: (replacementObjectForKeyedArchiver_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementObjectForKeyedArchiver:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T replacementObjectForKeyedArchiver(final com.apple.jobjc.foundation.NSKeyedArchiver archiver){
			final com.apple.jobjc.Invoke.MsgSend replacementObjectForKeyedArchiver_IMetInst = get_replacementObjectForKeyedArchiver_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementObjectForKeyedArchiver_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, archiver);
		replacementObjectForKeyedArchiver_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replacementObjectForPortCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementObjectForPortCoder_IMetInst(){
		return ((replacementObjectForPortCoder_IMetInst != null)
	? (replacementObjectForPortCoder_IMetInst)
	: (replacementObjectForPortCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementObjectForPortCoder:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T replacementObjectForPortCoder(final com.apple.jobjc.foundation.NSPortCoder coder){
			final com.apple.jobjc.Invoke.MsgSend replacementObjectForPortCoder_IMetInst = get_replacementObjectForPortCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementObjectForPortCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		replacementObjectForPortCoder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend respondsToSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_respondsToSelector_IMetInst(){
		return ((respondsToSelector_IMetInst != null)
	? (respondsToSelector_IMetInst)
	: (respondsToSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "respondsToSelector:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean respondsToSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend respondsToSelector_IMetInst = get_respondsToSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		respondsToSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		respondsToSelector_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend retain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_retain_IMetInst(){
		return ((retain_IMetInst != null)
	? (retain_IMetInst)
	: (retain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "retain", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T retain(){
			final com.apple.jobjc.Invoke.MsgSend retain_IMetInst = get_retain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		retain_IMetInst.init(nativeBuffer, this);
		retain_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend retainCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_retainCount_IMetInst(){
		return ((retainCount_IMetInst != null)
	? (retainCount_IMetInst)
	: (retainCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "retainCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long retainCount(){
			final com.apple.jobjc.Invoke.MsgSend retainCount_IMetInst = get_retainCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		retainCount_IMetInst.init(nativeBuffer, this);
		retainCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend roundingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_roundingMode_IMetInst(){
		return ((roundingMode_IMetInst != null)
	? (roundingMode_IMetInst)
	: (roundingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "roundingMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long roundingMode(){
			final com.apple.jobjc.Invoke.MsgSend roundingMode_IMetInst = get_roundingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		roundingMode_IMetInst.init(nativeBuffer, this);
		roundingMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend savePresentedItemChangesWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_savePresentedItemChangesWithCompletionHandler_IMetInst(){
		return ((savePresentedItemChangesWithCompletionHandler_IMetInst != null)
	? (savePresentedItemChangesWithCompletionHandler_IMetInst)
	: (savePresentedItemChangesWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "savePresentedItemChangesWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void savePresentedItemChangesWithCompletionHandler(final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend savePresentedItemChangesWithCompletionHandler_IMetInst = get_savePresentedItemChangesWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		savePresentedItemChangesWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		savePresentedItemChangesWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scale_IMetInst(){
		return ((scale_IMetInst != null)
	? (scale_IMetInst)
	: (scale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scale", com.apple.jobjc.PrimitiveCoder.SShortCoder.INST)));
	}

	 public short scale(){
			final com.apple.jobjc.Invoke.MsgSend scale_IMetInst = get_scale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scale_IMetInst.init(nativeBuffer, this);
		scale_IMetInst.invoke(nativeBuffer);
		final short returnValue = (short) (com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.popShort(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingBeginsWith_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingBeginsWith_IMetInst(){
		return ((scriptingBeginsWith_IMetInst != null)
	? (scriptingBeginsWith_IMetInst)
	: (scriptingBeginsWith_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingBeginsWith:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingBeginsWith(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingBeginsWith_IMetInst = get_scriptingBeginsWith_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingBeginsWith_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingBeginsWith_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingContains_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingContains_IMetInst(){
		return ((scriptingContains_IMetInst != null)
	? (scriptingContains_IMetInst)
	: (scriptingContains_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingContains:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingContains(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingContains_IMetInst = get_scriptingContains_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingContains_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingContains_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingEndsWith_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingEndsWith_IMetInst(){
		return ((scriptingEndsWith_IMetInst != null)
	? (scriptingEndsWith_IMetInst)
	: (scriptingEndsWith_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingEndsWith:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingEndsWith(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingEndsWith_IMetInst = get_scriptingEndsWith_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingEndsWith_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingEndsWith_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingIsEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingIsEqualTo_IMetInst(){
		return ((scriptingIsEqualTo_IMetInst != null)
	? (scriptingIsEqualTo_IMetInst)
	: (scriptingIsEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingIsEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingIsEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingIsEqualTo_IMetInst = get_scriptingIsEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingIsEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingIsEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingIsGreaterThan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingIsGreaterThan_IMetInst(){
		return ((scriptingIsGreaterThan_IMetInst != null)
	? (scriptingIsGreaterThan_IMetInst)
	: (scriptingIsGreaterThan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingIsGreaterThan:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingIsGreaterThan(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingIsGreaterThan_IMetInst = get_scriptingIsGreaterThan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingIsGreaterThan_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingIsGreaterThan_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingIsGreaterThanOrEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingIsGreaterThanOrEqualTo_IMetInst(){
		return ((scriptingIsGreaterThanOrEqualTo_IMetInst != null)
	? (scriptingIsGreaterThanOrEqualTo_IMetInst)
	: (scriptingIsGreaterThanOrEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingIsGreaterThanOrEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingIsGreaterThanOrEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingIsGreaterThanOrEqualTo_IMetInst = get_scriptingIsGreaterThanOrEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingIsGreaterThanOrEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingIsGreaterThanOrEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingIsLessThan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingIsLessThan_IMetInst(){
		return ((scriptingIsLessThan_IMetInst != null)
	? (scriptingIsLessThan_IMetInst)
	: (scriptingIsLessThan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingIsLessThan:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingIsLessThan(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingIsLessThan_IMetInst = get_scriptingIsLessThan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingIsLessThan_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingIsLessThan_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingIsLessThanOrEqualTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingIsLessThanOrEqualTo_IMetInst(){
		return ((scriptingIsLessThanOrEqualTo_IMetInst != null)
	? (scriptingIsLessThanOrEqualTo_IMetInst)
	: (scriptingIsLessThanOrEqualTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingIsLessThanOrEqualTo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean scriptingIsLessThanOrEqualTo(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend scriptingIsLessThanOrEqualTo_IMetInst = get_scriptingIsLessThanOrEqualTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingIsLessThanOrEqualTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		scriptingIsLessThanOrEqualTo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingProperties_IMetInst(){
		return ((scriptingProperties_IMetInst != null)
	? (scriptingProperties_IMetInst)
	: (scriptingProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingProperties", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary scriptingProperties(){
			final com.apple.jobjc.Invoke.MsgSend scriptingProperties_IMetInst = get_scriptingProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingProperties_IMetInst.init(nativeBuffer, this);
		scriptingProperties_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scriptingValueForSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scriptingValueForSpecifier_IMetInst(){
		return ((scriptingValueForSpecifier_IMetInst != null)
	? (scriptingValueForSpecifier_IMetInst)
	: (scriptingValueForSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scriptingValueForSpecifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T scriptingValueForSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier objectSpecifier){
			final com.apple.jobjc.Invoke.MsgSend scriptingValueForSpecifier_IMetInst = get_scriptingValueForSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scriptingValueForSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objectSpecifier);
		scriptingValueForSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend self_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_self_IMetInst(){
		return ((self_IMetInst != null)
	? (self_IMetInst)
	: (self_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "self", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T self(){
			final com.apple.jobjc.Invoke.MsgSend self_IMetInst = get_self_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		self_IMetInst.init(nativeBuffer, this);
		self_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setNilValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNilValueForKey_IMetInst(){
		return ((setNilValueForKey_IMetInst != null)
	? (setNilValueForKey_IMetInst)
	: (setNilValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNilValueForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNilValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setNilValueForKey_IMetInst = get_setNilValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNilValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setNilValueForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObservationInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObservationInfo_IMetInst(){
		return ((setObservationInfo_IMetInst != null)
	? (setObservationInfo_IMetInst)
	: (setObservationInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObservationInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setObservationInfo(final com.apple.jobjc.Pointer<Void> observationInfo){
			final com.apple.jobjc.Invoke.MsgSend setObservationInfo_IMetInst = get_setObservationInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObservationInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, observationInfo);
		setObservationInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScriptingProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScriptingProperties_IMetInst(){
		return ((setScriptingProperties_IMetInst != null)
	? (setScriptingProperties_IMetInst)
	: (setScriptingProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScriptingProperties:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setScriptingProperties(final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend setScriptingProperties_IMetInst = get_setScriptingProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScriptingProperties_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		setScriptingProperties_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forKey_IMetInst(){
		return ((setValue_forKey_IMetInst != null)
	? (setValue_forKey_IMetInst)
	: (setValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst = get_setValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setValue_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forKeyPath_IMetInst(){
		return ((setValue_forKeyPath_IMetInst != null)
	? (setValue_forKeyPath_IMetInst)
	: (setValue_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forKeyPath(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setValue_forKeyPath_IMetInst = get_setValue_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setValue_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forUndefinedKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forUndefinedKey_IMetInst(){
		return ((setValue_forUndefinedKey_IMetInst != null)
	? (setValue_forUndefinedKey_IMetInst)
	: (setValue_forUndefinedKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forUndefinedKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forUndefinedKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setValue_forUndefinedKey_IMetInst = get_setValue_forUndefinedKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forUndefinedKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setValue_forUndefinedKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValuesForKeysWithDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValuesForKeysWithDictionary_IMetInst(){
		return ((setValuesForKeysWithDictionary_IMetInst != null)
	? (setValuesForKeysWithDictionary_IMetInst)
	: (setValuesForKeysWithDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValuesForKeysWithDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValuesForKeysWithDictionary(final com.apple.jobjc.foundation.NSDictionary keyedValues){
			final com.apple.jobjc.Invoke.MsgSend setValuesForKeysWithDictionary_IMetInst = get_setValuesForKeysWithDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValuesForKeysWithDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyedValues);
		setValuesForKeysWithDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_checkGrammarInString_language_details_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_checkGrammarInString_language_details_IMetInst(){
		return ((spellServer_checkGrammarInString_language_details_IMetInst != null)
	? (spellServer_checkGrammarInString_language_details_IMetInst)
	: (spellServer_checkGrammarInString_language_details_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:checkGrammarInString:language:details:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange spellServer_checkGrammarInString_language_details(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString stringToCheck, final com.apple.jobjc.foundation.NSString language, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> details){
			final com.apple.jobjc.Invoke.MsgSend spellServer_checkGrammarInString_language_details_IMetInst = get_spellServer_checkGrammarInString_language_details_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_checkGrammarInString_language_details_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, details);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		spellServer_checkGrammarInString_language_details_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst(){
		return ((spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst != null)
	? (spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst)
	: (spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:checkString:offset:types:options:orthography:wordCount:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray spellServer_checkString_offset_types_options_orthography_wordCount(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString stringToCheck, final long offset, final long checkingTypes, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.foundation.NSOrthography orthography, final com.apple.jobjc.Pointer<java.lang.Long> wordCount){
			final com.apple.jobjc.Invoke.MsgSend spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst = get_spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, offset);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, orthography);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, wordCount);
		spellServer_checkString_offset_types_options_orthography_wordCount_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_didForgetWord_inLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_didForgetWord_inLanguage_IMetInst(){
		return ((spellServer_didForgetWord_inLanguage_IMetInst != null)
	? (spellServer_didForgetWord_inLanguage_IMetInst)
	: (spellServer_didForgetWord_inLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:didForgetWord:inLanguage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void spellServer_didForgetWord_inLanguage(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend spellServer_didForgetWord_inLanguage_IMetInst = get_spellServer_didForgetWord_inLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_didForgetWord_inLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		spellServer_didForgetWord_inLanguage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_didLearnWord_inLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_didLearnWord_inLanguage_IMetInst(){
		return ((spellServer_didLearnWord_inLanguage_IMetInst != null)
	? (spellServer_didLearnWord_inLanguage_IMetInst)
	: (spellServer_didLearnWord_inLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:didLearnWord:inLanguage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void spellServer_didLearnWord_inLanguage(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend spellServer_didLearnWord_inLanguage_IMetInst = get_spellServer_didLearnWord_inLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_didLearnWord_inLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		spellServer_didLearnWord_inLanguage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst(){
		return ((spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst != null)
	? (spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst)
	: (spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:findMisspelledWordInString:language:wordCount:countOnly:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRange spellServer_findMisspelledWordInString_language_wordCount_countOnly(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString stringToCheck, final com.apple.jobjc.foundation.NSString language, final com.apple.jobjc.Pointer<java.lang.Long> wordCount, final boolean countOnly){
			final com.apple.jobjc.Invoke.MsgSend spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst = get_spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToCheck);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, wordCount);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, countOnly);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		spellServer_findMisspelledWordInString_language_wordCount_countOnly_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_recordResponse_toCorrection_forWord_language_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_recordResponse_toCorrection_forWord_language_IMetInst(){
		return ((spellServer_recordResponse_toCorrection_forWord_language_IMetInst != null)
	? (spellServer_recordResponse_toCorrection_forWord_language_IMetInst)
	: (spellServer_recordResponse_toCorrection_forWord_language_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:recordResponse:toCorrection:forWord:language:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void spellServer_recordResponse_toCorrection_forWord_language(final com.apple.jobjc.foundation.NSSpellServer sender, final long response, final com.apple.jobjc.foundation.NSString correction, final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend spellServer_recordResponse_toCorrection_forWord_language_IMetInst = get_spellServer_recordResponse_toCorrection_forWord_language_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_recordResponse_toCorrection_forWord_language_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, response);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, correction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		spellServer_recordResponse_toCorrection_forWord_language_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst(){
		return ((spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst != null)
	? (spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst)
	: (spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:suggestCompletionsForPartialWordRange:inString:language:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray spellServer_suggestCompletionsForPartialWordRange_inString_language(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst = get_spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		spellServer_suggestCompletionsForPartialWordRange_inString_language_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend spellServer_suggestGuessesForWord_inLanguage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_spellServer_suggestGuessesForWord_inLanguage_IMetInst(){
		return ((spellServer_suggestGuessesForWord_inLanguage_IMetInst != null)
	? (spellServer_suggestGuessesForWord_inLanguage_IMetInst)
	: (spellServer_suggestGuessesForWord_inLanguage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "spellServer:suggestGuessesForWord:inLanguage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray spellServer_suggestGuessesForWord_inLanguage(final com.apple.jobjc.foundation.NSSpellServer sender, final com.apple.jobjc.foundation.NSString word, final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend spellServer_suggestGuessesForWord_inLanguage_IMetInst = get_spellServer_suggestGuessesForWord_inLanguage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		spellServer_suggestGuessesForWord_inLanguage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		spellServer_suggestGuessesForWord_inLanguage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend storedValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_storedValueForKey_IMetInst(){
		return ((storedValueForKey_IMetInst != null)
	? (storedValueForKey_IMetInst)
	: (storedValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "storedValueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T storedValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend storedValueForKey_IMetInst = get_storedValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		storedValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		storedValueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stream_handleEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stream_handleEvent_IMetInst(){
		return ((stream_handleEvent_IMetInst != null)
	? (stream_handleEvent_IMetInst)
	: (stream_handleEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stream:handleEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void stream_handleEvent(final com.apple.jobjc.foundation.NSStream aStream, final long eventCode){
			final com.apple.jobjc.Invoke.MsgSend stream_handleEvent_IMetInst = get_stream_handleEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stream_handleEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aStream);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, eventCode);
		stream_handleEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend superclass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superclass_IMetInst(){
		return ((superclass_IMetInst != null)
	? (superclass_IMetInst)
	: (superclass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superclass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T superclass(){
			final com.apple.jobjc.Invoke.MsgSend superclass_IMetInst = get_superclass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superclass_IMetInst.init(nativeBuffer, this);
		superclass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend takeStoredValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeStoredValue_forKey_IMetInst(){
		return ((takeStoredValue_forKey_IMetInst != null)
	? (takeStoredValue_forKey_IMetInst)
	: (takeStoredValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeStoredValue:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeStoredValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend takeStoredValue_forKey_IMetInst = get_takeStoredValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeStoredValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		takeStoredValue_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeValue_forKey_IMetInst(){
		return ((takeValue_forKey_IMetInst != null)
	? (takeValue_forKey_IMetInst)
	: (takeValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeValue:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend takeValue_forKey_IMetInst = get_takeValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		takeValue_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeValue_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeValue_forKeyPath_IMetInst(){
		return ((takeValue_forKeyPath_IMetInst != null)
	? (takeValue_forKeyPath_IMetInst)
	: (takeValue_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeValue:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeValue_forKeyPath(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend takeValue_forKeyPath_IMetInst = get_takeValue_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeValue_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		takeValue_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takeValuesFromDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takeValuesFromDictionary_IMetInst(){
		return ((takeValuesFromDictionary_IMetInst != null)
	? (takeValuesFromDictionary_IMetInst)
	: (takeValuesFromDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takeValuesFromDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void takeValuesFromDictionary(final com.apple.jobjc.foundation.NSDictionary properties){
			final com.apple.jobjc.Invoke.MsgSend takeValuesFromDictionary_IMetInst = get_takeValuesFromDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takeValuesFromDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, properties);
		takeValuesFromDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toManyRelationshipKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toManyRelationshipKeys_IMetInst(){
		return ((toManyRelationshipKeys_IMetInst != null)
	? (toManyRelationshipKeys_IMetInst)
	: (toManyRelationshipKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toManyRelationshipKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toManyRelationshipKeys(){
			final com.apple.jobjc.Invoke.MsgSend toManyRelationshipKeys_IMetInst = get_toManyRelationshipKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toManyRelationshipKeys_IMetInst.init(nativeBuffer, this);
		toManyRelationshipKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toOneRelationshipKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toOneRelationshipKeys_IMetInst(){
		return ((toOneRelationshipKeys_IMetInst != null)
	? (toOneRelationshipKeys_IMetInst)
	: (toOneRelationshipKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toOneRelationshipKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray toOneRelationshipKeys(){
			final com.apple.jobjc.Invoke.MsgSend toOneRelationshipKeys_IMetInst = get_toOneRelationshipKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toOneRelationshipKeys_IMetInst.init(nativeBuffer, this);
		toOneRelationshipKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unableToSetNilForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unableToSetNilForKey_IMetInst(){
		return ((unableToSetNilForKey_IMetInst != null)
	? (unableToSetNilForKey_IMetInst)
	: (unableToSetNilForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unableToSetNilForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unableToSetNilForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend unableToSetNilForKey_IMetInst = get_unableToSetNilForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unableToSetNilForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		unableToSetNilForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst(){
		return ((unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst != null)
	? (unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst)
	: (unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiver:cannotDecodeObjectOfClassName:originalClasses:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T unarchiver_cannotDecodeObjectOfClassName_originalClasses(final com.apple.jobjc.foundation.NSKeyedUnarchiver unarchiver, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray classNames){
			final com.apple.jobjc.Invoke.MsgSend unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst = get_unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unarchiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classNames);
		unarchiver_cannotDecodeObjectOfClassName_originalClasses_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiver_didDecodeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiver_didDecodeObject_IMetInst(){
		return ((unarchiver_didDecodeObject_IMetInst != null)
	? (unarchiver_didDecodeObject_IMetInst)
	: (unarchiver_didDecodeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiver:didDecodeObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T unarchiver_didDecodeObject(final com.apple.jobjc.foundation.NSKeyedUnarchiver unarchiver, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend unarchiver_didDecodeObject_IMetInst = get_unarchiver_didDecodeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiver_didDecodeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unarchiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		unarchiver_didDecodeObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiver_willReplaceObject_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiver_willReplaceObject_withObject_IMetInst(){
		return ((unarchiver_willReplaceObject_withObject_IMetInst != null)
	? (unarchiver_willReplaceObject_withObject_IMetInst)
	: (unarchiver_willReplaceObject_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiver:willReplaceObject:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unarchiver_willReplaceObject_withObject(final com.apple.jobjc.foundation.NSKeyedUnarchiver unarchiver, final com.apple.jobjc.ID object, final com.apple.jobjc.ID newObject){
			final com.apple.jobjc.Invoke.MsgSend unarchiver_willReplaceObject_withObject_IMetInst = get_unarchiver_willReplaceObject_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiver_willReplaceObject_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unarchiver);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newObject);
		unarchiver_willReplaceObject_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiverDidFinish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiverDidFinish_IMetInst(){
		return ((unarchiverDidFinish_IMetInst != null)
	? (unarchiverDidFinish_IMetInst)
	: (unarchiverDidFinish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiverDidFinish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unarchiverDidFinish(final com.apple.jobjc.foundation.NSKeyedUnarchiver unarchiver){
			final com.apple.jobjc.Invoke.MsgSend unarchiverDidFinish_IMetInst = get_unarchiverDidFinish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiverDidFinish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unarchiver);
		unarchiverDidFinish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiverWillFinish_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiverWillFinish_IMetInst(){
		return ((unarchiverWillFinish_IMetInst != null)
	? (unarchiverWillFinish_IMetInst)
	: (unarchiverWillFinish_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiverWillFinish:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unarchiverWillFinish(final com.apple.jobjc.foundation.NSKeyedUnarchiver unarchiver){
			final com.apple.jobjc.Invoke.MsgSend unarchiverWillFinish_IMetInst = get_unarchiverWillFinish_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiverWillFinish_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, unarchiver);
		unarchiverWillFinish_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlock_IMetInst(){
		return ((unlock_IMetInst != null)
	? (unlock_IMetInst)
	: (unlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlock", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unlock(){
			final com.apple.jobjc.Invoke.MsgSend unlock_IMetInst = get_unlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlock_IMetInst.init(nativeBuffer, this);
		unlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend useCredential_forAuthenticationChallenge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useCredential_forAuthenticationChallenge_IMetInst(){
		return ((useCredential_forAuthenticationChallenge_IMetInst != null)
	? (useCredential_forAuthenticationChallenge_IMetInst)
	: (useCredential_forAuthenticationChallenge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useCredential:forAuthenticationChallenge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void useCredential_forAuthenticationChallenge(final com.apple.jobjc.foundation.NSURLCredential credential, final com.apple.jobjc.foundation.NSURLAuthenticationChallenge challenge){
			final com.apple.jobjc.Invoke.MsgSend useCredential_forAuthenticationChallenge_IMetInst = get_useCredential_forAuthenticationChallenge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useCredential_forAuthenticationChallenge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, credential);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, challenge);
		useCredential_forAuthenticationChallenge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userNotificationCenter_didActivateNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userNotificationCenter_didActivateNotification_IMetInst(){
		return ((userNotificationCenter_didActivateNotification_IMetInst != null)
	? (userNotificationCenter_didActivateNotification_IMetInst)
	: (userNotificationCenter_didActivateNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userNotificationCenter:didActivateNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void userNotificationCenter_didActivateNotification(final com.apple.jobjc.foundation.NSUserNotificationCenter center, final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend userNotificationCenter_didActivateNotification_IMetInst = get_userNotificationCenter_didActivateNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userNotificationCenter_didActivateNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, center);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		userNotificationCenter_didActivateNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userNotificationCenter_didDeliverNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userNotificationCenter_didDeliverNotification_IMetInst(){
		return ((userNotificationCenter_didDeliverNotification_IMetInst != null)
	? (userNotificationCenter_didDeliverNotification_IMetInst)
	: (userNotificationCenter_didDeliverNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userNotificationCenter:didDeliverNotification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void userNotificationCenter_didDeliverNotification(final com.apple.jobjc.foundation.NSUserNotificationCenter center, final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend userNotificationCenter_didDeliverNotification_IMetInst = get_userNotificationCenter_didDeliverNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userNotificationCenter_didDeliverNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, center);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		userNotificationCenter_didDeliverNotification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userNotificationCenter_shouldPresentNotification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userNotificationCenter_shouldPresentNotification_IMetInst(){
		return ((userNotificationCenter_shouldPresentNotification_IMetInst != null)
	? (userNotificationCenter_shouldPresentNotification_IMetInst)
	: (userNotificationCenter_shouldPresentNotification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userNotificationCenter:shouldPresentNotification:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean userNotificationCenter_shouldPresentNotification(final com.apple.jobjc.foundation.NSUserNotificationCenter center, final com.apple.jobjc.foundation.NSUserNotification notification){
			final com.apple.jobjc.Invoke.MsgSend userNotificationCenter_shouldPresentNotification_IMetInst = get_userNotificationCenter_shouldPresentNotification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userNotificationCenter_shouldPresentNotification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, center);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		userNotificationCenter_shouldPresentNotification_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateValue_forKey_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateValue_forKey_error_IMetInst(){
		return ((validateValue_forKey_error_IMetInst != null)
	? (validateValue_forKey_error_IMetInst)
	: (validateValue_forKey_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateValue:forKey:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean validateValue_forKey_error(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> ioValue, final com.apple.jobjc.foundation.NSString inKey, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend validateValue_forKey_error_IMetInst = get_validateValue_forKey_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateValue_forKey_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ioValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inKey);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		validateValue_forKey_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateValue_forKeyPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateValue_forKeyPath_error_IMetInst(){
		return ((validateValue_forKeyPath_error_IMetInst != null)
	? (validateValue_forKeyPath_error_IMetInst)
	: (validateValue_forKeyPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateValue:forKeyPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean validateValue_forKeyPath_error(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> ioValue, final com.apple.jobjc.foundation.NSString inKeyPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend validateValue_forKeyPath_error_IMetInst = get_validateValue_forKeyPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateValue_forKeyPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, ioValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inKeyPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		validateValue_forKeyPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueAtIndex_inPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueAtIndex_inPropertyWithKey_IMetInst(){
		return ((valueAtIndex_inPropertyWithKey_IMetInst != null)
	? (valueAtIndex_inPropertyWithKey_IMetInst)
	: (valueAtIndex_inPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueAtIndex:inPropertyWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueAtIndex_inPropertyWithKey(final long index, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueAtIndex_inPropertyWithKey_IMetInst = get_valueAtIndex_inPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueAtIndex_inPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueAtIndex_inPropertyWithKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForKey_IMetInst(){
		return ((valueForKey_IMetInst != null)
	? (valueForKey_IMetInst)
	: (valueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst = get_valueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForKeyPath_IMetInst(){
		return ((valueForKeyPath_IMetInst != null)
	? (valueForKeyPath_IMetInst)
	: (valueForKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForKeyPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend valueForKeyPath_IMetInst = get_valueForKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		valueForKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForUndefinedKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForUndefinedKey_IMetInst(){
		return ((valueForUndefinedKey_IMetInst != null)
	? (valueForUndefinedKey_IMetInst)
	: (valueForUndefinedKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForUndefinedKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForUndefinedKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForUndefinedKey_IMetInst = get_valueForUndefinedKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForUndefinedKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForUndefinedKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithName_inPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithName_inPropertyWithKey_IMetInst(){
		return ((valueWithName_inPropertyWithKey_IMetInst != null)
	? (valueWithName_inPropertyWithKey_IMetInst)
	: (valueWithName_inPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithName:inPropertyWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueWithName_inPropertyWithKey(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueWithName_inPropertyWithKey_IMetInst = get_valueWithName_inPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithName_inPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueWithName_inPropertyWithKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithUniqueID_inPropertyWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithUniqueID_inPropertyWithKey_IMetInst(){
		return ((valueWithUniqueID_inPropertyWithKey_IMetInst != null)
	? (valueWithUniqueID_inPropertyWithKey_IMetInst)
	: (valueWithUniqueID_inPropertyWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithUniqueID:inPropertyWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueWithUniqueID_inPropertyWithKey(final com.apple.jobjc.ID uniqueID, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueWithUniqueID_inPropertyWithKey_IMetInst = get_valueWithUniqueID_inPropertyWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithUniqueID_inPropertyWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, uniqueID);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueWithUniqueID_inPropertyWithKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valuesForKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valuesForKeys_IMetInst(){
		return ((valuesForKeys_IMetInst != null)
	? (valuesForKeys_IMetInst)
	: (valuesForKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valuesForKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary valuesForKeys(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend valuesForKeys_IMetInst = get_valuesForKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valuesForKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		valuesForKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend willChange_valuesAtIndexes_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willChange_valuesAtIndexes_forKey_IMetInst(){
		return ((willChange_valuesAtIndexes_forKey_IMetInst != null)
	? (willChange_valuesAtIndexes_forKey_IMetInst)
	: (willChange_valuesAtIndexes_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willChange:valuesAtIndexes:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void willChange_valuesAtIndexes_forKey(final long changeKind, final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend willChange_valuesAtIndexes_forKey_IMetInst = get_willChange_valuesAtIndexes_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willChange_valuesAtIndexes_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, changeKind);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		willChange_valuesAtIndexes_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend willChangeValueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willChangeValueForKey_IMetInst(){
		return ((willChangeValueForKey_IMetInst != null)
	? (willChangeValueForKey_IMetInst)
	: (willChangeValueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willChangeValueForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void willChangeValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend willChangeValueForKey_IMetInst = get_willChangeValueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willChangeValueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		willChangeValueForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend willChangeValueForKey_withSetMutation_usingObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willChangeValueForKey_withSetMutation_usingObjects_IMetInst(){
		return ((willChangeValueForKey_withSetMutation_usingObjects_IMetInst != null)
	? (willChangeValueForKey_withSetMutation_usingObjects_IMetInst)
	: (willChangeValueForKey_withSetMutation_usingObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willChangeValueForKey:withSetMutation:usingObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void willChangeValueForKey_withSetMutation_usingObjects(final com.apple.jobjc.foundation.NSString key, final long mutationKind, final com.apple.jobjc.foundation.NSSet objects){
			final com.apple.jobjc.Invoke.MsgSend willChangeValueForKey_withSetMutation_usingObjects_IMetInst = get_willChangeValueForKey_withSetMutation_usingObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willChangeValueForKey_withSetMutation_usingObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mutationKind);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		willChangeValueForKey_withSetMutation_usingObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend zone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zone_IMetInst(){
		return ((zone_IMetInst != null)
	? (zone_IMetInst)
	: (zone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone(){
			final com.apple.jobjc.Invoke.MsgSend zone_IMetInst = get_zone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zone_IMetInst.init(nativeBuffer, this);
		zone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
