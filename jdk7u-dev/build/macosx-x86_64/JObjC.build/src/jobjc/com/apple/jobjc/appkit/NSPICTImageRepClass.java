package com.apple.jobjc.appkit;

public  class NSPICTImageRepClass extends com.apple.jobjc.appkit.NSImageRepClass {
	public NSPICTImageRepClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPICTImageRepClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPICTImageRepClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageRepWithData_CMetInst(){
		return ((imageRepWithData_CMetInst != null)
	? (imageRepWithData_CMetInst)
	: (imageRepWithData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageRepWithData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T imageRepWithData(final com.apple.jobjc.foundation.NSData pictData){
			final com.apple.jobjc.Invoke.MsgSend imageRepWithData_CMetInst = get_imageRepWithData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageRepWithData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pictData);
		imageRepWithData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
