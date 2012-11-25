package com.apple.jobjc.foundation;

public  class NSNullClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSNullClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSNullClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSNullClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend nullNSNull_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nullNSNull_CMetInst(){
		return ((nullNSNull_CMetInst != null)
	? (nullNSNull_CMetInst)
	: (nullNSNull_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "null", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNull nullNSNull(){
			final com.apple.jobjc.Invoke.MsgSend nullNSNull_CMetInst = get_nullNSNull_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nullNSNull_CMetInst.init(nativeBuffer, this);
		nullNSNull_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNull returnValue = (com.apple.jobjc.foundation.NSNull) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
