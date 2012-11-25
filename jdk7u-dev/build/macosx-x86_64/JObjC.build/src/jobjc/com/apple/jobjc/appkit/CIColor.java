package com.apple.jobjc.appkit;

public  class CIColor extends com.apple.jobjc.foundation.NSObject {
	public CIColor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public CIColor(final CIColor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithColor_IMetInst(){
		return ((initWithColor_IMetInst != null)
	? (initWithColor_IMetInst)
	: (initWithColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithColor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend initWithColor_IMetInst = get_initWithColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		initWithColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
