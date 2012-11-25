package com.apple.jobjc.appkit;

public  class NSTextBlock extends com.apple.jobjc.foundation.NSObject {
	public NSTextBlock(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextBlock(final NSTextBlock obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend borderColorForEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderColorForEdge_IMetInst(){
		return ((borderColorForEdge_IMetInst != null)
	? (borderColorForEdge_IMetInst)
	: (borderColorForEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderColorForEdge:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSColor borderColorForEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend borderColorForEdge_IMetInst = get_borderColorForEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderColorForEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		borderColorForEdge_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst(){
		return ((boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst != null)
	? (boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst)
	: (boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundsRectForContentRect:inRect:textContainer:characterRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect boundsRectForContentRect_inRect_textContainer_characterRange(final com.apple.jobjc.foundation.NSRect contentRect, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst = get_boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundsRectForContentRect_inRect_textContainer_characterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentWidth_IMetInst(){
		return ((contentWidth_IMetInst != null)
	? (contentWidth_IMetInst)
	: (contentWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double contentWidth(){
			final com.apple.jobjc.Invoke.MsgSend contentWidth_IMetInst = get_contentWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentWidth_IMetInst.init(nativeBuffer, this);
		contentWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentWidthValueType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentWidthValueType_IMetInst(){
		return ((contentWidthValueType_IMetInst != null)
	? (contentWidthValueType_IMetInst)
	: (contentWidthValueType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentWidthValueType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long contentWidthValueType(){
			final com.apple.jobjc.Invoke.MsgSend contentWidthValueType_IMetInst = get_contentWidthValueType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentWidthValueType_IMetInst.init(nativeBuffer, this);
		contentWidthValueType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst(){
		return ((drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst != null)
	? (drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst)
	: (drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBackgroundWithFrame:inView:characterRange:layoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawBackgroundWithFrame_inView_characterRange_layoutManager(final com.apple.jobjc.foundation.NSRect frameRect, final com.apple.jobjc.appkit.NSView controlView, final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.appkit.NSLayoutManager layoutManager){
			final com.apple.jobjc.Invoke.MsgSend drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst = get_drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		drawBackgroundWithFrame_inView_characterRange_layoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst(){
		return ((rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst != null)
	? (rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst)
	: (rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForLayoutAtPoint:inRect:textContainer:characterRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rectForLayoutAtPoint_inRect_textContainer_characterRange(final com.apple.jobjc.foundation.NSPoint startingPoint, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst = get_rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, startingPoint);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForLayoutAtPoint_inRect_textContainer_characterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setBorderColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderColor_IMetInst(){
		return ((setBorderColor_IMetInst != null)
	? (setBorderColor_IMetInst)
	: (setBorderColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBorderColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBorderColor_IMetInst = get_setBorderColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBorderColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBorderColor_forEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderColor_forEdge_IMetInst(){
		return ((setBorderColor_forEdge_IMetInst != null)
	? (setBorderColor_forEdge_IMetInst)
	: (setBorderColor_forEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderColor:forEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setBorderColor_forEdge(final com.apple.jobjc.appkit.NSColor color, final long edge){
			final com.apple.jobjc.Invoke.MsgSend setBorderColor_forEdge_IMetInst = get_setBorderColor_forEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderColor_forEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setBorderColor_forEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentWidth_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentWidth_type_IMetInst(){
		return ((setContentWidth_type_IMetInst != null)
	? (setContentWidth_type_IMetInst)
	: (setContentWidth_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentWidth:type:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setContentWidth_type(final double val, final long type){
			final com.apple.jobjc.Invoke.MsgSend setContentWidth_type_IMetInst = get_setContentWidth_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentWidth_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		setContentWidth_type_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_type_forDimension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_type_forDimension_IMetInst(){
		return ((setValue_type_forDimension_IMetInst != null)
	? (setValue_type_forDimension_IMetInst)
	: (setValue_type_forDimension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:type:forDimension:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setValue_type_forDimension(final double val, final long type, final long dimension){
			final com.apple.jobjc.Invoke.MsgSend setValue_type_forDimension_IMetInst = get_setValue_type_forDimension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_type_forDimension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dimension);
		setValue_type_forDimension_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalAlignment_IMetInst(){
		return ((setVerticalAlignment_IMetInst != null)
	? (setVerticalAlignment_IMetInst)
	: (setVerticalAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setVerticalAlignment(final long alignment){
			final com.apple.jobjc.Invoke.MsgSend setVerticalAlignment_IMetInst = get_setVerticalAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, alignment);
		setVerticalAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWidth_type_forLayer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidth_type_forLayer_IMetInst(){
		return ((setWidth_type_forLayer_IMetInst != null)
	? (setWidth_type_forLayer_IMetInst)
	: (setWidth_type_forLayer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidth:type:forLayer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWidth_type_forLayer(final double val, final long type, final long layer){
			final com.apple.jobjc.Invoke.MsgSend setWidth_type_forLayer_IMetInst = get_setWidth_type_forLayer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidth_type_forLayer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, layer);
		setWidth_type_forLayer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWidth_type_forLayer_edge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidth_type_forLayer_edge_IMetInst(){
		return ((setWidth_type_forLayer_edge_IMetInst != null)
	? (setWidth_type_forLayer_edge_IMetInst)
	: (setWidth_type_forLayer_edge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidth:type:forLayer:edge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setWidth_type_forLayer_edge(final double val, final long type, final long layer, final long edge){
			final com.apple.jobjc.Invoke.MsgSend setWidth_type_forLayer_edge_IMetInst = get_setWidth_type_forLayer_edge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidth_type_forLayer_edge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, val);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, layer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setWidth_type_forLayer_edge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForDimension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForDimension_IMetInst(){
		return ((valueForDimension_IMetInst != null)
	? (valueForDimension_IMetInst)
	: (valueForDimension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForDimension:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public double valueForDimension(final long dimension){
			final com.apple.jobjc.Invoke.MsgSend valueForDimension_IMetInst = get_valueForDimension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForDimension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dimension);
		valueForDimension_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueTypeForDimension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueTypeForDimension_IMetInst(){
		return ((valueTypeForDimension_IMetInst != null)
	? (valueTypeForDimension_IMetInst)
	: (valueTypeForDimension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueTypeForDimension:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long valueTypeForDimension(final long dimension){
			final com.apple.jobjc.Invoke.MsgSend valueTypeForDimension_IMetInst = get_valueTypeForDimension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueTypeForDimension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dimension);
		valueTypeForDimension_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalAlignment_IMetInst(){
		return ((verticalAlignment_IMetInst != null)
	? (verticalAlignment_IMetInst)
	: (verticalAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalAlignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long verticalAlignment(){
			final com.apple.jobjc.Invoke.MsgSend verticalAlignment_IMetInst = get_verticalAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalAlignment_IMetInst.init(nativeBuffer, this);
		verticalAlignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend widthForLayer_edge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthForLayer_edge_IMetInst(){
		return ((widthForLayer_edge_IMetInst != null)
	? (widthForLayer_edge_IMetInst)
	: (widthForLayer_edge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthForLayer:edge:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public double widthForLayer_edge(final long layer, final long edge){
			final com.apple.jobjc.Invoke.MsgSend widthForLayer_edge_IMetInst = get_widthForLayer_edge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthForLayer_edge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, layer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		widthForLayer_edge_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend widthValueTypeForLayer_edge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthValueTypeForLayer_edge_IMetInst(){
		return ((widthValueTypeForLayer_edge_IMetInst != null)
	? (widthValueTypeForLayer_edge_IMetInst)
	: (widthValueTypeForLayer_edge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthValueTypeForLayer:edge:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public long widthValueTypeForLayer_edge(final long layer, final long edge){
			final com.apple.jobjc.Invoke.MsgSend widthValueTypeForLayer_edge_IMetInst = get_widthValueTypeForLayer_edge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthValueTypeForLayer_edge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, layer);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		widthValueTypeForLayer_edge_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
