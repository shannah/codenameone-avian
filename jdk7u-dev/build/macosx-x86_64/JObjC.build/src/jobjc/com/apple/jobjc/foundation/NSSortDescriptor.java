package com.apple.jobjc.foundation;

public  class NSSortDescriptor extends com.apple.jobjc.foundation.NSObject {
	public NSSortDescriptor(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSortDescriptor(final NSSortDescriptor obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend ascending_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ascending_IMetInst(){
		return ((ascending_IMetInst != null)
	? (ascending_IMetInst)
	: (ascending_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ascending", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean ascending(){
			final com.apple.jobjc.Invoke.MsgSend ascending_IMetInst = get_ascending_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ascending_IMetInst.init(nativeBuffer, this);
		ascending_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend comparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comparator_IMetInst(){
		return ((comparator_IMetInst != null)
	? (comparator_IMetInst)
	: (comparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comparator", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSComparator (@, @) */ comparator(){
			final com.apple.jobjc.Invoke.MsgSend comparator_IMetInst = get_comparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comparator_IMetInst.init(nativeBuffer, this);
		comparator_IMetInst.invoke(nativeBuffer);
		final Object /* NSComparator (@, @) */ returnValue = (Object /* NSComparator (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend compareObject_toObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compareObject_toObject_IMetInst(){
		return ((compareObject_toObject_IMetInst != null)
	? (compareObject_toObject_IMetInst)
	: (compareObject_toObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compareObject:toObject:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long compareObject_toObject(final com.apple.jobjc.ID object1, final com.apple.jobjc.ID object2){
			final com.apple.jobjc.Invoke.MsgSend compareObject_toObject_IMetInst = get_compareObject_toObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compareObject_toObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object2);
		compareObject_toObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKey_ascending_IMetInst(){
		return ((initWithKey_ascending_IMetInst != null)
	? (initWithKey_ascending_IMetInst)
	: (initWithKey_ascending_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKey:ascending:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKey_ascending(final com.apple.jobjc.foundation.NSString key, final boolean ascending){
			final com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_IMetInst = get_initWithKey_ascending_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKey_ascending_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		initWithKey_ascending_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_comparator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKey_ascending_comparator_IMetInst(){
		return ((initWithKey_ascending_comparator_IMetInst != null)
	? (initWithKey_ascending_comparator_IMetInst)
	: (initWithKey_ascending_comparator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKey:ascending:comparator:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKey_ascending_comparator(final com.apple.jobjc.foundation.NSString key, final boolean ascending, final Object /* NSComparator (@, @) */ cmptr){
			final com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_comparator_IMetInst = get_initWithKey_ascending_comparator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKey_ascending_comparator_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, cmptr);
		initWithKey_ascending_comparator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_selector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithKey_ascending_selector_IMetInst(){
		return ((initWithKey_ascending_selector_IMetInst != null)
	? (initWithKey_ascending_selector_IMetInst)
	: (initWithKey_ascending_selector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithKey:ascending:selector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithKey_ascending_selector(final com.apple.jobjc.foundation.NSString key, final boolean ascending, final com.apple.jobjc.SEL selector){
			final com.apple.jobjc.Invoke.MsgSend initWithKey_ascending_selector_IMetInst = get_initWithKey_ascending_selector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithKey_ascending_selector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, ascending);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		initWithKey_ascending_selector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_key_IMetInst(){
		return ((key_IMetInst != null)
	? (key_IMetInst)
	: (key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "key", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString key(){
			final com.apple.jobjc.Invoke.MsgSend key_IMetInst = get_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		key_IMetInst.init(nativeBuffer, this);
		key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend reversedSortDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_reversedSortDescriptor_IMetInst(){
		return ((reversedSortDescriptor_IMetInst != null)
	? (reversedSortDescriptor_IMetInst)
	: (reversedSortDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "reversedSortDescriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T reversedSortDescriptor(){
			final com.apple.jobjc.Invoke.MsgSend reversedSortDescriptor_IMetInst = get_reversedSortDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		reversedSortDescriptor_IMetInst.init(nativeBuffer, this);
		reversedSortDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selector_IMetInst(){
		return ((selector_IMetInst != null)
	? (selector_IMetInst)
	: (selector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selector", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL selector(){
			final com.apple.jobjc.Invoke.MsgSend selector_IMetInst = get_selector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selector_IMetInst.init(nativeBuffer, this);
		selector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
