package com.apple.jobjc.foundation;

public  class NSFileHandleClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFileHandleClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFileHandleClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFileHandleClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend fileHandleForReadingAtPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForReadingAtPath_CMetInst(){
		return ((fileHandleForReadingAtPath_CMetInst != null)
	? (fileHandleForReadingAtPath_CMetInst)
	: (fileHandleForReadingAtPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForReadingAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForReadingAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForReadingAtPath_CMetInst = get_fileHandleForReadingAtPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForReadingAtPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileHandleForReadingAtPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForReadingFromURL_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForReadingFromURL_error_CMetInst(){
		return ((fileHandleForReadingFromURL_error_CMetInst != null)
	? (fileHandleForReadingFromURL_error_CMetInst)
	: (fileHandleForReadingFromURL_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForReadingFromURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForReadingFromURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForReadingFromURL_error_CMetInst = get_fileHandleForReadingFromURL_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForReadingFromURL_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		fileHandleForReadingFromURL_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForUpdatingAtPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForUpdatingAtPath_CMetInst(){
		return ((fileHandleForUpdatingAtPath_CMetInst != null)
	? (fileHandleForUpdatingAtPath_CMetInst)
	: (fileHandleForUpdatingAtPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForUpdatingAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForUpdatingAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForUpdatingAtPath_CMetInst = get_fileHandleForUpdatingAtPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForUpdatingAtPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileHandleForUpdatingAtPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForUpdatingURL_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForUpdatingURL_error_CMetInst(){
		return ((fileHandleForUpdatingURL_error_CMetInst != null)
	? (fileHandleForUpdatingURL_error_CMetInst)
	: (fileHandleForUpdatingURL_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForUpdatingURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForUpdatingURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForUpdatingURL_error_CMetInst = get_fileHandleForUpdatingURL_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForUpdatingURL_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		fileHandleForUpdatingURL_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForWritingAtPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForWritingAtPath_CMetInst(){
		return ((fileHandleForWritingAtPath_CMetInst != null)
	? (fileHandleForWritingAtPath_CMetInst)
	: (fileHandleForWritingAtPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForWritingAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForWritingAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForWritingAtPath_CMetInst = get_fileHandleForWritingAtPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForWritingAtPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileHandleForWritingAtPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleForWritingToURL_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleForWritingToURL_error_CMetInst(){
		return ((fileHandleForWritingToURL_error_CMetInst != null)
	? (fileHandleForWritingToURL_error_CMetInst)
	: (fileHandleForWritingToURL_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleForWritingToURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleForWritingToURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend fileHandleForWritingToURL_error_CMetInst = get_fileHandleForWritingToURL_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleForWritingToURL_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		fileHandleForWritingToURL_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleWithNullDevice_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleWithNullDevice_CMetInst(){
		return ((fileHandleWithNullDevice_CMetInst != null)
	? (fileHandleWithNullDevice_CMetInst)
	: (fileHandleWithNullDevice_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleWithNullDevice", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleWithNullDevice(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleWithNullDevice_CMetInst = get_fileHandleWithNullDevice_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleWithNullDevice_CMetInst.init(nativeBuffer, this);
		fileHandleWithNullDevice_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardError_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleWithStandardError_CMetInst(){
		return ((fileHandleWithStandardError_CMetInst != null)
	? (fileHandleWithStandardError_CMetInst)
	: (fileHandleWithStandardError_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleWithStandardError", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleWithStandardError(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardError_CMetInst = get_fileHandleWithStandardError_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleWithStandardError_CMetInst.init(nativeBuffer, this);
		fileHandleWithStandardError_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardInput_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleWithStandardInput_CMetInst(){
		return ((fileHandleWithStandardInput_CMetInst != null)
	? (fileHandleWithStandardInput_CMetInst)
	: (fileHandleWithStandardInput_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleWithStandardInput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleWithStandardInput(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardInput_CMetInst = get_fileHandleWithStandardInput_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleWithStandardInput_CMetInst.init(nativeBuffer, this);
		fileHandleWithStandardInput_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardOutput_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileHandleWithStandardOutput_CMetInst(){
		return ((fileHandleWithStandardOutput_CMetInst != null)
	? (fileHandleWithStandardOutput_CMetInst)
	: (fileHandleWithStandardOutput_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileHandleWithStandardOutput", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileHandleWithStandardOutput(){
			final com.apple.jobjc.Invoke.MsgSend fileHandleWithStandardOutput_CMetInst = get_fileHandleWithStandardOutput_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileHandleWithStandardOutput_CMetInst.init(nativeBuffer, this);
		fileHandleWithStandardOutput_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
