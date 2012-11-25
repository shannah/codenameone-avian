package com.apple.jobjc.foundation;

public  class NSSortDescriptorClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSortDescriptorClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSortDescriptorClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSortDescriptorClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptorWithKey_ascending_CMetInst(){
		return ((sortDescriptorWithKey_ascending_CMetInst != null)
	? (sortDescriptorWithKey_ascending_CMetInst)
	: (sortDescriptorWithKey_ascending_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptorWithKey:ascending:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sortDescriptorWithKey_ascending(final com.apple.jobjc.foundation.NSString key, final boolean ascending){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_CMetInst = get_sortDescriptorWithKey_ascending_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptorWithKey_ascending_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		sortDescriptorWithKey_ascending_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_comparator_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptorWithKey_ascending_comparator_CMetInst(){
		return ((sortDescriptorWithKey_ascending_comparator_CMetInst != null)
	? (sortDescriptorWithKey_ascending_comparator_CMetInst)
	: (sortDescriptorWithKey_ascending_comparator_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptorWithKey:ascending:comparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sortDescriptorWithKey_ascending_comparator(final com.apple.jobjc.foundation.NSString key, final boolean ascending, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_comparator_CMetInst = get_sortDescriptorWithKey_ascending_comparator_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptorWithKey_ascending_comparator_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		sortDescriptorWithKey_ascending_comparator_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_selector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptorWithKey_ascending_selector_CMetInst(){
		return ((sortDescriptorWithKey_ascending_selector_CMetInst != null)
	? (sortDescriptorWithKey_ascending_selector_CMetInst)
	: (sortDescriptorWithKey_ascending_selector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptorWithKey:ascending:selector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sortDescriptorWithKey_ascending_selector(final com.apple.jobjc.foundation.NSString key, final boolean ascending, final com.apple.jobjc.SEL selector){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptorWithKey_ascending_selector_CMetInst = get_sortDescriptorWithKey_ascending_selector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptorWithKey_ascending_selector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		sortDescriptorWithKey_ascending_selector_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
