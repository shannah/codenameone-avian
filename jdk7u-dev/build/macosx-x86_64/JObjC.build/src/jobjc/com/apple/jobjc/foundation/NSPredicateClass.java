package com.apple.jobjc.foundation;

public  class NSPredicateClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPredicateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPredicateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPredicateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend predicateWithBlock_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithBlock_CMetInst(){
		return ((predicateWithBlock_CMetInst != null)
	? (predicateWithBlock_CMetInst)
	: (predicateWithBlock_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithBlock:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithBlock(final Object /* BOOL(^)(id,NSDictionary*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend predicateWithBlock_CMetInst = get_predicateWithBlock_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithBlock_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		predicateWithBlock_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithFormat(final com.apple.jobjc.foundation.NSString predicateFormat, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend predicateWithFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicateFormat);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		predicateWithFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateWithFormat_argumentArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithFormat_argumentArray_CMetInst(){
		return ((predicateWithFormat_argumentArray_CMetInst != null)
	? (predicateWithFormat_argumentArray_CMetInst)
	: (predicateWithFormat_argumentArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithFormat:argumentArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithFormat_argumentArray(final com.apple.jobjc.foundation.NSString predicateFormat, final com.apple.jobjc.foundation.NSArray arguments){
			final com.apple.jobjc.Invoke.MsgSend predicateWithFormat_argumentArray_CMetInst = get_predicateWithFormat_argumentArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithFormat_argumentArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicateFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		predicateWithFormat_argumentArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateWithFormat_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithFormat_arguments_CMetInst(){
		return ((predicateWithFormat_arguments_CMetInst != null)
	? (predicateWithFormat_arguments_CMetInst)
	: (predicateWithFormat_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithFormat:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithFormat_arguments(final com.apple.jobjc.foundation.NSString predicateFormat, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ argList){
			final com.apple.jobjc.Invoke.MsgSend predicateWithFormat_arguments_CMetInst = get_predicateWithFormat_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithFormat_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicateFormat);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, argList);
		predicateWithFormat_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateWithValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithValue_CMetInst(){
		return ((predicateWithValue_CMetInst != null)
	? (predicateWithValue_CMetInst)
	: (predicateWithValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithValue(final boolean value){
			final com.apple.jobjc.Invoke.MsgSend predicateWithValue_CMetInst = get_predicateWithValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		predicateWithValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
