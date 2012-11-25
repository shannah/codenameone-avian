package com.apple.jobjc.foundation;

public  class NSMutableDictionaryClass extends com.apple.jobjc.foundation.NSDictionaryClass {
	public NSMutableDictionaryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableDictionaryClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableDictionaryClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithCapacity_CMetInst(){
		return ((dictionaryWithCapacity_CMetInst != null)
	? (dictionaryWithCapacity_CMetInst)
	: (dictionaryWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithCapacity(final long numItems){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithCapacity_CMetInst = get_dictionaryWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numItems);
		dictionaryWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithSharedKeySet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithSharedKeySet_CMetInst(){
		return ((dictionaryWithSharedKeySet_CMetInst != null)
	? (dictionaryWithSharedKeySet_CMetInst)
	: (dictionaryWithSharedKeySet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithSharedKeySet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithSharedKeySet(final com.apple.jobjc.ID keyset){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithSharedKeySet_CMetInst = get_dictionaryWithSharedKeySet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithSharedKeySet_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyset);
		dictionaryWithSharedKeySet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
