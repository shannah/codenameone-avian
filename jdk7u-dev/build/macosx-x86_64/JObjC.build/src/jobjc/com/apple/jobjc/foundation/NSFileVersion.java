package com.apple.jobjc.foundation;

public  class NSFileVersion extends com.apple.jobjc.foundation.NSObject {
	public NSFileVersion(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileVersion(final NSFileVersion obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isConflict_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isConflict_IMetInst(){
		return ((isConflict_IMetInst != null)
	? (isConflict_IMetInst)
	: (isConflict_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isConflict", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isConflict(){
			final com.apple.jobjc.Invoke.MsgSend isConflict_IMetInst = get_isConflict_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isConflict_IMetInst.init(nativeBuffer, this);
		isConflict_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDiscardable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDiscardable_IMetInst(){
		return ((isDiscardable_IMetInst != null)
	? (isDiscardable_IMetInst)
	: (isDiscardable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDiscardable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDiscardable(){
			final com.apple.jobjc.Invoke.MsgSend isDiscardable_IMetInst = get_isDiscardable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDiscardable_IMetInst.init(nativeBuffer, this);
		isDiscardable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isResolved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isResolved_IMetInst(){
		return ((isResolved_IMetInst != null)
	? (isResolved_IMetInst)
	: (isResolved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isResolved", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isResolved(){
			final com.apple.jobjc.Invoke.MsgSend isResolved_IMetInst = get_isResolved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isResolved_IMetInst.init(nativeBuffer, this);
		isResolved_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedName_IMetInst(){
		return ((localizedName_IMetInst != null)
	? (localizedName_IMetInst)
	: (localizedName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedName(){
			final com.apple.jobjc.Invoke.MsgSend localizedName_IMetInst = get_localizedName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedName_IMetInst.init(nativeBuffer, this);
		localizedName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedNameOfSavingComputer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedNameOfSavingComputer_IMetInst(){
		return ((localizedNameOfSavingComputer_IMetInst != null)
	? (localizedNameOfSavingComputer_IMetInst)
	: (localizedNameOfSavingComputer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedNameOfSavingComputer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedNameOfSavingComputer(){
			final com.apple.jobjc.Invoke.MsgSend localizedNameOfSavingComputer_IMetInst = get_localizedNameOfSavingComputer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedNameOfSavingComputer_IMetInst.init(nativeBuffer, this);
		localizedNameOfSavingComputer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend modificationDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modificationDate_IMetInst(){
		return ((modificationDate_IMetInst != null)
	? (modificationDate_IMetInst)
	: (modificationDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modificationDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate modificationDate(){
			final com.apple.jobjc.Invoke.MsgSend modificationDate_IMetInst = get_modificationDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modificationDate_IMetInst.init(nativeBuffer, this);
		modificationDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend persistentIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_persistentIdentifier_IMetInst(){
		return ((persistentIdentifier_IMetInst != null)
	? (persistentIdentifier_IMetInst)
	: (persistentIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "persistentIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T persistentIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend persistentIdentifier_IMetInst = get_persistentIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		persistentIdentifier_IMetInst.init(nativeBuffer, this);
		persistentIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAndReturnError_IMetInst(){
		return ((removeAndReturnError_IMetInst != null)
	? (removeAndReturnError_IMetInst)
	: (removeAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean removeAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend removeAndReturnError_IMetInst = get_removeAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		removeAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceItemAtURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceItemAtURL_options_error_IMetInst(){
		return ((replaceItemAtURL_options_error_IMetInst != null)
	? (replaceItemAtURL_options_error_IMetInst)
	: (replaceItemAtURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceItemAtURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL replaceItemAtURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend replaceItemAtURL_options_error_IMetInst = get_replaceItemAtURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceItemAtURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		replaceItemAtURL_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDiscardable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDiscardable_IMetInst(){
		return ((setDiscardable_IMetInst != null)
	? (setDiscardable_IMetInst)
	: (setDiscardable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDiscardable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDiscardable(final boolean discardable){
			final com.apple.jobjc.Invoke.MsgSend setDiscardable_IMetInst = get_setDiscardable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDiscardable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, discardable);
		setDiscardable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setResolved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResolved_IMetInst(){
		return ((setResolved_IMetInst != null)
	? (setResolved_IMetInst)
	: (setResolved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResolved:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setResolved(final boolean resolved){
			final com.apple.jobjc.Invoke.MsgSend setResolved_IMetInst = get_setResolved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResolved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, resolved);
		setResolved_IMetInst.invoke(nativeBuffer);
		
		
	}

}
