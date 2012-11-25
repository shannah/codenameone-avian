package com.apple.jobjc.appkit;

public  class NSPrintOperationClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPrintOperationClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPrintOperationClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPrintOperationClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_EPSOperationWithView_insideRect_toData_CMetInst(){
		return ((EPSOperationWithView_insideRect_toData_CMetInst != null)
	? (EPSOperationWithView_insideRect_toData_CMetInst)
	: (EPSOperationWithView_insideRect_toData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "EPSOperationWithView:insideRect:toData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation EPSOperationWithView_insideRect_toData(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSMutableData data){
			final com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toData_CMetInst = get_EPSOperationWithView_insideRect_toData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		EPSOperationWithView_insideRect_toData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		EPSOperationWithView_insideRect_toData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toData_printInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_EPSOperationWithView_insideRect_toData_printInfo_CMetInst(){
		return ((EPSOperationWithView_insideRect_toData_printInfo_CMetInst != null)
	? (EPSOperationWithView_insideRect_toData_printInfo_CMetInst)
	: (EPSOperationWithView_insideRect_toData_printInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "EPSOperationWithView:insideRect:toData:printInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation EPSOperationWithView_insideRect_toData_printInfo(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSMutableData data, final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toData_printInfo_CMetInst = get_EPSOperationWithView_insideRect_toData_printInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		EPSOperationWithView_insideRect_toData_printInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		EPSOperationWithView_insideRect_toData_printInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toPath_printInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_EPSOperationWithView_insideRect_toPath_printInfo_CMetInst(){
		return ((EPSOperationWithView_insideRect_toPath_printInfo_CMetInst != null)
	? (EPSOperationWithView_insideRect_toPath_printInfo_CMetInst)
	: (EPSOperationWithView_insideRect_toPath_printInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "EPSOperationWithView:insideRect:toPath:printInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation EPSOperationWithView_insideRect_toPath_printInfo(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend EPSOperationWithView_insideRect_toPath_printInfo_CMetInst = get_EPSOperationWithView_insideRect_toPath_printInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		EPSOperationWithView_insideRect_toPath_printInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		EPSOperationWithView_insideRect_toPath_printInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PDFOperationWithView_insideRect_toData_CMetInst(){
		return ((PDFOperationWithView_insideRect_toData_CMetInst != null)
	? (PDFOperationWithView_insideRect_toData_CMetInst)
	: (PDFOperationWithView_insideRect_toData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PDFOperationWithView:insideRect:toData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation PDFOperationWithView_insideRect_toData(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSMutableData data){
			final com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toData_CMetInst = get_PDFOperationWithView_insideRect_toData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PDFOperationWithView_insideRect_toData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		PDFOperationWithView_insideRect_toData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toData_printInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PDFOperationWithView_insideRect_toData_printInfo_CMetInst(){
		return ((PDFOperationWithView_insideRect_toData_printInfo_CMetInst != null)
	? (PDFOperationWithView_insideRect_toData_printInfo_CMetInst)
	: (PDFOperationWithView_insideRect_toData_printInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PDFOperationWithView:insideRect:toData:printInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation PDFOperationWithView_insideRect_toData_printInfo(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSMutableData data, final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toData_printInfo_CMetInst = get_PDFOperationWithView_insideRect_toData_printInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PDFOperationWithView_insideRect_toData_printInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		PDFOperationWithView_insideRect_toData_printInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toPath_printInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_PDFOperationWithView_insideRect_toPath_printInfo_CMetInst(){
		return ((PDFOperationWithView_insideRect_toPath_printInfo_CMetInst != null)
	? (PDFOperationWithView_insideRect_toPath_printInfo_CMetInst)
	: (PDFOperationWithView_insideRect_toPath_printInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "PDFOperationWithView:insideRect:toPath:printInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation PDFOperationWithView_insideRect_toPath_printInfo(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.foundation.NSRect rect, final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend PDFOperationWithView_insideRect_toPath_printInfo_CMetInst = get_PDFOperationWithView_insideRect_toPath_printInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		PDFOperationWithView_insideRect_toPath_printInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, rect);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		PDFOperationWithView_insideRect_toPath_printInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentOperation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentOperation_CMetInst(){
		return ((currentOperation_CMetInst != null)
	? (currentOperation_CMetInst)
	: (currentOperation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentOperation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation currentOperation(){
			final com.apple.jobjc.Invoke.MsgSend currentOperation_CMetInst = get_currentOperation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentOperation_CMetInst.init(nativeBuffer, this);
		currentOperation_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printOperationWithView_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printOperationWithView_CMetInst(){
		return ((printOperationWithView_CMetInst != null)
	? (printOperationWithView_CMetInst)
	: (printOperationWithView_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printOperationWithView:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation printOperationWithView(final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend printOperationWithView_CMetInst = get_printOperationWithView_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printOperationWithView_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		printOperationWithView_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printOperationWithView_printInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printOperationWithView_printInfo_CMetInst(){
		return ((printOperationWithView_printInfo_CMetInst != null)
	? (printOperationWithView_printInfo_CMetInst)
	: (printOperationWithView_printInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printOperationWithView:printInfo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintOperation printOperationWithView_printInfo(final com.apple.jobjc.appkit.NSView view, final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend printOperationWithView_printInfo_CMetInst = get_printOperationWithView_printInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printOperationWithView_printInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		printOperationWithView_printInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintOperation returnValue = (com.apple.jobjc.appkit.NSPrintOperation) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCurrentOperation_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCurrentOperation_CMetInst(){
		return ((setCurrentOperation_CMetInst != null)
	? (setCurrentOperation_CMetInst)
	: (setCurrentOperation_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCurrentOperation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCurrentOperation(final com.apple.jobjc.appkit.NSPrintOperation operation){
			final com.apple.jobjc.Invoke.MsgSend setCurrentOperation_CMetInst = get_setCurrentOperation_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCurrentOperation_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, operation);
		setCurrentOperation_CMetInst.invoke(nativeBuffer);
		
		
	}

}
