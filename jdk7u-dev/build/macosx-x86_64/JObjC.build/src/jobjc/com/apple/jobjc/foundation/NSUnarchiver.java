package com.apple.jobjc.foundation;

public  class NSUnarchiver extends com.apple.jobjc.foundation.NSCoder {
	public NSUnarchiver(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUnarchiver(final NSUnarchiver obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classNameDecodedForArchiveClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNameDecodedForArchiveClassName_IMetInst(){
		return ((classNameDecodedForArchiveClassName_IMetInst != null)
	? (classNameDecodedForArchiveClassName_IMetInst)
	: (classNameDecodedForArchiveClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classNameDecodedForArchiveClassName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString classNameDecodedForArchiveClassName(final com.apple.jobjc.foundation.NSString inArchiveName){
			final com.apple.jobjc.Invoke.MsgSend classNameDecodedForArchiveClassName_IMetInst = get_classNameDecodedForArchiveClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNameDecodedForArchiveClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inArchiveName);
		classNameDecodedForArchiveClassName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeClassName_asClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeClassName_asClassName_IMetInst(){
		return ((decodeClassName_asClassName_IMetInst != null)
	? (decodeClassName_asClassName_IMetInst)
	: (decodeClassName_asClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeClassName:asClassName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void decodeClassName_asClassName(final com.apple.jobjc.foundation.NSString inArchiveName, final com.apple.jobjc.foundation.NSString trueName){
			final com.apple.jobjc.Invoke.MsgSend decodeClassName_asClassName_IMetInst = get_decodeClassName_asClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeClassName_asClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inArchiveName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trueName);
		decodeClassName_asClassName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initForReadingWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForReadingWithData_IMetInst(){
		return ((initForReadingWithData_IMetInst != null)
	? (initForReadingWithData_IMetInst)
	: (initForReadingWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForReadingWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForReadingWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initForReadingWithData_IMetInst = get_initForReadingWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForReadingWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initForReadingWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAtEnd_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAtEnd_IMetInst(){
		return ((isAtEnd_IMetInst != null)
	? (isAtEnd_IMetInst)
	: (isAtEnd_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAtEnd", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAtEnd(){
			final com.apple.jobjc.Invoke.MsgSend isAtEnd_IMetInst = get_isAtEnd_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAtEnd_IMetInst.init(nativeBuffer, this);
		isAtEnd_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectZone_IMetInst(){
		return ((objectZone_IMetInst != null)
	? (objectZone_IMetInst)
	: (objectZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectZone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> objectZone(){
			final com.apple.jobjc.Invoke.MsgSend objectZone_IMetInst = get_objectZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectZone_IMetInst.init(nativeBuffer, this);
		objectZone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceObject_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceObject_withObject_IMetInst(){
		return ((replaceObject_withObject_IMetInst != null)
	? (replaceObject_withObject_IMetInst)
	: (replaceObject_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceObject:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceObject_withObject(final com.apple.jobjc.ID object, final com.apple.jobjc.ID newObject){
			final com.apple.jobjc.Invoke.MsgSend replaceObject_withObject_IMetInst = get_replaceObject_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceObject_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newObject);
		replaceObject_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectZone_IMetInst(){
		return ((setObjectZone_IMetInst != null)
	? (setObjectZone_IMetInst)
	: (setObjectZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setObjectZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend setObjectZone_IMetInst = get_setObjectZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		setObjectZone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemVersion_IMetInst(){
		return ((systemVersion_IMetInst != null)
	? (systemVersion_IMetInst)
	: (systemVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemVersion", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int systemVersion(){
			final com.apple.jobjc.Invoke.MsgSend systemVersion_IMetInst = get_systemVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemVersion_IMetInst.init(nativeBuffer, this);
		systemVersion_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

}
