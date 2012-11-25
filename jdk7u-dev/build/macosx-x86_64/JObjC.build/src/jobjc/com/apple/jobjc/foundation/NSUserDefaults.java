package com.apple.jobjc.foundation;

public  class NSUserDefaults extends com.apple.jobjc.foundation.NSObject {
	public NSUserDefaults(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSUserDefaults(final NSUserDefaults obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForKey_IMetInst(){
		return ((URLForKey_IMetInst != null)
	? (URLForKey_IMetInst)
	: (URLForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend URLForKey_IMetInst = get_URLForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		URLForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addSuiteNamed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSuiteNamed_IMetInst(){
		return ((addSuiteNamed_IMetInst != null)
	? (addSuiteNamed_IMetInst)
	: (addSuiteNamed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSuiteNamed:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addSuiteNamed(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend addSuiteNamed_IMetInst = get_addSuiteNamed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSuiteNamed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		addSuiteNamed_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend arrayForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrayForKey_IMetInst(){
		return ((arrayForKey_IMetInst != null)
	? (arrayForKey_IMetInst)
	: (arrayForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrayForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray arrayForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend arrayForKey_IMetInst = get_arrayForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrayForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		arrayForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boolForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boolForKey_IMetInst(){
		return ((boolForKey_IMetInst != null)
	? (boolForKey_IMetInst)
	: (boolForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boolForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean boolForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend boolForKey_IMetInst = get_boolForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boolForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		boolForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dataForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dataForKey_IMetInst(){
		return ((dataForKey_IMetInst != null)
	? (dataForKey_IMetInst)
	: (dataForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dataForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData dataForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend dataForKey_IMetInst = get_dataForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dataForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		dataForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryForKey_IMetInst(){
		return ((dictionaryForKey_IMetInst != null)
	? (dictionaryForKey_IMetInst)
	: (dictionaryForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend dictionaryForKey_IMetInst = get_dictionaryForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		dictionaryForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryRepresentation_IMetInst(){
		return ((dictionaryRepresentation_IMetInst != null)
	? (dictionaryRepresentation_IMetInst)
	: (dictionaryRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary dictionaryRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend dictionaryRepresentation_IMetInst = get_dictionaryRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryRepresentation_IMetInst.init(nativeBuffer, this);
		dictionaryRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend doubleForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_doubleForKey_IMetInst(){
		return ((doubleForKey_IMetInst != null)
	? (doubleForKey_IMetInst)
	: (doubleForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "doubleForKey:", com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public double doubleForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend doubleForKey_IMetInst = get_doubleForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		doubleForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		doubleForKey_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend floatForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_floatForKey_IMetInst(){
		return ((floatForKey_IMetInst != null)
	? (floatForKey_IMetInst)
	: (floatForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "floatForKey:", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public float floatForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend floatForKey_IMetInst = get_floatForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		floatForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		floatForKey_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend init_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_init_IMetInst(){
		return ((init_IMetInst != null)
	? (init_IMetInst)
	: (init_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "init", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T init(){
			final com.apple.jobjc.Invoke.MsgSend init_IMetInst = get_init_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		init_IMetInst.init(nativeBuffer, this);
		init_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithUser_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithUser_IMetInst(){
		return ((initWithUser_IMetInst != null)
	? (initWithUser_IMetInst)
	: (initWithUser_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithUser:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithUser(final com.apple.jobjc.foundation.NSString username){
			final com.apple.jobjc.Invoke.MsgSend initWithUser_IMetInst = get_initWithUser_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithUser_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, username);
		initWithUser_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend integerForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_integerForKey_IMetInst(){
		return ((integerForKey_IMetInst != null)
	? (integerForKey_IMetInst)
	: (integerForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "integerForKey:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long integerForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend integerForKey_IMetInst = get_integerForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		integerForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		integerForKey_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForKey_IMetInst(){
		return ((objectForKey_IMetInst != null)
	? (objectForKey_IMetInst)
	: (objectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend objectForKey_IMetInst = get_objectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		objectForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectIsForcedForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectIsForcedForKey_IMetInst(){
		return ((objectIsForcedForKey_IMetInst != null)
	? (objectIsForcedForKey_IMetInst)
	: (objectIsForcedForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectIsForcedForKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean objectIsForcedForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend objectIsForcedForKey_IMetInst = get_objectIsForcedForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectIsForcedForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		objectIsForcedForKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectIsForcedForKey_inDomain_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectIsForcedForKey_inDomain_IMetInst(){
		return ((objectIsForcedForKey_inDomain_IMetInst != null)
	? (objectIsForcedForKey_inDomain_IMetInst)
	: (objectIsForcedForKey_inDomain_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectIsForcedForKey:inDomain:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean objectIsForcedForKey_inDomain(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString domain){
			final com.apple.jobjc.Invoke.MsgSend objectIsForcedForKey_inDomain_IMetInst = get_objectIsForcedForKey_inDomain_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectIsForcedForKey_inDomain_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		objectIsForcedForKey_inDomain_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend persistentDomainForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_persistentDomainForName_IMetInst(){
		return ((persistentDomainForName_IMetInst != null)
	? (persistentDomainForName_IMetInst)
	: (persistentDomainForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "persistentDomainForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary persistentDomainForName(final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend persistentDomainForName_IMetInst = get_persistentDomainForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		persistentDomainForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		persistentDomainForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend persistentDomainNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_persistentDomainNames_IMetInst(){
		return ((persistentDomainNames_IMetInst != null)
	? (persistentDomainNames_IMetInst)
	: (persistentDomainNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "persistentDomainNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray persistentDomainNames(){
			final com.apple.jobjc.Invoke.MsgSend persistentDomainNames_IMetInst = get_persistentDomainNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		persistentDomainNames_IMetInst.init(nativeBuffer, this);
		persistentDomainNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend registerDefaults_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_registerDefaults_IMetInst(){
		return ((registerDefaults_IMetInst != null)
	? (registerDefaults_IMetInst)
	: (registerDefaults_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "registerDefaults:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void registerDefaults(final com.apple.jobjc.foundation.NSDictionary registrationDictionary){
			final com.apple.jobjc.Invoke.MsgSend registerDefaults_IMetInst = get_registerDefaults_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		registerDefaults_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, registrationDictionary);
		registerDefaults_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectForKey_IMetInst(){
		return ((removeObjectForKey_IMetInst != null)
	? (removeObjectForKey_IMetInst)
	: (removeObjectForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectForKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend removeObjectForKey_IMetInst = get_removeObjectForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		removeObjectForKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removePersistentDomainForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removePersistentDomainForName_IMetInst(){
		return ((removePersistentDomainForName_IMetInst != null)
	? (removePersistentDomainForName_IMetInst)
	: (removePersistentDomainForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removePersistentDomainForName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removePersistentDomainForName(final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend removePersistentDomainForName_IMetInst = get_removePersistentDomainForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removePersistentDomainForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		removePersistentDomainForName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeSuiteNamed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeSuiteNamed_IMetInst(){
		return ((removeSuiteNamed_IMetInst != null)
	? (removeSuiteNamed_IMetInst)
	: (removeSuiteNamed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeSuiteNamed:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeSuiteNamed(final com.apple.jobjc.foundation.NSString suiteName){
			final com.apple.jobjc.Invoke.MsgSend removeSuiteNamed_IMetInst = get_removeSuiteNamed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeSuiteNamed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, suiteName);
		removeSuiteNamed_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeVolatileDomainForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeVolatileDomainForName_IMetInst(){
		return ((removeVolatileDomainForName_IMetInst != null)
	? (removeVolatileDomainForName_IMetInst)
	: (removeVolatileDomainForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeVolatileDomainForName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeVolatileDomainForName(final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend removeVolatileDomainForName_IMetInst = get_removeVolatileDomainForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeVolatileDomainForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		removeVolatileDomainForName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBool_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBool_forKey_IMetInst(){
		return ((setBool_forKey_IMetInst != null)
	? (setBool_forKey_IMetInst)
	: (setBool_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBool:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBool_forKey(final boolean value, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setBool_forKey_IMetInst = get_setBool_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBool_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setBool_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDouble_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDouble_forKey_IMetInst(){
		return ((setDouble_forKey_IMetInst != null)
	? (setDouble_forKey_IMetInst)
	: (setDouble_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDouble:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDouble_forKey(final double value, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setDouble_forKey_IMetInst = get_setDouble_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDouble_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.DoubleCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setDouble_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFloat_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFloat_forKey_IMetInst(){
		return ((setFloat_forKey_IMetInst != null)
	? (setFloat_forKey_IMetInst)
	: (setFloat_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFloat:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFloat_forKey(final float value, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setFloat_forKey_IMetInst = get_setFloat_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFloat_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setFloat_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setInteger_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setInteger_forKey_IMetInst(){
		return ((setInteger_forKey_IMetInst != null)
	? (setInteger_forKey_IMetInst)
	: (setInteger_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setInteger:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setInteger_forKey(final long value, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setInteger_forKey_IMetInst = get_setInteger_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setInteger_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setInteger_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObject_forKey_IMetInst(){
		return ((setObject_forKey_IMetInst != null)
	? (setObject_forKey_IMetInst)
	: (setObject_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObject:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObject_forKey(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setObject_forKey_IMetInst = get_setObject_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObject_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setObject_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPersistentDomain_forName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPersistentDomain_forName_IMetInst(){
		return ((setPersistentDomain_forName_IMetInst != null)
	? (setPersistentDomain_forName_IMetInst)
	: (setPersistentDomain_forName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPersistentDomain:forName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPersistentDomain_forName(final com.apple.jobjc.foundation.NSDictionary domain, final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend setPersistentDomain_forName_IMetInst = get_setPersistentDomain_forName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPersistentDomain_forName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		setPersistentDomain_forName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setURL_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setURL_forKey_IMetInst(){
		return ((setURL_forKey_IMetInst != null)
	? (setURL_forKey_IMetInst)
	: (setURL_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setURL:forKey:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setURL_forKey(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend setURL_forKey_IMetInst = get_setURL_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setURL_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		setURL_forKey_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVolatileDomain_forName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVolatileDomain_forName_IMetInst(){
		return ((setVolatileDomain_forName_IMetInst != null)
	? (setVolatileDomain_forName_IMetInst)
	: (setVolatileDomain_forName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVolatileDomain:forName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVolatileDomain_forName(final com.apple.jobjc.foundation.NSDictionary domain, final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend setVolatileDomain_forName_IMetInst = get_setVolatileDomain_forName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVolatileDomain_forName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domain);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		setVolatileDomain_forName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend stringArrayForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringArrayForKey_IMetInst(){
		return ((stringArrayForKey_IMetInst != null)
	? (stringArrayForKey_IMetInst)
	: (stringArrayForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringArrayForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray stringArrayForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend stringArrayForKey_IMetInst = get_stringArrayForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringArrayForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		stringArrayForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringForKey_IMetInst(){
		return ((stringForKey_IMetInst != null)
	? (stringForKey_IMetInst)
	: (stringForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString stringForKey(final com.apple.jobjc.foundation.NSString defaultName){
			final com.apple.jobjc.Invoke.MsgSend stringForKey_IMetInst = get_stringForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, defaultName);
		stringForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend synchronize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_synchronize_IMetInst(){
		return ((synchronize_IMetInst != null)
	? (synchronize_IMetInst)
	: (synchronize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "synchronize", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean synchronize(){
			final com.apple.jobjc.Invoke.MsgSend synchronize_IMetInst = get_synchronize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		synchronize_IMetInst.init(nativeBuffer, this);
		synchronize_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend volatileDomainForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_volatileDomainForName_IMetInst(){
		return ((volatileDomainForName_IMetInst != null)
	? (volatileDomainForName_IMetInst)
	: (volatileDomainForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "volatileDomainForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary volatileDomainForName(final com.apple.jobjc.foundation.NSString domainName){
			final com.apple.jobjc.Invoke.MsgSend volatileDomainForName_IMetInst = get_volatileDomainForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		volatileDomainForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, domainName);
		volatileDomainForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend volatileDomainNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_volatileDomainNames_IMetInst(){
		return ((volatileDomainNames_IMetInst != null)
	? (volatileDomainNames_IMetInst)
	: (volatileDomainNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "volatileDomainNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray volatileDomainNames(){
			final com.apple.jobjc.Invoke.MsgSend volatileDomainNames_IMetInst = get_volatileDomainNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		volatileDomainNames_IMetInst.init(nativeBuffer, this);
		volatileDomainNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
