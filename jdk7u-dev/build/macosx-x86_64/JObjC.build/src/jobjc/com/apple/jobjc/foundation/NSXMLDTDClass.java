package com.apple.jobjc.foundation;

public  class NSXMLDTDClass extends com.apple.jobjc.foundation.NSXMLNodeClass {
	public NSXMLDTDClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSXMLDTDClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSXMLDTDClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend predefinedEntityDeclarationForName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predefinedEntityDeclarationForName_CMetInst(){
		return ((predefinedEntityDeclarationForName_CMetInst != null)
	? (predefinedEntityDeclarationForName_CMetInst)
	: (predefinedEntityDeclarationForName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predefinedEntityDeclarationForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTDNode predefinedEntityDeclarationForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend predefinedEntityDeclarationForName_CMetInst = get_predefinedEntityDeclarationForName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predefinedEntityDeclarationForName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		predefinedEntityDeclarationForName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTDNode returnValue = (com.apple.jobjc.foundation.NSXMLDTDNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
