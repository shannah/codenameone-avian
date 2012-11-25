package com.apple.jobjc.foundation;

public  class NSObjectClass extends com.apple.jobjc.NSClass<NSObject> {
	public NSObjectClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSObjectClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSObjectClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend accessInstanceVariablesDirectly_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_accessInstanceVariablesDirectly_CMetInst(){
		return ((accessInstanceVariablesDirectly_CMetInst != null)
	? (accessInstanceVariablesDirectly_CMetInst)
	: (accessInstanceVariablesDirectly_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "accessInstanceVariablesDirectly", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean accessInstanceVariablesDirectly(){
			final com.apple.jobjc.Invoke.MsgSend accessInstanceVariablesDirectly_CMetInst = get_accessInstanceVariablesDirectly_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		accessInstanceVariablesDirectly_CMetInst.init(nativeBuffer, this);
		accessInstanceVariablesDirectly_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alloc_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alloc_CMetInst(){
		return ((alloc_CMetInst != null)
	? (alloc_CMetInst)
	: (alloc_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alloc", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T alloc(){
			final com.apple.jobjc.Invoke.MsgSend alloc_CMetInst = get_alloc_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alloc_CMetInst.init(nativeBuffer, this);
		alloc_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allocWithZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allocWithZone_CMetInst(){
		return ((allocWithZone_CMetInst != null)
	? (allocWithZone_CMetInst)
	: (allocWithZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allocWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T allocWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend allocWithZone_CMetInst = get_allocWithZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allocWithZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		allocWithZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend automaticallyNotifiesObserversForKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticallyNotifiesObserversForKey_CMetInst(){
		return ((automaticallyNotifiesObserversForKey_CMetInst != null)
	? (automaticallyNotifiesObserversForKey_CMetInst)
	: (automaticallyNotifiesObserversForKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticallyNotifiesObserversForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean automaticallyNotifiesObserversForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend automaticallyNotifiesObserversForKey_CMetInst = get_automaticallyNotifiesObserversForKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticallyNotifiesObserversForKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		automaticallyNotifiesObserversForKey_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelPreviousPerformRequestsWithTarget_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelPreviousPerformRequestsWithTarget_CMetInst(){
		return ((cancelPreviousPerformRequestsWithTarget_CMetInst != null)
	? (cancelPreviousPerformRequestsWithTarget_CMetInst)
	: (cancelPreviousPerformRequestsWithTarget_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelPreviousPerformRequestsWithTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelPreviousPerformRequestsWithTarget(final com.apple.jobjc.ID aTarget){
			final com.apple.jobjc.Invoke.MsgSend cancelPreviousPerformRequestsWithTarget_CMetInst = get_cancelPreviousPerformRequestsWithTarget_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelPreviousPerformRequestsWithTarget_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTarget);
		cancelPreviousPerformRequestsWithTarget_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst(){
		return ((cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst != null)
	? (cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst)
	: (cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelPreviousPerformRequestsWithTarget:selector:object:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cancelPreviousPerformRequestsWithTarget_selector_object(final com.apple.jobjc.ID aTarget, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.ID anArgument){
			final com.apple.jobjc.Invoke.MsgSend cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst = get_cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTarget);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anArgument);
		cancelPreviousPerformRequestsWithTarget_selector_object_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend classNSClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNSClass_CMetInst(){
		return ((classNSClass_CMetInst != null)
	? (classNSClass_CMetInst)
	: (classNSClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "class", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classNSClass(){
			final com.apple.jobjc.Invoke.MsgSend classNSClass_CMetInst = get_classNSClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNSClass_CMetInst.init(nativeBuffer, this);
		classNSClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classFallbacksForKeyedArchiver_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classFallbacksForKeyedArchiver_CMetInst(){
		return ((classFallbacksForKeyedArchiver_CMetInst != null)
	? (classFallbacksForKeyedArchiver_CMetInst)
	: (classFallbacksForKeyedArchiver_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classFallbacksForKeyedArchiver", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray classFallbacksForKeyedArchiver(){
			final com.apple.jobjc.Invoke.MsgSend classFallbacksForKeyedArchiver_CMetInst = get_classFallbacksForKeyedArchiver_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classFallbacksForKeyedArchiver_CMetInst.init(nativeBuffer, this);
		classFallbacksForKeyedArchiver_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classForKeyedUnarchiver_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classForKeyedUnarchiver_CMetInst(){
		return ((classForKeyedUnarchiver_CMetInst != null)
	? (classForKeyedUnarchiver_CMetInst)
	: (classForKeyedUnarchiver_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classForKeyedUnarchiver", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classForKeyedUnarchiver(){
			final com.apple.jobjc.Invoke.MsgSend classForKeyedUnarchiver_CMetInst = get_classForKeyedUnarchiver_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classForKeyedUnarchiver_CMetInst.init(nativeBuffer, this);
		classForKeyedUnarchiver_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend conformsToProtocol_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_conformsToProtocol_CMetInst(){
		return ((conformsToProtocol_CMetInst != null)
	? (conformsToProtocol_CMetInst)
	: (conformsToProtocol_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "conformsToProtocol:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public boolean conformsToProtocol(final Object /* Protocol* (@, @) */ protocol){
			final com.apple.jobjc.Invoke.MsgSend conformsToProtocol_CMetInst = get_conformsToProtocol_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		conformsToProtocol_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, protocol);
		conformsToProtocol_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyWithZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyWithZone_CMetInst(){
		return ((copyWithZone_CMetInst != null)
	? (copyWithZone_CMetInst)
	: (copyWithZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T copyWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend copyWithZone_CMetInst = get_copyWithZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyWithZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		copyWithZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend description_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_description_CMetInst(){
		return ((description_CMetInst != null)
	? (description_CMetInst)
	: (description_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "description", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString description(){
			final com.apple.jobjc.Invoke.MsgSend description_CMetInst = get_description_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		description_CMetInst.init(nativeBuffer, this);
		description_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initialize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initialize_CMetInst(){
		return ((initialize_CMetInst != null)
	? (initialize_CMetInst)
	: (initialize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initialize", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void initialize(){
			final com.apple.jobjc.Invoke.MsgSend initialize_CMetInst = get_initialize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initialize_CMetInst.init(nativeBuffer, this);
		initialize_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend instanceMethodForSelector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instanceMethodForSelector_CMetInst(){
		return ((instanceMethodForSelector_CMetInst != null)
	? (instanceMethodForSelector_CMetInst)
	: (instanceMethodForSelector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instanceMethodForSelector:", com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public Object /* IMP (^?, ^?) */ instanceMethodForSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend instanceMethodForSelector_CMetInst = get_instanceMethodForSelector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instanceMethodForSelector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		instanceMethodForSelector_CMetInst.invoke(nativeBuffer);
		final Object /* IMP (^?, ^?) */ returnValue = (Object /* IMP (^?, ^?) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend instanceMethodSignatureForSelector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instanceMethodSignatureForSelector_CMetInst(){
		return ((instanceMethodSignatureForSelector_CMetInst != null)
	? (instanceMethodSignatureForSelector_CMetInst)
	: (instanceMethodSignatureForSelector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instanceMethodSignatureForSelector:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMethodSignature instanceMethodSignatureForSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend instanceMethodSignatureForSelector_CMetInst = get_instanceMethodSignatureForSelector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instanceMethodSignatureForSelector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		instanceMethodSignatureForSelector_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMethodSignature returnValue = (com.apple.jobjc.foundation.NSMethodSignature) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend instancesRespondToSelector_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_instancesRespondToSelector_CMetInst(){
		return ((instancesRespondToSelector_CMetInst != null)
	? (instancesRespondToSelector_CMetInst)
	: (instancesRespondToSelector_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "instancesRespondToSelector:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean instancesRespondToSelector(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend instancesRespondToSelector_CMetInst = get_instancesRespondToSelector_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		instancesRespondToSelector_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		instancesRespondToSelector_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSubclassOfClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSubclassOfClass_CMetInst(){
		return ((isSubclassOfClass_CMetInst != null)
	? (isSubclassOfClass_CMetInst)
	: (isSubclassOfClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSubclassOfClass:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public boolean isSubclassOfClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend isSubclassOfClass_CMetInst = get_isSubclassOfClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSubclassOfClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		isSubclassOfClass_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyPathsForValuesAffectingValueForKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyPathsForValuesAffectingValueForKey_CMetInst(){
		return ((keyPathsForValuesAffectingValueForKey_CMetInst != null)
	? (keyPathsForValuesAffectingValueForKey_CMetInst)
	: (keyPathsForValuesAffectingValueForKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyPathsForValuesAffectingValueForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSSet keyPathsForValuesAffectingValueForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend keyPathsForValuesAffectingValueForKey_CMetInst = get_keyPathsForValuesAffectingValueForKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyPathsForValuesAffectingValueForKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		keyPathsForValuesAffectingValueForKey_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSSet returnValue = (com.apple.jobjc.foundation.NSSet) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend load_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_load_CMetInst(){
		return ((load_CMetInst != null)
	? (load_CMetInst)
	: (load_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "load", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void load(){
			final com.apple.jobjc.Invoke.MsgSend load_CMetInst = get_load_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		load_CMetInst.init(nativeBuffer, this);
		load_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableCopyWithZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableCopyWithZone_CMetInst(){
		return ((mutableCopyWithZone_CMetInst != null)
	? (mutableCopyWithZone_CMetInst)
	: (mutableCopyWithZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableCopyWithZone:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T mutableCopyWithZone(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend mutableCopyWithZone_CMetInst = get_mutableCopyWithZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableCopyWithZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		mutableCopyWithZone_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newID_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newID_CMetInst(){
		return ((newID_CMetInst != null)
	? (newID_CMetInst)
	: (newID_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "new", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T newID(){
			final com.apple.jobjc.Invoke.MsgSend newID_CMetInst = get_newID_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newID_CMetInst.init(nativeBuffer, this);
		newID_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resolveClassMethod_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolveClassMethod_CMetInst(){
		return ((resolveClassMethod_CMetInst != null)
	? (resolveClassMethod_CMetInst)
	: (resolveClassMethod_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolveClassMethod:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean resolveClassMethod(final com.apple.jobjc.SEL sel){
			final com.apple.jobjc.Invoke.MsgSend resolveClassMethod_CMetInst = get_resolveClassMethod_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolveClassMethod_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		resolveClassMethod_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resolveInstanceMethod_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolveInstanceMethod_CMetInst(){
		return ((resolveInstanceMethod_CMetInst != null)
	? (resolveInstanceMethod_CMetInst)
	: (resolveInstanceMethod_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolveInstanceMethod:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public boolean resolveInstanceMethod(final com.apple.jobjc.SEL sel){
			final com.apple.jobjc.Invoke.MsgSend resolveInstanceMethod_CMetInst = get_resolveInstanceMethod_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolveInstanceMethod_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, sel);
		resolveInstanceMethod_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setKeys_triggerChangeNotificationsForDependentKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setKeys_triggerChangeNotificationsForDependentKey_CMetInst(){
		return ((setKeys_triggerChangeNotificationsForDependentKey_CMetInst != null)
	? (setKeys_triggerChangeNotificationsForDependentKey_CMetInst)
	: (setKeys_triggerChangeNotificationsForDependentKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setKeys:triggerChangeNotificationsForDependentKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setKeys_triggerChangeNotificationsForDependentKey(final com.apple.jobjc.foundation.NSArray keys, final com.apple.jobjc.foundation.NSString dependentKey){
			final com.apple.jobjc.Invoke.MsgSend setKeys_triggerChangeNotificationsForDependentKey_CMetInst = get_setKeys_triggerChangeNotificationsForDependentKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setKeys_triggerChangeNotificationsForDependentKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dependentKey);
		setKeys_triggerChangeNotificationsForDependentKey_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVersion_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVersion_CMetInst(){
		return ((setVersion_CMetInst != null)
	? (setVersion_CMetInst)
	: (setVersion_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setVersion(final long aVersion){
			final com.apple.jobjc.Invoke.MsgSend setVersion_CMetInst = get_setVersion_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVersion_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aVersion);
		setVersion_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend superclass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superclass_CMetInst(){
		return ((superclass_CMetInst != null)
	? (superclass_CMetInst)
	: (superclass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superclass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T superclass(){
			final com.apple.jobjc.Invoke.MsgSend superclass_CMetInst = get_superclass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superclass_CMetInst.init(nativeBuffer, this);
		superclass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend supportsSecureCoding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supportsSecureCoding_CMetInst(){
		return ((supportsSecureCoding_CMetInst != null)
	? (supportsSecureCoding_CMetInst)
	: (supportsSecureCoding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supportsSecureCoding", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean supportsSecureCoding(){
			final com.apple.jobjc.Invoke.MsgSend supportsSecureCoding_CMetInst = get_supportsSecureCoding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supportsSecureCoding_CMetInst.init(nativeBuffer, this);
		supportsSecureCoding_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend useStoredAccessor_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useStoredAccessor_CMetInst(){
		return ((useStoredAccessor_CMetInst != null)
	? (useStoredAccessor_CMetInst)
	: (useStoredAccessor_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useStoredAccessor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean useStoredAccessor(){
			final com.apple.jobjc.Invoke.MsgSend useStoredAccessor_CMetInst = get_useStoredAccessor_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useStoredAccessor_CMetInst.init(nativeBuffer, this);
		useStoredAccessor_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend version_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_version_CMetInst(){
		return ((version_CMetInst != null)
	? (version_CMetInst)
	: (version_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "version", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long version(){
			final com.apple.jobjc.Invoke.MsgSend version_CMetInst = get_version_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		version_CMetInst.init(nativeBuffer, this);
		version_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
