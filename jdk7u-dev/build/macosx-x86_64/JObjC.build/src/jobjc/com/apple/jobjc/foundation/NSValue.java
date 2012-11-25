package com.apple.jobjc.foundation;

public  class NSValue extends com.apple.jobjc.foundation.NSObject {
	public NSValue(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSValue(final NSValue obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend getValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getValue_IMetInst(){
		return ((getValue_IMetInst != null)
	? (getValue_IMetInst)
	: (getValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getValue(final com.apple.jobjc.Pointer<Void> value){
			final com.apple.jobjc.Invoke.MsgSend getValue_IMetInst = get_getValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		getValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithBytes_objCType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithBytes_objCType_IMetInst(){
		return ((initWithBytes_objCType_IMetInst != null)
	? (initWithBytes_objCType_IMetInst)
	: (initWithBytes_objCType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithBytes:objCType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithBytes_objCType(final com.apple.jobjc.Pointer<Void> value, final com.apple.jobjc.Pointer<java.lang.Byte> type){
			final com.apple.jobjc.Invoke.MsgSend initWithBytes_objCType_IMetInst = get_initWithBytes_objCType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithBytes_objCType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		initWithBytes_objCType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToValue_IMetInst(){
		return ((isEqualToValue_IMetInst != null)
	? (isEqualToValue_IMetInst)
	: (isEqualToValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToValue:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToValue(final com.apple.jobjc.foundation.NSValue value){
			final com.apple.jobjc.Invoke.MsgSend isEqualToValue_IMetInst = get_isEqualToValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		isEqualToValue_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nonretainedObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nonretainedObjectValue_IMetInst(){
		return ((nonretainedObjectValue_IMetInst != null)
	? (nonretainedObjectValue_IMetInst)
	: (nonretainedObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nonretainedObjectValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T nonretainedObjectValue(){
			final com.apple.jobjc.Invoke.MsgSend nonretainedObjectValue_IMetInst = get_nonretainedObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nonretainedObjectValue_IMetInst.init(nativeBuffer, this);
		nonretainedObjectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objCType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objCType_IMetInst(){
		return ((objCType_IMetInst != null)
	? (objCType_IMetInst)
	: (objCType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objCType", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> objCType(){
			final com.apple.jobjc.Invoke.MsgSend objCType_IMetInst = get_objCType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objCType_IMetInst.init(nativeBuffer, this);
		objCType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointValue_IMetInst(){
		return ((pointValue_IMetInst != null)
	? (pointValue_IMetInst)
	: (pointValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointValue", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint pointValue(){
			final com.apple.jobjc.Invoke.MsgSend pointValue_IMetInst = get_pointValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		pointValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointerValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerValue_IMetInst(){
		return ((pointerValue_IMetInst != null)
	? (pointerValue_IMetInst)
	: (pointerValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerValue", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> pointerValue(){
			final com.apple.jobjc.Invoke.MsgSend pointerValue_IMetInst = get_pointerValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerValue_IMetInst.init(nativeBuffer, this);
		pointerValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rangeValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rangeValue_IMetInst(){
		return ((rangeValue_IMetInst != null)
	? (rangeValue_IMetInst)
	: (rangeValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rangeValue", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rangeValue(){
			final com.apple.jobjc.Invoke.MsgSend rangeValue_IMetInst = get_rangeValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rangeValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rangeValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectValue_IMetInst(){
		return ((rectValue_IMetInst != null)
	? (rectValue_IMetInst)
	: (rectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectValue", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rectValue(){
			final com.apple.jobjc.Invoke.MsgSend rectValue_IMetInst = get_rectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeValue_IMetInst(){
		return ((sizeValue_IMetInst != null)
	? (sizeValue_IMetInst)
	: (sizeValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeValue", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize sizeValue(){
			final com.apple.jobjc.Invoke.MsgSend sizeValue_IMetInst = get_sizeValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeValue_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		sizeValue_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
