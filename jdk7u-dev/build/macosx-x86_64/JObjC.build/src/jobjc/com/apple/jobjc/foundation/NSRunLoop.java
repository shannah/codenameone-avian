package com.apple.jobjc.foundation;

public  class NSRunLoop extends com.apple.jobjc.foundation.NSObject {
	public NSRunLoop(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRunLoop(final NSRunLoop obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptInputForMode_beforeDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptInputForMode_beforeDate_IMetInst(){
		return ((acceptInputForMode_beforeDate_IMetInst != null)
	? (acceptInputForMode_beforeDate_IMetInst)
	: (acceptInputForMode_beforeDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptInputForMode:beforeDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void acceptInputForMode_beforeDate(final com.apple.jobjc.foundation.NSString mode, final com.apple.jobjc.foundation.NSDate limitDate){
			final com.apple.jobjc.Invoke.MsgSend acceptInputForMode_beforeDate_IMetInst = get_acceptInputForMode_beforeDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptInputForMode_beforeDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limitDate);
		acceptInputForMode_beforeDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addPort_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addPort_forMode_IMetInst(){
		return ((addPort_forMode_IMetInst != null)
	? (addPort_forMode_IMetInst)
	: (addPort_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addPort:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addPort_forMode(final com.apple.jobjc.foundation.NSPort aPort, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend addPort_forMode_IMetInst = get_addPort_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addPort_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		addPort_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addTimer_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTimer_forMode_IMetInst(){
		return ((addTimer_forMode_IMetInst != null)
	? (addTimer_forMode_IMetInst)
	: (addTimer_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTimer:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTimer_forMode(final com.apple.jobjc.foundation.NSTimer timer, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend addTimer_forMode_IMetInst = get_addTimer_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTimer_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, timer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		addTimer_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelPerformSelector_target_argument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelPerformSelector_target_argument_IMetInst(){
		return ((cancelPerformSelector_target_argument_IMetInst != null)
	? (cancelPerformSelector_target_argument_IMetInst)
	: (cancelPerformSelector_target_argument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelPerformSelector:target:argument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelPerformSelector_target_argument(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID target, final com.apple.jobjc.ID arg){
			final com.apple.jobjc.Invoke.MsgSend cancelPerformSelector_target_argument_IMetInst = get_cancelPerformSelector_target_argument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelPerformSelector_target_argument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		cancelPerformSelector_target_argument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelPerformSelectorsWithTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelPerformSelectorsWithTarget_IMetInst(){
		return ((cancelPerformSelectorsWithTarget_IMetInst != null)
	? (cancelPerformSelectorsWithTarget_IMetInst)
	: (cancelPerformSelectorsWithTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelPerformSelectorsWithTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelPerformSelectorsWithTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend cancelPerformSelectorsWithTarget_IMetInst = get_cancelPerformSelectorsWithTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelPerformSelectorsWithTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		cancelPerformSelectorsWithTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend configureAsServer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_configureAsServer_IMetInst(){
		return ((configureAsServer_IMetInst != null)
	? (configureAsServer_IMetInst)
	: (configureAsServer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "configureAsServer", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void configureAsServer(){
			final com.apple.jobjc.Invoke.MsgSend configureAsServer_IMetInst = get_configureAsServer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		configureAsServer_IMetInst.init(nativeBuffer, this);
		configureAsServer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentMode_IMetInst(){
		return ((currentMode_IMetInst != null)
	? (currentMode_IMetInst)
	: (currentMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentMode", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currentMode(){
			final com.apple.jobjc.Invoke.MsgSend currentMode_IMetInst = get_currentMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentMode_IMetInst.init(nativeBuffer, this);
		currentMode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getCFRunLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getCFRunLoop_IMetInst(){
		return ((getCFRunLoop_IMetInst != null)
	? (getCFRunLoop_IMetInst)
	: (getCFRunLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getCFRunLoop", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.corefoundation.CFRunLoopRefCFType getCFRunLoop(){
			final com.apple.jobjc.Invoke.MsgSend getCFRunLoop_IMetInst = get_getCFRunLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getCFRunLoop_IMetInst.init(nativeBuffer, this);
		getCFRunLoop_IMetInst.invoke(nativeBuffer);
				final com.apple.jobjc.corefoundation.CFRunLoopRefCFType returnValue = (com.apple.jobjc.corefoundation.CFRunLoopRefCFType) new com.apple.jobjc.corefoundation.CFRunLoopRefCFType(com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend limitDateForMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_limitDateForMode_IMetInst(){
		return ((limitDateForMode_IMetInst != null)
	? (limitDateForMode_IMetInst)
	: (limitDateForMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "limitDateForMode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate limitDateForMode(final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend limitDateForMode_IMetInst = get_limitDateForMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		limitDateForMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		limitDateForMode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performSelector_target_argument_order_modes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSelector_target_argument_order_modes_IMetInst(){
		return ((performSelector_target_argument_order_modes_IMetInst != null)
	? (performSelector_target_argument_order_modes_IMetInst)
	: (performSelector_target_argument_order_modes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSelector:target:argument:order:modes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performSelector_target_argument_order_modes(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID target, final com.apple.jobjc.ID arg, final long order, final com.apple.jobjc.foundation.NSArray modes){
			final com.apple.jobjc.Invoke.MsgSend performSelector_target_argument_order_modes_IMetInst = get_performSelector_target_argument_order_modes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSelector_target_argument_order_modes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arg);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, order);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modes);
		performSelector_target_argument_order_modes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removePort_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removePort_forMode_IMetInst(){
		return ((removePort_forMode_IMetInst != null)
	? (removePort_forMode_IMetInst)
	: (removePort_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removePort:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removePort_forMode(final com.apple.jobjc.foundation.NSPort aPort, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removePort_forMode_IMetInst = get_removePort_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removePort_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aPort);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removePort_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend run_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_run_IMetInst(){
		return ((run_IMetInst != null)
	? (run_IMetInst)
	: (run_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "run", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void run(){
			final com.apple.jobjc.Invoke.MsgSend run_IMetInst = get_run_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		run_IMetInst.init(nativeBuffer, this);
		run_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runMode_beforeDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runMode_beforeDate_IMetInst(){
		return ((runMode_beforeDate_IMetInst != null)
	? (runMode_beforeDate_IMetInst)
	: (runMode_beforeDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runMode:beforeDate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean runMode_beforeDate(final com.apple.jobjc.foundation.NSString mode, final com.apple.jobjc.foundation.NSDate limitDate){
			final com.apple.jobjc.Invoke.MsgSend runMode_beforeDate_IMetInst = get_runMode_beforeDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runMode_beforeDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limitDate);
		runMode_beforeDate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runUntilDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runUntilDate_IMetInst(){
		return ((runUntilDate_IMetInst != null)
	? (runUntilDate_IMetInst)
	: (runUntilDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runUntilDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void runUntilDate(final com.apple.jobjc.foundation.NSDate limitDate){
			final com.apple.jobjc.Invoke.MsgSend runUntilDate_IMetInst = get_runUntilDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runUntilDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, limitDate);
		runUntilDate_IMetInst.invoke(nativeBuffer);
		
		
	}

}
