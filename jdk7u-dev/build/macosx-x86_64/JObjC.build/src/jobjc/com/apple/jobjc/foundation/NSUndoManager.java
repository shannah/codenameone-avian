package com.apple.jobjc.foundation;

public  class NSUndoManager extends com.apple.jobjc.foundation.NSObject {
	public NSUndoManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUndoManager(final NSUndoManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend beginUndoGrouping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginUndoGrouping_IMetInst(){
		return ((beginUndoGrouping_IMetInst != null)
	? (beginUndoGrouping_IMetInst)
	: (beginUndoGrouping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginUndoGrouping", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void beginUndoGrouping(){
			final com.apple.jobjc.Invoke.MsgSend beginUndoGrouping_IMetInst = get_beginUndoGrouping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginUndoGrouping_IMetInst.init(nativeBuffer, this);
		beginUndoGrouping_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canRedo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canRedo_IMetInst(){
		return ((canRedo_IMetInst != null)
	? (canRedo_IMetInst)
	: (canRedo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canRedo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canRedo(){
			final com.apple.jobjc.Invoke.MsgSend canRedo_IMetInst = get_canRedo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canRedo_IMetInst.init(nativeBuffer, this);
		canRedo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canUndo_IMetInst(){
		return ((canUndo_IMetInst != null)
	? (canUndo_IMetInst)
	: (canUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canUndo", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canUndo(){
			final com.apple.jobjc.Invoke.MsgSend canUndo_IMetInst = get_canUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canUndo_IMetInst.init(nativeBuffer, this);
		canUndo_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend disableUndoRegistration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_disableUndoRegistration_IMetInst(){
		return ((disableUndoRegistration_IMetInst != null)
	? (disableUndoRegistration_IMetInst)
	: (disableUndoRegistration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "disableUndoRegistration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void disableUndoRegistration(){
			final com.apple.jobjc.Invoke.MsgSend disableUndoRegistration_IMetInst = get_disableUndoRegistration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		disableUndoRegistration_IMetInst.init(nativeBuffer, this);
		disableUndoRegistration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enableUndoRegistration_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enableUndoRegistration_IMetInst(){
		return ((enableUndoRegistration_IMetInst != null)
	? (enableUndoRegistration_IMetInst)
	: (enableUndoRegistration_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enableUndoRegistration", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void enableUndoRegistration(){
			final com.apple.jobjc.Invoke.MsgSend enableUndoRegistration_IMetInst = get_enableUndoRegistration_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enableUndoRegistration_IMetInst.init(nativeBuffer, this);
		enableUndoRegistration_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend endUndoGrouping_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_endUndoGrouping_IMetInst(){
		return ((endUndoGrouping_IMetInst != null)
	? (endUndoGrouping_IMetInst)
	: (endUndoGrouping_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "endUndoGrouping", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void endUndoGrouping(){
			final com.apple.jobjc.Invoke.MsgSend endUndoGrouping_IMetInst = get_endUndoGrouping_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		endUndoGrouping_IMetInst.init(nativeBuffer, this);
		endUndoGrouping_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend groupingLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupingLevel_IMetInst(){
		return ((groupingLevel_IMetInst != null)
	? (groupingLevel_IMetInst)
	: (groupingLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupingLevel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long groupingLevel(){
			final com.apple.jobjc.Invoke.MsgSend groupingLevel_IMetInst = get_groupingLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupingLevel_IMetInst.init(nativeBuffer, this);
		groupingLevel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend groupsByEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_groupsByEvent_IMetInst(){
		return ((groupsByEvent_IMetInst != null)
	? (groupsByEvent_IMetInst)
	: (groupsByEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "groupsByEvent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean groupsByEvent(){
			final com.apple.jobjc.Invoke.MsgSend groupsByEvent_IMetInst = get_groupsByEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		groupsByEvent_IMetInst.init(nativeBuffer, this);
		groupsByEvent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRedoing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRedoing_IMetInst(){
		return ((isRedoing_IMetInst != null)
	? (isRedoing_IMetInst)
	: (isRedoing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRedoing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRedoing(){
			final com.apple.jobjc.Invoke.MsgSend isRedoing_IMetInst = get_isRedoing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRedoing_IMetInst.init(nativeBuffer, this);
		isRedoing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isUndoRegistrationEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isUndoRegistrationEnabled_IMetInst(){
		return ((isUndoRegistrationEnabled_IMetInst != null)
	? (isUndoRegistrationEnabled_IMetInst)
	: (isUndoRegistrationEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isUndoRegistrationEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isUndoRegistrationEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isUndoRegistrationEnabled_IMetInst = get_isUndoRegistrationEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isUndoRegistrationEnabled_IMetInst.init(nativeBuffer, this);
		isUndoRegistrationEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isUndoing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isUndoing_IMetInst(){
		return ((isUndoing_IMetInst != null)
	? (isUndoing_IMetInst)
	: (isUndoing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isUndoing", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isUndoing(){
			final com.apple.jobjc.Invoke.MsgSend isUndoing_IMetInst = get_isUndoing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isUndoing_IMetInst.init(nativeBuffer, this);
		isUndoing_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend levelsOfUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_levelsOfUndo_IMetInst(){
		return ((levelsOfUndo_IMetInst != null)
	? (levelsOfUndo_IMetInst)
	: (levelsOfUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "levelsOfUndo", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long levelsOfUndo(){
			final com.apple.jobjc.Invoke.MsgSend levelsOfUndo_IMetInst = get_levelsOfUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		levelsOfUndo_IMetInst.init(nativeBuffer, this);
		levelsOfUndo_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareWithInvocationTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareWithInvocationTarget_IMetInst(){
		return ((prepareWithInvocationTarget_IMetInst != null)
	? (prepareWithInvocationTarget_IMetInst)
	: (prepareWithInvocationTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareWithInvocationTarget:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T prepareWithInvocationTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend prepareWithInvocationTarget_IMetInst = get_prepareWithInvocationTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareWithInvocationTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		prepareWithInvocationTarget_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redo_IMetInst(){
		return ((redo_IMetInst != null)
	? (redo_IMetInst)
	: (redo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redo", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void redo(){
			final com.apple.jobjc.Invoke.MsgSend redo_IMetInst = get_redo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redo_IMetInst.init(nativeBuffer, this);
		redo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend redoActionIsDiscardable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redoActionIsDiscardable_IMetInst(){
		return ((redoActionIsDiscardable_IMetInst != null)
	? (redoActionIsDiscardable_IMetInst)
	: (redoActionIsDiscardable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redoActionIsDiscardable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean redoActionIsDiscardable(){
			final com.apple.jobjc.Invoke.MsgSend redoActionIsDiscardable_IMetInst = get_redoActionIsDiscardable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redoActionIsDiscardable_IMetInst.init(nativeBuffer, this);
		redoActionIsDiscardable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redoActionName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redoActionName_IMetInst(){
		return ((redoActionName_IMetInst != null)
	? (redoActionName_IMetInst)
	: (redoActionName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redoActionName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString redoActionName(){
			final com.apple.jobjc.Invoke.MsgSend redoActionName_IMetInst = get_redoActionName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redoActionName_IMetInst.init(nativeBuffer, this);
		redoActionName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redoMenuItemTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redoMenuItemTitle_IMetInst(){
		return ((redoMenuItemTitle_IMetInst != null)
	? (redoMenuItemTitle_IMetInst)
	: (redoMenuItemTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redoMenuItemTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString redoMenuItemTitle(){
			final com.apple.jobjc.Invoke.MsgSend redoMenuItemTitle_IMetInst = get_redoMenuItemTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redoMenuItemTitle_IMetInst.init(nativeBuffer, this);
		redoMenuItemTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend redoMenuTitleForUndoActionName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_redoMenuTitleForUndoActionName_IMetInst(){
		return ((redoMenuTitleForUndoActionName_IMetInst != null)
	? (redoMenuTitleForUndoActionName_IMetInst)
	: (redoMenuTitleForUndoActionName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "redoMenuTitleForUndoActionName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString redoMenuTitleForUndoActionName(final com.apple.jobjc.foundation.NSString actionName){
			final com.apple.jobjc.Invoke.MsgSend redoMenuTitleForUndoActionName_IMetInst = get_redoMenuTitleForUndoActionName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		redoMenuTitleForUndoActionName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, actionName);
		redoMenuTitleForUndoActionName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerUndoWithTarget_selector_object_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerUndoWithTarget_selector_object_IMetInst(){
		return ((registerUndoWithTarget_selector_object_IMetInst != null)
	? (registerUndoWithTarget_selector_object_IMetInst)
	: (registerUndoWithTarget_selector_object_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerUndoWithTarget:selector:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerUndoWithTarget_selector_object(final com.apple.jobjc.ID target, final com.apple.jobjc.SEL selector, final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend registerUndoWithTarget_selector_object_IMetInst = get_registerUndoWithTarget_selector_object_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerUndoWithTarget_selector_object_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, selector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		registerUndoWithTarget_selector_object_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllActions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllActions_IMetInst(){
		return ((removeAllActions_IMetInst != null)
	? (removeAllActions_IMetInst)
	: (removeAllActions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllActions", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllActions(){
			final com.apple.jobjc.Invoke.MsgSend removeAllActions_IMetInst = get_removeAllActions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllActions_IMetInst.init(nativeBuffer, this);
		removeAllActions_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllActionsWithTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllActionsWithTarget_IMetInst(){
		return ((removeAllActionsWithTarget_IMetInst != null)
	? (removeAllActionsWithTarget_IMetInst)
	: (removeAllActionsWithTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllActionsWithTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeAllActionsWithTarget(final com.apple.jobjc.ID target){
			final com.apple.jobjc.Invoke.MsgSend removeAllActionsWithTarget_IMetInst = get_removeAllActionsWithTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllActionsWithTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		removeAllActionsWithTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runLoopModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runLoopModes_IMetInst(){
		return ((runLoopModes_IMetInst != null)
	? (runLoopModes_IMetInst)
	: (runLoopModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runLoopModes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray runLoopModes(){
			final com.apple.jobjc.Invoke.MsgSend runLoopModes_IMetInst = get_runLoopModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runLoopModes_IMetInst.init(nativeBuffer, this);
		runLoopModes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setActionIsDiscardable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setActionIsDiscardable_IMetInst(){
		return ((setActionIsDiscardable_IMetInst != null)
	? (setActionIsDiscardable_IMetInst)
	: (setActionIsDiscardable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setActionIsDiscardable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setActionIsDiscardable(final boolean discardable){
			final com.apple.jobjc.Invoke.MsgSend setActionIsDiscardable_IMetInst = get_setActionIsDiscardable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setActionIsDiscardable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, discardable);
		setActionIsDiscardable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setActionName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setActionName_IMetInst(){
		return ((setActionName_IMetInst != null)
	? (setActionName_IMetInst)
	: (setActionName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setActionName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setActionName(final com.apple.jobjc.foundation.NSString actionName){
			final com.apple.jobjc.Invoke.MsgSend setActionName_IMetInst = get_setActionName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setActionName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, actionName);
		setActionName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setGroupsByEvent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setGroupsByEvent_IMetInst(){
		return ((setGroupsByEvent_IMetInst != null)
	? (setGroupsByEvent_IMetInst)
	: (setGroupsByEvent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setGroupsByEvent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setGroupsByEvent(final boolean groupsByEvent){
			final com.apple.jobjc.Invoke.MsgSend setGroupsByEvent_IMetInst = get_setGroupsByEvent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setGroupsByEvent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, groupsByEvent);
		setGroupsByEvent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLevelsOfUndo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLevelsOfUndo_IMetInst(){
		return ((setLevelsOfUndo_IMetInst != null)
	? (setLevelsOfUndo_IMetInst)
	: (setLevelsOfUndo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLevelsOfUndo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLevelsOfUndo(final long levels){
			final com.apple.jobjc.Invoke.MsgSend setLevelsOfUndo_IMetInst = get_setLevelsOfUndo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLevelsOfUndo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, levels);
		setLevelsOfUndo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRunLoopModes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRunLoopModes_IMetInst(){
		return ((setRunLoopModes_IMetInst != null)
	? (setRunLoopModes_IMetInst)
	: (setRunLoopModes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRunLoopModes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRunLoopModes(final com.apple.jobjc.foundation.NSArray runLoopModes){
			final com.apple.jobjc.Invoke.MsgSend setRunLoopModes_IMetInst = get_setRunLoopModes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRunLoopModes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, runLoopModes);
		setRunLoopModes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend undo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undo_IMetInst(){
		return ((undo_IMetInst != null)
	? (undo_IMetInst)
	: (undo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undo", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void undo(){
			final com.apple.jobjc.Invoke.MsgSend undo_IMetInst = get_undo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undo_IMetInst.init(nativeBuffer, this);
		undo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend undoActionIsDiscardable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoActionIsDiscardable_IMetInst(){
		return ((undoActionIsDiscardable_IMetInst != null)
	? (undoActionIsDiscardable_IMetInst)
	: (undoActionIsDiscardable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoActionIsDiscardable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean undoActionIsDiscardable(){
			final com.apple.jobjc.Invoke.MsgSend undoActionIsDiscardable_IMetInst = get_undoActionIsDiscardable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoActionIsDiscardable_IMetInst.init(nativeBuffer, this);
		undoActionIsDiscardable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend undoActionName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoActionName_IMetInst(){
		return ((undoActionName_IMetInst != null)
	? (undoActionName_IMetInst)
	: (undoActionName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoActionName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString undoActionName(){
			final com.apple.jobjc.Invoke.MsgSend undoActionName_IMetInst = get_undoActionName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoActionName_IMetInst.init(nativeBuffer, this);
		undoActionName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend undoMenuItemTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoMenuItemTitle_IMetInst(){
		return ((undoMenuItemTitle_IMetInst != null)
	? (undoMenuItemTitle_IMetInst)
	: (undoMenuItemTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoMenuItemTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString undoMenuItemTitle(){
			final com.apple.jobjc.Invoke.MsgSend undoMenuItemTitle_IMetInst = get_undoMenuItemTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoMenuItemTitle_IMetInst.init(nativeBuffer, this);
		undoMenuItemTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend undoMenuTitleForUndoActionName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoMenuTitleForUndoActionName_IMetInst(){
		return ((undoMenuTitleForUndoActionName_IMetInst != null)
	? (undoMenuTitleForUndoActionName_IMetInst)
	: (undoMenuTitleForUndoActionName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoMenuTitleForUndoActionName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString undoMenuTitleForUndoActionName(final com.apple.jobjc.foundation.NSString actionName){
			final com.apple.jobjc.Invoke.MsgSend undoMenuTitleForUndoActionName_IMetInst = get_undoMenuTitleForUndoActionName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoMenuTitleForUndoActionName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, actionName);
		undoMenuTitleForUndoActionName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend undoNestedGroup_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_undoNestedGroup_IMetInst(){
		return ((undoNestedGroup_IMetInst != null)
	? (undoNestedGroup_IMetInst)
	: (undoNestedGroup_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "undoNestedGroup", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void undoNestedGroup(){
			final com.apple.jobjc.Invoke.MsgSend undoNestedGroup_IMetInst = get_undoNestedGroup_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		undoNestedGroup_IMetInst.init(nativeBuffer, this);
		undoNestedGroup_IMetInst.invoke(nativeBuffer);
		
		
	}

}
