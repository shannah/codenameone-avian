package com.apple.jobjc.appkit;

public  class NSColorPanelClass extends com.apple.jobjc.appkit.NSPanelClass {
	public NSColorPanelClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSColorPanelClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSColorPanelClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dragColor_withEvent_fromView_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragColor_withEvent_fromView_CMetInst(){
		return ((dragColor_withEvent_fromView_CMetInst != null)
	? (dragColor_withEvent_fromView_CMetInst)
	: (dragColor_withEvent_fromView_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragColor:withEvent:fromView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean dragColor_withEvent_fromView(final com.apple.jobjc.appkit.NSColor color, final com.apple.jobjc.appkit.NSEvent theEvent, final com.apple.jobjc.appkit.NSView sourceView){
			final com.apple.jobjc.Invoke.MsgSend dragColor_withEvent_fromView_CMetInst = get_dragColor_withEvent_fromView_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragColor_withEvent_fromView_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sourceView);
		dragColor_withEvent_fromView_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPickerMask_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPickerMask_CMetInst(){
		return ((setPickerMask_CMetInst != null)
	? (setPickerMask_CMetInst)
	: (setPickerMask_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPickerMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setPickerMask(final long mask){
			final com.apple.jobjc.Invoke.MsgSend setPickerMask_CMetInst = get_setPickerMask_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPickerMask_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		setPickerMask_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPickerMode_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPickerMode_CMetInst(){
		return ((setPickerMode_CMetInst != null)
	? (setPickerMode_CMetInst)
	: (setPickerMode_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPickerMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPickerMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setPickerMode_CMetInst = get_setPickerMode_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPickerMode_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mode);
		setPickerMode_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedColorPanel_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedColorPanel_CMetInst(){
		return ((sharedColorPanel_CMetInst != null)
	? (sharedColorPanel_CMetInst)
	: (sharedColorPanel_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedColorPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorPanel sharedColorPanel(){
			final com.apple.jobjc.Invoke.MsgSend sharedColorPanel_CMetInst = get_sharedColorPanel_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedColorPanel_CMetInst.init(nativeBuffer, this);
		sharedColorPanel_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorPanel returnValue = (com.apple.jobjc.appkit.NSColorPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedColorPanelExists_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedColorPanelExists_CMetInst(){
		return ((sharedColorPanelExists_CMetInst != null)
	? (sharedColorPanelExists_CMetInst)
	: (sharedColorPanelExists_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedColorPanelExists", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sharedColorPanelExists(){
			final com.apple.jobjc.Invoke.MsgSend sharedColorPanelExists_CMetInst = get_sharedColorPanelExists_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedColorPanelExists_CMetInst.init(nativeBuffer, this);
		sharedColorPanelExists_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
