package com.apple.jobjc.foundation;

public  class NSProcessInfoClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSProcessInfoClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSProcessInfoClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSProcessInfoClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend processInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processInfo_CMetInst(){
		return ((processInfo_CMetInst != null)
	? (processInfo_CMetInst)
	: (processInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSProcessInfo processInfo(){
			final com.apple.jobjc.Invoke.MsgSend processInfo_CMetInst = get_processInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processInfo_CMetInst.init(nativeBuffer, this);
		processInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSProcessInfo returnValue = (com.apple.jobjc.foundation.NSProcessInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
