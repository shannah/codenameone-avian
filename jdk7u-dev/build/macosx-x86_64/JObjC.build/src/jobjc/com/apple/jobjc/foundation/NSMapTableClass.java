package com.apple.jobjc.foundation;

public  class NSMapTableClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSMapTableClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMapTableClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMapTableClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend mapTableWithKeyOptions_valueOptions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mapTableWithKeyOptions_valueOptions_CMetInst(){
		return ((mapTableWithKeyOptions_valueOptions_CMetInst != null)
	? (mapTableWithKeyOptions_valueOptions_CMetInst)
	: (mapTableWithKeyOptions_valueOptions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mapTableWithKeyOptions:valueOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T mapTableWithKeyOptions_valueOptions(final long keyOptions, final long valueOptions){
			final com.apple.jobjc.Invoke.MsgSend mapTableWithKeyOptions_valueOptions_CMetInst = get_mapTableWithKeyOptions_valueOptions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mapTableWithKeyOptions_valueOptions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, keyOptions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, valueOptions);
		mapTableWithKeyOptions_valueOptions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mapTableWithStrongToStrongObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mapTableWithStrongToStrongObjects_CMetInst(){
		return ((mapTableWithStrongToStrongObjects_CMetInst != null)
	? (mapTableWithStrongToStrongObjects_CMetInst)
	: (mapTableWithStrongToStrongObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mapTableWithStrongToStrongObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mapTableWithStrongToStrongObjects(){
			final com.apple.jobjc.Invoke.MsgSend mapTableWithStrongToStrongObjects_CMetInst = get_mapTableWithStrongToStrongObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mapTableWithStrongToStrongObjects_CMetInst.init(nativeBuffer, this);
		mapTableWithStrongToStrongObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mapTableWithStrongToWeakObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mapTableWithStrongToWeakObjects_CMetInst(){
		return ((mapTableWithStrongToWeakObjects_CMetInst != null)
	? (mapTableWithStrongToWeakObjects_CMetInst)
	: (mapTableWithStrongToWeakObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mapTableWithStrongToWeakObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mapTableWithStrongToWeakObjects(){
			final com.apple.jobjc.Invoke.MsgSend mapTableWithStrongToWeakObjects_CMetInst = get_mapTableWithStrongToWeakObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mapTableWithStrongToWeakObjects_CMetInst.init(nativeBuffer, this);
		mapTableWithStrongToWeakObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mapTableWithWeakToStrongObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mapTableWithWeakToStrongObjects_CMetInst(){
		return ((mapTableWithWeakToStrongObjects_CMetInst != null)
	? (mapTableWithWeakToStrongObjects_CMetInst)
	: (mapTableWithWeakToStrongObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mapTableWithWeakToStrongObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mapTableWithWeakToStrongObjects(){
			final com.apple.jobjc.Invoke.MsgSend mapTableWithWeakToStrongObjects_CMetInst = get_mapTableWithWeakToStrongObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mapTableWithWeakToStrongObjects_CMetInst.init(nativeBuffer, this);
		mapTableWithWeakToStrongObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mapTableWithWeakToWeakObjects_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mapTableWithWeakToWeakObjects_CMetInst(){
		return ((mapTableWithWeakToWeakObjects_CMetInst != null)
	? (mapTableWithWeakToWeakObjects_CMetInst)
	: (mapTableWithWeakToWeakObjects_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mapTableWithWeakToWeakObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mapTableWithWeakToWeakObjects(){
			final com.apple.jobjc.Invoke.MsgSend mapTableWithWeakToWeakObjects_CMetInst = get_mapTableWithWeakToWeakObjects_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mapTableWithWeakToWeakObjects_CMetInst.init(nativeBuffer, this);
		mapTableWithWeakToWeakObjects_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend strongToStrongObjectsMapTable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strongToStrongObjectsMapTable_CMetInst(){
		return ((strongToStrongObjectsMapTable_CMetInst != null)
	? (strongToStrongObjectsMapTable_CMetInst)
	: (strongToStrongObjectsMapTable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strongToStrongObjectsMapTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T strongToStrongObjectsMapTable(){
			final com.apple.jobjc.Invoke.MsgSend strongToStrongObjectsMapTable_CMetInst = get_strongToStrongObjectsMapTable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strongToStrongObjectsMapTable_CMetInst.init(nativeBuffer, this);
		strongToStrongObjectsMapTable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend strongToWeakObjectsMapTable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_strongToWeakObjectsMapTable_CMetInst(){
		return ((strongToWeakObjectsMapTable_CMetInst != null)
	? (strongToWeakObjectsMapTable_CMetInst)
	: (strongToWeakObjectsMapTable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "strongToWeakObjectsMapTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T strongToWeakObjectsMapTable(){
			final com.apple.jobjc.Invoke.MsgSend strongToWeakObjectsMapTable_CMetInst = get_strongToWeakObjectsMapTable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		strongToWeakObjectsMapTable_CMetInst.init(nativeBuffer, this);
		strongToWeakObjectsMapTable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weakToStrongObjectsMapTable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weakToStrongObjectsMapTable_CMetInst(){
		return ((weakToStrongObjectsMapTable_CMetInst != null)
	? (weakToStrongObjectsMapTable_CMetInst)
	: (weakToStrongObjectsMapTable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weakToStrongObjectsMapTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T weakToStrongObjectsMapTable(){
			final com.apple.jobjc.Invoke.MsgSend weakToStrongObjectsMapTable_CMetInst = get_weakToStrongObjectsMapTable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weakToStrongObjectsMapTable_CMetInst.init(nativeBuffer, this);
		weakToStrongObjectsMapTable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weakToWeakObjectsMapTable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weakToWeakObjectsMapTable_CMetInst(){
		return ((weakToWeakObjectsMapTable_CMetInst != null)
	? (weakToWeakObjectsMapTable_CMetInst)
	: (weakToWeakObjectsMapTable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weakToWeakObjectsMapTable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T weakToWeakObjectsMapTable(){
			final com.apple.jobjc.Invoke.MsgSend weakToWeakObjectsMapTable_CMetInst = get_weakToWeakObjectsMapTable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weakToWeakObjectsMapTable_CMetInst.init(nativeBuffer, this);
		weakToWeakObjectsMapTable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
