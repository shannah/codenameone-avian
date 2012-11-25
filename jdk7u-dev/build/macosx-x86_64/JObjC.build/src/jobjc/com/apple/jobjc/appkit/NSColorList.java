package com.apple.jobjc.appkit;

public  class NSColorList extends com.apple.jobjc.foundation.NSObject {
	public NSColorList(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColorList(final NSColorList obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend colorWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorWithKey_IMetInst(){
		return ((colorWithKey_IMetInst != null)
	? (colorWithKey_IMetInst)
	: (colorWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor colorWithKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend colorWithKey_IMetInst = get_colorWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		colorWithKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_IMetInst(){
		return ((initWithName_IMetInst != null)
	? (initWithName_IMetInst)
	: (initWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst = get_initWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_fromFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_fromFile_IMetInst(){
		return ((initWithName_fromFile_IMetInst != null)
	? (initWithName_fromFile_IMetInst)
	: (initWithName_fromFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:fromFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName_fromFile(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithName_fromFile_IMetInst = get_initWithName_fromFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_fromFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithName_fromFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertColor_key_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertColor_key_atIndex_IMetInst(){
		return ((insertColor_key_atIndex_IMetInst != null)
	? (insertColor_key_atIndex_IMetInst)
	: (insertColor_key_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertColor:key:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertColor_key_atIndex(final com.apple.jobjc.appkit.NSColor color, final com.apple.jobjc.foundation.NSString key, final long loc){
			final com.apple.jobjc.Invoke.MsgSend insertColor_key_atIndex_IMetInst = get_insertColor_key_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertColor_key_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, loc);
		insertColor_key_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend removeColorWithKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeColorWithKey_IMetInst(){
		return ((removeColorWithKey_IMetInst != null)
	? (removeColorWithKey_IMetInst)
	: (removeColorWithKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeColorWithKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeColorWithKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend removeColorWithKey_IMetInst = get_removeColorWithKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeColorWithKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		removeColorWithKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFile_IMetInst(){
		return ((removeFile_IMetInst != null)
	? (removeFile_IMetInst)
	: (removeFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFile", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeFile(){
			final com.apple.jobjc.Invoke.MsgSend removeFile_IMetInst = get_removeFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFile_IMetInst.init(nativeBuffer, this);
		removeFile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColor_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColor_forKey_IMetInst(){
		return ((setColor_forKey_IMetInst != null)
	? (setColor_forKey_IMetInst)
	: (setColor_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColor:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColor_forKey(final com.apple.jobjc.appkit.NSColor color, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setColor_forKey_IMetInst = get_setColor_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColor_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setColor_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_IMetInst(){
		return ((writeToFile_IMetInst != null)
	? (writeToFile_IMetInst)
	: (writeToFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeToFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_IMetInst = get_writeToFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		writeToFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
