package com.apple.jobjc.appkit;

public  class NSToolbar extends com.apple.jobjc.foundation.NSObject {
	public NSToolbar(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSToolbar(final NSToolbar obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsUserCustomization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsUserCustomization_IMetInst(){
		return ((allowsUserCustomization_IMetInst != null)
	? (allowsUserCustomization_IMetInst)
	: (allowsUserCustomization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsUserCustomization", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsUserCustomization(){
			final com.apple.jobjc.Invoke.MsgSend allowsUserCustomization_IMetInst = get_allowsUserCustomization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsUserCustomization_IMetInst.init(nativeBuffer, this);
		allowsUserCustomization_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavesConfiguration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavesConfiguration_IMetInst(){
		return ((autosavesConfiguration_IMetInst != null)
	? (autosavesConfiguration_IMetInst)
	: (autosavesConfiguration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavesConfiguration", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosavesConfiguration(){
			final com.apple.jobjc.Invoke.MsgSend autosavesConfiguration_IMetInst = get_autosavesConfiguration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavesConfiguration_IMetInst.init(nativeBuffer, this);
		autosavesConfiguration_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend configurationDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_configurationDictionary_IMetInst(){
		return ((configurationDictionary_IMetInst != null)
	? (configurationDictionary_IMetInst)
	: (configurationDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "configurationDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary configurationDictionary(){
			final com.apple.jobjc.Invoke.MsgSend configurationDictionary_IMetInst = get_configurationDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		configurationDictionary_IMetInst.init(nativeBuffer, this);
		configurationDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend customizationPaletteIsRunning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_customizationPaletteIsRunning_IMetInst(){
		return ((customizationPaletteIsRunning_IMetInst != null)
	? (customizationPaletteIsRunning_IMetInst)
	: (customizationPaletteIsRunning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "customizationPaletteIsRunning", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean customizationPaletteIsRunning(){
			final com.apple.jobjc.Invoke.MsgSend customizationPaletteIsRunning_IMetInst = get_customizationPaletteIsRunning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		customizationPaletteIsRunning_IMetInst.init(nativeBuffer, this);
		customizationPaletteIsRunning_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayMode_IMetInst(){
		return ((displayMode_IMetInst != null)
	? (displayMode_IMetInst)
	: (displayMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long displayMode(){
			final com.apple.jobjc.Invoke.MsgSend displayMode_IMetInst = get_displayMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayMode_IMetInst.init(nativeBuffer, this);
		displayMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fullScreenAccessoryView_IMetInst(){
		return ((fullScreenAccessoryView_IMetInst != null)
	? (fullScreenAccessoryView_IMetInst)
	: (fullScreenAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fullScreenAccessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView fullScreenAccessoryView(){
			final com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryView_IMetInst = get_fullScreenAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fullScreenAccessoryView_IMetInst.init(nativeBuffer, this);
		fullScreenAccessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryViewMaxHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fullScreenAccessoryViewMaxHeight_IMetInst(){
		return ((fullScreenAccessoryViewMaxHeight_IMetInst != null)
	? (fullScreenAccessoryViewMaxHeight_IMetInst)
	: (fullScreenAccessoryViewMaxHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fullScreenAccessoryViewMaxHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double fullScreenAccessoryViewMaxHeight(){
			final com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryViewMaxHeight_IMetInst = get_fullScreenAccessoryViewMaxHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fullScreenAccessoryViewMaxHeight_IMetInst.init(nativeBuffer, this);
		fullScreenAccessoryViewMaxHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryViewMinHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fullScreenAccessoryViewMinHeight_IMetInst(){
		return ((fullScreenAccessoryViewMinHeight_IMetInst != null)
	? (fullScreenAccessoryViewMinHeight_IMetInst)
	: (fullScreenAccessoryViewMinHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fullScreenAccessoryViewMinHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double fullScreenAccessoryViewMinHeight(){
			final com.apple.jobjc.Invoke.MsgSend fullScreenAccessoryViewMinHeight_IMetInst = get_fullScreenAccessoryViewMinHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fullScreenAccessoryViewMinHeight_IMetInst.init(nativeBuffer, this);
		fullScreenAccessoryViewMinHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend identifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identifier_IMetInst(){
		return ((identifier_IMetInst != null)
	? (identifier_IMetInst)
	: (identifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString identifier(){
			final com.apple.jobjc.Invoke.MsgSend identifier_IMetInst = get_identifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identifier_IMetInst.init(nativeBuffer, this);
		identifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIdentifier_IMetInst(){
		return ((initWithIdentifier_IMetInst != null)
	? (initWithIdentifier_IMetInst)
	: (initWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst = get_initWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		initWithIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertItemWithItemIdentifier_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItemWithItemIdentifier_atIndex_IMetInst(){
		return ((insertItemWithItemIdentifier_atIndex_IMetInst != null)
	? (insertItemWithItemIdentifier_atIndex_IMetInst)
	: (insertItemWithItemIdentifier_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItemWithItemIdentifier:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertItemWithItemIdentifier_atIndex(final com.apple.jobjc.foundation.NSString itemIdentifier, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertItemWithItemIdentifier_atIndex_IMetInst = get_insertItemWithItemIdentifier_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItemWithItemIdentifier_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemIdentifier);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertItemWithItemIdentifier_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVisible_IMetInst(){
		return ((isVisible_IMetInst != null)
	? (isVisible_IMetInst)
	: (isVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVisible(){
			final com.apple.jobjc.Invoke.MsgSend isVisible_IMetInst = get_isVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVisible_IMetInst.init(nativeBuffer, this);
		isVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend items_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_items_IMetInst(){
		return ((items_IMetInst != null)
	? (items_IMetInst)
	: (items_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "items", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray items(){
			final com.apple.jobjc.Invoke.MsgSend items_IMetInst = get_items_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		items_IMetInst.init(nativeBuffer, this);
		items_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemAtIndex_IMetInst(){
		return ((removeItemAtIndex_IMetInst != null)
	? (removeItemAtIndex_IMetInst)
	: (removeItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst = get_removeItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		removeItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runCustomizationPalette_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runCustomizationPalette_IMetInst(){
		return ((runCustomizationPalette_IMetInst != null)
	? (runCustomizationPalette_IMetInst)
	: (runCustomizationPalette_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runCustomizationPalette:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void runCustomizationPalette(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend runCustomizationPalette_IMetInst = get_runCustomizationPalette_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runCustomizationPalette_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		runCustomizationPalette_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedItemIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedItemIdentifier_IMetInst(){
		return ((selectedItemIdentifier_IMetInst != null)
	? (selectedItemIdentifier_IMetInst)
	: (selectedItemIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedItemIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString selectedItemIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend selectedItemIdentifier_IMetInst = get_selectedItemIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedItemIdentifier_IMetInst.init(nativeBuffer, this);
		selectedItemIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsUserCustomization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsUserCustomization_IMetInst(){
		return ((setAllowsUserCustomization_IMetInst != null)
	? (setAllowsUserCustomization_IMetInst)
	: (setAllowsUserCustomization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsUserCustomization:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsUserCustomization(final boolean allowCustomization){
			final com.apple.jobjc.Invoke.MsgSend setAllowsUserCustomization_IMetInst = get_setAllowsUserCustomization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsUserCustomization_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowCustomization);
		setAllowsUserCustomization_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosavesConfiguration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosavesConfiguration_IMetInst(){
		return ((setAutosavesConfiguration_IMetInst != null)
	? (setAutosavesConfiguration_IMetInst)
	: (setAutosavesConfiguration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosavesConfiguration:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutosavesConfiguration(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutosavesConfiguration_IMetInst = get_setAutosavesConfiguration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosavesConfiguration_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutosavesConfiguration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setConfigurationFromDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setConfigurationFromDictionary_IMetInst(){
		return ((setConfigurationFromDictionary_IMetInst != null)
	? (setConfigurationFromDictionary_IMetInst)
	: (setConfigurationFromDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setConfigurationFromDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setConfigurationFromDictionary(final com.apple.jobjc.foundation.NSDictionary configDict){
			final com.apple.jobjc.Invoke.MsgSend setConfigurationFromDictionary_IMetInst = get_setConfigurationFromDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setConfigurationFromDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, configDict);
		setConfigurationFromDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplayMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplayMode_IMetInst(){
		return ((setDisplayMode_IMetInst != null)
	? (setDisplayMode_IMetInst)
	: (setDisplayMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplayMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDisplayMode(final long displayMode){
			final com.apple.jobjc.Invoke.MsgSend setDisplayMode_IMetInst = get_setDisplayMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplayMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, displayMode);
		setDisplayMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFullScreenAccessoryView_IMetInst(){
		return ((setFullScreenAccessoryView_IMetInst != null)
	? (setFullScreenAccessoryView_IMetInst)
	: (setFullScreenAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFullScreenAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFullScreenAccessoryView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryView_IMetInst = get_setFullScreenAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFullScreenAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setFullScreenAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryViewMaxHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFullScreenAccessoryViewMaxHeight_IMetInst(){
		return ((setFullScreenAccessoryViewMaxHeight_IMetInst != null)
	? (setFullScreenAccessoryViewMaxHeight_IMetInst)
	: (setFullScreenAccessoryViewMaxHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFullScreenAccessoryViewMaxHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFullScreenAccessoryViewMaxHeight(final double maxHeight){
			final com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryViewMaxHeight_IMetInst = get_setFullScreenAccessoryViewMaxHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFullScreenAccessoryViewMaxHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, maxHeight);
		setFullScreenAccessoryViewMaxHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryViewMinHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFullScreenAccessoryViewMinHeight_IMetInst(){
		return ((setFullScreenAccessoryViewMinHeight_IMetInst != null)
	? (setFullScreenAccessoryViewMinHeight_IMetInst)
	: (setFullScreenAccessoryViewMinHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFullScreenAccessoryViewMinHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFullScreenAccessoryViewMinHeight(final double minHeight){
			final com.apple.jobjc.Invoke.MsgSend setFullScreenAccessoryViewMinHeight_IMetInst = get_setFullScreenAccessoryViewMinHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFullScreenAccessoryViewMinHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, minHeight);
		setFullScreenAccessoryViewMinHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedItemIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedItemIdentifier_IMetInst(){
		return ((setSelectedItemIdentifier_IMetInst != null)
	? (setSelectedItemIdentifier_IMetInst)
	: (setSelectedItemIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedItemIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectedItemIdentifier(final com.apple.jobjc.foundation.NSString itemIdentifier){
			final com.apple.jobjc.Invoke.MsgSend setSelectedItemIdentifier_IMetInst = get_setSelectedItemIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedItemIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, itemIdentifier);
		setSelectedItemIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsBaselineSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsBaselineSeparator_IMetInst(){
		return ((setShowsBaselineSeparator_IMetInst != null)
	? (setShowsBaselineSeparator_IMetInst)
	: (setShowsBaselineSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsBaselineSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsBaselineSeparator(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsBaselineSeparator_IMetInst = get_setShowsBaselineSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsBaselineSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsBaselineSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSizeMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSizeMode_IMetInst(){
		return ((setSizeMode_IMetInst != null)
	? (setSizeMode_IMetInst)
	: (setSizeMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSizeMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setSizeMode(final long sizeMode){
			final com.apple.jobjc.Invoke.MsgSend setSizeMode_IMetInst = get_setSizeMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSizeMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, sizeMode);
		setSizeMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVisible_IMetInst(){
		return ((setVisible_IMetInst != null)
	? (setVisible_IMetInst)
	: (setVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setVisible(final boolean shown){
			final com.apple.jobjc.Invoke.MsgSend setVisible_IMetInst = get_setVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shown);
		setVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsBaselineSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsBaselineSeparator_IMetInst(){
		return ((showsBaselineSeparator_IMetInst != null)
	? (showsBaselineSeparator_IMetInst)
	: (showsBaselineSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsBaselineSeparator", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsBaselineSeparator(){
			final com.apple.jobjc.Invoke.MsgSend showsBaselineSeparator_IMetInst = get_showsBaselineSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsBaselineSeparator_IMetInst.init(nativeBuffer, this);
		showsBaselineSeparator_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeMode_IMetInst(){
		return ((sizeMode_IMetInst != null)
	? (sizeMode_IMetInst)
	: (sizeMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long sizeMode(){
			final com.apple.jobjc.Invoke.MsgSend sizeMode_IMetInst = get_sizeMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeMode_IMetInst.init(nativeBuffer, this);
		sizeMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateVisibleItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateVisibleItems_IMetInst(){
		return ((validateVisibleItems_IMetInst != null)
	? (validateVisibleItems_IMetInst)
	: (validateVisibleItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateVisibleItems", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void validateVisibleItems(){
			final com.apple.jobjc.Invoke.MsgSend validateVisibleItems_IMetInst = get_validateVisibleItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateVisibleItems_IMetInst.init(nativeBuffer, this);
		validateVisibleItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend visibleItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visibleItems_IMetInst(){
		return ((visibleItems_IMetInst != null)
	? (visibleItems_IMetInst)
	: (visibleItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visibleItems", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray visibleItems(){
			final com.apple.jobjc.Invoke.MsgSend visibleItems_IMetInst = get_visibleItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visibleItems_IMetInst.init(nativeBuffer, this);
		visibleItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
