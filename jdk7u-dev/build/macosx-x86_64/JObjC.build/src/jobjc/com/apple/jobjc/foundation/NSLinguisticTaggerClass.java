package com.apple.jobjc.foundation;

public  class NSLinguisticTaggerClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSLinguisticTaggerClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSLinguisticTaggerClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSLinguisticTaggerClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend availableTagSchemesForLanguage_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableTagSchemesForLanguage_CMetInst(){
		return ((availableTagSchemesForLanguage_CMetInst != null)
	? (availableTagSchemesForLanguage_CMetInst)
	: (availableTagSchemesForLanguage_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableTagSchemesForLanguage:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableTagSchemesForLanguage(final com.apple.jobjc.foundation.NSString language){
			final com.apple.jobjc.Invoke.MsgSend availableTagSchemesForLanguage_CMetInst = get_availableTagSchemesForLanguage_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableTagSchemesForLanguage_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, language);
		availableTagSchemesForLanguage_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
