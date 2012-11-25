package com.apple.jobjc.appkit;

public  class NSNibControlConnector extends com.apple.jobjc.appkit.NSNibConnector {
	public NSNibControlConnector(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSNibControlConnector(final NSNibControlConnector obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend establishConnection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_establishConnection_IMetInst(){
		return ((establishConnection_IMetInst != null)
	? (establishConnection_IMetInst)
	: (establishConnection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "establishConnection", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void establishConnection(){
			final com.apple.jobjc.Invoke.MsgSend establishConnection_IMetInst = get_establishConnection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		establishConnection_IMetInst.init(nativeBuffer, this);
		establishConnection_IMetInst.invoke(nativeBuffer);
		
		
	}

}
