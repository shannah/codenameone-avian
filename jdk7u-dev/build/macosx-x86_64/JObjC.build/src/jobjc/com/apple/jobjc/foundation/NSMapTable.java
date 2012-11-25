package com.apple.jobjc.foundation;

public  class NSMapTable extends com.apple.jobjc.foundation.NSObject {
	public NSMapTable(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMapTable(final NSMapTable obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_count_IMetInst(){
		return ((count_IMetInst != null)
	? (count_IMetInst)
	: (count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "count", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long count(){
			final com.apple.jobjc.Invoke.MsgSend count_IMetInst = get_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		count_IMetInst.init(nativeBuffer, this);
		count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryRepresentation_IMetInst(){
		return ((dictionaryRepresentation_IMetInst != null)
	? (dictionaryRepresentation_IMetInst)
	: (dictionaryRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst = get_dictionaryRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryRepresentation_IMetInst.init(nativeBuffer, this);
		dictionaryRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKeyOptions_valueOptions_capacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKeyOptions_valueOptions_capacity_IMetInst(){
		return ((initWithKeyOptions_valueOptions_capacity_IMetInst != null)
	? (initWithKeyOptions_valueOptions_capacity_IMetInst)
	: (initWithKeyOptions_valueOptions_capacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKeyOptions:valueOptions:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKeyOptions_valueOptions_capacity(final long keyOptions, final long valueOptions, final long initialCapacity){
			final com.apple.jobjc.Invoke.MsgSend initWithKeyOptions_valueOptions_capacity_IMetInst = get_initWithKeyOptions_valueOptions_capacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKeyOptions_valueOptions_capacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, keyOptions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, valueOptions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, initialCapacity);
		initWithKeyOptions_valueOptions_capacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst(){
		return ((initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst != null)
	? (initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst)
	: (initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKeyPointerFunctions:valuePointerFunctions:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKeyPointerFunctions_valuePointerFunctions_capacity(final com.apple.jobjc.foundation.NSPointerFunctions keyFunctions, final com.apple.jobjc.foundation.NSPointerFunctions valueFunctions, final long initialCapacity){
			final com.apple.jobjc.Invoke.MsgSend initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst = get_initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyFunctions);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, valueFunctions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, initialCapacity);
		initWithKeyPointerFunctions_valuePointerFunctions_capacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEnumerator_IMetInst(){
		return ((keyEnumerator_IMetInst != null)
	? (keyEnumerator_IMetInst)
	: (keyEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator keyEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend keyEnumerator_IMetInst = get_keyEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEnumerator_IMetInst.init(nativeBuffer, this);
		keyEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyPointerFunctions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyPointerFunctions_IMetInst(){
		return ((keyPointerFunctions_IMetInst != null)
	? (keyPointerFunctions_IMetInst)
	: (keyPointerFunctions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyPointerFunctions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPointerFunctions keyPointerFunctions(){
			final com.apple.jobjc.Invoke.MsgSend keyPointerFunctions_IMetInst = get_keyPointerFunctions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyPointerFunctions_IMetInst.init(nativeBuffer, this);
		keyPointerFunctions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPointerFunctions returnValue = (com.apple.jobjc.foundation.NSPointerFunctions) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectEnumerator_IMetInst(){
		return ((objectEnumerator_IMetInst != null)
	? (objectEnumerator_IMetInst)
	: (objectEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator objectEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst = get_objectEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectEnumerator_IMetInst.init(nativeBuffer, this);
		objectEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.ID aKey){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
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

	 public void removeObjectForKey(final com.apple.jobjc.ID aKey){
			final com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst = get_removeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		removeObjectForKey_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend valuePointerFunctions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valuePointerFunctions_IMetInst(){
		return ((valuePointerFunctions_IMetInst != null)
	? (valuePointerFunctions_IMetInst)
	: (valuePointerFunctions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valuePointerFunctions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPointerFunctions valuePointerFunctions(){
			final com.apple.jobjc.Invoke.MsgSend valuePointerFunctions_IMetInst = get_valuePointerFunctions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valuePointerFunctions_IMetInst.init(nativeBuffer, this);
		valuePointerFunctions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPointerFunctions returnValue = (com.apple.jobjc.foundation.NSPointerFunctions) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
