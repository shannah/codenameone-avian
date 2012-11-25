package com.apple.jobjc.appkit;

public  class NSDrawer extends com.apple.jobjc.appkit.NSResponder {
	public NSDrawer(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDrawer(final NSDrawer obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend close_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_close_IMetInst(){
		return ((close_IMetInst != null)
	? (close_IMetInst)
	: (close_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "close", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void close(){
			final com.apple.jobjc.Invoke.MsgSend close_IMetInst = get_close_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		close_IMetInst.init(nativeBuffer, this);
		close_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend closeVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closeVoid_IMetInst(){
		return ((closeVoid_IMetInst != null)
	? (closeVoid_IMetInst)
	: (closeVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "close:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void closeVoid(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend closeVoid_IMetInst = get_closeVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closeVoid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		closeVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend contentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentSize_IMetInst(){
		return ((contentSize_IMetInst != null)
	? (contentSize_IMetInst)
	: (contentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentSize(){
			final com.apple.jobjc.Invoke.MsgSend contentSize_IMetInst = get_contentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentView_IMetInst(){
		return ((contentView_IMetInst != null)
	? (contentView_IMetInst)
	: (contentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView contentView(){
			final com.apple.jobjc.Invoke.MsgSend contentView_IMetInst = get_contentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentView_IMetInst.init(nativeBuffer, this);
		contentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend edge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_edge_IMetInst(){
		return ((edge_IMetInst != null)
	? (edge_IMetInst)
	: (edge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "edge", com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public long edge(){
			final com.apple.jobjc.Invoke.MsgSend edge_IMetInst = get_edge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		edge_IMetInst.init(nativeBuffer, this);
		edge_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentSize_preferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentSize_preferredEdge_IMetInst(){
		return ((initWithContentSize_preferredEdge_IMetInst != null)
	? (initWithContentSize_preferredEdge_IMetInst)
	: (initWithContentSize_preferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentSize:preferredEdge:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentSize_preferredEdge(final com.apple.jobjc.foundation.NSSize contentSize, final long edge){
			final com.apple.jobjc.Invoke.MsgSend initWithContentSize_preferredEdge_IMetInst = get_initWithContentSize_preferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentSize_preferredEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, contentSize);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		initWithContentSize_preferredEdge_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leadingOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leadingOffset_IMetInst(){
		return ((leadingOffset_IMetInst != null)
	? (leadingOffset_IMetInst)
	: (leadingOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leadingOffset", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double leadingOffset(){
			final com.apple.jobjc.Invoke.MsgSend leadingOffset_IMetInst = get_leadingOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leadingOffset_IMetInst.init(nativeBuffer, this);
		leadingOffset_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxContentSize_IMetInst(){
		return ((maxContentSize_IMetInst != null)
	? (maxContentSize_IMetInst)
	: (maxContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxContentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize maxContentSize(){
			final com.apple.jobjc.Invoke.MsgSend maxContentSize_IMetInst = get_maxContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxContentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		maxContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minContentSize_IMetInst(){
		return ((minContentSize_IMetInst != null)
	? (minContentSize_IMetInst)
	: (minContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minContentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minContentSize(){
			final com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst = get_minContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minContentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend open_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_open_IMetInst(){
		return ((open_IMetInst != null)
	? (open_IMetInst)
	: (open_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "open", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void open(){
			final com.apple.jobjc.Invoke.MsgSend open_IMetInst = get_open_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		open_IMetInst.init(nativeBuffer, this);
		open_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openVoid_IMetInst(){
		return ((openVoid_IMetInst != null)
	? (openVoid_IMetInst)
	: (openVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "open:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void openVoid(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend openVoid_IMetInst = get_openVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openVoid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		openVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openOnEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openOnEdge_IMetInst(){
		return ((openOnEdge_IMetInst != null)
	? (openOnEdge_IMetInst)
	: (openOnEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openOnEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void openOnEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend openOnEdge_IMetInst = get_openOnEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openOnEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		openOnEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parentWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentWindow_IMetInst(){
		return ((parentWindow_IMetInst != null)
	? (parentWindow_IMetInst)
	: (parentWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow parentWindow(){
			final com.apple.jobjc.Invoke.MsgSend parentWindow_IMetInst = get_parentWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentWindow_IMetInst.init(nativeBuffer, this);
		parentWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredEdge_IMetInst(){
		return ((preferredEdge_IMetInst != null)
	? (preferredEdge_IMetInst)
	: (preferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredEdge", com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public long preferredEdge(){
			final com.apple.jobjc.Invoke.MsgSend preferredEdge_IMetInst = get_preferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredEdge_IMetInst.init(nativeBuffer, this);
		preferredEdge_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentSize_IMetInst(){
		return ((setContentSize_IMetInst != null)
	? (setContentSize_IMetInst)
	: (setContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setContentSize_IMetInst = get_setContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentView_IMetInst(){
		return ((setContentView_IMetInst != null)
	? (setContentView_IMetInst)
	: (setContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst = get_setContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setContentView_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setLeadingOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLeadingOffset_IMetInst(){
		return ((setLeadingOffset_IMetInst != null)
	? (setLeadingOffset_IMetInst)
	: (setLeadingOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLeadingOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLeadingOffset(final double offset){
			final com.apple.jobjc.Invoke.MsgSend setLeadingOffset_IMetInst = get_setLeadingOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLeadingOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, offset);
		setLeadingOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxContentSize_IMetInst(){
		return ((setMaxContentSize_IMetInst != null)
	? (setMaxContentSize_IMetInst)
	: (setMaxContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxContentSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMaxContentSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMaxContentSize_IMetInst = get_setMaxContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMaxContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinContentSize_IMetInst(){
		return ((setMinContentSize_IMetInst != null)
	? (setMinContentSize_IMetInst)
	: (setMinContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinContentSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMinContentSize(final com.apple.jobjc.foundation.NSSize size){
			final com.apple.jobjc.Invoke.MsgSend setMinContentSize_IMetInst = get_setMinContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinContentSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, size);
		setMinContentSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParentWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParentWindow_IMetInst(){
		return ((setParentWindow_IMetInst != null)
	? (setParentWindow_IMetInst)
	: (setParentWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParentWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setParentWindow(final com.apple.jobjc.appkit.NSWindow parent){
			final com.apple.jobjc.Invoke.MsgSend setParentWindow_IMetInst = get_setParentWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParentWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parent);
		setParentWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredEdge_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredEdge_IMetInst(){
		return ((setPreferredEdge_IMetInst != null)
	? (setPreferredEdge_IMetInst)
	: (setPreferredEdge_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredEdge:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder)));
	}

	 public void setPreferredEdge(final long edge){
			final com.apple.jobjc.Invoke.MsgSend setPreferredEdge_IMetInst = get_setPreferredEdge_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredEdge_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntULongLongCoder.push(nativeBuffer, edge);
		setPreferredEdge_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTrailingOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTrailingOffset_IMetInst(){
		return ((setTrailingOffset_IMetInst != null)
	? (setTrailingOffset_IMetInst)
	: (setTrailingOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTrailingOffset:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setTrailingOffset(final double offset){
			final com.apple.jobjc.Invoke.MsgSend setTrailingOffset_IMetInst = get_setTrailingOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTrailingOffset_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, offset);
		setTrailingOffset_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend state_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_state_IMetInst(){
		return ((state_IMetInst != null)
	? (state_IMetInst)
	: (state_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "state", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long state(){
			final com.apple.jobjc.Invoke.MsgSend state_IMetInst = get_state_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		state_IMetInst.init(nativeBuffer, this);
		state_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toggle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggle_IMetInst(){
		return ((toggle_IMetInst != null)
	? (toggle_IMetInst)
	: (toggle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggle(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggle_IMetInst = get_toggle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend trailingOffset_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trailingOffset_IMetInst(){
		return ((trailingOffset_IMetInst != null)
	? (trailingOffset_IMetInst)
	: (trailingOffset_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trailingOffset", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double trailingOffset(){
			final com.apple.jobjc.Invoke.MsgSend trailingOffset_IMetInst = get_trailingOffset_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trailingOffset_IMetInst.init(nativeBuffer, this);
		trailingOffset_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
