package com.apple.jobjc.appkit;

public  class NSTextTable extends com.apple.jobjc.appkit.NSTextBlock {
	public NSTextTable(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextTable(final NSTextTable obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst(){
		return ((boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst != null)
	? (boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst)
	: (boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boundsRectForBlock:contentRect:inRect:textContainer:characterRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect boundsRectForBlock_contentRect_inRect_textContainer_characterRange(final com.apple.jobjc.appkit.NSTextTableBlock block, final com.apple.jobjc.foundation.NSRect contentRect, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst = get_boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentRect);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		boundsRectForBlock_contentRect_inRect_textContainer_characterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collapsesBorders_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collapsesBorders_IMetInst(){
		return ((collapsesBorders_IMetInst != null)
	? (collapsesBorders_IMetInst)
	: (collapsesBorders_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collapsesBorders", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean collapsesBorders(){
			final com.apple.jobjc.Invoke.MsgSend collapsesBorders_IMetInst = get_collapsesBorders_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collapsesBorders_IMetInst.init(nativeBuffer, this);
		collapsesBorders_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst(){
		return ((drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst != null)
	? (drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst)
	: (drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBackgroundForBlock:withFrame:inView:characterRange:layoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager(final com.apple.jobjc.appkit.NSTextTableBlock block, final com.apple.jobjc.foundation.NSRect frameRect, final com.apple.jobjc.appkit.NSView controlView, final com.apple.jobjc.foundation.NSRange charRange, final com.apple.jobjc.appkit.NSLayoutManager layoutManager){
			final com.apple.jobjc.Invoke.MsgSend drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst = get_drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		drawBackgroundForBlock_withFrame_inView_characterRange_layoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hidesEmptyCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hidesEmptyCells_IMetInst(){
		return ((hidesEmptyCells_IMetInst != null)
	? (hidesEmptyCells_IMetInst)
	: (hidesEmptyCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hidesEmptyCells", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hidesEmptyCells(){
			final com.apple.jobjc.Invoke.MsgSend hidesEmptyCells_IMetInst = get_hidesEmptyCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hidesEmptyCells_IMetInst.init(nativeBuffer, this);
		hidesEmptyCells_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutAlgorithm_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutAlgorithm_IMetInst(){
		return ((layoutAlgorithm_IMetInst != null)
	? (layoutAlgorithm_IMetInst)
	: (layoutAlgorithm_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutAlgorithm", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long layoutAlgorithm(){
			final com.apple.jobjc.Invoke.MsgSend layoutAlgorithm_IMetInst = get_layoutAlgorithm_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutAlgorithm_IMetInst.init(nativeBuffer, this);
		layoutAlgorithm_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfColumns_IMetInst(){
		return ((numberOfColumns_IMetInst != null)
	? (numberOfColumns_IMetInst)
	: (numberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfColumns", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long numberOfColumns(){
			final com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst = get_numberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfColumns_IMetInst.init(nativeBuffer, this);
		numberOfColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst(){
		return ((rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst != null)
	? (rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst)
	: (rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectForBlock:layoutAtPoint:inRect:textContainer:characterRange:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect rectForBlock_layoutAtPoint_inRect_textContainer_characterRange(final com.apple.jobjc.appkit.NSTextTableBlock block, final com.apple.jobjc.foundation.NSPoint startingPoint, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.appkit.NSTextContainer textContainer, final com.apple.jobjc.foundation.NSRange charRange){
			final com.apple.jobjc.Invoke.MsgSend rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst = get_rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, startingPoint);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textContainer);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, charRange);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectForBlock_layoutAtPoint_inRect_textContainer_characterRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCollapsesBorders_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCollapsesBorders_IMetInst(){
		return ((setCollapsesBorders_IMetInst != null)
	? (setCollapsesBorders_IMetInst)
	: (setCollapsesBorders_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCollapsesBorders:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCollapsesBorders(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCollapsesBorders_IMetInst = get_setCollapsesBorders_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCollapsesBorders_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCollapsesBorders_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHidesEmptyCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHidesEmptyCells_IMetInst(){
		return ((setHidesEmptyCells_IMetInst != null)
	? (setHidesEmptyCells_IMetInst)
	: (setHidesEmptyCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHidesEmptyCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHidesEmptyCells(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHidesEmptyCells_IMetInst = get_setHidesEmptyCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHidesEmptyCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHidesEmptyCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayoutAlgorithm_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayoutAlgorithm_IMetInst(){
		return ((setLayoutAlgorithm_IMetInst != null)
	? (setLayoutAlgorithm_IMetInst)
	: (setLayoutAlgorithm_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayoutAlgorithm:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLayoutAlgorithm(final long algorithm){
			final com.apple.jobjc.Invoke.MsgSend setLayoutAlgorithm_IMetInst = get_setLayoutAlgorithm_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayoutAlgorithm_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, algorithm);
		setLayoutAlgorithm_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNumberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNumberOfColumns_IMetInst(){
		return ((setNumberOfColumns_IMetInst != null)
	? (setNumberOfColumns_IMetInst)
	: (setNumberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNumberOfColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setNumberOfColumns(final long numCols){
			final com.apple.jobjc.Invoke.MsgSend setNumberOfColumns_IMetInst = get_setNumberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNumberOfColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, numCols);
		setNumberOfColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

}
