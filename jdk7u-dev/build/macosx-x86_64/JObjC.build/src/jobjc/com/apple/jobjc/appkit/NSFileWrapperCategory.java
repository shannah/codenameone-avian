package com.apple.jobjc.appkit;

public  class NSFileWrapperCategory extends com.apple.jobjc.foundation.NSFileWrapper {
	public NSFileWrapperCategory(final com.apple.jobjc.foundation.NSFileWrapper obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSFileWrapperCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileWrapperCategory(final NSFileWrapperCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend icon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_icon_IMetInst(){
		return ((icon_IMetInst != null)
	? (icon_IMetInst)
	: (icon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "icon", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage icon(){
			final com.apple.jobjc.Invoke.MsgSend icon_IMetInst = get_icon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		icon_IMetInst.init(nativeBuffer, this);
		icon_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setIcon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIcon_IMetInst(){
		return ((setIcon_IMetInst != null)
	? (setIcon_IMetInst)
	: (setIcon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIcon:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIcon(final com.apple.jobjc.appkit.NSImage icon){
			final com.apple.jobjc.Invoke.MsgSend setIcon_IMetInst = get_setIcon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIcon_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, icon);
		setIcon_IMetInst.invoke(nativeBuffer);
		
		
	}

}
