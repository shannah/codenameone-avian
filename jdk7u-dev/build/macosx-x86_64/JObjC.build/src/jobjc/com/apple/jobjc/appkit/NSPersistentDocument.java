package com.apple.jobjc.appkit;

public  class NSPersistentDocument extends com.apple.jobjc.appkit.NSDocument {
	public NSPersistentDocument(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPersistentDocument(final NSPersistentDocument obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst(){
		return ((configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst != null)
	? (configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst)
	: (configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "configurePersistentStoreCoordinatorForURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean configurePersistentStoreCoordinatorForURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString fileType, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst = get_configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		configurePersistentStoreCoordinatorForURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst(){
		return ((configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst != null)
	? (configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst)
	: (configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString fileType, final com.apple.jobjc.foundation.NSString configuration, final com.apple.jobjc.foundation.NSDictionary storeOptions, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst = get_configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, configuration);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, storeOptions);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		configurePersistentStoreCoordinatorForURL_ofType_modelConfiguration_storeOptions_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend managedObjectContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_managedObjectContext_IMetInst(){
		return ((managedObjectContext_IMetInst != null)
	? (managedObjectContext_IMetInst)
	: (managedObjectContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "managedObjectContext", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSManagedObjectContext* (@, @) */ managedObjectContext(){
			final com.apple.jobjc.Invoke.MsgSend managedObjectContext_IMetInst = get_managedObjectContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		managedObjectContext_IMetInst.init(nativeBuffer, this);
		managedObjectContext_IMetInst.invoke(nativeBuffer);
		final Object /* NSManagedObjectContext* (@, @) */ returnValue = (Object /* NSManagedObjectContext* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend managedObjectModel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_managedObjectModel_IMetInst(){
		return ((managedObjectModel_IMetInst != null)
	? (managedObjectModel_IMetInst)
	: (managedObjectModel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "managedObjectModel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T managedObjectModel(){
			final com.apple.jobjc.Invoke.MsgSend managedObjectModel_IMetInst = get_managedObjectModel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		managedObjectModel_IMetInst.init(nativeBuffer, this);
		managedObjectModel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend persistentStoreTypeForFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_persistentStoreTypeForFileType_IMetInst(){
		return ((persistentStoreTypeForFileType_IMetInst != null)
	? (persistentStoreTypeForFileType_IMetInst)
	: (persistentStoreTypeForFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "persistentStoreTypeForFileType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString persistentStoreTypeForFileType(final com.apple.jobjc.foundation.NSString fileType){
			final com.apple.jobjc.Invoke.MsgSend persistentStoreTypeForFileType_IMetInst = get_persistentStoreTypeForFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		persistentStoreTypeForFileType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		persistentStoreTypeForFileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_ofType_error_IMetInst(){
		return ((readFromURL_ofType_error_IMetInst != null)
	? (readFromURL_ofType_error_IMetInst)
	: (readFromURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromURL_ofType_error(final com.apple.jobjc.foundation.NSURL absoluteURL, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_error_IMetInst = get_readFromURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		readFromURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend revertToContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertToContentsOfURL_ofType_error_IMetInst(){
		return ((revertToContentsOfURL_ofType_error_IMetInst != null)
	? (revertToContentsOfURL_ofType_error_IMetInst)
	: (revertToContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertToContentsOfURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean revertToContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL inAbsoluteURL, final com.apple.jobjc.foundation.NSString inTypeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend revertToContentsOfURL_ofType_error_IMetInst = get_revertToContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertToContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inAbsoluteURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inTypeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		revertToContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setManagedObjectContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setManagedObjectContext_IMetInst(){
		return ((setManagedObjectContext_IMetInst != null)
	? (setManagedObjectContext_IMetInst)
	: (setManagedObjectContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setManagedObjectContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setManagedObjectContext(final Object /* NSManagedObjectContext* (@, @) */ managedObjectContext){
			final com.apple.jobjc.Invoke.MsgSend setManagedObjectContext_IMetInst = get_setManagedObjectContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setManagedObjectContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, managedObjectContext);
		setManagedObjectContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst(){
		return ((writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst != null)
	? (writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst)
	: (writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:ofType:forSaveOperation:originalContentsURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_ofType_forSaveOperation_originalContentsURL_error(final com.apple.jobjc.foundation.NSURL absoluteURL, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.foundation.NSURL absoluteOriginalContentsURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = get_writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteOriginalContentsURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
