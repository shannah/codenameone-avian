package com.apple.jobjc.foundation;

public  class NSMutableOrderedSet extends com.apple.jobjc.foundation.NSOrderedSet {
	public NSMutableOrderedSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableOrderedSet(final NSMutableOrderedSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend addObjects_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObjects_count_IMetInst(){
		return ((addObjects_count_IMetInst != null)
	? (addObjects_count_IMetInst)
	: (addObjects_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObjects:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void addObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long count){
			final com.apple.jobjc.Invoke.MsgSend addObjects_count_IMetInst = get_addObjects_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObjects_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		addObjects_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObjectsFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObjectsFromArray_IMetInst(){
		return ((addObjectsFromArray_IMetInst != null)
	? (addObjectsFromArray_IMetInst)
	: (addObjectsFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObjectsFromArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObjectsFromArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend addObjectsFromArray_IMetInst = get_addObjectsFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObjectsFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		addObjectsFromArray_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend exchangeObjectAtIndex_withObjectAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exchangeObjectAtIndex_withObjectAtIndex_IMetInst(){
		return ((exchangeObjectAtIndex_withObjectAtIndex_IMetInst != null)
	? (exchangeObjectAtIndex_withObjectAtIndex_IMetInst)
	: (exchangeObjectAtIndex_withObjectAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exchangeObjectAtIndex:withObjectAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void exchangeObjectAtIndex_withObjectAtIndex(final long idx1, final long idx2){
			final com.apple.jobjc.Invoke.MsgSend exchangeObjectAtIndex_withObjectAtIndex_IMetInst = get_exchangeObjectAtIndex_withObjectAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exchangeObjectAtIndex_withObjectAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx1);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx2);
		exchangeObjectAtIndex_withObjectAtIndex_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend insertObject_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObject_atIndex_IMetInst(){
		return ((insertObject_atIndex_IMetInst != null)
	? (insertObject_atIndex_IMetInst)
	: (insertObject_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObject:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertObject_atIndex(final com.apple.jobjc.ID object, final long idx){
			final com.apple.jobjc.Invoke.MsgSend insertObject_atIndex_IMetInst = get_insertObject_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObject_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		insertObject_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertObjects_atIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObjects_atIndexes_IMetInst(){
		return ((insertObjects_atIndexes_IMetInst != null)
	? (insertObjects_atIndexes_IMetInst)
	: (insertObjects_atIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObjects:atIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertObjects_atIndexes(final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend insertObjects_atIndexes_IMetInst = get_insertObjects_atIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObjects_atIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		insertObjects_atIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectOrderedSet_IMetInst(){
		return ((intersectOrderedSet_IMetInst != null)
	? (intersectOrderedSet_IMetInst)
	: (intersectOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectOrderedSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void intersectOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend intersectOrderedSet_IMetInst = get_intersectOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		intersectOrderedSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectSet_IMetInst(){
		return ((intersectSet_IMetInst != null)
	? (intersectSet_IMetInst)
	: (intersectSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void intersectSet(final com.apple.jobjc.foundation.NSSet other){
			final com.apple.jobjc.Invoke.MsgSend intersectSet_IMetInst = get_intersectSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		intersectSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minusOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minusOrderedSet_IMetInst(){
		return ((minusOrderedSet_IMetInst != null)
	? (minusOrderedSet_IMetInst)
	: (minusOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minusOrderedSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void minusOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend minusOrderedSet_IMetInst = get_minusOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minusOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		minusOrderedSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minusSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minusSet_IMetInst(){
		return ((minusSet_IMetInst != null)
	? (minusSet_IMetInst)
	: (minusSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minusSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void minusSet(final com.apple.jobjc.foundation.NSSet other){
			final com.apple.jobjc.Invoke.MsgSend minusSet_IMetInst = get_minusSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minusSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		minusSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveObjectsAtIndexes_toIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveObjectsAtIndexes_toIndex_IMetInst(){
		return ((moveObjectsAtIndexes_toIndex_IMetInst != null)
	? (moveObjectsAtIndexes_toIndex_IMetInst)
	: (moveObjectsAtIndexes_toIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveObjectsAtIndexes:toIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void moveObjectsAtIndexes_toIndex(final com.apple.jobjc.foundation.NSIndexSet indexes, final long idx){
			final com.apple.jobjc.Invoke.MsgSend moveObjectsAtIndexes_toIndex_IMetInst = get_moveObjectsAtIndexes_toIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveObjectsAtIndexes_toIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		moveObjectsAtIndexes_toIndex_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend removeObjectAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectAtIndex_IMetInst(){
		return ((removeObjectAtIndex_IMetInst != null)
	? (removeObjectAtIndex_IMetInst)
	: (removeObjectAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeObjectAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend removeObjectAtIndex_IMetInst = get_removeObjectAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		removeObjectAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsAtIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsAtIndexes_IMetInst(){
		return ((removeObjectsAtIndexes_IMetInst != null)
	? (removeObjectsAtIndexes_IMetInst)
	: (removeObjectsAtIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsAtIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsAtIndexes(final com.apple.jobjc.foundation.NSIndexSet indexes){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsAtIndexes_IMetInst = get_removeObjectsAtIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsAtIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		removeObjectsAtIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsInArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsInArray_IMetInst(){
		return ((removeObjectsInArray_IMetInst != null)
	? (removeObjectsInArray_IMetInst)
	: (removeObjectsInArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsInArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsInArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsInArray_IMetInst = get_removeObjectsInArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsInArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		removeObjectsInArray_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsInRange_IMetInst(){
		return ((removeObjectsInRange_IMetInst != null)
	? (removeObjectsInRange_IMetInst)
	: (removeObjectsInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeObjectsInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsInRange_IMetInst = get_removeObjectsInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		removeObjectsInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObjectAtIndex_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObjectAtIndex_withObject_IMetInst(){
		return ((replaceObjectAtIndex_withObject_IMetInst != null)
	? (replaceObjectAtIndex_withObject_IMetInst)
	: (replaceObjectAtIndex_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObjectAtIndex:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceObjectAtIndex_withObject(final long idx, final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectAtIndex_withObject_IMetInst = get_replaceObjectAtIndex_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectAtIndex_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		replaceObjectAtIndex_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObjectsAtIndexes_withObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObjectsAtIndexes_withObjects_IMetInst(){
		return ((replaceObjectsAtIndexes_withObjects_IMetInst != null)
	? (replaceObjectsAtIndexes_withObjects_IMetInst)
	: (replaceObjectsAtIndexes_withObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObjectsAtIndexes:withObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceObjectsAtIndexes_withObjects(final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectsAtIndexes_withObjects_IMetInst = get_replaceObjectsAtIndexes_withObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectsAtIndexes_withObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		replaceObjectsAtIndexes_withObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjects_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObjectsInRange_withObjects_count_IMetInst(){
		return ((replaceObjectsInRange_withObjects_count_IMetInst != null)
	? (replaceObjectsInRange_withObjects_count_IMetInst)
	: (replaceObjectsInRange_withObjects_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObjectsInRange:withObjects:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void replaceObjectsInRange_withObjects_count(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long count){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjects_count_IMetInst = get_replaceObjectsInRange_withObjects_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectsInRange_withObjects_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		replaceObjectsInRange_withObjects_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_atIndex_IMetInst(){
		return ((setObject_atIndex_IMetInst != null)
	? (setObject_atIndex_IMetInst)
	: (setObject_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setObject_atIndex(final com.apple.jobjc.ID obj, final long idx){
			final com.apple.jobjc.Invoke.MsgSend setObject_atIndex_IMetInst = get_setObject_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		setObject_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_atIndexedSubscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_atIndexedSubscript_IMetInst(){
		return ((setObject_atIndexedSubscript_IMetInst != null)
	? (setObject_atIndexedSubscript_IMetInst)
	: (setObject_atIndexedSubscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:atIndexedSubscript:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setObject_atIndexedSubscript(final com.apple.jobjc.ID obj, final long idx){
			final com.apple.jobjc.Invoke.MsgSend setObject_atIndexedSubscript_IMetInst = get_setObject_atIndexedSubscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_atIndexedSubscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		setObject_atIndexedSubscript_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortRange_options_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortRange_options_usingComparator_IMetInst(){
		return ((sortRange_options_usingComparator_IMetInst != null)
	? (sortRange_options_usingComparator_IMetInst)
	: (sortRange_options_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortRange:options:usingComparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void sortRange_options_usingComparator(final com.apple.jobjc.foundation.NSRange range, final long opts, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortRange_options_usingComparator_IMetInst = get_sortRange_options_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortRange_options_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortRange_options_usingComparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortUsingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingComparator_IMetInst(){
		return ((sortUsingComparator_IMetInst != null)
	? (sortUsingComparator_IMetInst)
	: (sortUsingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingComparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void sortUsingComparator(final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortUsingComparator_IMetInst = get_sortUsingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortUsingComparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortWithOptions_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortWithOptions_usingComparator_IMetInst(){
		return ((sortWithOptions_usingComparator_IMetInst != null)
	? (sortWithOptions_usingComparator_IMetInst)
	: (sortWithOptions_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortWithOptions:usingComparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void sortWithOptions_usingComparator(final long opts, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortWithOptions_usingComparator_IMetInst = get_sortWithOptions_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortWithOptions_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortWithOptions_usingComparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unionOrderedSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unionOrderedSet_IMetInst(){
		return ((unionOrderedSet_IMetInst != null)
	? (unionOrderedSet_IMetInst)
	: (unionOrderedSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unionOrderedSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unionOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet other){
			final com.apple.jobjc.Invoke.MsgSend unionOrderedSet_IMetInst = get_unionOrderedSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unionOrderedSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		unionOrderedSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unionSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unionSet_IMetInst(){
		return ((unionSet_IMetInst != null)
	? (unionSet_IMetInst)
	: (unionSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unionSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unionSet(final com.apple.jobjc.foundation.NSSet other){
			final com.apple.jobjc.Invoke.MsgSend unionSet_IMetInst = get_unionSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unionSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		unionSet_IMetInst.invoke(nativeBuffer);
		
		
	}

}
