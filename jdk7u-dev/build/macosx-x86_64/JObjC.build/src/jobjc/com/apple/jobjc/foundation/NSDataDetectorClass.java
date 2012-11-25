package com.apple.jobjc.foundation;

public  class NSDataDetectorClass extends com.apple.jobjc.foundation.NSRegularExpressionClass {
	public NSDataDetectorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDataDetectorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDataDetectorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dataDetectorWithTypes_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataDetectorWithTypes_error_CMetInst(){
		return ((dataDetectorWithTypes_error_CMetInst != null)
	? (dataDetectorWithTypes_error_CMetInst)
	: (dataDetectorWithTypes_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataDetectorWithTypes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDataDetector dataDetectorWithTypes_error(final long checkingTypes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend dataDetectorWithTypes_error_CMetInst = get_dataDetectorWithTypes_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataDetectorWithTypes_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		dataDetectorWithTypes_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDataDetector returnValue = (com.apple.jobjc.foundation.NSDataDetector) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
