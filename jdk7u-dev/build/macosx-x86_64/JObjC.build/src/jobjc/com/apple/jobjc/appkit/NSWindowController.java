package com.apple.jobjc.appkit;

public  class NSWindowController extends com.apple.jobjc.appkit.NSResponder {
	public NSWindowController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSWindowController(final NSWindowController obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend document_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_document_IMetInst(){
		return ((document_IMetInst != null)
	? (document_IMetInst)
	: (document_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "document", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T document(){
			final com.apple.jobjc.Invoke.MsgSend document_IMetInst = get_document_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		document_IMetInst.init(nativeBuffer, this);
		document_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindow_IMetInst(){
		return ((initWithWindow_IMetInst != null)
	? (initWithWindow_IMetInst)
	: (initWithWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend initWithWindow_IMetInst = get_initWithWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		initWithWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindowNibName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindowNibName_IMetInst(){
		return ((initWithWindowNibName_IMetInst != null)
	? (initWithWindowNibName_IMetInst)
	: (initWithWindowNibName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindowNibName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithWindowNibName(final com.apple.jobjc.foundation.NSString windowNibName){
			final com.apple.jobjc.Invoke.MsgSend initWithWindowNibName_IMetInst = get_initWithWindowNibName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindowNibName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowNibName);
		initWithWindowNibName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindowNibName_owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindowNibName_owner_IMetInst(){
		return ((initWithWindowNibName_owner_IMetInst != null)
	? (initWithWindowNibName_owner_IMetInst)
	: (initWithWindowNibName_owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindowNibName:owner:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithWindowNibName_owner(final com.apple.jobjc.foundation.NSString windowNibName, final com.apple.jobjc.ID owner){
			final com.apple.jobjc.Invoke.MsgSend initWithWindowNibName_owner_IMetInst = get_initWithWindowNibName_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindowNibName_owner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowNibName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		initWithWindowNibName_owner_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithWindowNibPath_owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithWindowNibPath_owner_IMetInst(){
		return ((initWithWindowNibPath_owner_IMetInst != null)
	? (initWithWindowNibPath_owner_IMetInst)
	: (initWithWindowNibPath_owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithWindowNibPath:owner:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithWindowNibPath_owner(final com.apple.jobjc.foundation.NSString windowNibPath, final com.apple.jobjc.ID owner){
			final com.apple.jobjc.Invoke.MsgSend initWithWindowNibPath_owner_IMetInst = get_initWithWindowNibPath_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithWindowNibPath_owner_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowNibPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		initWithWindowNibPath_owner_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isWindowLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isWindowLoaded_IMetInst(){
		return ((isWindowLoaded_IMetInst != null)
	? (isWindowLoaded_IMetInst)
	: (isWindowLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isWindowLoaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isWindowLoaded(){
			final com.apple.jobjc.Invoke.MsgSend isWindowLoaded_IMetInst = get_isWindowLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isWindowLoaded_IMetInst.init(nativeBuffer, this);
		isWindowLoaded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadWindow_IMetInst(){
		return ((loadWindow_IMetInst != null)
	? (loadWindow_IMetInst)
	: (loadWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadWindow", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void loadWindow(){
			final com.apple.jobjc.Invoke.MsgSend loadWindow_IMetInst = get_loadWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadWindow_IMetInst.init(nativeBuffer, this);
		loadWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend owner_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_owner_IMetInst(){
		return ((owner_IMetInst != null)
	? (owner_IMetInst)
	: (owner_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "owner", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T owner(){
			final com.apple.jobjc.Invoke.MsgSend owner_IMetInst = get_owner_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		owner_IMetInst.init(nativeBuffer, this);
		owner_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocument_IMetInst(){
		return ((setDocument_IMetInst != null)
	? (setDocument_IMetInst)
	: (setDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDocument(final com.apple.jobjc.appkit.NSDocument document){
			final com.apple.jobjc.Invoke.MsgSend setDocument_IMetInst = get_setDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, document);
		setDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocumentEdited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocumentEdited_IMetInst(){
		return ((setDocumentEdited_IMetInst != null)
	? (setDocumentEdited_IMetInst)
	: (setDocumentEdited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocumentEdited:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDocumentEdited(final boolean dirtyFlag){
			final com.apple.jobjc.Invoke.MsgSend setDocumentEdited_IMetInst = get_setDocumentEdited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocumentEdited_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, dirtyFlag);
		setDocumentEdited_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldCascadeWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldCascadeWindows_IMetInst(){
		return ((setShouldCascadeWindows_IMetInst != null)
	? (setShouldCascadeWindows_IMetInst)
	: (setShouldCascadeWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldCascadeWindows:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldCascadeWindows(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShouldCascadeWindows_IMetInst = get_setShouldCascadeWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldCascadeWindows_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShouldCascadeWindows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldCloseDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldCloseDocument_IMetInst(){
		return ((setShouldCloseDocument_IMetInst != null)
	? (setShouldCloseDocument_IMetInst)
	: (setShouldCloseDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldCloseDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldCloseDocument(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShouldCloseDocument_IMetInst = get_setShouldCloseDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldCloseDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShouldCloseDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindow_IMetInst(){
		return ((setWindow_IMetInst != null)
	? (setWindow_IMetInst)
	: (setWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend setWindow_IMetInst = get_setWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		setWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindowFrameAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindowFrameAutosaveName_IMetInst(){
		return ((setWindowFrameAutosaveName_IMetInst != null)
	? (setWindowFrameAutosaveName_IMetInst)
	: (setWindowFrameAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindowFrameAutosaveName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWindowFrameAutosaveName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend setWindowFrameAutosaveName_IMetInst = get_setWindowFrameAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindowFrameAutosaveName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		setWindowFrameAutosaveName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldCascadeWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldCascadeWindows_IMetInst(){
		return ((shouldCascadeWindows_IMetInst != null)
	? (shouldCascadeWindows_IMetInst)
	: (shouldCascadeWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldCascadeWindows", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldCascadeWindows(){
			final com.apple.jobjc.Invoke.MsgSend shouldCascadeWindows_IMetInst = get_shouldCascadeWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldCascadeWindows_IMetInst.init(nativeBuffer, this);
		shouldCascadeWindows_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldCloseDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldCloseDocument_IMetInst(){
		return ((shouldCloseDocument_IMetInst != null)
	? (shouldCloseDocument_IMetInst)
	: (shouldCloseDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldCloseDocument", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldCloseDocument(){
			final com.apple.jobjc.Invoke.MsgSend shouldCloseDocument_IMetInst = get_shouldCloseDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldCloseDocument_IMetInst.init(nativeBuffer, this);
		shouldCloseDocument_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showWindow_IMetInst(){
		return ((showWindow_IMetInst != null)
	? (showWindow_IMetInst)
	: (showWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showWindow:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showWindow(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend showWindow_IMetInst = get_showWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		showWindow_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend synchronizeWindowTitleWithDocumentName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_synchronizeWindowTitleWithDocumentName_IMetInst(){
		return ((synchronizeWindowTitleWithDocumentName_IMetInst != null)
	? (synchronizeWindowTitleWithDocumentName_IMetInst)
	: (synchronizeWindowTitleWithDocumentName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "synchronizeWindowTitleWithDocumentName", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void synchronizeWindowTitleWithDocumentName(){
			final com.apple.jobjc.Invoke.MsgSend synchronizeWindowTitleWithDocumentName_IMetInst = get_synchronizeWindowTitleWithDocumentName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		synchronizeWindowTitleWithDocumentName_IMetInst.init(nativeBuffer, this);
		synchronizeWindowTitleWithDocumentName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend window_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_IMetInst(){
		return ((window_IMetInst != null)
	? (window_IMetInst)
	: (window_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow window(){
			final com.apple.jobjc.Invoke.MsgSend window_IMetInst = get_window_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_IMetInst.init(nativeBuffer, this);
		window_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowDidLoad_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowDidLoad_IMetInst(){
		return ((windowDidLoad_IMetInst != null)
	? (windowDidLoad_IMetInst)
	: (windowDidLoad_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowDidLoad", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void windowDidLoad(){
			final com.apple.jobjc.Invoke.MsgSend windowDidLoad_IMetInst = get_windowDidLoad_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowDidLoad_IMetInst.init(nativeBuffer, this);
		windowDidLoad_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowFrameAutosaveName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowFrameAutosaveName_IMetInst(){
		return ((windowFrameAutosaveName_IMetInst != null)
	? (windowFrameAutosaveName_IMetInst)
	: (windowFrameAutosaveName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowFrameAutosaveName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString windowFrameAutosaveName(){
			final com.apple.jobjc.Invoke.MsgSend windowFrameAutosaveName_IMetInst = get_windowFrameAutosaveName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowFrameAutosaveName_IMetInst.init(nativeBuffer, this);
		windowFrameAutosaveName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNibName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNibName_IMetInst(){
		return ((windowNibName_IMetInst != null)
	? (windowNibName_IMetInst)
	: (windowNibName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNibName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString windowNibName(){
			final com.apple.jobjc.Invoke.MsgSend windowNibName_IMetInst = get_windowNibName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNibName_IMetInst.init(nativeBuffer, this);
		windowNibName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowNibPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowNibPath_IMetInst(){
		return ((windowNibPath_IMetInst != null)
	? (windowNibPath_IMetInst)
	: (windowNibPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowNibPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString windowNibPath(){
			final com.apple.jobjc.Invoke.MsgSend windowNibPath_IMetInst = get_windowNibPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowNibPath_IMetInst.init(nativeBuffer, this);
		windowNibPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowTitleForDocumentDisplayName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowTitleForDocumentDisplayName_IMetInst(){
		return ((windowTitleForDocumentDisplayName_IMetInst != null)
	? (windowTitleForDocumentDisplayName_IMetInst)
	: (windowTitleForDocumentDisplayName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowTitleForDocumentDisplayName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString windowTitleForDocumentDisplayName(final com.apple.jobjc.foundation.NSString displayName){
			final com.apple.jobjc.Invoke.MsgSend windowTitleForDocumentDisplayName_IMetInst = get_windowTitleForDocumentDisplayName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowTitleForDocumentDisplayName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, displayName);
		windowTitleForDocumentDisplayName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWillLoad_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWillLoad_IMetInst(){
		return ((windowWillLoad_IMetInst != null)
	? (windowWillLoad_IMetInst)
	: (windowWillLoad_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWillLoad", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void windowWillLoad(){
			final com.apple.jobjc.Invoke.MsgSend windowWillLoad_IMetInst = get_windowWillLoad_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWillLoad_IMetInst.init(nativeBuffer, this);
		windowWillLoad_IMetInst.invoke(nativeBuffer);
		
		
	}

}
