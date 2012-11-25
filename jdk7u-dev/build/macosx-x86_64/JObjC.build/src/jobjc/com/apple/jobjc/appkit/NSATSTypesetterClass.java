package com.apple.jobjc.appkit;

public  class NSATSTypesetterClass extends com.apple.jobjc.appkit.NSTypesetterClass {
	public NSATSTypesetterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSATSTypesetterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSATSTypesetterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedTypesetter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedTypesetter_CMetInst(){
		return ((sharedTypesetter_CMetInst != null)
	? (sharedTypesetter_CMetInst)
	: (sharedTypesetter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedTypesetter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedTypesetter(){
			final com.apple.jobjc.Invoke.MsgSend sharedTypesetter_CMetInst = get_sharedTypesetter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedTypesetter_CMetInst.init(nativeBuffer, this);
		sharedTypesetter_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
