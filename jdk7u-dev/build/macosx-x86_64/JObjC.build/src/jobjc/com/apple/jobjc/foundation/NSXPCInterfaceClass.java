package com.apple.jobjc.foundation;

public  class NSXPCInterfaceClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSXPCInterfaceClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSXPCInterfaceClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSXPCInterfaceClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend interfaceWithProtocol_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_interfaceWithProtocol_CMetInst(){
		return ((interfaceWithProtocol_CMetInst != null)
	? (interfaceWithProtocol_CMetInst)
	: (interfaceWithProtocol_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "interfaceWithProtocol:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXPCInterface interfaceWithProtocol(final Object /* Protocol* (@, @) */ protocol){
			final com.apple.jobjc.Invoke.MsgSend interfaceWithProtocol_CMetInst = get_interfaceWithProtocol_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		interfaceWithProtocol_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, protocol);
		interfaceWithProtocol_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXPCInterface returnValue = (com.apple.jobjc.foundation.NSXPCInterface) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
