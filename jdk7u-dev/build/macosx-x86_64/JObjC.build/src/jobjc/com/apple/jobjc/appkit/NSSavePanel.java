package com.apple.jobjc.appkit;

public  class NSSavePanel extends com.apple.jobjc.appkit.NSPanel {
	public NSSavePanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSavePanel(final NSSavePanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URL_IMetInst(){
		return ((URL_IMetInst != null)
	? (URL_IMetInst)
	: (URL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URL(){
			final com.apple.jobjc.Invoke.MsgSend URL_IMetInst = get_URL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URL_IMetInst.init(nativeBuffer, this);
		URL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryView_IMetInst(){
		return ((accessoryView_IMetInst != null)
	? (accessoryView_IMetInst)
	: (accessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSView accessoryView(){
			final com.apple.jobjc.Invoke.MsgSend accessoryView_IMetInst = get_accessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryView_IMetInst.init(nativeBuffer, this);
		accessoryView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSView returnValue = (com.apple.jobjc.appkit.NSView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowedFileTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedFileTypes_IMetInst(){
		return ((allowedFileTypes_IMetInst != null)
	? (allowedFileTypes_IMetInst)
	: (allowedFileTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allowedFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend allowedFileTypes_IMetInst = get_allowedFileTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedFileTypes_IMetInst.init(nativeBuffer, this);
		allowedFileTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsOtherFileTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsOtherFileTypes_IMetInst(){
		return ((allowsOtherFileTypes_IMetInst != null)
	? (allowsOtherFileTypes_IMetInst)
	: (allowsOtherFileTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsOtherFileTypes", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsOtherFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend allowsOtherFileTypes_IMetInst = get_allowsOtherFileTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsOtherFileTypes_IMetInst.init(nativeBuffer, this);
		allowsOtherFileTypes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst)
	: (beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheetForDirectory:file:modalForWindow:modalDelegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = get_beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginSheetForDirectory_file_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheetModalForWindow_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheetModalForWindow_completionHandler_IMetInst(){
		return ((beginSheetModalForWindow_completionHandler_IMetInst != null)
	? (beginSheetModalForWindow_completionHandler_IMetInst)
	: (beginSheetModalForWindow_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheetModalForWindow:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void beginSheetModalForWindow_completionHandler(final com.apple.jobjc.appkit.NSWindow window, final Object /* void(^)(NSInteger) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend beginSheetModalForWindow_completionHandler_IMetInst = get_beginSheetModalForWindow_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheetModalForWindow_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		beginSheetModalForWindow_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginWithCompletionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginWithCompletionHandler_IMetInst(){
		return ((beginWithCompletionHandler_IMetInst != null)
	? (beginWithCompletionHandler_IMetInst)
	: (beginWithCompletionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginWithCompletionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void beginWithCompletionHandler(final Object /* void(^)(NSInteger) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend beginWithCompletionHandler_IMetInst = get_beginWithCompletionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginWithCompletionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		beginWithCompletionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canCreateDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canCreateDirectories_IMetInst(){
		return ((canCreateDirectories_IMetInst != null)
	? (canCreateDirectories_IMetInst)
	: (canCreateDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canCreateDirectories", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canCreateDirectories(){
			final com.apple.jobjc.Invoke.MsgSend canCreateDirectories_IMetInst = get_canCreateDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canCreateDirectories_IMetInst.init(nativeBuffer, this);
		canCreateDirectories_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canSelectHiddenExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canSelectHiddenExtension_IMetInst(){
		return ((canSelectHiddenExtension_IMetInst != null)
	? (canSelectHiddenExtension_IMetInst)
	: (canSelectHiddenExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canSelectHiddenExtension", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canSelectHiddenExtension(){
			final com.apple.jobjc.Invoke.MsgSend canSelectHiddenExtension_IMetInst = get_canSelectHiddenExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canSelectHiddenExtension_IMetInst.init(nativeBuffer, this);
		canSelectHiddenExtension_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cancel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancel_IMetInst(){
		return ((cancel_IMetInst != null)
	? (cancel_IMetInst)
	: (cancel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend cancel_IMetInst = get_cancel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		cancel_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend directory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_directory_IMetInst(){
		return ((directory_IMetInst != null)
	? (directory_IMetInst)
	: (directory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "directory", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString directory(){
			final com.apple.jobjc.Invoke.MsgSend directory_IMetInst = get_directory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		directory_IMetInst.init(nativeBuffer, this);
		directory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend directoryURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_directoryURL_IMetInst(){
		return ((directoryURL_IMetInst != null)
	? (directoryURL_IMetInst)
	: (directoryURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "directoryURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL directoryURL(){
			final com.apple.jobjc.Invoke.MsgSend directoryURL_IMetInst = get_directoryURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		directoryURL_IMetInst.init(nativeBuffer, this);
		directoryURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filename_IMetInst(){
		return ((filename_IMetInst != null)
	? (filename_IMetInst)
	: (filename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString filename(){
			final com.apple.jobjc.Invoke.MsgSend filename_IMetInst = get_filename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filename_IMetInst.init(nativeBuffer, this);
		filename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExpanded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExpanded_IMetInst(){
		return ((isExpanded_IMetInst != null)
	? (isExpanded_IMetInst)
	: (isExpanded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExpanded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExpanded(){
			final com.apple.jobjc.Invoke.MsgSend isExpanded_IMetInst = get_isExpanded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExpanded_IMetInst.init(nativeBuffer, this);
		isExpanded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExtensionHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExtensionHidden_IMetInst(){
		return ((isExtensionHidden_IMetInst != null)
	? (isExtensionHidden_IMetInst)
	: (isExtensionHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExtensionHidden", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isExtensionHidden(){
			final com.apple.jobjc.Invoke.MsgSend isExtensionHidden_IMetInst = get_isExtensionHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExtensionHidden_IMetInst.init(nativeBuffer, this);
		isExtensionHidden_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend message_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_message_IMetInst(){
		return ((message_IMetInst != null)
	? (message_IMetInst)
	: (message_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "message", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString message(){
			final com.apple.jobjc.Invoke.MsgSend message_IMetInst = get_message_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		message_IMetInst.init(nativeBuffer, this);
		message_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nameFieldLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nameFieldLabel_IMetInst(){
		return ((nameFieldLabel_IMetInst != null)
	? (nameFieldLabel_IMetInst)
	: (nameFieldLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nameFieldLabel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString nameFieldLabel(){
			final com.apple.jobjc.Invoke.MsgSend nameFieldLabel_IMetInst = get_nameFieldLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nameFieldLabel_IMetInst.init(nativeBuffer, this);
		nameFieldLabel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nameFieldStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nameFieldStringValue_IMetInst(){
		return ((nameFieldStringValue_IMetInst != null)
	? (nameFieldStringValue_IMetInst)
	: (nameFieldStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nameFieldStringValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString nameFieldStringValue(){
			final com.apple.jobjc.Invoke.MsgSend nameFieldStringValue_IMetInst = get_nameFieldStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nameFieldStringValue_IMetInst.init(nativeBuffer, this);
		nameFieldStringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ok_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ok_IMetInst(){
		return ((ok_IMetInst != null)
	? (ok_IMetInst)
	: (ok_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ok:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void ok(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend ok_IMetInst = get_ok_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ok_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		ok_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend prompt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prompt_IMetInst(){
		return ((prompt_IMetInst != null)
	? (prompt_IMetInst)
	: (prompt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prompt", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString prompt(){
			final com.apple.jobjc.Invoke.MsgSend prompt_IMetInst = get_prompt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prompt_IMetInst.init(nativeBuffer, this);
		prompt_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend requiredFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requiredFileType_IMetInst(){
		return ((requiredFileType_IMetInst != null)
	? (requiredFileType_IMetInst)
	: (requiredFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requiredFileType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString requiredFileType(){
			final com.apple.jobjc.Invoke.MsgSend requiredFileType_IMetInst = get_requiredFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requiredFileType_IMetInst.init(nativeBuffer, this);
		requiredFileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModal_IMetInst(){
		return ((runModal_IMetInst != null)
	? (runModal_IMetInst)
	: (runModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModal", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long runModal(){
			final com.apple.jobjc.Invoke.MsgSend runModal_IMetInst = get_runModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModal_IMetInst.init(nativeBuffer, this);
		runModal_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalForDirectory_file_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalForDirectory_file_IMetInst(){
		return ((runModalForDirectory_file_IMetInst != null)
	? (runModalForDirectory_file_IMetInst)
	: (runModalForDirectory_file_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalForDirectory:file:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalForDirectory_file(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend runModalForDirectory_file_IMetInst = get_runModalForDirectory_file_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalForDirectory_file_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		runModalForDirectory_file_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowedFileTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedFileTypes_IMetInst(){
		return ((setAllowedFileTypes_IMetInst != null)
	? (setAllowedFileTypes_IMetInst)
	: (setAllowedFileTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedFileTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllowedFileTypes(final com.apple.jobjc.foundation.NSArray types){
			final com.apple.jobjc.Invoke.MsgSend setAllowedFileTypes_IMetInst = get_setAllowedFileTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedFileTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, types);
		setAllowedFileTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsOtherFileTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsOtherFileTypes_IMetInst(){
		return ((setAllowsOtherFileTypes_IMetInst != null)
	? (setAllowsOtherFileTypes_IMetInst)
	: (setAllowsOtherFileTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsOtherFileTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsOtherFileTypes(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsOtherFileTypes_IMetInst = get_setAllowsOtherFileTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsOtherFileTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsOtherFileTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanCreateDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanCreateDirectories_IMetInst(){
		return ((setCanCreateDirectories_IMetInst != null)
	? (setCanCreateDirectories_IMetInst)
	: (setCanCreateDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanCreateDirectories:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanCreateDirectories(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanCreateDirectories_IMetInst = get_setCanCreateDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanCreateDirectories_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanCreateDirectories_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanSelectHiddenExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanSelectHiddenExtension_IMetInst(){
		return ((setCanSelectHiddenExtension_IMetInst != null)
	? (setCanSelectHiddenExtension_IMetInst)
	: (setCanSelectHiddenExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanSelectHiddenExtension:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanSelectHiddenExtension(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanSelectHiddenExtension_IMetInst = get_setCanSelectHiddenExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanSelectHiddenExtension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanSelectHiddenExtension_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDirectory_IMetInst(){
		return ((setDirectory_IMetInst != null)
	? (setDirectory_IMetInst)
	: (setDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDirectory:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDirectory(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend setDirectory_IMetInst = get_setDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		setDirectory_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDirectoryURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDirectoryURL_IMetInst(){
		return ((setDirectoryURL_IMetInst != null)
	? (setDirectoryURL_IMetInst)
	: (setDirectoryURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDirectoryURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDirectoryURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend setDirectoryURL_IMetInst = get_setDirectoryURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDirectoryURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		setDirectoryURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setExtensionHidden_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setExtensionHidden_IMetInst(){
		return ((setExtensionHidden_IMetInst != null)
	? (setExtensionHidden_IMetInst)
	: (setExtensionHidden_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setExtensionHidden:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setExtensionHidden(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setExtensionHidden_IMetInst = get_setExtensionHidden_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setExtensionHidden_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setExtensionHidden_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMessage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMessage_IMetInst(){
		return ((setMessage_IMetInst != null)
	? (setMessage_IMetInst)
	: (setMessage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMessage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMessage(final com.apple.jobjc.foundation.NSString message){
			final com.apple.jobjc.Invoke.MsgSend setMessage_IMetInst = get_setMessage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMessage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, message);
		setMessage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNameFieldLabel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNameFieldLabel_IMetInst(){
		return ((setNameFieldLabel_IMetInst != null)
	? (setNameFieldLabel_IMetInst)
	: (setNameFieldLabel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNameFieldLabel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNameFieldLabel(final com.apple.jobjc.foundation.NSString label){
			final com.apple.jobjc.Invoke.MsgSend setNameFieldLabel_IMetInst = get_setNameFieldLabel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNameFieldLabel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, label);
		setNameFieldLabel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setNameFieldStringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNameFieldStringValue_IMetInst(){
		return ((setNameFieldStringValue_IMetInst != null)
	? (setNameFieldStringValue_IMetInst)
	: (setNameFieldStringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNameFieldStringValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNameFieldStringValue(final com.apple.jobjc.foundation.NSString value){
			final com.apple.jobjc.Invoke.MsgSend setNameFieldStringValue_IMetInst = get_setNameFieldStringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNameFieldStringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		setNameFieldStringValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPrompt_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrompt_IMetInst(){
		return ((setPrompt_IMetInst != null)
	? (setPrompt_IMetInst)
	: (setPrompt_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrompt:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPrompt(final com.apple.jobjc.foundation.NSString prompt){
			final com.apple.jobjc.Invoke.MsgSend setPrompt_IMetInst = get_setPrompt_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrompt_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, prompt);
		setPrompt_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRequiredFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRequiredFileType_IMetInst(){
		return ((setRequiredFileType_IMetInst != null)
	? (setRequiredFileType_IMetInst)
	: (setRequiredFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRequiredFileType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRequiredFileType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend setRequiredFileType_IMetInst = get_setRequiredFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRequiredFileType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		setRequiredFileType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsHiddenFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsHiddenFiles_IMetInst(){
		return ((setShowsHiddenFiles_IMetInst != null)
	? (setShowsHiddenFiles_IMetInst)
	: (setShowsHiddenFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsHiddenFiles:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsHiddenFiles(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsHiddenFiles_IMetInst = get_setShowsHiddenFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsHiddenFiles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsHiddenFiles_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTreatsFilePackagesAsDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTreatsFilePackagesAsDirectories_IMetInst(){
		return ((setTreatsFilePackagesAsDirectories_IMetInst != null)
	? (setTreatsFilePackagesAsDirectories_IMetInst)
	: (setTreatsFilePackagesAsDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTreatsFilePackagesAsDirectories:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTreatsFilePackagesAsDirectories(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTreatsFilePackagesAsDirectories_IMetInst = get_setTreatsFilePackagesAsDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTreatsFilePackagesAsDirectories_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTreatsFilePackagesAsDirectories_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsHiddenFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsHiddenFiles_IMetInst(){
		return ((showsHiddenFiles_IMetInst != null)
	? (showsHiddenFiles_IMetInst)
	: (showsHiddenFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsHiddenFiles", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsHiddenFiles(){
			final com.apple.jobjc.Invoke.MsgSend showsHiddenFiles_IMetInst = get_showsHiddenFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsHiddenFiles_IMetInst.init(nativeBuffer, this);
		showsHiddenFiles_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend treatsFilePackagesAsDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_treatsFilePackagesAsDirectories_IMetInst(){
		return ((treatsFilePackagesAsDirectories_IMetInst != null)
	? (treatsFilePackagesAsDirectories_IMetInst)
	: (treatsFilePackagesAsDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "treatsFilePackagesAsDirectories", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean treatsFilePackagesAsDirectories(){
			final com.apple.jobjc.Invoke.MsgSend treatsFilePackagesAsDirectories_IMetInst = get_treatsFilePackagesAsDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		treatsFilePackagesAsDirectories_IMetInst.init(nativeBuffer, this);
		treatsFilePackagesAsDirectories_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateVisibleColumns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateVisibleColumns_IMetInst(){
		return ((validateVisibleColumns_IMetInst != null)
	? (validateVisibleColumns_IMetInst)
	: (validateVisibleColumns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateVisibleColumns", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void validateVisibleColumns(){
			final com.apple.jobjc.Invoke.MsgSend validateVisibleColumns_IMetInst = get_validateVisibleColumns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateVisibleColumns_IMetInst.init(nativeBuffer, this);
		validateVisibleColumns_IMetInst.invoke(nativeBuffer);
		
		
	}

}
