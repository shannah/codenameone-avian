package com.apple.jobjc.appkit;

public  class NSTableColumn extends com.apple.jobjc.foundation.NSObject {
	public NSTableColumn(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableColumn(final NSTableColumn obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dataCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataCell_IMetInst(){
		return ((dataCell_IMetInst != null)
	? (dataCell_IMetInst)
	: (dataCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dataCell(){
			final com.apple.jobjc.Invoke.MsgSend dataCell_IMetInst = get_dataCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataCell_IMetInst.init(nativeBuffer, this);
		dataCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataCellForRow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataCellForRow_IMetInst(){
		return ((dataCellForRow_IMetInst != null)
	? (dataCellForRow_IMetInst)
	: (dataCellForRow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataCellForRow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dataCellForRow(final long row){
			final com.apple.jobjc.Invoke.MsgSend dataCellForRow_IMetInst = get_dataCellForRow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataCellForRow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, row);
		dataCellForRow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerCell_IMetInst(){
		return ((headerCell_IMetInst != null)
	? (headerCell_IMetInst)
	: (headerCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T headerCell(){
			final com.apple.jobjc.Invoke.MsgSend headerCell_IMetInst = get_headerCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerCell_IMetInst.init(nativeBuffer, this);
		headerCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerToolTip_IMetInst(){
		return ((headerToolTip_IMetInst != null)
	? (headerToolTip_IMetInst)
	: (headerToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerToolTip", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString headerToolTip(){
			final com.apple.jobjc.Invoke.MsgSend headerToolTip_IMetInst = get_headerToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerToolTip_IMetInst.init(nativeBuffer, this);
		headerToolTip_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend identifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_identifier_IMetInst(){
		return ((identifier_IMetInst != null)
	? (identifier_IMetInst)
	: (identifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "identifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString identifier(){
			final com.apple.jobjc.Invoke.MsgSend identifier_IMetInst = get_identifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		identifier_IMetInst.init(nativeBuffer, this);
		identifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithIdentifier_IMetInst(){
		return ((initWithIdentifier_IMetInst != null)
	? (initWithIdentifier_IMetInst)
	: (initWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend initWithIdentifier_IMetInst = get_initWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		initWithIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHidden_IMetInst(){
		return ((isHidden_IMetInst != null)
	? (isHidden_IMetInst)
	: (isHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHidden", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHidden(){
			final com.apple.jobjc.Invoke.MsgSend isHidden_IMetInst = get_isHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHidden_IMetInst.init(nativeBuffer, this);
		isHidden_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isResizable_IMetInst(){
		return ((isResizable_IMetInst != null)
	? (isResizable_IMetInst)
	: (isResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isResizable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isResizable(){
			final com.apple.jobjc.Invoke.MsgSend isResizable_IMetInst = get_isResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isResizable_IMetInst.init(nativeBuffer, this);
		isResizable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxWidth_IMetInst(){
		return ((maxWidth_IMetInst != null)
	? (maxWidth_IMetInst)
	: (maxWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double maxWidth(){
			final com.apple.jobjc.Invoke.MsgSend maxWidth_IMetInst = get_maxWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxWidth_IMetInst.init(nativeBuffer, this);
		maxWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minWidth_IMetInst(){
		return ((minWidth_IMetInst != null)
	? (minWidth_IMetInst)
	: (minWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double minWidth(){
			final com.apple.jobjc.Invoke.MsgSend minWidth_IMetInst = get_minWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minWidth_IMetInst.init(nativeBuffer, this);
		minWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resizingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resizingMask_IMetInst(){
		return ((resizingMask_IMetInst != null)
	? (resizingMask_IMetInst)
	: (resizingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resizingMask", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long resizingMask(){
			final com.apple.jobjc.Invoke.MsgSend resizingMask_IMetInst = get_resizingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resizingMask_IMetInst.init(nativeBuffer, this);
		resizingMask_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDataCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDataCell_IMetInst(){
		return ((setDataCell_IMetInst != null)
	? (setDataCell_IMetInst)
	: (setDataCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDataCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDataCell(final com.apple.jobjc.appkit.NSCell cell){
			final com.apple.jobjc.Invoke.MsgSend setDataCell_IMetInst = get_setDataCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDataCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setDataCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeaderCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeaderCell_IMetInst(){
		return ((setHeaderCell_IMetInst != null)
	? (setHeaderCell_IMetInst)
	: (setHeaderCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeaderCell:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHeaderCell(final com.apple.jobjc.appkit.NSCell cell){
			final com.apple.jobjc.Invoke.MsgSend setHeaderCell_IMetInst = get_setHeaderCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeaderCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, cell);
		setHeaderCell_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeaderToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeaderToolTip_IMetInst(){
		return ((setHeaderToolTip_IMetInst != null)
	? (setHeaderToolTip_IMetInst)
	: (setHeaderToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeaderToolTip:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHeaderToolTip(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setHeaderToolTip_IMetInst = get_setHeaderToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeaderToolTip_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setHeaderToolTip_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHidden_IMetInst(){
		return ((setHidden_IMetInst != null)
	? (setHidden_IMetInst)
	: (setHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHidden:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHidden(final boolean hidden){
			final com.apple.jobjc.Invoke.MsgSend setHidden_IMetInst = get_setHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHidden_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hidden);
		setHidden_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIdentifier_IMetInst(){
		return ((setIdentifier_IMetInst != null)
	? (setIdentifier_IMetInst)
	: (setIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIdentifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend setIdentifier_IMetInst = get_setIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		setIdentifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxWidth_IMetInst(){
		return ((setMaxWidth_IMetInst != null)
	? (setMaxWidth_IMetInst)
	: (setMaxWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMaxWidth(final double maxWidth){
			final com.apple.jobjc.Invoke.MsgSend setMaxWidth_IMetInst = get_setMaxWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, maxWidth);
		setMaxWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinWidth_IMetInst(){
		return ((setMinWidth_IMetInst != null)
	? (setMinWidth_IMetInst)
	: (setMinWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMinWidth(final double minWidth){
			final com.apple.jobjc.Invoke.MsgSend setMinWidth_IMetInst = get_setMinWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, minWidth);
		setMinWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResizable_IMetInst(){
		return ((setResizable_IMetInst != null)
	? (setResizable_IMetInst)
	: (setResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResizable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setResizable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setResizable_IMetInst = get_setResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResizable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setResizable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setResizingMask_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResizingMask_IMetInst(){
		return ((setResizingMask_IMetInst != null)
	? (setResizingMask_IMetInst)
	: (setResizingMask_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResizingMask:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setResizingMask(final long resizingMask){
			final com.apple.jobjc.Invoke.MsgSend setResizingMask_IMetInst = get_setResizingMask_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResizingMask_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, resizingMask);
		setResizingMask_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSortDescriptorPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSortDescriptorPrototype_IMetInst(){
		return ((setSortDescriptorPrototype_IMetInst != null)
	? (setSortDescriptorPrototype_IMetInst)
	: (setSortDescriptorPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSortDescriptorPrototype:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSortDescriptorPrototype(final com.apple.jobjc.foundation.NSSortDescriptor sortDescriptor){
			final com.apple.jobjc.Invoke.MsgSend setSortDescriptorPrototype_IMetInst = get_setSortDescriptorPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSortDescriptorPrototype_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptor);
		setSortDescriptorPrototype_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidth_IMetInst(){
		return ((setWidth_IMetInst != null)
	? (setWidth_IMetInst)
	: (setWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setWidth(final double width){
			final com.apple.jobjc.Invoke.MsgSend setWidth_IMetInst = get_setWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		setWidth_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptorPrototype_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptorPrototype_IMetInst(){
		return ((sortDescriptorPrototype_IMetInst != null)
	? (sortDescriptorPrototype_IMetInst)
	: (sortDescriptorPrototype_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptorPrototype", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSortDescriptor sortDescriptorPrototype(){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptorPrototype_IMetInst = get_sortDescriptorPrototype_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptorPrototype_IMetInst.init(nativeBuffer, this);
		sortDescriptorPrototype_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSortDescriptor returnValue = (com.apple.jobjc.foundation.NSSortDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend width_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_width_IMetInst(){
		return ((width_IMetInst != null)
	? (width_IMetInst)
	: (width_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "width", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double width(){
			final com.apple.jobjc.Invoke.MsgSend width_IMetInst = get_width_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		width_IMetInst.init(nativeBuffer, this);
		width_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
