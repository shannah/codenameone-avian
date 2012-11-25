package com.apple.jobjc.appkit;

public  class NSTableHeaderCell extends com.apple.jobjc.appkit.NSTextFieldCell {
	public NSTableHeaderCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableHeaderCell(final NSTableHeaderCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst(){
		return ((drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst != null)
	? (drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst)
	: (drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawSortIndicatorWithFrame:inView:ascending:priority:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void drawSortIndicatorWithFrame_inView_ascending_priority(final com.apple.jobjc.foundation.NSRect cellFrame, final com.apple.jobjc.appkit.NSView controlView, final boolean ascending, final long priority){
			final com.apple.jobjc.Invoke.MsgSend drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst = get_drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, cellFrame);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, controlView);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, priority);
		drawSortIndicatorWithFrame_inView_ascending_priority_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortIndicatorRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortIndicatorRectForBounds_IMetInst(){
		return ((sortIndicatorRectForBounds_IMetInst != null)
	? (sortIndicatorRectForBounds_IMetInst)
	: (sortIndicatorRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortIndicatorRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect sortIndicatorRectForBounds(final com.apple.jobjc.foundation.NSRect theRect){
			final com.apple.jobjc.Invoke.MsgSend sortIndicatorRectForBounds_IMetInst = get_sortIndicatorRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortIndicatorRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, theRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		sortIndicatorRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
