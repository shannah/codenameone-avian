package com.apple.jobjc.foundation;

public  class NSPointerFunctionsClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPointerFunctionsClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPointerFunctionsClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPointerFunctionsClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend pointerFunctionsWithOptions_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pointerFunctionsWithOptions_CMetInst(){
		return ((pointerFunctionsWithOptions_CMetInst != null)
	? (pointerFunctionsWithOptions_CMetInst)
	: (pointerFunctionsWithOptions_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pointerFunctionsWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T pointerFunctionsWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend pointerFunctionsWithOptions_CMetInst = get_pointerFunctionsWithOptions_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pointerFunctionsWithOptions_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		pointerFunctionsWithOptions_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
