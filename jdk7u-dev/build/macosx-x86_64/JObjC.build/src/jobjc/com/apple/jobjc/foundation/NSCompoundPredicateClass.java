package com.apple.jobjc.foundation;

public  class NSCompoundPredicateClass extends com.apple.jobjc.foundation.NSPredicateClass {
	public NSCompoundPredicateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSCompoundPredicateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSCompoundPredicateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend andPredicateWithSubpredicates_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_andPredicateWithSubpredicates_CMetInst(){
		return ((andPredicateWithSubpredicates_CMetInst != null)
	? (andPredicateWithSubpredicates_CMetInst)
	: (andPredicateWithSubpredicates_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "andPredicateWithSubpredicates:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate andPredicateWithSubpredicates(final com.apple.jobjc.foundation.NSArray subpredicates){
			final com.apple.jobjc.Invoke.MsgSend andPredicateWithSubpredicates_CMetInst = get_andPredicateWithSubpredicates_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		andPredicateWithSubpredicates_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpredicates);
		andPredicateWithSubpredicates_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend notPredicateWithSubpredicate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notPredicateWithSubpredicate_CMetInst(){
		return ((notPredicateWithSubpredicate_CMetInst != null)
	? (notPredicateWithSubpredicate_CMetInst)
	: (notPredicateWithSubpredicate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notPredicateWithSubpredicate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate notPredicateWithSubpredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend notPredicateWithSubpredicate_CMetInst = get_notPredicateWithSubpredicate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notPredicateWithSubpredicate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		notPredicateWithSubpredicate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend orPredicateWithSubpredicates_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orPredicateWithSubpredicates_CMetInst(){
		return ((orPredicateWithSubpredicates_CMetInst != null)
	? (orPredicateWithSubpredicates_CMetInst)
	: (orPredicateWithSubpredicates_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orPredicateWithSubpredicates:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate orPredicateWithSubpredicates(final com.apple.jobjc.foundation.NSArray subpredicates){
			final com.apple.jobjc.Invoke.MsgSend orPredicateWithSubpredicates_CMetInst = get_orPredicateWithSubpredicates_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orPredicateWithSubpredicates_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpredicates);
		orPredicateWithSubpredicates_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
