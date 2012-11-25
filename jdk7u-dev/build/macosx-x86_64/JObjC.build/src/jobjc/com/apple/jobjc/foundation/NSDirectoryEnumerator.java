package com.apple.jobjc.foundation;

public  class NSDirectoryEnumerator extends com.apple.jobjc.foundation.NSEnumerator {
	public NSDirectoryEnumerator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSDirectoryEnumerator(final NSDirectoryEnumerator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend directoryAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_directoryAttributes_IMetInst(){
		return ((directoryAttributes_IMetInst != null)
	? (directoryAttributes_IMetInst)
	: (directoryAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "directoryAttributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary directoryAttributes(){
			final com.apple.jobjc.Invoke.MsgSend directoryAttributes_IMetInst = get_directoryAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		directoryAttributes_IMetInst.init(nativeBuffer, this);
		directoryAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend level_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_level_IMetInst(){
		return ((level_IMetInst != null)
	? (level_IMetInst)
	: (level_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "level", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long level(){
			final com.apple.jobjc.Invoke.MsgSend level_IMetInst = get_level_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		level_IMetInst.init(nativeBuffer, this);
		level_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend skipDescendants_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_skipDescendants_IMetInst(){
		return ((skipDescendants_IMetInst != null)
	? (skipDescendants_IMetInst)
	: (skipDescendants_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "skipDescendants", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void skipDescendants(){
			final com.apple.jobjc.Invoke.MsgSend skipDescendants_IMetInst = get_skipDescendants_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		skipDescendants_IMetInst.init(nativeBuffer, this);
		skipDescendants_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend skipDescendents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_skipDescendents_IMetInst(){
		return ((skipDescendents_IMetInst != null)
	? (skipDescendents_IMetInst)
	: (skipDescendents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "skipDescendents", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void skipDescendents(){
			final com.apple.jobjc.Invoke.MsgSend skipDescendents_IMetInst = get_skipDescendents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		skipDescendents_IMetInst.init(nativeBuffer, this);
		skipDescendents_IMetInst.invoke(nativeBuffer);
		
		
	}

}
