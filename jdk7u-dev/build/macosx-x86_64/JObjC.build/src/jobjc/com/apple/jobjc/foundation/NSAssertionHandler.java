package com.apple.jobjc.foundation;

public  class NSAssertionHandler extends com.apple.jobjc.foundation.NSObject {
	public NSAssertionHandler(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAssertionHandler(final NSAssertionHandler obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	 public void handleFailureInFunction_file_lineNumber_description(final com.apple.jobjc.foundation.NSString functionName, final com.apple.jobjc.foundation.NSString fileName, final long line, final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[4 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 4; i < (4 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 4]);
final com.apple.jobjc.Invoke.MsgSend handleFailureInFunction_file_lineNumber_description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleFailureInFunction:file:lineNumber:description:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleFailureInFunction_file_lineNumber_description_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, functionName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, line);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 4; i < (4 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 4]);
		handleFailureInFunction_file_lineNumber_description_IMetInst.invoke(nativeBuffer);
		
		
	}

	 public void handleFailureInMethod_object_file_lineNumber_description(final com.apple.jobjc.SEL selector, final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSString fileName, final long line, final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.SELCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.SELCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.SELCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.SELCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.SELCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.MsgSend handleFailureInMethod_object_file_lineNumber_description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleFailureInMethod:object:file:lineNumber:description:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleFailureInMethod_object_file_lineNumber_description_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, line);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		handleFailureInMethod_object_file_lineNumber_description_IMetInst.invoke(nativeBuffer);
		
		
	}

}
