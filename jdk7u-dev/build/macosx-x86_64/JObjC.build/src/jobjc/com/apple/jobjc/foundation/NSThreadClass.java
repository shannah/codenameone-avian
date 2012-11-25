package com.apple.jobjc.foundation;

public  class NSThreadClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSThreadClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSThreadClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSThreadClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend callStackReturnAddresses_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_callStackReturnAddresses_CMetInst(){
		return ((callStackReturnAddresses_CMetInst != null)
	? (callStackReturnAddresses_CMetInst)
	: (callStackReturnAddresses_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "callStackReturnAddresses", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray callStackReturnAddresses(){
			final com.apple.jobjc.Invoke.MsgSend callStackReturnAddresses_CMetInst = get_callStackReturnAddresses_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		callStackReturnAddresses_CMetInst.init(nativeBuffer, this);
		callStackReturnAddresses_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend callStackSymbols_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_callStackSymbols_CMetInst(){
		return ((callStackSymbols_CMetInst != null)
	? (callStackSymbols_CMetInst)
	: (callStackSymbols_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "callStackSymbols", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray callStackSymbols(){
			final com.apple.jobjc.Invoke.MsgSend callStackSymbols_CMetInst = get_callStackSymbols_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		callStackSymbols_CMetInst.init(nativeBuffer, this);
		callStackSymbols_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentThread_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentThread_CMetInst(){
		return ((currentThread_CMetInst != null)
	? (currentThread_CMetInst)
	: (currentThread_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentThread", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSThread currentThread(){
			final com.apple.jobjc.Invoke.MsgSend currentThread_CMetInst = get_currentThread_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentThread_CMetInst.init(nativeBuffer, this);
		currentThread_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSThread returnValue = (com.apple.jobjc.foundation.NSThread) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend detachNewThreadSelector_toTarget_withObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachNewThreadSelector_toTarget_withObject_CMetInst(){
		return ((detachNewThreadSelector_toTarget_withObject_CMetInst != null)
	? (detachNewThreadSelector_toTarget_withObject_CMetInst)
	: (detachNewThreadSelector_toTarget_withObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachNewThreadSelector:toTarget:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void detachNewThreadSelector_toTarget_withObject(final com.apple.jobjc.SEL selector, final com.apple.jobjc.ID target, final com.apple.jobjc.ID argument){
			final com.apple.jobjc.Invoke.MsgSend detachNewThreadSelector_toTarget_withObject_CMetInst = get_detachNewThreadSelector_toTarget_withObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachNewThreadSelector_toTarget_withObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		detachNewThreadSelector_toTarget_withObject_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend exit_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exit_CMetInst(){
		return ((exit_CMetInst != null)
	? (exit_CMetInst)
	: (exit_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void exit(){
			final com.apple.jobjc.Invoke.MsgSend exit_CMetInst = get_exit_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exit_CMetInst.init(nativeBuffer, this);
		exit_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isMainThread_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMainThread_CMetInst(){
		return ((isMainThread_CMetInst != null)
	? (isMainThread_CMetInst)
	: (isMainThread_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMainThread", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMainThread(){
			final com.apple.jobjc.Invoke.MsgSend isMainThread_CMetInst = get_isMainThread_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMainThread_CMetInst.init(nativeBuffer, this);
		isMainThread_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMultiThreaded_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMultiThreaded_CMetInst(){
		return ((isMultiThreaded_CMetInst != null)
	? (isMultiThreaded_CMetInst)
	: (isMultiThreaded_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMultiThreaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMultiThreaded(){
			final com.apple.jobjc.Invoke.MsgSend isMultiThreaded_CMetInst = get_isMultiThreaded_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMultiThreaded_CMetInst.init(nativeBuffer, this);
		isMultiThreaded_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainThread_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainThread_CMetInst(){
		return ((mainThread_CMetInst != null)
	? (mainThread_CMetInst)
	: (mainThread_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainThread", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSThread mainThread(){
			final com.apple.jobjc.Invoke.MsgSend mainThread_CMetInst = get_mainThread_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainThread_CMetInst.init(nativeBuffer, this);
		mainThread_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSThread returnValue = (com.apple.jobjc.foundation.NSThread) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setThreadPriority_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setThreadPriority_CMetInst(){
		return ((setThreadPriority_CMetInst != null)
	? (setThreadPriority_CMetInst)
	: (setThreadPriority_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setThreadPriority:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public boolean setThreadPriority(final double p){
			final com.apple.jobjc.Invoke.MsgSend setThreadPriority_CMetInst = get_setThreadPriority_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setThreadPriority_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, p);
		setThreadPriority_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sleepForTimeInterval_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sleepForTimeInterval_CMetInst(){
		return ((sleepForTimeInterval_CMetInst != null)
	? (sleepForTimeInterval_CMetInst)
	: (sleepForTimeInterval_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sleepForTimeInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void sleepForTimeInterval(final double ti){
			final com.apple.jobjc.Invoke.MsgSend sleepForTimeInterval_CMetInst = get_sleepForTimeInterval_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sleepForTimeInterval_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		sleepForTimeInterval_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sleepUntilDate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sleepUntilDate_CMetInst(){
		return ((sleepUntilDate_CMetInst != null)
	? (sleepUntilDate_CMetInst)
	: (sleepUntilDate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sleepUntilDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sleepUntilDate(final com.apple.jobjc.foundation.NSDate date){
			final com.apple.jobjc.Invoke.MsgSend sleepUntilDate_CMetInst = get_sleepUntilDate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sleepUntilDate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, date);
		sleepUntilDate_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend threadPriority_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_threadPriority_CMetInst(){
		return ((threadPriority_CMetInst != null)
	? (threadPriority_CMetInst)
	: (threadPriority_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "threadPriority", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double threadPriority(){
			final com.apple.jobjc.Invoke.MsgSend threadPriority_CMetInst = get_threadPriority_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		threadPriority_CMetInst.init(nativeBuffer, this);
		threadPriority_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

}
