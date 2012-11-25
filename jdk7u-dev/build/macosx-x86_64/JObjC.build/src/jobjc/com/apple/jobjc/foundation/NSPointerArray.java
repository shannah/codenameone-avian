package com.apple.jobjc.foundation;

public  class NSPointerArray extends com.apple.jobjc.foundation.NSObject {
	public NSPointerArray(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPointerArray(final NSPointerArray obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addPointer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addPointer_IMetInst(){
		return ((addPointer_IMetInst != null)
	? (addPointer_IMetInst)
	: (addPointer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addPointer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void addPointer(final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.MsgSend addPointer_IMetInst = get_addPointer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addPointer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		addPointer_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend compact_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compact_IMetInst(){
		return ((compact_IMetInst != null)
	? (compact_IMetInst)
	: (compact_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compact", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void compact(){
			final com.apple.jobjc.Invoke.MsgSend compact_IMetInst = get_compact_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compact_IMetInst.init(nativeBuffer, this);
		compact_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend initWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithOptions_IMetInst(){
		return ((initWithOptions_IMetInst != null)
	? (initWithOptions_IMetInst)
	: (initWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithOptions_IMetInst = get_initWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPointerFunctions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPointerFunctions_IMetInst(){
		return ((initWithPointerFunctions_IMetInst != null)
	? (initWithPointerFunctions_IMetInst)
	: (initWithPointerFunctions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPointerFunctions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPointerFunctions(final com.apple.jobjc.foundation.NSPointerFunctions functions){
			final com.apple.jobjc.Invoke.MsgSend initWithPointerFunctions_IMetInst = get_initWithPointerFunctions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPointerFunctions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, functions);
		initWithPointerFunctions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertPointer_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertPointer_atIndex_IMetInst(){
		return ((insertPointer_atIndex_IMetInst != null)
	? (insertPointer_atIndex_IMetInst)
	: (insertPointer_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertPointer:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertPointer_atIndex(final com.apple.jobjc.Pointer<Void> item, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertPointer_atIndex_IMetInst = get_insertPointer_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertPointer_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		insertPointer_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pointerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerAtIndex_IMetInst(){
		return ((pointerAtIndex_IMetInst != null)
	? (pointerAtIndex_IMetInst)
	: (pointerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerAtIndex:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<Void> pointerAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend pointerAtIndex_IMetInst = get_pointerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		pointerAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend removePointerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removePointerAtIndex_IMetInst(){
		return ((removePointerAtIndex_IMetInst != null)
	? (removePointerAtIndex_IMetInst)
	: (removePointerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removePointerAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removePointerAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removePointerAtIndex_IMetInst = get_removePointerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removePointerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		removePointerAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replacePointerAtIndex_withPointer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacePointerAtIndex_withPointer_IMetInst(){
		return ((replacePointerAtIndex_withPointer_IMetInst != null)
	? (replacePointerAtIndex_withPointer_IMetInst)
	: (replacePointerAtIndex_withPointer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacePointerAtIndex:withPointer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void replacePointerAtIndex_withPointer(final long index, final com.apple.jobjc.Pointer<Void> item){
			final com.apple.jobjc.Invoke.MsgSend replacePointerAtIndex_withPointer_IMetInst = get_replacePointerAtIndex_withPointer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacePointerAtIndex_withPointer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, item);
		replacePointerAtIndex_withPointer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCount_IMetInst(){
		return ((setCount_IMetInst != null)
	? (setCount_IMetInst)
	: (setCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCount(final long count){
			final com.apple.jobjc.Invoke.MsgSend setCount_IMetInst = get_setCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, count);
		setCount_IMetInst.invoke(nativeBuffer);
		
		
	}

}
