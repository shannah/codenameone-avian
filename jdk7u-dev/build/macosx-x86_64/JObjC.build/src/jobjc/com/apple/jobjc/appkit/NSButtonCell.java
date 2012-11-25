package com.apple.jobjc.appkit;

public  class NSButtonCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSButtonCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSButtonCell(final NSButtonCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend alternateMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateMnemonic_IMetInst(){
		return ((alternateMnemonic_IMetInst != null)
	? (alternateMnemonic_IMetInst)
	: (alternateMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateMnemonic", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString alternateMnemonic(){
			final com.apple.jobjc.Invoke.MsgSend alternateMnemonic_IMetInst = get_alternateMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateMnemonic_IMetInst.init(nativeBuffer, this);
		alternateMnemonic_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alternateMnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alternateMnemonicLocation_IMetInst(){
		return ((alternateMnemonicLocation_IMetInst != null)
	? (alternateMnemonicLocation_IMetInst)
	: (alternateMnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alternateMnemonicLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long alternateMnemonicLocation(){
			final com.apple.jobjc.Invoke.MsgSend alternateMnemonicLocation_IMetInst = get_alternateMnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alternateMnemonicLocation_IMetInst.init(nativeBuffer, this);
		alternateMnemonicLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend drawBezelWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBezelWithFrame_inView_IMetInst(){
		return ((drawBezelWithFrame_inView_IMetInst != null)
	? (drawBezelWithFrame_inView_IMetInst)
	: (drawBezelWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBezelWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawBezelWithFrame_inView(final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawBezelWithFrame_inView_IMetInst = get_drawBezelWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBezelWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawBezelWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawImage_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawImage_withFrame_inView_IMetInst(){
		return ((drawImage_withFrame_inView_IMetInst != null)
	? (drawImage_withFrame_inView_IMetInst)
	: (drawImage_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawImage:withFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawImage_withFrame_inView(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawImage_withFrame_inView_IMetInst = get_drawImage_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawImage_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawImage_withFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawTitle_withFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawTitle_withFrame_inView_IMetInst(){
		return ((drawTitle_withFrame_inView_IMetInst != null)
	? (drawTitle_withFrame_inView_IMetInst)
	: (drawTitle_withFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawTitle:withFrame:inView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect drawTitle_withFrame_inView(final com.apple.jobjc.foundation.NSAttributedString title, final com.apple.jobjc.foundation.NSRect frame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawTitle_withFrame_inView_IMetInst = get_drawTitle_withFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawTitle_withFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		drawTitle_withFrame_inView_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend gradientType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gradientType_IMetInst(){
		return ((gradientType_IMetInst != null)
	? (gradientType_IMetInst)
	: (gradientType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gradientType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long gradientType(){
			final com.apple.jobjc.Invoke.MsgSend gradientType_IMetInst = get_gradientType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gradientType_IMetInst.init(nativeBuffer, this);
		gradientType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightsBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightsBy_IMetInst(){
		return ((highlightsBy_IMetInst != null)
	? (highlightsBy_IMetInst)
	: (highlightsBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightsBy", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long highlightsBy(){
			final com.apple.jobjc.Invoke.MsgSend highlightsBy_IMetInst = get_highlightsBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightsBy_IMetInst.init(nativeBuffer, this);
		highlightsBy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageDimsWhenDisabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageDimsWhenDisabled_IMetInst(){
		return ((imageDimsWhenDisabled_IMetInst != null)
	? (imageDimsWhenDisabled_IMetInst)
	: (imageDimsWhenDisabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageDimsWhenDisabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean imageDimsWhenDisabled(){
			final com.apple.jobjc.Invoke.MsgSend imageDimsWhenDisabled_IMetInst = get_imageDimsWhenDisabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageDimsWhenDisabled_IMetInst.init(nativeBuffer, this);
		imageDimsWhenDisabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend imageScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageScaling_IMetInst(){
		return ((imageScaling_IMetInst != null)
	? (imageScaling_IMetInst)
	: (imageScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageScaling", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imageScaling(){
			final com.apple.jobjc.Invoke.MsgSend imageScaling_IMetInst = get_imageScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageScaling_IMetInst.init(nativeBuffer, this);
		imageScaling_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOpaque_IMetInst(){
		return ((isOpaque_IMetInst != null)
	? (isOpaque_IMetInst)
	: (isOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOpaque", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOpaque(){
			final com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst = get_isOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOpaque_IMetInst.init(nativeBuffer, this);
		isOpaque_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalentFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalentFont_IMetInst(){
		return ((keyEquivalentFont_IMetInst != null)
	? (keyEquivalentFont_IMetInst)
	: (keyEquivalentFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalentFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont keyEquivalentFont(){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalentFont_IMetInst = get_keyEquivalentFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalentFont_IMetInst.init(nativeBuffer, this);
		keyEquivalentFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseEntered_IMetInst(){
		return ((mouseEntered_IMetInst != null)
	? (mouseEntered_IMetInst)
	: (mouseEntered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseEntered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseEntered(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend mouseEntered_IMetInst = get_mouseEntered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseEntered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		mouseEntered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseExited_IMetInst(){
		return ((mouseExited_IMetInst != null)
	? (mouseExited_IMetInst)
	: (mouseExited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseExited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseExited(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend mouseExited_IMetInst = get_mouseExited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseExited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		mouseExited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performClick_IMetInst(){
		return ((performClick_IMetInst != null)
	? (performClick_IMetInst)
	: (performClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performClick:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performClick(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performClick_IMetInst = get_performClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performClick_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performClick_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setAlternateMnemonicLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternateMnemonicLocation_IMetInst(){
		return ((setAlternateMnemonicLocation_IMetInst != null)
	? (setAlternateMnemonicLocation_IMetInst)
	: (setAlternateMnemonicLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternateMnemonicLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAlternateMnemonicLocation(final long location){
			final com.apple.jobjc.Invoke.MsgSend setAlternateMnemonicLocation_IMetInst = get_setAlternateMnemonicLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternateMnemonicLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, location);
		setAlternateMnemonicLocation_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setAlternateTitleWithMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlternateTitleWithMnemonic_IMetInst(){
		return ((setAlternateTitleWithMnemonic_IMetInst != null)
	? (setAlternateTitleWithMnemonic_IMetInst)
	: (setAlternateTitleWithMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlternateTitleWithMnemonic:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAlternateTitleWithMnemonic(final com.apple.jobjc.foundation.NSString stringWithAmpersand){
			final com.apple.jobjc.Invoke.MsgSend setAlternateTitleWithMnemonic_IMetInst = get_setAlternateTitleWithMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlternateTitleWithMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringWithAmpersand);
		setAlternateTitleWithMnemonic_IMetInst.invoke(nativeBuffer);
		
		
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

	 public void setAttributedTitle(final com.apple.jobjc.foundation.NSAttributedString obj){
			final com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst = get_setAttributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setAttributedTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGradientType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGradientType_IMetInst(){
		return ((setGradientType_IMetInst != null)
	? (setGradientType_IMetInst)
	: (setGradientType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGradientType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setGradientType(final long type){
			final com.apple.jobjc.Invoke.MsgSend setGradientType_IMetInst = get_setGradientType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGradientType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		setGradientType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHighlightsBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHighlightsBy_IMetInst(){
		return ((setHighlightsBy_IMetInst != null)
	? (setHighlightsBy_IMetInst)
	: (setHighlightsBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHighlightsBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setHighlightsBy(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setHighlightsBy_IMetInst = get_setHighlightsBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHighlightsBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aType);
		setHighlightsBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageDimsWhenDisabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageDimsWhenDisabled_IMetInst(){
		return ((setImageDimsWhenDisabled_IMetInst != null)
	? (setImageDimsWhenDisabled_IMetInst)
	: (setImageDimsWhenDisabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageDimsWhenDisabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setImageDimsWhenDisabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setImageDimsWhenDisabled_IMetInst = get_setImageDimsWhenDisabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageDimsWhenDisabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setImageDimsWhenDisabled_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setImageScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageScaling_IMetInst(){
		return ((setImageScaling_IMetInst != null)
	? (setImageScaling_IMetInst)
	: (setImageScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageScaling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImageScaling(final long scaling){
			final com.apple.jobjc.Invoke.MsgSend setImageScaling_IMetInst = get_setImageScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageScaling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, scaling);
		setImageScaling_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setKeyEquivalentFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyEquivalentFont_IMetInst(){
		return ((setKeyEquivalentFont_IMetInst != null)
	? (setKeyEquivalentFont_IMetInst)
	: (setKeyEquivalentFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyEquivalentFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKeyEquivalentFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setKeyEquivalentFont_IMetInst = get_setKeyEquivalentFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyEquivalentFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setKeyEquivalentFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeyEquivalentFont_size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyEquivalentFont_size_IMetInst(){
		return ((setKeyEquivalentFont_size_IMetInst != null)
	? (setKeyEquivalentFont_size_IMetInst)
	: (setKeyEquivalentFont_size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyEquivalentFont:size:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setKeyEquivalentFont_size(final com.apple.jobjc.foundation.NSString fontName, final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend setKeyEquivalentFont_size_IMetInst = get_setKeyEquivalentFont_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyEquivalentFont_size_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		setKeyEquivalentFont_size_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setShowsStateBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsStateBy_IMetInst(){
		return ((setShowsStateBy_IMetInst != null)
	? (setShowsStateBy_IMetInst)
	: (setShowsStateBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsStateBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setShowsStateBy(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setShowsStateBy_IMetInst = get_setShowsStateBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsStateBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aType);
		setShowsStateBy_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend showsStateBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsStateBy_IMetInst(){
		return ((showsStateBy_IMetInst != null)
	? (showsStateBy_IMetInst)
	: (showsStateBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsStateBy", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long showsStateBy(){
			final com.apple.jobjc.Invoke.MsgSend showsStateBy_IMetInst = get_showsStateBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsStateBy_IMetInst.init(nativeBuffer, this);
		showsStateBy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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
