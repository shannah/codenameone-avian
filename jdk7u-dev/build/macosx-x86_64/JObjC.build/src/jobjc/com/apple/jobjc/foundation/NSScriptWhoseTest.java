package com.apple.jobjc.foundation;

public  class NSScriptWhoseTest extends com.apple.jobjc.foundation.NSObject {
	public NSScriptWhoseTest(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptWhoseTest(final NSScriptWhoseTest obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend isTrue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTrue_IMetInst(){
		return ((isTrue_IMetInst != null)
	? (isTrue_IMetInst)
	: (isTrue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTrue", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTrue(){
			final com.apple.jobjc.Invoke.MsgSend isTrue_IMetInst = get_isTrue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTrue_IMetInst.init(nativeBuffer, this);
		isTrue_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
