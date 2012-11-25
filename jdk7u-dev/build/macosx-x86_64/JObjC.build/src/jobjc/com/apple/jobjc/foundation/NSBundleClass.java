package com.apple.jobjc.foundation;

public  class NSBundleClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSBundleClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSBundleClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSBundleClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst(){
		return ((URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst != null)
	? (URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst)
	: (URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForResource:withExtension:subdirectory:inBundleWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForResource_withExtension_subdirectory_inBundleWithURL(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSURL bundleURL){
			final com.apple.jobjc.Invoke.MsgSend URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst = get_URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleURL);
		URLForResource_withExtension_subdirectory_inBundleWithURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst(){
		return ((URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst != null)
	? (URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst)
	: (URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLsForResourcesWithExtension:subdirectory:inBundleWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray URLsForResourcesWithExtension_subdirectory_inBundleWithURL(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString subpath, final com.apple.jobjc.foundation.NSURL bundleURL){
			final com.apple.jobjc.Invoke.MsgSend URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst = get_URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, subpath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleURL);
		URLsForResourcesWithExtension_subdirectory_inBundleWithURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allBundles_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allBundles_CMetInst(){
		return ((allBundles_CMetInst != null)
	? (allBundles_CMetInst)
	: (allBundles_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allBundles", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allBundles(){
			final com.apple.jobjc.Invoke.MsgSend allBundles_CMetInst = get_allBundles_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allBundles_CMetInst.init(nativeBuffer, this);
		allBundles_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allFrameworks_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allFrameworks_CMetInst(){
		return ((allFrameworks_CMetInst != null)
	? (allFrameworks_CMetInst)
	: (allFrameworks_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allFrameworks", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allFrameworks(){
			final com.apple.jobjc.Invoke.MsgSend allFrameworks_CMetInst = get_allFrameworks_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allFrameworks_CMetInst.init(nativeBuffer, this);
		allFrameworks_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleForClass_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleForClass_CMetInst(){
		return ((bundleForClass_CMetInst != null)
	? (bundleForClass_CMetInst)
	: (bundleForClass_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleForClass:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle bundleForClass(final com.apple.jobjc.NSClass aClass){
			final com.apple.jobjc.Invoke.MsgSend bundleForClass_CMetInst = get_bundleForClass_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleForClass_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, aClass);
		bundleForClass_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleWithIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleWithIdentifier_CMetInst(){
		return ((bundleWithIdentifier_CMetInst != null)
	? (bundleWithIdentifier_CMetInst)
	: (bundleWithIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle bundleWithIdentifier(final com.apple.jobjc.foundation.NSString identifier){
			final com.apple.jobjc.Invoke.MsgSend bundleWithIdentifier_CMetInst = get_bundleWithIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleWithIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, identifier);
		bundleWithIdentifier_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleWithPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleWithPath_CMetInst(){
		return ((bundleWithPath_CMetInst != null)
	? (bundleWithPath_CMetInst)
	: (bundleWithPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle bundleWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend bundleWithPath_CMetInst = get_bundleWithPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleWithPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		bundleWithPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bundleWithURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bundleWithURL_CMetInst(){
		return ((bundleWithURL_CMetInst != null)
	? (bundleWithURL_CMetInst)
	: (bundleWithURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bundleWithURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle bundleWithURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend bundleWithURL_CMetInst = get_bundleWithURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bundleWithURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		bundleWithURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mainBundle_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mainBundle_CMetInst(){
		return ((mainBundle_CMetInst != null)
	? (mainBundle_CMetInst)
	: (mainBundle_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mainBundle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSBundle mainBundle(){
			final com.apple.jobjc.Invoke.MsgSend mainBundle_CMetInst = get_mainBundle_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mainBundle_CMetInst.init(nativeBuffer, this);
		mainBundle_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSBundle returnValue = (com.apple.jobjc.foundation.NSBundle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForResource_ofType_inDirectory_CMetInst(){
		return ((pathForResource_ofType_inDirectory_CMetInst != null)
	? (pathForResource_ofType_inDirectory_CMetInst)
	: (pathForResource_ofType_inDirectory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForResource:ofType:inDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForResource_ofType_inDirectory(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString bundlePath){
			final com.apple.jobjc.Invoke.MsgSend pathForResource_ofType_inDirectory_CMetInst = get_pathForResource_ofType_inDirectory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForResource_ofType_inDirectory_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundlePath);
		pathForResource_ofType_inDirectory_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathsForResourcesOfType_inDirectory_CMetInst(){
		return ((pathsForResourcesOfType_inDirectory_CMetInst != null)
	? (pathsForResourcesOfType_inDirectory_CMetInst)
	: (pathsForResourcesOfType_inDirectory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathsForResourcesOfType:inDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathsForResourcesOfType_inDirectory(final com.apple.jobjc.foundation.NSString ext, final com.apple.jobjc.foundation.NSString bundlePath){
			final com.apple.jobjc.Invoke.MsgSend pathsForResourcesOfType_inDirectory_CMetInst = get_pathsForResourcesOfType_inDirectory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathsForResourcesOfType_inDirectory_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, ext);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundlePath);
		pathsForResourcesOfType_inDirectory_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredLocalizationsFromArray_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredLocalizationsFromArray_CMetInst(){
		return ((preferredLocalizationsFromArray_CMetInst != null)
	? (preferredLocalizationsFromArray_CMetInst)
	: (preferredLocalizationsFromArray_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredLocalizationsFromArray:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray preferredLocalizationsFromArray(final com.apple.jobjc.foundation.NSArray localizationsArray){
			final com.apple.jobjc.Invoke.MsgSend preferredLocalizationsFromArray_CMetInst = get_preferredLocalizationsFromArray_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredLocalizationsFromArray_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationsArray);
		preferredLocalizationsFromArray_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredLocalizationsFromArray_forPreferences_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredLocalizationsFromArray_forPreferences_CMetInst(){
		return ((preferredLocalizationsFromArray_forPreferences_CMetInst != null)
	? (preferredLocalizationsFromArray_forPreferences_CMetInst)
	: (preferredLocalizationsFromArray_forPreferences_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredLocalizationsFromArray:forPreferences:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray preferredLocalizationsFromArray_forPreferences(final com.apple.jobjc.foundation.NSArray localizationsArray, final com.apple.jobjc.foundation.NSArray preferencesArray){
			final com.apple.jobjc.Invoke.MsgSend preferredLocalizationsFromArray_forPreferences_CMetInst = get_preferredLocalizationsFromArray_forPreferences_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredLocalizationsFromArray_forPreferences_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localizationsArray);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, preferencesArray);
		preferredLocalizationsFromArray_forPreferences_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
