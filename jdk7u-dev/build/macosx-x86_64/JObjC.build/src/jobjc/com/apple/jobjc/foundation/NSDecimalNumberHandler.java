package com.apple.jobjc.foundation;

public  class NSDecimalNumberHandler extends com.apple.jobjc.foundation.NSObject {
	public NSDecimalNumberHandler(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDecimalNumberHandler(final NSDecimalNumberHandler obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst(){
		return ((initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst != null)
	? (initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst)
	: (initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(final long roundingMode, final short scale, final boolean exact, final boolean overflow, final boolean underflow, final boolean divideByZero){
			final com.apple.jobjc.Invoke.MsgSend initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst = get_initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, scale);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, exact);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, overflow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, underflow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, divideByZero);
		initWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
