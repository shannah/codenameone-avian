package com.apple.jobjc.appkit;

public  class NSScrollView extends com.apple.jobjc.appkit.NSView {
	public NSScrollView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScrollView(final NSScrollView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMagnification_IMetInst(){
		return ((allowsMagnification_IMetInst != null)
	? (allowsMagnification_IMetInst)
	: (allowsMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMagnification", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMagnification(){
			final com.apple.jobjc.Invoke.MsgSend allowsMagnification_IMetInst = get_allowsMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMagnification_IMetInst.init(nativeBuffer, this);
		allowsMagnification_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autohidesScrollers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autohidesScrollers_IMetInst(){
		return ((autohidesScrollers_IMetInst != null)
	? (autohidesScrollers_IMetInst)
	: (autohidesScrollers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autohidesScrollers", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autohidesScrollers(){
			final com.apple.jobjc.Invoke.MsgSend autohidesScrollers_IMetInst = get_autohidesScrollers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autohidesScrollers_IMetInst.init(nativeBuffer, this);
		autohidesScrollers_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend borderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderType_IMetInst(){
		return ((borderType_IMetInst != null)
	? (borderType_IMetInst)
	: (borderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long borderType(){
			final com.apple.jobjc.Invoke.MsgSend borderType_IMetInst = get_borderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderType_IMetInst.init(nativeBuffer, this);
		borderType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentSize_IMetInst(){
		return ((contentSize_IMetInst != null)
	? (contentSize_IMetInst)
	: (contentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentSize(){
			final com.apple.jobjc.Invoke.MsgSend contentSize_IMetInst = get_contentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentView_IMetInst(){
		return ((contentView_IMetInst != null)
	? (contentView_IMetInst)
	: (contentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSClipView contentView(){
			final com.apple.jobjc.Invoke.MsgSend contentView_IMetInst = get_contentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentView_IMetInst.init(nativeBuffer, this);
		contentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSClipView returnValue = (com.apple.jobjc.appkit.NSClipView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend findBarPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findBarPosition_IMetInst(){
		return ((findBarPosition_IMetInst != null)
	? (findBarPosition_IMetInst)
	: (findBarPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findBarPosition", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long findBarPosition(){
			final com.apple.jobjc.Invoke.MsgSend findBarPosition_IMetInst = get_findBarPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findBarPosition_IMetInst.init(nativeBuffer, this);
		findBarPosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend flashScrollers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_flashScrollers_IMetInst(){
		return ((flashScrollers_IMetInst != null)
	? (flashScrollers_IMetInst)
	: (flashScrollers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "flashScrollers", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void flashScrollers(){
			final com.apple.jobjc.Invoke.MsgSend flashScrollers_IMetInst = get_flashScrollers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		flashScrollers_IMetInst.init(nativeBuffer, this);
		flashScrollers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hasHorizontalRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasHorizontalRuler_IMetInst(){
		return ((hasHorizontalRuler_IMetInst != null)
	? (hasHorizontalRuler_IMetInst)
	: (hasHorizontalRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasHorizontalRuler", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasHorizontalRuler(){
			final com.apple.jobjc.Invoke.MsgSend hasHorizontalRuler_IMetInst = get_hasHorizontalRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasHorizontalRuler_IMetInst.init(nativeBuffer, this);
		hasHorizontalRuler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasHorizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasHorizontalScroller_IMetInst(){
		return ((hasHorizontalScroller_IMetInst != null)
	? (hasHorizontalScroller_IMetInst)
	: (hasHorizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasHorizontalScroller", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasHorizontalScroller(){
			final com.apple.jobjc.Invoke.MsgSend hasHorizontalScroller_IMetInst = get_hasHorizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasHorizontalScroller_IMetInst.init(nativeBuffer, this);
		hasHorizontalScroller_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasVerticalRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasVerticalRuler_IMetInst(){
		return ((hasVerticalRuler_IMetInst != null)
	? (hasVerticalRuler_IMetInst)
	: (hasVerticalRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasVerticalRuler", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasVerticalRuler(){
			final com.apple.jobjc.Invoke.MsgSend hasVerticalRuler_IMetInst = get_hasVerticalRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasVerticalRuler_IMetInst.init(nativeBuffer, this);
		hasVerticalRuler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasVerticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasVerticalScroller_IMetInst(){
		return ((hasVerticalScroller_IMetInst != null)
	? (hasVerticalScroller_IMetInst)
	: (hasVerticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasVerticalScroller", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasVerticalScroller(){
			final com.apple.jobjc.Invoke.MsgSend hasVerticalScroller_IMetInst = get_hasVerticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasVerticalScroller_IMetInst.init(nativeBuffer, this);
		hasVerticalScroller_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalLineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalLineScroll_IMetInst(){
		return ((horizontalLineScroll_IMetInst != null)
	? (horizontalLineScroll_IMetInst)
	: (horizontalLineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalLineScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double horizontalLineScroll(){
			final com.apple.jobjc.Invoke.MsgSend horizontalLineScroll_IMetInst = get_horizontalLineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalLineScroll_IMetInst.init(nativeBuffer, this);
		horizontalLineScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalPageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalPageScroll_IMetInst(){
		return ((horizontalPageScroll_IMetInst != null)
	? (horizontalPageScroll_IMetInst)
	: (horizontalPageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalPageScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double horizontalPageScroll(){
			final com.apple.jobjc.Invoke.MsgSend horizontalPageScroll_IMetInst = get_horizontalPageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalPageScroll_IMetInst.init(nativeBuffer, this);
		horizontalPageScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalRulerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalRulerView_IMetInst(){
		return ((horizontalRulerView_IMetInst != null)
	? (horizontalRulerView_IMetInst)
	: (horizontalRulerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalRulerView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRulerView horizontalRulerView(){
			final com.apple.jobjc.Invoke.MsgSend horizontalRulerView_IMetInst = get_horizontalRulerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalRulerView_IMetInst.init(nativeBuffer, this);
		horizontalRulerView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRulerView returnValue = (com.apple.jobjc.appkit.NSRulerView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalScrollElasticity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalScrollElasticity_IMetInst(){
		return ((horizontalScrollElasticity_IMetInst != null)
	? (horizontalScrollElasticity_IMetInst)
	: (horizontalScrollElasticity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalScrollElasticity", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long horizontalScrollElasticity(){
			final com.apple.jobjc.Invoke.MsgSend horizontalScrollElasticity_IMetInst = get_horizontalScrollElasticity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalScrollElasticity_IMetInst.init(nativeBuffer, this);
		horizontalScrollElasticity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend horizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_horizontalScroller_IMetInst(){
		return ((horizontalScroller_IMetInst != null)
	? (horizontalScroller_IMetInst)
	: (horizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "horizontalScroller", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScroller horizontalScroller(){
			final com.apple.jobjc.Invoke.MsgSend horizontalScroller_IMetInst = get_horizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		horizontalScroller_IMetInst.init(nativeBuffer, this);
		horizontalScroller_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScroller returnValue = (com.apple.jobjc.appkit.NSScroller) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineScroll_IMetInst(){
		return ((lineScroll_IMetInst != null)
	? (lineScroll_IMetInst)
	: (lineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineScroll(){
			final com.apple.jobjc.Invoke.MsgSend lineScroll_IMetInst = get_lineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineScroll_IMetInst.init(nativeBuffer, this);
		lineScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend magnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magnification_IMetInst(){
		return ((magnification_IMetInst != null)
	? (magnification_IMetInst)
	: (magnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magnification", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double magnification(){
			final com.apple.jobjc.Invoke.MsgSend magnification_IMetInst = get_magnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magnification_IMetInst.init(nativeBuffer, this);
		magnification_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend magnifyToFitRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_magnifyToFitRect_IMetInst(){
		return ((magnifyToFitRect_IMetInst != null)
	? (magnifyToFitRect_IMetInst)
	: (magnifyToFitRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "magnifyToFitRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void magnifyToFitRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend magnifyToFitRect_IMetInst = get_magnifyToFitRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		magnifyToFitRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		magnifyToFitRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend maxMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxMagnification_IMetInst(){
		return ((maxMagnification_IMetInst != null)
	? (maxMagnification_IMetInst)
	: (maxMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxMagnification", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double maxMagnification(){
			final com.apple.jobjc.Invoke.MsgSend maxMagnification_IMetInst = get_maxMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxMagnification_IMetInst.init(nativeBuffer, this);
		maxMagnification_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minMagnification_IMetInst(){
		return ((minMagnification_IMetInst != null)
	? (minMagnification_IMetInst)
	: (minMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minMagnification", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double minMagnification(){
			final com.apple.jobjc.Invoke.MsgSend minMagnification_IMetInst = get_minMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minMagnification_IMetInst.init(nativeBuffer, this);
		minMagnification_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageScroll_IMetInst(){
		return ((pageScroll_IMetInst != null)
	? (pageScroll_IMetInst)
	: (pageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double pageScroll(){
			final com.apple.jobjc.Invoke.MsgSend pageScroll_IMetInst = get_pageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageScroll_IMetInst.init(nativeBuffer, this);
		pageScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reflectScrolledClipView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reflectScrolledClipView_IMetInst(){
		return ((reflectScrolledClipView_IMetInst != null)
	? (reflectScrolledClipView_IMetInst)
	: (reflectScrolledClipView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reflectScrolledClipView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void reflectScrolledClipView(final com.apple.jobjc.appkit.NSClipView cView){
			final com.apple.jobjc.Invoke.MsgSend reflectScrolledClipView_IMetInst = get_reflectScrolledClipView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reflectScrolledClipView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cView);
		reflectScrolledClipView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rulersVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rulersVisible_IMetInst(){
		return ((rulersVisible_IMetInst != null)
	? (rulersVisible_IMetInst)
	: (rulersVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rulersVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean rulersVisible(){
			final com.apple.jobjc.Invoke.MsgSend rulersVisible_IMetInst = get_rulersVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rulersVisible_IMetInst.init(nativeBuffer, this);
		rulersVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollWheel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollWheel_IMetInst(){
		return ((scrollWheel_IMetInst != null)
	? (scrollWheel_IMetInst)
	: (scrollWheel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollWheel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollWheel(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend scrollWheel_IMetInst = get_scrollWheel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollWheel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		scrollWheel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerKnobStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerKnobStyle_IMetInst(){
		return ((scrollerKnobStyle_IMetInst != null)
	? (scrollerKnobStyle_IMetInst)
	: (scrollerKnobStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerKnobStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long scrollerKnobStyle(){
			final com.apple.jobjc.Invoke.MsgSend scrollerKnobStyle_IMetInst = get_scrollerKnobStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerKnobStyle_IMetInst.init(nativeBuffer, this);
		scrollerKnobStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollerStyle_IMetInst(){
		return ((scrollerStyle_IMetInst != null)
	? (scrollerStyle_IMetInst)
	: (scrollerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollerStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long scrollerStyle(){
			final com.apple.jobjc.Invoke.MsgSend scrollerStyle_IMetInst = get_scrollerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollerStyle_IMetInst.init(nativeBuffer, this);
		scrollerStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollsDynamically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollsDynamically_IMetInst(){
		return ((scrollsDynamically_IMetInst != null)
	? (scrollsDynamically_IMetInst)
	: (scrollsDynamically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollsDynamically", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean scrollsDynamically(){
			final com.apple.jobjc.Invoke.MsgSend scrollsDynamically_IMetInst = get_scrollsDynamically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollsDynamically_IMetInst.init(nativeBuffer, this);
		scrollsDynamically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMagnification_IMetInst(){
		return ((setAllowsMagnification_IMetInst != null)
	? (setAllowsMagnification_IMetInst)
	: (setAllowsMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMagnification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMagnification(final boolean allowsMagnification){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMagnification_IMetInst = get_setAllowsMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMagnification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allowsMagnification);
		setAllowsMagnification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutohidesScrollers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutohidesScrollers_IMetInst(){
		return ((setAutohidesScrollers_IMetInst != null)
	? (setAutohidesScrollers_IMetInst)
	: (setAutohidesScrollers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutohidesScrollers:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutohidesScrollers(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutohidesScrollers_IMetInst = get_setAutohidesScrollers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutohidesScrollers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutohidesScrollers_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setBorderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderType_IMetInst(){
		return ((setBorderType_IMetInst != null)
	? (setBorderType_IMetInst)
	: (setBorderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBorderType(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setBorderType_IMetInst = get_setBorderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		setBorderType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentView_IMetInst(){
		return ((setContentView_IMetInst != null)
	? (setContentView_IMetInst)
	: (setContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentView(final com.apple.jobjc.appkit.NSClipView contentView){
			final com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst = get_setContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentView);
		setContentView_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setFindBarPosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFindBarPosition_IMetInst(){
		return ((setFindBarPosition_IMetInst != null)
	? (setFindBarPosition_IMetInst)
	: (setFindBarPosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFindBarPosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setFindBarPosition(final long position){
			final com.apple.jobjc.Invoke.MsgSend setFindBarPosition_IMetInst = get_setFindBarPosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFindBarPosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, position);
		setFindBarPosition_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasHorizontalRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasHorizontalRuler_IMetInst(){
		return ((setHasHorizontalRuler_IMetInst != null)
	? (setHasHorizontalRuler_IMetInst)
	: (setHasHorizontalRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasHorizontalRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasHorizontalRuler(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasHorizontalRuler_IMetInst = get_setHasHorizontalRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasHorizontalRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasHorizontalRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasHorizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasHorizontalScroller_IMetInst(){
		return ((setHasHorizontalScroller_IMetInst != null)
	? (setHasHorizontalScroller_IMetInst)
	: (setHasHorizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasHorizontalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasHorizontalScroller(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasHorizontalScroller_IMetInst = get_setHasHorizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasHorizontalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasHorizontalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasVerticalRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasVerticalRuler_IMetInst(){
		return ((setHasVerticalRuler_IMetInst != null)
	? (setHasVerticalRuler_IMetInst)
	: (setHasVerticalRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasVerticalRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasVerticalRuler(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasVerticalRuler_IMetInst = get_setHasVerticalRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasVerticalRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasVerticalRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasVerticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasVerticalScroller_IMetInst(){
		return ((setHasVerticalScroller_IMetInst != null)
	? (setHasVerticalScroller_IMetInst)
	: (setHasVerticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasVerticalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasVerticalScroller(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasVerticalScroller_IMetInst = get_setHasVerticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasVerticalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasVerticalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalLineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalLineScroll_IMetInst(){
		return ((setHorizontalLineScroll_IMetInst != null)
	? (setHorizontalLineScroll_IMetInst)
	: (setHorizontalLineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalLineScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setHorizontalLineScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalLineScroll_IMetInst = get_setHorizontalLineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalLineScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setHorizontalLineScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalPageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalPageScroll_IMetInst(){
		return ((setHorizontalPageScroll_IMetInst != null)
	? (setHorizontalPageScroll_IMetInst)
	: (setHorizontalPageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalPageScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setHorizontalPageScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalPageScroll_IMetInst = get_setHorizontalPageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalPageScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setHorizontalPageScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalRulerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalRulerView_IMetInst(){
		return ((setHorizontalRulerView_IMetInst != null)
	? (setHorizontalRulerView_IMetInst)
	: (setHorizontalRulerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalRulerView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHorizontalRulerView(final com.apple.jobjc.appkit.NSRulerView ruler){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalRulerView_IMetInst = get_setHorizontalRulerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalRulerView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		setHorizontalRulerView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalScrollElasticity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalScrollElasticity_IMetInst(){
		return ((setHorizontalScrollElasticity_IMetInst != null)
	? (setHorizontalScrollElasticity_IMetInst)
	: (setHorizontalScrollElasticity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalScrollElasticity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setHorizontalScrollElasticity(final long elasticity){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalScrollElasticity_IMetInst = get_setHorizontalScrollElasticity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalScrollElasticity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, elasticity);
		setHorizontalScrollElasticity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontalScroller_IMetInst(){
		return ((setHorizontalScroller_IMetInst != null)
	? (setHorizontalScroller_IMetInst)
	: (setHorizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHorizontalScroller(final com.apple.jobjc.appkit.NSScroller anObject){
			final com.apple.jobjc.Invoke.MsgSend setHorizontalScroller_IMetInst = get_setHorizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setHorizontalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineScroll_IMetInst(){
		return ((setLineScroll_IMetInst != null)
	? (setLineScroll_IMetInst)
	: (setLineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setLineScroll_IMetInst = get_setLineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setLineScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMagnification_IMetInst(){
		return ((setMagnification_IMetInst != null)
	? (setMagnification_IMetInst)
	: (setMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMagnification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMagnification(final double magnification){
			final com.apple.jobjc.Invoke.MsgSend setMagnification_IMetInst = get_setMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMagnification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, magnification);
		setMagnification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMagnification_centeredAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMagnification_centeredAtPoint_IMetInst(){
		return ((setMagnification_centeredAtPoint_IMetInst != null)
	? (setMagnification_centeredAtPoint_IMetInst)
	: (setMagnification_centeredAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMagnification:centeredAtPoint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void setMagnification_centeredAtPoint(final double magnification, final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend setMagnification_centeredAtPoint_IMetInst = get_setMagnification_centeredAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMagnification_centeredAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, magnification);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		setMagnification_centeredAtPoint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxMagnification_IMetInst(){
		return ((setMaxMagnification_IMetInst != null)
	? (setMaxMagnification_IMetInst)
	: (setMaxMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxMagnification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMaxMagnification(final double maxMagnification){
			final com.apple.jobjc.Invoke.MsgSend setMaxMagnification_IMetInst = get_setMaxMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxMagnification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, maxMagnification);
		setMaxMagnification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinMagnification_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinMagnification_IMetInst(){
		return ((setMinMagnification_IMetInst != null)
	? (setMinMagnification_IMetInst)
	: (setMinMagnification_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinMagnification:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMinMagnification(final double minMagnification){
			final com.apple.jobjc.Invoke.MsgSend setMinMagnification_IMetInst = get_setMinMagnification_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinMagnification_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, minMagnification);
		setMinMagnification_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPageScroll_IMetInst(){
		return ((setPageScroll_IMetInst != null)
	? (setPageScroll_IMetInst)
	: (setPageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPageScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setPageScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setPageScroll_IMetInst = get_setPageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPageScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setPageScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRulersVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRulersVisible_IMetInst(){
		return ((setRulersVisible_IMetInst != null)
	? (setRulersVisible_IMetInst)
	: (setRulersVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRulersVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRulersVisible(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRulersVisible_IMetInst = get_setRulersVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRulersVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRulersVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollerKnobStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollerKnobStyle_IMetInst(){
		return ((setScrollerKnobStyle_IMetInst != null)
	? (setScrollerKnobStyle_IMetInst)
	: (setScrollerKnobStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollerKnobStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setScrollerKnobStyle(final long newScrollerKnobStyle){
			final com.apple.jobjc.Invoke.MsgSend setScrollerKnobStyle_IMetInst = get_setScrollerKnobStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollerKnobStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newScrollerKnobStyle);
		setScrollerKnobStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollerStyle_IMetInst(){
		return ((setScrollerStyle_IMetInst != null)
	? (setScrollerStyle_IMetInst)
	: (setScrollerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollerStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setScrollerStyle(final long newScrollerStyle){
			final com.apple.jobjc.Invoke.MsgSend setScrollerStyle_IMetInst = get_setScrollerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollerStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newScrollerStyle);
		setScrollerStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollsDynamically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollsDynamically_IMetInst(){
		return ((setScrollsDynamically_IMetInst != null)
	? (setScrollsDynamically_IMetInst)
	: (setScrollsDynamically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollsDynamically:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setScrollsDynamically(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setScrollsDynamically_IMetInst = get_setScrollsDynamically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollsDynamically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setScrollsDynamically_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesPredominantAxisScrolling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesPredominantAxisScrolling_IMetInst(){
		return ((setUsesPredominantAxisScrolling_IMetInst != null)
	? (setUsesPredominantAxisScrolling_IMetInst)
	: (setUsesPredominantAxisScrolling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesPredominantAxisScrolling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesPredominantAxisScrolling(final boolean predominantAxisScrolling){
			final com.apple.jobjc.Invoke.MsgSend setUsesPredominantAxisScrolling_IMetInst = get_setUsesPredominantAxisScrolling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesPredominantAxisScrolling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, predominantAxisScrolling);
		setUsesPredominantAxisScrolling_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalLineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalLineScroll_IMetInst(){
		return ((setVerticalLineScroll_IMetInst != null)
	? (setVerticalLineScroll_IMetInst)
	: (setVerticalLineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalLineScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setVerticalLineScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setVerticalLineScroll_IMetInst = get_setVerticalLineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalLineScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setVerticalLineScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalPageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalPageScroll_IMetInst(){
		return ((setVerticalPageScroll_IMetInst != null)
	? (setVerticalPageScroll_IMetInst)
	: (setVerticalPageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalPageScroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setVerticalPageScroll(final double value){
			final com.apple.jobjc.Invoke.MsgSend setVerticalPageScroll_IMetInst = get_setVerticalPageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalPageScroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, value);
		setVerticalPageScroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalRulerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalRulerView_IMetInst(){
		return ((setVerticalRulerView_IMetInst != null)
	? (setVerticalRulerView_IMetInst)
	: (setVerticalRulerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalRulerView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVerticalRulerView(final com.apple.jobjc.appkit.NSRulerView ruler){
			final com.apple.jobjc.Invoke.MsgSend setVerticalRulerView_IMetInst = get_setVerticalRulerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalRulerView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ruler);
		setVerticalRulerView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalScrollElasticity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalScrollElasticity_IMetInst(){
		return ((setVerticalScrollElasticity_IMetInst != null)
	? (setVerticalScrollElasticity_IMetInst)
	: (setVerticalScrollElasticity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalScrollElasticity:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setVerticalScrollElasticity(final long elasticity){
			final com.apple.jobjc.Invoke.MsgSend setVerticalScrollElasticity_IMetInst = get_setVerticalScrollElasticity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalScrollElasticity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, elasticity);
		setVerticalScrollElasticity_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalScroller_IMetInst(){
		return ((setVerticalScroller_IMetInst != null)
	? (setVerticalScroller_IMetInst)
	: (setVerticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVerticalScroller(final com.apple.jobjc.appkit.NSScroller anObject){
			final com.apple.jobjc.Invoke.MsgSend setVerticalScroller_IMetInst = get_setVerticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setVerticalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tile_IMetInst(){
		return ((tile_IMetInst != null)
	? (tile_IMetInst)
	: (tile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tile", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void tile(){
			final com.apple.jobjc.Invoke.MsgSend tile_IMetInst = get_tile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tile_IMetInst.init(nativeBuffer, this);
		tile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesPredominantAxisScrolling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesPredominantAxisScrolling_IMetInst(){
		return ((usesPredominantAxisScrolling_IMetInst != null)
	? (usesPredominantAxisScrolling_IMetInst)
	: (usesPredominantAxisScrolling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesPredominantAxisScrolling", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesPredominantAxisScrolling(){
			final com.apple.jobjc.Invoke.MsgSend usesPredominantAxisScrolling_IMetInst = get_usesPredominantAxisScrolling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesPredominantAxisScrolling_IMetInst.init(nativeBuffer, this);
		usesPredominantAxisScrolling_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalLineScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalLineScroll_IMetInst(){
		return ((verticalLineScroll_IMetInst != null)
	? (verticalLineScroll_IMetInst)
	: (verticalLineScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalLineScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double verticalLineScroll(){
			final com.apple.jobjc.Invoke.MsgSend verticalLineScroll_IMetInst = get_verticalLineScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalLineScroll_IMetInst.init(nativeBuffer, this);
		verticalLineScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalPageScroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalPageScroll_IMetInst(){
		return ((verticalPageScroll_IMetInst != null)
	? (verticalPageScroll_IMetInst)
	: (verticalPageScroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalPageScroll", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double verticalPageScroll(){
			final com.apple.jobjc.Invoke.MsgSend verticalPageScroll_IMetInst = get_verticalPageScroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalPageScroll_IMetInst.init(nativeBuffer, this);
		verticalPageScroll_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalRulerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalRulerView_IMetInst(){
		return ((verticalRulerView_IMetInst != null)
	? (verticalRulerView_IMetInst)
	: (verticalRulerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalRulerView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRulerView verticalRulerView(){
			final com.apple.jobjc.Invoke.MsgSend verticalRulerView_IMetInst = get_verticalRulerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalRulerView_IMetInst.init(nativeBuffer, this);
		verticalRulerView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRulerView returnValue = (com.apple.jobjc.appkit.NSRulerView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalScrollElasticity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalScrollElasticity_IMetInst(){
		return ((verticalScrollElasticity_IMetInst != null)
	? (verticalScrollElasticity_IMetInst)
	: (verticalScrollElasticity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalScrollElasticity", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long verticalScrollElasticity(){
			final com.apple.jobjc.Invoke.MsgSend verticalScrollElasticity_IMetInst = get_verticalScrollElasticity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalScrollElasticity_IMetInst.init(nativeBuffer, this);
		verticalScrollElasticity_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalScroller_IMetInst(){
		return ((verticalScroller_IMetInst != null)
	? (verticalScroller_IMetInst)
	: (verticalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalScroller", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSScroller verticalScroller(){
			final com.apple.jobjc.Invoke.MsgSend verticalScroller_IMetInst = get_verticalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalScroller_IMetInst.init(nativeBuffer, this);
		verticalScroller_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSScroller returnValue = (com.apple.jobjc.appkit.NSScroller) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
