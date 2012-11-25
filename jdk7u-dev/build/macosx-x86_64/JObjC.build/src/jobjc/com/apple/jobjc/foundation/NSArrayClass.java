package com.apple.jobjc.foundation;

public  class NSArrayClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSArrayClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSArrayClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSArrayClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend array_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_array_CMetInst(){
		return ((array_CMetInst != null)
	? (array_CMetInst)
	: (array_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "array", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T array(){
			final com.apple.jobjc.Invoke.MsgSend array_CMetInst = get_array_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		array_CMetInst.init(nativeBuffer, this);
		array_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayWithArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithArray_CMetInst(){
		return ((arrayWithArray_CMetInst != null)
	? (arrayWithArray_CMetInst)
	: (arrayWithArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend arrayWithArray_CMetInst = get_arrayWithArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		arrayWithArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithContentsOfFile_CMetInst(){
		return ((arrayWithContentsOfFile_CMetInst != null)
	? (arrayWithContentsOfFile_CMetInst)
	: (arrayWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend arrayWithContentsOfFile_CMetInst = get_arrayWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		arrayWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithContentsOfURL_CMetInst(){
		return ((arrayWithContentsOfURL_CMetInst != null)
	? (arrayWithContentsOfURL_CMetInst)
	: (arrayWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend arrayWithContentsOfURL_CMetInst = get_arrayWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		arrayWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayWithObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithObject_CMetInst(){
		return ((arrayWithObject_CMetInst != null)
	? (arrayWithObject_CMetInst)
	: (arrayWithObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend arrayWithObject_CMetInst = get_arrayWithObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		arrayWithObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithObjects(final com.apple.jobjc.ID firstObj, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend arrayWithObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithObjects:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithObjects_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObj);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		arrayWithObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayWithObjects_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayWithObjects_count_CMetInst(){
		return ((arrayWithObjects_count_CMetInst != null)
	? (arrayWithObjects_count_CMetInst)
	: (arrayWithObjects_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayWithObjects:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T arrayWithObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend arrayWithObjects_count_CMetInst = get_arrayWithObjects_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayWithObjects_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		arrayWithObjects_count_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
