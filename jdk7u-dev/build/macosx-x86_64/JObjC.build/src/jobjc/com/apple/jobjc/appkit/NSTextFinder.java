package com.apple.jobjc.appkit;

public  class NSTextFinder extends com.apple.jobjc.foundation.NSObject {
	public NSTextFinder(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextFinder(final NSTextFinder obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cancelFindIndicator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelFindIndicator_IMetInst(){
		return ((cancelFindIndicator_IMetInst != null)
	? (cancelFindIndicator_IMetInst)
	: (cancelFindIndicator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelFindIndicator", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelFindIndicator(){
			final com.apple.jobjc.Invoke.MsgSend cancelFindIndicator_IMetInst = get_cancelFindIndicator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelFindIndicator_IMetInst.init(nativeBuffer, this);
		cancelFindIndicator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend client_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_client_IMetInst(){
		return ((client_IMetInst != null)
	? (client_IMetInst)
	: (client_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "client", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T client(){
			final com.apple.jobjc.Invoke.MsgSend client_IMetInst = get_client_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		client_IMetInst.init(nativeBuffer, this);
		client_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findBarContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findBarContainer_IMetInst(){
		return ((findBarContainer_IMetInst != null)
	? (findBarContainer_IMetInst)
	: (findBarContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findBarContainer", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T findBarContainer(){
			final com.apple.jobjc.Invoke.MsgSend findBarContainer_IMetInst = get_findBarContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findBarContainer_IMetInst.init(nativeBuffer, this);
		findBarContainer_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findIndicatorNeedsUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findIndicatorNeedsUpdate_IMetInst(){
		return ((findIndicatorNeedsUpdate_IMetInst != null)
	? (findIndicatorNeedsUpdate_IMetInst)
	: (findIndicatorNeedsUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findIndicatorNeedsUpdate", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean findIndicatorNeedsUpdate(){
			final com.apple.jobjc.Invoke.MsgSend findIndicatorNeedsUpdate_IMetInst = get_findIndicatorNeedsUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findIndicatorNeedsUpdate_IMetInst.init(nativeBuffer, this);
		findIndicatorNeedsUpdate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend incrementalMatchRanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_incrementalMatchRanges_IMetInst(){
		return ((incrementalMatchRanges_IMetInst != null)
	? (incrementalMatchRanges_IMetInst)
	: (incrementalMatchRanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "incrementalMatchRanges", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray incrementalMatchRanges(){
			final com.apple.jobjc.Invoke.MsgSend incrementalMatchRanges_IMetInst = get_incrementalMatchRanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		incrementalMatchRanges_IMetInst.init(nativeBuffer, this);
		incrementalMatchRanges_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend incrementalSearchingShouldDimContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_incrementalSearchingShouldDimContentView_IMetInst(){
		return ((incrementalSearchingShouldDimContentView_IMetInst != null)
	? (incrementalSearchingShouldDimContentView_IMetInst)
	: (incrementalSearchingShouldDimContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "incrementalSearchingShouldDimContentView", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean incrementalSearchingShouldDimContentView(){
			final com.apple.jobjc.Invoke.MsgSend incrementalSearchingShouldDimContentView_IMetInst = get_incrementalSearchingShouldDimContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		incrementalSearchingShouldDimContentView_IMetInst.init(nativeBuffer, this);
		incrementalSearchingShouldDimContentView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend isIncrementalSearchingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isIncrementalSearchingEnabled_IMetInst(){
		return ((isIncrementalSearchingEnabled_IMetInst != null)
	? (isIncrementalSearchingEnabled_IMetInst)
	: (isIncrementalSearchingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isIncrementalSearchingEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isIncrementalSearchingEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isIncrementalSearchingEnabled_IMetInst = get_isIncrementalSearchingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isIncrementalSearchingEnabled_IMetInst.init(nativeBuffer, this);
		isIncrementalSearchingEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteClientStringWillChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteClientStringWillChange_IMetInst(){
		return ((noteClientStringWillChange_IMetInst != null)
	? (noteClientStringWillChange_IMetInst)
	: (noteClientStringWillChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteClientStringWillChange", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteClientStringWillChange(){
			final com.apple.jobjc.Invoke.MsgSend noteClientStringWillChange_IMetInst = get_noteClientStringWillChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteClientStringWillChange_IMetInst.init(nativeBuffer, this);
		noteClientStringWillChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performAction_IMetInst(){
		return ((performAction_IMetInst != null)
	? (performAction_IMetInst)
	: (performAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void performAction(final long op){
			final com.apple.jobjc.Invoke.MsgSend performAction_IMetInst = get_performAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, op);
		performAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setClient_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setClient_IMetInst(){
		return ((setClient_IMetInst != null)
	? (setClient_IMetInst)
	: (setClient_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setClient:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setClient(final com.apple.jobjc.ID client){
			final com.apple.jobjc.Invoke.MsgSend setClient_IMetInst = get_setClient_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setClient_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		setClient_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFindBarContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFindBarContainer_IMetInst(){
		return ((setFindBarContainer_IMetInst != null)
	? (setFindBarContainer_IMetInst)
	: (setFindBarContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFindBarContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFindBarContainer(final com.apple.jobjc.ID findBarContainer){
			final com.apple.jobjc.Invoke.MsgSend setFindBarContainer_IMetInst = get_setFindBarContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFindBarContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, findBarContainer);
		setFindBarContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFindIndicatorNeedsUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFindIndicatorNeedsUpdate_IMetInst(){
		return ((setFindIndicatorNeedsUpdate_IMetInst != null)
	? (setFindIndicatorNeedsUpdate_IMetInst)
	: (setFindIndicatorNeedsUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFindIndicatorNeedsUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFindIndicatorNeedsUpdate(final boolean findIndicatorNeedsUpdate){
			final com.apple.jobjc.Invoke.MsgSend setFindIndicatorNeedsUpdate_IMetInst = get_setFindIndicatorNeedsUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFindIndicatorNeedsUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, findIndicatorNeedsUpdate);
		setFindIndicatorNeedsUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncrementalSearchingEnabled_IMetInst(){
		return ((setIncrementalSearchingEnabled_IMetInst != null)
	? (setIncrementalSearchingEnabled_IMetInst)
	: (setIncrementalSearchingEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncrementalSearchingEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncrementalSearchingEnabled(final boolean incrementalSearchingEnabled){
			final com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingEnabled_IMetInst = get_setIncrementalSearchingEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncrementalSearchingEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, incrementalSearchingEnabled);
		setIncrementalSearchingEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingShouldDimContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIncrementalSearchingShouldDimContentView_IMetInst(){
		return ((setIncrementalSearchingShouldDimContentView_IMetInst != null)
	? (setIncrementalSearchingShouldDimContentView_IMetInst)
	: (setIncrementalSearchingShouldDimContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIncrementalSearchingShouldDimContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIncrementalSearchingShouldDimContentView(final boolean incrementalSearchingShouldDimContentView){
			final com.apple.jobjc.Invoke.MsgSend setIncrementalSearchingShouldDimContentView_IMetInst = get_setIncrementalSearchingShouldDimContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIncrementalSearchingShouldDimContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, incrementalSearchingShouldDimContentView);
		setIncrementalSearchingShouldDimContentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validateAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateAction_IMetInst(){
		return ((validateAction_IMetInst != null)
	? (validateAction_IMetInst)
	: (validateAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateAction:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean validateAction(final long op){
			final com.apple.jobjc.Invoke.MsgSend validateAction_IMetInst = get_validateAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, op);
		validateAction_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
