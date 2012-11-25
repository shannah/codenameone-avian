package com.apple.jobjc.appkit;

public  class NSPageLayoutClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPageLayoutClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPageLayoutClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPageLayoutClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend pageLayout_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageLayout_CMetInst(){
		return ((pageLayout_CMetInst != null)
	? (pageLayout_CMetInst)
	: (pageLayout_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageLayout", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPageLayout pageLayout(){
			final com.apple.jobjc.Invoke.MsgSend pageLayout_CMetInst = get_pageLayout_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageLayout_CMetInst.init(nativeBuffer, this);
		pageLayout_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPageLayout returnValue = (com.apple.jobjc.appkit.NSPageLayout) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
