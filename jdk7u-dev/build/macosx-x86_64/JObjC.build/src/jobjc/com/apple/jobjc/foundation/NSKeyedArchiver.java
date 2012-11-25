package com.apple.jobjc.foundation;

public  class NSKeyedArchiver extends com.apple.jobjc.foundation.NSCoder {
	public NSKeyedArchiver(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSKeyedArchiver(final NSKeyedArchiver obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classNameForClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNameForClass_IMetInst(){
		return ((classNameForClass_IMetInst != null)
	? (classNameForClass_IMetInst)
	: (classNameForClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classNameForClass:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString classNameForClass(final com.apple.jobjc.NSClass cls){
			final com.apple.jobjc.Invoke.MsgSend classNameForClass_IMetInst = get_classNameForClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNameForClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, cls);
		classNameForClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBool_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBool_forKey_IMetInst(){
		return ((encodeBool_forKey_IMetInst != null)
	? (encodeBool_forKey_IMetInst)
	: (encodeBool_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBool:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeBool_forKey(final boolean boolv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeBool_forKey_IMetInst = get_encodeBool_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBool_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, boolv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeBool_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeBytes_length_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeBytes_length_forKey_IMetInst(){
		return ((encodeBytes_length_forKey_IMetInst != null)
	? (encodeBytes_length_forKey_IMetInst)
	: (encodeBytes_length_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeBytes:length:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeBytes_length_forKey(final com.apple.jobjc.Pointer<java.lang.Byte> bytesp, final long lenv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeBytes_length_forKey_IMetInst = get_encodeBytes_length_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeBytes_length_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytesp);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, lenv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeBytes_length_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeConditionalObject_forKey_IMetInst(){
		return ((encodeConditionalObject_forKey_IMetInst != null)
	? (encodeConditionalObject_forKey_IMetInst)
	: (encodeConditionalObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeConditionalObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeConditionalObject_forKey(final com.apple.jobjc.ID objv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeConditionalObject_forKey_IMetInst = get_encodeConditionalObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeConditionalObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeConditionalObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeDouble_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeDouble_forKey_IMetInst(){
		return ((encodeDouble_forKey_IMetInst != null)
	? (encodeDouble_forKey_IMetInst)
	: (encodeDouble_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeDouble:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeDouble_forKey(final double realv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeDouble_forKey_IMetInst = get_encodeDouble_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeDouble_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, realv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeDouble_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeFloat_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeFloat_forKey_IMetInst(){
		return ((encodeFloat_forKey_IMetInst != null)
	? (encodeFloat_forKey_IMetInst)
	: (encodeFloat_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeFloat:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeFloat_forKey(final float realv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeFloat_forKey_IMetInst = get_encodeFloat_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeFloat_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, realv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeFloat_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt32_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt32_forKey_IMetInst(){
		return ((encodeInt32_forKey_IMetInst != null)
	? (encodeInt32_forKey_IMetInst)
	: (encodeInt32_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt32:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt32_forKey(final int intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt32_forKey_IMetInst = get_encodeInt32_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt32_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt32_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt64_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt64_forKey_IMetInst(){
		return ((encodeInt64_forKey_IMetInst != null)
	? (encodeInt64_forKey_IMetInst)
	: (encodeInt64_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt64:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt64_forKey(final long intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt64_forKey_IMetInst = get_encodeInt64_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt64_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SLongLongCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt64_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeInt_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeInt_forKey_IMetInst(){
		return ((encodeInt_forKey_IMetInst != null)
	? (encodeInt_forKey_IMetInst)
	: (encodeInt_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeInt:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeInt_forKey(final int intv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeInt_forKey_IMetInst = get_encodeInt_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeInt_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, intv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeInt_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeObject_forKey_IMetInst(){
		return ((encodeObject_forKey_IMetInst != null)
	? (encodeObject_forKey_IMetInst)
	: (encodeObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeObject_forKey(final com.apple.jobjc.ID objv, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend encodeObject_forKey_IMetInst = get_encodeObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objv);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		encodeObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend finishEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finishEncoding_IMetInst(){
		return ((finishEncoding_IMetInst != null)
	? (finishEncoding_IMetInst)
	: (finishEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finishEncoding", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finishEncoding(){
			final com.apple.jobjc.Invoke.MsgSend finishEncoding_IMetInst = get_finishEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finishEncoding_IMetInst.init(nativeBuffer, this);
		finishEncoding_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initForWritingWithMutableData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForWritingWithMutableData_IMetInst(){
		return ((initForWritingWithMutableData_IMetInst != null)
	? (initForWritingWithMutableData_IMetInst)
	: (initForWritingWithMutableData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForWritingWithMutableData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForWritingWithMutableData(final com.apple.jobjc.foundation.NSMutableData data){
			final com.apple.jobjc.Invoke.MsgSend initForWritingWithMutableData_IMetInst = get_initForWritingWithMutableData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForWritingWithMutableData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		initForWritingWithMutableData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outputFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outputFormat_IMetInst(){
		return ((outputFormat_IMetInst != null)
	? (outputFormat_IMetInst)
	: (outputFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outputFormat", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long outputFormat(){
			final com.apple.jobjc.Invoke.MsgSend outputFormat_IMetInst = get_outputFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outputFormat_IMetInst.init(nativeBuffer, this);
		outputFormat_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setClassName_forClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClassName_forClass_IMetInst(){
		return ((setClassName_forClass_IMetInst != null)
	? (setClassName_forClass_IMetInst)
	: (setClassName_forClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClassName:forClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setClassName_forClass(final com.apple.jobjc.foundation.NSString codedName, final com.apple.jobjc.NSClass cls){
			final com.apple.jobjc.Invoke.MsgSend setClassName_forClass_IMetInst = get_setClassName_forClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClassName_forClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, codedName);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, cls);
		setClassName_forClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOutputFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOutputFormat_IMetInst(){
		return ((setOutputFormat_IMetInst != null)
	? (setOutputFormat_IMetInst)
	: (setOutputFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOutputFormat:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setOutputFormat(final long format){
			final com.apple.jobjc.Invoke.MsgSend setOutputFormat_IMetInst = get_setOutputFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOutputFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, format);
		setOutputFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

}
