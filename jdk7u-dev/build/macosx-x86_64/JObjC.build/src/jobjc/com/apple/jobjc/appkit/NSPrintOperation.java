package com.apple.jobjc.appkit;

public  class NSPrintOperation extends com.apple.jobjc.foundation.NSObject {
	public NSPrintOperation(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPrintOperation(final NSPrintOperation obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend canSpawnSeparateThread_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canSpawnSeparateThread_IMetInst(){
		return ((canSpawnSeparateThread_IMetInst != null)
	? (canSpawnSeparateThread_IMetInst)
	: (canSpawnSeparateThread_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canSpawnSeparateThread", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canSpawnSeparateThread(){
			final com.apple.jobjc.Invoke.MsgSend canSpawnSeparateThread_IMetInst = get_canSpawnSeparateThread_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canSpawnSeparateThread_IMetInst.init(nativeBuffer, this);
		canSpawnSeparateThread_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cleanUpOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cleanUpOperation_IMetInst(){
		return ((cleanUpOperation_IMetInst != null)
	? (cleanUpOperation_IMetInst)
	: (cleanUpOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cleanUpOperation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cleanUpOperation(){
			final com.apple.jobjc.Invoke.MsgSend cleanUpOperation_IMetInst = get_cleanUpOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cleanUpOperation_IMetInst.init(nativeBuffer, this);
		cleanUpOperation_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend createContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createContext_IMetInst(){
		return ((createContext_IMetInst != null)
	? (createContext_IMetInst)
	: (createContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createContext", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSGraphicsContext createContext(){
			final com.apple.jobjc.Invoke.MsgSend createContext_IMetInst = get_createContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createContext_IMetInst.init(nativeBuffer, this);
		createContext_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSGraphicsContext returnValue = (com.apple.jobjc.appkit.NSGraphicsContext) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentPage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentPage_IMetInst(){
		return ((currentPage_IMetInst != null)
	? (currentPage_IMetInst)
	: (currentPage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentPage", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long currentPage(){
			final com.apple.jobjc.Invoke.MsgSend currentPage_IMetInst = get_currentPage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentPage_IMetInst.init(nativeBuffer, this);
		currentPage_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend deliverResult_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deliverResult_IMetInst(){
		return ((deliverResult_IMetInst != null)
	? (deliverResult_IMetInst)
	: (deliverResult_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deliverResult", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean deliverResult(){
			final com.apple.jobjc.Invoke.MsgSend deliverResult_IMetInst = get_deliverResult_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deliverResult_IMetInst.init(nativeBuffer, this);
		deliverResult_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend destroyContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_destroyContext_IMetInst(){
		return ((destroyContext_IMetInst != null)
	? (destroyContext_IMetInst)
	: (destroyContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "destroyContext", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void destroyContext(){
			final com.apple.jobjc.Invoke.MsgSend destroyContext_IMetInst = get_destroyContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		destroyContext_IMetInst.init(nativeBuffer, this);
		destroyContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isCopyingOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isCopyingOperation_IMetInst(){
		return ((isCopyingOperation_IMetInst != null)
	? (isCopyingOperation_IMetInst)
	: (isCopyingOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isCopyingOperation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isCopyingOperation(){
			final com.apple.jobjc.Invoke.MsgSend isCopyingOperation_IMetInst = get_isCopyingOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isCopyingOperation_IMetInst.init(nativeBuffer, this);
		isCopyingOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend jobTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_jobTitle_IMetInst(){
		return ((jobTitle_IMetInst != null)
	? (jobTitle_IMetInst)
	: (jobTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "jobTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString jobTitle(){
			final com.apple.jobjc.Invoke.MsgSend jobTitle_IMetInst = get_jobTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		jobTitle_IMetInst.init(nativeBuffer, this);
		jobTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageOrder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageOrder_IMetInst(){
		return ((pageOrder_IMetInst != null)
	? (pageOrder_IMetInst)
	: (pageOrder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageOrder", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long pageOrder(){
			final com.apple.jobjc.Invoke.MsgSend pageOrder_IMetInst = get_pageOrder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageOrder_IMetInst.init(nativeBuffer, this);
		pageOrder_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pageRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pageRange_IMetInst(){
		return ((pageRange_IMetInst != null)
	? (pageRange_IMetInst)
	: (pageRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pageRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange pageRange(){
			final com.apple.jobjc.Invoke.MsgSend pageRange_IMetInst = get_pageRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pageRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		pageRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredRenderingQuality_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredRenderingQuality_IMetInst(){
		return ((preferredRenderingQuality_IMetInst != null)
	? (preferredRenderingQuality_IMetInst)
	: (preferredRenderingQuality_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredRenderingQuality", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long preferredRenderingQuality(){
			final com.apple.jobjc.Invoke.MsgSend preferredRenderingQuality_IMetInst = get_preferredRenderingQuality_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredRenderingQuality_IMetInst.init(nativeBuffer, this);
		preferredRenderingQuality_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend printPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printPanel_IMetInst(){
		return ((printPanel_IMetInst != null)
	? (printPanel_IMetInst)
	: (printPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintPanel printPanel(){
			final com.apple.jobjc.Invoke.MsgSend printPanel_IMetInst = get_printPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printPanel_IMetInst.init(nativeBuffer, this);
		printPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintPanel returnValue = (com.apple.jobjc.appkit.NSPrintPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runOperation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runOperation_IMetInst(){
		return ((runOperation_IMetInst != null)
	? (runOperation_IMetInst)
	: (runOperation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runOperation", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean runOperation(){
			final com.apple.jobjc.Invoke.MsgSend runOperation_IMetInst = get_runOperation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runOperation_IMetInst.init(nativeBuffer, this);
		runOperation_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst(){
		return ((runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst != null)
	? (runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst)
	: (runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runOperationModalForWindow:delegate:didRunSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void runOperationModalForWindow_delegate_didRunSelector_contextInfo(final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didRunSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst = get_runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didRunSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		runOperationModalForWindow_delegate_didRunSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setCanSpawnSeparateThread_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanSpawnSeparateThread_IMetInst(){
		return ((setCanSpawnSeparateThread_IMetInst != null)
	? (setCanSpawnSeparateThread_IMetInst)
	: (setCanSpawnSeparateThread_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanSpawnSeparateThread:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanSpawnSeparateThread(final boolean canSpawnSeparateThread){
			final com.apple.jobjc.Invoke.MsgSend setCanSpawnSeparateThread_IMetInst = get_setCanSpawnSeparateThread_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanSpawnSeparateThread_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, canSpawnSeparateThread);
		setCanSpawnSeparateThread_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setJobTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setJobTitle_IMetInst(){
		return ((setJobTitle_IMetInst != null)
	? (setJobTitle_IMetInst)
	: (setJobTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setJobTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setJobTitle(final com.apple.jobjc.foundation.NSString jobTitle){
			final com.apple.jobjc.Invoke.MsgSend setJobTitle_IMetInst = get_setJobTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setJobTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, jobTitle);
		setJobTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPageOrder_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPageOrder_IMetInst(){
		return ((setPageOrder_IMetInst != null)
	? (setPageOrder_IMetInst)
	: (setPageOrder_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPageOrder:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setPageOrder(final long pageOrder){
			final com.apple.jobjc.Invoke.MsgSend setPageOrder_IMetInst = get_setPageOrder_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPageOrder_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, pageOrder);
		setPageOrder_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setPrintPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPrintPanel_IMetInst(){
		return ((setPrintPanel_IMetInst != null)
	? (setPrintPanel_IMetInst)
	: (setPrintPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPrintPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPrintPanel(final com.apple.jobjc.appkit.NSPrintPanel panel){
			final com.apple.jobjc.Invoke.MsgSend setPrintPanel_IMetInst = get_setPrintPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPrintPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, panel);
		setPrintPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowPanels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowPanels_IMetInst(){
		return ((setShowPanels_IMetInst != null)
	? (setShowPanels_IMetInst)
	: (setShowPanels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowPanels:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowPanels(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowPanels_IMetInst = get_setShowPanels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowPanels_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowPanels_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsPrintPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsPrintPanel_IMetInst(){
		return ((setShowsPrintPanel_IMetInst != null)
	? (setShowsPrintPanel_IMetInst)
	: (setShowsPrintPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsPrintPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsPrintPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsPrintPanel_IMetInst = get_setShowsPrintPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsPrintPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsPrintPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsProgressPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsProgressPanel_IMetInst(){
		return ((setShowsProgressPanel_IMetInst != null)
	? (setShowsProgressPanel_IMetInst)
	: (setShowsProgressPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsProgressPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsProgressPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setShowsProgressPanel_IMetInst = get_setShowsProgressPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsProgressPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setShowsProgressPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showPanels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showPanels_IMetInst(){
		return ((showPanels_IMetInst != null)
	? (showPanels_IMetInst)
	: (showPanels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showPanels", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showPanels(){
			final com.apple.jobjc.Invoke.MsgSend showPanels_IMetInst = get_showPanels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showPanels_IMetInst.init(nativeBuffer, this);
		showPanels_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsPrintPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsPrintPanel_IMetInst(){
		return ((showsPrintPanel_IMetInst != null)
	? (showsPrintPanel_IMetInst)
	: (showsPrintPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsPrintPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsPrintPanel(){
			final com.apple.jobjc.Invoke.MsgSend showsPrintPanel_IMetInst = get_showsPrintPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsPrintPanel_IMetInst.init(nativeBuffer, this);
		showsPrintPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showsProgressPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsProgressPanel_IMetInst(){
		return ((showsProgressPanel_IMetInst != null)
	? (showsProgressPanel_IMetInst)
	: (showsProgressPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsProgressPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsProgressPanel(){
			final com.apple.jobjc.Invoke.MsgSend showsProgressPanel_IMetInst = get_showsProgressPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsProgressPanel_IMetInst.init(nativeBuffer, this);
		showsProgressPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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
