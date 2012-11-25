package com.apple.jobjc.appkit;

public  class NSStatusItem extends com.apple.jobjc.foundation.NSObject {
	public NSStatusItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSStatusItem(final NSStatusItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleAction_IMetInst(){
		return ((doubleAction_IMetInst != null)
	? (doubleAction_IMetInst)
	: (doubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleAction", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL doubleAction(){
			final com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst = get_doubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleAction_IMetInst.init(nativeBuffer, this);
		doubleAction_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawStatusBarBackgroundInRect_withHighlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawStatusBarBackgroundInRect_withHighlight_IMetInst(){
		return ((drawStatusBarBackgroundInRect_withHighlight_IMetInst != null)
	? (drawStatusBarBackgroundInRect_withHighlight_IMetInst)
	: (drawStatusBarBackgroundInRect_withHighlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawStatusBarBackgroundInRect:withHighlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void drawStatusBarBackgroundInRect_withHighlight(final com.apple.jobjc.foundation.NSRect rect, final boolean highlight){
			final com.apple.jobjc.Invoke.MsgSend drawStatusBarBackgroundInRect_withHighlight_IMetInst = get_drawStatusBarBackgroundInRect_withHighlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawStatusBarBackgroundInRect_withHighlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, highlight);
		drawStatusBarBackgroundInRect_withHighlight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightMode_IMetInst(){
		return ((highlightMode_IMetInst != null)
	? (highlightMode_IMetInst)
	: (highlightMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightMode", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean highlightMode(){
			final com.apple.jobjc.Invoke.MsgSend highlightMode_IMetInst = get_highlightMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightMode_IMetInst.init(nativeBuffer, this);
		highlightMode_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_length_IMetInst(){
		return ((length_IMetInst != null)
	? (length_IMetInst)
	: (length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "length", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double length(){
			final com.apple.jobjc.Invoke.MsgSend length_IMetInst = get_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		length_IMetInst.init(nativeBuffer, this);
		length_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend popUpStatusItemMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popUpStatusItemMenu_IMetInst(){
		return ((popUpStatusItemMenu_IMetInst != null)
	? (popUpStatusItemMenu_IMetInst)
	: (popUpStatusItemMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popUpStatusItemMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void popUpStatusItemMenu(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend popUpStatusItemMenu_IMetInst = get_popUpStatusItemMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popUpStatusItemMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		popUpStatusItemMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendActionOn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendActionOn_IMetInst(){
		return ((sendActionOn_IMetInst != null)
	? (sendActionOn_IMetInst)
	: (sendActionOn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendActionOn:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long sendActionOn(final long mask){
			final com.apple.jobjc.Invoke.MsgSend sendActionOn_IMetInst = get_sendActionOn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendActionOn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mask);
		sendActionOn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedTitle_IMetInst(){
		return ((setAttributedTitle_IMetInst != null)
	? (setAttributedTitle_IMetInst)
	: (setAttributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedTitle(final com.apple.jobjc.foundation.NSAttributedString title){
			final com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst = get_setAttributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setAttributedTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoubleAction_IMetInst(){
		return ((setDoubleAction_IMetInst != null)
	? (setDoubleAction_IMetInst)
	: (setDoubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoubleAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setDoubleAction(final com.apple.jobjc.SEL action){
			final com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst = get_setDoubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoubleAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, action);
		setDoubleAction_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHighlightMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHighlightMode_IMetInst(){
		return ((setHighlightMode_IMetInst != null)
	? (setHighlightMode_IMetInst)
	: (setHighlightMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHighlightMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHighlightMode(final boolean highlightMode){
			final com.apple.jobjc.Invoke.MsgSend setHighlightMode_IMetInst = get_setHighlightMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHighlightMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, highlightMode);
		setHighlightMode_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setLength_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLength_IMetInst(){
		return ((setLength_IMetInst != null)
	? (setLength_IMetInst)
	: (setLength_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLength:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLength(final double length){
			final com.apple.jobjc.Invoke.MsgSend setLength_IMetInst = get_setLength_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLength_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, length);
		setLength_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend statusBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_statusBar_IMetInst(){
		return ((statusBar_IMetInst != null)
	? (statusBar_IMetInst)
	: (statusBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "statusBar", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSStatusBar statusBar(){
			final com.apple.jobjc.Invoke.MsgSend statusBar_IMetInst = get_statusBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		statusBar_IMetInst.init(nativeBuffer, this);
		statusBar_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSStatusBar returnValue = (com.apple.jobjc.appkit.NSStatusBar) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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
