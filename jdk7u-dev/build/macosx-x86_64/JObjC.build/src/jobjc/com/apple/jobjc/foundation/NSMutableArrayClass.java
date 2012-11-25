package com.apple.jobjc.foundation;

public  class NSMutableArrayClass extends com.apple.jobjc.foundation.NSArrayClass {
	public NSMutableArrayClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableArrayClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableArrayClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arrayWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithCapacity_CMetInst(){
		return ((arrayWithCapacity_CMetInst != null)
	? (arrayWithCapacity_CMetInst)
	: (arrayWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithCapacity(final long numItems){
			final com.apple.jobjc.Invoke.MsgSend arrayWithCapacity_CMetInst = get_arrayWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numItems);
		arrayWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
