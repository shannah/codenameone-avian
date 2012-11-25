package com.apple.jobjc.appkit;

public  class NSFontPanel extends com.apple.jobjc.appkit.NSPanel {
	public NSFontPanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFontPanel(final NSFontPanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryView_IMetInst(){
		return ((accessoryView_IMetInst != null)
	? (accessoryView_IMetInst)
	: (accessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView accessoryView(){
			final com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst = get_accessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryView_IMetInst.init(nativeBuffer, this);
		accessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnabled_IMetInst(){
		return ((isEnabled_IMetInst != null)
	? (isEnabled_IMetInst)
	: (isEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst = get_isEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnabled_IMetInst.init(nativeBuffer, this);
		isEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend panelConvertFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_panelConvertFont_IMetInst(){
		return ((panelConvertFont_IMetInst != null)
	? (panelConvertFont_IMetInst)
	: (panelConvertFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "panelConvertFont:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont panelConvertFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend panelConvertFont_IMetInst = get_panelConvertFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		panelConvertFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		panelConvertFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadDefaultFontFamilies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadDefaultFontFamilies_IMetInst(){
		return ((reloadDefaultFontFamilies_IMetInst != null)
	? (reloadDefaultFontFamilies_IMetInst)
	: (reloadDefaultFontFamilies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadDefaultFontFamilies", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reloadDefaultFontFamilies(){
			final com.apple.jobjc.Invoke.MsgSend reloadDefaultFontFamilies_IMetInst = get_reloadDefaultFontFamilies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadDefaultFontFamilies_IMetInst.init(nativeBuffer, this);
		reloadDefaultFontFamilies_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabled_IMetInst(){
		return ((setEnabled_IMetInst != null)
	? (setEnabled_IMetInst)
	: (setEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst = get_setEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPanelFont_isMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPanelFont_isMultiple_IMetInst(){
		return ((setPanelFont_isMultiple_IMetInst != null)
	? (setPanelFont_isMultiple_IMetInst)
	: (setPanelFont_isMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPanelFont:isMultiple:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPanelFont_isMultiple(final com.apple.jobjc.appkit.NSFont fontObj, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPanelFont_isMultiple_IMetInst = get_setPanelFont_isMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPanelFont_isMultiple_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPanelFont_isMultiple_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend worksWhenModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_worksWhenModal_IMetInst(){
		return ((worksWhenModal_IMetInst != null)
	? (worksWhenModal_IMetInst)
	: (worksWhenModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "worksWhenModal", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean worksWhenModal(){
			final com.apple.jobjc.Invoke.MsgSend worksWhenModal_IMetInst = get_worksWhenModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		worksWhenModal_IMetInst.init(nativeBuffer, this);
		worksWhenModal_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
