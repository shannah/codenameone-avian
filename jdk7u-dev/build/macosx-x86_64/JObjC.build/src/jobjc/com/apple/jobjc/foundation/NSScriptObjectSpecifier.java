package com.apple.jobjc.foundation;

public  class NSScriptObjectSpecifier extends com.apple.jobjc.foundation.NSObject {
	public NSScriptObjectSpecifier(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSScriptObjectSpecifier(final NSScriptObjectSpecifier obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend childSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childSpecifier_IMetInst(){
		return ((childSpecifier_IMetInst != null)
	? (childSpecifier_IMetInst)
	: (childSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier childSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend childSpecifier_IMetInst = get_childSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childSpecifier_IMetInst.init(nativeBuffer, this);
		childSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containerClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containerClassDescription_IMetInst(){
		return ((containerClassDescription_IMetInst != null)
	? (containerClassDescription_IMetInst)
	: (containerClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containerClassDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription containerClassDescription(){
			final com.apple.jobjc.Invoke.MsgSend containerClassDescription_IMetInst = get_containerClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containerClassDescription_IMetInst.init(nativeBuffer, this);
		containerClassDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containerIsObjectBeingTested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containerIsObjectBeingTested_IMetInst(){
		return ((containerIsObjectBeingTested_IMetInst != null)
	? (containerIsObjectBeingTested_IMetInst)
	: (containerIsObjectBeingTested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containerIsObjectBeingTested", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean containerIsObjectBeingTested(){
			final com.apple.jobjc.Invoke.MsgSend containerIsObjectBeingTested_IMetInst = get_containerIsObjectBeingTested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containerIsObjectBeingTested_IMetInst.init(nativeBuffer, this);
		containerIsObjectBeingTested_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containerIsRangeContainerObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containerIsRangeContainerObject_IMetInst(){
		return ((containerIsRangeContainerObject_IMetInst != null)
	? (containerIsRangeContainerObject_IMetInst)
	: (containerIsRangeContainerObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containerIsRangeContainerObject", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean containerIsRangeContainerObject(){
			final com.apple.jobjc.Invoke.MsgSend containerIsRangeContainerObject_IMetInst = get_containerIsRangeContainerObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containerIsRangeContainerObject_IMetInst.init(nativeBuffer, this);
		containerIsRangeContainerObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containerSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containerSpecifier_IMetInst(){
		return ((containerSpecifier_IMetInst != null)
	? (containerSpecifier_IMetInst)
	: (containerSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containerSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier containerSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend containerSpecifier_IMetInst = get_containerSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containerSpecifier_IMetInst.init(nativeBuffer, this);
		containerSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptor_IMetInst(){
		return ((descriptor_IMetInst != null)
	? (descriptor_IMetInst)
	: (descriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor(){
			final com.apple.jobjc.Invoke.MsgSend descriptor_IMetInst = get_descriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptor_IMetInst.init(nativeBuffer, this);
		descriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAppleEventDescriptor returnValue = (com.apple.jobjc.foundation.NSAppleEventDescriptor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evaluationErrorNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluationErrorNumber_IMetInst(){
		return ((evaluationErrorNumber_IMetInst != null)
	? (evaluationErrorNumber_IMetInst)
	: (evaluationErrorNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluationErrorNumber", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long evaluationErrorNumber(){
			final com.apple.jobjc.Invoke.MsgSend evaluationErrorNumber_IMetInst = get_evaluationErrorNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluationErrorNumber_IMetInst.init(nativeBuffer, this);
		evaluationErrorNumber_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evaluationErrorSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evaluationErrorSpecifier_IMetInst(){
		return ((evaluationErrorSpecifier_IMetInst != null)
	? (evaluationErrorSpecifier_IMetInst)
	: (evaluationErrorSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evaluationErrorSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptObjectSpecifier evaluationErrorSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend evaluationErrorSpecifier_IMetInst = get_evaluationErrorSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evaluationErrorSpecifier_IMetInst.init(nativeBuffer, this);
		evaluationErrorSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptObjectSpecifier returnValue = (com.apple.jobjc.foundation.NSScriptObjectSpecifier) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indicesOfObjectsByEvaluatingWithContainer_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indicesOfObjectsByEvaluatingWithContainer_count_IMetInst(){
		return ((indicesOfObjectsByEvaluatingWithContainer_count_IMetInst != null)
	? (indicesOfObjectsByEvaluatingWithContainer_count_IMetInst)
	: (indicesOfObjectsByEvaluatingWithContainer_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indicesOfObjectsByEvaluatingWithContainer:count:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Long> indicesOfObjectsByEvaluatingWithContainer_count(final com.apple.jobjc.ID container, final com.apple.jobjc.Pointer<java.lang.Long> count){
			final com.apple.jobjc.Invoke.MsgSend indicesOfObjectsByEvaluatingWithContainer_count_IMetInst = get_indicesOfObjectsByEvaluatingWithContainer_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indicesOfObjectsByEvaluatingWithContainer_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, count);
		indicesOfObjectsByEvaluatingWithContainer_count_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Long> returnValue = (com.apple.jobjc.Pointer<java.lang.Long>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerClassDescription_containerSpecifier_key_IMetInst(){
		return ((initWithContainerClassDescription_containerSpecifier_key_IMetInst != null)
	? (initWithContainerClassDescription_containerSpecifier_key_IMetInst)
	: (initWithContainerClassDescription_containerSpecifier_key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerClassDescription:containerSpecifier:key:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerClassDescription_containerSpecifier_key(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc, final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerClassDescription_containerSpecifier_key_IMetInst = get_initWithContainerClassDescription_containerSpecifier_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerClassDescription_containerSpecifier_key_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		initWithContainerClassDescription_containerSpecifier_key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContainerSpecifier_key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContainerSpecifier_key_IMetInst(){
		return ((initWithContainerSpecifier_key_IMetInst != null)
	? (initWithContainerSpecifier_key_IMetInst)
	: (initWithContainerSpecifier_key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContainerSpecifier:key:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContainerSpecifier_key(final com.apple.jobjc.foundation.NSScriptObjectSpecifier container, final com.apple.jobjc.foundation.NSString property){
			final com.apple.jobjc.Invoke.MsgSend initWithContainerSpecifier_key_IMetInst = get_initWithContainerSpecifier_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContainerSpecifier_key_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, container);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		initWithContainerSpecifier_key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend key_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_key_IMetInst(){
		return ((key_IMetInst != null)
	? (key_IMetInst)
	: (key_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "key", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString key(){
			final com.apple.jobjc.Invoke.MsgSend key_IMetInst = get_key_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		key_IMetInst.init(nativeBuffer, this);
		key_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyClassDescription_IMetInst(){
		return ((keyClassDescription_IMetInst != null)
	? (keyClassDescription_IMetInst)
	: (keyClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyClassDescription", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSScriptClassDescription keyClassDescription(){
			final com.apple.jobjc.Invoke.MsgSend keyClassDescription_IMetInst = get_keyClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyClassDescription_IMetInst.init(nativeBuffer, this);
		keyClassDescription_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSScriptClassDescription returnValue = (com.apple.jobjc.foundation.NSScriptClassDescription) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsByEvaluatingSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsByEvaluatingSpecifier_IMetInst(){
		return ((objectsByEvaluatingSpecifier_IMetInst != null)
	? (objectsByEvaluatingSpecifier_IMetInst)
	: (objectsByEvaluatingSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsByEvaluatingSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectsByEvaluatingSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend objectsByEvaluatingSpecifier_IMetInst = get_objectsByEvaluatingSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsByEvaluatingSpecifier_IMetInst.init(nativeBuffer, this);
		objectsByEvaluatingSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsByEvaluatingWithContainers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsByEvaluatingWithContainers_IMetInst(){
		return ((objectsByEvaluatingWithContainers_IMetInst != null)
	? (objectsByEvaluatingWithContainers_IMetInst)
	: (objectsByEvaluatingWithContainers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsByEvaluatingWithContainers:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectsByEvaluatingWithContainers(final com.apple.jobjc.ID containers){
			final com.apple.jobjc.Invoke.MsgSend objectsByEvaluatingWithContainers_IMetInst = get_objectsByEvaluatingWithContainers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsByEvaluatingWithContainers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, containers);
		objectsByEvaluatingWithContainers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setChildSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setChildSpecifier_IMetInst(){
		return ((setChildSpecifier_IMetInst != null)
	? (setChildSpecifier_IMetInst)
	: (setChildSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setChildSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setChildSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier child){
			final com.apple.jobjc.Invoke.MsgSend setChildSpecifier_IMetInst = get_setChildSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setChildSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		setChildSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContainerClassDescription_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContainerClassDescription_IMetInst(){
		return ((setContainerClassDescription_IMetInst != null)
	? (setContainerClassDescription_IMetInst)
	: (setContainerClassDescription_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContainerClassDescription:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContainerClassDescription(final com.apple.jobjc.foundation.NSScriptClassDescription classDesc){
			final com.apple.jobjc.Invoke.MsgSend setContainerClassDescription_IMetInst = get_setContainerClassDescription_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContainerClassDescription_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, classDesc);
		setContainerClassDescription_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContainerIsObjectBeingTested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContainerIsObjectBeingTested_IMetInst(){
		return ((setContainerIsObjectBeingTested_IMetInst != null)
	? (setContainerIsObjectBeingTested_IMetInst)
	: (setContainerIsObjectBeingTested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContainerIsObjectBeingTested:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContainerIsObjectBeingTested(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setContainerIsObjectBeingTested_IMetInst = get_setContainerIsObjectBeingTested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContainerIsObjectBeingTested_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setContainerIsObjectBeingTested_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContainerIsRangeContainerObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContainerIsRangeContainerObject_IMetInst(){
		return ((setContainerIsRangeContainerObject_IMetInst != null)
	? (setContainerIsRangeContainerObject_IMetInst)
	: (setContainerIsRangeContainerObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContainerIsRangeContainerObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setContainerIsRangeContainerObject(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setContainerIsRangeContainerObject_IMetInst = get_setContainerIsRangeContainerObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContainerIsRangeContainerObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setContainerIsRangeContainerObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContainerSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContainerSpecifier_IMetInst(){
		return ((setContainerSpecifier_IMetInst != null)
	? (setContainerSpecifier_IMetInst)
	: (setContainerSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContainerSpecifier:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContainerSpecifier(final com.apple.jobjc.foundation.NSScriptObjectSpecifier subRef){
			final com.apple.jobjc.Invoke.MsgSend setContainerSpecifier_IMetInst = get_setContainerSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContainerSpecifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subRef);
		setContainerSpecifier_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEvaluationErrorNumber_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEvaluationErrorNumber_IMetInst(){
		return ((setEvaluationErrorNumber_IMetInst != null)
	? (setEvaluationErrorNumber_IMetInst)
	: (setEvaluationErrorNumber_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEvaluationErrorNumber:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setEvaluationErrorNumber(final long error){
			final com.apple.jobjc.Invoke.MsgSend setEvaluationErrorNumber_IMetInst = get_setEvaluationErrorNumber_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEvaluationErrorNumber_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, error);
		setEvaluationErrorNumber_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKey_IMetInst(){
		return ((setKey_IMetInst != null)
	? (setKey_IMetInst)
	: (setKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setKey_IMetInst = get_setKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setKey_IMetInst.invoke(nativeBuffer);
		
		
	}

}
