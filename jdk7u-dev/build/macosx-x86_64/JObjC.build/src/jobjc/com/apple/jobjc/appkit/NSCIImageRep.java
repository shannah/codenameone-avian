package com.apple.jobjc.appkit;

public  class NSCIImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSCIImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCIImageRep(final NSCIImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend CIImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_CIImage_IMetInst(){
		return ((CIImage_IMetInst != null)
	? (CIImage_IMetInst)
	: (CIImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "CIImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.CIImage CIImage(){
			final com.apple.jobjc.Invoke.MsgSend CIImage_IMetInst = get_CIImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		CIImage_IMetInst.init(nativeBuffer, this);
		CIImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.CIImage returnValue = (com.apple.jobjc.appkit.CIImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCIImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCIImage_IMetInst(){
		return ((initWithCIImage_IMetInst != null)
	? (initWithCIImage_IMetInst)
	: (initWithCIImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCIImage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCIImage(final com.apple.jobjc.appkit.CIImage image){
			final com.apple.jobjc.Invoke.MsgSend initWithCIImage_IMetInst = get_initWithCIImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCIImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		initWithCIImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
