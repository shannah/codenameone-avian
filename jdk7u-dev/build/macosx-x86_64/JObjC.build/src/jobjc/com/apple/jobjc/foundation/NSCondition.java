package com.apple.jobjc.foundation;

public  class NSCondition extends com.apple.jobjc.foundation.NSObject {
	public NSCondition(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCondition(final NSCondition obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend broadcast_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_broadcast_IMetInst(){
		return ((broadcast_IMetInst != null)
	? (broadcast_IMetInst)
	: (broadcast_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "broadcast", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void broadcast(){
			final com.apple.jobjc.Invoke.MsgSend broadcast_IMetInst = get_broadcast_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		broadcast_IMetInst.init(nativeBuffer, this);
		broadcast_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend name_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_name_IMetInst(){
		return ((name_IMetInst != null)
	? (name_IMetInst)
	: (name_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "name", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString name(){
			final com.apple.jobjc.Invoke.MsgSend name_IMetInst = get_name_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		name_IMetInst.init(nativeBuffer, this);
		name_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setName_IMetInst(){
		return ((setName_IMetInst != null)
	? (setName_IMetInst)
	: (setName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setName(final com.apple.jobjc.foundation.NSString n){
			final com.apple.jobjc.Invoke.MsgSend setName_IMetInst = get_setName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, n);
		setName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend signal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_signal_IMetInst(){
		return ((signal_IMetInst != null)
	? (signal_IMetInst)
	: (signal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "signal", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void signal(){
			final com.apple.jobjc.Invoke.MsgSend signal_IMetInst = get_signal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		signal_IMetInst.init(nativeBuffer, this);
		signal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend waitVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitVoid_IMetInst(){
		return ((waitVoid_IMetInst != null)
	? (waitVoid_IMetInst)
	: (waitVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wait", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void waitVoid(){
			final com.apple.jobjc.Invoke.MsgSend waitVoid_IMetInst = get_waitVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitVoid_IMetInst.init(nativeBuffer, this);
		waitVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend waitUntilDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitUntilDate_IMetInst(){
		return ((waitUntilDate_IMetInst != null)
	? (waitUntilDate_IMetInst)
	: (waitUntilDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitUntilDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean waitUntilDate(final com.apple.jobjc.foundation.NSDate limit){
			final com.apple.jobjc.Invoke.MsgSend waitUntilDate_IMetInst = get_waitUntilDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitUntilDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limit);
		waitUntilDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
