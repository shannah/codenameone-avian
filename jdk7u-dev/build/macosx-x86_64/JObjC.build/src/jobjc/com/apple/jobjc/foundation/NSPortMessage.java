package com.apple.jobjc.foundation;

public  class NSPortMessage extends com.apple.jobjc.foundation.NSObject {
	public NSPortMessage(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPortMessage(final NSPortMessage obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend components_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_components_IMetInst(){
		return ((components_IMetInst != null)
	? (components_IMetInst)
	: (components_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "components", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray components(){
			final com.apple.jobjc.Invoke.MsgSend components_IMetInst = get_components_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		components_IMetInst.init(nativeBuffer, this);
		components_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSendPort_receivePort_components_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSendPort_receivePort_components_IMetInst(){
		return ((initWithSendPort_receivePort_components_IMetInst != null)
	? (initWithSendPort_receivePort_components_IMetInst)
	: (initWithSendPort_receivePort_components_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSendPort:receivePort:components:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSendPort_receivePort_components(final com.apple.jobjc.foundation.NSPort sendPort, final com.apple.jobjc.foundation.NSPort replyPort, final com.apple.jobjc.foundation.NSArray components){
			final com.apple.jobjc.Invoke.MsgSend initWithSendPort_receivePort_components_IMetInst = get_initWithSendPort_receivePort_components_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSendPort_receivePort_components_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replyPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		initWithSendPort_receivePort_components_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend msgid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_msgid_IMetInst(){
		return ((msgid_IMetInst != null)
	? (msgid_IMetInst)
	: (msgid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "msgid", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int msgid(){
			final com.apple.jobjc.Invoke.MsgSend msgid_IMetInst = get_msgid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		msgid_IMetInst.init(nativeBuffer, this);
		msgid_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend receivePort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_receivePort_IMetInst(){
		return ((receivePort_IMetInst != null)
	? (receivePort_IMetInst)
	: (receivePort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "receivePort", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort receivePort(){
			final com.apple.jobjc.Invoke.MsgSend receivePort_IMetInst = get_receivePort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		receivePort_IMetInst.init(nativeBuffer, this);
		receivePort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendBeforeDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendBeforeDate_IMetInst(){
		return ((sendBeforeDate_IMetInst != null)
	? (sendBeforeDate_IMetInst)
	: (sendBeforeDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendBeforeDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean sendBeforeDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend sendBeforeDate_IMetInst = get_sendBeforeDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendBeforeDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		sendBeforeDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendPort_IMetInst(){
		return ((sendPort_IMetInst != null)
	? (sendPort_IMetInst)
	: (sendPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendPort", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPort sendPort(){
			final com.apple.jobjc.Invoke.MsgSend sendPort_IMetInst = get_sendPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendPort_IMetInst.init(nativeBuffer, this);
		sendPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPort returnValue = (com.apple.jobjc.foundation.NSPort) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setMsgid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMsgid_IMetInst(){
		return ((setMsgid_IMetInst != null)
	? (setMsgid_IMetInst)
	: (setMsgid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMsgid:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public void setMsgid(final int msgid){
			final com.apple.jobjc.Invoke.MsgSend setMsgid_IMetInst = get_setMsgid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMsgid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, msgid);
		setMsgid_IMetInst.invoke(nativeBuffer);
		
		
	}

}
