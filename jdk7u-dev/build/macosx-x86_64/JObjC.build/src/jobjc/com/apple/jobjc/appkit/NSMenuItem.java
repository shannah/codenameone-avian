package com.apple.jobjc.appkit;

public  class NSMenuItem extends com.apple.jobjc.foundation.NSObject {
	public NSMenuItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMenuItem(final NSMenuItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend attributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedTitle_IMetInst(){
		return ((attributedTitle_IMetInst != null)
	? (attributedTitle_IMetInst)
	: (attributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedTitle(){
			final com.apple.jobjc.Invoke.MsgSend attributedTitle_IMetInst = get_attributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedTitle_IMetInst.init(nativeBuffer, this);
		attributedTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasSubmenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasSubmenu_IMetInst(){
		return ((hasSubmenu_IMetInst != null)
	? (hasSubmenu_IMetInst)
	: (hasSubmenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasSubmenu", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasSubmenu(){
			final com.apple.jobjc.Invoke.MsgSend hasSubmenu_IMetInst = get_hasSubmenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasSubmenu_IMetInst.init(nativeBuffer, this);
		hasSubmenu_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend indentationLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indentationLevel_IMetInst(){
		return ((indentationLevel_IMetInst != null)
	? (indentationLevel_IMetInst)
	: (indentationLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indentationLevel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long indentationLevel(){
			final com.apple.jobjc.Invoke.MsgSend indentationLevel_IMetInst = get_indentationLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indentationLevel_IMetInst.init(nativeBuffer, this);
		indentationLevel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTitle_action_keyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTitle_action_keyEquivalent_IMetInst(){
		return ((initWithTitle_action_keyEquivalent_IMetInst != null)
	? (initWithTitle_action_keyEquivalent_IMetInst)
	: (initWithTitle_action_keyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTitle:action:keyEquivalent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTitle_action_keyEquivalent(final com.apple.jobjc.foundation.NSString aString, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSString charCode){
			final com.apple.jobjc.Invoke.MsgSend initWithTitle_action_keyEquivalent_IMetInst = get_initWithTitle_action_keyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTitle_action_keyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, charCode);
		initWithTitle_action_keyEquivalent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAlternate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAlternate_IMetInst(){
		return ((isAlternate_IMetInst != null)
	? (isAlternate_IMetInst)
	: (isAlternate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAlternate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAlternate(){
			final com.apple.jobjc.Invoke.MsgSend isAlternate_IMetInst = get_isAlternate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAlternate_IMetInst.init(nativeBuffer, this);
		isAlternate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHidden_IMetInst(){
		return ((isHidden_IMetInst != null)
	? (isHidden_IMetInst)
	: (isHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHidden", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHidden(){
			final com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst = get_isHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHidden_IMetInst.init(nativeBuffer, this);
		isHidden_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHiddenOrHasHiddenAncestor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHiddenOrHasHiddenAncestor_IMetInst(){
		return ((isHiddenOrHasHiddenAncestor_IMetInst != null)
	? (isHiddenOrHasHiddenAncestor_IMetInst)
	: (isHiddenOrHasHiddenAncestor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHiddenOrHasHiddenAncestor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHiddenOrHasHiddenAncestor(){
			final com.apple.jobjc.Invoke.MsgSend isHiddenOrHasHiddenAncestor_IMetInst = get_isHiddenOrHasHiddenAncestor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHiddenOrHasHiddenAncestor_IMetInst.init(nativeBuffer, this);
		isHiddenOrHasHiddenAncestor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHighlighted_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHighlighted_IMetInst(){
		return ((isHighlighted_IMetInst != null)
	? (isHighlighted_IMetInst)
	: (isHighlighted_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHighlighted", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHighlighted(){
			final com.apple.jobjc.Invoke.MsgSend isHighlighted_IMetInst = get_isHighlighted_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHighlighted_IMetInst.init(nativeBuffer, this);
		isHighlighted_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSeparatorItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSeparatorItem_IMetInst(){
		return ((isSeparatorItem_IMetInst != null)
	? (isSeparatorItem_IMetInst)
	: (isSeparatorItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSeparatorItem", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSeparatorItem(){
			final com.apple.jobjc.Invoke.MsgSend isSeparatorItem_IMetInst = get_isSeparatorItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSeparatorItem_IMetInst.init(nativeBuffer, this);
		isSeparatorItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalent_IMetInst(){
		return ((keyEquivalent_IMetInst != null)
	? (keyEquivalent_IMetInst)
	: (keyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString keyEquivalent(){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalent_IMetInst = get_keyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalent_IMetInst.init(nativeBuffer, this);
		keyEquivalent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalentModifierMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalentModifierMask_IMetInst(){
		return ((keyEquivalentModifierMask_IMetInst != null)
	? (keyEquivalentModifierMask_IMetInst)
	: (keyEquivalentModifierMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalentModifierMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long keyEquivalentModifierMask(){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalentModifierMask_IMetInst = get_keyEquivalentModifierMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalentModifierMask_IMetInst.init(nativeBuffer, this);
		keyEquivalentModifierMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menu_IMetInst(){
		return ((menu_IMetInst != null)
	? (menu_IMetInst)
	: (menu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menu(){
			final com.apple.jobjc.Invoke.MsgSend menu_IMetInst = get_menu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menu_IMetInst.init(nativeBuffer, this);
		menu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mixedStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mixedStateImage_IMetInst(){
		return ((mixedStateImage_IMetInst != null)
	? (mixedStateImage_IMetInst)
	: (mixedStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mixedStateImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage mixedStateImage(){
			final com.apple.jobjc.Invoke.MsgSend mixedStateImage_IMetInst = get_mixedStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mixedStateImage_IMetInst.init(nativeBuffer, this);
		mixedStateImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mnemonic_IMetInst(){
		return ((mnemonic_IMetInst != null)
	? (mnemonic_IMetInst)
	: (mnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mnemonic", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString mnemonic(){
			final com.apple.jobjc.Invoke.MsgSend mnemonic_IMetInst = get_mnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mnemonic_IMetInst.init(nativeBuffer, this);
		mnemonic_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mnemonicLocation_IMetInst(){
		return ((mnemonicLocation_IMetInst != null)
	? (mnemonicLocation_IMetInst)
	: (mnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mnemonicLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long mnemonicLocation(){
			final com.apple.jobjc.Invoke.MsgSend mnemonicLocation_IMetInst = get_mnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mnemonicLocation_IMetInst.init(nativeBuffer, this);
		mnemonicLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend offStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_offStateImage_IMetInst(){
		return ((offStateImage_IMetInst != null)
	? (offStateImage_IMetInst)
	: (offStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "offStateImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage offStateImage(){
			final com.apple.jobjc.Invoke.MsgSend offStateImage_IMetInst = get_offStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		offStateImage_IMetInst.init(nativeBuffer, this);
		offStateImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend onStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_onStateImage_IMetInst(){
		return ((onStateImage_IMetInst != null)
	? (onStateImage_IMetInst)
	: (onStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "onStateImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage onStateImage(){
			final com.apple.jobjc.Invoke.MsgSend onStateImage_IMetInst = get_onStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		onStateImage_IMetInst.init(nativeBuffer, this);
		onStateImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentItem_IMetInst(){
		return ((parentItem_IMetInst != null)
	? (parentItem_IMetInst)
	: (parentItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem parentItem(){
			final com.apple.jobjc.Invoke.MsgSend parentItem_IMetInst = get_parentItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentItem_IMetInst.init(nativeBuffer, this);
		parentItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedObject_IMetInst(){
		return ((representedObject_IMetInst != null)
	? (representedObject_IMetInst)
	: (representedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T representedObject(){
			final com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst = get_representedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedObject_IMetInst.init(nativeBuffer, this);
		representedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAction_IMetInst(){
		return ((setAction_IMetInst != null)
	? (setAction_IMetInst)
	: (setAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setAction(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend setAction_IMetInst = get_setAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		setAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlternate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternate_IMetInst(){
		return ((setAlternate_IMetInst != null)
	? (setAlternate_IMetInst)
	: (setAlternate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAlternate(final boolean isAlternate){
			final com.apple.jobjc.Invoke.MsgSend setAlternate_IMetInst = get_setAlternate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isAlternate);
		setAlternate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedTitle_IMetInst(){
		return ((setAttributedTitle_IMetInst != null)
	? (setAttributedTitle_IMetInst)
	: (setAttributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedTitle(final com.apple.jobjc.foundation.NSAttributedString string){
			final com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst = get_setAttributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setAttributedTitle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHidden_IMetInst(){
		return ((setHidden_IMetInst != null)
	? (setHidden_IMetInst)
	: (setHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHidden:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHidden(final boolean hidden){
			final com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst = get_setHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHidden_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hidden);
		setHidden_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage menuImage){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuImage);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndentationLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndentationLevel_IMetInst(){
		return ((setIndentationLevel_IMetInst != null)
	? (setIndentationLevel_IMetInst)
	: (setIndentationLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndentationLevel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setIndentationLevel(final long indentationLevel){
			final com.apple.jobjc.Invoke.MsgSend setIndentationLevel_IMetInst = get_setIndentationLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndentationLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, indentationLevel);
		setIndentationLevel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyEquivalent_IMetInst(){
		return ((setKeyEquivalent_IMetInst != null)
	? (setKeyEquivalent_IMetInst)
	: (setKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyEquivalent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKeyEquivalent(final com.apple.jobjc.foundation.NSString aKeyEquivalent){
			final com.apple.jobjc.Invoke.MsgSend setKeyEquivalent_IMetInst = get_setKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aKeyEquivalent);
		setKeyEquivalent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeyEquivalentModifierMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyEquivalentModifierMask_IMetInst(){
		return ((setKeyEquivalentModifierMask_IMetInst != null)
	? (setKeyEquivalentModifierMask_IMetInst)
	: (setKeyEquivalentModifierMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyEquivalentModifierMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setKeyEquivalentModifierMask(final long mask){
			final com.apple.jobjc.Invoke.MsgSend setKeyEquivalentModifierMask_IMetInst = get_setKeyEquivalentModifierMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyEquivalentModifierMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		setKeyEquivalentModifierMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenu_IMetInst(){
		return ((setMenu_IMetInst != null)
	? (setMenu_IMetInst)
	: (setMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenu(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend setMenu_IMetInst = get_setMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		setMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMixedStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMixedStateImage_IMetInst(){
		return ((setMixedStateImage_IMetInst != null)
	? (setMixedStateImage_IMetInst)
	: (setMixedStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMixedStateImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMixedStateImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setMixedStateImage_IMetInst = get_setMixedStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMixedStateImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setMixedStateImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMnemonicLocation_IMetInst(){
		return ((setMnemonicLocation_IMetInst != null)
	? (setMnemonicLocation_IMetInst)
	: (setMnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMnemonicLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMnemonicLocation(final long location){
			final com.apple.jobjc.Invoke.MsgSend setMnemonicLocation_IMetInst = get_setMnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMnemonicLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		setMnemonicLocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOffStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOffStateImage_IMetInst(){
		return ((setOffStateImage_IMetInst != null)
	? (setOffStateImage_IMetInst)
	: (setOffStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOffStateImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOffStateImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setOffStateImage_IMetInst = get_setOffStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOffStateImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setOffStateImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOnStateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOnStateImage_IMetInst(){
		return ((setOnStateImage_IMetInst != null)
	? (setOnStateImage_IMetInst)
	: (setOnStateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOnStateImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOnStateImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setOnStateImage_IMetInst = get_setOnStateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOnStateImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setOnStateImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedObject_IMetInst(){
		return ((setRepresentedObject_IMetInst != null)
	? (setRepresentedObject_IMetInst)
	: (setRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst = get_setRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setRepresentedObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setState_IMetInst(){
		return ((setState_IMetInst != null)
	? (setState_IMetInst)
	: (setState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setState(final long state){
			final com.apple.jobjc.Invoke.MsgSend setState_IMetInst = get_setState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, state);
		setState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubmenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubmenu_IMetInst(){
		return ((setSubmenu_IMetInst != null)
	? (setSubmenu_IMetInst)
	: (setSubmenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubmenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubmenu(final com.apple.jobjc.appkit.NSMenu submenu){
			final com.apple.jobjc.Invoke.MsgSend setSubmenu_IMetInst = get_setSubmenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubmenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, submenu);
		setSubmenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTag_IMetInst(){
		return ((setTag_IMetInst != null)
	? (setTag_IMetInst)
	: (setTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTag(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend setTag_IMetInst = get_setTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		setTag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWithMnemonic_IMetInst(){
		return ((setTitleWithMnemonic_IMetInst != null)
	? (setTitleWithMnemonic_IMetInst)
	: (setTitleWithMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWithMnemonic:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleWithMnemonic(final com.apple.jobjc.foundation.NSString stringWithAmpersand){
			final com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst = get_setTitleWithMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWithMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringWithAmpersand);
		setTitleWithMnemonic_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend state_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_state_IMetInst(){
		return ((state_IMetInst != null)
	? (state_IMetInst)
	: (state_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "state", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long state(){
			final com.apple.jobjc.Invoke.MsgSend state_IMetInst = get_state_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		state_IMetInst.init(nativeBuffer, this);
		state_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend submenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_submenu_IMetInst(){
		return ((submenu_IMetInst != null)
	? (submenu_IMetInst)
	: (submenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "submenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu submenu(){
			final com.apple.jobjc.Invoke.MsgSend submenu_IMetInst = get_submenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		submenu_IMetInst.init(nativeBuffer, this);
		submenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend userKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userKeyEquivalent_IMetInst(){
		return ((userKeyEquivalent_IMetInst != null)
	? (userKeyEquivalent_IMetInst)
	: (userKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userKeyEquivalent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString userKeyEquivalent(){
			final com.apple.jobjc.Invoke.MsgSend userKeyEquivalent_IMetInst = get_userKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userKeyEquivalent_IMetInst.init(nativeBuffer, this);
		userKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

}
