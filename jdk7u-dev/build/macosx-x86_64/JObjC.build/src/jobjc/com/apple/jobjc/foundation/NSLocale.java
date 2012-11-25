package com.apple.jobjc.foundation;

public  class NSLocale extends com.apple.jobjc.foundation.NSObject {
	public NSLocale(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLocale(final NSLocale obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend displayNameForKey_value_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayNameForKey_value_IMetInst(){
		return ((displayNameForKey_value_IMetInst != null)
	? (displayNameForKey_value_IMetInst)
	: (displayNameForKey_value_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayNameForKey:value:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayNameForKey_value(final com.apple.jobjc.ID key, final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend displayNameForKey_value_IMetInst = get_displayNameForKey_value_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayNameForKey_value_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		displayNameForKey_value_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLocaleIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLocaleIdentifier_IMetInst(){
		return ((initWithLocaleIdentifier_IMetInst != null)
	? (initWithLocaleIdentifier_IMetInst)
	: (initWithLocaleIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLocaleIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLocaleIdentifier(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend initWithLocaleIdentifier_IMetInst = get_initWithLocaleIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLocaleIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		initWithLocaleIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localeIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localeIdentifier_IMetInst(){
		return ((localeIdentifier_IMetInst != null)
	? (localeIdentifier_IMetInst)
	: (localeIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localeIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localeIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend localeIdentifier_IMetInst = get_localeIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localeIdentifier_IMetInst.init(nativeBuffer, this);
		localeIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
