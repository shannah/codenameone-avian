package com.apple.jobjc.appkit;

public  class NSTextViewClass extends com.apple.jobjc.appkit.NSTextClass {
	public NSTextViewClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTextViewClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTextViewClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend registerForServices_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerForServices_CMetInst(){
		return ((registerForServices_CMetInst != null)
	? (registerForServices_CMetInst)
	: (registerForServices_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerForServices", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void registerForServices(){
			final com.apple.jobjc.Invoke.MsgSend registerForServices_CMetInst = get_registerForServices_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerForServices_CMetInst.init(nativeBuffer, this);
		registerForServices_CMetInst.invoke(nativeBuffer);
		
		
	}

}
