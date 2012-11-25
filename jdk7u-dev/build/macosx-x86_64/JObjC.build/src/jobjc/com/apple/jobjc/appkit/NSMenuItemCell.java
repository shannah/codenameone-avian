package com.apple.jobjc.appkit;

public  class NSMenuItemCell extends com.apple.jobjc.appkit.NSButtonCell {
	public NSMenuItemCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMenuItemCell(final NSMenuItemCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend calcSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_calcSize_IMetInst(){
		return ((calcSize_IMetInst != null)
	? (calcSize_IMetInst)
	: (calcSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "calcSize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void calcSize(){
			final com.apple.jobjc.Invoke.MsgSend calcSize_IMetInst = get_calcSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		calcSize_IMetInst.init(nativeBuffer, this);
		calcSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBorderAndBackgroundWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBorderAndBackgroundWithFrame_inView_IMetInst(){
		return ((drawBorderAndBackgroundWithFrame_inView_IMetInst != null)
	? (drawBorderAndBackgroundWithFrame_inView_IMetInst)
	: (drawBorderAndBackgroundWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBorderAndBackgroundWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawBorderAndBackgroundWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawBorderAndBackgroundWithFrame_inView_IMetInst = get_drawBorderAndBackgroundWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBorderAndBackgroundWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawBorderAndBackgroundWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawImageWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawImageWithFrame_inView_IMetInst(){
		return ((drawImageWithFrame_inView_IMetInst != null)
	? (drawImageWithFrame_inView_IMetInst)
	: (drawImageWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawImageWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawImageWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawImageWithFrame_inView_IMetInst = get_drawImageWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawImageWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawImageWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawKeyEquivalentWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawKeyEquivalentWithFrame_inView_IMetInst(){
		return ((drawKeyEquivalentWithFrame_inView_IMetInst != null)
	? (drawKeyEquivalentWithFrame_inView_IMetInst)
	: (drawKeyEquivalentWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawKeyEquivalentWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawKeyEquivalentWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawKeyEquivalentWithFrame_inView_IMetInst = get_drawKeyEquivalentWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawKeyEquivalentWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawKeyEquivalentWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSeparatorItemWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSeparatorItemWithFrame_inView_IMetInst(){
		return ((drawSeparatorItemWithFrame_inView_IMetInst != null)
	? (drawSeparatorItemWithFrame_inView_IMetInst)
	: (drawSeparatorItemWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSeparatorItemWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawSeparatorItemWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawSeparatorItemWithFrame_inView_IMetInst = get_drawSeparatorItemWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSeparatorItemWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawSeparatorItemWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawStateImageWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawStateImageWithFrame_inView_IMetInst(){
		return ((drawStateImageWithFrame_inView_IMetInst != null)
	? (drawStateImageWithFrame_inView_IMetInst)
	: (drawStateImageWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawStateImageWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawStateImageWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawStateImageWithFrame_inView_IMetInst = get_drawStateImageWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawStateImageWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawStateImageWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawTitleWithFrame_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawTitleWithFrame_inView_IMetInst(){
		return ((drawTitleWithFrame_inView_IMetInst != null)
	? (drawTitleWithFrame_inView_IMetInst)
	: (drawTitleWithFrame_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawTitleWithFrame:inView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawTitleWithFrame_inView(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView){
			final com.apple.jobjc.Invoke.MsgSend drawTitleWithFrame_inView_IMetInst = get_drawTitleWithFrame_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawTitleWithFrame_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		drawTitleWithFrame_inView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend imageWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageWidth_IMetInst(){
		return ((imageWidth_IMetInst != null)
	? (imageWidth_IMetInst)
	: (imageWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double imageWidth(){
			final com.apple.jobjc.Invoke.MsgSend imageWidth_IMetInst = get_imageWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageWidth_IMetInst.init(nativeBuffer, this);
		imageWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalentRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalentRectForBounds_IMetInst(){
		return ((keyEquivalentRectForBounds_IMetInst != null)
	? (keyEquivalentRectForBounds_IMetInst)
	: (keyEquivalentRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalentRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect keyEquivalentRectForBounds(final com.apple.jobjc.foundation.NSRect cellFrame){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalentRectForBounds_IMetInst = get_keyEquivalentRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalentRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		keyEquivalentRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyEquivalentWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyEquivalentWidth_IMetInst(){
		return ((keyEquivalentWidth_IMetInst != null)
	? (keyEquivalentWidth_IMetInst)
	: (keyEquivalentWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyEquivalentWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double keyEquivalentWidth(){
			final com.apple.jobjc.Invoke.MsgSend keyEquivalentWidth_IMetInst = get_keyEquivalentWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyEquivalentWidth_IMetInst.init(nativeBuffer, this);
		keyEquivalentWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuItem_IMetInst(){
		return ((menuItem_IMetInst != null)
	? (menuItem_IMetInst)
	: (menuItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem menuItem(){
			final com.apple.jobjc.Invoke.MsgSend menuItem_IMetInst = get_menuItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuItem_IMetInst.init(nativeBuffer, this);
		menuItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuView_IMetInst(){
		return ((menuView_IMetInst != null)
	? (menuView_IMetInst)
	: (menuView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuView", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSMenuView* (@, @) */ menuView(){
			final com.apple.jobjc.Invoke.MsgSend menuView_IMetInst = get_menuView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuView_IMetInst.init(nativeBuffer, this);
		menuView_IMetInst.invoke(nativeBuffer);
		final Object /* NSMenuView* (@, @) */ returnValue = (Object /* NSMenuView* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsDisplay_IMetInst(){
		return ((needsDisplay_IMetInst != null)
	? (needsDisplay_IMetInst)
	: (needsDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsDisplay", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean needsDisplay(){
			final com.apple.jobjc.Invoke.MsgSend needsDisplay_IMetInst = get_needsDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsDisplay_IMetInst.init(nativeBuffer, this);
		needsDisplay_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsSizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsSizing_IMetInst(){
		return ((needsSizing_IMetInst != null)
	? (needsSizing_IMetInst)
	: (needsSizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsSizing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean needsSizing(){
			final com.apple.jobjc.Invoke.MsgSend needsSizing_IMetInst = get_needsSizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsSizing_IMetInst.init(nativeBuffer, this);
		needsSizing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuItem_IMetInst(){
		return ((setMenuItem_IMetInst != null)
	? (setMenuItem_IMetInst)
	: (setMenuItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenuItem(final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend setMenuItem_IMetInst = get_setMenuItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		setMenuItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuView_IMetInst(){
		return ((setMenuView_IMetInst != null)
	? (setMenuView_IMetInst)
	: (setMenuView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setMenuView(final Object /* NSMenuView* (@, @) */ menuView){
			final com.apple.jobjc.Invoke.MsgSend setMenuView_IMetInst = get_setMenuView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, menuView);
		setMenuView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsDisplay_IMetInst(){
		return ((setNeedsDisplay_IMetInst != null)
	? (setNeedsDisplay_IMetInst)
	: (setNeedsDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsDisplay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setNeedsDisplay(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setNeedsDisplay_IMetInst = get_setNeedsDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsDisplay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setNeedsDisplay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsSizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsSizing_IMetInst(){
		return ((setNeedsSizing_IMetInst != null)
	? (setNeedsSizing_IMetInst)
	: (setNeedsSizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsSizing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setNeedsSizing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setNeedsSizing_IMetInst = get_setNeedsSizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsSizing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setNeedsSizing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stateImageRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stateImageRectForBounds_IMetInst(){
		return ((stateImageRectForBounds_IMetInst != null)
	? (stateImageRectForBounds_IMetInst)
	: (stateImageRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stateImageRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect stateImageRectForBounds(final com.apple.jobjc.foundation.NSRect cellFrame){
			final com.apple.jobjc.Invoke.MsgSend stateImageRectForBounds_IMetInst = get_stateImageRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stateImageRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		stateImageRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stateImageWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stateImageWidth_IMetInst(){
		return ((stateImageWidth_IMetInst != null)
	? (stateImageWidth_IMetInst)
	: (stateImageWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stateImageWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double stateImageWidth(){
			final com.apple.jobjc.Invoke.MsgSend stateImageWidth_IMetInst = get_stateImageWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stateImageWidth_IMetInst.init(nativeBuffer, this);
		stateImageWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend titleRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleRectForBounds_IMetInst(){
		return ((titleRectForBounds_IMetInst != null)
	? (titleRectForBounds_IMetInst)
	: (titleRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect titleRectForBounds(final com.apple.jobjc.foundation.NSRect cellFrame){
			final com.apple.jobjc.Invoke.MsgSend titleRectForBounds_IMetInst = get_titleRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		titleRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleWidth_IMetInst(){
		return ((titleWidth_IMetInst != null)
	? (titleWidth_IMetInst)
	: (titleWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double titleWidth(){
			final com.apple.jobjc.Invoke.MsgSend titleWidth_IMetInst = get_titleWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleWidth_IMetInst.init(nativeBuffer, this);
		titleWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
