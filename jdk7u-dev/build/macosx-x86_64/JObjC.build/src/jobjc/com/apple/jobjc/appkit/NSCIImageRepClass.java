package com.apple.jobjc.appkit;

public  class NSCIImageRepClass extends com.apple.jobjc.appkit.NSImageRepClass {
	public NSCIImageRepClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCIImageRepClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCIImageRepClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend imageRepWithCIImage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithCIImage_CMetInst(){
		return ((imageRepWithCIImage_CMetInst != null)
	? (imageRepWithCIImage_CMetInst)
	: (imageRepWithCIImage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithCIImage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithCIImage(final com.apple.jobjc.appkit.CIImage image){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithCIImage_CMetInst = get_imageRepWithCIImage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithCIImage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		imageRepWithCIImage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
