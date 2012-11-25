package com.apple.jobjc.foundation;

public  class NSOutputStreamClass extends com.apple.jobjc.foundation.NSStreamClass {
	public NSOutputStreamClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOutputStreamClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOutputStreamClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend outputStreamToBuffer_capacity_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outputStreamToBuffer_capacity_CMetInst(){
		return ((outputStreamToBuffer_capacity_CMetInst != null)
	? (outputStreamToBuffer_capacity_CMetInst)
	: (outputStreamToBuffer_capacity_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outputStreamToBuffer:capacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T outputStreamToBuffer_capacity(final com.apple.jobjc.Pointer<java.lang.Byte> buffer, final long capacity){
			final com.apple.jobjc.Invoke.MsgSend outputStreamToBuffer_capacity_CMetInst = get_outputStreamToBuffer_capacity_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outputStreamToBuffer_capacity_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, buffer);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		outputStreamToBuffer_capacity_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outputStreamToFileAtPath_append_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outputStreamToFileAtPath_append_CMetInst(){
		return ((outputStreamToFileAtPath_append_CMetInst != null)
	? (outputStreamToFileAtPath_append_CMetInst)
	: (outputStreamToFileAtPath_append_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outputStreamToFileAtPath:append:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outputStreamToFileAtPath_append(final com.apple.jobjc.foundation.NSString path, final boolean shouldAppend){
			final com.apple.jobjc.Invoke.MsgSend outputStreamToFileAtPath_append_CMetInst = get_outputStreamToFileAtPath_append_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outputStreamToFileAtPath_append_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldAppend);
		outputStreamToFileAtPath_append_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outputStreamToMemory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outputStreamToMemory_CMetInst(){
		return ((outputStreamToMemory_CMetInst != null)
	? (outputStreamToMemory_CMetInst)
	: (outputStreamToMemory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outputStreamToMemory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outputStreamToMemory(){
			final com.apple.jobjc.Invoke.MsgSend outputStreamToMemory_CMetInst = get_outputStreamToMemory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outputStreamToMemory_CMetInst.init(nativeBuffer, this);
		outputStreamToMemory_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend outputStreamWithURL_append_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outputStreamWithURL_append_CMetInst(){
		return ((outputStreamWithURL_append_CMetInst != null)
	? (outputStreamWithURL_append_CMetInst)
	: (outputStreamWithURL_append_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outputStreamWithURL:append:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T outputStreamWithURL_append(final com.apple.jobjc.foundation.NSURL url, final boolean shouldAppend){
			final com.apple.jobjc.Invoke.MsgSend outputStreamWithURL_append_CMetInst = get_outputStreamWithURL_append_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outputStreamWithURL_append_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldAppend);
		outputStreamWithURL_append_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
