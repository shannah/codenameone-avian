package com.apple.jobjc.appkit;

public  class NSPrintPanel extends com.apple.jobjc.foundation.NSObject {
	public NSPrintPanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPrintPanel(final NSPrintPanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessoryControllers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessoryControllers_IMetInst(){
		return ((accessoryControllers_IMetInst != null)
	? (accessoryControllers_IMetInst)
	: (accessoryControllers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessoryControllers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray accessoryControllers(){
			final com.apple.jobjc.Invoke.MsgSend accessoryControllers_IMetInst = get_accessoryControllers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessoryControllers_IMetInst.init(nativeBuffer, this);
		accessoryControllers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend addAccessoryController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addAccessoryController_IMetInst(){
		return ((addAccessoryController_IMetInst != null)
	? (addAccessoryController_IMetInst)
	: (addAccessoryController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addAccessoryController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addAccessoryController(final com.apple.jobjc.appkit.NSViewController accessoryController){
			final com.apple.jobjc.Invoke.MsgSend addAccessoryController_IMetInst = get_addAccessoryController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addAccessoryController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, accessoryController);
		addAccessoryController_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst)
	: (beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheetWithPrintInfo:modalForWindow:delegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst = get_beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginSheetWithPrintInfo_modalForWindow_delegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultButtonTitle_IMetInst(){
		return ((defaultButtonTitle_IMetInst != null)
	? (defaultButtonTitle_IMetInst)
	: (defaultButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultButtonTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString defaultButtonTitle(){
			final com.apple.jobjc.Invoke.MsgSend defaultButtonTitle_IMetInst = get_defaultButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultButtonTitle_IMetInst.init(nativeBuffer, this);
		defaultButtonTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend finalWritePrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_finalWritePrintInfo_IMetInst(){
		return ((finalWritePrintInfo_IMetInst != null)
	? (finalWritePrintInfo_IMetInst)
	: (finalWritePrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "finalWritePrintInfo", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void finalWritePrintInfo(){
			final com.apple.jobjc.Invoke.MsgSend finalWritePrintInfo_IMetInst = get_finalWritePrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		finalWritePrintInfo_IMetInst.init(nativeBuffer, this);
		finalWritePrintInfo_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend jobStyleHint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_jobStyleHint_IMetInst(){
		return ((jobStyleHint_IMetInst != null)
	? (jobStyleHint_IMetInst)
	: (jobStyleHint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "jobStyleHint", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString jobStyleHint(){
			final com.apple.jobjc.Invoke.MsgSend jobStyleHint_IMetInst = get_jobStyleHint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		jobStyleHint_IMetInst.init(nativeBuffer, this);
		jobStyleHint_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_options_IMetInst(){
		return ((options_IMetInst != null)
	? (options_IMetInst)
	: (options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "options", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long options(){
			final com.apple.jobjc.Invoke.MsgSend options_IMetInst = get_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		options_IMetInst.init(nativeBuffer, this);
		options_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend removeAccessoryController_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAccessoryController_IMetInst(){
		return ((removeAccessoryController_IMetInst != null)
	? (removeAccessoryController_IMetInst)
	: (removeAccessoryController_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAccessoryController:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeAccessoryController(final com.apple.jobjc.appkit.NSViewController accessoryController){
			final com.apple.jobjc.Invoke.MsgSend removeAccessoryController_IMetInst = get_removeAccessoryController_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAccessoryController_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, accessoryController);
		removeAccessoryController_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend runModalWithPrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalWithPrintInfo_IMetInst(){
		return ((runModalWithPrintInfo_IMetInst != null)
	? (runModalWithPrintInfo_IMetInst)
	: (runModalWithPrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalWithPrintInfo:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalWithPrintInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend runModalWithPrintInfo_IMetInst = get_runModalWithPrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalWithPrintInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		runModalWithPrintInfo_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAccessoryView_IMetInst(){
		return ((setAccessoryView_IMetInst != null)
	? (setAccessoryView_IMetInst)
	: (setAccessoryView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAccessoryView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAccessoryView(final com.apple.jobjc.appkit.NSView accessoryView){
			final com.apple.jobjc.Invoke.MsgSend setAccessoryView_IMetInst = get_setAccessoryView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAccessoryView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, accessoryView);
		setAccessoryView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultButtonTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultButtonTitle_IMetInst(){
		return ((setDefaultButtonTitle_IMetInst != null)
	? (setDefaultButtonTitle_IMetInst)
	: (setDefaultButtonTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultButtonTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultButtonTitle(final com.apple.jobjc.foundation.NSString defaultButtonTitle){
			final com.apple.jobjc.Invoke.MsgSend setDefaultButtonTitle_IMetInst = get_setDefaultButtonTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultButtonTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultButtonTitle);
		setDefaultButtonTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHelpAnchor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHelpAnchor_IMetInst(){
		return ((setHelpAnchor_IMetInst != null)
	? (setHelpAnchor_IMetInst)
	: (setHelpAnchor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHelpAnchor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setHelpAnchor(final com.apple.jobjc.foundation.NSString helpAnchor){
			final com.apple.jobjc.Invoke.MsgSend setHelpAnchor_IMetInst = get_setHelpAnchor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHelpAnchor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, helpAnchor);
		setHelpAnchor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setJobStyleHint_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setJobStyleHint_IMetInst(){
		return ((setJobStyleHint_IMetInst != null)
	? (setJobStyleHint_IMetInst)
	: (setJobStyleHint_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setJobStyleHint:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setJobStyleHint(final com.apple.jobjc.foundation.NSString hint){
			final com.apple.jobjc.Invoke.MsgSend setJobStyleHint_IMetInst = get_setJobStyleHint_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setJobStyleHint_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, hint);
		setJobStyleHint_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setOptions_IMetInst(){
		return ((setOptions_IMetInst != null)
	? (setOptions_IMetInst)
	: (setOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setOptions:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend setOptions_IMetInst = get_setOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, options);
		setOptions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend updateFromPrintInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateFromPrintInfo_IMetInst(){
		return ((updateFromPrintInfo_IMetInst != null)
	? (updateFromPrintInfo_IMetInst)
	: (updateFromPrintInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateFromPrintInfo", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void updateFromPrintInfo(){
			final com.apple.jobjc.Invoke.MsgSend updateFromPrintInfo_IMetInst = get_updateFromPrintInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateFromPrintInfo_IMetInst.init(nativeBuffer, this);
		updateFromPrintInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

}
