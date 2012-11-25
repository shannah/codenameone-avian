package com.apple.jobjc.foundation;

public  class NSOperationQueue extends com.apple.jobjc.foundation.NSObject {
	public NSOperationQueue(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOperationQueue(final NSOperationQueue obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addOperation_IMetInst(){
		return ((addOperation_IMetInst != null)
	? (addOperation_IMetInst)
	: (addOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addOperation(final com.apple.jobjc.foundation.NSOperation op){
			final com.apple.jobjc.Invoke.MsgSend addOperation_IMetInst = get_addOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, op);
		addOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addOperationWithBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addOperationWithBlock_IMetInst(){
		return ((addOperationWithBlock_IMetInst != null)
	? (addOperationWithBlock_IMetInst)
	: (addOperationWithBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addOperationWithBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void addOperationWithBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend addOperationWithBlock_IMetInst = get_addOperationWithBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addOperationWithBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		addOperationWithBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addOperations_waitUntilFinished_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addOperations_waitUntilFinished_IMetInst(){
		return ((addOperations_waitUntilFinished_IMetInst != null)
	? (addOperations_waitUntilFinished_IMetInst)
	: (addOperations_waitUntilFinished_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addOperations:waitUntilFinished:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void addOperations_waitUntilFinished(final com.apple.jobjc.foundation.NSArray ops, final boolean wait1){
			final com.apple.jobjc.Invoke.MsgSend addOperations_waitUntilFinished_IMetInst = get_addOperations_waitUntilFinished_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addOperations_waitUntilFinished_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ops);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, wait1);
		addOperations_waitUntilFinished_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelAllOperations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelAllOperations_IMetInst(){
		return ((cancelAllOperations_IMetInst != null)
	? (cancelAllOperations_IMetInst)
	: (cancelAllOperations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelAllOperations", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelAllOperations(){
			final com.apple.jobjc.Invoke.MsgSend cancelAllOperations_IMetInst = get_cancelAllOperations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelAllOperations_IMetInst.init(nativeBuffer, this);
		cancelAllOperations_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isSuspended_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSuspended_IMetInst(){
		return ((isSuspended_IMetInst != null)
	? (isSuspended_IMetInst)
	: (isSuspended_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSuspended", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSuspended(){
			final com.apple.jobjc.Invoke.MsgSend isSuspended_IMetInst = get_isSuspended_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSuspended_IMetInst.init(nativeBuffer, this);
		isSuspended_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxConcurrentOperationCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxConcurrentOperationCount_IMetInst(){
		return ((maxConcurrentOperationCount_IMetInst != null)
	? (maxConcurrentOperationCount_IMetInst)
	: (maxConcurrentOperationCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxConcurrentOperationCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long maxConcurrentOperationCount(){
			final com.apple.jobjc.Invoke.MsgSend maxConcurrentOperationCount_IMetInst = get_maxConcurrentOperationCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxConcurrentOperationCount_IMetInst.init(nativeBuffer, this);
		maxConcurrentOperationCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend operationCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operationCount_IMetInst(){
		return ((operationCount_IMetInst != null)
	? (operationCount_IMetInst)
	: (operationCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operationCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long operationCount(){
			final com.apple.jobjc.Invoke.MsgSend operationCount_IMetInst = get_operationCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operationCount_IMetInst.init(nativeBuffer, this);
		operationCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operations_IMetInst(){
		return ((operations_IMetInst != null)
	? (operations_IMetInst)
	: (operations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray operations(){
			final com.apple.jobjc.Invoke.MsgSend operations_IMetInst = get_operations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operations_IMetInst.init(nativeBuffer, this);
		operations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxConcurrentOperationCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxConcurrentOperationCount_IMetInst(){
		return ((setMaxConcurrentOperationCount_IMetInst != null)
	? (setMaxConcurrentOperationCount_IMetInst)
	: (setMaxConcurrentOperationCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxConcurrentOperationCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMaxConcurrentOperationCount(final long cnt){
			final com.apple.jobjc.Invoke.MsgSend setMaxConcurrentOperationCount_IMetInst = get_setMaxConcurrentOperationCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxConcurrentOperationCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, cnt);
		setMaxConcurrentOperationCount_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setSuspended_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSuspended_IMetInst(){
		return ((setSuspended_IMetInst != null)
	? (setSuspended_IMetInst)
	: (setSuspended_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSuspended:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSuspended(final boolean b){
			final com.apple.jobjc.Invoke.MsgSend setSuspended_IMetInst = get_setSuspended_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSuspended_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, b);
		setSuspended_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend waitUntilAllOperationsAreFinished_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_waitUntilAllOperationsAreFinished_IMetInst(){
		return ((waitUntilAllOperationsAreFinished_IMetInst != null)
	? (waitUntilAllOperationsAreFinished_IMetInst)
	: (waitUntilAllOperationsAreFinished_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "waitUntilAllOperationsAreFinished", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void waitUntilAllOperationsAreFinished(){
			final com.apple.jobjc.Invoke.MsgSend waitUntilAllOperationsAreFinished_IMetInst = get_waitUntilAllOperationsAreFinished_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		waitUntilAllOperationsAreFinished_IMetInst.init(nativeBuffer, this);
		waitUntilAllOperationsAreFinished_IMetInst.invoke(nativeBuffer);
		
		
	}

}
