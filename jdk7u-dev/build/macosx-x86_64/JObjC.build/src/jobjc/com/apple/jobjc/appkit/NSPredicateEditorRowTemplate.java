package com.apple.jobjc.appkit;

public  class NSPredicateEditorRowTemplate extends com.apple.jobjc.foundation.NSObject {
	public NSPredicateEditorRowTemplate(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSPredicateEditorRowTemplate(final NSPredicateEditorRowTemplate obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend compoundTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_compoundTypes_IMetInst(){
		return ((compoundTypes_IMetInst != null)
	? (compoundTypes_IMetInst)
	: (compoundTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "compoundTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray compoundTypes(){
			final com.apple.jobjc.Invoke.MsgSend compoundTypes_IMetInst = get_compoundTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		compoundTypes_IMetInst.init(nativeBuffer, this);
		compoundTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayableSubpredicatesOfPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayableSubpredicatesOfPredicate_IMetInst(){
		return ((displayableSubpredicatesOfPredicate_IMetInst != null)
	? (displayableSubpredicatesOfPredicate_IMetInst)
	: (displayableSubpredicatesOfPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayableSubpredicatesOfPredicate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray displayableSubpredicatesOfPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend displayableSubpredicatesOfPredicate_IMetInst = get_displayableSubpredicatesOfPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayableSubpredicatesOfPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		displayableSubpredicatesOfPredicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithCompoundTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithCompoundTypes_IMetInst(){
		return ((initWithCompoundTypes_IMetInst != null)
	? (initWithCompoundTypes_IMetInst)
	: (initWithCompoundTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithCompoundTypes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithCompoundTypes(final com.apple.jobjc.foundation.NSArray compoundTypes){
			final com.apple.jobjc.Invoke.MsgSend initWithCompoundTypes_IMetInst = get_initWithCompoundTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithCompoundTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, compoundTypes);
		initWithCompoundTypes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst(){
		return ((initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst != null)
	? (initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst)
	: (initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLeftExpressions:rightExpressionAttributeType:modifier:operators:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options(final com.apple.jobjc.foundation.NSArray leftExpressions, final long attributeType, final long modifier, final com.apple.jobjc.foundation.NSArray operators, final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst = get_initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, leftExpressions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, attributeType);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, modifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, operators);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithLeftExpressions_rightExpressionAttributeType_modifier_operators_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst(){
		return ((initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst != null)
	? (initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst)
	: (initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithLeftExpressions:rightExpressions:modifier:operators:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithLeftExpressions_rightExpressions_modifier_operators_options(final com.apple.jobjc.foundation.NSArray leftExpressions, final com.apple.jobjc.foundation.NSArray rightExpressions, final long modifier, final com.apple.jobjc.foundation.NSArray operators, final long options){
			final com.apple.jobjc.Invoke.MsgSend initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst = get_initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, leftExpressions);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rightExpressions);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, modifier);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, operators);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		initWithLeftExpressions_rightExpressions_modifier_operators_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leftExpressions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leftExpressions_IMetInst(){
		return ((leftExpressions_IMetInst != null)
	? (leftExpressions_IMetInst)
	: (leftExpressions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leftExpressions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray leftExpressions(){
			final com.apple.jobjc.Invoke.MsgSend leftExpressions_IMetInst = get_leftExpressions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leftExpressions_IMetInst.init(nativeBuffer, this);
		leftExpressions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchForPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchForPredicate_IMetInst(){
		return ((matchForPredicate_IMetInst != null)
	? (matchForPredicate_IMetInst)
	: (matchForPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchForPredicate:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double matchForPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend matchForPredicate_IMetInst = get_matchForPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchForPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		matchForPredicate_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend modifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modifier_IMetInst(){
		return ((modifier_IMetInst != null)
	? (modifier_IMetInst)
	: (modifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modifier", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long modifier(){
			final com.apple.jobjc.Invoke.MsgSend modifier_IMetInst = get_modifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modifier_IMetInst.init(nativeBuffer, this);
		modifier_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend operators_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_operators_IMetInst(){
		return ((operators_IMetInst != null)
	? (operators_IMetInst)
	: (operators_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "operators", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray operators(){
			final com.apple.jobjc.Invoke.MsgSend operators_IMetInst = get_operators_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		operators_IMetInst.init(nativeBuffer, this);
		operators_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend predicateWithSubpredicates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predicateWithSubpredicates_IMetInst(){
		return ((predicateWithSubpredicates_IMetInst != null)
	? (predicateWithSubpredicates_IMetInst)
	: (predicateWithSubpredicates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predicateWithSubpredicates:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate predicateWithSubpredicates(final com.apple.jobjc.foundation.NSArray subpredicates){
			final com.apple.jobjc.Invoke.MsgSend predicateWithSubpredicates_IMetInst = get_predicateWithSubpredicates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predicateWithSubpredicates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpredicates);
		predicateWithSubpredicates_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rightExpressionAttributeType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightExpressionAttributeType_IMetInst(){
		return ((rightExpressionAttributeType_IMetInst != null)
	? (rightExpressionAttributeType_IMetInst)
	: (rightExpressionAttributeType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightExpressionAttributeType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long rightExpressionAttributeType(){
			final com.apple.jobjc.Invoke.MsgSend rightExpressionAttributeType_IMetInst = get_rightExpressionAttributeType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightExpressionAttributeType_IMetInst.init(nativeBuffer, this);
		rightExpressionAttributeType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rightExpressions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rightExpressions_IMetInst(){
		return ((rightExpressions_IMetInst != null)
	? (rightExpressions_IMetInst)
	: (rightExpressions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rightExpressions", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray rightExpressions(){
			final com.apple.jobjc.Invoke.MsgSend rightExpressions_IMetInst = get_rightExpressions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rightExpressions_IMetInst.init(nativeBuffer, this);
		rightExpressions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPredicate_IMetInst(){
		return ((setPredicate_IMetInst != null)
	? (setPredicate_IMetInst)
	: (setPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPredicate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend setPredicate_IMetInst = get_setPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		setPredicate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend templateViews_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_templateViews_IMetInst(){
		return ((templateViews_IMetInst != null)
	? (templateViews_IMetInst)
	: (templateViews_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "templateViews", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray templateViews(){
			final com.apple.jobjc.Invoke.MsgSend templateViews_IMetInst = get_templateViews_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		templateViews_IMetInst.init(nativeBuffer, this);
		templateViews_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
