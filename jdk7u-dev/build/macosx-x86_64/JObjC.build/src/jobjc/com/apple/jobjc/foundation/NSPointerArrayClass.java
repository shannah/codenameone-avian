package com.apple.jobjc.foundation;

public  class NSPointerArrayClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPointerArrayClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPointerArrayClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPointerArrayClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend pointerArrayWithOptions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerArrayWithOptions_CMetInst(){
		return ((pointerArrayWithOptions_CMetInst != null)
	? (pointerArrayWithOptions_CMetInst)
	: (pointerArrayWithOptions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerArrayWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T pointerArrayWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend pointerArrayWithOptions_CMetInst = get_pointerArrayWithOptions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerArrayWithOptions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		pointerArrayWithOptions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointerArrayWithPointerFunctions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerArrayWithPointerFunctions_CMetInst(){
		return ((pointerArrayWithPointerFunctions_CMetInst != null)
	? (pointerArrayWithPointerFunctions_CMetInst)
	: (pointerArrayWithPointerFunctions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerArrayWithPointerFunctions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T pointerArrayWithPointerFunctions(final com.apple.jobjc.foundation.NSPointerFunctions functions){
			final com.apple.jobjc.Invoke.MsgSend pointerArrayWithPointerFunctions_CMetInst = get_pointerArrayWithPointerFunctions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerArrayWithPointerFunctions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, functions);
		pointerArrayWithPointerFunctions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointerArrayWithStrongObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerArrayWithStrongObjects_CMetInst(){
		return ((pointerArrayWithStrongObjects_CMetInst != null)
	? (pointerArrayWithStrongObjects_CMetInst)
	: (pointerArrayWithStrongObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerArrayWithStrongObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T pointerArrayWithStrongObjects(){
			final com.apple.jobjc.Invoke.MsgSend pointerArrayWithStrongObjects_CMetInst = get_pointerArrayWithStrongObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerArrayWithStrongObjects_CMetInst.init(nativeBuffer, this);
		pointerArrayWithStrongObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pointerArrayWithWeakObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerArrayWithWeakObjects_CMetInst(){
		return ((pointerArrayWithWeakObjects_CMetInst != null)
	? (pointerArrayWithWeakObjects_CMetInst)
	: (pointerArrayWithWeakObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerArrayWithWeakObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T pointerArrayWithWeakObjects(){
			final com.apple.jobjc.Invoke.MsgSend pointerArrayWithWeakObjects_CMetInst = get_pointerArrayWithWeakObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerArrayWithWeakObjects_CMetInst.init(nativeBuffer, this);
		pointerArrayWithWeakObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend strongObjectsPointerArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strongObjectsPointerArray_CMetInst(){
		return ((strongObjectsPointerArray_CMetInst != null)
	? (strongObjectsPointerArray_CMetInst)
	: (strongObjectsPointerArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strongObjectsPointerArray", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T strongObjectsPointerArray(){
			final com.apple.jobjc.Invoke.MsgSend strongObjectsPointerArray_CMetInst = get_strongObjectsPointerArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strongObjectsPointerArray_CMetInst.init(nativeBuffer, this);
		strongObjectsPointerArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weakObjectsPointerArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weakObjectsPointerArray_CMetInst(){
		return ((weakObjectsPointerArray_CMetInst != null)
	? (weakObjectsPointerArray_CMetInst)
	: (weakObjectsPointerArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weakObjectsPointerArray", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T weakObjectsPointerArray(){
			final com.apple.jobjc.Invoke.MsgSend weakObjectsPointerArray_CMetInst = get_weakObjectsPointerArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weakObjectsPointerArray_CMetInst.init(nativeBuffer, this);
		weakObjectsPointerArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
