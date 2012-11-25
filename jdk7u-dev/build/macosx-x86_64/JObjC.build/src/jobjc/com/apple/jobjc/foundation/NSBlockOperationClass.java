package com.apple.jobjc.foundation;

public  class NSBlockOperationClass extends com.apple.jobjc.foundation.NSOperationClass {
	public NSBlockOperationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBlockOperationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBlockOperationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend blockOperationWithBlock_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_blockOperationWithBlock_CMetInst(){
		return ((blockOperationWithBlock_CMetInst != null)
	? (blockOperationWithBlock_CMetInst)
	: (blockOperationWithBlock_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "blockOperationWithBlock:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T blockOperationWithBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend blockOperationWithBlock_CMetInst = get_blockOperationWithBlock_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		blockOperationWithBlock_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		blockOperationWithBlock_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
