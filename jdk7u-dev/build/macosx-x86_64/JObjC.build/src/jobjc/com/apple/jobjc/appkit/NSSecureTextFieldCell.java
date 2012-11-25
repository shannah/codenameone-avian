package com.apple.jobjc.appkit;

public  class NSSecureTextFieldCell extends com.apple.jobjc.appkit.NSTextFieldCell {
	public NSSecureTextFieldCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSecureTextFieldCell(final NSSecureTextFieldCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend echosBullets_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_echosBullets_IMetInst(){
		return ((echosBullets_IMetInst != null)
	? (echosBullets_IMetInst)
	: (echosBullets_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "echosBullets", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean echosBullets(){
			final com.apple.jobjc.Invoke.MsgSend echosBullets_IMetInst = get_echosBullets_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		echosBullets_IMetInst.init(nativeBuffer, this);
		echosBullets_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setEchosBullets_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEchosBullets_IMetInst(){
		return ((setEchosBullets_IMetInst != null)
	? (setEchosBullets_IMetInst)
	: (setEchosBullets_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEchosBullets:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEchosBullets(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEchosBullets_IMetInst = get_setEchosBullets_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEchosBullets_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEchosBullets_IMetInst.invoke(nativeBuffer);
		
		
	}

}
