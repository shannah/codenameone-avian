package com.apple.jobjc.foundation;

public  class NSDictionaryClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSDictionaryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSDictionaryClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSDictionaryClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend dictionary_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionary_CMetInst(){
		return ((dictionary_CMetInst != null)
	? (dictionary_CMetInst)
	: (dictionary_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionary", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionary(){
			final com.apple.jobjc.Invoke.MsgSend dictionary_CMetInst = get_dictionary_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionary_CMetInst.init(nativeBuffer, this);
		dictionary_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithContentsOfFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithContentsOfFile_CMetInst(){
		return ((dictionaryWithContentsOfFile_CMetInst != null)
	? (dictionaryWithContentsOfFile_CMetInst)
	: (dictionaryWithContentsOfFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithContentsOfFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithContentsOfFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithContentsOfFile_CMetInst = get_dictionaryWithContentsOfFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithContentsOfFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		dictionaryWithContentsOfFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithContentsOfURL_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithContentsOfURL_CMetInst(){
		return ((dictionaryWithContentsOfURL_CMetInst != null)
	? (dictionaryWithContentsOfURL_CMetInst)
	: (dictionaryWithContentsOfURL_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithContentsOfURL:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithContentsOfURL(final com.apple.jobjc.foundation.NSURL url){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithContentsOfURL_CMetInst = get_dictionaryWithContentsOfURL_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithContentsOfURL_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		dictionaryWithContentsOfURL_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithDictionary_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithDictionary_CMetInst(){
		return ((dictionaryWithDictionary_CMetInst != null)
	? (dictionaryWithDictionary_CMetInst)
	: (dictionaryWithDictionary_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithDictionary:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithDictionary(final com.apple.jobjc.foundation.NSDictionary dict){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithDictionary_CMetInst = get_dictionaryWithDictionary_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithDictionary_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, dict);
		dictionaryWithDictionary_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithObject_forKey_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithObject_forKey_CMetInst(){
		return ((dictionaryWithObject_forKey_CMetInst != null)
	? (dictionaryWithObject_forKey_CMetInst)
	: (dictionaryWithObject_forKey_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithObject:forKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithObject_forKey(final com.apple.jobjc.ID object, final com.apple.jobjc.ID key){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithObject_forKey_CMetInst = get_dictionaryWithObject_forKey_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithObject_forKey_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		dictionaryWithObject_forKey_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithObjects_forKeys_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithObjects_forKeys_CMetInst(){
		return ((dictionaryWithObjects_forKeys_CMetInst != null)
	? (dictionaryWithObjects_forKeys_CMetInst)
	: (dictionaryWithObjects_forKeys_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithObjects:forKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithObjects_forKeys(final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithObjects_forKeys_CMetInst = get_dictionaryWithObjects_forKeys_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithObjects_forKeys_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		dictionaryWithObjects_forKeys_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend dictionaryWithObjects_forKeys_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_dictionaryWithObjects_forKeys_count_CMetInst(){
		return ((dictionaryWithObjects_forKeys_count_CMetInst != null)
	? (dictionaryWithObjects_forKeys_count_CMetInst)
	: (dictionaryWithObjects_forKeys_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithObjects:forKeys:count:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithObjects_forKeys_count(final com.apple.jobjc.Pointer<com.apple.jobjc.ID> objects, final com.apple.jobjc.Pointer<com.apple.jobjc.ID> keys, final long cnt){
			final com.apple.jobjc.Invoke.MsgSend dictionaryWithObjects_forKeys_count_CMetInst = get_dictionaryWithObjects_forKeys_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithObjects_forKeys_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, keys);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, cnt);
		dictionaryWithObjects_forKeys_count_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	 public <T extends com.apple.jobjc.ID> T dictionaryWithObjectsAndKeys(final com.apple.jobjc.ID firstObject, final Object... varargs){
		com.apple.jobjc.Coder[] argCoders = new com.apple.jobjc.Coder[1 + varargs.length];
argCoders[0] = com.apple.jobjc.Coder.IDCoder.INST;
for(int i = 1; i < (1 + varargs.length); i++)
	argCoders[i] = com.apple.jobjc.Coder.getCoderAtRuntime(varargs[i - 1]);
final com.apple.jobjc.Invoke.MsgSend dictionaryWithObjectsAndKeys_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "dictionaryWithObjectsAndKeys:", com.apple.jobjc.Coder.IDCoder.INST, argCoders);
		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		dictionaryWithObjectsAndKeys_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, firstObject);
		for(int i = 1; i < (1 + varargs.length); i++)
			argCoders[i].push(nativeBuffer, varargs[i - 1]);
		dictionaryWithObjectsAndKeys_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedKeySetForKeys_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedKeySetForKeys_CMetInst(){
		return ((sharedKeySetForKeys_CMetInst != null)
	? (sharedKeySetForKeys_CMetInst)
	: (sharedKeySetForKeys_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedKeySetForKeys:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedKeySetForKeys(final com.apple.jobjc.foundation.NSArray keys){
			final com.apple.jobjc.Invoke.MsgSend sharedKeySetForKeys_CMetInst = get_sharedKeySetForKeys_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedKeySetForKeys_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keys);
		sharedKeySetForKeys_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
