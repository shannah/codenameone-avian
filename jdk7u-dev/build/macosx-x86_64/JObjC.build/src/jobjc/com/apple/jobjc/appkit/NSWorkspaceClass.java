package com.apple.jobjc.appkit;

public  class NSWorkspaceClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSWorkspaceClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSWorkspaceClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSWorkspaceClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedWorkspace_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedWorkspace_CMetInst(){
		return ((sharedWorkspace_CMetInst != null)
	? (sharedWorkspace_CMetInst)
	: (sharedWorkspace_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedWorkspace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWorkspace sharedWorkspace(){
			final com.apple.jobjc.Invoke.MsgSend sharedWorkspace_CMetInst = get_sharedWorkspace_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedWorkspace_CMetInst.init(nativeBuffer, this);
		sharedWorkspace_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWorkspace returnValue = (com.apple.jobjc.appkit.NSWorkspace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
