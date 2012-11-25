package com.apple.jobjc.foundation;

public  class NSRegularExpressionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSRegularExpressionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSRegularExpressionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSRegularExpressionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend escapedPatternForString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_escapedPatternForString_CMetInst(){
		return ((escapedPatternForString_CMetInst != null)
	? (escapedPatternForString_CMetInst)
	: (escapedPatternForString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "escapedPatternForString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString escapedPatternForString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend escapedPatternForString_CMetInst = get_escapedPatternForString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		escapedPatternForString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		escapedPatternForString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend escapedTemplateForString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_escapedTemplateForString_CMetInst(){
		return ((escapedTemplateForString_CMetInst != null)
	? (escapedTemplateForString_CMetInst)
	: (escapedTemplateForString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "escapedTemplateForString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString escapedTemplateForString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend escapedTemplateForString_CMetInst = get_escapedTemplateForString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		escapedTemplateForString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		escapedTemplateForString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend regularExpressionWithPattern_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_regularExpressionWithPattern_options_error_CMetInst(){
		return ((regularExpressionWithPattern_options_error_CMetInst != null)
	? (regularExpressionWithPattern_options_error_CMetInst)
	: (regularExpressionWithPattern_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "regularExpressionWithPattern:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRegularExpression regularExpressionWithPattern_options_error(final com.apple.jobjc.foundation.NSString pattern, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend regularExpressionWithPattern_options_error_CMetInst = get_regularExpressionWithPattern_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		regularExpressionWithPattern_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pattern);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		regularExpressionWithPattern_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSRegularExpression returnValue = (com.apple.jobjc.foundation.NSRegularExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
