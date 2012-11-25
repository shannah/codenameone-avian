package com.apple.jobjc.appkit;

public  class NSViewController extends com.apple.jobjc.appkit.NSResponder {
	public NSViewController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSViewController(final NSViewController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditing_IMetInst(){
		return ((commitEditing_IMetInst != null)
	? (commitEditing_IMetInst)
	: (commitEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean commitEditing(){
			final com.apple.jobjc.Invoke.MsgSend commitEditing_IMetInst = get_commitEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditing_IMetInst.init(nativeBuffer, this);
		commitEditing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst(){
		return ((commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst != null)
	? (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst)
	: (commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commitEditingWithDelegate:didCommitSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void commitEditingWithDelegate_didCommitSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didCommitSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst = get_commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didCommitSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		commitEditingWithDelegate_didCommitSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardEditing_IMetInst(){
		return ((discardEditing_IMetInst != null)
	? (discardEditing_IMetInst)
	: (discardEditing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardEditing", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void discardEditing(){
			final com.apple.jobjc.Invoke.MsgSend discardEditing_IMetInst = get_discardEditing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardEditing_IMetInst.init(nativeBuffer, this);
		discardEditing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithNibName_bundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithNibName_bundle_IMetInst(){
		return ((initWithNibName_bundle_IMetInst != null)
	? (initWithNibName_bundle_IMetInst)
	: (initWithNibName_bundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithNibName:bundle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithNibName_bundle(final com.apple.jobjc.foundation.NSString nibNameOrNil, final com.apple.jobjc.foundation.NSBundle nibBundleOrNil){
			final com.apple.jobjc.Invoke.MsgSend initWithNibName_bundle_IMetInst = get_initWithNibName_bundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithNibName_bundle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibNameOrNil);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibBundleOrNil);
		initWithNibName_bundle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadView_IMetInst(){
		return ((loadView_IMetInst != null)
	? (loadView_IMetInst)
	: (loadView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadView", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void loadView(){
			final com.apple.jobjc.Invoke.MsgSend loadView_IMetInst = get_loadView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadView_IMetInst.init(nativeBuffer, this);
		loadView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend nibBundle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nibBundle_IMetInst(){
		return ((nibBundle_IMetInst != null)
	? (nibBundle_IMetInst)
	: (nibBundle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nibBundle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle nibBundle(){
			final com.apple.jobjc.Invoke.MsgSend nibBundle_IMetInst = get_nibBundle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nibBundle_IMetInst.init(nativeBuffer, this);
		nibBundle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nibName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nibName_IMetInst(){
		return ((nibName_IMetInst != null)
	? (nibName_IMetInst)
	: (nibName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nibName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString nibName(){
			final com.apple.jobjc.Invoke.MsgSend nibName_IMetInst = get_nibName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nibName_IMetInst.init(nativeBuffer, this);
		nibName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedObject_IMetInst(){
		return ((representedObject_IMetInst != null)
	? (representedObject_IMetInst)
	: (representedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T representedObject(){
			final com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst = get_representedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedObject_IMetInst.init(nativeBuffer, this);
		representedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRepresentedObject_IMetInst(){
		return ((setRepresentedObject_IMetInst != null)
	? (setRepresentedObject_IMetInst)
	: (setRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRepresentedObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRepresentedObject(final com.apple.jobjc.ID representedObject){
			final com.apple.jobjc.Invoke.MsgSend setRepresentedObject_IMetInst = get_setRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, representedObject);
		setRepresentedObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setView_IMetInst(){
		return ((setView_IMetInst != null)
	? (setView_IMetInst)
	: (setView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setView_IMetInst = get_setView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend view_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_view_IMetInst(){
		return ((view_IMetInst != null)
	? (view_IMetInst)
	: (view_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "view", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView view(){
			final com.apple.jobjc.Invoke.MsgSend view_IMetInst = get_view_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		view_IMetInst.init(nativeBuffer, this);
		view_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
