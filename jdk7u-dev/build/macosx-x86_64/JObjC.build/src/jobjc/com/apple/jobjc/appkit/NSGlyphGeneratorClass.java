package com.apple.jobjc.appkit;

public  class NSGlyphGeneratorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSGlyphGeneratorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSGlyphGeneratorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSGlyphGeneratorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sharedGlyphGenerator_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedGlyphGenerator_CMetInst(){
		return ((sharedGlyphGenerator_CMetInst != null)
	? (sharedGlyphGenerator_CMetInst)
	: (sharedGlyphGenerator_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedGlyphGenerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedGlyphGenerator(){
			final com.apple.jobjc.Invoke.MsgSend sharedGlyphGenerator_CMetInst = get_sharedGlyphGenerator_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedGlyphGenerator_CMetInst.init(nativeBuffer, this);
		sharedGlyphGenerator_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
