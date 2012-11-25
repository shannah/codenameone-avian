package com.apple.jobjc.appkit;

public  class NSOutlineView extends com.apple.jobjc.appkit.NSTableView {
	public NSOutlineView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOutlineView(final NSOutlineView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend autoresizesOutlineColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoresizesOutlineColumn_IMetInst(){
		return ((autoresizesOutlineColumn_IMetInst != null)
	? (autoresizesOutlineColumn_IMetInst)
	: (autoresizesOutlineColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoresizesOutlineColumn", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autoresizesOutlineColumn(){
			final com.apple.jobjc.Invoke.MsgSend autoresizesOutlineColumn_IMetInst = get_autoresizesOutlineColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoresizesOutlineColumn_IMetInst.init(nativeBuffer, this);
		autoresizesOutlineColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosaveExpandedItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosaveExpandedItems_IMetInst(){
		return ((autosaveExpandedItems_IMetInst != null)
	? (autosaveExpandedItems_IMetInst)
	: (autosaveExpandedItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosaveExpandedItems", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosaveExpandedItems(){
			final com.apple.jobjc.Invoke.MsgSend autosaveExpandedItems_IMetInst = get_autosaveExpandedItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosaveExpandedItems_IMetInst.init(nativeBuffer, this);
		autosaveExpandedItems_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collapseItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collapseItem_IMetInst(){
		return ((collapseItem_IMetInst != null)
	? (collapseItem_IMetInst)
	: (collapseItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collapseItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void collapseItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend collapseItem_IMetInst = get_collapseItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collapseItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		collapseItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend collapseItem_collapseChildren_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collapseItem_collapseChildren_IMetInst(){
		return ((collapseItem_collapseChildren_IMetInst != null)
	? (collapseItem_collapseChildren_IMetInst)
	: (collapseItem_collapseChildren_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collapseItem:collapseChildren:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void collapseItem_collapseChildren(final com.apple.jobjc.ID item, final boolean collapseChildren){
			final com.apple.jobjc.Invoke.MsgSend collapseItem_collapseChildren_IMetInst = get_collapseItem_collapseChildren_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collapseItem_collapseChildren_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, collapseChildren);
		collapseItem_collapseChildren_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataSource_IMetInst(){
		return ((dataSource_IMetInst != null)
	? (dataSource_IMetInst)
	: (dataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataSource", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataSource(){
			final com.apple.jobjc.Invoke.MsgSend dataSource_IMetInst = get_dataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataSource_IMetInst.init(nativeBuffer, this);
		dataSource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend expandItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expandItem_IMetInst(){
		return ((expandItem_IMetInst != null)
	? (expandItem_IMetInst)
	: (expandItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expandItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void expandItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend expandItem_IMetInst = get_expandItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expandItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		expandItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend expandItem_expandChildren_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expandItem_expandChildren_IMetInst(){
		return ((expandItem_expandChildren_IMetInst != null)
	? (expandItem_expandChildren_IMetInst)
	: (expandItem_expandChildren_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expandItem:expandChildren:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void expandItem_expandChildren(final com.apple.jobjc.ID item, final boolean expandChildren){
			final com.apple.jobjc.Invoke.MsgSend expandItem_expandChildren_IMetInst = get_expandItem_expandChildren_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expandItem_expandChildren_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, expandChildren);
		expandItem_expandChildren_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend frameOfOutlineCellAtRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameOfOutlineCellAtRow_IMetInst(){
		return ((frameOfOutlineCellAtRow_IMetInst != null)
	? (frameOfOutlineCellAtRow_IMetInst)
	: (frameOfOutlineCellAtRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameOfOutlineCellAtRow:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameOfOutlineCellAtRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend frameOfOutlineCellAtRow_IMetInst = get_frameOfOutlineCellAtRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameOfOutlineCellAtRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameOfOutlineCellAtRow_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indentationMarkerFollowsCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indentationMarkerFollowsCell_IMetInst(){
		return ((indentationMarkerFollowsCell_IMetInst != null)
	? (indentationMarkerFollowsCell_IMetInst)
	: (indentationMarkerFollowsCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indentationMarkerFollowsCell", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean indentationMarkerFollowsCell(){
			final com.apple.jobjc.Invoke.MsgSend indentationMarkerFollowsCell_IMetInst = get_indentationMarkerFollowsCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indentationMarkerFollowsCell_IMetInst.init(nativeBuffer, this);
		indentationMarkerFollowsCell_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indentationPerLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indentationPerLevel_IMetInst(){
		return ((indentationPerLevel_IMetInst != null)
	? (indentationPerLevel_IMetInst)
	: (indentationPerLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indentationPerLevel", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double indentationPerLevel(){
			final com.apple.jobjc.Invoke.MsgSend indentationPerLevel_IMetInst = get_indentationPerLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indentationPerLevel_IMetInst.init(nativeBuffer, this);
		indentationPerLevel_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertItemsAtIndexes_inParent_withAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItemsAtIndexes_inParent_withAnimation_IMetInst(){
		return ((insertItemsAtIndexes_inParent_withAnimation_IMetInst != null)
	? (insertItemsAtIndexes_inParent_withAnimation_IMetInst)
	: (insertItemsAtIndexes_inParent_withAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItemsAtIndexes:inParent:withAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertItemsAtIndexes_inParent_withAnimation(final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.ID parent, final long animationOptions){
			final com.apple.jobjc.Invoke.MsgSend insertItemsAtIndexes_inParent_withAnimation_IMetInst = get_insertItemsAtIndexes_inParent_withAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItemsAtIndexes_inParent_withAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parent);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationOptions);
		insertItemsAtIndexes_inParent_withAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isExpandable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExpandable_IMetInst(){
		return ((isExpandable_IMetInst != null)
	? (isExpandable_IMetInst)
	: (isExpandable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExpandable:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isExpandable(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend isExpandable_IMetInst = get_isExpandable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExpandable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		isExpandable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isItemExpanded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isItemExpanded_IMetInst(){
		return ((isItemExpanded_IMetInst != null)
	? (isItemExpanded_IMetInst)
	: (isItemExpanded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isItemExpanded:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isItemExpanded(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend isItemExpanded_IMetInst = get_isItemExpanded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isItemExpanded_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		isItemExpanded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtRow_IMetInst(){
		return ((itemAtRow_IMetInst != null)
	? (itemAtRow_IMetInst)
	: (itemAtRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T itemAtRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend itemAtRow_IMetInst = get_itemAtRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		itemAtRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend levelForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_levelForItem_IMetInst(){
		return ((levelForItem_IMetInst != null)
	? (levelForItem_IMetInst)
	: (levelForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "levelForItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long levelForItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend levelForItem_IMetInst = get_levelForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		levelForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		levelForItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend levelForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_levelForRow_IMetInst(){
		return ((levelForRow_IMetInst != null)
	? (levelForRow_IMetInst)
	: (levelForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "levelForRow:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long levelForRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend levelForRow_IMetInst = get_levelForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		levelForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		levelForRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveItemAtIndex_inParent_toIndex_inParent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveItemAtIndex_inParent_toIndex_inParent_IMetInst(){
		return ((moveItemAtIndex_inParent_toIndex_inParent_IMetInst != null)
	? (moveItemAtIndex_inParent_toIndex_inParent_IMetInst)
	: (moveItemAtIndex_inParent_toIndex_inParent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveItemAtIndex:inParent:toIndex:inParent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveItemAtIndex_inParent_toIndex_inParent(final long fromIndex, final com.apple.jobjc.ID oldParent, final long toIndex, final com.apple.jobjc.ID newParent){
			final com.apple.jobjc.Invoke.MsgSend moveItemAtIndex_inParent_toIndex_inParent_IMetInst = get_moveItemAtIndex_inParent_toIndex_inParent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveItemAtIndex_inParent_toIndex_inParent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, fromIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldParent);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, toIndex);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newParent);
		moveItemAtIndex_inParent_toIndex_inParent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend outlineTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_outlineTableColumn_IMetInst(){
		return ((outlineTableColumn_IMetInst != null)
	? (outlineTableColumn_IMetInst)
	: (outlineTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "outlineTableColumn", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableColumn outlineTableColumn(){
			final com.apple.jobjc.Invoke.MsgSend outlineTableColumn_IMetInst = get_outlineTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		outlineTableColumn_IMetInst.init(nativeBuffer, this);
		outlineTableColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableColumn returnValue = (com.apple.jobjc.appkit.NSTableColumn) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentForItem_IMetInst(){
		return ((parentForItem_IMetInst != null)
	? (parentForItem_IMetInst)
	: (parentForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentForItem:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T parentForItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend parentForItem_IMetInst = get_parentForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		parentForItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadItem_IMetInst(){
		return ((reloadItem_IMetInst != null)
	? (reloadItem_IMetInst)
	: (reloadItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void reloadItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend reloadItem_IMetInst = get_reloadItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		reloadItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadItem_reloadChildren_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadItem_reloadChildren_IMetInst(){
		return ((reloadItem_reloadChildren_IMetInst != null)
	? (reloadItem_reloadChildren_IMetInst)
	: (reloadItem_reloadChildren_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadItem:reloadChildren:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void reloadItem_reloadChildren(final com.apple.jobjc.ID item, final boolean reloadChildren){
			final com.apple.jobjc.Invoke.MsgSend reloadItem_reloadChildren_IMetInst = get_reloadItem_reloadChildren_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadItem_reloadChildren_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, reloadChildren);
		reloadItem_reloadChildren_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemsAtIndexes_inParent_withAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemsAtIndexes_inParent_withAnimation_IMetInst(){
		return ((removeItemsAtIndexes_inParent_withAnimation_IMetInst != null)
	? (removeItemsAtIndexes_inParent_withAnimation_IMetInst)
	: (removeItemsAtIndexes_inParent_withAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemsAtIndexes:inParent:withAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeItemsAtIndexes_inParent_withAnimation(final com.apple.jobjc.foundation.NSIndexSet indexes, final com.apple.jobjc.ID parent, final long animationOptions){
			final com.apple.jobjc.Invoke.MsgSend removeItemsAtIndexes_inParent_withAnimation_IMetInst = get_removeItemsAtIndexes_inParent_withAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemsAtIndexes_inParent_withAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parent);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationOptions);
		removeItemsAtIndexes_inParent_withAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rowForItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowForItem_IMetInst(){
		return ((rowForItem_IMetInst != null)
	? (rowForItem_IMetInst)
	: (rowForItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowForItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long rowForItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend rowForItem_IMetInst = get_rowForItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowForItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		rowForItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoresizesOutlineColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoresizesOutlineColumn_IMetInst(){
		return ((setAutoresizesOutlineColumn_IMetInst != null)
	? (setAutoresizesOutlineColumn_IMetInst)
	: (setAutoresizesOutlineColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoresizesOutlineColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoresizesOutlineColumn(final boolean resize){
			final com.apple.jobjc.Invoke.MsgSend setAutoresizesOutlineColumn_IMetInst = get_setAutoresizesOutlineColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoresizesOutlineColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, resize);
		setAutoresizesOutlineColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosaveExpandedItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosaveExpandedItems_IMetInst(){
		return ((setAutosaveExpandedItems_IMetInst != null)
	? (setAutosaveExpandedItems_IMetInst)
	: (setAutosaveExpandedItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosaveExpandedItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutosaveExpandedItems(final boolean save){
			final com.apple.jobjc.Invoke.MsgSend setAutosaveExpandedItems_IMetInst = get_setAutosaveExpandedItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosaveExpandedItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, save);
		setAutosaveExpandedItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDataSource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDataSource_IMetInst(){
		return ((setDataSource_IMetInst != null)
	? (setDataSource_IMetInst)
	: (setDataSource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDataSource:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDataSource(final com.apple.jobjc.ID aSource){
			final com.apple.jobjc.Invoke.MsgSend setDataSource_IMetInst = get_setDataSource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDataSource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSource);
		setDataSource_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDropItem_dropChildIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDropItem_dropChildIndex_IMetInst(){
		return ((setDropItem_dropChildIndex_IMetInst != null)
	? (setDropItem_dropChildIndex_IMetInst)
	: (setDropItem_dropChildIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDropItem:dropChildIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDropItem_dropChildIndex(final com.apple.jobjc.ID item, final long index){
			final com.apple.jobjc.Invoke.MsgSend setDropItem_dropChildIndex_IMetInst = get_setDropItem_dropChildIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDropItem_dropChildIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setDropItem_dropChildIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndentationMarkerFollowsCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndentationMarkerFollowsCell_IMetInst(){
		return ((setIndentationMarkerFollowsCell_IMetInst != null)
	? (setIndentationMarkerFollowsCell_IMetInst)
	: (setIndentationMarkerFollowsCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndentationMarkerFollowsCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setIndentationMarkerFollowsCell(final boolean drawInCell){
			final com.apple.jobjc.Invoke.MsgSend setIndentationMarkerFollowsCell_IMetInst = get_setIndentationMarkerFollowsCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndentationMarkerFollowsCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, drawInCell);
		setIndentationMarkerFollowsCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndentationPerLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndentationPerLevel_IMetInst(){
		return ((setIndentationPerLevel_IMetInst != null)
	? (setIndentationPerLevel_IMetInst)
	: (setIndentationPerLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndentationPerLevel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setIndentationPerLevel(final double indentationPerLevel){
			final com.apple.jobjc.Invoke.MsgSend setIndentationPerLevel_IMetInst = get_setIndentationPerLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndentationPerLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, indentationPerLevel);
		setIndentationPerLevel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOutlineTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOutlineTableColumn_IMetInst(){
		return ((setOutlineTableColumn_IMetInst != null)
	? (setOutlineTableColumn_IMetInst)
	: (setOutlineTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOutlineTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setOutlineTableColumn(final com.apple.jobjc.appkit.NSTableColumn outlineTableColumn){
			final com.apple.jobjc.Invoke.MsgSend setOutlineTableColumn_IMetInst = get_setOutlineTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOutlineTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, outlineTableColumn);
		setOutlineTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldCollapseAutoExpandedItemsForDeposited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldCollapseAutoExpandedItemsForDeposited_IMetInst(){
		return ((shouldCollapseAutoExpandedItemsForDeposited_IMetInst != null)
	? (shouldCollapseAutoExpandedItemsForDeposited_IMetInst)
	: (shouldCollapseAutoExpandedItemsForDeposited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldCollapseAutoExpandedItemsForDeposited:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldCollapseAutoExpandedItemsForDeposited(final boolean deposited){
			final com.apple.jobjc.Invoke.MsgSend shouldCollapseAutoExpandedItemsForDeposited_IMetInst = get_shouldCollapseAutoExpandedItemsForDeposited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldCollapseAutoExpandedItemsForDeposited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, deposited);
		shouldCollapseAutoExpandedItemsForDeposited_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
