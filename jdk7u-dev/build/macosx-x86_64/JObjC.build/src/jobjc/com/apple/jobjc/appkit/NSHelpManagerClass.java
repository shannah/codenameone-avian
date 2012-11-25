package com.apple.jobjc.appkit;

public  class NSHelpManagerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSHelpManagerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSHelpManagerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSHelpManagerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend isContextHelpModeActive_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isContextHelpModeActive_CMetInst(){
		return ((isContextHelpModeActive_CMetInst != null)
	? (isContextHelpModeActive_CMetInst)
	: (isContextHelpModeActive_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isContextHelpModeActive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isContextHelpModeActive(){
			final com.apple.jobjc.Invoke.MsgSend isContextHelpModeActive_CMetInst = get_isContextHelpModeActive_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isContextHelpModeActive_CMetInst.init(nativeBuffer, this);
		isContextHelpModeActive_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setContextHelpModeActive_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContextHelpModeActive_CMetInst(){
		return ((setContextHelpModeActive_CMetInst != null)
	? (setContextHelpModeActive_CMetInst)
	: (setContextHelpModeActive_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContextHelpModeActive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContextHelpModeActive(final boolean active){
			final com.apple.jobjc.Invoke.MsgSend setContextHelpModeActive_CMetInst = get_setContextHelpModeActive_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContextHelpModeActive_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, active);
		setContextHelpModeActive_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedHelpManager_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedHelpManager_CMetInst(){
		return ((sharedHelpManager_CMetInst != null)
	? (sharedHelpManager_CMetInst)
	: (sharedHelpManager_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedHelpManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSHelpManager sharedHelpManager(){
			final com.apple.jobjc.Invoke.MsgSend sharedHelpManager_CMetInst = get_sharedHelpManager_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedHelpManager_CMetInst.init(nativeBuffer, this);
		sharedHelpManager_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSHelpManager returnValue = (com.apple.jobjc.appkit.NSHelpManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
