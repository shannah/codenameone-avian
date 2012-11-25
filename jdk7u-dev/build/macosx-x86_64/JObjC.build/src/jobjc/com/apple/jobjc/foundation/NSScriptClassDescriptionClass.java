package com.apple.jobjc.foundation;

public  class NSScriptClassDescriptionClass extends com.apple.jobjc.foundation.NSClassDescriptionClass {
	public NSScriptClassDescriptionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSScriptClassDescriptionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSScriptClassDescriptionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classDescriptionForClassNSScriptClassDescription_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescriptionForClassNSScriptClassDescription_CMetInst(){
		return ((classDescriptionForClassNSScriptClassDescription_CMetInst != null)
	? (classDescriptionForClassNSScriptClassDescription_CMetInst)
	: (classDescriptionForClassNSScriptClassDescription_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescriptionForClass:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription classDescriptionForClassNSScriptClassDescription(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend classDescriptionForClassNSScriptClassDescription_CMetInst = get_classDescriptionForClassNSScriptClassDescription_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescriptionForClassNSScriptClassDescription_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		classDescriptionForClassNSScriptClassDescription_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
