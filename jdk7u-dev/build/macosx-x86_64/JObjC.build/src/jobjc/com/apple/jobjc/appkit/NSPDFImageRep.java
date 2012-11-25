package com.apple.jobjc.appkit;

public  class NSPDFImageRep extends com.apple.jobjc.appkit.NSImageRep {
	public NSPDFImageRep(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPDFImageRep(final NSPDFImageRep obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend PDFRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PDFRepresentation_IMetInst(){
		return ((PDFRepresentation_IMetInst != null)
	? (PDFRepresentation_IMetInst)
	: (PDFRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PDFRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData PDFRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend PDFRepresentation_IMetInst = get_PDFRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PDFRepresentation_IMetInst.init(nativeBuffer, this);
		PDFRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bounds_IMetInst(){
		return ((bounds_IMetInst != null)
	? (bounds_IMetInst)
	: (bounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect bounds(){
			final com.apple.jobjc.Invoke.MsgSend bounds_IMetInst = get_bounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		bounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentPage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentPage_IMetInst(){
		return ((currentPage_IMetInst != null)
	? (currentPage_IMetInst)
	: (currentPage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentPage", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long currentPage(){
			final com.apple.jobjc.Invoke.MsgSend currentPage_IMetInst = get_currentPage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentPage_IMetInst.init(nativeBuffer, this);
		currentPage_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_IMetInst(){
		return ((initWithData_IMetInst != null)
	? (initWithData_IMetInst)
	: (initWithData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData(final com.apple.jobjc.foundation.NSData pdfData){
			final com.apple.jobjc.Invoke.MsgSend initWithData_IMetInst = get_initWithData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pdfData);
		initWithData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageCount_IMetInst(){
		return ((pageCount_IMetInst != null)
	? (pageCount_IMetInst)
	: (pageCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long pageCount(){
			final com.apple.jobjc.Invoke.MsgSend pageCount_IMetInst = get_pageCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageCount_IMetInst.init(nativeBuffer, this);
		pageCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentPage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentPage_IMetInst(){
		return ((setCurrentPage_IMetInst != null)
	? (setCurrentPage_IMetInst)
	: (setCurrentPage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentPage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setCurrentPage(final long page){
			final com.apple.jobjc.Invoke.MsgSend setCurrentPage_IMetInst = get_setCurrentPage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentPage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, page);
		setCurrentPage_IMetInst.invoke(nativeBuffer);
		
		
	}

}
