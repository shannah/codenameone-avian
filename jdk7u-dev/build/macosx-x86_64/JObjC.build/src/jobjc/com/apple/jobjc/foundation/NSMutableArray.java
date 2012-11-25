package com.apple.jobjc.foundation;

public  class NSMutableArray extends com.apple.jobjc.foundation.NSArray {
	public NSMutableArray(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableArray(final NSMutableArray obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_IMetInst(){
		return ((addObject_IMetInst != null)
	? (addObject_IMetInst)
	: (addObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend addObject_IMetInst = get_addObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addObjectsFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObjectsFromArray_IMetInst(){
		return ((addObjectsFromArray_IMetInst != null)
	? (addObjectsFromArray_IMetInst)
	: (addObjectsFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObjectsFromArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObjectsFromArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend addObjectsFromArray_IMetInst = get_addObjectsFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObjectsFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
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

	private static com.apple.jobjc.Invoke.MsgSend filterUsingPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filterUsingPredicate_IMetInst(){
		return ((filterUsingPredicate_IMetInst != null)
	? (filterUsingPredicate_IMetInst)
	: (filterUsingPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filterUsingPredicate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void filterUsingPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend filterUsingPredicate_IMetInst = get_filterUsingPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filterUsingPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		filterUsingPredicate_IMetInst.invoke(nativeBuffer);
		
		
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

	 public void insertObject_atIndex(final com.apple.jobjc.ID anObject, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertObject_atIndex_IMetInst = get_insertObject_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObject_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
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

	private static com.apple.jobjc.Invoke.MsgSend removeLastObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeLastObject_IMetInst(){
		return ((removeLastObject_IMetInst != null)
	? (removeLastObject_IMetInst)
	: (removeLastObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeLastObject", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeLastObject(){
			final com.apple.jobjc.Invoke.MsgSend removeLastObject_IMetInst = get_removeLastObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeLastObject_IMetInst.init(nativeBuffer, this);
		removeLastObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObject_IMetInst(){
		return ((removeObject_IMetInst != null)
	? (removeObject_IMetInst)
	: (removeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst = get_removeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		removeObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObject_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObject_inRange_IMetInst(){
		return ((removeObject_inRange_IMetInst != null)
	? (removeObject_inRange_IMetInst)
	: (removeObject_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObject:inRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeObject_inRange(final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend removeObject_inRange_IMetInst = get_removeObject_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObject_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		removeObject_inRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectAtIndex_IMetInst(){
		return ((removeObjectAtIndex_IMetInst != null)
	? (removeObjectAtIndex_IMetInst)
	: (removeObjectAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeObjectAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeObjectAtIndex_IMetInst = get_removeObjectAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		removeObjectAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectIdenticalTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectIdenticalTo_IMetInst(){
		return ((removeObjectIdenticalTo_IMetInst != null)
	? (removeObjectIdenticalTo_IMetInst)
	: (removeObjectIdenticalTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectIdenticalTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectIdenticalTo(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend removeObjectIdenticalTo_IMetInst = get_removeObjectIdenticalTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectIdenticalTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		removeObjectIdenticalTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectIdenticalTo_inRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectIdenticalTo_inRange_IMetInst(){
		return ((removeObjectIdenticalTo_inRange_IMetInst != null)
	? (removeObjectIdenticalTo_inRange_IMetInst)
	: (removeObjectIdenticalTo_inRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectIdenticalTo:inRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeObjectIdenticalTo_inRange(final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend removeObjectIdenticalTo_inRange_IMetInst = get_removeObjectIdenticalTo_inRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectIdenticalTo_inRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		removeObjectIdenticalTo_inRange_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsFromIndices_numIndices_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsFromIndices_numIndices_IMetInst(){
		return ((removeObjectsFromIndices_numIndices_IMetInst != null)
	? (removeObjectsFromIndices_numIndices_IMetInst)
	: (removeObjectsFromIndices_numIndices_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsFromIndices:numIndices:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeObjectsFromIndices_numIndices(final com.apple.jobjc.Pointer<java.lang.Long> indices, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsFromIndices_numIndices_IMetInst = get_removeObjectsFromIndices_numIndices_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsFromIndices_numIndices_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, indices);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		removeObjectsFromIndices_numIndices_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsInArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsInArray_IMetInst(){
		return ((removeObjectsInArray_IMetInst != null)
	? (removeObjectsInArray_IMetInst)
	: (removeObjectsInArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsInArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsInArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsInArray_IMetInst = get_removeObjectsInArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsInArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
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

	 public void replaceObjectAtIndex_withObject(final long index, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectAtIndex_withObject_IMetInst = get_replaceObjectAtIndex_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectAtIndex_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
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

	private static com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjectsFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObjectsInRange_withObjectsFromArray_IMetInst(){
		return ((replaceObjectsInRange_withObjectsFromArray_IMetInst != null)
	? (replaceObjectsInRange_withObjectsFromArray_IMetInst)
	: (replaceObjectsInRange_withObjectsFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObjectsInRange:withObjectsFromArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceObjectsInRange_withObjectsFromArray(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjectsFromArray_IMetInst = get_replaceObjectsInRange_withObjectsFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectsInRange_withObjectsFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		replaceObjectsInRange_withObjectsFromArray_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjectsFromArray_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObjectsInRange_withObjectsFromArray_range_IMetInst(){
		return ((replaceObjectsInRange_withObjectsFromArray_range_IMetInst != null)
	? (replaceObjectsInRange_withObjectsFromArray_range_IMetInst)
	: (replaceObjectsInRange_withObjectsFromArray_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObjectsInRange:withObjectsFromArray:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void replaceObjectsInRange_withObjectsFromArray_range(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSArray otherArray, final com.apple.jobjc.foundation.NSRange otherRange){
			final com.apple.jobjc.Invoke.MsgSend replaceObjectsInRange_withObjectsFromArray_range_IMetInst = get_replaceObjectsInRange_withObjectsFromArray_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObjectsInRange_withObjectsFromArray_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, otherRange);
		replaceObjectsInRange_withObjectsFromArray_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArray_IMetInst(){
		return ((setArray_IMetInst != null)
	? (setArray_IMetInst)
	: (setArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArray:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setArray(final com.apple.jobjc.foundation.NSArray otherArray){
			final com.apple.jobjc.Invoke.MsgSend setArray_IMetInst = get_setArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherArray);
		setArray_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend sortUsingDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingDescriptors_IMetInst(){
		return ((sortUsingDescriptors_IMetInst != null)
	? (sortUsingDescriptors_IMetInst)
	: (sortUsingDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sortUsingDescriptors(final com.apple.jobjc.foundation.NSArray sortDescriptors){
			final com.apple.jobjc.Invoke.MsgSend sortUsingDescriptors_IMetInst = get_sortUsingDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		sortUsingDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortUsingFunction_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingFunction_context_IMetInst(){
		return ((sortUsingFunction_context_IMetInst != null)
	? (sortUsingFunction_context_IMetInst)
	: (sortUsingFunction_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingFunction:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void sortUsingFunction_context(final Object /* NSInteger(*)(id,id,void*) (^?, ^?) */ compare, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend sortUsingFunction_context_IMetInst = get_sortUsingFunction_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingFunction_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, compare);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		sortUsingFunction_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortUsingSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingSelector_IMetInst(){
		return ((sortUsingSelector_IMetInst != null)
	? (sortUsingSelector_IMetInst)
	: (sortUsingSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void sortUsingSelector(final com.apple.jobjc.SEL comparator){
			final com.apple.jobjc.Invoke.MsgSend sortUsingSelector_IMetInst = get_sortUsingSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, comparator);
		sortUsingSelector_IMetInst.invoke(nativeBuffer);
		
		
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

}
