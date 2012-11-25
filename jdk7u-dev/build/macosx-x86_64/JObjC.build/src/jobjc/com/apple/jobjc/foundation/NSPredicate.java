package com.apple.jobjc.foundation;

public  class NSPredicate extends com.apple.jobjc.foundation.NSObject {
	public NSPredicate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPredicate(final NSPredicate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend evaluateWithObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluateWithObject_IMetInst(){
		return ((evaluateWithObject_IMetInst != null)
	? (evaluateWithObject_IMetInst)
	: (evaluateWithObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluateWithObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean evaluateWithObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend evaluateWithObject_IMetInst = get_evaluateWithObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluateWithObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		evaluateWithObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evaluateWithObject_substitutionVariables_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluateWithObject_substitutionVariables_IMetInst(){
		return ((evaluateWithObject_substitutionVariables_IMetInst != null)
	? (evaluateWithObject_substitutionVariables_IMetInst)
	: (evaluateWithObject_substitutionVariables_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluateWithObject:substitutionVariables:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean evaluateWithObject_substitutionVariables(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSDictionary bindings){
			final com.apple.jobjc.Invoke.MsgSend evaluateWithObject_substitutionVariables_IMetInst = get_evaluateWithObject_substitutionVariables_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluateWithObject_substitutionVariables_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bindings);
		evaluateWithObject_substitutionVariables_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateFormat_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateFormat_IMetInst(){
		return ((predicateFormat_IMetInst != null)
	? (predicateFormat_IMetInst)
	: (predicateFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateFormat", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString predicateFormat(){
			final com.apple.jobjc.Invoke.MsgSend predicateFormat_IMetInst = get_predicateFormat_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateFormat_IMetInst.init(nativeBuffer, this);
		predicateFormat_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateWithSubstitutionVariables_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithSubstitutionVariables_IMetInst(){
		return ((predicateWithSubstitutionVariables_IMetInst != null)
	? (predicateWithSubstitutionVariables_IMetInst)
	: (predicateWithSubstitutionVariables_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithSubstitutionVariables:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithSubstitutionVariables(final com.apple.jobjc.foundation.NSDictionary variables){
			final com.apple.jobjc.Invoke.MsgSend predicateWithSubstitutionVariables_IMetInst = get_predicateWithSubstitutionVariables_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithSubstitutionVariables_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, variables);
		predicateWithSubstitutionVariables_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
