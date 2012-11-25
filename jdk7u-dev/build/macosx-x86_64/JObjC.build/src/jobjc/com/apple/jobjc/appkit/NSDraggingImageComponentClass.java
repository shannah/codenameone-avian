package com.apple.jobjc.appkit;

public  class NSDraggingImageComponentClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDraggingImageComponentClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDraggingImageComponentClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDraggingImageComponentClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend draggingImageComponentWithKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingImageComponentWithKey_CMetInst(){
		return ((draggingImageComponentWithKey_CMetInst != null)
	? (draggingImageComponentWithKey_CMetInst)
	: (draggingImageComponentWithKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingImageComponentWithKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T draggingImageComponentWithKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend draggingImageComponentWithKey_CMetInst = get_draggingImageComponentWithKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingImageComponentWithKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		draggingImageComponentWithKey_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
