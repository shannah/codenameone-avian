package com.apple.jobjc.appkit;

public  class NSClipView extends com.apple.jobjc.appkit.NSView {
	public NSClipView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSClipView(final NSClipView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend constrainScrollPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constrainScrollPoint_IMetInst(){
		return ((constrainScrollPoint_IMetInst != null)
	? (constrainScrollPoint_IMetInst)
	: (constrainScrollPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constrainScrollPoint:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint constrainScrollPoint(final com.apple.jobjc.foundation.NSPoint newOrigin){
			final com.apple.jobjc.Invoke.MsgSend constrainScrollPoint_IMetInst = get_constrainScrollPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constrainScrollPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, newOrigin);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		constrainScrollPoint_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copiesOnScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copiesOnScroll_IMetInst(){
		return ((copiesOnScroll_IMetInst != null)
	? (copiesOnScroll_IMetInst)
	: (copiesOnScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copiesOnScroll", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean copiesOnScroll(){
			final com.apple.jobjc.Invoke.MsgSend copiesOnScroll_IMetInst = get_copiesOnScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copiesOnScroll_IMetInst.init(nativeBuffer, this);
		copiesOnScroll_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentCursor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentCursor_IMetInst(){
		return ((documentCursor_IMetInst != null)
	? (documentCursor_IMetInst)
	: (documentCursor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentCursor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCursor documentCursor(){
			final com.apple.jobjc.Invoke.MsgSend documentCursor_IMetInst = get_documentCursor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentCursor_IMetInst.init(nativeBuffer, this);
		documentCursor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCursor returnValue = (com.apple.jobjc.appkit.NSCursor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentRect_IMetInst(){
		return ((documentRect_IMetInst != null)
	? (documentRect_IMetInst)
	: (documentRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect documentRect(){
			final com.apple.jobjc.Invoke.MsgSend documentRect_IMetInst = get_documentRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		documentRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentView_IMetInst(){
		return ((documentView_IMetInst != null)
	? (documentView_IMetInst)
	: (documentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T documentView(){
			final com.apple.jobjc.Invoke.MsgSend documentView_IMetInst = get_documentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentView_IMetInst.init(nativeBuffer, this);
		documentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentVisibleRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentVisibleRect_IMetInst(){
		return ((documentVisibleRect_IMetInst != null)
	? (documentVisibleRect_IMetInst)
	: (documentVisibleRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentVisibleRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect documentVisibleRect(){
			final com.apple.jobjc.Invoke.MsgSend documentVisibleRect_IMetInst = get_documentVisibleRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentVisibleRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		documentVisibleRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollToPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollToPoint_IMetInst(){
		return ((scrollToPoint_IMetInst != null)
	? (scrollToPoint_IMetInst)
	: (scrollToPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollToPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void scrollToPoint(final com.apple.jobjc.foundation.NSPoint newOrigin){
			final com.apple.jobjc.Invoke.MsgSend scrollToPoint_IMetInst = get_scrollToPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollToPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, newOrigin);
		scrollToPoint_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setCopiesOnScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCopiesOnScroll_IMetInst(){
		return ((setCopiesOnScroll_IMetInst != null)
	? (setCopiesOnScroll_IMetInst)
	: (setCopiesOnScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCopiesOnScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCopiesOnScroll(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCopiesOnScroll_IMetInst = get_setCopiesOnScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCopiesOnScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCopiesOnScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocumentCursor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocumentCursor_IMetInst(){
		return ((setDocumentCursor_IMetInst != null)
	? (setDocumentCursor_IMetInst)
	: (setDocumentCursor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocumentCursor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDocumentCursor(final com.apple.jobjc.appkit.NSCursor anObj){
			final com.apple.jobjc.Invoke.MsgSend setDocumentCursor_IMetInst = get_setDocumentCursor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocumentCursor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObj);
		setDocumentCursor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocumentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocumentView_IMetInst(){
		return ((setDocumentView_IMetInst != null)
	? (setDocumentView_IMetInst)
	: (setDocumentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocumentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDocumentView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setDocumentView_IMetInst = get_setDocumentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocumentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setDocumentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewBoundsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewBoundsChanged_IMetInst(){
		return ((viewBoundsChanged_IMetInst != null)
	? (viewBoundsChanged_IMetInst)
	: (viewBoundsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewBoundsChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewBoundsChanged(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend viewBoundsChanged_IMetInst = get_viewBoundsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewBoundsChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		viewBoundsChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewFrameChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewFrameChanged_IMetInst(){
		return ((viewFrameChanged_IMetInst != null)
	? (viewFrameChanged_IMetInst)
	: (viewFrameChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewFrameChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewFrameChanged(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend viewFrameChanged_IMetInst = get_viewFrameChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewFrameChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		viewFrameChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

}
