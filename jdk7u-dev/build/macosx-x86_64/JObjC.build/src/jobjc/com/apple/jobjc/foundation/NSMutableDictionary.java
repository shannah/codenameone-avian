package com.apple.jobjc.foundation;

public  class NSMutableDictionary extends com.apple.jobjc.foundation.NSDictionary {
	public NSMutableDictionary(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableDictionary(final NSMutableDictionary obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addEntriesFromDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addEntriesFromDictionary_IMetInst(){
		return ((addEntriesFromDictionary_IMetInst != null)
	? (addEntriesFromDictionary_IMetInst)
	: (addEntriesFromDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addEntriesFromDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addEntriesFromDictionary(final com.apple.jobjc.foundation.NSDictionary otherDictionary){
			final com.apple.jobjc.Invoke.MsgSend addEntriesFromDictionary_IMetInst = get_addEntriesFromDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addEntriesFromDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDictionary);
		addEntriesFromDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCapacity_IMetInst(){
		return ((initWithCapacity_IMetInst != null)
	? (initWithCapacity_IMetInst)
	: (initWithCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCapacity(final long numItems){
			final com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst = get_initWithCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCapacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numItems);
		initWithCapacity_IMetInst.invoke(nativeBuffer);
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

	 public void removeObjectForKey(final com.apple.jobjc.ID aKey){
			final com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst = get_removeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		removeObjectForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsForKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsForKeys_IMetInst(){
		return ((removeObjectsForKeys_IMetInst != null)
	? (removeObjectsForKeys_IMetInst)
	: (removeObjectsForKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsForKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsForKeys(final com.apple.jobjc.foundation.NSArray keyArray){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsForKeys_IMetInst = get_removeObjectsForKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsForKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyArray);
		removeObjectsForKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDictionary_IMetInst(){
		return ((setDictionary_IMetInst != null)
	? (setDictionary_IMetInst)
	: (setDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDictionary(final com.apple.jobjc.foundation.NSDictionary otherDictionary){
			final com.apple.jobjc.Invoke.MsgSend setDictionary_IMetInst = get_setDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDictionary);
		setDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKey_IMetInst(){
		return ((setObject_forKey_IMetInst != null)
	? (setObject_forKey_IMetInst)
	: (setObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObject_forKey(final com.apple.jobjc.ID anObject, final com.apple.jobjc.ID aKey){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst = get_setObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKeyedSubscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKeyedSubscript_IMetInst(){
		return ((setObject_forKeyedSubscript_IMetInst != null)
	? (setObject_forKeyedSubscript_IMetInst)
	: (setObject_forKeyedSubscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKeyedSubscript:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObject_forKeyedSubscript(final com.apple.jobjc.ID obj, final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKeyedSubscript_IMetInst = get_setObject_forKeyedSubscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKeyedSubscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setObject_forKeyedSubscript_IMetInst.invoke(nativeBuffer);
		
		
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

}
