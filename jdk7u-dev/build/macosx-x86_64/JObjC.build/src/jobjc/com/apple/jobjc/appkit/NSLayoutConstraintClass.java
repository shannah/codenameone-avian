package com.apple.jobjc.appkit;

public  class NSLayoutConstraintClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSLayoutConstraintClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSLayoutConstraintClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSLayoutConstraintClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst(){
		return ((constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst != null)
	? (constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst)
	: (constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant(final com.apple.jobjc.ID view1, final long attr1, final long relation, final com.apple.jobjc.ID view2, final long attr2, final double multiplier, final double c){
			final com.apple.jobjc.Invoke.MsgSend constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst = get_constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view1);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attr1);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, relation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view2);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, attr2);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, multiplier);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, c);
		constraintWithItem_attribute_relatedBy_toItem_attribute_multiplier_constant_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend constraintsWithVisualFormat_options_metrics_views_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constraintsWithVisualFormat_options_metrics_views_CMetInst(){
		return ((constraintsWithVisualFormat_options_metrics_views_CMetInst != null)
	? (constraintsWithVisualFormat_options_metrics_views_CMetInst)
	: (constraintsWithVisualFormat_options_metrics_views_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constraintsWithVisualFormat:options:metrics:views:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray constraintsWithVisualFormat_options_metrics_views(final com.apple.jobjc.foundation.NSString format, final long opts, final com.apple.jobjc.foundation.NSDictionary metrics, final com.apple.jobjc.foundation.NSDictionary views){
			final com.apple.jobjc.Invoke.MsgSend constraintsWithVisualFormat_options_metrics_views_CMetInst = get_constraintsWithVisualFormat_options_metrics_views_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constraintsWithVisualFormat_options_metrics_views_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, metrics);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, views);
		constraintsWithVisualFormat_options_metrics_views_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
