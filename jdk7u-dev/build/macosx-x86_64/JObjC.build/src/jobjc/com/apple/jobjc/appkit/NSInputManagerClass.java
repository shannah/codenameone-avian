package com.apple.jobjc.appkit;

public  class NSInputManagerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSInputManagerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSInputManagerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSInputManagerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentInputManager_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentInputManager_CMetInst(){
		return ((currentInputManager_CMetInst != null)
	? (currentInputManager_CMetInst)
	: (currentInputManager_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentInputManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSInputManager currentInputManager(){
			final com.apple.jobjc.Invoke.MsgSend currentInputManager_CMetInst = get_currentInputManager_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentInputManager_CMetInst.init(nativeBuffer, this);
		currentInputManager_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSInputManager returnValue = (com.apple.jobjc.appkit.NSInputManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cycleToNextInputLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cycleToNextInputLanguage_CMetInst(){
		return ((cycleToNextInputLanguage_CMetInst != null)
	? (cycleToNextInputLanguage_CMetInst)
	: (cycleToNextInputLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cycleToNextInputLanguage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cycleToNextInputLanguage(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend cycleToNextInputLanguage_CMetInst = get_cycleToNextInputLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cycleToNextInputLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		cycleToNextInputLanguage_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cycleToNextInputServerInLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cycleToNextInputServerInLanguage_CMetInst(){
		return ((cycleToNextInputServerInLanguage_CMetInst != null)
	? (cycleToNextInputServerInLanguage_CMetInst)
	: (cycleToNextInputServerInLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cycleToNextInputServerInLanguage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cycleToNextInputServerInLanguage(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend cycleToNextInputServerInLanguage_CMetInst = get_cycleToNextInputServerInLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cycleToNextInputServerInLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		cycleToNextInputServerInLanguage_CMetInst.invoke(nativeBuffer);
		
		
	}

}
