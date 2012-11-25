package com.apple.jobjc.foundation;

public  class NSMutableSet extends com.apple.jobjc.foundation.NSSet {
	public NSMutableSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableSet(final NSMutableSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend intersectSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectSet_IMetInst(){
		return ((intersectSet_IMetInst != null)
	? (intersectSet_IMetInst)
	: (intersectSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void intersectSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend intersectSet_IMetInst = get_intersectSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		intersectSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minusSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minusSet_IMetInst(){
		return ((minusSet_IMetInst != null)
	? (minusSet_IMetInst)
	: (minusSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minusSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void minusSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend minusSet_IMetInst = get_minusSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minusSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		minusSet_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSet_IMetInst(){
		return ((setSet_IMetInst != null)
	? (setSet_IMetInst)
	: (setSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend setSet_IMetInst = get_setSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		setSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unionSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unionSet_IMetInst(){
		return ((unionSet_IMetInst != null)
	? (unionSet_IMetInst)
	: (unionSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unionSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unionSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend unionSet_IMetInst = get_unionSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unionSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		unionSet_IMetInst.invoke(nativeBuffer);
		
		
	}

}
