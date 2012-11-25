package com.apple.jobjc.appkit;

public  class NSPICTImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSPICTImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPICTImageRep(final NSPICTImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend PICTRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PICTRepresentation_IMetInst(){
		return ((PICTRepresentation_IMetInst != null)
	? (PICTRepresentation_IMetInst)
	: (PICTRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PICTRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData PICTRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend PICTRepresentation_IMetInst = get_PICTRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PICTRepresentation_IMetInst.init(nativeBuffer, this);
		PICTRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundingBox_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundingBox_IMetInst(){
		return ((boundingBox_IMetInst != null)
	? (boundingBox_IMetInst)
	: (boundingBox_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundingBox", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect boundingBox(){
			final com.apple.jobjc.Invoke.MsgSend boundingBox_IMetInst = get_boundingBox_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundingBox_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundingBox_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData pictData){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pictData);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
