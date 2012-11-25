package com.apple.jobjc.appkit;

public  class NSDocumentController extends com.apple.jobjc.foundation.NSObject {
	public NSDocumentController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDocumentController(final NSDocumentController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLsFromRunningOpenPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLsFromRunningOpenPanel_IMetInst(){
		return ((URLsFromRunningOpenPanel_IMetInst != null)
	? (URLsFromRunningOpenPanel_IMetInst)
	: (URLsFromRunningOpenPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLsFromRunningOpenPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray URLsFromRunningOpenPanel(){
			final com.apple.jobjc.Invoke.MsgSend URLsFromRunningOpenPanel_IMetInst = get_URLsFromRunningOpenPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLsFromRunningOpenPanel_IMetInst.init(nativeBuffer, this);
		URLsFromRunningOpenPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addDocument_IMetInst(){
		return ((addDocument_IMetInst != null)
	? (addDocument_IMetInst)
	: (addDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addDocument(final com.apple.jobjc.appkit.NSDocument document){
			final com.apple.jobjc.Invoke.MsgSend addDocument_IMetInst = get_addDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, document);
		addDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavingDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavingDelay_IMetInst(){
		return ((autosavingDelay_IMetInst != null)
	? (autosavingDelay_IMetInst)
	: (autosavingDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavingDelay", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public double autosavingDelay(){
			final com.apple.jobjc.Invoke.MsgSend autosavingDelay_IMetInst = get_autosavingDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavingDelay_IMetInst.init(nativeBuffer, this);
		autosavingDelay_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginOpenPanel_forTypes_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginOpenPanel_forTypes_completionHandler_IMetInst(){
		return ((beginOpenPanel_forTypes_completionHandler_IMetInst != null)
	? (beginOpenPanel_forTypes_completionHandler_IMetInst)
	: (beginOpenPanel_forTypes_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginOpenPanel:forTypes:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void beginOpenPanel_forTypes_completionHandler(final com.apple.jobjc.appkit.NSOpenPanel openPanel, final com.apple.jobjc.foundation.NSArray inTypes, final Object /* void(^)(NSInteger) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend beginOpenPanel_forTypes_completionHandler_IMetInst = get_beginOpenPanel_forTypes_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginOpenPanel_forTypes_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openPanel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, inTypes);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		beginOpenPanel_forTypes_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginOpenPanelWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginOpenPanelWithCompletionHandler_IMetInst(){
		return ((beginOpenPanelWithCompletionHandler_IMetInst != null)
	? (beginOpenPanelWithCompletionHandler_IMetInst)
	: (beginOpenPanelWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginOpenPanelWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void beginOpenPanelWithCompletionHandler(final Object /* void(^)(NSArray*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend beginOpenPanelWithCompletionHandler_IMetInst = get_beginOpenPanelWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginOpenPanelWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		beginOpenPanelWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend clearRecentDocuments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_clearRecentDocuments_IMetInst(){
		return ((clearRecentDocuments_IMetInst != null)
	? (clearRecentDocuments_IMetInst)
	: (clearRecentDocuments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "clearRecentDocuments:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void clearRecentDocuments(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend clearRecentDocuments_IMetInst = get_clearRecentDocuments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		clearRecentDocuments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		clearRecentDocuments_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst(){
		return ((closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst != null)
	? (closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst)
	: (closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "closeAllDocumentsWithDelegate:didCloseAllSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didCloseAllSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst = get_closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didCloseAllSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		closeAllDocumentsWithDelegate_didCloseAllSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend currentDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentDirectory_IMetInst(){
		return ((currentDirectory_IMetInst != null)
	? (currentDirectory_IMetInst)
	: (currentDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentDirectory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currentDirectory(){
			final com.apple.jobjc.Invoke.MsgSend currentDirectory_IMetInst = get_currentDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentDirectory_IMetInst.init(nativeBuffer, this);
		currentDirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentDocument_IMetInst(){
		return ((currentDocument_IMetInst != null)
	? (currentDocument_IMetInst)
	: (currentDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentDocument", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T currentDocument(){
			final com.apple.jobjc.Invoke.MsgSend currentDocument_IMetInst = get_currentDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentDocument_IMetInst.init(nativeBuffer, this);
		currentDocument_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultType_IMetInst(){
		return ((defaultType_IMetInst != null)
	? (defaultType_IMetInst)
	: (defaultType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString defaultType(){
			final com.apple.jobjc.Invoke.MsgSend defaultType_IMetInst = get_defaultType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultType_IMetInst.init(nativeBuffer, this);
		defaultType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayNameForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayNameForType_IMetInst(){
		return ((displayNameForType_IMetInst != null)
	? (displayNameForType_IMetInst)
	: (displayNameForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayNameForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayNameForType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend displayNameForType_IMetInst = get_displayNameForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayNameForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		displayNameForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentClassForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentClassForType_IMetInst(){
		return ((documentClassForType_IMetInst != null)
	? (documentClassForType_IMetInst)
	: (documentClassForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentClassForType:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T documentClassForType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend documentClassForType_IMetInst = get_documentClassForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentClassForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		documentClassForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentClassNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentClassNames_IMetInst(){
		return ((documentClassNames_IMetInst != null)
	? (documentClassNames_IMetInst)
	: (documentClassNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentClassNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray documentClassNames(){
			final com.apple.jobjc.Invoke.MsgSend documentClassNames_IMetInst = get_documentClassNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentClassNames_IMetInst.init(nativeBuffer, this);
		documentClassNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentForFileName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentForFileName_IMetInst(){
		return ((documentForFileName_IMetInst != null)
	? (documentForFileName_IMetInst)
	: (documentForFileName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentForFileName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T documentForFileName(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend documentForFileName_IMetInst = get_documentForFileName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentForFileName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		documentForFileName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentForURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentForURL_IMetInst(){
		return ((documentForURL_IMetInst != null)
	? (documentForURL_IMetInst)
	: (documentForURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentForURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T documentForURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend documentForURL_IMetInst = get_documentForURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentForURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		documentForURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentForWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentForWindow_IMetInst(){
		return ((documentForWindow_IMetInst != null)
	? (documentForWindow_IMetInst)
	: (documentForWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentForWindow:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T documentForWindow(final com.apple.jobjc.appkit.NSWindow window){
			final com.apple.jobjc.Invoke.MsgSend documentForWindow_IMetInst = get_documentForWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentForWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		documentForWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documents_IMetInst(){
		return ((documents_IMetInst != null)
	? (documents_IMetInst)
	: (documents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray documents(){
			final com.apple.jobjc.Invoke.MsgSend documents_IMetInst = get_documents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documents_IMetInst.init(nativeBuffer, this);
		documents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst(){
		return ((duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst != null)
	? (duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst)
	: (duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duplicateDocumentWithContentsOfURL:copying:displayName:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSDocument duplicateDocumentWithContentsOfURL_copying_displayName_error(final com.apple.jobjc.foundation.NSURL url, final boolean duplicateByCopying, final com.apple.jobjc.foundation.NSString displayNameOrNil, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst = get_duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, duplicateByCopying);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, displayNameOrNil);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		duplicateDocumentWithContentsOfURL_copying_displayName_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSDocument returnValue = (com.apple.jobjc.appkit.NSDocument) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileExtensionsFromType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileExtensionsFromType_IMetInst(){
		return ((fileExtensionsFromType_IMetInst != null)
	? (fileExtensionsFromType_IMetInst)
	: (fileExtensionsFromType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileExtensionsFromType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray fileExtensionsFromType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend fileExtensionsFromType_IMetInst = get_fileExtensionsFromType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileExtensionsFromType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		fileExtensionsFromType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileNamesFromRunningOpenPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileNamesFromRunningOpenPanel_IMetInst(){
		return ((fileNamesFromRunningOpenPanel_IMetInst != null)
	? (fileNamesFromRunningOpenPanel_IMetInst)
	: (fileNamesFromRunningOpenPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileNamesFromRunningOpenPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray fileNamesFromRunningOpenPanel(){
			final com.apple.jobjc.Invoke.MsgSend fileNamesFromRunningOpenPanel_IMetInst = get_fileNamesFromRunningOpenPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileNamesFromRunningOpenPanel_IMetInst.init(nativeBuffer, this);
		fileNamesFromRunningOpenPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasEditedDocuments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasEditedDocuments_IMetInst(){
		return ((hasEditedDocuments_IMetInst != null)
	? (hasEditedDocuments_IMetInst)
	: (hasEditedDocuments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasEditedDocuments", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasEditedDocuments(){
			final com.apple.jobjc.Invoke.MsgSend hasEditedDocuments_IMetInst = get_hasEditedDocuments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasEditedDocuments_IMetInst.init(nativeBuffer, this);
		hasEditedDocuments_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst(){
		return ((makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst != null)
	? (makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst)
	: (makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeDocumentForURL:withContentsOfURL:ofType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeDocumentForURL_withContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL urlOrNil, final com.apple.jobjc.foundation.NSURL contentsURL, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst = get_makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, urlOrNil);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		makeDocumentForURL_withContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfFile_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeDocumentWithContentsOfFile_ofType_IMetInst(){
		return ((makeDocumentWithContentsOfFile_ofType_IMetInst != null)
	? (makeDocumentWithContentsOfFile_ofType_IMetInst)
	: (makeDocumentWithContentsOfFile_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeDocumentWithContentsOfFile:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeDocumentWithContentsOfFile_ofType(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfFile_ofType_IMetInst = get_makeDocumentWithContentsOfFile_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeDocumentWithContentsOfFile_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		makeDocumentWithContentsOfFile_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfURL_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeDocumentWithContentsOfURL_ofType_IMetInst(){
		return ((makeDocumentWithContentsOfURL_ofType_IMetInst != null)
	? (makeDocumentWithContentsOfURL_ofType_IMetInst)
	: (makeDocumentWithContentsOfURL_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeDocumentWithContentsOfURL:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeDocumentWithContentsOfURL_ofType(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfURL_ofType_IMetInst = get_makeDocumentWithContentsOfURL_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeDocumentWithContentsOfURL_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		makeDocumentWithContentsOfURL_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeDocumentWithContentsOfURL_ofType_error_IMetInst(){
		return ((makeDocumentWithContentsOfURL_ofType_error_IMetInst != null)
	? (makeDocumentWithContentsOfURL_ofType_error_IMetInst)
	: (makeDocumentWithContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeDocumentWithContentsOfURL:ofType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeDocumentWithContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend makeDocumentWithContentsOfURL_ofType_error_IMetInst = get_makeDocumentWithContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeDocumentWithContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		makeDocumentWithContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeUntitledDocumentOfType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeUntitledDocumentOfType_IMetInst(){
		return ((makeUntitledDocumentOfType_IMetInst != null)
	? (makeUntitledDocumentOfType_IMetInst)
	: (makeUntitledDocumentOfType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeUntitledDocumentOfType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeUntitledDocumentOfType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend makeUntitledDocumentOfType_IMetInst = get_makeUntitledDocumentOfType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeUntitledDocumentOfType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		makeUntitledDocumentOfType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeUntitledDocumentOfType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeUntitledDocumentOfType_error_IMetInst(){
		return ((makeUntitledDocumentOfType_error_IMetInst != null)
	? (makeUntitledDocumentOfType_error_IMetInst)
	: (makeUntitledDocumentOfType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeUntitledDocumentOfType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T makeUntitledDocumentOfType_error(final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend makeUntitledDocumentOfType_error_IMetInst = get_makeUntitledDocumentOfType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeUntitledDocumentOfType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		makeUntitledDocumentOfType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumRecentDocumentCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumRecentDocumentCount_IMetInst(){
		return ((maximumRecentDocumentCount_IMetInst != null)
	? (maximumRecentDocumentCount_IMetInst)
	: (maximumRecentDocumentCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumRecentDocumentCount", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long maximumRecentDocumentCount(){
			final com.apple.jobjc.Invoke.MsgSend maximumRecentDocumentCount_IMetInst = get_maximumRecentDocumentCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumRecentDocumentCount_IMetInst.init(nativeBuffer, this);
		maximumRecentDocumentCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newDocument_IMetInst(){
		return ((newDocument_IMetInst != null)
	? (newDocument_IMetInst)
	: (newDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void newDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend newDocument_IMetInst = get_newDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		newDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteNewRecentDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteNewRecentDocument_IMetInst(){
		return ((noteNewRecentDocument_IMetInst != null)
	? (noteNewRecentDocument_IMetInst)
	: (noteNewRecentDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteNewRecentDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void noteNewRecentDocument(final com.apple.jobjc.appkit.NSDocument document){
			final com.apple.jobjc.Invoke.MsgSend noteNewRecentDocument_IMetInst = get_noteNewRecentDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteNewRecentDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, document);
		noteNewRecentDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteNewRecentDocumentURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteNewRecentDocumentURL_IMetInst(){
		return ((noteNewRecentDocumentURL_IMetInst != null)
	? (noteNewRecentDocumentURL_IMetInst)
	: (noteNewRecentDocumentURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteNewRecentDocumentURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void noteNewRecentDocumentURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend noteNewRecentDocumentURL_IMetInst = get_noteNewRecentDocumentURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteNewRecentDocumentURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		noteNewRecentDocumentURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openDocument_IMetInst(){
		return ((openDocument_IMetInst != null)
	? (openDocument_IMetInst)
	: (openDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void openDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend openDocument_IMetInst = get_openDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		openDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfFile_display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openDocumentWithContentsOfFile_display_IMetInst(){
		return ((openDocumentWithContentsOfFile_display_IMetInst != null)
	? (openDocumentWithContentsOfFile_display_IMetInst)
	: (openDocumentWithContentsOfFile_display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openDocumentWithContentsOfFile:display:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T openDocumentWithContentsOfFile_display(final com.apple.jobjc.foundation.NSString fileName, final boolean display){
			final com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfFile_display_IMetInst = get_openDocumentWithContentsOfFile_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openDocumentWithContentsOfFile_display_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, display);
		openDocumentWithContentsOfFile_display_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openDocumentWithContentsOfURL_display_IMetInst(){
		return ((openDocumentWithContentsOfURL_display_IMetInst != null)
	? (openDocumentWithContentsOfURL_display_IMetInst)
	: (openDocumentWithContentsOfURL_display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openDocumentWithContentsOfURL:display:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T openDocumentWithContentsOfURL_display(final com.apple.jobjc.foundation.NSURL url, final boolean display){
			final com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_IMetInst = get_openDocumentWithContentsOfURL_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openDocumentWithContentsOfURL_display_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, display);
		openDocumentWithContentsOfURL_display_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openDocumentWithContentsOfURL_display_completionHandler_IMetInst(){
		return ((openDocumentWithContentsOfURL_display_completionHandler_IMetInst != null)
	? (openDocumentWithContentsOfURL_display_completionHandler_IMetInst)
	: (openDocumentWithContentsOfURL_display_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openDocumentWithContentsOfURL:display:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void openDocumentWithContentsOfURL_display_completionHandler(final com.apple.jobjc.foundation.NSURL url, final boolean displayDocument, final Object /* void(^)(NSDocument*,BOOL,NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_completionHandler_IMetInst = get_openDocumentWithContentsOfURL_display_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openDocumentWithContentsOfURL_display_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, displayDocument);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		openDocumentWithContentsOfURL_display_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openDocumentWithContentsOfURL_display_error_IMetInst(){
		return ((openDocumentWithContentsOfURL_display_error_IMetInst != null)
	? (openDocumentWithContentsOfURL_display_error_IMetInst)
	: (openDocumentWithContentsOfURL_display_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openDocumentWithContentsOfURL:display:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T openDocumentWithContentsOfURL_display_error(final com.apple.jobjc.foundation.NSURL url, final boolean displayDocument, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend openDocumentWithContentsOfURL_display_error_IMetInst = get_openDocumentWithContentsOfURL_display_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openDocumentWithContentsOfURL_display_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, displayDocument);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		openDocumentWithContentsOfURL_display_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openUntitledDocumentAndDisplay_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openUntitledDocumentAndDisplay_error_IMetInst(){
		return ((openUntitledDocumentAndDisplay_error_IMetInst != null)
	? (openUntitledDocumentAndDisplay_error_IMetInst)
	: (openUntitledDocumentAndDisplay_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openUntitledDocumentAndDisplay:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T openUntitledDocumentAndDisplay_error(final boolean displayDocument, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend openUntitledDocumentAndDisplay_error_IMetInst = get_openUntitledDocumentAndDisplay_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openUntitledDocumentAndDisplay_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, displayDocument);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		openUntitledDocumentAndDisplay_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openUntitledDocumentOfType_display_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openUntitledDocumentOfType_display_IMetInst(){
		return ((openUntitledDocumentOfType_display_IMetInst != null)
	? (openUntitledDocumentOfType_display_IMetInst)
	: (openUntitledDocumentOfType_display_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openUntitledDocumentOfType:display:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T openUntitledDocumentOfType_display(final com.apple.jobjc.foundation.NSString type, final boolean display){
			final com.apple.jobjc.Invoke.MsgSend openUntitledDocumentOfType_display_IMetInst = get_openUntitledDocumentOfType_display_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openUntitledDocumentOfType_display_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, display);
		openUntitledDocumentOfType_display_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend presentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentError_IMetInst(){
		return ((presentError_IMetInst != null)
	? (presentError_IMetInst)
	: (presentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean presentError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend presentError_IMetInst = get_presentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		presentError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst(){
		return ((presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst != null)
	? (presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst)
	: (presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentError:modalForWindow:delegate:didPresentSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void presentError_modalForWindow_delegate_didPresentSelector_contextInfo(final com.apple.jobjc.foundation.NSError error, final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didPresentSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst = get_presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didPresentSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		presentError_modalForWindow_delegate_didPresentSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend recentDocumentURLs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recentDocumentURLs_IMetInst(){
		return ((recentDocumentURLs_IMetInst != null)
	? (recentDocumentURLs_IMetInst)
	: (recentDocumentURLs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recentDocumentURLs", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray recentDocumentURLs(){
			final com.apple.jobjc.Invoke.MsgSend recentDocumentURLs_IMetInst = get_recentDocumentURLs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recentDocumentURLs_IMetInst.init(nativeBuffer, this);
		recentDocumentURLs_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeDocument_IMetInst(){
		return ((removeDocument_IMetInst != null)
	? (removeDocument_IMetInst)
	: (removeDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeDocument(final com.apple.jobjc.appkit.NSDocument document){
			final com.apple.jobjc.Invoke.MsgSend removeDocument_IMetInst = get_removeDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, document);
		removeDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst(){
		return ((reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst != null)
	? (reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst)
	: (reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reopenDocumentForURL:withContentsOfURL:display:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void reopenDocumentForURL_withContentsOfURL_display_completionHandler(final com.apple.jobjc.foundation.NSURL urlOrNil, final com.apple.jobjc.foundation.NSURL contentsURL, final boolean displayDocument, final Object /* void(^)(NSDocument*,BOOL,NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst = get_reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, urlOrNil);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsURL);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, displayDocument);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		reopenDocumentForURL_withContentsOfURL_display_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reopenDocumentForURL_withContentsOfURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reopenDocumentForURL_withContentsOfURL_error_IMetInst(){
		return ((reopenDocumentForURL_withContentsOfURL_error_IMetInst != null)
	? (reopenDocumentForURL_withContentsOfURL_error_IMetInst)
	: (reopenDocumentForURL_withContentsOfURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reopenDocumentForURL:withContentsOfURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean reopenDocumentForURL_withContentsOfURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSURL contentsURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend reopenDocumentForURL_withContentsOfURL_error_IMetInst = get_reopenDocumentForURL_withContentsOfURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reopenDocumentForURL_withContentsOfURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		reopenDocumentForURL_withContentsOfURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst(){
		return ((reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst != null)
	? (reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst)
	: (reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reviewUnsavedDocumentsWithAlertTitle:cancellable:delegate:didReviewAllSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo(final com.apple.jobjc.foundation.NSString title, final boolean cancellable, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didReviewAllSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst = get_reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, cancellable);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didReviewAllSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		reviewUnsavedDocumentsWithAlertTitle_cancellable_delegate_didReviewAllSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalOpenPanel_forTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalOpenPanel_forTypes_IMetInst(){
		return ((runModalOpenPanel_forTypes_IMetInst != null)
	? (runModalOpenPanel_forTypes_IMetInst)
	: (runModalOpenPanel_forTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalOpenPanel:forTypes:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalOpenPanel_forTypes(final com.apple.jobjc.appkit.NSOpenPanel openPanel, final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend runModalOpenPanel_forTypes_IMetInst = get_runModalOpenPanel_forTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalOpenPanel_forTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, openPanel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		runModalOpenPanel_forTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend saveAllDocuments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveAllDocuments_IMetInst(){
		return ((saveAllDocuments_IMetInst != null)
	? (saveAllDocuments_IMetInst)
	: (saveAllDocuments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveAllDocuments:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void saveAllDocuments(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend saveAllDocuments_IMetInst = get_saveAllDocuments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveAllDocuments_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		saveAllDocuments_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosavingDelay_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosavingDelay_IMetInst(){
		return ((setAutosavingDelay_IMetInst != null)
	? (setAutosavingDelay_IMetInst)
	: (setAutosavingDelay_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosavingDelay:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST)));
	}

	 public void setAutosavingDelay(final double autosavingDelay){
			final com.apple.jobjc.Invoke.MsgSend setAutosavingDelay_IMetInst = get_setAutosavingDelay_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosavingDelay_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, autosavingDelay);
		setAutosavingDelay_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldCreateUI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldCreateUI_IMetInst(){
		return ((setShouldCreateUI_IMetInst != null)
	? (setShouldCreateUI_IMetInst)
	: (setShouldCreateUI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldCreateUI:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldCreateUI(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShouldCreateUI_IMetInst = get_setShouldCreateUI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldCreateUI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShouldCreateUI_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldCreateUI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldCreateUI_IMetInst(){
		return ((shouldCreateUI_IMetInst != null)
	? (shouldCreateUI_IMetInst)
	: (shouldCreateUI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldCreateUI", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldCreateUI(){
			final com.apple.jobjc.Invoke.MsgSend shouldCreateUI_IMetInst = get_shouldCreateUI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldCreateUI_IMetInst.init(nativeBuffer, this);
		shouldCreateUI_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typeForContentsOfURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeForContentsOfURL_error_IMetInst(){
		return ((typeForContentsOfURL_error_IMetInst != null)
	? (typeForContentsOfURL_error_IMetInst)
	: (typeForContentsOfURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeForContentsOfURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString typeForContentsOfURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend typeForContentsOfURL_error_IMetInst = get_typeForContentsOfURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeForContentsOfURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		typeForContentsOfURL_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typeFromFileExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeFromFileExtension_IMetInst(){
		return ((typeFromFileExtension_IMetInst != null)
	? (typeFromFileExtension_IMetInst)
	: (typeFromFileExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeFromFileExtension:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString typeFromFileExtension(final com.apple.jobjc.foundation.NSString fileNameExtensionOrHFSFileType){
			final com.apple.jobjc.Invoke.MsgSend typeFromFileExtension_IMetInst = get_typeFromFileExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeFromFileExtension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileNameExtensionOrHFSFileType);
		typeFromFileExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateUserInterfaceItem_IMetInst(){
		return ((validateUserInterfaceItem_IMetInst != null)
	? (validateUserInterfaceItem_IMetInst)
	: (validateUserInterfaceItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateUserInterfaceItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateUserInterfaceItem(final com.apple.jobjc.ID anItem){
			final com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst = get_validateUserInterfaceItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateUserInterfaceItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anItem);
		validateUserInterfaceItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend willPresentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willPresentError_IMetInst(){
		return ((willPresentError_IMetInst != null)
	? (willPresentError_IMetInst)
	: (willPresentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willPresentError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSError willPresentError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend willPresentError_IMetInst = get_willPresentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willPresentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		willPresentError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSError returnValue = (com.apple.jobjc.foundation.NSError) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
