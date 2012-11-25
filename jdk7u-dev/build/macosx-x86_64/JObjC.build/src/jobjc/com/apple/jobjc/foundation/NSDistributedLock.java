package com.apple.jobjc.foundation;

public  class NSDistributedLock extends com.apple.jobjc.foundation.NSObject {
	public NSDistributedLock(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDistributedLock(final NSDistributedLock obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend breakLock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_breakLock_IMetInst(){
		return ((breakLock_IMetInst != null)
	? (breakLock_IMetInst)
	: (breakLock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "breakLock", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void breakLock(){
			final com.apple.jobjc.Invoke.MsgSend breakLock_IMetInst = get_breakLock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		breakLock_IMetInst.init(nativeBuffer, this);
		breakLock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPath_IMetInst(){
		return ((initWithPath_IMetInst != null)
	? (initWithPath_IMetInst)
	: (initWithPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithPath_IMetInst = get_initWithPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockDate_IMetInst(){
		return ((lockDate_IMetInst != null)
	? (lockDate_IMetInst)
	: (lockDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate lockDate(){
			final com.apple.jobjc.Invoke.MsgSend lockDate_IMetInst = get_lockDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockDate_IMetInst.init(nativeBuffer, this);
		lockDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tryLock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tryLock_IMetInst(){
		return ((tryLock_IMetInst != null)
	? (tryLock_IMetInst)
	: (tryLock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tryLock", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean tryLock(){
			final com.apple.jobjc.Invoke.MsgSend tryLock_IMetInst = get_tryLock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tryLock_IMetInst.init(nativeBuffer, this);
		tryLock_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlock_IMetInst(){
		return ((unlock_IMetInst != null)
	? (unlock_IMetInst)
	: (unlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlock", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unlock(){
			final com.apple.jobjc.Invoke.MsgSend unlock_IMetInst = get_unlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlock_IMetInst.init(nativeBuffer, this);
		unlock_IMetInst.invoke(nativeBuffer);
		
		
	}

}
