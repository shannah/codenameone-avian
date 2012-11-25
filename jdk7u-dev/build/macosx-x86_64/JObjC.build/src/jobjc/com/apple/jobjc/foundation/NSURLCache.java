package com.apple.jobjc.foundation;

public  class NSURLCache extends com.apple.jobjc.foundation.NSObject {
	public NSURLCache(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLCache(final NSURLCache obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cachedResponseForRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cachedResponseForRequest_IMetInst(){
		return ((cachedResponseForRequest_IMetInst != null)
	? (cachedResponseForRequest_IMetInst)
	: (cachedResponseForRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cachedResponseForRequest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSCachedURLResponse cachedResponseForRequest(final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend cachedResponseForRequest_IMetInst = get_cachedResponseForRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cachedResponseForRequest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		cachedResponseForRequest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSCachedURLResponse returnValue = (com.apple.jobjc.foundation.NSCachedURLResponse) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentDiskUsage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentDiskUsage_IMetInst(){
		return ((currentDiskUsage_IMetInst != null)
	? (currentDiskUsage_IMetInst)
	: (currentDiskUsage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentDiskUsage", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long currentDiskUsage(){
			final com.apple.jobjc.Invoke.MsgSend currentDiskUsage_IMetInst = get_currentDiskUsage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentDiskUsage_IMetInst.init(nativeBuffer, this);
		currentDiskUsage_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentMemoryUsage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentMemoryUsage_IMetInst(){
		return ((currentMemoryUsage_IMetInst != null)
	? (currentMemoryUsage_IMetInst)
	: (currentMemoryUsage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentMemoryUsage", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long currentMemoryUsage(){
			final com.apple.jobjc.Invoke.MsgSend currentMemoryUsage_IMetInst = get_currentMemoryUsage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentMemoryUsage_IMetInst.init(nativeBuffer, this);
		currentMemoryUsage_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend diskCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_diskCapacity_IMetInst(){
		return ((diskCapacity_IMetInst != null)
	? (diskCapacity_IMetInst)
	: (diskCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "diskCapacity", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long diskCapacity(){
			final com.apple.jobjc.Invoke.MsgSend diskCapacity_IMetInst = get_diskCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		diskCapacity_IMetInst.init(nativeBuffer, this);
		diskCapacity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMemoryCapacity_diskCapacity_diskPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMemoryCapacity_diskCapacity_diskPath_IMetInst(){
		return ((initWithMemoryCapacity_diskCapacity_diskPath_IMetInst != null)
	? (initWithMemoryCapacity_diskCapacity_diskPath_IMetInst)
	: (initWithMemoryCapacity_diskCapacity_diskPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMemoryCapacity:diskCapacity:diskPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMemoryCapacity_diskCapacity_diskPath(final long memoryCapacity, final long diskCapacity, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithMemoryCapacity_diskCapacity_diskPath_IMetInst = get_initWithMemoryCapacity_diskCapacity_diskPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMemoryCapacity_diskCapacity_diskPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, memoryCapacity);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, diskCapacity);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithMemoryCapacity_diskCapacity_diskPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend memoryCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_memoryCapacity_IMetInst(){
		return ((memoryCapacity_IMetInst != null)
	? (memoryCapacity_IMetInst)
	: (memoryCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "memoryCapacity", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long memoryCapacity(){
			final com.apple.jobjc.Invoke.MsgSend memoryCapacity_IMetInst = get_memoryCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		memoryCapacity_IMetInst.init(nativeBuffer, this);
		memoryCapacity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllCachedResponses_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllCachedResponses_IMetInst(){
		return ((removeAllCachedResponses_IMetInst != null)
	? (removeAllCachedResponses_IMetInst)
	: (removeAllCachedResponses_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllCachedResponses", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllCachedResponses(){
			final com.apple.jobjc.Invoke.MsgSend removeAllCachedResponses_IMetInst = get_removeAllCachedResponses_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllCachedResponses_IMetInst.init(nativeBuffer, this);
		removeAllCachedResponses_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCachedResponseForRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCachedResponseForRequest_IMetInst(){
		return ((removeCachedResponseForRequest_IMetInst != null)
	? (removeCachedResponseForRequest_IMetInst)
	: (removeCachedResponseForRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCachedResponseForRequest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeCachedResponseForRequest(final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend removeCachedResponseForRequest_IMetInst = get_removeCachedResponseForRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCachedResponseForRequest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		removeCachedResponseForRequest_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDiskCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDiskCapacity_IMetInst(){
		return ((setDiskCapacity_IMetInst != null)
	? (setDiskCapacity_IMetInst)
	: (setDiskCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDiskCapacity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDiskCapacity(final long diskCapacity){
			final com.apple.jobjc.Invoke.MsgSend setDiskCapacity_IMetInst = get_setDiskCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDiskCapacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, diskCapacity);
		setDiskCapacity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMemoryCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMemoryCapacity_IMetInst(){
		return ((setMemoryCapacity_IMetInst != null)
	? (setMemoryCapacity_IMetInst)
	: (setMemoryCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMemoryCapacity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMemoryCapacity(final long memoryCapacity){
			final com.apple.jobjc.Invoke.MsgSend setMemoryCapacity_IMetInst = get_setMemoryCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMemoryCapacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, memoryCapacity);
		setMemoryCapacity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend storeCachedResponse_forRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_storeCachedResponse_forRequest_IMetInst(){
		return ((storeCachedResponse_forRequest_IMetInst != null)
	? (storeCachedResponse_forRequest_IMetInst)
	: (storeCachedResponse_forRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "storeCachedResponse:forRequest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void storeCachedResponse_forRequest(final com.apple.jobjc.foundation.NSCachedURLResponse cachedResponse, final com.apple.jobjc.foundation.NSURLRequest request){
			final com.apple.jobjc.Invoke.MsgSend storeCachedResponse_forRequest_IMetInst = get_storeCachedResponse_forRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		storeCachedResponse_forRequest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cachedResponse);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		storeCachedResponse_forRequest_IMetInst.invoke(nativeBuffer);
		
		
	}

}
