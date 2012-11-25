package com.apple.jobjc.foundation;

public  class NSOrthographyClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSOrthographyClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSOrthographyClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSOrthographyClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend orthographyWithDominantScript_languageMap_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orthographyWithDominantScript_languageMap_CMetInst(){
		return ((orthographyWithDominantScript_languageMap_CMetInst != null)
	? (orthographyWithDominantScript_languageMap_CMetInst)
	: (orthographyWithDominantScript_languageMap_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orthographyWithDominantScript:languageMap:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T orthographyWithDominantScript_languageMap(final com.apple.jobjc.foundation.NSString script, final com.apple.jobjc.foundation.NSDictionary map){
			final com.apple.jobjc.Invoke.MsgSend orthographyWithDominantScript_languageMap_CMetInst = get_orthographyWithDominantScript_languageMap_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orthographyWithDominantScript_languageMap_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, script);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, map);
		orthographyWithDominantScript_languageMap_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
