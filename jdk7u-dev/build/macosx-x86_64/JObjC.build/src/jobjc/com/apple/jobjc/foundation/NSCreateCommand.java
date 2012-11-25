package com.apple.jobjc.foundation;

public  class NSCreateCommand extends com.apple.jobjc.foundation.NSScriptCommand {
	public NSCreateCommand(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCreateCommand(final NSCreateCommand obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend createClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createClassDescription_IMetInst(){
		return ((createClassDescription_IMetInst != null)
	? (createClassDescription_IMetInst)
	: (createClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createClassDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription createClassDescription(){
			final com.apple.jobjc.Invoke.MsgSend createClassDescription_IMetInst = get_createClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createClassDescription_IMetInst.init(nativeBuffer, this);
		createClassDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resolvedKeyDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolvedKeyDictionary_IMetInst(){
		return ((resolvedKeyDictionary_IMetInst != null)
	? (resolvedKeyDictionary_IMetInst)
	: (resolvedKeyDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolvedKeyDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary resolvedKeyDictionary(){
			final com.apple.jobjc.Invoke.MsgSend resolvedKeyDictionary_IMetInst = get_resolvedKeyDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolvedKeyDictionary_IMetInst.init(nativeBuffer, this);
		resolvedKeyDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
