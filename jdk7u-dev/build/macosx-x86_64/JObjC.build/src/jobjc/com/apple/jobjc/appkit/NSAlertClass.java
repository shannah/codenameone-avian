package com.apple.jobjc.appkit;

public  class NSAlertClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSAlertClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSAlertClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSAlertClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alertWithError_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alertWithError_CMetInst(){
		return ((alertWithError_CMetInst != null)
	? (alertWithError_CMetInst)
	: (alertWithError_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alertWithError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSAlert alertWithError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend alertWithError_CMetInst = get_alertWithError_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alertWithError_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		alertWithError_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSAlert returnValue = (com.apple.jobjc.appkit.NSAlert) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public com.apple.jobjc.appkit.NSAlert alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat(final com.apple.jobjc.foundation.NSString message, final com.apple.jobjc.foundation.NSString defaultButton, final com.apple.jobjc.foundation.NSString alternateButton, final com.apple.jobjc.foundation.NSString otherButton, final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[5 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[1] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[2] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[3] = com.apple.jobjc.Coder.IDCoder.INST;
argCoders[4] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 5; i < (5 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 5]);
final com.apple.jobjc.Invoke.MsgSend alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alertWithMessageText:defaultButton:alternateButton:otherButton:informativeTextWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, message);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, alternateButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherButton);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 5; i < (5 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 5]);
		alertWithMessageText_defaultButton_alternateButton_otherButton_informativeTextWithFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSAlert returnValue = (com.apple.jobjc.appkit.NSAlert) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
