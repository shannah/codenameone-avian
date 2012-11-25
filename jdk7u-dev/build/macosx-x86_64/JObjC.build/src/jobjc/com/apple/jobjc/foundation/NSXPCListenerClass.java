package com.apple.jobjc.foundation;

public  class NSXPCListenerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSXPCListenerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSXPCListenerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSXPCListenerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend anonymousListener_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_anonymousListener_CMetInst(){
		return ((anonymousListener_CMetInst != null)
	? (anonymousListener_CMetInst)
	: (anonymousListener_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "anonymousListener", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T anonymousListener(){
			final com.apple.jobjc.Invoke.MsgSend anonymousListener_CMetInst = get_anonymousListener_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		anonymousListener_CMetInst.init(nativeBuffer, this);
		anonymousListener_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend serviceListener_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serviceListener_CMetInst(){
		return ((serviceListener_CMetInst != null)
	? (serviceListener_CMetInst)
	: (serviceListener_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serviceListener", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T serviceListener(){
			final com.apple.jobjc.Invoke.MsgSend serviceListener_CMetInst = get_serviceListener_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serviceListener_CMetInst.init(nativeBuffer, this);
		serviceListener_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
