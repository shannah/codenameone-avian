package com.apple.jobjc.foundation;

public  class NSDecimalNumberHandlerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDecimalNumberHandlerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDecimalNumberHandlerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDecimalNumberHandlerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst(){
		return ((decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst != null)
	? (decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst)
	: (decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.SShortCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero(final long roundingMode, final short scale, final boolean exact, final boolean overflow, final boolean underflow, final boolean divideByZero){
			final com.apple.jobjc.Invoke.MsgSend decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst = get_decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, roundingMode);
		com.apple.jobjc.PrimitiveCoder.SShortCoder.INST.push(nativeBuffer, scale);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, exact);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, overflow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, underflow);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, divideByZero);
		decimalNumberHandlerWithRoundingMode_scale_raiseOnExactness_raiseOnOverflow_raiseOnUnderflow_raiseOnDivideByZero_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultDecimalNumberHandler_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultDecimalNumberHandler_CMetInst(){
		return ((defaultDecimalNumberHandler_CMetInst != null)
	? (defaultDecimalNumberHandler_CMetInst)
	: (defaultDecimalNumberHandler_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultDecimalNumberHandler", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T defaultDecimalNumberHandler(){
			final com.apple.jobjc.Invoke.MsgSend defaultDecimalNumberHandler_CMetInst = get_defaultDecimalNumberHandler_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultDecimalNumberHandler_CMetInst.init(nativeBuffer, this);
		defaultDecimalNumberHandler_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
