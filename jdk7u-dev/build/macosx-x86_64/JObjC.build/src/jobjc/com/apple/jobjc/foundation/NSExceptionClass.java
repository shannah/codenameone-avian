package com.apple.jobjc.foundation;

public  class NSExceptionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSExceptionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSExceptionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSExceptionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend exceptionWithName_reason_userInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exceptionWithName_reason_userInfo_CMetInst(){
		return ((exceptionWithName_reason_userInfo_CMetInst != null)
	? (exceptionWithName_reason_userInfo_CMetInst)
	: (exceptionWithName_reason_userInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exceptionWithName:reason:userInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSException exceptionWithName_reason_userInfo(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString reason, final com.apple.jobjc.foundation.NSDictionary userInfo){
			final com.apple.jobjc.Invoke.MsgSend exceptionWithName_reason_userInfo_CMetInst = get_exceptionWithName_reason_userInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exceptionWithName_reason_userInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, reason);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, userInfo);
		exceptionWithName_reason_userInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSException returnValue = (com.apple.jobjc.foundation.NSException) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public void raise_format(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[2 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 2; i < (2 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 2]);
final com.apple.jobjc.Invoke.MsgSend raise_format_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "raise:format:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		raise_format_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 2; i < (2 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 2]);
		raise_format_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend raise_format_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_raise_format_arguments_CMetInst(){
		return ((raise_format_arguments_CMetInst != null)
	? (raise_format_arguments_CMetInst)
	: (raise_format_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "raise:format:arguments:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void raise_format_arguments(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString format, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ argList){
			final com.apple.jobjc.Invoke.MsgSend raise_format_arguments_CMetInst = get_raise_format_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		raise_format_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, argList);
		raise_format_arguments_CMetInst.invoke(nativeBuffer);
		
		
	}

}
