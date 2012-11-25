package com.apple.jobjc.appkit;

public  class NSFontManagerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFontManagerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFontManagerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFontManagerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend setFontManagerFactory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFontManagerFactory_CMetInst(){
		return ((setFontManagerFactory_CMetInst != null)
	? (setFontManagerFactory_CMetInst)
	: (setFontManagerFactory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFontManagerFactory:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setFontManagerFactory(final com.apple.jobjc.NSClass factoryId){
			final com.apple.jobjc.Invoke.MsgSend setFontManagerFactory_CMetInst = get_setFontManagerFactory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFontManagerFactory_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		setFontManagerFactory_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFontPanelFactory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFontPanelFactory_CMetInst(){
		return ((setFontPanelFactory_CMetInst != null)
	? (setFontPanelFactory_CMetInst)
	: (setFontPanelFactory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFontPanelFactory:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setFontPanelFactory(final com.apple.jobjc.NSClass factoryId){
			final com.apple.jobjc.Invoke.MsgSend setFontPanelFactory_CMetInst = get_setFontPanelFactory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFontPanelFactory_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		setFontPanelFactory_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedFontManager_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedFontManager_CMetInst(){
		return ((sharedFontManager_CMetInst != null)
	? (sharedFontManager_CMetInst)
	: (sharedFontManager_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedFontManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontManager sharedFontManager(){
			final com.apple.jobjc.Invoke.MsgSend sharedFontManager_CMetInst = get_sharedFontManager_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedFontManager_CMetInst.init(nativeBuffer, this);
		sharedFontManager_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontManager returnValue = (com.apple.jobjc.appkit.NSFontManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
