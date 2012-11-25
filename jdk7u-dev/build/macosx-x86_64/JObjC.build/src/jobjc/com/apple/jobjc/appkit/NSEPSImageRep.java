package com.apple.jobjc.appkit;

public  class NSEPSImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSEPSImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSEPSImageRep(final NSEPSImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend EPSRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_EPSRepresentation_IMetInst(){
		return ((EPSRepresentation_IMetInst != null)
	? (EPSRepresentation_IMetInst)
	: (EPSRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "EPSRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData EPSRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend EPSRepresentation_IMetInst = get_EPSRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		EPSRepresentation_IMetInst.init(nativeBuffer, this);
		EPSRepresentation_IMetInst.invoke(nativeBuffer);
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

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData epsData){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, epsData);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareGState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareGState_IMetInst(){
		return ((prepareGState_IMetInst != null)
	? (prepareGState_IMetInst)
	: (prepareGState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareGState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void prepareGState(){
			final com.apple.jobjc.Invoke.MsgSend prepareGState_IMetInst = get_prepareGState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareGState_IMetInst.init(nativeBuffer, this);
		prepareGState_IMetInst.invoke(nativeBuffer);
		
		
	}

}
