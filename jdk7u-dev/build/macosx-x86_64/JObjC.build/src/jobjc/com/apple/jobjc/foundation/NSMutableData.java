package com.apple.jobjc.foundation;

public  class NSMutableData extends com.apple.jobjc.foundation.NSData {
	public NSMutableData(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableData(final NSMutableData obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend appendBytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendBytes_length_IMetInst(){
		return ((appendBytes_length_IMetInst != null)
	? (appendBytes_length_IMetInst)
	: (appendBytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendBytes:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void appendBytes_length(final com.apple.jobjc.Pointer<Void> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend appendBytes_length_IMetInst = get_appendBytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendBytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		appendBytes_length_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendData_IMetInst(){
		return ((appendData_IMetInst != null)
	? (appendData_IMetInst)
	: (appendData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendData(final com.apple.jobjc.foundation.NSData other){
			final com.apple.jobjc.Invoke.MsgSend appendData_IMetInst = get_appendData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		appendData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend increaseLengthBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_increaseLengthBy_IMetInst(){
		return ((increaseLengthBy_IMetInst != null)
	? (increaseLengthBy_IMetInst)
	: (increaseLengthBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "increaseLengthBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void increaseLengthBy(final long extraLength){
			final com.apple.jobjc.Invoke.MsgSend increaseLengthBy_IMetInst = get_increaseLengthBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		increaseLengthBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, extraLength);
		increaseLengthBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCapacity_IMetInst(){
		return ((initWithCapacity_IMetInst != null)
	? (initWithCapacity_IMetInst)
	: (initWithCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCapacity(final long capacity){
			final com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst = get_initWithCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCapacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		initWithCapacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLength_IMetInst(){
		return ((initWithLength_IMetInst != null)
	? (initWithLength_IMetInst)
	: (initWithLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLength:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLength(final long length){
			final com.apple.jobjc.Invoke.MsgSend initWithLength_IMetInst = get_initWithLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		initWithLength_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableBytes_IMetInst(){
		return ((mutableBytes_IMetInst != null)
	? (mutableBytes_IMetInst)
	: (mutableBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableBytes", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> mutableBytes(){
			final com.apple.jobjc.Invoke.MsgSend mutableBytes_IMetInst = get_mutableBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableBytes_IMetInst.init(nativeBuffer, this);
		mutableBytes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceBytesInRange_withBytes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceBytesInRange_withBytes_IMetInst(){
		return ((replaceBytesInRange_withBytes_IMetInst != null)
	? (replaceBytesInRange_withBytes_IMetInst)
	: (replaceBytesInRange_withBytes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceBytesInRange:withBytes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void replaceBytesInRange_withBytes(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.Pointer<Void> bytes){
			final com.apple.jobjc.Invoke.MsgSend replaceBytesInRange_withBytes_IMetInst = get_replaceBytesInRange_withBytes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceBytesInRange_withBytes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		replaceBytesInRange_withBytes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceBytesInRange_withBytes_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceBytesInRange_withBytes_length_IMetInst(){
		return ((replaceBytesInRange_withBytes_length_IMetInst != null)
	? (replaceBytesInRange_withBytes_length_IMetInst)
	: (replaceBytesInRange_withBytes_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceBytesInRange:withBytes:length:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void replaceBytesInRange_withBytes_length(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.Pointer<Void> replacementBytes, final long replacementLength){
			final com.apple.jobjc.Invoke.MsgSend replaceBytesInRange_withBytes_length_IMetInst = get_replaceBytesInRange_withBytes_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceBytesInRange_withBytes_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, replacementBytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, replacementLength);
		replaceBytesInRange_withBytes_length_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resetBytesInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetBytesInRange_IMetInst(){
		return ((resetBytesInRange_IMetInst != null)
	? (resetBytesInRange_IMetInst)
	: (resetBytesInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetBytesInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void resetBytesInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend resetBytesInRange_IMetInst = get_resetBytesInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetBytesInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		resetBytesInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setData_IMetInst(){
		return ((setData_IMetInst != null)
	? (setData_IMetInst)
	: (setData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setData:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend setData_IMetInst = get_setData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		setData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLength_IMetInst(){
		return ((setLength_IMetInst != null)
	? (setLength_IMetInst)
	: (setLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLength(final long length){
			final com.apple.jobjc.Invoke.MsgSend setLength_IMetInst = get_setLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		setLength_IMetInst.invoke(nativeBuffer);
		
		
	}

}
