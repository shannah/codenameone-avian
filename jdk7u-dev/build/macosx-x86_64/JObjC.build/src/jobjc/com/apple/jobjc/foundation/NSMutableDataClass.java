package com.apple.jobjc.foundation;

public  class NSMutableDataClass extends com.apple.jobjc.foundation.NSDataClass {
	public NSMutableDataClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMutableDataClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMutableDataClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dataWithCapacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithCapacity_CMetInst(){
		return ((dataWithCapacity_CMetInst != null)
	? (dataWithCapacity_CMetInst)
	: (dataWithCapacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithCapacity(final long aNumItems){
			final com.apple.jobjc.Invoke.MsgSend dataWithCapacity_CMetInst = get_dataWithCapacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithCapacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aNumItems);
		dataWithCapacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithLength_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithLength_CMetInst(){
		return ((dataWithLength_CMetInst != null)
	? (dataWithLength_CMetInst)
	: (dataWithLength_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithLength:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithLength(final long length){
			final com.apple.jobjc.Invoke.MsgSend dataWithLength_CMetInst = get_dataWithLength_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithLength_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		dataWithLength_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
