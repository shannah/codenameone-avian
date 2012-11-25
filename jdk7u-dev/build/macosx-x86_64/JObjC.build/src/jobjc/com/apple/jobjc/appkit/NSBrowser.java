package com.apple.jobjc.appkit;

public  class NSBrowser extends com.apple.jobjc.appkit.NSControl {
	public NSBrowser(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBrowser(final NSBrowser obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsArrowKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsArrowKeys_IMetInst(){
		return ((acceptsArrowKeys_IMetInst != null)
	? (acceptsArrowKeys_IMetInst)
	: (acceptsArrowKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsArrowKeys", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean acceptsArrowKeys(){
			final com.apple.jobjc.Invoke.MsgSend acceptsArrowKeys_IMetInst = get_acceptsArrowKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsArrowKeys_IMetInst.init(nativeBuffer, this);
		acceptsArrowKeys_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addColumn_IMetInst(){
		return ((addColumn_IMetInst != null)
	? (addColumn_IMetInst)
	: (addColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addColumn", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void addColumn(){
			final com.apple.jobjc.Invoke.MsgSend addColumn_IMetInst = get_addColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addColumn_IMetInst.init(nativeBuffer, this);
		addColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsBranchSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsBranchSelection_IMetInst(){
		return ((allowsBranchSelection_IMetInst != null)
	? (allowsBranchSelection_IMetInst)
	: (allowsBranchSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsBranchSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsBranchSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsBranchSelection_IMetInst = get_allowsBranchSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsBranchSelection_IMetInst.init(nativeBuffer, this);
		allowsBranchSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsEmptySelection_IMetInst(){
		return ((allowsEmptySelection_IMetInst != null)
	? (allowsEmptySelection_IMetInst)
	: (allowsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsEmptySelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsEmptySelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsEmptySelection_IMetInst = get_allowsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsEmptySelection_IMetInst.init(nativeBuffer, this);
		allowsEmptySelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMultipleSelection_IMetInst(){
		return ((allowsMultipleSelection_IMetInst != null)
	? (allowsMultipleSelection_IMetInst)
	: (allowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMultipleSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMultipleSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst = get_allowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		allowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsTypeSelect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsTypeSelect_IMetInst(){
		return ((allowsTypeSelect_IMetInst != null)
	? (allowsTypeSelect_IMetInst)
	: (allowsTypeSelect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsTypeSelect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsTypeSelect(){
			final com.apple.jobjc.Invoke.MsgSend allowsTypeSelect_IMetInst = get_allowsTypeSelect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsTypeSelect_IMetInst.init(nativeBuffer, this);
		allowsTypeSelect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autohidesScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autohidesScroller_IMetInst(){
		return ((autohidesScroller_IMetInst != null)
	? (autohidesScroller_IMetInst)
	: (autohidesScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autohidesScroller", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autohidesScroller(){
			final com.apple.jobjc.Invoke.MsgSend autohidesScroller_IMetInst = get_autohidesScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autohidesScroller_IMetInst.init(nativeBuffer, this);
		autohidesScroller_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canDragRowsWithIndexes_inColumn_withEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canDragRowsWithIndexes_inColumn_withEvent_IMetInst(){
		return ((canDragRowsWithIndexes_inColumn_withEvent_IMetInst != null)
	? (canDragRowsWithIndexes_inColumn_withEvent_IMetInst)
	: (canDragRowsWithIndexes_inColumn_withEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canDragRowsWithIndexes:inColumn:withEvent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canDragRowsWithIndexes_inColumn_withEvent(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column, final com.apple.jobjc.appkit.NSEvent event){
			final com.apple.jobjc.Invoke.MsgSend canDragRowsWithIndexes_inColumn_withEvent_IMetInst = get_canDragRowsWithIndexes_inColumn_withEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canDragRowsWithIndexes_inColumn_withEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		canDragRowsWithIndexes_inColumn_withEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellPrototype_IMetInst(){
		return ((cellPrototype_IMetInst != null)
	? (cellPrototype_IMetInst)
	: (cellPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellPrototype", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T cellPrototype(){
			final com.apple.jobjc.Invoke.MsgSend cellPrototype_IMetInst = get_cellPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellPrototype_IMetInst.init(nativeBuffer, this);
		cellPrototype_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clickedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clickedColumn_IMetInst(){
		return ((clickedColumn_IMetInst != null)
	? (clickedColumn_IMetInst)
	: (clickedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clickedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long clickedColumn(){
			final com.apple.jobjc.Invoke.MsgSend clickedColumn_IMetInst = get_clickedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clickedColumn_IMetInst.init(nativeBuffer, this);
		clickedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend clickedRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clickedRow_IMetInst(){
		return ((clickedRow_IMetInst != null)
	? (clickedRow_IMetInst)
	: (clickedRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clickedRow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long clickedRow(){
			final com.apple.jobjc.Invoke.MsgSend clickedRow_IMetInst = get_clickedRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clickedRow_IMetInst.init(nativeBuffer, this);
		clickedRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnContentWidthForColumnWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnContentWidthForColumnWidth_IMetInst(){
		return ((columnContentWidthForColumnWidth_IMetInst != null)
	? (columnContentWidthForColumnWidth_IMetInst)
	: (columnContentWidthForColumnWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnContentWidthForColumnWidth:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double columnContentWidthForColumnWidth(final double columnWidth){
			final com.apple.jobjc.Invoke.MsgSend columnContentWidthForColumnWidth_IMetInst = get_columnContentWidthForColumnWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnContentWidthForColumnWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, columnWidth);
		columnContentWidthForColumnWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnOfMatrix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnOfMatrix_IMetInst(){
		return ((columnOfMatrix_IMetInst != null)
	? (columnOfMatrix_IMetInst)
	: (columnOfMatrix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnOfMatrix:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long columnOfMatrix(final com.apple.jobjc.appkit.NSMatrix matrix){
			final com.apple.jobjc.Invoke.MsgSend columnOfMatrix_IMetInst = get_columnOfMatrix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnOfMatrix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, matrix);
		columnOfMatrix_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnResizingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnResizingType_IMetInst(){
		return ((columnResizingType_IMetInst != null)
	? (columnResizingType_IMetInst)
	: (columnResizingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnResizingType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long columnResizingType(){
			final com.apple.jobjc.Invoke.MsgSend columnResizingType_IMetInst = get_columnResizingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnResizingType_IMetInst.init(nativeBuffer, this);
		columnResizingType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnWidthForColumnContentWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnWidthForColumnContentWidth_IMetInst(){
		return ((columnWidthForColumnContentWidth_IMetInst != null)
	? (columnWidthForColumnContentWidth_IMetInst)
	: (columnWidthForColumnContentWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnWidthForColumnContentWidth:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double columnWidthForColumnContentWidth(final double columnContentWidth){
			final com.apple.jobjc.Invoke.MsgSend columnWidthForColumnContentWidth_IMetInst = get_columnWidthForColumnContentWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnWidthForColumnContentWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, columnContentWidth);
		columnWidthForColumnContentWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnsAutosaveName_IMetInst(){
		return ((columnsAutosaveName_IMetInst != null)
	? (columnsAutosaveName_IMetInst)
	: (columnsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnsAutosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString columnsAutosaveName(){
			final com.apple.jobjc.Invoke.MsgSend columnsAutosaveName_IMetInst = get_columnsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnsAutosaveName_IMetInst.init(nativeBuffer, this);
		columnsAutosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultColumnWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultColumnWidth_IMetInst(){
		return ((defaultColumnWidth_IMetInst != null)
	? (defaultColumnWidth_IMetInst)
	: (defaultColumnWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultColumnWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultColumnWidth(){
			final com.apple.jobjc.Invoke.MsgSend defaultColumnWidth_IMetInst = get_defaultColumnWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultColumnWidth_IMetInst.init(nativeBuffer, this);
		defaultColumnWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend displayAllColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayAllColumns_IMetInst(){
		return ((displayAllColumns_IMetInst != null)
	? (displayAllColumns_IMetInst)
	: (displayAllColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayAllColumns", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void displayAllColumns(){
			final com.apple.jobjc.Invoke.MsgSend displayAllColumns_IMetInst = get_displayAllColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayAllColumns_IMetInst.init(nativeBuffer, this);
		displayAllColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend displayColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayColumn_IMetInst(){
		return ((displayColumn_IMetInst != null)
	? (displayColumn_IMetInst)
	: (displayColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void displayColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend displayColumn_IMetInst = get_displayColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		displayColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doClick_IMetInst(){
		return ((doClick_IMetInst != null)
	? (doClick_IMetInst)
	: (doClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doClick:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void doClick(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend doClick_IMetInst = get_doClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doClick_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		doClick_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doDoubleClick_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doDoubleClick_IMetInst(){
		return ((doDoubleClick_IMetInst != null)
	? (doDoubleClick_IMetInst)
	: (doDoubleClick_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doDoubleClick:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void doDoubleClick(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend doDoubleClick_IMetInst = get_doDoubleClick_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doDoubleClick_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		doDoubleClick_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleAction_IMetInst(){
		return ((doubleAction_IMetInst != null)
	? (doubleAction_IMetInst)
	: (doubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleAction", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL doubleAction(){
			final com.apple.jobjc.Invoke.MsgSend doubleAction_IMetInst = get_doubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleAction_IMetInst.init(nativeBuffer, this);
		doubleAction_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst(){
		return ((draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst != null)
	? (draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst)
	: (draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingImageForRowsWithIndexes:inColumn:withEvent:offset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage draggingImageForRowsWithIndexes_inColumn_withEvent_offset(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column, final com.apple.jobjc.appkit.NSEvent event, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst = get_draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		draggingImageForRowsWithIndexes_inColumn_withEvent_offset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawTitleOfColumn_inRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawTitleOfColumn_inRect_IMetInst(){
		return ((drawTitleOfColumn_inRect_IMetInst != null)
	? (drawTitleOfColumn_inRect_IMetInst)
	: (drawTitleOfColumn_inRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawTitleOfColumn:inRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawTitleOfColumn_inRect(final long column, final com.apple.jobjc.foundation.NSRect aRect){
			final com.apple.jobjc.Invoke.MsgSend drawTitleOfColumn_inRect_IMetInst = get_drawTitleOfColumn_inRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawTitleOfColumn_inRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, aRect);
		drawTitleOfColumn_inRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend editItemAtIndexPath_withEvent_select_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editItemAtIndexPath_withEvent_select_IMetInst(){
		return ((editItemAtIndexPath_withEvent_select_IMetInst != null)
	? (editItemAtIndexPath_withEvent_select_IMetInst)
	: (editItemAtIndexPath_withEvent_select_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editItemAtIndexPath:withEvent:select:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void editItemAtIndexPath_withEvent_select(final com.apple.jobjc.foundation.NSIndexPath indexPath, final com.apple.jobjc.appkit.NSEvent theEvent, final boolean select){
			final com.apple.jobjc.Invoke.MsgSend editItemAtIndexPath_withEvent_select_IMetInst = get_editItemAtIndexPath_withEvent_select_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editItemAtIndexPath_withEvent_select_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, select);
		editItemAtIndexPath_withEvent_select_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend firstVisibleColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstVisibleColumn_IMetInst(){
		return ((firstVisibleColumn_IMetInst != null)
	? (firstVisibleColumn_IMetInst)
	: (firstVisibleColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstVisibleColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long firstVisibleColumn(){
			final com.apple.jobjc.Invoke.MsgSend firstVisibleColumn_IMetInst = get_firstVisibleColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstVisibleColumn_IMetInst.init(nativeBuffer, this);
		firstVisibleColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameOfColumn_IMetInst(){
		return ((frameOfColumn_IMetInst != null)
	? (frameOfColumn_IMetInst)
	: (frameOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameOfColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend frameOfColumn_IMetInst = get_frameOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameOfColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameOfInsideOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameOfInsideOfColumn_IMetInst(){
		return ((frameOfInsideOfColumn_IMetInst != null)
	? (frameOfInsideOfColumn_IMetInst)
	: (frameOfInsideOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameOfInsideOfColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameOfInsideOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend frameOfInsideOfColumn_IMetInst = get_frameOfInsideOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameOfInsideOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameOfInsideOfColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameOfRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameOfRow_inColumn_IMetInst(){
		return ((frameOfRow_inColumn_IMetInst != null)
	? (frameOfRow_inColumn_IMetInst)
	: (frameOfRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameOfRow:inColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameOfRow_inColumn(final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend frameOfRow_inColumn_IMetInst = get_frameOfRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameOfRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameOfRow_inColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getRow_column_forPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRow_column_forPoint_IMetInst(){
		return ((getRow_column_forPoint_IMetInst != null)
	? (getRow_column_forPoint_IMetInst)
	: (getRow_column_forPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRow:column:forPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean getRow_column_forPoint(final com.apple.jobjc.Pointer<java.lang.Long> row, final com.apple.jobjc.Pointer<java.lang.Long> column, final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend getRow_column_forPoint_IMetInst = get_getRow_column_forPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRow_column_forPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, row);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, column);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		getRow_column_forPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasHorizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasHorizontalScroller_IMetInst(){
		return ((hasHorizontalScroller_IMetInst != null)
	? (hasHorizontalScroller_IMetInst)
	: (hasHorizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasHorizontalScroller", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasHorizontalScroller(){
			final com.apple.jobjc.Invoke.MsgSend hasHorizontalScroller_IMetInst = get_hasHorizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasHorizontalScroller_IMetInst.init(nativeBuffer, this);
		hasHorizontalScroller_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPathForColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPathForColumn_IMetInst(){
		return ((indexPathForColumn_IMetInst != null)
	? (indexPathForColumn_IMetInst)
	: (indexPathForColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPathForColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath indexPathForColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend indexPathForColumn_IMetInst = get_indexPathForColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPathForColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		indexPathForColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLeafItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLeafItem_IMetInst(){
		return ((isLeafItem_IMetInst != null)
	? (isLeafItem_IMetInst)
	: (isLeafItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLeafItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isLeafItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend isLeafItem_IMetInst = get_isLeafItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLeafItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		isLeafItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLoaded_IMetInst(){
		return ((isLoaded_IMetInst != null)
	? (isLoaded_IMetInst)
	: (isLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLoaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLoaded(){
			final com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst = get_isLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLoaded_IMetInst.init(nativeBuffer, this);
		isLoaded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTitled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTitled_IMetInst(){
		return ((isTitled_IMetInst != null)
	? (isTitled_IMetInst)
	: (isTitled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTitled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTitled(){
			final com.apple.jobjc.Invoke.MsgSend isTitled_IMetInst = get_isTitled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTitled_IMetInst.init(nativeBuffer, this);
		isTitled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtIndexPath_IMetInst(){
		return ((itemAtIndexPath_IMetInst != null)
	? (itemAtIndexPath_IMetInst)
	: (itemAtIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtIndexPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T itemAtIndexPath(final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend itemAtIndexPath_IMetInst = get_itemAtIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		itemAtIndexPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtRow_inColumn_IMetInst(){
		return ((itemAtRow_inColumn_IMetInst != null)
	? (itemAtRow_inColumn_IMetInst)
	: (itemAtRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtRow:inColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T itemAtRow_inColumn(final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend itemAtRow_inColumn_IMetInst = get_itemAtRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		itemAtRow_inColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastColumn_IMetInst(){
		return ((lastColumn_IMetInst != null)
	? (lastColumn_IMetInst)
	: (lastColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long lastColumn(){
			final com.apple.jobjc.Invoke.MsgSend lastColumn_IMetInst = get_lastColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastColumn_IMetInst.init(nativeBuffer, this);
		lastColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastVisibleColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastVisibleColumn_IMetInst(){
		return ((lastVisibleColumn_IMetInst != null)
	? (lastVisibleColumn_IMetInst)
	: (lastVisibleColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastVisibleColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long lastVisibleColumn(){
			final com.apple.jobjc.Invoke.MsgSend lastVisibleColumn_IMetInst = get_lastVisibleColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastVisibleColumn_IMetInst.init(nativeBuffer, this);
		lastVisibleColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadColumnZero_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadColumnZero_IMetInst(){
		return ((loadColumnZero_IMetInst != null)
	? (loadColumnZero_IMetInst)
	: (loadColumnZero_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadColumnZero", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void loadColumnZero(){
			final com.apple.jobjc.Invoke.MsgSend loadColumnZero_IMetInst = get_loadColumnZero_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadColumnZero_IMetInst.init(nativeBuffer, this);
		loadColumnZero_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend loadedCellAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadedCellAtRow_column_IMetInst(){
		return ((loadedCellAtRow_column_IMetInst != null)
	? (loadedCellAtRow_column_IMetInst)
	: (loadedCellAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadedCellAtRow:column:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T loadedCellAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend loadedCellAtRow_column_IMetInst = get_loadedCellAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadedCellAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		loadedCellAtRow_column_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matrixClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matrixClass_IMetInst(){
		return ((matrixClass_IMetInst != null)
	? (matrixClass_IMetInst)
	: (matrixClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matrixClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T matrixClass(){
			final com.apple.jobjc.Invoke.MsgSend matrixClass_IMetInst = get_matrixClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matrixClass_IMetInst.init(nativeBuffer, this);
		matrixClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matrixInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matrixInColumn_IMetInst(){
		return ((matrixInColumn_IMetInst != null)
	? (matrixInColumn_IMetInst)
	: (matrixInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matrixInColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMatrix matrixInColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend matrixInColumn_IMetInst = get_matrixInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matrixInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		matrixInColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMatrix returnValue = (com.apple.jobjc.appkit.NSMatrix) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxVisibleColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxVisibleColumns_IMetInst(){
		return ((maxVisibleColumns_IMetInst != null)
	? (maxVisibleColumns_IMetInst)
	: (maxVisibleColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxVisibleColumns", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long maxVisibleColumns(){
			final com.apple.jobjc.Invoke.MsgSend maxVisibleColumns_IMetInst = get_maxVisibleColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxVisibleColumns_IMetInst.init(nativeBuffer, this);
		maxVisibleColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minColumnWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minColumnWidth_IMetInst(){
		return ((minColumnWidth_IMetInst != null)
	? (minColumnWidth_IMetInst)
	: (minColumnWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minColumnWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double minColumnWidth(){
			final com.apple.jobjc.Invoke.MsgSend minColumnWidth_IMetInst = get_minColumnWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minColumnWidth_IMetInst.init(nativeBuffer, this);
		minColumnWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst(){
		return ((noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst != null)
	? (noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst)
	: (noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteHeightOfRowsWithIndexesChanged:inColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void noteHeightOfRowsWithIndexesChanged_inColumn(final com.apple.jobjc.foundation.NSIndexSet indexSet, final long columnIndex){
			final com.apple.jobjc.Invoke.MsgSend noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst = get_noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		noteHeightOfRowsWithIndexesChanged_inColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfVisibleColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfVisibleColumns_IMetInst(){
		return ((numberOfVisibleColumns_IMetInst != null)
	? (numberOfVisibleColumns_IMetInst)
	: (numberOfVisibleColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfVisibleColumns", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfVisibleColumns(){
			final com.apple.jobjc.Invoke.MsgSend numberOfVisibleColumns_IMetInst = get_numberOfVisibleColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfVisibleColumns_IMetInst.init(nativeBuffer, this);
		numberOfVisibleColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentForItemsInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentForItemsInColumn_IMetInst(){
		return ((parentForItemsInColumn_IMetInst != null)
	? (parentForItemsInColumn_IMetInst)
	: (parentForItemsInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentForItemsInColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T parentForItemsInColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend parentForItemsInColumn_IMetInst = get_parentForItemsInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentForItemsInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		parentForItemsInColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend path_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_path_IMetInst(){
		return ((path_IMetInst != null)
	? (path_IMetInst)
	: (path_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "path", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString path(){
			final com.apple.jobjc.Invoke.MsgSend path_IMetInst = get_path_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		path_IMetInst.init(nativeBuffer, this);
		path_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathSeparator_IMetInst(){
		return ((pathSeparator_IMetInst != null)
	? (pathSeparator_IMetInst)
	: (pathSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathSeparator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathSeparator(){
			final com.apple.jobjc.Invoke.MsgSend pathSeparator_IMetInst = get_pathSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathSeparator_IMetInst.init(nativeBuffer, this);
		pathSeparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathToColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathToColumn_IMetInst(){
		return ((pathToColumn_IMetInst != null)
	? (pathToColumn_IMetInst)
	: (pathToColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathToColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString pathToColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend pathToColumn_IMetInst = get_pathToColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathToColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		pathToColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prefersAllColumnUserResizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prefersAllColumnUserResizing_IMetInst(){
		return ((prefersAllColumnUserResizing_IMetInst != null)
	? (prefersAllColumnUserResizing_IMetInst)
	: (prefersAllColumnUserResizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prefersAllColumnUserResizing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean prefersAllColumnUserResizing(){
			final com.apple.jobjc.Invoke.MsgSend prefersAllColumnUserResizing_IMetInst = get_prefersAllColumnUserResizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prefersAllColumnUserResizing_IMetInst.init(nativeBuffer, this);
		prefersAllColumnUserResizing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadColumn_IMetInst(){
		return ((reloadColumn_IMetInst != null)
	? (reloadColumn_IMetInst)
	: (reloadColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void reloadColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend reloadColumn_IMetInst = get_reloadColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		reloadColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadDataForRowIndexes_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadDataForRowIndexes_inColumn_IMetInst(){
		return ((reloadDataForRowIndexes_inColumn_IMetInst != null)
	? (reloadDataForRowIndexes_inColumn_IMetInst)
	: (reloadDataForRowIndexes_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadDataForRowIndexes:inColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void reloadDataForRowIndexes_inColumn(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final long column){
			final com.apple.jobjc.Invoke.MsgSend reloadDataForRowIndexes_inColumn_IMetInst = get_reloadDataForRowIndexes_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadDataForRowIndexes_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		reloadDataForRowIndexes_inColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reusesColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reusesColumns_IMetInst(){
		return ((reusesColumns_IMetInst != null)
	? (reusesColumns_IMetInst)
	: (reusesColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reusesColumns", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean reusesColumns(){
			final com.apple.jobjc.Invoke.MsgSend reusesColumns_IMetInst = get_reusesColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reusesColumns_IMetInst.init(nativeBuffer, this);
		reusesColumns_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowHeight_IMetInst(){
		return ((rowHeight_IMetInst != null)
	? (rowHeight_IMetInst)
	: (rowHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double rowHeight(){
			final com.apple.jobjc.Invoke.MsgSend rowHeight_IMetInst = get_rowHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowHeight_IMetInst.init(nativeBuffer, this);
		rowHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollColumnToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollColumnToVisible_IMetInst(){
		return ((scrollColumnToVisible_IMetInst != null)
	? (scrollColumnToVisible_IMetInst)
	: (scrollColumnToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollColumnToVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollColumnToVisible(final long column){
			final com.apple.jobjc.Invoke.MsgSend scrollColumnToVisible_IMetInst = get_scrollColumnToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollColumnToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		scrollColumnToVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollColumnsLeftBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollColumnsLeftBy_IMetInst(){
		return ((scrollColumnsLeftBy_IMetInst != null)
	? (scrollColumnsLeftBy_IMetInst)
	: (scrollColumnsLeftBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollColumnsLeftBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollColumnsLeftBy(final long shiftAmount){
			final com.apple.jobjc.Invoke.MsgSend scrollColumnsLeftBy_IMetInst = get_scrollColumnsLeftBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollColumnsLeftBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, shiftAmount);
		scrollColumnsLeftBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollColumnsRightBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollColumnsRightBy_IMetInst(){
		return ((scrollColumnsRightBy_IMetInst != null)
	? (scrollColumnsRightBy_IMetInst)
	: (scrollColumnsRightBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollColumnsRightBy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollColumnsRightBy(final long shiftAmount){
			final com.apple.jobjc.Invoke.MsgSend scrollColumnsRightBy_IMetInst = get_scrollColumnsRightBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollColumnsRightBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, shiftAmount);
		scrollColumnsRightBy_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollRowToVisible_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRowToVisible_inColumn_IMetInst(){
		return ((scrollRowToVisible_inColumn_IMetInst != null)
	? (scrollRowToVisible_inColumn_IMetInst)
	: (scrollRowToVisible_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRowToVisible:inColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollRowToVisible_inColumn(final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend scrollRowToVisible_inColumn_IMetInst = get_scrollRowToVisible_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRowToVisible_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		scrollRowToVisible_inColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollViaScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollViaScroller_IMetInst(){
		return ((scrollViaScroller_IMetInst != null)
	? (scrollViaScroller_IMetInst)
	: (scrollViaScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollViaScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void scrollViaScroller(final com.apple.jobjc.appkit.NSScroller sender){
			final com.apple.jobjc.Invoke.MsgSend scrollViaScroller_IMetInst = get_scrollViaScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollViaScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		scrollViaScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectAll_IMetInst(){
		return ((selectAll_IMetInst != null)
	? (selectAll_IMetInst)
	: (selectAll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectAll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectAll(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst = get_selectAll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectAll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectAll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectRow_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectRow_inColumn_IMetInst(){
		return ((selectRow_inColumn_IMetInst != null)
	? (selectRow_inColumn_IMetInst)
	: (selectRow_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectRow:inColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectRow_inColumn(final long row, final long column){
			final com.apple.jobjc.Invoke.MsgSend selectRow_inColumn_IMetInst = get_selectRow_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectRow_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		selectRow_inColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectRowIndexes_inColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectRowIndexes_inColumn_IMetInst(){
		return ((selectRowIndexes_inColumn_IMetInst != null)
	? (selectRowIndexes_inColumn_IMetInst)
	: (selectRowIndexes_inColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectRowIndexes:inColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectRowIndexes_inColumn(final com.apple.jobjc.foundation.NSIndexSet indexes, final long column){
			final com.apple.jobjc.Invoke.MsgSend selectRowIndexes_inColumn_IMetInst = get_selectRowIndexes_inColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectRowIndexes_inColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		selectRowIndexes_inColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedCell_IMetInst(){
		return ((selectedCell_IMetInst != null)
	? (selectedCell_IMetInst)
	: (selectedCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T selectedCell(){
			final com.apple.jobjc.Invoke.MsgSend selectedCell_IMetInst = get_selectedCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedCell_IMetInst.init(nativeBuffer, this);
		selectedCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedCellInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedCellInColumn_IMetInst(){
		return ((selectedCellInColumn_IMetInst != null)
	? (selectedCellInColumn_IMetInst)
	: (selectedCellInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedCellInColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T selectedCellInColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend selectedCellInColumn_IMetInst = get_selectedCellInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedCellInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		selectedCellInColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedCells_IMetInst(){
		return ((selectedCells_IMetInst != null)
	? (selectedCells_IMetInst)
	: (selectedCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedCells", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedCells(){
			final com.apple.jobjc.Invoke.MsgSend selectedCells_IMetInst = get_selectedCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedCells_IMetInst.init(nativeBuffer, this);
		selectedCells_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedColumn_IMetInst(){
		return ((selectedColumn_IMetInst != null)
	? (selectedColumn_IMetInst)
	: (selectedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedColumn(){
			final com.apple.jobjc.Invoke.MsgSend selectedColumn_IMetInst = get_selectedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedColumn_IMetInst.init(nativeBuffer, this);
		selectedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRowInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRowInColumn_IMetInst(){
		return ((selectedRowInColumn_IMetInst != null)
	? (selectedRowInColumn_IMetInst)
	: (selectedRowInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRowInColumn:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedRowInColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend selectedRowInColumn_IMetInst = get_selectedRowInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRowInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		selectedRowInColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRowIndexesInColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRowIndexesInColumn_IMetInst(){
		return ((selectedRowIndexesInColumn_IMetInst != null)
	? (selectedRowIndexesInColumn_IMetInst)
	: (selectedRowIndexesInColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRowIndexesInColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectedRowIndexesInColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend selectedRowIndexesInColumn_IMetInst = get_selectedRowIndexesInColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRowIndexesInColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		selectedRowIndexesInColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexPath_IMetInst(){
		return ((selectionIndexPath_IMetInst != null)
	? (selectionIndexPath_IMetInst)
	: (selectionIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath selectionIndexPath(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexPath_IMetInst = get_selectionIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexPath_IMetInst.init(nativeBuffer, this);
		selectionIndexPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexPaths_IMetInst(){
		return ((selectionIndexPaths_IMetInst != null)
	? (selectionIndexPaths_IMetInst)
	: (selectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexPaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectionIndexPaths(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexPaths_IMetInst = get_selectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexPaths_IMetInst.init(nativeBuffer, this);
		selectionIndexPaths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAction_IMetInst(){
		return ((sendAction_IMetInst != null)
	? (sendAction_IMetInst)
	: (sendAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAction", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendAction(){
			final com.apple.jobjc.Invoke.MsgSend sendAction_IMetInst = get_sendAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAction_IMetInst.init(nativeBuffer, this);
		sendAction_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendsActionOnArrowKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendsActionOnArrowKeys_IMetInst(){
		return ((sendsActionOnArrowKeys_IMetInst != null)
	? (sendsActionOnArrowKeys_IMetInst)
	: (sendsActionOnArrowKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendsActionOnArrowKeys", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendsActionOnArrowKeys(){
			final com.apple.jobjc.Invoke.MsgSend sendsActionOnArrowKeys_IMetInst = get_sendsActionOnArrowKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendsActionOnArrowKeys_IMetInst.init(nativeBuffer, this);
		sendsActionOnArrowKeys_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend separatesColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_separatesColumns_IMetInst(){
		return ((separatesColumns_IMetInst != null)
	? (separatesColumns_IMetInst)
	: (separatesColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "separatesColumns", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean separatesColumns(){
			final com.apple.jobjc.Invoke.MsgSend separatesColumns_IMetInst = get_separatesColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		separatesColumns_IMetInst.init(nativeBuffer, this);
		separatesColumns_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAcceptsArrowKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAcceptsArrowKeys_IMetInst(){
		return ((setAcceptsArrowKeys_IMetInst != null)
	? (setAcceptsArrowKeys_IMetInst)
	: (setAcceptsArrowKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAcceptsArrowKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAcceptsArrowKeys(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAcceptsArrowKeys_IMetInst = get_setAcceptsArrowKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAcceptsArrowKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAcceptsArrowKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsBranchSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsBranchSelection_IMetInst(){
		return ((setAllowsBranchSelection_IMetInst != null)
	? (setAllowsBranchSelection_IMetInst)
	: (setAllowsBranchSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsBranchSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsBranchSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsBranchSelection_IMetInst = get_setAllowsBranchSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsBranchSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsBranchSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsEmptySelection_IMetInst(){
		return ((setAllowsEmptySelection_IMetInst != null)
	? (setAllowsEmptySelection_IMetInst)
	: (setAllowsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsEmptySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsEmptySelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsEmptySelection_IMetInst = get_setAllowsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsEmptySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsEmptySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMultipleSelection_IMetInst(){
		return ((setAllowsMultipleSelection_IMetInst != null)
	? (setAllowsMultipleSelection_IMetInst)
	: (setAllowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMultipleSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMultipleSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst = get_setAllowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsTypeSelect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsTypeSelect_IMetInst(){
		return ((setAllowsTypeSelect_IMetInst != null)
	? (setAllowsTypeSelect_IMetInst)
	: (setAllowsTypeSelect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsTypeSelect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsTypeSelect(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend setAllowsTypeSelect_IMetInst = get_setAllowsTypeSelect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsTypeSelect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		setAllowsTypeSelect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutohidesScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutohidesScroller_IMetInst(){
		return ((setAutohidesScroller_IMetInst != null)
	? (setAutohidesScroller_IMetInst)
	: (setAutohidesScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutohidesScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutohidesScroller(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutohidesScroller_IMetInst = get_setAutohidesScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutohidesScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutohidesScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCellClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellClass_IMetInst(){
		return ((setCellClass_IMetInst != null)
	? (setCellClass_IMetInst)
	: (setCellClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setCellClass(final com.apple.jobjc.NSClass factoryId){
			final com.apple.jobjc.Invoke.MsgSend setCellClass_IMetInst = get_setCellClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		setCellClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCellPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellPrototype_IMetInst(){
		return ((setCellPrototype_IMetInst != null)
	? (setCellPrototype_IMetInst)
	: (setCellPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellPrototype:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCellPrototype(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend setCellPrototype_IMetInst = get_setCellPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellPrototype_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		setCellPrototype_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColumnResizingType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColumnResizingType_IMetInst(){
		return ((setColumnResizingType_IMetInst != null)
	? (setColumnResizingType_IMetInst)
	: (setColumnResizingType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColumnResizingType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setColumnResizingType(final long columnResizingType){
			final com.apple.jobjc.Invoke.MsgSend setColumnResizingType_IMetInst = get_setColumnResizingType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColumnResizingType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, columnResizingType);
		setColumnResizingType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setColumnsAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColumnsAutosaveName_IMetInst(){
		return ((setColumnsAutosaveName_IMetInst != null)
	? (setColumnsAutosaveName_IMetInst)
	: (setColumnsAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColumnsAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setColumnsAutosaveName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setColumnsAutosaveName_IMetInst = get_setColumnsAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColumnsAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setColumnsAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultColumnWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultColumnWidth_IMetInst(){
		return ((setDefaultColumnWidth_IMetInst != null)
	? (setDefaultColumnWidth_IMetInst)
	: (setDefaultColumnWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultColumnWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setDefaultColumnWidth(final double columnWidth){
			final com.apple.jobjc.Invoke.MsgSend setDefaultColumnWidth_IMetInst = get_setDefaultColumnWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultColumnWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, columnWidth);
		setDefaultColumnWidth_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDoubleAction_IMetInst(){
		return ((setDoubleAction_IMetInst != null)
	? (setDoubleAction_IMetInst)
	: (setDoubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDoubleAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setDoubleAction(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend setDoubleAction_IMetInst = get_setDoubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDoubleAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		setDoubleAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraggingSourceOperationMask_forLocal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingSourceOperationMask_forLocal_IMetInst(){
		return ((setDraggingSourceOperationMask_forLocal_IMetInst != null)
	? (setDraggingSourceOperationMask_forLocal_IMetInst)
	: (setDraggingSourceOperationMask_forLocal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingSourceOperationMask:forLocal:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDraggingSourceOperationMask_forLocal(final long mask, final boolean isLocal){
			final com.apple.jobjc.Invoke.MsgSend setDraggingSourceOperationMask_forLocal_IMetInst = get_setDraggingSourceOperationMask_forLocal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingSourceOperationMask_forLocal_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isLocal);
		setDraggingSourceOperationMask_forLocal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasHorizontalScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasHorizontalScroller_IMetInst(){
		return ((setHasHorizontalScroller_IMetInst != null)
	? (setHasHorizontalScroller_IMetInst)
	: (setHasHorizontalScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasHorizontalScroller:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasHorizontalScroller(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHasHorizontalScroller_IMetInst = get_setHasHorizontalScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasHorizontalScroller_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHasHorizontalScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLastColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLastColumn_IMetInst(){
		return ((setLastColumn_IMetInst != null)
	? (setLastColumn_IMetInst)
	: (setLastColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLastColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLastColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend setLastColumn_IMetInst = get_setLastColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLastColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		setLastColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMatrixClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMatrixClass_IMetInst(){
		return ((setMatrixClass_IMetInst != null)
	? (setMatrixClass_IMetInst)
	: (setMatrixClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMatrixClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setMatrixClass(final com.apple.jobjc.NSClass factoryId){
			final com.apple.jobjc.Invoke.MsgSend setMatrixClass_IMetInst = get_setMatrixClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMatrixClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		setMatrixClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxVisibleColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxVisibleColumns_IMetInst(){
		return ((setMaxVisibleColumns_IMetInst != null)
	? (setMaxVisibleColumns_IMetInst)
	: (setMaxVisibleColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxVisibleColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMaxVisibleColumns(final long columnCount){
			final com.apple.jobjc.Invoke.MsgSend setMaxVisibleColumns_IMetInst = get_setMaxVisibleColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxVisibleColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnCount);
		setMaxVisibleColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinColumnWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinColumnWidth_IMetInst(){
		return ((setMinColumnWidth_IMetInst != null)
	? (setMinColumnWidth_IMetInst)
	: (setMinColumnWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinColumnWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMinColumnWidth(final double columnWidth){
			final com.apple.jobjc.Invoke.MsgSend setMinColumnWidth_IMetInst = get_setMinColumnWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinColumnWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, columnWidth);
		setMinColumnWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPath_IMetInst(){
		return ((setPath_IMetInst != null)
	? (setPath_IMetInst)
	: (setPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend setPath_IMetInst = get_setPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		setPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPathSeparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPathSeparator_IMetInst(){
		return ((setPathSeparator_IMetInst != null)
	? (setPathSeparator_IMetInst)
	: (setPathSeparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPathSeparator:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPathSeparator(final com.apple.jobjc.foundation.NSString newString){
			final com.apple.jobjc.Invoke.MsgSend setPathSeparator_IMetInst = get_setPathSeparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPathSeparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newString);
		setPathSeparator_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrefersAllColumnUserResizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrefersAllColumnUserResizing_IMetInst(){
		return ((setPrefersAllColumnUserResizing_IMetInst != null)
	? (setPrefersAllColumnUserResizing_IMetInst)
	: (setPrefersAllColumnUserResizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrefersAllColumnUserResizing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPrefersAllColumnUserResizing(final boolean prefersAllColumnResizing){
			final com.apple.jobjc.Invoke.MsgSend setPrefersAllColumnUserResizing_IMetInst = get_setPrefersAllColumnUserResizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrefersAllColumnUserResizing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, prefersAllColumnResizing);
		setPrefersAllColumnUserResizing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setReusesColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReusesColumns_IMetInst(){
		return ((setReusesColumns_IMetInst != null)
	? (setReusesColumns_IMetInst)
	: (setReusesColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReusesColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setReusesColumns(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setReusesColumns_IMetInst = get_setReusesColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReusesColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setReusesColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowHeight_IMetInst(){
		return ((setRowHeight_IMetInst != null)
	? (setRowHeight_IMetInst)
	: (setRowHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setRowHeight(final double height){
			final com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst = get_setRowHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, height);
		setRowHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexPath_IMetInst(){
		return ((setSelectionIndexPath_IMetInst != null)
	? (setSelectionIndexPath_IMetInst)
	: (setSelectionIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectionIndexPath(final com.apple.jobjc.foundation.NSIndexPath path){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexPath_IMetInst = get_setSelectionIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		setSelectionIndexPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexPaths_IMetInst(){
		return ((setSelectionIndexPaths_IMetInst != null)
	? (setSelectionIndexPaths_IMetInst)
	: (setSelectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexPaths:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSelectionIndexPaths(final com.apple.jobjc.foundation.NSArray paths){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexPaths_IMetInst = get_setSelectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, paths);
		setSelectionIndexPaths_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSendsActionOnArrowKeys_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSendsActionOnArrowKeys_IMetInst(){
		return ((setSendsActionOnArrowKeys_IMetInst != null)
	? (setSendsActionOnArrowKeys_IMetInst)
	: (setSendsActionOnArrowKeys_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSendsActionOnArrowKeys:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSendsActionOnArrowKeys(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSendsActionOnArrowKeys_IMetInst = get_setSendsActionOnArrowKeys_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSendsActionOnArrowKeys_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSendsActionOnArrowKeys_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSeparatesColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSeparatesColumns_IMetInst(){
		return ((setSeparatesColumns_IMetInst != null)
	? (setSeparatesColumns_IMetInst)
	: (setSeparatesColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSeparatesColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSeparatesColumns(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSeparatesColumns_IMetInst = get_setSeparatesColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSeparatesColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSeparatesColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTakesTitleFromPreviousColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTakesTitleFromPreviousColumn_IMetInst(){
		return ((setTakesTitleFromPreviousColumn_IMetInst != null)
	? (setTakesTitleFromPreviousColumn_IMetInst)
	: (setTakesTitleFromPreviousColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTakesTitleFromPreviousColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTakesTitleFromPreviousColumn(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTakesTitleFromPreviousColumn_IMetInst = get_setTakesTitleFromPreviousColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTakesTitleFromPreviousColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTakesTitleFromPreviousColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_ofColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_ofColumn_IMetInst(){
		return ((setTitle_ofColumn_IMetInst != null)
	? (setTitle_ofColumn_IMetInst)
	: (setTitle_ofColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:ofColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTitle_ofColumn(final com.apple.jobjc.foundation.NSString aString, final long column){
			final com.apple.jobjc.Invoke.MsgSend setTitle_ofColumn_IMetInst = get_setTitle_ofColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_ofColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		setTitle_ofColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitled_IMetInst(){
		return ((setTitled_IMetInst != null)
	? (setTitled_IMetInst)
	: (setTitled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTitled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTitled_IMetInst = get_setTitled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTitled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWidth_ofColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidth_ofColumn_IMetInst(){
		return ((setWidth_ofColumn_IMetInst != null)
	? (setWidth_ofColumn_IMetInst)
	: (setWidth_ofColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidth:ofColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWidth_ofColumn(final double columnWidth, final long columnIndex){
			final com.apple.jobjc.Invoke.MsgSend setWidth_ofColumn_IMetInst = get_setWidth_ofColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidth_ofColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, columnWidth);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, columnIndex);
		setWidth_ofColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend takesTitleFromPreviousColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_takesTitleFromPreviousColumn_IMetInst(){
		return ((takesTitleFromPreviousColumn_IMetInst != null)
	? (takesTitleFromPreviousColumn_IMetInst)
	: (takesTitleFromPreviousColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "takesTitleFromPreviousColumn", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean takesTitleFromPreviousColumn(){
			final com.apple.jobjc.Invoke.MsgSend takesTitleFromPreviousColumn_IMetInst = get_takesTitleFromPreviousColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		takesTitleFromPreviousColumn_IMetInst.init(nativeBuffer, this);
		takesTitleFromPreviousColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tile_IMetInst(){
		return ((tile_IMetInst != null)
	? (tile_IMetInst)
	: (tile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tile", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void tile(){
			final com.apple.jobjc.Invoke.MsgSend tile_IMetInst = get_tile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tile_IMetInst.init(nativeBuffer, this);
		tile_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend titleFrameOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleFrameOfColumn_IMetInst(){
		return ((titleFrameOfColumn_IMetInst != null)
	? (titleFrameOfColumn_IMetInst)
	: (titleFrameOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleFrameOfColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect titleFrameOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend titleFrameOfColumn_IMetInst = get_titleFrameOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleFrameOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		titleFrameOfColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleHeight_IMetInst(){
		return ((titleHeight_IMetInst != null)
	? (titleHeight_IMetInst)
	: (titleHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double titleHeight(){
			final com.apple.jobjc.Invoke.MsgSend titleHeight_IMetInst = get_titleHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleHeight_IMetInst.init(nativeBuffer, this);
		titleHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleOfColumn_IMetInst(){
		return ((titleOfColumn_IMetInst != null)
	? (titleOfColumn_IMetInst)
	: (titleOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleOfColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString titleOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend titleOfColumn_IMetInst = get_titleOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		titleOfColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend updateScroller_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateScroller_IMetInst(){
		return ((updateScroller_IMetInst != null)
	? (updateScroller_IMetInst)
	: (updateScroller_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateScroller", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateScroller(){
			final com.apple.jobjc.Invoke.MsgSend updateScroller_IMetInst = get_updateScroller_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateScroller_IMetInst.init(nativeBuffer, this);
		updateScroller_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validateVisibleColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateVisibleColumns_IMetInst(){
		return ((validateVisibleColumns_IMetInst != null)
	? (validateVisibleColumns_IMetInst)
	: (validateVisibleColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateVisibleColumns", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void validateVisibleColumns(){
			final com.apple.jobjc.Invoke.MsgSend validateVisibleColumns_IMetInst = get_validateVisibleColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateVisibleColumns_IMetInst.init(nativeBuffer, this);
		validateVisibleColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend widthOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthOfColumn_IMetInst(){
		return ((widthOfColumn_IMetInst != null)
	? (widthOfColumn_IMetInst)
	: (widthOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthOfColumn:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double widthOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend widthOfColumn_IMetInst = get_widthOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		widthOfColumn_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
