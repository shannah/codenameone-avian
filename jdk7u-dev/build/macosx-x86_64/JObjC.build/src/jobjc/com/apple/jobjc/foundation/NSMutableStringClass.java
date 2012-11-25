package com.apple.jobjc.foundation;

public  class NSMutableStringClass extends com.apple.jobjc.foundation.NSStringClass {
	public NSMutableStringClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableStringClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableStringClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend stringWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithCapacity_CMetInst(){
		return ((stringWithCapacity_CMetInst != null)
	? (stringWithCapacity_CMetInst)
	: (stringWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithCapacity(final long capacity){
			final com.apple.jobjc.Invoke.MsgSend stringWithCapacity_CMetInst = get_stringWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		stringWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
