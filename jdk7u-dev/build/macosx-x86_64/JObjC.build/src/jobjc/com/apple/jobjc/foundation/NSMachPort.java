package com.apple.jobjc.foundation;

public  class NSMachPort extends com.apple.jobjc.foundation.NSPort {
	public NSMachPort(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMachPort(final NSMachPort obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMachPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMachPort_IMetInst(){
		return ((initWithMachPort_IMetInst != null)
	? (initWithMachPort_IMetInst)
	: (initWithMachPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMachPort:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMachPort(final int machPort){
			final com.apple.jobjc.Invoke.MsgSend initWithMachPort_IMetInst = get_initWithMachPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMachPort_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, machPort);
		initWithMachPort_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMachPort_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMachPort_options_IMetInst(){
		return ((initWithMachPort_options_IMetInst != null)
	? (initWithMachPort_options_IMetInst)
	: (initWithMachPort_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMachPort:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.UIntCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMachPort_options(final int machPort, final long f){
			final com.apple.jobjc.Invoke.MsgSend initWithMachPort_options_IMetInst = get_initWithMachPort_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMachPort_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.push(nativeBuffer, machPort);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, f);
		initWithMachPort_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend machPort_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_machPort_IMetInst(){
		return ((machPort_IMetInst != null)
	? (machPort_IMetInst)
	: (machPort_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "machPort", com.apple.jobjc.PrimitiveCoder.UIntCoder.INST)));
	}

	 public int machPort(){
			final com.apple.jobjc.Invoke.MsgSend machPort_IMetInst = get_machPort_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		machPort_IMetInst.init(nativeBuffer, this);
		machPort_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.UIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromRunLoop_forMode_IMetInst(){
		return ((removeFromRunLoop_forMode_IMetInst != null)
	? (removeFromRunLoop_forMode_IMetInst)
	: (removeFromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFromRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend removeFromRunLoop_forMode_IMetInst = get_removeFromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		removeFromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleInRunLoop_forMode_IMetInst(){
		return ((scheduleInRunLoop_forMode_IMetInst != null)
	? (scheduleInRunLoop_forMode_IMetInst)
	: (scheduleInRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleInRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleInRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop runLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst = get_scheduleInRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleInRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		scheduleInRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

}
