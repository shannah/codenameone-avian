package com.apple.jobjc.foundation;

public  class NSStringClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSStringClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSStringClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSStringClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend availableStringEncodings_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableStringEncodings_CMetInst(){
		return ((availableStringEncodings_CMetInst != null)
	? (availableStringEncodings_CMetInst)
	: (availableStringEncodings_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableStringEncodings", com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.Pointer<java.lang.Long> availableStringEncodings(){
			final com.apple.jobjc.Invoke.MsgSend availableStringEncodings_CMetInst = get_availableStringEncodings_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableStringEncodings_CMetInst.init(nativeBuffer, this);
		availableStringEncodings_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.Pointer<java.lang.Long> returnValue = (com.apple.jobjc.Pointer<java.lang.Long>) (com.apple.jobjc.Coder.PointerCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultCStringEncoding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultCStringEncoding_CMetInst(){
		return ((defaultCStringEncoding_CMetInst != null)
	? (defaultCStringEncoding_CMetInst)
	: (defaultCStringEncoding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultCStringEncoding", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long defaultCStringEncoding(){
			final com.apple.jobjc.Invoke.MsgSend defaultCStringEncoding_CMetInst = get_defaultCStringEncoding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultCStringEncoding_CMetInst.init(nativeBuffer, this);
		defaultCStringEncoding_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedNameOfStringEncoding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedNameOfStringEncoding_CMetInst(){
		return ((localizedNameOfStringEncoding_CMetInst != null)
	? (localizedNameOfStringEncoding_CMetInst)
	: (localizedNameOfStringEncoding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedNameOfStringEncoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString localizedNameOfStringEncoding(final long encoding){
			final com.apple.jobjc.Invoke.MsgSend localizedNameOfStringEncoding_CMetInst = get_localizedNameOfStringEncoding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedNameOfStringEncoding_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, encoding);
		localizedNameOfStringEncoding_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T localizedStringWithFormat(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend localizedStringWithFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedStringWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedStringWithFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		localizedStringWithFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathWithComponents_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathWithComponents_CMetInst(){
		return ((pathWithComponents_CMetInst != null)
	? (pathWithComponents_CMetInst)
	: (pathWithComponents_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathWithComponents:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathWithComponents(final com.apple.jobjc.foundation.NSArray components){
			final com.apple.jobjc.Invoke.MsgSend pathWithComponents_CMetInst = get_pathWithComponents_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathWithComponents_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, components);
		pathWithComponents_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend string_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_string_CMetInst(){
		return ((string_CMetInst != null)
	? (string_CMetInst)
	: (string_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "string", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T string(){
			final com.apple.jobjc.Invoke.MsgSend string_CMetInst = get_string_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		string_CMetInst.init(nativeBuffer, this);
		string_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithCString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithCString_CMetInst(){
		return ((stringWithCString_CMetInst != null)
	? (stringWithCString_CMetInst)
	: (stringWithCString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithCString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithCString(final com.apple.jobjc.Pointer<java.lang.Byte> bytes){
			final com.apple.jobjc.Invoke.MsgSend stringWithCString_CMetInst = get_stringWithCString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithCString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		stringWithCString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithCString_encoding_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithCString_encoding_CMetInst(){
		return ((stringWithCString_encoding_CMetInst != null)
	? (stringWithCString_encoding_CMetInst)
	: (stringWithCString_encoding_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithCString:encoding:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithCString_encoding(final com.apple.jobjc.Pointer<java.lang.Byte> cString, final long enc){
			final com.apple.jobjc.Invoke.MsgSend stringWithCString_encoding_CMetInst = get_stringWithCString_encoding_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithCString_encoding_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, cString);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		stringWithCString_encoding_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithCString_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithCString_length_CMetInst(){
		return ((stringWithCString_length_CMetInst != null)
	? (stringWithCString_length_CMetInst)
	: (stringWithCString_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithCString:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithCString_length(final com.apple.jobjc.Pointer<java.lang.Byte> bytes, final long length){
			final com.apple.jobjc.Invoke.MsgSend stringWithCString_length_CMetInst = get_stringWithCString_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithCString_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, bytes);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		stringWithCString_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithCharacters_length_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithCharacters_length_CMetInst(){
		return ((stringWithCharacters_length_CMetInst != null)
	? (stringWithCharacters_length_CMetInst)
	: (stringWithCharacters_length_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithCharacters:length:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithCharacters_length(final com.apple.jobjc.Pointer<java.lang.Short> characters, final long length){
			final com.apple.jobjc.Invoke.MsgSend stringWithCharacters_length_CMetInst = get_stringWithCharacters_length_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithCharacters_length_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, characters);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, length);
		stringWithCharacters_length_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfFile_CMetInst(){
		return ((stringWithContentsOfFile_CMetInst != null)
	? (stringWithContentsOfFile_CMetInst)
	: (stringWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_CMetInst = get_stringWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		stringWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_encoding_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfFile_encoding_error_CMetInst(){
		return ((stringWithContentsOfFile_encoding_error_CMetInst != null)
	? (stringWithContentsOfFile_encoding_error_CMetInst)
	: (stringWithContentsOfFile_encoding_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfFile:encoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfFile_encoding_error(final com.apple.jobjc.foundation.NSString path, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_encoding_error_CMetInst = get_stringWithContentsOfFile_encoding_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfFile_encoding_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		stringWithContentsOfFile_encoding_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_usedEncoding_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfFile_usedEncoding_error_CMetInst(){
		return ((stringWithContentsOfFile_usedEncoding_error_CMetInst != null)
	? (stringWithContentsOfFile_usedEncoding_error_CMetInst)
	: (stringWithContentsOfFile_usedEncoding_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfFile:usedEncoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfFile_usedEncoding_error(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.Pointer<java.lang.Long> enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfFile_usedEncoding_error_CMetInst = get_stringWithContentsOfFile_usedEncoding_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfFile_usedEncoding_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		stringWithContentsOfFile_usedEncoding_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfURL_CMetInst(){
		return ((stringWithContentsOfURL_CMetInst != null)
	? (stringWithContentsOfURL_CMetInst)
	: (stringWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_CMetInst = get_stringWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		stringWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_encoding_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfURL_encoding_error_CMetInst(){
		return ((stringWithContentsOfURL_encoding_error_CMetInst != null)
	? (stringWithContentsOfURL_encoding_error_CMetInst)
	: (stringWithContentsOfURL_encoding_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfURL:encoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfURL_encoding_error(final com.apple.jobjc.foundation.NSURL url, final long enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_encoding_error_CMetInst = get_stringWithContentsOfURL_encoding_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfURL_encoding_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		stringWithContentsOfURL_encoding_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_usedEncoding_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithContentsOfURL_usedEncoding_error_CMetInst(){
		return ((stringWithContentsOfURL_usedEncoding_error_CMetInst != null)
	? (stringWithContentsOfURL_usedEncoding_error_CMetInst)
	: (stringWithContentsOfURL_usedEncoding_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithContentsOfURL:usedEncoding:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithContentsOfURL_usedEncoding_error(final com.apple.jobjc.foundation.NSURL url, final com.apple.jobjc.Pointer<java.lang.Long> enc, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend stringWithContentsOfURL_usedEncoding_error_CMetInst = get_stringWithContentsOfURL_usedEncoding_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithContentsOfURL_usedEncoding_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, enc);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		stringWithContentsOfURL_usedEncoding_error_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T stringWithFormat(final com.apple.jobjc.foundation.NSString format, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend stringWithFormat_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithFormat:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithFormat_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, format);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		stringWithFormat_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithString_CMetInst(){
		return ((stringWithString_CMetInst != null)
	? (stringWithString_CMetInst)
	: (stringWithString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend stringWithString_CMetInst = get_stringWithString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		stringWithString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend stringWithUTF8String_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_stringWithUTF8String_CMetInst(){
		return ((stringWithUTF8String_CMetInst != null)
	? (stringWithUTF8String_CMetInst)
	: (stringWithUTF8String_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "stringWithUTF8String:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T stringWithUTF8String(final com.apple.jobjc.Pointer<java.lang.Byte> nullTerminatedCString){
			final com.apple.jobjc.Invoke.MsgSend stringWithUTF8String_CMetInst = get_stringWithUTF8String_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		stringWithUTF8String_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, nullTerminatedCString);
		stringWithUTF8String_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
