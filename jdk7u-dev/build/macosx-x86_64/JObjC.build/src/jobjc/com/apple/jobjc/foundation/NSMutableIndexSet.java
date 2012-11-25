package com.apple.jobjc.foundation;

public  class NSMutableIndexSet extends com.apple.jobjc.foundation.NSIndexSet {
	public NSMutableIndexSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableIndexSet(final NSMutableIndexSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addIndex_IMetInst(){
		return ((addIndex_IMetInst != null)
	? (addIndex_IMetInst)
	: (addIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void addIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend addIndex_IMetInst = get_addIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		addIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addIndexes_IMetInst(){
		return ((addIndexes_IMetInst != null)
	? (addIndexes_IMetInst)
	: (addIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addIndexes(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend addIndexes_IMetInst = get_addIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		addIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addIndexesInRange_IMetInst(){
		return ((addIndexesInRange_IMetInst != null)
	? (addIndexesInRange_IMetInst)
	: (addIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addIndexesInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend addIndexesInRange_IMetInst = get_addIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		addIndexesInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllIndexes_IMetInst(){
		return ((removeAllIndexes_IMetInst != null)
	? (removeAllIndexes_IMetInst)
	: (removeAllIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllIndexes", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllIndexes(){
			final com.apple.jobjc.Invoke.MsgSend removeAllIndexes_IMetInst = get_removeAllIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllIndexes_IMetInst.init(nativeBuffer, this);
		removeAllIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeIndex_IMetInst(){
		return ((removeIndex_IMetInst != null)
	? (removeIndex_IMetInst)
	: (removeIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend removeIndex_IMetInst = get_removeIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		removeIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeIndexes_IMetInst(){
		return ((removeIndexes_IMetInst != null)
	? (removeIndexes_IMetInst)
	: (removeIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeIndexes(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend removeIndexes_IMetInst = get_removeIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		removeIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeIndexesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeIndexesInRange_IMetInst(){
		return ((removeIndexesInRange_IMetInst != null)
	? (removeIndexesInRange_IMetInst)
	: (removeIndexesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeIndexesInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend removeIndexesInRange_IMetInst = get_removeIndexesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeIndexesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		removeIndexesInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shiftIndexesStartingAtIndex_by_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shiftIndexesStartingAtIndex_by_IMetInst(){
		return ((shiftIndexesStartingAtIndex_by_IMetInst != null)
	? (shiftIndexesStartingAtIndex_by_IMetInst)
	: (shiftIndexesStartingAtIndex_by_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shiftIndexesStartingAtIndex:by:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void shiftIndexesStartingAtIndex_by(final long index, final long delta){
			final com.apple.jobjc.Invoke.MsgSend shiftIndexesStartingAtIndex_by_IMetInst = get_shiftIndexesStartingAtIndex_by_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shiftIndexesStartingAtIndex_by_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, delta);
		shiftIndexesStartingAtIndex_by_IMetInst.invoke(nativeBuffer);
		
		
	}

}
