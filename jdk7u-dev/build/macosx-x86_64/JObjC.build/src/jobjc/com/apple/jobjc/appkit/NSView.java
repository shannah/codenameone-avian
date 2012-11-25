package com.apple.jobjc.appkit;

public  class NSView extends com.apple.jobjc.appkit.NSResponder {
	public NSView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSView(final NSView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsFirstMouse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsFirstMouse_IMetInst(){
		return ((acceptsFirstMouse_IMetInst != null)
	? (acceptsFirstMouse_IMetInst)
	: (acceptsFirstMouse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsFirstMouse:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean acceptsFirstMouse(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend acceptsFirstMouse_IMetInst = get_acceptsFirstMouse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsFirstMouse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		acceptsFirstMouse_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend acceptsTouchEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsTouchEvents_IMetInst(){
		return ((acceptsTouchEvents_IMetInst != null)
	? (acceptsTouchEvents_IMetInst)
	: (acceptsTouchEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsTouchEvents", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsTouchEvents(){
			final com.apple.jobjc.Invoke.MsgSend acceptsTouchEvents_IMetInst = get_acceptsTouchEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsTouchEvents_IMetInst.init(nativeBuffer, this);
		acceptsTouchEvents_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addConstraint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addConstraint_IMetInst(){
		return ((addConstraint_IMetInst != null)
	? (addConstraint_IMetInst)
	: (addConstraint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addConstraint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addConstraint(final com.apple.jobjc.appkit.NSLayoutConstraint constraint){
			final com.apple.jobjc.Invoke.MsgSend addConstraint_IMetInst = get_addConstraint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addConstraint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constraint);
		addConstraint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addConstraints_IMetInst(){
		return ((addConstraints_IMetInst != null)
	? (addConstraints_IMetInst)
	: (addConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addConstraints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addConstraints(final com.apple.jobjc.foundation.NSArray constraints){
			final com.apple.jobjc.Invoke.MsgSend addConstraints_IMetInst = get_addConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addConstraints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constraints);
		addConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addCursorRect_cursor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addCursorRect_cursor_IMetInst(){
		return ((addCursorRect_cursor_IMetInst != null)
	? (addCursorRect_cursor_IMetInst)
	: (addCursorRect_cursor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addCursorRect:cursor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addCursorRect_cursor(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSCursor anObj){
			final com.apple.jobjc.Invoke.MsgSend addCursorRect_cursor_IMetInst = get_addCursorRect_cursor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addCursorRect_cursor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObj);
		addCursorRect_cursor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addSubview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSubview_IMetInst(){
		return ((addSubview_IMetInst != null)
	? (addSubview_IMetInst)
	: (addSubview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSubview:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addSubview(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend addSubview_IMetInst = get_addSubview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSubview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		addSubview_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addSubview_positioned_relativeTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSubview_positioned_relativeTo_IMetInst(){
		return ((addSubview_positioned_relativeTo_IMetInst != null)
	? (addSubview_positioned_relativeTo_IMetInst)
	: (addSubview_positioned_relativeTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSubview:positioned:relativeTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addSubview_positioned_relativeTo(final com.apple.jobjc.appkit.NSView aView, final long place, final com.apple.jobjc.appkit.NSView otherView){
			final com.apple.jobjc.Invoke.MsgSend addSubview_positioned_relativeTo_IMetInst = get_addSubview_positioned_relativeTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSubview_positioned_relativeTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, place);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherView);
		addSubview_positioned_relativeTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addToolTipRect_owner_userData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addToolTipRect_owner_userData_IMetInst(){
		return ((addToolTipRect_owner_userData_IMetInst != null)
	? (addToolTipRect_owner_userData_IMetInst)
	: (addToolTipRect_owner_userData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addToolTipRect:owner:userData:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long addToolTipRect_owner_userData(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.ID anObject, final com.apple.jobjc.Pointer<Void> data){
			final com.apple.jobjc.Invoke.MsgSend addToolTipRect_owner_userData_IMetInst = get_addToolTipRect_owner_userData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addToolTipRect_owner_userData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		addToolTipRect_owner_userData_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addTrackingArea_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTrackingArea_IMetInst(){
		return ((addTrackingArea_IMetInst != null)
	? (addTrackingArea_IMetInst)
	: (addTrackingArea_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTrackingArea:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTrackingArea(final com.apple.jobjc.appkit.NSTrackingArea trackingArea){
			final com.apple.jobjc.Invoke.MsgSend addTrackingArea_IMetInst = get_addTrackingArea_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTrackingArea_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trackingArea);
		addTrackingArea_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addTrackingRect_owner_userData_assumeInside_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTrackingRect_owner_userData_assumeInside_IMetInst(){
		return ((addTrackingRect_owner_userData_assumeInside_IMetInst != null)
	? (addTrackingRect_owner_userData_assumeInside_IMetInst)
	: (addTrackingRect_owner_userData_assumeInside_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTrackingRect:owner:userData:assumeInside:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public long addTrackingRect_owner_userData_assumeInside(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.ID anObject, final com.apple.jobjc.Pointer<Void> data, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend addTrackingRect_owner_userData_assumeInside_IMetInst = get_addTrackingRect_owner_userData_assumeInside_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTrackingRect_owner_userData_assumeInside_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		addTrackingRect_owner_userData_assumeInside_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend adjustPageHeightNew_top_bottom_limit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_adjustPageHeightNew_top_bottom_limit_IMetInst(){
		return ((adjustPageHeightNew_top_bottom_limit_IMetInst != null)
	? (adjustPageHeightNew_top_bottom_limit_IMetInst)
	: (adjustPageHeightNew_top_bottom_limit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "adjustPageHeightNew:top:bottom:limit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void adjustPageHeightNew_top_bottom_limit(final com.apple.jobjc.Pointer<java.lang.Double> newBottom, final double oldTop, final double oldBottom, final double bottomLimit){
			final com.apple.jobjc.Invoke.MsgSend adjustPageHeightNew_top_bottom_limit_IMetInst = get_adjustPageHeightNew_top_bottom_limit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		adjustPageHeightNew_top_bottom_limit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, newBottom);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, oldTop);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, oldBottom);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, bottomLimit);
		adjustPageHeightNew_top_bottom_limit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend adjustPageWidthNew_left_right_limit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_adjustPageWidthNew_left_right_limit_IMetInst(){
		return ((adjustPageWidthNew_left_right_limit_IMetInst != null)
	? (adjustPageWidthNew_left_right_limit_IMetInst)
	: (adjustPageWidthNew_left_right_limit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "adjustPageWidthNew:left:right:limit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void adjustPageWidthNew_left_right_limit(final com.apple.jobjc.Pointer<java.lang.Double> newRight, final double oldLeft, final double oldRight, final double rightLimit){
			final com.apple.jobjc.Invoke.MsgSend adjustPageWidthNew_left_right_limit_IMetInst = get_adjustPageWidthNew_left_right_limit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		adjustPageWidthNew_left_right_limit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, newRight);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, oldLeft);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, oldRight);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, rightLimit);
		adjustPageWidthNew_left_right_limit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend adjustScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_adjustScroll_IMetInst(){
		return ((adjustScroll_IMetInst != null)
	? (adjustScroll_IMetInst)
	: (adjustScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "adjustScroll:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect adjustScroll(final com.apple.jobjc.foundation.NSRect newVisible){
			final com.apple.jobjc.Invoke.MsgSend adjustScroll_IMetInst = get_adjustScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		adjustScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, newVisible);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		adjustScroll_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alignmentRectForFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignmentRectForFrame_IMetInst(){
		return ((alignmentRectForFrame_IMetInst != null)
	? (alignmentRectForFrame_IMetInst)
	: (alignmentRectForFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignmentRectForFrame:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect alignmentRectForFrame(final com.apple.jobjc.foundation.NSRect frame){
			final com.apple.jobjc.Invoke.MsgSend alignmentRectForFrame_IMetInst = get_alignmentRectForFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignmentRectForFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frame);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		alignmentRectForFrame_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alignmentRectInsets_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignmentRectInsets_IMetInst(){
		return ((alignmentRectInsets_IMetInst != null)
	? (alignmentRectInsets_IMetInst)
	: (alignmentRectInsets_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignmentRectInsets", com.apple.jobjc.appkit.NSEdgeInsets.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSEdgeInsets alignmentRectInsets(){
			final com.apple.jobjc.Invoke.MsgSend alignmentRectInsets_IMetInst = get_alignmentRectInsets_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignmentRectInsets_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.appkit.NSEdgeInsets returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).AppKit().makeNSEdgeInsets();
		alignmentRectInsets_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allocateGState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allocateGState_IMetInst(){
		return ((allocateGState_IMetInst != null)
	? (allocateGState_IMetInst)
	: (allocateGState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allocateGState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void allocateGState(){
			final com.apple.jobjc.Invoke.MsgSend allocateGState_IMetInst = get_allocateGState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allocateGState_IMetInst.init(nativeBuffer, this);
		allocateGState_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend ancestorSharedWithView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ancestorSharedWithView_IMetInst(){
		return ((ancestorSharedWithView_IMetInst != null)
	? (ancestorSharedWithView_IMetInst)
	: (ancestorSharedWithView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ancestorSharedWithView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView ancestorSharedWithView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend ancestorSharedWithView_IMetInst = get_ancestorSharedWithView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ancestorSharedWithView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		ancestorSharedWithView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoresizesSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoresizesSubviews_IMetInst(){
		return ((autoresizesSubviews_IMetInst != null)
	? (autoresizesSubviews_IMetInst)
	: (autoresizesSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoresizesSubviews", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autoresizesSubviews(){
			final com.apple.jobjc.Invoke.MsgSend autoresizesSubviews_IMetInst = get_autoresizesSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoresizesSubviews_IMetInst.init(nativeBuffer, this);
		autoresizesSubviews_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoresizingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoresizingMask_IMetInst(){
		return ((autoresizingMask_IMetInst != null)
	? (autoresizingMask_IMetInst)
	: (autoresizingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoresizingMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long autoresizingMask(){
			final com.apple.jobjc.Invoke.MsgSend autoresizingMask_IMetInst = get_autoresizingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoresizingMask_IMetInst.init(nativeBuffer, this);
		autoresizingMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoscroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoscroll_IMetInst(){
		return ((autoscroll_IMetInst != null)
	? (autoscroll_IMetInst)
	: (autoscroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoscroll:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean autoscroll(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend autoscroll_IMetInst = get_autoscroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoscroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		autoscroll_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundFilters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundFilters_IMetInst(){
		return ((backgroundFilters_IMetInst != null)
	? (backgroundFilters_IMetInst)
	: (backgroundFilters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundFilters", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray backgroundFilters(){
			final com.apple.jobjc.Invoke.MsgSend backgroundFilters_IMetInst = get_backgroundFilters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundFilters_IMetInst.init(nativeBuffer, this);
		backgroundFilters_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend baselineOffsetFromBottom_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baselineOffsetFromBottom_IMetInst(){
		return ((baselineOffsetFromBottom_IMetInst != null)
	? (baselineOffsetFromBottom_IMetInst)
	: (baselineOffsetFromBottom_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baselineOffsetFromBottom", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double baselineOffsetFromBottom(){
			final com.apple.jobjc.Invoke.MsgSend baselineOffsetFromBottom_IMetInst = get_baselineOffsetFromBottom_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baselineOffsetFromBottom_IMetInst.init(nativeBuffer, this);
		baselineOffsetFromBottom_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginDocument_IMetInst(){
		return ((beginDocument_IMetInst != null)
	? (beginDocument_IMetInst)
	: (beginDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginDocument", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginDocument(){
			final com.apple.jobjc.Invoke.MsgSend beginDocument_IMetInst = get_beginDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginDocument_IMetInst.init(nativeBuffer, this);
		beginDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginDraggingSessionWithItems_event_source_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginDraggingSessionWithItems_event_source_IMetInst(){
		return ((beginDraggingSessionWithItems_event_source_IMetInst != null)
	? (beginDraggingSessionWithItems_event_source_IMetInst)
	: (beginDraggingSessionWithItems_event_source_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginDraggingSessionWithItems:event:source:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSDraggingSession beginDraggingSessionWithItems_event_source(final com.apple.jobjc.foundation.NSArray items, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.ID source){
			final com.apple.jobjc.Invoke.MsgSend beginDraggingSessionWithItems_event_source_IMetInst = get_beginDraggingSessionWithItems_event_source_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginDraggingSessionWithItems_event_source_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, items);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, source);
		beginDraggingSessionWithItems_event_source_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSDraggingSession returnValue = (com.apple.jobjc.appkit.NSDraggingSession) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginPageInRect_atPlacement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginPageInRect_atPlacement_IMetInst(){
		return ((beginPageInRect_atPlacement_IMetInst != null)
	? (beginPageInRect_atPlacement_IMetInst)
	: (beginPageInRect_atPlacement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginPageInRect:atPlacement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void beginPageInRect_atPlacement(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSPoint location){
			final com.apple.jobjc.Invoke.MsgSend beginPageInRect_atPlacement_IMetInst = get_beginPageInRect_atPlacement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginPageInRect_atPlacement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		beginPageInRect_atPlacement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend bitmapImageRepForCachingDisplayInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bitmapImageRepForCachingDisplayInRect_IMetInst(){
		return ((bitmapImageRepForCachingDisplayInRect_IMetInst != null)
	? (bitmapImageRepForCachingDisplayInRect_IMetInst)
	: (bitmapImageRepForCachingDisplayInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bitmapImageRepForCachingDisplayInRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSBitmapImageRep bitmapImageRepForCachingDisplayInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend bitmapImageRepForCachingDisplayInRect_IMetInst = get_bitmapImageRepForCachingDisplayInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bitmapImageRepForCachingDisplayInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		bitmapImageRepForCachingDisplayInRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSBitmapImageRep returnValue = (com.apple.jobjc.appkit.NSBitmapImageRep) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bounds_IMetInst(){
		return ((bounds_IMetInst != null)
	? (bounds_IMetInst)
	: (bounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect bounds(){
			final com.apple.jobjc.Invoke.MsgSend bounds_IMetInst = get_bounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		bounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundsRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundsRotation_IMetInst(){
		return ((boundsRotation_IMetInst != null)
	? (boundsRotation_IMetInst)
	: (boundsRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundsRotation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double boundsRotation(){
			final com.apple.jobjc.Invoke.MsgSend boundsRotation_IMetInst = get_boundsRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundsRotation_IMetInst.init(nativeBuffer, this);
		boundsRotation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cacheDisplayInRect_toBitmapImageRep_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cacheDisplayInRect_toBitmapImageRep_IMetInst(){
		return ((cacheDisplayInRect_toBitmapImageRep_IMetInst != null)
	? (cacheDisplayInRect_toBitmapImageRep_IMetInst)
	: (cacheDisplayInRect_toBitmapImageRep_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cacheDisplayInRect:toBitmapImageRep:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cacheDisplayInRect_toBitmapImageRep(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSBitmapImageRep bitmapImageRep){
			final com.apple.jobjc.Invoke.MsgSend cacheDisplayInRect_toBitmapImageRep_IMetInst = get_cacheDisplayInRect_toBitmapImageRep_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cacheDisplayInRect_toBitmapImageRep_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bitmapImageRep);
		cacheDisplayInRect_toBitmapImageRep_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canBecomeKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canBecomeKeyView_IMetInst(){
		return ((canBecomeKeyView_IMetInst != null)
	? (canBecomeKeyView_IMetInst)
	: (canBecomeKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canBecomeKeyView", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canBecomeKeyView(){
			final com.apple.jobjc.Invoke.MsgSend canBecomeKeyView_IMetInst = get_canBecomeKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canBecomeKeyView_IMetInst.init(nativeBuffer, this);
		canBecomeKeyView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canDraw_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canDraw_IMetInst(){
		return ((canDraw_IMetInst != null)
	? (canDraw_IMetInst)
	: (canDraw_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canDraw", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canDraw(){
			final com.apple.jobjc.Invoke.MsgSend canDraw_IMetInst = get_canDraw_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canDraw_IMetInst.init(nativeBuffer, this);
		canDraw_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canDrawConcurrently_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canDrawConcurrently_IMetInst(){
		return ((canDrawConcurrently_IMetInst != null)
	? (canDrawConcurrently_IMetInst)
	: (canDrawConcurrently_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canDrawConcurrently", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canDrawConcurrently(){
			final com.apple.jobjc.Invoke.MsgSend canDrawConcurrently_IMetInst = get_canDrawConcurrently_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canDrawConcurrently_IMetInst.init(nativeBuffer, this);
		canDrawConcurrently_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend centerScanRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_centerScanRect_IMetInst(){
		return ((centerScanRect_IMetInst != null)
	? (centerScanRect_IMetInst)
	: (centerScanRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "centerScanRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect centerScanRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend centerScanRect_IMetInst = get_centerScanRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		centerScanRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		centerScanRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compositingFilter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compositingFilter_IMetInst(){
		return ((compositingFilter_IMetInst != null)
	? (compositingFilter_IMetInst)
	: (compositingFilter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compositingFilter", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CIFilter* (@, @) */ compositingFilter(){
			final com.apple.jobjc.Invoke.MsgSend compositingFilter_IMetInst = get_compositingFilter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compositingFilter_IMetInst.init(nativeBuffer, this);
		compositingFilter_IMetInst.invoke(nativeBuffer);
		final Object /* CIFilter* (@, @) */ returnValue = (Object /* CIFilter* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend constraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constraints_IMetInst(){
		return ((constraints_IMetInst != null)
	? (constraints_IMetInst)
	: (constraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constraints", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray constraints(){
			final com.apple.jobjc.Invoke.MsgSend constraints_IMetInst = get_constraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constraints_IMetInst.init(nativeBuffer, this);
		constraints_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend constraintsAffectingLayoutForOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constraintsAffectingLayoutForOrientation_IMetInst(){
		return ((constraintsAffectingLayoutForOrientation_IMetInst != null)
	? (constraintsAffectingLayoutForOrientation_IMetInst)
	: (constraintsAffectingLayoutForOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constraintsAffectingLayoutForOrientation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray constraintsAffectingLayoutForOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend constraintsAffectingLayoutForOrientation_IMetInst = get_constraintsAffectingLayoutForOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constraintsAffectingLayoutForOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		constraintsAffectingLayoutForOrientation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentCompressionResistancePriorityForOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentCompressionResistancePriorityForOrientation_IMetInst(){
		return ((contentCompressionResistancePriorityForOrientation_IMetInst != null)
	? (contentCompressionResistancePriorityForOrientation_IMetInst)
	: (contentCompressionResistancePriorityForOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentCompressionResistancePriorityForOrientation:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public float contentCompressionResistancePriorityForOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend contentCompressionResistancePriorityForOrientation_IMetInst = get_contentCompressionResistancePriorityForOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentCompressionResistancePriorityForOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		contentCompressionResistancePriorityForOrientation_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentFilters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentFilters_IMetInst(){
		return ((contentFilters_IMetInst != null)
	? (contentFilters_IMetInst)
	: (contentFilters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentFilters", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray contentFilters(){
			final com.apple.jobjc.Invoke.MsgSend contentFilters_IMetInst = get_contentFilters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentFilters_IMetInst.init(nativeBuffer, this);
		contentFilters_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentHuggingPriorityForOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentHuggingPriorityForOrientation_IMetInst(){
		return ((contentHuggingPriorityForOrientation_IMetInst != null)
	? (contentHuggingPriorityForOrientation_IMetInst)
	: (contentHuggingPriorityForOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentHuggingPriorityForOrientation:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public float contentHuggingPriorityForOrientation(final long orientation){
			final com.apple.jobjc.Invoke.MsgSend contentHuggingPriorityForOrientation_IMetInst = get_contentHuggingPriorityForOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentHuggingPriorityForOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		contentHuggingPriorityForOrientation_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPoint_fromView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPoint_fromView_IMetInst(){
		return ((convertPoint_fromView_IMetInst != null)
	? (convertPoint_fromView_IMetInst)
	: (convertPoint_fromView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPoint:fromView:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPoint_fromView(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertPoint_fromView_IMetInst = get_convertPoint_fromView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPoint_fromView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPoint_fromView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPoint_toView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPoint_toView_IMetInst(){
		return ((convertPoint_toView_IMetInst != null)
	? (convertPoint_toView_IMetInst)
	: (convertPoint_toView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPoint:toView:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPoint_toView(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertPoint_toView_IMetInst = get_convertPoint_toView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPoint_toView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPoint_toView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointFromBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointFromBacking_IMetInst(){
		return ((convertPointFromBacking_IMetInst != null)
	? (convertPointFromBacking_IMetInst)
	: (convertPointFromBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointFromBacking:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointFromBacking(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointFromBacking_IMetInst = get_convertPointFromBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointFromBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointFromBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointFromBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointFromBase_IMetInst(){
		return ((convertPointFromBase_IMetInst != null)
	? (convertPointFromBase_IMetInst)
	: (convertPointFromBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointFromBase:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointFromBase(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointFromBase_IMetInst = get_convertPointFromBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointFromBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointFromBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointFromLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointFromLayer_IMetInst(){
		return ((convertPointFromLayer_IMetInst != null)
	? (convertPointFromLayer_IMetInst)
	: (convertPointFromLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointFromLayer:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointFromLayer(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointFromLayer_IMetInst = get_convertPointFromLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointFromLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointFromLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointToBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointToBacking_IMetInst(){
		return ((convertPointToBacking_IMetInst != null)
	? (convertPointToBacking_IMetInst)
	: (convertPointToBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointToBacking:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointToBacking(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointToBacking_IMetInst = get_convertPointToBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointToBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointToBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointToBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointToBase_IMetInst(){
		return ((convertPointToBase_IMetInst != null)
	? (convertPointToBase_IMetInst)
	: (convertPointToBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointToBase:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointToBase(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointToBase_IMetInst = get_convertPointToBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointToBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointToBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertPointToLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertPointToLayer_IMetInst(){
		return ((convertPointToLayer_IMetInst != null)
	? (convertPointToLayer_IMetInst)
	: (convertPointToLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertPointToLayer:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint convertPointToLayer(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend convertPointToLayer_IMetInst = get_convertPointToLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertPointToLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		convertPointToLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRect_fromView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRect_fromView_IMetInst(){
		return ((convertRect_fromView_IMetInst != null)
	? (convertRect_fromView_IMetInst)
	: (convertRect_fromView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRect:fromView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect convertRect_fromView(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertRect_fromView_IMetInst = get_convertRect_fromView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRect_fromView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRect_fromView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRect_toView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRect_toView_IMetInst(){
		return ((convertRect_toView_IMetInst != null)
	? (convertRect_toView_IMetInst)
	: (convertRect_toView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRect:toView:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect convertRect_toView(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertRect_toView_IMetInst = get_convertRect_toView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRect_toView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRect_toView_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend convertRectFromBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectFromBase_IMetInst(){
		return ((convertRectFromBase_IMetInst != null)
	? (convertRectFromBase_IMetInst)
	: (convertRectFromBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectFromBase:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectFromBase(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectFromBase_IMetInst = get_convertRectFromBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectFromBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectFromBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectFromLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectFromLayer_IMetInst(){
		return ((convertRectFromLayer_IMetInst != null)
	? (convertRectFromLayer_IMetInst)
	: (convertRectFromLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectFromLayer:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectFromLayer(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectFromLayer_IMetInst = get_convertRectFromLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectFromLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectFromLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend convertRectToBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectToBase_IMetInst(){
		return ((convertRectToBase_IMetInst != null)
	? (convertRectToBase_IMetInst)
	: (convertRectToBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectToBase:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectToBase(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectToBase_IMetInst = get_convertRectToBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectToBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectToBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertRectToLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertRectToLayer_IMetInst(){
		return ((convertRectToLayer_IMetInst != null)
	? (convertRectToLayer_IMetInst)
	: (convertRectToLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertRectToLayer:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect convertRectToLayer(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend convertRectToLayer_IMetInst = get_convertRectToLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertRectToLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		convertRectToLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSize_fromView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSize_fromView_IMetInst(){
		return ((convertSize_fromView_IMetInst != null)
	? (convertSize_fromView_IMetInst)
	: (convertSize_fromView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSize:fromView:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize convertSize_fromView(final com.apple.jobjc.foundation.NSSize aSize, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertSize_fromView_IMetInst = get_convertSize_fromView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSize_fromView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSize_fromView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSize_toView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSize_toView_IMetInst(){
		return ((convertSize_toView_IMetInst != null)
	? (convertSize_toView_IMetInst)
	: (convertSize_toView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSize:toView:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize convertSize_toView(final com.apple.jobjc.foundation.NSSize aSize, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend convertSize_toView_IMetInst = get_convertSize_toView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSize_toView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSize_toView_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeFromBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeFromBacking_IMetInst(){
		return ((convertSizeFromBacking_IMetInst != null)
	? (convertSizeFromBacking_IMetInst)
	: (convertSizeFromBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeFromBacking:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeFromBacking(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeFromBacking_IMetInst = get_convertSizeFromBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeFromBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeFromBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeFromBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeFromBase_IMetInst(){
		return ((convertSizeFromBase_IMetInst != null)
	? (convertSizeFromBase_IMetInst)
	: (convertSizeFromBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeFromBase:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeFromBase(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeFromBase_IMetInst = get_convertSizeFromBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeFromBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeFromBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeFromLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeFromLayer_IMetInst(){
		return ((convertSizeFromLayer_IMetInst != null)
	? (convertSizeFromLayer_IMetInst)
	: (convertSizeFromLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeFromLayer:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeFromLayer(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeFromLayer_IMetInst = get_convertSizeFromLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeFromLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeFromLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeToBacking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeToBacking_IMetInst(){
		return ((convertSizeToBacking_IMetInst != null)
	? (convertSizeToBacking_IMetInst)
	: (convertSizeToBacking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeToBacking:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeToBacking(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeToBacking_IMetInst = get_convertSizeToBacking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeToBacking_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeToBacking_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeToBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeToBase_IMetInst(){
		return ((convertSizeToBase_IMetInst != null)
	? (convertSizeToBase_IMetInst)
	: (convertSizeToBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeToBase:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeToBase(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeToBase_IMetInst = get_convertSizeToBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeToBase_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeToBase_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertSizeToLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertSizeToLayer_IMetInst(){
		return ((convertSizeToLayer_IMetInst != null)
	? (convertSizeToLayer_IMetInst)
	: (convertSizeToLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertSizeToLayer:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize convertSizeToLayer(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend convertSizeToLayer_IMetInst = get_convertSizeToLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertSizeToLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		convertSizeToLayer_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend didAddSubview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_didAddSubview_IMetInst(){
		return ((didAddSubview_IMetInst != null)
	? (didAddSubview_IMetInst)
	: (didAddSubview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "didAddSubview:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void didAddSubview(final com.apple.jobjc.appkit.NSView subview){
			final com.apple.jobjc.Invoke.MsgSend didAddSubview_IMetInst = get_didAddSubview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		didAddSubview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subview);
		didAddSubview_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend displayIfNeededIgnoringOpacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayIfNeededIgnoringOpacity_IMetInst(){
		return ((displayIfNeededIgnoringOpacity_IMetInst != null)
	? (displayIfNeededIgnoringOpacity_IMetInst)
	: (displayIfNeededIgnoringOpacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayIfNeededIgnoringOpacity", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void displayIfNeededIgnoringOpacity(){
			final com.apple.jobjc.Invoke.MsgSend displayIfNeededIgnoringOpacity_IMetInst = get_displayIfNeededIgnoringOpacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayIfNeededIgnoringOpacity_IMetInst.init(nativeBuffer, this);
		displayIfNeededIgnoringOpacity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayIfNeededInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayIfNeededInRect_IMetInst(){
		return ((displayIfNeededInRect_IMetInst != null)
	? (displayIfNeededInRect_IMetInst)
	: (displayIfNeededInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayIfNeededInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void displayIfNeededInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend displayIfNeededInRect_IMetInst = get_displayIfNeededInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayIfNeededInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		displayIfNeededInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayIfNeededInRectIgnoringOpacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayIfNeededInRectIgnoringOpacity_IMetInst(){
		return ((displayIfNeededInRectIgnoringOpacity_IMetInst != null)
	? (displayIfNeededInRectIgnoringOpacity_IMetInst)
	: (displayIfNeededInRectIgnoringOpacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayIfNeededInRectIgnoringOpacity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void displayIfNeededInRectIgnoringOpacity(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend displayIfNeededInRectIgnoringOpacity_IMetInst = get_displayIfNeededInRectIgnoringOpacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayIfNeededInRectIgnoringOpacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		displayIfNeededInRectIgnoringOpacity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayRect_IMetInst(){
		return ((displayRect_IMetInst != null)
	? (displayRect_IMetInst)
	: (displayRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void displayRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend displayRect_IMetInst = get_displayRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		displayRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayRectIgnoringOpacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayRectIgnoringOpacity_IMetInst(){
		return ((displayRectIgnoringOpacity_IMetInst != null)
	? (displayRectIgnoringOpacity_IMetInst)
	: (displayRectIgnoringOpacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayRectIgnoringOpacity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void displayRectIgnoringOpacity(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend displayRectIgnoringOpacity_IMetInst = get_displayRectIgnoringOpacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayRectIgnoringOpacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		displayRectIgnoringOpacity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayRectIgnoringOpacity_inContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayRectIgnoringOpacity_inContext_IMetInst(){
		return ((displayRectIgnoringOpacity_inContext_IMetInst != null)
	? (displayRectIgnoringOpacity_inContext_IMetInst)
	: (displayRectIgnoringOpacity_inContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayRectIgnoringOpacity:inContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void displayRectIgnoringOpacity_inContext(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSGraphicsContext context){
			final com.apple.jobjc.Invoke.MsgSend displayRectIgnoringOpacity_inContext_IMetInst = get_displayRectIgnoringOpacity_inContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayRectIgnoringOpacity_inContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		displayRectIgnoringOpacity_inContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dragFile_fromRect_slideBack_event_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragFile_fromRect_slideBack_event_IMetInst(){
		return ((dragFile_fromRect_slideBack_event_IMetInst != null)
	? (dragFile_fromRect_slideBack_event_IMetInst)
	: (dragFile_fromRect_slideBack_event_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragFile:fromRect:slideBack:event:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean dragFile_fromRect_slideBack_event(final com.apple.jobjc.foundation.NSString filename, final com.apple.jobjc.foundation.NSRect rect, final boolean aFlag, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend dragFile_fromRect_slideBack_event_IMetInst = get_dragFile_fromRect_slideBack_event_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragFile_fromRect_slideBack_event_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, aFlag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		dragFile_fromRect_slideBack_event_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst(){
		return ((dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst != null)
	? (dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst)
	: (dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragImage:at:offset:event:pasteboard:source:slideBack:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void dragImage_at_offset_event_pasteboard_source_slideBack(final com.apple.jobjc.appkit.NSImage anImage, final com.apple.jobjc.foundation.NSPoint viewLocation, final com.apple.jobjc.foundation.NSSize initialOffset, final com.apple.jobjc.appkit.NSEvent event, final com.apple.jobjc.appkit.NSPasteboard pboard, final com.apple.jobjc.ID sourceObj, final boolean slideFlag){
			final com.apple.jobjc.Invoke.MsgSend dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst = get_dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anImage);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, viewLocation);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, initialOffset);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sourceObj);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, slideFlag);
		dragImage_at_offset_event_pasteboard_source_slideBack_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst(){
		return ((dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst != null)
	? (dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst)
	: (dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragPromisedFilesOfTypes:fromRect:source:slideBack:event:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean dragPromisedFilesOfTypes_fromRect_source_slideBack_event(final com.apple.jobjc.foundation.NSArray typeArray, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.ID sourceObject, final boolean aFlag, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst = get_dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeArray);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sourceObject);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, aFlag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		dragPromisedFilesOfTypes_fromRect_source_slideBack_event_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawFocusRingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawFocusRingMask_IMetInst(){
		return ((drawFocusRingMask_IMetInst != null)
	? (drawFocusRingMask_IMetInst)
	: (drawFocusRingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawFocusRingMask", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void drawFocusRingMask(){
			final com.apple.jobjc.Invoke.MsgSend drawFocusRingMask_IMetInst = get_drawFocusRingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawFocusRingMask_IMetInst.init(nativeBuffer, this);
		drawFocusRingMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawPageBorderWithSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawPageBorderWithSize_IMetInst(){
		return ((drawPageBorderWithSize_IMetInst != null)
	? (drawPageBorderWithSize_IMetInst)
	: (drawPageBorderWithSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawPageBorderWithSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void drawPageBorderWithSize(final com.apple.jobjc.foundation.NSSize borderSize){
			final com.apple.jobjc.Invoke.MsgSend drawPageBorderWithSize_IMetInst = get_drawPageBorderWithSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawPageBorderWithSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, borderSize);
		drawPageBorderWithSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawRect_IMetInst(){
		return ((drawRect_IMetInst != null)
	? (drawRect_IMetInst)
	: (drawRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawRect(final com.apple.jobjc.foundation.NSRect dirtyRect){
			final com.apple.jobjc.Invoke.MsgSend drawRect_IMetInst = get_drawRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, dirtyRect);
		drawRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawSheetBorderWithSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSheetBorderWithSize_IMetInst(){
		return ((drawSheetBorderWithSize_IMetInst != null)
	? (drawSheetBorderWithSize_IMetInst)
	: (drawSheetBorderWithSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSheetBorderWithSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void drawSheetBorderWithSize(final com.apple.jobjc.foundation.NSSize borderSize){
			final com.apple.jobjc.Invoke.MsgSend drawSheetBorderWithSize_IMetInst = get_drawSheetBorderWithSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSheetBorderWithSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, borderSize);
		drawSheetBorderWithSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enclosingMenuItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enclosingMenuItem_IMetInst(){
		return ((enclosingMenuItem_IMetInst != null)
	? (enclosingMenuItem_IMetInst)
	: (enclosingMenuItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enclosingMenuItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem enclosingMenuItem(){
			final com.apple.jobjc.Invoke.MsgSend enclosingMenuItem_IMetInst = get_enclosingMenuItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enclosingMenuItem_IMetInst.init(nativeBuffer, this);
		enclosingMenuItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enclosingScrollView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enclosingScrollView_IMetInst(){
		return ((enclosingScrollView_IMetInst != null)
	? (enclosingScrollView_IMetInst)
	: (enclosingScrollView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enclosingScrollView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScrollView enclosingScrollView(){
			final com.apple.jobjc.Invoke.MsgSend enclosingScrollView_IMetInst = get_enclosingScrollView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enclosingScrollView_IMetInst.init(nativeBuffer, this);
		enclosingScrollView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScrollView returnValue = (com.apple.jobjc.appkit.NSScrollView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endDocument_IMetInst(){
		return ((endDocument_IMetInst != null)
	? (endDocument_IMetInst)
	: (endDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endDocument", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endDocument(){
			final com.apple.jobjc.Invoke.MsgSend endDocument_IMetInst = get_endDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endDocument_IMetInst.init(nativeBuffer, this);
		endDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endPage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endPage_IMetInst(){
		return ((endPage_IMetInst != null)
	? (endPage_IMetInst)
	: (endPage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endPage", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endPage(){
			final com.apple.jobjc.Invoke.MsgSend endPage_IMetInst = get_endPage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endPage_IMetInst.init(nativeBuffer, this);
		endPage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enterFullScreenMode_withOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enterFullScreenMode_withOptions_IMetInst(){
		return ((enterFullScreenMode_withOptions_IMetInst != null)
	? (enterFullScreenMode_withOptions_IMetInst)
	: (enterFullScreenMode_withOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enterFullScreenMode:withOptions:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean enterFullScreenMode_withOptions(final com.apple.jobjc.appkit.NSScreen screen, final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend enterFullScreenMode_withOptions_IMetInst = get_enterFullScreenMode_withOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enterFullScreenMode_withOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		enterFullScreenMode_withOptions_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend exerciseAmbiguityInLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exerciseAmbiguityInLayout_IMetInst(){
		return ((exerciseAmbiguityInLayout_IMetInst != null)
	? (exerciseAmbiguityInLayout_IMetInst)
	: (exerciseAmbiguityInLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exerciseAmbiguityInLayout", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void exerciseAmbiguityInLayout(){
			final com.apple.jobjc.Invoke.MsgSend exerciseAmbiguityInLayout_IMetInst = get_exerciseAmbiguityInLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exerciseAmbiguityInLayout_IMetInst.init(nativeBuffer, this);
		exerciseAmbiguityInLayout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend exitFullScreenModeWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_exitFullScreenModeWithOptions_IMetInst(){
		return ((exitFullScreenModeWithOptions_IMetInst != null)
	? (exitFullScreenModeWithOptions_IMetInst)
	: (exitFullScreenModeWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "exitFullScreenModeWithOptions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void exitFullScreenModeWithOptions(final com.apple.jobjc.foundation.NSDictionary options){
			final com.apple.jobjc.Invoke.MsgSend exitFullScreenModeWithOptions_IMetInst = get_exitFullScreenModeWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		exitFullScreenModeWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		exitFullScreenModeWithOptions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fittingSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fittingSize_IMetInst(){
		return ((fittingSize_IMetInst != null)
	? (fittingSize_IMetInst)
	: (fittingSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fittingSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize fittingSize(){
			final com.apple.jobjc.Invoke.MsgSend fittingSize_IMetInst = get_fittingSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fittingSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		fittingSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend focusRingMaskBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusRingMaskBounds_IMetInst(){
		return ((focusRingMaskBounds_IMetInst != null)
	? (focusRingMaskBounds_IMetInst)
	: (focusRingMaskBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusRingMaskBounds", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect focusRingMaskBounds(){
			final com.apple.jobjc.Invoke.MsgSend focusRingMaskBounds_IMetInst = get_focusRingMaskBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusRingMaskBounds_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		focusRingMaskBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend focusRingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusRingType_IMetInst(){
		return ((focusRingType_IMetInst != null)
	? (focusRingType_IMetInst)
	: (focusRingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusRingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long focusRingType(){
			final com.apple.jobjc.Invoke.MsgSend focusRingType_IMetInst = get_focusRingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusRingType_IMetInst.init(nativeBuffer, this);
		focusRingType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend frameCenterRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameCenterRotation_IMetInst(){
		return ((frameCenterRotation_IMetInst != null)
	? (frameCenterRotation_IMetInst)
	: (frameCenterRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameCenterRotation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double frameCenterRotation(){
			final com.apple.jobjc.Invoke.MsgSend frameCenterRotation_IMetInst = get_frameCenterRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameCenterRotation_IMetInst.init(nativeBuffer, this);
		frameCenterRotation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameForAlignmentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameForAlignmentRect_IMetInst(){
		return ((frameForAlignmentRect_IMetInst != null)
	? (frameForAlignmentRect_IMetInst)
	: (frameForAlignmentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameForAlignmentRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect frameForAlignmentRect(final com.apple.jobjc.foundation.NSRect alignmentRect){
			final com.apple.jobjc.Invoke.MsgSend frameForAlignmentRect_IMetInst = get_frameForAlignmentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameForAlignmentRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, alignmentRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameForAlignmentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameRotation_IMetInst(){
		return ((frameRotation_IMetInst != null)
	? (frameRotation_IMetInst)
	: (frameRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameRotation", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double frameRotation(){
			final com.apple.jobjc.Invoke.MsgSend frameRotation_IMetInst = get_frameRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameRotation_IMetInst.init(nativeBuffer, this);
		frameRotation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend getRectsBeingDrawn_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRectsBeingDrawn_count_IMetInst(){
		return ((getRectsBeingDrawn_count_IMetInst != null)
	? (getRectsBeingDrawn_count_IMetInst)
	: (getRectsBeingDrawn_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRectsBeingDrawn:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getRectsBeingDrawn_count(final com.apple.jobjc.Pointer<com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect>> rects, final com.apple.jobjc.Pointer<java.lang.Long> count){
			final com.apple.jobjc.Invoke.MsgSend getRectsBeingDrawn_count_IMetInst = get_getRectsBeingDrawn_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRectsBeingDrawn_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		getRectsBeingDrawn_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getRectsExposedDuringLiveResize_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRectsExposedDuringLiveResize_count_IMetInst(){
		return ((getRectsExposedDuringLiveResize_count_IMetInst != null)
	? (getRectsExposedDuringLiveResize_count_IMetInst)
	: (getRectsExposedDuringLiveResize_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRectsExposedDuringLiveResize:count:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getRectsExposedDuringLiveResize_count(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRect> exposedRects, final com.apple.jobjc.Pointer<java.lang.Long> count){
			final com.apple.jobjc.Invoke.MsgSend getRectsExposedDuringLiveResize_count_IMetInst = get_getRectsExposedDuringLiveResize_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRectsExposedDuringLiveResize_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, exposedRects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		getRectsExposedDuringLiveResize_count_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hasAmbiguousLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasAmbiguousLayout_IMetInst(){
		return ((hasAmbiguousLayout_IMetInst != null)
	? (hasAmbiguousLayout_IMetInst)
	: (hasAmbiguousLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasAmbiguousLayout", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasAmbiguousLayout(){
			final com.apple.jobjc.Invoke.MsgSend hasAmbiguousLayout_IMetInst = get_hasAmbiguousLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasAmbiguousLayout_IMetInst.init(nativeBuffer, this);
		hasAmbiguousLayout_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend heightAdjustLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_heightAdjustLimit_IMetInst(){
		return ((heightAdjustLimit_IMetInst != null)
	? (heightAdjustLimit_IMetInst)
	: (heightAdjustLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "heightAdjustLimit", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double heightAdjustLimit(){
			final com.apple.jobjc.Invoke.MsgSend heightAdjustLimit_IMetInst = get_heightAdjustLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		heightAdjustLimit_IMetInst.init(nativeBuffer, this);
		heightAdjustLimit_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hitTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hitTest_IMetInst(){
		return ((hitTest_IMetInst != null)
	? (hitTest_IMetInst)
	: (hitTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hitTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.appkit.NSView hitTest(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend hitTest_IMetInst = get_hitTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hitTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		hitTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_IMetInst(){
		return ((initWithFrame_IMetInst != null)
	? (initWithFrame_IMetInst)
	: (initWithFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame(final com.apple.jobjc.foundation.NSRect frameRect){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst = get_initWithFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		initWithFrame_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend inputContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_inputContext_IMetInst(){
		return ((inputContext_IMetInst != null)
	? (inputContext_IMetInst)
	: (inputContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "inputContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextInputContext inputContext(){
			final com.apple.jobjc.Invoke.MsgSend inputContext_IMetInst = get_inputContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		inputContext_IMetInst.init(nativeBuffer, this);
		inputContext_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextInputContext returnValue = (com.apple.jobjc.appkit.NSTextInputContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intrinsicContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intrinsicContentSize_IMetInst(){
		return ((intrinsicContentSize_IMetInst != null)
	? (intrinsicContentSize_IMetInst)
	: (intrinsicContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intrinsicContentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize intrinsicContentSize(){
			final com.apple.jobjc.Invoke.MsgSend intrinsicContentSize_IMetInst = get_intrinsicContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intrinsicContentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		intrinsicContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateIntrinsicContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateIntrinsicContentSize_IMetInst(){
		return ((invalidateIntrinsicContentSize_IMetInst != null)
	? (invalidateIntrinsicContentSize_IMetInst)
	: (invalidateIntrinsicContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateIntrinsicContentSize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateIntrinsicContentSize(){
			final com.apple.jobjc.Invoke.MsgSend invalidateIntrinsicContentSize_IMetInst = get_invalidateIntrinsicContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateIntrinsicContentSize_IMetInst.init(nativeBuffer, this);
		invalidateIntrinsicContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isDescendantOf_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDescendantOf_IMetInst(){
		return ((isDescendantOf_IMetInst != null)
	? (isDescendantOf_IMetInst)
	: (isDescendantOf_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDescendantOf:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isDescendantOf(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend isDescendantOf_IMetInst = get_isDescendantOf_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDescendantOf_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		isDescendantOf_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDrawingFindIndicator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDrawingFindIndicator_IMetInst(){
		return ((isDrawingFindIndicator_IMetInst != null)
	? (isDrawingFindIndicator_IMetInst)
	: (isDrawingFindIndicator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDrawingFindIndicator", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDrawingFindIndicator(){
			final com.apple.jobjc.Invoke.MsgSend isDrawingFindIndicator_IMetInst = get_isDrawingFindIndicator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDrawingFindIndicator_IMetInst.init(nativeBuffer, this);
		isDrawingFindIndicator_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFlipped_IMetInst(){
		return ((isFlipped_IMetInst != null)
	? (isFlipped_IMetInst)
	: (isFlipped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFlipped", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFlipped(){
			final com.apple.jobjc.Invoke.MsgSend isFlipped_IMetInst = get_isFlipped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFlipped_IMetInst.init(nativeBuffer, this);
		isFlipped_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isInFullScreenMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isInFullScreenMode_IMetInst(){
		return ((isInFullScreenMode_IMetInst != null)
	? (isInFullScreenMode_IMetInst)
	: (isInFullScreenMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isInFullScreenMode", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isInFullScreenMode(){
			final com.apple.jobjc.Invoke.MsgSend isInFullScreenMode_IMetInst = get_isInFullScreenMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isInFullScreenMode_IMetInst.init(nativeBuffer, this);
		isInFullScreenMode_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isRotatedFromBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRotatedFromBase_IMetInst(){
		return ((isRotatedFromBase_IMetInst != null)
	? (isRotatedFromBase_IMetInst)
	: (isRotatedFromBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRotatedFromBase", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRotatedFromBase(){
			final com.apple.jobjc.Invoke.MsgSend isRotatedFromBase_IMetInst = get_isRotatedFromBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRotatedFromBase_IMetInst.init(nativeBuffer, this);
		isRotatedFromBase_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRotatedOrScaledFromBase_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRotatedOrScaledFromBase_IMetInst(){
		return ((isRotatedOrScaledFromBase_IMetInst != null)
	? (isRotatedOrScaledFromBase_IMetInst)
	: (isRotatedOrScaledFromBase_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRotatedOrScaledFromBase", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRotatedOrScaledFromBase(){
			final com.apple.jobjc.Invoke.MsgSend isRotatedOrScaledFromBase_IMetInst = get_isRotatedOrScaledFromBase_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRotatedOrScaledFromBase_IMetInst.init(nativeBuffer, this);
		isRotatedOrScaledFromBase_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend knowsPageRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_knowsPageRange_IMetInst(){
		return ((knowsPageRange_IMetInst != null)
	? (knowsPageRange_IMetInst)
	: (knowsPageRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "knowsPageRange:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean knowsPageRange(final Object /* NSRangePointer (^{_NSRange=II}, ^{_NSRange=QQ}) */ range){
			final com.apple.jobjc.Invoke.MsgSend knowsPageRange_IMetInst = get_knowsPageRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		knowsPageRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, range);
		knowsPageRange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layer_IMetInst(){
		return ((layer_IMetInst != null)
	? (layer_IMetInst)
	: (layer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layer", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CALayer* (@, @) */ layer(){
			final com.apple.jobjc.Invoke.MsgSend layer_IMetInst = get_layer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layer_IMetInst.init(nativeBuffer, this);
		layer_IMetInst.invoke(nativeBuffer);
		final Object /* CALayer* (@, @) */ returnValue = (Object /* CALayer* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layerContentsPlacement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layerContentsPlacement_IMetInst(){
		return ((layerContentsPlacement_IMetInst != null)
	? (layerContentsPlacement_IMetInst)
	: (layerContentsPlacement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layerContentsPlacement", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long layerContentsPlacement(){
			final com.apple.jobjc.Invoke.MsgSend layerContentsPlacement_IMetInst = get_layerContentsPlacement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layerContentsPlacement_IMetInst.init(nativeBuffer, this);
		layerContentsPlacement_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layerContentsRedrawPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layerContentsRedrawPolicy_IMetInst(){
		return ((layerContentsRedrawPolicy_IMetInst != null)
	? (layerContentsRedrawPolicy_IMetInst)
	: (layerContentsRedrawPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layerContentsRedrawPolicy", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long layerContentsRedrawPolicy(){
			final com.apple.jobjc.Invoke.MsgSend layerContentsRedrawPolicy_IMetInst = get_layerContentsRedrawPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layerContentsRedrawPolicy_IMetInst.init(nativeBuffer, this);
		layerContentsRedrawPolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layout_IMetInst(){
		return ((layout_IMetInst != null)
	? (layout_IMetInst)
	: (layout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layout", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void layout(){
			final com.apple.jobjc.Invoke.MsgSend layout_IMetInst = get_layout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layout_IMetInst.init(nativeBuffer, this);
		layout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutSubtreeIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutSubtreeIfNeeded_IMetInst(){
		return ((layoutSubtreeIfNeeded_IMetInst != null)
	? (layoutSubtreeIfNeeded_IMetInst)
	: (layoutSubtreeIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutSubtreeIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void layoutSubtreeIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend layoutSubtreeIfNeeded_IMetInst = get_layoutSubtreeIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutSubtreeIfNeeded_IMetInst.init(nativeBuffer, this);
		layoutSubtreeIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend locationOfPrintRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locationOfPrintRect_IMetInst(){
		return ((locationOfPrintRect_IMetInst != null)
	? (locationOfPrintRect_IMetInst)
	: (locationOfPrintRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locationOfPrintRect:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint locationOfPrintRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend locationOfPrintRect_IMetInst = get_locationOfPrintRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locationOfPrintRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		locationOfPrintRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocus_IMetInst(){
		return ((lockFocus_IMetInst != null)
	? (lockFocus_IMetInst)
	: (lockFocus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocus", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void lockFocus(){
			final com.apple.jobjc.Invoke.MsgSend lockFocus_IMetInst = get_lockFocus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocus_IMetInst.init(nativeBuffer, this);
		lockFocus_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocusIfCanDraw_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocusIfCanDraw_IMetInst(){
		return ((lockFocusIfCanDraw_IMetInst != null)
	? (lockFocusIfCanDraw_IMetInst)
	: (lockFocusIfCanDraw_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocusIfCanDraw", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean lockFocusIfCanDraw(){
			final com.apple.jobjc.Invoke.MsgSend lockFocusIfCanDraw_IMetInst = get_lockFocusIfCanDraw_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocusIfCanDraw_IMetInst.init(nativeBuffer, this);
		lockFocusIfCanDraw_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockFocusIfCanDrawInContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockFocusIfCanDrawInContext_IMetInst(){
		return ((lockFocusIfCanDrawInContext_IMetInst != null)
	? (lockFocusIfCanDrawInContext_IMetInst)
	: (lockFocusIfCanDrawInContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockFocusIfCanDrawInContext:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean lockFocusIfCanDrawInContext(final com.apple.jobjc.appkit.NSGraphicsContext context){
			final com.apple.jobjc.Invoke.MsgSend lockFocusIfCanDrawInContext_IMetInst = get_lockFocusIfCanDrawInContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockFocusIfCanDrawInContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		lockFocusIfCanDrawInContext_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeBackingLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeBackingLayer_IMetInst(){
		return ((makeBackingLayer_IMetInst != null)
	? (makeBackingLayer_IMetInst)
	: (makeBackingLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeBackingLayer", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* CALayer* (@, @) */ makeBackingLayer(){
			final com.apple.jobjc.Invoke.MsgSend makeBackingLayer_IMetInst = get_makeBackingLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeBackingLayer_IMetInst.init(nativeBuffer, this);
		makeBackingLayer_IMetInst.invoke(nativeBuffer);
		final Object /* CALayer* (@, @) */ returnValue = (Object /* CALayer* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuForEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuForEvent_IMetInst(){
		return ((menuForEvent_IMetInst != null)
	? (menuForEvent_IMetInst)
	: (menuForEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuForEvent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu menuForEvent(final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend menuForEvent_IMetInst = get_menuForEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuForEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		menuForEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouse_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouse_inRect_IMetInst(){
		return ((mouse_inRect_IMetInst != null)
	? (mouse_inRect_IMetInst)
	: (mouse_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouse:inRect:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean mouse_inRect(final com.apple.jobjc.foundation.NSPoint aPoint, final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend mouse_inRect_IMetInst = get_mouse_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouse_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		mouse_inRect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDownCanMoveWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDownCanMoveWindow_IMetInst(){
		return ((mouseDownCanMoveWindow_IMetInst != null)
	? (mouseDownCanMoveWindow_IMetInst)
	: (mouseDownCanMoveWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDownCanMoveWindow", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean mouseDownCanMoveWindow(){
			final com.apple.jobjc.Invoke.MsgSend mouseDownCanMoveWindow_IMetInst = get_mouseDownCanMoveWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDownCanMoveWindow_IMetInst.init(nativeBuffer, this);
		mouseDownCanMoveWindow_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend needsLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsLayout_IMetInst(){
		return ((needsLayout_IMetInst != null)
	? (needsLayout_IMetInst)
	: (needsLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsLayout", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean needsLayout(){
			final com.apple.jobjc.Invoke.MsgSend needsLayout_IMetInst = get_needsLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsLayout_IMetInst.init(nativeBuffer, this);
		needsLayout_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsPanelToBecomeKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsPanelToBecomeKey_IMetInst(){
		return ((needsPanelToBecomeKey_IMetInst != null)
	? (needsPanelToBecomeKey_IMetInst)
	: (needsPanelToBecomeKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsPanelToBecomeKey", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean needsPanelToBecomeKey(){
			final com.apple.jobjc.Invoke.MsgSend needsPanelToBecomeKey_IMetInst = get_needsPanelToBecomeKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsPanelToBecomeKey_IMetInst.init(nativeBuffer, this);
		needsPanelToBecomeKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsToDrawRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsToDrawRect_IMetInst(){
		return ((needsToDrawRect_IMetInst != null)
	? (needsToDrawRect_IMetInst)
	: (needsToDrawRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsToDrawRect:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean needsToDrawRect(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend needsToDrawRect_IMetInst = get_needsToDrawRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsToDrawRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		needsToDrawRect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsUpdateConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsUpdateConstraints_IMetInst(){
		return ((needsUpdateConstraints_IMetInst != null)
	? (needsUpdateConstraints_IMetInst)
	: (needsUpdateConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsUpdateConstraints", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean needsUpdateConstraints(){
			final com.apple.jobjc.Invoke.MsgSend needsUpdateConstraints_IMetInst = get_needsUpdateConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsUpdateConstraints_IMetInst.init(nativeBuffer, this);
		needsUpdateConstraints_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextKeyView_IMetInst(){
		return ((nextKeyView_IMetInst != null)
	? (nextKeyView_IMetInst)
	: (nextKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextKeyView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView nextKeyView(){
			final com.apple.jobjc.Invoke.MsgSend nextKeyView_IMetInst = get_nextKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextKeyView_IMetInst.init(nativeBuffer, this);
		nextKeyView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextValidKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextValidKeyView_IMetInst(){
		return ((nextValidKeyView_IMetInst != null)
	? (nextValidKeyView_IMetInst)
	: (nextValidKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextValidKeyView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView nextValidKeyView(){
			final com.apple.jobjc.Invoke.MsgSend nextValidKeyView_IMetInst = get_nextValidKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextValidKeyView_IMetInst.init(nativeBuffer, this);
		nextValidKeyView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteFocusRingMaskChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteFocusRingMaskChanged_IMetInst(){
		return ((noteFocusRingMaskChanged_IMetInst != null)
	? (noteFocusRingMaskChanged_IMetInst)
	: (noteFocusRingMaskChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteFocusRingMaskChanged", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteFocusRingMaskChanged(){
			final com.apple.jobjc.Invoke.MsgSend noteFocusRingMaskChanged_IMetInst = get_noteFocusRingMaskChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteFocusRingMaskChanged_IMetInst.init(nativeBuffer, this);
		noteFocusRingMaskChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend opaqueAncestor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_opaqueAncestor_IMetInst(){
		return ((opaqueAncestor_IMetInst != null)
	? (opaqueAncestor_IMetInst)
	: (opaqueAncestor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "opaqueAncestor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView opaqueAncestor(){
			final com.apple.jobjc.Invoke.MsgSend opaqueAncestor_IMetInst = get_opaqueAncestor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		opaqueAncestor_IMetInst.init(nativeBuffer, this);
		opaqueAncestor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageFooter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageFooter_IMetInst(){
		return ((pageFooter_IMetInst != null)
	? (pageFooter_IMetInst)
	: (pageFooter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageFooter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString pageFooter(){
			final com.apple.jobjc.Invoke.MsgSend pageFooter_IMetInst = get_pageFooter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageFooter_IMetInst.init(nativeBuffer, this);
		pageFooter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageHeader_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageHeader_IMetInst(){
		return ((pageHeader_IMetInst != null)
	? (pageHeader_IMetInst)
	: (pageHeader_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageHeader", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString pageHeader(){
			final com.apple.jobjc.Invoke.MsgSend pageHeader_IMetInst = get_pageHeader_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageHeader_IMetInst.init(nativeBuffer, this);
		pageHeader_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performKeyEquivalent_IMetInst(){
		return ((performKeyEquivalent_IMetInst != null)
	? (performKeyEquivalent_IMetInst)
	: (performKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performKeyEquivalent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performKeyEquivalent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst = get_performKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		performKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performMnemonic_IMetInst(){
		return ((performMnemonic_IMetInst != null)
	? (performMnemonic_IMetInst)
	: (performMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performMnemonic:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performMnemonic(final com.apple.jobjc.foundation.NSString theString){
			final com.apple.jobjc.Invoke.MsgSend performMnemonic_IMetInst = get_performMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theString);
		performMnemonic_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend postsBoundsChangedNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postsBoundsChangedNotifications_IMetInst(){
		return ((postsBoundsChangedNotifications_IMetInst != null)
	? (postsBoundsChangedNotifications_IMetInst)
	: (postsBoundsChangedNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postsBoundsChangedNotifications", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean postsBoundsChangedNotifications(){
			final com.apple.jobjc.Invoke.MsgSend postsBoundsChangedNotifications_IMetInst = get_postsBoundsChangedNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postsBoundsChangedNotifications_IMetInst.init(nativeBuffer, this);
		postsBoundsChangedNotifications_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend postsFrameChangedNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postsFrameChangedNotifications_IMetInst(){
		return ((postsFrameChangedNotifications_IMetInst != null)
	? (postsFrameChangedNotifications_IMetInst)
	: (postsFrameChangedNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postsFrameChangedNotifications", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean postsFrameChangedNotifications(){
			final com.apple.jobjc.Invoke.MsgSend postsFrameChangedNotifications_IMetInst = get_postsFrameChangedNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postsFrameChangedNotifications_IMetInst.init(nativeBuffer, this);
		postsFrameChangedNotifications_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend previousKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_previousKeyView_IMetInst(){
		return ((previousKeyView_IMetInst != null)
	? (previousKeyView_IMetInst)
	: (previousKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "previousKeyView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView previousKeyView(){
			final com.apple.jobjc.Invoke.MsgSend previousKeyView_IMetInst = get_previousKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		previousKeyView_IMetInst.init(nativeBuffer, this);
		previousKeyView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend previousValidKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_previousValidKeyView_IMetInst(){
		return ((previousValidKeyView_IMetInst != null)
	? (previousValidKeyView_IMetInst)
	: (previousValidKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "previousValidKeyView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView previousValidKeyView(){
			final com.apple.jobjc.Invoke.MsgSend previousValidKeyView_IMetInst = get_previousValidKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		previousValidKeyView_IMetInst.init(nativeBuffer, this);
		previousValidKeyView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend printJobTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printJobTitle_IMetInst(){
		return ((printJobTitle_IMetInst != null)
	? (printJobTitle_IMetInst)
	: (printJobTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printJobTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString printJobTitle(){
			final com.apple.jobjc.Invoke.MsgSend printJobTitle_IMetInst = get_printJobTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printJobTitle_IMetInst.init(nativeBuffer, this);
		printJobTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForPage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForPage_IMetInst(){
		return ((rectForPage_IMetInst != null)
	? (rectForPage_IMetInst)
	: (rectForPage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForPage:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect rectForPage(final long page){
			final com.apple.jobjc.Invoke.MsgSend rectForPage_IMetInst = get_rectForPage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForPage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, page);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForPage_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForSmartMagnificationAtPoint_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForSmartMagnificationAtPoint_inRect_IMetInst(){
		return ((rectForSmartMagnificationAtPoint_inRect_IMetInst != null)
	? (rectForSmartMagnificationAtPoint_inRect_IMetInst)
	: (rectForSmartMagnificationAtPoint_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForSmartMagnificationAtPoint:inRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rectForSmartMagnificationAtPoint_inRect(final com.apple.jobjc.foundation.NSPoint location, final com.apple.jobjc.foundation.NSRect visibleRect){
			final com.apple.jobjc.Invoke.MsgSend rectForSmartMagnificationAtPoint_inRect_IMetInst = get_rectForSmartMagnificationAtPoint_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForSmartMagnificationAtPoint_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, visibleRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForSmartMagnificationAtPoint_inRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectPreservedDuringLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectPreservedDuringLiveResize_IMetInst(){
		return ((rectPreservedDuringLiveResize_IMetInst != null)
	? (rectPreservedDuringLiveResize_IMetInst)
	: (rectPreservedDuringLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectPreservedDuringLiveResize", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rectPreservedDuringLiveResize(){
			final com.apple.jobjc.Invoke.MsgSend rectPreservedDuringLiveResize_IMetInst = get_rectPreservedDuringLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectPreservedDuringLiveResize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectPreservedDuringLiveResize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reflectScrolledClipView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reflectScrolledClipView_IMetInst(){
		return ((reflectScrolledClipView_IMetInst != null)
	? (reflectScrolledClipView_IMetInst)
	: (reflectScrolledClipView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reflectScrolledClipView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void reflectScrolledClipView(final com.apple.jobjc.appkit.NSClipView aClipView){
			final com.apple.jobjc.Invoke.MsgSend reflectScrolledClipView_IMetInst = get_reflectScrolledClipView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reflectScrolledClipView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aClipView);
		reflectScrolledClipView_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend registeredDraggedTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registeredDraggedTypes_IMetInst(){
		return ((registeredDraggedTypes_IMetInst != null)
	? (registeredDraggedTypes_IMetInst)
	: (registeredDraggedTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registeredDraggedTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray registeredDraggedTypes(){
			final com.apple.jobjc.Invoke.MsgSend registeredDraggedTypes_IMetInst = get_registeredDraggedTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registeredDraggedTypes_IMetInst.init(nativeBuffer, this);
		registeredDraggedTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend releaseGState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_releaseGState_IMetInst(){
		return ((releaseGState_IMetInst != null)
	? (releaseGState_IMetInst)
	: (releaseGState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "releaseGState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void releaseGState(){
			final com.apple.jobjc.Invoke.MsgSend releaseGState_IMetInst = get_releaseGState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		releaseGState_IMetInst.init(nativeBuffer, this);
		releaseGState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllToolTips_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllToolTips_IMetInst(){
		return ((removeAllToolTips_IMetInst != null)
	? (removeAllToolTips_IMetInst)
	: (removeAllToolTips_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllToolTips", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllToolTips(){
			final com.apple.jobjc.Invoke.MsgSend removeAllToolTips_IMetInst = get_removeAllToolTips_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllToolTips_IMetInst.init(nativeBuffer, this);
		removeAllToolTips_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeConstraint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeConstraint_IMetInst(){
		return ((removeConstraint_IMetInst != null)
	? (removeConstraint_IMetInst)
	: (removeConstraint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeConstraint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeConstraint(final com.apple.jobjc.appkit.NSLayoutConstraint constraint){
			final com.apple.jobjc.Invoke.MsgSend removeConstraint_IMetInst = get_removeConstraint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeConstraint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constraint);
		removeConstraint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeConstraints_IMetInst(){
		return ((removeConstraints_IMetInst != null)
	? (removeConstraints_IMetInst)
	: (removeConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeConstraints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeConstraints(final com.apple.jobjc.foundation.NSArray constraints){
			final com.apple.jobjc.Invoke.MsgSend removeConstraints_IMetInst = get_removeConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeConstraints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, constraints);
		removeConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCursorRect_cursor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCursorRect_cursor_IMetInst(){
		return ((removeCursorRect_cursor_IMetInst != null)
	? (removeCursorRect_cursor_IMetInst)
	: (removeCursorRect_cursor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCursorRect:cursor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeCursorRect_cursor(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.appkit.NSCursor anObj){
			final com.apple.jobjc.Invoke.MsgSend removeCursorRect_cursor_IMetInst = get_removeCursorRect_cursor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCursorRect_cursor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObj);
		removeCursorRect_cursor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromSuperview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromSuperview_IMetInst(){
		return ((removeFromSuperview_IMetInst != null)
	? (removeFromSuperview_IMetInst)
	: (removeFromSuperview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromSuperview", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeFromSuperview(){
			final com.apple.jobjc.Invoke.MsgSend removeFromSuperview_IMetInst = get_removeFromSuperview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromSuperview_IMetInst.init(nativeBuffer, this);
		removeFromSuperview_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFromSuperviewWithoutNeedingDisplay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFromSuperviewWithoutNeedingDisplay_IMetInst(){
		return ((removeFromSuperviewWithoutNeedingDisplay_IMetInst != null)
	? (removeFromSuperviewWithoutNeedingDisplay_IMetInst)
	: (removeFromSuperviewWithoutNeedingDisplay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFromSuperviewWithoutNeedingDisplay", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeFromSuperviewWithoutNeedingDisplay(){
			final com.apple.jobjc.Invoke.MsgSend removeFromSuperviewWithoutNeedingDisplay_IMetInst = get_removeFromSuperviewWithoutNeedingDisplay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFromSuperviewWithoutNeedingDisplay_IMetInst.init(nativeBuffer, this);
		removeFromSuperviewWithoutNeedingDisplay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeToolTip_IMetInst(){
		return ((removeToolTip_IMetInst != null)
	? (removeToolTip_IMetInst)
	: (removeToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeToolTip:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeToolTip(final long tag){
			final com.apple.jobjc.Invoke.MsgSend removeToolTip_IMetInst = get_removeToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeToolTip_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		removeToolTip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTrackingArea_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTrackingArea_IMetInst(){
		return ((removeTrackingArea_IMetInst != null)
	? (removeTrackingArea_IMetInst)
	: (removeTrackingArea_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTrackingArea:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeTrackingArea(final com.apple.jobjc.appkit.NSTrackingArea trackingArea){
			final com.apple.jobjc.Invoke.MsgSend removeTrackingArea_IMetInst = get_removeTrackingArea_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTrackingArea_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, trackingArea);
		removeTrackingArea_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTrackingRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTrackingRect_IMetInst(){
		return ((removeTrackingRect_IMetInst != null)
	? (removeTrackingRect_IMetInst)
	: (removeTrackingRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTrackingRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeTrackingRect(final long tag){
			final com.apple.jobjc.Invoke.MsgSend removeTrackingRect_IMetInst = get_removeTrackingRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTrackingRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		removeTrackingRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend renewGState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_renewGState_IMetInst(){
		return ((renewGState_IMetInst != null)
	? (renewGState_IMetInst)
	: (renewGState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "renewGState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void renewGState(){
			final com.apple.jobjc.Invoke.MsgSend renewGState_IMetInst = get_renewGState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		renewGState_IMetInst.init(nativeBuffer, this);
		renewGState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceSubview_with_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceSubview_with_IMetInst(){
		return ((replaceSubview_with_IMetInst != null)
	? (replaceSubview_with_IMetInst)
	: (replaceSubview_with_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceSubview:with:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceSubview_with(final com.apple.jobjc.appkit.NSView oldView, final com.apple.jobjc.appkit.NSView newView){
			final com.apple.jobjc.Invoke.MsgSend replaceSubview_with_IMetInst = get_replaceSubview_with_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceSubview_with_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldView);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newView);
		replaceSubview_with_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend resizeSubviewsWithOldSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeSubviewsWithOldSize_IMetInst(){
		return ((resizeSubviewsWithOldSize_IMetInst != null)
	? (resizeSubviewsWithOldSize_IMetInst)
	: (resizeSubviewsWithOldSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeSubviewsWithOldSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void resizeSubviewsWithOldSize(final com.apple.jobjc.foundation.NSSize oldSize){
			final com.apple.jobjc.Invoke.MsgSend resizeSubviewsWithOldSize_IMetInst = get_resizeSubviewsWithOldSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeSubviewsWithOldSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, oldSize);
		resizeSubviewsWithOldSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resizeWithOldSuperviewSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizeWithOldSuperviewSize_IMetInst(){
		return ((resizeWithOldSuperviewSize_IMetInst != null)
	? (resizeWithOldSuperviewSize_IMetInst)
	: (resizeWithOldSuperviewSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizeWithOldSuperviewSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void resizeWithOldSuperviewSize(final com.apple.jobjc.foundation.NSSize oldSize){
			final com.apple.jobjc.Invoke.MsgSend resizeWithOldSuperviewSize_IMetInst = get_resizeWithOldSuperviewSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizeWithOldSuperviewSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, oldSize);
		resizeWithOldSuperviewSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rotateByAngle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rotateByAngle_IMetInst(){
		return ((rotateByAngle_IMetInst != null)
	? (rotateByAngle_IMetInst)
	: (rotateByAngle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rotateByAngle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void rotateByAngle(final double angle){
			final com.apple.jobjc.Invoke.MsgSend rotateByAngle_IMetInst = get_rotateByAngle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rotateByAngle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		rotateByAngle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didAddMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didAddMarker_IMetInst(){
		return ((rulerView_didAddMarker_IMetInst != null)
	? (rulerView_didAddMarker_IMetInst)
	: (rulerView_didAddMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didAddMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didAddMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didAddMarker_IMetInst = get_rulerView_didAddMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didAddMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didAddMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didMoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didMoveMarker_IMetInst(){
		return ((rulerView_didMoveMarker_IMetInst != null)
	? (rulerView_didMoveMarker_IMetInst)
	: (rulerView_didMoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didMoveMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didMoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didMoveMarker_IMetInst = get_rulerView_didMoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didMoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didMoveMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_didRemoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_didRemoveMarker_IMetInst(){
		return ((rulerView_didRemoveMarker_IMetInst != null)
	? (rulerView_didRemoveMarker_IMetInst)
	: (rulerView_didRemoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:didRemoveMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_didRemoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_didRemoveMarker_IMetInst = get_rulerView_didRemoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_didRemoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_didRemoveMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_handleMouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_handleMouseDown_IMetInst(){
		return ((rulerView_handleMouseDown_IMetInst != null)
	? (rulerView_handleMouseDown_IMetInst)
	: (rulerView_handleMouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:handleMouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_handleMouseDown(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend rulerView_handleMouseDown_IMetInst = get_rulerView_handleMouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_handleMouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		rulerView_handleMouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_locationForPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_locationForPoint_IMetInst(){
		return ((rulerView_locationForPoint_IMetInst != null)
	? (rulerView_locationForPoint_IMetInst)
	: (rulerView_locationForPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:locationForPoint:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public double rulerView_locationForPoint(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend rulerView_locationForPoint_IMetInst = get_rulerView_locationForPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_locationForPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		rulerView_locationForPoint_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_pointForLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_pointForLocation_IMetInst(){
		return ((rulerView_pointForLocation_IMetInst != null)
	? (rulerView_pointForLocation_IMetInst)
	: (rulerView_pointForLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:pointForLocation:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.foundation.NSPoint rulerView_pointForLocation(final com.apple.jobjc.appkit.NSRulerView ruler, final double aPoint){
			final com.apple.jobjc.Invoke.MsgSend rulerView_pointForLocation_IMetInst = get_rulerView_pointForLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_pointForLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aPoint);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		rulerView_pointForLocation_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldAddMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldAddMarker_IMetInst(){
		return ((rulerView_shouldAddMarker_IMetInst != null)
	? (rulerView_shouldAddMarker_IMetInst)
	: (rulerView_shouldAddMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldAddMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldAddMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldAddMarker_IMetInst = get_rulerView_shouldAddMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldAddMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldAddMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldMoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldMoveMarker_IMetInst(){
		return ((rulerView_shouldMoveMarker_IMetInst != null)
	? (rulerView_shouldMoveMarker_IMetInst)
	: (rulerView_shouldMoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldMoveMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldMoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldMoveMarker_IMetInst = get_rulerView_shouldMoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldMoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldMoveMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_shouldRemoveMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_shouldRemoveMarker_IMetInst(){
		return ((rulerView_shouldRemoveMarker_IMetInst != null)
	? (rulerView_shouldRemoveMarker_IMetInst)
	: (rulerView_shouldRemoveMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:shouldRemoveMarker:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean rulerView_shouldRemoveMarker(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker){
			final com.apple.jobjc.Invoke.MsgSend rulerView_shouldRemoveMarker_IMetInst = get_rulerView_shouldRemoveMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_shouldRemoveMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		rulerView_shouldRemoveMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_willAddMarker_atLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_willAddMarker_atLocation_IMetInst(){
		return ((rulerView_willAddMarker_atLocation_IMetInst != null)
	? (rulerView_willAddMarker_atLocation_IMetInst)
	: (rulerView_willAddMarker_atLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:willAddMarker:atLocation:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rulerView_willAddMarker_atLocation(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker, final double location){
			final com.apple.jobjc.Invoke.MsgSend rulerView_willAddMarker_atLocation_IMetInst = get_rulerView_willAddMarker_atLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_willAddMarker_atLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		rulerView_willAddMarker_atLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_willMoveMarker_toLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_willMoveMarker_toLocation_IMetInst(){
		return ((rulerView_willMoveMarker_toLocation_IMetInst != null)
	? (rulerView_willMoveMarker_toLocation_IMetInst)
	: (rulerView_willMoveMarker_toLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:willMoveMarker:toLocation:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rulerView_willMoveMarker_toLocation(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSRulerMarker marker, final double location){
			final com.apple.jobjc.Invoke.MsgSend rulerView_willMoveMarker_toLocation_IMetInst = get_rulerView_willMoveMarker_toLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_willMoveMarker_toLocation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, marker);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, location);
		rulerView_willMoveMarker_toLocation_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rulerView_willSetClientView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulerView_willSetClientView_IMetInst(){
		return ((rulerView_willSetClientView_IMetInst != null)
	? (rulerView_willSetClientView_IMetInst)
	: (rulerView_willSetClientView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulerView:willSetClientView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void rulerView_willSetClientView(final com.apple.jobjc.appkit.NSRulerView ruler, final com.apple.jobjc.appkit.NSView newClient){
			final com.apple.jobjc.Invoke.MsgSend rulerView_willSetClientView_IMetInst = get_rulerView_willSetClientView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulerView_willSetClientView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newClient);
		rulerView_willSetClientView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scaleUnitSquareToSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scaleUnitSquareToSize_IMetInst(){
		return ((scaleUnitSquareToSize_IMetInst != null)
	? (scaleUnitSquareToSize_IMetInst)
	: (scaleUnitSquareToSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scaleUnitSquareToSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void scaleUnitSquareToSize(final com.apple.jobjc.foundation.NSSize newUnitSize){
			final com.apple.jobjc.Invoke.MsgSend scaleUnitSquareToSize_IMetInst = get_scaleUnitSquareToSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scaleUnitSquareToSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newUnitSize);
		scaleUnitSquareToSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollClipView_toPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollClipView_toPoint_IMetInst(){
		return ((scrollClipView_toPoint_IMetInst != null)
	? (scrollClipView_toPoint_IMetInst)
	: (scrollClipView_toPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollClipView:toPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void scrollClipView_toPoint(final com.apple.jobjc.appkit.NSClipView aClipView, final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend scrollClipView_toPoint_IMetInst = get_scrollClipView_toPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollClipView_toPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aClipView);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		scrollClipView_toPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollPoint_IMetInst(){
		return ((scrollPoint_IMetInst != null)
	? (scrollPoint_IMetInst)
	: (scrollPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void scrollPoint(final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend scrollPoint_IMetInst = get_scrollPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		scrollPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollRect_by_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRect_by_IMetInst(){
		return ((scrollRect_by_IMetInst != null)
	? (scrollRect_by_IMetInst)
	: (scrollRect_by_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRect:by:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void scrollRect_by(final com.apple.jobjc.foundation.NSRect aRect, final com.apple.jobjc.foundation.NSSize delta){
			final com.apple.jobjc.Invoke.MsgSend scrollRect_by_IMetInst = get_scrollRect_by_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRect_by_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, delta);
		scrollRect_by_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollRectToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRectToVisible_IMetInst(){
		return ((scrollRectToVisible_IMetInst != null)
	? (scrollRectToVisible_IMetInst)
	: (scrollRectToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRectToVisible:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public boolean scrollRectToVisible(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend scrollRectToVisible_IMetInst = get_scrollRectToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRectToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		scrollRectToVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcceptsTouchEvents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcceptsTouchEvents_IMetInst(){
		return ((setAcceptsTouchEvents_IMetInst != null)
	? (setAcceptsTouchEvents_IMetInst)
	: (setAcceptsTouchEvents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcceptsTouchEvents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAcceptsTouchEvents(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAcceptsTouchEvents_IMetInst = get_setAcceptsTouchEvents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcceptsTouchEvents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAcceptsTouchEvents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlphaValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlphaValue_IMetInst(){
		return ((setAlphaValue_IMetInst != null)
	? (setAlphaValue_IMetInst)
	: (setAlphaValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlphaValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setAlphaValue(final double viewAlpha){
			final com.apple.jobjc.Invoke.MsgSend setAlphaValue_IMetInst = get_setAlphaValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlphaValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, viewAlpha);
		setAlphaValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoresizesSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoresizesSubviews_IMetInst(){
		return ((setAutoresizesSubviews_IMetInst != null)
	? (setAutoresizesSubviews_IMetInst)
	: (setAutoresizesSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoresizesSubviews:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoresizesSubviews(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutoresizesSubviews_IMetInst = get_setAutoresizesSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoresizesSubviews_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutoresizesSubviews_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoresizingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoresizingMask_IMetInst(){
		return ((setAutoresizingMask_IMetInst != null)
	? (setAutoresizingMask_IMetInst)
	: (setAutoresizingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoresizingMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAutoresizingMask(final long mask){
			final com.apple.jobjc.Invoke.MsgSend setAutoresizingMask_IMetInst = get_setAutoresizingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoresizingMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		setAutoresizingMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundFilters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundFilters_IMetInst(){
		return ((setBackgroundFilters_IMetInst != null)
	? (setBackgroundFilters_IMetInst)
	: (setBackgroundFilters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundFilters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundFilters(final com.apple.jobjc.foundation.NSArray filters){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundFilters_IMetInst = get_setBackgroundFilters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundFilters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filters);
		setBackgroundFilters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBounds_IMetInst(){
		return ((setBounds_IMetInst != null)
	? (setBounds_IMetInst)
	: (setBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBounds:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setBounds(final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend setBounds_IMetInst = get_setBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		setBounds_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBoundsOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBoundsOrigin_IMetInst(){
		return ((setBoundsOrigin_IMetInst != null)
	? (setBoundsOrigin_IMetInst)
	: (setBoundsOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBoundsOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setBoundsOrigin(final com.apple.jobjc.foundation.NSPoint newOrigin){
			final com.apple.jobjc.Invoke.MsgSend setBoundsOrigin_IMetInst = get_setBoundsOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBoundsOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, newOrigin);
		setBoundsOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBoundsRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBoundsRotation_IMetInst(){
		return ((setBoundsRotation_IMetInst != null)
	? (setBoundsRotation_IMetInst)
	: (setBoundsRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBoundsRotation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setBoundsRotation(final double angle){
			final com.apple.jobjc.Invoke.MsgSend setBoundsRotation_IMetInst = get_setBoundsRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBoundsRotation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		setBoundsRotation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBoundsSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBoundsSize_IMetInst(){
		return ((setBoundsSize_IMetInst != null)
	? (setBoundsSize_IMetInst)
	: (setBoundsSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBoundsSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setBoundsSize(final com.apple.jobjc.foundation.NSSize newSize){
			final com.apple.jobjc.Invoke.MsgSend setBoundsSize_IMetInst = get_setBoundsSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBoundsSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newSize);
		setBoundsSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanDrawConcurrently_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanDrawConcurrently_IMetInst(){
		return ((setCanDrawConcurrently_IMetInst != null)
	? (setCanDrawConcurrently_IMetInst)
	: (setCanDrawConcurrently_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanDrawConcurrently:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanDrawConcurrently(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanDrawConcurrently_IMetInst = get_setCanDrawConcurrently_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanDrawConcurrently_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanDrawConcurrently_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCompositingFilter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCompositingFilter_IMetInst(){
		return ((setCompositingFilter_IMetInst != null)
	? (setCompositingFilter_IMetInst)
	: (setCompositingFilter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCompositingFilter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setCompositingFilter(final Object /* CIFilter* (@, @) */ filter){
			final com.apple.jobjc.Invoke.MsgSend setCompositingFilter_IMetInst = get_setCompositingFilter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCompositingFilter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, filter);
		setCompositingFilter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentCompressionResistancePriority_forOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentCompressionResistancePriority_forOrientation_IMetInst(){
		return ((setContentCompressionResistancePriority_forOrientation_IMetInst != null)
	? (setContentCompressionResistancePriority_forOrientation_IMetInst)
	: (setContentCompressionResistancePriority_forOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentCompressionResistancePriority:forOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setContentCompressionResistancePriority_forOrientation(final float priority, final long orientation){
			final com.apple.jobjc.Invoke.MsgSend setContentCompressionResistancePriority_forOrientation_IMetInst = get_setContentCompressionResistancePriority_forOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentCompressionResistancePriority_forOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, priority);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		setContentCompressionResistancePriority_forOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentFilters_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentFilters_IMetInst(){
		return ((setContentFilters_IMetInst != null)
	? (setContentFilters_IMetInst)
	: (setContentFilters_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentFilters:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentFilters(final com.apple.jobjc.foundation.NSArray filters){
			final com.apple.jobjc.Invoke.MsgSend setContentFilters_IMetInst = get_setContentFilters_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentFilters_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filters);
		setContentFilters_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentHuggingPriority_forOrientation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentHuggingPriority_forOrientation_IMetInst(){
		return ((setContentHuggingPriority_forOrientation_IMetInst != null)
	? (setContentHuggingPriority_forOrientation_IMetInst)
	: (setContentHuggingPriority_forOrientation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentHuggingPriority:forOrientation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setContentHuggingPriority_forOrientation(final float priority, final long orientation){
			final com.apple.jobjc.Invoke.MsgSend setContentHuggingPriority_forOrientation_IMetInst = get_setContentHuggingPriority_forOrientation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentHuggingPriority_forOrientation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, priority);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, orientation);
		setContentHuggingPriority_forOrientation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFocusRingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFocusRingType_IMetInst(){
		return ((setFocusRingType_IMetInst != null)
	? (setFocusRingType_IMetInst)
	: (setFocusRingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFocusRingType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setFocusRingType(final long focusRingType){
			final com.apple.jobjc.Invoke.MsgSend setFocusRingType_IMetInst = get_setFocusRingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFocusRingType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, focusRingType);
		setFocusRingType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrame_IMetInst(){
		return ((setFrame_IMetInst != null)
	? (setFrame_IMetInst)
	: (setFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrame:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setFrame(final com.apple.jobjc.foundation.NSRect frameRect){
			final com.apple.jobjc.Invoke.MsgSend setFrame_IMetInst = get_setFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		setFrame_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameCenterRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameCenterRotation_IMetInst(){
		return ((setFrameCenterRotation_IMetInst != null)
	? (setFrameCenterRotation_IMetInst)
	: (setFrameCenterRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameCenterRotation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFrameCenterRotation(final double angle){
			final com.apple.jobjc.Invoke.MsgSend setFrameCenterRotation_IMetInst = get_setFrameCenterRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameCenterRotation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		setFrameCenterRotation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameOrigin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameOrigin_IMetInst(){
		return ((setFrameOrigin_IMetInst != null)
	? (setFrameOrigin_IMetInst)
	: (setFrameOrigin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameOrigin:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setFrameOrigin(final com.apple.jobjc.foundation.NSPoint newOrigin){
			final com.apple.jobjc.Invoke.MsgSend setFrameOrigin_IMetInst = get_setFrameOrigin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameOrigin_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, newOrigin);
		setFrameOrigin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameRotation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameRotation_IMetInst(){
		return ((setFrameRotation_IMetInst != null)
	? (setFrameRotation_IMetInst)
	: (setFrameRotation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameRotation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFrameRotation(final double angle){
			final com.apple.jobjc.Invoke.MsgSend setFrameRotation_IMetInst = get_setFrameRotation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameRotation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, angle);
		setFrameRotation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameSize_IMetInst(){
		return ((setFrameSize_IMetInst != null)
	? (setFrameSize_IMetInst)
	: (setFrameSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setFrameSize(final com.apple.jobjc.foundation.NSSize newSize){
			final com.apple.jobjc.Invoke.MsgSend setFrameSize_IMetInst = get_setFrameSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newSize);
		setFrameSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHidden_IMetInst(){
		return ((setHidden_IMetInst != null)
	? (setHidden_IMetInst)
	: (setHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHidden:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHidden(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst = get_setHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHidden_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHidden_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeyboardFocusRingNeedsDisplayInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyboardFocusRingNeedsDisplayInRect_IMetInst(){
		return ((setKeyboardFocusRingNeedsDisplayInRect_IMetInst != null)
	? (setKeyboardFocusRingNeedsDisplayInRect_IMetInst)
	: (setKeyboardFocusRingNeedsDisplayInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyboardFocusRingNeedsDisplayInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setKeyboardFocusRingNeedsDisplayInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend setKeyboardFocusRingNeedsDisplayInRect_IMetInst = get_setKeyboardFocusRingNeedsDisplayInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyboardFocusRingNeedsDisplayInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		setKeyboardFocusRingNeedsDisplayInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayer_IMetInst(){
		return ((setLayer_IMetInst != null)
	? (setLayer_IMetInst)
	: (setLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setLayer(final Object /* CALayer* (@, @) */ newLayer){
			final com.apple.jobjc.Invoke.MsgSend setLayer_IMetInst = get_setLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, newLayer);
		setLayer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayerContentsPlacement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayerContentsPlacement_IMetInst(){
		return ((setLayerContentsPlacement_IMetInst != null)
	? (setLayerContentsPlacement_IMetInst)
	: (setLayerContentsPlacement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayerContentsPlacement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLayerContentsPlacement(final long newPlacement){
			final com.apple.jobjc.Invoke.MsgSend setLayerContentsPlacement_IMetInst = get_setLayerContentsPlacement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayerContentsPlacement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newPlacement);
		setLayerContentsPlacement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayerContentsRedrawPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayerContentsRedrawPolicy_IMetInst(){
		return ((setLayerContentsRedrawPolicy_IMetInst != null)
	? (setLayerContentsRedrawPolicy_IMetInst)
	: (setLayerContentsRedrawPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayerContentsRedrawPolicy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLayerContentsRedrawPolicy(final long newPolicy){
			final com.apple.jobjc.Invoke.MsgSend setLayerContentsRedrawPolicy_IMetInst = get_setLayerContentsRedrawPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayerContentsRedrawPolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newPolicy);
		setLayerContentsRedrawPolicy_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setNeedsDisplayInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsDisplayInRect_IMetInst(){
		return ((setNeedsDisplayInRect_IMetInst != null)
	? (setNeedsDisplayInRect_IMetInst)
	: (setNeedsDisplayInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsDisplayInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setNeedsDisplayInRect(final com.apple.jobjc.foundation.NSRect invalidRect){
			final com.apple.jobjc.Invoke.MsgSend setNeedsDisplayInRect_IMetInst = get_setNeedsDisplayInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsDisplayInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, invalidRect);
		setNeedsDisplayInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsLayout_IMetInst(){
		return ((setNeedsLayout_IMetInst != null)
	? (setNeedsLayout_IMetInst)
	: (setNeedsLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsLayout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setNeedsLayout(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setNeedsLayout_IMetInst = get_setNeedsLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setNeedsLayout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNeedsUpdateConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNeedsUpdateConstraints_IMetInst(){
		return ((setNeedsUpdateConstraints_IMetInst != null)
	? (setNeedsUpdateConstraints_IMetInst)
	: (setNeedsUpdateConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNeedsUpdateConstraints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setNeedsUpdateConstraints(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setNeedsUpdateConstraints_IMetInst = get_setNeedsUpdateConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNeedsUpdateConstraints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setNeedsUpdateConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNextKeyView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNextKeyView_IMetInst(){
		return ((setNextKeyView_IMetInst != null)
	? (setNextKeyView_IMetInst)
	: (setNextKeyView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNextKeyView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNextKeyView(final com.apple.jobjc.appkit.NSView next){
			final com.apple.jobjc.Invoke.MsgSend setNextKeyView_IMetInst = get_setNextKeyView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNextKeyView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, next);
		setNextKeyView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPostsBoundsChangedNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPostsBoundsChangedNotifications_IMetInst(){
		return ((setPostsBoundsChangedNotifications_IMetInst != null)
	? (setPostsBoundsChangedNotifications_IMetInst)
	: (setPostsBoundsChangedNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPostsBoundsChangedNotifications:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPostsBoundsChangedNotifications(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPostsBoundsChangedNotifications_IMetInst = get_setPostsBoundsChangedNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPostsBoundsChangedNotifications_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPostsBoundsChangedNotifications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPostsFrameChangedNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPostsFrameChangedNotifications_IMetInst(){
		return ((setPostsFrameChangedNotifications_IMetInst != null)
	? (setPostsFrameChangedNotifications_IMetInst)
	: (setPostsFrameChangedNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPostsFrameChangedNotifications:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPostsFrameChangedNotifications(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPostsFrameChangedNotifications_IMetInst = get_setPostsFrameChangedNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPostsFrameChangedNotifications_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPostsFrameChangedNotifications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShadow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShadow_IMetInst(){
		return ((setShadow_IMetInst != null)
	? (setShadow_IMetInst)
	: (setShadow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShadow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setShadow(final com.apple.jobjc.appkit.NSShadow shadow){
			final com.apple.jobjc.Invoke.MsgSend setShadow_IMetInst = get_setShadow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShadow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, shadow);
		setShadow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubviews_IMetInst(){
		return ((setSubviews_IMetInst != null)
	? (setSubviews_IMetInst)
	: (setSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubviews:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubviews(final com.apple.jobjc.foundation.NSArray newSubviews){
			final com.apple.jobjc.Invoke.MsgSend setSubviews_IMetInst = get_setSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubviews_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newSubviews);
		setSubviews_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setToolTip_IMetInst(){
		return ((setToolTip_IMetInst != null)
	? (setToolTip_IMetInst)
	: (setToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setToolTip:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setToolTip(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setToolTip_IMetInst = get_setToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setToolTip_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setToolTip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTranslatesAutoresizingMaskIntoConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTranslatesAutoresizingMaskIntoConstraints_IMetInst(){
		return ((setTranslatesAutoresizingMaskIntoConstraints_IMetInst != null)
	? (setTranslatesAutoresizingMaskIntoConstraints_IMetInst)
	: (setTranslatesAutoresizingMaskIntoConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTranslatesAutoresizingMaskIntoConstraints:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTranslatesAutoresizingMaskIntoConstraints(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTranslatesAutoresizingMaskIntoConstraints_IMetInst = get_setTranslatesAutoresizingMaskIntoConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTranslatesAutoresizingMaskIntoConstraints_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTranslatesAutoresizingMaskIntoConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUpGState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUpGState_IMetInst(){
		return ((setUpGState_IMetInst != null)
	? (setUpGState_IMetInst)
	: (setUpGState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUpGState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void setUpGState(){
			final com.apple.jobjc.Invoke.MsgSend setUpGState_IMetInst = get_setUpGState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUpGState_IMetInst.init(nativeBuffer, this);
		setUpGState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWantsBestResolutionOpenGLSurface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWantsBestResolutionOpenGLSurface_IMetInst(){
		return ((setWantsBestResolutionOpenGLSurface_IMetInst != null)
	? (setWantsBestResolutionOpenGLSurface_IMetInst)
	: (setWantsBestResolutionOpenGLSurface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWantsBestResolutionOpenGLSurface:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWantsBestResolutionOpenGLSurface(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWantsBestResolutionOpenGLSurface_IMetInst = get_setWantsBestResolutionOpenGLSurface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWantsBestResolutionOpenGLSurface_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWantsBestResolutionOpenGLSurface_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWantsLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWantsLayer_IMetInst(){
		return ((setWantsLayer_IMetInst != null)
	? (setWantsLayer_IMetInst)
	: (setWantsLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWantsLayer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWantsLayer(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWantsLayer_IMetInst = get_setWantsLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWantsLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWantsLayer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWantsRestingTouches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWantsRestingTouches_IMetInst(){
		return ((setWantsRestingTouches_IMetInst != null)
	? (setWantsRestingTouches_IMetInst)
	: (setWantsRestingTouches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWantsRestingTouches:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWantsRestingTouches(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWantsRestingTouches_IMetInst = get_setWantsRestingTouches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWantsRestingTouches_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWantsRestingTouches_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shadow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shadow_IMetInst(){
		return ((shadow_IMetInst != null)
	? (shadow_IMetInst)
	: (shadow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shadow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSShadow shadow(){
			final com.apple.jobjc.Invoke.MsgSend shadow_IMetInst = get_shadow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shadow_IMetInst.init(nativeBuffer, this);
		shadow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSShadow returnValue = (com.apple.jobjc.appkit.NSShadow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldDelayWindowOrderingForEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldDelayWindowOrderingForEvent_IMetInst(){
		return ((shouldDelayWindowOrderingForEvent_IMetInst != null)
	? (shouldDelayWindowOrderingForEvent_IMetInst)
	: (shouldDelayWindowOrderingForEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldDelayWindowOrderingForEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldDelayWindowOrderingForEvent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend shouldDelayWindowOrderingForEvent_IMetInst = get_shouldDelayWindowOrderingForEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldDelayWindowOrderingForEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		shouldDelayWindowOrderingForEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldDrawColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldDrawColor_IMetInst(){
		return ((shouldDrawColor_IMetInst != null)
	? (shouldDrawColor_IMetInst)
	: (shouldDrawColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldDrawColor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldDrawColor(){
			final com.apple.jobjc.Invoke.MsgSend shouldDrawColor_IMetInst = get_shouldDrawColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldDrawColor_IMetInst.init(nativeBuffer, this);
		shouldDrawColor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showDefinitionForAttributedString_atPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showDefinitionForAttributedString_atPoint_IMetInst(){
		return ((showDefinitionForAttributedString_atPoint_IMetInst != null)
	? (showDefinitionForAttributedString_atPoint_IMetInst)
	: (showDefinitionForAttributedString_atPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showDefinitionForAttributedString:atPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void showDefinitionForAttributedString_atPoint(final com.apple.jobjc.foundation.NSAttributedString attrString, final com.apple.jobjc.foundation.NSPoint textBaselineOrigin){
			final com.apple.jobjc.Invoke.MsgSend showDefinitionForAttributedString_atPoint_IMetInst = get_showDefinitionForAttributedString_atPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showDefinitionForAttributedString_atPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, textBaselineOrigin);
		showDefinitionForAttributedString_atPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst(){
		return ((showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst != null)
	? (showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst)
	: (showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showDefinitionForAttributedString:range:options:baselineOriginProvider:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void showDefinitionForAttributedString_range_options_baselineOriginProvider(final com.apple.jobjc.foundation.NSAttributedString attrString, final com.apple.jobjc.foundation.NSRange targetRange, final com.apple.jobjc.foundation.NSDictionary options, final Object /* NSPoint(^)(NSRange) (@, @) */ originProvider){
			final com.apple.jobjc.Invoke.MsgSend showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst = get_showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrString);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, targetRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, originProvider);
		showDefinitionForAttributedString_range_options_baselineOriginProvider_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortSubviewsUsingFunction_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortSubviewsUsingFunction_context_IMetInst(){
		return ((sortSubviewsUsingFunction_context_IMetInst != null)
	? (sortSubviewsUsingFunction_context_IMetInst)
	: (sortSubviewsUsingFunction_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortSubviewsUsingFunction:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void sortSubviewsUsingFunction_context(final Object /* NSComparisonResult(*)(id,id,void*) (^?, ^?) */ compare, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend sortSubviewsUsingFunction_context_IMetInst = get_sortSubviewsUsingFunction_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortSubviewsUsingFunction_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, compare);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		sortSubviewsUsingFunction_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend subviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subviews_IMetInst(){
		return ((subviews_IMetInst != null)
	? (subviews_IMetInst)
	: (subviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subviews", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subviews(){
			final com.apple.jobjc.Invoke.MsgSend subviews_IMetInst = get_subviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subviews_IMetInst.init(nativeBuffer, this);
		subviews_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend superview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superview_IMetInst(){
		return ((superview_IMetInst != null)
	? (superview_IMetInst)
	: (superview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superview", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView superview(){
			final com.apple.jobjc.Invoke.MsgSend superview_IMetInst = get_superview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superview_IMetInst.init(nativeBuffer, this);
		superview_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend trackingAreas_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trackingAreas_IMetInst(){
		return ((trackingAreas_IMetInst != null)
	? (trackingAreas_IMetInst)
	: (trackingAreas_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trackingAreas", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray trackingAreas(){
			final com.apple.jobjc.Invoke.MsgSend trackingAreas_IMetInst = get_trackingAreas_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trackingAreas_IMetInst.init(nativeBuffer, this);
		trackingAreas_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend translateOriginToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_translateOriginToPoint_IMetInst(){
		return ((translateOriginToPoint_IMetInst != null)
	? (translateOriginToPoint_IMetInst)
	: (translateOriginToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "translateOriginToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void translateOriginToPoint(final com.apple.jobjc.foundation.NSPoint translation){
			final com.apple.jobjc.Invoke.MsgSend translateOriginToPoint_IMetInst = get_translateOriginToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		translateOriginToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, translation);
		translateOriginToPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend translateRectsNeedingDisplayInRect_by_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_translateRectsNeedingDisplayInRect_by_IMetInst(){
		return ((translateRectsNeedingDisplayInRect_by_IMetInst != null)
	? (translateRectsNeedingDisplayInRect_by_IMetInst)
	: (translateRectsNeedingDisplayInRect_by_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "translateRectsNeedingDisplayInRect:by:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void translateRectsNeedingDisplayInRect_by(final com.apple.jobjc.foundation.NSRect clipRect, final com.apple.jobjc.foundation.NSSize delta){
			final com.apple.jobjc.Invoke.MsgSend translateRectsNeedingDisplayInRect_by_IMetInst = get_translateRectsNeedingDisplayInRect_by_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		translateRectsNeedingDisplayInRect_by_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, delta);
		translateRectsNeedingDisplayInRect_by_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend translatesAutoresizingMaskIntoConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_translatesAutoresizingMaskIntoConstraints_IMetInst(){
		return ((translatesAutoresizingMaskIntoConstraints_IMetInst != null)
	? (translatesAutoresizingMaskIntoConstraints_IMetInst)
	: (translatesAutoresizingMaskIntoConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "translatesAutoresizingMaskIntoConstraints", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean translatesAutoresizingMaskIntoConstraints(){
			final com.apple.jobjc.Invoke.MsgSend translatesAutoresizingMaskIntoConstraints_IMetInst = get_translatesAutoresizingMaskIntoConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		translatesAutoresizingMaskIntoConstraints_IMetInst.init(nativeBuffer, this);
		translatesAutoresizingMaskIntoConstraints_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unlockFocus_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockFocus_IMetInst(){
		return ((unlockFocus_IMetInst != null)
	? (unlockFocus_IMetInst)
	: (unlockFocus_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockFocus", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unlockFocus(){
			final com.apple.jobjc.Invoke.MsgSend unlockFocus_IMetInst = get_unlockFocus_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockFocus_IMetInst.init(nativeBuffer, this);
		unlockFocus_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend updateConstraints_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateConstraints_IMetInst(){
		return ((updateConstraints_IMetInst != null)
	? (updateConstraints_IMetInst)
	: (updateConstraints_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateConstraints", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateConstraints(){
			final com.apple.jobjc.Invoke.MsgSend updateConstraints_IMetInst = get_updateConstraints_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateConstraints_IMetInst.init(nativeBuffer, this);
		updateConstraints_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateConstraintsForSubtreeIfNeeded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateConstraintsForSubtreeIfNeeded_IMetInst(){
		return ((updateConstraintsForSubtreeIfNeeded_IMetInst != null)
	? (updateConstraintsForSubtreeIfNeeded_IMetInst)
	: (updateConstraintsForSubtreeIfNeeded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateConstraintsForSubtreeIfNeeded", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateConstraintsForSubtreeIfNeeded(){
			final com.apple.jobjc.Invoke.MsgSend updateConstraintsForSubtreeIfNeeded_IMetInst = get_updateConstraintsForSubtreeIfNeeded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateConstraintsForSubtreeIfNeeded_IMetInst.init(nativeBuffer, this);
		updateConstraintsForSubtreeIfNeeded_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateLayer_IMetInst(){
		return ((updateLayer_IMetInst != null)
	? (updateLayer_IMetInst)
	: (updateLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateLayer", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateLayer(){
			final com.apple.jobjc.Invoke.MsgSend updateLayer_IMetInst = get_updateLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateLayer_IMetInst.init(nativeBuffer, this);
		updateLayer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateTrackingAreas_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateTrackingAreas_IMetInst(){
		return ((updateTrackingAreas_IMetInst != null)
	? (updateTrackingAreas_IMetInst)
	: (updateTrackingAreas_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateTrackingAreas", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateTrackingAreas(){
			final com.apple.jobjc.Invoke.MsgSend updateTrackingAreas_IMetInst = get_updateTrackingAreas_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateTrackingAreas_IMetInst.init(nativeBuffer, this);
		updateTrackingAreas_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidChangeBackingProperties_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidChangeBackingProperties_IMetInst(){
		return ((viewDidChangeBackingProperties_IMetInst != null)
	? (viewDidChangeBackingProperties_IMetInst)
	: (viewDidChangeBackingProperties_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidChangeBackingProperties", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidChangeBackingProperties(){
			final com.apple.jobjc.Invoke.MsgSend viewDidChangeBackingProperties_IMetInst = get_viewDidChangeBackingProperties_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidChangeBackingProperties_IMetInst.init(nativeBuffer, this);
		viewDidChangeBackingProperties_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidEndLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidEndLiveResize_IMetInst(){
		return ((viewDidEndLiveResize_IMetInst != null)
	? (viewDidEndLiveResize_IMetInst)
	: (viewDidEndLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidEndLiveResize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidEndLiveResize(){
			final com.apple.jobjc.Invoke.MsgSend viewDidEndLiveResize_IMetInst = get_viewDidEndLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidEndLiveResize_IMetInst.init(nativeBuffer, this);
		viewDidEndLiveResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidHide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidHide_IMetInst(){
		return ((viewDidHide_IMetInst != null)
	? (viewDidHide_IMetInst)
	: (viewDidHide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidHide", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidHide(){
			final com.apple.jobjc.Invoke.MsgSend viewDidHide_IMetInst = get_viewDidHide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidHide_IMetInst.init(nativeBuffer, this);
		viewDidHide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidMoveToSuperview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidMoveToSuperview_IMetInst(){
		return ((viewDidMoveToSuperview_IMetInst != null)
	? (viewDidMoveToSuperview_IMetInst)
	: (viewDidMoveToSuperview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidMoveToSuperview", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidMoveToSuperview(){
			final com.apple.jobjc.Invoke.MsgSend viewDidMoveToSuperview_IMetInst = get_viewDidMoveToSuperview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidMoveToSuperview_IMetInst.init(nativeBuffer, this);
		viewDidMoveToSuperview_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidMoveToWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidMoveToWindow_IMetInst(){
		return ((viewDidMoveToWindow_IMetInst != null)
	? (viewDidMoveToWindow_IMetInst)
	: (viewDidMoveToWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidMoveToWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidMoveToWindow(){
			final com.apple.jobjc.Invoke.MsgSend viewDidMoveToWindow_IMetInst = get_viewDidMoveToWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidMoveToWindow_IMetInst.init(nativeBuffer, this);
		viewDidMoveToWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewDidUnhide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewDidUnhide_IMetInst(){
		return ((viewDidUnhide_IMetInst != null)
	? (viewDidUnhide_IMetInst)
	: (viewDidUnhide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewDidUnhide", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewDidUnhide(){
			final com.apple.jobjc.Invoke.MsgSend viewDidUnhide_IMetInst = get_viewDidUnhide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewDidUnhide_IMetInst.init(nativeBuffer, this);
		viewDidUnhide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewWillDraw_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewWillDraw_IMetInst(){
		return ((viewWillDraw_IMetInst != null)
	? (viewWillDraw_IMetInst)
	: (viewWillDraw_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewWillDraw", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewWillDraw(){
			final com.apple.jobjc.Invoke.MsgSend viewWillDraw_IMetInst = get_viewWillDraw_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewWillDraw_IMetInst.init(nativeBuffer, this);
		viewWillDraw_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewWillMoveToSuperview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewWillMoveToSuperview_IMetInst(){
		return ((viewWillMoveToSuperview_IMetInst != null)
	? (viewWillMoveToSuperview_IMetInst)
	: (viewWillMoveToSuperview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewWillMoveToSuperview:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewWillMoveToSuperview(final com.apple.jobjc.appkit.NSView newSuperview){
			final com.apple.jobjc.Invoke.MsgSend viewWillMoveToSuperview_IMetInst = get_viewWillMoveToSuperview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewWillMoveToSuperview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newSuperview);
		viewWillMoveToSuperview_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewWillMoveToWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewWillMoveToWindow_IMetInst(){
		return ((viewWillMoveToWindow_IMetInst != null)
	? (viewWillMoveToWindow_IMetInst)
	: (viewWillMoveToWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewWillMoveToWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewWillMoveToWindow(final com.apple.jobjc.appkit.NSWindow newWindow){
			final com.apple.jobjc.Invoke.MsgSend viewWillMoveToWindow_IMetInst = get_viewWillMoveToWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewWillMoveToWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newWindow);
		viewWillMoveToWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewWillStartLiveResize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewWillStartLiveResize_IMetInst(){
		return ((viewWillStartLiveResize_IMetInst != null)
	? (viewWillStartLiveResize_IMetInst)
	: (viewWillStartLiveResize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewWillStartLiveResize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void viewWillStartLiveResize(){
			final com.apple.jobjc.Invoke.MsgSend viewWillStartLiveResize_IMetInst = get_viewWillStartLiveResize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewWillStartLiveResize_IMetInst.init(nativeBuffer, this);
		viewWillStartLiveResize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewWithTag_IMetInst(){
		return ((viewWithTag_IMetInst != null)
	? (viewWithTag_IMetInst)
	: (viewWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T viewWithTag(final long aTag){
			final com.apple.jobjc.Invoke.MsgSend viewWithTag_IMetInst = get_viewWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aTag);
		viewWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend visibleRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_visibleRect_IMetInst(){
		return ((visibleRect_IMetInst != null)
	? (visibleRect_IMetInst)
	: (visibleRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "visibleRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect visibleRect(){
			final com.apple.jobjc.Invoke.MsgSend visibleRect_IMetInst = get_visibleRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		visibleRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		visibleRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsBestResolutionOpenGLSurface_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsBestResolutionOpenGLSurface_IMetInst(){
		return ((wantsBestResolutionOpenGLSurface_IMetInst != null)
	? (wantsBestResolutionOpenGLSurface_IMetInst)
	: (wantsBestResolutionOpenGLSurface_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsBestResolutionOpenGLSurface", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsBestResolutionOpenGLSurface(){
			final com.apple.jobjc.Invoke.MsgSend wantsBestResolutionOpenGLSurface_IMetInst = get_wantsBestResolutionOpenGLSurface_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsBestResolutionOpenGLSurface_IMetInst.init(nativeBuffer, this);
		wantsBestResolutionOpenGLSurface_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsDefaultClipping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsDefaultClipping_IMetInst(){
		return ((wantsDefaultClipping_IMetInst != null)
	? (wantsDefaultClipping_IMetInst)
	: (wantsDefaultClipping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsDefaultClipping", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsDefaultClipping(){
			final com.apple.jobjc.Invoke.MsgSend wantsDefaultClipping_IMetInst = get_wantsDefaultClipping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsDefaultClipping_IMetInst.init(nativeBuffer, this);
		wantsDefaultClipping_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsLayer_IMetInst(){
		return ((wantsLayer_IMetInst != null)
	? (wantsLayer_IMetInst)
	: (wantsLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsLayer", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsLayer(){
			final com.apple.jobjc.Invoke.MsgSend wantsLayer_IMetInst = get_wantsLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsLayer_IMetInst.init(nativeBuffer, this);
		wantsLayer_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsRestingTouches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsRestingTouches_IMetInst(){
		return ((wantsRestingTouches_IMetInst != null)
	? (wantsRestingTouches_IMetInst)
	: (wantsRestingTouches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsRestingTouches", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsRestingTouches(){
			final com.apple.jobjc.Invoke.MsgSend wantsRestingTouches_IMetInst = get_wantsRestingTouches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsRestingTouches_IMetInst.init(nativeBuffer, this);
		wantsRestingTouches_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend wantsUpdateLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_wantsUpdateLayer_IMetInst(){
		return ((wantsUpdateLayer_IMetInst != null)
	? (wantsUpdateLayer_IMetInst)
	: (wantsUpdateLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "wantsUpdateLayer", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean wantsUpdateLayer(){
			final com.apple.jobjc.Invoke.MsgSend wantsUpdateLayer_IMetInst = get_wantsUpdateLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		wantsUpdateLayer_IMetInst.init(nativeBuffer, this);
		wantsUpdateLayer_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend widthAdjustLimit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthAdjustLimit_IMetInst(){
		return ((widthAdjustLimit_IMetInst != null)
	? (widthAdjustLimit_IMetInst)
	: (widthAdjustLimit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthAdjustLimit", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double widthAdjustLimit(){
			final com.apple.jobjc.Invoke.MsgSend widthAdjustLimit_IMetInst = get_widthAdjustLimit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthAdjustLimit_IMetInst.init(nativeBuffer, this);
		widthAdjustLimit_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend willRemoveSubview_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willRemoveSubview_IMetInst(){
		return ((willRemoveSubview_IMetInst != null)
	? (willRemoveSubview_IMetInst)
	: (willRemoveSubview_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willRemoveSubview:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void willRemoveSubview(final com.apple.jobjc.appkit.NSView subview){
			final com.apple.jobjc.Invoke.MsgSend willRemoveSubview_IMetInst = get_willRemoveSubview_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willRemoveSubview_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subview);
		willRemoveSubview_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_IMetInst(){
		return ((window_IMetInst != null)
	? (window_IMetInst)
	: (window_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow window(){
			final com.apple.jobjc.Invoke.MsgSend window_IMetInst = get_window_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_IMetInst.init(nativeBuffer, this);
		window_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeEPSInsideRect_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeEPSInsideRect_toPasteboard_IMetInst(){
		return ((writeEPSInsideRect_toPasteboard_IMetInst != null)
	? (writeEPSInsideRect_toPasteboard_IMetInst)
	: (writeEPSInsideRect_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeEPSInsideRect:toPasteboard:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writeEPSInsideRect_toPasteboard(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend writeEPSInsideRect_toPasteboard_IMetInst = get_writeEPSInsideRect_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeEPSInsideRect_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		writeEPSInsideRect_toPasteboard_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend writePDFInsideRect_toPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writePDFInsideRect_toPasteboard_IMetInst(){
		return ((writePDFInsideRect_toPasteboard_IMetInst != null)
	? (writePDFInsideRect_toPasteboard_IMetInst)
	: (writePDFInsideRect_toPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writePDFInsideRect:toPasteboard:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void writePDFInsideRect_toPasteboard(final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend writePDFInsideRect_toPasteboard_IMetInst = get_writePDFInsideRect_toPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writePDFInsideRect_toPasteboard_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		writePDFInsideRect_toPasteboard_IMetInst.invoke(nativeBuffer);
		
		
	}

}
