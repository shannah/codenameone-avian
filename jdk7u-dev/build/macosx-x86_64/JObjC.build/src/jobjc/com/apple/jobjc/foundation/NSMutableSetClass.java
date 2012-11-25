package com.apple.jobjc.foundation;

public  class NSMutableSetClass extends com.apple.jobjc.foundation.NSSetClass {
	public NSMutableSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend setWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWithCapacity_CMetInst(){
		return ((setWithCapacity_CMetInst != null)
	? (setWithCapacity_CMetInst)
	: (setWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T setWithCapacity(final long numItems){
			final com.apple.jobjc.Invoke.MsgSend setWithCapacity_CMetInst = get_setWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numItems);
		setWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
