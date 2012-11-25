package com.apple.jobjc.appkit;

public  class NSWindow extends com.apple.jobjc.appkit.NSResponder {
	public NSWindow(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSWindow(final NSWindow obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsMouseMovedEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsMouseMovedEvents_IMetInst(){
		return ((acceptsMouseMovedEvents_IMetInst != null)
	? (acceptsMouseMovedEvents_IMetInst)
	: (acceptsMouseMovedEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsMouseMovedEvents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsMouseMovedEvents(){
			final com.apple.jobjc.Invoke.MsgSend acceptsMouseMovedEvents_IMetInst = get_acceptsMouseMovedEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsMouseMovedEvents_IMetInst.init(nativeBuffer, this);
		acceptsMouseMovedEvents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addChildWindow_ordered_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addChildWindow_ordered_IMetInst(){
		return ((addChildWindow_ordered_IMetInst != null)
	? (addChildWindow_ordered_IMetInst)
	: (addChildWindow_ordered_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addChildWindow:ordered:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void addChildWindow_ordered(final com.apple.jobjc.appkit.NSWindow childWin, final long place){
			final com.apple.jobjc.Invoke.MsgSend addChildWindow_ordered_IMetInst = get_addChildWindow_ordered_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addChildWindow_ordered_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, childWin);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, place);
		addChildWindow_ordered_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsConcurrentViewDrawing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsConcurrentViewDrawing_IMetInst(){
		return ((allowsConcurrentViewDrawing_IMetInst != null)
	? (allowsConcurrentViewDrawing_IMetInst)
	: (allowsConcurrentViewDrawing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsConcurrentViewDrawing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsConcurrentViewDrawing(){
			final com.apple.jobjc.Invoke.MsgSend allowsConcurrentViewDrawing_IMetInst = get_allowsConcurrentViewDrawing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsConcurrentViewDrawing_IMetInst.init(nativeBuffer, this);
		allowsConcurrentViewDrawing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsToolTipsWhenApplicationIsInactive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsToolTipsWhenApplicationIsInactive_IMetInst(){
		return ((allowsToolTipsWhenApplicationIsInactive_IMetInst != null)
	? (allowsToolTipsWhenApplicationIsInactive_IMetInst)
	: (allowsToolTipsWhenApplicationIsInactive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsToolTipsWhenApplicationIsInactive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsToolTipsWhenApplicationIsInactive(){
			final com.apple.jobjc.Invoke.MsgSend allowsToolTipsWhenApplicationIsInactive_IMetInst = get_allowsToolTipsWhenApplicationIsInactive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsToolTipsWhenApplicationIsInactive_IMetInst.init(nativeBuffer, this);
		allowsToolTipsWhenApplicationIsInactive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alphaValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alphaValue_IMetInst(){
		return ((alphaValue_IMetInst != null)
	? (alphaValue_IMetInst)
	: (alphaValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alphaValue", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double alphaValue(){
			final com.apple.jobjc.Invoke.MsgSend alphaValue_IMetInst = get_alphaValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alphaValue_IMetInst.init(nativeBuffer, this);
		alphaValue_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend anchorAttributeForOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_anchorAttributeForOrientation_IMetInst(){
		return ((anchorAttributeForOrientation_IMetInst != null)
	? (anchorAttributeForOrientation_IMetInst)
	: (anchorAttributeForOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "anchorAttributeForOrientation:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long anchorAttributeForOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend anchorAttributeForOrientation_IMetInst = get_anchorAttributeForOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		anchorAttributeForOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		anchorAttributeForOrientation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animationBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationBehavior_IMetInst(){
		return ((animationBehavior_IMetInst != null)
	? (animationBehavior_IMetInst)
	: (animationBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationBehavior", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long animationBehavior(){
			final com.apple.jobjc.Invoke.MsgSend animationBehavior_IMetInst = get_animationBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationBehavior_IMetInst.init(nativeBuffer, this);
		animationBehavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animationResizeTime_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animationResizeTime_IMetInst(){
		return ((animationResizeTime_IMetInst != null)
	? (animationResizeTime_IMetInst)
	: (animationResizeTime_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animationResizeTime:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public double animationResizeTime(final com.apple.jobjc.foundation.NSRect newFrame){
			final com.apple.jobjc.Invoke.MsgSend animationResizeTime_IMetInst = get_animationResizeTime_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animationResizeTime_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, newFrame);
		animationResizeTime_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend areCursorRectsEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_areCursorRectsEnabled_IMetInst(){
		return ((areCursorRectsEnabled_IMetInst != null)
	? (areCursorRectsEnabled_IMetInst)
	: (areCursorRectsEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "areCursorRectsEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean areCursorRectsEnabled(){
			final com.apple.jobjc.Invoke.MsgSend areCursorRectsEnabled_IMetInst = get_areCursorRectsEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		areCursorRectsEnabled_IMetInst.init(nativeBuffer, this);
		areCursorRectsEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend aspectRatio_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_aspectRatio_IMetInst(){
		return ((aspectRatio_IMetInst != null)
	? (aspectRatio_IMetInst)
	: (aspectRatio_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "aspectRatio", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize aspectRatio(){
			final com.apple.jobjc.Invoke.MsgSend aspectRatio_IMetInst = get_aspectRatio_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		aspectRatio_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		aspectRatio_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attachedSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachedSheet_IMetInst(){
		return ((attachedSheet_IMetInst != null)
	? (attachedSheet_IMetInst)
	: (attachedSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachedSheet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow attachedSheet(){
			final com.apple.jobjc.Invoke.MsgSend attachedSheet_IMetInst = get_attachedSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachedSheet_IMetInst.init(nativeBuffer, this);
		attachedSheet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autorecalculatesContentBorderThicknessForEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autorecalculatesContentBorderThicknessForEdge_IMetInst(){
		return ((autorecalculatesContentBorderThicknessForEdge_IMetInst != null)
	? (autorecalculatesContentBorderThicknessForEdge_IMetInst)
	: (autorecalculatesContentBorderThicknessForEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autorecalculatesContentBorderThicknessForEdge:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public boolean autorecalculatesContentBorderThicknessForEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend autorecalculatesContentBorderThicknessForEdge_IMetInst = get_autorecalculatesContentBorderThicknessForEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autorecalculatesContentBorderThicknessForEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		autorecalculatesContentBorderThicknessForEdge_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autorecalculatesKeyViewLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autorecalculatesKeyViewLoop_IMetInst(){
		return ((autorecalculatesKeyViewLoop_IMetInst != null)
	? (autorecalculatesKeyViewLoop_IMetInst)
	: (autorecalculatesKeyViewLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autorecalculatesKeyViewLoop", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autorecalculatesKeyViewLoop(){
			final com.apple.jobjc.Invoke.MsgSend autorecalculatesKeyViewLoop_IMetInst = get_autorecalculatesKeyViewLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autorecalculatesKeyViewLoop_IMetInst.init(nativeBuffer, this);
		autorecalculatesKeyViewLoop_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend backingAlignedRect_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingAlignedRect_options_IMetInst(){
		return ((backingAlignedRect_options_IMetInst != null)
	? (backingAlignedRect_options_IMetInst)
	: (backingAlignedRect_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingAlignedRect:options:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect backingAlignedRect_options(final com.apple.jobjc.foundation.NSRect aRect, final long options){
			final com.apple.jobjc.Invoke.MsgSend backingAlignedRect_options_IMetInst = get_backingAlignedRect_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingAlignedRect_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.PrimitiveCoder.ULongLongCoder.INST.push(nativeBuffer, options);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		backingAlignedRect_options_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backingLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingLocation_IMetInst(){
		return ((backingLocation_IMetInst != null)
	? (backingLocation_IMetInst)
	: (backingLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long backingLocation(){
			final com.apple.jobjc.Invoke.MsgSend backingLocation_IMetInst = get_backingLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingLocation_IMetInst.init(nativeBuffer, this);
		backingLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backingScaleFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingScaleFactor_IMetInst(){
		return ((backingScaleFactor_IMetInst != null)
	? (backingScaleFactor_IMetInst)
	: (backingScaleFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingScaleFactor", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double backingScaleFactor(){
			final com.apple.jobjc.Invoke.MsgSend backingScaleFactor_IMetInst = get_backingScaleFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingScaleFactor_IMetInst.init(nativeBuffer, this);
		backingScaleFactor_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backingType_IMetInst(){
		return ((backingType_IMetInst != null)
	? (backingType_IMetInst)
	: (backingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long backingType(){
			final com.apple.jobjc.Invoke.MsgSend backingType_IMetInst = get_backingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backingType_IMetInst.init(nativeBuffer, this);
		backingType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend becomeKeyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_becomeKeyWindow_IMetInst(){
		return ((becomeKeyWindow_IMetInst != null)
	? (becomeKeyWindow_IMetInst)
	: (becomeKeyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "becomeKeyWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void becomeKeyWindow(){
			final com.apple.jobjc.Invoke.MsgSend becomeKeyWindow_IMetInst = get_becomeKeyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		becomeKeyWindow_IMetInst.init(nativeBuffer, this);
		becomeKeyWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend becomeMainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_becomeMainWindow_IMetInst(){
		return ((becomeMainWindow_IMetInst != null)
	? (becomeMainWindow_IMetInst)
	: (becomeMainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "becomeMainWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void becomeMainWindow(){
			final com.apple.jobjc.Invoke.MsgSend becomeMainWindow_IMetInst = get_becomeMainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		becomeMainWindow_IMetInst.init(nativeBuffer, this);
		becomeMainWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cacheImageInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cacheImageInRect_IMetInst(){
		return ((cacheImageInRect_IMetInst != null)
	? (cacheImageInRect_IMetInst)
	: (cacheImageInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cacheImageInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void cacheImageInRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend cacheImageInRect_IMetInst = get_cacheImageInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cacheImageInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		cacheImageInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canBeVisibleOnAllSpaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBeVisibleOnAllSpaces_IMetInst(){
		return ((canBeVisibleOnAllSpaces_IMetInst != null)
	? (canBeVisibleOnAllSpaces_IMetInst)
	: (canBeVisibleOnAllSpaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBeVisibleOnAllSpaces", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBeVisibleOnAllSpaces(){
			final com.apple.jobjc.Invoke.MsgSend canBeVisibleOnAllSpaces_IMetInst = get_canBeVisibleOnAllSpaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBeVisibleOnAllSpaces_IMetInst.init(nativeBuffer, this);
		canBeVisibleOnAllSpaces_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBecomeKeyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBecomeKeyWindow_IMetInst(){
		return ((canBecomeKeyWindow_IMetInst != null)
	? (canBecomeKeyWindow_IMetInst)
	: (canBecomeKeyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBecomeKeyWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBecomeKeyWindow(){
			final com.apple.jobjc.Invoke.MsgSend canBecomeKeyWindow_IMetInst = get_canBecomeKeyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBecomeKeyWindow_IMetInst.init(nativeBuffer, this);
		canBecomeKeyWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBecomeMainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBecomeMainWindow_IMetInst(){
		return ((canBecomeMainWindow_IMetInst != null)
	? (canBecomeMainWindow_IMetInst)
	: (canBecomeMainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBecomeMainWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBecomeMainWindow(){
			final com.apple.jobjc.Invoke.MsgSend canBecomeMainWindow_IMetInst = get_canBecomeMainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBecomeMainWindow_IMetInst.init(nativeBuffer, this);
		canBecomeMainWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canBecomeVisibleWithoutLogin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBecomeVisibleWithoutLogin_IMetInst(){
		return ((canBecomeVisibleWithoutLogin_IMetInst != null)
	? (canBecomeVisibleWithoutLogin_IMetInst)
	: (canBecomeVisibleWithoutLogin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBecomeVisibleWithoutLogin", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBecomeVisibleWithoutLogin(){
			final com.apple.jobjc.Invoke.MsgSend canBecomeVisibleWithoutLogin_IMetInst = get_canBecomeVisibleWithoutLogin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBecomeVisibleWithoutLogin_IMetInst.init(nativeBuffer, this);
		canBecomeVisibleWithoutLogin_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canHide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canHide_IMetInst(){
		return ((canHide_IMetInst != null)
	? (canHide_IMetInst)
	: (canHide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canHide", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canHide(){
			final com.apple.jobjc.Invoke.MsgSend canHide_IMetInst = get_canHide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canHide_IMetInst.init(nativeBuffer, this);
		canHide_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canStoreColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canStoreColor_IMetInst(){
		return ((canStoreColor_IMetInst != null)
	? (canStoreColor_IMetInst)
	: (canStoreColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canStoreColor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canStoreColor(){
			final com.apple.jobjc.Invoke.MsgSend canStoreColor_IMetInst = get_canStoreColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canStoreColor_IMetInst.init(nativeBuffer, this);
		canStoreColor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cascadeTopLeftFromPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cascadeTopLeftFromPoint_IMetInst(){
		return ((cascadeTopLeftFromPoint_IMetInst != null)
	? (cascadeTopLeftFromPoint_IMetInst)
	: (cascadeTopLeftFromPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cascadeTopLeftFromPoint:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint cascadeTopLeftFromPoint(final com.apple.jobjc.foundation.NSPoint topLeftPoint){
			final com.apple.jobjc.Invoke.MsgSend cascadeTopLeftFromPoint_IMetInst = get_cascadeTopLeftFromPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cascadeTopLeftFromPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, topLeftPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		cascadeTopLeftFromPoint_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend center_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_center_IMetInst(){
		return ((center_IMetInst != null)
	? (center_IMetInst)
	: (center_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "center", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void center(){
			final com.apple.jobjc.Invoke.MsgSend center_IMetInst = get_center_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		center_IMetInst.init(nativeBuffer, this);
		center_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend childWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childWindows_IMetInst(){
		return ((childWindows_IMetInst != null)
	? (childWindows_IMetInst)
	: (childWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childWindows", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray childWindows(){
			final com.apple.jobjc.Invoke.MsgSend childWindows_IMetInst = get_childWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childWindows_IMetInst.init(nativeBuffer, this);
		childWindows_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend close_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_close_IMetInst(){
		return ((close_IMetInst != null)
	? (close_IMetInst)
	: (close_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "close", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void close(){
			final com.apple.jobjc.Invoke.MsgSend close_IMetInst = get_close_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		close_IMetInst.init(nativeBuffer, this);
		close_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionBehavior_IMetInst(){
		return ((collectionBehavior_IMetInst != null)
	? (collectionBehavior_IMetInst)
	: (collectionBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionBehavior", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long collectionBehavior(){
			final com.apple.jobjc.Invoke.MsgSend collectionBehavior_IMetInst = get_collectionBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionBehavior_IMetInst.init(nativeBuffer, this);
		collectionBehavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorSpace_IMetInst(){
		return ((colorSpace_IMetInst != null)
	? (colorSpace_IMetInst)
	: (colorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorSpace", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorSpace colorSpace(){
			final com.apple.jobjc.Invoke.MsgSend colorSpace_IMetInst = get_colorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorSpace_IMetInst.init(nativeBuffer, this);
		colorSpace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorSpace returnValue = (com.apple.jobjc.appkit.NSColorSpace) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend constrainFrameRect_toScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constrainFrameRect_toScreen_IMetInst(){
		return ((constrainFrameRect_toScreen_IMetInst != null)
	? (constrainFrameRect_toScreen_IMetInst)
	: (constrainFrameRect_toScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constrainFrameRect:toScreen:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect constrainFrameRect_toScreen(final com.apple.jobjc.foundation.NSRect frameRect, final com.apple.jobjc.appkit.NSScreen screen){
			final com.apple.jobjc.Invoke.MsgSend constrainFrameRect_toScreen_IMetInst = get_constrainFrameRect_toScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constrainFrameRect_toScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		constrainFrameRect_toScreen_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentAspectRatio_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentAspectRatio_IMetInst(){
		return ((contentAspectRatio_IMetInst != null)
	? (contentAspectRatio_IMetInst)
	: (contentAspectRatio_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentAspectRatio", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentAspectRatio(){
			final com.apple.jobjc.Invoke.MsgSend contentAspectRatio_IMetInst = get_contentAspectRatio_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentAspectRatio_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentAspectRatio_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentBorderThicknessForEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentBorderThicknessForEdge_IMetInst(){
		return ((contentBorderThicknessForEdge_IMetInst != null)
	? (contentBorderThicknessForEdge_IMetInst)
	: (contentBorderThicknessForEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentBorderThicknessForEdge:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public double contentBorderThicknessForEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend contentBorderThicknessForEdge_IMetInst = get_contentBorderThicknessForEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentBorderThicknessForEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		contentBorderThicknessForEdge_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentMaxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentMaxSize_IMetInst(){
		return ((contentMaxSize_IMetInst != null)
	? (contentMaxSize_IMetInst)
	: (contentMaxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentMaxSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentMaxSize(){
			final com.apple.jobjc.Invoke.MsgSend contentMaxSize_IMetInst = get_contentMaxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentMaxSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentMaxSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentMinSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentMinSize_IMetInst(){
		return ((contentMinSize_IMetInst != null)
	? (contentMinSize_IMetInst)
	: (contentMinSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentMinSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentMinSize(){
			final com.apple.jobjc.Invoke.MsgSend contentMinSize_IMetInst = get_contentMinSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentMinSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentMinSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentRectForFrameRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentRectForFrameRect_IMetInst(){
		return ((contentRectForFrameRect_IMetInst != null)
	? (contentRectForFrameRect_IMetInst)
	: (contentRectForFrameRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentRectForFrameRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect contentRectForFrameRect(final com.apple.jobjc.foundation.NSRect frameRect){
			final com.apple.jobjc.Invoke.MsgSend contentRectForFrameRect_IMetInst = get_contentRectForFrameRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentRectForFrameRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		contentRectForFrameRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentResizeIncrements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentResizeIncrements_IMetInst(){
		return ((contentResizeIncrements_IMetInst != null)
	? (contentResizeIncrements_IMetInst)
	: (contentResizeIncrements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentResizeIncrements", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentResizeIncrements(){
			final com.apple.jobjc.Invoke.MsgSend contentResizeIncrements_IMetInst = get_contentResizeIncrements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentResizeIncrements_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentResizeIncrements_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentView_IMetInst(){
		return ((contentView_IMetInst != null)
	? (contentView_IMetInst)
	: (contentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T contentView(){
			final com.apple.jobjc.Invoke.MsgSend contentView_IMetInst = get_contentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentView_IMetInst.init(nativeBuffer, this);
		contentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertBaseToScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertBaseToScreen_IMetInst(){
		return ((convertBaseToScreen_IMetInst != null)
	? (convertBaseToScreen_IMetInst)
	: (convertBaseToScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertBaseToScreen:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertBaseToScreen(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertBaseToScreen_IMetInst = get_convertBaseToScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertBaseToScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertBaseToScreen_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectFromBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectFromBacking_IMetInst(){
		return ((convertRectFromBacking_IMetInst != null)
	? (convertRectFromBacking_IMetInst)
	: (convertRectFromBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectFromBacking:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectFromBacking(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectFromBacking_IMetInst = get_convertRectFromBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectFromBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectFromBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectFromScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectFromScreen_IMetInst(){
		return ((convertRectFromScreen_IMetInst != null)
	? (convertRectFromScreen_IMetInst)
	: (convertRectFromScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectFromScreen:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectFromScreen(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectFromScreen_IMetInst = get_convertRectFromScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectFromScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectFromScreen_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectToBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectToBacking_IMetInst(){
		return ((convertRectToBacking_IMetInst != null)
	? (convertRectToBacking_IMetInst)
	: (convertRectToBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectToBacking:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectToBacking(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectToBacking_IMetInst = get_convertRectToBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectToBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectToBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectToScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectToScreen_IMetInst(){
		return ((convertRectToScreen_IMetInst != null)
	? (convertRectToScreen_IMetInst)
	: (convertRectToScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectToScreen:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectToScreen(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectToScreen_IMetInst = get_convertRectToScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectToScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectToScreen_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertScreenToBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertScreenToBase_IMetInst(){
		return ((convertScreenToBase_IMetInst != null)
	? (convertScreenToBase_IMetInst)
	: (convertScreenToBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertScreenToBase:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertScreenToBase(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertScreenToBase_IMetInst = get_convertScreenToBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertScreenToBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertScreenToBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentEvent_IMetInst(){
		return ((currentEvent_IMetInst != null)
	? (currentEvent_IMetInst)
	: (currentEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentEvent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent currentEvent(){
			final com.apple.jobjc.Invoke.MsgSend currentEvent_IMetInst = get_currentEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentEvent_IMetInst.init(nativeBuffer, this);
		currentEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithEPSInsideRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithEPSInsideRect_IMetInst(){
		return ((dataWithEPSInsideRect_IMetInst != null)
	? (dataWithEPSInsideRect_IMetInst)
	: (dataWithEPSInsideRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithEPSInsideRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSData dataWithEPSInsideRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend dataWithEPSInsideRect_IMetInst = get_dataWithEPSInsideRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithEPSInsideRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		dataWithEPSInsideRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataWithPDFInsideRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataWithPDFInsideRect_IMetInst(){
		return ((dataWithPDFInsideRect_IMetInst != null)
	? (dataWithPDFInsideRect_IMetInst)
	: (dataWithPDFInsideRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataWithPDFInsideRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSData dataWithPDFInsideRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend dataWithPDFInsideRect_IMetInst = get_dataWithPDFInsideRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataWithPDFInsideRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		dataWithPDFInsideRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deepestScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deepestScreen_IMetInst(){
		return ((deepestScreen_IMetInst != null)
	? (deepestScreen_IMetInst)
	: (deepestScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deepestScreen", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScreen deepestScreen(){
			final com.apple.jobjc.Invoke.MsgSend deepestScreen_IMetInst = get_deepestScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deepestScreen_IMetInst.init(nativeBuffer, this);
		deepestScreen_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScreen returnValue = (com.apple.jobjc.appkit.NSScreen) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultButtonCell_IMetInst(){
		return ((defaultButtonCell_IMetInst != null)
	? (defaultButtonCell_IMetInst)
	: (defaultButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultButtonCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSButtonCell defaultButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend defaultButtonCell_IMetInst = get_defaultButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultButtonCell_IMetInst.init(nativeBuffer, this);
		defaultButtonCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButtonCell returnValue = (com.apple.jobjc.appkit.NSButtonCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend deminiaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deminiaturize_IMetInst(){
		return ((deminiaturize_IMetInst != null)
	? (deminiaturize_IMetInst)
	: (deminiaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deminiaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deminiaturize(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deminiaturize_IMetInst = get_deminiaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deminiaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deminiaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend depthLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_depthLimit_IMetInst(){
		return ((depthLimit_IMetInst != null)
	? (depthLimit_IMetInst)
	: (depthLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "depthLimit", com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public int depthLimit(){
			final com.apple.jobjc.Invoke.MsgSend depthLimit_IMetInst = get_depthLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		depthLimit_IMetInst.init(nativeBuffer, this);
		depthLimit_IMetInst.invoke(nativeBuffer);
		final int returnValue = (int) (com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.popInt(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deviceDescription_IMetInst(){
		return ((deviceDescription_IMetInst != null)
	? (deviceDescription_IMetInst)
	: (deviceDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deviceDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary deviceDescription(){
			final com.apple.jobjc.Invoke.MsgSend deviceDescription_IMetInst = get_deviceDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deviceDescription_IMetInst.init(nativeBuffer, this);
		deviceDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend disableCursorRects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableCursorRects_IMetInst(){
		return ((disableCursorRects_IMetInst != null)
	? (disableCursorRects_IMetInst)
	: (disableCursorRects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableCursorRects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableCursorRects(){
			final com.apple.jobjc.Invoke.MsgSend disableCursorRects_IMetInst = get_disableCursorRects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableCursorRects_IMetInst.init(nativeBuffer, this);
		disableCursorRects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableFlushWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableFlushWindow_IMetInst(){
		return ((disableFlushWindow_IMetInst != null)
	? (disableFlushWindow_IMetInst)
	: (disableFlushWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableFlushWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableFlushWindow(){
			final com.apple.jobjc.Invoke.MsgSend disableFlushWindow_IMetInst = get_disableFlushWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableFlushWindow_IMetInst.init(nativeBuffer, this);
		disableFlushWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableKeyEquivalentForDefaultButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableKeyEquivalentForDefaultButtonCell_IMetInst(){
		return ((disableKeyEquivalentForDefaultButtonCell_IMetInst != null)
	? (disableKeyEquivalentForDefaultButtonCell_IMetInst)
	: (disableKeyEquivalentForDefaultButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableKeyEquivalentForDefaultButtonCell", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableKeyEquivalentForDefaultButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend disableKeyEquivalentForDefaultButtonCell_IMetInst = get_disableKeyEquivalentForDefaultButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableKeyEquivalentForDefaultButtonCell_IMetInst.init(nativeBuffer, this);
		disableKeyEquivalentForDefaultButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableScreenUpdatesUntilFlush_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableScreenUpdatesUntilFlush_IMetInst(){
		return ((disableScreenUpdatesUntilFlush_IMetInst != null)
	? (disableScreenUpdatesUntilFlush_IMetInst)
	: (disableScreenUpdatesUntilFlush_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableScreenUpdatesUntilFlush", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableScreenUpdatesUntilFlush(){
			final com.apple.jobjc.Invoke.MsgSend disableScreenUpdatesUntilFlush_IMetInst = get_disableScreenUpdatesUntilFlush_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableScreenUpdatesUntilFlush_IMetInst.init(nativeBuffer, this);
		disableScreenUpdatesUntilFlush_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend disableSnapshotRestoration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableSnapshotRestoration_IMetInst(){
		return ((disableSnapshotRestoration_IMetInst != null)
	? (disableSnapshotRestoration_IMetInst)
	: (disableSnapshotRestoration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableSnapshotRestoration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableSnapshotRestoration(){
			final com.apple.jobjc.Invoke.MsgSend disableSnapshotRestoration_IMetInst = get_disableSnapshotRestoration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableSnapshotRestoration_IMetInst.init(nativeBuffer, this);
		disableSnapshotRestoration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardCachedImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardCachedImage_IMetInst(){
		return ((discardCachedImage_IMetInst != null)
	? (discardCachedImage_IMetInst)
	: (discardCachedImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardCachedImage", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardCachedImage(){
			final com.apple.jobjc.Invoke.MsgSend discardCachedImage_IMetInst = get_discardCachedImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardCachedImage_IMetInst.init(nativeBuffer, this);
		discardCachedImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardCursorRects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardCursorRects_IMetInst(){
		return ((discardCursorRects_IMetInst != null)
	? (discardCursorRects_IMetInst)
	: (discardCursorRects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardCursorRects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardCursorRects(){
			final com.apple.jobjc.Invoke.MsgSend discardCursorRects_IMetInst = get_discardCursorRects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardCursorRects_IMetInst.init(nativeBuffer, this);
		discardCursorRects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardEventsMatchingMask_beforeEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardEventsMatchingMask_beforeEvent_IMetInst(){
		return ((discardEventsMatchingMask_beforeEvent_IMetInst != null)
	? (discardEventsMatchingMask_beforeEvent_IMetInst)
	: (discardEventsMatchingMask_beforeEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardEventsMatchingMask:beforeEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void discardEventsMatchingMask_beforeEvent(final long mask, final com.apple.jobjc.appkit.NSEvent lastEvent){
			final com.apple.jobjc.Invoke.MsgSend discardEventsMatchingMask_beforeEvent_IMetInst = get_discardEventsMatchingMask_beforeEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardEventsMatchingMask_beforeEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lastEvent);
		discardEventsMatchingMask_beforeEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_display_IMetInst(){
		return ((display_IMetInst != null)
	? (display_IMetInst)
	: (display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "display", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void display(){
			final com.apple.jobjc.Invoke.MsgSend display_IMetInst = get_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		display_IMetInst.init(nativeBuffer, this);
		display_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayIfNeeded_IMetInst(){
		return ((displayIfNeeded_IMetInst != null)
	? (displayIfNeeded_IMetInst)
	: (displayIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void displayIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend displayIfNeeded_IMetInst = get_displayIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayIfNeeded_IMetInst.init(nativeBuffer, this);
		displayIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displaysWhenScreenProfileChanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displaysWhenScreenProfileChanges_IMetInst(){
		return ((displaysWhenScreenProfileChanges_IMetInst != null)
	? (displaysWhenScreenProfileChanges_IMetInst)
	: (displaysWhenScreenProfileChanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displaysWhenScreenProfileChanges", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean displaysWhenScreenProfileChanges(){
			final com.apple.jobjc.Invoke.MsgSend displaysWhenScreenProfileChanges_IMetInst = get_displaysWhenScreenProfileChanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displaysWhenScreenProfileChanges_IMetInst.init(nativeBuffer, this);
		displaysWhenScreenProfileChanges_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dockTile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dockTile_IMetInst(){
		return ((dockTile_IMetInst != null)
	? (dockTile_IMetInst)
	: (dockTile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dockTile", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSDockTile dockTile(){
			final com.apple.jobjc.Invoke.MsgSend dockTile_IMetInst = get_dockTile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dockTile_IMetInst.init(nativeBuffer, this);
		dockTile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSDockTile returnValue = (com.apple.jobjc.appkit.NSDockTile) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst(){
		return ((dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst != null)
	? (dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst)
	: (dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragImage:at:offset:event:pasteboard:source:slideBack:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void dragImage_at_offset_event_pasteboard_source_slideBack(final com.apple.jobjc.appkit.NSImage anImage, final com.apple.jobjc.foundation.NSPoint baseLocation, final com.apple.jobjc.foundation.NSSize initialOffset, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.ID sourceObj, final boolean slideFlag){
			final com.apple.jobjc.Invoke.MsgSend dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst = get_dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anImage);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, baseLocation);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, initialOffset);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sourceObj);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, slideFlag);
		dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawers_IMetInst(){
		return ((drawers_IMetInst != null)
	? (drawers_IMetInst)
	: (drawers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray drawers(){
			final com.apple.jobjc.Invoke.MsgSend drawers_IMetInst = get_drawers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawers_IMetInst.init(nativeBuffer, this);
		drawers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enableCursorRects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableCursorRects_IMetInst(){
		return ((enableCursorRects_IMetInst != null)
	? (enableCursorRects_IMetInst)
	: (enableCursorRects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableCursorRects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableCursorRects(){
			final com.apple.jobjc.Invoke.MsgSend enableCursorRects_IMetInst = get_enableCursorRects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableCursorRects_IMetInst.init(nativeBuffer, this);
		enableCursorRects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableFlushWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableFlushWindow_IMetInst(){
		return ((enableFlushWindow_IMetInst != null)
	? (enableFlushWindow_IMetInst)
	: (enableFlushWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableFlushWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableFlushWindow(){
			final com.apple.jobjc.Invoke.MsgSend enableFlushWindow_IMetInst = get_enableFlushWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableFlushWindow_IMetInst.init(nativeBuffer, this);
		enableFlushWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableKeyEquivalentForDefaultButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableKeyEquivalentForDefaultButtonCell_IMetInst(){
		return ((enableKeyEquivalentForDefaultButtonCell_IMetInst != null)
	? (enableKeyEquivalentForDefaultButtonCell_IMetInst)
	: (enableKeyEquivalentForDefaultButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableKeyEquivalentForDefaultButtonCell", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableKeyEquivalentForDefaultButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend enableKeyEquivalentForDefaultButtonCell_IMetInst = get_enableKeyEquivalentForDefaultButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableKeyEquivalentForDefaultButtonCell_IMetInst.init(nativeBuffer, this);
		enableKeyEquivalentForDefaultButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableSnapshotRestoration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableSnapshotRestoration_IMetInst(){
		return ((enableSnapshotRestoration_IMetInst != null)
	? (enableSnapshotRestoration_IMetInst)
	: (enableSnapshotRestoration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableSnapshotRestoration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableSnapshotRestoration(){
			final com.apple.jobjc.Invoke.MsgSend enableSnapshotRestoration_IMetInst = get_enableSnapshotRestoration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableSnapshotRestoration_IMetInst.init(nativeBuffer, this);
		enableSnapshotRestoration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endEditingFor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endEditingFor_IMetInst(){
		return ((endEditingFor_IMetInst != null)
	? (endEditingFor_IMetInst)
	: (endEditingFor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endEditingFor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void endEditingFor(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend endEditingFor_IMetInst = get_endEditingFor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endEditingFor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		endEditingFor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fieldEditor_forObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fieldEditor_forObject_IMetInst(){
		return ((fieldEditor_forObject_IMetInst != null)
	? (fieldEditor_forObject_IMetInst)
	: (fieldEditor_forObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fieldEditor:forObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSText fieldEditor_forObject(final boolean createFlag, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend fieldEditor_forObject_IMetInst = get_fieldEditor_forObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fieldEditor_forObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, createFlag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		fieldEditor_forObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSText returnValue = (com.apple.jobjc.appkit.NSText) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstResponder_IMetInst(){
		return ((firstResponder_IMetInst != null)
	? (firstResponder_IMetInst)
	: (firstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstResponder", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSResponder firstResponder(){
			final com.apple.jobjc.Invoke.MsgSend firstResponder_IMetInst = get_firstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstResponder_IMetInst.init(nativeBuffer, this);
		firstResponder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSResponder returnValue = (com.apple.jobjc.appkit.NSResponder) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flushWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushWindow_IMetInst(){
		return ((flushWindow_IMetInst != null)
	? (flushWindow_IMetInst)
	: (flushWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushWindow(){
			final com.apple.jobjc.Invoke.MsgSend flushWindow_IMetInst = get_flushWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushWindow_IMetInst.init(nativeBuffer, this);
		flushWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend flushWindowIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flushWindowIfNeeded_IMetInst(){
		return ((flushWindowIfNeeded_IMetInst != null)
	? (flushWindowIfNeeded_IMetInst)
	: (flushWindowIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flushWindowIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flushWindowIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend flushWindowIfNeeded_IMetInst = get_flushWindowIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flushWindowIfNeeded_IMetInst.init(nativeBuffer, this);
		flushWindowIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend frame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frame_IMetInst(){
		return ((frame_IMetInst != null)
	? (frame_IMetInst)
	: (frame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frame", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect frame(){
			final com.apple.jobjc.Invoke.MsgSend frame_IMetInst = get_frame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frame_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameAutosaveName_IMetInst(){
		return ((frameAutosaveName_IMetInst != null)
	? (frameAutosaveName_IMetInst)
	: (frameAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameAutosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString frameAutosaveName(){
			final com.apple.jobjc.Invoke.MsgSend frameAutosaveName_IMetInst = get_frameAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameAutosaveName_IMetInst.init(nativeBuffer, this);
		frameAutosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameRectForContentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameRectForContentRect_IMetInst(){
		return ((frameRectForContentRect_IMetInst != null)
	? (frameRectForContentRect_IMetInst)
	: (frameRectForContentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameRectForContentRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect frameRectForContentRect(final com.apple.jobjc.foundation.NSRect contentRect){
			final com.apple.jobjc.Invoke.MsgSend frameRectForContentRect_IMetInst = get_frameRectForContentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameRectForContentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameRectForContentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend gState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gState_IMetInst(){
		return ((gState_IMetInst != null)
	? (gState_IMetInst)
	: (gState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gState", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long gState(){
			final com.apple.jobjc.Invoke.MsgSend gState_IMetInst = get_gState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gState_IMetInst.init(nativeBuffer, this);
		gState_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend graphicsContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_graphicsContext_IMetInst(){
		return ((graphicsContext_IMetInst != null)
	? (graphicsContext_IMetInst)
	: (graphicsContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "graphicsContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext graphicsContext(){
			final com.apple.jobjc.Invoke.MsgSend graphicsContext_IMetInst = get_graphicsContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		graphicsContext_IMetInst.init(nativeBuffer, this);
		graphicsContext_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleCloseScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleCloseScriptCommand_IMetInst(){
		return ((handleCloseScriptCommand_IMetInst != null)
	? (handleCloseScriptCommand_IMetInst)
	: (handleCloseScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleCloseScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handleCloseScriptCommand(final com.apple.jobjc.foundation.NSCloseCommand command){
			final com.apple.jobjc.Invoke.MsgSend handleCloseScriptCommand_IMetInst = get_handleCloseScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleCloseScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handleCloseScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handlePrintScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handlePrintScriptCommand_IMetInst(){
		return ((handlePrintScriptCommand_IMetInst != null)
	? (handlePrintScriptCommand_IMetInst)
	: (handlePrintScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handlePrintScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handlePrintScriptCommand(final com.apple.jobjc.foundation.NSScriptCommand command){
			final com.apple.jobjc.Invoke.MsgSend handlePrintScriptCommand_IMetInst = get_handlePrintScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handlePrintScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handlePrintScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleSaveScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleSaveScriptCommand_IMetInst(){
		return ((handleSaveScriptCommand_IMetInst != null)
	? (handleSaveScriptCommand_IMetInst)
	: (handleSaveScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleSaveScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handleSaveScriptCommand(final com.apple.jobjc.foundation.NSScriptCommand command){
			final com.apple.jobjc.Invoke.MsgSend handleSaveScriptCommand_IMetInst = get_handleSaveScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleSaveScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handleSaveScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasCloseBox_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasCloseBox_IMetInst(){
		return ((hasCloseBox_IMetInst != null)
	? (hasCloseBox_IMetInst)
	: (hasCloseBox_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasCloseBox", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasCloseBox(){
			final com.apple.jobjc.Invoke.MsgSend hasCloseBox_IMetInst = get_hasCloseBox_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasCloseBox_IMetInst.init(nativeBuffer, this);
		hasCloseBox_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasDynamicDepthLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasDynamicDepthLimit_IMetInst(){
		return ((hasDynamicDepthLimit_IMetInst != null)
	? (hasDynamicDepthLimit_IMetInst)
	: (hasDynamicDepthLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasDynamicDepthLimit", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasDynamicDepthLimit(){
			final com.apple.jobjc.Invoke.MsgSend hasDynamicDepthLimit_IMetInst = get_hasDynamicDepthLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasDynamicDepthLimit_IMetInst.init(nativeBuffer, this);
		hasDynamicDepthLimit_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasShadow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasShadow_IMetInst(){
		return ((hasShadow_IMetInst != null)
	? (hasShadow_IMetInst)
	: (hasShadow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasShadow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasShadow(){
			final com.apple.jobjc.Invoke.MsgSend hasShadow_IMetInst = get_hasShadow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasShadow_IMetInst.init(nativeBuffer, this);
		hasShadow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasTitleBar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasTitleBar_IMetInst(){
		return ((hasTitleBar_IMetInst != null)
	? (hasTitleBar_IMetInst)
	: (hasTitleBar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasTitleBar", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasTitleBar(){
			final com.apple.jobjc.Invoke.MsgSend hasTitleBar_IMetInst = get_hasTitleBar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasTitleBar_IMetInst.init(nativeBuffer, this);
		hasTitleBar_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hidesOnDeactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hidesOnDeactivate_IMetInst(){
		return ((hidesOnDeactivate_IMetInst != null)
	? (hidesOnDeactivate_IMetInst)
	: (hidesOnDeactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hidesOnDeactivate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hidesOnDeactivate(){
			final com.apple.jobjc.Invoke.MsgSend hidesOnDeactivate_IMetInst = get_hidesOnDeactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hidesOnDeactivate_IMetInst.init(nativeBuffer, this);
		hidesOnDeactivate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ignoresMouseEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ignoresMouseEvents_IMetInst(){
		return ((ignoresMouseEvents_IMetInst != null)
	? (ignoresMouseEvents_IMetInst)
	: (ignoresMouseEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ignoresMouseEvents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ignoresMouseEvents(){
			final com.apple.jobjc.Invoke.MsgSend ignoresMouseEvents_IMetInst = get_ignoresMouseEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ignoresMouseEvents_IMetInst.init(nativeBuffer, this);
		ignoresMouseEvents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inLiveResize_IMetInst(){
		return ((inLiveResize_IMetInst != null)
	? (inLiveResize_IMetInst)
	: (inLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inLiveResize", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean inLiveResize(){
			final com.apple.jobjc.Invoke.MsgSend inLiveResize_IMetInst = get_inLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inLiveResize_IMetInst.init(nativeBuffer, this);
		inLiveResize_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentRect_styleMask_backing_defer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentRect_styleMask_backing_defer_IMetInst(){
		return ((initWithContentRect_styleMask_backing_defer_IMetInst != null)
	? (initWithContentRect_styleMask_backing_defer_IMetInst)
	: (initWithContentRect_styleMask_backing_defer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentRect:styleMask:backing:defer:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentRect_styleMask_backing_defer(final com.apple.jobjc.foundation.NSRect contentRect, final long aStyle, final long bufferingType, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithContentRect_styleMask_backing_defer_IMetInst = get_initWithContentRect_styleMask_backing_defer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentRect_styleMask_backing_defer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aStyle);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bufferingType);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithContentRect_styleMask_backing_defer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentRect_styleMask_backing_defer_screen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentRect_styleMask_backing_defer_screen_IMetInst(){
		return ((initWithContentRect_styleMask_backing_defer_screen_IMetInst != null)
	? (initWithContentRect_styleMask_backing_defer_screen_IMetInst)
	: (initWithContentRect_styleMask_backing_defer_screen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentRect:styleMask:backing:defer:screen:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentRect_styleMask_backing_defer_screen(final com.apple.jobjc.foundation.NSRect contentRect, final long aStyle, final long bufferingType, final boolean flag, final com.apple.jobjc.appkit.NSScreen screen){
			final com.apple.jobjc.Invoke.MsgSend initWithContentRect_styleMask_backing_defer_screen_IMetInst = get_initWithContentRect_styleMask_backing_defer_screen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentRect_styleMask_backing_defer_screen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aStyle);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bufferingType);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
		initWithContentRect_styleMask_backing_defer_screen_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindowRef_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindowRef_IMetInst(){
		return ((initWithWindowRef_IMetInst != null)
	? (initWithWindowRef_IMetInst)
	: (initWithWindowRef_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindowRef:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow initWithWindowRef(final com.apple.jobjc.Pointer<Void> windowRef){
			final com.apple.jobjc.Invoke.MsgSend initWithWindowRef_IMetInst = get_initWithWindowRef_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindowRef_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, windowRef);
		initWithWindowRef_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialFirstResponder_IMetInst(){
		return ((initialFirstResponder_IMetInst != null)
	? (initialFirstResponder_IMetInst)
	: (initialFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialFirstResponder", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView initialFirstResponder(){
			final com.apple.jobjc.Invoke.MsgSend initialFirstResponder_IMetInst = get_initialFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialFirstResponder_IMetInst.init(nativeBuffer, this);
		initialFirstResponder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateCursorRectsForView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateCursorRectsForView_IMetInst(){
		return ((invalidateCursorRectsForView_IMetInst != null)
	? (invalidateCursorRectsForView_IMetInst)
	: (invalidateCursorRectsForView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateCursorRectsForView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void invalidateCursorRectsForView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend invalidateCursorRectsForView_IMetInst = get_invalidateCursorRectsForView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateCursorRectsForView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		invalidateCursorRectsForView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateShadow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateShadow_IMetInst(){
		return ((invalidateShadow_IMetInst != null)
	? (invalidateShadow_IMetInst)
	: (invalidateShadow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateShadow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateShadow(){
			final com.apple.jobjc.Invoke.MsgSend invalidateShadow_IMetInst = get_invalidateShadow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateShadow_IMetInst.init(nativeBuffer, this);
		invalidateShadow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isAutodisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutodisplay_IMetInst(){
		return ((isAutodisplay_IMetInst != null)
	? (isAutodisplay_IMetInst)
	: (isAutodisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutodisplay", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutodisplay(){
			final com.apple.jobjc.Invoke.MsgSend isAutodisplay_IMetInst = get_isAutodisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutodisplay_IMetInst.init(nativeBuffer, this);
		isAutodisplay_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDocumentEdited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDocumentEdited_IMetInst(){
		return ((isDocumentEdited_IMetInst != null)
	? (isDocumentEdited_IMetInst)
	: (isDocumentEdited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDocumentEdited", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDocumentEdited(){
			final com.apple.jobjc.Invoke.MsgSend isDocumentEdited_IMetInst = get_isDocumentEdited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDocumentEdited_IMetInst.init(nativeBuffer, this);
		isDocumentEdited_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExcludedFromWindowsMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExcludedFromWindowsMenu_IMetInst(){
		return ((isExcludedFromWindowsMenu_IMetInst != null)
	? (isExcludedFromWindowsMenu_IMetInst)
	: (isExcludedFromWindowsMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExcludedFromWindowsMenu", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExcludedFromWindowsMenu(){
			final com.apple.jobjc.Invoke.MsgSend isExcludedFromWindowsMenu_IMetInst = get_isExcludedFromWindowsMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExcludedFromWindowsMenu_IMetInst.init(nativeBuffer, this);
		isExcludedFromWindowsMenu_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFloatingPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFloatingPanel_IMetInst(){
		return ((isFloatingPanel_IMetInst != null)
	? (isFloatingPanel_IMetInst)
	: (isFloatingPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFloatingPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFloatingPanel(){
			final com.apple.jobjc.Invoke.MsgSend isFloatingPanel_IMetInst = get_isFloatingPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFloatingPanel_IMetInst.init(nativeBuffer, this);
		isFloatingPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFlushWindowDisabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFlushWindowDisabled_IMetInst(){
		return ((isFlushWindowDisabled_IMetInst != null)
	? (isFlushWindowDisabled_IMetInst)
	: (isFlushWindowDisabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFlushWindowDisabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFlushWindowDisabled(){
			final com.apple.jobjc.Invoke.MsgSend isFlushWindowDisabled_IMetInst = get_isFlushWindowDisabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFlushWindowDisabled_IMetInst.init(nativeBuffer, this);
		isFlushWindowDisabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isKeyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isKeyWindow_IMetInst(){
		return ((isKeyWindow_IMetInst != null)
	? (isKeyWindow_IMetInst)
	: (isKeyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isKeyWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isKeyWindow(){
			final com.apple.jobjc.Invoke.MsgSend isKeyWindow_IMetInst = get_isKeyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isKeyWindow_IMetInst.init(nativeBuffer, this);
		isKeyWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMainWindow_IMetInst(){
		return ((isMainWindow_IMetInst != null)
	? (isMainWindow_IMetInst)
	: (isMainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMainWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMainWindow(){
			final com.apple.jobjc.Invoke.MsgSend isMainWindow_IMetInst = get_isMainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMainWindow_IMetInst.init(nativeBuffer, this);
		isMainWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMiniaturizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMiniaturizable_IMetInst(){
		return ((isMiniaturizable_IMetInst != null)
	? (isMiniaturizable_IMetInst)
	: (isMiniaturizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMiniaturizable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMiniaturizable(){
			final com.apple.jobjc.Invoke.MsgSend isMiniaturizable_IMetInst = get_isMiniaturizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMiniaturizable_IMetInst.init(nativeBuffer, this);
		isMiniaturizable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMiniaturized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMiniaturized_IMetInst(){
		return ((isMiniaturized_IMetInst != null)
	? (isMiniaturized_IMetInst)
	: (isMiniaturized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMiniaturized", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMiniaturized(){
			final com.apple.jobjc.Invoke.MsgSend isMiniaturized_IMetInst = get_isMiniaturized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMiniaturized_IMetInst.init(nativeBuffer, this);
		isMiniaturized_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isModalPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isModalPanel_IMetInst(){
		return ((isModalPanel_IMetInst != null)
	? (isModalPanel_IMetInst)
	: (isModalPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isModalPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isModalPanel(){
			final com.apple.jobjc.Invoke.MsgSend isModalPanel_IMetInst = get_isModalPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isModalPanel_IMetInst.init(nativeBuffer, this);
		isModalPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMovable_IMetInst(){
		return ((isMovable_IMetInst != null)
	? (isMovable_IMetInst)
	: (isMovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMovable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMovable(){
			final com.apple.jobjc.Invoke.MsgSend isMovable_IMetInst = get_isMovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMovable_IMetInst.init(nativeBuffer, this);
		isMovable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMovableByWindowBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMovableByWindowBackground_IMetInst(){
		return ((isMovableByWindowBackground_IMetInst != null)
	? (isMovableByWindowBackground_IMetInst)
	: (isMovableByWindowBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMovableByWindowBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMovableByWindowBackground(){
			final com.apple.jobjc.Invoke.MsgSend isMovableByWindowBackground_IMetInst = get_isMovableByWindowBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMovableByWindowBackground_IMetInst.init(nativeBuffer, this);
		isMovableByWindowBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOnActiveSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOnActiveSpace_IMetInst(){
		return ((isOnActiveSpace_IMetInst != null)
	? (isOnActiveSpace_IMetInst)
	: (isOnActiveSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOnActiveSpace", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOnActiveSpace(){
			final com.apple.jobjc.Invoke.MsgSend isOnActiveSpace_IMetInst = get_isOnActiveSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOnActiveSpace_IMetInst.init(nativeBuffer, this);
		isOnActiveSpace_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOneShot_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOneShot_IMetInst(){
		return ((isOneShot_IMetInst != null)
	? (isOneShot_IMetInst)
	: (isOneShot_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOneShot", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOneShot(){
			final com.apple.jobjc.Invoke.MsgSend isOneShot_IMetInst = get_isOneShot_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOneShot_IMetInst.init(nativeBuffer, this);
		isOneShot_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend isReleasedWhenClosed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isReleasedWhenClosed_IMetInst(){
		return ((isReleasedWhenClosed_IMetInst != null)
	? (isReleasedWhenClosed_IMetInst)
	: (isReleasedWhenClosed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isReleasedWhenClosed", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isReleasedWhenClosed(){
			final com.apple.jobjc.Invoke.MsgSend isReleasedWhenClosed_IMetInst = get_isReleasedWhenClosed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isReleasedWhenClosed_IMetInst.init(nativeBuffer, this);
		isReleasedWhenClosed_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isResizable_IMetInst(){
		return ((isResizable_IMetInst != null)
	? (isResizable_IMetInst)
	: (isResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isResizable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isResizable(){
			final com.apple.jobjc.Invoke.MsgSend isResizable_IMetInst = get_isResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isResizable_IMetInst.init(nativeBuffer, this);
		isResizable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRestorable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRestorable_IMetInst(){
		return ((isRestorable_IMetInst != null)
	? (isRestorable_IMetInst)
	: (isRestorable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRestorable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRestorable(){
			final com.apple.jobjc.Invoke.MsgSend isRestorable_IMetInst = get_isRestorable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRestorable_IMetInst.init(nativeBuffer, this);
		isRestorable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSheet_IMetInst(){
		return ((isSheet_IMetInst != null)
	? (isSheet_IMetInst)
	: (isSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSheet", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSheet(){
			final com.apple.jobjc.Invoke.MsgSend isSheet_IMetInst = get_isSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSheet_IMetInst.init(nativeBuffer, this);
		isSheet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend isZoomable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isZoomable_IMetInst(){
		return ((isZoomable_IMetInst != null)
	? (isZoomable_IMetInst)
	: (isZoomable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isZoomable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isZoomable(){
			final com.apple.jobjc.Invoke.MsgSend isZoomable_IMetInst = get_isZoomable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isZoomable_IMetInst.init(nativeBuffer, this);
		isZoomable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isZoomed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isZoomed_IMetInst(){
		return ((isZoomed_IMetInst != null)
	? (isZoomed_IMetInst)
	: (isZoomed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isZoomed", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isZoomed(){
			final com.apple.jobjc.Invoke.MsgSend isZoomed_IMetInst = get_isZoomed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isZoomed_IMetInst.init(nativeBuffer, this);
		isZoomed_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyDown_IMetInst(){
		return ((keyDown_IMetInst != null)
	? (keyDown_IMetInst)
	: (keyDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void keyDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend keyDown_IMetInst = get_keyDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		keyDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend keyViewSelectionDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyViewSelectionDirection_IMetInst(){
		return ((keyViewSelectionDirection_IMetInst != null)
	? (keyViewSelectionDirection_IMetInst)
	: (keyViewSelectionDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyViewSelectionDirection", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long keyViewSelectionDirection(){
			final com.apple.jobjc.Invoke.MsgSend keyViewSelectionDirection_IMetInst = get_keyViewSelectionDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyViewSelectionDirection_IMetInst.init(nativeBuffer, this);
		keyViewSelectionDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutIfNeeded_IMetInst(){
		return ((layoutIfNeeded_IMetInst != null)
	? (layoutIfNeeded_IMetInst)
	: (layoutIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void layoutIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend layoutIfNeeded_IMetInst = get_layoutIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutIfNeeded_IMetInst.init(nativeBuffer, this);
		layoutIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend level_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_level_IMetInst(){
		return ((level_IMetInst != null)
	? (level_IMetInst)
	: (level_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "level", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long level(){
			final com.apple.jobjc.Invoke.MsgSend level_IMetInst = get_level_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		level_IMetInst.init(nativeBuffer, this);
		level_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeFirstResponder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeFirstResponder_IMetInst(){
		return ((makeFirstResponder_IMetInst != null)
	? (makeFirstResponder_IMetInst)
	: (makeFirstResponder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeFirstResponder:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean makeFirstResponder(final com.apple.jobjc.appkit.NSResponder aResponder){
			final com.apple.jobjc.Invoke.MsgSend makeFirstResponder_IMetInst = get_makeFirstResponder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeFirstResponder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aResponder);
		makeFirstResponder_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeKeyAndOrderFront_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeKeyAndOrderFront_IMetInst(){
		return ((makeKeyAndOrderFront_IMetInst != null)
	? (makeKeyAndOrderFront_IMetInst)
	: (makeKeyAndOrderFront_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeKeyAndOrderFront:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeKeyAndOrderFront(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend makeKeyAndOrderFront_IMetInst = get_makeKeyAndOrderFront_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeKeyAndOrderFront_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		makeKeyAndOrderFront_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeKeyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeKeyWindow_IMetInst(){
		return ((makeKeyWindow_IMetInst != null)
	? (makeKeyWindow_IMetInst)
	: (makeKeyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeKeyWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void makeKeyWindow(){
			final com.apple.jobjc.Invoke.MsgSend makeKeyWindow_IMetInst = get_makeKeyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeKeyWindow_IMetInst.init(nativeBuffer, this);
		makeKeyWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeMainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeMainWindow_IMetInst(){
		return ((makeMainWindow_IMetInst != null)
	? (makeMainWindow_IMetInst)
	: (makeMainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeMainWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void makeMainWindow(){
			final com.apple.jobjc.Invoke.MsgSend makeMainWindow_IMetInst = get_makeMainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeMainWindow_IMetInst.init(nativeBuffer, this);
		makeMainWindow_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend miniaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_miniaturize_IMetInst(){
		return ((miniaturize_IMetInst != null)
	? (miniaturize_IMetInst)
	: (miniaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "miniaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void miniaturize(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend miniaturize_IMetInst = get_miniaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		miniaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		miniaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend miniwindowImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_miniwindowImage_IMetInst(){
		return ((miniwindowImage_IMetInst != null)
	? (miniwindowImage_IMetInst)
	: (miniwindowImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "miniwindowImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage miniwindowImage(){
			final com.apple.jobjc.Invoke.MsgSend miniwindowImage_IMetInst = get_miniwindowImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		miniwindowImage_IMetInst.init(nativeBuffer, this);
		miniwindowImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend miniwindowTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_miniwindowTitle_IMetInst(){
		return ((miniwindowTitle_IMetInst != null)
	? (miniwindowTitle_IMetInst)
	: (miniwindowTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "miniwindowTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString miniwindowTitle(){
			final com.apple.jobjc.Invoke.MsgSend miniwindowTitle_IMetInst = get_miniwindowTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		miniwindowTitle_IMetInst.init(nativeBuffer, this);
		miniwindowTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseLocationOutsideOfEventStream_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseLocationOutsideOfEventStream_IMetInst(){
		return ((mouseLocationOutsideOfEventStream_IMetInst != null)
	? (mouseLocationOutsideOfEventStream_IMetInst)
	: (mouseLocationOutsideOfEventStream_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseLocationOutsideOfEventStream", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint mouseLocationOutsideOfEventStream(){
			final com.apple.jobjc.Invoke.MsgSend mouseLocationOutsideOfEventStream_IMetInst = get_mouseLocationOutsideOfEventStream_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseLocationOutsideOfEventStream_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		mouseLocationOutsideOfEventStream_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextEventMatchingMask_IMetInst(){
		return ((nextEventMatchingMask_IMetInst != null)
	? (nextEventMatchingMask_IMetInst)
	: (nextEventMatchingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextEventMatchingMask:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSEvent nextEventMatchingMask(final long mask){
			final com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_IMetInst = get_nextEventMatchingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextEventMatchingMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		nextEventMatchingMask_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst(){
		return ((nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst != null)
	? (nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst)
	: (nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextEventMatchingMask:untilDate:inMode:dequeue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent nextEventMatchingMask_untilDate_inMode_dequeue(final long mask, final com.apple.jobjc.foundation.NSDate expiration, final com.apple.jobjc.foundation.NSString mode, final boolean deqFlag){
			final com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst = get_nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expiration);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, deqFlag);
		nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderBack_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderBack_IMetInst(){
		return ((orderBack_IMetInst != null)
	? (orderBack_IMetInst)
	: (orderBack_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderBack:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderBack(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderBack_IMetInst = get_orderBack_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderBack_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderBack_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFront_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFront_IMetInst(){
		return ((orderFront_IMetInst != null)
	? (orderFront_IMetInst)
	: (orderFront_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFront:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFront(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFront_IMetInst = get_orderFront_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFront_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFront_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontRegardless_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontRegardless_IMetInst(){
		return ((orderFrontRegardless_IMetInst != null)
	? (orderFrontRegardless_IMetInst)
	: (orderFrontRegardless_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontRegardless", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void orderFrontRegardless(){
			final com.apple.jobjc.Invoke.MsgSend orderFrontRegardless_IMetInst = get_orderFrontRegardless_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontRegardless_IMetInst.init(nativeBuffer, this);
		orderFrontRegardless_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderOut_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderOut_IMetInst(){
		return ((orderOut_IMetInst != null)
	? (orderOut_IMetInst)
	: (orderOut_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderOut:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderOut(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderOut_IMetInst = get_orderOut_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderOut_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderOut_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderWindow_relativeTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderWindow_relativeTo_IMetInst(){
		return ((orderWindow_relativeTo_IMetInst != null)
	? (orderWindow_relativeTo_IMetInst)
	: (orderWindow_relativeTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderWindow:relativeTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void orderWindow_relativeTo(final long place, final long otherWin){
			final com.apple.jobjc.Invoke.MsgSend orderWindow_relativeTo_IMetInst = get_orderWindow_relativeTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderWindow_relativeTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, place);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, otherWin);
		orderWindow_relativeTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedIndex_IMetInst(){
		return ((orderedIndex_IMetInst != null)
	? (orderedIndex_IMetInst)
	: (orderedIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long orderedIndex(){
			final com.apple.jobjc.Invoke.MsgSend orderedIndex_IMetInst = get_orderedIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedIndex_IMetInst.init(nativeBuffer, this);
		orderedIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentWindow_IMetInst(){
		return ((parentWindow_IMetInst != null)
	? (parentWindow_IMetInst)
	: (parentWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow parentWindow(){
			final com.apple.jobjc.Invoke.MsgSend parentWindow_IMetInst = get_parentWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentWindow_IMetInst.init(nativeBuffer, this);
		parentWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performClose_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performClose_IMetInst(){
		return ((performClose_IMetInst != null)
	? (performClose_IMetInst)
	: (performClose_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performClose:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performClose(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performClose_IMetInst = get_performClose_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performClose_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performClose_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performMiniaturize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performMiniaturize_IMetInst(){
		return ((performMiniaturize_IMetInst != null)
	? (performMiniaturize_IMetInst)
	: (performMiniaturize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performMiniaturize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performMiniaturize(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performMiniaturize_IMetInst = get_performMiniaturize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performMiniaturize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performMiniaturize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performZoom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performZoom_IMetInst(){
		return ((performZoom_IMetInst != null)
	? (performZoom_IMetInst)
	: (performZoom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performZoom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void performZoom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend performZoom_IMetInst = get_performZoom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performZoom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		performZoom_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend postEvent_atStart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postEvent_atStart_IMetInst(){
		return ((postEvent_atStart_IMetInst != null)
	? (postEvent_atStart_IMetInst)
	: (postEvent_atStart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postEvent:atStart:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void postEvent_atStart(final com.apple.jobjc.appkit.NSEvent event, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend postEvent_atStart_IMetInst = get_postEvent_atStart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postEvent_atStart_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		postEvent_atStart_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredBackingLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredBackingLocation_IMetInst(){
		return ((preferredBackingLocation_IMetInst != null)
	? (preferredBackingLocation_IMetInst)
	: (preferredBackingLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredBackingLocation", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long preferredBackingLocation(){
			final com.apple.jobjc.Invoke.MsgSend preferredBackingLocation_IMetInst = get_preferredBackingLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredBackingLocation_IMetInst.init(nativeBuffer, this);
		preferredBackingLocation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preservesContentDuringLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preservesContentDuringLiveResize_IMetInst(){
		return ((preservesContentDuringLiveResize_IMetInst != null)
	? (preservesContentDuringLiveResize_IMetInst)
	: (preservesContentDuringLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preservesContentDuringLiveResize", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean preservesContentDuringLiveResize(){
			final com.apple.jobjc.Invoke.MsgSend preservesContentDuringLiveResize_IMetInst = get_preservesContentDuringLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preservesContentDuringLiveResize_IMetInst.init(nativeBuffer, this);
		preservesContentDuringLiveResize_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preventsApplicationTerminationWhenModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preventsApplicationTerminationWhenModal_IMetInst(){
		return ((preventsApplicationTerminationWhenModal_IMetInst != null)
	? (preventsApplicationTerminationWhenModal_IMetInst)
	: (preventsApplicationTerminationWhenModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preventsApplicationTerminationWhenModal", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean preventsApplicationTerminationWhenModal(){
			final com.apple.jobjc.Invoke.MsgSend preventsApplicationTerminationWhenModal_IMetInst = get_preventsApplicationTerminationWhenModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preventsApplicationTerminationWhenModal_IMetInst.init(nativeBuffer, this);
		preventsApplicationTerminationWhenModal_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend print_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_print_IMetInst(){
		return ((print_IMetInst != null)
	? (print_IMetInst)
	: (print_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "print:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void print(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend print_IMetInst = get_print_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		print_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		print_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend recalculateKeyViewLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recalculateKeyViewLoop_IMetInst(){
		return ((recalculateKeyViewLoop_IMetInst != null)
	? (recalculateKeyViewLoop_IMetInst)
	: (recalculateKeyViewLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recalculateKeyViewLoop", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void recalculateKeyViewLoop(){
			final com.apple.jobjc.Invoke.MsgSend recalculateKeyViewLoop_IMetInst = get_recalculateKeyViewLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recalculateKeyViewLoop_IMetInst.init(nativeBuffer, this);
		recalculateKeyViewLoop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerForDraggedTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerForDraggedTypes_IMetInst(){
		return ((registerForDraggedTypes_IMetInst != null)
	? (registerForDraggedTypes_IMetInst)
	: (registerForDraggedTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerForDraggedTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerForDraggedTypes(final com.apple.jobjc.foundation.NSArray newTypes){
			final com.apple.jobjc.Invoke.MsgSend registerForDraggedTypes_IMetInst = get_registerForDraggedTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerForDraggedTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newTypes);
		registerForDraggedTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeChildWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeChildWindow_IMetInst(){
		return ((removeChildWindow_IMetInst != null)
	? (removeChildWindow_IMetInst)
	: (removeChildWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeChildWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeChildWindow(final com.apple.jobjc.appkit.NSWindow childWin){
			final com.apple.jobjc.Invoke.MsgSend removeChildWindow_IMetInst = get_removeChildWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeChildWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, childWin);
		removeChildWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend representedFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedFilename_IMetInst(){
		return ((representedFilename_IMetInst != null)
	? (representedFilename_IMetInst)
	: (representedFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedFilename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString representedFilename(){
			final com.apple.jobjc.Invoke.MsgSend representedFilename_IMetInst = get_representedFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedFilename_IMetInst.init(nativeBuffer, this);
		representedFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representedURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedURL_IMetInst(){
		return ((representedURL_IMetInst != null)
	? (representedURL_IMetInst)
	: (representedURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL representedURL(){
			final com.apple.jobjc.Invoke.MsgSend representedURL_IMetInst = get_representedURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedURL_IMetInst.init(nativeBuffer, this);
		representedURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resetCursorRects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetCursorRects_IMetInst(){
		return ((resetCursorRects_IMetInst != null)
	? (resetCursorRects_IMetInst)
	: (resetCursorRects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetCursorRects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetCursorRects(){
			final com.apple.jobjc.Invoke.MsgSend resetCursorRects_IMetInst = get_resetCursorRects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetCursorRects_IMetInst.init(nativeBuffer, this);
		resetCursorRects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resignKeyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resignKeyWindow_IMetInst(){
		return ((resignKeyWindow_IMetInst != null)
	? (resignKeyWindow_IMetInst)
	: (resignKeyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resignKeyWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resignKeyWindow(){
			final com.apple.jobjc.Invoke.MsgSend resignKeyWindow_IMetInst = get_resignKeyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resignKeyWindow_IMetInst.init(nativeBuffer, this);
		resignKeyWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resignMainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resignMainWindow_IMetInst(){
		return ((resignMainWindow_IMetInst != null)
	? (resignMainWindow_IMetInst)
	: (resignMainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resignMainWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resignMainWindow(){
			final com.apple.jobjc.Invoke.MsgSend resignMainWindow_IMetInst = get_resignMainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resignMainWindow_IMetInst.init(nativeBuffer, this);
		resignMainWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeFlags_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeFlags_IMetInst(){
		return ((resizeFlags_IMetInst != null)
	? (resizeFlags_IMetInst)
	: (resizeFlags_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeFlags", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long resizeFlags(){
			final com.apple.jobjc.Invoke.MsgSend resizeFlags_IMetInst = get_resizeFlags_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeFlags_IMetInst.init(nativeBuffer, this);
		resizeFlags_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeIncrements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeIncrements_IMetInst(){
		return ((resizeIncrements_IMetInst != null)
	? (resizeIncrements_IMetInst)
	: (resizeIncrements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeIncrements", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize resizeIncrements(){
			final com.apple.jobjc.Invoke.MsgSend resizeIncrements_IMetInst = get_resizeIncrements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeIncrements_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		resizeIncrements_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restorationClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restorationClass_IMetInst(){
		return ((restorationClass_IMetInst != null)
	? (restorationClass_IMetInst)
	: (restorationClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restorationClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T restorationClass(){
			final com.apple.jobjc.Invoke.MsgSend restorationClass_IMetInst = get_restorationClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restorationClass_IMetInst.init(nativeBuffer, this);
		restorationClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreCachedImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreCachedImage_IMetInst(){
		return ((restoreCachedImage_IMetInst != null)
	? (restoreCachedImage_IMetInst)
	: (restoreCachedImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreCachedImage", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void restoreCachedImage(){
			final com.apple.jobjc.Invoke.MsgSend restoreCachedImage_IMetInst = get_restoreCachedImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreCachedImage_IMetInst.init(nativeBuffer, this);
		restoreCachedImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runToolbarCustomizationPalette_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runToolbarCustomizationPalette_IMetInst(){
		return ((runToolbarCustomizationPalette_IMetInst != null)
	? (runToolbarCustomizationPalette_IMetInst)
	: (runToolbarCustomizationPalette_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runToolbarCustomizationPalette:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void runToolbarCustomizationPalette(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend runToolbarCustomizationPalette_IMetInst = get_runToolbarCustomizationPalette_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runToolbarCustomizationPalette_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		runToolbarCustomizationPalette_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveFrameUsingName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveFrameUsingName_IMetInst(){
		return ((saveFrameUsingName_IMetInst != null)
	? (saveFrameUsingName_IMetInst)
	: (saveFrameUsingName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveFrameUsingName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void saveFrameUsingName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend saveFrameUsingName_IMetInst = get_saveFrameUsingName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveFrameUsingName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		saveFrameUsingName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend screen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_screen_IMetInst(){
		return ((screen_IMetInst != null)
	? (screen_IMetInst)
	: (screen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "screen", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScreen screen(){
			final com.apple.jobjc.Invoke.MsgSend screen_IMetInst = get_screen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		screen_IMetInst.init(nativeBuffer, this);
		screen_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScreen returnValue = (com.apple.jobjc.appkit.NSScreen) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectKeyViewFollowingView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectKeyViewFollowingView_IMetInst(){
		return ((selectKeyViewFollowingView_IMetInst != null)
	? (selectKeyViewFollowingView_IMetInst)
	: (selectKeyViewFollowingView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectKeyViewFollowingView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectKeyViewFollowingView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend selectKeyViewFollowingView_IMetInst = get_selectKeyViewFollowingView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectKeyViewFollowingView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		selectKeyViewFollowingView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectKeyViewPrecedingView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectKeyViewPrecedingView_IMetInst(){
		return ((selectKeyViewPrecedingView_IMetInst != null)
	? (selectKeyViewPrecedingView_IMetInst)
	: (selectKeyViewPrecedingView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectKeyViewPrecedingView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectKeyViewPrecedingView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend selectKeyViewPrecedingView_IMetInst = get_selectKeyViewPrecedingView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectKeyViewPrecedingView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		selectKeyViewPrecedingView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectNextKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectNextKeyView_IMetInst(){
		return ((selectNextKeyView_IMetInst != null)
	? (selectNextKeyView_IMetInst)
	: (selectNextKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectNextKeyView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectNextKeyView(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectNextKeyView_IMetInst = get_selectNextKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectNextKeyView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectNextKeyView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectPreviousKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectPreviousKeyView_IMetInst(){
		return ((selectPreviousKeyView_IMetInst != null)
	? (selectPreviousKeyView_IMetInst)
	: (selectPreviousKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectPreviousKeyView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectPreviousKeyView(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectPreviousKeyView_IMetInst = get_selectPreviousKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectPreviousKeyView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectPreviousKeyView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendEvent_IMetInst(){
		return ((sendEvent_IMetInst != null)
	? (sendEvent_IMetInst)
	: (sendEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sendEvent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend sendEvent_IMetInst = get_sendEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		sendEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcceptsMouseMovedEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcceptsMouseMovedEvents_IMetInst(){
		return ((setAcceptsMouseMovedEvents_IMetInst != null)
	? (setAcceptsMouseMovedEvents_IMetInst)
	: (setAcceptsMouseMovedEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcceptsMouseMovedEvents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAcceptsMouseMovedEvents(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAcceptsMouseMovedEvents_IMetInst = get_setAcceptsMouseMovedEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcceptsMouseMovedEvents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAcceptsMouseMovedEvents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsConcurrentViewDrawing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsConcurrentViewDrawing_IMetInst(){
		return ((setAllowsConcurrentViewDrawing_IMetInst != null)
	? (setAllowsConcurrentViewDrawing_IMetInst)
	: (setAllowsConcurrentViewDrawing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsConcurrentViewDrawing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsConcurrentViewDrawing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsConcurrentViewDrawing_IMetInst = get_setAllowsConcurrentViewDrawing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsConcurrentViewDrawing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsConcurrentViewDrawing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsToolTipsWhenApplicationIsInactive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsToolTipsWhenApplicationIsInactive_IMetInst(){
		return ((setAllowsToolTipsWhenApplicationIsInactive_IMetInst != null)
	? (setAllowsToolTipsWhenApplicationIsInactive_IMetInst)
	: (setAllowsToolTipsWhenApplicationIsInactive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsToolTipsWhenApplicationIsInactive:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsToolTipsWhenApplicationIsInactive(final boolean allowWhenInactive){
			final com.apple.jobjc.Invoke.MsgSend setAllowsToolTipsWhenApplicationIsInactive_IMetInst = get_setAllowsToolTipsWhenApplicationIsInactive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsToolTipsWhenApplicationIsInactive_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowWhenInactive);
		setAllowsToolTipsWhenApplicationIsInactive_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlphaValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlphaValue_IMetInst(){
		return ((setAlphaValue_IMetInst != null)
	? (setAlphaValue_IMetInst)
	: (setAlphaValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlphaValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setAlphaValue(final double windowAlpha){
			final com.apple.jobjc.Invoke.MsgSend setAlphaValue_IMetInst = get_setAlphaValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlphaValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, windowAlpha);
		setAlphaValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnchorAttribute_forOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnchorAttribute_forOrientation_IMetInst(){
		return ((setAnchorAttribute_forOrientation_IMetInst != null)
	? (setAnchorAttribute_forOrientation_IMetInst)
	: (setAnchorAttribute_forOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnchorAttribute:forOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setAnchorAttribute_forOrientation(final long attr, final long orientation){
			final com.apple.jobjc.Invoke.MsgSend setAnchorAttribute_forOrientation_IMetInst = get_setAnchorAttribute_forOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnchorAttribute_forOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attr);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		setAnchorAttribute_forOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimationBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimationBehavior_IMetInst(){
		return ((setAnimationBehavior_IMetInst != null)
	? (setAnimationBehavior_IMetInst)
	: (setAnimationBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimationBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setAnimationBehavior(final long newAnimationBehavior){
			final com.apple.jobjc.Invoke.MsgSend setAnimationBehavior_IMetInst = get_setAnimationBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimationBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newAnimationBehavior);
		setAnimationBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAspectRatio_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAspectRatio_IMetInst(){
		return ((setAspectRatio_IMetInst != null)
	? (setAspectRatio_IMetInst)
	: (setAspectRatio_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAspectRatio:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setAspectRatio(final com.apple.jobjc.foundation.NSSize ratio){
			final com.apple.jobjc.Invoke.MsgSend setAspectRatio_IMetInst = get_setAspectRatio_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAspectRatio_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, ratio);
		setAspectRatio_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutodisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutodisplay_IMetInst(){
		return ((setAutodisplay_IMetInst != null)
	? (setAutodisplay_IMetInst)
	: (setAutodisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutodisplay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutodisplay(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutodisplay_IMetInst = get_setAutodisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutodisplay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutodisplay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutorecalculatesContentBorderThickness_forEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutorecalculatesContentBorderThickness_forEdge_IMetInst(){
		return ((setAutorecalculatesContentBorderThickness_forEdge_IMetInst != null)
	? (setAutorecalculatesContentBorderThickness_forEdge_IMetInst)
	: (setAutorecalculatesContentBorderThickness_forEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutorecalculatesContentBorderThickness:forEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setAutorecalculatesContentBorderThickness_forEdge(final boolean flag, final long edge){
			final com.apple.jobjc.Invoke.MsgSend setAutorecalculatesContentBorderThickness_forEdge_IMetInst = get_setAutorecalculatesContentBorderThickness_forEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutorecalculatesContentBorderThickness_forEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setAutorecalculatesContentBorderThickness_forEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutorecalculatesKeyViewLoop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutorecalculatesKeyViewLoop_IMetInst(){
		return ((setAutorecalculatesKeyViewLoop_IMetInst != null)
	? (setAutorecalculatesKeyViewLoop_IMetInst)
	: (setAutorecalculatesKeyViewLoop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutorecalculatesKeyViewLoop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutorecalculatesKeyViewLoop(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutorecalculatesKeyViewLoop_IMetInst = get_setAutorecalculatesKeyViewLoop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutorecalculatesKeyViewLoop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutorecalculatesKeyViewLoop_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBackingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackingType_IMetInst(){
		return ((setBackingType_IMetInst != null)
	? (setBackingType_IMetInst)
	: (setBackingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackingType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBackingType(final long bufferingType){
			final com.apple.jobjc.Invoke.MsgSend setBackingType_IMetInst = get_setBackingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackingType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, bufferingType);
		setBackingType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanBeVisibleOnAllSpaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanBeVisibleOnAllSpaces_IMetInst(){
		return ((setCanBeVisibleOnAllSpaces_IMetInst != null)
	? (setCanBeVisibleOnAllSpaces_IMetInst)
	: (setCanBeVisibleOnAllSpaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanBeVisibleOnAllSpaces:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanBeVisibleOnAllSpaces(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanBeVisibleOnAllSpaces_IMetInst = get_setCanBeVisibleOnAllSpaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanBeVisibleOnAllSpaces_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanBeVisibleOnAllSpaces_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanBecomeVisibleWithoutLogin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanBecomeVisibleWithoutLogin_IMetInst(){
		return ((setCanBecomeVisibleWithoutLogin_IMetInst != null)
	? (setCanBecomeVisibleWithoutLogin_IMetInst)
	: (setCanBecomeVisibleWithoutLogin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanBecomeVisibleWithoutLogin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanBecomeVisibleWithoutLogin(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanBecomeVisibleWithoutLogin_IMetInst = get_setCanBecomeVisibleWithoutLogin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanBecomeVisibleWithoutLogin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanBecomeVisibleWithoutLogin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanHide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanHide_IMetInst(){
		return ((setCanHide_IMetInst != null)
	? (setCanHide_IMetInst)
	: (setCanHide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanHide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanHide(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanHide_IMetInst = get_setCanHide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanHide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanHide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCollectionBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCollectionBehavior_IMetInst(){
		return ((setCollectionBehavior_IMetInst != null)
	? (setCollectionBehavior_IMetInst)
	: (setCollectionBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCollectionBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setCollectionBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setCollectionBehavior_IMetInst = get_setCollectionBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCollectionBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, behavior);
		setCollectionBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColorSpace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColorSpace_IMetInst(){
		return ((setColorSpace_IMetInst != null)
	? (setColorSpace_IMetInst)
	: (setColorSpace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColorSpace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColorSpace(final com.apple.jobjc.appkit.NSColorSpace colorSpace){
			final com.apple.jobjc.Invoke.MsgSend setColorSpace_IMetInst = get_setColorSpace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColorSpace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorSpace);
		setColorSpace_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentAspectRatio_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentAspectRatio_IMetInst(){
		return ((setContentAspectRatio_IMetInst != null)
	? (setContentAspectRatio_IMetInst)
	: (setContentAspectRatio_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentAspectRatio:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentAspectRatio(final com.apple.jobjc.foundation.NSSize ratio){
			final com.apple.jobjc.Invoke.MsgSend setContentAspectRatio_IMetInst = get_setContentAspectRatio_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentAspectRatio_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, ratio);
		setContentAspectRatio_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentBorderThickness_forEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentBorderThickness_forEdge_IMetInst(){
		return ((setContentBorderThickness_forEdge_IMetInst != null)
	? (setContentBorderThickness_forEdge_IMetInst)
	: (setContentBorderThickness_forEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentBorderThickness:forEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setContentBorderThickness_forEdge(final double thickness, final long edge){
			final com.apple.jobjc.Invoke.MsgSend setContentBorderThickness_forEdge_IMetInst = get_setContentBorderThickness_forEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentBorderThickness_forEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, thickness);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setContentBorderThickness_forEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentMaxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentMaxSize_IMetInst(){
		return ((setContentMaxSize_IMetInst != null)
	? (setContentMaxSize_IMetInst)
	: (setContentMaxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentMaxSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentMaxSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setContentMaxSize_IMetInst = get_setContentMaxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentMaxSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setContentMaxSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentMinSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentMinSize_IMetInst(){
		return ((setContentMinSize_IMetInst != null)
	? (setContentMinSize_IMetInst)
	: (setContentMinSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentMinSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentMinSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setContentMinSize_IMetInst = get_setContentMinSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentMinSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setContentMinSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentResizeIncrements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentResizeIncrements_IMetInst(){
		return ((setContentResizeIncrements_IMetInst != null)
	? (setContentResizeIncrements_IMetInst)
	: (setContentResizeIncrements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentResizeIncrements:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentResizeIncrements(final com.apple.jobjc.foundation.NSSize increments){
			final com.apple.jobjc.Invoke.MsgSend setContentResizeIncrements_IMetInst = get_setContentResizeIncrements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentResizeIncrements_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, increments);
		setContentResizeIncrements_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentSize_IMetInst(){
		return ((setContentSize_IMetInst != null)
	? (setContentSize_IMetInst)
	: (setContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst = get_setContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		setContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentView_IMetInst(){
		return ((setContentView_IMetInst != null)
	? (setContentView_IMetInst)
	: (setContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst = get_setContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setContentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultButtonCell_IMetInst(){
		return ((setDefaultButtonCell_IMetInst != null)
	? (setDefaultButtonCell_IMetInst)
	: (setDefaultButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultButtonCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultButtonCell(final com.apple.jobjc.appkit.NSButtonCell defButt){
			final com.apple.jobjc.Invoke.MsgSend setDefaultButtonCell_IMetInst = get_setDefaultButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultButtonCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defButt);
		setDefaultButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDepthLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDepthLimit_IMetInst(){
		return ((setDepthLimit_IMetInst != null)
	? (setDepthLimit_IMetInst)
	: (setDepthLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDepthLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.SIntCoder.INST)));
	}

	 public void setDepthLimit(final int limit){
			final com.apple.jobjc.Invoke.MsgSend setDepthLimit_IMetInst = get_setDepthLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDepthLimit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.SIntCoder.INST.push(nativeBuffer, limit);
		setDepthLimit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplaysWhenScreenProfileChanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplaysWhenScreenProfileChanges_IMetInst(){
		return ((setDisplaysWhenScreenProfileChanges_IMetInst != null)
	? (setDisplaysWhenScreenProfileChanges_IMetInst)
	: (setDisplaysWhenScreenProfileChanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplaysWhenScreenProfileChanges:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDisplaysWhenScreenProfileChanges(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDisplaysWhenScreenProfileChanges_IMetInst = get_setDisplaysWhenScreenProfileChanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplaysWhenScreenProfileChanges_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDisplaysWhenScreenProfileChanges_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocumentEdited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocumentEdited_IMetInst(){
		return ((setDocumentEdited_IMetInst != null)
	? (setDocumentEdited_IMetInst)
	: (setDocumentEdited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocumentEdited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDocumentEdited(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDocumentEdited_IMetInst = get_setDocumentEdited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocumentEdited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDocumentEdited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDynamicDepthLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDynamicDepthLimit_IMetInst(){
		return ((setDynamicDepthLimit_IMetInst != null)
	? (setDynamicDepthLimit_IMetInst)
	: (setDynamicDepthLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDynamicDepthLimit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDynamicDepthLimit(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDynamicDepthLimit_IMetInst = get_setDynamicDepthLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDynamicDepthLimit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDynamicDepthLimit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExcludedFromWindowsMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExcludedFromWindowsMenu_IMetInst(){
		return ((setExcludedFromWindowsMenu_IMetInst != null)
	? (setExcludedFromWindowsMenu_IMetInst)
	: (setExcludedFromWindowsMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExcludedFromWindowsMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setExcludedFromWindowsMenu(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setExcludedFromWindowsMenu_IMetInst = get_setExcludedFromWindowsMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExcludedFromWindowsMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setExcludedFromWindowsMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrame_display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrame_display_IMetInst(){
		return ((setFrame_display_IMetInst != null)
	? (setFrame_display_IMetInst)
	: (setFrame_display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrame:display:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFrame_display(final com.apple.jobjc.foundation.NSRect frameRect, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setFrame_display_IMetInst = get_setFrame_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrame_display_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setFrame_display_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrame_display_animate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrame_display_animate_IMetInst(){
		return ((setFrame_display_animate_IMetInst != null)
	? (setFrame_display_animate_IMetInst)
	: (setFrame_display_animate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrame:display:animate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFrame_display_animate(final com.apple.jobjc.foundation.NSRect frameRect, final boolean displayFlag, final boolean animateFlag){
			final com.apple.jobjc.Invoke.MsgSend setFrame_display_animate_IMetInst = get_setFrame_display_animate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrame_display_animate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, displayFlag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, animateFlag);
		setFrame_display_animate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameAutosaveName_IMetInst(){
		return ((setFrameAutosaveName_IMetInst != null)
	? (setFrameAutosaveName_IMetInst)
	: (setFrameAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameAutosaveName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setFrameAutosaveName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setFrameAutosaveName_IMetInst = get_setFrameAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setFrameAutosaveName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameFromString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameFromString_IMetInst(){
		return ((setFrameFromString_IMetInst != null)
	? (setFrameFromString_IMetInst)
	: (setFrameFromString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameFromString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFrameFromString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setFrameFromString_IMetInst = get_setFrameFromString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameFromString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setFrameFromString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameOrigin_IMetInst(){
		return ((setFrameOrigin_IMetInst != null)
	? (setFrameOrigin_IMetInst)
	: (setFrameOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setFrameOrigin(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend setFrameOrigin_IMetInst = get_setFrameOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		setFrameOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameTopLeftPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameTopLeftPoint_IMetInst(){
		return ((setFrameTopLeftPoint_IMetInst != null)
	? (setFrameTopLeftPoint_IMetInst)
	: (setFrameTopLeftPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameTopLeftPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setFrameTopLeftPoint(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend setFrameTopLeftPoint_IMetInst = get_setFrameTopLeftPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameTopLeftPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		setFrameTopLeftPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameUsingName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameUsingName_IMetInst(){
		return ((setFrameUsingName_IMetInst != null)
	? (setFrameUsingName_IMetInst)
	: (setFrameUsingName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameUsingName:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setFrameUsingName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setFrameUsingName_IMetInst = get_setFrameUsingName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameUsingName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setFrameUsingName_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameUsingName_force_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameUsingName_force_IMetInst(){
		return ((setFrameUsingName_force_IMetInst != null)
	? (setFrameUsingName_force_IMetInst)
	: (setFrameUsingName_force_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameUsingName:force:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean setFrameUsingName_force(final com.apple.jobjc.foundation.NSString name, final boolean force){
			final com.apple.jobjc.Invoke.MsgSend setFrameUsingName_force_IMetInst = get_setFrameUsingName_force_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameUsingName_force_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, force);
		setFrameUsingName_force_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasShadow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasShadow_IMetInst(){
		return ((setHasShadow_IMetInst != null)
	? (setHasShadow_IMetInst)
	: (setHasShadow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasShadow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasShadow(final boolean hasShadow){
			final com.apple.jobjc.Invoke.MsgSend setHasShadow_IMetInst = get_setHasShadow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasShadow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hasShadow);
		setHasShadow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHidesOnDeactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHidesOnDeactivate_IMetInst(){
		return ((setHidesOnDeactivate_IMetInst != null)
	? (setHidesOnDeactivate_IMetInst)
	: (setHidesOnDeactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHidesOnDeactivate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHidesOnDeactivate(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHidesOnDeactivate_IMetInst = get_setHidesOnDeactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHidesOnDeactivate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHidesOnDeactivate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIgnoresMouseEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIgnoresMouseEvents_IMetInst(){
		return ((setIgnoresMouseEvents_IMetInst != null)
	? (setIgnoresMouseEvents_IMetInst)
	: (setIgnoresMouseEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIgnoresMouseEvents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIgnoresMouseEvents(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIgnoresMouseEvents_IMetInst = get_setIgnoresMouseEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIgnoresMouseEvents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIgnoresMouseEvents_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setIsMiniaturized_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIsMiniaturized_IMetInst(){
		return ((setIsMiniaturized_IMetInst != null)
	? (setIsMiniaturized_IMetInst)
	: (setIsMiniaturized_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIsMiniaturized:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIsMiniaturized(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIsMiniaturized_IMetInst = get_setIsMiniaturized_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIsMiniaturized_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIsMiniaturized_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIsVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIsVisible_IMetInst(){
		return ((setIsVisible_IMetInst != null)
	? (setIsVisible_IMetInst)
	: (setIsVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIsVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIsVisible(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIsVisible_IMetInst = get_setIsVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIsVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIsVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIsZoomed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIsZoomed_IMetInst(){
		return ((setIsZoomed_IMetInst != null)
	? (setIsZoomed_IMetInst)
	: (setIsZoomed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIsZoomed:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIsZoomed(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIsZoomed_IMetInst = get_setIsZoomed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIsZoomed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIsZoomed_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLevel_IMetInst(){
		return ((setLevel_IMetInst != null)
	? (setLevel_IMetInst)
	: (setLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLevel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLevel(final long newLevel){
			final com.apple.jobjc.Invoke.MsgSend setLevel_IMetInst = get_setLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newLevel);
		setLevel_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setMiniwindowImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMiniwindowImage_IMetInst(){
		return ((setMiniwindowImage_IMetInst != null)
	? (setMiniwindowImage_IMetInst)
	: (setMiniwindowImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMiniwindowImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMiniwindowImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setMiniwindowImage_IMetInst = get_setMiniwindowImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMiniwindowImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setMiniwindowImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMiniwindowTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMiniwindowTitle_IMetInst(){
		return ((setMiniwindowTitle_IMetInst != null)
	? (setMiniwindowTitle_IMetInst)
	: (setMiniwindowTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMiniwindowTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMiniwindowTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend setMiniwindowTitle_IMetInst = get_setMiniwindowTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMiniwindowTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setMiniwindowTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMovable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMovable_IMetInst(){
		return ((setMovable_IMetInst != null)
	? (setMovable_IMetInst)
	: (setMovable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMovable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMovable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMovable_IMetInst = get_setMovable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMovable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMovable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMovableByWindowBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMovableByWindowBackground_IMetInst(){
		return ((setMovableByWindowBackground_IMetInst != null)
	? (setMovableByWindowBackground_IMetInst)
	: (setMovableByWindowBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMovableByWindowBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMovableByWindowBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMovableByWindowBackground_IMetInst = get_setMovableByWindowBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMovableByWindowBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMovableByWindowBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOneShot_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOneShot_IMetInst(){
		return ((setOneShot_IMetInst != null)
	? (setOneShot_IMetInst)
	: (setOneShot_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOneShot:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setOneShot(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setOneShot_IMetInst = get_setOneShot_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOneShot_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setOneShot_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOpaque_IMetInst(){
		return ((setOpaque_IMetInst != null)
	? (setOpaque_IMetInst)
	: (setOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOpaque:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setOpaque(final boolean isOpaque){
			final com.apple.jobjc.Invoke.MsgSend setOpaque_IMetInst = get_setOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOpaque_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isOpaque);
		setOpaque_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOrderedIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOrderedIndex_IMetInst(){
		return ((setOrderedIndex_IMetInst != null)
	? (setOrderedIndex_IMetInst)
	: (setOrderedIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOrderedIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setOrderedIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend setOrderedIndex_IMetInst = get_setOrderedIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOrderedIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setOrderedIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParentWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParentWindow_IMetInst(){
		return ((setParentWindow_IMetInst != null)
	? (setParentWindow_IMetInst)
	: (setParentWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParentWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setParentWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend setParentWindow_IMetInst = get_setParentWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParentWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		setParentWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredBackingLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredBackingLocation_IMetInst(){
		return ((setPreferredBackingLocation_IMetInst != null)
	? (setPreferredBackingLocation_IMetInst)
	: (setPreferredBackingLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredBackingLocation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setPreferredBackingLocation(final long backingLocation){
			final com.apple.jobjc.Invoke.MsgSend setPreferredBackingLocation_IMetInst = get_setPreferredBackingLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredBackingLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, backingLocation);
		setPreferredBackingLocation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreservesContentDuringLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreservesContentDuringLiveResize_IMetInst(){
		return ((setPreservesContentDuringLiveResize_IMetInst != null)
	? (setPreservesContentDuringLiveResize_IMetInst)
	: (setPreservesContentDuringLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreservesContentDuringLiveResize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPreservesContentDuringLiveResize(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPreservesContentDuringLiveResize_IMetInst = get_setPreservesContentDuringLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreservesContentDuringLiveResize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPreservesContentDuringLiveResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreventsApplicationTerminationWhenModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreventsApplicationTerminationWhenModal_IMetInst(){
		return ((setPreventsApplicationTerminationWhenModal_IMetInst != null)
	? (setPreventsApplicationTerminationWhenModal_IMetInst)
	: (setPreventsApplicationTerminationWhenModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreventsApplicationTerminationWhenModal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPreventsApplicationTerminationWhenModal(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPreventsApplicationTerminationWhenModal_IMetInst = get_setPreventsApplicationTerminationWhenModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreventsApplicationTerminationWhenModal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPreventsApplicationTerminationWhenModal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReleasedWhenClosed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReleasedWhenClosed_IMetInst(){
		return ((setReleasedWhenClosed_IMetInst != null)
	? (setReleasedWhenClosed_IMetInst)
	: (setReleasedWhenClosed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReleasedWhenClosed:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setReleasedWhenClosed(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setReleasedWhenClosed_IMetInst = get_setReleasedWhenClosed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReleasedWhenClosed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setReleasedWhenClosed_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedFilename_IMetInst(){
		return ((setRepresentedFilename_IMetInst != null)
	? (setRepresentedFilename_IMetInst)
	: (setRepresentedFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedFilename(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedFilename_IMetInst = get_setRepresentedFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setRepresentedFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedURL_IMetInst(){
		return ((setRepresentedURL_IMetInst != null)
	? (setRepresentedURL_IMetInst)
	: (setRepresentedURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedURL_IMetInst = get_setRepresentedURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		setRepresentedURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setResizeIncrements_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResizeIncrements_IMetInst(){
		return ((setResizeIncrements_IMetInst != null)
	? (setResizeIncrements_IMetInst)
	: (setResizeIncrements_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResizeIncrements:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setResizeIncrements(final com.apple.jobjc.foundation.NSSize increments){
			final com.apple.jobjc.Invoke.MsgSend setResizeIncrements_IMetInst = get_setResizeIncrements_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResizeIncrements_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, increments);
		setResizeIncrements_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRestorable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRestorable_IMetInst(){
		return ((setRestorable_IMetInst != null)
	? (setRestorable_IMetInst)
	: (setRestorable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRestorable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRestorable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRestorable_IMetInst = get_setRestorable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRestorable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRestorable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRestorationClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRestorationClass_IMetInst(){
		return ((setRestorationClass_IMetInst != null)
	? (setRestorationClass_IMetInst)
	: (setRestorationClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRestorationClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setRestorationClass(final com.apple.jobjc.NSClass restorationClass){
			final com.apple.jobjc.Invoke.MsgSend setRestorationClass_IMetInst = get_setRestorationClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRestorationClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, restorationClass);
		setRestorationClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSharingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSharingType_IMetInst(){
		return ((setSharingType_IMetInst != null)
	? (setSharingType_IMetInst)
	: (setSharingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSharingType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setSharingType(final long type){
			final com.apple.jobjc.Invoke.MsgSend setSharingType_IMetInst = get_setSharingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSharingType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		setSharingType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsResizeIndicator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsResizeIndicator_IMetInst(){
		return ((setShowsResizeIndicator_IMetInst != null)
	? (setShowsResizeIndicator_IMetInst)
	: (setShowsResizeIndicator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsResizeIndicator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsResizeIndicator(final boolean show){
			final com.apple.jobjc.Invoke.MsgSend setShowsResizeIndicator_IMetInst = get_setShowsResizeIndicator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsResizeIndicator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, show);
		setShowsResizeIndicator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsToolbarButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsToolbarButton_IMetInst(){
		return ((setShowsToolbarButton_IMetInst != null)
	? (setShowsToolbarButton_IMetInst)
	: (setShowsToolbarButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsToolbarButton:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsToolbarButton(final boolean show){
			final com.apple.jobjc.Invoke.MsgSend setShowsToolbarButton_IMetInst = get_setShowsToolbarButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsToolbarButton_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, show);
		setShowsToolbarButton_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStyleMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStyleMask_IMetInst(){
		return ((setStyleMask_IMetInst != null)
	? (setStyleMask_IMetInst)
	: (setStyleMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStyleMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setStyleMask(final long styleMask){
			final com.apple.jobjc.Invoke.MsgSend setStyleMask_IMetInst = get_setStyleMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStyleMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, styleMask);
		setStyleMask_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTitleWithRepresentedFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWithRepresentedFilename_IMetInst(){
		return ((setTitleWithRepresentedFilename_IMetInst != null)
	? (setTitleWithRepresentedFilename_IMetInst)
	: (setTitleWithRepresentedFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWithRepresentedFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleWithRepresentedFilename(final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend setTitleWithRepresentedFilename_IMetInst = get_setTitleWithRepresentedFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWithRepresentedFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		setTitleWithRepresentedFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setToolbar_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setToolbar_IMetInst(){
		return ((setToolbar_IMetInst != null)
	? (setToolbar_IMetInst)
	: (setToolbar_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setToolbar:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setToolbar(final com.apple.jobjc.appkit.NSToolbar toolbar){
			final com.apple.jobjc.Invoke.MsgSend setToolbar_IMetInst = get_setToolbar_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setToolbar_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolbar);
		setToolbar_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setViewsNeedDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setViewsNeedDisplay_IMetInst(){
		return ((setViewsNeedDisplay_IMetInst != null)
	? (setViewsNeedDisplay_IMetInst)
	: (setViewsNeedDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setViewsNeedDisplay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setViewsNeedDisplay(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setViewsNeedDisplay_IMetInst = get_setViewsNeedDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setViewsNeedDisplay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setViewsNeedDisplay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindowController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindowController_IMetInst(){
		return ((setWindowController_IMetInst != null)
	? (setWindowController_IMetInst)
	: (setWindowController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindowController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWindowController(final com.apple.jobjc.appkit.NSWindowController windowController){
			final com.apple.jobjc.Invoke.MsgSend setWindowController_IMetInst = get_setWindowController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindowController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		setWindowController_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharingType_IMetInst(){
		return ((sharingType_IMetInst != null)
	? (sharingType_IMetInst)
	: (sharingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long sharingType(){
			final com.apple.jobjc.Invoke.MsgSend sharingType_IMetInst = get_sharingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharingType_IMetInst.init(nativeBuffer, this);
		sharingType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsResizeIndicator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsResizeIndicator_IMetInst(){
		return ((showsResizeIndicator_IMetInst != null)
	? (showsResizeIndicator_IMetInst)
	: (showsResizeIndicator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsResizeIndicator", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsResizeIndicator(){
			final com.apple.jobjc.Invoke.MsgSend showsResizeIndicator_IMetInst = get_showsResizeIndicator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsResizeIndicator_IMetInst.init(nativeBuffer, this);
		showsResizeIndicator_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsToolbarButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsToolbarButton_IMetInst(){
		return ((showsToolbarButton_IMetInst != null)
	? (showsToolbarButton_IMetInst)
	: (showsToolbarButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsToolbarButton", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsToolbarButton(){
			final com.apple.jobjc.Invoke.MsgSend showsToolbarButton_IMetInst = get_showsToolbarButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsToolbarButton_IMetInst.init(nativeBuffer, this);
		showsToolbarButton_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardWindowButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardWindowButton_IMetInst(){
		return ((standardWindowButton_IMetInst != null)
	? (standardWindowButton_IMetInst)
	: (standardWindowButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardWindowButton:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSButton standardWindowButton(final long b){
			final com.apple.jobjc.Invoke.MsgSend standardWindowButton_IMetInst = get_standardWindowButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardWindowButton_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, b);
		standardWindowButton_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButton returnValue = (com.apple.jobjc.appkit.NSButton) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithSavedFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithSavedFrame_IMetInst(){
		return ((stringWithSavedFrame_IMetInst != null)
	? (stringWithSavedFrame_IMetInst)
	: (stringWithSavedFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithSavedFrame", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringWithSavedFrame(){
			final com.apple.jobjc.Invoke.MsgSend stringWithSavedFrame_IMetInst = get_stringWithSavedFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithSavedFrame_IMetInst.init(nativeBuffer, this);
		stringWithSavedFrame_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend styleMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_styleMask_IMetInst(){
		return ((styleMask_IMetInst != null)
	? (styleMask_IMetInst)
	: (styleMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "styleMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long styleMask(){
			final com.apple.jobjc.Invoke.MsgSend styleMask_IMetInst = get_styleMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		styleMask_IMetInst.init(nativeBuffer, this);
		styleMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend toggleFullScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleFullScreen_IMetInst(){
		return ((toggleFullScreen_IMetInst != null)
	? (toggleFullScreen_IMetInst)
	: (toggleFullScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleFullScreen:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleFullScreen(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleFullScreen_IMetInst = get_toggleFullScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleFullScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleFullScreen_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend toggleToolbarShown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleToolbarShown_IMetInst(){
		return ((toggleToolbarShown_IMetInst != null)
	? (toggleToolbarShown_IMetInst)
	: (toggleToolbarShown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleToolbarShown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleToolbarShown(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleToolbarShown_IMetInst = get_toggleToolbarShown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleToolbarShown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleToolbarShown_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tryToPerform_with_IMetInst(){
		return ((tryToPerform_with_IMetInst != null)
	? (tryToPerform_with_IMetInst)
	: (tryToPerform_with_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tryToPerform:with:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tryToPerform_with(final com.apple.jobjc.SEL anAction, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst = get_tryToPerform_with_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tryToPerform_with_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, anAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		tryToPerform_with_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unregisterDraggedTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unregisterDraggedTypes_IMetInst(){
		return ((unregisterDraggedTypes_IMetInst != null)
	? (unregisterDraggedTypes_IMetInst)
	: (unregisterDraggedTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unregisterDraggedTypes", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unregisterDraggedTypes(){
			final com.apple.jobjc.Invoke.MsgSend unregisterDraggedTypes_IMetInst = get_unregisterDraggedTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unregisterDraggedTypes_IMetInst.init(nativeBuffer, this);
		unregisterDraggedTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend update_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_update_IMetInst(){
		return ((update_IMetInst != null)
	? (update_IMetInst)
	: (update_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "update", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void update(){
			final com.apple.jobjc.Invoke.MsgSend update_IMetInst = get_update_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		update_IMetInst.init(nativeBuffer, this);
		update_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateConstraintsIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateConstraintsIfNeeded_IMetInst(){
		return ((updateConstraintsIfNeeded_IMetInst != null)
	? (updateConstraintsIfNeeded_IMetInst)
	: (updateConstraintsIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateConstraintsIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateConstraintsIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend updateConstraintsIfNeeded_IMetInst = get_updateConstraintsIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateConstraintsIfNeeded_IMetInst.init(nativeBuffer, this);
		updateConstraintsIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend useOptimizedDrawing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useOptimizedDrawing_IMetInst(){
		return ((useOptimizedDrawing_IMetInst != null)
	? (useOptimizedDrawing_IMetInst)
	: (useOptimizedDrawing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useOptimizedDrawing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void useOptimizedDrawing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend useOptimizedDrawing_IMetInst = get_useOptimizedDrawing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useOptimizedDrawing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		useOptimizedDrawing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userSpaceScaleFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userSpaceScaleFactor_IMetInst(){
		return ((userSpaceScaleFactor_IMetInst != null)
	? (userSpaceScaleFactor_IMetInst)
	: (userSpaceScaleFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userSpaceScaleFactor", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double userSpaceScaleFactor(){
			final com.apple.jobjc.Invoke.MsgSend userSpaceScaleFactor_IMetInst = get_userSpaceScaleFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userSpaceScaleFactor_IMetInst.init(nativeBuffer, this);
		userSpaceScaleFactor_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validRequestorForSendType_returnType_IMetInst(){
		return ((validRequestorForSendType_returnType_IMetInst != null)
	? (validRequestorForSendType_returnType_IMetInst)
	: (validRequestorForSendType_returnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validRequestorForSendType:returnType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T validRequestorForSendType_returnType(final com.apple.jobjc.foundation.NSString sendType, final com.apple.jobjc.foundation.NSString returnType){
			final com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst = get_validRequestorForSendType_returnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validRequestorForSendType_returnType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, returnType);
		validRequestorForSendType_returnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend viewsNeedDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewsNeedDisplay_IMetInst(){
		return ((viewsNeedDisplay_IMetInst != null)
	? (viewsNeedDisplay_IMetInst)
	: (viewsNeedDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewsNeedDisplay", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean viewsNeedDisplay(){
			final com.apple.jobjc.Invoke.MsgSend viewsNeedDisplay_IMetInst = get_viewsNeedDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewsNeedDisplay_IMetInst.init(nativeBuffer, this);
		viewsNeedDisplay_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend visualizeConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visualizeConstraints_IMetInst(){
		return ((visualizeConstraints_IMetInst != null)
	? (visualizeConstraints_IMetInst)
	: (visualizeConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visualizeConstraints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void visualizeConstraints(final com.apple.jobjc.foundation.NSArray constraints){
			final com.apple.jobjc.Invoke.MsgSend visualizeConstraints_IMetInst = get_visualizeConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visualizeConstraints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constraints);
		visualizeConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowController_IMetInst(){
		return ((windowController_IMetInst != null)
	? (windowController_IMetInst)
	: (windowController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T windowController(){
			final com.apple.jobjc.Invoke.MsgSend windowController_IMetInst = get_windowController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowController_IMetInst.init(nativeBuffer, this);
		windowController_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNumber_IMetInst(){
		return ((windowNumber_IMetInst != null)
	? (windowNumber_IMetInst)
	: (windowNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long windowNumber(){
			final com.apple.jobjc.Invoke.MsgSend windowNumber_IMetInst = get_windowNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNumber_IMetInst.init(nativeBuffer, this);
		windowNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowRef_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowRef_IMetInst(){
		return ((windowRef_IMetInst != null)
	? (windowRef_IMetInst)
	: (windowRef_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowRef", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<Void> windowRef(){
			final com.apple.jobjc.Invoke.MsgSend windowRef_IMetInst = get_windowRef_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowRef_IMetInst.init(nativeBuffer, this);
		windowRef_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<Void> returnValue = (com.apple.jobjc.Pointer<Void>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend zoom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_zoom_IMetInst(){
		return ((zoom_IMetInst != null)
	? (zoom_IMetInst)
	: (zoom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "zoom:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void zoom(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend zoom_IMetInst = get_zoom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		zoom_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		zoom_IMetInst.invoke(nativeBuffer);
		
		
	}

}
