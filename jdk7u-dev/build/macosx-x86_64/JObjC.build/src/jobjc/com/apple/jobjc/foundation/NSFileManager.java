package com.apple.jobjc.foundation;

public  class NSFileManager extends com.apple.jobjc.foundation.NSObject {
	public NSFileManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileManager(final NSFileManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst(){
		return ((URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst != null)
	? (URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst)
	: (URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForDirectory:inDomain:appropriateForURL:create:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForDirectory_inDomain_appropriateForURL_create_error(final long directory, final long domain, final com.apple.jobjc.foundation.NSURL url, final boolean shouldCreate, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst = get_URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, directory);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, domain);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldCreate);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		URLForDirectory_inDomain_appropriateForURL_create_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst(){
		return ((URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst != null)
	? (URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst)
	: (URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForPublishingUbiquitousItemAtURL:expirationDate:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForPublishingUbiquitousItemAtURL_expirationDate_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSDate> outDate, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst = get_URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outDate);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		URLForPublishingUbiquitousItemAtURL_expirationDate_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLForUbiquityContainerIdentifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForUbiquityContainerIdentifier_IMetInst(){
		return ((URLForUbiquityContainerIdentifier_IMetInst != null)
	? (URLForUbiquityContainerIdentifier_IMetInst)
	: (URLForUbiquityContainerIdentifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForUbiquityContainerIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForUbiquityContainerIdentifier(final com.apple.jobjc.foundation.NSString containerIdentifier){
			final com.apple.jobjc.Invoke.MsgSend URLForUbiquityContainerIdentifier_IMetInst = get_URLForUbiquityContainerIdentifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForUbiquityContainerIdentifier_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, containerIdentifier);
		URLForUbiquityContainerIdentifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLsForDirectory_inDomains_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLsForDirectory_inDomains_IMetInst(){
		return ((URLsForDirectory_inDomains_IMetInst != null)
	? (URLsForDirectory_inDomains_IMetInst)
	: (URLsForDirectory_inDomains_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLsForDirectory:inDomains:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray URLsForDirectory_inDomains(final long directory, final long domainMask){
			final com.apple.jobjc.Invoke.MsgSend URLsForDirectory_inDomains_IMetInst = get_URLsForDirectory_inDomains_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLsForDirectory_inDomains_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, directory);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, domainMask);
		URLsForDirectory_inDomains_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributesOfFileSystemForPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributesOfFileSystemForPath_error_IMetInst(){
		return ((attributesOfFileSystemForPath_error_IMetInst != null)
	? (attributesOfFileSystemForPath_error_IMetInst)
	: (attributesOfFileSystemForPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributesOfFileSystemForPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributesOfFileSystemForPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend attributesOfFileSystemForPath_error_IMetInst = get_attributesOfFileSystemForPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributesOfFileSystemForPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		attributesOfFileSystemForPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributesOfItemAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributesOfItemAtPath_error_IMetInst(){
		return ((attributesOfItemAtPath_error_IMetInst != null)
	? (attributesOfItemAtPath_error_IMetInst)
	: (attributesOfItemAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributesOfItemAtPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary attributesOfItemAtPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend attributesOfItemAtPath_error_IMetInst = get_attributesOfItemAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributesOfItemAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		attributesOfItemAtPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend changeCurrentDirectoryPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeCurrentDirectoryPath_IMetInst(){
		return ((changeCurrentDirectoryPath_IMetInst != null)
	? (changeCurrentDirectoryPath_IMetInst)
	: (changeCurrentDirectoryPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeCurrentDirectoryPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean changeCurrentDirectoryPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend changeCurrentDirectoryPath_IMetInst = get_changeCurrentDirectoryPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeCurrentDirectoryPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		changeCurrentDirectoryPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend changeFileAttributes_atPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeFileAttributes_atPath_IMetInst(){
		return ((changeFileAttributes_atPath_IMetInst != null)
	? (changeFileAttributes_atPath_IMetInst)
	: (changeFileAttributes_atPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeFileAttributes:atPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean changeFileAttributes_atPath(final com.apple.jobjc.foundation.NSDictionary attributes, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend changeFileAttributes_atPath_IMetInst = get_changeFileAttributes_atPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeFileAttributes_atPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		changeFileAttributes_atPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend componentsToDisplayForPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_componentsToDisplayForPath_IMetInst(){
		return ((componentsToDisplayForPath_IMetInst != null)
	? (componentsToDisplayForPath_IMetInst)
	: (componentsToDisplayForPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "componentsToDisplayForPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray componentsToDisplayForPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend componentsToDisplayForPath_IMetInst = get_componentsToDisplayForPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		componentsToDisplayForPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		componentsToDisplayForPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentsAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentsAtPath_IMetInst(){
		return ((contentsAtPath_IMetInst != null)
	? (contentsAtPath_IMetInst)
	: (contentsAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentsAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData contentsAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend contentsAtPath_IMetInst = get_contentsAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentsAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		contentsAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentsEqualAtPath_andPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentsEqualAtPath_andPath_IMetInst(){
		return ((contentsEqualAtPath_andPath_IMetInst != null)
	? (contentsEqualAtPath_andPath_IMetInst)
	: (contentsEqualAtPath_andPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentsEqualAtPath:andPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean contentsEqualAtPath_andPath(final com.apple.jobjc.foundation.NSString path1, final com.apple.jobjc.foundation.NSString path2){
			final com.apple.jobjc.Invoke.MsgSend contentsEqualAtPath_andPath_IMetInst = get_contentsEqualAtPath_andPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentsEqualAtPath_andPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path2);
		contentsEqualAtPath_andPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentsOfDirectoryAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentsOfDirectoryAtPath_error_IMetInst(){
		return ((contentsOfDirectoryAtPath_error_IMetInst != null)
	? (contentsOfDirectoryAtPath_error_IMetInst)
	: (contentsOfDirectoryAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentsOfDirectoryAtPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray contentsOfDirectoryAtPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend contentsOfDirectoryAtPath_error_IMetInst = get_contentsOfDirectoryAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentsOfDirectoryAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		contentsOfDirectoryAtPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst(){
		return ((contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst != null)
	? (contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst)
	: (contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentsOfDirectoryAtURL:includingPropertiesForKeys:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSArray keys, final long mask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst = get_contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		contentsOfDirectoryAtURL_includingPropertiesForKeys_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyItemAtPath_toPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyItemAtPath_toPath_error_IMetInst(){
		return ((copyItemAtPath_toPath_error_IMetInst != null)
	? (copyItemAtPath_toPath_error_IMetInst)
	: (copyItemAtPath_toPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyItemAtPath:toPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean copyItemAtPath_toPath_error(final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend copyItemAtPath_toPath_error_IMetInst = get_copyItemAtPath_toPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyItemAtPath_toPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		copyItemAtPath_toPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyItemAtURL_toURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyItemAtURL_toURL_error_IMetInst(){
		return ((copyItemAtURL_toURL_error_IMetInst != null)
	? (copyItemAtURL_toURL_error_IMetInst)
	: (copyItemAtURL_toURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyItemAtURL:toURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean copyItemAtURL_toURL_error(final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend copyItemAtURL_toURL_error_IMetInst = get_copyItemAtURL_toURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyItemAtURL_toURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		copyItemAtURL_toURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend copyPath_toPath_handler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyPath_toPath_handler_IMetInst(){
		return ((copyPath_toPath_handler_IMetInst != null)
	? (copyPath_toPath_handler_IMetInst)
	: (copyPath_toPath_handler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyPath:toPath:handler:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean copyPath_toPath_handler(final com.apple.jobjc.foundation.NSString src, final com.apple.jobjc.foundation.NSString dest, final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend copyPath_toPath_handler_IMetInst = get_copyPath_toPath_handler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyPath_toPath_handler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, src);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dest);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		copyPath_toPath_handler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createDirectoryAtPath_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createDirectoryAtPath_attributes_IMetInst(){
		return ((createDirectoryAtPath_attributes_IMetInst != null)
	? (createDirectoryAtPath_attributes_IMetInst)
	: (createDirectoryAtPath_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createDirectoryAtPath:attributes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean createDirectoryAtPath_attributes(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend createDirectoryAtPath_attributes_IMetInst = get_createDirectoryAtPath_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createDirectoryAtPath_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		createDirectoryAtPath_attributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst(){
		return ((createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst != null)
	? (createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst)
	: (createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createDirectoryAtPath:withIntermediateDirectories:attributes:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean createDirectoryAtPath_withIntermediateDirectories_attributes_error(final com.apple.jobjc.foundation.NSString path, final boolean createIntermediates, final com.apple.jobjc.foundation.NSDictionary attributes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst = get_createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, createIntermediates);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		createDirectoryAtPath_withIntermediateDirectories_attributes_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst(){
		return ((createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst != null)
	? (createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst)
	: (createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createDirectoryAtURL:withIntermediateDirectories:attributes:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean createDirectoryAtURL_withIntermediateDirectories_attributes_error(final com.apple.jobjc.foundation.NSURL url, final boolean createIntermediates, final com.apple.jobjc.foundation.NSDictionary attributes, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst = get_createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, createIntermediates);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		createDirectoryAtURL_withIntermediateDirectories_attributes_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createFileAtPath_contents_attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createFileAtPath_contents_attributes_IMetInst(){
		return ((createFileAtPath_contents_attributes_IMetInst != null)
	? (createFileAtPath_contents_attributes_IMetInst)
	: (createFileAtPath_contents_attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createFileAtPath:contents:attributes:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean createFileAtPath_contents_attributes(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSDictionary attr){
			final com.apple.jobjc.Invoke.MsgSend createFileAtPath_contents_attributes_IMetInst = get_createFileAtPath_contents_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createFileAtPath_contents_attributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attr);
		createFileAtPath_contents_attributes_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtPath_pathContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createSymbolicLinkAtPath_pathContent_IMetInst(){
		return ((createSymbolicLinkAtPath_pathContent_IMetInst != null)
	? (createSymbolicLinkAtPath_pathContent_IMetInst)
	: (createSymbolicLinkAtPath_pathContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createSymbolicLinkAtPath:pathContent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean createSymbolicLinkAtPath_pathContent(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString otherpath){
			final com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtPath_pathContent_IMetInst = get_createSymbolicLinkAtPath_pathContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createSymbolicLinkAtPath_pathContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, otherpath);
		createSymbolicLinkAtPath_pathContent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtPath_withDestinationPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createSymbolicLinkAtPath_withDestinationPath_error_IMetInst(){
		return ((createSymbolicLinkAtPath_withDestinationPath_error_IMetInst != null)
	? (createSymbolicLinkAtPath_withDestinationPath_error_IMetInst)
	: (createSymbolicLinkAtPath_withDestinationPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createSymbolicLinkAtPath:withDestinationPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean createSymbolicLinkAtPath_withDestinationPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString destPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtPath_withDestinationPath_error_IMetInst = get_createSymbolicLinkAtPath_withDestinationPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createSymbolicLinkAtPath_withDestinationPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		createSymbolicLinkAtPath_withDestinationPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtURL_withDestinationURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_createSymbolicLinkAtURL_withDestinationURL_error_IMetInst(){
		return ((createSymbolicLinkAtURL_withDestinationURL_error_IMetInst != null)
	? (createSymbolicLinkAtURL_withDestinationURL_error_IMetInst)
	: (createSymbolicLinkAtURL_withDestinationURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "createSymbolicLinkAtURL:withDestinationURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean createSymbolicLinkAtURL_withDestinationURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSURL destURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend createSymbolicLinkAtURL_withDestinationURL_error_IMetInst = get_createSymbolicLinkAtURL_withDestinationURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		createSymbolicLinkAtURL_withDestinationURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		createSymbolicLinkAtURL_withDestinationURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentDirectoryPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentDirectoryPath_IMetInst(){
		return ((currentDirectoryPath_IMetInst != null)
	? (currentDirectoryPath_IMetInst)
	: (currentDirectoryPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentDirectoryPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString currentDirectoryPath(){
			final com.apple.jobjc.Invoke.MsgSend currentDirectoryPath_IMetInst = get_currentDirectoryPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentDirectoryPath_IMetInst.init(nativeBuffer, this);
		currentDirectoryPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend destinationOfSymbolicLinkAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_destinationOfSymbolicLinkAtPath_error_IMetInst(){
		return ((destinationOfSymbolicLinkAtPath_error_IMetInst != null)
	? (destinationOfSymbolicLinkAtPath_error_IMetInst)
	: (destinationOfSymbolicLinkAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "destinationOfSymbolicLinkAtPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString destinationOfSymbolicLinkAtPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend destinationOfSymbolicLinkAtPath_error_IMetInst = get_destinationOfSymbolicLinkAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		destinationOfSymbolicLinkAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		destinationOfSymbolicLinkAtPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend directoryContentsAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_directoryContentsAtPath_IMetInst(){
		return ((directoryContentsAtPath_IMetInst != null)
	? (directoryContentsAtPath_IMetInst)
	: (directoryContentsAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "directoryContentsAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray directoryContentsAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend directoryContentsAtPath_IMetInst = get_directoryContentsAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		directoryContentsAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		directoryContentsAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend displayNameAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_displayNameAtPath_IMetInst(){
		return ((displayNameAtPath_IMetInst != null)
	? (displayNameAtPath_IMetInst)
	: (displayNameAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "displayNameAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString displayNameAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend displayNameAtPath_IMetInst = get_displayNameAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		displayNameAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		displayNameAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumeratorAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumeratorAtPath_IMetInst(){
		return ((enumeratorAtPath_IMetInst != null)
	? (enumeratorAtPath_IMetInst)
	: (enumeratorAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumeratorAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDirectoryEnumerator enumeratorAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend enumeratorAtPath_IMetInst = get_enumeratorAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumeratorAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		enumeratorAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDirectoryEnumerator returnValue = (com.apple.jobjc.foundation.NSDirectoryEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst(){
		return ((enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst != null)
	? (enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst)
	: (enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "enumeratorAtURL:includingPropertiesForKeys:options:errorHandler:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDirectoryEnumerator enumeratorAtURL_includingPropertiesForKeys_options_errorHandler(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSArray keys, final long mask, final Object /* BOOL(^)(NSURL*,NSError*) (@, @) */ handler){
			final com.apple.jobjc.Invoke.MsgSend enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst = get_enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, handler);
		enumeratorAtURL_includingPropertiesForKeys_options_errorHandler_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDirectoryEnumerator returnValue = (com.apple.jobjc.foundation.NSDirectoryEnumerator) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend evictUbiquitousItemAtURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_evictUbiquitousItemAtURL_error_IMetInst(){
		return ((evictUbiquitousItemAtURL_error_IMetInst != null)
	? (evictUbiquitousItemAtURL_error_IMetInst)
	: (evictUbiquitousItemAtURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "evictUbiquitousItemAtURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean evictUbiquitousItemAtURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend evictUbiquitousItemAtURL_error_IMetInst = get_evictUbiquitousItemAtURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		evictUbiquitousItemAtURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		evictUbiquitousItemAtURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileAttributesAtPath_traverseLink_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileAttributesAtPath_traverseLink_IMetInst(){
		return ((fileAttributesAtPath_traverseLink_IMetInst != null)
	? (fileAttributesAtPath_traverseLink_IMetInst)
	: (fileAttributesAtPath_traverseLink_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileAttributesAtPath:traverseLink:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileAttributesAtPath_traverseLink(final com.apple.jobjc.foundation.NSString path, final boolean yorn){
			final com.apple.jobjc.Invoke.MsgSend fileAttributesAtPath_traverseLink_IMetInst = get_fileAttributesAtPath_traverseLink_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileAttributesAtPath_traverseLink_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yorn);
		fileAttributesAtPath_traverseLink_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileExistsAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileExistsAtPath_IMetInst(){
		return ((fileExistsAtPath_IMetInst != null)
	? (fileExistsAtPath_IMetInst)
	: (fileExistsAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileExistsAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean fileExistsAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileExistsAtPath_IMetInst = get_fileExistsAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileExistsAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileExistsAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileExistsAtPath_isDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileExistsAtPath_isDirectory_IMetInst(){
		return ((fileExistsAtPath_isDirectory_IMetInst != null)
	? (fileExistsAtPath_isDirectory_IMetInst)
	: (fileExistsAtPath_isDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileExistsAtPath:isDirectory:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean fileExistsAtPath_isDirectory(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<java.lang.Boolean> isDirectory){
			final com.apple.jobjc.Invoke.MsgSend fileExistsAtPath_isDirectory_IMetInst = get_fileExistsAtPath_isDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileExistsAtPath_isDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, isDirectory);
		fileExistsAtPath_isDirectory_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemAttributesAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemAttributesAtPath_IMetInst(){
		return ((fileSystemAttributesAtPath_IMetInst != null)
	? (fileSystemAttributesAtPath_IMetInst)
	: (fileSystemAttributesAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemAttributesAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileSystemAttributesAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileSystemAttributesAtPath_IMetInst = get_fileSystemAttributesAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemAttributesAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileSystemAttributesAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileSystemRepresentationWithPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileSystemRepresentationWithPath_IMetInst(){
		return ((fileSystemRepresentationWithPath_IMetInst != null)
	? (fileSystemRepresentationWithPath_IMetInst)
	: (fileSystemRepresentationWithPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileSystemRepresentationWithPath:", com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Byte> fileSystemRepresentationWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileSystemRepresentationWithPath_IMetInst = get_fileSystemRepresentationWithPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileSystemRepresentationWithPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileSystemRepresentationWithPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Byte> returnValue = (com.apple.jobjc.Pointer<java.lang.Byte>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDeletableFileAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDeletableFileAtPath_IMetInst(){
		return ((isDeletableFileAtPath_IMetInst != null)
	? (isDeletableFileAtPath_IMetInst)
	: (isDeletableFileAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDeletableFileAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isDeletableFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend isDeletableFileAtPath_IMetInst = get_isDeletableFileAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDeletableFileAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		isDeletableFileAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isExecutableFileAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isExecutableFileAtPath_IMetInst(){
		return ((isExecutableFileAtPath_IMetInst != null)
	? (isExecutableFileAtPath_IMetInst)
	: (isExecutableFileAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isExecutableFileAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isExecutableFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend isExecutableFileAtPath_IMetInst = get_isExecutableFileAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isExecutableFileAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		isExecutableFileAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isReadableFileAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isReadableFileAtPath_IMetInst(){
		return ((isReadableFileAtPath_IMetInst != null)
	? (isReadableFileAtPath_IMetInst)
	: (isReadableFileAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isReadableFileAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isReadableFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend isReadableFileAtPath_IMetInst = get_isReadableFileAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isReadableFileAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		isReadableFileAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isUbiquitousItemAtURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isUbiquitousItemAtURL_IMetInst(){
		return ((isUbiquitousItemAtURL_IMetInst != null)
	? (isUbiquitousItemAtURL_IMetInst)
	: (isUbiquitousItemAtURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isUbiquitousItemAtURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isUbiquitousItemAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend isUbiquitousItemAtURL_IMetInst = get_isUbiquitousItemAtURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isUbiquitousItemAtURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		isUbiquitousItemAtURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isWritableFileAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isWritableFileAtPath_IMetInst(){
		return ((isWritableFileAtPath_IMetInst != null)
	? (isWritableFileAtPath_IMetInst)
	: (isWritableFileAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isWritableFileAtPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean isWritableFileAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend isWritableFileAtPath_IMetInst = get_isWritableFileAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isWritableFileAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		isWritableFileAtPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend linkItemAtPath_toPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linkItemAtPath_toPath_error_IMetInst(){
		return ((linkItemAtPath_toPath_error_IMetInst != null)
	? (linkItemAtPath_toPath_error_IMetInst)
	: (linkItemAtPath_toPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linkItemAtPath:toPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean linkItemAtPath_toPath_error(final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend linkItemAtPath_toPath_error_IMetInst = get_linkItemAtPath_toPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linkItemAtPath_toPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		linkItemAtPath_toPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend linkItemAtURL_toURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linkItemAtURL_toURL_error_IMetInst(){
		return ((linkItemAtURL_toURL_error_IMetInst != null)
	? (linkItemAtURL_toURL_error_IMetInst)
	: (linkItemAtURL_toURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linkItemAtURL:toURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean linkItemAtURL_toURL_error(final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend linkItemAtURL_toURL_error_IMetInst = get_linkItemAtURL_toURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linkItemAtURL_toURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		linkItemAtURL_toURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend linkPath_toPath_handler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_linkPath_toPath_handler_IMetInst(){
		return ((linkPath_toPath_handler_IMetInst != null)
	? (linkPath_toPath_handler_IMetInst)
	: (linkPath_toPath_handler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "linkPath:toPath:handler:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean linkPath_toPath_handler(final com.apple.jobjc.foundation.NSString src, final com.apple.jobjc.foundation.NSString dest, final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend linkPath_toPath_handler_IMetInst = get_linkPath_toPath_handler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		linkPath_toPath_handler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, src);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dest);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		linkPath_toPath_handler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst(){
		return ((mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst != null)
	? (mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst)
	: (mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mountedVolumeURLsIncludingResourceValuesForKeys:options:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray mountedVolumeURLsIncludingResourceValuesForKeys_options(final com.apple.jobjc.foundation.NSArray propertyKeys, final long options){
			final com.apple.jobjc.Invoke.MsgSend mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst = get_mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKeys);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		mountedVolumeURLsIncludingResourceValuesForKeys_options_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveItemAtPath_toPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveItemAtPath_toPath_error_IMetInst(){
		return ((moveItemAtPath_toPath_error_IMetInst != null)
	? (moveItemAtPath_toPath_error_IMetInst)
	: (moveItemAtPath_toPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveItemAtPath:toPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean moveItemAtPath_toPath_error(final com.apple.jobjc.foundation.NSString srcPath, final com.apple.jobjc.foundation.NSString dstPath, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend moveItemAtPath_toPath_error_IMetInst = get_moveItemAtPath_toPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveItemAtPath_toPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcPath);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstPath);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		moveItemAtPath_toPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveItemAtURL_toURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveItemAtURL_toURL_error_IMetInst(){
		return ((moveItemAtURL_toURL_error_IMetInst != null)
	? (moveItemAtURL_toURL_error_IMetInst)
	: (moveItemAtURL_toURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveItemAtURL:toURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean moveItemAtURL_toURL_error(final com.apple.jobjc.foundation.NSURL srcURL, final com.apple.jobjc.foundation.NSURL dstURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend moveItemAtURL_toURL_error_IMetInst = get_moveItemAtURL_toURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveItemAtURL_toURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, srcURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dstURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		moveItemAtURL_toURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend movePath_toPath_handler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_movePath_toPath_handler_IMetInst(){
		return ((movePath_toPath_handler_IMetInst != null)
	? (movePath_toPath_handler_IMetInst)
	: (movePath_toPath_handler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "movePath:toPath:handler:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean movePath_toPath_handler(final com.apple.jobjc.foundation.NSString src, final com.apple.jobjc.foundation.NSString dest, final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend movePath_toPath_handler_IMetInst = get_movePath_toPath_handler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		movePath_toPath_handler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, src);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dest);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		movePath_toPath_handler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathContentOfSymbolicLinkAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathContentOfSymbolicLinkAtPath_IMetInst(){
		return ((pathContentOfSymbolicLinkAtPath_IMetInst != null)
	? (pathContentOfSymbolicLinkAtPath_IMetInst)
	: (pathContentOfSymbolicLinkAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathContentOfSymbolicLinkAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathContentOfSymbolicLinkAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend pathContentOfSymbolicLinkAtPath_IMetInst = get_pathContentOfSymbolicLinkAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathContentOfSymbolicLinkAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		pathContentOfSymbolicLinkAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFileAtPath_handler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFileAtPath_handler_IMetInst(){
		return ((removeFileAtPath_handler_IMetInst != null)
	? (removeFileAtPath_handler_IMetInst)
	: (removeFileAtPath_handler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFileAtPath:handler:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removeFileAtPath_handler(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.ID handler){
			final com.apple.jobjc.Invoke.MsgSend removeFileAtPath_handler_IMetInst = get_removeFileAtPath_handler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFileAtPath_handler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, handler);
		removeFileAtPath_handler_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemAtPath_error_IMetInst(){
		return ((removeItemAtPath_error_IMetInst != null)
	? (removeItemAtPath_error_IMetInst)
	: (removeItemAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemAtPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean removeItemAtPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend removeItemAtPath_error_IMetInst = get_removeItemAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		removeItemAtPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemAtURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemAtURL_error_IMetInst(){
		return ((removeItemAtURL_error_IMetInst != null)
	? (removeItemAtURL_error_IMetInst)
	: (removeItemAtURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemAtURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean removeItemAtURL_error(final com.apple.jobjc.foundation.NSURL URL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend removeItemAtURL_error_IMetInst = get_removeItemAtURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemAtURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		removeItemAtURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst(){
		return ((replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst != null)
	? (replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst)
	: (replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceItemAtURL:withItemAtURL:backupItemName:options:resultingItemURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error(final com.apple.jobjc.foundation.NSURL originalItemURL, final com.apple.jobjc.foundation.NSURL newItemURL, final com.apple.jobjc.foundation.NSString backupItemName, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSURL> resultingURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst = get_replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, originalItemURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newItemURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, backupItemName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, resultingURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		replaceItemAtURL_withItemAtURL_backupItemName_options_resultingItemURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributes_ofItemAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributes_ofItemAtPath_error_IMetInst(){
		return ((setAttributes_ofItemAtPath_error_IMetInst != null)
	? (setAttributes_ofItemAtPath_error_IMetInst)
	: (setAttributes_ofItemAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributes:ofItemAtPath:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setAttributes_ofItemAtPath_error(final com.apple.jobjc.foundation.NSDictionary attributes, final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend setAttributes_ofItemAtPath_error_IMetInst = get_setAttributes_ofItemAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributes_ofItemAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		setAttributes_ofItemAtPath_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID delegate){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUbiquitous_itemAtURL_destinationURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUbiquitous_itemAtURL_destinationURL_error_IMetInst(){
		return ((setUbiquitous_itemAtURL_destinationURL_error_IMetInst != null)
	? (setUbiquitous_itemAtURL_destinationURL_error_IMetInst)
	: (setUbiquitous_itemAtURL_destinationURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUbiquitous:itemAtURL:destinationURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setUbiquitous_itemAtURL_destinationURL_error(final boolean flag, final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSURL destinationURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend setUbiquitous_itemAtURL_destinationURL_error_IMetInst = get_setUbiquitous_itemAtURL_destinationURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUbiquitous_itemAtURL_destinationURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, destinationURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		setUbiquitous_itemAtURL_destinationURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startDownloadingUbiquitousItemAtURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startDownloadingUbiquitousItemAtURL_error_IMetInst(){
		return ((startDownloadingUbiquitousItemAtURL_error_IMetInst != null)
	? (startDownloadingUbiquitousItemAtURL_error_IMetInst)
	: (startDownloadingUbiquitousItemAtURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startDownloadingUbiquitousItemAtURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean startDownloadingUbiquitousItemAtURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend startDownloadingUbiquitousItemAtURL_error_IMetInst = get_startDownloadingUbiquitousItemAtURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startDownloadingUbiquitousItemAtURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		startDownloadingUbiquitousItemAtURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithFileSystemRepresentation_length_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithFileSystemRepresentation_length_IMetInst(){
		return ((stringWithFileSystemRepresentation_length_IMetInst != null)
	? (stringWithFileSystemRepresentation_length_IMetInst)
	: (stringWithFileSystemRepresentation_length_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithFileSystemRepresentation:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString stringWithFileSystemRepresentation_length(final com.apple.jobjc.Pointer<java.lang.Byte> str, final long len){
			final com.apple.jobjc.Invoke.MsgSend stringWithFileSystemRepresentation_length_IMetInst = get_stringWithFileSystemRepresentation_length_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithFileSystemRepresentation_length_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, str);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, len);
		stringWithFileSystemRepresentation_length_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subpathsAtPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subpathsAtPath_IMetInst(){
		return ((subpathsAtPath_IMetInst != null)
	? (subpathsAtPath_IMetInst)
	: (subpathsAtPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subpathsAtPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subpathsAtPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend subpathsAtPath_IMetInst = get_subpathsAtPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subpathsAtPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		subpathsAtPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subpathsOfDirectoryAtPath_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subpathsOfDirectoryAtPath_error_IMetInst(){
		return ((subpathsOfDirectoryAtPath_error_IMetInst != null)
	? (subpathsOfDirectoryAtPath_error_IMetInst)
	: (subpathsOfDirectoryAtPath_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subpathsOfDirectoryAtPath:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray subpathsOfDirectoryAtPath_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend subpathsOfDirectoryAtPath_error_IMetInst = get_subpathsOfDirectoryAtPath_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subpathsOfDirectoryAtPath_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		subpathsOfDirectoryAtPath_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend trashItemAtURL_resultingItemURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_trashItemAtURL_resultingItemURL_error_IMetInst(){
		return ((trashItemAtURL_resultingItemURL_error_IMetInst != null)
	? (trashItemAtURL_resultingItemURL_error_IMetInst)
	: (trashItemAtURL_resultingItemURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "trashItemAtURL:resultingItemURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean trashItemAtURL_resultingItemURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSURL> outResultingURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend trashItemAtURL_resultingItemURL_error_IMetInst = get_trashItemAtURL_resultingItemURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		trashItemAtURL_resultingItemURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outResultingURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		trashItemAtURL_resultingItemURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend ubiquityIdentityToken_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_ubiquityIdentityToken_IMetInst(){
		return ((ubiquityIdentityToken_IMetInst != null)
	? (ubiquityIdentityToken_IMetInst)
	: (ubiquityIdentityToken_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "ubiquityIdentityToken", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T ubiquityIdentityToken(){
			final com.apple.jobjc.Invoke.MsgSend ubiquityIdentityToken_IMetInst = get_ubiquityIdentityToken_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		ubiquityIdentityToken_IMetInst.init(nativeBuffer, this);
		ubiquityIdentityToken_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
