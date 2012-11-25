package com.apple.jobjc.foundation;

public  class NSUbiquitousKeyValueStore extends com.apple.jobjc.foundation.NSObject {
	public NSUbiquitousKeyValueStore(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUbiquitousKeyValueStore(final NSUbiquitousKeyValueStore obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arrayForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayForKey_IMetInst(){
		return ((arrayForKey_IMetInst != null)
	? (arrayForKey_IMetInst)
	: (arrayForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrayForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend arrayForKey_IMetInst = get_arrayForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		arrayForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boolForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boolForKey_IMetInst(){
		return ((boolForKey_IMetInst != null)
	? (boolForKey_IMetInst)
	: (boolForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boolForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean boolForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend boolForKey_IMetInst = get_boolForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boolForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		boolForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataForKey_IMetInst(){
		return ((dataForKey_IMetInst != null)
	? (dataForKey_IMetInst)
	: (dataForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend dataForKey_IMetInst = get_dataForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		dataForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryForKey_IMetInst(){
		return ((dictionaryForKey_IMetInst != null)
	? (dictionaryForKey_IMetInst)
	: (dictionaryForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend dictionaryForKey_IMetInst = get_dictionaryForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		dictionaryForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryRepresentation_IMetInst(){
		return ((dictionaryRepresentation_IMetInst != null)
	? (dictionaryRepresentation_IMetInst)
	: (dictionaryRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst = get_dictionaryRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryRepresentation_IMetInst.init(nativeBuffer, this);
		dictionaryRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleForKey_IMetInst(){
		return ((doubleForKey_IMetInst != null)
	? (doubleForKey_IMetInst)
	: (doubleForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleForKey:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double doubleForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend doubleForKey_IMetInst = get_doubleForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		doubleForKey_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend longLongForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_longLongForKey_IMetInst(){
		return ((longLongForKey_IMetInst != null)
	? (longLongForKey_IMetInst)
	: (longLongForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "longLongForKey:", com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long longLongForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend longLongForKey_IMetInst = get_longLongForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		longLongForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		longLongForKey_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectForKey_IMetInst(){
		return ((removeObjectForKey_IMetInst != null)
	? (removeObjectForKey_IMetInst)
	: (removeObjectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst = get_removeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		removeObjectForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setArray_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setArray_forKey_IMetInst(){
		return ((setArray_forKey_IMetInst != null)
	? (setArray_forKey_IMetInst)
	: (setArray_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setArray:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setArray_forKey(final com.apple.jobjc.foundation.NSArray anArray, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setArray_forKey_IMetInst = get_setArray_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setArray_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setArray_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBool_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBool_forKey_IMetInst(){
		return ((setBool_forKey_IMetInst != null)
	? (setBool_forKey_IMetInst)
	: (setBool_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBool:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBool_forKey(final boolean value, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setBool_forKey_IMetInst = get_setBool_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBool_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setBool_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setData_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setData_forKey_IMetInst(){
		return ((setData_forKey_IMetInst != null)
	? (setData_forKey_IMetInst)
	: (setData_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setData:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setData_forKey(final com.apple.jobjc.foundation.NSData aData, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setData_forKey_IMetInst = get_setData_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setData_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aData);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setData_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDictionary_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDictionary_forKey_IMetInst(){
		return ((setDictionary_forKey_IMetInst != null)
	? (setDictionary_forKey_IMetInst)
	: (setDictionary_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDictionary:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDictionary_forKey(final com.apple.jobjc.foundation.NSDictionary aDictionary, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setDictionary_forKey_IMetInst = get_setDictionary_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDictionary_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aDictionary);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setDictionary_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDouble_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDouble_forKey_IMetInst(){
		return ((setDouble_forKey_IMetInst != null)
	? (setDouble_forKey_IMetInst)
	: (setDouble_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDouble:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDouble_forKey(final double value, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setDouble_forKey_IMetInst = get_setDouble_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDouble_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setDouble_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLongLong_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLongLong_forKey_IMetInst(){
		return ((setLongLong_forKey_IMetInst != null)
	? (setLongLong_forKey_IMetInst)
	: (setLongLong_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLongLong:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLongLong_forKey(final long value, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setLongLong_forKey_IMetInst = get_setLongLong_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLongLong_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setLongLong_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKey_IMetInst(){
		return ((setObject_forKey_IMetInst != null)
	? (setObject_forKey_IMetInst)
	: (setObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObject_forKey(final com.apple.jobjc.ID anObject, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst = get_setObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setString_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setString_forKey_IMetInst(){
		return ((setString_forKey_IMetInst != null)
	? (setString_forKey_IMetInst)
	: (setString_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setString:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setString_forKey(final com.apple.jobjc.foundation.NSString aString, final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend setString_forKey_IMetInst = get_setString_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		setString_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringForKey_IMetInst(){
		return ((stringForKey_IMetInst != null)
	? (stringForKey_IMetInst)
	: (stringForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringForKey(final com.apple.jobjc.foundation.NSString aKey){
			final com.apple.jobjc.Invoke.MsgSend stringForKey_IMetInst = get_stringForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKey);
		stringForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend synchronize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_synchronize_IMetInst(){
		return ((synchronize_IMetInst != null)
	? (synchronize_IMetInst)
	: (synchronize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "synchronize", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean synchronize(){
			final com.apple.jobjc.Invoke.MsgSend synchronize_IMetInst = get_synchronize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		synchronize_IMetInst.init(nativeBuffer, this);
		synchronize_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
