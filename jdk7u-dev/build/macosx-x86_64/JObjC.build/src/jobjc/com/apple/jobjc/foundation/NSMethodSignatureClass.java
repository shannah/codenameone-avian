package com.apple.jobjc.foundation;

public  class NSMethodSignatureClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSMethodSignatureClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMethodSignatureClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMethodSignatureClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend signatureWithObjCTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_signatureWithObjCTypes_CMetInst(){
		return ((signatureWithObjCTypes_CMetInst != null)
	? (signatureWithObjCTypes_CMetInst)
	: (signatureWithObjCTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "signatureWithObjCTypes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMethodSignature signatureWithObjCTypes(final com.apple.jobjc.Pointer<java.lang.Byte> types){
			final com.apple.jobjc.Invoke.MsgSend signatureWithObjCTypes_CMetInst = get_signatureWithObjCTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		signatureWithObjCTypes_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, types);
		signatureWithObjCTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMethodSignature returnValue = (com.apple.jobjc.foundation.NSMethodSignature) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
