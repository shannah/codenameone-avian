package com.apple.jobjc.appkit;

public  class NSPopover extends com.apple.jobjc.appkit.NSResponder {
	public NSPopover(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPopover(final NSPopover obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend animates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animates_IMetInst(){
		return ((animates_IMetInst != null)
	? (animates_IMetInst)
	: (animates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animates", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean animates(){
			final com.apple.jobjc.Invoke.MsgSend animates_IMetInst = get_animates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animates_IMetInst.init(nativeBuffer, this);
		animates_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend appearance_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appearance_IMetInst(){
		return ((appearance_IMetInst != null)
	? (appearance_IMetInst)
	: (appearance_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appearance", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long appearance(){
			final com.apple.jobjc.Invoke.MsgSend appearance_IMetInst = get_appearance_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appearance_IMetInst.init(nativeBuffer, this);
		appearance_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend behavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_behavior_IMetInst(){
		return ((behavior_IMetInst != null)
	? (behavior_IMetInst)
	: (behavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "behavior", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long behavior(){
			final com.apple.jobjc.Invoke.MsgSend behavior_IMetInst = get_behavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		behavior_IMetInst.init(nativeBuffer, this);
		behavior_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend contentViewController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentViewController_IMetInst(){
		return ((contentViewController_IMetInst != null)
	? (contentViewController_IMetInst)
	: (contentViewController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentViewController", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSViewController contentViewController(){
			final com.apple.jobjc.Invoke.MsgSend contentViewController_IMetInst = get_contentViewController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentViewController_IMetInst.init(nativeBuffer, this);
		contentViewController_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSViewController returnValue = (com.apple.jobjc.appkit.NSViewController) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend isShown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isShown_IMetInst(){
		return ((isShown_IMetInst != null)
	? (isShown_IMetInst)
	: (isShown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isShown", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isShown(){
			final com.apple.jobjc.Invoke.MsgSend isShown_IMetInst = get_isShown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isShown_IMetInst.init(nativeBuffer, this);
		isShown_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend positioningRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_positioningRect_IMetInst(){
		return ((positioningRect_IMetInst != null)
	? (positioningRect_IMetInst)
	: (positioningRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "positioningRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect positioningRect(){
			final com.apple.jobjc.Invoke.MsgSend positioningRect_IMetInst = get_positioningRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		positioningRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		positioningRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimates_IMetInst(){
		return ((setAnimates_IMetInst != null)
	? (setAnimates_IMetInst)
	: (setAnimates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimates:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAnimates(final boolean animates){
			final com.apple.jobjc.Invoke.MsgSend setAnimates_IMetInst = get_setAnimates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, animates);
		setAnimates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAppearance_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAppearance_IMetInst(){
		return ((setAppearance_IMetInst != null)
	? (setAppearance_IMetInst)
	: (setAppearance_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAppearance:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setAppearance(final long appearance){
			final com.apple.jobjc.Invoke.MsgSend setAppearance_IMetInst = get_setAppearance_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAppearance_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, appearance);
		setAppearance_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBehavior_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBehavior_IMetInst(){
		return ((setBehavior_IMetInst != null)
	? (setBehavior_IMetInst)
	: (setBehavior_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBehavior:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBehavior(final long behavior){
			final com.apple.jobjc.Invoke.MsgSend setBehavior_IMetInst = get_setBehavior_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBehavior_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, behavior);
		setBehavior_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentSize_IMetInst(){
		return ((setContentSize_IMetInst != null)
	? (setContentSize_IMetInst)
	: (setContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentSize(final com.apple.jobjc.foundation.NSSize contentSize){
			final com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst = get_setContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, contentSize);
		setContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentViewController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentViewController_IMetInst(){
		return ((setContentViewController_IMetInst != null)
	? (setContentViewController_IMetInst)
	: (setContentViewController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentViewController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentViewController(final com.apple.jobjc.appkit.NSViewController contentViewController){
			final com.apple.jobjc.Invoke.MsgSend setContentViewController_IMetInst = get_setContentViewController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentViewController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentViewController);
		setContentViewController_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setPositioningRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPositioningRect_IMetInst(){
		return ((setPositioningRect_IMetInst != null)
	? (setPositioningRect_IMetInst)
	: (setPositioningRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPositioningRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setPositioningRect(final com.apple.jobjc.foundation.NSRect positioningRect){
			final com.apple.jobjc.Invoke.MsgSend setPositioningRect_IMetInst = get_setPositioningRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPositioningRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, positioningRect);
		setPositioningRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showRelativeToRect_ofView_preferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showRelativeToRect_ofView_preferredEdge_IMetInst(){
		return ((showRelativeToRect_ofView_preferredEdge_IMetInst != null)
	? (showRelativeToRect_ofView_preferredEdge_IMetInst)
	: (showRelativeToRect_ofView_preferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showRelativeToRect:ofView:preferredEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void showRelativeToRect_ofView_preferredEdge(final com.apple.jobjc.foundation.NSRect positioningRect, final com.apple.jobjc.appkit.NSView positioningView, final long preferredEdge){
			final com.apple.jobjc.Invoke.MsgSend showRelativeToRect_ofView_preferredEdge_IMetInst = get_showRelativeToRect_ofView_preferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showRelativeToRect_ofView_preferredEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, positioningRect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, positioningView);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, preferredEdge);
		showRelativeToRect_ofView_preferredEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

}
