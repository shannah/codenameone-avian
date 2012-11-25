package com.apple.jobjc.foundation;

public  class NSDeleteCommand extends com.apple.jobjc.foundation.NSScriptCommand {
	public NSDeleteCommand(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDeleteCommand(final NSDeleteCommand obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend keySpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keySpecifier_IMetInst(){
		return ((keySpecifier_IMetInst != null)
	? (keySpecifier_IMetInst)
	: (keySpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keySpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier keySpecifier(){
			final com.apple.jobjc.Invoke.MsgSend keySpecifier_IMetInst = get_keySpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keySpecifier_IMetInst.init(nativeBuffer, this);
		keySpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setReceiversSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setReceiversSpecifier_IMetInst(){
		return ((setReceiversSpecifier_IMetInst != null)
	? (setReceiversSpecifier_IMetInst)
	: (setReceiversSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setReceiversSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setReceiversSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier receiversRef){
			final com.apple.jobjc.Invoke.MsgSend setReceiversSpecifier_IMetInst = get_setReceiversSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setReceiversSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, receiversRef);
		setReceiversSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

}
