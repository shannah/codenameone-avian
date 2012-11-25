package com.apple.jobjc.appkit;

public  class NSToolbarItemGroup extends com.apple.jobjc.appkit.NSToolbarItem {
	public NSToolbarItemGroup(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSToolbarItemGroup(final NSToolbarItemGroup obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend setSubitems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubitems_IMetInst(){
		return ((setSubitems_IMetInst != null)
	? (setSubitems_IMetInst)
	: (setSubitems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubitems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubitems(final com.apple.jobjc.foundation.NSArray subitems){
			final com.apple.jobjc.Invoke.MsgSend setSubitems_IMetInst = get_setSubitems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubitems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subitems);
		setSubitems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend subitems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subitems_IMetInst(){
		return ((subitems_IMetInst != null)
	? (subitems_IMetInst)
	: (subitems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subitems", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subitems(){
			final com.apple.jobjc.Invoke.MsgSend subitems_IMetInst = get_subitems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subitems_IMetInst.init(nativeBuffer, this);
		subitems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
