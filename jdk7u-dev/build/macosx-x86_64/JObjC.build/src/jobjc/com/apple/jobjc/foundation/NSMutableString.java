package com.apple.jobjc.foundation;

public  class NSMutableString extends com.apple.jobjc.foundation.NSString {
	public NSMutableString(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableString(final NSMutableString obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	 public void appendFormat(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend appendFormat_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendFormat:", com.apple.jobjc.Coder.VoidCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendFormat_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		appendFormat_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend appendString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appendString_IMetInst(){
		return ((appendString_IMetInst != null)
	? (appendString_IMetInst)
	: (appendString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appendString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void appendString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend appendString_IMetInst = get_appendString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appendString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		appendString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend deleteCharactersInRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_deleteCharactersInRange_IMetInst(){
		return ((deleteCharactersInRange_IMetInst != null)
	? (deleteCharactersInRange_IMetInst)
	: (deleteCharactersInRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "deleteCharactersInRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void deleteCharactersInRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend deleteCharactersInRange_IMetInst = get_deleteCharactersInRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		deleteCharactersInRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		deleteCharactersInRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCapacity_IMetInst(){
		return ((initWithCapacity_IMetInst != null)
	? (initWithCapacity_IMetInst)
	: (initWithCapacity_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCapacity:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCapacity(final long capacity){
			final com.apple.jobjc.Invoke.MsgSend initWithCapacity_IMetInst = get_initWithCapacity_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCapacity_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, capacity);
		initWithCapacity_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertString_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertString_atIndex_IMetInst(){
		return ((insertString_atIndex_IMetInst != null)
	? (insertString_atIndex_IMetInst)
	: (insertString_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertString:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertString_atIndex(final com.apple.jobjc.foundation.NSString aString, final long loc){
			final com.apple.jobjc.Invoke.MsgSend insertString_atIndex_IMetInst = get_insertString_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertString_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, loc);
		insertString_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withString_IMetInst(){
		return ((replaceCharactersInRange_withString_IMetInst != null)
	? (replaceCharactersInRange_withString_IMetInst)
	: (replaceCharactersInRange_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst = get_replaceCharactersInRange_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		replaceCharactersInRange_withString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceOccurrencesOfString_withString_options_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceOccurrencesOfString_withString_options_range_IMetInst(){
		return ((replaceOccurrencesOfString_withString_options_range_IMetInst != null)
	? (replaceOccurrencesOfString_withString_options_range_IMetInst)
	: (replaceOccurrencesOfString_withString_options_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceOccurrencesOfString:withString:options:range:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public long replaceOccurrencesOfString_withString_options_range(final com.apple.jobjc.foundation.NSString target, final com.apple.jobjc.foundation.NSString replacement, final long options, final com.apple.jobjc.foundation.NSRange searchRange){
			final com.apple.jobjc.Invoke.MsgSend replaceOccurrencesOfString_withString_options_range_IMetInst = get_replaceOccurrencesOfString_withString_options_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceOccurrencesOfString_withString_options_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, replacement);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, searchRange);
		replaceOccurrencesOfString_withString_options_range_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setString_IMetInst(){
		return ((setString_IMetInst != null)
	? (setString_IMetInst)
	: (setString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setString(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setString_IMetInst = get_setString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setString_IMetInst.invoke(nativeBuffer);
		
		
	}

}
