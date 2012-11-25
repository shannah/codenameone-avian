package com.apple.jobjc.foundation;

public  class NSURLHandle extends com.apple.jobjc.foundation.NSObject {
	public NSURLHandle(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLHandle(final NSURLHandle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addClient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addClient_IMetInst(){
		return ((addClient_IMetInst != null)
	? (addClient_IMetInst)
	: (addClient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addClient:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addClient(final com.apple.jobjc.ID client){
			final com.apple.jobjc.Invoke.MsgSend addClient_IMetInst = get_addClient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addClient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		addClient_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend availableResourceData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableResourceData_IMetInst(){
		return ((availableResourceData_IMetInst != null)
	? (availableResourceData_IMetInst)
	: (availableResourceData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableResourceData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData availableResourceData(){
			final com.apple.jobjc.Invoke.MsgSend availableResourceData_IMetInst = get_availableResourceData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableResourceData_IMetInst.init(nativeBuffer, this);
		availableResourceData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundLoadDidFailWithReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundLoadDidFailWithReason_IMetInst(){
		return ((backgroundLoadDidFailWithReason_IMetInst != null)
	? (backgroundLoadDidFailWithReason_IMetInst)
	: (backgroundLoadDidFailWithReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundLoadDidFailWithReason:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void backgroundLoadDidFailWithReason(final com.apple.jobjc.foundation.NSString reason){
			final com.apple.jobjc.Invoke.MsgSend backgroundLoadDidFailWithReason_IMetInst = get_backgroundLoadDidFailWithReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundLoadDidFailWithReason_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		backgroundLoadDidFailWithReason_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginLoadInBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginLoadInBackground_IMetInst(){
		return ((beginLoadInBackground_IMetInst != null)
	? (beginLoadInBackground_IMetInst)
	: (beginLoadInBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginLoadInBackground", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginLoadInBackground(){
			final com.apple.jobjc.Invoke.MsgSend beginLoadInBackground_IMetInst = get_beginLoadInBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginLoadInBackground_IMetInst.init(nativeBuffer, this);
		beginLoadInBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelLoadInBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelLoadInBackground_IMetInst(){
		return ((cancelLoadInBackground_IMetInst != null)
	? (cancelLoadInBackground_IMetInst)
	: (cancelLoadInBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelLoadInBackground", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelLoadInBackground(){
			final com.apple.jobjc.Invoke.MsgSend cancelLoadInBackground_IMetInst = get_cancelLoadInBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelLoadInBackground_IMetInst.init(nativeBuffer, this);
		cancelLoadInBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend didLoadBytes_loadComplete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didLoadBytes_loadComplete_IMetInst(){
		return ((didLoadBytes_loadComplete_IMetInst != null)
	? (didLoadBytes_loadComplete_IMetInst)
	: (didLoadBytes_loadComplete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didLoadBytes:loadComplete:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void didLoadBytes_loadComplete(final com.apple.jobjc.foundation.NSData newBytes, final boolean yorn){
			final com.apple.jobjc.Invoke.MsgSend didLoadBytes_loadComplete_IMetInst = get_didLoadBytes_loadComplete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didLoadBytes_loadComplete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newBytes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yorn);
		didLoadBytes_loadComplete_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endLoadInBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endLoadInBackground_IMetInst(){
		return ((endLoadInBackground_IMetInst != null)
	? (endLoadInBackground_IMetInst)
	: (endLoadInBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endLoadInBackground", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endLoadInBackground(){
			final com.apple.jobjc.Invoke.MsgSend endLoadInBackground_IMetInst = get_endLoadInBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endLoadInBackground_IMetInst.init(nativeBuffer, this);
		endLoadInBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend expectedResourceDataSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expectedResourceDataSize_IMetInst(){
		return ((expectedResourceDataSize_IMetInst != null)
	? (expectedResourceDataSize_IMetInst)
	: (expectedResourceDataSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expectedResourceDataSize", com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST)));
	}

	 public long expectedResourceDataSize(){
			final com.apple.jobjc.Invoke.MsgSend expectedResourceDataSize_IMetInst = get_expectedResourceDataSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expectedResourceDataSize_IMetInst.init(nativeBuffer, this);
		expectedResourceDataSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend failureReason_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_failureReason_IMetInst(){
		return ((failureReason_IMetInst != null)
	? (failureReason_IMetInst)
	: (failureReason_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "failureReason", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString failureReason(){
			final com.apple.jobjc.Invoke.MsgSend failureReason_IMetInst = get_failureReason_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		failureReason_IMetInst.init(nativeBuffer, this);
		failureReason_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flushCachedData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushCachedData_IMetInst(){
		return ((flushCachedData_IMetInst != null)
	? (flushCachedData_IMetInst)
	: (flushCachedData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushCachedData", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushCachedData(){
			final com.apple.jobjc.Invoke.MsgSend flushCachedData_IMetInst = get_flushCachedData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushCachedData_IMetInst.init(nativeBuffer, this);
		flushCachedData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_cached_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_cached_IMetInst(){
		return ((initWithURL_cached_IMetInst != null)
	? (initWithURL_cached_IMetInst)
	: (initWithURL_cached_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:cached:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_cached(final com.apple.jobjc.foundation.NSURL anURL, final boolean willCache){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_cached_IMetInst = get_initWithURL_cached_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_cached_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anURL);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, willCache);
		initWithURL_cached_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadInBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadInBackground_IMetInst(){
		return ((loadInBackground_IMetInst != null)
	? (loadInBackground_IMetInst)
	: (loadInBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadInBackground", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void loadInBackground(){
			final com.apple.jobjc.Invoke.MsgSend loadInBackground_IMetInst = get_loadInBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadInBackground_IMetInst.init(nativeBuffer, this);
		loadInBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend loadInForeground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadInForeground_IMetInst(){
		return ((loadInForeground_IMetInst != null)
	? (loadInForeground_IMetInst)
	: (loadInForeground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadInForeground", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData loadInForeground(){
			final com.apple.jobjc.Invoke.MsgSend loadInForeground_IMetInst = get_loadInForeground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadInForeground_IMetInst.init(nativeBuffer, this);
		loadInForeground_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyForKey_IMetInst(){
		return ((propertyForKey_IMetInst != null)
	? (propertyForKey_IMetInst)
	: (propertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyForKey(final com.apple.jobjc.foundation.NSString propertyKey){
			final com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst = get_propertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKey);
		propertyForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyForKeyIfAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyForKeyIfAvailable_IMetInst(){
		return ((propertyForKeyIfAvailable_IMetInst != null)
	? (propertyForKeyIfAvailable_IMetInst)
	: (propertyForKeyIfAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyForKeyIfAvailable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyForKeyIfAvailable(final com.apple.jobjc.foundation.NSString propertyKey){
			final com.apple.jobjc.Invoke.MsgSend propertyForKeyIfAvailable_IMetInst = get_propertyForKeyIfAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyForKeyIfAvailable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKey);
		propertyForKeyIfAvailable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeClient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeClient_IMetInst(){
		return ((removeClient_IMetInst != null)
	? (removeClient_IMetInst)
	: (removeClient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeClient:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeClient(final com.apple.jobjc.ID client){
			final com.apple.jobjc.Invoke.MsgSend removeClient_IMetInst = get_removeClient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeClient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		removeClient_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceData_IMetInst(){
		return ((resourceData_IMetInst != null)
	? (resourceData_IMetInst)
	: (resourceData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData resourceData(){
			final com.apple.jobjc.Invoke.MsgSend resourceData_IMetInst = get_resourceData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceData_IMetInst.init(nativeBuffer, this);
		resourceData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend status_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_status_IMetInst(){
		return ((status_IMetInst != null)
	? (status_IMetInst)
	: (status_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "status", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long status(){
			final com.apple.jobjc.Invoke.MsgSend status_IMetInst = get_status_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		status_IMetInst.init(nativeBuffer, this);
		status_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeData_IMetInst(){
		return ((writeData_IMetInst != null)
	? (writeData_IMetInst)
	: (writeData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend writeData_IMetInst = get_writeData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		writeData_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeProperty_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeProperty_forKey_IMetInst(){
		return ((writeProperty_forKey_IMetInst != null)
	? (writeProperty_forKey_IMetInst)
	: (writeProperty_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeProperty:forKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeProperty_forKey(final com.apple.jobjc.ID propertyValue, final com.apple.jobjc.foundation.NSString propertyKey){
			final com.apple.jobjc.Invoke.MsgSend writeProperty_forKey_IMetInst = get_writeProperty_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeProperty_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyValue);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKey);
		writeProperty_forKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
