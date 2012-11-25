package com.apple.jobjc.foundation;

public  class NSCompoundPredicate extends com.apple.jobjc.foundation.NSPredicate {
	public NSCompoundPredicate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCompoundPredicate(final NSCompoundPredicate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend compoundPredicateType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compoundPredicateType_IMetInst(){
		return ((compoundPredicateType_IMetInst != null)
	? (compoundPredicateType_IMetInst)
	: (compoundPredicateType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compoundPredicateType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long compoundPredicateType(){
			final com.apple.jobjc.Invoke.MsgSend compoundPredicateType_IMetInst = get_compoundPredicateType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compoundPredicateType_IMetInst.init(nativeBuffer, this);
		compoundPredicateType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithType_subpredicates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithType_subpredicates_IMetInst(){
		return ((initWithType_subpredicates_IMetInst != null)
	? (initWithType_subpredicates_IMetInst)
	: (initWithType_subpredicates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithType:subpredicates:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithType_subpredicates(final long type, final com.apple.jobjc.foundation.NSArray subpredicates){
			final com.apple.jobjc.Invoke.MsgSend initWithType_subpredicates_IMetInst = get_initWithType_subpredicates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithType_subpredicates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpredicates);
		initWithType_subpredicates_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subpredicates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subpredicates_IMetInst(){
		return ((subpredicates_IMetInst != null)
	? (subpredicates_IMetInst)
	: (subpredicates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subpredicates", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subpredicates(){
			final com.apple.jobjc.Invoke.MsgSend subpredicates_IMetInst = get_subpredicates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subpredicates_IMetInst.init(nativeBuffer, this);
		subpredicates_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
