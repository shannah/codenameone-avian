package com.apple.jobjc.foundation;

public  class NSExpression extends com.apple.jobjc.foundation.NSObject {
	public NSExpression(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSExpression(final NSExpression obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend arguments_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arguments_IMetInst(){
		return ((arguments_IMetInst != null)
	? (arguments_IMetInst)
	: (arguments_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arguments", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arguments(){
			final com.apple.jobjc.Invoke.MsgSend arguments_IMetInst = get_arguments_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arguments_IMetInst.init(nativeBuffer, this);
		arguments_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collection_IMetInst(){
		return ((collection_IMetInst != null)
	? (collection_IMetInst)
	: (collection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T collection(){
			final com.apple.jobjc.Invoke.MsgSend collection_IMetInst = get_collection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collection_IMetInst.init(nativeBuffer, this);
		collection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend constantValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constantValue_IMetInst(){
		return ((constantValue_IMetInst != null)
	? (constantValue_IMetInst)
	: (constantValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constantValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T constantValue(){
			final com.apple.jobjc.Invoke.MsgSend constantValue_IMetInst = get_constantValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constantValue_IMetInst.init(nativeBuffer, this);
		constantValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionBlock_IMetInst(){
		return ((expressionBlock_IMetInst != null)
	? (expressionBlock_IMetInst)
	: (expressionBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionBlock", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* id(^)(id,NSArray*,NSMutableDictionary*) (@, @) */ expressionBlock(){
			final com.apple.jobjc.Invoke.MsgSend expressionBlock_IMetInst = get_expressionBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionBlock_IMetInst.init(nativeBuffer, this);
		expressionBlock_IMetInst.invoke(nativeBuffer);
		final Object /* id(^)(id,NSArray*,NSMutableDictionary*) (@, @) */ returnValue = (Object /* id(^)(id,NSArray*,NSMutableDictionary*) (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionType_IMetInst(){
		return ((expressionType_IMetInst != null)
	? (expressionType_IMetInst)
	: (expressionType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long expressionType(){
			final com.apple.jobjc.Invoke.MsgSend expressionType_IMetInst = get_expressionType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionType_IMetInst.init(nativeBuffer, this);
		expressionType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionValueWithObject_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionValueWithObject_context_IMetInst(){
		return ((expressionValueWithObject_context_IMetInst != null)
	? (expressionValueWithObject_context_IMetInst)
	: (expressionValueWithObject_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionValueWithObject:context:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T expressionValueWithObject_context(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSMutableDictionary context){
			final com.apple.jobjc.Invoke.MsgSend expressionValueWithObject_context_IMetInst = get_expressionValueWithObject_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionValueWithObject_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		expressionValueWithObject_context_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend function_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_function_IMetInst(){
		return ((function_IMetInst != null)
	? (function_IMetInst)
	: (function_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "function", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString function(){
			final com.apple.jobjc.Invoke.MsgSend function_IMetInst = get_function_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		function_IMetInst.init(nativeBuffer, this);
		function_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithExpressionType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithExpressionType_IMetInst(){
		return ((initWithExpressionType_IMetInst != null)
	? (initWithExpressionType_IMetInst)
	: (initWithExpressionType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithExpressionType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithExpressionType(final long type){
			final com.apple.jobjc.Invoke.MsgSend initWithExpressionType_IMetInst = get_initWithExpressionType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithExpressionType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		initWithExpressionType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyPath_IMetInst(){
		return ((keyPath_IMetInst != null)
	? (keyPath_IMetInst)
	: (keyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString keyPath(){
			final com.apple.jobjc.Invoke.MsgSend keyPath_IMetInst = get_keyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyPath_IMetInst.init(nativeBuffer, this);
		keyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leftExpression_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leftExpression_IMetInst(){
		return ((leftExpression_IMetInst != null)
	? (leftExpression_IMetInst)
	: (leftExpression_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leftExpression", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression leftExpression(){
			final com.apple.jobjc.Invoke.MsgSend leftExpression_IMetInst = get_leftExpression_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leftExpression_IMetInst.init(nativeBuffer, this);
		leftExpression_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operand_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operand_IMetInst(){
		return ((operand_IMetInst != null)
	? (operand_IMetInst)
	: (operand_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operand", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression operand(){
			final com.apple.jobjc.Invoke.MsgSend operand_IMetInst = get_operand_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operand_IMetInst.init(nativeBuffer, this);
		operand_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicate_IMetInst(){
		return ((predicate_IMetInst != null)
	? (predicate_IMetInst)
	: (predicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicate(){
			final com.apple.jobjc.Invoke.MsgSend predicate_IMetInst = get_predicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicate_IMetInst.init(nativeBuffer, this);
		predicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rightExpression_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightExpression_IMetInst(){
		return ((rightExpression_IMetInst != null)
	? (rightExpression_IMetInst)
	: (rightExpression_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightExpression", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression rightExpression(){
			final com.apple.jobjc.Invoke.MsgSend rightExpression_IMetInst = get_rightExpression_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightExpression_IMetInst.init(nativeBuffer, this);
		rightExpression_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend variable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_variable_IMetInst(){
		return ((variable_IMetInst != null)
	? (variable_IMetInst)
	: (variable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "variable", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString variable(){
			final com.apple.jobjc.Invoke.MsgSend variable_IMetInst = get_variable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		variable_IMetInst.init(nativeBuffer, this);
		variable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
