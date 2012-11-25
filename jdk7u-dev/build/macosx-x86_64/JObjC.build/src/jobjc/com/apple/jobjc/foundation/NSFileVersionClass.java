package com.apple.jobjc.foundation;

public  class NSFileVersionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFileVersionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFileVersionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFileVersionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst(){
		return ((addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst != null)
	? (addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst)
	: (addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addVersionOfItemAtURL:withContentsOfURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileVersion addVersionOfItemAtURL_withContentsOfURL_options_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.foundation.NSURL contentsURL, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst = get_addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contentsURL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		addVersionOfItemAtURL_withContentsOfURL_options_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileVersion returnValue = (com.apple.jobjc.foundation.NSFileVersion) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentVersionOfItemAtURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentVersionOfItemAtURL_CMetInst(){
		return ((currentVersionOfItemAtURL_CMetInst != null)
	? (currentVersionOfItemAtURL_CMetInst)
	: (currentVersionOfItemAtURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentVersionOfItemAtURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileVersion currentVersionOfItemAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend currentVersionOfItemAtURL_CMetInst = get_currentVersionOfItemAtURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentVersionOfItemAtURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		currentVersionOfItemAtURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileVersion returnValue = (com.apple.jobjc.foundation.NSFileVersion) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend otherVersionsOfItemAtURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_otherVersionsOfItemAtURL_CMetInst(){
		return ((otherVersionsOfItemAtURL_CMetInst != null)
	? (otherVersionsOfItemAtURL_CMetInst)
	: (otherVersionsOfItemAtURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "otherVersionsOfItemAtURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray otherVersionsOfItemAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend otherVersionsOfItemAtURL_CMetInst = get_otherVersionsOfItemAtURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		otherVersionsOfItemAtURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		otherVersionsOfItemAtURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeOtherVersionsOfItemAtURL_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeOtherVersionsOfItemAtURL_error_CMetInst(){
		return ((removeOtherVersionsOfItemAtURL_error_CMetInst != null)
	? (removeOtherVersionsOfItemAtURL_error_CMetInst)
	: (removeOtherVersionsOfItemAtURL_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeOtherVersionsOfItemAtURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean removeOtherVersionsOfItemAtURL_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend removeOtherVersionsOfItemAtURL_error_CMetInst = get_removeOtherVersionsOfItemAtURL_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeOtherVersionsOfItemAtURL_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		removeOtherVersionsOfItemAtURL_error_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst(){
		return ((temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst != null)
	? (temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst)
	: (temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "temporaryDirectoryURLForNewVersionOfItemAtURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL temporaryDirectoryURLForNewVersionOfItemAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst = get_temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		temporaryDirectoryURLForNewVersionOfItemAtURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend unresolvedConflictVersionsOfItemAtURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unresolvedConflictVersionsOfItemAtURL_CMetInst(){
		return ((unresolvedConflictVersionsOfItemAtURL_CMetInst != null)
	? (unresolvedConflictVersionsOfItemAtURL_CMetInst)
	: (unresolvedConflictVersionsOfItemAtURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unresolvedConflictVersionsOfItemAtURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray unresolvedConflictVersionsOfItemAtURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend unresolvedConflictVersionsOfItemAtURL_CMetInst = get_unresolvedConflictVersionsOfItemAtURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unresolvedConflictVersionsOfItemAtURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		unresolvedConflictVersionsOfItemAtURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend versionOfItemAtURL_forPersistentIdentifier_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_versionOfItemAtURL_forPersistentIdentifier_CMetInst(){
		return ((versionOfItemAtURL_forPersistentIdentifier_CMetInst != null)
	? (versionOfItemAtURL_forPersistentIdentifier_CMetInst)
	: (versionOfItemAtURL_forPersistentIdentifier_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "versionOfItemAtURL:forPersistentIdentifier:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSFileVersion versionOfItemAtURL_forPersistentIdentifier(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.ID persistentIdentifier){
			final com.apple.jobjc.Invoke.MsgSend versionOfItemAtURL_forPersistentIdentifier_CMetInst = get_versionOfItemAtURL_forPersistentIdentifier_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		versionOfItemAtURL_forPersistentIdentifier_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, persistentIdentifier);
		versionOfItemAtURL_forPersistentIdentifier_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSFileVersion returnValue = (com.apple.jobjc.foundation.NSFileVersion) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
