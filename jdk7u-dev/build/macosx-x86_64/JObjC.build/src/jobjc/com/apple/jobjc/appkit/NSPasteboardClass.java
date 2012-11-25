package com.apple.jobjc.appkit;

public  class NSPasteboardClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSPasteboardClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSPasteboardClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSPasteboardClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend generalPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_generalPasteboard_CMetInst(){
		return ((generalPasteboard_CMetInst != null)
	? (generalPasteboard_CMetInst)
	: (generalPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "generalPasteboard", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard generalPasteboard(){
			final com.apple.jobjc.Invoke.MsgSend generalPasteboard_CMetInst = get_generalPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		generalPasteboard_CMetInst.init(nativeBuffer, this);
		generalPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringData_ofType_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardByFilteringData_ofType_CMetInst(){
		return ((pasteboardByFilteringData_ofType_CMetInst != null)
	? (pasteboardByFilteringData_ofType_CMetInst)
	: (pasteboardByFilteringData_ofType_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardByFilteringData:ofType:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard pasteboardByFilteringData_ofType(final com.apple.jobjc.foundation.NSData data, final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringData_ofType_CMetInst = get_pasteboardByFilteringData_ofType_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardByFilteringData_ofType_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		pasteboardByFilteringData_ofType_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringFile_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardByFilteringFile_CMetInst(){
		return ((pasteboardByFilteringFile_CMetInst != null)
	? (pasteboardByFilteringFile_CMetInst)
	: (pasteboardByFilteringFile_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardByFilteringFile:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard pasteboardByFilteringFile(final com.apple.jobjc.foundation.NSString filename){
			final com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringFile_CMetInst = get_pasteboardByFilteringFile_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardByFilteringFile_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filename);
		pasteboardByFilteringFile_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringTypesInPasteboard_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardByFilteringTypesInPasteboard_CMetInst(){
		return ((pasteboardByFilteringTypesInPasteboard_CMetInst != null)
	? (pasteboardByFilteringTypesInPasteboard_CMetInst)
	: (pasteboardByFilteringTypesInPasteboard_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardByFilteringTypesInPasteboard:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard pasteboardByFilteringTypesInPasteboard(final com.apple.jobjc.appkit.NSPasteboard pboard){
			final com.apple.jobjc.Invoke.MsgSend pasteboardByFilteringTypesInPasteboard_CMetInst = get_pasteboardByFilteringTypesInPasteboard_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardByFilteringTypesInPasteboard_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, pboard);
		pasteboardByFilteringTypesInPasteboard_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardWithName_CMetInst(){
		return ((pasteboardWithName_CMetInst != null)
	? (pasteboardWithName_CMetInst)
	: (pasteboardWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard pasteboardWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend pasteboardWithName_CMetInst = get_pasteboardWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		pasteboardWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteboardWithUniqueName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteboardWithUniqueName_CMetInst(){
		return ((pasteboardWithUniqueName_CMetInst != null)
	? (pasteboardWithUniqueName_CMetInst)
	: (pasteboardWithUniqueName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteboardWithUniqueName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSPasteboard pasteboardWithUniqueName(){
			final com.apple.jobjc.Invoke.MsgSend pasteboardWithUniqueName_CMetInst = get_pasteboardWithUniqueName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteboardWithUniqueName_CMetInst.init(nativeBuffer, this);
		pasteboardWithUniqueName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSPasteboard returnValue = (com.apple.jobjc.appkit.NSPasteboard) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend typesFilterableTo_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_typesFilterableTo_CMetInst(){
		return ((typesFilterableTo_CMetInst != null)
	? (typesFilterableTo_CMetInst)
	: (typesFilterableTo_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "typesFilterableTo:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray typesFilterableTo(final com.apple.jobjc.foundation.NSString type){
			final com.apple.jobjc.Invoke.MsgSend typesFilterableTo_CMetInst = get_typesFilterableTo_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		typesFilterableTo_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, type);
		typesFilterableTo_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
