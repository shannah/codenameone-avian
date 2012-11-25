package com.apple.jobjc.foundation;

public  class NSBundle extends com.apple.jobjc.foundation.NSObject {
	public NSBundle(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBundle(final NSBundle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForAuxiliaryExecutable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForAuxiliaryExecutable_IMetInst(){
		return ((URLForAuxiliaryExecutable_IMetInst != null)
	? (URLForAuxiliaryExecutable_IMetInst)
	: (URLForAuxiliaryExecutable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForAuxiliaryExecutable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForAuxiliaryExecutable(final com.apple.jobjc.foundation.NSString executableName){
			final com.apple.jobjc.Invoke.MsgSend URLForAuxiliaryExecutable_IMetInst = get_URLForAuxiliaryExecutable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForAuxiliaryExecutable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, executableName);
		URLForAuxiliaryExecutable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForResource_withExtension_IMetInst(){
		return ((URLForResource_withExtension_IMetInst != null)
	? (URLForResource_withExtension_IMetInst)
	: (URLForResource_withExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForResource:withExtension:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForResource_withExtension(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext){
			final com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_IMetInst = get_URLForResource_withExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForResource_withExtension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		URLForResource_withExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForResource_withExtension_subdirectory_IMetInst(){
		return ((URLForResource_withExtension_subdirectory_IMetInst != null)
	? (URLForResource_withExtension_subdirectory_IMetInst)
	: (URLForResource_withExtension_subdirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForResource:withExtension:subdirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForResource_withExtension_subdirectory(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath){
			final com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_IMetInst = get_URLForResource_withExtension_subdirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForResource_withExtension_subdirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		URLForResource_withExtension_subdirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_localization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForResource_withExtension_subdirectory_localization_IMetInst(){
		return ((URLForResource_withExtension_subdirectory_localization_IMetInst != null)
	? (URLForResource_withExtension_subdirectory_localization_IMetInst)
	: (URLForResource_withExtension_subdirectory_localization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForResource:withExtension:subdirectory:localization:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForResource_withExtension_subdirectory_localization(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSString localizationName){
			final com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_localization_IMetInst = get_URLForResource_withExtension_subdirectory_localization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForResource_withExtension_subdirectory_localization_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationName);
		URLForResource_withExtension_subdirectory_localization_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLsForResourcesWithExtension_subdirectory_IMetInst(){
		return ((URLsForResourcesWithExtension_subdirectory_IMetInst != null)
	? (URLsForResourcesWithExtension_subdirectory_IMetInst)
	: (URLsForResourcesWithExtension_subdirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLsForResourcesWithExtension:subdirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray URLsForResourcesWithExtension_subdirectory(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath){
			final com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_IMetInst = get_URLsForResourcesWithExtension_subdirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLsForResourcesWithExtension_subdirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		URLsForResourcesWithExtension_subdirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_localization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLsForResourcesWithExtension_subdirectory_localization_IMetInst(){
		return ((URLsForResourcesWithExtension_subdirectory_localization_IMetInst != null)
	? (URLsForResourcesWithExtension_subdirectory_localization_IMetInst)
	: (URLsForResourcesWithExtension_subdirectory_localization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLsForResourcesWithExtension:subdirectory:localization:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray URLsForResourcesWithExtension_subdirectory_localization(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSString localizationName){
			final com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_localization_IMetInst = get_URLsForResourcesWithExtension_subdirectory_localization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLsForResourcesWithExtension_subdirectory_localization_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationName);
		URLsForResourcesWithExtension_subdirectory_localization_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend appStoreReceiptURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_appStoreReceiptURL_IMetInst(){
		return ((appStoreReceiptURL_IMetInst != null)
	? (appStoreReceiptURL_IMetInst)
	: (appStoreReceiptURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "appStoreReceiptURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL appStoreReceiptURL(){
			final com.apple.jobjc.Invoke.MsgSend appStoreReceiptURL_IMetInst = get_appStoreReceiptURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		appStoreReceiptURL_IMetInst.init(nativeBuffer, this);
		appStoreReceiptURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend builtInPlugInsPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_builtInPlugInsPath_IMetInst(){
		return ((builtInPlugInsPath_IMetInst != null)
	? (builtInPlugInsPath_IMetInst)
	: (builtInPlugInsPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "builtInPlugInsPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString builtInPlugInsPath(){
			final com.apple.jobjc.Invoke.MsgSend builtInPlugInsPath_IMetInst = get_builtInPlugInsPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		builtInPlugInsPath_IMetInst.init(nativeBuffer, this);
		builtInPlugInsPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend builtInPlugInsURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_builtInPlugInsURL_IMetInst(){
		return ((builtInPlugInsURL_IMetInst != null)
	? (builtInPlugInsURL_IMetInst)
	: (builtInPlugInsURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "builtInPlugInsURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL builtInPlugInsURL(){
			final com.apple.jobjc.Invoke.MsgSend builtInPlugInsURL_IMetInst = get_builtInPlugInsURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		builtInPlugInsURL_IMetInst.init(nativeBuffer, this);
		builtInPlugInsURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleIdentifier_IMetInst(){
		return ((bundleIdentifier_IMetInst != null)
	? (bundleIdentifier_IMetInst)
	: (bundleIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleIdentifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString bundleIdentifier(){
			final com.apple.jobjc.Invoke.MsgSend bundleIdentifier_IMetInst = get_bundleIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleIdentifier_IMetInst.init(nativeBuffer, this);
		bundleIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundlePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundlePath_IMetInst(){
		return ((bundlePath_IMetInst != null)
	? (bundlePath_IMetInst)
	: (bundlePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundlePath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString bundlePath(){
			final com.apple.jobjc.Invoke.MsgSend bundlePath_IMetInst = get_bundlePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundlePath_IMetInst.init(nativeBuffer, this);
		bundlePath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleURL_IMetInst(){
		return ((bundleURL_IMetInst != null)
	? (bundleURL_IMetInst)
	: (bundleURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL bundleURL(){
			final com.apple.jobjc.Invoke.MsgSend bundleURL_IMetInst = get_bundleURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleURL_IMetInst.init(nativeBuffer, this);
		bundleURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend classNamed_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_classNamed_IMetInst(){
		return ((classNamed_IMetInst != null)
	? (classNamed_IMetInst)
	: (classNamed_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "classNamed:", com.apple.jobjc.Coder.NSClassCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T classNamed(final com.apple.jobjc.foundation.NSString className){
			final com.apple.jobjc.Invoke.MsgSend classNamed_IMetInst = get_classNamed_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		classNamed_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, className);
		classNamed_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend developmentLocalization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_developmentLocalization_IMetInst(){
		return ((developmentLocalization_IMetInst != null)
	? (developmentLocalization_IMetInst)
	: (developmentLocalization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "developmentLocalization", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString developmentLocalization(){
			final com.apple.jobjc.Invoke.MsgSend developmentLocalization_IMetInst = get_developmentLocalization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		developmentLocalization_IMetInst.init(nativeBuffer, this);
		developmentLocalization_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executableArchitectures_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executableArchitectures_IMetInst(){
		return ((executableArchitectures_IMetInst != null)
	? (executableArchitectures_IMetInst)
	: (executableArchitectures_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executableArchitectures", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray executableArchitectures(){
			final com.apple.jobjc.Invoke.MsgSend executableArchitectures_IMetInst = get_executableArchitectures_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executableArchitectures_IMetInst.init(nativeBuffer, this);
		executableArchitectures_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executablePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executablePath_IMetInst(){
		return ((executablePath_IMetInst != null)
	? (executablePath_IMetInst)
	: (executablePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executablePath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString executablePath(){
			final com.apple.jobjc.Invoke.MsgSend executablePath_IMetInst = get_executablePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executablePath_IMetInst.init(nativeBuffer, this);
		executablePath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend executableURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_executableURL_IMetInst(){
		return ((executableURL_IMetInst != null)
	? (executableURL_IMetInst)
	: (executableURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "executableURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL executableURL(){
			final com.apple.jobjc.Invoke.MsgSend executableURL_IMetInst = get_executableURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		executableURL_IMetInst.init(nativeBuffer, this);
		executableURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend infoDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_infoDictionary_IMetInst(){
		return ((infoDictionary_IMetInst != null)
	? (infoDictionary_IMetInst)
	: (infoDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "infoDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary infoDictionary(){
			final com.apple.jobjc.Invoke.MsgSend infoDictionary_IMetInst = get_infoDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		infoDictionary_IMetInst.init(nativeBuffer, this);
		infoDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPath_IMetInst(){
		return ((initWithPath_IMetInst != null)
	? (initWithPath_IMetInst)
	: (initWithPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithPath_IMetInst = get_initWithPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_IMetInst(){
		return ((initWithURL_IMetInst != null)
	? (initWithURL_IMetInst)
	: (initWithURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_IMetInst = get_initWithURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initWithURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLoaded_IMetInst(){
		return ((isLoaded_IMetInst != null)
	? (isLoaded_IMetInst)
	: (isLoaded_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLoaded", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLoaded(){
			final com.apple.jobjc.Invoke.MsgSend isLoaded_IMetInst = get_isLoaded_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLoaded_IMetInst.init(nativeBuffer, this);
		isLoaded_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadBoolean_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadBoolean_IMetInst(){
		return ((loadBoolean_IMetInst != null)
	? (loadBoolean_IMetInst)
	: (loadBoolean_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "load", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean loadBoolean(){
			final com.apple.jobjc.Invoke.MsgSend loadBoolean_IMetInst = get_loadBoolean_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadBoolean_IMetInst.init(nativeBuffer, this);
		loadBoolean_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadAndReturnError_IMetInst(){
		return ((loadAndReturnError_IMetInst != null)
	? (loadAndReturnError_IMetInst)
	: (loadAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean loadAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend loadAndReturnError_IMetInst = get_loadAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		loadAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizations_IMetInst(){
		return ((localizations_IMetInst != null)
	? (localizations_IMetInst)
	: (localizations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray localizations(){
			final com.apple.jobjc.Invoke.MsgSend localizations_IMetInst = get_localizations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizations_IMetInst.init(nativeBuffer, this);
		localizations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedInfoDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedInfoDictionary_IMetInst(){
		return ((localizedInfoDictionary_IMetInst != null)
	? (localizedInfoDictionary_IMetInst)
	: (localizedInfoDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedInfoDictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary localizedInfoDictionary(){
			final com.apple.jobjc.Invoke.MsgSend localizedInfoDictionary_IMetInst = get_localizedInfoDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedInfoDictionary_IMetInst.init(nativeBuffer, this);
		localizedInfoDictionary_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedStringForKey_value_table_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedStringForKey_value_table_IMetInst(){
		return ((localizedStringForKey_value_table_IMetInst != null)
	? (localizedStringForKey_value_table_IMetInst)
	: (localizedStringForKey_value_table_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStringForKey:value:table:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedStringForKey_value_table(final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.foundation.NSString value, final com.apple.jobjc.foundation.NSString tableName){
			final com.apple.jobjc.Invoke.MsgSend localizedStringForKey_value_table_IMetInst = get_localizedStringForKey_value_table_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStringForKey_value_table_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, tableName);
		localizedStringForKey_value_table_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectForInfoDictionaryKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectForInfoDictionaryKey_IMetInst(){
		return ((objectForInfoDictionaryKey_IMetInst != null)
	? (objectForInfoDictionaryKey_IMetInst)
	: (objectForInfoDictionaryKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectForInfoDictionaryKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectForInfoDictionaryKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend objectForInfoDictionaryKey_IMetInst = get_objectForInfoDictionaryKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectForInfoDictionaryKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		objectForInfoDictionaryKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForAuxiliaryExecutable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForAuxiliaryExecutable_IMetInst(){
		return ((pathForAuxiliaryExecutable_IMetInst != null)
	? (pathForAuxiliaryExecutable_IMetInst)
	: (pathForAuxiliaryExecutable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForAuxiliaryExecutable:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForAuxiliaryExecutable(final com.apple.jobjc.foundation.NSString executableName){
			final com.apple.jobjc.Invoke.MsgSend pathForAuxiliaryExecutable_IMetInst = get_pathForAuxiliaryExecutable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForAuxiliaryExecutable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, executableName);
		pathForAuxiliaryExecutable_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForResource_ofType_IMetInst(){
		return ((pathForResource_ofType_IMetInst != null)
	? (pathForResource_ofType_IMetInst)
	: (pathForResource_ofType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForResource:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForResource_ofType(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext){
			final com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_IMetInst = get_pathForResource_ofType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForResource_ofType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		pathForResource_ofType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForResource_ofType_inDirectory_IMetInst(){
		return ((pathForResource_ofType_inDirectory_IMetInst != null)
	? (pathForResource_ofType_inDirectory_IMetInst)
	: (pathForResource_ofType_inDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForResource:ofType:inDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForResource_ofType_inDirectory(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath){
			final com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_IMetInst = get_pathForResource_ofType_inDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForResource_ofType_inDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		pathForResource_ofType_inDirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_forLocalization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForResource_ofType_inDirectory_forLocalization_IMetInst(){
		return ((pathForResource_ofType_inDirectory_forLocalization_IMetInst != null)
	? (pathForResource_ofType_inDirectory_forLocalization_IMetInst)
	: (pathForResource_ofType_inDirectory_forLocalization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForResource:ofType:inDirectory:forLocalization:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForResource_ofType_inDirectory_forLocalization(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSString localizationName){
			final com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_forLocalization_IMetInst = get_pathForResource_ofType_inDirectory_forLocalization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForResource_ofType_inDirectory_forLocalization_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationName);
		pathForResource_ofType_inDirectory_forLocalization_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathsForResourcesOfType_inDirectory_IMetInst(){
		return ((pathsForResourcesOfType_inDirectory_IMetInst != null)
	? (pathsForResourcesOfType_inDirectory_IMetInst)
	: (pathsForResourcesOfType_inDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathsForResourcesOfType:inDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathsForResourcesOfType_inDirectory(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath){
			final com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_IMetInst = get_pathsForResourcesOfType_inDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathsForResourcesOfType_inDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		pathsForResourcesOfType_inDirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_forLocalization_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathsForResourcesOfType_inDirectory_forLocalization_IMetInst(){
		return ((pathsForResourcesOfType_inDirectory_forLocalization_IMetInst != null)
	? (pathsForResourcesOfType_inDirectory_forLocalization_IMetInst)
	: (pathsForResourcesOfType_inDirectory_forLocalization_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathsForResourcesOfType:inDirectory:forLocalization:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathsForResourcesOfType_inDirectory_forLocalization(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSString localizationName){
			final com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_forLocalization_IMetInst = get_pathsForResourcesOfType_inDirectory_forLocalization_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathsForResourcesOfType_inDirectory_forLocalization_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationName);
		pathsForResourcesOfType_inDirectory_forLocalization_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredLocalizations_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredLocalizations_IMetInst(){
		return ((preferredLocalizations_IMetInst != null)
	? (preferredLocalizations_IMetInst)
	: (preferredLocalizations_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredLocalizations", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray preferredLocalizations(){
			final com.apple.jobjc.Invoke.MsgSend preferredLocalizations_IMetInst = get_preferredLocalizations_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredLocalizations_IMetInst.init(nativeBuffer, this);
		preferredLocalizations_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preflightAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preflightAndReturnError_IMetInst(){
		return ((preflightAndReturnError_IMetInst != null)
	? (preflightAndReturnError_IMetInst)
	: (preflightAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preflightAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean preflightAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend preflightAndReturnError_IMetInst = get_preflightAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preflightAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		preflightAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend principalClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_principalClass_IMetInst(){
		return ((principalClass_IMetInst != null)
	? (principalClass_IMetInst)
	: (principalClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "principalClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T principalClass(){
			final com.apple.jobjc.Invoke.MsgSend principalClass_IMetInst = get_principalClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		principalClass_IMetInst.init(nativeBuffer, this);
		principalClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend privateFrameworksPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_privateFrameworksPath_IMetInst(){
		return ((privateFrameworksPath_IMetInst != null)
	? (privateFrameworksPath_IMetInst)
	: (privateFrameworksPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "privateFrameworksPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString privateFrameworksPath(){
			final com.apple.jobjc.Invoke.MsgSend privateFrameworksPath_IMetInst = get_privateFrameworksPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		privateFrameworksPath_IMetInst.init(nativeBuffer, this);
		privateFrameworksPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend privateFrameworksURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_privateFrameworksURL_IMetInst(){
		return ((privateFrameworksURL_IMetInst != null)
	? (privateFrameworksURL_IMetInst)
	: (privateFrameworksURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "privateFrameworksURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL privateFrameworksURL(){
			final com.apple.jobjc.Invoke.MsgSend privateFrameworksURL_IMetInst = get_privateFrameworksURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		privateFrameworksURL_IMetInst.init(nativeBuffer, this);
		privateFrameworksURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourcePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourcePath_IMetInst(){
		return ((resourcePath_IMetInst != null)
	? (resourcePath_IMetInst)
	: (resourcePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourcePath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString resourcePath(){
			final com.apple.jobjc.Invoke.MsgSend resourcePath_IMetInst = get_resourcePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourcePath_IMetInst.init(nativeBuffer, this);
		resourcePath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceURL_IMetInst(){
		return ((resourceURL_IMetInst != null)
	? (resourceURL_IMetInst)
	: (resourceURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL resourceURL(){
			final com.apple.jobjc.Invoke.MsgSend resourceURL_IMetInst = get_resourceURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceURL_IMetInst.init(nativeBuffer, this);
		resourceURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedFrameworksPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedFrameworksPath_IMetInst(){
		return ((sharedFrameworksPath_IMetInst != null)
	? (sharedFrameworksPath_IMetInst)
	: (sharedFrameworksPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedFrameworksPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString sharedFrameworksPath(){
			final com.apple.jobjc.Invoke.MsgSend sharedFrameworksPath_IMetInst = get_sharedFrameworksPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedFrameworksPath_IMetInst.init(nativeBuffer, this);
		sharedFrameworksPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedFrameworksURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedFrameworksURL_IMetInst(){
		return ((sharedFrameworksURL_IMetInst != null)
	? (sharedFrameworksURL_IMetInst)
	: (sharedFrameworksURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedFrameworksURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL sharedFrameworksURL(){
			final com.apple.jobjc.Invoke.MsgSend sharedFrameworksURL_IMetInst = get_sharedFrameworksURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedFrameworksURL_IMetInst.init(nativeBuffer, this);
		sharedFrameworksURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSupportPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSupportPath_IMetInst(){
		return ((sharedSupportPath_IMetInst != null)
	? (sharedSupportPath_IMetInst)
	: (sharedSupportPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSupportPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString sharedSupportPath(){
			final com.apple.jobjc.Invoke.MsgSend sharedSupportPath_IMetInst = get_sharedSupportPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSupportPath_IMetInst.init(nativeBuffer, this);
		sharedSupportPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSupportURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSupportURL_IMetInst(){
		return ((sharedSupportURL_IMetInst != null)
	? (sharedSupportURL_IMetInst)
	: (sharedSupportURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSupportURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL sharedSupportURL(){
			final com.apple.jobjc.Invoke.MsgSend sharedSupportURL_IMetInst = get_sharedSupportURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSupportURL_IMetInst.init(nativeBuffer, this);
		sharedSupportURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unload_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unload_IMetInst(){
		return ((unload_IMetInst != null)
	? (unload_IMetInst)
	: (unload_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unload", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean unload(){
			final com.apple.jobjc.Invoke.MsgSend unload_IMetInst = get_unload_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unload_IMetInst.init(nativeBuffer, this);
		unload_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
