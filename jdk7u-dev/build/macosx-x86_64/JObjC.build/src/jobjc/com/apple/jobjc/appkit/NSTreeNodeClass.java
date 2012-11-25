package com.apple.jobjc.appkit;

public  class NSTreeNodeClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTreeNodeClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTreeNodeClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTreeNodeClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend treeNodeWithRepresentedObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_treeNodeWithRepresentedObject_CMetInst(){
		return ((treeNodeWithRepresentedObject_CMetInst != null)
	? (treeNodeWithRepresentedObject_CMetInst)
	: (treeNodeWithRepresentedObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "treeNodeWithRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T treeNodeWithRepresentedObject(final com.apple.jobjc.ID modelObject){
			final com.apple.jobjc.Invoke.MsgSend treeNodeWithRepresentedObject_CMetInst = get_treeNodeWithRepresentedObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		treeNodeWithRepresentedObject_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modelObject);
		treeNodeWithRepresentedObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
