package com.apple.jobjc.appkit;

public  class NSDocument extends com.apple.jobjc.foundation.NSObject {
	public NSDocument(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDocument(final NSDocument obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addWindowController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addWindowController_IMetInst(){
		return ((addWindowController_IMetInst != null)
	? (addWindowController_IMetInst)
	: (addWindowController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addWindowController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addWindowController(final com.apple.jobjc.appkit.NSWindowController windowController){
			final com.apple.jobjc.Invoke.MsgSend addWindowController_IMetInst = get_addWindowController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addWindowController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		addWindowController_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst(){
		return ((autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst != null)
	? (autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst)
	: (autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosaveDocumentWithDelegate:didAutosaveSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didAutosaveSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst = get_autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didAutosaveSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		autosaveDocumentWithDelegate_didAutosaveSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autosaveWithImplicitCancellability_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosaveWithImplicitCancellability_completionHandler_IMetInst(){
		return ((autosaveWithImplicitCancellability_completionHandler_IMetInst != null)
	? (autosaveWithImplicitCancellability_completionHandler_IMetInst)
	: (autosaveWithImplicitCancellability_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosaveWithImplicitCancellability:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void autosaveWithImplicitCancellability_completionHandler(final boolean autosavingIsImplicitlyCancellable, final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend autosaveWithImplicitCancellability_completionHandler_IMetInst = get_autosaveWithImplicitCancellability_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosaveWithImplicitCancellability_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, autosavingIsImplicitlyCancellable);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		autosaveWithImplicitCancellability_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavedContentsFileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavedContentsFileURL_IMetInst(){
		return ((autosavedContentsFileURL_IMetInst != null)
	? (autosavedContentsFileURL_IMetInst)
	: (autosavedContentsFileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavedContentsFileURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL autosavedContentsFileURL(){
			final com.apple.jobjc.Invoke.MsgSend autosavedContentsFileURL_IMetInst = get_autosavedContentsFileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavedContentsFileURL_IMetInst.init(nativeBuffer, this);
		autosavedContentsFileURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavingFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavingFileType_IMetInst(){
		return ((autosavingFileType_IMetInst != null)
	? (autosavingFileType_IMetInst)
	: (autosavingFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavingFileType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString autosavingFileType(){
			final com.apple.jobjc.Invoke.MsgSend autosavingFileType_IMetInst = get_autosavingFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavingFileType_IMetInst.init(nativeBuffer, this);
		autosavingFileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autosavingIsImplicitlyCancellable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autosavingIsImplicitlyCancellable_IMetInst(){
		return ((autosavingIsImplicitlyCancellable_IMetInst != null)
	? (autosavingIsImplicitlyCancellable_IMetInst)
	: (autosavingIsImplicitlyCancellable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autosavingIsImplicitlyCancellable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autosavingIsImplicitlyCancellable(){
			final com.apple.jobjc.Invoke.MsgSend autosavingIsImplicitlyCancellable_IMetInst = get_autosavingIsImplicitlyCancellable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autosavingIsImplicitlyCancellable_IMetInst.init(nativeBuffer, this);
		autosavingIsImplicitlyCancellable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backupFileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backupFileURL_IMetInst(){
		return ((backupFileURL_IMetInst != null)
	? (backupFileURL_IMetInst)
	: (backupFileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backupFileURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL backupFileURL(){
			final com.apple.jobjc.Invoke.MsgSend backupFileURL_IMetInst = get_backupFileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backupFileURL_IMetInst.init(nativeBuffer, this);
		backupFileURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend browseDocumentVersions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_browseDocumentVersions_IMetInst(){
		return ((browseDocumentVersions_IMetInst != null)
	? (browseDocumentVersions_IMetInst)
	: (browseDocumentVersions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "browseDocumentVersions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void browseDocumentVersions(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend browseDocumentVersions_IMetInst = get_browseDocumentVersions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		browseDocumentVersions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		browseDocumentVersions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst(){
		return ((canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst != null)
	? (canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst)
	: (canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canAsynchronouslyWriteToURL:ofType:forSaveOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean canAsynchronouslyWriteToURL_ofType_forSaveOperation(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation){
			final com.apple.jobjc.Invoke.MsgSend canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst = get_canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		canAsynchronouslyWriteToURL_ofType_forSaveOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst(){
		return ((canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst != null)
	? (canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst)
	: (canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canCloseDocumentWithDelegate:shouldCloseSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL shouldCloseSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst = get_canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, shouldCloseSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		canCloseDocumentWithDelegate_shouldCloseSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeCountTokenForSaveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeCountTokenForSaveOperation_IMetInst(){
		return ((changeCountTokenForSaveOperation_IMetInst != null)
	? (changeCountTokenForSaveOperation_IMetInst)
	: (changeCountTokenForSaveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeCountTokenForSaveOperation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T changeCountTokenForSaveOperation(final long saveOperation){
			final com.apple.jobjc.Invoke.MsgSend changeCountTokenForSaveOperation_IMetInst = get_changeCountTokenForSaveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeCountTokenForSaveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		changeCountTokenForSaveOperation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkAutosavingSafetyAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkAutosavingSafetyAndReturnError_IMetInst(){
		return ((checkAutosavingSafetyAndReturnError_IMetInst != null)
	? (checkAutosavingSafetyAndReturnError_IMetInst)
	: (checkAutosavingSafetyAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkAutosavingSafetyAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean checkAutosavingSafetyAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend checkAutosavingSafetyAndReturnError_IMetInst = get_checkAutosavingSafetyAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkAutosavingSafetyAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		checkAutosavingSafetyAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend continueActivityUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_continueActivityUsingBlock_IMetInst(){
		return ((continueActivityUsingBlock_IMetInst != null)
	? (continueActivityUsingBlock_IMetInst)
	: (continueActivityUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "continueActivityUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void continueActivityUsingBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend continueActivityUsingBlock_IMetInst = get_continueActivityUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		continueActivityUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		continueActivityUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst(){
		return ((continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst != null)
	? (continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst)
	: (continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "continueAsynchronousWorkOnMainThreadUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void continueAsynchronousWorkOnMainThreadUsingBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst = get_continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		continueAsynchronousWorkOnMainThreadUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dataOfType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataOfType_error_IMetInst(){
		return ((dataOfType_error_IMetInst != null)
	? (dataOfType_error_IMetInst)
	: (dataOfType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataOfType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataOfType_error(final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend dataOfType_error_IMetInst = get_dataOfType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataOfType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		dataOfType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataRepresentationOfType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataRepresentationOfType_IMetInst(){
		return ((dataRepresentationOfType_IMetInst != null)
	? (dataRepresentationOfType_IMetInst)
	: (dataRepresentationOfType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataRepresentationOfType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataRepresentationOfType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend dataRepresentationOfType_IMetInst = get_dataRepresentationOfType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataRepresentationOfType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		dataRepresentationOfType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultDraftName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultDraftName_IMetInst(){
		return ((defaultDraftName_IMetInst != null)
	? (defaultDraftName_IMetInst)
	: (defaultDraftName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultDraftName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString defaultDraftName(){
			final com.apple.jobjc.Invoke.MsgSend defaultDraftName_IMetInst = get_defaultDraftName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultDraftName_IMetInst.init(nativeBuffer, this);
		defaultDraftName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayName_IMetInst(){
		return ((displayName_IMetInst != null)
	? (displayName_IMetInst)
	: (displayName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayName(){
			final com.apple.jobjc.Invoke.MsgSend displayName_IMetInst = get_displayName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayName_IMetInst.init(nativeBuffer, this);
		displayName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duplicateAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duplicateAndReturnError_IMetInst(){
		return ((duplicateAndReturnError_IMetInst != null)
	? (duplicateAndReturnError_IMetInst)
	: (duplicateAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duplicateAndReturnError:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSDocument duplicateAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend duplicateAndReturnError_IMetInst = get_duplicateAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duplicateAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		duplicateAndReturnError_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSDocument returnValue = (com.apple.jobjc.appkit.NSDocument) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duplicateDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duplicateDocument_IMetInst(){
		return ((duplicateDocument_IMetInst != null)
	? (duplicateDocument_IMetInst)
	: (duplicateDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duplicateDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void duplicateDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend duplicateDocument_IMetInst = get_duplicateDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duplicateDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		duplicateDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst(){
		return ((duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst != null)
	? (duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst)
	: (duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duplicateDocumentWithDelegate:didDuplicateSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didDuplicateSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst = get_duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didDuplicateSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		duplicateDocumentWithDelegate_didDuplicateSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend encodeRestorableStateWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_encodeRestorableStateWithCoder_IMetInst(){
		return ((encodeRestorableStateWithCoder_IMetInst != null)
	? (encodeRestorableStateWithCoder_IMetInst)
	: (encodeRestorableStateWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "encodeRestorableStateWithCoder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void encodeRestorableStateWithCoder(final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend encodeRestorableStateWithCoder_IMetInst = get_encodeRestorableStateWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		encodeRestorableStateWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		encodeRestorableStateWithCoder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fileAttributesToWriteToFile_ofType_saveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileAttributesToWriteToFile_ofType_saveOperation_IMetInst(){
		return ((fileAttributesToWriteToFile_ofType_saveOperation_IMetInst != null)
	? (fileAttributesToWriteToFile_ofType_saveOperation_IMetInst)
	: (fileAttributesToWriteToFile_ofType_saveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileAttributesToWriteToFile:ofType:saveOperation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileAttributesToWriteToFile_ofType_saveOperation(final com.apple.jobjc.foundation.NSString fullDocumentPath, final com.apple.jobjc.foundation.NSString documentTypeName, final long saveOperationType){
			final com.apple.jobjc.Invoke.MsgSend fileAttributesToWriteToFile_ofType_saveOperation_IMetInst = get_fileAttributesToWriteToFile_ofType_saveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileAttributesToWriteToFile_ofType_saveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullDocumentPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, documentTypeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperationType);
		fileAttributesToWriteToFile_ofType_saveOperation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst(){
		return ((fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst != null)
	? (fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst)
	: (fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileAttributesToWriteToURL:ofType:forSaveOperation:originalContentsURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.foundation.NSURL absoluteOriginalContentsURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = get_fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteOriginalContentsURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		fileAttributesToWriteToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileModificationDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileModificationDate_IMetInst(){
		return ((fileModificationDate_IMetInst != null)
	? (fileModificationDate_IMetInst)
	: (fileModificationDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileModificationDate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDate fileModificationDate(){
			final com.apple.jobjc.Invoke.MsgSend fileModificationDate_IMetInst = get_fileModificationDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileModificationDate_IMetInst.init(nativeBuffer, this);
		fileModificationDate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDate returnValue = (com.apple.jobjc.foundation.NSDate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileName_IMetInst(){
		return ((fileName_IMetInst != null)
	? (fileName_IMetInst)
	: (fileName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileName(){
			final com.apple.jobjc.Invoke.MsgSend fileName_IMetInst = get_fileName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileName_IMetInst.init(nativeBuffer, this);
		fileName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileNameExtensionForType_saveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileNameExtensionForType_saveOperation_IMetInst(){
		return ((fileNameExtensionForType_saveOperation_IMetInst != null)
	? (fileNameExtensionForType_saveOperation_IMetInst)
	: (fileNameExtensionForType_saveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileNameExtensionForType:saveOperation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString fileNameExtensionForType_saveOperation(final com.apple.jobjc.foundation.NSString typeName, final long saveOperation){
			final com.apple.jobjc.Invoke.MsgSend fileNameExtensionForType_saveOperation_IMetInst = get_fileNameExtensionForType_saveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileNameExtensionForType_saveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		fileNameExtensionForType_saveOperation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst(){
		return ((fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst != null)
	? (fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst)
	: (fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileNameExtensionWasHiddenInLastRunSavePanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fileNameExtensionWasHiddenInLastRunSavePanel(){
			final com.apple.jobjc.Invoke.MsgSend fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst = get_fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst.init(nativeBuffer, this);
		fileNameExtensionWasHiddenInLastRunSavePanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileType_IMetInst(){
		return ((fileType_IMetInst != null)
	? (fileType_IMetInst)
	: (fileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileType(){
			final com.apple.jobjc.Invoke.MsgSend fileType_IMetInst = get_fileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileType_IMetInst.init(nativeBuffer, this);
		fileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileTypeFromLastRunSavePanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileTypeFromLastRunSavePanel_IMetInst(){
		return ((fileTypeFromLastRunSavePanel_IMetInst != null)
	? (fileTypeFromLastRunSavePanel_IMetInst)
	: (fileTypeFromLastRunSavePanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileTypeFromLastRunSavePanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fileTypeFromLastRunSavePanel(){
			final com.apple.jobjc.Invoke.MsgSend fileTypeFromLastRunSavePanel_IMetInst = get_fileTypeFromLastRunSavePanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileTypeFromLastRunSavePanel_IMetInst.init(nativeBuffer, this);
		fileTypeFromLastRunSavePanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileURL_IMetInst(){
		return ((fileURL_IMetInst != null)
	? (fileURL_IMetInst)
	: (fileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL fileURL(){
			final com.apple.jobjc.Invoke.MsgSend fileURL_IMetInst = get_fileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileURL_IMetInst.init(nativeBuffer, this);
		fileURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileWrapperOfType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileWrapperOfType_error_IMetInst(){
		return ((fileWrapperOfType_error_IMetInst != null)
	? (fileWrapperOfType_error_IMetInst)
	: (fileWrapperOfType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileWrapperOfType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper fileWrapperOfType_error(final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend fileWrapperOfType_error_IMetInst = get_fileWrapperOfType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileWrapperOfType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		fileWrapperOfType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileWrapperRepresentationOfType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileWrapperRepresentationOfType_IMetInst(){
		return ((fileWrapperRepresentationOfType_IMetInst != null)
	? (fileWrapperRepresentationOfType_IMetInst)
	: (fileWrapperRepresentationOfType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileWrapperRepresentationOfType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileWrapper fileWrapperRepresentationOfType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend fileWrapperRepresentationOfType_IMetInst = get_fileWrapperRepresentationOfType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileWrapperRepresentationOfType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		fileWrapperRepresentationOfType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileWrapper returnValue = (com.apple.jobjc.foundation.NSFileWrapper) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleCloseScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleCloseScriptCommand_IMetInst(){
		return ((handleCloseScriptCommand_IMetInst != null)
	? (handleCloseScriptCommand_IMetInst)
	: (handleCloseScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleCloseScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handleCloseScriptCommand(final com.apple.jobjc.foundation.NSCloseCommand command){
			final com.apple.jobjc.Invoke.MsgSend handleCloseScriptCommand_IMetInst = get_handleCloseScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleCloseScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handleCloseScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handlePrintScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handlePrintScriptCommand_IMetInst(){
		return ((handlePrintScriptCommand_IMetInst != null)
	? (handlePrintScriptCommand_IMetInst)
	: (handlePrintScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handlePrintScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handlePrintScriptCommand(final com.apple.jobjc.foundation.NSScriptCommand command){
			final com.apple.jobjc.Invoke.MsgSend handlePrintScriptCommand_IMetInst = get_handlePrintScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handlePrintScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handlePrintScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend handleSaveScriptCommand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_handleSaveScriptCommand_IMetInst(){
		return ((handleSaveScriptCommand_IMetInst != null)
	? (handleSaveScriptCommand_IMetInst)
	: (handleSaveScriptCommand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "handleSaveScriptCommand:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T handleSaveScriptCommand(final com.apple.jobjc.foundation.NSScriptCommand command){
			final com.apple.jobjc.Invoke.MsgSend handleSaveScriptCommand_IMetInst = get_handleSaveScriptCommand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		handleSaveScriptCommand_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, command);
		handleSaveScriptCommand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasUnautosavedChanges_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasUnautosavedChanges_IMetInst(){
		return ((hasUnautosavedChanges_IMetInst != null)
	? (hasUnautosavedChanges_IMetInst)
	: (hasUnautosavedChanges_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasUnautosavedChanges", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasUnautosavedChanges(){
			final com.apple.jobjc.Invoke.MsgSend hasUnautosavedChanges_IMetInst = get_hasUnautosavedChanges_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasUnautosavedChanges_IMetInst.init(nativeBuffer, this);
		hasUnautosavedChanges_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hasUndoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hasUndoManager_IMetInst(){
		return ((hasUndoManager_IMetInst != null)
	? (hasUndoManager_IMetInst)
	: (hasUndoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hasUndoManager", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean hasUndoManager(){
			final com.apple.jobjc.Invoke.MsgSend hasUndoManager_IMetInst = get_hasUndoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hasUndoManager_IMetInst.init(nativeBuffer, this);
		hasUndoManager_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend initForURL_withContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initForURL_withContentsOfURL_ofType_error_IMetInst(){
		return ((initForURL_withContentsOfURL_ofType_error_IMetInst != null)
	? (initForURL_withContentsOfURL_ofType_error_IMetInst)
	: (initForURL_withContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initForURL:withContentsOfURL:ofType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initForURL_withContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL urlOrNil, final com.apple.jobjc.foundation.NSURL contentsURL, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend initForURL_withContentsOfURL_ofType_error_IMetInst = get_initForURL_withContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initForURL_withContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, urlOrNil);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		initForURL_withContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfFile_ofType_IMetInst(){
		return ((initWithContentsOfFile_ofType_IMetInst != null)
	? (initWithContentsOfFile_ofType_IMetInst)
	: (initWithContentsOfFile_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfFile:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfFile_ofType(final com.apple.jobjc.foundation.NSString absolutePath, final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfFile_ofType_IMetInst = get_initWithContentsOfFile_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfFile_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absolutePath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		initWithContentsOfFile_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_ofType_IMetInst(){
		return ((initWithContentsOfURL_ofType_IMetInst != null)
	? (initWithContentsOfURL_ofType_IMetInst)
	: (initWithContentsOfURL_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_ofType(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_ofType_IMetInst = get_initWithContentsOfURL_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		initWithContentsOfURL_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_ofType_error_IMetInst(){
		return ((initWithContentsOfURL_ofType_error_IMetInst != null)
	? (initWithContentsOfURL_ofType_error_IMetInst)
	: (initWithContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:ofType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_ofType_error_IMetInst = get_initWithContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		initWithContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithType_error_IMetInst(){
		return ((initWithType_error_IMetInst != null)
	? (initWithType_error_IMetInst)
	: (initWithType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithType:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithType_error(final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend initWithType_error_IMetInst = get_initWithType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		initWithType_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateRestorableState_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateRestorableState_IMetInst(){
		return ((invalidateRestorableState_IMetInst != null)
	? (invalidateRestorableState_IMetInst)
	: (invalidateRestorableState_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateRestorableState", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateRestorableState(){
			final com.apple.jobjc.Invoke.MsgSend invalidateRestorableState_IMetInst = get_invalidateRestorableState_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateRestorableState_IMetInst.init(nativeBuffer, this);
		invalidateRestorableState_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isDocumentEdited_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDocumentEdited_IMetInst(){
		return ((isDocumentEdited_IMetInst != null)
	? (isDocumentEdited_IMetInst)
	: (isDocumentEdited_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDocumentEdited", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDocumentEdited(){
			final com.apple.jobjc.Invoke.MsgSend isDocumentEdited_IMetInst = get_isDocumentEdited_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDocumentEdited_IMetInst.init(nativeBuffer, this);
		isDocumentEdited_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDraft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDraft_IMetInst(){
		return ((isDraft_IMetInst != null)
	? (isDraft_IMetInst)
	: (isDraft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDraft", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDraft(){
			final com.apple.jobjc.Invoke.MsgSend isDraft_IMetInst = get_isDraft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDraft_IMetInst.init(nativeBuffer, this);
		isDraft_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEntireFileLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEntireFileLoaded_IMetInst(){
		return ((isEntireFileLoaded_IMetInst != null)
	? (isEntireFileLoaded_IMetInst)
	: (isEntireFileLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEntireFileLoaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEntireFileLoaded(){
			final com.apple.jobjc.Invoke.MsgSend isEntireFileLoaded_IMetInst = get_isEntireFileLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEntireFileLoaded_IMetInst.init(nativeBuffer, this);
		isEntireFileLoaded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isInViewingMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isInViewingMode_IMetInst(){
		return ((isInViewingMode_IMetInst != null)
	? (isInViewingMode_IMetInst)
	: (isInViewingMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isInViewingMode", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isInViewingMode(){
			final com.apple.jobjc.Invoke.MsgSend isInViewingMode_IMetInst = get_isInViewingMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isInViewingMode_IMetInst.init(nativeBuffer, this);
		isInViewingMode_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLocked_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLocked_IMetInst(){
		return ((isLocked_IMetInst != null)
	? (isLocked_IMetInst)
	: (isLocked_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLocked", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLocked(){
			final com.apple.jobjc.Invoke.MsgSend isLocked_IMetInst = get_isLocked_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLocked_IMetInst.init(nativeBuffer, this);
		isLocked_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keepBackupFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keepBackupFile_IMetInst(){
		return ((keepBackupFile_IMetInst != null)
	? (keepBackupFile_IMetInst)
	: (keepBackupFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keepBackupFile", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean keepBackupFile(){
			final com.apple.jobjc.Invoke.MsgSend keepBackupFile_IMetInst = get_keepBackupFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keepBackupFile_IMetInst.init(nativeBuffer, this);
		keepBackupFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastComponentOfFileName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastComponentOfFileName_IMetInst(){
		return ((lastComponentOfFileName_IMetInst != null)
	? (lastComponentOfFileName_IMetInst)
	: (lastComponentOfFileName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastComponentOfFileName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString lastComponentOfFileName(){
			final com.apple.jobjc.Invoke.MsgSend lastComponentOfFileName_IMetInst = get_lastComponentOfFileName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastComponentOfFileName_IMetInst.init(nativeBuffer, this);
		lastComponentOfFileName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadDataRepresentation_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadDataRepresentation_ofType_IMetInst(){
		return ((loadDataRepresentation_ofType_IMetInst != null)
	? (loadDataRepresentation_ofType_IMetInst)
	: (loadDataRepresentation_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadDataRepresentation:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean loadDataRepresentation_ofType(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend loadDataRepresentation_ofType_IMetInst = get_loadDataRepresentation_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadDataRepresentation_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		loadDataRepresentation_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadFileWrapperRepresentation_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadFileWrapperRepresentation_ofType_IMetInst(){
		return ((loadFileWrapperRepresentation_ofType_IMetInst != null)
	? (loadFileWrapperRepresentation_ofType_IMetInst)
	: (loadFileWrapperRepresentation_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadFileWrapperRepresentation:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean loadFileWrapperRepresentation_ofType(final com.apple.jobjc.foundation.NSFileWrapper wrapper, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend loadFileWrapperRepresentation_ofType_IMetInst = get_loadFileWrapperRepresentation_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadFileWrapperRepresentation_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, wrapper);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		loadFileWrapperRepresentation_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lockDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockDocument_IMetInst(){
		return ((lockDocument_IMetInst != null)
	? (lockDocument_IMetInst)
	: (lockDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void lockDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend lockDocument_IMetInst = get_lockDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		lockDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockDocumentWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockDocumentWithCompletionHandler_IMetInst(){
		return ((lockDocumentWithCompletionHandler_IMetInst != null)
	? (lockDocumentWithCompletionHandler_IMetInst)
	: (lockDocumentWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockDocumentWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void lockDocumentWithCompletionHandler(final Object /* void(^)(BOOL) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend lockDocumentWithCompletionHandler_IMetInst = get_lockDocumentWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockDocumentWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		lockDocumentWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend lockWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lockWithCompletionHandler_IMetInst(){
		return ((lockWithCompletionHandler_IMetInst != null)
	? (lockWithCompletionHandler_IMetInst)
	: (lockWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lockWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void lockWithCompletionHandler(final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend lockWithCompletionHandler_IMetInst = get_lockWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lockWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		lockWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeWindowControllers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeWindowControllers_IMetInst(){
		return ((makeWindowControllers_IMetInst != null)
	? (makeWindowControllers_IMetInst)
	: (makeWindowControllers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeWindowControllers", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void makeWindowControllers(){
			final com.apple.jobjc.Invoke.MsgSend makeWindowControllers_IMetInst = get_makeWindowControllers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeWindowControllers_IMetInst.init(nativeBuffer, this);
		makeWindowControllers_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveDocument_IMetInst(){
		return ((moveDocument_IMetInst != null)
	? (moveDocument_IMetInst)
	: (moveDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveDocument_IMetInst = get_moveDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveDocumentToUbiquityContainer_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveDocumentToUbiquityContainer_IMetInst(){
		return ((moveDocumentToUbiquityContainer_IMetInst != null)
	? (moveDocumentToUbiquityContainer_IMetInst)
	: (moveDocumentToUbiquityContainer_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveDocumentToUbiquityContainer:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveDocumentToUbiquityContainer(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend moveDocumentToUbiquityContainer_IMetInst = get_moveDocumentToUbiquityContainer_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveDocumentToUbiquityContainer_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		moveDocumentToUbiquityContainer_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveDocumentWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveDocumentWithCompletionHandler_IMetInst(){
		return ((moveDocumentWithCompletionHandler_IMetInst != null)
	? (moveDocumentWithCompletionHandler_IMetInst)
	: (moveDocumentWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveDocumentWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void moveDocumentWithCompletionHandler(final Object /* void(^)(BOOL) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend moveDocumentWithCompletionHandler_IMetInst = get_moveDocumentWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveDocumentWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		moveDocumentWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveToURL_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveToURL_completionHandler_IMetInst(){
		return ((moveToURL_completionHandler_IMetInst != null)
	? (moveToURL_completionHandler_IMetInst)
	: (moveToURL_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveToURL:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void moveToURL_completionHandler(final com.apple.jobjc.foundation.NSURL url, final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend moveToURL_completionHandler_IMetInst = get_moveToURL_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveToURL_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		moveToURL_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectSpecifier_IMetInst(){
		return ((objectSpecifier_IMetInst != null)
	? (objectSpecifier_IMetInst)
	: (objectSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier objectSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend objectSpecifier_IMetInst = get_objectSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectSpecifier_IMetInst.init(nativeBuffer, this);
		objectSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performActivityWithSynchronousWaiting_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performActivityWithSynchronousWaiting_usingBlock_IMetInst(){
		return ((performActivityWithSynchronousWaiting_usingBlock_IMetInst != null)
	? (performActivityWithSynchronousWaiting_usingBlock_IMetInst)
	: (performActivityWithSynchronousWaiting_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performActivityWithSynchronousWaiting:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void performActivityWithSynchronousWaiting_usingBlock(final boolean waitSynchronously, final Object /* void(^)(void(^)(void)) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend performActivityWithSynchronousWaiting_usingBlock_IMetInst = get_performActivityWithSynchronousWaiting_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performActivityWithSynchronousWaiting_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, waitSynchronously);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		performActivityWithSynchronousWaiting_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performAsynchronousFileAccessUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performAsynchronousFileAccessUsingBlock_IMetInst(){
		return ((performAsynchronousFileAccessUsingBlock_IMetInst != null)
	? (performAsynchronousFileAccessUsingBlock_IMetInst)
	: (performAsynchronousFileAccessUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performAsynchronousFileAccessUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void performAsynchronousFileAccessUsingBlock(final Object /* void(^)(void(^)(void)) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend performAsynchronousFileAccessUsingBlock_IMetInst = get_performAsynchronousFileAccessUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performAsynchronousFileAccessUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		performAsynchronousFileAccessUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performSynchronousFileAccessUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performSynchronousFileAccessUsingBlock_IMetInst(){
		return ((performSynchronousFileAccessUsingBlock_IMetInst != null)
	? (performSynchronousFileAccessUsingBlock_IMetInst)
	: (performSynchronousFileAccessUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performSynchronousFileAccessUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void performSynchronousFileAccessUsingBlock(final Object /* void(^)(void) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend performSynchronousFileAccessUsingBlock_IMetInst = get_performSynchronousFileAccessUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performSynchronousFileAccessUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		performSynchronousFileAccessUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preparePageLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preparePageLayout_IMetInst(){
		return ((preparePageLayout_IMetInst != null)
	? (preparePageLayout_IMetInst)
	: (preparePageLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preparePageLayout:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean preparePageLayout(final com.apple.jobjc.appkit.NSPageLayout pageLayout){
			final com.apple.jobjc.Invoke.MsgSend preparePageLayout_IMetInst = get_preparePageLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preparePageLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pageLayout);
		preparePageLayout_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareSavePanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareSavePanel_IMetInst(){
		return ((prepareSavePanel_IMetInst != null)
	? (prepareSavePanel_IMetInst)
	: (prepareSavePanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareSavePanel:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean prepareSavePanel(final com.apple.jobjc.appkit.NSSavePanel savePanel){
			final com.apple.jobjc.Invoke.MsgSend prepareSavePanel_IMetInst = get_prepareSavePanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareSavePanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, savePanel);
		prepareSavePanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend printDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printDocument_IMetInst(){
		return ((printDocument_IMetInst != null)
	? (printDocument_IMetInst)
	: (printDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void printDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend printDocument_IMetInst = get_printDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		printDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst(){
		return ((printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst != null)
	? (printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst)
	: (printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printDocumentWithSettings:showPrintPanel:delegate:didPrintSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo(final com.apple.jobjc.foundation.NSDictionary printSettings, final boolean showPrintPanel, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didPrintSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst = get_printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printSettings);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showPrintPanel);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didPrintSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		printDocumentWithSettings_showPrintPanel_delegate_didPrintSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend printInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printInfo_IMetInst(){
		return ((printInfo_IMetInst != null)
	? (printInfo_IMetInst)
	: (printInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintInfo printInfo(){
			final com.apple.jobjc.Invoke.MsgSend printInfo_IMetInst = get_printInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printInfo_IMetInst.init(nativeBuffer, this);
		printInfo_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintInfo returnValue = (com.apple.jobjc.appkit.NSPrintInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printOperationWithSettings_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printOperationWithSettings_error_IMetInst(){
		return ((printOperationWithSettings_error_IMetInst != null)
	? (printOperationWithSettings_error_IMetInst)
	: (printOperationWithSettings_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printOperationWithSettings:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation printOperationWithSettings_error(final com.apple.jobjc.foundation.NSDictionary printSettings, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend printOperationWithSettings_error_IMetInst = get_printOperationWithSettings_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printOperationWithSettings_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printSettings);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		printOperationWithSettings_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printShowingPrintPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printShowingPrintPanel_IMetInst(){
		return ((printShowingPrintPanel_IMetInst != null)
	? (printShowingPrintPanel_IMetInst)
	: (printShowingPrintPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printShowingPrintPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void printShowingPrintPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend printShowingPrintPanel_IMetInst = get_printShowingPrintPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printShowingPrintPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		printShowingPrintPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromData_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromData_ofType_error_IMetInst(){
		return ((readFromData_ofType_error_IMetInst != null)
	? (readFromData_ofType_error_IMetInst)
	: (readFromData_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromData:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromData_ofType_error(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend readFromData_ofType_error_IMetInst = get_readFromData_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromData_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		readFromData_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromFile_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromFile_ofType_IMetInst(){
		return ((readFromFile_ofType_IMetInst != null)
	? (readFromFile_ofType_IMetInst)
	: (readFromFile_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromFile:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readFromFile_ofType(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend readFromFile_ofType_IMetInst = get_readFromFile_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromFile_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		readFromFile_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromFileWrapper_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromFileWrapper_ofType_error_IMetInst(){
		return ((readFromFileWrapper_ofType_error_IMetInst != null)
	? (readFromFileWrapper_ofType_error_IMetInst)
	: (readFromFileWrapper_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromFileWrapper:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromFileWrapper_ofType_error(final com.apple.jobjc.foundation.NSFileWrapper fileWrapper, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend readFromFileWrapper_ofType_error_IMetInst = get_readFromFileWrapper_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromFileWrapper_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileWrapper);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		readFromFileWrapper_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_ofType_IMetInst(){
		return ((readFromURL_ofType_IMetInst != null)
	? (readFromURL_ofType_IMetInst)
	: (readFromURL_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readFromURL_ofType(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_IMetInst = get_readFromURL_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		readFromURL_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_ofType_error_IMetInst(){
		return ((readFromURL_ofType_error_IMetInst != null)
	? (readFromURL_ofType_error_IMetInst)
	: (readFromURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_ofType_error_IMetInst = get_readFromURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		readFromURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeWindowController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeWindowController_IMetInst(){
		return ((removeWindowController_IMetInst != null)
	? (removeWindowController_IMetInst)
	: (removeWindowController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeWindowController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeWindowController(final com.apple.jobjc.appkit.NSWindowController windowController){
			final com.apple.jobjc.Invoke.MsgSend removeWindowController_IMetInst = get_removeWindowController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeWindowController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		removeWindowController_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend renameDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_renameDocument_IMetInst(){
		return ((renameDocument_IMetInst != null)
	? (renameDocument_IMetInst)
	: (renameDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "renameDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void renameDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend renameDocument_IMetInst = get_renameDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		renameDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		renameDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst(){
		return ((restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst != null)
	? (restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst)
	: (restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreDocumentWindowWithIdentifier:state:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void restoreDocumentWindowWithIdentifier_state_completionHandler(final com.apple.jobjc.foundation.NSString identifier, final com.apple.jobjc.foundation.NSCoder state, final Object /* void(^)(NSWindow*,NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst = get_restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, state);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		restoreDocumentWindowWithIdentifier_state_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreStateWithCoder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreStateWithCoder_IMetInst(){
		return ((restoreStateWithCoder_IMetInst != null)
	? (restoreStateWithCoder_IMetInst)
	: (restoreStateWithCoder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreStateWithCoder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void restoreStateWithCoder(final com.apple.jobjc.foundation.NSCoder coder){
			final com.apple.jobjc.Invoke.MsgSend restoreStateWithCoder_IMetInst = get_restoreStateWithCoder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreStateWithCoder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, coder);
		restoreStateWithCoder_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend revertDocumentToSaved_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertDocumentToSaved_IMetInst(){
		return ((revertDocumentToSaved_IMetInst != null)
	? (revertDocumentToSaved_IMetInst)
	: (revertDocumentToSaved_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertDocumentToSaved:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void revertDocumentToSaved(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend revertDocumentToSaved_IMetInst = get_revertDocumentToSaved_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertDocumentToSaved_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		revertDocumentToSaved_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend revertToContentsOfURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertToContentsOfURL_ofType_error_IMetInst(){
		return ((revertToContentsOfURL_ofType_error_IMetInst != null)
	? (revertToContentsOfURL_ofType_error_IMetInst)
	: (revertToContentsOfURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertToContentsOfURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean revertToContentsOfURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend revertToContentsOfURL_ofType_error_IMetInst = get_revertToContentsOfURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertToContentsOfURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		revertToContentsOfURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend revertToSavedFromFile_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertToSavedFromFile_ofType_IMetInst(){
		return ((revertToSavedFromFile_ofType_IMetInst != null)
	? (revertToSavedFromFile_ofType_IMetInst)
	: (revertToSavedFromFile_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertToSavedFromFile:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean revertToSavedFromFile_ofType(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend revertToSavedFromFile_ofType_IMetInst = get_revertToSavedFromFile_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertToSavedFromFile_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		revertToSavedFromFile_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend revertToSavedFromURL_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_revertToSavedFromURL_ofType_IMetInst(){
		return ((revertToSavedFromURL_ofType_IMetInst != null)
	? (revertToSavedFromURL_ofType_IMetInst)
	: (revertToSavedFromURL_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "revertToSavedFromURL:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean revertToSavedFromURL_ofType(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend revertToSavedFromURL_ofType_IMetInst = get_revertToSavedFromURL_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		revertToSavedFromURL_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		revertToSavedFromURL_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalPageLayoutWithPrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalPageLayoutWithPrintInfo_IMetInst(){
		return ((runModalPageLayoutWithPrintInfo_IMetInst != null)
	? (runModalPageLayoutWithPrintInfo_IMetInst)
	: (runModalPageLayoutWithPrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalPageLayoutWithPrintInfo:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalPageLayoutWithPrintInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend runModalPageLayoutWithPrintInfo_IMetInst = get_runModalPageLayoutWithPrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalPageLayoutWithPrintInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		runModalPageLayoutWithPrintInfo_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst(){
		return ((runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst != null)
	? (runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst)
	: (runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalPageLayoutWithPrintInfo:delegate:didRunSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didRunSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst = get_runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didRunSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		runModalPageLayoutWithPrintInfo_delegate_didRunSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst(){
		return ((runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst != null)
	? (runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst)
	: (runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalPrintOperation:delegate:didRunSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void runModalPrintOperation_delegate_didRunSelector_contextInfo(final com.apple.jobjc.appkit.NSPrintOperation printOperation, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didRunSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst = get_runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didRunSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		runModalPrintOperation_delegate_didRunSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst(){
		return ((runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst != null)
	? (runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst)
	: (runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalSavePanelForSaveOperation:delegate:didSaveSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo(final long saveOperation, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didSaveSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst = get_runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didSaveSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		runModalSavePanelForSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runPageLayout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runPageLayout_IMetInst(){
		return ((runPageLayout_IMetInst != null)
	? (runPageLayout_IMetInst)
	: (runPageLayout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runPageLayout:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void runPageLayout(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend runPageLayout_IMetInst = get_runPageLayout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runPageLayout_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		runPageLayout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveDocument_IMetInst(){
		return ((saveDocument_IMetInst != null)
	? (saveDocument_IMetInst)
	: (saveDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void saveDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend saveDocument_IMetInst = get_saveDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		saveDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveDocumentAs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveDocumentAs_IMetInst(){
		return ((saveDocumentAs_IMetInst != null)
	? (saveDocumentAs_IMetInst)
	: (saveDocumentAs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveDocumentAs:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void saveDocumentAs(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend saveDocumentAs_IMetInst = get_saveDocumentAs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveDocumentAs_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		saveDocumentAs_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveDocumentTo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveDocumentTo_IMetInst(){
		return ((saveDocumentTo_IMetInst != null)
	? (saveDocumentTo_IMetInst)
	: (saveDocumentTo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveDocumentTo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void saveDocumentTo(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend saveDocumentTo_IMetInst = get_saveDocumentTo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveDocumentTo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		saveDocumentTo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst(){
		return ((saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst != null)
	? (saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst)
	: (saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveDocumentWithDelegate:didSaveSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void saveDocumentWithDelegate_didSaveSelector_contextInfo(final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didSaveSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst = get_saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didSaveSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		saveDocumentWithDelegate_didSaveSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst(){
		return ((saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst != null)
	? (saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst)
	: (saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveToFile:saveOperation:delegate:didSaveSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void saveToFile_saveOperation_delegate_didSaveSelector_contextInfo(final com.apple.jobjc.foundation.NSString fileName, final long saveOperation, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didSaveSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst = get_saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didSaveSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		saveToFile_saveOperation_delegate_didSaveSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveToURL_ofType_forSaveOperation_completionHandler_IMetInst(){
		return ((saveToURL_ofType_forSaveOperation_completionHandler_IMetInst != null)
	? (saveToURL_ofType_forSaveOperation_completionHandler_IMetInst)
	: (saveToURL_ofType_forSaveOperation_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveToURL:ofType:forSaveOperation:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void saveToURL_ofType_forSaveOperation_completionHandler(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_completionHandler_IMetInst = get_saveToURL_ofType_forSaveOperation_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveToURL_ofType_forSaveOperation_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		saveToURL_ofType_forSaveOperation_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst(){
		return ((saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst != null)
	? (saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst)
	: (saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveToURL:ofType:forSaveOperation:delegate:didSaveSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didSaveSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst = get_saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didSaveSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		saveToURL_ofType_forSaveOperation_delegate_didSaveSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_saveToURL_ofType_forSaveOperation_error_IMetInst(){
		return ((saveToURL_ofType_forSaveOperation_error_IMetInst != null)
	? (saveToURL_ofType_forSaveOperation_error_IMetInst)
	: (saveToURL_ofType_forSaveOperation_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "saveToURL:ofType:forSaveOperation:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean saveToURL_ofType_forSaveOperation_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend saveToURL_ofType_forSaveOperation_error_IMetInst = get_saveToURL_ofType_forSaveOperation_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		saveToURL_ofType_forSaveOperation_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		saveToURL_ofType_forSaveOperation_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scheduleAutosaving_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheduleAutosaving_IMetInst(){
		return ((scheduleAutosaving_IMetInst != null)
	? (scheduleAutosaving_IMetInst)
	: (scheduleAutosaving_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheduleAutosaving", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void scheduleAutosaving(){
			final com.apple.jobjc.Invoke.MsgSend scheduleAutosaving_IMetInst = get_scheduleAutosaving_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheduleAutosaving_IMetInst.init(nativeBuffer, this);
		scheduleAutosaving_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutosavedContentsFileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutosavedContentsFileURL_IMetInst(){
		return ((setAutosavedContentsFileURL_IMetInst != null)
	? (setAutosavedContentsFileURL_IMetInst)
	: (setAutosavedContentsFileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutosavedContentsFileURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAutosavedContentsFileURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend setAutosavedContentsFileURL_IMetInst = get_setAutosavedContentsFileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutosavedContentsFileURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		setAutosavedContentsFileURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDisplayName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDisplayName_IMetInst(){
		return ((setDisplayName_IMetInst != null)
	? (setDisplayName_IMetInst)
	: (setDisplayName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDisplayName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDisplayName(final com.apple.jobjc.foundation.NSString displayNameOrNil){
			final com.apple.jobjc.Invoke.MsgSend setDisplayName_IMetInst = get_setDisplayName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDisplayName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, displayNameOrNil);
		setDisplayName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDraft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDraft_IMetInst(){
		return ((setDraft_IMetInst != null)
	? (setDraft_IMetInst)
	: (setDraft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDraft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDraft(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDraft_IMetInst = get_setDraft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDraft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDraft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileModificationDate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileModificationDate_IMetInst(){
		return ((setFileModificationDate_IMetInst != null)
	? (setFileModificationDate_IMetInst)
	: (setFileModificationDate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileModificationDate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileModificationDate(final com.apple.jobjc.foundation.NSDate modificationDate){
			final com.apple.jobjc.Invoke.MsgSend setFileModificationDate_IMetInst = get_setFileModificationDate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileModificationDate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modificationDate);
		setFileModificationDate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileName_IMetInst(){
		return ((setFileName_IMetInst != null)
	? (setFileName_IMetInst)
	: (setFileName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileName(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend setFileName_IMetInst = get_setFileName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		setFileName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileType_IMetInst(){
		return ((setFileType_IMetInst != null)
	? (setFileType_IMetInst)
	: (setFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend setFileType_IMetInst = get_setFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		setFileType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileURL_IMetInst(){
		return ((setFileURL_IMetInst != null)
	? (setFileURL_IMetInst)
	: (setFileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend setFileURL_IMetInst = get_setFileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		setFileURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHasUndoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHasUndoManager_IMetInst(){
		return ((setHasUndoManager_IMetInst != null)
	? (setHasUndoManager_IMetInst)
	: (setHasUndoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHasUndoManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHasUndoManager(final boolean hasUndoManager){
			final com.apple.jobjc.Invoke.MsgSend setHasUndoManager_IMetInst = get_setHasUndoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHasUndoManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, hasUndoManager);
		setHasUndoManager_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLastComponentOfFileName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLastComponentOfFileName_IMetInst(){
		return ((setLastComponentOfFileName_IMetInst != null)
	? (setLastComponentOfFileName_IMetInst)
	: (setLastComponentOfFileName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLastComponentOfFileName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLastComponentOfFileName(final com.apple.jobjc.foundation.NSString str){
			final com.apple.jobjc.Invoke.MsgSend setLastComponentOfFileName_IMetInst = get_setLastComponentOfFileName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLastComponentOfFileName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, str);
		setLastComponentOfFileName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrintInfo_IMetInst(){
		return ((setPrintInfo_IMetInst != null)
	? (setPrintInfo_IMetInst)
	: (setPrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrintInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPrintInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend setPrintInfo_IMetInst = get_setPrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrintInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		setPrintInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUndoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUndoManager_IMetInst(){
		return ((setUndoManager_IMetInst != null)
	? (setUndoManager_IMetInst)
	: (setUndoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUndoManager:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setUndoManager(final com.apple.jobjc.foundation.NSUndoManager undoManager){
			final com.apple.jobjc.Invoke.MsgSend setUndoManager_IMetInst = get_setUndoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUndoManager_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, undoManager);
		setUndoManager_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend shouldChangePrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldChangePrintInfo_IMetInst(){
		return ((shouldChangePrintInfo_IMetInst != null)
	? (shouldChangePrintInfo_IMetInst)
	: (shouldChangePrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldChangePrintInfo:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean shouldChangePrintInfo(final com.apple.jobjc.appkit.NSPrintInfo newPrintInfo){
			final com.apple.jobjc.Invoke.MsgSend shouldChangePrintInfo_IMetInst = get_shouldChangePrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldChangePrintInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newPrintInfo);
		shouldChangePrintInfo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst(){
		return ((shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst != null)
	? (shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst)
	: (shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldCloseWindowController:delegate:shouldCloseSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo(final com.apple.jobjc.appkit.NSWindowController windowController, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL shouldCloseSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst = get_shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, shouldCloseSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		shouldCloseWindowController_delegate_shouldCloseSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldRunSavePanelWithAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldRunSavePanelWithAccessoryView_IMetInst(){
		return ((shouldRunSavePanelWithAccessoryView_IMetInst != null)
	? (shouldRunSavePanelWithAccessoryView_IMetInst)
	: (shouldRunSavePanelWithAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldRunSavePanelWithAccessoryView", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldRunSavePanelWithAccessoryView(){
			final com.apple.jobjc.Invoke.MsgSend shouldRunSavePanelWithAccessoryView_IMetInst = get_shouldRunSavePanelWithAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldRunSavePanelWithAccessoryView_IMetInst.init(nativeBuffer, this);
		shouldRunSavePanelWithAccessoryView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showWindows_IMetInst(){
		return ((showWindows_IMetInst != null)
	? (showWindows_IMetInst)
	: (showWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showWindows", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void showWindows(){
			final com.apple.jobjc.Invoke.MsgSend showWindows_IMetInst = get_showWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showWindows_IMetInst.init(nativeBuffer, this);
		showWindows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unblockUserInteraction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unblockUserInteraction_IMetInst(){
		return ((unblockUserInteraction_IMetInst != null)
	? (unblockUserInteraction_IMetInst)
	: (unblockUserInteraction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unblockUserInteraction", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unblockUserInteraction(){
			final com.apple.jobjc.Invoke.MsgSend unblockUserInteraction_IMetInst = get_unblockUserInteraction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unblockUserInteraction_IMetInst.init(nativeBuffer, this);
		unblockUserInteraction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend undoManager_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoManager_IMetInst(){
		return ((undoManager_IMetInst != null)
	? (undoManager_IMetInst)
	: (undoManager_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoManager", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSUndoManager undoManager(){
			final com.apple.jobjc.Invoke.MsgSend undoManager_IMetInst = get_undoManager_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoManager_IMetInst.init(nativeBuffer, this);
		undoManager_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSUndoManager returnValue = (com.apple.jobjc.foundation.NSUndoManager) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unlockDocument_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockDocument_IMetInst(){
		return ((unlockDocument_IMetInst != null)
	? (unlockDocument_IMetInst)
	: (unlockDocument_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockDocument:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unlockDocument(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend unlockDocument_IMetInst = get_unlockDocument_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockDocument_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		unlockDocument_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unlockDocumentWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockDocumentWithCompletionHandler_IMetInst(){
		return ((unlockDocumentWithCompletionHandler_IMetInst != null)
	? (unlockDocumentWithCompletionHandler_IMetInst)
	: (unlockDocumentWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockDocumentWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void unlockDocumentWithCompletionHandler(final Object /* void(^)(BOOL) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend unlockDocumentWithCompletionHandler_IMetInst = get_unlockDocumentWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockDocumentWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		unlockDocumentWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unlockWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unlockWithCompletionHandler_IMetInst(){
		return ((unlockWithCompletionHandler_IMetInst != null)
	? (unlockWithCompletionHandler_IMetInst)
	: (unlockWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unlockWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void unlockWithCompletionHandler(final Object /* void(^)(NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend unlockWithCompletionHandler_IMetInst = get_unlockWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unlockWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		unlockWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateChangeCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateChangeCount_IMetInst(){
		return ((updateChangeCount_IMetInst != null)
	? (updateChangeCount_IMetInst)
	: (updateChangeCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateChangeCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void updateChangeCount(final long change){
			final com.apple.jobjc.Invoke.MsgSend updateChangeCount_IMetInst = get_updateChangeCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateChangeCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, change);
		updateChangeCount_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateChangeCountWithToken_forSaveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateChangeCountWithToken_forSaveOperation_IMetInst(){
		return ((updateChangeCountWithToken_forSaveOperation_IMetInst != null)
	? (updateChangeCountWithToken_forSaveOperation_IMetInst)
	: (updateChangeCountWithToken_forSaveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateChangeCountWithToken:forSaveOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void updateChangeCountWithToken_forSaveOperation(final com.apple.jobjc.ID changeCountToken, final long saveOperation){
			final com.apple.jobjc.Invoke.MsgSend updateChangeCountWithToken_forSaveOperation_IMetInst = get_updateChangeCountWithToken_forSaveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateChangeCountWithToken_forSaveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, changeCountToken);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		updateChangeCountWithToken_forSaveOperation_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend willNotPresentError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_willNotPresentError_IMetInst(){
		return ((willNotPresentError_IMetInst != null)
	? (willNotPresentError_IMetInst)
	: (willNotPresentError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "willNotPresentError:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void willNotPresentError(final com.apple.jobjc.foundation.NSError error){
			final com.apple.jobjc.Invoke.MsgSend willNotPresentError_IMetInst = get_willNotPresentError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		willNotPresentError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, error);
		willNotPresentError_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend windowControllerDidLoadNib_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowControllerDidLoadNib_IMetInst(){
		return ((windowControllerDidLoadNib_IMetInst != null)
	? (windowControllerDidLoadNib_IMetInst)
	: (windowControllerDidLoadNib_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowControllerDidLoadNib:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowControllerDidLoadNib(final com.apple.jobjc.appkit.NSWindowController windowController){
			final com.apple.jobjc.Invoke.MsgSend windowControllerDidLoadNib_IMetInst = get_windowControllerDidLoadNib_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowControllerDidLoadNib_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		windowControllerDidLoadNib_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowControllerWillLoadNib_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowControllerWillLoadNib_IMetInst(){
		return ((windowControllerWillLoadNib_IMetInst != null)
	? (windowControllerWillLoadNib_IMetInst)
	: (windowControllerWillLoadNib_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowControllerWillLoadNib:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void windowControllerWillLoadNib(final com.apple.jobjc.appkit.NSWindowController windowController){
			final com.apple.jobjc.Invoke.MsgSend windowControllerWillLoadNib_IMetInst = get_windowControllerWillLoadNib_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowControllerWillLoadNib_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, windowController);
		windowControllerWillLoadNib_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend windowControllers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowControllers_IMetInst(){
		return ((windowControllers_IMetInst != null)
	? (windowControllers_IMetInst)
	: (windowControllers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowControllers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray windowControllers(){
			final com.apple.jobjc.Invoke.MsgSend windowControllers_IMetInst = get_windowControllers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowControllers_IMetInst.init(nativeBuffer, this);
		windowControllers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowForSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowForSheet_IMetInst(){
		return ((windowForSheet_IMetInst != null)
	? (windowForSheet_IMetInst)
	: (windowForSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowForSheet", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow windowForSheet(){
			final com.apple.jobjc.Invoke.MsgSend windowForSheet_IMetInst = get_windowForSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowForSheet_IMetInst.init(nativeBuffer, this);
		windowForSheet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend writableTypesForSaveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writableTypesForSaveOperation_IMetInst(){
		return ((writableTypesForSaveOperation_IMetInst != null)
	? (writableTypesForSaveOperation_IMetInst)
	: (writableTypesForSaveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writableTypesForSaveOperation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray writableTypesForSaveOperation(final long saveOperation){
			final com.apple.jobjc.Invoke.MsgSend writableTypesForSaveOperation_IMetInst = get_writableTypesForSaveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writableTypesForSaveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		writableTypesForSaveOperation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeSafelyToURL_ofType_forSaveOperation_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeSafelyToURL_ofType_forSaveOperation_error_IMetInst(){
		return ((writeSafelyToURL_ofType_forSaveOperation_error_IMetInst != null)
	? (writeSafelyToURL_ofType_forSaveOperation_error_IMetInst)
	: (writeSafelyToURL_ofType_forSaveOperation_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeSafelyToURL:ofType:forSaveOperation:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeSafelyToURL_ofType_forSaveOperation_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend writeSafelyToURL_ofType_forSaveOperation_error_IMetInst = get_writeSafelyToURL_ofType_forSaveOperation_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeSafelyToURL_ofType_forSaveOperation_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		writeSafelyToURL_ofType_forSaveOperation_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_ofType_IMetInst(){
		return ((writeToFile_ofType_IMetInst != null)
	? (writeToFile_ofType_IMetInst)
	: (writeToFile_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeToFile_ofType(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_ofType_IMetInst = get_writeToFile_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		writeToFile_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_ofType_originalFile_saveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_ofType_originalFile_saveOperation_IMetInst(){
		return ((writeToFile_ofType_originalFile_saveOperation_IMetInst != null)
	? (writeToFile_ofType_originalFile_saveOperation_IMetInst)
	: (writeToFile_ofType_originalFile_saveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:ofType:originalFile:saveOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean writeToFile_ofType_originalFile_saveOperation(final com.apple.jobjc.foundation.NSString fullDocumentPath, final com.apple.jobjc.foundation.NSString documentTypeName, final com.apple.jobjc.foundation.NSString fullOriginalDocumentPath, final long saveOperationType){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_ofType_originalFile_saveOperation_IMetInst = get_writeToFile_ofType_originalFile_saveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_ofType_originalFile_saveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullDocumentPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, documentTypeName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullOriginalDocumentPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperationType);
		writeToFile_ofType_originalFile_saveOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_ofType_IMetInst(){
		return ((writeToURL_ofType_IMetInst != null)
	? (writeToURL_ofType_IMetInst)
	: (writeToURL_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:ofType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean writeToURL_ofType(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_IMetInst = get_writeToURL_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		writeToURL_ofType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_ofType_error_IMetInst(){
		return ((writeToURL_ofType_error_IMetInst != null)
	? (writeToURL_ofType_error_IMetInst)
	: (writeToURL_ofType_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:ofType:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_ofType_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_error_IMetInst = get_writeToURL_ofType_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_ofType_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		writeToURL_ofType_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst(){
		return ((writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst != null)
	? (writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst)
	: (writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:ofType:forSaveOperation:originalContentsURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_ofType_forSaveOperation_originalContentsURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString typeName, final long saveOperation, final com.apple.jobjc.foundation.NSURL absoluteOriginalContentsURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst = get_writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteOriginalContentsURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		writeToURL_ofType_forSaveOperation_originalContentsURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeWithBackupToFile_ofType_saveOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeWithBackupToFile_ofType_saveOperation_IMetInst(){
		return ((writeWithBackupToFile_ofType_saveOperation_IMetInst != null)
	? (writeWithBackupToFile_ofType_saveOperation_IMetInst)
	: (writeWithBackupToFile_ofType_saveOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeWithBackupToFile:ofType:saveOperation:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean writeWithBackupToFile_ofType_saveOperation(final com.apple.jobjc.foundation.NSString fullDocumentPath, final com.apple.jobjc.foundation.NSString documentTypeName, final long saveOperationType){
			final com.apple.jobjc.Invoke.MsgSend writeWithBackupToFile_ofType_saveOperation_IMetInst = get_writeWithBackupToFile_ofType_saveOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeWithBackupToFile_ofType_saveOperation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullDocumentPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, documentTypeName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, saveOperationType);
		writeWithBackupToFile_ofType_saveOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
