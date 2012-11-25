package com.apple.jobjc.appkit;

public  class NSSplitView extends com.apple.jobjc.appkit.NSView {
	public NSSplitView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSplitView(final NSSplitView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend adjustSubviews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_adjustSubviews_IMetInst(){
		return ((adjustSubviews_IMetInst != null)
	? (adjustSubviews_IMetInst)
	: (adjustSubviews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "adjustSubviews", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void adjustSubviews(){
			final com.apple.jobjc.Invoke.MsgSend adjustSubviews_IMetInst = get_adjustSubviews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		adjustSubviews_IMetInst.init(nativeBuffer, this);
		adjustSubviews_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosaveName_IMetInst(){
		return ((autosaveName_IMetInst != null)
	? (autosaveName_IMetInst)
	: (autosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString autosaveName(){
			final com.apple.jobjc.Invoke.MsgSend autosaveName_IMetInst = get_autosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosaveName_IMetInst.init(nativeBuffer, this);
		autosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend dividerColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dividerColor_IMetInst(){
		return ((dividerColor_IMetInst != null)
	? (dividerColor_IMetInst)
	: (dividerColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dividerColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor dividerColor(){
			final com.apple.jobjc.Invoke.MsgSend dividerColor_IMetInst = get_dividerColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dividerColor_IMetInst.init(nativeBuffer, this);
		dividerColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dividerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dividerStyle_IMetInst(){
		return ((dividerStyle_IMetInst != null)
	? (dividerStyle_IMetInst)
	: (dividerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dividerStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long dividerStyle(){
			final com.apple.jobjc.Invoke.MsgSend dividerStyle_IMetInst = get_dividerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dividerStyle_IMetInst.init(nativeBuffer, this);
		dividerStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dividerThickness_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dividerThickness_IMetInst(){
		return ((dividerThickness_IMetInst != null)
	? (dividerThickness_IMetInst)
	: (dividerThickness_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dividerThickness", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double dividerThickness(){
			final com.apple.jobjc.Invoke.MsgSend dividerThickness_IMetInst = get_dividerThickness_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dividerThickness_IMetInst.init(nativeBuffer, this);
		dividerThickness_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawDividerInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawDividerInRect_IMetInst(){
		return ((drawDividerInRect_IMetInst != null)
	? (drawDividerInRect_IMetInst)
	: (drawDividerInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawDividerInRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawDividerInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend drawDividerInRect_IMetInst = get_drawDividerInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawDividerInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		drawDividerInRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend holdingPriorityForSubviewAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_holdingPriorityForSubviewAtIndex_IMetInst(){
		return ((holdingPriorityForSubviewAtIndex_IMetInst != null)
	? (holdingPriorityForSubviewAtIndex_IMetInst)
	: (holdingPriorityForSubviewAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "holdingPriorityForSubviewAtIndex:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public float holdingPriorityForSubviewAtIndex(final long subviewIndex){
			final com.apple.jobjc.Invoke.MsgSend holdingPriorityForSubviewAtIndex_IMetInst = get_holdingPriorityForSubviewAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		holdingPriorityForSubviewAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, subviewIndex);
		holdingPriorityForSubviewAtIndex_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isPaneSplitter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isPaneSplitter_IMetInst(){
		return ((isPaneSplitter_IMetInst != null)
	? (isPaneSplitter_IMetInst)
	: (isPaneSplitter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isPaneSplitter", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isPaneSplitter(){
			final com.apple.jobjc.Invoke.MsgSend isPaneSplitter_IMetInst = get_isPaneSplitter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isPaneSplitter_IMetInst.init(nativeBuffer, this);
		isPaneSplitter_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubviewCollapsed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubviewCollapsed_IMetInst(){
		return ((isSubviewCollapsed_IMetInst != null)
	? (isSubviewCollapsed_IMetInst)
	: (isSubviewCollapsed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubviewCollapsed:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSubviewCollapsed(final com.apple.jobjc.appkit.NSView subview){
			final com.apple.jobjc.Invoke.MsgSend isSubviewCollapsed_IMetInst = get_isSubviewCollapsed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubviewCollapsed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subview);
		isSubviewCollapsed_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVertical_IMetInst(){
		return ((isVertical_IMetInst != null)
	? (isVertical_IMetInst)
	: (isVertical_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVertical", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVertical(){
			final com.apple.jobjc.Invoke.MsgSend isVertical_IMetInst = get_isVertical_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVertical_IMetInst.init(nativeBuffer, this);
		isVertical_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxPossiblePositionOfDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxPossiblePositionOfDividerAtIndex_IMetInst(){
		return ((maxPossiblePositionOfDividerAtIndex_IMetInst != null)
	? (maxPossiblePositionOfDividerAtIndex_IMetInst)
	: (maxPossiblePositionOfDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxPossiblePositionOfDividerAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double maxPossiblePositionOfDividerAtIndex(final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend maxPossiblePositionOfDividerAtIndex_IMetInst = get_maxPossiblePositionOfDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxPossiblePositionOfDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		maxPossiblePositionOfDividerAtIndex_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minPossiblePositionOfDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minPossiblePositionOfDividerAtIndex_IMetInst(){
		return ((minPossiblePositionOfDividerAtIndex_IMetInst != null)
	? (minPossiblePositionOfDividerAtIndex_IMetInst)
	: (minPossiblePositionOfDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minPossiblePositionOfDividerAtIndex:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double minPossiblePositionOfDividerAtIndex(final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend minPossiblePositionOfDividerAtIndex_IMetInst = get_minPossiblePositionOfDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minPossiblePositionOfDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		minPossiblePositionOfDividerAtIndex_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosaveName_IMetInst(){
		return ((setAutosaveName_IMetInst != null)
	? (setAutosaveName_IMetInst)
	: (setAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAutosaveName(final com.apple.jobjc.foundation.NSString autosaveName){
			final com.apple.jobjc.Invoke.MsgSend setAutosaveName_IMetInst = get_setAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, autosaveName);
		setAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDividerStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDividerStyle_IMetInst(){
		return ((setDividerStyle_IMetInst != null)
	? (setDividerStyle_IMetInst)
	: (setDividerStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDividerStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDividerStyle(final long dividerStyle){
			final com.apple.jobjc.Invoke.MsgSend setDividerStyle_IMetInst = get_setDividerStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDividerStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerStyle);
		setDividerStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHoldingPriority_forSubviewAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHoldingPriority_forSubviewAtIndex_IMetInst(){
		return ((setHoldingPriority_forSubviewAtIndex_IMetInst != null)
	? (setHoldingPriority_forSubviewAtIndex_IMetInst)
	: (setHoldingPriority_forSubviewAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHoldingPriority:forSubviewAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setHoldingPriority_forSubviewAtIndex(final float priority, final long subviewIndex){
			final com.apple.jobjc.Invoke.MsgSend setHoldingPriority_forSubviewAtIndex_IMetInst = get_setHoldingPriority_forSubviewAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHoldingPriority_forSubviewAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, priority);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, subviewIndex);
		setHoldingPriority_forSubviewAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIsPaneSplitter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIsPaneSplitter_IMetInst(){
		return ((setIsPaneSplitter_IMetInst != null)
	? (setIsPaneSplitter_IMetInst)
	: (setIsPaneSplitter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIsPaneSplitter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIsPaneSplitter(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setIsPaneSplitter_IMetInst = get_setIsPaneSplitter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIsPaneSplitter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setIsPaneSplitter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPosition_ofDividerAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPosition_ofDividerAtIndex_IMetInst(){
		return ((setPosition_ofDividerAtIndex_IMetInst != null)
	? (setPosition_ofDividerAtIndex_IMetInst)
	: (setPosition_ofDividerAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPosition:ofDividerAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPosition_ofDividerAtIndex(final double position, final long dividerIndex){
			final com.apple.jobjc.Invoke.MsgSend setPosition_ofDividerAtIndex_IMetInst = get_setPosition_ofDividerAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPosition_ofDividerAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, position);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, dividerIndex);
		setPosition_ofDividerAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVertical_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVertical_IMetInst(){
		return ((setVertical_IMetInst != null)
	? (setVertical_IMetInst)
	: (setVertical_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVertical:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setVertical(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setVertical_IMetInst = get_setVertical_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVertical_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setVertical_IMetInst.invoke(nativeBuffer);
		
		
	}

}
