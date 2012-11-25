package com.apple.jobjc.appkit;

public  class NSApplication extends com.apple.jobjc.appkit.NSResponder {
	public NSApplication(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSApplication(final NSApplication obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend abortModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_abortModal_IMetInst(){
		return ((abortModal_IMetInst != null)
	? (abortModal_IMetInst)
	: (abortModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "abortModal", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void abortModal(){
			final com.apple.jobjc.Invoke.MsgSend abortModal_IMetInst = get_abortModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		abortModal_IMetInst.init(nativeBuffer, this);
		abortModal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend activateContextHelpMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activateContextHelpMode_IMetInst(){
		return ((activateContextHelpMode_IMetInst != null)
	? (activateContextHelpMode_IMetInst)
	: (activateContextHelpMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activateContextHelpMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void activateContextHelpMode(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend activateContextHelpMode_IMetInst = get_activateContextHelpMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activateContextHelpMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		activateContextHelpMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend activateIgnoringOtherApps_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activateIgnoringOtherApps_IMetInst(){
		return ((activateIgnoringOtherApps_IMetInst != null)
	? (activateIgnoringOtherApps_IMetInst)
	: (activateIgnoringOtherApps_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activateIgnoringOtherApps:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void activateIgnoringOtherApps(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend activateIgnoringOtherApps_IMetInst = get_activateIgnoringOtherApps_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activateIgnoringOtherApps_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		activateIgnoringOtherApps_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend activationPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activationPolicy_IMetInst(){
		return ((activationPolicy_IMetInst != null)
	? (activationPolicy_IMetInst)
	: (activationPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activationPolicy", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long activationPolicy(){
			final com.apple.jobjc.Invoke.MsgSend activationPolicy_IMetInst = get_activationPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activationPolicy_IMetInst.init(nativeBuffer, this);
		activationPolicy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addWindowsItem_title_filename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addWindowsItem_title_filename_IMetInst(){
		return ((addWindowsItem_title_filename_IMetInst != null)
	? (addWindowsItem_title_filename_IMetInst)
	: (addWindowsItem_title_filename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addWindowsItem:title:filename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void addWindowsItem_title_filename(final com.apple.jobjc.appkit.NSWindow win, final com.apple.jobjc.foundation.NSString aString, final boolean isFilename){
			final com.apple.jobjc.Invoke.MsgSend addWindowsItem_title_filename_IMetInst = get_addWindowsItem_title_filename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addWindowsItem_title_filename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, win);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isFilename);
		addWindowsItem_title_filename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend application_printFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_application_printFiles_IMetInst(){
		return ((application_printFiles_IMetInst != null)
	? (application_printFiles_IMetInst)
	: (application_printFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "application:printFiles:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void application_printFiles(final com.apple.jobjc.appkit.NSApplication sender, final com.apple.jobjc.foundation.NSArray filenames){
			final com.apple.jobjc.Invoke.MsgSend application_printFiles_IMetInst = get_application_printFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		application_printFiles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filenames);
		application_printFiles_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend applicationIconImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_applicationIconImage_IMetInst(){
		return ((applicationIconImage_IMetInst != null)
	? (applicationIconImage_IMetInst)
	: (applicationIconImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "applicationIconImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage applicationIconImage(){
			final com.apple.jobjc.Invoke.MsgSend applicationIconImage_IMetInst = get_applicationIconImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		applicationIconImage_IMetInst.init(nativeBuffer, this);
		applicationIconImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrangeInFront_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrangeInFront_IMetInst(){
		return ((arrangeInFront_IMetInst != null)
	? (arrangeInFront_IMetInst)
	: (arrangeInFront_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrangeInFront:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void arrangeInFront(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend arrangeInFront_IMetInst = get_arrangeInFront_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrangeInFront_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		arrangeInFront_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginModalSessionForWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginModalSessionForWindow_IMetInst(){
		return ((beginModalSessionForWindow_IMetInst != null)
	? (beginModalSessionForWindow_IMetInst)
	: (beginModalSessionForWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginModalSessionForWindow:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSModalSessionOpaque beginModalSessionForWindow(final com.apple.jobjc.appkit.NSWindow theWindow){
			final com.apple.jobjc.Invoke.MsgSend beginModalSessionForWindow_IMetInst = get_beginModalSessionForWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginModalSessionForWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theWindow);
		beginModalSessionForWindow_IMetInst.invoke(nativeBuffer);
				final com.apple.jobjc.appkit.NSModalSessionOpaque returnValue = (com.apple.jobjc.appkit.NSModalSessionOpaque) new com.apple.jobjc.appkit.NSModalSessionOpaque(com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginModalSessionForWindow_relativeToWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginModalSessionForWindow_relativeToWindow_IMetInst(){
		return ((beginModalSessionForWindow_relativeToWindow_IMetInst != null)
	? (beginModalSessionForWindow_relativeToWindow_IMetInst)
	: (beginModalSessionForWindow_relativeToWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginModalSessionForWindow:relativeToWindow:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSModalSessionOpaque beginModalSessionForWindow_relativeToWindow(final com.apple.jobjc.appkit.NSWindow theWindow, final com.apple.jobjc.appkit.NSWindow docWindow){
			final com.apple.jobjc.Invoke.MsgSend beginModalSessionForWindow_relativeToWindow_IMetInst = get_beginModalSessionForWindow_relativeToWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginModalSessionForWindow_relativeToWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		beginModalSessionForWindow_relativeToWindow_IMetInst.invoke(nativeBuffer);
				final com.apple.jobjc.appkit.NSModalSessionOpaque returnValue = (com.apple.jobjc.appkit.NSModalSessionOpaque) new com.apple.jobjc.appkit.NSModalSessionOpaque(com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst)
	: (beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheet:modalForWindow:modalDelegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo(final com.apple.jobjc.appkit.NSWindow sheet, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID modalDelegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = get_beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sheet);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modalDelegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginSheet_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelUserAttentionRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelUserAttentionRequest_IMetInst(){
		return ((cancelUserAttentionRequest_IMetInst != null)
	? (cancelUserAttentionRequest_IMetInst)
	: (cancelUserAttentionRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelUserAttentionRequest:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void cancelUserAttentionRequest(final long request){
			final com.apple.jobjc.Invoke.MsgSend cancelUserAttentionRequest_IMetInst = get_cancelUserAttentionRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelUserAttentionRequest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, request);
		cancelUserAttentionRequest_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend changeWindowsItem_title_filename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeWindowsItem_title_filename_IMetInst(){
		return ((changeWindowsItem_title_filename_IMetInst != null)
	? (changeWindowsItem_title_filename_IMetInst)
	: (changeWindowsItem_title_filename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeWindowsItem:title:filename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void changeWindowsItem_title_filename(final com.apple.jobjc.appkit.NSWindow win, final com.apple.jobjc.foundation.NSString aString, final boolean isFilename){
			final com.apple.jobjc.Invoke.MsgSend changeWindowsItem_title_filename_IMetInst = get_changeWindowsItem_title_filename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeWindowsItem_title_filename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, win);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isFilename);
		changeWindowsItem_title_filename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend completeStateRestoration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_completeStateRestoration_IMetInst(){
		return ((completeStateRestoration_IMetInst != null)
	? (completeStateRestoration_IMetInst)
	: (completeStateRestoration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "completeStateRestoration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void completeStateRestoration(){
			final com.apple.jobjc.Invoke.MsgSend completeStateRestoration_IMetInst = get_completeStateRestoration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		completeStateRestoration_IMetInst.init(nativeBuffer, this);
		completeStateRestoration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_context_IMetInst(){
		return ((context_IMetInst != null)
	? (context_IMetInst)
	: (context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "context", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext context(){
			final com.apple.jobjc.Invoke.MsgSend context_IMetInst = get_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		context_IMetInst.init(nativeBuffer, this);
		context_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentEvent_IMetInst(){
		return ((currentEvent_IMetInst != null)
	? (currentEvent_IMetInst)
	: (currentEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentEvent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent currentEvent(){
			final com.apple.jobjc.Invoke.MsgSend currentEvent_IMetInst = get_currentEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentEvent_IMetInst.init(nativeBuffer, this);
		currentEvent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentSystemPresentationOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentSystemPresentationOptions_IMetInst(){
		return ((currentSystemPresentationOptions_IMetInst != null)
	? (currentSystemPresentationOptions_IMetInst)
	: (currentSystemPresentationOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentSystemPresentationOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long currentSystemPresentationOptions(){
			final com.apple.jobjc.Invoke.MsgSend currentSystemPresentationOptions_IMetInst = get_currentSystemPresentationOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentSystemPresentationOptions_IMetInst.init(nativeBuffer, this);
		currentSystemPresentationOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deactivate_IMetInst(){
		return ((deactivate_IMetInst != null)
	? (deactivate_IMetInst)
	: (deactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deactivate", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void deactivate(){
			final com.apple.jobjc.Invoke.MsgSend deactivate_IMetInst = get_deactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deactivate_IMetInst.init(nativeBuffer, this);
		deactivate_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend disableRelaunchOnLogin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableRelaunchOnLogin_IMetInst(){
		return ((disableRelaunchOnLogin_IMetInst != null)
	? (disableRelaunchOnLogin_IMetInst)
	: (disableRelaunchOnLogin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableRelaunchOnLogin", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableRelaunchOnLogin(){
			final com.apple.jobjc.Invoke.MsgSend disableRelaunchOnLogin_IMetInst = get_disableRelaunchOnLogin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableRelaunchOnLogin_IMetInst.init(nativeBuffer, this);
		disableRelaunchOnLogin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend discardEventsMatchingMask_beforeEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_discardEventsMatchingMask_beforeEvent_IMetInst(){
		return ((discardEventsMatchingMask_beforeEvent_IMetInst != null)
	? (discardEventsMatchingMask_beforeEvent_IMetInst)
	: (discardEventsMatchingMask_beforeEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "discardEventsMatchingMask:beforeEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void discardEventsMatchingMask_beforeEvent(final long mask, final com.apple.jobjc.appkit.NSEvent lastEvent){
			final com.apple.jobjc.Invoke.MsgSend discardEventsMatchingMask_beforeEvent_IMetInst = get_discardEventsMatchingMask_beforeEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		discardEventsMatchingMask_beforeEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lastEvent);
		discardEventsMatchingMask_beforeEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend dockTile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dockTile_IMetInst(){
		return ((dockTile_IMetInst != null)
	? (dockTile_IMetInst)
	: (dockTile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dockTile", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSDockTile dockTile(){
			final com.apple.jobjc.Invoke.MsgSend dockTile_IMetInst = get_dockTile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dockTile_IMetInst.init(nativeBuffer, this);
		dockTile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSDockTile returnValue = (com.apple.jobjc.appkit.NSDockTile) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enableRelaunchOnLogin_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableRelaunchOnLogin_IMetInst(){
		return ((enableRelaunchOnLogin_IMetInst != null)
	? (enableRelaunchOnLogin_IMetInst)
	: (enableRelaunchOnLogin_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableRelaunchOnLogin", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableRelaunchOnLogin(){
			final com.apple.jobjc.Invoke.MsgSend enableRelaunchOnLogin_IMetInst = get_enableRelaunchOnLogin_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableRelaunchOnLogin_IMetInst.init(nativeBuffer, this);
		enableRelaunchOnLogin_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enabledRemoteNotificationTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enabledRemoteNotificationTypes_IMetInst(){
		return ((enabledRemoteNotificationTypes_IMetInst != null)
	? (enabledRemoteNotificationTypes_IMetInst)
	: (enabledRemoteNotificationTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enabledRemoteNotificationTypes", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long enabledRemoteNotificationTypes(){
			final com.apple.jobjc.Invoke.MsgSend enabledRemoteNotificationTypes_IMetInst = get_enabledRemoteNotificationTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enabledRemoteNotificationTypes_IMetInst.init(nativeBuffer, this);
		enabledRemoteNotificationTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend endModalSession_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endModalSession_IMetInst(){
		return ((endModalSession_IMetInst != null)
	? (endModalSession_IMetInst)
	: (endModalSession_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endModalSession:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void endModalSession(final com.apple.jobjc.appkit.NSModalSessionOpaque session){
			final com.apple.jobjc.Invoke.MsgSend endModalSession_IMetInst = get_endModalSession_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endModalSession_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, session);
		endModalSession_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endSheet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endSheet_IMetInst(){
		return ((endSheet_IMetInst != null)
	? (endSheet_IMetInst)
	: (endSheet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endSheet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void endSheet(final com.apple.jobjc.appkit.NSWindow sheet){
			final com.apple.jobjc.Invoke.MsgSend endSheet_IMetInst = get_endSheet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endSheet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sheet);
		endSheet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endSheet_returnCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endSheet_returnCode_IMetInst(){
		return ((endSheet_returnCode_IMetInst != null)
	? (endSheet_returnCode_IMetInst)
	: (endSheet_returnCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endSheet:returnCode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void endSheet_returnCode(final com.apple.jobjc.appkit.NSWindow sheet, final long returnCode){
			final com.apple.jobjc.Invoke.MsgSend endSheet_returnCode_IMetInst = get_endSheet_returnCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endSheet_returnCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sheet);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, returnCode);
		endSheet_returnCode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend extendStateRestoration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_extendStateRestoration_IMetInst(){
		return ((extendStateRestoration_IMetInst != null)
	? (extendStateRestoration_IMetInst)
	: (extendStateRestoration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "extendStateRestoration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void extendStateRestoration(){
			final com.apple.jobjc.Invoke.MsgSend extendStateRestoration_IMetInst = get_extendStateRestoration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		extendStateRestoration_IMetInst.init(nativeBuffer, this);
		extendStateRestoration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend finishLaunching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finishLaunching_IMetInst(){
		return ((finishLaunching_IMetInst != null)
	? (finishLaunching_IMetInst)
	: (finishLaunching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finishLaunching", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finishLaunching(){
			final com.apple.jobjc.Invoke.MsgSend finishLaunching_IMetInst = get_finishLaunching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finishLaunching_IMetInst.init(nativeBuffer, this);
		finishLaunching_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend helpMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_helpMenu_IMetInst(){
		return ((helpMenu_IMetInst != null)
	? (helpMenu_IMetInst)
	: (helpMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "helpMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu helpMenu(){
			final com.apple.jobjc.Invoke.MsgSend helpMenu_IMetInst = get_helpMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		helpMenu_IMetInst.init(nativeBuffer, this);
		helpMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hide_IMetInst(){
		return ((hide_IMetInst != null)
	? (hide_IMetInst)
	: (hide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void hide(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend hide_IMetInst = get_hide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		hide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend hideOtherApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hideOtherApplications_IMetInst(){
		return ((hideOtherApplications_IMetInst != null)
	? (hideOtherApplications_IMetInst)
	: (hideOtherApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hideOtherApplications:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void hideOtherApplications(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend hideOtherApplications_IMetInst = get_hideOtherApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hideOtherApplications_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		hideOtherApplications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isActive_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isActive_IMetInst(){
		return ((isActive_IMetInst != null)
	? (isActive_IMetInst)
	: (isActive_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isActive", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isActive(){
			final com.apple.jobjc.Invoke.MsgSend isActive_IMetInst = get_isActive_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isActive_IMetInst.init(nativeBuffer, this);
		isActive_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFullKeyboardAccessEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFullKeyboardAccessEnabled_IMetInst(){
		return ((isFullKeyboardAccessEnabled_IMetInst != null)
	? (isFullKeyboardAccessEnabled_IMetInst)
	: (isFullKeyboardAccessEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFullKeyboardAccessEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFullKeyboardAccessEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isFullKeyboardAccessEnabled_IMetInst = get_isFullKeyboardAccessEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFullKeyboardAccessEnabled_IMetInst.init(nativeBuffer, this);
		isFullKeyboardAccessEnabled_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend isRunning_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRunning_IMetInst(){
		return ((isRunning_IMetInst != null)
	? (isRunning_IMetInst)
	: (isRunning_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRunning", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRunning(){
			final com.apple.jobjc.Invoke.MsgSend isRunning_IMetInst = get_isRunning_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRunning_IMetInst.init(nativeBuffer, this);
		isRunning_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyWindow_IMetInst(){
		return ((keyWindow_IMetInst != null)
	? (keyWindow_IMetInst)
	: (keyWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow keyWindow(){
			final com.apple.jobjc.Invoke.MsgSend keyWindow_IMetInst = get_keyWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyWindow_IMetInst.init(nativeBuffer, this);
		keyWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainMenu_IMetInst(){
		return ((mainMenu_IMetInst != null)
	? (mainMenu_IMetInst)
	: (mainMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu mainMenu(){
			final com.apple.jobjc.Invoke.MsgSend mainMenu_IMetInst = get_mainMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainMenu_IMetInst.init(nativeBuffer, this);
		mainMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainWindow_IMetInst(){
		return ((mainWindow_IMetInst != null)
	? (mainWindow_IMetInst)
	: (mainWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow mainWindow(){
			final com.apple.jobjc.Invoke.MsgSend mainWindow_IMetInst = get_mainWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainWindow_IMetInst.init(nativeBuffer, this);
		mainWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeWindowsPerform_inOrder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeWindowsPerform_inOrder_IMetInst(){
		return ((makeWindowsPerform_inOrder_IMetInst != null)
	? (makeWindowsPerform_inOrder_IMetInst)
	: (makeWindowsPerform_inOrder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeWindowsPerform:inOrder:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow makeWindowsPerform_inOrder(final com.apple.jobjc.SEL aSelector, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend makeWindowsPerform_inOrder_IMetInst = get_makeWindowsPerform_inOrder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeWindowsPerform_inOrder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		makeWindowsPerform_inOrder_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend miniaturizeAll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_miniaturizeAll_IMetInst(){
		return ((miniaturizeAll_IMetInst != null)
	? (miniaturizeAll_IMetInst)
	: (miniaturizeAll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "miniaturizeAll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void miniaturizeAll(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend miniaturizeAll_IMetInst = get_miniaturizeAll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		miniaturizeAll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		miniaturizeAll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend modalWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modalWindow_IMetInst(){
		return ((modalWindow_IMetInst != null)
	? (modalWindow_IMetInst)
	: (modalWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modalWindow", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSWindow modalWindow(){
			final com.apple.jobjc.Invoke.MsgSend modalWindow_IMetInst = get_modalWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modalWindow_IMetInst.init(nativeBuffer, this);
		modalWindow_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst(){
		return ((nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst != null)
	? (nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst)
	: (nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "nextEventMatchingMask:untilDate:inMode:dequeue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSEvent nextEventMatchingMask_untilDate_inMode_dequeue(final long mask, final com.apple.jobjc.foundation.NSDate expiration, final com.apple.jobjc.foundation.NSString mode, final boolean deqFlag){
			final com.apple.jobjc.Invoke.MsgSend nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst = get_nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expiration);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, mode);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, deqFlag);
		nextEventMatchingMask_untilDate_inMode_dequeue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSEvent returnValue = (com.apple.jobjc.appkit.NSEvent) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontCharacterPalette_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontCharacterPalette_IMetInst(){
		return ((orderFrontCharacterPalette_IMetInst != null)
	? (orderFrontCharacterPalette_IMetInst)
	: (orderFrontCharacterPalette_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontCharacterPalette:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontCharacterPalette(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontCharacterPalette_IMetInst = get_orderFrontCharacterPalette_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontCharacterPalette_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontCharacterPalette_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontColorPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontColorPanel_IMetInst(){
		return ((orderFrontColorPanel_IMetInst != null)
	? (orderFrontColorPanel_IMetInst)
	: (orderFrontColorPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontColorPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontColorPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontColorPanel_IMetInst = get_orderFrontColorPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontColorPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontColorPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontStandardAboutPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontStandardAboutPanel_IMetInst(){
		return ((orderFrontStandardAboutPanel_IMetInst != null)
	? (orderFrontStandardAboutPanel_IMetInst)
	: (orderFrontStandardAboutPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontStandardAboutPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontStandardAboutPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontStandardAboutPanel_IMetInst = get_orderFrontStandardAboutPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontStandardAboutPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontStandardAboutPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontStandardAboutPanelWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontStandardAboutPanelWithOptions_IMetInst(){
		return ((orderFrontStandardAboutPanelWithOptions_IMetInst != null)
	? (orderFrontStandardAboutPanelWithOptions_IMetInst)
	: (orderFrontStandardAboutPanelWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontStandardAboutPanelWithOptions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontStandardAboutPanelWithOptions(final com.apple.jobjc.foundation.NSDictionary optionsDictionary){
			final com.apple.jobjc.Invoke.MsgSend orderFrontStandardAboutPanelWithOptions_IMetInst = get_orderFrontStandardAboutPanelWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontStandardAboutPanelWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, optionsDictionary);
		orderFrontStandardAboutPanelWithOptions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedDocuments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedDocuments_IMetInst(){
		return ((orderedDocuments_IMetInst != null)
	? (orderedDocuments_IMetInst)
	: (orderedDocuments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedDocuments", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray orderedDocuments(){
			final com.apple.jobjc.Invoke.MsgSend orderedDocuments_IMetInst = get_orderedDocuments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedDocuments_IMetInst.init(nativeBuffer, this);
		orderedDocuments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orderedWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderedWindows_IMetInst(){
		return ((orderedWindows_IMetInst != null)
	? (orderedWindows_IMetInst)
	: (orderedWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderedWindows", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray orderedWindows(){
			final com.apple.jobjc.Invoke.MsgSend orderedWindows_IMetInst = get_orderedWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderedWindows_IMetInst.init(nativeBuffer, this);
		orderedWindows_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend postEvent_atStart_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_postEvent_atStart_IMetInst(){
		return ((postEvent_atStart_IMetInst != null)
	? (postEvent_atStart_IMetInst)
	: (postEvent_atStart_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "postEvent:atStart:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void postEvent_atStart(final com.apple.jobjc.appkit.NSEvent event, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend postEvent_atStart_IMetInst = get_postEvent_atStart_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		postEvent_atStart_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, event);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		postEvent_atStart_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend presentationOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_presentationOptions_IMetInst(){
		return ((presentationOptions_IMetInst != null)
	? (presentationOptions_IMetInst)
	: (presentationOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "presentationOptions", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long presentationOptions(){
			final com.apple.jobjc.Invoke.MsgSend presentationOptions_IMetInst = get_presentationOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		presentationOptions_IMetInst.init(nativeBuffer, this);
		presentationOptions_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preventWindowOrdering_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preventWindowOrdering_IMetInst(){
		return ((preventWindowOrdering_IMetInst != null)
	? (preventWindowOrdering_IMetInst)
	: (preventWindowOrdering_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preventWindowOrdering", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void preventWindowOrdering(){
			final com.apple.jobjc.Invoke.MsgSend preventWindowOrdering_IMetInst = get_preventWindowOrdering_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preventWindowOrdering_IMetInst.init(nativeBuffer, this);
		preventWindowOrdering_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerForRemoteNotificationTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerForRemoteNotificationTypes_IMetInst(){
		return ((registerForRemoteNotificationTypes_IMetInst != null)
	? (registerForRemoteNotificationTypes_IMetInst)
	: (registerForRemoteNotificationTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerForRemoteNotificationTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void registerForRemoteNotificationTypes(final long types){
			final com.apple.jobjc.Invoke.MsgSend registerForRemoteNotificationTypes_IMetInst = get_registerForRemoteNotificationTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerForRemoteNotificationTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, types);
		registerForRemoteNotificationTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerServicesMenuSendTypes_returnTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerServicesMenuSendTypes_returnTypes_IMetInst(){
		return ((registerServicesMenuSendTypes_returnTypes_IMetInst != null)
	? (registerServicesMenuSendTypes_returnTypes_IMetInst)
	: (registerServicesMenuSendTypes_returnTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerServicesMenuSendTypes:returnTypes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerServicesMenuSendTypes_returnTypes(final com.apple.jobjc.foundation.NSArray sendTypes, final com.apple.jobjc.foundation.NSArray returnTypes){
			final com.apple.jobjc.Invoke.MsgSend registerServicesMenuSendTypes_returnTypes_IMetInst = get_registerServicesMenuSendTypes_returnTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerServicesMenuSendTypes_returnTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, returnTypes);
		registerServicesMenuSendTypes_returnTypes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerUserInterfaceItemSearchHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerUserInterfaceItemSearchHandler_IMetInst(){
		return ((registerUserInterfaceItemSearchHandler_IMetInst != null)
	? (registerUserInterfaceItemSearchHandler_IMetInst)
	: (registerUserInterfaceItemSearchHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerUserInterfaceItemSearchHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerUserInterfaceItemSearchHandler(final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend registerUserInterfaceItemSearchHandler_IMetInst = get_registerUserInterfaceItemSearchHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerUserInterfaceItemSearchHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		registerUserInterfaceItemSearchHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeWindowsItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeWindowsItem_IMetInst(){
		return ((removeWindowsItem_IMetInst != null)
	? (removeWindowsItem_IMetInst)
	: (removeWindowsItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeWindowsItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeWindowsItem(final com.apple.jobjc.appkit.NSWindow win){
			final com.apple.jobjc.Invoke.MsgSend removeWindowsItem_IMetInst = get_removeWindowsItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeWindowsItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, win);
		removeWindowsItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replyToApplicationShouldTerminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replyToApplicationShouldTerminate_IMetInst(){
		return ((replyToApplicationShouldTerminate_IMetInst != null)
	? (replyToApplicationShouldTerminate_IMetInst)
	: (replyToApplicationShouldTerminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replyToApplicationShouldTerminate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void replyToApplicationShouldTerminate(final boolean shouldTerminate){
			final com.apple.jobjc.Invoke.MsgSend replyToApplicationShouldTerminate_IMetInst = get_replyToApplicationShouldTerminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replyToApplicationShouldTerminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldTerminate);
		replyToApplicationShouldTerminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replyToOpenOrPrint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replyToOpenOrPrint_IMetInst(){
		return ((replyToOpenOrPrint_IMetInst != null)
	? (replyToOpenOrPrint_IMetInst)
	: (replyToOpenOrPrint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replyToOpenOrPrint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void replyToOpenOrPrint(final long reply){
			final com.apple.jobjc.Invoke.MsgSend replyToOpenOrPrint_IMetInst = get_replyToOpenOrPrint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replyToOpenOrPrint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, reply);
		replyToOpenOrPrint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend reportException_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reportException_IMetInst(){
		return ((reportException_IMetInst != null)
	? (reportException_IMetInst)
	: (reportException_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reportException:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void reportException(final com.apple.jobjc.foundation.NSException theException){
			final com.apple.jobjc.Invoke.MsgSend reportException_IMetInst = get_reportException_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reportException_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theException);
		reportException_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend requestUserAttention_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_requestUserAttention_IMetInst(){
		return ((requestUserAttention_IMetInst != null)
	? (requestUserAttention_IMetInst)
	: (requestUserAttention_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "requestUserAttention:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long requestUserAttention(final long requestType){
			final com.apple.jobjc.Invoke.MsgSend requestUserAttention_IMetInst = get_requestUserAttention_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		requestUserAttention_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, requestType);
		requestUserAttention_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend restoreWindowWithIdentifier_state_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_restoreWindowWithIdentifier_state_completionHandler_IMetInst(){
		return ((restoreWindowWithIdentifier_state_completionHandler_IMetInst != null)
	? (restoreWindowWithIdentifier_state_completionHandler_IMetInst)
	: (restoreWindowWithIdentifier_state_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "restoreWindowWithIdentifier:state:completionHandler:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean restoreWindowWithIdentifier_state_completionHandler(final com.apple.jobjc.foundation.NSString identifier, final com.apple.jobjc.foundation.NSCoder state, final Object /* void(^)(NSWindow*,NSError*) (@, @) */ completionHandler){
			final com.apple.jobjc.Invoke.MsgSend restoreWindowWithIdentifier_state_completionHandler_IMetInst = get_restoreWindowWithIdentifier_state_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		restoreWindowWithIdentifier_state_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, state);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, completionHandler);
		restoreWindowWithIdentifier_state_completionHandler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend run_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_run_IMetInst(){
		return ((run_IMetInst != null)
	? (run_IMetInst)
	: (run_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "run", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void run(){
			final com.apple.jobjc.Invoke.MsgSend run_IMetInst = get_run_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		run_IMetInst.init(nativeBuffer, this);
		run_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalForWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalForWindow_IMetInst(){
		return ((runModalForWindow_IMetInst != null)
	? (runModalForWindow_IMetInst)
	: (runModalForWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalForWindow:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalForWindow(final com.apple.jobjc.appkit.NSWindow theWindow){
			final com.apple.jobjc.Invoke.MsgSend runModalForWindow_IMetInst = get_runModalForWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalForWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theWindow);
		runModalForWindow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalForWindow_relativeToWindow_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalForWindow_relativeToWindow_IMetInst(){
		return ((runModalForWindow_relativeToWindow_IMetInst != null)
	? (runModalForWindow_relativeToWindow_IMetInst)
	: (runModalForWindow_relativeToWindow_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalForWindow:relativeToWindow:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalForWindow_relativeToWindow(final com.apple.jobjc.appkit.NSWindow theWindow, final com.apple.jobjc.appkit.NSWindow docWindow){
			final com.apple.jobjc.Invoke.MsgSend runModalForWindow_relativeToWindow_IMetInst = get_runModalForWindow_relativeToWindow_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalForWindow_relativeToWindow_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		runModalForWindow_relativeToWindow_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalSession_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalSession_IMetInst(){
		return ((runModalSession_IMetInst != null)
	? (runModalSession_IMetInst)
	: (runModalSession_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalSession:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public long runModalSession(final com.apple.jobjc.appkit.NSModalSessionOpaque session){
			final com.apple.jobjc.Invoke.MsgSend runModalSession_IMetInst = get_runModalSession_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalSession_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, session);
		runModalSession_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst(){
		return ((searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst != null)
	? (searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst)
	: (searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "searchString:inUserInterfaceItemString:searchRange:foundRange:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean searchString_inUserInterfaceItemString_searchRange_foundRange(final com.apple.jobjc.foundation.NSString searchString, final com.apple.jobjc.foundation.NSString stringToSearch, final com.apple.jobjc.foundation.NSRange searchRange, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSRange> foundRange){
			final com.apple.jobjc.Invoke.MsgSend searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst = get_searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, searchString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringToSearch);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, foundRange);
		searchString_inUserInterfaceItemString_searchRange_foundRange_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendAction_to_from_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAction_to_from_IMetInst(){
		return ((sendAction_to_from_IMetInst != null)
	? (sendAction_to_from_IMetInst)
	: (sendAction_to_from_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAction:to:from:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean sendAction_to_from(final com.apple.jobjc.SEL theAction, final com.apple.jobjc.ID theTarget, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend sendAction_to_from_IMetInst = get_sendAction_to_from_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAction_to_from_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, theAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theTarget);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		sendAction_to_from_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendEvent_IMetInst(){
		return ((sendEvent_IMetInst != null)
	? (sendEvent_IMetInst)
	: (sendEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void sendEvent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend sendEvent_IMetInst = get_sendEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		sendEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend servicesMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_servicesMenu_IMetInst(){
		return ((servicesMenu_IMetInst != null)
	? (servicesMenu_IMetInst)
	: (servicesMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "servicesMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu servicesMenu(){
			final com.apple.jobjc.Invoke.MsgSend servicesMenu_IMetInst = get_servicesMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		servicesMenu_IMetInst.init(nativeBuffer, this);
		servicesMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend servicesProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_servicesProvider_IMetInst(){
		return ((servicesProvider_IMetInst != null)
	? (servicesProvider_IMetInst)
	: (servicesProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "servicesProvider", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T servicesProvider(){
			final com.apple.jobjc.Invoke.MsgSend servicesProvider_IMetInst = get_servicesProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		servicesProvider_IMetInst.init(nativeBuffer, this);
		servicesProvider_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setActivationPolicy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setActivationPolicy_IMetInst(){
		return ((setActivationPolicy_IMetInst != null)
	? (setActivationPolicy_IMetInst)
	: (setActivationPolicy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setActivationPolicy:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean setActivationPolicy(final long activationPolicy){
			final com.apple.jobjc.Invoke.MsgSend setActivationPolicy_IMetInst = get_setActivationPolicy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setActivationPolicy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, activationPolicy);
		setActivationPolicy_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setApplicationIconImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setApplicationIconImage_IMetInst(){
		return ((setApplicationIconImage_IMetInst != null)
	? (setApplicationIconImage_IMetInst)
	: (setApplicationIconImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setApplicationIconImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setApplicationIconImage(final com.apple.jobjc.appkit.NSImage image){
			final com.apple.jobjc.Invoke.MsgSend setApplicationIconImage_IMetInst = get_setApplicationIconImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setApplicationIconImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		setApplicationIconImage_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHelpMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHelpMenu_IMetInst(){
		return ((setHelpMenu_IMetInst != null)
	? (setHelpMenu_IMetInst)
	: (setHelpMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHelpMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHelpMenu(final com.apple.jobjc.appkit.NSMenu helpMenu){
			final com.apple.jobjc.Invoke.MsgSend setHelpMenu_IMetInst = get_setHelpMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHelpMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, helpMenu);
		setHelpMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMainMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMainMenu_IMetInst(){
		return ((setMainMenu_IMetInst != null)
	? (setMainMenu_IMetInst)
	: (setMainMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMainMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMainMenu(final com.apple.jobjc.appkit.NSMenu aMenu){
			final com.apple.jobjc.Invoke.MsgSend setMainMenu_IMetInst = get_setMainMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMainMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aMenu);
		setMainMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPresentationOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPresentationOptions_IMetInst(){
		return ((setPresentationOptions_IMetInst != null)
	? (setPresentationOptions_IMetInst)
	: (setPresentationOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPresentationOptions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setPresentationOptions(final long newOptions){
			final com.apple.jobjc.Invoke.MsgSend setPresentationOptions_IMetInst = get_setPresentationOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPresentationOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newOptions);
		setPresentationOptions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setServicesMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setServicesMenu_IMetInst(){
		return ((setServicesMenu_IMetInst != null)
	? (setServicesMenu_IMetInst)
	: (setServicesMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setServicesMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setServicesMenu(final com.apple.jobjc.appkit.NSMenu aMenu){
			final com.apple.jobjc.Invoke.MsgSend setServicesMenu_IMetInst = get_setServicesMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setServicesMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aMenu);
		setServicesMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setServicesProvider_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setServicesProvider_IMetInst(){
		return ((setServicesProvider_IMetInst != null)
	? (setServicesProvider_IMetInst)
	: (setServicesProvider_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setServicesProvider:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setServicesProvider(final com.apple.jobjc.ID provider){
			final com.apple.jobjc.Invoke.MsgSend setServicesProvider_IMetInst = get_setServicesProvider_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setServicesProvider_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, provider);
		setServicesProvider_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindowsMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindowsMenu_IMetInst(){
		return ((setWindowsMenu_IMetInst != null)
	? (setWindowsMenu_IMetInst)
	: (setWindowsMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindowsMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setWindowsMenu(final com.apple.jobjc.appkit.NSMenu aMenu){
			final com.apple.jobjc.Invoke.MsgSend setWindowsMenu_IMetInst = get_setWindowsMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindowsMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aMenu);
		setWindowsMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWindowsNeedUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWindowsNeedUpdate_IMetInst(){
		return ((setWindowsNeedUpdate_IMetInst != null)
	? (setWindowsNeedUpdate_IMetInst)
	: (setWindowsNeedUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWindowsNeedUpdate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWindowsNeedUpdate(final boolean needUpdate){
			final com.apple.jobjc.Invoke.MsgSend setWindowsNeedUpdate_IMetInst = get_setWindowsNeedUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWindowsNeedUpdate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, needUpdate);
		setWindowsNeedUpdate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showHelp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showHelp_IMetInst(){
		return ((showHelp_IMetInst != null)
	? (showHelp_IMetInst)
	: (showHelp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showHelp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showHelp(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend showHelp_IMetInst = get_showHelp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showHelp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		showHelp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stop_IMetInst(){
		return ((stop_IMetInst != null)
	? (stop_IMetInst)
	: (stop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void stop(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend stop_IMetInst = get_stop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		stop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopModal_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopModal_IMetInst(){
		return ((stopModal_IMetInst != null)
	? (stopModal_IMetInst)
	: (stopModal_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopModal", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopModal(){
			final com.apple.jobjc.Invoke.MsgSend stopModal_IMetInst = get_stopModal_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopModal_IMetInst.init(nativeBuffer, this);
		stopModal_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stopModalWithCode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopModalWithCode_IMetInst(){
		return ((stopModalWithCode_IMetInst != null)
	? (stopModalWithCode_IMetInst)
	: (stopModalWithCode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopModalWithCode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void stopModalWithCode(final long returnCode){
			final com.apple.jobjc.Invoke.MsgSend stopModalWithCode_IMetInst = get_stopModalWithCode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopModalWithCode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, returnCode);
		stopModalWithCode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend targetForAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_targetForAction_IMetInst(){
		return ((targetForAction_IMetInst != null)
	? (targetForAction_IMetInst)
	: (targetForAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "targetForAction:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T targetForAction(final com.apple.jobjc.SEL theAction){
			final com.apple.jobjc.Invoke.MsgSend targetForAction_IMetInst = get_targetForAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		targetForAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, theAction);
		targetForAction_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend targetForAction_to_from_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_targetForAction_to_from_IMetInst(){
		return ((targetForAction_to_from_IMetInst != null)
	? (targetForAction_to_from_IMetInst)
	: (targetForAction_to_from_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "targetForAction:to:from:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T targetForAction_to_from(final com.apple.jobjc.SEL theAction, final com.apple.jobjc.ID theTarget, final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend targetForAction_to_from_IMetInst = get_targetForAction_to_from_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		targetForAction_to_from_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, theAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theTarget);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		targetForAction_to_from_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend terminate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_terminate_IMetInst(){
		return ((terminate_IMetInst != null)
	? (terminate_IMetInst)
	: (terminate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "terminate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void terminate(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend terminate_IMetInst = get_terminate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		terminate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		terminate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tryToPerform_with_IMetInst(){
		return ((tryToPerform_with_IMetInst != null)
	? (tryToPerform_with_IMetInst)
	: (tryToPerform_with_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tryToPerform:with:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean tryToPerform_with(final com.apple.jobjc.SEL anAction, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend tryToPerform_with_IMetInst = get_tryToPerform_with_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tryToPerform_with_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, anAction);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		tryToPerform_with_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unhide_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unhide_IMetInst(){
		return ((unhide_IMetInst != null)
	? (unhide_IMetInst)
	: (unhide_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unhide:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unhide(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend unhide_IMetInst = get_unhide_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unhide_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		unhide_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unhideAllApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unhideAllApplications_IMetInst(){
		return ((unhideAllApplications_IMetInst != null)
	? (unhideAllApplications_IMetInst)
	: (unhideAllApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unhideAllApplications:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unhideAllApplications(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend unhideAllApplications_IMetInst = get_unhideAllApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unhideAllApplications_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		unhideAllApplications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unhideWithoutActivation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unhideWithoutActivation_IMetInst(){
		return ((unhideWithoutActivation_IMetInst != null)
	? (unhideWithoutActivation_IMetInst)
	: (unhideWithoutActivation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unhideWithoutActivation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unhideWithoutActivation(){
			final com.apple.jobjc.Invoke.MsgSend unhideWithoutActivation_IMetInst = get_unhideWithoutActivation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unhideWithoutActivation_IMetInst.init(nativeBuffer, this);
		unhideWithoutActivation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unregisterForRemoteNotifications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unregisterForRemoteNotifications_IMetInst(){
		return ((unregisterForRemoteNotifications_IMetInst != null)
	? (unregisterForRemoteNotifications_IMetInst)
	: (unregisterForRemoteNotifications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unregisterForRemoteNotifications", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void unregisterForRemoteNotifications(){
			final com.apple.jobjc.Invoke.MsgSend unregisterForRemoteNotifications_IMetInst = get_unregisterForRemoteNotifications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unregisterForRemoteNotifications_IMetInst.init(nativeBuffer, this);
		unregisterForRemoteNotifications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unregisterUserInterfaceItemSearchHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unregisterUserInterfaceItemSearchHandler_IMetInst(){
		return ((unregisterUserInterfaceItemSearchHandler_IMetInst != null)
	? (unregisterUserInterfaceItemSearchHandler_IMetInst)
	: (unregisterUserInterfaceItemSearchHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unregisterUserInterfaceItemSearchHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unregisterUserInterfaceItemSearchHandler(final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend unregisterUserInterfaceItemSearchHandler_IMetInst = get_unregisterUserInterfaceItemSearchHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unregisterUserInterfaceItemSearchHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		unregisterUserInterfaceItemSearchHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateWindows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateWindows_IMetInst(){
		return ((updateWindows_IMetInst != null)
	? (updateWindows_IMetInst)
	: (updateWindows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateWindows", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateWindows(){
			final com.apple.jobjc.Invoke.MsgSend updateWindows_IMetInst = get_updateWindows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateWindows_IMetInst.init(nativeBuffer, this);
		updateWindows_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateWindowsItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateWindowsItem_IMetInst(){
		return ((updateWindowsItem_IMetInst != null)
	? (updateWindowsItem_IMetInst)
	: (updateWindowsItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateWindowsItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void updateWindowsItem(final com.apple.jobjc.appkit.NSWindow win){
			final com.apple.jobjc.Invoke.MsgSend updateWindowsItem_IMetInst = get_updateWindowsItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateWindowsItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, win);
		updateWindowsItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userInterfaceLayoutDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userInterfaceLayoutDirection_IMetInst(){
		return ((userInterfaceLayoutDirection_IMetInst != null)
	? (userInterfaceLayoutDirection_IMetInst)
	: (userInterfaceLayoutDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userInterfaceLayoutDirection", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long userInterfaceLayoutDirection(){
			final com.apple.jobjc.Invoke.MsgSend userInterfaceLayoutDirection_IMetInst = get_userInterfaceLayoutDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userInterfaceLayoutDirection_IMetInst.init(nativeBuffer, this);
		userInterfaceLayoutDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validRequestorForSendType_returnType_IMetInst(){
		return ((validRequestorForSendType_returnType_IMetInst != null)
	? (validRequestorForSendType_returnType_IMetInst)
	: (validRequestorForSendType_returnType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validRequestorForSendType:returnType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T validRequestorForSendType_returnType(final com.apple.jobjc.foundation.NSString sendType, final com.apple.jobjc.foundation.NSString returnType){
			final com.apple.jobjc.Invoke.MsgSend validRequestorForSendType_returnType_IMetInst = get_validRequestorForSendType_returnType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validRequestorForSendType_returnType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sendType);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, returnType);
		validRequestorForSendType_returnType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowWithWindowNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowWithWindowNumber_IMetInst(){
		return ((windowWithWindowNumber_IMetInst != null)
	? (windowWithWindowNumber_IMetInst)
	: (windowWithWindowNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowWithWindowNumber:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSWindow windowWithWindowNumber(final long windowNum){
			final com.apple.jobjc.Invoke.MsgSend windowWithWindowNumber_IMetInst = get_windowWithWindowNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowWithWindowNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, windowNum);
		windowWithWindowNumber_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSWindow returnValue = (com.apple.jobjc.appkit.NSWindow) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windows_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windows_IMetInst(){
		return ((windows_IMetInst != null)
	? (windows_IMetInst)
	: (windows_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windows", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray windows(){
			final com.apple.jobjc.Invoke.MsgSend windows_IMetInst = get_windows_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windows_IMetInst.init(nativeBuffer, this);
		windows_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend windowsMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_windowsMenu_IMetInst(){
		return ((windowsMenu_IMetInst != null)
	? (windowsMenu_IMetInst)
	: (windowsMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "windowsMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu windowsMenu(){
			final com.apple.jobjc.Invoke.MsgSend windowsMenu_IMetInst = get_windowsMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		windowsMenu_IMetInst.init(nativeBuffer, this);
		windowsMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
