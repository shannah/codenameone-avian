package com.apple.jobjc.appkit;

public  class NSTableView extends com.apple.jobjc.appkit.NSControl {
	public NSTableView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableView(final NSTableView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTableColumn_IMetInst(){
		return ((addTableColumn_IMetInst != null)
	? (addTableColumn_IMetInst)
	: (addTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTableColumn(final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend addTableColumn_IMetInst = get_addTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		addTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsColumnReordering_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsColumnReordering_IMetInst(){
		return ((allowsColumnReordering_IMetInst != null)
	? (allowsColumnReordering_IMetInst)
	: (allowsColumnReordering_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsColumnReordering", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsColumnReordering(){
			final com.apple.jobjc.Invoke.MsgSend allowsColumnReordering_IMetInst = get_allowsColumnReordering_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsColumnReordering_IMetInst.init(nativeBuffer, this);
		allowsColumnReordering_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsColumnResizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsColumnResizing_IMetInst(){
		return ((allowsColumnResizing_IMetInst != null)
	? (allowsColumnResizing_IMetInst)
	: (allowsColumnResizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsColumnResizing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsColumnResizing(){
			final com.apple.jobjc.Invoke.MsgSend allowsColumnResizing_IMetInst = get_allowsColumnResizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsColumnResizing_IMetInst.init(nativeBuffer, this);
		allowsColumnResizing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsColumnSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsColumnSelection_IMetInst(){
		return ((allowsColumnSelection_IMetInst != null)
	? (allowsColumnSelection_IMetInst)
	: (allowsColumnSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsColumnSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsColumnSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsColumnSelection_IMetInst = get_allowsColumnSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsColumnSelection_IMetInst.init(nativeBuffer, this);
		allowsColumnSelection_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend autoresizesAllColumnsToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoresizesAllColumnsToFit_IMetInst(){
		return ((autoresizesAllColumnsToFit_IMetInst != null)
	? (autoresizesAllColumnsToFit_IMetInst)
	: (autoresizesAllColumnsToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoresizesAllColumnsToFit", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autoresizesAllColumnsToFit(){
			final com.apple.jobjc.Invoke.MsgSend autoresizesAllColumnsToFit_IMetInst = get_autoresizesAllColumnsToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoresizesAllColumnsToFit_IMetInst.init(nativeBuffer, this);
		autoresizesAllColumnsToFit_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend autosaveTableColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosaveTableColumns_IMetInst(){
		return ((autosaveTableColumns_IMetInst != null)
	? (autosaveTableColumns_IMetInst)
	: (autosaveTableColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosaveTableColumns", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosaveTableColumns(){
			final com.apple.jobjc.Invoke.MsgSend autosaveTableColumns_IMetInst = get_autosaveTableColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosaveTableColumns_IMetInst.init(nativeBuffer, this);
		autosaveTableColumns_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend beginUpdates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginUpdates_IMetInst(){
		return ((beginUpdates_IMetInst != null)
	? (beginUpdates_IMetInst)
	: (beginUpdates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginUpdates(){
			final com.apple.jobjc.Invoke.MsgSend beginUpdates_IMetInst = get_beginUpdates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginUpdates_IMetInst.init(nativeBuffer, this);
		beginUpdates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canDragRowsWithIndexes_atPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canDragRowsWithIndexes_atPoint_IMetInst(){
		return ((canDragRowsWithIndexes_atPoint_IMetInst != null)
	? (canDragRowsWithIndexes_atPoint_IMetInst)
	: (canDragRowsWithIndexes_atPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canDragRowsWithIndexes:atPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean canDragRowsWithIndexes_atPoint(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final com.apple.jobjc.foundation.NSPoint mouseDownPoint){
			final com.apple.jobjc.Invoke.MsgSend canDragRowsWithIndexes_atPoint_IMetInst = get_canDragRowsWithIndexes_atPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canDragRowsWithIndexes_atPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, mouseDownPoint);
		canDragRowsWithIndexes_atPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend columnAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnAtPoint_IMetInst(){
		return ((columnAtPoint_IMetInst != null)
	? (columnAtPoint_IMetInst)
	: (columnAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnAtPoint:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long columnAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend columnAtPoint_IMetInst = get_columnAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		columnAtPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnAutoresizingStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnAutoresizingStyle_IMetInst(){
		return ((columnAutoresizingStyle_IMetInst != null)
	? (columnAutoresizingStyle_IMetInst)
	: (columnAutoresizingStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnAutoresizingStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long columnAutoresizingStyle(){
			final com.apple.jobjc.Invoke.MsgSend columnAutoresizingStyle_IMetInst = get_columnAutoresizingStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnAutoresizingStyle_IMetInst.init(nativeBuffer, this);
		columnAutoresizingStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnForView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnForView_IMetInst(){
		return ((columnForView_IMetInst != null)
	? (columnForView_IMetInst)
	: (columnForView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnForView:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long columnForView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend columnForView_IMetInst = get_columnForView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnForView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		columnForView_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnIndexesInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnIndexesInRect_IMetInst(){
		return ((columnIndexesInRect_IMetInst != null)
	? (columnIndexesInRect_IMetInst)
	: (columnIndexesInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnIndexesInRect:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSIndexSet columnIndexesInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend columnIndexesInRect_IMetInst = get_columnIndexesInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnIndexesInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		columnIndexesInRect_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnWithIdentifier_IMetInst(){
		return ((columnWithIdentifier_IMetInst != null)
	? (columnWithIdentifier_IMetInst)
	: (columnWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnWithIdentifier:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long columnWithIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend columnWithIdentifier_IMetInst = get_columnWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		columnWithIdentifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend columnsInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnsInRect_IMetInst(){
		return ((columnsInRect_IMetInst != null)
	? (columnsInRect_IMetInst)
	: (columnsInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnsInRect:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange columnsInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend columnsInRect_IMetInst = get_columnsInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnsInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		columnsInRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cornerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cornerView_IMetInst(){
		return ((cornerView_IMetInst != null)
	? (cornerView_IMetInst)
	: (cornerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cornerView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView cornerView(){
			final com.apple.jobjc.Invoke.MsgSend cornerView_IMetInst = get_cornerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cornerView_IMetInst.init(nativeBuffer, this);
		cornerView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend deselectAll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectAll_IMetInst(){
		return ((deselectAll_IMetInst != null)
	? (deselectAll_IMetInst)
	: (deselectAll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectAll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void deselectAll(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend deselectAll_IMetInst = get_deselectAll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectAll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		deselectAll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deselectColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectColumn_IMetInst(){
		return ((deselectColumn_IMetInst != null)
	? (deselectColumn_IMetInst)
	: (deselectColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void deselectColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend deselectColumn_IMetInst = get_deselectColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		deselectColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deselectRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectRow_IMetInst(){
		return ((deselectRow_IMetInst != null)
	? (deselectRow_IMetInst)
	: (deselectRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void deselectRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend deselectRow_IMetInst = get_deselectRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		deselectRow_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend dragImageForRows_event_dragImageOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragImageForRows_event_dragImageOffset_IMetInst(){
		return ((dragImageForRows_event_dragImageOffset_IMetInst != null)
	? (dragImageForRows_event_dragImageOffset_IMetInst)
	: (dragImageForRows_event_dragImageOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragImageForRows:event:dragImageOffset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage dragImageForRows_event_dragImageOffset(final com.apple.jobjc.foundation.NSArray dragRows, final com.apple.jobjc.appkit.NSEvent dragEvent, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend dragImageForRows_event_dragImageOffset_IMetInst = get_dragImageForRows_event_dragImageOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragImageForRows_event_dragImageOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dragRows);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dragEvent);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		dragImageForRows_event_dragImageOffset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst(){
		return ((dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst != null)
	? (dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst)
	: (dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dragImageForRowsWithIndexes:tableColumns:event:offset:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage dragImageForRowsWithIndexes_tableColumns_event_offset(final com.apple.jobjc.foundation.NSIndexSet dragRows, final com.apple.jobjc.foundation.NSArray tableColumns, final com.apple.jobjc.appkit.NSEvent dragEvent, final Object /* NSPointPointer (^{_NSPoint=ff}, ^{CGPoint=dd}) */ dragImageOffset){
			final com.apple.jobjc.Invoke.MsgSend dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst = get_dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dragRows);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumns);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dragEvent);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, dragImageOffset);
		dragImageForRowsWithIndexes_tableColumns_event_offset_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingDestinationFeedbackStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingDestinationFeedbackStyle_IMetInst(){
		return ((draggingDestinationFeedbackStyle_IMetInst != null)
	? (draggingDestinationFeedbackStyle_IMetInst)
	: (draggingDestinationFeedbackStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingDestinationFeedbackStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggingDestinationFeedbackStyle(){
			final com.apple.jobjc.Invoke.MsgSend draggingDestinationFeedbackStyle_IMetInst = get_draggingDestinationFeedbackStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingDestinationFeedbackStyle_IMetInst.init(nativeBuffer, this);
		draggingDestinationFeedbackStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawBackgroundInClipRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawBackgroundInClipRect_IMetInst(){
		return ((drawBackgroundInClipRect_IMetInst != null)
	? (drawBackgroundInClipRect_IMetInst)
	: (drawBackgroundInClipRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawBackgroundInClipRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawBackgroundInClipRect(final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.MsgSend drawBackgroundInClipRect_IMetInst = get_drawBackgroundInClipRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawBackgroundInClipRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		drawBackgroundInClipRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawGridInClipRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawGridInClipRect_IMetInst(){
		return ((drawGridInClipRect_IMetInst != null)
	? (drawGridInClipRect_IMetInst)
	: (drawGridInClipRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawGridInClipRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawGridInClipRect(final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.MsgSend drawGridInClipRect_IMetInst = get_drawGridInClipRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawGridInClipRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		drawGridInClipRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawRow_clipRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawRow_clipRect_IMetInst(){
		return ((drawRow_clipRect_IMetInst != null)
	? (drawRow_clipRect_IMetInst)
	: (drawRow_clipRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawRow:clipRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void drawRow_clipRect(final long row, final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.MsgSend drawRow_clipRect_IMetInst = get_drawRow_clipRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawRow_clipRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		drawRow_clipRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsGrid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsGrid_IMetInst(){
		return ((drawsGrid_IMetInst != null)
	? (drawsGrid_IMetInst)
	: (drawsGrid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsGrid", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsGrid(){
			final com.apple.jobjc.Invoke.MsgSend drawsGrid_IMetInst = get_drawsGrid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsGrid_IMetInst.init(nativeBuffer, this);
		drawsGrid_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend editColumn_row_withEvent_select_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editColumn_row_withEvent_select_IMetInst(){
		return ((editColumn_row_withEvent_select_IMetInst != null)
	? (editColumn_row_withEvent_select_IMetInst)
	: (editColumn_row_withEvent_select_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editColumn:row:withEvent:select:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void editColumn_row_withEvent_select(final long column, final long row, final com.apple.jobjc.appkit.NSEvent theEvent, final boolean select){
			final com.apple.jobjc.Invoke.MsgSend editColumn_row_withEvent_select_IMetInst = get_editColumn_row_withEvent_select_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editColumn_row_withEvent_select_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, select);
		editColumn_row_withEvent_select_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend editedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editedColumn_IMetInst(){
		return ((editedColumn_IMetInst != null)
	? (editedColumn_IMetInst)
	: (editedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long editedColumn(){
			final com.apple.jobjc.Invoke.MsgSend editedColumn_IMetInst = get_editedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editedColumn_IMetInst.init(nativeBuffer, this);
		editedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend editedRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_editedRow_IMetInst(){
		return ((editedRow_IMetInst != null)
	? (editedRow_IMetInst)
	: (editedRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "editedRow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long editedRow(){
			final com.apple.jobjc.Invoke.MsgSend editedRow_IMetInst = get_editedRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		editedRow_IMetInst.init(nativeBuffer, this);
		editedRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend effectiveRowSizeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_effectiveRowSizeStyle_IMetInst(){
		return ((effectiveRowSizeStyle_IMetInst != null)
	? (effectiveRowSizeStyle_IMetInst)
	: (effectiveRowSizeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "effectiveRowSizeStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long effectiveRowSizeStyle(){
			final com.apple.jobjc.Invoke.MsgSend effectiveRowSizeStyle_IMetInst = get_effectiveRowSizeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		effectiveRowSizeStyle_IMetInst.init(nativeBuffer, this);
		effectiveRowSizeStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endUpdates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endUpdates_IMetInst(){
		return ((endUpdates_IMetInst != null)
	? (endUpdates_IMetInst)
	: (endUpdates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endUpdates", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endUpdates(){
			final com.apple.jobjc.Invoke.MsgSend endUpdates_IMetInst = get_endUpdates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endUpdates_IMetInst.init(nativeBuffer, this);
		endUpdates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateAvailableRowViewsUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateAvailableRowViewsUsingBlock_IMetInst(){
		return ((enumerateAvailableRowViewsUsingBlock_IMetInst != null)
	? (enumerateAvailableRowViewsUsingBlock_IMetInst)
	: (enumerateAvailableRowViewsUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateAvailableRowViewsUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateAvailableRowViewsUsingBlock(final Object /* void(^)(NSTableRowView*,NSInteger) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend enumerateAvailableRowViewsUsingBlock_IMetInst = get_enumerateAvailableRowViewsUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateAvailableRowViewsUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		enumerateAvailableRowViewsUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend floatsGroupRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_floatsGroupRows_IMetInst(){
		return ((floatsGroupRows_IMetInst != null)
	? (floatsGroupRows_IMetInst)
	: (floatsGroupRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "floatsGroupRows", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean floatsGroupRows(){
			final com.apple.jobjc.Invoke.MsgSend floatsGroupRows_IMetInst = get_floatsGroupRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		floatsGroupRows_IMetInst.init(nativeBuffer, this);
		floatsGroupRows_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend focusedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_focusedColumn_IMetInst(){
		return ((focusedColumn_IMetInst != null)
	? (focusedColumn_IMetInst)
	: (focusedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "focusedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long focusedColumn(){
			final com.apple.jobjc.Invoke.MsgSend focusedColumn_IMetInst = get_focusedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		focusedColumn_IMetInst.init(nativeBuffer, this);
		focusedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend frameOfCellAtColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frameOfCellAtColumn_row_IMetInst(){
		return ((frameOfCellAtColumn_row_IMetInst != null)
	? (frameOfCellAtColumn_row_IMetInst)
	: (frameOfCellAtColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frameOfCellAtColumn:row:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect frameOfCellAtColumn_row(final long column, final long row){
			final com.apple.jobjc.Invoke.MsgSend frameOfCellAtColumn_row_IMetInst = get_frameOfCellAtColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frameOfCellAtColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		frameOfCellAtColumn_row_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend gridColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gridColor_IMetInst(){
		return ((gridColor_IMetInst != null)
	? (gridColor_IMetInst)
	: (gridColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gridColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor gridColor(){
			final com.apple.jobjc.Invoke.MsgSend gridColor_IMetInst = get_gridColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gridColor_IMetInst.init(nativeBuffer, this);
		gridColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend gridStyleMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_gridStyleMask_IMetInst(){
		return ((gridStyleMask_IMetInst != null)
	? (gridStyleMask_IMetInst)
	: (gridStyleMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "gridStyleMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long gridStyleMask(){
			final com.apple.jobjc.Invoke.MsgSend gridStyleMask_IMetInst = get_gridStyleMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		gridStyleMask_IMetInst.init(nativeBuffer, this);
		gridStyleMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerView_IMetInst(){
		return ((headerView_IMetInst != null)
	? (headerView_IMetInst)
	: (headerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableHeaderView headerView(){
			final com.apple.jobjc.Invoke.MsgSend headerView_IMetInst = get_headerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerView_IMetInst.init(nativeBuffer, this);
		headerView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableHeaderView returnValue = (com.apple.jobjc.appkit.NSTableHeaderView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightSelectionInClipRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightSelectionInClipRect_IMetInst(){
		return ((highlightSelectionInClipRect_IMetInst != null)
	? (highlightSelectionInClipRect_IMetInst)
	: (highlightSelectionInClipRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightSelectionInClipRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void highlightSelectionInClipRect(final com.apple.jobjc.foundation.NSRect clipRect){
			final com.apple.jobjc.Invoke.MsgSend highlightSelectionInClipRect_IMetInst = get_highlightSelectionInClipRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightSelectionInClipRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, clipRect);
		highlightSelectionInClipRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightedTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightedTableColumn_IMetInst(){
		return ((highlightedTableColumn_IMetInst != null)
	? (highlightedTableColumn_IMetInst)
	: (highlightedTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightedTableColumn", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableColumn highlightedTableColumn(){
			final com.apple.jobjc.Invoke.MsgSend highlightedTableColumn_IMetInst = get_highlightedTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightedTableColumn_IMetInst.init(nativeBuffer, this);
		highlightedTableColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableColumn returnValue = (com.apple.jobjc.appkit.NSTableColumn) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indicatorImageInTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indicatorImageInTableColumn_IMetInst(){
		return ((indicatorImageInTableColumn_IMetInst != null)
	? (indicatorImageInTableColumn_IMetInst)
	: (indicatorImageInTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indicatorImageInTableColumn:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage indicatorImageInTableColumn(final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend indicatorImageInTableColumn_IMetInst = get_indicatorImageInTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indicatorImageInTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		indicatorImageInTableColumn_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertRowsAtIndexes_withAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertRowsAtIndexes_withAnimation_IMetInst(){
		return ((insertRowsAtIndexes_withAnimation_IMetInst != null)
	? (insertRowsAtIndexes_withAnimation_IMetInst)
	: (insertRowsAtIndexes_withAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertRowsAtIndexes:withAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertRowsAtIndexes_withAnimation(final com.apple.jobjc.foundation.NSIndexSet indexes, final long animationOptions){
			final com.apple.jobjc.Invoke.MsgSend insertRowsAtIndexes_withAnimation_IMetInst = get_insertRowsAtIndexes_withAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertRowsAtIndexes_withAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationOptions);
		insertRowsAtIndexes_withAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend intercellSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intercellSpacing_IMetInst(){
		return ((intercellSpacing_IMetInst != null)
	? (intercellSpacing_IMetInst)
	: (intercellSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intercellSpacing", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize intercellSpacing(){
			final com.apple.jobjc.Invoke.MsgSend intercellSpacing_IMetInst = get_intercellSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intercellSpacing_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		intercellSpacing_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isColumnSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isColumnSelected_IMetInst(){
		return ((isColumnSelected_IMetInst != null)
	? (isColumnSelected_IMetInst)
	: (isColumnSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isColumnSelected:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean isColumnSelected(final long column){
			final com.apple.jobjc.Invoke.MsgSend isColumnSelected_IMetInst = get_isColumnSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isColumnSelected_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		isColumnSelected_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRowSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRowSelected_IMetInst(){
		return ((isRowSelected_IMetInst != null)
	? (isRowSelected_IMetInst)
	: (isRowSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRowSelected:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean isRowSelected(final long row){
			final com.apple.jobjc.Invoke.MsgSend isRowSelected_IMetInst = get_isRowSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRowSelected_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		isRowSelected_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeViewWithIdentifier_owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeViewWithIdentifier_owner_IMetInst(){
		return ((makeViewWithIdentifier_owner_IMetInst != null)
	? (makeViewWithIdentifier_owner_IMetInst)
	: (makeViewWithIdentifier_owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeViewWithIdentifier:owner:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeViewWithIdentifier_owner(final com.apple.jobjc.foundation.NSString identifier, final com.apple.jobjc.ID owner){
			final com.apple.jobjc.Invoke.MsgSend makeViewWithIdentifier_owner_IMetInst = get_makeViewWithIdentifier_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeViewWithIdentifier_owner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		makeViewWithIdentifier_owner_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveColumn_toColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveColumn_toColumn_IMetInst(){
		return ((moveColumn_toColumn_IMetInst != null)
	? (moveColumn_toColumn_IMetInst)
	: (moveColumn_toColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveColumn:toColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void moveColumn_toColumn(final long oldIndex, final long newIndex){
			final com.apple.jobjc.Invoke.MsgSend moveColumn_toColumn_IMetInst = get_moveColumn_toColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveColumn_toColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, oldIndex);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newIndex);
		moveColumn_toColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveRowAtIndex_toIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveRowAtIndex_toIndex_IMetInst(){
		return ((moveRowAtIndex_toIndex_IMetInst != null)
	? (moveRowAtIndex_toIndex_IMetInst)
	: (moveRowAtIndex_toIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveRowAtIndex:toIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void moveRowAtIndex_toIndex(final long oldIndex, final long newIndex){
			final com.apple.jobjc.Invoke.MsgSend moveRowAtIndex_toIndex_IMetInst = get_moveRowAtIndex_toIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveRowAtIndex_toIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, oldIndex);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newIndex);
		moveRowAtIndex_toIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteHeightOfRowsWithIndexesChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteHeightOfRowsWithIndexesChanged_IMetInst(){
		return ((noteHeightOfRowsWithIndexesChanged_IMetInst != null)
	? (noteHeightOfRowsWithIndexesChanged_IMetInst)
	: (noteHeightOfRowsWithIndexesChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteHeightOfRowsWithIndexesChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void noteHeightOfRowsWithIndexesChanged(final com.apple.jobjc.foundation.NSIndexSet indexSet){
			final com.apple.jobjc.Invoke.MsgSend noteHeightOfRowsWithIndexesChanged_IMetInst = get_noteHeightOfRowsWithIndexesChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteHeightOfRowsWithIndexesChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexSet);
		noteHeightOfRowsWithIndexesChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteNumberOfRowsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteNumberOfRowsChanged_IMetInst(){
		return ((noteNumberOfRowsChanged_IMetInst != null)
	? (noteNumberOfRowsChanged_IMetInst)
	: (noteNumberOfRowsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteNumberOfRowsChanged", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteNumberOfRowsChanged(){
			final com.apple.jobjc.Invoke.MsgSend noteNumberOfRowsChanged_IMetInst = get_noteNumberOfRowsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteNumberOfRowsChanged_IMetInst.init(nativeBuffer, this);
		noteNumberOfRowsChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfColumns_IMetInst(){
		return ((numberOfColumns_IMetInst != null)
	? (numberOfColumns_IMetInst)
	: (numberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfColumns", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfColumns(){
			final com.apple.jobjc.Invoke.MsgSend numberOfColumns_IMetInst = get_numberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfColumns_IMetInst.init(nativeBuffer, this);
		numberOfColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfRows_IMetInst(){
		return ((numberOfRows_IMetInst != null)
	? (numberOfRows_IMetInst)
	: (numberOfRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfRows", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfRows(){
			final com.apple.jobjc.Invoke.MsgSend numberOfRows_IMetInst = get_numberOfRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfRows_IMetInst.init(nativeBuffer, this);
		numberOfRows_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfSelectedColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfSelectedColumns_IMetInst(){
		return ((numberOfSelectedColumns_IMetInst != null)
	? (numberOfSelectedColumns_IMetInst)
	: (numberOfSelectedColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfSelectedColumns", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfSelectedColumns(){
			final com.apple.jobjc.Invoke.MsgSend numberOfSelectedColumns_IMetInst = get_numberOfSelectedColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfSelectedColumns_IMetInst.init(nativeBuffer, this);
		numberOfSelectedColumns_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfSelectedRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfSelectedRows_IMetInst(){
		return ((numberOfSelectedRows_IMetInst != null)
	? (numberOfSelectedRows_IMetInst)
	: (numberOfSelectedRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfSelectedRows", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfSelectedRows(){
			final com.apple.jobjc.Invoke.MsgSend numberOfSelectedRows_IMetInst = get_numberOfSelectedRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfSelectedRows_IMetInst.init(nativeBuffer, this);
		numberOfSelectedRows_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performClickOnCellAtColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performClickOnCellAtColumn_row_IMetInst(){
		return ((performClickOnCellAtColumn_row_IMetInst != null)
	? (performClickOnCellAtColumn_row_IMetInst)
	: (performClickOnCellAtColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performClickOnCellAtColumn:row:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void performClickOnCellAtColumn_row(final long column, final long row){
			final com.apple.jobjc.Invoke.MsgSend performClickOnCellAtColumn_row_IMetInst = get_performClickOnCellAtColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performClickOnCellAtColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		performClickOnCellAtColumn_row_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preparedCellAtColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preparedCellAtColumn_row_IMetInst(){
		return ((preparedCellAtColumn_row_IMetInst != null)
	? (preparedCellAtColumn_row_IMetInst)
	: (preparedCellAtColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preparedCellAtColumn:row:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSCell preparedCellAtColumn_row(final long column, final long row){
			final com.apple.jobjc.Invoke.MsgSend preparedCellAtColumn_row_IMetInst = get_preparedCellAtColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preparedCellAtColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		preparedCellAtColumn_row_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCell returnValue = (com.apple.jobjc.appkit.NSCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectOfColumn_IMetInst(){
		return ((rectOfColumn_IMetInst != null)
	? (rectOfColumn_IMetInst)
	: (rectOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectOfColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect rectOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend rectOfColumn_IMetInst = get_rectOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectOfColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rectOfRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rectOfRow_IMetInst(){
		return ((rectOfRow_IMetInst != null)
	? (rectOfRow_IMetInst)
	: (rectOfRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rectOfRow:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect rectOfRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend rectOfRow_IMetInst = get_rectOfRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rectOfRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		rectOfRow_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerNib_forIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerNib_forIdentifier_IMetInst(){
		return ((registerNib_forIdentifier_IMetInst != null)
	? (registerNib_forIdentifier_IMetInst)
	: (registerNib_forIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerNib:forIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerNib_forIdentifier(final com.apple.jobjc.appkit.NSNib nib, final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend registerNib_forIdentifier_IMetInst = get_registerNib_forIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerNib_forIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nib);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		registerNib_forIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registeredNibsByIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registeredNibsByIdentifier_IMetInst(){
		return ((registeredNibsByIdentifier_IMetInst != null)
	? (registeredNibsByIdentifier_IMetInst)
	: (registeredNibsByIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registeredNibsByIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary registeredNibsByIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend registeredNibsByIdentifier_IMetInst = get_registeredNibsByIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registeredNibsByIdentifier_IMetInst.init(nativeBuffer, this);
		registeredNibsByIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadData_IMetInst(){
		return ((reloadData_IMetInst != null)
	? (reloadData_IMetInst)
	: (reloadData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadData", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void reloadData(){
			final com.apple.jobjc.Invoke.MsgSend reloadData_IMetInst = get_reloadData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadData_IMetInst.init(nativeBuffer, this);
		reloadData_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reloadDataForRowIndexes_columnIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reloadDataForRowIndexes_columnIndexes_IMetInst(){
		return ((reloadDataForRowIndexes_columnIndexes_IMetInst != null)
	? (reloadDataForRowIndexes_columnIndexes_IMetInst)
	: (reloadDataForRowIndexes_columnIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reloadDataForRowIndexes:columnIndexes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void reloadDataForRowIndexes_columnIndexes(final com.apple.jobjc.foundation.NSIndexSet rowIndexes, final com.apple.jobjc.foundation.NSIndexSet columnIndexes){
			final com.apple.jobjc.Invoke.MsgSend reloadDataForRowIndexes_columnIndexes_IMetInst = get_reloadDataForRowIndexes_columnIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reloadDataForRowIndexes_columnIndexes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rowIndexes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, columnIndexes);
		reloadDataForRowIndexes_columnIndexes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRowsAtIndexes_withAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRowsAtIndexes_withAnimation_IMetInst(){
		return ((removeRowsAtIndexes_withAnimation_IMetInst != null)
	? (removeRowsAtIndexes_withAnimation_IMetInst)
	: (removeRowsAtIndexes_withAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRowsAtIndexes:withAnimation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeRowsAtIndexes_withAnimation(final com.apple.jobjc.foundation.NSIndexSet indexes, final long animationOptions){
			final com.apple.jobjc.Invoke.MsgSend removeRowsAtIndexes_withAnimation_IMetInst = get_removeRowsAtIndexes_withAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRowsAtIndexes_withAnimation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, animationOptions);
		removeRowsAtIndexes_withAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTableColumn_IMetInst(){
		return ((removeTableColumn_IMetInst != null)
	? (removeTableColumn_IMetInst)
	: (removeTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeTableColumn(final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend removeTableColumn_IMetInst = get_removeTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		removeTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rowAtPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowAtPoint_IMetInst(){
		return ((rowAtPoint_IMetInst != null)
	? (rowAtPoint_IMetInst)
	: (rowAtPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowAtPoint:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public long rowAtPoint(final com.apple.jobjc.foundation.NSPoint point){
			final com.apple.jobjc.Invoke.MsgSend rowAtPoint_IMetInst = get_rowAtPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowAtPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		rowAtPoint_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowForView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowForView_IMetInst(){
		return ((rowForView_IMetInst != null)
	? (rowForView_IMetInst)
	: (rowForView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowForView:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long rowForView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend rowForView_IMetInst = get_rowForView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowForView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		rowForView_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend rowSizeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowSizeStyle_IMetInst(){
		return ((rowSizeStyle_IMetInst != null)
	? (rowSizeStyle_IMetInst)
	: (rowSizeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowSizeStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long rowSizeStyle(){
			final com.apple.jobjc.Invoke.MsgSend rowSizeStyle_IMetInst = get_rowSizeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowSizeStyle_IMetInst.init(nativeBuffer, this);
		rowSizeStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowViewAtRow_makeIfNecessary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowViewAtRow_makeIfNecessary_IMetInst(){
		return ((rowViewAtRow_makeIfNecessary_IMetInst != null)
	? (rowViewAtRow_makeIfNecessary_IMetInst)
	: (rowViewAtRow_makeIfNecessary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowViewAtRow:makeIfNecessary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T rowViewAtRow_makeIfNecessary(final long row, final boolean makeIfNecessary){
			final com.apple.jobjc.Invoke.MsgSend rowViewAtRow_makeIfNecessary_IMetInst = get_rowViewAtRow_makeIfNecessary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowViewAtRow_makeIfNecessary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, makeIfNecessary);
		rowViewAtRow_makeIfNecessary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowsInRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowsInRect_IMetInst(){
		return ((rowsInRect_IMetInst != null)
	? (rowsInRect_IMetInst)
	: (rowsInRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowsInRect:", com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange rowsInRect(final com.apple.jobjc.foundation.NSRect rect){
			final com.apple.jobjc.Invoke.MsgSend rowsInRect_IMetInst = get_rowsInRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowsInRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		rowsInRect_IMetInst.invoke(nativeBuffer, returnValue);
		
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

	private static com.apple.jobjc.Invoke.MsgSend scrollRowToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRowToVisible_IMetInst(){
		return ((scrollRowToVisible_IMetInst != null)
	? (scrollRowToVisible_IMetInst)
	: (scrollRowToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRowToVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollRowToVisible(final long row){
			final com.apple.jobjc.Invoke.MsgSend scrollRowToVisible_IMetInst = get_scrollRowToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRowToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		scrollRowToVisible_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend selectColumn_byExtendingSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectColumn_byExtendingSelection_IMetInst(){
		return ((selectColumn_byExtendingSelection_IMetInst != null)
	? (selectColumn_byExtendingSelection_IMetInst)
	: (selectColumn_byExtendingSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectColumn:byExtendingSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void selectColumn_byExtendingSelection(final long column, final boolean extend){
			final com.apple.jobjc.Invoke.MsgSend selectColumn_byExtendingSelection_IMetInst = get_selectColumn_byExtendingSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectColumn_byExtendingSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, extend);
		selectColumn_byExtendingSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectColumnIndexes_byExtendingSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectColumnIndexes_byExtendingSelection_IMetInst(){
		return ((selectColumnIndexes_byExtendingSelection_IMetInst != null)
	? (selectColumnIndexes_byExtendingSelection_IMetInst)
	: (selectColumnIndexes_byExtendingSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectColumnIndexes:byExtendingSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void selectColumnIndexes_byExtendingSelection(final com.apple.jobjc.foundation.NSIndexSet indexes, final boolean extend){
			final com.apple.jobjc.Invoke.MsgSend selectColumnIndexes_byExtendingSelection_IMetInst = get_selectColumnIndexes_byExtendingSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectColumnIndexes_byExtendingSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, extend);
		selectColumnIndexes_byExtendingSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectRow_byExtendingSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectRow_byExtendingSelection_IMetInst(){
		return ((selectRow_byExtendingSelection_IMetInst != null)
	? (selectRow_byExtendingSelection_IMetInst)
	: (selectRow_byExtendingSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectRow:byExtendingSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void selectRow_byExtendingSelection(final long row, final boolean extend){
			final com.apple.jobjc.Invoke.MsgSend selectRow_byExtendingSelection_IMetInst = get_selectRow_byExtendingSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectRow_byExtendingSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, extend);
		selectRow_byExtendingSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectRowIndexes_byExtendingSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectRowIndexes_byExtendingSelection_IMetInst(){
		return ((selectRowIndexes_byExtendingSelection_IMetInst != null)
	? (selectRowIndexes_byExtendingSelection_IMetInst)
	: (selectRowIndexes_byExtendingSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectRowIndexes:byExtendingSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void selectRowIndexes_byExtendingSelection(final com.apple.jobjc.foundation.NSIndexSet indexes, final boolean extend){
			final com.apple.jobjc.Invoke.MsgSend selectRowIndexes_byExtendingSelection_IMetInst = get_selectRowIndexes_byExtendingSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectRowIndexes_byExtendingSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, extend);
		selectRowIndexes_byExtendingSelection_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend selectedColumnEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedColumnEnumerator_IMetInst(){
		return ((selectedColumnEnumerator_IMetInst != null)
	? (selectedColumnEnumerator_IMetInst)
	: (selectedColumnEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedColumnEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator selectedColumnEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend selectedColumnEnumerator_IMetInst = get_selectedColumnEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedColumnEnumerator_IMetInst.init(nativeBuffer, this);
		selectedColumnEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedColumnIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedColumnIndexes_IMetInst(){
		return ((selectedColumnIndexes_IMetInst != null)
	? (selectedColumnIndexes_IMetInst)
	: (selectedColumnIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedColumnIndexes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectedColumnIndexes(){
			final com.apple.jobjc.Invoke.MsgSend selectedColumnIndexes_IMetInst = get_selectedColumnIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedColumnIndexes_IMetInst.init(nativeBuffer, this);
		selectedColumnIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRow_IMetInst(){
		return ((selectedRow_IMetInst != null)
	? (selectedRow_IMetInst)
	: (selectedRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedRow(){
			final com.apple.jobjc.Invoke.MsgSend selectedRow_IMetInst = get_selectedRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRow_IMetInst.init(nativeBuffer, this);
		selectedRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRowEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRowEnumerator_IMetInst(){
		return ((selectedRowEnumerator_IMetInst != null)
	? (selectedRowEnumerator_IMetInst)
	: (selectedRowEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRowEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator selectedRowEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend selectedRowEnumerator_IMetInst = get_selectedRowEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRowEnumerator_IMetInst.init(nativeBuffer, this);
		selectedRowEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRowIndexes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRowIndexes_IMetInst(){
		return ((selectedRowIndexes_IMetInst != null)
	? (selectedRowIndexes_IMetInst)
	: (selectedRowIndexes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRowIndexes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexSet selectedRowIndexes(){
			final com.apple.jobjc.Invoke.MsgSend selectedRowIndexes_IMetInst = get_selectedRowIndexes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRowIndexes_IMetInst.init(nativeBuffer, this);
		selectedRowIndexes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexSet returnValue = (com.apple.jobjc.foundation.NSIndexSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionHighlightStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionHighlightStyle_IMetInst(){
		return ((selectionHighlightStyle_IMetInst != null)
	? (selectionHighlightStyle_IMetInst)
	: (selectionHighlightStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionHighlightStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectionHighlightStyle(){
			final com.apple.jobjc.Invoke.MsgSend selectionHighlightStyle_IMetInst = get_selectionHighlightStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionHighlightStyle_IMetInst.init(nativeBuffer, this);
		selectionHighlightStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsColumnReordering_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsColumnReordering_IMetInst(){
		return ((setAllowsColumnReordering_IMetInst != null)
	? (setAllowsColumnReordering_IMetInst)
	: (setAllowsColumnReordering_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsColumnReordering:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsColumnReordering(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsColumnReordering_IMetInst = get_setAllowsColumnReordering_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsColumnReordering_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsColumnReordering_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsColumnResizing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsColumnResizing_IMetInst(){
		return ((setAllowsColumnResizing_IMetInst != null)
	? (setAllowsColumnResizing_IMetInst)
	: (setAllowsColumnResizing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsColumnResizing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsColumnResizing(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsColumnResizing_IMetInst = get_setAllowsColumnResizing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsColumnResizing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsColumnResizing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsColumnSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsColumnSelection_IMetInst(){
		return ((setAllowsColumnSelection_IMetInst != null)
	? (setAllowsColumnSelection_IMetInst)
	: (setAllowsColumnSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsColumnSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsColumnSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsColumnSelection_IMetInst = get_setAllowsColumnSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsColumnSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsColumnSelection_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setAutoresizesAllColumnsToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoresizesAllColumnsToFit_IMetInst(){
		return ((setAutoresizesAllColumnsToFit_IMetInst != null)
	? (setAutoresizesAllColumnsToFit_IMetInst)
	: (setAutoresizesAllColumnsToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoresizesAllColumnsToFit:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoresizesAllColumnsToFit(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutoresizesAllColumnsToFit_IMetInst = get_setAutoresizesAllColumnsToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoresizesAllColumnsToFit_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutoresizesAllColumnsToFit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosaveName_IMetInst(){
		return ((setAutosaveName_IMetInst != null)
	? (setAutosaveName_IMetInst)
	: (setAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAutosaveName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setAutosaveName_IMetInst = get_setAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosaveTableColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosaveTableColumns_IMetInst(){
		return ((setAutosaveTableColumns_IMetInst != null)
	? (setAutosaveTableColumns_IMetInst)
	: (setAutosaveTableColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosaveTableColumns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutosaveTableColumns(final boolean save){
			final com.apple.jobjc.Invoke.MsgSend setAutosaveTableColumns_IMetInst = get_setAutosaveTableColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosaveTableColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, save);
		setAutosaveTableColumns_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setColumnAutoresizingStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setColumnAutoresizingStyle_IMetInst(){
		return ((setColumnAutoresizingStyle_IMetInst != null)
	? (setColumnAutoresizingStyle_IMetInst)
	: (setColumnAutoresizingStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setColumnAutoresizingStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setColumnAutoresizingStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setColumnAutoresizingStyle_IMetInst = get_setColumnAutoresizingStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setColumnAutoresizingStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setColumnAutoresizingStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCornerView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCornerView_IMetInst(){
		return ((setCornerView_IMetInst != null)
	? (setCornerView_IMetInst)
	: (setCornerView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCornerView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCornerView(final com.apple.jobjc.appkit.NSView cornerView){
			final com.apple.jobjc.Invoke.MsgSend setCornerView_IMetInst = get_setCornerView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCornerView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cornerView);
		setCornerView_IMetInst.invoke(nativeBuffer);
		
		
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

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
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

	private static com.apple.jobjc.Invoke.MsgSend setDraggingDestinationFeedbackStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraggingDestinationFeedbackStyle_IMetInst(){
		return ((setDraggingDestinationFeedbackStyle_IMetInst != null)
	? (setDraggingDestinationFeedbackStyle_IMetInst)
	: (setDraggingDestinationFeedbackStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraggingDestinationFeedbackStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setDraggingDestinationFeedbackStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setDraggingDestinationFeedbackStyle_IMetInst = get_setDraggingDestinationFeedbackStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraggingDestinationFeedbackStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, style);
		setDraggingDestinationFeedbackStyle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setDrawsGrid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsGrid_IMetInst(){
		return ((setDrawsGrid_IMetInst != null)
	? (setDrawsGrid_IMetInst)
	: (setDrawsGrid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsGrid:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsGrid(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsGrid_IMetInst = get_setDrawsGrid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsGrid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsGrid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDropRow_dropOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDropRow_dropOperation_IMetInst(){
		return ((setDropRow_dropOperation_IMetInst != null)
	? (setDropRow_dropOperation_IMetInst)
	: (setDropRow_dropOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDropRow:dropOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDropRow_dropOperation(final long row, final long dropOperation){
			final com.apple.jobjc.Invoke.MsgSend setDropRow_dropOperation_IMetInst = get_setDropRow_dropOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDropRow_dropOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, dropOperation);
		setDropRow_dropOperation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloatsGroupRows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloatsGroupRows_IMetInst(){
		return ((setFloatsGroupRows_IMetInst != null)
	? (setFloatsGroupRows_IMetInst)
	: (setFloatsGroupRows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloatsGroupRows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFloatsGroupRows(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend setFloatsGroupRows_IMetInst = get_setFloatsGroupRows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloatsGroupRows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		setFloatsGroupRows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFocusedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFocusedColumn_IMetInst(){
		return ((setFocusedColumn_IMetInst != null)
	? (setFocusedColumn_IMetInst)
	: (setFocusedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFocusedColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setFocusedColumn(final long focusedColumn){
			final com.apple.jobjc.Invoke.MsgSend setFocusedColumn_IMetInst = get_setFocusedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFocusedColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, focusedColumn);
		setFocusedColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGridColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGridColor_IMetInst(){
		return ((setGridColor_IMetInst != null)
	? (setGridColor_IMetInst)
	: (setGridColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGridColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setGridColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setGridColor_IMetInst = get_setGridColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGridColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setGridColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGridStyleMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGridStyleMask_IMetInst(){
		return ((setGridStyleMask_IMetInst != null)
	? (setGridStyleMask_IMetInst)
	: (setGridStyleMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGridStyleMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setGridStyleMask(final long gridStyle){
			final com.apple.jobjc.Invoke.MsgSend setGridStyleMask_IMetInst = get_setGridStyleMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGridStyleMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, gridStyle);
		setGridStyleMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeaderView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeaderView_IMetInst(){
		return ((setHeaderView_IMetInst != null)
	? (setHeaderView_IMetInst)
	: (setHeaderView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeaderView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHeaderView(final com.apple.jobjc.appkit.NSTableHeaderView headerView){
			final com.apple.jobjc.Invoke.MsgSend setHeaderView_IMetInst = get_setHeaderView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeaderView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, headerView);
		setHeaderView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHighlightedTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHighlightedTableColumn_IMetInst(){
		return ((setHighlightedTableColumn_IMetInst != null)
	? (setHighlightedTableColumn_IMetInst)
	: (setHighlightedTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHighlightedTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHighlightedTableColumn(final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend setHighlightedTableColumn_IMetInst = get_setHighlightedTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHighlightedTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		setHighlightedTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndicatorImage_inTableColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndicatorImage_inTableColumn_IMetInst(){
		return ((setIndicatorImage_inTableColumn_IMetInst != null)
	? (setIndicatorImage_inTableColumn_IMetInst)
	: (setIndicatorImage_inTableColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndicatorImage:inTableColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIndicatorImage_inTableColumn(final com.apple.jobjc.appkit.NSImage anImage, final com.apple.jobjc.appkit.NSTableColumn tableColumn){
			final com.apple.jobjc.Invoke.MsgSend setIndicatorImage_inTableColumn_IMetInst = get_setIndicatorImage_inTableColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndicatorImage_inTableColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anImage);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableColumn);
		setIndicatorImage_inTableColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIntercellSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIntercellSpacing_IMetInst(){
		return ((setIntercellSpacing_IMetInst != null)
	? (setIntercellSpacing_IMetInst)
	: (setIntercellSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIntercellSpacing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setIntercellSpacing(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend setIntercellSpacing_IMetInst = get_setIntercellSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIntercellSpacing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		setIntercellSpacing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowHeight_IMetInst(){
		return ((setRowHeight_IMetInst != null)
	? (setRowHeight_IMetInst)
	: (setRowHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setRowHeight(final double rowHeight){
			final com.apple.jobjc.Invoke.MsgSend setRowHeight_IMetInst = get_setRowHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, rowHeight);
		setRowHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowSizeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowSizeStyle_IMetInst(){
		return ((setRowSizeStyle_IMetInst != null)
	? (setRowSizeStyle_IMetInst)
	: (setRowSizeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowSizeStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setRowSizeStyle(final long rowSizeStyle){
			final com.apple.jobjc.Invoke.MsgSend setRowSizeStyle_IMetInst = get_setRowSizeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowSizeStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowSizeStyle);
		setRowSizeStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionHighlightStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionHighlightStyle_IMetInst(){
		return ((setSelectionHighlightStyle_IMetInst != null)
	? (setSelectionHighlightStyle_IMetInst)
	: (setSelectionHighlightStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionHighlightStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSelectionHighlightStyle(final long selectionHighlightStyle){
			final com.apple.jobjc.Invoke.MsgSend setSelectionHighlightStyle_IMetInst = get_setSelectionHighlightStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionHighlightStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selectionHighlightStyle);
		setSelectionHighlightStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSortDescriptors_IMetInst(){
		return ((setSortDescriptors_IMetInst != null)
	? (setSortDescriptors_IMetInst)
	: (setSortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSortDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSortDescriptors(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst = get_setSortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSortDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setSortDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesAlternatingRowBackgroundColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesAlternatingRowBackgroundColors_IMetInst(){
		return ((setUsesAlternatingRowBackgroundColors_IMetInst != null)
	? (setUsesAlternatingRowBackgroundColors_IMetInst)
	: (setUsesAlternatingRowBackgroundColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesAlternatingRowBackgroundColors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesAlternatingRowBackgroundColors(final boolean useAlternatingRowColors){
			final com.apple.jobjc.Invoke.MsgSend setUsesAlternatingRowBackgroundColors_IMetInst = get_setUsesAlternatingRowBackgroundColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesAlternatingRowBackgroundColors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, useAlternatingRowColors);
		setUsesAlternatingRowBackgroundColors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticalMotionCanBeginDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticalMotionCanBeginDrag_IMetInst(){
		return ((setVerticalMotionCanBeginDrag_IMetInst != null)
	? (setVerticalMotionCanBeginDrag_IMetInst)
	: (setVerticalMotionCanBeginDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticalMotionCanBeginDrag:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setVerticalMotionCanBeginDrag(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setVerticalMotionCanBeginDrag_IMetInst = get_setVerticalMotionCanBeginDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticalMotionCanBeginDrag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setVerticalMotionCanBeginDrag_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldFocusCell_atColumn_row_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldFocusCell_atColumn_row_IMetInst(){
		return ((shouldFocusCell_atColumn_row_IMetInst != null)
	? (shouldFocusCell_atColumn_row_IMetInst)
	: (shouldFocusCell_atColumn_row_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldFocusCell:atColumn:row:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean shouldFocusCell_atColumn_row(final com.apple.jobjc.appkit.NSCell cell, final long column, final long row){
			final com.apple.jobjc.Invoke.MsgSend shouldFocusCell_atColumn_row_IMetInst = get_shouldFocusCell_atColumn_row_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldFocusCell_atColumn_row_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		shouldFocusCell_atColumn_row_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeLastColumnToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeLastColumnToFit_IMetInst(){
		return ((sizeLastColumnToFit_IMetInst != null)
	? (sizeLastColumnToFit_IMetInst)
	: (sizeLastColumnToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeLastColumnToFit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeLastColumnToFit(){
			final com.apple.jobjc.Invoke.MsgSend sizeLastColumnToFit_IMetInst = get_sizeLastColumnToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeLastColumnToFit_IMetInst.init(nativeBuffer, this);
		sizeLastColumnToFit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeToFit_IMetInst(){
		return ((sizeToFit_IMetInst != null)
	? (sizeToFit_IMetInst)
	: (sizeToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeToFit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeToFit(){
			final com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst = get_sizeToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeToFit_IMetInst.init(nativeBuffer, this);
		sizeToFit_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend tableColumnWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableColumnWithIdentifier_IMetInst(){
		return ((tableColumnWithIdentifier_IMetInst != null)
	? (tableColumnWithIdentifier_IMetInst)
	: (tableColumnWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableColumnWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableColumn tableColumnWithIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend tableColumnWithIdentifier_IMetInst = get_tableColumnWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableColumnWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		tableColumnWithIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableColumn returnValue = (com.apple.jobjc.appkit.NSTableColumn) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tableColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableColumns_IMetInst(){
		return ((tableColumns_IMetInst != null)
	? (tableColumns_IMetInst)
	: (tableColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableColumns", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tableColumns(){
			final com.apple.jobjc.Invoke.MsgSend tableColumns_IMetInst = get_tableColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableColumns_IMetInst.init(nativeBuffer, this);
		tableColumns_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidBeginEditing_IMetInst(){
		return ((textDidBeginEditing_IMetInst != null)
	? (textDidBeginEditing_IMetInst)
	: (textDidBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidBeginEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidBeginEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidBeginEditing_IMetInst = get_textDidBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidBeginEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidChange_IMetInst(){
		return ((textDidChange_IMetInst != null)
	? (textDidChange_IMetInst)
	: (textDidChange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidChange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidChange(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidChange_IMetInst = get_textDidChange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidChange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidChange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textDidEndEditing_IMetInst(){
		return ((textDidEndEditing_IMetInst != null)
	? (textDidEndEditing_IMetInst)
	: (textDidEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textDidEndEditing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void textDidEndEditing(final com.apple.jobjc.foundation.NSNotification notification){
			final com.apple.jobjc.Invoke.MsgSend textDidEndEditing_IMetInst = get_textDidEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textDidEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, notification);
		textDidEndEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldBeginEditing_IMetInst(){
		return ((textShouldBeginEditing_IMetInst != null)
	? (textShouldBeginEditing_IMetInst)
	: (textShouldBeginEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldBeginEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldBeginEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldBeginEditing_IMetInst = get_textShouldBeginEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldBeginEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldBeginEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textShouldEndEditing_IMetInst(){
		return ((textShouldEndEditing_IMetInst != null)
	? (textShouldEndEditing_IMetInst)
	: (textShouldEndEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textShouldEndEditing:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean textShouldEndEditing(final com.apple.jobjc.appkit.NSText textObject){
			final com.apple.jobjc.Invoke.MsgSend textShouldEndEditing_IMetInst = get_textShouldEndEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textShouldEndEditing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObject);
		textShouldEndEditing_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend usesAlternatingRowBackgroundColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesAlternatingRowBackgroundColors_IMetInst(){
		return ((usesAlternatingRowBackgroundColors_IMetInst != null)
	? (usesAlternatingRowBackgroundColors_IMetInst)
	: (usesAlternatingRowBackgroundColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesAlternatingRowBackgroundColors", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesAlternatingRowBackgroundColors(){
			final com.apple.jobjc.Invoke.MsgSend usesAlternatingRowBackgroundColors_IMetInst = get_usesAlternatingRowBackgroundColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesAlternatingRowBackgroundColors_IMetInst.init(nativeBuffer, this);
		usesAlternatingRowBackgroundColors_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend verticalMotionCanBeginDrag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_verticalMotionCanBeginDrag_IMetInst(){
		return ((verticalMotionCanBeginDrag_IMetInst != null)
	? (verticalMotionCanBeginDrag_IMetInst)
	: (verticalMotionCanBeginDrag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "verticalMotionCanBeginDrag", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean verticalMotionCanBeginDrag(){
			final com.apple.jobjc.Invoke.MsgSend verticalMotionCanBeginDrag_IMetInst = get_verticalMotionCanBeginDrag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		verticalMotionCanBeginDrag_IMetInst.init(nativeBuffer, this);
		verticalMotionCanBeginDrag_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend viewAtColumn_row_makeIfNecessary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewAtColumn_row_makeIfNecessary_IMetInst(){
		return ((viewAtColumn_row_makeIfNecessary_IMetInst != null)
	? (viewAtColumn_row_makeIfNecessary_IMetInst)
	: (viewAtColumn_row_makeIfNecessary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewAtColumn:row:makeIfNecessary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T viewAtColumn_row_makeIfNecessary(final long column, final long row, final boolean makeIfNecessary){
			final com.apple.jobjc.Invoke.MsgSend viewAtColumn_row_makeIfNecessary_IMetInst = get_viewAtColumn_row_makeIfNecessary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewAtColumn_row_makeIfNecessary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, makeIfNecessary);
		viewAtColumn_row_makeIfNecessary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
