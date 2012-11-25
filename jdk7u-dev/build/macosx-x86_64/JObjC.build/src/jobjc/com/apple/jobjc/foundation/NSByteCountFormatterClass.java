package com.apple.jobjc.foundation;

public  class NSByteCountFormatterClass extends com.apple.jobjc.foundation.NSFormatterClass {
	public NSByteCountFormatterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSByteCountFormatterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSByteCountFormatterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend stringFromByteCount_countStyle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringFromByteCount_countStyle_CMetInst(){
		return ((stringFromByteCount_countStyle_CMetInst != null)
	? (stringFromByteCount_countStyle_CMetInst)
	: (stringFromByteCount_countStyle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringFromByteCount:countStyle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString stringFromByteCount_countStyle(final long byteCount, final long countStyle){
			final com.apple.jobjc.Invoke.MsgSend stringFromByteCount_countStyle_CMetInst = get_stringFromByteCount_countStyle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringFromByteCount_countStyle_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, byteCount);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, countStyle);
		stringFromByteCount_countStyle_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
