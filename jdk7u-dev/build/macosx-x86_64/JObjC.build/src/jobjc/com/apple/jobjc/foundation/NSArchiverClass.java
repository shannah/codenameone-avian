package com.apple.jobjc.foundation;

public  class NSArchiverClass extends com.apple.jobjc.foundation.NSCoderClass {
	public NSArchiverClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSArchiverClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSArchiverClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend archiveRootObject_toFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archiveRootObject_toFile_CMetInst(){
		return ((archiveRootObject_toFile_CMetInst != null)
	? (archiveRootObject_toFile_CMetInst)
	: (archiveRootObject_toFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archiveRootObject:toFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean archiveRootObject_toFile(final com.apple.jobjc.ID rootObject, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend archiveRootObject_toFile_CMetInst = get_archiveRootObject_toFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archiveRootObject_toFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rootObject);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		archiveRootObject_toFile_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend archivedDataWithRootObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_archivedDataWithRootObject_CMetInst(){
		return ((archivedDataWithRootObject_CMetInst != null)
	? (archivedDataWithRootObject_CMetInst)
	: (archivedDataWithRootObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "archivedDataWithRootObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData archivedDataWithRootObject(final com.apple.jobjc.ID rootObject){
			final com.apple.jobjc.Invoke.MsgSend archivedDataWithRootObject_CMetInst = get_archivedDataWithRootObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		archivedDataWithRootObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rootObject);
		archivedDataWithRootObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
