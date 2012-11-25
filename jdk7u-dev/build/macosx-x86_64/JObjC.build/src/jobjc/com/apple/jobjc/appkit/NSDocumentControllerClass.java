package com.apple.jobjc.appkit;

public  class NSDocumentControllerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDocumentControllerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDocumentControllerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDocumentControllerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedDocumentController_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedDocumentController_CMetInst(){
		return ((sharedDocumentController_CMetInst != null)
	? (sharedDocumentController_CMetInst)
	: (sharedDocumentController_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedDocumentController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedDocumentController(){
			final com.apple.jobjc.Invoke.MsgSend sharedDocumentController_CMetInst = get_sharedDocumentController_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedDocumentController_CMetInst.init(nativeBuffer, this);
		sharedDocumentController_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
