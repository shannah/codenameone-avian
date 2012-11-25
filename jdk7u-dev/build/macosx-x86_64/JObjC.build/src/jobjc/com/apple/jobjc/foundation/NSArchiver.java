package com.apple.jobjc.foundation;

public  class NSArchiver extends com.apple.jobjc.foundation.NSCoder {
	public NSArchiver(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSArchiver(final NSArchiver obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend archiverData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiverData_IMetInst(){
		return ((archiverData_IMetInst != null)
	? (archiverData_IMetInst)
	: (archiverData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiverData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableData archiverData(){
			final com.apple.jobjc.Invoke.MsgSend archiverData_IMetInst = get_archiverData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiverData_IMetInst.init(nativeBuffer, this);
		archiverData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableData returnValue = (com.apple.jobjc.foundation.NSMutableData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classNameEncodedForTrueClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNameEncodedForTrueClassName_IMetInst(){
		return ((classNameEncodedForTrueClassName_IMetInst != null)
	? (classNameEncodedForTrueClassName_IMetInst)
	: (classNameEncodedForTrueClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classNameEncodedForTrueClassName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString classNameEncodedForTrueClassName(final com.apple.jobjc.foundation.NSString trueName){
			final com.apple.jobjc.Invoke.MsgSend classNameEncodedForTrueClassName_IMetInst = get_classNameEncodedForTrueClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNameEncodedForTrueClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trueName);
		classNameEncodedForTrueClassName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeClassName_intoClassName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeClassName_intoClassName_IMetInst(){
		return ((encodeClassName_intoClassName_IMetInst != null)
	? (encodeClassName_intoClassName_IMetInst)
	: (encodeClassName_intoClassName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeClassName:intoClassName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeClassName_intoClassName(final com.apple.jobjc.foundation.NSString trueName, final com.apple.jobjc.foundation.NSString inArchiveName){
			final com.apple.jobjc.Invoke.MsgSend encodeClassName_intoClassName_IMetInst = get_encodeClassName_intoClassName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeClassName_intoClassName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trueName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inArchiveName);
		encodeClassName_intoClassName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeConditionalObject_IMetInst(){
		return ((encodeConditionalObject_IMetInst != null)
	? (encodeConditionalObject_IMetInst)
	: (encodeConditionalObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeConditionalObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeConditionalObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_IMetInst = get_encodeConditionalObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeConditionalObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		encodeConditionalObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRootObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRootObject_IMetInst(){
		return ((encodeRootObject_IMetInst != null)
	? (encodeRootObject_IMetInst)
	: (encodeRootObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRootObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeRootObject(final com.apple.jobjc.ID rootObject){
			final com.apple.jobjc.Invoke.MsgSend encodeRootObject_IMetInst = get_encodeRootObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRootObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rootObject);
		encodeRootObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initForWritingWithMutableData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForWritingWithMutableData_IMetInst(){
		return ((initForWritingWithMutableData_IMetInst != null)
	? (initForWritingWithMutableData_IMetInst)
	: (initForWritingWithMutableData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForWritingWithMutableData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForWritingWithMutableData(final com.apple.jobjc.foundation.NSMutableData mdata){
			final com.apple.jobjc.Invoke.MsgSend initForWritingWithMutableData_IMetInst = get_initForWritingWithMutableData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForWritingWithMutableData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mdata);
		initForWritingWithMutableData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

}
