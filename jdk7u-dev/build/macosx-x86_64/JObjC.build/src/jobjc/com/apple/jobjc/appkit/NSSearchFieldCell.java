package com.apple.jobjc.appkit;

public  class NSSearchFieldCell extends com.apple.jobjc.appkit.NSTextFieldCell {
	public NSSearchFieldCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSearchFieldCell(final NSSearchFieldCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cancelButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelButtonCell_IMetInst(){
		return ((cancelButtonCell_IMetInst != null)
	? (cancelButtonCell_IMetInst)
	: (cancelButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelButtonCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSButtonCell cancelButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend cancelButtonCell_IMetInst = get_cancelButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelButtonCell_IMetInst.init(nativeBuffer, this);
		cancelButtonCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButtonCell returnValue = (com.apple.jobjc.appkit.NSButtonCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelButtonRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelButtonRectForBounds_IMetInst(){
		return ((cancelButtonRectForBounds_IMetInst != null)
	? (cancelButtonRectForBounds_IMetInst)
	: (cancelButtonRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelButtonRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect cancelButtonRectForBounds(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend cancelButtonRectForBounds_IMetInst = get_cancelButtonRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelButtonRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		cancelButtonRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumRecents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumRecents_IMetInst(){
		return ((maximumRecents_IMetInst != null)
	? (maximumRecents_IMetInst)
	: (maximumRecents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumRecents", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long maximumRecents(){
			final com.apple.jobjc.Invoke.MsgSend maximumRecents_IMetInst = get_maximumRecents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumRecents_IMetInst.init(nativeBuffer, this);
		maximumRecents_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recentSearches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recentSearches_IMetInst(){
		return ((recentSearches_IMetInst != null)
	? (recentSearches_IMetInst)
	: (recentSearches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recentSearches", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray recentSearches(){
			final com.apple.jobjc.Invoke.MsgSend recentSearches_IMetInst = get_recentSearches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recentSearches_IMetInst.init(nativeBuffer, this);
		recentSearches_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recentsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recentsAutosaveName_IMetInst(){
		return ((recentsAutosaveName_IMetInst != null)
	? (recentsAutosaveName_IMetInst)
	: (recentsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recentsAutosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString recentsAutosaveName(){
			final com.apple.jobjc.Invoke.MsgSend recentsAutosaveName_IMetInst = get_recentsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recentsAutosaveName_IMetInst.init(nativeBuffer, this);
		recentsAutosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resetCancelButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetCancelButtonCell_IMetInst(){
		return ((resetCancelButtonCell_IMetInst != null)
	? (resetCancelButtonCell_IMetInst)
	: (resetCancelButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetCancelButtonCell", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetCancelButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend resetCancelButtonCell_IMetInst = get_resetCancelButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetCancelButtonCell_IMetInst.init(nativeBuffer, this);
		resetCancelButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resetSearchButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetSearchButtonCell_IMetInst(){
		return ((resetSearchButtonCell_IMetInst != null)
	? (resetSearchButtonCell_IMetInst)
	: (resetSearchButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetSearchButtonCell", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetSearchButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend resetSearchButtonCell_IMetInst = get_resetSearchButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetSearchButtonCell_IMetInst.init(nativeBuffer, this);
		resetSearchButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend searchButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchButtonCell_IMetInst(){
		return ((searchButtonCell_IMetInst != null)
	? (searchButtonCell_IMetInst)
	: (searchButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchButtonCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSButtonCell searchButtonCell(){
			final com.apple.jobjc.Invoke.MsgSend searchButtonCell_IMetInst = get_searchButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchButtonCell_IMetInst.init(nativeBuffer, this);
		searchButtonCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButtonCell returnValue = (com.apple.jobjc.appkit.NSButtonCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend searchButtonRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchButtonRectForBounds_IMetInst(){
		return ((searchButtonRectForBounds_IMetInst != null)
	? (searchButtonRectForBounds_IMetInst)
	: (searchButtonRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchButtonRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect searchButtonRectForBounds(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend searchButtonRectForBounds_IMetInst = get_searchButtonRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchButtonRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		searchButtonRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend searchMenuTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchMenuTemplate_IMetInst(){
		return ((searchMenuTemplate_IMetInst != null)
	? (searchMenuTemplate_IMetInst)
	: (searchMenuTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchMenuTemplate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu searchMenuTemplate(){
			final com.apple.jobjc.Invoke.MsgSend searchMenuTemplate_IMetInst = get_searchMenuTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchMenuTemplate_IMetInst.init(nativeBuffer, this);
		searchMenuTemplate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend searchTextRectForBounds_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchTextRectForBounds_IMetInst(){
		return ((searchTextRectForBounds_IMetInst != null)
	? (searchTextRectForBounds_IMetInst)
	: (searchTextRectForBounds_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchTextRectForBounds:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect searchTextRectForBounds(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend searchTextRectForBounds_IMetInst = get_searchTextRectForBounds_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchTextRectForBounds_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		searchTextRectForBounds_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendsSearchStringImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendsSearchStringImmediately_IMetInst(){
		return ((sendsSearchStringImmediately_IMetInst != null)
	? (sendsSearchStringImmediately_IMetInst)
	: (sendsSearchStringImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendsSearchStringImmediately", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendsSearchStringImmediately(){
			final com.apple.jobjc.Invoke.MsgSend sendsSearchStringImmediately_IMetInst = get_sendsSearchStringImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendsSearchStringImmediately_IMetInst.init(nativeBuffer, this);
		sendsSearchStringImmediately_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendsWholeSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendsWholeSearchString_IMetInst(){
		return ((sendsWholeSearchString_IMetInst != null)
	? (sendsWholeSearchString_IMetInst)
	: (sendsWholeSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendsWholeSearchString", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendsWholeSearchString(){
			final com.apple.jobjc.Invoke.MsgSend sendsWholeSearchString_IMetInst = get_sendsWholeSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendsWholeSearchString_IMetInst.init(nativeBuffer, this);
		sendsWholeSearchString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCancelButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCancelButtonCell_IMetInst(){
		return ((setCancelButtonCell_IMetInst != null)
	? (setCancelButtonCell_IMetInst)
	: (setCancelButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCancelButtonCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCancelButtonCell(final com.apple.jobjc.appkit.NSButtonCell cell){
			final com.apple.jobjc.Invoke.MsgSend setCancelButtonCell_IMetInst = get_setCancelButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCancelButtonCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setCancelButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximumRecents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximumRecents_IMetInst(){
		return ((setMaximumRecents_IMetInst != null)
	? (setMaximumRecents_IMetInst)
	: (setMaximumRecents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximumRecents:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMaximumRecents(final long maxRecents){
			final com.apple.jobjc.Invoke.MsgSend setMaximumRecents_IMetInst = get_setMaximumRecents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximumRecents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, maxRecents);
		setMaximumRecents_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRecentSearches_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRecentSearches_IMetInst(){
		return ((setRecentSearches_IMetInst != null)
	? (setRecentSearches_IMetInst)
	: (setRecentSearches_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRecentSearches:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRecentSearches(final com.apple.jobjc.foundation.NSArray searches){
			final com.apple.jobjc.Invoke.MsgSend setRecentSearches_IMetInst = get_setRecentSearches_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRecentSearches_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searches);
		setRecentSearches_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRecentsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRecentsAutosaveName_IMetInst(){
		return ((setRecentsAutosaveName_IMetInst != null)
	? (setRecentsAutosaveName_IMetInst)
	: (setRecentsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRecentsAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRecentsAutosaveName(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setRecentsAutosaveName_IMetInst = get_setRecentsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRecentsAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setRecentsAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSearchButtonCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSearchButtonCell_IMetInst(){
		return ((setSearchButtonCell_IMetInst != null)
	? (setSearchButtonCell_IMetInst)
	: (setSearchButtonCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSearchButtonCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSearchButtonCell(final com.apple.jobjc.appkit.NSButtonCell cell){
			final com.apple.jobjc.Invoke.MsgSend setSearchButtonCell_IMetInst = get_setSearchButtonCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSearchButtonCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setSearchButtonCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSearchMenuTemplate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSearchMenuTemplate_IMetInst(){
		return ((setSearchMenuTemplate_IMetInst != null)
	? (setSearchMenuTemplate_IMetInst)
	: (setSearchMenuTemplate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSearchMenuTemplate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSearchMenuTemplate(final com.apple.jobjc.appkit.NSMenu menu){
			final com.apple.jobjc.Invoke.MsgSend setSearchMenuTemplate_IMetInst = get_setSearchMenuTemplate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSearchMenuTemplate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		setSearchMenuTemplate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSendsSearchStringImmediately_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSendsSearchStringImmediately_IMetInst(){
		return ((setSendsSearchStringImmediately_IMetInst != null)
	? (setSendsSearchStringImmediately_IMetInst)
	: (setSendsSearchStringImmediately_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSendsSearchStringImmediately:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSendsSearchStringImmediately(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSendsSearchStringImmediately_IMetInst = get_setSendsSearchStringImmediately_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSendsSearchStringImmediately_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSendsSearchStringImmediately_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSendsWholeSearchString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSendsWholeSearchString_IMetInst(){
		return ((setSendsWholeSearchString_IMetInst != null)
	? (setSendsWholeSearchString_IMetInst)
	: (setSendsWholeSearchString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSendsWholeSearchString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSendsWholeSearchString(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSendsWholeSearchString_IMetInst = get_setSendsWholeSearchString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSendsWholeSearchString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSendsWholeSearchString_IMetInst.invoke(nativeBuffer);
		
		
	}

}
