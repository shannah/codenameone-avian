package com.apple.jobjc.foundation;

public  class NSMutableOrderedSetClass extends com.apple.jobjc.foundation.NSOrderedSetClass {
	public NSMutableOrderedSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableOrderedSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableOrderedSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend orderedSetWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedSetWithCapacity_CMetInst(){
		return ((orderedSetWithCapacity_CMetInst != null)
	? (orderedSetWithCapacity_CMetInst)
	: (orderedSetWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedSetWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T orderedSetWithCapacity(final long numItems){
			final com.apple.jobjc.Invoke.MsgSend orderedSetWithCapacity_CMetInst = get_orderedSetWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedSetWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numItems);
		orderedSetWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
