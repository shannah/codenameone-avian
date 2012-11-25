package com.apple.jobjc.foundation;

public  class NSURL extends com.apple.jobjc.foundation.NSObject {
	public NSURL(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSURL(final NSURL obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLByAppendingPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByAppendingPathComponent_IMetInst(){
		return ((URLByAppendingPathComponent_IMetInst != null)
	? (URLByAppendingPathComponent_IMetInst)
	: (URLByAppendingPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByAppendingPathComponent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByAppendingPathComponent(final com.apple.jobjc.foundation.NSString pathComponent){
			final com.apple.jobjc.Invoke.MsgSend URLByAppendingPathComponent_IMetInst = get_URLByAppendingPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByAppendingPathComponent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathComponent);
		URLByAppendingPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByAppendingPathComponent_isDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByAppendingPathComponent_isDirectory_IMetInst(){
		return ((URLByAppendingPathComponent_isDirectory_IMetInst != null)
	? (URLByAppendingPathComponent_isDirectory_IMetInst)
	: (URLByAppendingPathComponent_isDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByAppendingPathComponent:isDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByAppendingPathComponent_isDirectory(final com.apple.jobjc.foundation.NSString pathComponent, final boolean isDirectory){
			final com.apple.jobjc.Invoke.MsgSend URLByAppendingPathComponent_isDirectory_IMetInst = get_URLByAppendingPathComponent_isDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByAppendingPathComponent_isDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathComponent);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isDirectory);
		URLByAppendingPathComponent_isDirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByAppendingPathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByAppendingPathExtension_IMetInst(){
		return ((URLByAppendingPathExtension_IMetInst != null)
	? (URLByAppendingPathExtension_IMetInst)
	: (URLByAppendingPathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByAppendingPathExtension:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByAppendingPathExtension(final com.apple.jobjc.foundation.NSString pathExtension){
			final com.apple.jobjc.Invoke.MsgSend URLByAppendingPathExtension_IMetInst = get_URLByAppendingPathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByAppendingPathExtension_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pathExtension);
		URLByAppendingPathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByDeletingLastPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByDeletingLastPathComponent_IMetInst(){
		return ((URLByDeletingLastPathComponent_IMetInst != null)
	? (URLByDeletingLastPathComponent_IMetInst)
	: (URLByDeletingLastPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByDeletingLastPathComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByDeletingLastPathComponent(){
			final com.apple.jobjc.Invoke.MsgSend URLByDeletingLastPathComponent_IMetInst = get_URLByDeletingLastPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByDeletingLastPathComponent_IMetInst.init(nativeBuffer, this);
		URLByDeletingLastPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByDeletingPathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByDeletingPathExtension_IMetInst(){
		return ((URLByDeletingPathExtension_IMetInst != null)
	? (URLByDeletingPathExtension_IMetInst)
	: (URLByDeletingPathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByDeletingPathExtension", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByDeletingPathExtension(){
			final com.apple.jobjc.Invoke.MsgSend URLByDeletingPathExtension_IMetInst = get_URLByDeletingPathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByDeletingPathExtension_IMetInst.init(nativeBuffer, this);
		URLByDeletingPathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByResolvingSymlinksInPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByResolvingSymlinksInPath_IMetInst(){
		return ((URLByResolvingSymlinksInPath_IMetInst != null)
	? (URLByResolvingSymlinksInPath_IMetInst)
	: (URLByResolvingSymlinksInPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByResolvingSymlinksInPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByResolvingSymlinksInPath(){
			final com.apple.jobjc.Invoke.MsgSend URLByResolvingSymlinksInPath_IMetInst = get_URLByResolvingSymlinksInPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByResolvingSymlinksInPath_IMetInst.init(nativeBuffer, this);
		URLByResolvingSymlinksInPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLByStandardizingPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLByStandardizingPath_IMetInst(){
		return ((URLByStandardizingPath_IMetInst != null)
	? (URLByStandardizingPath_IMetInst)
	: (URLByStandardizingPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLByStandardizingPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLByStandardizingPath(){
			final com.apple.jobjc.Invoke.MsgSend URLByStandardizingPath_IMetInst = get_URLByStandardizingPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLByStandardizingPath_IMetInst.init(nativeBuffer, this);
		URLByStandardizingPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend URLHandleUsingCache_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLHandleUsingCache_IMetInst(){
		return ((URLHandleUsingCache_IMetInst != null)
	? (URLHandleUsingCache_IMetInst)
	: (URLHandleUsingCache_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLHandleUsingCache:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURLHandle URLHandleUsingCache(final boolean shouldUseCache){
			final com.apple.jobjc.Invoke.MsgSend URLHandleUsingCache_IMetInst = get_URLHandleUsingCache_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLHandleUsingCache_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldUseCache);
		URLHandleUsingCache_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURLHandle returnValue = (com.apple.jobjc.foundation.NSURLHandle) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absoluteString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absoluteString_IMetInst(){
		return ((absoluteString_IMetInst != null)
	? (absoluteString_IMetInst)
	: (absoluteString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absoluteString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString absoluteString(){
			final com.apple.jobjc.Invoke.MsgSend absoluteString_IMetInst = get_absoluteString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absoluteString_IMetInst.init(nativeBuffer, this);
		absoluteString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend absoluteURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_absoluteURL_IMetInst(){
		return ((absoluteURL_IMetInst != null)
	? (absoluteURL_IMetInst)
	: (absoluteURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "absoluteURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL absoluteURL(){
			final com.apple.jobjc.Invoke.MsgSend absoluteURL_IMetInst = get_absoluteURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		absoluteURL_IMetInst.init(nativeBuffer, this);
		absoluteURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend baseURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baseURL_IMetInst(){
		return ((baseURL_IMetInst != null)
	? (baseURL_IMetInst)
	: (baseURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baseURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL baseURL(){
			final com.apple.jobjc.Invoke.MsgSend baseURL_IMetInst = get_baseURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baseURL_IMetInst.init(nativeBuffer, this);
		baseURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst(){
		return ((bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst != null)
	? (bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst)
	: (bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bookmarkDataWithOptions:includingResourceValuesForKeys:relativeToURL:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error(final long options, final com.apple.jobjc.foundation.NSArray keys, final com.apple.jobjc.foundation.NSURL relativeURL, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst = get_bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, relativeURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		bookmarkDataWithOptions_includingResourceValuesForKeys_relativeToURL_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend checkResourceIsReachableAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkResourceIsReachableAndReturnError_IMetInst(){
		return ((checkResourceIsReachableAndReturnError_IMetInst != null)
	? (checkResourceIsReachableAndReturnError_IMetInst)
	: (checkResourceIsReachableAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkResourceIsReachableAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean checkResourceIsReachableAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend checkResourceIsReachableAndReturnError_IMetInst = get_checkResourceIsReachableAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkResourceIsReachableAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		checkResourceIsReachableAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filePathURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filePathURL_IMetInst(){
		return ((filePathURL_IMetInst != null)
	? (filePathURL_IMetInst)
	: (filePathURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filePathURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL filePathURL(){
			final com.apple.jobjc.Invoke.MsgSend filePathURL_IMetInst = get_filePathURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filePathURL_IMetInst.init(nativeBuffer, this);
		filePathURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fileReferenceURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fileReferenceURL_IMetInst(){
		return ((fileReferenceURL_IMetInst != null)
	? (fileReferenceURL_IMetInst)
	: (fileReferenceURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fileReferenceURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL fileReferenceURL(){
			final com.apple.jobjc.Invoke.MsgSend fileReferenceURL_IMetInst = get_fileReferenceURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fileReferenceURL_IMetInst.init(nativeBuffer, this);
		fileReferenceURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fragment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fragment_IMetInst(){
		return ((fragment_IMetInst != null)
	? (fragment_IMetInst)
	: (fragment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fragment", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString fragment(){
			final com.apple.jobjc.Invoke.MsgSend fragment_IMetInst = get_fragment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fragment_IMetInst.init(nativeBuffer, this);
		fragment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend getResourceValue_forKey_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_getResourceValue_forKey_error_IMetInst(){
		return ((getResourceValue_forKey_error_IMetInst != null)
	? (getResourceValue_forKey_error_IMetInst)
	: (getResourceValue_forKey_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "getResourceValue:forKey:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean getResourceValue_forKey_error(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> value, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend getResourceValue_forKey_error_IMetInst = get_getResourceValue_forKey_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		getResourceValue_forKey_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		getResourceValue_forKey_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend host_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_host_IMetInst(){
		return ((host_IMetInst != null)
	? (host_IMetInst)
	: (host_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "host", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString host(){
			final com.apple.jobjc.Invoke.MsgSend host_IMetInst = get_host_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		host_IMetInst.init(nativeBuffer, this);
		host_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst(){
		return ((initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst != null)
	? (initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst)
	: (initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initByResolvingBookmarkData:options:relativeToURL:bookmarkDataIsStale:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error(final com.apple.jobjc.foundation.NSData bookmarkData, final long options, final com.apple.jobjc.foundation.NSURL relativeURL, final com.apple.jobjc.Pointer<java.lang.Boolean> isStale, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst = get_initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, bookmarkData);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, relativeURL);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, isStale);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initByResolvingBookmarkData_options_relativeToURL_bookmarkDataIsStale_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initFileURLWithPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initFileURLWithPath_IMetInst(){
		return ((initFileURLWithPath_IMetInst != null)
	? (initFileURLWithPath_IMetInst)
	: (initFileURLWithPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initFileURLWithPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initFileURLWithPath(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initFileURLWithPath_IMetInst = get_initFileURLWithPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initFileURLWithPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initFileURLWithPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initFileURLWithPath_isDirectory_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initFileURLWithPath_isDirectory_IMetInst(){
		return ((initFileURLWithPath_isDirectory_IMetInst != null)
	? (initFileURLWithPath_isDirectory_IMetInst)
	: (initFileURLWithPath_isDirectory_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initFileURLWithPath:isDirectory:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initFileURLWithPath_isDirectory(final com.apple.jobjc.foundation.NSString path, final boolean isDir){
			final com.apple.jobjc.Invoke.MsgSend initFileURLWithPath_isDirectory_IMetInst = get_initFileURLWithPath_isDirectory_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initFileURLWithPath_isDirectory_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, isDir);
		initFileURLWithPath_isDirectory_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithScheme_host_path_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithScheme_host_path_IMetInst(){
		return ((initWithScheme_host_path_IMetInst != null)
	? (initWithScheme_host_path_IMetInst)
	: (initWithScheme_host_path_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithScheme:host:path:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithScheme_host_path(final com.apple.jobjc.foundation.NSString scheme, final com.apple.jobjc.foundation.NSString host, final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend initWithScheme_host_path_IMetInst = get_initWithScheme_host_path_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithScheme_host_path_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, scheme);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, host);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		initWithScheme_host_path_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_IMetInst(){
		return ((initWithString_IMetInst != null)
	? (initWithString_IMetInst)
	: (initWithString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString(final com.apple.jobjc.foundation.NSString URLString){
			final com.apple.jobjc.Invoke.MsgSend initWithString_IMetInst = get_initWithString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLString);
		initWithString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithString_relativeToURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithString_relativeToURL_IMetInst(){
		return ((initWithString_relativeToURL_IMetInst != null)
	? (initWithString_relativeToURL_IMetInst)
	: (initWithString_relativeToURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithString:relativeToURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithString_relativeToURL(final com.apple.jobjc.foundation.NSString URLString, final com.apple.jobjc.foundation.NSURL baseURL){
			final com.apple.jobjc.Invoke.MsgSend initWithString_relativeToURL_IMetInst = get_initWithString_relativeToURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithString_relativeToURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URLString);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, baseURL);
		initWithString_relativeToURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFileReferenceURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFileReferenceURL_IMetInst(){
		return ((isFileReferenceURL_IMetInst != null)
	? (isFileReferenceURL_IMetInst)
	: (isFileReferenceURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFileReferenceURL", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFileReferenceURL(){
			final com.apple.jobjc.Invoke.MsgSend isFileReferenceURL_IMetInst = get_isFileReferenceURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFileReferenceURL_IMetInst.init(nativeBuffer, this);
		isFileReferenceURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFileURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFileURL_IMetInst(){
		return ((isFileURL_IMetInst != null)
	? (isFileURL_IMetInst)
	: (isFileURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFileURL", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFileURL(){
			final com.apple.jobjc.Invoke.MsgSend isFileURL_IMetInst = get_isFileURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFileURL_IMetInst.init(nativeBuffer, this);
		isFileURL_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lastPathComponent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lastPathComponent_IMetInst(){
		return ((lastPathComponent_IMetInst != null)
	? (lastPathComponent_IMetInst)
	: (lastPathComponent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lastPathComponent", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString lastPathComponent(){
			final com.apple.jobjc.Invoke.MsgSend lastPathComponent_IMetInst = get_lastPathComponent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lastPathComponent_IMetInst.init(nativeBuffer, this);
		lastPathComponent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadResourceDataNotifyingClient_usingCache_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadResourceDataNotifyingClient_usingCache_IMetInst(){
		return ((loadResourceDataNotifyingClient_usingCache_IMetInst != null)
	? (loadResourceDataNotifyingClient_usingCache_IMetInst)
	: (loadResourceDataNotifyingClient_usingCache_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadResourceDataNotifyingClient:usingCache:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void loadResourceDataNotifyingClient_usingCache(final com.apple.jobjc.ID client, final boolean shouldUseCache){
			final com.apple.jobjc.Invoke.MsgSend loadResourceDataNotifyingClient_usingCache_IMetInst = get_loadResourceDataNotifyingClient_usingCache_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadResourceDataNotifyingClient_usingCache_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, client);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldUseCache);
		loadResourceDataNotifyingClient_usingCache_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend parameterString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parameterString_IMetInst(){
		return ((parameterString_IMetInst != null)
	? (parameterString_IMetInst)
	: (parameterString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parameterString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString parameterString(){
			final com.apple.jobjc.Invoke.MsgSend parameterString_IMetInst = get_parameterString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parameterString_IMetInst.init(nativeBuffer, this);
		parameterString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend password_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_password_IMetInst(){
		return ((password_IMetInst != null)
	? (password_IMetInst)
	: (password_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "password", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString password(){
			final com.apple.jobjc.Invoke.MsgSend password_IMetInst = get_password_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		password_IMetInst.init(nativeBuffer, this);
		password_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend path_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_path_IMetInst(){
		return ((path_IMetInst != null)
	? (path_IMetInst)
	: (path_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "path", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString path(){
			final com.apple.jobjc.Invoke.MsgSend path_IMetInst = get_path_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		path_IMetInst.init(nativeBuffer, this);
		path_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathComponents_IMetInst(){
		return ((pathComponents_IMetInst != null)
	? (pathComponents_IMetInst)
	: (pathComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathComponents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray pathComponents(){
			final com.apple.jobjc.Invoke.MsgSend pathComponents_IMetInst = get_pathComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathComponents_IMetInst.init(nativeBuffer, this);
		pathComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathExtension_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathExtension_IMetInst(){
		return ((pathExtension_IMetInst != null)
	? (pathExtension_IMetInst)
	: (pathExtension_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathExtension", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathExtension(){
			final com.apple.jobjc.Invoke.MsgSend pathExtension_IMetInst = get_pathExtension_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathExtension_IMetInst.init(nativeBuffer, this);
		pathExtension_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend port_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_port_IMetInst(){
		return ((port_IMetInst != null)
	? (port_IMetInst)
	: (port_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "port", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSNumber port(){
			final com.apple.jobjc.Invoke.MsgSend port_IMetInst = get_port_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		port_IMetInst.init(nativeBuffer, this);
		port_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSNumber returnValue = (com.apple.jobjc.foundation.NSNumber) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertyForKey_IMetInst(){
		return ((propertyForKey_IMetInst != null)
	? (propertyForKey_IMetInst)
	: (propertyForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertyForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T propertyForKey(final com.apple.jobjc.foundation.NSString propertyKey){
			final com.apple.jobjc.Invoke.MsgSend propertyForKey_IMetInst = get_propertyForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertyForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKey);
		propertyForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend query_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_query_IMetInst(){
		return ((query_IMetInst != null)
	? (query_IMetInst)
	: (query_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "query", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString query(){
			final com.apple.jobjc.Invoke.MsgSend query_IMetInst = get_query_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		query_IMetInst.init(nativeBuffer, this);
		query_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend relativePath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativePath_IMetInst(){
		return ((relativePath_IMetInst != null)
	? (relativePath_IMetInst)
	: (relativePath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativePath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString relativePath(){
			final com.apple.jobjc.Invoke.MsgSend relativePath_IMetInst = get_relativePath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativePath_IMetInst.init(nativeBuffer, this);
		relativePath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend relativeString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_relativeString_IMetInst(){
		return ((relativeString_IMetInst != null)
	? (relativeString_IMetInst)
	: (relativeString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "relativeString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString relativeString(){
			final com.apple.jobjc.Invoke.MsgSend relativeString_IMetInst = get_relativeString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		relativeString_IMetInst.init(nativeBuffer, this);
		relativeString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceDataUsingCache_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceDataUsingCache_IMetInst(){
		return ((resourceDataUsingCache_IMetInst != null)
	? (resourceDataUsingCache_IMetInst)
	: (resourceDataUsingCache_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceDataUsingCache:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData resourceDataUsingCache(final boolean shouldUseCache){
			final com.apple.jobjc.Invoke.MsgSend resourceDataUsingCache_IMetInst = get_resourceDataUsingCache_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceDataUsingCache_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, shouldUseCache);
		resourceDataUsingCache_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceSpecifier_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceSpecifier_IMetInst(){
		return ((resourceSpecifier_IMetInst != null)
	? (resourceSpecifier_IMetInst)
	: (resourceSpecifier_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceSpecifier", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString resourceSpecifier(){
			final com.apple.jobjc.Invoke.MsgSend resourceSpecifier_IMetInst = get_resourceSpecifier_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceSpecifier_IMetInst.init(nativeBuffer, this);
		resourceSpecifier_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resourceValuesForKeys_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resourceValuesForKeys_error_IMetInst(){
		return ((resourceValuesForKeys_error_IMetInst != null)
	? (resourceValuesForKeys_error_IMetInst)
	: (resourceValuesForKeys_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resourceValuesForKeys:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary resourceValuesForKeys_error(final com.apple.jobjc.foundation.NSArray keys, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend resourceValuesForKeys_error_IMetInst = get_resourceValuesForKeys_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resourceValuesForKeys_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		resourceValuesForKeys_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend scheme_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scheme_IMetInst(){
		return ((scheme_IMetInst != null)
	? (scheme_IMetInst)
	: (scheme_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scheme", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString scheme(){
			final com.apple.jobjc.Invoke.MsgSend scheme_IMetInst = get_scheme_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scheme_IMetInst.init(nativeBuffer, this);
		scheme_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setProperty_forKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setProperty_forKey_IMetInst(){
		return ((setProperty_forKey_IMetInst != null)
	? (setProperty_forKey_IMetInst)
	: (setProperty_forKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setProperty:forKey:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setProperty_forKey(final com.apple.jobjc.ID property, final com.apple.jobjc.foundation.NSString propertyKey){
			final com.apple.jobjc.Invoke.MsgSend setProperty_forKey_IMetInst = get_setProperty_forKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setProperty_forKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, property);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, propertyKey);
		setProperty_forKey_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setResourceData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResourceData_IMetInst(){
		return ((setResourceData_IMetInst != null)
	? (setResourceData_IMetInst)
	: (setResourceData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResourceData:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setResourceData(final com.apple.jobjc.foundation.NSData data){
			final com.apple.jobjc.Invoke.MsgSend setResourceData_IMetInst = get_setResourceData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResourceData_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		setResourceData_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setResourceValue_forKey_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResourceValue_forKey_error_IMetInst(){
		return ((setResourceValue_forKey_error_IMetInst != null)
	? (setResourceValue_forKey_error_IMetInst)
	: (setResourceValue_forKey_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResourceValue:forKey:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setResourceValue_forKey_error(final com.apple.jobjc.ID value, final com.apple.jobjc.foundation.NSString key, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend setResourceValue_forKey_error_IMetInst = get_setResourceValue_forKey_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResourceValue_forKey_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, value);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		setResourceValue_forKey_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setResourceValues_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResourceValues_error_IMetInst(){
		return ((setResourceValues_error_IMetInst != null)
	? (setResourceValues_error_IMetInst)
	: (setResourceValues_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResourceValues:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean setResourceValues_error(final com.apple.jobjc.foundation.NSDictionary keyedValues, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend setResourceValues_error_IMetInst = get_setResourceValues_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResourceValues_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyedValues);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		setResourceValues_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend standardizedURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_standardizedURL_IMetInst(){
		return ((standardizedURL_IMetInst != null)
	? (standardizedURL_IMetInst)
	: (standardizedURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "standardizedURL", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL standardizedURL(){
			final com.apple.jobjc.Invoke.MsgSend standardizedURL_IMetInst = get_standardizedURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		standardizedURL_IMetInst.init(nativeBuffer, this);
		standardizedURL_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend startAccessingSecurityScopedResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_startAccessingSecurityScopedResource_IMetInst(){
		return ((startAccessingSecurityScopedResource_IMetInst != null)
	? (startAccessingSecurityScopedResource_IMetInst)
	: (startAccessingSecurityScopedResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "startAccessingSecurityScopedResource", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean startAccessingSecurityScopedResource(){
			final com.apple.jobjc.Invoke.MsgSend startAccessingSecurityScopedResource_IMetInst = get_startAccessingSecurityScopedResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		startAccessingSecurityScopedResource_IMetInst.init(nativeBuffer, this);
		startAccessingSecurityScopedResource_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stopAccessingSecurityScopedResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stopAccessingSecurityScopedResource_IMetInst(){
		return ((stopAccessingSecurityScopedResource_IMetInst != null)
	? (stopAccessingSecurityScopedResource_IMetInst)
	: (stopAccessingSecurityScopedResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stopAccessingSecurityScopedResource", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void stopAccessingSecurityScopedResource(){
			final com.apple.jobjc.Invoke.MsgSend stopAccessingSecurityScopedResource_IMetInst = get_stopAccessingSecurityScopedResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stopAccessingSecurityScopedResource_IMetInst.init(nativeBuffer, this);
		stopAccessingSecurityScopedResource_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend user_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_user_IMetInst(){
		return ((user_IMetInst != null)
	? (user_IMetInst)
	: (user_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "user", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString user(){
			final com.apple.jobjc.Invoke.MsgSend user_IMetInst = get_user_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		user_IMetInst.init(nativeBuffer, this);
		user_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
