package com.apple.jobjc.foundation;

public  class NSScannerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSScannerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScannerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScannerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend localizedScannerWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedScannerWithString_CMetInst(){
		return ((localizedScannerWithString_CMetInst != null)
	? (localizedScannerWithString_CMetInst)
	: (localizedScannerWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedScannerWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T localizedScannerWithString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend localizedScannerWithString_CMetInst = get_localizedScannerWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedScannerWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		localizedScannerWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scannerWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scannerWithString_CMetInst(){
		return ((scannerWithString_CMetInst != null)
	? (scannerWithString_CMetInst)
	: (scannerWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scannerWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T scannerWithString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend scannerWithString_CMetInst = get_scannerWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scannerWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		scannerWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
