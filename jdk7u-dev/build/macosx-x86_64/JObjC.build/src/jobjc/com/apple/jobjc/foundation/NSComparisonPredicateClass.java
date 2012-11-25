package com.apple.jobjc.foundation;

public  class NSComparisonPredicateClass extends com.apple.jobjc.foundation.NSPredicateClass {
	public NSComparisonPredicateClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSComparisonPredicateClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSComparisonPredicateClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend predicateWithLeftExpression_rightExpression_customSelector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithLeftExpression_rightExpression_customSelector_CMetInst(){
		return ((predicateWithLeftExpression_rightExpression_customSelector_CMetInst != null)
	? (predicateWithLeftExpression_rightExpression_customSelector_CMetInst)
	: (predicateWithLeftExpression_rightExpression_customSelector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithLeftExpression:rightExpression:customSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithLeftExpression_rightExpression_customSelector(final com.apple.jobjc.foundation.NSExpression lhs, final com.apple.jobjc.foundation.NSExpression rhs, final com.apple.jobjc.SEL selector){
			final com.apple.jobjc.Invoke.MsgSend predicateWithLeftExpression_rightExpression_customSelector_CMetInst = get_predicateWithLeftExpression_rightExpression_customSelector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithLeftExpression_rightExpression_customSelector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lhs);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rhs);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		predicateWithLeftExpression_rightExpression_customSelector_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst(){
		return ((predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst != null)
	? (predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst)
	: (predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithLeftExpression:rightExpression:modifier:type:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithLeftExpression_rightExpression_modifier_type_options(final com.apple.jobjc.foundation.NSExpression lhs, final com.apple.jobjc.foundation.NSExpression rhs, final long modifier, final long type, final long options){
			final com.apple.jobjc.Invoke.MsgSend predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst = get_predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, lhs);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rhs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, modifier);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, type);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		predicateWithLeftExpression_rightExpression_modifier_type_options_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
