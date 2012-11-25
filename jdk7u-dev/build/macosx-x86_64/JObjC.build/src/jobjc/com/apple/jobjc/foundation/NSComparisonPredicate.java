package com.apple.jobjc.foundation;

public  class NSComparisonPredicate extends com.apple.jobjc.foundation.NSPredicate {
	public NSComparisonPredicate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSComparisonPredicate(final NSComparisonPredicate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend comparisonPredicateModifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_comparisonPredicateModifier_IMetInst(){
		return ((comparisonPredicateModifier_IMetInst != null)
	? (comparisonPredicateModifier_IMetInst)
	: (comparisonPredicateModifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "comparisonPredicateModifier", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long comparisonPredicateModifier(){
			final com.apple.jobjc.Invoke.MsgSend comparisonPredicateModifier_IMetInst = get_comparisonPredicateModifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		comparisonPredicateModifier_IMetInst.init(nativeBuffer, this);
		comparisonPredicateModifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend customSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_customSelector_IMetInst(){
		return ((customSelector_IMetInst != null)
	? (customSelector_IMetInst)
	: (customSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "customSelector", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL customSelector(){
			final com.apple.jobjc.Invoke.MsgSend customSelector_IMetInst = get_customSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		customSelector_IMetInst.init(nativeBuffer, this);
		customSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLeftExpression_rightExpression_customSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLeftExpression_rightExpression_customSelector_IMetInst(){
		return ((initWithLeftExpression_rightExpression_customSelector_IMetInst != null)
	? (initWithLeftExpression_rightExpression_customSelector_IMetInst)
	: (initWithLeftExpression_rightExpression_customSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLeftExpression:rightExpression:customSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLeftExpression_rightExpression_customSelector(final com.apple.jobjc.foundation.NSExpression lhs, final com.apple.jobjc.foundation.NSExpression rhs, final com.apple.jobjc.SEL selector){
			final com.apple.jobjc.Invoke.MsgSend initWithLeftExpression_rightExpression_customSelector_IMetInst = get_initWithLeftExpression_rightExpression_customSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLeftExpression_rightExpression_customSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lhs);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rhs);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		initWithLeftExpression_rightExpression_customSelector_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLeftExpression_rightExpression_modifier_type_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLeftExpression_rightExpression_modifier_type_options_IMetInst(){
		return ((initWithLeftExpression_rightExpression_modifier_type_options_IMetInst != null)
	? (initWithLeftExpression_rightExpression_modifier_type_options_IMetInst)
	: (initWithLeftExpression_rightExpression_modifier_type_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLeftExpression:rightExpression:modifier:type:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLeftExpression_rightExpression_modifier_type_options(final com.apple.jobjc.foundation.NSExpression lhs, final com.apple.jobjc.foundation.NSExpression rhs, final long modifier, final long type, final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithLeftExpression_rightExpression_modifier_type_options_IMetInst = get_initWithLeftExpression_rightExpression_modifier_type_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLeftExpression_rightExpression_modifier_type_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lhs);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rhs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, modifier);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithLeftExpression_rightExpression_modifier_type_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_options_IMetInst(){
		return ((options_IMetInst != null)
	? (options_IMetInst)
	: (options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "options", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long options(){
			final com.apple.jobjc.Invoke.MsgSend options_IMetInst = get_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		options_IMetInst.init(nativeBuffer, this);
		options_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateOperatorType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateOperatorType_IMetInst(){
		return ((predicateOperatorType_IMetInst != null)
	? (predicateOperatorType_IMetInst)
	: (predicateOperatorType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateOperatorType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long predicateOperatorType(){
			final com.apple.jobjc.Invoke.MsgSend predicateOperatorType_IMetInst = get_predicateOperatorType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateOperatorType_IMetInst.init(nativeBuffer, this);
		predicateOperatorType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

}
