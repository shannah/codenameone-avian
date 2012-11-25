package com.apple.jobjc.foundation;

public  class NSOutputStream extends com.apple.jobjc.foundation.NSStream {
	public NSOutputStream(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOutputStream(final NSOutputStream obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend hasSpaceAvailable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasSpaceAvailable_IMetInst(){
		return ((hasSpaceAvailable_IMetInst != null)
	? (hasSpaceAvailable_IMetInst)
	: (hasSpaceAvailable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasSpaceAvailable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasSpaceAvailable(){
			final com.apple.jobjc.Invoke.MsgSend hasSpaceAvailable_IMetInst = get_hasSpaceAvailable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasSpaceAvailable_IMetInst.init(nativeBuffer, this);
		hasSpaceAvailable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initToBuffer_capacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initToBuffer_capacity_IMetInst(){
		return ((initToBuffer_capacity_IMetInst != null)
	? (initToBuffer_capacity_IMetInst)
	: (initToBuffer_capacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initToBuffer:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initToBuffer_capacity(final com.apple.jobjc.Pointer<java.lang.Byte> buffer, final long capacity){
			final com.apple.jobjc.Invoke.MsgSend initToBuffer_capacity_IMetInst = get_initToBuffer_capacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initToBuffer_capacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		initToBuffer_capacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initToFileAtPath_append_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initToFileAtPath_append_IMetInst(){
		return ((initToFileAtPath_append_IMetInst != null)
	? (initToFileAtPath_append_IMetInst)
	: (initToFileAtPath_append_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initToFileAtPath:append:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initToFileAtPath_append(final com.apple.jobjc.foundation.NSString path, final boolean shouldAppend){
			final com.apple.jobjc.Invoke.MsgSend initToFileAtPath_append_IMetInst = get_initToFileAtPath_append_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initToFileAtPath_append_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldAppend);
		initToFileAtPath_append_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initToMemory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initToMemory_IMetInst(){
		return ((initToMemory_IMetInst != null)
	? (initToMemory_IMetInst)
	: (initToMemory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initToMemory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initToMemory(){
			final com.apple.jobjc.Invoke.MsgSend initToMemory_IMetInst = get_initToMemory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initToMemory_IMetInst.init(nativeBuffer, this);
		initToMemory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_append_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_append_IMetInst(){
		return ((initWithURL_append_IMetInst != null)
	? (initWithURL_append_IMetInst)
	: (initWithURL_append_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:append:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_append(final com.apple.jobjc.foundation.NSURL url, final boolean shouldAppend){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_append_IMetInst = get_initWithURL_append_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_append_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldAppend);
		initWithURL_append_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend write_maxLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_write_maxLength_IMetInst(){
		return ((write_maxLength_IMetInst != null)
	? (write_maxLength_IMetInst)
	: (write_maxLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "write:maxLength:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long write_maxLength(final com.apple.jobjc.Pointer<java.lang.Byte> buffer, final long len){
			final com.apple.jobjc.Invoke.MsgSend write_maxLength_IMetInst = get_write_maxLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		write_maxLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		write_maxLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
