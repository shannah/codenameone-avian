package com.apple.jobjc.appkit;

public  class NSWorkspace extends com.apple.jobjc.foundation.NSObject {
	public NSWorkspace(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSWorkspace(final NSWorkspace obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForApplicationToOpenURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForApplicationToOpenURL_IMetInst(){
		return ((URLForApplicationToOpenURL_IMetInst != null)
	? (URLForApplicationToOpenURL_IMetInst)
	: (URLForApplicationToOpenURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForApplicationToOpenURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForApplicationToOpenURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend URLForApplicationToOpenURL_IMetInst = get_URLForApplicationToOpenURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForApplicationToOpenURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		URLForApplicationToOpenURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForApplicationWithBundleIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForApplicationWithBundleIdentifier_IMetInst(){
		return ((URLForApplicationWithBundleIdentifier_IMetInst != null)
	? (URLForApplicationWithBundleIdentifier_IMetInst)
	: (URLForApplicationWithBundleIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForApplicationWithBundleIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForApplicationWithBundleIdentifier(final com.apple.jobjc.foundation.NSString bundleIdentifier){
			final com.apple.jobjc.Invoke.MsgSend URLForApplicationWithBundleIdentifier_IMetInst = get_URLForApplicationWithBundleIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForApplicationWithBundleIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleIdentifier);
		URLForApplicationWithBundleIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absolutePathForAppBundleWithIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absolutePathForAppBundleWithIdentifier_IMetInst(){
		return ((absolutePathForAppBundleWithIdentifier_IMetInst != null)
	? (absolutePathForAppBundleWithIdentifier_IMetInst)
	: (absolutePathForAppBundleWithIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absolutePathForAppBundleWithIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString absolutePathForAppBundleWithIdentifier(final com.apple.jobjc.foundation.NSString bundleIdentifier){
			final com.apple.jobjc.Invoke.MsgSend absolutePathForAppBundleWithIdentifier_IMetInst = get_absolutePathForAppBundleWithIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absolutePathForAppBundleWithIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleIdentifier);
		absolutePathForAppBundleWithIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend activateFileViewerSelectingURLs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activateFileViewerSelectingURLs_IMetInst(){
		return ((activateFileViewerSelectingURLs_IMetInst != null)
	? (activateFileViewerSelectingURLs_IMetInst)
	: (activateFileViewerSelectingURLs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activateFileViewerSelectingURLs:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void activateFileViewerSelectingURLs(final com.apple.jobjc.foundation.NSArray fileURLs){
			final com.apple.jobjc.Invoke.MsgSend activateFileViewerSelectingURLs_IMetInst = get_activateFileViewerSelectingURLs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activateFileViewerSelectingURLs_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileURLs);
		activateFileViewerSelectingURLs_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend activeApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_activeApplication_IMetInst(){
		return ((activeApplication_IMetInst != null)
	? (activeApplication_IMetInst)
	: (activeApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "activeApplication", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary activeApplication(){
			final com.apple.jobjc.Invoke.MsgSend activeApplication_IMetInst = get_activeApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		activeApplication_IMetInst.init(nativeBuffer, this);
		activeApplication_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkForRemovableMedia_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkForRemovableMedia_IMetInst(){
		return ((checkForRemovableMedia_IMetInst != null)
	? (checkForRemovableMedia_IMetInst)
	: (checkForRemovableMedia_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkForRemovableMedia", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void checkForRemovableMedia(){
			final com.apple.jobjc.Invoke.MsgSend checkForRemovableMedia_IMetInst = get_checkForRemovableMedia_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkForRemovableMedia_IMetInst.init(nativeBuffer, this);
		checkForRemovableMedia_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend desktopImageOptionsForScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_desktopImageOptionsForScreen_IMetInst(){
		return ((desktopImageOptionsForScreen_IMetInst != null)
	? (desktopImageOptionsForScreen_IMetInst)
	: (desktopImageOptionsForScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "desktopImageOptionsForScreen:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary desktopImageOptionsForScreen(final com.apple.jobjc.appkit.NSScreen screen){
			final com.apple.jobjc.Invoke.MsgSend desktopImageOptionsForScreen_IMetInst = get_desktopImageOptionsForScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		desktopImageOptionsForScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
		desktopImageOptionsForScreen_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend desktopImageURLForScreen_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_desktopImageURLForScreen_IMetInst(){
		return ((desktopImageURLForScreen_IMetInst != null)
	? (desktopImageURLForScreen_IMetInst)
	: (desktopImageURLForScreen_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "desktopImageURLForScreen:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL desktopImageURLForScreen(final com.apple.jobjc.appkit.NSScreen screen){
			final com.apple.jobjc.Invoke.MsgSend desktopImageURLForScreen_IMetInst = get_desktopImageURLForScreen_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		desktopImageURLForScreen_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
		desktopImageURLForScreen_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend duplicateURLs_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_duplicateURLs_completionHandler_IMetInst(){
		return ((duplicateURLs_completionHandler_IMetInst != null)
	? (duplicateURLs_completionHandler_IMetInst)
	: (duplicateURLs_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "duplicateURLs:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void duplicateURLs_completionHandler(final com.apple.jobjc.foundation.NSArray URLs, final Object /* void(^)(NSDictionary*,NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend duplicateURLs_completionHandler_IMetInst = get_duplicateURLs_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		duplicateURLs_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLs);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		duplicateURLs_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend extendPowerOffBy_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_extendPowerOffBy_IMetInst(){
		return ((extendPowerOffBy_IMetInst != null)
	? (extendPowerOffBy_IMetInst)
	: (extendPowerOffBy_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "extendPowerOffBy:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long extendPowerOffBy(final long requested){
			final com.apple.jobjc.Invoke.MsgSend extendPowerOffBy_IMetInst = get_extendPowerOffBy_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		extendPowerOffBy_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, requested);
		extendPowerOffBy_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileLabelColors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileLabelColors_IMetInst(){
		return ((fileLabelColors_IMetInst != null)
	? (fileLabelColors_IMetInst)
	: (fileLabelColors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileLabelColors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray fileLabelColors(){
			final com.apple.jobjc.Invoke.MsgSend fileLabelColors_IMetInst = get_fileLabelColors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileLabelColors_IMetInst.init(nativeBuffer, this);
		fileLabelColors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileLabels_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileLabels_IMetInst(){
		return ((fileLabels_IMetInst != null)
	? (fileLabels_IMetInst)
	: (fileLabels_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileLabels", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray fileLabels(){
			final com.apple.jobjc.Invoke.MsgSend fileLabels_IMetInst = get_fileLabels_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileLabels_IMetInst.init(nativeBuffer, this);
		fileLabels_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemChanged_IMetInst(){
		return ((fileSystemChanged_IMetInst != null)
	? (fileSystemChanged_IMetInst)
	: (fileSystemChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemChanged", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean fileSystemChanged(){
			final com.apple.jobjc.Invoke.MsgSend fileSystemChanged_IMetInst = get_fileSystemChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemChanged_IMetInst.init(nativeBuffer, this);
		fileSystemChanged_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filenameExtension_isValidForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filenameExtension_isValidForType_IMetInst(){
		return ((filenameExtension_isValidForType_IMetInst != null)
	? (filenameExtension_isValidForType_IMetInst)
	: (filenameExtension_isValidForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filenameExtension:isValidForType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean filenameExtension_isValidForType(final com.apple.jobjc.foundation.NSString filenameExtension, final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend filenameExtension_isValidForType_IMetInst = get_filenameExtension_isValidForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filenameExtension_isValidForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filenameExtension);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		filenameExtension_isValidForType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend findApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_findApplications_IMetInst(){
		return ((findApplications_IMetInst != null)
	? (findApplications_IMetInst)
	: (findApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "findApplications", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void findApplications(){
			final com.apple.jobjc.Invoke.MsgSend findApplications_IMetInst = get_findApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		findApplications_IMetInst.init(nativeBuffer, this);
		findApplications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend frontmostApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_frontmostApplication_IMetInst(){
		return ((frontmostApplication_IMetInst != null)
	? (frontmostApplication_IMetInst)
	: (frontmostApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "frontmostApplication", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRunningApplication frontmostApplication(){
			final com.apple.jobjc.Invoke.MsgSend frontmostApplication_IMetInst = get_frontmostApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		frontmostApplication_IMetInst.init(nativeBuffer, this);
		frontmostApplication_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRunningApplication returnValue = (com.apple.jobjc.appkit.NSRunningApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fullPathForApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fullPathForApplication_IMetInst(){
		return ((fullPathForApplication_IMetInst != null)
	? (fullPathForApplication_IMetInst)
	: (fullPathForApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fullPathForApplication:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fullPathForApplication(final com.apple.jobjc.foundation.NSString appName){
			final com.apple.jobjc.Invoke.MsgSend fullPathForApplication_IMetInst = get_fullPathForApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fullPathForApplication_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, appName);
		fullPathForApplication_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst(){
		return ((getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst != null)
	? (getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst)
	: (getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getFileSystemInfoForPath:isRemovable:isWritable:isUnmountable:description:type:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.Pointer<java.lang.Boolean> removableFlag, final com.apple.jobjc.Pointer<java.lang.Boolean> writableFlag, final com.apple.jobjc.Pointer<java.lang.Boolean> unmountableFlag, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> description, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> fileSystemType){
			final com.apple.jobjc.Invoke.MsgSend getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst = get_getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, removableFlag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, writableFlag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, unmountableFlag);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, description);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, fileSystemType);
		getFileSystemInfoForPath_isRemovable_isWritable_isUnmountable_description_type_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getInfoForFile_application_type_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getInfoForFile_application_type_IMetInst(){
		return ((getInfoForFile_application_type_IMetInst != null)
	? (getInfoForFile_application_type_IMetInst)
	: (getInfoForFile_application_type_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getInfoForFile:application:type:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getInfoForFile_application_type(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> appName, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSString> type){
			final com.apple.jobjc.Invoke.MsgSend getInfoForFile_application_type_IMetInst = get_getInfoForFile_application_type_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getInfoForFile_application_type_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, appName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, type);
		getInfoForFile_application_type_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hideOtherApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hideOtherApplications_IMetInst(){
		return ((hideOtherApplications_IMetInst != null)
	? (hideOtherApplications_IMetInst)
	: (hideOtherApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hideOtherApplications", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void hideOtherApplications(){
			final com.apple.jobjc.Invoke.MsgSend hideOtherApplications_IMetInst = get_hideOtherApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hideOtherApplications_IMetInst.init(nativeBuffer, this);
		hideOtherApplications_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend iconForFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_iconForFile_IMetInst(){
		return ((iconForFile_IMetInst != null)
	? (iconForFile_IMetInst)
	: (iconForFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "iconForFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage iconForFile(final com.apple.jobjc.foundation.NSString fullPath){
			final com.apple.jobjc.Invoke.MsgSend iconForFile_IMetInst = get_iconForFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		iconForFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		iconForFile_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend iconForFileType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_iconForFileType_IMetInst(){
		return ((iconForFileType_IMetInst != null)
	? (iconForFileType_IMetInst)
	: (iconForFileType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "iconForFileType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage iconForFileType(final com.apple.jobjc.foundation.NSString fileType){
			final com.apple.jobjc.Invoke.MsgSend iconForFileType_IMetInst = get_iconForFileType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		iconForFileType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileType);
		iconForFileType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend iconForFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_iconForFiles_IMetInst(){
		return ((iconForFiles_IMetInst != null)
	? (iconForFiles_IMetInst)
	: (iconForFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "iconForFiles:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage iconForFiles(final com.apple.jobjc.foundation.NSArray fullPaths){
			final com.apple.jobjc.Invoke.MsgSend iconForFiles_IMetInst = get_iconForFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		iconForFiles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPaths);
		iconForFiles_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFilePackageAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFilePackageAtPath_IMetInst(){
		return ((isFilePackageAtPath_IMetInst != null)
	? (isFilePackageAtPath_IMetInst)
	: (isFilePackageAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFilePackageAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isFilePackageAtPath(final com.apple.jobjc.foundation.NSString fullPath){
			final com.apple.jobjc.Invoke.MsgSend isFilePackageAtPath_IMetInst = get_isFilePackageAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFilePackageAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		isFilePackageAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst(){
		return ((launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst != null)
	? (launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst)
	: (launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchAppWithBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifier:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier(final com.apple.jobjc.foundation.NSString bundleIdentifier, final long options, final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSNumber> identifier){
			final com.apple.jobjc.Invoke.MsgSend launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst = get_launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleIdentifier);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, identifier);
		launchAppWithBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifier_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchApplication_IMetInst(){
		return ((launchApplication_IMetInst != null)
	? (launchApplication_IMetInst)
	: (launchApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchApplication:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean launchApplication(final com.apple.jobjc.foundation.NSString appName){
			final com.apple.jobjc.Invoke.MsgSend launchApplication_IMetInst = get_launchApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchApplication_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, appName);
		launchApplication_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchApplication_showIcon_autolaunch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchApplication_showIcon_autolaunch_IMetInst(){
		return ((launchApplication_showIcon_autolaunch_IMetInst != null)
	? (launchApplication_showIcon_autolaunch_IMetInst)
	: (launchApplication_showIcon_autolaunch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchApplication:showIcon:autolaunch:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean launchApplication_showIcon_autolaunch(final com.apple.jobjc.foundation.NSString appName, final boolean showIcon, final boolean autolaunch){
			final com.apple.jobjc.Invoke.MsgSend launchApplication_showIcon_autolaunch_IMetInst = get_launchApplication_showIcon_autolaunch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchApplication_showIcon_autolaunch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, appName);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showIcon);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, autolaunch);
		launchApplication_showIcon_autolaunch_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchApplicationAtURL_options_configuration_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchApplicationAtURL_options_configuration_error_IMetInst(){
		return ((launchApplicationAtURL_options_configuration_error_IMetInst != null)
	? (launchApplicationAtURL_options_configuration_error_IMetInst)
	: (launchApplicationAtURL_options_configuration_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchApplicationAtURL:options:configuration:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRunningApplication launchApplicationAtURL_options_configuration_error(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.foundation.NSDictionary configuration, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend launchApplicationAtURL_options_configuration_error_IMetInst = get_launchApplicationAtURL_options_configuration_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchApplicationAtURL_options_configuration_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, configuration);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		launchApplicationAtURL_options_configuration_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRunningApplication returnValue = (com.apple.jobjc.appkit.NSRunningApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend launchedApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_launchedApplications_IMetInst(){
		return ((launchedApplications_IMetInst != null)
	? (launchedApplications_IMetInst)
	: (launchedApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "launchedApplications", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray launchedApplications(){
			final com.apple.jobjc.Invoke.MsgSend launchedApplications_IMetInst = get_launchedApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		launchedApplications_IMetInst.init(nativeBuffer, this);
		launchedApplications_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedDescriptionForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedDescriptionForType_IMetInst(){
		return ((localizedDescriptionForType_IMetInst != null)
	? (localizedDescriptionForType_IMetInst)
	: (localizedDescriptionForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedDescriptionForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedDescriptionForType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend localizedDescriptionForType_IMetInst = get_localizedDescriptionForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedDescriptionForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		localizedDescriptionForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuBarOwningApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuBarOwningApplication_IMetInst(){
		return ((menuBarOwningApplication_IMetInst != null)
	? (menuBarOwningApplication_IMetInst)
	: (menuBarOwningApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuBarOwningApplication", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSRunningApplication menuBarOwningApplication(){
			final com.apple.jobjc.Invoke.MsgSend menuBarOwningApplication_IMetInst = get_menuBarOwningApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuBarOwningApplication_IMetInst.init(nativeBuffer, this);
		menuBarOwningApplication_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSRunningApplication returnValue = (com.apple.jobjc.appkit.NSRunningApplication) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mountNewRemovableMedia_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mountNewRemovableMedia_IMetInst(){
		return ((mountNewRemovableMedia_IMetInst != null)
	? (mountNewRemovableMedia_IMetInst)
	: (mountNewRemovableMedia_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mountNewRemovableMedia", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray mountNewRemovableMedia(){
			final com.apple.jobjc.Invoke.MsgSend mountNewRemovableMedia_IMetInst = get_mountNewRemovableMedia_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mountNewRemovableMedia_IMetInst.init(nativeBuffer, this);
		mountNewRemovableMedia_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mountedLocalVolumePaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mountedLocalVolumePaths_IMetInst(){
		return ((mountedLocalVolumePaths_IMetInst != null)
	? (mountedLocalVolumePaths_IMetInst)
	: (mountedLocalVolumePaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mountedLocalVolumePaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray mountedLocalVolumePaths(){
			final com.apple.jobjc.Invoke.MsgSend mountedLocalVolumePaths_IMetInst = get_mountedLocalVolumePaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mountedLocalVolumePaths_IMetInst.init(nativeBuffer, this);
		mountedLocalVolumePaths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mountedRemovableMedia_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mountedRemovableMedia_IMetInst(){
		return ((mountedRemovableMedia_IMetInst != null)
	? (mountedRemovableMedia_IMetInst)
	: (mountedRemovableMedia_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mountedRemovableMedia", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray mountedRemovableMedia(){
			final com.apple.jobjc.Invoke.MsgSend mountedRemovableMedia_IMetInst = get_mountedRemovableMedia_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mountedRemovableMedia_IMetInst.init(nativeBuffer, this);
		mountedRemovableMedia_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend noteFileSystemChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteFileSystemChanged_IMetInst(){
		return ((noteFileSystemChanged_IMetInst != null)
	? (noteFileSystemChanged_IMetInst)
	: (noteFileSystemChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteFileSystemChanged", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteFileSystemChanged(){
			final com.apple.jobjc.Invoke.MsgSend noteFileSystemChanged_IMetInst = get_noteFileSystemChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteFileSystemChanged_IMetInst.init(nativeBuffer, this);
		noteFileSystemChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteFileSystemChangedVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteFileSystemChangedVoid_IMetInst(){
		return ((noteFileSystemChangedVoid_IMetInst != null)
	? (noteFileSystemChangedVoid_IMetInst)
	: (noteFileSystemChangedVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteFileSystemChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void noteFileSystemChangedVoid(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend noteFileSystemChangedVoid_IMetInst = get_noteFileSystemChangedVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteFileSystemChangedVoid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		noteFileSystemChangedVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend noteUserDefaultsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_noteUserDefaultsChanged_IMetInst(){
		return ((noteUserDefaultsChanged_IMetInst != null)
	? (noteUserDefaultsChanged_IMetInst)
	: (noteUserDefaultsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "noteUserDefaultsChanged", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void noteUserDefaultsChanged(){
			final com.apple.jobjc.Invoke.MsgSend noteUserDefaultsChanged_IMetInst = get_noteUserDefaultsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		noteUserDefaultsChanged_IMetInst.init(nativeBuffer, this);
		noteUserDefaultsChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend notificationCenter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notificationCenter_IMetInst(){
		return ((notificationCenter_IMetInst != null)
	? (notificationCenter_IMetInst)
	: (notificationCenter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notificationCenter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNotificationCenter notificationCenter(){
			final com.apple.jobjc.Invoke.MsgSend notificationCenter_IMetInst = get_notificationCenter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notificationCenter_IMetInst.init(nativeBuffer, this);
		notificationCenter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNotificationCenter returnValue = (com.apple.jobjc.foundation.NSNotificationCenter) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openFile_IMetInst(){
		return ((openFile_IMetInst != null)
	? (openFile_IMetInst)
	: (openFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean openFile(final com.apple.jobjc.foundation.NSString fullPath){
			final com.apple.jobjc.Invoke.MsgSend openFile_IMetInst = get_openFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		openFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openFile_fromImage_at_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openFile_fromImage_at_inView_IMetInst(){
		return ((openFile_fromImage_at_inView_IMetInst != null)
	? (openFile_fromImage_at_inView_IMetInst)
	: (openFile_fromImage_at_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openFile:fromImage:at:inView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean openFile_fromImage_at_inView(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.appkit.NSImage anImage, final com.apple.jobjc.foundation.NSPoint point, final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend openFile_fromImage_at_inView_IMetInst = get_openFile_fromImage_at_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openFile_fromImage_at_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anImage);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, point);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		openFile_fromImage_at_inView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openFile_withApplication_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openFile_withApplication_IMetInst(){
		return ((openFile_withApplication_IMetInst != null)
	? (openFile_withApplication_IMetInst)
	: (openFile_withApplication_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openFile:withApplication:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean openFile_withApplication(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.foundation.NSString appName){
			final com.apple.jobjc.Invoke.MsgSend openFile_withApplication_IMetInst = get_openFile_withApplication_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openFile_withApplication_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, appName);
		openFile_withApplication_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openFile_withApplication_andDeactivate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openFile_withApplication_andDeactivate_IMetInst(){
		return ((openFile_withApplication_andDeactivate_IMetInst != null)
	? (openFile_withApplication_andDeactivate_IMetInst)
	: (openFile_withApplication_andDeactivate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openFile:withApplication:andDeactivate:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean openFile_withApplication_andDeactivate(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.foundation.NSString appName, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend openFile_withApplication_andDeactivate_IMetInst = get_openFile_withApplication_andDeactivate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openFile_withApplication_andDeactivate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, appName);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		openFile_withApplication_andDeactivate_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openTempFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openTempFile_IMetInst(){
		return ((openTempFile_IMetInst != null)
	? (openTempFile_IMetInst)
	: (openTempFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openTempFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean openTempFile(final com.apple.jobjc.foundation.NSString fullPath){
			final com.apple.jobjc.Invoke.MsgSend openTempFile_IMetInst = get_openTempFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openTempFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		openTempFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openURL_IMetInst(){
		return ((openURL_IMetInst != null)
	? (openURL_IMetInst)
	: (openURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean openURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend openURL_IMetInst = get_openURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		openURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst(){
		return ((openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst != null)
	? (openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst)
	: (openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "openURLs:withAppBundleIdentifier:options:additionalEventParamDescriptor:launchIdentifiers:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers(final com.apple.jobjc.foundation.NSArray urls, final com.apple.jobjc.foundation.NSString bundleIdentifier, final long options, final com.apple.jobjc.foundation.NSAppleEventDescriptor descriptor, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> identifiers){
			final com.apple.jobjc.Invoke.MsgSend openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst = get_openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, urls);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bundleIdentifier);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, identifiers);
		openURLs_withAppBundleIdentifier_options_additionalEventParamDescriptor_launchIdentifiers_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performFileOperation_source_destination_files_tag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performFileOperation_source_destination_files_tag_IMetInst(){
		return ((performFileOperation_source_destination_files_tag_IMetInst != null)
	? (performFileOperation_source_destination_files_tag_IMetInst)
	: (performFileOperation_source_destination_files_tag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performFileOperation:source:destination:files:tag:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean performFileOperation_source_destination_files_tag(final com.apple.jobjc.foundation.NSString operation, final com.apple.jobjc.foundation.NSString source, final com.apple.jobjc.foundation.NSString destination, final com.apple.jobjc.foundation.NSArray files, final com.apple.jobjc.Pointer<java.lang.Long> tag){
			final com.apple.jobjc.Invoke.MsgSend performFileOperation_source_destination_files_tag_IMetInst = get_performFileOperation_source_destination_files_tag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performFileOperation_source_destination_files_tag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, operation);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, source);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destination);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, files);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, tag);
		performFileOperation_source_destination_files_tag_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredFilenameExtensionForType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredFilenameExtensionForType_IMetInst(){
		return ((preferredFilenameExtensionForType_IMetInst != null)
	? (preferredFilenameExtensionForType_IMetInst)
	: (preferredFilenameExtensionForType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredFilenameExtensionForType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString preferredFilenameExtensionForType(final com.apple.jobjc.foundation.NSString typeName){
			final com.apple.jobjc.Invoke.MsgSend preferredFilenameExtensionForType_IMetInst = get_preferredFilenameExtensionForType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredFilenameExtensionForType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeName);
		preferredFilenameExtensionForType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend recycleURLs_completionHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_recycleURLs_completionHandler_IMetInst(){
		return ((recycleURLs_completionHandler_IMetInst != null)
	? (recycleURLs_completionHandler_IMetInst)
	: (recycleURLs_completionHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "recycleURLs:completionHandler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void recycleURLs_completionHandler(final com.apple.jobjc.foundation.NSArray URLs, final Object /* void(^)(NSDictionary*,NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend recycleURLs_completionHandler_IMetInst = get_recycleURLs_completionHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		recycleURLs_completionHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLs);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		recycleURLs_completionHandler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend runningApplications_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runningApplications_IMetInst(){
		return ((runningApplications_IMetInst != null)
	? (runningApplications_IMetInst)
	: (runningApplications_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runningApplications", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray runningApplications(){
			final com.apple.jobjc.Invoke.MsgSend runningApplications_IMetInst = get_runningApplications_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runningApplications_IMetInst.init(nativeBuffer, this);
		runningApplications_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectFile_inFileViewerRootedAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectFile_inFileViewerRootedAtPath_IMetInst(){
		return ((selectFile_inFileViewerRootedAtPath_IMetInst != null)
	? (selectFile_inFileViewerRootedAtPath_IMetInst)
	: (selectFile_inFileViewerRootedAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectFile:inFileViewerRootedAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean selectFile_inFileViewerRootedAtPath(final com.apple.jobjc.foundation.NSString fullPath, final com.apple.jobjc.foundation.NSString rootFullPath){
			final com.apple.jobjc.Invoke.MsgSend selectFile_inFileViewerRootedAtPath_IMetInst = get_selectFile_inFileViewerRootedAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectFile_inFileViewerRootedAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rootFullPath);
		selectFile_inFileViewerRootedAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDesktopImageURL_forScreen_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDesktopImageURL_forScreen_options_error_IMetInst(){
		return ((setDesktopImageURL_forScreen_options_error_IMetInst != null)
	? (setDesktopImageURL_forScreen_options_error_IMetInst)
	: (setDesktopImageURL_forScreen_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDesktopImageURL:forScreen:options:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setDesktopImageURL_forScreen_options_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.appkit.NSScreen screen, final com.apple.jobjc.foundation.NSDictionary options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend setDesktopImageURL_forScreen_options_error_IMetInst = get_setDesktopImageURL_forScreen_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDesktopImageURL_forScreen_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, screen);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		setDesktopImageURL_forScreen_options_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setIcon_forFile_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setIcon_forFile_options_IMetInst(){
		return ((setIcon_forFile_options_IMetInst != null)
	? (setIcon_forFile_options_IMetInst)
	: (setIcon_forFile_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setIcon:forFile:options:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean setIcon_forFile_options(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSString fullPath, final long options){
			final com.apple.jobjc.Invoke.MsgSend setIcon_forFile_options_IMetInst = get_setIcon_forFile_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setIcon_forFile_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fullPath);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		setIcon_forFile_options_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showSearchResultsForQueryString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showSearchResultsForQueryString_IMetInst(){
		return ((showSearchResultsForQueryString_IMetInst != null)
	? (showSearchResultsForQueryString_IMetInst)
	: (showSearchResultsForQueryString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showSearchResultsForQueryString:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean showSearchResultsForQueryString(final com.apple.jobjc.foundation.NSString queryString){
			final com.apple.jobjc.Invoke.MsgSend showSearchResultsForQueryString_IMetInst = get_showSearchResultsForQueryString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showSearchResultsForQueryString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, queryString);
		showSearchResultsForQueryString_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend slideImage_from_to_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_slideImage_from_to_IMetInst(){
		return ((slideImage_from_to_IMetInst != null)
	? (slideImage_from_to_IMetInst)
	: (slideImage_from_to_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "slideImage:from:to:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.foundation.NSPoint.getStructCoder())));
	}

	 public void slideImage_from_to(final com.apple.jobjc.appkit.NSImage image, final com.apple.jobjc.foundation.NSPoint fromPoint, final com.apple.jobjc.foundation.NSPoint toPoint){
			final com.apple.jobjc.Invoke.MsgSend slideImage_from_to_IMetInst = get_slideImage_from_to_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		slideImage_from_to_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, fromPoint);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, toPoint);
		slideImage_from_to_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend type_conformsToType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_type_conformsToType_IMetInst(){
		return ((type_conformsToType_IMetInst != null)
	? (type_conformsToType_IMetInst)
	: (type_conformsToType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "type:conformsToType:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean type_conformsToType(final com.apple.jobjc.foundation.NSString firstTypeName, final com.apple.jobjc.foundation.NSString secondTypeName){
			final com.apple.jobjc.Invoke.MsgSend type_conformsToType_IMetInst = get_type_conformsToType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		type_conformsToType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstTypeName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, secondTypeName);
		type_conformsToType_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typeOfFile_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typeOfFile_error_IMetInst(){
		return ((typeOfFile_error_IMetInst != null)
	? (typeOfFile_error_IMetInst)
	: (typeOfFile_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typeOfFile:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString typeOfFile_error(final com.apple.jobjc.foundation.NSString absoluteFilePath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend typeOfFile_error_IMetInst = get_typeOfFile_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typeOfFile_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, absoluteFilePath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		typeOfFile_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unmountAndEjectDeviceAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unmountAndEjectDeviceAtPath_IMetInst(){
		return ((unmountAndEjectDeviceAtPath_IMetInst != null)
	? (unmountAndEjectDeviceAtPath_IMetInst)
	: (unmountAndEjectDeviceAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unmountAndEjectDeviceAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean unmountAndEjectDeviceAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend unmountAndEjectDeviceAtPath_IMetInst = get_unmountAndEjectDeviceAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unmountAndEjectDeviceAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		unmountAndEjectDeviceAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unmountAndEjectDeviceAtURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unmountAndEjectDeviceAtURL_error_IMetInst(){
		return ((unmountAndEjectDeviceAtURL_error_IMetInst != null)
	? (unmountAndEjectDeviceAtURL_error_IMetInst)
	: (unmountAndEjectDeviceAtURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unmountAndEjectDeviceAtURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean unmountAndEjectDeviceAtURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend unmountAndEjectDeviceAtURL_error_IMetInst = get_unmountAndEjectDeviceAtURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unmountAndEjectDeviceAtURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		unmountAndEjectDeviceAtURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userDefaultsChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userDefaultsChanged_IMetInst(){
		return ((userDefaultsChanged_IMetInst != null)
	? (userDefaultsChanged_IMetInst)
	: (userDefaultsChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userDefaultsChanged", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean userDefaultsChanged(){
			final com.apple.jobjc.Invoke.MsgSend userDefaultsChanged_IMetInst = get_userDefaultsChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userDefaultsChanged_IMetInst.init(nativeBuffer, this);
		userDefaultsChanged_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
