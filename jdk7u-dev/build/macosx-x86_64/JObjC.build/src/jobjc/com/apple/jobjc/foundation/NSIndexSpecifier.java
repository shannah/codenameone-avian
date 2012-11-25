package com.apple.jobjc.foundation;

public  class NSIndexSpecifier extends com.apple.jobjc.foundation.NSScriptObjectSpecifier {
	public NSIndexSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSIndexSpecifier(final NSIndexSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend index_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_index_IMetInst(){
		return ((index_IMetInst != null)
	? (index_IMetInst)
	: (index_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "index", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long index(){
			final com.apple.jobjc.Invoke.MsgSend index_IMetInst = get_index_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		index_IMetInst.init(nativeBuffer, this);
		index_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_index_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_index_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_index_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_index_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_index_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:index:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key_index(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property, final long index){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_index_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_index_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_index_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		initWithContainerClassDescription_containerSpecifier_key_index_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIndex_IMetInst(){
		return ((setIndex_IMetInst != null)
	? (setIndex_IMetInst)
	: (setIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend setIndex_IMetInst = get_setIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		setIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

}
