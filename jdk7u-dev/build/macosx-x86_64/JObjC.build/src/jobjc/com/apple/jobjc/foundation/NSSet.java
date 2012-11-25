package com.apple.jobjc.foundation;

public  class NSSet extends com.apple.jobjc.foundation.NSObject {
	public NSSet(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSet(final NSSet obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObserver_forKeyPath_options_context_IMetInst(){
		return ((addObserver_forKeyPath_options_context_IMetInst != null)
	? (addObserver_forKeyPath_options_context_IMetInst)
	: (addObserver_forKeyPath_options_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObserver:forKeyPath:options:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void addObserver_forKeyPath_options_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final long options, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend addObserver_forKeyPath_options_context_IMetInst = get_addObserver_forKeyPath_options_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObserver_forKeyPath_options_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		addObserver_forKeyPath_options_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allObjects_IMetInst(){
		return ((allObjects_IMetInst != null)
	? (allObjects_IMetInst)
	: (allObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allObjects(){
			final com.apple.jobjc.Invoke.MsgSend allObjects_IMetInst = get_allObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allObjects_IMetInst.init(nativeBuffer, this);
		allObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend anyObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_anyObject_IMetInst(){
		return ((anyObject_IMetInst != null)
	? (anyObject_IMetInst)
	: (anyObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "anyObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T anyObject(){
			final com.apple.jobjc.Invoke.MsgSend anyObject_IMetInst = get_anyObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		anyObject_IMetInst.init(nativeBuffer, this);
		anyObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_containsObject_IMetInst(){
		return ((containsObject_IMetInst != null)
	? (containsObject_IMetInst)
	: (containsObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "containsObject:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean containsObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend containsObject_IMetInst = get_containsObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		containsObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		containsObject_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_count_IMetInst(){
		return ((count_IMetInst != null)
	? (count_IMetInst)
	: (count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "count", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long count(){
			final com.apple.jobjc.Invoke.MsgSend count_IMetInst = get_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		count_IMetInst.init(nativeBuffer, this);
		count_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_IMetInst(){
		return ((description_IMetInst != null)
	? (description_IMetInst)
	: (description_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_IMetInst = get_description_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_IMetInst.init(nativeBuffer, this);
		description_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descriptionWithLocale_IMetInst(){
		return ((descriptionWithLocale_IMetInst != null)
	? (descriptionWithLocale_IMetInst)
	: (descriptionWithLocale_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descriptionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString descriptionWithLocale(final com.apple.jobjc.ID locale){
			final com.apple.jobjc.Invoke.MsgSend descriptionWithLocale_IMetInst = get_descriptionWithLocale_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descriptionWithLocale_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		descriptionWithLocale_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateObjectsUsingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateObjectsUsingBlock_IMetInst(){
		return ((enumerateObjectsUsingBlock_IMetInst != null)
	? (enumerateObjectsUsingBlock_IMetInst)
	: (enumerateObjectsUsingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateObjectsUsingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateObjectsUsingBlock(final Object /* void(^)(id,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateObjectsUsingBlock_IMetInst = get_enumerateObjectsUsingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateObjectsUsingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateObjectsUsingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend enumerateObjectsWithOptions_usingBlock_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumerateObjectsWithOptions_usingBlock_IMetInst(){
		return ((enumerateObjectsWithOptions_usingBlock_IMetInst != null)
	? (enumerateObjectsWithOptions_usingBlock_IMetInst)
	: (enumerateObjectsWithOptions_usingBlock_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumerateObjectsWithOptions:usingBlock:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void enumerateObjectsWithOptions_usingBlock(final long opts, final Object /* void(^)(id,BOOL*) (@, @) */ block){
			final com.apple.jobjc.Invoke.MsgSend enumerateObjectsWithOptions_usingBlock_IMetInst = get_enumerateObjectsWithOptions_usingBlock_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumerateObjectsWithOptions_usingBlock_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, block);
		enumerateObjectsWithOptions_usingBlock_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend filteredSetUsingPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filteredSetUsingPredicate_IMetInst(){
		return ((filteredSetUsingPredicate_IMetInst != null)
	? (filteredSetUsingPredicate_IMetInst)
	: (filteredSetUsingPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filteredSetUsingPredicate:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet filteredSetUsingPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend filteredSetUsingPredicate_IMetInst = get_filteredSetUsingPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filteredSetUsingPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		filteredSetUsingPredicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithArray_IMetInst(){
		return ((initWithArray_IMetInst != null)
	? (initWithArray_IMetInst)
	: (initWithArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithArray(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend initWithArray_IMetInst = get_initWithArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		initWithArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects(final com.apple.jobjc.ID firstObj, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend initWithObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObj);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		initWithObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithObjects_count_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithObjects_count_IMetInst(){
		return ((initWithObjects_count_IMetInst != null)
	? (initWithObjects_count_IMetInst)
	: (initWithObjects_count_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithObjects:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithObjects_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend initWithObjects_count_IMetInst = get_initWithObjects_count_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithObjects_count_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		initWithObjects_count_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSet_IMetInst(){
		return ((initWithSet_IMetInst != null)
	? (initWithSet_IMetInst)
	: (initWithSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSet(final com.apple.jobjc.foundation.NSSet set){
			final com.apple.jobjc.Invoke.MsgSend initWithSet_IMetInst = get_initWithSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		initWithSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithSet_copyItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSet_copyItems_IMetInst(){
		return ((initWithSet_copyItems_IMetInst != null)
	? (initWithSet_copyItems_IMetInst)
	: (initWithSet_copyItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSet:copyItems:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSet_copyItems(final com.apple.jobjc.foundation.NSSet set, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend initWithSet_copyItems_IMetInst = get_initWithSet_copyItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSet_copyItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, set);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		initWithSet_copyItems_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend intersectsSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_intersectsSet_IMetInst(){
		return ((intersectsSet_IMetInst != null)
	? (intersectsSet_IMetInst)
	: (intersectsSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "intersectsSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean intersectsSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend intersectsSet_IMetInst = get_intersectsSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		intersectsSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		intersectsSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEqualToSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEqualToSet_IMetInst(){
		return ((isEqualToSet_IMetInst != null)
	? (isEqualToSet_IMetInst)
	: (isEqualToSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEqualToSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isEqualToSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend isEqualToSet_IMetInst = get_isEqualToSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEqualToSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		isEqualToSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubsetOfSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubsetOfSet_IMetInst(){
		return ((isSubsetOfSet_IMetInst != null)
	? (isSubsetOfSet_IMetInst)
	: (isSubsetOfSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubsetOfSet:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isSubsetOfSet(final com.apple.jobjc.foundation.NSSet otherSet){
			final com.apple.jobjc.Invoke.MsgSend isSubsetOfSet_IMetInst = get_isSubsetOfSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubsetOfSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherSet);
		isSubsetOfSet_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeObjectsPerformSelector_IMetInst(){
		return ((makeObjectsPerformSelector_IMetInst != null)
	? (makeObjectsPerformSelector_IMetInst)
	: (makeObjectsPerformSelector_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeObjectsPerformSelector:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void makeObjectsPerformSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_IMetInst = get_makeObjectsPerformSelector_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeObjectsPerformSelector_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		makeObjectsPerformSelector_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_withObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_makeObjectsPerformSelector_withObject_IMetInst(){
		return ((makeObjectsPerformSelector_withObject_IMetInst != null)
	? (makeObjectsPerformSelector_withObject_IMetInst)
	: (makeObjectsPerformSelector_withObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "makeObjectsPerformSelector:withObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void makeObjectsPerformSelector_withObject(final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID argument){
			final com.apple.jobjc.Invoke.MsgSend makeObjectsPerformSelector_withObject_IMetInst = get_makeObjectsPerformSelector_withObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		makeObjectsPerformSelector_withObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		makeObjectsPerformSelector_withObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend member_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_member_IMetInst(){
		return ((member_IMetInst != null)
	? (member_IMetInst)
	: (member_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "member:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T member(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend member_IMetInst = get_member_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		member_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		member_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectEnumerator_IMetInst(){
		return ((objectEnumerator_IMetInst != null)
	? (objectEnumerator_IMetInst)
	: (objectEnumerator_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectEnumerator", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSEnumerator objectEnumerator(){
			final com.apple.jobjc.Invoke.MsgSend objectEnumerator_IMetInst = get_objectEnumerator_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectEnumerator_IMetInst.init(nativeBuffer, this);
		objectEnumerator_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSEnumerator returnValue = (com.apple.jobjc.foundation.NSEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsPassingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsPassingTest_IMetInst(){
		return ((objectsPassingTest_IMetInst != null)
	? (objectsPassingTest_IMetInst)
	: (objectsPassingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsPassingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet objectsPassingTest(final Object /* BOOL(^)(id,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend objectsPassingTest_IMetInst = get_objectsPassingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsPassingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		objectsPassingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectsWithOptions_passingTest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectsWithOptions_passingTest_IMetInst(){
		return ((objectsWithOptions_passingTest_IMetInst != null)
	? (objectsWithOptions_passingTest_IMetInst)
	: (objectsWithOptions_passingTest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectsWithOptions:passingTest:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet objectsWithOptions_passingTest(final long opts, final Object /* BOOL(^)(id,BOOL*) (@, @) */ predicate){
			final com.apple.jobjc.Invoke.MsgSend objectsWithOptions_passingTest_IMetInst = get_objectsWithOptions_passingTest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectsWithOptions_passingTest_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, opts);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, predicate);
		objectsWithOptions_passingTest_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_IMetInst(){
		return ((removeObserver_forKeyPath_IMetInst != null)
	? (removeObserver_forKeyPath_IMetInst)
	: (removeObserver_forKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObserver_forKeyPath(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_IMetInst = get_removeObserver_forKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		removeObserver_forKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObserver_forKeyPath_context_IMetInst(){
		return ((removeObserver_forKeyPath_context_IMetInst != null)
	? (removeObserver_forKeyPath_context_IMetInst)
	: (removeObserver_forKeyPath_context_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObserver:forKeyPath:context:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void removeObserver_forKeyPath_context(final com.apple.jobjc.foundation.NSObject observer, final com.apple.jobjc.foundation.NSString keyPath, final com.apple.jobjc.Pointer<Void> context){
			final com.apple.jobjc.Invoke.MsgSend removeObserver_forKeyPath_context_IMetInst = get_removeObserver_forKeyPath_context_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObserver_forKeyPath_context_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, observer);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, context);
		removeObserver_forKeyPath_context_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setByAddingObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setByAddingObject_IMetInst(){
		return ((setByAddingObject_IMetInst != null)
	? (setByAddingObject_IMetInst)
	: (setByAddingObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setByAddingObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet setByAddingObject(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setByAddingObject_IMetInst = get_setByAddingObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setByAddingObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setByAddingObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setByAddingObjectsFromArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setByAddingObjectsFromArray_IMetInst(){
		return ((setByAddingObjectsFromArray_IMetInst != null)
	? (setByAddingObjectsFromArray_IMetInst)
	: (setByAddingObjectsFromArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setByAddingObjectsFromArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet setByAddingObjectsFromArray(final com.apple.jobjc.foundation.NSArray other){
			final com.apple.jobjc.Invoke.MsgSend setByAddingObjectsFromArray_IMetInst = get_setByAddingObjectsFromArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setByAddingObjectsFromArray_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		setByAddingObjectsFromArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setByAddingObjectsFromSet_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setByAddingObjectsFromSet_IMetInst(){
		return ((setByAddingObjectsFromSet_IMetInst != null)
	? (setByAddingObjectsFromSet_IMetInst)
	: (setByAddingObjectsFromSet_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setByAddingObjectsFromSet:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet setByAddingObjectsFromSet(final com.apple.jobjc.foundation.NSSet other){
			final com.apple.jobjc.Invoke.MsgSend setByAddingObjectsFromSet_IMetInst = get_setByAddingObjectsFromSet_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setByAddingObjectsFromSet_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, other);
		setByAddingObjectsFromSet_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setValue_forKey_IMetInst(){
		return ((setValue_forKey_IMetInst != null)
	? (setValue_forKey_IMetInst)
	: (setValue_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setValue:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setValue_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend setValue_forKey_IMetInst = get_setValue_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setValue_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		setValue_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortedArrayUsingDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortedArrayUsingDescriptors_IMetInst(){
		return ((sortedArrayUsingDescriptors_IMetInst != null)
	? (sortedArrayUsingDescriptors_IMetInst)
	: (sortedArrayUsingDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortedArrayUsingDescriptors:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortedArrayUsingDescriptors(final com.apple.jobjc.foundation.NSArray sortDescriptors){
			final com.apple.jobjc.Invoke.MsgSend sortedArrayUsingDescriptors_IMetInst = get_sortedArrayUsingDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortedArrayUsingDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		sortedArrayUsingDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_valueForKey_IMetInst(){
		return ((valueForKey_IMetInst != null)
	? (valueForKey_IMetInst)
	: (valueForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "valueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T valueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend valueForKey_IMetInst = get_valueForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		valueForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		valueForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
