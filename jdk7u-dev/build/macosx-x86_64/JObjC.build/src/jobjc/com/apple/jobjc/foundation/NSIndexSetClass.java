package com.apple.jobjc.foundation;

public  class NSIndexSetClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSIndexSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSIndexSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSIndexSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend indexSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexSet_CMetInst(){
		return ((indexSet_CMetInst != null)
	? (indexSet_CMetInst)
	: (indexSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexSet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T indexSet(){
			final com.apple.jobjc.Invoke.MsgSend indexSet_CMetInst = get_indexSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexSet_CMetInst.init(nativeBuffer, this);
		indexSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexSetWithIndex_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexSetWithIndex_CMetInst(){
		return ((indexSetWithIndex_CMetInst != null)
	? (indexSetWithIndex_CMetInst)
	: (indexSetWithIndex_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexSetWithIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T indexSetWithIndex(final long value){
			final com.apple.jobjc.Invoke.MsgSend indexSetWithIndex_CMetInst = get_indexSetWithIndex_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexSetWithIndex_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, value);
		indexSetWithIndex_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexSetWithIndexesInRange_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexSetWithIndexesInRange_CMetInst(){
		return ((indexSetWithIndexesInRange_CMetInst != null)
	? (indexSetWithIndexesInRange_CMetInst)
	: (indexSetWithIndexesInRange_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexSetWithIndexesInRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T indexSetWithIndexesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend indexSetWithIndexesInRange_CMetInst = get_indexSetWithIndexesInRange_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexSetWithIndexesInRange_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		indexSetWithIndexesInRange_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
