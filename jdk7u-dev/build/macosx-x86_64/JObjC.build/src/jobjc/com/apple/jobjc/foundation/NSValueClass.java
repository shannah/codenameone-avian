package com.apple.jobjc.foundation;

public  class NSValueClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSValueClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSValueClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSValueClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend value_withObjCType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_value_withObjCType_CMetInst(){
		return ((value_withObjCType_CMetInst != null)
	? (value_withObjCType_CMetInst)
	: (value_withObjCType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "value:withObjCType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSValue value_withObjCType(final com.apple.jobjc.Pointer<Void> value, final com.apple.jobjc.Pointer<java.lang.Byte> type){
			final com.apple.jobjc.Invoke.MsgSend value_withObjCType_CMetInst = get_value_withObjCType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		value_withObjCType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		value_withObjCType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithBytes_objCType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithBytes_objCType_CMetInst(){
		return ((valueWithBytes_objCType_CMetInst != null)
	? (valueWithBytes_objCType_CMetInst)
	: (valueWithBytes_objCType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithBytes:objCType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithBytes_objCType(final com.apple.jobjc.Pointer<Void> value, final com.apple.jobjc.Pointer<java.lang.Byte> type){
			final com.apple.jobjc.Invoke.MsgSend valueWithBytes_objCType_CMetInst = get_valueWithBytes_objCType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithBytes_objCType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		valueWithBytes_objCType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithNonretainedObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithNonretainedObject_CMetInst(){
		return ((valueWithNonretainedObject_CMetInst != null)
	? (valueWithNonretainedObject_CMetInst)
	: (valueWithNonretainedObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithNonretainedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithNonretainedObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend valueWithNonretainedObject_CMetInst = get_valueWithNonretainedObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithNonretainedObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		valueWithNonretainedObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithPoint_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithPoint_CMetInst(){
		return ((valueWithPoint_CMetInst != null)
	? (valueWithPoint_CMetInst)
	: (valueWithPoint_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithPoint:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend valueWithPoint_CMetInst = get_valueWithPoint_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithPoint_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		valueWithPoint_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithPointer_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithPointer_CMetInst(){
		return ((valueWithPointer_CMetInst != null)
	? (valueWithPointer_CMetInst)
	: (valueWithPointer_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithPointer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithPointer(final com.apple.jobjc.Pointer<Void> pointer){
			final com.apple.jobjc.Invoke.MsgSend valueWithPointer_CMetInst = get_valueWithPointer_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithPointer_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, pointer);
		valueWithPointer_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithRange_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithRange_CMetInst(){
		return ((valueWithRange_CMetInst != null)
	? (valueWithRange_CMetInst)
	: (valueWithRange_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend valueWithRange_CMetInst = get_valueWithRange_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithRange_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		valueWithRange_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithRect_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithRect_CMetInst(){
		return ((valueWithRect_CMetInst != null)
	? (valueWithRect_CMetInst)
	: (valueWithRect_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend valueWithRect_CMetInst = get_valueWithRect_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithRect_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		valueWithRect_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueWithSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueWithSize_CMetInst(){
		return ((valueWithSize_CMetInst != null)
	? (valueWithSize_CMetInst)
	: (valueWithSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueWithSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSValue valueWithSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend valueWithSize_CMetInst = get_valueWithSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueWithSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		valueWithSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSValue returnValue = (com.apple.jobjc.foundation.NSValue) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
