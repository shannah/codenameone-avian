package com.apple.jobjc.foundation;

public  class NSMetadataQuery extends com.apple.jobjc.foundation.NSObject {
	public NSMetadataQuery(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMetadataQuery(final NSMetadataQuery obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend disableUpdates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableUpdates_IMetInst(){
		return ((disableUpdates_IMetInst != null)
	? (disableUpdates_IMetInst)
	: (disableUpdates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableUpdates(){
			final com.apple.jobjc.Invoke.MsgSend disableUpdates_IMetInst = get_disableUpdates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableUpdates_IMetInst.init(nativeBuffer, this);
		disableUpdates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableUpdates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableUpdates_IMetInst(){
		return ((enableUpdates_IMetInst != null)
	? (enableUpdates_IMetInst)
	: (enableUpdates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableUpdates(){
			final com.apple.jobjc.Invoke.MsgSend enableUpdates_IMetInst = get_enableUpdates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableUpdates_IMetInst.init(nativeBuffer, this);
		enableUpdates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend groupedResults_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupedResults_IMetInst(){
		return ((groupedResults_IMetInst != null)
	? (groupedResults_IMetInst)
	: (groupedResults_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupedResults", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray groupedResults(){
			final com.apple.jobjc.Invoke.MsgSend groupedResults_IMetInst = get_groupedResults_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupedResults_IMetInst.init(nativeBuffer, this);
		groupedResults_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend groupingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupingAttributes_IMetInst(){
		return ((groupingAttributes_IMetInst != null)
	? (groupingAttributes_IMetInst)
	: (groupingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupingAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray groupingAttributes(){
			final com.apple.jobjc.Invoke.MsgSend groupingAttributes_IMetInst = get_groupingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupingAttributes_IMetInst.init(nativeBuffer, this);
		groupingAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfResult_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfResult_IMetInst(){
		return ((indexOfResult_IMetInst != null)
	? (indexOfResult_IMetInst)
	: (indexOfResult_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfResult:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfResult(final com.apple.jobjc.ID result){
			final com.apple.jobjc.Invoke.MsgSend indexOfResult_IMetInst = get_indexOfResult_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfResult_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, result);
		indexOfResult_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend isGathering_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isGathering_IMetInst(){
		return ((isGathering_IMetInst != null)
	? (isGathering_IMetInst)
	: (isGathering_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isGathering", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isGathering(){
			final com.apple.jobjc.Invoke.MsgSend isGathering_IMetInst = get_isGathering_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isGathering_IMetInst.init(nativeBuffer, this);
		isGathering_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isStarted_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isStarted_IMetInst(){
		return ((isStarted_IMetInst != null)
	? (isStarted_IMetInst)
	: (isStarted_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isStarted", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isStarted(){
			final com.apple.jobjc.Invoke.MsgSend isStarted_IMetInst = get_isStarted_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isStarted_IMetInst.init(nativeBuffer, this);
		isStarted_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isStopped_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isStopped_IMetInst(){
		return ((isStopped_IMetInst != null)
	? (isStopped_IMetInst)
	: (isStopped_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isStopped", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isStopped(){
			final com.apple.jobjc.Invoke.MsgSend isStopped_IMetInst = get_isStopped_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isStopped_IMetInst.init(nativeBuffer, this);
		isStopped_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notificationBatchingInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notificationBatchingInterval_IMetInst(){
		return ((notificationBatchingInterval_IMetInst != null)
	? (notificationBatchingInterval_IMetInst)
	: (notificationBatchingInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notificationBatchingInterval", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double notificationBatchingInterval(){
			final com.apple.jobjc.Invoke.MsgSend notificationBatchingInterval_IMetInst = get_notificationBatchingInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notificationBatchingInterval_IMetInst.init(nativeBuffer, this);
		notificationBatchingInterval_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicate_IMetInst(){
		return ((predicate_IMetInst != null)
	? (predicate_IMetInst)
	: (predicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicate(){
			final com.apple.jobjc.Invoke.MsgSend predicate_IMetInst = get_predicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicate_IMetInst.init(nativeBuffer, this);
		predicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultAtIndex_IMetInst(){
		return ((resultAtIndex_IMetInst != null)
	? (resultAtIndex_IMetInst)
	: (resultAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T resultAtIndex(final long idx){
			final com.apple.jobjc.Invoke.MsgSend resultAtIndex_IMetInst = get_resultAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		resultAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resultCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resultCount_IMetInst(){
		return ((resultCount_IMetInst != null)
	? (resultCount_IMetInst)
	: (resultCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resultCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long resultCount(){
			final com.apple.jobjc.Invoke.MsgSend resultCount_IMetInst = get_resultCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resultCount_IMetInst.init(nativeBuffer, this);
		resultCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend results_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_results_IMetInst(){
		return ((results_IMetInst != null)
	? (results_IMetInst)
	: (results_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "results", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray results(){
			final com.apple.jobjc.Invoke.MsgSend results_IMetInst = get_results_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		results_IMetInst.init(nativeBuffer, this);
		results_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend searchScopes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchScopes_IMetInst(){
		return ((searchScopes_IMetInst != null)
	? (searchScopes_IMetInst)
	: (searchScopes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchScopes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray searchScopes(){
			final com.apple.jobjc.Invoke.MsgSend searchScopes_IMetInst = get_searchScopes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchScopes_IMetInst.init(nativeBuffer, this);
		searchScopes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setGroupingAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGroupingAttributes_IMetInst(){
		return ((setGroupingAttributes_IMetInst != null)
	? (setGroupingAttributes_IMetInst)
	: (setGroupingAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGroupingAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setGroupingAttributes(final com.apple.jobjc.foundation.NSArray attrs){
			final com.apple.jobjc.Invoke.MsgSend setGroupingAttributes_IMetInst = get_setGroupingAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGroupingAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		setGroupingAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNotificationBatchingInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNotificationBatchingInterval_IMetInst(){
		return ((setNotificationBatchingInterval_IMetInst != null)
	? (setNotificationBatchingInterval_IMetInst)
	: (setNotificationBatchingInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNotificationBatchingInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setNotificationBatchingInterval(final double ti){
			final com.apple.jobjc.Invoke.MsgSend setNotificationBatchingInterval_IMetInst = get_setNotificationBatchingInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNotificationBatchingInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, ti);
		setNotificationBatchingInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPredicate_IMetInst(){
		return ((setPredicate_IMetInst != null)
	? (setPredicate_IMetInst)
	: (setPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPredicate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend setPredicate_IMetInst = get_setPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		setPredicate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSearchScopes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSearchScopes_IMetInst(){
		return ((setSearchScopes_IMetInst != null)
	? (setSearchScopes_IMetInst)
	: (setSearchScopes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSearchScopes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSearchScopes(final com.apple.jobjc.foundation.NSArray scopes){
			final com.apple.jobjc.Invoke.MsgSend setSearchScopes_IMetInst = get_setSearchScopes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSearchScopes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, scopes);
		setSearchScopes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSortDescriptors_IMetInst(){
		return ((setSortDescriptors_IMetInst != null)
	? (setSortDescriptors_IMetInst)
	: (setSortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSortDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSortDescriptors(final com.apple.jobjc.foundation.NSArray descriptors){
			final com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst = get_setSortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSortDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		setSortDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValueListAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValueListAttributes_IMetInst(){
		return ((setValueListAttributes_IMetInst != null)
	? (setValueListAttributes_IMetInst)
	: (setValueListAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValueListAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValueListAttributes(final com.apple.jobjc.foundation.NSArray attrs){
			final com.apple.jobjc.Invoke.MsgSend setValueListAttributes_IMetInst = get_setValueListAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValueListAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrs);
		setValueListAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptors_IMetInst(){
		return ((sortDescriptors_IMetInst != null)
	? (sortDescriptors_IMetInst)
	: (sortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst = get_sortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptors_IMetInst.init(nativeBuffer, this);
		sortDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startQuery_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startQuery_IMetInst(){
		return ((startQuery_IMetInst != null)
	? (startQuery_IMetInst)
	: (startQuery_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startQuery", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean startQuery(){
			final com.apple.jobjc.Invoke.MsgSend startQuery_IMetInst = get_startQuery_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startQuery_IMetInst.init(nativeBuffer, this);
		startQuery_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stopQuery_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopQuery_IMetInst(){
		return ((stopQuery_IMetInst != null)
	? (stopQuery_IMetInst)
	: (stopQuery_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopQuery", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopQuery(){
			final com.apple.jobjc.Invoke.MsgSend stopQuery_IMetInst = get_stopQuery_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopQuery_IMetInst.init(nativeBuffer, this);
		stopQuery_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend valueListAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueListAttributes_IMetInst(){
		return ((valueListAttributes_IMetInst != null)
	? (valueListAttributes_IMetInst)
	: (valueListAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueListAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray valueListAttributes(){
			final com.apple.jobjc.Invoke.MsgSend valueListAttributes_IMetInst = get_valueListAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueListAttributes_IMetInst.init(nativeBuffer, this);
		valueListAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueLists_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueLists_IMetInst(){
		return ((valueLists_IMetInst != null)
	? (valueLists_IMetInst)
	: (valueLists_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueLists", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary valueLists(){
			final com.apple.jobjc.Invoke.MsgSend valueLists_IMetInst = get_valueLists_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueLists_IMetInst.init(nativeBuffer, this);
		valueLists_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueOfAttribute_forResultAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueOfAttribute_forResultAtIndex_IMetInst(){
		return ((valueOfAttribute_forResultAtIndex_IMetInst != null)
	? (valueOfAttribute_forResultAtIndex_IMetInst)
	: (valueOfAttribute_forResultAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueOfAttribute:forResultAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T valueOfAttribute_forResultAtIndex(final com.apple.jobjc.foundation.NSString attrName, final long idx){
			final com.apple.jobjc.Invoke.MsgSend valueOfAttribute_forResultAtIndex_IMetInst = get_valueOfAttribute_forResultAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueOfAttribute_forResultAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attrName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, idx);
		valueOfAttribute_forResultAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
