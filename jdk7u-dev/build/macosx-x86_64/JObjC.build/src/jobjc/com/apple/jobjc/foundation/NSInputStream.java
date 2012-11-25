package com.apple.jobjc.foundation;

public  class NSInputStream extends com.apple.jobjc.foundation.NSStream {
	public NSInputStream(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSInputStream(final NSInputStream obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend getBuffer_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getBuffer_length_IMetInst(){
		return ((getBuffer_length_IMetInst != null)
	? (getBuffer_length_IMetInst)
	: (getBuffer_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getBuffer:length:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getBuffer_length(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<java.lang.Byte>> buffer, final com.apple.jobjc.Pointer<java.lang.Long> len){
			final com.apple.jobjc.Invoke.MsgSend getBuffer_length_IMetInst = get_getBuffer_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getBuffer_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, len);
		getBuffer_length_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasBytesAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasBytesAvailable_IMetInst(){
		return ((hasBytesAvailable_IMetInst != null)
	? (hasBytesAvailable_IMetInst)
	: (hasBytesAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasBytesAvailable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasBytesAvailable(){
			final com.apple.jobjc.Invoke.MsgSend hasBytesAvailable_IMetInst = get_hasBytesAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasBytesAvailable_IMetInst.init(nativeBuffer, this);
		hasBytesAvailable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithFileAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFileAtPath_IMetInst(){
		return ((initWithFileAtPath_IMetInst != null)
	? (initWithFileAtPath_IMetInst)
	: (initWithFileAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFileAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithFileAtPath_IMetInst = get_initWithFileAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFileAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithFileAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_IMetInst(){
		return ((initWithURL_IMetInst != null)
	? (initWithURL_IMetInst)
	: (initWithURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst = get_initWithURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend read_maxLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_read_maxLength_IMetInst(){
		return ((read_maxLength_IMetInst != null)
	? (read_maxLength_IMetInst)
	: (read_maxLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "read:maxLength:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long read_maxLength(final com.apple.jobjc.Pointer<java.lang.Byte> buffer, final long len){
			final com.apple.jobjc.Invoke.MsgSend read_maxLength_IMetInst = get_read_maxLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		read_maxLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		read_maxLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
