package com.apple.jobjc.foundation;

public  class NSBlockOperation extends com.apple.jobjc.foundation.NSOperation {
	public NSBlockOperation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBlockOperation(final NSBlockOperation obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addExecutionBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addExecutionBlock_IMetInst(){
		return ((addExecutionBlock_IMetInst != null)
	? (addExecutionBlock_IMetInst)
	: (addExecutionBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addExecutionBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void addExecutionBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend addExecutionBlock_IMetInst = get_addExecutionBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addExecutionBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		addExecutionBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend executionBlocks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executionBlocks_IMetInst(){
		return ((executionBlocks_IMetInst != null)
	? (executionBlocks_IMetInst)
	: (executionBlocks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executionBlocks", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray executionBlocks(){
			final com.apple.jobjc.Invoke.MsgSend executionBlocks_IMetInst = get_executionBlocks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executionBlocks_IMetInst.init(nativeBuffer, this);
		executionBlocks_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
