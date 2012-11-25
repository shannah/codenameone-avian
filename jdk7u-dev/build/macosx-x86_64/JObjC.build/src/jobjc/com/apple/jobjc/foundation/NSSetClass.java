package com.apple.jobjc.foundation;

public  class NSSetClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSetClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSetClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSetClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend set_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_set_CMetInst(){
		return ((set_CMetInst != null)
	? (set_CMetInst)
	: (set_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "set", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T set(){
			final com.apple.jobjc.Invoke.MsgSend set_CMetInst = get_set_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		set_CMetInst.init(nativeBuffer, this);
		set_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setWithArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWithArray_CMetInst(){
		return ((setWithArray_CMetInst != null)
	? (setWithArray_CMetInst)
	: (setWithArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T setWithArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setWithArray_CMetInst = get_setWithArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setWithArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setWithObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWithObject_CMetInst(){
		return ((setWithObject_CMetInst != null)
	? (setWithObject_CMetInst)
	: (setWithObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T setWithObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend setWithObject_CMetInst = get_setWithObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		setWithObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T setWithObjects(final com.apple.jobjc.ID firstObj, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend setWithObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithObjects:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithObjects_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObj);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		setWithObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setWithObjects_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWithObjects_count_CMetInst(){
		return ((setWithObjects_count_CMetInst != null)
	? (setWithObjects_count_CMetInst)
	: (setWithObjects_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithObjects:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T setWithObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend setWithObjects_count_CMetInst = get_setWithObjects_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithObjects_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		setWithObjects_count_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setWithSet_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWithSet_CMetInst(){
		return ((setWithSet_CMetInst != null)
	? (setWithSet_CMetInst)
	: (setWithSet_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWithSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T setWithSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend setWithSet_CMetInst = get_setWithSet_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWithSet_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		setWithSet_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
