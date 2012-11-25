package com.apple.jobjc.appkit;

public  class NSToolbarItem extends com.apple.jobjc.foundation.NSObject {
	public NSToolbarItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSToolbarItem(final NSToolbarItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend action_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_action_IMetInst(){
		return ((action_IMetInst != null)
	? (action_IMetInst)
	: (action_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "action", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL action(){
			final com.apple.jobjc.Invoke.MsgSend action_IMetInst = get_action_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		action_IMetInst.init(nativeBuffer, this);
		action_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsDuplicatesInToolbar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsDuplicatesInToolbar_IMetInst(){
		return ((allowsDuplicatesInToolbar_IMetInst != null)
	? (allowsDuplicatesInToolbar_IMetInst)
	: (allowsDuplicatesInToolbar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsDuplicatesInToolbar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsDuplicatesInToolbar(){
			final com.apple.jobjc.Invoke.MsgSend allowsDuplicatesInToolbar_IMetInst = get_allowsDuplicatesInToolbar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsDuplicatesInToolbar_IMetInst.init(nativeBuffer, this);
		allowsDuplicatesInToolbar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autovalidates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autovalidates_IMetInst(){
		return ((autovalidates_IMetInst != null)
	? (autovalidates_IMetInst)
	: (autovalidates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autovalidates", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autovalidates(){
			final com.apple.jobjc.Invoke.MsgSend autovalidates_IMetInst = get_autovalidates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autovalidates_IMetInst.init(nativeBuffer, this);
		autovalidates_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithItemIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithItemIdentifier_IMetInst(){
		return ((initWithItemIdentifier_IMetInst != null)
	? (initWithItemIdentifier_IMetInst)
	: (initWithItemIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithItemIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithItemIdentifier(final com.apple.jobjc.foundation.NSString itemIdentifier){
			final com.apple.jobjc.Invoke.MsgSend initWithItemIdentifier_IMetInst = get_initWithItemIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithItemIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemIdentifier);
		initWithItemIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend itemIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemIdentifier_IMetInst(){
		return ((itemIdentifier_IMetInst != null)
	? (itemIdentifier_IMetInst)
	: (itemIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString itemIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend itemIdentifier_IMetInst = get_itemIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemIdentifier_IMetInst.init(nativeBuffer, this);
		itemIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend maxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxSize_IMetInst(){
		return ((maxSize_IMetInst != null)
	? (maxSize_IMetInst)
	: (maxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize maxSize(){
			final com.apple.jobjc.Invoke.MsgSend maxSize_IMetInst = get_maxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		maxSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuFormRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuFormRepresentation_IMetInst(){
		return ((menuFormRepresentation_IMetInst != null)
	? (menuFormRepresentation_IMetInst)
	: (menuFormRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuFormRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem menuFormRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend menuFormRepresentation_IMetInst = get_menuFormRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuFormRepresentation_IMetInst.init(nativeBuffer, this);
		menuFormRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minSize_IMetInst(){
		return ((minSize_IMetInst != null)
	? (minSize_IMetInst)
	: (minSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minSize(){
			final com.apple.jobjc.Invoke.MsgSend minSize_IMetInst = get_minSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paletteLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paletteLabel_IMetInst(){
		return ((paletteLabel_IMetInst != null)
	? (paletteLabel_IMetInst)
	: (paletteLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paletteLabel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString paletteLabel(){
			final com.apple.jobjc.Invoke.MsgSend paletteLabel_IMetInst = get_paletteLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paletteLabel_IMetInst.init(nativeBuffer, this);
		paletteLabel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAction_IMetInst(){
		return ((setAction_IMetInst != null)
	? (setAction_IMetInst)
	: (setAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setAction(final com.apple.jobjc.SEL action){
			final com.apple.jobjc.Invoke.MsgSend setAction_IMetInst = get_setAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, action);
		setAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutovalidates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutovalidates_IMetInst(){
		return ((setAutovalidates_IMetInst != null)
	? (setAutovalidates_IMetInst)
	: (setAutovalidates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutovalidates:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutovalidates(final boolean resistance){
			final com.apple.jobjc.Invoke.MsgSend setAutovalidates_IMetInst = get_setAutovalidates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutovalidates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, resistance);
		setAutovalidates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabled_IMetInst(){
		return ((setEnabled_IMetInst != null)
	? (setEnabled_IMetInst)
	: (setEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEnabled(final boolean enabled){
			final com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst = get_setEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, enabled);
		setEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setMaxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxSize_IMetInst(){
		return ((setMaxSize_IMetInst != null)
	? (setMaxSize_IMetInst)
	: (setMaxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMaxSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMaxSize_IMetInst = get_setMaxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMaxSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuFormRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuFormRepresentation_IMetInst(){
		return ((setMenuFormRepresentation_IMetInst != null)
	? (setMenuFormRepresentation_IMetInst)
	: (setMenuFormRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuFormRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenuFormRepresentation(final com.apple.jobjc.appkit.NSMenuItem menuItem){
			final com.apple.jobjc.Invoke.MsgSend setMenuFormRepresentation_IMetInst = get_setMenuFormRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuFormRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuItem);
		setMenuFormRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinSize_IMetInst(){
		return ((setMinSize_IMetInst != null)
	? (setMinSize_IMetInst)
	: (setMinSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMinSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMinSize_IMetInst = get_setMinSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMinSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPaletteLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPaletteLabel_IMetInst(){
		return ((setPaletteLabel_IMetInst != null)
	? (setPaletteLabel_IMetInst)
	: (setPaletteLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPaletteLabel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPaletteLabel(final com.apple.jobjc.foundation.NSString paletteLabel){
			final com.apple.jobjc.Invoke.MsgSend setPaletteLabel_IMetInst = get_setPaletteLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPaletteLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paletteLabel);
		setPaletteLabel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTag_IMetInst(){
		return ((setTag_IMetInst != null)
	? (setTag_IMetInst)
	: (setTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend setTag_IMetInst = get_setTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		setTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setVisibilityPriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVisibilityPriority_IMetInst(){
		return ((setVisibilityPriority_IMetInst != null)
	? (setVisibilityPriority_IMetInst)
	: (setVisibilityPriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVisibilityPriority:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setVisibilityPriority(final long visibilityPriority){
			final com.apple.jobjc.Invoke.MsgSend setVisibilityPriority_IMetInst = get_setVisibilityPriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVisibilityPriority_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, visibilityPriority);
		setVisibilityPriority_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tag_IMetInst(){
		return ((tag_IMetInst != null)
	? (tag_IMetInst)
	: (tag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tag", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long tag(){
			final com.apple.jobjc.Invoke.MsgSend tag_IMetInst = get_tag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tag_IMetInst.init(nativeBuffer, this);
		tag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend target_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_target_IMetInst(){
		return ((target_IMetInst != null)
	? (target_IMetInst)
	: (target_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "target", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T target(){
			final com.apple.jobjc.Invoke.MsgSend target_IMetInst = get_target_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		target_IMetInst.init(nativeBuffer, this);
		target_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend toolbar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolbar_IMetInst(){
		return ((toolbar_IMetInst != null)
	? (toolbar_IMetInst)
	: (toolbar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolbar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSToolbar toolbar(){
			final com.apple.jobjc.Invoke.MsgSend toolbar_IMetInst = get_toolbar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolbar_IMetInst.init(nativeBuffer, this);
		toolbar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSToolbar returnValue = (com.apple.jobjc.appkit.NSToolbar) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validate_IMetInst(){
		return ((validate_IMetInst != null)
	? (validate_IMetInst)
	: (validate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void validate(){
			final com.apple.jobjc.Invoke.MsgSend validate_IMetInst = get_validate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validate_IMetInst.init(nativeBuffer, this);
		validate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend view_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_view_IMetInst(){
		return ((view_IMetInst != null)
	? (view_IMetInst)
	: (view_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "view", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView view(){
			final com.apple.jobjc.Invoke.MsgSend view_IMetInst = get_view_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		view_IMetInst.init(nativeBuffer, this);
		view_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend visibilityPriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visibilityPriority_IMetInst(){
		return ((visibilityPriority_IMetInst != null)
	? (visibilityPriority_IMetInst)
	: (visibilityPriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visibilityPriority", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long visibilityPriority(){
			final com.apple.jobjc.Invoke.MsgSend visibilityPriority_IMetInst = get_visibilityPriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visibilityPriority_IMetInst.init(nativeBuffer, this);
		visibilityPriority_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
