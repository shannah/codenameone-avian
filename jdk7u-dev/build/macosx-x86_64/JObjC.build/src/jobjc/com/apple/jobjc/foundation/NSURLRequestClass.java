package com.apple.jobjc.foundation;

public  class NSURLRequestClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLRequestClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLRequestClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLRequestClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend requestWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestWithURL_CMetInst(){
		return ((requestWithURL_CMetInst != null)
	? (requestWithURL_CMetInst)
	: (requestWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T requestWithURL(final com.apple.jobjc.foundation.NSURL URL){
			final com.apple.jobjc.Invoke.MsgSend requestWithURL_CMetInst = get_requestWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		requestWithURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requestWithURL_cachePolicy_timeoutInterval_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestWithURL_cachePolicy_timeoutInterval_CMetInst(){
		return ((requestWithURL_cachePolicy_timeoutInterval_CMetInst != null)
	? (requestWithURL_cachePolicy_timeoutInterval_CMetInst)
	: (requestWithURL_cachePolicy_timeoutInterval_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestWithURL:cachePolicy:timeoutInterval:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T requestWithURL_cachePolicy_timeoutInterval(final com.apple.jobjc.foundation.NSURL URL, final long cachePolicy, final double timeoutInterval){
			final com.apple.jobjc.Invoke.MsgSend requestWithURL_cachePolicy_timeoutInterval_CMetInst = get_requestWithURL_cachePolicy_timeoutInterval_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestWithURL_cachePolicy_timeoutInterval_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cachePolicy);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, timeoutInterval);
		requestWithURL_cachePolicy_timeoutInterval_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
