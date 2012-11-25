package com.apple.jobjc.appkit;

public  class NSMenuItemClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSMenuItemClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMenuItemClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMenuItemClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend separatorItem_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_separatorItem_CMetInst(){
		return ((separatorItem_CMetInst != null)
	? (separatorItem_CMetInst)
	: (separatorItem_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "separatorItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem separatorItem(){
			final com.apple.jobjc.Invoke.MsgSend separatorItem_CMetInst = get_separatorItem_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		separatorItem_CMetInst.init(nativeBuffer, this);
		separatorItem_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesUserKeyEquivalents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesUserKeyEquivalents_CMetInst(){
		return ((setUsesUserKeyEquivalents_CMetInst != null)
	? (setUsesUserKeyEquivalents_CMetInst)
	: (setUsesUserKeyEquivalents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesUserKeyEquivalents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesUserKeyEquivalents(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesUserKeyEquivalents_CMetInst = get_setUsesUserKeyEquivalents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesUserKeyEquivalents_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesUserKeyEquivalents_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesUserKeyEquivalents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesUserKeyEquivalents_CMetInst(){
		return ((usesUserKeyEquivalents_CMetInst != null)
	? (usesUserKeyEquivalents_CMetInst)
	: (usesUserKeyEquivalents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesUserKeyEquivalents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesUserKeyEquivalents(){
			final com.apple.jobjc.Invoke.MsgSend usesUserKeyEquivalents_CMetInst = get_usesUserKeyEquivalents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesUserKeyEquivalents_CMetInst.init(nativeBuffer, this);
		usesUserKeyEquivalents_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
