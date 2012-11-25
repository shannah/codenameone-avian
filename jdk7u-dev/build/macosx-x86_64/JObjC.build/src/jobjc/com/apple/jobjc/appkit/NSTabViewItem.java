package com.apple.jobjc.appkit;

public  class NSTabViewItem extends com.apple.jobjc.foundation.NSObject {
	public NSTabViewItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTabViewItem(final NSTabViewItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend color_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_color_IMetInst(){
		return ((color_IMetInst != null)
	? (color_IMetInst)
	: (color_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "color", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor color(){
			final com.apple.jobjc.Invoke.MsgSend color_IMetInst = get_color_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		color_IMetInst.init(nativeBuffer, this);
		color_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawLabel_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawLabel_inRect_IMetInst(){
		return ((drawLabel_inRect_IMetInst != null)
	? (drawLabel_inRect_IMetInst)
	: (drawLabel_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawLabel:inRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawLabel_inRect(final boolean shouldTruncateLabel, final com.apple.jobjc.foundation.NSRect labelRect){
			final com.apple.jobjc.Invoke.MsgSend drawLabel_inRect_IMetInst = get_drawLabel_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawLabel_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldTruncateLabel);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, labelRect);
		drawLabel_inRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend identifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identifier_IMetInst(){
		return ((identifier_IMetInst != null)
	? (identifier_IMetInst)
	: (identifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T identifier(){
			final com.apple.jobjc.Invoke.MsgSend identifier_IMetInst = get_identifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identifier_IMetInst.init(nativeBuffer, this);
		identifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIdentifier_IMetInst(){
		return ((initWithIdentifier_IMetInst != null)
	? (initWithIdentifier_IMetInst)
	: (initWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIdentifier(final com.apple.jobjc.ID identifier){
			final com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst = get_initWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		initWithIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialFirstResponder_IMetInst(){
		return ((initialFirstResponder_IMetInst != null)
	? (initialFirstResponder_IMetInst)
	: (initialFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialFirstResponder", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initialFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend initialFirstResponder_IMetInst = get_initialFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialFirstResponder_IMetInst.init(nativeBuffer, this);
		initialFirstResponder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend label_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_label_IMetInst(){
		return ((label_IMetInst != null)
	? (label_IMetInst)
	: (label_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "label", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString label(){
			final com.apple.jobjc.Invoke.MsgSend label_IMetInst = get_label_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		label_IMetInst.init(nativeBuffer, this);
		label_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColor_IMetInst(){
		return ((setColor_IMetInst != null)
	? (setColor_IMetInst)
	: (setColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setColor_IMetInst = get_setColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIdentifier_IMetInst(){
		return ((setIdentifier_IMetInst != null)
	? (setIdentifier_IMetInst)
	: (setIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIdentifier(final com.apple.jobjc.ID identifier){
			final com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst = get_setIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		setIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInitialFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInitialFirstResponder_IMetInst(){
		return ((setInitialFirstResponder_IMetInst != null)
	? (setInitialFirstResponder_IMetInst)
	: (setInitialFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInitialFirstResponder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInitialFirstResponder(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setInitialFirstResponder_IMetInst = get_setInitialFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInitialFirstResponder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setInitialFirstResponder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLabel_IMetInst(){
		return ((setLabel_IMetInst != null)
	? (setLabel_IMetInst)
	: (setLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLabel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLabel(final com.apple.jobjc.foundation.NSString label){
			final com.apple.jobjc.Invoke.MsgSend setLabel_IMetInst = get_setLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, label);
		setLabel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setToolTip_IMetInst(){
		return ((setToolTip_IMetInst != null)
	? (setToolTip_IMetInst)
	: (setToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setToolTip:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setToolTip(final com.apple.jobjc.foundation.NSString toolTip){
			final com.apple.jobjc.Invoke.MsgSend setToolTip_IMetInst = get_setToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setToolTip_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolTip);
		setToolTip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setView_IMetInst(){
		return ((setView_IMetInst != null)
	? (setView_IMetInst)
	: (setView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setView_IMetInst = get_setView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeOfLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeOfLabel_IMetInst(){
		return ((sizeOfLabel_IMetInst != null)
	? (sizeOfLabel_IMetInst)
	: (sizeOfLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeOfLabel:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize sizeOfLabel(final boolean computeMin){
			final com.apple.jobjc.Invoke.MsgSend sizeOfLabel_IMetInst = get_sizeOfLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeOfLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, computeMin);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		sizeOfLabel_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabState_IMetInst(){
		return ((tabState_IMetInst != null)
	? (tabState_IMetInst)
	: (tabState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabState", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long tabState(){
			final com.apple.jobjc.Invoke.MsgSend tabState_IMetInst = get_tabState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabState_IMetInst.init(nativeBuffer, this);
		tabState_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabView_IMetInst(){
		return ((tabView_IMetInst != null)
	? (tabView_IMetInst)
	: (tabView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTabView tabView(){
			final com.apple.jobjc.Invoke.MsgSend tabView_IMetInst = get_tabView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabView_IMetInst.init(nativeBuffer, this);
		tabView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTabView returnValue = (com.apple.jobjc.appkit.NSTabView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolTip_IMetInst(){
		return ((toolTip_IMetInst != null)
	? (toolTip_IMetInst)
	: (toolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolTip", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString toolTip(){
			final com.apple.jobjc.Invoke.MsgSend toolTip_IMetInst = get_toolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolTip_IMetInst.init(nativeBuffer, this);
		toolTip_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend view_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_view_IMetInst(){
		return ((view_IMetInst != null)
	? (view_IMetInst)
	: (view_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "view", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T view(){
			final com.apple.jobjc.Invoke.MsgSend view_IMetInst = get_view_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		view_IMetInst.init(nativeBuffer, this);
		view_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
