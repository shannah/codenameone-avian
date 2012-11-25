package com.apple.jobjc.foundation;

public  class NSURLDownload extends com.apple.jobjc.foundation.NSObject {
	public NSURLDownload(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURLDownload(final NSURLDownload obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend deletesFileUponFailure_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deletesFileUponFailure_IMetInst(){
		return ((deletesFileUponFailure_IMetInst != null)
	? (deletesFileUponFailure_IMetInst)
	: (deletesFileUponFailure_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deletesFileUponFailure", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean deletesFileUponFailure(){
			final com.apple.jobjc.Invoke.MsgSend deletesFileUponFailure_IMetInst = get_deletesFileUponFailure_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deletesFileUponFailure_IMetInst.init(nativeBuffer, this);
		deletesFileUponFailure_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithResumeData_delegate_path_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithResumeData_delegate_path_IMetInst(){
		return ((initWithResumeData_delegate_path_IMetInst != null)
	? (initWithResumeData_delegate_path_IMetInst)
	: (initWithResumeData_delegate_path_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithResumeData:delegate:path:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithResumeData_delegate_path(final com.apple.jobjc.foundation.NSData resumeData, final com.apple.jobjc.ID delegate, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithResumeData_delegate_path_IMetInst = get_initWithResumeData_delegate_path_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithResumeData_delegate_path_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, resumeData);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithResumeData_delegate_path_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend request_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_request_IMetInst(){
		return ((request_IMetInst != null)
	? (request_IMetInst)
	: (request_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "request", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLRequest request(){
			final com.apple.jobjc.Invoke.MsgSend request_IMetInst = get_request_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		request_IMetInst.init(nativeBuffer, this);
		request_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLRequest returnValue = (com.apple.jobjc.foundation.NSURLRequest) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resumeData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resumeData_IMetInst(){
		return ((resumeData_IMetInst != null)
	? (resumeData_IMetInst)
	: (resumeData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resumeData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData resumeData(){
			final com.apple.jobjc.Invoke.MsgSend resumeData_IMetInst = get_resumeData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resumeData_IMetInst.init(nativeBuffer, this);
		resumeData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDeletesFileUponFailure_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDeletesFileUponFailure_IMetInst(){
		return ((setDeletesFileUponFailure_IMetInst != null)
	? (setDeletesFileUponFailure_IMetInst)
	: (setDeletesFileUponFailure_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDeletesFileUponFailure:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDeletesFileUponFailure(final boolean deletesFileUponFailure){
			final com.apple.jobjc.Invoke.MsgSend setDeletesFileUponFailure_IMetInst = get_setDeletesFileUponFailure_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDeletesFileUponFailure_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, deletesFileUponFailure);
		setDeletesFileUponFailure_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDestination_allowOverwrite_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDestination_allowOverwrite_IMetInst(){
		return ((setDestination_allowOverwrite_IMetInst != null)
	? (setDestination_allowOverwrite_IMetInst)
	: (setDestination_allowOverwrite_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDestination:allowOverwrite:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDestination_allowOverwrite(final com.apple.jobjc.foundation.NSString path, final boolean allowOverwrite){
			final com.apple.jobjc.Invoke.MsgSend setDestination_allowOverwrite_IMetInst = get_setDestination_allowOverwrite_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDestination_allowOverwrite_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowOverwrite);
		setDestination_allowOverwrite_IMetInst.invoke(nativeBuffer);
		
		
	}

}
