package com.apple.jobjc.appkit;

public  class NSDocumentClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDocumentClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDocumentClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDocumentClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend autosavesDrafts_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavesDrafts_CMetInst(){
		return ((autosavesDrafts_CMetInst != null)
	? (autosavesDrafts_CMetInst)
	: (autosavesDrafts_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavesDrafts", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosavesDrafts(){
			final com.apple.jobjc.Invoke.MsgSend autosavesDrafts_CMetInst = get_autosavesDrafts_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavesDrafts_CMetInst.init(nativeBuffer, this);
		autosavesDrafts_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavesInPlace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavesInPlace_CMetInst(){
		return ((autosavesInPlace_CMetInst != null)
	? (autosavesInPlace_CMetInst)
	: (autosavesInPlace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavesInPlace", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosavesInPlace(){
			final com.apple.jobjc.Invoke.MsgSend autosavesInPlace_CMetInst = get_autosavesInPlace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavesInPlace_CMetInst.init(nativeBuffer, this);
		autosavesInPlace_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canConcurrentlyReadDocumentsOfType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canConcurrentlyReadDocumentsOfType_CMetInst(){
		return ((canConcurrentlyReadDocumentsOfType_CMetInst != null)
	? (canConcurrentlyReadDocumentsOfType_CMetInst)
	: (canConcurrentlyReadDocumentsOfType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canConcurrentlyReadDocumentsOfType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canConcurrentlyReadDocumentsOfType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend canConcurrentlyReadDocumentsOfType_CMetInst = get_canConcurrentlyReadDocumentsOfType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canConcurrentlyReadDocumentsOfType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		canConcurrentlyReadDocumentsOfType_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isNativeType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isNativeType_CMetInst(){
		return ((isNativeType_CMetInst != null)
	? (isNativeType_CMetInst)
	: (isNativeType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isNativeType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isNativeType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend isNativeType_CMetInst = get_isNativeType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isNativeType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		isNativeType_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preservesVersions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preservesVersions_CMetInst(){
		return ((preservesVersions_CMetInst != null)
	? (preservesVersions_CMetInst)
	: (preservesVersions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preservesVersions", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean preservesVersions(){
			final com.apple.jobjc.Invoke.MsgSend preservesVersions_CMetInst = get_preservesVersions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preservesVersions_CMetInst.init(nativeBuffer, this);
		preservesVersions_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readableTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readableTypes_CMetInst(){
		return ((readableTypes_CMetInst != null)
	? (readableTypes_CMetInst)
	: (readableTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readableTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray readableTypes(){
			final com.apple.jobjc.Invoke.MsgSend readableTypes_CMetInst = get_readableTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readableTypes_CMetInst.init(nativeBuffer, this);
		readableTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restorableStateKeyPaths_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restorableStateKeyPaths_CMetInst(){
		return ((restorableStateKeyPaths_CMetInst != null)
	? (restorableStateKeyPaths_CMetInst)
	: (restorableStateKeyPaths_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restorableStateKeyPaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray restorableStateKeyPaths(){
			final com.apple.jobjc.Invoke.MsgSend restorableStateKeyPaths_CMetInst = get_restorableStateKeyPaths_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restorableStateKeyPaths_CMetInst.init(nativeBuffer, this);
		restorableStateKeyPaths_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend usesUbiquitousStorage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesUbiquitousStorage_CMetInst(){
		return ((usesUbiquitousStorage_CMetInst != null)
	? (usesUbiquitousStorage_CMetInst)
	: (usesUbiquitousStorage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesUbiquitousStorage", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesUbiquitousStorage(){
			final com.apple.jobjc.Invoke.MsgSend usesUbiquitousStorage_CMetInst = get_usesUbiquitousStorage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesUbiquitousStorage_CMetInst.init(nativeBuffer, this);
		usesUbiquitousStorage_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writableTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writableTypes_CMetInst(){
		return ((writableTypes_CMetInst != null)
	? (writableTypes_CMetInst)
	: (writableTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writableTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray writableTypes(){
			final com.apple.jobjc.Invoke.MsgSend writableTypes_CMetInst = get_writableTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writableTypes_CMetInst.init(nativeBuffer, this);
		writableTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
