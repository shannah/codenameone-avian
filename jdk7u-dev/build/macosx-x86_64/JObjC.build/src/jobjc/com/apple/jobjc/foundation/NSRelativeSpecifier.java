package com.apple.jobjc.foundation;

public  class NSRelativeSpecifier extends com.apple.jobjc.foundation.NSScriptObjectSpecifier {
	public NSRelativeSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRelativeSpecifier(final NSRelativeSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend baseSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baseSpecifier_IMetInst(){
		return ((baseSpecifier_IMetInst != null)
	? (baseSpecifier_IMetInst)
	: (baseSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baseSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier baseSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend baseSpecifier_IMetInst = get_baseSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baseSpecifier_IMetInst.init(nativeBuffer, this);
		baseSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:relativePosition:baseSpecifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property, final long relPos, final com.apple.jobjc.foundation.NSScriptObjectSpecifier baseSpecifier){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, relPos);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, baseSpecifier);
		initWithContainerClassDescription_containerSpecifier_key_relativePosition_baseSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend relativePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativePosition_IMetInst(){
		return ((relativePosition_IMetInst != null)
	? (relativePosition_IMetInst)
	: (relativePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativePosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long relativePosition(){
			final com.apple.jobjc.Invoke.MsgSend relativePosition_IMetInst = get_relativePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativePosition_IMetInst.init(nativeBuffer, this);
		relativePosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBaseSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBaseSpecifier_IMetInst(){
		return ((setBaseSpecifier_IMetInst != null)
	? (setBaseSpecifier_IMetInst)
	: (setBaseSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBaseSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBaseSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier baseSpecifier){
			final com.apple.jobjc.Invoke.MsgSend setBaseSpecifier_IMetInst = get_setBaseSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBaseSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, baseSpecifier);
		setBaseSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRelativePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRelativePosition_IMetInst(){
		return ((setRelativePosition_IMetInst != null)
	? (setRelativePosition_IMetInst)
	: (setRelativePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRelativePosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setRelativePosition(final long relPos){
			final com.apple.jobjc.Invoke.MsgSend setRelativePosition_IMetInst = get_setRelativePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRelativePosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, relPos);
		setRelativePosition_IMetInst.invoke(nativeBuffer);
		
		
	}

}
