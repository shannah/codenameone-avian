package com.apple.jobjc.foundation;

public  class NSUniqueIDSpecifier extends com.apple.jobjc.foundation.NSScriptObjectSpecifier {
	public NSUniqueIDSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUniqueIDSpecifier(final NSUniqueIDSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:uniqueID:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key_uniqueID(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.ID uniqueID){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, uniqueID);
		initWithContainerClassDescription_containerSpecifier_key_uniqueID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setUniqueID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUniqueID_IMetInst(){
		return ((setUniqueID_IMetInst != null)
	? (setUniqueID_IMetInst)
	: (setUniqueID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUniqueID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setUniqueID(final com.apple.jobjc.ID uniqueID){
			final com.apple.jobjc.Invoke.MsgSend setUniqueID_IMetInst = get_setUniqueID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUniqueID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, uniqueID);
		setUniqueID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend uniqueID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_uniqueID_IMetInst(){
		return ((uniqueID_IMetInst != null)
	? (uniqueID_IMetInst)
	: (uniqueID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "uniqueID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T uniqueID(){
			final com.apple.jobjc.Invoke.MsgSend uniqueID_IMetInst = get_uniqueID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		uniqueID_IMetInst.init(nativeBuffer, this);
		uniqueID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
