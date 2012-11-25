package com.apple.jobjc.foundation;

public  class NSXMLDocumentClass extends com.apple.jobjc.foundation.NSXMLNodeClass {
	public NSXMLDocumentClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSXMLDocumentClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSXMLDocumentClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend replacementClassForClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replacementClassForClass_CMetInst(){
		return ((replacementClassForClass_CMetInst != null)
	? (replacementClassForClass_CMetInst)
	: (replacementClassForClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replacementClassForClass:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T replacementClassForClass(final com.apple.jobjc.NSClass cls){
			final com.apple.jobjc.Invoke.MsgSend replacementClassForClass_CMetInst = get_replacementClassForClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replacementClassForClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, cls);
		replacementClassForClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
