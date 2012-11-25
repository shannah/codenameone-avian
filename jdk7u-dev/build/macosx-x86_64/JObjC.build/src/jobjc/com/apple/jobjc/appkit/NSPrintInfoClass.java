package com.apple.jobjc.appkit;

public  class NSPrintInfoClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPrintInfoClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPrintInfoClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPrintInfoClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultPrinter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultPrinter_CMetInst(){
		return ((defaultPrinter_CMetInst != null)
	? (defaultPrinter_CMetInst)
	: (defaultPrinter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultPrinter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrinter defaultPrinter(){
			final com.apple.jobjc.Invoke.MsgSend defaultPrinter_CMetInst = get_defaultPrinter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultPrinter_CMetInst.init(nativeBuffer, this);
		defaultPrinter_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrinter returnValue = (com.apple.jobjc.appkit.NSPrinter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultPrinter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultPrinter_CMetInst(){
		return ((setDefaultPrinter_CMetInst != null)
	? (setDefaultPrinter_CMetInst)
	: (setDefaultPrinter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultPrinter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDefaultPrinter(final com.apple.jobjc.appkit.NSPrinter printer){
			final com.apple.jobjc.Invoke.MsgSend setDefaultPrinter_CMetInst = get_setDefaultPrinter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultPrinter_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printer);
		setDefaultPrinter_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSharedPrintInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSharedPrintInfo_CMetInst(){
		return ((setSharedPrintInfo_CMetInst != null)
	? (setSharedPrintInfo_CMetInst)
	: (setSharedPrintInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSharedPrintInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSharedPrintInfo(final com.apple.jobjc.appkit.NSPrintInfo printInfo){
			final com.apple.jobjc.Invoke.MsgSend setSharedPrintInfo_CMetInst = get_setSharedPrintInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSharedPrintInfo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, printInfo);
		setSharedPrintInfo_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedPrintInfo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedPrintInfo_CMetInst(){
		return ((sharedPrintInfo_CMetInst != null)
	? (sharedPrintInfo_CMetInst)
	: (sharedPrintInfo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedPrintInfo", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrintInfo sharedPrintInfo(){
			final com.apple.jobjc.Invoke.MsgSend sharedPrintInfo_CMetInst = get_sharedPrintInfo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedPrintInfo_CMetInst.init(nativeBuffer, this);
		sharedPrintInfo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrintInfo returnValue = (com.apple.jobjc.appkit.NSPrintInfo) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeForPaperName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeForPaperName_CMetInst(){
		return ((sizeForPaperName_CMetInst != null)
	? (sizeForPaperName_CMetInst)
	: (sizeForPaperName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeForPaperName:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSize sizeForPaperName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend sizeForPaperName_CMetInst = get_sizeForPaperName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeForPaperName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		sizeForPaperName_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
