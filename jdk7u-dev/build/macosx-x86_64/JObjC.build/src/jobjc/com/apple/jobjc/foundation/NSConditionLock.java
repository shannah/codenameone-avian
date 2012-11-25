package com.apple.jobjc.foundation;

public  class NSConditionLock extends com.apple.jobjc.foundation.NSObject {
	public NSConditionLock(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSConditionLock(final NSConditionLock obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend condition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_condition_IMetInst(){
		return ((condition_IMetInst != null)
	? (condition_IMetInst)
	: (condition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "condition", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long condition(){
			final com.apple.jobjc.Invoke.MsgSend condition_IMetInst = get_condition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		condition_IMetInst.init(nativeBuffer, this);
		condition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCondition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCondition_IMetInst(){
		return ((initWithCondition_IMetInst != null)
	? (initWithCondition_IMetInst)
	: (initWithCondition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCondition:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCondition(final long condition){
			final com.apple.jobjc.Invoke.MsgSend initWithCondition_IMetInst = get_initWithCondition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCondition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, condition);
		initWithCondition_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockBeforeDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockBeforeDate_IMetInst(){
		return ((lockBeforeDate_IMetInst != null)
	? (lockBeforeDate_IMetInst)
	: (lockBeforeDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockBeforeDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean lockBeforeDate(final com.apple.jobjc.foundation.NSDate limit){
			final com.apple.jobjc.Invoke.MsgSend lockBeforeDate_IMetInst = get_lockBeforeDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockBeforeDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limit);
		lockBeforeDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockWhenCondition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockWhenCondition_IMetInst(){
		return ((lockWhenCondition_IMetInst != null)
	? (lockWhenCondition_IMetInst)
	: (lockWhenCondition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockWhenCondition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void lockWhenCondition(final long condition){
			final com.apple.jobjc.Invoke.MsgSend lockWhenCondition_IMetInst = get_lockWhenCondition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockWhenCondition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, condition);
		lockWhenCondition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockWhenCondition_beforeDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockWhenCondition_beforeDate_IMetInst(){
		return ((lockWhenCondition_beforeDate_IMetInst != null)
	? (lockWhenCondition_beforeDate_IMetInst)
	: (lockWhenCondition_beforeDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockWhenCondition:beforeDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean lockWhenCondition_beforeDate(final long condition, final com.apple.jobjc.foundation.NSDate limit){
			final com.apple.jobjc.Invoke.MsgSend lockWhenCondition_beforeDate_IMetInst = get_lockWhenCondition_beforeDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockWhenCondition_beforeDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, condition);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limit);
		lockWhenCondition_beforeDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend tryLockWhenCondition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tryLockWhenCondition_IMetInst(){
		return ((tryLockWhenCondition_IMetInst != null)
	? (tryLockWhenCondition_IMetInst)
	: (tryLockWhenCondition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tryLockWhenCondition:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean tryLockWhenCondition(final long condition){
			final com.apple.jobjc.Invoke.MsgSend tryLockWhenCondition_IMetInst = get_tryLockWhenCondition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tryLockWhenCondition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, condition);
		tryLockWhenCondition_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unlockWithCondition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockWithCondition_IMetInst(){
		return ((unlockWithCondition_IMetInst != null)
	? (unlockWithCondition_IMetInst)
	: (unlockWithCondition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockWithCondition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void unlockWithCondition(final long condition){
			final com.apple.jobjc.Invoke.MsgSend unlockWithCondition_IMetInst = get_unlockWithCondition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockWithCondition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, condition);
		unlockWithCondition_IMetInst.invoke(nativeBuffer);
		
		
	}

}
