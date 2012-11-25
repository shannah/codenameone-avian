package com.apple.jobjc.foundation;

public  class NSURLConnection extends com.apple.jobjc.foundation.NSObject {
	public NSURLConnection(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLConnection(final NSURLConnection obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend initWithRequest_delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRequest_delegate_IMetInst(){
		return ((initWithRequest_delegate_IMetInst != null)
	? (initWithRequest_delegate_IMetInst)
	: (initWithRequest_delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRequest:delegate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRequest_delegate(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend initWithRequest_delegate_IMetInst = get_initWithRequest_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRequest_delegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		initWithRequest_delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRequest_delegate_startImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRequest_delegate_startImmediately_IMetInst(){
		return ((initWithRequest_delegate_startImmediately_IMetInst != null)
	? (initWithRequest_delegate_startImmediately_IMetInst)
	: (initWithRequest_delegate_startImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRequest:delegate:startImmediately:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRequest_delegate_startImmediately(final com.apple.jobjc.foundation.NSURLRequest request, final com.apple.jobjc.ID delegate, final boolean startImmediately){
			final com.apple.jobjc.Invoke.MsgSend initWithRequest_delegate_startImmediately_IMetInst = get_initWithRequest_delegate_startImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRequest_delegate_startImmediately_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, request);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, startImmediately);
		initWithRequest_delegate_startImmediately_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleInRunLoop_forMode_IMetInst(){
		return ((scheduleInRunLoop_forMode_IMetInst != null)
	? (scheduleInRunLoop_forMode_IMetInst)
	: (scheduleInRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleInRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scheduleInRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend scheduleInRunLoop_forMode_IMetInst = get_scheduleInRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleInRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		scheduleInRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegateQueue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegateQueue_IMetInst(){
		return ((setDelegateQueue_IMetInst != null)
	? (setDelegateQueue_IMetInst)
	: (setDelegateQueue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegateQueue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegateQueue(final com.apple.jobjc.foundation.NSOperationQueue queue){
			final com.apple.jobjc.Invoke.MsgSend setDelegateQueue_IMetInst = get_setDelegateQueue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegateQueue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, queue);
		setDelegateQueue_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend unscheduleFromRunLoop_forMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unscheduleFromRunLoop_forMode_IMetInst(){
		return ((unscheduleFromRunLoop_forMode_IMetInst != null)
	? (unscheduleFromRunLoop_forMode_IMetInst)
	: (unscheduleFromRunLoop_forMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unscheduleFromRunLoop:forMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unscheduleFromRunLoop_forMode(final com.apple.jobjc.foundation.NSRunLoop aRunLoop, final com.apple.jobjc.foundation.NSString mode){
			final com.apple.jobjc.Invoke.MsgSend unscheduleFromRunLoop_forMode_IMetInst = get_unscheduleFromRunLoop_forMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unscheduleFromRunLoop_forMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aRunLoop);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		unscheduleFromRunLoop_forMode_IMetInst.invoke(nativeBuffer);
		
		
	}

}
