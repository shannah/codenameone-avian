package com.apple.jobjc.appkit;

public  class NSAlert extends com.apple.jobjc.foundation.NSObject {
	public NSAlert(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSAlert(final NSAlert obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend addButtonWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addButtonWithTitle_IMetInst(){
		return ((addButtonWithTitle_IMetInst != null)
	? (addButtonWithTitle_IMetInst)
	: (addButtonWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addButtonWithTitle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSButton addButtonWithTitle(final com.apple.jobjc.foundation.NSString title){
			final com.apple.jobjc.Invoke.MsgSend addButtonWithTitle_IMetInst = get_addButtonWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addButtonWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, title);
		addButtonWithTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButton returnValue = (com.apple.jobjc.appkit.NSButton) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alertStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alertStyle_IMetInst(){
		return ((alertStyle_IMetInst != null)
	? (alertStyle_IMetInst)
	: (alertStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alertStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long alertStyle(){
			final com.apple.jobjc.Invoke.MsgSend alertStyle_IMetInst = get_alertStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alertStyle_IMetInst.init(nativeBuffer, this);
		alertStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst)
	: (beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheetModalForWindow:modalDelegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo(final com.apple.jobjc.appkit.NSWindow window, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = get_beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, window);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginSheetModalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend buttons_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_buttons_IMetInst(){
		return ((buttons_IMetInst != null)
	? (buttons_IMetInst)
	: (buttons_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "buttons", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray buttons(){
			final com.apple.jobjc.Invoke.MsgSend buttons_IMetInst = get_buttons_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		buttons_IMetInst.init(nativeBuffer, this);
		buttons_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend helpAnchor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_helpAnchor_IMetInst(){
		return ((helpAnchor_IMetInst != null)
	? (helpAnchor_IMetInst)
	: (helpAnchor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "helpAnchor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString helpAnchor(){
			final com.apple.jobjc.Invoke.MsgSend helpAnchor_IMetInst = get_helpAnchor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		helpAnchor_IMetInst.init(nativeBuffer, this);
		helpAnchor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend icon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_icon_IMetInst(){
		return ((icon_IMetInst != null)
	? (icon_IMetInst)
	: (icon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "icon", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage icon(){
			final com.apple.jobjc.Invoke.MsgSend icon_IMetInst = get_icon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		icon_IMetInst.init(nativeBuffer, this);
		icon_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend informativeText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_informativeText_IMetInst(){
		return ((informativeText_IMetInst != null)
	? (informativeText_IMetInst)
	: (informativeText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "informativeText", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString informativeText(){
			final com.apple.jobjc.Invoke.MsgSend informativeText_IMetInst = get_informativeText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		informativeText_IMetInst.init(nativeBuffer, this);
		informativeText_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend layout_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_layout_IMetInst(){
		return ((layout_IMetInst != null)
	? (layout_IMetInst)
	: (layout_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "layout", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void layout(){
			final com.apple.jobjc.Invoke.MsgSend layout_IMetInst = get_layout_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		layout_IMetInst.init(nativeBuffer, this);
		layout_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend messageText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_messageText_IMetInst(){
		return ((messageText_IMetInst != null)
	? (messageText_IMetInst)
	: (messageText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "messageText", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString messageText(){
			final com.apple.jobjc.Invoke.MsgSend messageText_IMetInst = get_messageText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		messageText_IMetInst.init(nativeBuffer, this);
		messageText_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend setAlertStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlertStyle_IMetInst(){
		return ((setAlertStyle_IMetInst != null)
	? (setAlertStyle_IMetInst)
	: (setAlertStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlertStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAlertStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setAlertStyle_IMetInst = get_setAlertStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlertStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setAlertStyle_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setHelpAnchor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHelpAnchor_IMetInst(){
		return ((setHelpAnchor_IMetInst != null)
	? (setHelpAnchor_IMetInst)
	: (setHelpAnchor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHelpAnchor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHelpAnchor(final com.apple.jobjc.foundation.NSString anchor){
			final com.apple.jobjc.Invoke.MsgSend setHelpAnchor_IMetInst = get_setHelpAnchor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHelpAnchor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anchor);
		setHelpAnchor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setIcon_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIcon_IMetInst(){
		return ((setIcon_IMetInst != null)
	? (setIcon_IMetInst)
	: (setIcon_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIcon:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setIcon(final com.apple.jobjc.appkit.NSImage icon){
			final com.apple.jobjc.Invoke.MsgSend setIcon_IMetInst = get_setIcon_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIcon_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, icon);
		setIcon_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInformativeText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInformativeText_IMetInst(){
		return ((setInformativeText_IMetInst != null)
	? (setInformativeText_IMetInst)
	: (setInformativeText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInformativeText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInformativeText(final com.apple.jobjc.foundation.NSString informativeText){
			final com.apple.jobjc.Invoke.MsgSend setInformativeText_IMetInst = get_setInformativeText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInformativeText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, informativeText);
		setInformativeText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMessageText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMessageText_IMetInst(){
		return ((setMessageText_IMetInst != null)
	? (setMessageText_IMetInst)
	: (setMessageText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMessageText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMessageText(final com.apple.jobjc.foundation.NSString messageText){
			final com.apple.jobjc.Invoke.MsgSend setMessageText_IMetInst = get_setMessageText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMessageText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, messageText);
		setMessageText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsHelp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsHelp_IMetInst(){
		return ((setShowsHelp_IMetInst != null)
	? (setShowsHelp_IMetInst)
	: (setShowsHelp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsHelp:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsHelp(final boolean showsHelp){
			final com.apple.jobjc.Invoke.MsgSend setShowsHelp_IMetInst = get_setShowsHelp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsHelp_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showsHelp);
		setShowsHelp_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsSuppressionButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsSuppressionButton_IMetInst(){
		return ((setShowsSuppressionButton_IMetInst != null)
	? (setShowsSuppressionButton_IMetInst)
	: (setShowsSuppressionButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsSuppressionButton:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsSuppressionButton(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsSuppressionButton_IMetInst = get_setShowsSuppressionButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsSuppressionButton_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsSuppressionButton_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsHelp_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsHelp_IMetInst(){
		return ((showsHelp_IMetInst != null)
	? (showsHelp_IMetInst)
	: (showsHelp_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsHelp", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsHelp(){
			final com.apple.jobjc.Invoke.MsgSend showsHelp_IMetInst = get_showsHelp_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsHelp_IMetInst.init(nativeBuffer, this);
		showsHelp_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsSuppressionButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsSuppressionButton_IMetInst(){
		return ((showsSuppressionButton_IMetInst != null)
	? (showsSuppressionButton_IMetInst)
	: (showsSuppressionButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsSuppressionButton", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsSuppressionButton(){
			final com.apple.jobjc.Invoke.MsgSend showsSuppressionButton_IMetInst = get_showsSuppressionButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsSuppressionButton_IMetInst.init(nativeBuffer, this);
		showsSuppressionButton_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend suppressionButton_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_suppressionButton_IMetInst(){
		return ((suppressionButton_IMetInst != null)
	? (suppressionButton_IMetInst)
	: (suppressionButton_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "suppressionButton", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSButton suppressionButton(){
			final com.apple.jobjc.Invoke.MsgSend suppressionButton_IMetInst = get_suppressionButton_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		suppressionButton_IMetInst.init(nativeBuffer, this);
		suppressionButton_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSButton returnValue = (com.apple.jobjc.appkit.NSButton) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend window_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_window_IMetInst(){
		return ((window_IMetInst != null)
	? (window_IMetInst)
	: (window_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "window", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T window(){
			final com.apple.jobjc.Invoke.MsgSend window_IMetInst = get_window_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		window_IMetInst.init(nativeBuffer, this);
		window_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
