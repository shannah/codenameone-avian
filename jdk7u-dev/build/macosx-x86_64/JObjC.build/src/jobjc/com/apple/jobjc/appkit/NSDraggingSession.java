package com.apple.jobjc.appkit;

public  class NSDraggingSession extends com.apple.jobjc.foundation.NSObject {
	public NSDraggingSession(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDraggingSession(final NSDraggingSession obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend animatesToStartingPositionsOnCancelOrFail_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animatesToStartingPositionsOnCancelOrFail_IMetInst(){
		return ((animatesToStartingPositionsOnCancelOrFail_IMetInst != null)
	? (animatesToStartingPositionsOnCancelOrFail_IMetInst)
	: (animatesToStartingPositionsOnCancelOrFail_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animatesToStartingPositionsOnCancelOrFail", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean animatesToStartingPositionsOnCancelOrFail(){
			final com.apple.jobjc.Invoke.MsgSend animatesToStartingPositionsOnCancelOrFail_IMetInst = get_animatesToStartingPositionsOnCancelOrFail_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animatesToStartingPositionsOnCancelOrFail_IMetInst.init(nativeBuffer, this);
		animatesToStartingPositionsOnCancelOrFail_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingFormation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingFormation_IMetInst(){
		return ((draggingFormation_IMetInst != null)
	? (draggingFormation_IMetInst)
	: (draggingFormation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingFormation", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingFormation(){
			final com.apple.jobjc.Invoke.MsgSend draggingFormation_IMetInst = get_draggingFormation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingFormation_IMetInst.init(nativeBuffer, this);
		draggingFormation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingLeaderIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingLeaderIndex_IMetInst(){
		return ((draggingLeaderIndex_IMetInst != null)
	? (draggingLeaderIndex_IMetInst)
	: (draggingLeaderIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingLeaderIndex", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingLeaderIndex(){
			final com.apple.jobjc.Invoke.MsgSend draggingLeaderIndex_IMetInst = get_draggingLeaderIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingLeaderIndex_IMetInst.init(nativeBuffer, this);
		draggingLeaderIndex_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingLocation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingLocation_IMetInst(){
		return ((draggingLocation_IMetInst != null)
	? (draggingLocation_IMetInst)
	: (draggingLocation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingLocation", com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSPoint draggingLocation(){
			final com.apple.jobjc.Invoke.MsgSend draggingLocation_IMetInst = get_draggingLocation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingLocation_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		draggingLocation_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingPasteboard_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingPasteboard_IMetInst(){
		return ((draggingPasteboard_IMetInst != null)
	? (draggingPasteboard_IMetInst)
	: (draggingPasteboard_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingPasteboard", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard draggingPasteboard(){
			final com.apple.jobjc.Invoke.MsgSend draggingPasteboard_IMetInst = get_draggingPasteboard_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingPasteboard_IMetInst.init(nativeBuffer, this);
		draggingPasteboard_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingSequenceNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingSequenceNumber_IMetInst(){
		return ((draggingSequenceNumber_IMetInst != null)
	? (draggingSequenceNumber_IMetInst)
	: (draggingSequenceNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingSequenceNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingSequenceNumber(){
			final com.apple.jobjc.Invoke.MsgSend draggingSequenceNumber_IMetInst = get_draggingSequenceNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingSequenceNumber_IMetInst.init(nativeBuffer, this);
		draggingSequenceNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst(){
		return ((enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst != null)
	? (enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst)
	: (enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateDraggingItemsWithOptions:forView:classes:searchOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock(final long enumOpts, final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSArray classArray, final com.apple.jobjc.foundation.NSDictionary searchOptions, final Object /* void(^)(NSDraggingItem*,NSInteger,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst = get_enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enumOpts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchOptions);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateDraggingItemsWithOptions_forView_classes_searchOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimatesToStartingPositionsOnCancelOrFail_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimatesToStartingPositionsOnCancelOrFail_IMetInst(){
		return ((setAnimatesToStartingPositionsOnCancelOrFail_IMetInst != null)
	? (setAnimatesToStartingPositionsOnCancelOrFail_IMetInst)
	: (setAnimatesToStartingPositionsOnCancelOrFail_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimatesToStartingPositionsOnCancelOrFail:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAnimatesToStartingPositionsOnCancelOrFail(final boolean animatesToStartingPositionsOnCancelOrFail){
			final com.apple.jobjc.Invoke.MsgSend setAnimatesToStartingPositionsOnCancelOrFail_IMetInst = get_setAnimatesToStartingPositionsOnCancelOrFail_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimatesToStartingPositionsOnCancelOrFail_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, animatesToStartingPositionsOnCancelOrFail);
		setAnimatesToStartingPositionsOnCancelOrFail_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingFormation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingFormation_IMetInst(){
		return ((setDraggingFormation_IMetInst != null)
	? (setDraggingFormation_IMetInst)
	: (setDraggingFormation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingFormation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDraggingFormation(final long draggingFormation){
			final com.apple.jobjc.Invoke.MsgSend setDraggingFormation_IMetInst = get_setDraggingFormation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingFormation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, draggingFormation);
		setDraggingFormation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingLeaderIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingLeaderIndex_IMetInst(){
		return ((setDraggingLeaderIndex_IMetInst != null)
	? (setDraggingLeaderIndex_IMetInst)
	: (setDraggingLeaderIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingLeaderIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDraggingLeaderIndex(final long draggingLeaderIndex){
			final com.apple.jobjc.Invoke.MsgSend setDraggingLeaderIndex_IMetInst = get_setDraggingLeaderIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingLeaderIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, draggingLeaderIndex);
		setDraggingLeaderIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

}
