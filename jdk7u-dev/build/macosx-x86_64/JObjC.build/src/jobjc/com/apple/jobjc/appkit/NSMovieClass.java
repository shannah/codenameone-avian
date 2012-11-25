package com.apple.jobjc.appkit;

public  class NSMovieClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSMovieClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSMovieClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSMovieClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend movieUnfilteredFileTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_movieUnfilteredFileTypes_CMetInst(){
		return ((movieUnfilteredFileTypes_CMetInst != null)
	? (movieUnfilteredFileTypes_CMetInst)
	: (movieUnfilteredFileTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "movieUnfilteredFileTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray movieUnfilteredFileTypes(){
			final com.apple.jobjc.Invoke.MsgSend movieUnfilteredFileTypes_CMetInst = get_movieUnfilteredFileTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		movieUnfilteredFileTypes_CMetInst.init(nativeBuffer, this);
		movieUnfilteredFileTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend movieUnfilteredPasteboardTypes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_movieUnfilteredPasteboardTypes_CMetInst(){
		return ((movieUnfilteredPasteboardTypes_CMetInst != null)
	? (movieUnfilteredPasteboardTypes_CMetInst)
	: (movieUnfilteredPasteboardTypes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "movieUnfilteredPasteboardTypes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray movieUnfilteredPasteboardTypes(){
			final com.apple.jobjc.Invoke.MsgSend movieUnfilteredPasteboardTypes_CMetInst = get_movieUnfilteredPasteboardTypes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		movieUnfilteredPasteboardTypes_CMetInst.init(nativeBuffer, this);
		movieUnfilteredPasteboardTypes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
