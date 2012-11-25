package com.apple.jobjc.appkit;

public  class NSMenuClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSMenuClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMenuClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMenuClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend menuBarVisible_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuBarVisible_CMetInst(){
		return ((menuBarVisible_CMetInst != null)
	? (menuBarVisible_CMetInst)
	: (menuBarVisible_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuBarVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean menuBarVisible(){
			final com.apple.jobjc.Invoke.MsgSend menuBarVisible_CMetInst = get_menuBarVisible_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuBarVisible_CMetInst.init(nativeBuffer, this);
		menuBarVisible_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuZone_CMetInst(){
		return ((menuZone_CMetInst != null)
	? (menuZone_CMetInst)
	: (menuZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuZone", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> menuZone(){
			final com.apple.jobjc.Invoke.MsgSend menuZone_CMetInst = get_menuZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuZone_CMetInst.init(nativeBuffer, this);
		menuZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> returnValue = (com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend popUpContextMenu_withEvent_forView_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popUpContextMenu_withEvent_forView_CMetInst(){
		return ((popUpContextMenu_withEvent_forView_CMetInst != null)
	? (popUpContextMenu_withEvent_forView_CMetInst)
	: (popUpContextMenu_withEvent_forView_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popUpContextMenu:withEvent:forView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popUpContextMenu_withEvent_forView(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend popUpContextMenu_withEvent_forView_CMetInst = get_popUpContextMenu_withEvent_forView_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popUpContextMenu_withEvent_forView_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		popUpContextMenu_withEvent_forView_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend popUpContextMenu_withEvent_forView_withFont_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popUpContextMenu_withEvent_forView_withFont_CMetInst(){
		return ((popUpContextMenu_withEvent_forView_withFont_CMetInst != null)
	? (popUpContextMenu_withEvent_forView_withFont_CMetInst)
	: (popUpContextMenu_withEvent_forView_withFont_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popUpContextMenu:withEvent:forView:withFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popUpContextMenu_withEvent_forView_withFont(final com.apple.jobjc.appkit.NSMenu menu, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend popUpContextMenu_withEvent_forView_withFont_CMetInst = get_popUpContextMenu_withEvent_forView_withFont_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popUpContextMenu_withEvent_forView_withFont_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		popUpContextMenu_withEvent_forView_withFont_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuBarVisible_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuBarVisible_CMetInst(){
		return ((setMenuBarVisible_CMetInst != null)
	? (setMenuBarVisible_CMetInst)
	: (setMenuBarVisible_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuBarVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMenuBarVisible(final boolean visible){
			final com.apple.jobjc.Invoke.MsgSend setMenuBarVisible_CMetInst = get_setMenuBarVisible_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuBarVisible_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, visible);
		setMenuBarVisible_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuZone_CMetInst(){
		return ((setMenuZone_CMetInst != null)
	? (setMenuZone_CMetInst)
	: (setMenuZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuZone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void setMenuZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> aZone){
			final com.apple.jobjc.Invoke.MsgSend setMenuZone_CMetInst = get_setMenuZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, aZone);
		setMenuZone_CMetInst.invoke(nativeBuffer);
		
		
	}

}
