package com.apple.jobjc.foundation;

public  class NSUUIDClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSUUIDClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSUUIDClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSUUIDClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend UUID_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_UUID_CMetInst(){
		return ((UUID_CMetInst != null)
	? (UUID_CMetInst)
	: (UUID_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "UUID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T UUID(){
			final com.apple.jobjc.Invoke.MsgSend UUID_CMetInst = get_UUID_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		UUID_CMetInst.init(nativeBuffer, this);
		UUID_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
