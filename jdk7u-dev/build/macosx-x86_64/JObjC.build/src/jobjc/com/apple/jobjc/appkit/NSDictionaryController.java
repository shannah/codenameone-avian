package com.apple.jobjc.appkit;

public  class NSDictionaryController extends com.apple.jobjc.appkit.NSArrayController {
	public NSDictionaryController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDictionaryController(final NSDictionaryController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend excludedKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_excludedKeys_IMetInst(){
		return ((excludedKeys_IMetInst != null)
	? (excludedKeys_IMetInst)
	: (excludedKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "excludedKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray excludedKeys(){
			final com.apple.jobjc.Invoke.MsgSend excludedKeys_IMetInst = get_excludedKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		excludedKeys_IMetInst.init(nativeBuffer, this);
		excludedKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend includedKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_includedKeys_IMetInst(){
		return ((includedKeys_IMetInst != null)
	? (includedKeys_IMetInst)
	: (includedKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "includedKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray includedKeys(){
			final com.apple.jobjc.Invoke.MsgSend includedKeys_IMetInst = get_includedKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		includedKeys_IMetInst.init(nativeBuffer, this);
		includedKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialKey_IMetInst(){
		return ((initialKey_IMetInst != null)
	? (initialKey_IMetInst)
	: (initialKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialKey", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString initialKey(){
			final com.apple.jobjc.Invoke.MsgSend initialKey_IMetInst = get_initialKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialKey_IMetInst.init(nativeBuffer, this);
		initialKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialValue_IMetInst(){
		return ((initialValue_IMetInst != null)
	? (initialValue_IMetInst)
	: (initialValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initialValue(){
			final com.apple.jobjc.Invoke.MsgSend initialValue_IMetInst = get_initialValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialValue_IMetInst.init(nativeBuffer, this);
		initialValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedKeyDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedKeyDictionary_IMetInst(){
		return ((localizedKeyDictionary_IMetInst != null)
	? (localizedKeyDictionary_IMetInst)
	: (localizedKeyDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedKeyDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary localizedKeyDictionary(){
			final com.apple.jobjc.Invoke.MsgSend localizedKeyDictionary_IMetInst = get_localizedKeyDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedKeyDictionary_IMetInst.init(nativeBuffer, this);
		localizedKeyDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedKeyTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedKeyTable_IMetInst(){
		return ((localizedKeyTable_IMetInst != null)
	? (localizedKeyTable_IMetInst)
	: (localizedKeyTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedKeyTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedKeyTable(){
			final com.apple.jobjc.Invoke.MsgSend localizedKeyTable_IMetInst = get_localizedKeyTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedKeyTable_IMetInst.init(nativeBuffer, this);
		localizedKeyTable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newObject_IMetInst(){
		return ((newObject_IMetInst != null)
	? (newObject_IMetInst)
	: (newObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T newObject(){
			final com.apple.jobjc.Invoke.MsgSend newObject_IMetInst = get_newObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newObject_IMetInst.init(nativeBuffer, this);
		newObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setExcludedKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExcludedKeys_IMetInst(){
		return ((setExcludedKeys_IMetInst != null)
	? (setExcludedKeys_IMetInst)
	: (setExcludedKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExcludedKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setExcludedKeys(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend setExcludedKeys_IMetInst = get_setExcludedKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExcludedKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		setExcludedKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncludedKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncludedKeys_IMetInst(){
		return ((setIncludedKeys_IMetInst != null)
	? (setIncludedKeys_IMetInst)
	: (setIncludedKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncludedKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIncludedKeys(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend setIncludedKeys_IMetInst = get_setIncludedKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncludedKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		setIncludedKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInitialKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInitialKey_IMetInst(){
		return ((setInitialKey_IMetInst != null)
	? (setInitialKey_IMetInst)
	: (setInitialKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInitialKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInitialKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setInitialKey_IMetInst = get_setInitialKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInitialKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setInitialKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInitialValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInitialValue_IMetInst(){
		return ((setInitialValue_IMetInst != null)
	? (setInitialValue_IMetInst)
	: (setInitialValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInitialValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInitialValue(final com.apple.jobjc.ID value){
			final com.apple.jobjc.Invoke.MsgSend setInitialValue_IMetInst = get_setInitialValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInitialValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setInitialValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocalizedKeyDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocalizedKeyDictionary_IMetInst(){
		return ((setLocalizedKeyDictionary_IMetInst != null)
	? (setLocalizedKeyDictionary_IMetInst)
	: (setLocalizedKeyDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocalizedKeyDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocalizedKeyDictionary(final com.apple.jobjc.foundation.NSDictionary dictionary){
			final com.apple.jobjc.Invoke.MsgSend setLocalizedKeyDictionary_IMetInst = get_setLocalizedKeyDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocalizedKeyDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dictionary);
		setLocalizedKeyDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLocalizedKeyTable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLocalizedKeyTable_IMetInst(){
		return ((setLocalizedKeyTable_IMetInst != null)
	? (setLocalizedKeyTable_IMetInst)
	: (setLocalizedKeyTable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLocalizedKeyTable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLocalizedKeyTable(final com.apple.jobjc.foundation.NSString stringsFileName){
			final com.apple.jobjc.Invoke.MsgSend setLocalizedKeyTable_IMetInst = get_setLocalizedKeyTable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLocalizedKeyTable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringsFileName);
		setLocalizedKeyTable_IMetInst.invoke(nativeBuffer);
		
		
	}

}
