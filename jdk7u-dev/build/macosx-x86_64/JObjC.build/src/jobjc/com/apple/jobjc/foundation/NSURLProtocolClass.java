package com.apple.jobjc.foundation;

public  class NSURLProtocolClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLProtocolClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLProtocolClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLProtocolClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canInitWithRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithRequest_CMetInst(){
		return ((canInitWithRequest_CMetInst != null)
	? (canInitWithRequest_CMetInst)
	: (canInitWithRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithRequest:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithRequest(final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend canInitWithRequest_CMetInst = get_canInitWithRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		canInitWithRequest_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canonicalRequestForRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canonicalRequestForRequest_CMetInst(){
		return ((canonicalRequestForRequest_CMetInst != null)
	? (canonicalRequestForRequest_CMetInst)
	: (canonicalRequestForRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canonicalRequestForRequest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLRequest canonicalRequestForRequest(final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend canonicalRequestForRequest_CMetInst = get_canonicalRequestForRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canonicalRequestForRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		canonicalRequestForRequest_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLRequest returnValue = (com.apple.jobjc.foundation.NSURLRequest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyForKey_inRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyForKey_inRequest_CMetInst(){
		return ((propertyForKey_inRequest_CMetInst != null)
	? (propertyForKey_inRequest_CMetInst)
	: (propertyForKey_inRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyForKey:inRequest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyForKey_inRequest(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend propertyForKey_inRequest_CMetInst = get_propertyForKey_inRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyForKey_inRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		propertyForKey_inRequest_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerClass_CMetInst(){
		return ((registerClass_CMetInst != null)
	? (registerClass_CMetInst)
	: (registerClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerClass:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public boolean registerClass(final com.apple.jobjc.NSClass protocolClass){
			final com.apple.jobjc.Invoke.MsgSend registerClass_CMetInst = get_registerClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, protocolClass);
		registerClass_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removePropertyForKey_inRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removePropertyForKey_inRequest_CMetInst(){
		return ((removePropertyForKey_inRequest_CMetInst != null)
	? (removePropertyForKey_inRequest_CMetInst)
	: (removePropertyForKey_inRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removePropertyForKey:inRequest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removePropertyForKey_inRequest(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSMutableURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend removePropertyForKey_inRequest_CMetInst = get_removePropertyForKey_inRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removePropertyForKey_inRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		removePropertyForKey_inRequest_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend requestIsCacheEquivalent_toRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestIsCacheEquivalent_toRequest_CMetInst(){
		return ((requestIsCacheEquivalent_toRequest_CMetInst != null)
	? (requestIsCacheEquivalent_toRequest_CMetInst)
	: (requestIsCacheEquivalent_toRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestIsCacheEquivalent:toRequest:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean requestIsCacheEquivalent_toRequest(final com.apple.jobjc.foundation.NSURLRequest a, final com.apple.jobjc.foundation.NSURLRequest b){
			final com.apple.jobjc.Invoke.MsgSend requestIsCacheEquivalent_toRequest_CMetInst = get_requestIsCacheEquivalent_toRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestIsCacheEquivalent_toRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, a);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, b);
		requestIsCacheEquivalent_toRequest_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setProperty_forKey_inRequest_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProperty_forKey_inRequest_CMetInst(){
		return ((setProperty_forKey_inRequest_CMetInst != null)
	? (setProperty_forKey_inRequest_CMetInst)
	: (setProperty_forKey_inRequest_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProperty:forKey:inRequest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setProperty_forKey_inRequest(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSMutableURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend setProperty_forKey_inRequest_CMetInst = get_setProperty_forKey_inRequest_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProperty_forKey_inRequest_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		setProperty_forKey_inRequest_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unregisterClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unregisterClass_CMetInst(){
		return ((unregisterClass_CMetInst != null)
	? (unregisterClass_CMetInst)
	: (unregisterClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unregisterClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void unregisterClass(final com.apple.jobjc.NSClass protocolClass){
			final com.apple.jobjc.Invoke.MsgSend unregisterClass_CMetInst = get_unregisterClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unregisterClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, protocolClass);
		unregisterClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
