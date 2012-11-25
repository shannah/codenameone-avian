package com.apple.jobjc.foundation;

public  class NSCache extends com.apple.jobjc.foundation.NSObject {
	public NSCache(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCache(final NSCache obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend countLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countLimit_IMetInst(){
		return ((countLimit_IMetInst != null)
	? (countLimit_IMetInst)
	: (countLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countLimit", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long countLimit(){
			final com.apple.jobjc.Invoke.MsgSend countLimit_IMetInst = get_countLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countLimit_IMetInst.init(nativeBuffer, this);
		countLimit_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evictsObjectsWithDiscardedContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evictsObjectsWithDiscardedContent_IMetInst(){
		return ((evictsObjectsWithDiscardedContent_IMetInst != null)
	? (evictsObjectsWithDiscardedContent_IMetInst)
	: (evictsObjectsWithDiscardedContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evictsObjectsWithDiscardedContent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean evictsObjectsWithDiscardedContent(){
			final com.apple.jobjc.Invoke.MsgSend evictsObjectsWithDiscardedContent_IMetInst = get_evictsObjectsWithDiscardedContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evictsObjectsWithDiscardedContent_IMetInst.init(nativeBuffer, this);
		evictsObjectsWithDiscardedContent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllObjects_IMetInst(){
		return ((removeAllObjects_IMetInst != null)
	? (removeAllObjects_IMetInst)
	: (removeAllObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllObjects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllObjects(){
			final com.apple.jobjc.Invoke.MsgSend removeAllObjects_IMetInst = get_removeAllObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllObjects_IMetInst.init(nativeBuffer, this);
		removeAllObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectForKey_IMetInst(){
		return ((removeObjectForKey_IMetInst != null)
	? (removeObjectForKey_IMetInst)
	: (removeObjectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectForKey(final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst = get_removeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		removeObjectForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCountLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCountLimit_IMetInst(){
		return ((setCountLimit_IMetInst != null)
	? (setCountLimit_IMetInst)
	: (setCountLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCountLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCountLimit(final long lim){
			final com.apple.jobjc.Invoke.MsgSend setCountLimit_IMetInst = get_setCountLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCountLimit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lim);
		setCountLimit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID d){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, d);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEvictsObjectsWithDiscardedContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEvictsObjectsWithDiscardedContent_IMetInst(){
		return ((setEvictsObjectsWithDiscardedContent_IMetInst != null)
	? (setEvictsObjectsWithDiscardedContent_IMetInst)
	: (setEvictsObjectsWithDiscardedContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEvictsObjectsWithDiscardedContent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEvictsObjectsWithDiscardedContent(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setEvictsObjectsWithDiscardedContent_IMetInst = get_setEvictsObjectsWithDiscardedContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEvictsObjectsWithDiscardedContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setEvictsObjectsWithDiscardedContent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setName_IMetInst(){
		return ((setName_IMetInst != null)
	? (setName_IMetInst)
	: (setName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setName(final com.apple.jobjc.foundation.NSString n){
			final com.apple.jobjc.Invoke.MsgSend setName_IMetInst = get_setName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, n);
		setName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKey_IMetInst(){
		return ((setObject_forKey_IMetInst != null)
	? (setObject_forKey_IMetInst)
	: (setObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObject_forKey(final com.apple.jobjc.ID obj, final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst = get_setObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKey_cost_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKey_cost_IMetInst(){
		return ((setObject_forKey_cost_IMetInst != null)
	? (setObject_forKey_cost_IMetInst)
	: (setObject_forKey_cost_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKey:cost:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setObject_forKey_cost(final com.apple.jobjc.ID obj, final com.apple.jobjc.ID key, final long g){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKey_cost_IMetInst = get_setObject_forKey_cost_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKey_cost_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, g);
		setObject_forKey_cost_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTotalCostLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTotalCostLimit_IMetInst(){
		return ((setTotalCostLimit_IMetInst != null)
	? (setTotalCostLimit_IMetInst)
	: (setTotalCostLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTotalCostLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTotalCostLimit(final long lim){
			final com.apple.jobjc.Invoke.MsgSend setTotalCostLimit_IMetInst = get_setTotalCostLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTotalCostLimit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lim);
		setTotalCostLimit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend totalCostLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_totalCostLimit_IMetInst(){
		return ((totalCostLimit_IMetInst != null)
	? (totalCostLimit_IMetInst)
	: (totalCostLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "totalCostLimit", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long totalCostLimit(){
			final com.apple.jobjc.Invoke.MsgSend totalCostLimit_IMetInst = get_totalCostLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		totalCostLimit_IMetInst.init(nativeBuffer, this);
		totalCostLimit_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
