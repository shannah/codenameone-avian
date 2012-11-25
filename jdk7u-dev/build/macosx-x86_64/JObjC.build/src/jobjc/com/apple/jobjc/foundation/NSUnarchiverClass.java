package com.apple.jobjc.foundation;

public  class NSUnarchiverClass extends com.apple.jobjc.foundation.NSCoderClass {
	public NSUnarchiverClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUnarchiverClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUnarchiverClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classNameDecodedForArchiveClassName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNameDecodedForArchiveClassName_CMetInst(){
		return ((classNameDecodedForArchiveClassName_CMetInst != null)
	? (classNameDecodedForArchiveClassName_CMetInst)
	: (classNameDecodedForArchiveClassName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classNameDecodedForArchiveClassName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString classNameDecodedForArchiveClassName(final com.apple.jobjc.foundation.NSString inArchiveName){
			final com.apple.jobjc.Invoke.MsgSend classNameDecodedForArchiveClassName_CMetInst = get_classNameDecodedForArchiveClassName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNameDecodedForArchiveClassName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inArchiveName);
		classNameDecodedForArchiveClassName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend decodeClassName_asClassName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_decodeClassName_asClassName_CMetInst(){
		return ((decodeClassName_asClassName_CMetInst != null)
	? (decodeClassName_asClassName_CMetInst)
	: (decodeClassName_asClassName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "decodeClassName:asClassName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void decodeClassName_asClassName(final com.apple.jobjc.foundation.NSString inArchiveName, final com.apple.jobjc.foundation.NSString trueName){
			final com.apple.jobjc.Invoke.MsgSend decodeClassName_asClassName_CMetInst = get_decodeClassName_asClassName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		decodeClassName_asClassName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inArchiveName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trueName);
		decodeClassName_asClassName_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiveObjectWithData_CMetInst(){
		return ((unarchiveObjectWithData_CMetInst != null)
	? (unarchiveObjectWithData_CMetInst)
	: (unarchiveObjectWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiveObjectWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T unarchiveObjectWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithData_CMetInst = get_unarchiveObjectWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiveObjectWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		unarchiveObjectWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unarchiveObjectWithFile_CMetInst(){
		return ((unarchiveObjectWithFile_CMetInst != null)
	? (unarchiveObjectWithFile_CMetInst)
	: (unarchiveObjectWithFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unarchiveObjectWithFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T unarchiveObjectWithFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend unarchiveObjectWithFile_CMetInst = get_unarchiveObjectWithFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unarchiveObjectWithFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		unarchiveObjectWithFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
