package com.apple.jobjc.appkit;

public  class NSPasteboardItem extends com.apple.jobjc.foundation.NSObject {
	public NSPasteboardItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPasteboardItem(final NSPasteboardItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend dataForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataForType_IMetInst(){
		return ((dataForType_IMetInst != null)
	? (dataForType_IMetInst)
	: (dataForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataForType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend dataForType_IMetInst = get_dataForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		dataForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListForType_IMetInst(){
		return ((propertyListForType_IMetInst != null)
	? (propertyListForType_IMetInst)
	: (propertyListForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyListForType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend propertyListForType_IMetInst = get_propertyListForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		propertyListForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setData_forType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setData_forType_IMetInst(){
		return ((setData_forType_IMetInst != null)
	? (setData_forType_IMetInst)
	: (setData_forType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setData:forType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setData_forType(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend setData_forType_IMetInst = get_setData_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setData_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		setData_forType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDataProvider_forTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDataProvider_forTypes_IMetInst(){
		return ((setDataProvider_forTypes_IMetInst != null)
	? (setDataProvider_forTypes_IMetInst)
	: (setDataProvider_forTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDataProvider:forTypes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setDataProvider_forTypes(final com.apple.jobjc.ID dataProvider, final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend setDataProvider_forTypes_IMetInst = get_setDataProvider_forTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDataProvider_forTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataProvider);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		setDataProvider_forTypes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPropertyList_forType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPropertyList_forType_IMetInst(){
		return ((setPropertyList_forType_IMetInst != null)
	? (setPropertyList_forType_IMetInst)
	: (setPropertyList_forType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPropertyList:forType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setPropertyList_forType(final com.apple.jobjc.ID propertyList, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend setPropertyList_forType_IMetInst = get_setPropertyList_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPropertyList_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyList);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
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

	 public boolean setString_forType(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend setString_forType_IMetInst = get_setString_forType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_forType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
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

	 public com.apple.jobjc.foundation.NSString stringForType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend stringForType_IMetInst = get_stringForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
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

}
