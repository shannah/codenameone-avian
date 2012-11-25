package com.apple.jobjc.foundation;

public  class NSDataClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDataClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDataClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDataClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend data_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_data_CMetInst(){
		return ((data_CMetInst != null)
	? (data_CMetInst)
	: (data_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "data", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T data(){
			final com.apple.jobjc.Invoke.MsgSend data_CMetInst = get_data_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		data_CMetInst.init(nativeBuffer, this);
		data_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithBytes_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithBytes_length_CMetInst(){
		return ((dataWithBytes_length_CMetInst != null)
	? (dataWithBytes_length_CMetInst)
	: (dataWithBytes_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithBytes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithBytes_length(final com.apple.jobjc.Pointer<Void> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend dataWithBytes_length_CMetInst = get_dataWithBytes_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithBytes_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		dataWithBytes_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithBytesNoCopy_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithBytesNoCopy_length_CMetInst(){
		return ((dataWithBytesNoCopy_length_CMetInst != null)
	? (dataWithBytesNoCopy_length_CMetInst)
	: (dataWithBytesNoCopy_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithBytesNoCopy:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithBytesNoCopy_length(final com.apple.jobjc.Pointer<Void> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend dataWithBytesNoCopy_length_CMetInst = get_dataWithBytesNoCopy_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithBytesNoCopy_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		dataWithBytesNoCopy_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithBytesNoCopy_length_freeWhenDone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithBytesNoCopy_length_freeWhenDone_CMetInst(){
		return ((dataWithBytesNoCopy_length_freeWhenDone_CMetInst != null)
	? (dataWithBytesNoCopy_length_freeWhenDone_CMetInst)
	: (dataWithBytesNoCopy_length_freeWhenDone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithBytesNoCopy:length:freeWhenDone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithBytesNoCopy_length_freeWhenDone(final com.apple.jobjc.Pointer<Void> bytes, final long length, final boolean b){
			final com.apple.jobjc.Invoke.MsgSend dataWithBytesNoCopy_length_freeWhenDone_CMetInst = get_dataWithBytesNoCopy_length_freeWhenDone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithBytesNoCopy_length_freeWhenDone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		dataWithBytesNoCopy_length_freeWhenDone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithContentsOfFile_CMetInst(){
		return ((dataWithContentsOfFile_CMetInst != null)
	? (dataWithContentsOfFile_CMetInst)
	: (dataWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend dataWithContentsOfFile_CMetInst = get_dataWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		dataWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithContentsOfFile_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithContentsOfFile_options_error_CMetInst(){
		return ((dataWithContentsOfFile_options_error_CMetInst != null)
	? (dataWithContentsOfFile_options_error_CMetInst)
	: (dataWithContentsOfFile_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithContentsOfFile:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithContentsOfFile_options_error(final com.apple.jobjc.foundation.NSString path, final long readOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend dataWithContentsOfFile_options_error_CMetInst = get_dataWithContentsOfFile_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithContentsOfFile_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		dataWithContentsOfFile_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithContentsOfMappedFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithContentsOfMappedFile_CMetInst(){
		return ((dataWithContentsOfMappedFile_CMetInst != null)
	? (dataWithContentsOfMappedFile_CMetInst)
	: (dataWithContentsOfMappedFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithContentsOfMappedFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithContentsOfMappedFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend dataWithContentsOfMappedFile_CMetInst = get_dataWithContentsOfMappedFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithContentsOfMappedFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		dataWithContentsOfMappedFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithContentsOfURL_CMetInst(){
		return ((dataWithContentsOfURL_CMetInst != null)
	? (dataWithContentsOfURL_CMetInst)
	: (dataWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend dataWithContentsOfURL_CMetInst = get_dataWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		dataWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithContentsOfURL_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithContentsOfURL_options_error_CMetInst(){
		return ((dataWithContentsOfURL_options_error_CMetInst != null)
	? (dataWithContentsOfURL_options_error_CMetInst)
	: (dataWithContentsOfURL_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithContentsOfURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithContentsOfURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long readOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend dataWithContentsOfURL_options_error_CMetInst = get_dataWithContentsOfURL_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithContentsOfURL_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		dataWithContentsOfURL_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithData_CMetInst(){
		return ((dataWithData_CMetInst != null)
	? (dataWithData_CMetInst)
	: (dataWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend dataWithData_CMetInst = get_dataWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		dataWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
