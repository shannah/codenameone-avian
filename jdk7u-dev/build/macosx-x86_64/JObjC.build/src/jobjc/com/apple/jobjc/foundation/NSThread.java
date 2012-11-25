package com.apple.jobjc.foundation;

public  class NSThread extends com.apple.jobjc.foundation.NSObject {
	public NSThread(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSThread(final NSThread obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cancel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancel_IMetInst(){
		return ((cancel_IMetInst != null)
	? (cancel_IMetInst)
	: (cancel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancel", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancel(){
			final com.apple.jobjc.Invoke.MsgSend cancel_IMetInst = get_cancel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancel_IMetInst.init(nativeBuffer, this);
		cancel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTarget_selector_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTarget_selector_object_IMetInst(){
		return ((initWithTarget_selector_object_IMetInst != null)
	? (initWithTarget_selector_object_IMetInst)
	: (initWithTarget_selector_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTarget:selector:object:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTarget_selector_object(final com.apple.jobjc.ID target, final com.apple.jobjc.SEL selector, final com.apple.jobjc.ID argument){
			final com.apple.jobjc.Invoke.MsgSend initWithTarget_selector_object_IMetInst = get_initWithTarget_selector_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTarget_selector_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		initWithTarget_selector_object_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isCancelled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCancelled_IMetInst(){
		return ((isCancelled_IMetInst != null)
	? (isCancelled_IMetInst)
	: (isCancelled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCancelled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCancelled(){
			final com.apple.jobjc.Invoke.MsgSend isCancelled_IMetInst = get_isCancelled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCancelled_IMetInst.init(nativeBuffer, this);
		isCancelled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExecuting_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExecuting_IMetInst(){
		return ((isExecuting_IMetInst != null)
	? (isExecuting_IMetInst)
	: (isExecuting_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExecuting", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExecuting(){
			final com.apple.jobjc.Invoke.MsgSend isExecuting_IMetInst = get_isExecuting_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExecuting_IMetInst.init(nativeBuffer, this);
		isExecuting_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFinished_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFinished_IMetInst(){
		return ((isFinished_IMetInst != null)
	? (isFinished_IMetInst)
	: (isFinished_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFinished", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFinished(){
			final com.apple.jobjc.Invoke.MsgSend isFinished_IMetInst = get_isFinished_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFinished_IMetInst.init(nativeBuffer, this);
		isFinished_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMainThread_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMainThread_IMetInst(){
		return ((isMainThread_IMetInst != null)
	? (isMainThread_IMetInst)
	: (isMainThread_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMainThread", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMainThread(){
			final com.apple.jobjc.Invoke.MsgSend isMainThread_IMetInst = get_isMainThread_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMainThread_IMetInst.init(nativeBuffer, this);
		isMainThread_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend main_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_main_IMetInst(){
		return ((main_IMetInst != null)
	? (main_IMetInst)
	: (main_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "main", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void main(){
			final com.apple.jobjc.Invoke.MsgSend main_IMetInst = get_main_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		main_IMetInst.init(nativeBuffer, this);
		main_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setStackSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStackSize_IMetInst(){
		return ((setStackSize_IMetInst != null)
	? (setStackSize_IMetInst)
	: (setStackSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStackSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setStackSize(final long s){
			final com.apple.jobjc.Invoke.MsgSend setStackSize_IMetInst = get_setStackSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStackSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, s);
		setStackSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setThreadPriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setThreadPriority_IMetInst(){
		return ((setThreadPriority_IMetInst != null)
	? (setThreadPriority_IMetInst)
	: (setThreadPriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setThreadPriority:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setThreadPriority(final double p){
			final com.apple.jobjc.Invoke.MsgSend setThreadPriority_IMetInst = get_setThreadPriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setThreadPriority_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, p);
		setThreadPriority_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stackSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stackSize_IMetInst(){
		return ((stackSize_IMetInst != null)
	? (stackSize_IMetInst)
	: (stackSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stackSize", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long stackSize(){
			final com.apple.jobjc.Invoke.MsgSend stackSize_IMetInst = get_stackSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stackSize_IMetInst.init(nativeBuffer, this);
		stackSize_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend start_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_start_IMetInst(){
		return ((start_IMetInst != null)
	? (start_IMetInst)
	: (start_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "start", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void start(){
			final com.apple.jobjc.Invoke.MsgSend start_IMetInst = get_start_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		start_IMetInst.init(nativeBuffer, this);
		start_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend threadDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_threadDictionary_IMetInst(){
		return ((threadDictionary_IMetInst != null)
	? (threadDictionary_IMetInst)
	: (threadDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "threadDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableDictionary threadDictionary(){
			final com.apple.jobjc.Invoke.MsgSend threadDictionary_IMetInst = get_threadDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		threadDictionary_IMetInst.init(nativeBuffer, this);
		threadDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableDictionary returnValue = (com.apple.jobjc.foundation.NSMutableDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend threadPriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_threadPriority_IMetInst(){
		return ((threadPriority_IMetInst != null)
	? (threadPriority_IMetInst)
	: (threadPriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "threadPriority", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double threadPriority(){
			final com.apple.jobjc.Invoke.MsgSend threadPriority_IMetInst = get_threadPriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		threadPriority_IMetInst.init(nativeBuffer, this);
		threadPriority_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
