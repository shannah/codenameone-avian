package com.apple.jobjc.foundation;

public  class NSDictionary extends com.apple.jobjc.foundation.NSObject {
	public NSDictionary(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDictionary(final NSDictionary obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allKeys_IMetInst(){
		return ((allKeys_IMetInst != null)
	? (allKeys_IMetInst)
	: (allKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allKeys", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allKeys(){
			final com.apple.jobjc.Invoke.MsgSend allKeys_IMetInst = get_allKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allKeys_IMetInst.init(nativeBuffer, this);
		allKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allKeysForObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allKeysForObject_IMetInst(){
		return ((allKeysForObject_IMetInst != null)
	? (allKeysForObject_IMetInst)
	: (allKeysForObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allKeysForObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allKeysForObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend allKeysForObject_IMetInst = get_allKeysForObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allKeysForObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		allKeysForObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allValues_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allValues_IMetInst(){
		return ((allValues_IMetInst != null)
	? (allValues_IMetInst)
	: (allValues_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allValues", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allValues(){
			final com.apple.jobjc.Invoke.MsgSend allValues_IMetInst = get_allValues_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allValues_IMetInst.init(nativeBuffer, this);
		allValues_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_count_IMetInst(){
		return ((count_IMetInst != null)
	? (count_IMetInst)
	: (count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "count", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long count(){
			final com.apple.jobjc.Invoke.MsgSend count_IMetInst = get_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		count_IMetInst.init(nativeBuffer, this);
		count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionInStringsFileFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionInStringsFileFormat_IMetInst(){
		return ((descriptionInStringsFileFormat_IMetInst != null)
	? (descriptionInStringsFileFormat_IMetInst)
	: (descriptionInStringsFileFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionInStringsFileFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionInStringsFileFormat(){
			final com.apple.jobjc.Invoke.MsgSend descriptionInStringsFileFormat_IMetInst = get_descriptionInStringsFileFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionInStringsFileFormat_IMetInst.init(nativeBuffer, this);
		descriptionInStringsFileFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_IMetInst(){
		return ((descriptionWithLocale_IMetInst != null)
	? (descriptionWithLocale_IMetInst)
	: (descriptionWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst = get_descriptionWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_indent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_indent_IMetInst(){
		return ((descriptionWithLocale_indent_IMetInst != null)
	? (descriptionWithLocale_indent_IMetInst)
	: (descriptionWithLocale_indent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:indent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale_indent(final com.apple.jobjc.ID locale, final long level){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_indent_IMetInst = get_descriptionWithLocale_indent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_indent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, level);
		descriptionWithLocale_indent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateKeysAndObjectsUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateKeysAndObjectsUsingBlock_IMetInst(){
		return ((enumerateKeysAndObjectsUsingBlock_IMetInst != null)
	? (enumerateKeysAndObjectsUsingBlock_IMetInst)
	: (enumerateKeysAndObjectsUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateKeysAndObjectsUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateKeysAndObjectsUsingBlock(final Object /* void(^)(id,id,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateKeysAndObjectsUsingBlock_IMetInst = get_enumerateKeysAndObjectsUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateKeysAndObjectsUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateKeysAndObjectsUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst(){
		return ((enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst != null)
	? (enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst)
	: (enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateKeysAndObjectsWithOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateKeysAndObjectsWithOptions_usingBlock(final long opts, final Object /* void(^)(id,id,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst = get_enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateKeysAndObjectsWithOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fileCreationDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileCreationDate_IMetInst(){
		return ((fileCreationDate_IMetInst != null)
	? (fileCreationDate_IMetInst)
	: (fileCreationDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileCreationDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate fileCreationDate(){
			final com.apple.jobjc.Invoke.MsgSend fileCreationDate_IMetInst = get_fileCreationDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileCreationDate_IMetInst.init(nativeBuffer, this);
		fileCreationDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileExtensionHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileExtensionHidden_IMetInst(){
		return ((fileExtensionHidden_IMetInst != null)
	? (fileExtensionHidden_IMetInst)
	: (fileExtensionHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileExtensionHidden", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fileExtensionHidden(){
			final com.apple.jobjc.Invoke.MsgSend fileExtensionHidden_IMetInst = get_fileExtensionHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileExtensionHidden_IMetInst.init(nativeBuffer, this);
		fileExtensionHidden_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileGroupOwnerAccountID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileGroupOwnerAccountID_IMetInst(){
		return ((fileGroupOwnerAccountID_IMetInst != null)
	? (fileGroupOwnerAccountID_IMetInst)
	: (fileGroupOwnerAccountID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileGroupOwnerAccountID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber fileGroupOwnerAccountID(){
			final com.apple.jobjc.Invoke.MsgSend fileGroupOwnerAccountID_IMetInst = get_fileGroupOwnerAccountID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileGroupOwnerAccountID_IMetInst.init(nativeBuffer, this);
		fileGroupOwnerAccountID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileGroupOwnerAccountName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileGroupOwnerAccountName_IMetInst(){
		return ((fileGroupOwnerAccountName_IMetInst != null)
	? (fileGroupOwnerAccountName_IMetInst)
	: (fileGroupOwnerAccountName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileGroupOwnerAccountName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileGroupOwnerAccountName(){
			final com.apple.jobjc.Invoke.MsgSend fileGroupOwnerAccountName_IMetInst = get_fileGroupOwnerAccountName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileGroupOwnerAccountName_IMetInst.init(nativeBuffer, this);
		fileGroupOwnerAccountName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHFSCreatorCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHFSCreatorCode_IMetInst(){
		return ((fileHFSCreatorCode_IMetInst != null)
	? (fileHFSCreatorCode_IMetInst)
	: (fileHFSCreatorCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHFSCreatorCode", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int fileHFSCreatorCode(){
			final com.apple.jobjc.Invoke.MsgSend fileHFSCreatorCode_IMetInst = get_fileHFSCreatorCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHFSCreatorCode_IMetInst.init(nativeBuffer, this);
		fileHFSCreatorCode_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHFSTypeCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHFSTypeCode_IMetInst(){
		return ((fileHFSTypeCode_IMetInst != null)
	? (fileHFSTypeCode_IMetInst)
	: (fileHFSTypeCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHFSTypeCode", com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder)));
	}

	 public int fileHFSTypeCode(){
			final com.apple.jobjc.Invoke.MsgSend fileHFSTypeCode_IMetInst = get_fileHFSTypeCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHFSTypeCode_IMetInst.init(nativeBuffer, this);
		fileHFSTypeCode_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.MixedPrimitiveCoder.ULongUIntCoder.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileIsAppendOnly_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileIsAppendOnly_IMetInst(){
		return ((fileIsAppendOnly_IMetInst != null)
	? (fileIsAppendOnly_IMetInst)
	: (fileIsAppendOnly_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileIsAppendOnly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fileIsAppendOnly(){
			final com.apple.jobjc.Invoke.MsgSend fileIsAppendOnly_IMetInst = get_fileIsAppendOnly_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileIsAppendOnly_IMetInst.init(nativeBuffer, this);
		fileIsAppendOnly_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileIsImmutable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileIsImmutable_IMetInst(){
		return ((fileIsImmutable_IMetInst != null)
	? (fileIsImmutable_IMetInst)
	: (fileIsImmutable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileIsImmutable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fileIsImmutable(){
			final com.apple.jobjc.Invoke.MsgSend fileIsImmutable_IMetInst = get_fileIsImmutable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileIsImmutable_IMetInst.init(nativeBuffer, this);
		fileIsImmutable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileModificationDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileModificationDate_IMetInst(){
		return ((fileModificationDate_IMetInst != null)
	? (fileModificationDate_IMetInst)
	: (fileModificationDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileModificationDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate fileModificationDate(){
			final com.apple.jobjc.Invoke.MsgSend fileModificationDate_IMetInst = get_fileModificationDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileModificationDate_IMetInst.init(nativeBuffer, this);
		fileModificationDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileOwnerAccountID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileOwnerAccountID_IMetInst(){
		return ((fileOwnerAccountID_IMetInst != null)
	? (fileOwnerAccountID_IMetInst)
	: (fileOwnerAccountID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileOwnerAccountID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber fileOwnerAccountID(){
			final com.apple.jobjc.Invoke.MsgSend fileOwnerAccountID_IMetInst = get_fileOwnerAccountID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileOwnerAccountID_IMetInst.init(nativeBuffer, this);
		fileOwnerAccountID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileOwnerAccountName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileOwnerAccountName_IMetInst(){
		return ((fileOwnerAccountName_IMetInst != null)
	? (fileOwnerAccountName_IMetInst)
	: (fileOwnerAccountName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileOwnerAccountName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileOwnerAccountName(){
			final com.apple.jobjc.Invoke.MsgSend fileOwnerAccountName_IMetInst = get_fileOwnerAccountName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileOwnerAccountName_IMetInst.init(nativeBuffer, this);
		fileOwnerAccountName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filePosixPermissions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filePosixPermissions_IMetInst(){
		return ((filePosixPermissions_IMetInst != null)
	? (filePosixPermissions_IMetInst)
	: (filePosixPermissions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filePosixPermissions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long filePosixPermissions(){
			final com.apple.jobjc.Invoke.MsgSend filePosixPermissions_IMetInst = get_filePosixPermissions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filePosixPermissions_IMetInst.init(nativeBuffer, this);
		filePosixPermissions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSize_IMetInst(){
		return ((fileSize_IMetInst != null)
	? (fileSize_IMetInst)
	: (fileSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSize", com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public long fileSize(){
			final com.apple.jobjc.Invoke.MsgSend fileSize_IMetInst = get_fileSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSize_IMetInst.init(nativeBuffer, this);
		fileSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemFileNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemFileNumber_IMetInst(){
		return ((fileSystemFileNumber_IMetInst != null)
	? (fileSystemFileNumber_IMetInst)
	: (fileSystemFileNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemFileNumber", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long fileSystemFileNumber(){
			final com.apple.jobjc.Invoke.MsgSend fileSystemFileNumber_IMetInst = get_fileSystemFileNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemFileNumber_IMetInst.init(nativeBuffer, this);
		fileSystemFileNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemNumber_IMetInst(){
		return ((fileSystemNumber_IMetInst != null)
	? (fileSystemNumber_IMetInst)
	: (fileSystemNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long fileSystemNumber(){
			final com.apple.jobjc.Invoke.MsgSend fileSystemNumber_IMetInst = get_fileSystemNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemNumber_IMetInst.init(nativeBuffer, this);
		fileSystemNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileType_IMetInst(){
		return ((fileType_IMetInst != null)
	? (fileType_IMetInst)
	: (fileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileType(){
			final com.apple.jobjc.Invoke.MsgSend fileType_IMetInst = get_fileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileType_IMetInst.init(nativeBuffer, this);
		fileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getObjects_andKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getObjects_andKeys_IMetInst(){
		return ((getObjects_andKeys_IMetInst != null)
	? (getObjects_andKeys_IMetInst)
	: (getObjects_andKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getObjects:andKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getObjects_andKeys(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> keys){
			final com.apple.jobjc.Invoke.MsgSend getObjects_andKeys_IMetInst = get_getObjects_andKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getObjects_andKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, keys);
		getObjects_andKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_IMetInst(){
		return ((initWithContentsOfFile_IMetInst != null)
	? (initWithContentsOfFile_IMetInst)
	: (initWithContentsOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst = get_initWithContentsOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithContentsOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDictionary_IMetInst(){
		return ((initWithDictionary_IMetInst != null)
	? (initWithDictionary_IMetInst)
	: (initWithDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDictionary(final com.apple.jobjc.foundation.NSDictionary otherDictionary){
			final com.apple.jobjc.Invoke.MsgSend initWithDictionary_IMetInst = get_initWithDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDictionary);
		initWithDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithDictionary_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithDictionary_copyItems_IMetInst(){
		return ((initWithDictionary_copyItems_IMetInst != null)
	? (initWithDictionary_copyItems_IMetInst)
	: (initWithDictionary_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithDictionary:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithDictionary_copyItems(final com.apple.jobjc.foundation.NSDictionary otherDictionary, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithDictionary_copyItems_IMetInst = get_initWithDictionary_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithDictionary_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDictionary);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithDictionary_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithObjects_forKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObjects_forKeys_IMetInst(){
		return ((initWithObjects_forKeys_IMetInst != null)
	? (initWithObjects_forKeys_IMetInst)
	: (initWithObjects_forKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:forKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects_forKeys(final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend initWithObjects_forKeys_IMetInst = get_initWithObjects_forKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_forKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		initWithObjects_forKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithObjects_forKeys_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObjects_forKeys_count_IMetInst(){
		return ((initWithObjects_forKeys_count_IMetInst != null)
	? (initWithObjects_forKeys_count_IMetInst)
	: (initWithObjects_forKeys_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:forKeys:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects_forKeys_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> keys, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend initWithObjects_forKeys_count_IMetInst = get_initWithObjects_forKeys_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_forKeys_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		initWithObjects_forKeys_count_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjectsAndKeys(final com.apple.jobjc.ID firstObject, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend initWithObjectsAndKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjectsAndKeys:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjectsAndKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObject);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		initWithObjectsAndKeys_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToDictionary_IMetInst(){
		return ((isEqualToDictionary_IMetInst != null)
	? (isEqualToDictionary_IMetInst)
	: (isEqualToDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToDictionary:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToDictionary(final com.apple.jobjc.foundation.NSDictionary otherDictionary){
			final com.apple.jobjc.Invoke.MsgSend isEqualToDictionary_IMetInst = get_isEqualToDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherDictionary);
		isEqualToDictionary_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEnumerator_IMetInst(){
		return ((keyEnumerator_IMetInst != null)
	? (keyEnumerator_IMetInst)
	: (keyEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator keyEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend keyEnumerator_IMetInst = get_keyEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEnumerator_IMetInst.init(nativeBuffer, this);
		keyEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keysOfEntriesPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keysOfEntriesPassingTest_IMetInst(){
		return ((keysOfEntriesPassingTest_IMetInst != null)
	? (keysOfEntriesPassingTest_IMetInst)
	: (keysOfEntriesPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keysOfEntriesPassingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet keysOfEntriesPassingTest(final Object /* BOOL(^)(id,id,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend keysOfEntriesPassingTest_IMetInst = get_keysOfEntriesPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keysOfEntriesPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		keysOfEntriesPassingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keysOfEntriesWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keysOfEntriesWithOptions_passingTest_IMetInst(){
		return ((keysOfEntriesWithOptions_passingTest_IMetInst != null)
	? (keysOfEntriesWithOptions_passingTest_IMetInst)
	: (keysOfEntriesWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keysOfEntriesWithOptions:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet keysOfEntriesWithOptions_passingTest(final long opts, final Object /* BOOL(^)(id,id,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend keysOfEntriesWithOptions_passingTest_IMetInst = get_keysOfEntriesWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keysOfEntriesWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		keysOfEntriesWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keysSortedByValueUsingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keysSortedByValueUsingComparator_IMetInst(){
		return ((keysSortedByValueUsingComparator_IMetInst != null)
	? (keysSortedByValueUsingComparator_IMetInst)
	: (keysSortedByValueUsingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keysSortedByValueUsingComparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray keysSortedByValueUsingComparator(final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend keysSortedByValueUsingComparator_IMetInst = get_keysSortedByValueUsingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keysSortedByValueUsingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		keysSortedByValueUsingComparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keysSortedByValueUsingSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keysSortedByValueUsingSelector_IMetInst(){
		return ((keysSortedByValueUsingSelector_IMetInst != null)
	? (keysSortedByValueUsingSelector_IMetInst)
	: (keysSortedByValueUsingSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keysSortedByValueUsingSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray keysSortedByValueUsingSelector(final com.apple.jobjc.SEL comparator){
			final com.apple.jobjc.Invoke.MsgSend keysSortedByValueUsingSelector_IMetInst = get_keysSortedByValueUsingSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keysSortedByValueUsingSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, comparator);
		keysSortedByValueUsingSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keysSortedByValueWithOptions_usingComparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keysSortedByValueWithOptions_usingComparator_IMetInst(){
		return ((keysSortedByValueWithOptions_usingComparator_IMetInst != null)
	? (keysSortedByValueWithOptions_usingComparator_IMetInst)
	: (keysSortedByValueWithOptions_usingComparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keysSortedByValueWithOptions:usingComparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray keysSortedByValueWithOptions_usingComparator(final long opts, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend keysSortedByValueWithOptions_usingComparator_IMetInst = get_keysSortedByValueWithOptions_usingComparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keysSortedByValueWithOptions_usingComparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		keysSortedByValueWithOptions_usingComparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectEnumerator_IMetInst(){
		return ((objectEnumerator_IMetInst != null)
	? (objectEnumerator_IMetInst)
	: (objectEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator objectEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst = get_objectEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectEnumerator_IMetInst.init(nativeBuffer, this);
		objectEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.ID aKey){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKeyedSubscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKeyedSubscript_IMetInst(){
		return ((objectForKeyedSubscript_IMetInst != null)
	? (objectForKeyedSubscript_IMetInst)
	: (objectForKeyedSubscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKeyedSubscript:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKeyedSubscript(final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend objectForKeyedSubscript_IMetInst = get_objectForKeyedSubscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKeyedSubscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		objectForKeyedSubscript_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsForKeys_notFoundMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsForKeys_notFoundMarker_IMetInst(){
		return ((objectsForKeys_notFoundMarker_IMetInst != null)
	? (objectsForKeys_notFoundMarker_IMetInst)
	: (objectsForKeys_notFoundMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsForKeys:notFoundMarker:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray objectsForKeys_notFoundMarker(final com.apple.jobjc.foundation.NSArray keys, final com.apple.jobjc.ID marker){
			final com.apple.jobjc.Invoke.MsgSend objectsForKeys_notFoundMarker_IMetInst = get_objectsForKeys_notFoundMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsForKeys_notFoundMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		objectsForKeys_notFoundMarker_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForKey_IMetInst(){
		return ((valueForKey_IMetInst != null)
	? (valueForKey_IMetInst)
	: (valueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst = get_valueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_IMetInst(){
		return ((writeToFile_atomically_IMetInst != null)
	? (writeToFile_atomically_IMetInst)
	: (writeToFile_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToFile_atomically(final com.apple.jobjc.foundation.NSString path, final boolean useAuxiliaryFile){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst = get_writeToFile_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		writeToFile_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_atomically_IMetInst(){
		return ((writeToURL_atomically_IMetInst != null)
	? (writeToURL_atomically_IMetInst)
	: (writeToURL_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToURL_atomically(final com.apple.jobjc.foundation.NSURL url, final boolean atomically){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst = get_writeToURL_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, atomically);
		writeToURL_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
