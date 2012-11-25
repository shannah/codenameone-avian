package com.apple.jobjc.foundation;

public  class NSIndexPath extends com.apple.jobjc.foundation.NSObject {
	public NSIndexPath(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSIndexPath(final NSIndexPath obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend compare_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compare_IMetInst(){
		return ((compare_IMetInst != null)
	? (compare_IMetInst)
	: (compare_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compare:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compare(final com.apple.jobjc.foundation.NSIndexPath otherObject){
			final com.apple.jobjc.Invoke.MsgSend compare_IMetInst = get_compare_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compare_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherObject);
		compare_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getIndexes_IMetInst(){
		return ((getIndexes_IMetInst != null)
	? (getIndexes_IMetInst)
	: (getIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getIndexes(final com.apple.jobjc.Pointer<java.lang.Long> indexes){
			final com.apple.jobjc.Invoke.MsgSend getIndexes_IMetInst = get_getIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, indexes);
		getIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend indexAtPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexAtPosition_IMetInst(){
		return ((indexAtPosition_IMetInst != null)
	? (indexAtPosition_IMetInst)
	: (indexAtPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexAtPosition:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long indexAtPosition(final long position){
			final com.apple.jobjc.Invoke.MsgSend indexAtPosition_IMetInst = get_indexAtPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexAtPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, position);
		indexAtPosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPathByAddingIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPathByAddingIndex_IMetInst(){
		return ((indexPathByAddingIndex_IMetInst != null)
	? (indexPathByAddingIndex_IMetInst)
	: (indexPathByAddingIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPathByAddingIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath indexPathByAddingIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend indexPathByAddingIndex_IMetInst = get_indexPathByAddingIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPathByAddingIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		indexPathByAddingIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPathByRemovingLastIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPathByRemovingLastIndex_IMetInst(){
		return ((indexPathByRemovingLastIndex_IMetInst != null)
	? (indexPathByRemovingLastIndex_IMetInst)
	: (indexPathByRemovingLastIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPathByRemovingLastIndex", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath indexPathByRemovingLastIndex(){
			final com.apple.jobjc.Invoke.MsgSend indexPathByRemovingLastIndex_IMetInst = get_indexPathByRemovingLastIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPathByRemovingLastIndex_IMetInst.init(nativeBuffer, this);
		indexPathByRemovingLastIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIndex_IMetInst(){
		return ((initWithIndex_IMetInst != null)
	? (initWithIndex_IMetInst)
	: (initWithIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend initWithIndex_IMetInst = get_initWithIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		initWithIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIndexes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIndexes_length_IMetInst(){
		return ((initWithIndexes_length_IMetInst != null)
	? (initWithIndexes_length_IMetInst)
	: (initWithIndexes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIndexes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIndexes_length(final com.apple.jobjc.Pointer<java.lang.Long> indexes, final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithIndexes_length_IMetInst = get_initWithIndexes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIndexes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithIndexes_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_length_IMetInst(){
		return ((length_IMetInst != null)
	? (length_IMetInst)
	: (length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "length", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long length(){
			final com.apple.jobjc.Invoke.MsgSend length_IMetInst = get_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		length_IMetInst.init(nativeBuffer, this);
		length_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
