package com.apple.jobjc.foundation;

public  class NSPropertyListSerializationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPropertyListSerializationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPropertyListSerializationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPropertyListSerializationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dataFromPropertyList_format_errorDescription_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataFromPropertyList_format_errorDescription_CMetInst(){
		return ((dataFromPropertyList_format_errorDescription_CMetInst != null)
	? (dataFromPropertyList_format_errorDescription_CMetInst)
	: (dataFromPropertyList_format_errorDescription_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataFromPropertyList:format:errorDescription:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataFromPropertyList_format_errorDescription(final com.apple.jobjc.ID plist, final long format, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> errorString){
			final com.apple.jobjc.Invoke.MsgSend dataFromPropertyList_format_errorDescription_CMetInst = get_dataFromPropertyList_format_errorDescription_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataFromPropertyList_format_errorDescription_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, plist);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, format);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorString);
		dataFromPropertyList_format_errorDescription_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithPropertyList_format_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithPropertyList_format_options_error_CMetInst(){
		return ((dataWithPropertyList_format_options_error_CMetInst != null)
	? (dataWithPropertyList_format_options_error_CMetInst)
	: (dataWithPropertyList_format_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithPropertyList:format:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataWithPropertyList_format_options_error(final com.apple.jobjc.ID plist, final long format, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend dataWithPropertyList_format_options_error_CMetInst = get_dataWithPropertyList_format_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithPropertyList_format_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, plist);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, format);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		dataWithPropertyList_format_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyList_isValidForFormat_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyList_isValidForFormat_CMetInst(){
		return ((propertyList_isValidForFormat_CMetInst != null)
	? (propertyList_isValidForFormat_CMetInst)
	: (propertyList_isValidForFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyList:isValidForFormat:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean propertyList_isValidForFormat(final com.apple.jobjc.ID plist, final long format){
			final com.apple.jobjc.Invoke.MsgSend propertyList_isValidForFormat_CMetInst = get_propertyList_isValidForFormat_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyList_isValidForFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, plist);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, format);
		propertyList_isValidForFormat_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListFromData_mutabilityOption_format_errorDescription_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListFromData_mutabilityOption_format_errorDescription_CMetInst(){
		return ((propertyListFromData_mutabilityOption_format_errorDescription_CMetInst != null)
	? (propertyListFromData_mutabilityOption_format_errorDescription_CMetInst)
	: (propertyListFromData_mutabilityOption_format_errorDescription_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListFromData:mutabilityOption:format:errorDescription:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyListFromData_mutabilityOption_format_errorDescription(final com.apple.jobjc.foundation.NSData data, final long opt, final com.apple.jobjc.Pointer<java.lang.Long> format, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> errorString){
			final com.apple.jobjc.Invoke.MsgSend propertyListFromData_mutabilityOption_format_errorDescription_CMetInst = get_propertyListFromData_mutabilityOption_format_errorDescription_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListFromData_mutabilityOption_format_errorDescription_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, errorString);
		propertyListFromData_mutabilityOption_format_errorDescription_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListWithData_options_format_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListWithData_options_format_error_CMetInst(){
		return ((propertyListWithData_options_format_error_CMetInst != null)
	? (propertyListWithData_options_format_error_CMetInst)
	: (propertyListWithData_options_format_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListWithData:options:format:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyListWithData_options_format_error(final com.apple.jobjc.foundation.NSData data, final long opt, final com.apple.jobjc.Pointer<java.lang.Long> format, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend propertyListWithData_options_format_error_CMetInst = get_propertyListWithData_options_format_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListWithData_options_format_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		propertyListWithData_options_format_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyListWithStream_options_format_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyListWithStream_options_format_error_CMetInst(){
		return ((propertyListWithStream_options_format_error_CMetInst != null)
	? (propertyListWithStream_options_format_error_CMetInst)
	: (propertyListWithStream_options_format_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyListWithStream:options:format:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyListWithStream_options_format_error(final com.apple.jobjc.foundation.NSInputStream stream, final long opt, final com.apple.jobjc.Pointer<java.lang.Long> format, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend propertyListWithStream_options_format_error_CMetInst = get_propertyListWithStream_options_format_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyListWithStream_options_format_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stream);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		propertyListWithStream_options_format_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writePropertyList_toStream_format_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writePropertyList_toStream_format_options_error_CMetInst(){
		return ((writePropertyList_toStream_format_options_error_CMetInst != null)
	? (writePropertyList_toStream_format_options_error_CMetInst)
	: (writePropertyList_toStream_format_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writePropertyList:toStream:format:options:error:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long writePropertyList_toStream_format_options_error(final com.apple.jobjc.ID plist, final com.apple.jobjc.foundation.NSOutputStream stream, final long format, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writePropertyList_toStream_format_options_error_CMetInst = get_writePropertyList_toStream_format_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writePropertyList_toStream_format_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, plist);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stream);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, format);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writePropertyList_toStream_format_options_error_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
