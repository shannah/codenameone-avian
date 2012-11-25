package com.apple.jobjc.appkit;

public  class NSPasteboard extends com.apple.jobjc.foundation.NSObject {
	public NSPasteboard(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPasteboard(final NSPasteboard obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTypes_owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTypes_owner_IMetInst(){
		return ((addTypes_owner_IMetInst != null)
	? (addTypes_owner_IMetInst)
	: (addTypes_owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTypes:owner:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long addTypes_owner(final com.apple.jobjc.foundation.NSArray newTypes, final com.apple.jobjc.ID newOwner){
			final com.apple.jobjc.Invoke.MsgSend addTypes_owner_IMetInst = get_addTypes_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTypes_owner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newOwner);
		addTypes_owner_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableTypeFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableTypeFromArray_IMetInst(){
		return ((availableTypeFromArray_IMetInst != null)
	? (availableTypeFromArray_IMetInst)
	: (availableTypeFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableTypeFromArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString availableTypeFromArray(final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend availableTypeFromArray_IMetInst = get_availableTypeFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableTypeFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		availableTypeFromArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canReadItemWithDataConformingToTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canReadItemWithDataConformingToTypes_IMetInst(){
		return ((canReadItemWithDataConformingToTypes_IMetInst != null)
	? (canReadItemWithDataConformingToTypes_IMetInst)
	: (canReadItemWithDataConformingToTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canReadItemWithDataConformingToTypes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canReadItemWithDataConformingToTypes(final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend canReadItemWithDataConformingToTypes_IMetInst = get_canReadItemWithDataConformingToTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canReadItemWithDataConformingToTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		canReadItemWithDataConformingToTypes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canReadObjectForClasses_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canReadObjectForClasses_options_IMetInst(){
		return ((canReadObjectForClasses_options_IMetInst != null)
	? (canReadObjectForClasses_options_IMetInst)
	: (canReadObjectForClasses_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canReadObjectForClasses:options:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canReadObjectForClasses_options(final com.apple.jobjc.foundation.NSArray classArray, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend canReadObjectForClasses_options_IMetInst = get_canReadObjectForClasses_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canReadObjectForClasses_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		canReadObjectForClasses_options_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend changeCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeCount_IMetInst(){
		return ((changeCount_IMetInst != null)
	? (changeCount_IMetInst)
	: (changeCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long changeCount(){
			final com.apple.jobjc.Invoke.MsgSend changeCount_IMetInst = get_changeCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeCount_IMetInst.init(nativeBuffer, this);
		changeCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clearContents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearContents_IMetInst(){
		return ((clearContents_IMetInst != null)
	? (clearContents_IMetInst)
	: (clearContents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearContents", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long clearContents(){
			final com.apple.jobjc.Invoke.MsgSend clearContents_IMetInst = get_clearContents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearContents_IMetInst.init(nativeBuffer, this);
		clearContents_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataForType_IMetInst(){
		return ((dataForType_IMetInst != null)
	? (dataForType_IMetInst)
	: (dataForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataForType(final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend dataForType_IMetInst = get_dataForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		dataForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend declareTypes_owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_declareTypes_owner_IMetInst(){
		return ((declareTypes_owner_IMetInst != null)
	? (declareTypes_owner_IMetInst)
	: (declareTypes_owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "declareTypes:owner:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long declareTypes_owner(final com.apple.jobjc.foundation.NSArray newTypes, final com.apple.jobjc.ID newOwner){
			final com.apple.jobjc.Invoke.MsgSend declareTypes_owner_IMetInst = get_declareTypes_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		declareTypes_owner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newOwner);
		declareTypes_owner_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfPasteboardItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfPasteboardItem_IMetInst(){
		return ((indexOfPasteboardItem_IMetInst != null)
	? (indexOfPasteboardItem_IMetInst)
	: (indexOfPasteboardItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfPasteboardItem:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfPasteboardItem(final com.apple.jobjc.appkit.NSPasteboardItem pasteboardItem){
			final com.apple.jobjc.Invoke.MsgSend indexOfPasteboardItem_IMetInst = get_indexOfPasteboardItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfPasteboardItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboardItem);
		indexOfPasteboardItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardItems_IMetInst(){
		return ((pasteboardItems_IMetInst != null)
	? (pasteboardItems_IMetInst)
	: (pasteboardItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardItems", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pasteboardItems(){
			final com.apple.jobjc.Invoke.MsgSend pasteboardItems_IMetInst = get_pasteboardItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardItems_IMetInst.init(nativeBuffer, this);
		pasteboardItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListForType_IMetInst(){
		return ((propertyListForType_IMetInst != null)
	? (propertyListForType_IMetInst)
	: (propertyListForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyListForType(final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend propertyListForType_IMetInst = get_propertyListForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		propertyListForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFileContentsType_toFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFileContentsType_toFile_IMetInst(){
		return ((readFileContentsType_toFile_IMetInst != null)
	? (readFileContentsType_toFile_IMetInst)
	: (readFileContentsType_toFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFileContentsType:toFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString readFileContentsType_toFile(final com.apple.jobjc.foundation.NSString type, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend readFileContentsType_toFile_IMetInst = get_readFileContentsType_toFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFileContentsType_toFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		readFileContentsType_toFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFileWrapper_IMetInst(){
		return ((readFileWrapper_IMetInst != null)
	? (readFileWrapper_IMetInst)
	: (readFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFileWrapper", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper readFileWrapper(){
			final com.apple.jobjc.Invoke.MsgSend readFileWrapper_IMetInst = get_readFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFileWrapper_IMetInst.init(nativeBuffer, this);
		readFileWrapper_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readObjectsForClasses_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readObjectsForClasses_options_IMetInst(){
		return ((readObjectsForClasses_options_IMetInst != null)
	? (readObjectsForClasses_options_IMetInst)
	: (readObjectsForClasses_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readObjectsForClasses:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray readObjectsForClasses_options(final com.apple.jobjc.foundation.NSArray classArray, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend readObjectsForClasses_options_IMetInst = get_readObjectsForClasses_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readObjectsForClasses_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		readObjectsForClasses_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend releaseGlobally_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_releaseGlobally_IMetInst(){
		return ((releaseGlobally_IMetInst != null)
	? (releaseGlobally_IMetInst)
	: (releaseGlobally_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "releaseGlobally", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void releaseGlobally(){
			final com.apple.jobjc.Invoke.MsgSend releaseGlobally_IMetInst = get_releaseGlobally_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		releaseGlobally_IMetInst.init(nativeBuffer, this);
		releaseGlobally_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setData_forType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setData_forType_IMetInst(){
		return ((setData_forType_IMetInst != null)
	? (setData_forType_IMetInst)
	: (setData_forType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setData:forType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setData_forType(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend setData_forType_IMetInst = get_setData_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setData_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		setData_forType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPropertyList_forType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPropertyList_forType_IMetInst(){
		return ((setPropertyList_forType_IMetInst != null)
	? (setPropertyList_forType_IMetInst)
	: (setPropertyList_forType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPropertyList:forType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setPropertyList_forType(final com.apple.jobjc.ID plist, final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend setPropertyList_forType_IMetInst = get_setPropertyList_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPropertyList_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, plist);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		setPropertyList_forType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setString_forType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setString_forType_IMetInst(){
		return ((setString_forType_IMetInst != null)
	? (setString_forType_IMetInst)
	: (setString_forType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setString:forType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setString_forType(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend setString_forType_IMetInst = get_setString_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		setString_forType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringForType_IMetInst(){
		return ((stringForType_IMetInst != null)
	? (stringForType_IMetInst)
	: (stringForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringForType(final com.apple.jobjc.foundation.NSString dataType){
			final com.apple.jobjc.Invoke.MsgSend stringForType_IMetInst = get_stringForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataType);
		stringForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend types_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_types_IMetInst(){
		return ((types_IMetInst != null)
	? (types_IMetInst)
	: (types_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "types", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray types(){
			final com.apple.jobjc.Invoke.MsgSend types_IMetInst = get_types_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		types_IMetInst.init(nativeBuffer, this);
		types_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeFileContents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeFileContents_IMetInst(){
		return ((writeFileContents_IMetInst != null)
	? (writeFileContents_IMetInst)
	: (writeFileContents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeFileContents:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeFileContents(final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend writeFileContents_IMetInst = get_writeFileContents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeFileContents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		writeFileContents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeFileWrapper_IMetInst(){
		return ((writeFileWrapper_IMetInst != null)
	? (writeFileWrapper_IMetInst)
	: (writeFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeFileWrapper:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper wrapper){
			final com.apple.jobjc.Invoke.MsgSend writeFileWrapper_IMetInst = get_writeFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, wrapper);
		writeFileWrapper_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeObjects_IMetInst(){
		return ((writeObjects_IMetInst != null)
	? (writeObjects_IMetInst)
	: (writeObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeObjects(final com.apple.jobjc.foundation.NSArray objects){
			final com.apple.jobjc.Invoke.MsgSend writeObjects_IMetInst = get_writeObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		writeObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
