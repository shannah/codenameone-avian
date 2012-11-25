package com.apple.jobjc.foundation;

public  class NSXPCListener extends com.apple.jobjc.foundation.NSObject {
	public NSXPCListener(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXPCListener(final NSXPCListener obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend endpoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endpoint_IMetInst(){
		return ((endpoint_IMetInst != null)
	? (endpoint_IMetInst)
	: (endpoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endpoint", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSXPCListenerEndpoint* (@, @) */ endpoint(){
			final com.apple.jobjc.Invoke.MsgSend endpoint_IMetInst = get_endpoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endpoint_IMetInst.init(nativeBuffer, this);
		endpoint_IMetInst.invoke(nativeBuffer);
		final Object /* NSXPCListenerEndpoint* (@, @) */ returnValue = (Object /* NSXPCListenerEndpoint* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithMachServiceName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithMachServiceName_IMetInst(){
		return ((initWithMachServiceName_IMetInst != null)
	? (initWithMachServiceName_IMetInst)
	: (initWithMachServiceName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithMachServiceName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithMachServiceName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithMachServiceName_IMetInst = get_initWithMachServiceName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithMachServiceName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithMachServiceName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidate_IMetInst(){
		return ((invalidate_IMetInst != null)
	? (invalidate_IMetInst)
	: (invalidate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidate(){
			final com.apple.jobjc.Invoke.MsgSend invalidate_IMetInst = get_invalidate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidate_IMetInst.init(nativeBuffer, this);
		invalidate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resume_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resume_IMetInst(){
		return ((resume_IMetInst != null)
	? (resume_IMetInst)
	: (resume_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resume", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resume(){
			final com.apple.jobjc.Invoke.MsgSend resume_IMetInst = get_resume_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resume_IMetInst.init(nativeBuffer, this);
		resume_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend suspend_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suspend_IMetInst(){
		return ((suspend_IMetInst != null)
	? (suspend_IMetInst)
	: (suspend_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suspend", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void suspend(){
			final com.apple.jobjc.Invoke.MsgSend suspend_IMetInst = get_suspend_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suspend_IMetInst.init(nativeBuffer, this);
		suspend_IMetInst.invoke(nativeBuffer);
		
		
	}

}
