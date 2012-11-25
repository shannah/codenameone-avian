package com.apple.jobjc.foundation;

public  class NSData extends com.apple.jobjc.foundation.NSObject {
	public NSData(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSData(final NSData obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend bytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bytes_IMetInst(){
		return ((bytes_IMetInst != null)
	? (bytes_IMetInst)
	: (bytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bytes", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> bytes(){
			final com.apple.jobjc.Invoke.MsgSend bytes_IMetInst = get_bytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bytes_IMetInst.init(nativeBuffer, this);
		bytes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBytes_IMetInst(){
		return ((getBytes_IMetInst != null)
	? (getBytes_IMetInst)
	: (getBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getBytes(final com.apple.jobjc.Pointer<Void> buffer){
			final com.apple.jobjc.Invoke.MsgSend getBytes_IMetInst = get_getBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		getBytes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getBytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBytes_length_IMetInst(){
		return ((getBytes_length_IMetInst != null)
	? (getBytes_length_IMetInst)
	: (getBytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBytes:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void getBytes_length(final com.apple.jobjc.Pointer<Void> buffer, final long length){
			final com.apple.jobjc.Invoke.MsgSend getBytes_length_IMetInst = get_getBytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		getBytes_length_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getBytes_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBytes_range_IMetInst(){
		return ((getBytes_range_IMetInst != null)
	? (getBytes_range_IMetInst)
	: (getBytes_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBytes:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void getBytes_range(final com.apple.jobjc.Pointer<Void> buffer, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend getBytes_range_IMetInst = get_getBytes_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBytes_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		getBytes_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytes_length_IMetInst(){
		return ((initWithBytes_length_IMetInst != null)
	? (initWithBytes_length_IMetInst)
	: (initWithBytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytes:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytes_length(final com.apple.jobjc.Pointer<Void> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithBytes_length_IMetInst = get_initWithBytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithBytes_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytesNoCopy_length_IMetInst(){
		return ((initWithBytesNoCopy_length_IMetInst != null)
	? (initWithBytesNoCopy_length_IMetInst)
	: (initWithBytesNoCopy_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytesNoCopy:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytesNoCopy_length(final com.apple.jobjc.Pointer<Void> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_IMetInst = get_initWithBytesNoCopy_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytesNoCopy_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithBytesNoCopy_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_freeWhenDone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytesNoCopy_length_freeWhenDone_IMetInst(){
		return ((initWithBytesNoCopy_length_freeWhenDone_IMetInst != null)
	? (initWithBytesNoCopy_length_freeWhenDone_IMetInst)
	: (initWithBytesNoCopy_length_freeWhenDone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytesNoCopy:length:freeWhenDone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytesNoCopy_length_freeWhenDone(final com.apple.jobjc.Pointer<Void> bytes, final long length, final boolean b){
			final com.apple.jobjc.Invoke.MsgSend initWithBytesNoCopy_length_freeWhenDone_IMetInst = get_initWithBytesNoCopy_length_freeWhenDone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytesNoCopy_length_freeWhenDone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		initWithBytesNoCopy_length_freeWhenDone_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_IMetInst(){
		return ((initWithContentsOfFile_IMetInst != null)
	? (initWithContentsOfFile_IMetInst)
	: (initWithContentsOfFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_IMetInst = get_initWithContentsOfFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithContentsOfFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_options_error_IMetInst(){
		return ((initWithContentsOfFile_options_error_IMetInst != null)
	? (initWithContentsOfFile_options_error_IMetInst)
	: (initWithContentsOfFile_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile_options_error(final com.apple.jobjc.foundation.NSString path, final long readOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_options_error_IMetInst = get_initWithContentsOfFile_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		initWithContentsOfFile_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfMappedFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfMappedFile_IMetInst(){
		return ((initWithContentsOfMappedFile_IMetInst != null)
	? (initWithContentsOfMappedFile_IMetInst)
	: (initWithContentsOfMappedFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfMappedFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfMappedFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfMappedFile_IMetInst = get_initWithContentsOfMappedFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfMappedFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithContentsOfMappedFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_IMetInst(){
		return ((initWithContentsOfURL_IMetInst != null)
	? (initWithContentsOfURL_IMetInst)
	: (initWithContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_IMetInst = get_initWithContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithContentsOfURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_options_error_IMetInst(){
		return ((initWithContentsOfURL_options_error_IMetInst != null)
	? (initWithContentsOfURL_options_error_IMetInst)
	: (initWithContentsOfURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long readOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_options_error_IMetInst = get_initWithContentsOfURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		initWithContentsOfURL_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToData_IMetInst(){
		return ((isEqualToData_IMetInst != null)
	? (isEqualToData_IMetInst)
	: (isEqualToData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToData(final com.apple.jobjc.foundation.NSData other){
			final com.apple.jobjc.Invoke.MsgSend isEqualToData_IMetInst = get_isEqualToData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		isEqualToData_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_length_IMetInst(){
		return ((length_IMetInst != null)
	? (length_IMetInst)
	: (length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "length", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long length(){
			final com.apple.jobjc.Invoke.MsgSend length_IMetInst = get_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		length_IMetInst.init(nativeBuffer, this);
		length_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeOfData_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeOfData_options_range_IMetInst(){
		return ((rangeOfData_options_range_IMetInst != null)
	? (rangeOfData_options_range_IMetInst)
	: (rangeOfData_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeOfData:options:range:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeOfData_options_range(final com.apple.jobjc.foundation.NSData dataToFind, final long mask, final com.apple.jobjc.foundation.NSRange searchRange){
			final com.apple.jobjc.Invoke.MsgSend rangeOfData_options_range_IMetInst = get_rangeOfData_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeOfData_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dataToFind);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeOfData_options_range_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subdataWithRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subdataWithRange_IMetInst(){
		return ((subdataWithRange_IMetInst != null)
	? (subdataWithRange_IMetInst)
	: (subdataWithRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subdataWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSData subdataWithRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend subdataWithRange_IMetInst = get_subdataWithRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subdataWithRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		subdataWithRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_IMetInst(){
		return ((writeToFile_atomically_IMetInst != null)
	? (writeToFile_atomically_IMetInst)
	: (writeToFile_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToFile_atomically(final com.apple.jobjc.foundation.NSString path, final boolean useAuxiliaryFile){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_IMetInst = get_writeToFile_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAuxiliaryFile);
		writeToFile_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_options_error_IMetInst(){
		return ((writeToFile_options_error_IMetInst != null)
	? (writeToFile_options_error_IMetInst)
	: (writeToFile_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:options:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToFile_options_error(final com.apple.jobjc.foundation.NSString path, final long writeOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_options_error_IMetInst = get_writeToFile_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, writeOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		writeToFile_options_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_atomically_IMetInst(){
		return ((writeToURL_atomically_IMetInst != null)
	? (writeToURL_atomically_IMetInst)
	: (writeToURL_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToURL_atomically(final com.apple.jobjc.foundation.NSURL url, final boolean atomically){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_atomically_IMetInst = get_writeToURL_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, atomically);
		writeToURL_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_options_error_IMetInst(){
		return ((writeToURL_options_error_IMetInst != null)
	? (writeToURL_options_error_IMetInst)
	: (writeToURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:options:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long writeOptionsMask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> errorPtr){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_options_error_IMetInst = get_writeToURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, writeOptionsMask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorPtr);
		writeToURL_options_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
