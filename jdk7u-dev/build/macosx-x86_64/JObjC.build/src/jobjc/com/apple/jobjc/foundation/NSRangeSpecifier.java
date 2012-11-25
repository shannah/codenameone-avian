package com.apple.jobjc.foundation;

public  class NSRangeSpecifier extends com.apple.jobjc.foundation.NSScriptObjectSpecifier {
	public NSRangeSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSRangeSpecifier(final NSRangeSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend endSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endSpecifier_IMetInst(){
		return ((endSpecifier_IMetInst != null)
	? (endSpecifier_IMetInst)
	: (endSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier endSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend endSpecifier_IMetInst = get_endSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endSpecifier_IMetInst.init(nativeBuffer, this);
		endSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:startSpecifier:endSpecifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property, final com.apple.jobjc.foundation.NSScriptObjectSpecifier startSpec, final com.apple.jobjc.foundation.NSScriptObjectSpecifier endSpec){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startSpec);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, endSpec);
		initWithContainerClassDescription_containerSpecifier_key_startSpecifier_endSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setEndSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEndSpecifier_IMetInst(){
		return ((setEndSpecifier_IMetInst != null)
	? (setEndSpecifier_IMetInst)
	: (setEndSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEndSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setEndSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier endSpec){
			final com.apple.jobjc.Invoke.MsgSend setEndSpecifier_IMetInst = get_setEndSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEndSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, endSpec);
		setEndSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStartSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStartSpecifier_IMetInst(){
		return ((setStartSpecifier_IMetInst != null)
	? (setStartSpecifier_IMetInst)
	: (setStartSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStartSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setStartSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier startSpec){
			final com.apple.jobjc.Invoke.MsgSend setStartSpecifier_IMetInst = get_setStartSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStartSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startSpec);
		setStartSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend startSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startSpecifier_IMetInst(){
		return ((startSpecifier_IMetInst != null)
	? (startSpecifier_IMetInst)
	: (startSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier startSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend startSpecifier_IMetInst = get_startSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startSpecifier_IMetInst.init(nativeBuffer, this);
		startSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
