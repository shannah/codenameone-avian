package com.apple.jobjc.foundation;

public  class NSDataDetector extends com.apple.jobjc.foundation.NSRegularExpression {
	public NSDataDetector(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDataDetector(final NSDataDetector obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend checkingTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkingTypes_IMetInst(){
		return ((checkingTypes_IMetInst != null)
	? (checkingTypes_IMetInst)
	: (checkingTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkingTypes", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long checkingTypes(){
			final com.apple.jobjc.Invoke.MsgSend checkingTypes_IMetInst = get_checkingTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkingTypes_IMetInst.init(nativeBuffer, this);
		checkingTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTypes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTypes_error_IMetInst(){
		return ((initWithTypes_error_IMetInst != null)
	? (initWithTypes_error_IMetInst)
	: (initWithTypes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTypes:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTypes_error(final long checkingTypes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithTypes_error_IMetInst = get_initWithTypes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTypes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, checkingTypes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithTypes_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
