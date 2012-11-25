package com.apple.jobjc.foundation;

public  class NSFileWrapper extends com.apple.jobjc.foundation.NSObject {
	public NSFileWrapper(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileWrapper(final NSFileWrapper obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addFileWithPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addFileWithPath_IMetInst(){
		return ((addFileWithPath_IMetInst != null)
	? (addFileWithPath_IMetInst)
	: (addFileWithPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addFileWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString addFileWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend addFileWithPath_IMetInst = get_addFileWithPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addFileWithPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		addFileWithPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addFileWrapper_IMetInst(){
		return ((addFileWrapper_IMetInst != null)
	? (addFileWrapper_IMetInst)
	: (addFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addFileWrapper:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString addFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper child){
			final com.apple.jobjc.Invoke.MsgSend addFileWrapper_IMetInst = get_addFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		addFileWrapper_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addRegularFileWithContents_preferredFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addRegularFileWithContents_preferredFilename_IMetInst(){
		return ((addRegularFileWithContents_preferredFilename_IMetInst != null)
	? (addRegularFileWithContents_preferredFilename_IMetInst)
	: (addRegularFileWithContents_preferredFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addRegularFileWithContents:preferredFilename:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString addRegularFileWithContents_preferredFilename(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend addRegularFileWithContents_preferredFilename_IMetInst = get_addRegularFileWithContents_preferredFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addRegularFileWithContents_preferredFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		addRegularFileWithContents_preferredFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addSymbolicLinkWithDestination_preferredFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSymbolicLinkWithDestination_preferredFilename_IMetInst(){
		return ((addSymbolicLinkWithDestination_preferredFilename_IMetInst != null)
	? (addSymbolicLinkWithDestination_preferredFilename_IMetInst)
	: (addSymbolicLinkWithDestination_preferredFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSymbolicLinkWithDestination:preferredFilename:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString addSymbolicLinkWithDestination_preferredFilename(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend addSymbolicLinkWithDestination_preferredFilename_IMetInst = get_addSymbolicLinkWithDestination_preferredFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSymbolicLinkWithDestination_preferredFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		addSymbolicLinkWithDestination_preferredFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileAttributes_IMetInst(){
		return ((fileAttributes_IMetInst != null)
	? (fileAttributes_IMetInst)
	: (fileAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileAttributes(){
			final com.apple.jobjc.Invoke.MsgSend fileAttributes_IMetInst = get_fileAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileAttributes_IMetInst.init(nativeBuffer, this);
		fileAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileWrappers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileWrappers_IMetInst(){
		return ((fileWrappers_IMetInst != null)
	? (fileWrappers_IMetInst)
	: (fileWrappers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileWrappers", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary fileWrappers(){
			final com.apple.jobjc.Invoke.MsgSend fileWrappers_IMetInst = get_fileWrappers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileWrappers_IMetInst.init(nativeBuffer, this);
		fileWrappers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filename_IMetInst(){
		return ((filename_IMetInst != null)
	? (filename_IMetInst)
	: (filename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString filename(){
			final com.apple.jobjc.Invoke.MsgSend filename_IMetInst = get_filename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filename_IMetInst.init(nativeBuffer, this);
		filename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initDirectoryWithFileWrappers_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initDirectoryWithFileWrappers_IMetInst(){
		return ((initDirectoryWithFileWrappers_IMetInst != null)
	? (initDirectoryWithFileWrappers_IMetInst)
	: (initDirectoryWithFileWrappers_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initDirectoryWithFileWrappers:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initDirectoryWithFileWrappers(final com.apple.jobjc.foundation.NSDictionary childrenByPreferredName){
			final com.apple.jobjc.Invoke.MsgSend initDirectoryWithFileWrappers_IMetInst = get_initDirectoryWithFileWrappers_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initDirectoryWithFileWrappers_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, childrenByPreferredName);
		initDirectoryWithFileWrappers_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initRegularFileWithContents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initRegularFileWithContents_IMetInst(){
		return ((initRegularFileWithContents_IMetInst != null)
	? (initRegularFileWithContents_IMetInst)
	: (initRegularFileWithContents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initRegularFileWithContents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initRegularFileWithContents(final com.apple.jobjc.foundation.NSData contents){
			final com.apple.jobjc.Invoke.MsgSend initRegularFileWithContents_IMetInst = get_initRegularFileWithContents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initRegularFileWithContents_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, contents);
		initRegularFileWithContents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initSymbolicLinkWithDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initSymbolicLinkWithDestination_IMetInst(){
		return ((initSymbolicLinkWithDestination_IMetInst != null)
	? (initSymbolicLinkWithDestination_IMetInst)
	: (initSymbolicLinkWithDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initSymbolicLinkWithDestination:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initSymbolicLinkWithDestination(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initSymbolicLinkWithDestination_IMetInst = get_initSymbolicLinkWithDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initSymbolicLinkWithDestination_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initSymbolicLinkWithDestination_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initSymbolicLinkWithDestinationURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initSymbolicLinkWithDestinationURL_IMetInst(){
		return ((initSymbolicLinkWithDestinationURL_IMetInst != null)
	? (initSymbolicLinkWithDestinationURL_IMetInst)
	: (initSymbolicLinkWithDestinationURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initSymbolicLinkWithDestinationURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initSymbolicLinkWithDestinationURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend initSymbolicLinkWithDestinationURL_IMetInst = get_initSymbolicLinkWithDestinationURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initSymbolicLinkWithDestinationURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		initSymbolicLinkWithDestinationURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend initWithSerializedRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithSerializedRepresentation_IMetInst(){
		return ((initWithSerializedRepresentation_IMetInst != null)
	? (initWithSerializedRepresentation_IMetInst)
	: (initWithSerializedRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithSerializedRepresentation:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithSerializedRepresentation(final com.apple.jobjc.foundation.NSData serializeRepresentation){
			final com.apple.jobjc.Invoke.MsgSend initWithSerializedRepresentation_IMetInst = get_initWithSerializedRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithSerializedRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, serializeRepresentation);
		initWithSerializedRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithURL_options_error_IMetInst(){
		return ((initWithURL_options_error_IMetInst != null)
	? (initWithURL_options_error_IMetInst)
	: (initWithURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend initWithURL_options_error_IMetInst = get_initWithURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		initWithURL_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isDirectory_IMetInst(){
		return ((isDirectory_IMetInst != null)
	? (isDirectory_IMetInst)
	: (isDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isDirectory", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isDirectory(){
			final com.apple.jobjc.Invoke.MsgSend isDirectory_IMetInst = get_isDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isDirectory_IMetInst.init(nativeBuffer, this);
		isDirectory_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRegularFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRegularFile_IMetInst(){
		return ((isRegularFile_IMetInst != null)
	? (isRegularFile_IMetInst)
	: (isRegularFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRegularFile", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRegularFile(){
			final com.apple.jobjc.Invoke.MsgSend isRegularFile_IMetInst = get_isRegularFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRegularFile_IMetInst.init(nativeBuffer, this);
		isRegularFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSymbolicLink_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSymbolicLink_IMetInst(){
		return ((isSymbolicLink_IMetInst != null)
	? (isSymbolicLink_IMetInst)
	: (isSymbolicLink_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSymbolicLink", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSymbolicLink(){
			final com.apple.jobjc.Invoke.MsgSend isSymbolicLink_IMetInst = get_isSymbolicLink_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSymbolicLink_IMetInst.init(nativeBuffer, this);
		isSymbolicLink_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend keyForFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_keyForFileWrapper_IMetInst(){
		return ((keyForFileWrapper_IMetInst != null)
	? (keyForFileWrapper_IMetInst)
	: (keyForFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "keyForFileWrapper:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString keyForFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper child){
			final com.apple.jobjc.Invoke.MsgSend keyForFileWrapper_IMetInst = get_keyForFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		keyForFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		keyForFileWrapper_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend matchesContentsOfURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_matchesContentsOfURL_IMetInst(){
		return ((matchesContentsOfURL_IMetInst != null)
	? (matchesContentsOfURL_IMetInst)
	: (matchesContentsOfURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "matchesContentsOfURL:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean matchesContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend matchesContentsOfURL_IMetInst = get_matchesContentsOfURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		matchesContentsOfURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		matchesContentsOfURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend needsToBeUpdatedFromPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_needsToBeUpdatedFromPath_IMetInst(){
		return ((needsToBeUpdatedFromPath_IMetInst != null)
	? (needsToBeUpdatedFromPath_IMetInst)
	: (needsToBeUpdatedFromPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "needsToBeUpdatedFromPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean needsToBeUpdatedFromPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend needsToBeUpdatedFromPath_IMetInst = get_needsToBeUpdatedFromPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		needsToBeUpdatedFromPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		needsToBeUpdatedFromPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredFilename_IMetInst(){
		return ((preferredFilename_IMetInst != null)
	? (preferredFilename_IMetInst)
	: (preferredFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredFilename", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString preferredFilename(){
			final com.apple.jobjc.Invoke.MsgSend preferredFilename_IMetInst = get_preferredFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredFilename_IMetInst.init(nativeBuffer, this);
		preferredFilename_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend readFromURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readFromURL_options_error_IMetInst(){
		return ((readFromURL_options_error_IMetInst != null)
	? (readFromURL_options_error_IMetInst)
	: (readFromURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readFromURL:options:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean readFromURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend readFromURL_options_error_IMetInst = get_readFromURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readFromURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		readFromURL_options_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend regularFileContents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_regularFileContents_IMetInst(){
		return ((regularFileContents_IMetInst != null)
	? (regularFileContents_IMetInst)
	: (regularFileContents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "regularFileContents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData regularFileContents(){
			final com.apple.jobjc.Invoke.MsgSend regularFileContents_IMetInst = get_regularFileContents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		regularFileContents_IMetInst.init(nativeBuffer, this);
		regularFileContents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFileWrapper_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFileWrapper_IMetInst(){
		return ((removeFileWrapper_IMetInst != null)
	? (removeFileWrapper_IMetInst)
	: (removeFileWrapper_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFileWrapper:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFileWrapper(final com.apple.jobjc.foundation.NSFileWrapper child){
			final com.apple.jobjc.Invoke.MsgSend removeFileWrapper_IMetInst = get_removeFileWrapper_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFileWrapper_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		removeFileWrapper_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend serializedRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_serializedRepresentation_IMetInst(){
		return ((serializedRepresentation_IMetInst != null)
	? (serializedRepresentation_IMetInst)
	: (serializedRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "serializedRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData serializedRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend serializedRepresentation_IMetInst = get_serializedRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		serializedRepresentation_IMetInst.init(nativeBuffer, this);
		serializedRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setFileAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFileAttributes_IMetInst(){
		return ((setFileAttributes_IMetInst != null)
	? (setFileAttributes_IMetInst)
	: (setFileAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFileAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFileAttributes(final com.apple.jobjc.foundation.NSDictionary fileAttributes){
			final com.apple.jobjc.Invoke.MsgSend setFileAttributes_IMetInst = get_setFileAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFileAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileAttributes);
		setFileAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFilename_IMetInst(){
		return ((setFilename_IMetInst != null)
	? (setFilename_IMetInst)
	: (setFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFilename(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend setFilename_IMetInst = get_setFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		setFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredFilename_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredFilename_IMetInst(){
		return ((setPreferredFilename_IMetInst != null)
	? (setPreferredFilename_IMetInst)
	: (setPreferredFilename_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredFilename:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPreferredFilename(final com.apple.jobjc.foundation.NSString fileName){
			final com.apple.jobjc.Invoke.MsgSend setPreferredFilename_IMetInst = get_setPreferredFilename_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredFilename_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		setPreferredFilename_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend symbolicLinkDestination_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_symbolicLinkDestination_IMetInst(){
		return ((symbolicLinkDestination_IMetInst != null)
	? (symbolicLinkDestination_IMetInst)
	: (symbolicLinkDestination_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "symbolicLinkDestination", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString symbolicLinkDestination(){
			final com.apple.jobjc.Invoke.MsgSend symbolicLinkDestination_IMetInst = get_symbolicLinkDestination_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		symbolicLinkDestination_IMetInst.init(nativeBuffer, this);
		symbolicLinkDestination_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend symbolicLinkDestinationURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_symbolicLinkDestinationURL_IMetInst(){
		return ((symbolicLinkDestinationURL_IMetInst != null)
	? (symbolicLinkDestinationURL_IMetInst)
	: (symbolicLinkDestinationURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "symbolicLinkDestinationURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL symbolicLinkDestinationURL(){
			final com.apple.jobjc.Invoke.MsgSend symbolicLinkDestinationURL_IMetInst = get_symbolicLinkDestinationURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		symbolicLinkDestinationURL_IMetInst.init(nativeBuffer, this);
		symbolicLinkDestinationURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend updateFromPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_updateFromPath_IMetInst(){
		return ((updateFromPath_IMetInst != null)
	? (updateFromPath_IMetInst)
	: (updateFromPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "updateFromPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean updateFromPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend updateFromPath_IMetInst = get_updateFromPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		updateFromPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		updateFromPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_updateFilenames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToFile_atomically_updateFilenames_IMetInst(){
		return ((writeToFile_atomically_updateFilenames_IMetInst != null)
	? (writeToFile_atomically_updateFilenames_IMetInst)
	: (writeToFile_atomically_updateFilenames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToFile:atomically:updateFilenames:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeToFile_atomically_updateFilenames(final com.apple.jobjc.foundation.NSString path, final boolean atomicFlag, final boolean updateFilenamesFlag){
			final com.apple.jobjc.Invoke.MsgSend writeToFile_atomically_updateFilenames_IMetInst = get_writeToFile_atomically_updateFilenames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToFile_atomically_updateFilenames_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, atomicFlag);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, updateFilenamesFlag);
		writeToFile_atomically_updateFilenames_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeToURL_options_originalContentsURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeToURL_options_originalContentsURL_error_IMetInst(){
		return ((writeToURL_options_originalContentsURL_error_IMetInst != null)
	? (writeToURL_options_originalContentsURL_error_IMetInst)
	: (writeToURL_options_originalContentsURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeToURL:options:originalContentsURL:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeToURL_options_originalContentsURL_error(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.foundation.NSURL originalContentsURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError){
			final com.apple.jobjc.Invoke.MsgSend writeToURL_options_originalContentsURL_error_IMetInst = get_writeToURL_options_originalContentsURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeToURL_options_originalContentsURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, originalContentsURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		writeToURL_options_originalContentsURL_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
