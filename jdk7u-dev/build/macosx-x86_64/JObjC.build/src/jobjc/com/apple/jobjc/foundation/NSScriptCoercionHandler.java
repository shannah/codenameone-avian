package com.apple.jobjc.foundation;

public  class NSScriptCoercionHandler extends com.apple.jobjc.foundation.NSObject {
	public NSScriptCoercionHandler(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptCoercionHandler(final NSScriptCoercionHandler obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend coerceValue_toClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coerceValue_toClass_IMetInst(){
		return ((coerceValue_toClass_IMetInst != null)
	? (coerceValue_toClass_IMetInst)
	: (coerceValue_toClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coerceValue:toClass:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T coerceValue_toClass(final com.apple.jobjc.ID value, final com.apple.jobjc.NSClass toClass){
			final com.apple.jobjc.Invoke.MsgSend coerceValue_toClass_IMetInst = get_coerceValue_toClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coerceValue_toClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, toClass);
		coerceValue_toClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerCoercer_selector_toConvertFromClass_toClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerCoercer_selector_toConvertFromClass_toClass_IMetInst(){
		return ((registerCoercer_selector_toConvertFromClass_toClass_IMetInst != null)
	? (registerCoercer_selector_toConvertFromClass_toClass_IMetInst)
	: (registerCoercer_selector_toConvertFromClass_toClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerCoercer:selector:toConvertFromClass:toClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void registerCoercer_selector_toConvertFromClass_toClass(final com.apple.jobjc.ID coercer, final com.apple.jobjc.SEL selector, final com.apple.jobjc.NSClass fromClass, final com.apple.jobjc.NSClass toClass){
			final com.apple.jobjc.Invoke.MsgSend registerCoercer_selector_toConvertFromClass_toClass_IMetInst = get_registerCoercer_selector_toConvertFromClass_toClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerCoercer_selector_toConvertFromClass_toClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coercer);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, fromClass);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, toClass);
		registerCoercer_selector_toConvertFromClass_toClass_IMetInst.invoke(nativeBuffer);
		
		
	}

}
