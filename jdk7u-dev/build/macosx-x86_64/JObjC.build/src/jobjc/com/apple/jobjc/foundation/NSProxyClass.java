package com.apple.jobjc.foundation;

public  class NSProxyClass extends com.apple.jobjc.NSClass<NSProxy> {
	public NSProxyClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSProxyClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSProxyClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alloc_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alloc_CMetInst(){
		return ((alloc_CMetInst != null)
	? (alloc_CMetInst)
	: (alloc_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alloc", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T alloc(){
			final com.apple.jobjc.Invoke.MsgSend alloc_CMetInst = get_alloc_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alloc_CMetInst.init(nativeBuffer, this);
		alloc_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allocWithZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allocWithZone_CMetInst(){
		return ((allocWithZone_CMetInst != null)
	? (allocWithZone_CMetInst)
	: (allocWithZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allocWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T allocWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend allocWithZone_CMetInst = get_allocWithZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allocWithZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		allocWithZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classNSClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNSClass_CMetInst(){
		return ((classNSClass_CMetInst != null)
	? (classNSClass_CMetInst)
	: (classNSClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "class", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classNSClass(){
			final com.apple.jobjc.Invoke.MsgSend classNSClass_CMetInst = get_classNSClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNSClass_CMetInst.init(nativeBuffer, this);
		classNSClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend respondsToSelector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_respondsToSelector_CMetInst(){
		return ((respondsToSelector_CMetInst != null)
	? (respondsToSelector_CMetInst)
	: (respondsToSelector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "respondsToSelector:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean respondsToSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend respondsToSelector_CMetInst = get_respondsToSelector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		respondsToSelector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		respondsToSelector_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
