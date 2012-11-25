package com.apple.jobjc.appkit;

public  class NSPDFImageRepClass extends com.apple.jobjc.appkit.NSImageRepClass {
	public NSPDFImageRepClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPDFImageRepClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPDFImageRepClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithData_CMetInst(){
		return ((imageRepWithData_CMetInst != null)
	? (imageRepWithData_CMetInst)
	: (imageRepWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithData(final com.apple.jobjc.foundation.NSData pdfData){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst = get_imageRepWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pdfData);
		imageRepWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
