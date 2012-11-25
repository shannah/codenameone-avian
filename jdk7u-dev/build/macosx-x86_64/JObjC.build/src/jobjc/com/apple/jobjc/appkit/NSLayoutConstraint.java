package com.apple.jobjc.appkit;

public  class NSLayoutConstraint extends com.apple.jobjc.foundation.NSObject {
	public NSLayoutConstraint(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSLayoutConstraint(final NSLayoutConstraint obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend constant_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_constant_IMetInst(){
		return ((constant_IMetInst != null)
	? (constant_IMetInst)
	: (constant_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "constant", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double constant(){
			final com.apple.jobjc.Invoke.MsgSend constant_IMetInst = get_constant_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		constant_IMetInst.init(nativeBuffer, this);
		constant_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstAttribute_IMetInst(){
		return ((firstAttribute_IMetInst != null)
	? (firstAttribute_IMetInst)
	: (firstAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstAttribute", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long firstAttribute(){
			final com.apple.jobjc.Invoke.MsgSend firstAttribute_IMetInst = get_firstAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstAttribute_IMetInst.init(nativeBuffer, this);
		firstAttribute_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstItem_IMetInst(){
		return ((firstItem_IMetInst != null)
	? (firstItem_IMetInst)
	: (firstItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T firstItem(){
			final com.apple.jobjc.Invoke.MsgSend firstItem_IMetInst = get_firstItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstItem_IMetInst.init(nativeBuffer, this);
		firstItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend multiplier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_multiplier_IMetInst(){
		return ((multiplier_IMetInst != null)
	? (multiplier_IMetInst)
	: (multiplier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "multiplier", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double multiplier(){
			final com.apple.jobjc.Invoke.MsgSend multiplier_IMetInst = get_multiplier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		multiplier_IMetInst.init(nativeBuffer, this);
		multiplier_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend priority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_priority_IMetInst(){
		return ((priority_IMetInst != null)
	? (priority_IMetInst)
	: (priority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "priority", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float priority(){
			final com.apple.jobjc.Invoke.MsgSend priority_IMetInst = get_priority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		priority_IMetInst.init(nativeBuffer, this);
		priority_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend relation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relation_IMetInst(){
		return ((relation_IMetInst != null)
	? (relation_IMetInst)
	: (relation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relation", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long relation(){
			final com.apple.jobjc.Invoke.MsgSend relation_IMetInst = get_relation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relation_IMetInst.init(nativeBuffer, this);
		relation_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondAttribute_IMetInst(){
		return ((secondAttribute_IMetInst != null)
	? (secondAttribute_IMetInst)
	: (secondAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondAttribute", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long secondAttribute(){
			final com.apple.jobjc.Invoke.MsgSend secondAttribute_IMetInst = get_secondAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondAttribute_IMetInst.init(nativeBuffer, this);
		secondAttribute_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend secondItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_secondItem_IMetInst(){
		return ((secondItem_IMetInst != null)
	? (secondItem_IMetInst)
	: (secondItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "secondItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T secondItem(){
			final com.apple.jobjc.Invoke.MsgSend secondItem_IMetInst = get_secondItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		secondItem_IMetInst.init(nativeBuffer, this);
		secondItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setConstant_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setConstant_IMetInst(){
		return ((setConstant_IMetInst != null)
	? (setConstant_IMetInst)
	: (setConstant_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setConstant:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setConstant(final double constant){
			final com.apple.jobjc.Invoke.MsgSend setConstant_IMetInst = get_setConstant_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setConstant_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, constant);
		setConstant_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPriority_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPriority_IMetInst(){
		return ((setPriority_IMetInst != null)
	? (setPriority_IMetInst)
	: (setPriority_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPriority:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setPriority(final float priority){
			final com.apple.jobjc.Invoke.MsgSend setPriority_IMetInst = get_setPriority_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPriority_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, priority);
		setPriority_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShouldBeArchived_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShouldBeArchived_IMetInst(){
		return ((setShouldBeArchived_IMetInst != null)
	? (setShouldBeArchived_IMetInst)
	: (setShouldBeArchived_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShouldBeArchived:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShouldBeArchived(final boolean shouldBeArchived){
			final com.apple.jobjc.Invoke.MsgSend setShouldBeArchived_IMetInst = get_setShouldBeArchived_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShouldBeArchived_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldBeArchived);
		setShouldBeArchived_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend shouldBeArchived_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_shouldBeArchived_IMetInst(){
		return ((shouldBeArchived_IMetInst != null)
	? (shouldBeArchived_IMetInst)
	: (shouldBeArchived_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "shouldBeArchived", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean shouldBeArchived(){
			final com.apple.jobjc.Invoke.MsgSend shouldBeArchived_IMetInst = get_shouldBeArchived_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		shouldBeArchived_IMetInst.init(nativeBuffer, this);
		shouldBeArchived_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
