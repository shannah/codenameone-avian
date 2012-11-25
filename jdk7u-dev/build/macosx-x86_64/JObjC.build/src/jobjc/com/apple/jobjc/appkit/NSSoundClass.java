package com.apple.jobjc.appkit;

public  class NSSoundClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSSoundClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSSoundClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSSoundClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInitWithPasteboard_CMetInst(){
		return ((canInitWithPasteboard_CMetInst != null)
	? (canInitWithPasteboard_CMetInst)
	: (canInitWithPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInitWithPasteboard:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean canInitWithPasteboard(final com.apple.jobjc.appkit.NSPasteboard pasteboard){
			final com.apple.jobjc.Invoke.MsgSend canInitWithPasteboard_CMetInst = get_canInitWithPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInitWithPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pasteboard);
		canInitWithPasteboard_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend soundNamed_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_soundNamed_CMetInst(){
		return ((soundNamed_CMetInst != null)
	? (soundNamed_CMetInst)
	: (soundNamed_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "soundNamed:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T soundNamed(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend soundNamed_CMetInst = get_soundNamed_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		soundNamed_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		soundNamed_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend soundUnfilteredFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_soundUnfilteredFileTypes_CMetInst(){
		return ((soundUnfilteredFileTypes_CMetInst != null)
	? (soundUnfilteredFileTypes_CMetInst)
	: (soundUnfilteredFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "soundUnfilteredFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray soundUnfilteredFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend soundUnfilteredFileTypes_CMetInst = get_soundUnfilteredFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		soundUnfilteredFileTypes_CMetInst.init(nativeBuffer, this);
		soundUnfilteredFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend soundUnfilteredPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_soundUnfilteredPasteboardTypes_CMetInst(){
		return ((soundUnfilteredPasteboardTypes_CMetInst != null)
	? (soundUnfilteredPasteboardTypes_CMetInst)
	: (soundUnfilteredPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "soundUnfilteredPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray soundUnfilteredPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend soundUnfilteredPasteboardTypes_CMetInst = get_soundUnfilteredPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		soundUnfilteredPasteboardTypes_CMetInst.init(nativeBuffer, this);
		soundUnfilteredPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend soundUnfilteredTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_soundUnfilteredTypes_CMetInst(){
		return ((soundUnfilteredTypes_CMetInst != null)
	? (soundUnfilteredTypes_CMetInst)
	: (soundUnfilteredTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "soundUnfilteredTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray soundUnfilteredTypes(){
			final com.apple.jobjc.Invoke.MsgSend soundUnfilteredTypes_CMetInst = get_soundUnfilteredTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		soundUnfilteredTypes_CMetInst.init(nativeBuffer, this);
		soundUnfilteredTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
