package com.apple.jobjc.appkit;

public  class NSTableHeaderView extends com.apple.jobjc.appkit.NSView {
	public NSTableHeaderView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableHeaderView(final NSTableHeaderView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend draggedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedColumn_IMetInst(){
		return ((draggedColumn_IMetInst != null)
	? (draggedColumn_IMetInst)
	: (draggedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long draggedColumn(){
			final com.apple.jobjc.Invoke.MsgSend draggedColumn_IMetInst = get_draggedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedColumn_IMetInst.init(nativeBuffer, this);
		draggedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggedDistance_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggedDistance_IMetInst(){
		return ((draggedDistance_IMetInst != null)
	? (draggedDistance_IMetInst)
	: (draggedDistance_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggedDistance", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double draggedDistance(){
			final com.apple.jobjc.Invoke.MsgSend draggedDistance_IMetInst = get_draggedDistance_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggedDistance_IMetInst.init(nativeBuffer, this);
		draggedDistance_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerRectOfColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerRectOfColumn_IMetInst(){
		return ((headerRectOfColumn_IMetInst != null)
	? (headerRectOfColumn_IMetInst)
	: (headerRectOfColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerRectOfColumn:", com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSRect headerRectOfColumn(final long column){
			final com.apple.jobjc.Invoke.MsgSend headerRectOfColumn_IMetInst = get_headerRectOfColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerRectOfColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, column);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		headerRectOfColumn_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizedColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizedColumn_IMetInst(){
		return ((resizedColumn_IMetInst != null)
	? (resizedColumn_IMetInst)
	: (resizedColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizedColumn", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long resizedColumn(){
			final com.apple.jobjc.Invoke.MsgSend resizedColumn_IMetInst = get_resizedColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizedColumn_IMetInst.init(nativeBuffer, this);
		resizedColumn_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setTableView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTableView_IMetInst(){
		return ((setTableView_IMetInst != null)
	? (setTableView_IMetInst)
	: (setTableView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTableView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTableView(final com.apple.jobjc.appkit.NSTableView tableView){
			final com.apple.jobjc.Invoke.MsgSend setTableView_IMetInst = get_setTableView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTableView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableView);
		setTableView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tableView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tableView_IMetInst(){
		return ((tableView_IMetInst != null)
	? (tableView_IMetInst)
	: (tableView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tableView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTableView tableView(){
			final com.apple.jobjc.Invoke.MsgSend tableView_IMetInst = get_tableView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tableView_IMetInst.init(nativeBuffer, this);
		tableView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTableView returnValue = (com.apple.jobjc.appkit.NSTableView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
