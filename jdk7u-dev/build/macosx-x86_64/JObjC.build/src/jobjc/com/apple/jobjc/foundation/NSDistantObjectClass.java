package com.apple.jobjc.foundation;

public  class NSDistantObjectClass extends com.apple.jobjc.foundation.NSProxyClass {
	public NSDistantObjectClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDistantObjectClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDistantObjectClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend proxyWithLocal_connection_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_proxyWithLocal_connection_CMetInst(){
		return ((proxyWithLocal_connection_CMetInst != null)
	? (proxyWithLocal_connection_CMetInst)
	: (proxyWithLocal_connection_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "proxyWithLocal:connection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistantObject proxyWithLocal_connection(final com.apple.jobjc.ID target, final com.apple.jobjc.foundation.NSConnection connection){
			final com.apple.jobjc.Invoke.MsgSend proxyWithLocal_connection_CMetInst = get_proxyWithLocal_connection_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		proxyWithLocal_connection_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		proxyWithLocal_connection_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistantObject returnValue = (com.apple.jobjc.foundation.NSDistantObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend proxyWithTarget_connection_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_proxyWithTarget_connection_CMetInst(){
		return ((proxyWithTarget_connection_CMetInst != null)
	? (proxyWithTarget_connection_CMetInst)
	: (proxyWithTarget_connection_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "proxyWithTarget:connection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDistantObject proxyWithTarget_connection(final com.apple.jobjc.ID target, final com.apple.jobjc.foundation.NSConnection connection){
			final com.apple.jobjc.Invoke.MsgSend proxyWithTarget_connection_CMetInst = get_proxyWithTarget_connection_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		proxyWithTarget_connection_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, connection);
		proxyWithTarget_connection_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDistantObject returnValue = (com.apple.jobjc.foundation.NSDistantObject) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
