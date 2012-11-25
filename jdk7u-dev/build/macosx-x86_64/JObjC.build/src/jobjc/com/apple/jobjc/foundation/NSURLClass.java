package com.apple.jobjc.foundation;

public  class NSURLClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSURLClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSURLClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSURLClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst(){
		return ((URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst != null)
	? (URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst)
	: (URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(final com.apple.jobjc.foundation.NSData bookmarkData, final long options, final com.apple.jobjc.foundation.NSURL relativeURL, final com.apple.jobjc.Pointer<java.lang.Boolean> isStale, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst = get_URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkData);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, relativeURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, isStale);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		URLByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLWithString_CMetInst(){
		return ((URLWithString_CMetInst != null)
	? (URLWithString_CMetInst)
	: (URLWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T URLWithString(final com.apple.jobjc.foundation.NSString URLString){
			final com.apple.jobjc.Invoke.MsgSend URLWithString_CMetInst = get_URLWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLString);
		URLWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLWithString_relativeToURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLWithString_relativeToURL_CMetInst(){
		return ((URLWithString_relativeToURL_CMetInst != null)
	? (URLWithString_relativeToURL_CMetInst)
	: (URLWithString_relativeToURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLWithString:relativeToURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T URLWithString_relativeToURL(final com.apple.jobjc.foundation.NSString URLString, final com.apple.jobjc.foundation.NSURL baseURL){
			final com.apple.jobjc.Invoke.MsgSend URLWithString_relativeToURL_CMetInst = get_URLWithString_relativeToURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLWithString_relativeToURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, baseURL);
		URLWithString_relativeToURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bookmarkDataWithContentsOfURL_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bookmarkDataWithContentsOfURL_error_CMetInst(){
		return ((bookmarkDataWithContentsOfURL_error_CMetInst != null)
	? (bookmarkDataWithContentsOfURL_error_CMetInst)
	: (bookmarkDataWithContentsOfURL_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bookmarkDataWithContentsOfURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData bookmarkDataWithContentsOfURL_error(final com.apple.jobjc.foundation.NSURL bookmarkFileURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend bookmarkDataWithContentsOfURL_error_CMetInst = get_bookmarkDataWithContentsOfURL_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bookmarkDataWithContentsOfURL_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkFileURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		bookmarkDataWithContentsOfURL_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileURLWithPath_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileURLWithPath_CMetInst(){
		return ((fileURLWithPath_CMetInst != null)
	? (fileURLWithPath_CMetInst)
	: (fileURLWithPath_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileURLWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileURLWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend fileURLWithPath_CMetInst = get_fileURLWithPath_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileURLWithPath_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		fileURLWithPath_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileURLWithPath_isDirectory_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileURLWithPath_isDirectory_CMetInst(){
		return ((fileURLWithPath_isDirectory_CMetInst != null)
	? (fileURLWithPath_isDirectory_CMetInst)
	: (fileURLWithPath_isDirectory_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileURLWithPath:isDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fileURLWithPath_isDirectory(final com.apple.jobjc.foundation.NSString path, final boolean isDir){
			final com.apple.jobjc.Invoke.MsgSend fileURLWithPath_isDirectory_CMetInst = get_fileURLWithPath_isDirectory_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileURLWithPath_isDirectory_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isDir);
		fileURLWithPath_isDirectory_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileURLWithPathComponents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileURLWithPathComponents_CMetInst(){
		return ((fileURLWithPathComponents_CMetInst != null)
	? (fileURLWithPathComponents_CMetInst)
	: (fileURLWithPathComponents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileURLWithPathComponents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL fileURLWithPathComponents(final com.apple.jobjc.foundation.NSArray components){
			final com.apple.jobjc.Invoke.MsgSend fileURLWithPathComponents_CMetInst = get_fileURLWithPathComponents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileURLWithPathComponents_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		fileURLWithPathComponents_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceValuesForKeys_fromBookmarkData_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceValuesForKeys_fromBookmarkData_CMetInst(){
		return ((resourceValuesForKeys_fromBookmarkData_CMetInst != null)
	? (resourceValuesForKeys_fromBookmarkData_CMetInst)
	: (resourceValuesForKeys_fromBookmarkData_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceValuesForKeys:fromBookmarkData:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary resourceValuesForKeys_fromBookmarkData(final com.apple.jobjc.foundation.NSArray keys, final com.apple.jobjc.foundation.NSData bookmarkData){
			final com.apple.jobjc.Invoke.MsgSend resourceValuesForKeys_fromBookmarkData_CMetInst = get_resourceValuesForKeys_fromBookmarkData_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceValuesForKeys_fromBookmarkData_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkData);
		resourceValuesForKeys_fromBookmarkData_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeBookmarkData_toURL_options_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeBookmarkData_toURL_options_error_CMetInst(){
		return ((writeBookmarkData_toURL_options_error_CMetInst != null)
	? (writeBookmarkData_toURL_options_error_CMetInst)
	: (writeBookmarkData_toURL_options_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeBookmarkData:toURL:options:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean writeBookmarkData_toURL_options_error(final com.apple.jobjc.foundation.NSData bookmarkData, final com.apple.jobjc.foundation.NSURL bookmarkFileURL, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend writeBookmarkData_toURL_options_error_CMetInst = get_writeBookmarkData_toURL_options_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeBookmarkData_toURL_options_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkData);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkFileURL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		writeBookmarkData_toURL_options_error_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
