package com.apple.jobjc.foundation;

public  class NSSpellServer extends com.apple.jobjc.foundation.NSObject {
	public NSSpellServer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSpellServer(final NSSpellServer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isWordInUserDictionaries_caseSensitive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isWordInUserDictionaries_caseSensitive_IMetInst(){
		return ((isWordInUserDictionaries_caseSensitive_IMetInst != null)
	? (isWordInUserDictionaries_caseSensitive_IMetInst)
	: (isWordInUserDictionaries_caseSensitive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isWordInUserDictionaries:caseSensitive:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isWordInUserDictionaries_caseSensitive(final com.apple.jobjc.foundation.NSString word, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend isWordInUserDictionaries_caseSensitive_IMetInst = get_isWordInUserDictionaries_caseSensitive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isWordInUserDictionaries_caseSensitive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, word);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		isWordInUserDictionaries_caseSensitive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerLanguage_byVendor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerLanguage_byVendor_IMetInst(){
		return ((registerLanguage_byVendor_IMetInst != null)
	? (registerLanguage_byVendor_IMetInst)
	: (registerLanguage_byVendor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerLanguage:byVendor:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean registerLanguage_byVendor(final com.apple.jobjc.foundation.NSString language, final com.apple.jobjc.foundation.NSString vendor){
			final com.apple.jobjc.Invoke.MsgSend registerLanguage_byVendor_IMetInst = get_registerLanguage_byVendor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerLanguage_byVendor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, vendor);
		registerLanguage_byVendor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend run_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_run_IMetInst(){
		return ((run_IMetInst != null)
	? (run_IMetInst)
	: (run_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "run", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void run(){
			final com.apple.jobjc.Invoke.MsgSend run_IMetInst = get_run_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		run_IMetInst.init(nativeBuffer, this);
		run_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

}
