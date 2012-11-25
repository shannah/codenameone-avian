package com.apple.jobjc.foundation;

public  class NSExpressionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSExpressionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSExpressionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSExpressionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend expressionForAggregate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForAggregate_CMetInst(){
		return ((expressionForAggregate_CMetInst != null)
	? (expressionForAggregate_CMetInst)
	: (expressionForAggregate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForAggregate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForAggregate(final com.apple.jobjc.foundation.NSArray subexpressions){
			final com.apple.jobjc.Invoke.MsgSend expressionForAggregate_CMetInst = get_expressionForAggregate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForAggregate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subexpressions);
		expressionForAggregate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForBlock_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForBlock_arguments_CMetInst(){
		return ((expressionForBlock_arguments_CMetInst != null)
	? (expressionForBlock_arguments_CMetInst)
	: (expressionForBlock_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForBlock:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForBlock_arguments(final Object /* id(^)(id,NSArray*,NSMutableDictionary*) (@, @) */ block, final com.apple.jobjc.foundation.NSArray arguments){
			final com.apple.jobjc.Invoke.MsgSend expressionForBlock_arguments_CMetInst = get_expressionForBlock_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForBlock_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		expressionForBlock_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForConstantValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForConstantValue_CMetInst(){
		return ((expressionForConstantValue_CMetInst != null)
	? (expressionForConstantValue_CMetInst)
	: (expressionForConstantValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForConstantValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForConstantValue(final com.apple.jobjc.ID obj){
			final com.apple.jobjc.Invoke.MsgSend expressionForConstantValue_CMetInst = get_expressionForConstantValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForConstantValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		expressionForConstantValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForEvaluatedObject_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForEvaluatedObject_CMetInst(){
		return ((expressionForEvaluatedObject_CMetInst != null)
	? (expressionForEvaluatedObject_CMetInst)
	: (expressionForEvaluatedObject_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForEvaluatedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForEvaluatedObject(){
			final com.apple.jobjc.Invoke.MsgSend expressionForEvaluatedObject_CMetInst = get_expressionForEvaluatedObject_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForEvaluatedObject_CMetInst.init(nativeBuffer, this);
		expressionForEvaluatedObject_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForFunction_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForFunction_arguments_CMetInst(){
		return ((expressionForFunction_arguments_CMetInst != null)
	? (expressionForFunction_arguments_CMetInst)
	: (expressionForFunction_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForFunction:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForFunction_arguments(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray parameters){
			final com.apple.jobjc.Invoke.MsgSend expressionForFunction_arguments_CMetInst = get_expressionForFunction_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForFunction_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parameters);
		expressionForFunction_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForFunction_selectorName_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForFunction_selectorName_arguments_CMetInst(){
		return ((expressionForFunction_selectorName_arguments_CMetInst != null)
	? (expressionForFunction_selectorName_arguments_CMetInst)
	: (expressionForFunction_selectorName_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForFunction:selectorName:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForFunction_selectorName_arguments(final com.apple.jobjc.foundation.NSExpression target, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray parameters){
			final com.apple.jobjc.Invoke.MsgSend expressionForFunction_selectorName_arguments_CMetInst = get_expressionForFunction_selectorName_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForFunction_selectorName_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, parameters);
		expressionForFunction_selectorName_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForIntersectSet_with_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForIntersectSet_with_CMetInst(){
		return ((expressionForIntersectSet_with_CMetInst != null)
	? (expressionForIntersectSet_with_CMetInst)
	: (expressionForIntersectSet_with_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForIntersectSet:with:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForIntersectSet_with(final com.apple.jobjc.foundation.NSExpression left, final com.apple.jobjc.foundation.NSExpression right){
			final com.apple.jobjc.Invoke.MsgSend expressionForIntersectSet_with_CMetInst = get_expressionForIntersectSet_with_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForIntersectSet_with_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, left);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, right);
		expressionForIntersectSet_with_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForKeyPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForKeyPath_CMetInst(){
		return ((expressionForKeyPath_CMetInst != null)
	? (expressionForKeyPath_CMetInst)
	: (expressionForKeyPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForKeyPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend expressionForKeyPath_CMetInst = get_expressionForKeyPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForKeyPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		expressionForKeyPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForMinusSet_with_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForMinusSet_with_CMetInst(){
		return ((expressionForMinusSet_with_CMetInst != null)
	? (expressionForMinusSet_with_CMetInst)
	: (expressionForMinusSet_with_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForMinusSet:with:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForMinusSet_with(final com.apple.jobjc.foundation.NSExpression left, final com.apple.jobjc.foundation.NSExpression right){
			final com.apple.jobjc.Invoke.MsgSend expressionForMinusSet_with_CMetInst = get_expressionForMinusSet_with_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForMinusSet_with_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, left);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, right);
		expressionForMinusSet_with_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForSubquery_usingIteratorVariable_predicate_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForSubquery_usingIteratorVariable_predicate_CMetInst(){
		return ((expressionForSubquery_usingIteratorVariable_predicate_CMetInst != null)
	? (expressionForSubquery_usingIteratorVariable_predicate_CMetInst)
	: (expressionForSubquery_usingIteratorVariable_predicate_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForSubquery:usingIteratorVariable:predicate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForSubquery_usingIteratorVariable_predicate(final com.apple.jobjc.foundation.NSExpression expression, final com.apple.jobjc.foundation.NSString variable, final com.apple.jobjc.ID predicate){
			final com.apple.jobjc.Invoke.MsgSend expressionForSubquery_usingIteratorVariable_predicate_CMetInst = get_expressionForSubquery_usingIteratorVariable_predicate_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForSubquery_usingIteratorVariable_predicate_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expression);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, variable);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		expressionForSubquery_usingIteratorVariable_predicate_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForUnionSet_with_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForUnionSet_with_CMetInst(){
		return ((expressionForUnionSet_with_CMetInst != null)
	? (expressionForUnionSet_with_CMetInst)
	: (expressionForUnionSet_with_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForUnionSet:with:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForUnionSet_with(final com.apple.jobjc.foundation.NSExpression left, final com.apple.jobjc.foundation.NSExpression right){
			final com.apple.jobjc.Invoke.MsgSend expressionForUnionSet_with_CMetInst = get_expressionForUnionSet_with_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForUnionSet_with_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, left);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, right);
		expressionForUnionSet_with_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionForVariable_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionForVariable_CMetInst(){
		return ((expressionForVariable_CMetInst != null)
	? (expressionForVariable_CMetInst)
	: (expressionForVariable_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionForVariable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionForVariable(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend expressionForVariable_CMetInst = get_expressionForVariable_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionForVariable_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		expressionForVariable_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public com.apple.jobjc.foundation.NSExpression expressionWithFormat(final com.apple.jobjc.foundation.NSString expressionFormat, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend expressionWithFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionWithFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expressionFormat);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		expressionWithFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionWithFormat_argumentArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionWithFormat_argumentArray_CMetInst(){
		return ((expressionWithFormat_argumentArray_CMetInst != null)
	? (expressionWithFormat_argumentArray_CMetInst)
	: (expressionWithFormat_argumentArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionWithFormat:argumentArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionWithFormat_argumentArray(final com.apple.jobjc.foundation.NSString expressionFormat, final com.apple.jobjc.foundation.NSArray arguments){
			final com.apple.jobjc.Invoke.MsgSend expressionWithFormat_argumentArray_CMetInst = get_expressionWithFormat_argumentArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionWithFormat_argumentArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expressionFormat);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		expressionWithFormat_argumentArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend expressionWithFormat_arguments_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_expressionWithFormat_arguments_CMetInst(){
		return ((expressionWithFormat_arguments_CMetInst != null)
	? (expressionWithFormat_arguments_CMetInst)
	: (expressionWithFormat_arguments_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "expressionWithFormat:arguments:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSExpression expressionWithFormat_arguments(final com.apple.jobjc.foundation.NSString expressionFormat, final Object /* va_list (*, ^{__va_list_tag=II^v^v}) */ argList){
			final com.apple.jobjc.Invoke.MsgSend expressionWithFormat_arguments_CMetInst = get_expressionWithFormat_arguments_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		expressionWithFormat_arguments_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, expressionFormat);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, argList);
		expressionWithFormat_arguments_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSExpression returnValue = (com.apple.jobjc.foundation.NSExpression) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
