package com.apple.jobjc.foundation;

public  class NSIndexPathClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSIndexPathClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSIndexPathClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSIndexPathClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend indexPathWithIndex_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPathWithIndex_CMetInst(){
		return ((indexPathWithIndex_CMetInst != null)
	? (indexPathWithIndex_CMetInst)
	: (indexPathWithIndex_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPathWithIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T indexPathWithIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend indexPathWithIndex_CMetInst = get_indexPathWithIndex_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPathWithIndex_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		indexPathWithIndex_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPathWithIndexes_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPathWithIndexes_length_CMetInst(){
		return ((indexPathWithIndexes_length_CMetInst != null)
	? (indexPathWithIndexes_length_CMetInst)
	: (indexPathWithIndexes_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPathWithIndexes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T indexPathWithIndexes_length(final com.apple.jobjc.Pointer<java.lang.Long> indexes, final long length){
			final com.apple.jobjc.Invoke.MsgSend indexPathWithIndexes_length_CMetInst = get_indexPathWithIndexes_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPathWithIndexes_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		indexPathWithIndexes_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
