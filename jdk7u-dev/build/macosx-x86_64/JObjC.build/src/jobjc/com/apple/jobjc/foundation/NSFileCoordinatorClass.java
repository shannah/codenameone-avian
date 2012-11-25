package com.apple.jobjc.foundation;

public  class NSFileCoordinatorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFileCoordinatorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFileCoordinatorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFileCoordinatorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addFilePresenter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addFilePresenter_CMetInst(){
		return ((addFilePresenter_CMetInst != null)
	? (addFilePresenter_CMetInst)
	: (addFilePresenter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addFilePresenter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addFilePresenter(final com.apple.jobjc.ID filePresenter){
			final com.apple.jobjc.Invoke.MsgSend addFilePresenter_CMetInst = get_addFilePresenter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addFilePresenter_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filePresenter);
		addFilePresenter_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend filePresenters_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filePresenters_CMetInst(){
		return ((filePresenters_CMetInst != null)
	? (filePresenters_CMetInst)
	: (filePresenters_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filePresenters", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray filePresenters(){
			final com.apple.jobjc.Invoke.MsgSend filePresenters_CMetInst = get_filePresenters_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filePresenters_CMetInst.init(nativeBuffer, this);
		filePresenters_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFilePresenter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFilePresenter_CMetInst(){
		return ((removeFilePresenter_CMetInst != null)
	? (removeFilePresenter_CMetInst)
	: (removeFilePresenter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFilePresenter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFilePresenter(final com.apple.jobjc.ID filePresenter){
			final com.apple.jobjc.Invoke.MsgSend removeFilePresenter_CMetInst = get_removeFilePresenter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFilePresenter_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filePresenter);
		removeFilePresenter_CMetInst.invoke(nativeBuffer);
		
		
	}

}
