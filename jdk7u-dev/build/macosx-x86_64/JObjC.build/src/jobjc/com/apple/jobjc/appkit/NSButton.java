package com.apple.jobjc.appkit;

public  class NSButton extends com.apple.jobjc.appkit.NSControl {
	public NSButton(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSButton(final NSButton obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsMixedState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMixedState_IMetInst(){
		return ((allowsMixedState_IMetInst != null)
	? (allowsMixedState_IMetInst)
	: (allowsMixedState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMixedState", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMixedState(){
			final com.apple.jobjc.Invoke.MsgSend allowsMixedState_IMetInst = get_allowsMixedState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMixedState_IMetInst.init(nativeBuffer, this);
		allowsMixedState_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alternateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateImage_IMetInst(){
		return ((alternateImage_IMetInst != null)
	? (alternateImage_IMetInst)
	: (alternateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage alternateImage(){
			final com.apple.jobjc.Invoke.MsgSend alternateImage_IMetInst = get_alternateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateImage_IMetInst.init(nativeBuffer, this);
		alternateImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alternateTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateTitle_IMetInst(){
		return ((alternateTitle_IMetInst != null)
	? (alternateTitle_IMetInst)
	: (alternateTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString alternateTitle(){
			final com.apple.jobjc.Invoke.MsgSend alternateTitle_IMetInst = get_alternateTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateTitle_IMetInst.init(nativeBuffer, this);
		alternateTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributedAlternateTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedAlternateTitle_IMetInst(){
		return ((attributedAlternateTitle_IMetInst != null)
	? (attributedAlternateTitle_IMetInst)
	: (attributedAlternateTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedAlternateTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedAlternateTitle(){
			final com.apple.jobjc.Invoke.MsgSend attributedAlternateTitle_IMetInst = get_attributedAlternateTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedAlternateTitle_IMetInst.init(nativeBuffer, this);
		attributedAlternateTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezelStyle_IMetInst(){
		return ((bezelStyle_IMetInst != null)
	? (bezelStyle_IMetInst)
	: (bezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezelStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long bezelStyle(){
			final com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst = get_bezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezelStyle_IMetInst.init(nativeBuffer, this);
		bezelStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getPeriodicDelay_interval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getPeriodicDelay_interval_IMetInst(){
		return ((getPeriodicDelay_interval_IMetInst != null)
	? (getPeriodicDelay_interval_IMetInst)
	: (getPeriodicDelay_interval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getPeriodicDelay:interval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getPeriodicDelay_interval(final com.apple.jobjc.Pointer<java.lang.Float> delay, final com.apple.jobjc.Pointer<java.lang.Float> interval){
			final com.apple.jobjc.Invoke.MsgSend getPeriodicDelay_interval_IMetInst = get_getPeriodicDelay_interval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getPeriodicDelay_interval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, delay);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, interval);
		getPeriodicDelay_interval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlight_IMetInst(){
		return ((highlight_IMetInst != null)
	? (highlight_IMetInst)
	: (highlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void highlight(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend highlight_IMetInst = get_highlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		highlight_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend imagePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imagePosition_IMetInst(){
		return ((imagePosition_IMetInst != null)
	? (imagePosition_IMetInst)
	: (imagePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imagePosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imagePosition(){
			final com.apple.jobjc.Invoke.MsgSend imagePosition_IMetInst = get_imagePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imagePosition_IMetInst.init(nativeBuffer, this);
		imagePosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isBordered_IMetInst(){
		return ((isBordered_IMetInst != null)
	? (isBordered_IMetInst)
	: (isBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isBordered", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isBordered(){
			final com.apple.jobjc.Invoke.MsgSend isBordered_IMetInst = get_isBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isBordered_IMetInst.init(nativeBuffer, this);
		isBordered_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTransparent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTransparent_IMetInst(){
		return ((isTransparent_IMetInst != null)
	? (isTransparent_IMetInst)
	: (isTransparent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTransparent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTransparent(){
			final com.apple.jobjc.Invoke.MsgSend isTransparent_IMetInst = get_isTransparent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTransparent_IMetInst.init(nativeBuffer, this);
		isTransparent_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performKeyEquivalent_IMetInst(){
		return ((performKeyEquivalent_IMetInst != null)
	? (performKeyEquivalent_IMetInst)
	: (performKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performKeyEquivalent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performKeyEquivalent(final com.apple.jobjc.appkit.NSEvent key){
			final com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst = get_performKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		performKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMixedState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMixedState_IMetInst(){
		return ((setAllowsMixedState_IMetInst != null)
	? (setAllowsMixedState_IMetInst)
	: (setAllowsMixedState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMixedState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMixedState(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMixedState_IMetInst = get_setAllowsMixedState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMixedState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsMixedState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlternateImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternateImage_IMetInst(){
		return ((setAlternateImage_IMetInst != null)
	? (setAlternateImage_IMetInst)
	: (setAlternateImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternateImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAlternateImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setAlternateImage_IMetInst = get_setAlternateImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternateImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setAlternateImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlternateTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternateTitle_IMetInst(){
		return ((setAlternateTitle_IMetInst != null)
	? (setAlternateTitle_IMetInst)
	: (setAlternateTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternateTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAlternateTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setAlternateTitle_IMetInst = get_setAlternateTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternateTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setAlternateTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedAlternateTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedAlternateTitle_IMetInst(){
		return ((setAttributedAlternateTitle_IMetInst != null)
	? (setAttributedAlternateTitle_IMetInst)
	: (setAttributedAlternateTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedAlternateTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedAlternateTitle(final com.apple.jobjc.foundation.NSAttributedString obj){
			final com.apple.jobjc.Invoke.MsgSend setAttributedAlternateTitle_IMetInst = get_setAttributedAlternateTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedAlternateTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setAttributedAlternateTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedTitle_IMetInst(){
		return ((setAttributedTitle_IMetInst != null)
	? (setAttributedTitle_IMetInst)
	: (setAttributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedTitle(final com.apple.jobjc.foundation.NSAttributedString aString){
			final com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst = get_setAttributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setAttributedTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBezelStyle_IMetInst(){
		return ((setBezelStyle_IMetInst != null)
	? (setBezelStyle_IMetInst)
	: (setBezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBezelStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBezelStyle(final long bezelStyle){
			final com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst = get_setBezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBezelStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bezelStyle);
		setBezelStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBordered_IMetInst(){
		return ((setBordered_IMetInst != null)
	? (setBordered_IMetInst)
	: (setBordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setBordered(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setBordered_IMetInst = get_setBordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setBordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setButtonType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setButtonType_IMetInst(){
		return ((setButtonType_IMetInst != null)
	? (setButtonType_IMetInst)
	: (setButtonType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setButtonType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setButtonType(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setButtonType_IMetInst = get_setButtonType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setButtonType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		setButtonType_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setImagePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImagePosition_IMetInst(){
		return ((setImagePosition_IMetInst != null)
	? (setImagePosition_IMetInst)
	: (setImagePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImagePosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImagePosition(final long aPosition){
			final com.apple.jobjc.Invoke.MsgSend setImagePosition_IMetInst = get_setImagePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImagePosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aPosition);
		setImagePosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyEquivalent_IMetInst(){
		return ((setKeyEquivalent_IMetInst != null)
	? (setKeyEquivalent_IMetInst)
	: (setKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyEquivalent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKeyEquivalent(final com.apple.jobjc.foundation.NSString charCode){
			final com.apple.jobjc.Invoke.MsgSend setKeyEquivalent_IMetInst = get_setKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, charCode);
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

	private static com.apple.jobjc.Invoke.MsgSend setNextState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNextState_IMetInst(){
		return ((setNextState_IMetInst != null)
	? (setNextState_IMetInst)
	: (setNextState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNextState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setNextState(){
			final com.apple.jobjc.Invoke.MsgSend setNextState_IMetInst = get_setNextState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNextState_IMetInst.init(nativeBuffer, this);
		setNextState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPeriodicDelay_interval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPeriodicDelay_interval_IMetInst(){
		return ((setPeriodicDelay_interval_IMetInst != null)
	? (setPeriodicDelay_interval_IMetInst)
	: (setPeriodicDelay_interval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPeriodicDelay:interval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setPeriodicDelay_interval(final float delay, final float interval){
			final com.apple.jobjc.Invoke.MsgSend setPeriodicDelay_interval_IMetInst = get_setPeriodicDelay_interval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPeriodicDelay_interval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, delay);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, interval);
		setPeriodicDelay_interval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsBorderOnlyWhileMouseInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsBorderOnlyWhileMouseInside_IMetInst(){
		return ((setShowsBorderOnlyWhileMouseInside_IMetInst != null)
	? (setShowsBorderOnlyWhileMouseInside_IMetInst)
	: (setShowsBorderOnlyWhileMouseInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsBorderOnlyWhileMouseInside:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsBorderOnlyWhileMouseInside(final boolean show){
			final com.apple.jobjc.Invoke.MsgSend setShowsBorderOnlyWhileMouseInside_IMetInst = get_setShowsBorderOnlyWhileMouseInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsBorderOnlyWhileMouseInside_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, show);
		setShowsBorderOnlyWhileMouseInside_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSound_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSound_IMetInst(){
		return ((setSound_IMetInst != null)
	? (setSound_IMetInst)
	: (setSound_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSound:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSound(final com.apple.jobjc.appkit.NSSound aSound){
			final com.apple.jobjc.Invoke.MsgSend setSound_IMetInst = get_setSound_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSound_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSound);
		setSound_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setState_IMetInst(){
		return ((setState_IMetInst != null)
	? (setState_IMetInst)
	: (setState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setState:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setState(final long value){
			final com.apple.jobjc.Invoke.MsgSend setState_IMetInst = get_setState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setState_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		setState_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTransparent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTransparent_IMetInst(){
		return ((setTransparent_IMetInst != null)
	? (setTransparent_IMetInst)
	: (setTransparent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTransparent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTransparent(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTransparent_IMetInst = get_setTransparent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTransparent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTransparent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsBorderOnlyWhileMouseInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsBorderOnlyWhileMouseInside_IMetInst(){
		return ((showsBorderOnlyWhileMouseInside_IMetInst != null)
	? (showsBorderOnlyWhileMouseInside_IMetInst)
	: (showsBorderOnlyWhileMouseInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsBorderOnlyWhileMouseInside", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsBorderOnlyWhileMouseInside(){
			final com.apple.jobjc.Invoke.MsgSend showsBorderOnlyWhileMouseInside_IMetInst = get_showsBorderOnlyWhileMouseInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsBorderOnlyWhileMouseInside_IMetInst.init(nativeBuffer, this);
		showsBorderOnlyWhileMouseInside_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sound_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sound_IMetInst(){
		return ((sound_IMetInst != null)
	? (sound_IMetInst)
	: (sound_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sound", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSSound sound(){
			final com.apple.jobjc.Invoke.MsgSend sound_IMetInst = get_sound_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sound_IMetInst.init(nativeBuffer, this);
		sound_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSSound returnValue = (com.apple.jobjc.appkit.NSSound) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

}
