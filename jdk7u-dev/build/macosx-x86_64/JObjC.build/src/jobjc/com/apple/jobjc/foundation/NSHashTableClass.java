package com.apple.jobjc.foundation;

public  class NSHashTableClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSHashTableClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHashTableClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHashTableClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend hashTableWithOptions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hashTableWithOptions_CMetInst(){
		return ((hashTableWithOptions_CMetInst != null)
	? (hashTableWithOptions_CMetInst)
	: (hashTableWithOptions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hashTableWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T hashTableWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend hashTableWithOptions_CMetInst = get_hashTableWithOptions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hashTableWithOptions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		hashTableWithOptions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hashTableWithWeakObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hashTableWithWeakObjects_CMetInst(){
		return ((hashTableWithWeakObjects_CMetInst != null)
	? (hashTableWithWeakObjects_CMetInst)
	: (hashTableWithWeakObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hashTableWithWeakObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T hashTableWithWeakObjects(){
			final com.apple.jobjc.Invoke.MsgSend hashTableWithWeakObjects_CMetInst = get_hashTableWithWeakObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hashTableWithWeakObjects_CMetInst.init(nativeBuffer, this);
		hashTableWithWeakObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weakObjectsHashTable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weakObjectsHashTable_CMetInst(){
		return ((weakObjectsHashTable_CMetInst != null)
	? (weakObjectsHashTable_CMetInst)
	: (weakObjectsHashTable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weakObjectsHashTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T weakObjectsHashTable(){
			final com.apple.jobjc.Invoke.MsgSend weakObjectsHashTable_CMetInst = get_weakObjectsHashTable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weakObjectsHashTable_CMetInst.init(nativeBuffer, this);
		weakObjectsHashTable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
