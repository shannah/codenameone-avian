package com.apple.jobjc.foundation;

public  class NSOperation extends com.apple.jobjc.foundation.NSObject {
	public NSOperation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOperation(final NSOperation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addDependency_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addDependency_IMetInst(){
		return ((addDependency_IMetInst != null)
	? (addDependency_IMetInst)
	: (addDependency_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addDependency:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addDependency(final com.apple.jobjc.foundation.NSOperation op){
			final com.apple.jobjc.Invoke.MsgSend addDependency_IMetInst = get_addDependency_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addDependency_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, op);
		addDependency_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend completionBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completionBlock_IMetInst(){
		return ((completionBlock_IMetInst != null)
	? (completionBlock_IMetInst)
	: (completionBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completionBlock", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* void(^)(void) (@, @) */ completionBlock(){
			final com.apple.jobjc.Invoke.MsgSend completionBlock_IMetInst = get_completionBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completionBlock_IMetInst.init(nativeBuffer, this);
		completionBlock_IMetInst.invoke(nativeBuffer);
		final Object /* void(^)(void) (@, @) */ returnValue = (Object /* void(^)(void) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dependencies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dependencies_IMetInst(){
		return ((dependencies_IMetInst != null)
	? (dependencies_IMetInst)
	: (dependencies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dependencies", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray dependencies(){
			final com.apple.jobjc.Invoke.MsgSend dependencies_IMetInst = get_dependencies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dependencies_IMetInst.init(nativeBuffer, this);
		dependencies_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend isConcurrent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isConcurrent_IMetInst(){
		return ((isConcurrent_IMetInst != null)
	? (isConcurrent_IMetInst)
	: (isConcurrent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isConcurrent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isConcurrent(){
			final com.apple.jobjc.Invoke.MsgSend isConcurrent_IMetInst = get_isConcurrent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isConcurrent_IMetInst.init(nativeBuffer, this);
		isConcurrent_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isReady_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isReady_IMetInst(){
		return ((isReady_IMetInst != null)
	? (isReady_IMetInst)
	: (isReady_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isReady", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isReady(){
			final com.apple.jobjc.Invoke.MsgSend isReady_IMetInst = get_isReady_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isReady_IMetInst.init(nativeBuffer, this);
		isReady_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend queuePriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_queuePriority_IMetInst(){
		return ((queuePriority_IMetInst != null)
	? (queuePriority_IMetInst)
	: (queuePriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "queuePriority", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long queuePriority(){
			final com.apple.jobjc.Invoke.MsgSend queuePriority_IMetInst = get_queuePriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		queuePriority_IMetInst.init(nativeBuffer, this);
		queuePriority_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeDependency_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeDependency_IMetInst(){
		return ((removeDependency_IMetInst != null)
	? (removeDependency_IMetInst)
	: (removeDependency_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeDependency:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeDependency(final com.apple.jobjc.foundation.NSOperation op){
			final com.apple.jobjc.Invoke.MsgSend removeDependency_IMetInst = get_removeDependency_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeDependency_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, op);
		removeDependency_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompletionBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompletionBlock_IMetInst(){
		return ((setCompletionBlock_IMetInst != null)
	? (setCompletionBlock_IMetInst)
	: (setCompletionBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompletionBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setCompletionBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend setCompletionBlock_IMetInst = get_setCompletionBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompletionBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		setCompletionBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setQueuePriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setQueuePriority_IMetInst(){
		return ((setQueuePriority_IMetInst != null)
	? (setQueuePriority_IMetInst)
	: (setQueuePriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setQueuePriority:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setQueuePriority(final long p){
			final com.apple.jobjc.Invoke.MsgSend setQueuePriority_IMetInst = get_setQueuePriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setQueuePriority_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, p);
		setQueuePriority_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend waitUntilFinished_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitUntilFinished_IMetInst(){
		return ((waitUntilFinished_IMetInst != null)
	? (waitUntilFinished_IMetInst)
	: (waitUntilFinished_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitUntilFinished", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void waitUntilFinished(){
			final com.apple.jobjc.Invoke.MsgSend waitUntilFinished_IMetInst = get_waitUntilFinished_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitUntilFinished_IMetInst.init(nativeBuffer, this);
		waitUntilFinished_IMetInst.invoke(nativeBuffer);
		
		
	}

}
