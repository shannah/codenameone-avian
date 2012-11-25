package com.apple.jobjc.foundation;

public  class NSAffineTransformClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAffineTransformClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAffineTransformClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAffineTransformClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend transform_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_transform_CMetInst(){
		return ((transform_CMetInst != null)
	? (transform_CMetInst)
	: (transform_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "transform", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAffineTransform transform(){
			final com.apple.jobjc.Invoke.MsgSend transform_CMetInst = get_transform_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		transform_CMetInst.init(nativeBuffer, this);
		transform_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAffineTransform returnValue = (com.apple.jobjc.foundation.NSAffineTransform) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
