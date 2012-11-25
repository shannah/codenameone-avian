package com.apple.jobjc.foundation;

public  class NSPipeClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPipeClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPipeClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPipeClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend pipe_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pipe_CMetInst(){
		return ((pipe_CMetInst != null)
	? (pipe_CMetInst)
	: (pipe_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pipe", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T pipe(){
			final com.apple.jobjc.Invoke.MsgSend pipe_CMetInst = get_pipe_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pipe_CMetInst.init(nativeBuffer, this);
		pipe_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
