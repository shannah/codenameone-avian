package com.apple.jobjc.appkit;

public  class NSPrinterClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPrinterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPrinterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPrinterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend printerNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerNames_CMetInst(){
		return ((printerNames_CMetInst != null)
	? (printerNames_CMetInst)
	: (printerNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray printerNames(){
			final com.apple.jobjc.Invoke.MsgSend printerNames_CMetInst = get_printerNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerNames_CMetInst.init(nativeBuffer, this);
		printerNames_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printerTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerTypes_CMetInst(){
		return ((printerTypes_CMetInst != null)
	? (printerTypes_CMetInst)
	: (printerTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray printerTypes(){
			final com.apple.jobjc.Invoke.MsgSend printerTypes_CMetInst = get_printerTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerTypes_CMetInst.init(nativeBuffer, this);
		printerTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printerWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerWithName_CMetInst(){
		return ((printerWithName_CMetInst != null)
	? (printerWithName_CMetInst)
	: (printerWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrinter printerWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend printerWithName_CMetInst = get_printerWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		printerWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrinter returnValue = (com.apple.jobjc.appkit.NSPrinter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printerWithName_domain_includeUnavailable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerWithName_domain_includeUnavailable_CMetInst(){
		return ((printerWithName_domain_includeUnavailable_CMetInst != null)
	? (printerWithName_domain_includeUnavailable_CMetInst)
	: (printerWithName_domain_includeUnavailable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerWithName:domain:includeUnavailable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrinter printerWithName_domain_includeUnavailable(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString domain, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend printerWithName_domain_includeUnavailable_CMetInst = get_printerWithName_domain_includeUnavailable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerWithName_domain_includeUnavailable_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		printerWithName_domain_includeUnavailable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrinter returnValue = (com.apple.jobjc.appkit.NSPrinter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printerWithType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printerWithType_CMetInst(){
		return ((printerWithType_CMetInst != null)
	? (printerWithType_CMetInst)
	: (printerWithType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printerWithType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPrinter printerWithType(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend printerWithType_CMetInst = get_printerWithType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printerWithType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		printerWithType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPrinter returnValue = (com.apple.jobjc.appkit.NSPrinter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
