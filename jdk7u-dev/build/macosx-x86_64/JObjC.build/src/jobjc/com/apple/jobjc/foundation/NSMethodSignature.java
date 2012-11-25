package com.apple.jobjc.foundation;

public  class NSMethodSignature extends com.apple.jobjc.foundation.NSObject {
	public NSMethodSignature(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMethodSignature(final NSMethodSignature obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend frameLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameLength_IMetInst(){
		return ((frameLength_IMetInst != null)
	? (frameLength_IMetInst)
	: (frameLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameLength", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long frameLength(){
			final com.apple.jobjc.Invoke.MsgSend frameLength_IMetInst = get_frameLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameLength_IMetInst.init(nativeBuffer, this);
		frameLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getArgumentTypeAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getArgumentTypeAtIndex_IMetInst(){
		return ((getArgumentTypeAtIndex_IMetInst != null)
	? (getArgumentTypeAtIndex_IMetInst)
	: (getArgumentTypeAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getArgumentTypeAtIndex:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> getArgumentTypeAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend getArgumentTypeAtIndex_IMetInst = get_getArgumentTypeAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getArgumentTypeAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		getArgumentTypeAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOneway_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOneway_IMetInst(){
		return ((isOneway_IMetInst != null)
	? (isOneway_IMetInst)
	: (isOneway_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOneway", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOneway(){
			final com.apple.jobjc.Invoke.MsgSend isOneway_IMetInst = get_isOneway_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOneway_IMetInst.init(nativeBuffer, this);
		isOneway_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend methodReturnLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodReturnLength_IMetInst(){
		return ((methodReturnLength_IMetInst != null)
	? (methodReturnLength_IMetInst)
	: (methodReturnLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodReturnLength", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long methodReturnLength(){
			final com.apple.jobjc.Invoke.MsgSend methodReturnLength_IMetInst = get_methodReturnLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodReturnLength_IMetInst.init(nativeBuffer, this);
		methodReturnLength_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend methodReturnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_methodReturnType_IMetInst(){
		return ((methodReturnType_IMetInst != null)
	? (methodReturnType_IMetInst)
	: (methodReturnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "methodReturnType", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> methodReturnType(){
			final com.apple.jobjc.Invoke.MsgSend methodReturnType_IMetInst = get_methodReturnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		methodReturnType_IMetInst.init(nativeBuffer, this);
		methodReturnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfArguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfArguments_IMetInst(){
		return ((numberOfArguments_IMetInst != null)
	? (numberOfArguments_IMetInst)
	: (numberOfArguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfArguments", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberOfArguments(){
			final com.apple.jobjc.Invoke.MsgSend numberOfArguments_IMetInst = get_numberOfArguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfArguments_IMetInst.init(nativeBuffer, this);
		numberOfArguments_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
