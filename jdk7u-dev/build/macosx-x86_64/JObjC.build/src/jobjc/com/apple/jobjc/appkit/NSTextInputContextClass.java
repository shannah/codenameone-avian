package com.apple.jobjc.appkit;

public  class NSTextInputContextClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTextInputContextClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTextInputContextClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTextInputContextClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend currentInputContext_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentInputContext_CMetInst(){
		return ((currentInputContext_CMetInst != null)
	? (currentInputContext_CMetInst)
	: (currentInputContext_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentInputContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextInputContext currentInputContext(){
			final com.apple.jobjc.Invoke.MsgSend currentInputContext_CMetInst = get_currentInputContext_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentInputContext_CMetInst.init(nativeBuffer, this);
		currentInputContext_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextInputContext returnValue = (com.apple.jobjc.appkit.NSTextInputContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedNameForInputSource_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedNameForInputSource_CMetInst(){
		return ((localizedNameForInputSource_CMetInst != null)
	? (localizedNameForInputSource_CMetInst)
	: (localizedNameForInputSource_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedNameForInputSource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedNameForInputSource(final com.apple.jobjc.foundation.NSString inputSourceIdentifier){
			final com.apple.jobjc.Invoke.MsgSend localizedNameForInputSource_CMetInst = get_localizedNameForInputSource_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedNameForInputSource_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inputSourceIdentifier);
		localizedNameForInputSource_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
