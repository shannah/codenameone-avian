package com.apple.jobjc.foundation;

public  class NSScriptCommandClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScriptCommandClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptCommandClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptCommandClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentCommand_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentCommand_CMetInst(){
		return ((currentCommand_CMetInst != null)
	? (currentCommand_CMetInst)
	: (currentCommand_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentCommand", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptCommand currentCommand(){
			final com.apple.jobjc.Invoke.MsgSend currentCommand_CMetInst = get_currentCommand_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentCommand_CMetInst.init(nativeBuffer, this);
		currentCommand_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptCommand returnValue = (com.apple.jobjc.foundation.NSScriptCommand) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
