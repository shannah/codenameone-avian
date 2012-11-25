package com.apple.jobjc.appkit;

public  class NSTextTableBlock extends com.apple.jobjc.appkit.NSTextBlock {
	public NSTextTableBlock(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextTableBlock(final NSTextTableBlock obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend columnSpan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_columnSpan_IMetInst(){
		return ((columnSpan_IMetInst != null)
	? (columnSpan_IMetInst)
	: (columnSpan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "columnSpan", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long columnSpan(){
			final com.apple.jobjc.Invoke.MsgSend columnSpan_IMetInst = get_columnSpan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		columnSpan_IMetInst.init(nativeBuffer, this);
		columnSpan_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst(){
		return ((initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst != null)
	? (initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst)
	: (initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTable:startingRow:rowSpan:startingColumn:columnSpan:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTable_startingRow_rowSpan_startingColumn_columnSpan(final com.apple.jobjc.appkit.NSTextTable table, final long row, final long rowSpan, final long col, final long colSpan){
			final com.apple.jobjc.Invoke.MsgSend initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst = get_initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, table);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowSpan);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, col);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, colSpan);
		initWithTable_startingRow_rowSpan_startingColumn_columnSpan_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowSpan_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowSpan_IMetInst(){
		return ((rowSpan_IMetInst != null)
	? (rowSpan_IMetInst)
	: (rowSpan_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowSpan", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long rowSpan(){
			final com.apple.jobjc.Invoke.MsgSend rowSpan_IMetInst = get_rowSpan_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowSpan_IMetInst.init(nativeBuffer, this);
		rowSpan_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startingColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startingColumn_IMetInst(){
		return ((startingColumn_IMetInst != null)
	? (startingColumn_IMetInst)
	: (startingColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startingColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long startingColumn(){
			final com.apple.jobjc.Invoke.MsgSend startingColumn_IMetInst = get_startingColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startingColumn_IMetInst.init(nativeBuffer, this);
		startingColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startingRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startingRow_IMetInst(){
		return ((startingRow_IMetInst != null)
	? (startingRow_IMetInst)
	: (startingRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startingRow", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long startingRow(){
			final com.apple.jobjc.Invoke.MsgSend startingRow_IMetInst = get_startingRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startingRow_IMetInst.init(nativeBuffer, this);
		startingRow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend table_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_table_IMetInst(){
		return ((table_IMetInst != null)
	? (table_IMetInst)
	: (table_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "table", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextTable table(){
			final com.apple.jobjc.Invoke.MsgSend table_IMetInst = get_table_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		table_IMetInst.init(nativeBuffer, this);
		table_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextTable returnValue = (com.apple.jobjc.appkit.NSTextTable) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
