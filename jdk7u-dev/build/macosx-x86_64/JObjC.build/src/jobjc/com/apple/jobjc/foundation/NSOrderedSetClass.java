package com.apple.jobjc.foundation;

public  class NSOrderedSetClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSOrderedSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOrderedSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOrderedSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend orderedSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSet_CMetInst(){
		return ((orderedSet_CMetInst != null)
	? (orderedSet_CMetInst)
	: (orderedSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSet(){
			final com.apple.jobjc.Invoke.MsgSend orderedSet_CMetInst = get_orderedSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSet_CMetInst.init(nativeBuffer, this);
		orderedSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithArray_CMetInst(){
		return ((orderedSetWithArray_CMetInst != null)
	? (orderedSetWithArray_CMetInst)
	: (orderedSetWithArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithArray_CMetInst = get_orderedSetWithArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		orderedSetWithArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithArray_range_copyItems_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithArray_range_copyItems_CMetInst(){
		return ((orderedSetWithArray_range_copyItems_CMetInst != null)
	? (orderedSetWithArray_range_copyItems_CMetInst)
	: (orderedSetWithArray_range_copyItems_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithArray:range:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithArray_range_copyItems(final com.apple.jobjc.foundation.NSArray array, final com.apple.jobjc.foundation.NSRange range, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithArray_range_copyItems_CMetInst = get_orderedSetWithArray_range_copyItems_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithArray_range_copyItems_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		orderedSetWithArray_range_copyItems_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithObject_CMetInst(){
		return ((orderedSetWithObject_CMetInst != null)
	? (orderedSetWithObject_CMetInst)
	: (orderedSetWithObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithObject_CMetInst = get_orderedSetWithObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		orderedSetWithObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithObjects(final com.apple.jobjc.ID firstObj, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend orderedSetWithObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithObjects:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithObjects_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObj);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		orderedSetWithObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithObjects_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithObjects_count_CMetInst(){
		return ((orderedSetWithObjects_count_CMetInst != null)
	? (orderedSetWithObjects_count_CMetInst)
	: (orderedSetWithObjects_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithObjects:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithObjects_count_CMetInst = get_orderedSetWithObjects_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithObjects_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		orderedSetWithObjects_count_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithOrderedSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithOrderedSet_CMetInst(){
		return ((orderedSetWithOrderedSet_CMetInst != null)
	? (orderedSetWithOrderedSet_CMetInst)
	: (orderedSetWithOrderedSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithOrderedSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithOrderedSet(final com.apple.jobjc.foundation.NSOrderedSet set){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithOrderedSet_CMetInst = get_orderedSetWithOrderedSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithOrderedSet_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		orderedSetWithOrderedSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithOrderedSet_range_copyItems_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithOrderedSet_range_copyItems_CMetInst(){
		return ((orderedSetWithOrderedSet_range_copyItems_CMetInst != null)
	? (orderedSetWithOrderedSet_range_copyItems_CMetInst)
	: (orderedSetWithOrderedSet_range_copyItems_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithOrderedSet:range:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithOrderedSet_range_copyItems(final com.apple.jobjc.foundation.NSOrderedSet set, final com.apple.jobjc.foundation.NSRange range, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithOrderedSet_range_copyItems_CMetInst = get_orderedSetWithOrderedSet_range_copyItems_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithOrderedSet_range_copyItems_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		orderedSetWithOrderedSet_range_copyItems_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithSet_CMetInst(){
		return ((orderedSetWithSet_CMetInst != null)
	? (orderedSetWithSet_CMetInst)
	: (orderedSetWithSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithSet_CMetInst = get_orderedSetWithSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithSet_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		orderedSetWithSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithSet_copyItems_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithSet_copyItems_CMetInst(){
		return ((orderedSetWithSet_copyItems_CMetInst != null)
	? (orderedSetWithSet_copyItems_CMetInst)
	: (orderedSetWithSet_copyItems_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithSet:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithSet_copyItems(final com.apple.jobjc.foundation.NSSet set, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithSet_copyItems_CMetInst = get_orderedSetWithSet_copyItems_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithSet_copyItems_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		orderedSetWithSet_copyItems_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
