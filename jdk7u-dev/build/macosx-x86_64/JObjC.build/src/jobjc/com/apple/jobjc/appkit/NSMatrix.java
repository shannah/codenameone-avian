package com.apple.jobjc.appkit;

public  class NSMatrix extends com.apple.jobjc.appkit.NSControl {
	public NSMatrix(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMatrix(final NSMatrix obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend acceptsFirstMouse_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_acceptsFirstMouse_IMetInst(){
		return ((acceptsFirstMouse_IMetInst != null)
	? (acceptsFirstMouse_IMetInst)
	: (acceptsFirstMouse_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "acceptsFirstMouse:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean acceptsFirstMouse(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend acceptsFirstMouse_IMetInst = get_acceptsFirstMouse_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		acceptsFirstMouse_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		acceptsFirstMouse_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend addColumnWithCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addColumnWithCells_IMetInst(){
		return ((addColumnWithCells_IMetInst != null)
	? (addColumnWithCells_IMetInst)
	: (addColumnWithCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addColumnWithCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addColumnWithCells(final com.apple.jobjc.foundation.NSArray newCells){
			final com.apple.jobjc.Invoke.MsgSend addColumnWithCells_IMetInst = get_addColumnWithCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addColumnWithCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCells);
		addColumnWithCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRow_IMetInst(){
		return ((addRow_IMetInst != null)
	? (addRow_IMetInst)
	: (addRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void addRow(){
			final com.apple.jobjc.Invoke.MsgSend addRow_IMetInst = get_addRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRow_IMetInst.init(nativeBuffer, this);
		addRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addRowWithCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRowWithCells_IMetInst(){
		return ((addRowWithCells_IMetInst != null)
	? (addRowWithCells_IMetInst)
	: (addRowWithCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRowWithCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addRowWithCells(final com.apple.jobjc.foundation.NSArray newCells){
			final com.apple.jobjc.Invoke.MsgSend addRowWithCells_IMetInst = get_addRowWithCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRowWithCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCells);
		addRowWithCells_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend autorecalculatesCellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autorecalculatesCellSize_IMetInst(){
		return ((autorecalculatesCellSize_IMetInst != null)
	? (autorecalculatesCellSize_IMetInst)
	: (autorecalculatesCellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autorecalculatesCellSize", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autorecalculatesCellSize(){
			final com.apple.jobjc.Invoke.MsgSend autorecalculatesCellSize_IMetInst = get_autorecalculatesCellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autorecalculatesCellSize_IMetInst.init(nativeBuffer, this);
		autorecalculatesCellSize_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosizesCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosizesCells_IMetInst(){
		return ((autosizesCells_IMetInst != null)
	? (autosizesCells_IMetInst)
	: (autosizesCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosizesCells", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosizesCells(){
			final com.apple.jobjc.Invoke.MsgSend autosizesCells_IMetInst = get_autosizesCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosizesCells_IMetInst.init(nativeBuffer, this);
		autosizesCells_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend cellAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellAtRow_column_IMetInst(){
		return ((cellAtRow_column_IMetInst != null)
	? (cellAtRow_column_IMetInst)
	: (cellAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellAtRow:column:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T cellAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend cellAtRow_column_IMetInst = get_cellAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		cellAtRow_column_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellBackgroundColor_IMetInst(){
		return ((cellBackgroundColor_IMetInst != null)
	? (cellBackgroundColor_IMetInst)
	: (cellBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellBackgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor cellBackgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend cellBackgroundColor_IMetInst = get_cellBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellBackgroundColor_IMetInst.init(nativeBuffer, this);
		cellBackgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellClass_IMetInst(){
		return ((cellClass_IMetInst != null)
	? (cellClass_IMetInst)
	: (cellClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T cellClass(){
			final com.apple.jobjc.Invoke.MsgSend cellClass_IMetInst = get_cellClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellClass_IMetInst.init(nativeBuffer, this);
		cellClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellFrameAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellFrameAtRow_column_IMetInst(){
		return ((cellFrameAtRow_column_IMetInst != null)
	? (cellFrameAtRow_column_IMetInst)
	: (cellFrameAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellFrameAtRow:column:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect cellFrameAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend cellFrameAtRow_column_IMetInst = get_cellFrameAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellFrameAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		cellFrameAtRow_column_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellSize_IMetInst(){
		return ((cellSize_IMetInst != null)
	? (cellSize_IMetInst)
	: (cellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize cellSize(){
			final com.apple.jobjc.Invoke.MsgSend cellSize_IMetInst = get_cellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		cellSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cellWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cellWithTag_IMetInst(){
		return ((cellWithTag_IMetInst != null)
	? (cellWithTag_IMetInst)
	: (cellWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cellWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T cellWithTag(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend cellWithTag_IMetInst = get_cellWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cellWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		cellWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cells_IMetInst(){
		return ((cells_IMetInst != null)
	? (cells_IMetInst)
	: (cells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cells", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray cells(){
			final com.apple.jobjc.Invoke.MsgSend cells_IMetInst = get_cells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cells_IMetInst.init(nativeBuffer, this);
		cells_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend deselectAllCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectAllCells_IMetInst(){
		return ((deselectAllCells_IMetInst != null)
	? (deselectAllCells_IMetInst)
	: (deselectAllCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectAllCells", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void deselectAllCells(){
			final com.apple.jobjc.Invoke.MsgSend deselectAllCells_IMetInst = get_deselectAllCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectAllCells_IMetInst.init(nativeBuffer, this);
		deselectAllCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deselectSelectedCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deselectSelectedCell_IMetInst(){
		return ((deselectSelectedCell_IMetInst != null)
	? (deselectSelectedCell_IMetInst)
	: (deselectSelectedCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deselectSelectedCell", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void deselectSelectedCell(){
			final com.apple.jobjc.Invoke.MsgSend deselectSelectedCell_IMetInst = get_deselectSelectedCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deselectSelectedCell_IMetInst.init(nativeBuffer, this);
		deselectSelectedCell_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend drawCellAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawCellAtRow_column_IMetInst(){
		return ((drawCellAtRow_column_IMetInst != null)
	? (drawCellAtRow_column_IMetInst)
	: (drawCellAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawCellAtRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void drawCellAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend drawCellAtRow_column_IMetInst = get_drawCellAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawCellAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		drawCellAtRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsCellBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsCellBackground_IMetInst(){
		return ((drawsCellBackground_IMetInst != null)
	? (drawsCellBackground_IMetInst)
	: (drawsCellBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsCellBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsCellBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsCellBackground_IMetInst = get_drawsCellBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsCellBackground_IMetInst.init(nativeBuffer, this);
		drawsCellBackground_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getNumberOfRows_columns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getNumberOfRows_columns_IMetInst(){
		return ((getNumberOfRows_columns_IMetInst != null)
	? (getNumberOfRows_columns_IMetInst)
	: (getNumberOfRows_columns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getNumberOfRows:columns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void getNumberOfRows_columns(final com.apple.jobjc.Pointer<java.lang.Long> rowCount, final com.apple.jobjc.Pointer<java.lang.Long> colCount){
			final com.apple.jobjc.Invoke.MsgSend getNumberOfRows_columns_IMetInst = get_getNumberOfRows_columns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getNumberOfRows_columns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, rowCount);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, colCount);
		getNumberOfRows_columns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend getRow_column_forPoint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRow_column_forPoint_IMetInst(){
		return ((getRow_column_forPoint_IMetInst != null)
	? (getRow_column_forPoint_IMetInst)
	: (getRow_column_forPoint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRow:column:forPoint:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public boolean getRow_column_forPoint(final com.apple.jobjc.Pointer<java.lang.Long> row, final com.apple.jobjc.Pointer<java.lang.Long> col, final com.apple.jobjc.foundation.NSPoint aPoint){
			final com.apple.jobjc.Invoke.MsgSend getRow_column_forPoint_IMetInst = get_getRow_column_forPoint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRow_column_forPoint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, row);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, col);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, aPoint);
		getRow_column_forPoint_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getRow_column_ofCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getRow_column_ofCell_IMetInst(){
		return ((getRow_column_ofCell_IMetInst != null)
	? (getRow_column_ofCell_IMetInst)
	: (getRow_column_ofCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getRow:column:ofCell:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean getRow_column_ofCell(final com.apple.jobjc.Pointer<java.lang.Long> row, final com.apple.jobjc.Pointer<java.lang.Long> col, final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend getRow_column_ofCell_IMetInst = get_getRow_column_ofCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getRow_column_ofCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, row);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, col);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		getRow_column_ofCell_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightCell_atRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightCell_atRow_column_IMetInst(){
		return ((highlightCell_atRow_column_IMetInst != null)
	? (highlightCell_atRow_column_IMetInst)
	: (highlightCell_atRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightCell:atRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void highlightCell_atRow_column(final boolean flag, final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend highlightCell_atRow_column_IMetInst = get_highlightCell_atRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightCell_atRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		highlightCell_atRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_IMetInst(){
		return ((initWithFrame_IMetInst != null)
	? (initWithFrame_IMetInst)
	: (initWithFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame(final com.apple.jobjc.foundation.NSRect frameRect){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_IMetInst = get_initWithFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		initWithFrame_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst(){
		return ((initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst != null)
	? (initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst)
	: (initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:mode:cellClass:numberOfRows:numberOfColumns:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame_mode_cellClass_numberOfRows_numberOfColumns(final com.apple.jobjc.foundation.NSRect frameRect, final long aMode, final com.apple.jobjc.NSClass factoryId, final long rowsHigh, final long colsWide){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst = get_initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aMode);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, factoryId);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowsHigh);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, colsWide);
		initWithFrame_mode_cellClass_numberOfRows_numberOfColumns_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst(){
		return ((initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst != null)
	? (initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst)
	: (initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFrame:mode:prototype:numberOfRows:numberOfColumns:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFrame_mode_prototype_numberOfRows_numberOfColumns(final com.apple.jobjc.foundation.NSRect frameRect, final long aMode, final com.apple.jobjc.appkit.NSCell aCell, final long rowsHigh, final long colsWide){
			final com.apple.jobjc.Invoke.MsgSend initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst = get_initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, frameRect);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aMode);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowsHigh);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, colsWide);
		initWithFrame_mode_prototype_numberOfRows_numberOfColumns_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertColumn_IMetInst(){
		return ((insertColumn_IMetInst != null)
	? (insertColumn_IMetInst)
	: (insertColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend insertColumn_IMetInst = get_insertColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		insertColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertColumn_withCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertColumn_withCells_IMetInst(){
		return ((insertColumn_withCells_IMetInst != null)
	? (insertColumn_withCells_IMetInst)
	: (insertColumn_withCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertColumn:withCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertColumn_withCells(final long column, final com.apple.jobjc.foundation.NSArray newCells){
			final com.apple.jobjc.Invoke.MsgSend insertColumn_withCells_IMetInst = get_insertColumn_withCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertColumn_withCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCells);
		insertColumn_withCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertRow_IMetInst(){
		return ((insertRow_IMetInst != null)
	? (insertRow_IMetInst)
	: (insertRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend insertRow_IMetInst = get_insertRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		insertRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertRow_withCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertRow_withCells_IMetInst(){
		return ((insertRow_withCells_IMetInst != null)
	? (insertRow_withCells_IMetInst)
	: (insertRow_withCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertRow:withCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertRow_withCells(final long row, final com.apple.jobjc.foundation.NSArray newCells){
			final com.apple.jobjc.Invoke.MsgSend insertRow_withCells_IMetInst = get_insertRow_withCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertRow_withCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCells);
		insertRow_withCells_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend isAutoscroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAutoscroll_IMetInst(){
		return ((isAutoscroll_IMetInst != null)
	? (isAutoscroll_IMetInst)
	: (isAutoscroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAutoscroll", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAutoscroll(){
			final com.apple.jobjc.Invoke.MsgSend isAutoscroll_IMetInst = get_isAutoscroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAutoscroll_IMetInst.init(nativeBuffer, this);
		isAutoscroll_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectionByRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectionByRect_IMetInst(){
		return ((isSelectionByRect_IMetInst != null)
	? (isSelectionByRect_IMetInst)
	: (isSelectionByRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectionByRect", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectionByRect(){
			final com.apple.jobjc.Invoke.MsgSend isSelectionByRect_IMetInst = get_isSelectionByRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectionByRect_IMetInst.init(nativeBuffer, this);
		isSelectionByRect_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyCell_IMetInst(){
		return ((keyCell_IMetInst != null)
	? (keyCell_IMetInst)
	: (keyCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T keyCell(){
			final com.apple.jobjc.Invoke.MsgSend keyCell_IMetInst = get_keyCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyCell_IMetInst.init(nativeBuffer, this);
		keyCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeCellAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeCellAtRow_column_IMetInst(){
		return ((makeCellAtRow_column_IMetInst != null)
	? (makeCellAtRow_column_IMetInst)
	: (makeCellAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeCellAtRow:column:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSCell makeCellAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend makeCellAtRow_column_IMetInst = get_makeCellAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeCellAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		makeCellAtRow_column_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCell returnValue = (com.apple.jobjc.appkit.NSCell) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mode_IMetInst(){
		return ((mode_IMetInst != null)
	? (mode_IMetInst)
	: (mode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long mode(){
			final com.apple.jobjc.Invoke.MsgSend mode_IMetInst = get_mode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mode_IMetInst.init(nativeBuffer, this);
		mode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDown_IMetInst(){
		return ((mouseDown_IMetInst != null)
	? (mouseDown_IMetInst)
	: (mouseDown_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDown:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void mouseDown(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend mouseDown_IMetInst = get_mouseDown_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDown_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		mouseDown_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mouseDownFlags_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mouseDownFlags_IMetInst(){
		return ((mouseDownFlags_IMetInst != null)
	? (mouseDownFlags_IMetInst)
	: (mouseDownFlags_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mouseDownFlags", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long mouseDownFlags(){
			final com.apple.jobjc.Invoke.MsgSend mouseDownFlags_IMetInst = get_mouseDownFlags_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mouseDownFlags_IMetInst.init(nativeBuffer, this);
		mouseDownFlags_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performKeyEquivalent_IMetInst(){
		return ((performKeyEquivalent_IMetInst != null)
	? (performKeyEquivalent_IMetInst)
	: (performKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performKeyEquivalent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performKeyEquivalent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst = get_performKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		performKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prototype_IMetInst(){
		return ((prototype_IMetInst != null)
	? (prototype_IMetInst)
	: (prototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prototype", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T prototype(){
			final com.apple.jobjc.Invoke.MsgSend prototype_IMetInst = get_prototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prototype_IMetInst.init(nativeBuffer, this);
		prototype_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend putCell_atRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_putCell_atRow_column_IMetInst(){
		return ((putCell_atRow_column_IMetInst != null)
	? (putCell_atRow_column_IMetInst)
	: (putCell_atRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "putCell:atRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void putCell_atRow_column(final com.apple.jobjc.appkit.NSCell newCell, final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend putCell_atRow_column_IMetInst = get_putCell_atRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		putCell_atRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newCell);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		putCell_atRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeColumn_IMetInst(){
		return ((removeColumn_IMetInst != null)
	? (removeColumn_IMetInst)
	: (removeColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeColumn(final long col){
			final com.apple.jobjc.Invoke.MsgSend removeColumn_IMetInst = get_removeColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		removeColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeRow_IMetInst(){
		return ((removeRow_IMetInst != null)
	? (removeRow_IMetInst)
	: (removeRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeRow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend removeRow_IMetInst = get_removeRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		removeRow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend renewRows_columns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_renewRows_columns_IMetInst(){
		return ((renewRows_columns_IMetInst != null)
	? (renewRows_columns_IMetInst)
	: (renewRows_columns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "renewRows:columns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void renewRows_columns(final long newRows, final long newCols){
			final com.apple.jobjc.Invoke.MsgSend renewRows_columns_IMetInst = get_renewRows_columns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		renewRows_columns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newRows);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, newCols);
		renewRows_columns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend resetCursorRects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resetCursorRects_IMetInst(){
		return ((resetCursorRects_IMetInst != null)
	? (resetCursorRects_IMetInst)
	: (resetCursorRects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resetCursorRects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void resetCursorRects(){
			final com.apple.jobjc.Invoke.MsgSend resetCursorRects_IMetInst = get_resetCursorRects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resetCursorRects_IMetInst.init(nativeBuffer, this);
		resetCursorRects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollCellToVisibleAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollCellToVisibleAtRow_column_IMetInst(){
		return ((scrollCellToVisibleAtRow_column_IMetInst != null)
	? (scrollCellToVisibleAtRow_column_IMetInst)
	: (scrollCellToVisibleAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollCellToVisibleAtRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void scrollCellToVisibleAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend scrollCellToVisibleAtRow_column_IMetInst = get_scrollCellToVisibleAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollCellToVisibleAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		scrollCellToVisibleAtRow_column_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend selectCellAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectCellAtRow_column_IMetInst(){
		return ((selectCellAtRow_column_IMetInst != null)
	? (selectCellAtRow_column_IMetInst)
	: (selectCellAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectCellAtRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void selectCellAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend selectCellAtRow_column_IMetInst = get_selectCellAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectCellAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		selectCellAtRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectCellWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectCellWithTag_IMetInst(){
		return ((selectCellWithTag_IMetInst != null)
	? (selectCellWithTag_IMetInst)
	: (selectCellWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectCellWithTag:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean selectCellWithTag(final long anInt){
			final com.apple.jobjc.Invoke.MsgSend selectCellWithTag_IMetInst = get_selectCellWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectCellWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anInt);
		selectCellWithTag_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectText_IMetInst(){
		return ((selectText_IMetInst != null)
	? (selectText_IMetInst)
	: (selectText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectText(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectText_IMetInst = get_selectText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectTextAtRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectTextAtRow_column_IMetInst(){
		return ((selectTextAtRow_column_IMetInst != null)
	? (selectTextAtRow_column_IMetInst)
	: (selectTextAtRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectTextAtRow:column:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T selectTextAtRow_column(final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend selectTextAtRow_column_IMetInst = get_selectTextAtRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectTextAtRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		selectTextAtRow_column_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend sendAction_to_forAllCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAction_to_forAllCells_IMetInst(){
		return ((sendAction_to_forAllCells_IMetInst != null)
	? (sendAction_to_forAllCells_IMetInst)
	: (sendAction_to_forAllCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAction:to:forAllCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void sendAction_to_forAllCells(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID anObject, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend sendAction_to_forAllCells_IMetInst = get_sendAction_to_forAllCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAction_to_forAllCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		sendAction_to_forAllCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sendDoubleAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendDoubleAction_IMetInst(){
		return ((sendDoubleAction_IMetInst != null)
	? (sendDoubleAction_IMetInst)
	: (sendDoubleAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendDoubleAction", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sendDoubleAction(){
			final com.apple.jobjc.Invoke.MsgSend sendDoubleAction_IMetInst = get_sendDoubleAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendDoubleAction_IMetInst.init(nativeBuffer, this);
		sendDoubleAction_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setAutorecalculatesCellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutorecalculatesCellSize_IMetInst(){
		return ((setAutorecalculatesCellSize_IMetInst != null)
	? (setAutorecalculatesCellSize_IMetInst)
	: (setAutorecalculatesCellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutorecalculatesCellSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutorecalculatesCellSize(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutorecalculatesCellSize_IMetInst = get_setAutorecalculatesCellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutorecalculatesCellSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutorecalculatesCellSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoscroll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoscroll_IMetInst(){
		return ((setAutoscroll_IMetInst != null)
	? (setAutoscroll_IMetInst)
	: (setAutoscroll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoscroll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoscroll(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutoscroll_IMetInst = get_setAutoscroll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoscroll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutoscroll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosizesCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosizesCells_IMetInst(){
		return ((setAutosizesCells_IMetInst != null)
	? (setAutosizesCells_IMetInst)
	: (setAutosizesCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosizesCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutosizesCells(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutosizesCells_IMetInst = get_setAutosizesCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosizesCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutosizesCells_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setCellBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellBackgroundColor_IMetInst(){
		return ((setCellBackgroundColor_IMetInst != null)
	? (setCellBackgroundColor_IMetInst)
	: (setCellBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCellBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setCellBackgroundColor_IMetInst = get_setCellBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setCellBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setCellSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCellSize_IMetInst(){
		return ((setCellSize_IMetInst != null)
	? (setCellSize_IMetInst)
	: (setCellSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCellSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setCellSize(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend setCellSize_IMetInst = get_setCellSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCellSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		setCellSize_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsCellBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsCellBackground_IMetInst(){
		return ((setDrawsCellBackground_IMetInst != null)
	? (setDrawsCellBackground_IMetInst)
	: (setDrawsCellBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsCellBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsCellBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsCellBackground_IMetInst = get_setDrawsCellBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsCellBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsCellBackground_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setKeyCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeyCell_IMetInst(){
		return ((setKeyCell_IMetInst != null)
	? (setKeyCell_IMetInst)
	: (setKeyCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeyCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKeyCell(final com.apple.jobjc.appkit.NSCell keyCell){
			final com.apple.jobjc.Invoke.MsgSend setKeyCell_IMetInst = get_setKeyCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeyCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyCell);
		setKeyCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMode_IMetInst(){
		return ((setMode_IMetInst != null)
	? (setMode_IMetInst)
	: (setMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setMode(final long aMode){
			final com.apple.jobjc.Invoke.MsgSend setMode_IMetInst = get_setMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aMode);
		setMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrototype_IMetInst(){
		return ((setPrototype_IMetInst != null)
	? (setPrototype_IMetInst)
	: (setPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrototype:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPrototype(final com.apple.jobjc.appkit.NSCell aCell){
			final com.apple.jobjc.Invoke.MsgSend setPrototype_IMetInst = get_setPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrototype_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aCell);
		setPrototype_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setScrollable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setScrollable_IMetInst(){
		return ((setScrollable_IMetInst != null)
	? (setScrollable_IMetInst)
	: (setScrollable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setScrollable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setScrollable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setScrollable_IMetInst = get_setScrollable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setScrollable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setScrollable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionByRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionByRect_IMetInst(){
		return ((setSelectionByRect_IMetInst != null)
	? (setSelectionByRect_IMetInst)
	: (setSelectionByRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionByRect:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectionByRect(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectionByRect_IMetInst = get_setSelectionByRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionByRect_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectionByRect_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionFrom_to_anchor_highlight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionFrom_to_anchor_highlight_IMetInst(){
		return ((setSelectionFrom_to_anchor_highlight_IMetInst != null)
	? (setSelectionFrom_to_anchor_highlight_IMetInst)
	: (setSelectionFrom_to_anchor_highlight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionFrom:to:anchor:highlight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectionFrom_to_anchor_highlight(final long startPos, final long endPos, final long anchorPos, final boolean lit){
			final com.apple.jobjc.Invoke.MsgSend setSelectionFrom_to_anchor_highlight_IMetInst = get_setSelectionFrom_to_anchor_highlight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionFrom_to_anchor_highlight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, startPos);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, endPos);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, anchorPos);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, lit);
		setSelectionFrom_to_anchor_highlight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setState_atRow_column_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setState_atRow_column_IMetInst(){
		return ((setState_atRow_column_IMetInst != null)
	? (setState_atRow_column_IMetInst)
	: (setState_atRow_column_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setState:atRow:column:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setState_atRow_column(final long value, final long row, final long col){
			final com.apple.jobjc.Invoke.MsgSend setState_atRow_column_IMetInst = get_setState_atRow_column_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setState_atRow_column_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		setState_atRow_column_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTabKeyTraversesCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTabKeyTraversesCells_IMetInst(){
		return ((setTabKeyTraversesCells_IMetInst != null)
	? (setTabKeyTraversesCells_IMetInst)
	: (setTabKeyTraversesCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTabKeyTraversesCells:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTabKeyTraversesCells(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTabKeyTraversesCells_IMetInst = get_setTabKeyTraversesCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTabKeyTraversesCells_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTabKeyTraversesCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setToolTip_forCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setToolTip_forCell_IMetInst(){
		return ((setToolTip_forCell_IMetInst != null)
	? (setToolTip_forCell_IMetInst)
	: (setToolTip_forCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setToolTip:forCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setToolTip_forCell(final com.apple.jobjc.foundation.NSString toolTipString, final com.apple.jobjc.appkit.NSCell cell){
			final com.apple.jobjc.Invoke.MsgSend setToolTip_forCell_IMetInst = get_setToolTip_forCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setToolTip_forCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, toolTipString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setToolTip_forCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setValidateSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValidateSize_IMetInst(){
		return ((setValidateSize_IMetInst != null)
	? (setValidateSize_IMetInst)
	: (setValidateSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValidateSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setValidateSize(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setValidateSize_IMetInst = get_setValidateSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValidateSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setValidateSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeToCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeToCells_IMetInst(){
		return ((sizeToCells_IMetInst != null)
	? (sizeToCells_IMetInst)
	: (sizeToCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeToCells", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeToCells(){
			final com.apple.jobjc.Invoke.MsgSend sizeToCells_IMetInst = get_sizeToCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeToCells_IMetInst.init(nativeBuffer, this);
		sizeToCells_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortUsingFunction_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingFunction_context_IMetInst(){
		return ((sortUsingFunction_context_IMetInst != null)
	? (sortUsingFunction_context_IMetInst)
	: (sortUsingFunction_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingFunction:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void sortUsingFunction_context(final Object /* NSInteger(*)(id,id,void*) (^?, ^?) */ compare, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend sortUsingFunction_context_IMetInst = get_sortUsingFunction_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingFunction_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, compare);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		sortUsingFunction_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortUsingSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortUsingSelector_IMetInst(){
		return ((sortUsingSelector_IMetInst != null)
	? (sortUsingSelector_IMetInst)
	: (sortUsingSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortUsingSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void sortUsingSelector(final com.apple.jobjc.SEL comparator){
			final com.apple.jobjc.Invoke.MsgSend sortUsingSelector_IMetInst = get_sortUsingSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortUsingSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, comparator);
		sortUsingSelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tabKeyTraversesCells_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabKeyTraversesCells_IMetInst(){
		return ((tabKeyTraversesCells_IMetInst != null)
	? (tabKeyTraversesCells_IMetInst)
	: (tabKeyTraversesCells_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabKeyTraversesCells", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean tabKeyTraversesCells(){
			final com.apple.jobjc.Invoke.MsgSend tabKeyTraversesCells_IMetInst = get_tabKeyTraversesCells_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabKeyTraversesCells_IMetInst.init(nativeBuffer, this);
		tabKeyTraversesCells_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend toolTipForCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolTipForCell_IMetInst(){
		return ((toolTipForCell_IMetInst != null)
	? (toolTipForCell_IMetInst)
	: (toolTipForCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolTipForCell:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString toolTipForCell(final com.apple.jobjc.appkit.NSCell cell){
			final com.apple.jobjc.Invoke.MsgSend toolTipForCell_IMetInst = get_toolTipForCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolTipForCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		toolTipForCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
