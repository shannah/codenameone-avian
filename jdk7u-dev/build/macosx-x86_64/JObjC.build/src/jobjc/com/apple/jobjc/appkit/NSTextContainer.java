package com.apple.jobjc.appkit;

public  class NSTextContainer extends com.apple.jobjc.foundation.NSObject {
	public NSTextContainer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextContainer(final NSTextContainer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend containerSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containerSize_IMetInst(){
		return ((containerSize_IMetInst != null)
	? (containerSize_IMetInst)
	: (containerSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containerSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize containerSize(){
			final com.apple.jobjc.Invoke.MsgSend containerSize_IMetInst = get_containerSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containerSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		containerSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsPoint_IMetInst(){
		return ((containsPoint_IMetInst != null)
	? (containsPoint_IMetInst)
	: (containsPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean containsPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend containsPoint_IMetInst = get_containsPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		containsPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend heightTracksTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_heightTracksTextView_IMetInst(){
		return ((heightTracksTextView_IMetInst != null)
	? (heightTracksTextView_IMetInst)
	: (heightTracksTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "heightTracksTextView", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean heightTracksTextView(){
			final com.apple.jobjc.Invoke.MsgSend heightTracksTextView_IMetInst = get_heightTracksTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		heightTracksTextView_IMetInst.init(nativeBuffer, this);
		heightTracksTextView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerSize_IMetInst(){
		return ((initWithContainerSize_IMetInst != null)
	? (initWithContainerSize_IMetInst)
	: (initWithContainerSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerSize_IMetInst = get_initWithContainerSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		initWithContainerSize_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSimpleRectangularTextContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSimpleRectangularTextContainer_IMetInst(){
		return ((isSimpleRectangularTextContainer_IMetInst != null)
	? (isSimpleRectangularTextContainer_IMetInst)
	: (isSimpleRectangularTextContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSimpleRectangularTextContainer", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSimpleRectangularTextContainer(){
			final com.apple.jobjc.Invoke.MsgSend isSimpleRectangularTextContainer_IMetInst = get_isSimpleRectangularTextContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSimpleRectangularTextContainer_IMetInst.init(nativeBuffer, this);
		isSimpleRectangularTextContainer_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layoutManager_IMetInst(){
		return ((layoutManager_IMetInst != null)
	? (layoutManager_IMetInst)
	: (layoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layoutManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSLayoutManager layoutManager(){
			final com.apple.jobjc.Invoke.MsgSend layoutManager_IMetInst = get_layoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layoutManager_IMetInst.init(nativeBuffer, this);
		layoutManager_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSLayoutManager returnValue = (com.apple.jobjc.appkit.NSLayoutManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentPadding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentPadding_IMetInst(){
		return ((lineFragmentPadding_IMetInst != null)
	? (lineFragmentPadding_IMetInst)
	: (lineFragmentPadding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentPadding", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineFragmentPadding(){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentPadding_IMetInst = get_lineFragmentPadding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentPadding_IMetInst.init(nativeBuffer, this);
		lineFragmentPadding_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst(){
		return ((lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst != null)
	? (lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst)
	: (lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineFragmentRectForProposedRect:sweepDirection:movementDirection:remainingRect:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSRect lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect(final com.apple.jobjc.foundation.NSRect proposedRect, final long sweepDirection, final long movementDirection, final Object /* NSRectPointer (^{_NSRect={_NSPoint=ff}{_NSSize=ff}}, ^{CGRect={CGPoint=dd}{CGSize=dd}}) */ remainingRect){
			final com.apple.jobjc.Invoke.MsgSend lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst = get_lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, proposedRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, sweepDirection);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, movementDirection);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, remainingRect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		lineFragmentRectForProposedRect_sweepDirection_movementDirection_remainingRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceLayoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceLayoutManager_IMetInst(){
		return ((replaceLayoutManager_IMetInst != null)
	? (replaceLayoutManager_IMetInst)
	: (replaceLayoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceLayoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceLayoutManager(final com.apple.jobjc.appkit.NSLayoutManager newLayoutManager){
			final com.apple.jobjc.Invoke.MsgSend replaceLayoutManager_IMetInst = get_replaceLayoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceLayoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newLayoutManager);
		replaceLayoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContainerSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContainerSize_IMetInst(){
		return ((setContainerSize_IMetInst != null)
	? (setContainerSize_IMetInst)
	: (setContainerSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContainerSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContainerSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setContainerSize_IMetInst = get_setContainerSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContainerSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setContainerSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeightTracksTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeightTracksTextView_IMetInst(){
		return ((setHeightTracksTextView_IMetInst != null)
	? (setHeightTracksTextView_IMetInst)
	: (setHeightTracksTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeightTracksTextView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHeightTracksTextView(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHeightTracksTextView_IMetInst = get_setHeightTracksTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeightTracksTextView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHeightTracksTextView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLayoutManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLayoutManager_IMetInst(){
		return ((setLayoutManager_IMetInst != null)
	? (setLayoutManager_IMetInst)
	: (setLayoutManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLayoutManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLayoutManager(final com.apple.jobjc.appkit.NSLayoutManager layoutManager){
			final com.apple.jobjc.Invoke.MsgSend setLayoutManager_IMetInst = get_setLayoutManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLayoutManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutManager);
		setLayoutManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineFragmentPadding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineFragmentPadding_IMetInst(){
		return ((setLineFragmentPadding_IMetInst != null)
	? (setLineFragmentPadding_IMetInst)
	: (setLineFragmentPadding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineFragmentPadding:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineFragmentPadding(final double pad){
			final com.apple.jobjc.Invoke.MsgSend setLineFragmentPadding_IMetInst = get_setLineFragmentPadding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineFragmentPadding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, pad);
		setLineFragmentPadding_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextView_IMetInst(){
		return ((setTextView_IMetInst != null)
	? (setTextView_IMetInst)
	: (setTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextView(final com.apple.jobjc.appkit.NSTextView textView){
			final com.apple.jobjc.Invoke.MsgSend setTextView_IMetInst = get_setTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textView);
		setTextView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWidthTracksTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidthTracksTextView_IMetInst(){
		return ((setWidthTracksTextView_IMetInst != null)
	? (setWidthTracksTextView_IMetInst)
	: (setWidthTracksTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidthTracksTextView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWidthTracksTextView(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWidthTracksTextView_IMetInst = get_setWidthTracksTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidthTracksTextView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWidthTracksTextView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textView_IMetInst(){
		return ((textView_IMetInst != null)
	? (textView_IMetInst)
	: (textView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextView textView(){
			final com.apple.jobjc.Invoke.MsgSend textView_IMetInst = get_textView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textView_IMetInst.init(nativeBuffer, this);
		textView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextView returnValue = (com.apple.jobjc.appkit.NSTextView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend widthTracksTextView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthTracksTextView_IMetInst(){
		return ((widthTracksTextView_IMetInst != null)
	? (widthTracksTextView_IMetInst)
	: (widthTracksTextView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthTracksTextView", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean widthTracksTextView(){
			final com.apple.jobjc.Invoke.MsgSend widthTracksTextView_IMetInst = get_widthTracksTextView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthTracksTextView_IMetInst.init(nativeBuffer, this);
		widthTracksTextView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
