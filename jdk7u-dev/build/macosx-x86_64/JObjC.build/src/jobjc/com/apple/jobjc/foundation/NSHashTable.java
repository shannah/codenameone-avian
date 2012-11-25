package com.apple.jobjc.foundation;

public  class NSHashTable extends com.apple.jobjc.foundation.NSObject {
	public NSHashTable(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSHashTable(final NSHashTable obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_IMetInst(){
		return ((addObject_IMetInst != null)
	? (addObject_IMetInst)
	: (addObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend addObject_IMetInst = get_addObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		addObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allObjects_IMetInst(){
		return ((allObjects_IMetInst != null)
	? (allObjects_IMetInst)
	: (allObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allObjects(){
			final com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst = get_allObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allObjects_IMetInst.init(nativeBuffer, this);
		allObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend anyObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_anyObject_IMetInst(){
		return ((anyObject_IMetInst != null)
	? (anyObject_IMetInst)
	: (anyObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "anyObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T anyObject(){
			final com.apple.jobjc.Invoke.MsgSend anyObject_IMetInst = get_anyObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		anyObject_IMetInst.init(nativeBuffer, this);
		anyObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsObject_IMetInst(){
		return ((containsObject_IMetInst != null)
	? (containsObject_IMetInst)
	: (containsObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst = get_containsObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		containsObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithOptions_capacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOptions_capacity_IMetInst(){
		return ((initWithOptions_capacity_IMetInst != null)
	? (initWithOptions_capacity_IMetInst)
	: (initWithOptions_capacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOptions:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOptions_capacity(final long options, final long initialCapacity){
			final com.apple.jobjc.Invoke.MsgSend initWithOptions_capacity_IMetInst = get_initWithOptions_capacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOptions_capacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, initialCapacity);
		initWithOptions_capacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPointerFunctions_capacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPointerFunctions_capacity_IMetInst(){
		return ((initWithPointerFunctions_capacity_IMetInst != null)
	? (initWithPointerFunctions_capacity_IMetInst)
	: (initWithPointerFunctions_capacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPointerFunctions:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPointerFunctions_capacity(final com.apple.jobjc.foundation.NSPointerFunctions functions, final long initialCapacity){
			final com.apple.jobjc.Invoke.MsgSend initWithPointerFunctions_capacity_IMetInst = get_initWithPointerFunctions_capacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPointerFunctions_capacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, functions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, initialCapacity);
		initWithPointerFunctions_capacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectHashTable_IMetInst(){
		return ((intersectHashTable_IMetInst != null)
	? (intersectHashTable_IMetInst)
	: (intersectHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectHashTable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void intersectHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend intersectHashTable_IMetInst = get_intersectHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		intersectHashTable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectsHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectsHashTable_IMetInst(){
		return ((intersectsHashTable_IMetInst != null)
	? (intersectsHashTable_IMetInst)
	: (intersectsHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectsHashTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean intersectsHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend intersectsHashTable_IMetInst = get_intersectsHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectsHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		intersectsHashTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToHashTable_IMetInst(){
		return ((isEqualToHashTable_IMetInst != null)
	? (isEqualToHashTable_IMetInst)
	: (isEqualToHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToHashTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend isEqualToHashTable_IMetInst = get_isEqualToHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isEqualToHashTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubsetOfHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubsetOfHashTable_IMetInst(){
		return ((isSubsetOfHashTable_IMetInst != null)
	? (isSubsetOfHashTable_IMetInst)
	: (isSubsetOfHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubsetOfHashTable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSubsetOfHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend isSubsetOfHashTable_IMetInst = get_isSubsetOfHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubsetOfHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isSubsetOfHashTable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend member_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_member_IMetInst(){
		return ((member_IMetInst != null)
	? (member_IMetInst)
	: (member_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "member:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T member(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend member_IMetInst = get_member_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		member_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		member_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minusHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minusHashTable_IMetInst(){
		return ((minusHashTable_IMetInst != null)
	? (minusHashTable_IMetInst)
	: (minusHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minusHashTable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void minusHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend minusHashTable_IMetInst = get_minusHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minusHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		minusHashTable_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend pointerFunctions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerFunctions_IMetInst(){
		return ((pointerFunctions_IMetInst != null)
	? (pointerFunctions_IMetInst)
	: (pointerFunctions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerFunctions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPointerFunctions pointerFunctions(){
			final com.apple.jobjc.Invoke.MsgSend pointerFunctions_IMetInst = get_pointerFunctions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerFunctions_IMetInst.init(nativeBuffer, this);
		pointerFunctions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPointerFunctions returnValue = (com.apple.jobjc.foundation.NSPointerFunctions) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObject_IMetInst(){
		return ((removeObject_IMetInst != null)
	? (removeObject_IMetInst)
	: (removeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst = get_removeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		removeObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentation_IMetInst(){
		return ((setRepresentation_IMetInst != null)
	? (setRepresentation_IMetInst)
	: (setRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet setRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend setRepresentation_IMetInst = get_setRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentation_IMetInst.init(nativeBuffer, this);
		setRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unionHashTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unionHashTable_IMetInst(){
		return ((unionHashTable_IMetInst != null)
	? (unionHashTable_IMetInst)
	: (unionHashTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unionHashTable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unionHashTable(final com.apple.jobjc.foundation.NSHashTable other){
			final com.apple.jobjc.Invoke.MsgSend unionHashTable_IMetInst = get_unionHashTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unionHashTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		unionHashTable_IMetInst.invoke(nativeBuffer);
		
		
	}

}
