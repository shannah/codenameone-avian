package com.apple.jobjc.foundation;

public  class NSClassDescriptionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSClassDescriptionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSClassDescriptionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSClassDescriptionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend classDescriptionForClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classDescriptionForClass_CMetInst(){
		return ((classDescriptionForClass_CMetInst != null)
	? (classDescriptionForClass_CMetInst)
	: (classDescriptionForClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classDescriptionForClass:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSClassDescription classDescriptionForClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend classDescriptionForClass_CMetInst = get_classDescriptionForClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classDescriptionForClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		classDescriptionForClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSClassDescription returnValue = (com.apple.jobjc.foundation.NSClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend invalidateClassDescriptionCache_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invalidateClassDescriptionCache_CMetInst(){
		return ((invalidateClassDescriptionCache_CMetInst != null)
	? (invalidateClassDescriptionCache_CMetInst)
	: (invalidateClassDescriptionCache_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invalidateClassDescriptionCache", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invalidateClassDescriptionCache(){
			final com.apple.jobjc.Invoke.MsgSend invalidateClassDescriptionCache_CMetInst = get_invalidateClassDescriptionCache_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invalidateClassDescriptionCache_CMetInst.init(nativeBuffer, this);
		invalidateClassDescriptionCache_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend registerClassDescription_forClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerClassDescription_forClass_CMetInst(){
		return ((registerClassDescription_forClass_CMetInst != null)
	? (registerClassDescription_forClass_CMetInst)
	: (registerClassDescription_forClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerClassDescription:forClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void registerClassDescription_forClass(final com.apple.jobjc.foundation.NSClassDescription description, final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend registerClassDescription_forClass_CMetInst = get_registerClassDescription_forClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerClassDescription_forClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		registerClassDescription_forClass_CMetInst.invoke(nativeBuffer);
		
		
	}

}
