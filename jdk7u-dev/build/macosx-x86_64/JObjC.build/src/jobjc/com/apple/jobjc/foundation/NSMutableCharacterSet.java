package com.apple.jobjc.foundation;

public  class NSMutableCharacterSet extends com.apple.jobjc.foundation.NSCharacterSet {
	public NSMutableCharacterSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableCharacterSet(final NSMutableCharacterSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addCharactersInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addCharactersInRange_IMetInst(){
		return ((addCharactersInRange_IMetInst != null)
	? (addCharactersInRange_IMetInst)
	: (addCharactersInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addCharactersInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void addCharactersInRange(final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend addCharactersInRange_IMetInst = get_addCharactersInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addCharactersInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		addCharactersInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addCharactersInString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addCharactersInString_IMetInst(){
		return ((addCharactersInString_IMetInst != null)
	? (addCharactersInString_IMetInst)
	: (addCharactersInString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addCharactersInString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addCharactersInString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend addCharactersInString_IMetInst = get_addCharactersInString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addCharactersInString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		addCharactersInString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend formIntersectionWithCharacterSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formIntersectionWithCharacterSet_IMetInst(){
		return ((formIntersectionWithCharacterSet_IMetInst != null)
	? (formIntersectionWithCharacterSet_IMetInst)
	: (formIntersectionWithCharacterSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formIntersectionWithCharacterSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void formIntersectionWithCharacterSet(final com.apple.jobjc.foundation.NSCharacterSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend formIntersectionWithCharacterSet_IMetInst = get_formIntersectionWithCharacterSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formIntersectionWithCharacterSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		formIntersectionWithCharacterSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend formUnionWithCharacterSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_formUnionWithCharacterSet_IMetInst(){
		return ((formUnionWithCharacterSet_IMetInst != null)
	? (formUnionWithCharacterSet_IMetInst)
	: (formUnionWithCharacterSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "formUnionWithCharacterSet:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void formUnionWithCharacterSet(final com.apple.jobjc.foundation.NSCharacterSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend formUnionWithCharacterSet_IMetInst = get_formUnionWithCharacterSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		formUnionWithCharacterSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		formUnionWithCharacterSet_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend invert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_invert_IMetInst(){
		return ((invert_IMetInst != null)
	? (invert_IMetInst)
	: (invert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "invert", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void invert(){
			final com.apple.jobjc.Invoke.MsgSend invert_IMetInst = get_invert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		invert_IMetInst.init(nativeBuffer, this);
		invert_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCharactersInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCharactersInRange_IMetInst(){
		return ((removeCharactersInRange_IMetInst != null)
	? (removeCharactersInRange_IMetInst)
	: (removeCharactersInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCharactersInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void removeCharactersInRange(final com.apple.jobjc.foundation.NSRange aRange){
			final com.apple.jobjc.Invoke.MsgSend removeCharactersInRange_IMetInst = get_removeCharactersInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCharactersInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, aRange);
		removeCharactersInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCharactersInString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCharactersInString_IMetInst(){
		return ((removeCharactersInString_IMetInst != null)
	? (removeCharactersInString_IMetInst)
	: (removeCharactersInString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCharactersInString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeCharactersInString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend removeCharactersInString_IMetInst = get_removeCharactersInString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCharactersInString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		removeCharactersInString_IMetInst.invoke(nativeBuffer);
		
		
	}

}
