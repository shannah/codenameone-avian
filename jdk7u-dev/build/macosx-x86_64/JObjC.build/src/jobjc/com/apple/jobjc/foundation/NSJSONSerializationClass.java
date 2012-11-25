package com.apple.jobjc.foundation;

public  class NSJSONSerializationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSJSONSerializationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSJSONSerializationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSJSONSerializationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend JSONObjectWithData_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_JSONObjectWithData_options_error_CMetInst(){
		return ((JSONObjectWithData_options_error_CMetInst != null)
	? (JSONObjectWithData_options_error_CMetInst)
	: (JSONObjectWithData_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "JSONObjectWithData:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T JSONObjectWithData_options_error(final com.apple.jobjc.foundation.NSData data, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend JSONObjectWithData_options_error_CMetInst = get_JSONObjectWithData_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		JSONObjectWithData_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		JSONObjectWithData_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend JSONObjectWithStream_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_JSONObjectWithStream_options_error_CMetInst(){
		return ((JSONObjectWithStream_options_error_CMetInst != null)
	? (JSONObjectWithStream_options_error_CMetInst)
	: (JSONObjectWithStream_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "JSONObjectWithStream:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T JSONObjectWithStream_options_error(final com.apple.jobjc.foundation.NSInputStream stream, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend JSONObjectWithStream_options_error_CMetInst = get_JSONObjectWithStream_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		JSONObjectWithStream_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stream);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		JSONObjectWithStream_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithJSONObject_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithJSONObject_options_error_CMetInst(){
		return ((dataWithJSONObject_options_error_CMetInst != null)
	? (dataWithJSONObject_options_error_CMetInst)
	: (dataWithJSONObject_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithJSONObject:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataWithJSONObject_options_error(final com.apple.jobjc.ID obj, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend dataWithJSONObject_options_error_CMetInst = get_dataWithJSONObject_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithJSONObject_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		dataWithJSONObject_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isValidJSONObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isValidJSONObject_CMetInst(){
		return ((isValidJSONObject_CMetInst != null)
	? (isValidJSONObject_CMetInst)
	: (isValidJSONObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isValidJSONObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isValidJSONObject(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend isValidJSONObject_CMetInst = get_isValidJSONObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isValidJSONObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		isValidJSONObject_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeJSONObject_toStream_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeJSONObject_toStream_options_error_CMetInst(){
		return ((writeJSONObject_toStream_options_error_CMetInst != null)
	? (writeJSONObject_toStream_options_error_CMetInst)
	: (writeJSONObject_toStream_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeJSONObject:toStream:options:error:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long writeJSONObject_toStream_options_error(final com.apple.jobjc.ID obj, final com.apple.jobjc.foundation.NSOutputStream stream, final long opt, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writeJSONObject_toStream_options_error_CMetInst = get_writeJSONObject_toStream_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeJSONObject_toStream_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stream);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opt);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writeJSONObject_toStream_options_error_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
