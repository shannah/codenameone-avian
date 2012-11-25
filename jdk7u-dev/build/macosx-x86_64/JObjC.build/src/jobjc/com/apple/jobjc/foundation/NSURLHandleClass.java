package com.apple.jobjc.foundation;

public  class NSURLHandleClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLHandleClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLHandleClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLHandleClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLHandleClassForURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandleClassForURL_CMetInst(){
		return ((URLHandleClassForURL_CMetInst != null)
	? (URLHandleClassForURL_CMetInst)
	: (URLHandleClassForURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandleClassForURL:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T URLHandleClassForURL(final com.apple.jobjc.foundation.NSURL anURL){
			final com.apple.jobjc.Invoke.MsgSend URLHandleClassForURL_CMetInst = get_URLHandleClassForURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandleClassForURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anURL);
		URLHandleClassForURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cachedHandleForURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cachedHandleForURL_CMetInst(){
		return ((cachedHandleForURL_CMetInst != null)
	? (cachedHandleForURL_CMetInst)
	: (cachedHandleForURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cachedHandleForURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLHandle cachedHandleForURL(final com.apple.jobjc.foundation.NSURL anURL){
			final com.apple.jobjc.Invoke.MsgSend cachedHandleForURL_CMetInst = get_cachedHandleForURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cachedHandleForURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anURL);
		cachedHandleForURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLHandle returnValue = (com.apple.jobjc.foundation.NSURLHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canInitWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithURL_CMetInst(){
		return ((canInitWithURL_CMetInst != null)
	? (canInitWithURL_CMetInst)
	: (canInitWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithURL(final com.apple.jobjc.foundation.NSURL anURL){
			final com.apple.jobjc.Invoke.MsgSend canInitWithURL_CMetInst = get_canInitWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anURL);
		canInitWithURL_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerURLHandleClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerURLHandleClass_CMetInst(){
		return ((registerURLHandleClass_CMetInst != null)
	? (registerURLHandleClass_CMetInst)
	: (registerURLHandleClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerURLHandleClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void registerURLHandleClass(final com.apple.jobjc.NSClass anURLHandleSubclass){
			final com.apple.jobjc.Invoke.MsgSend registerURLHandleClass_CMetInst = get_registerURLHandleClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerURLHandleClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, anURLHandleSubclass);
		registerURLHandleClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
