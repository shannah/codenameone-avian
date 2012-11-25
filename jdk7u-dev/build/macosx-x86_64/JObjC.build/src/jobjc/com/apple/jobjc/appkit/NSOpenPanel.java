package com.apple.jobjc.appkit;

public  class NSOpenPanel extends com.apple.jobjc.appkit.NSSavePanel {
	public NSOpenPanel(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSOpenPanel(final NSOpenPanel obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLs_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLs_IMetInst(){
		return ((URLs_IMetInst != null)
	? (URLs_IMetInst)
	: (URLs_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLs", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray URLs(){
			final com.apple.jobjc.Invoke.MsgSend URLs_IMetInst = get_URLs_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLs_IMetInst.init(nativeBuffer, this);
		URLs_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsMultipleSelection_IMetInst(){
		return ((allowsMultipleSelection_IMetInst != null)
	? (allowsMultipleSelection_IMetInst)
	: (allowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsMultipleSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsMultipleSelection(){
			final com.apple.jobjc.Invoke.MsgSend allowsMultipleSelection_IMetInst = get_allowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		allowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst)
	: (beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginForDirectory:file:types:modelessDelegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray fileTypes, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst = get_beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginForDirectory_file_types_modelessDelegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst(){
		return ((beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst != null)
	? (beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst)
	: (beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "beginSheetForDirectory:file:types:modalForWindow:modalDelegate:didEndSelector:contextInfo:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public void beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray fileTypes, final com.apple.jobjc.appkit.NSWindow docWindow, final com.apple.jobjc.ID delegate, final com.apple.jobjc.SEL didEndSelector, final com.apple.jobjc.Pointer<Void> contextInfo){
			final com.apple.jobjc.Invoke.MsgSend beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst = get_beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileTypes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, docWindow);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, delegate);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, didEndSelector);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, contextInfo);
		beginSheetForDirectory_file_types_modalForWindow_modalDelegate_didEndSelector_contextInfo_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend canChooseDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canChooseDirectories_IMetInst(){
		return ((canChooseDirectories_IMetInst != null)
	? (canChooseDirectories_IMetInst)
	: (canChooseDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canChooseDirectories", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canChooseDirectories(){
			final com.apple.jobjc.Invoke.MsgSend canChooseDirectories_IMetInst = get_canChooseDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canChooseDirectories_IMetInst.init(nativeBuffer, this);
		canChooseDirectories_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canChooseFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canChooseFiles_IMetInst(){
		return ((canChooseFiles_IMetInst != null)
	? (canChooseFiles_IMetInst)
	: (canChooseFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canChooseFiles", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canChooseFiles(){
			final com.apple.jobjc.Invoke.MsgSend canChooseFiles_IMetInst = get_canChooseFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canChooseFiles_IMetInst.init(nativeBuffer, this);
		canChooseFiles_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend filenames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_filenames_IMetInst(){
		return ((filenames_IMetInst != null)
	? (filenames_IMetInst)
	: (filenames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "filenames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray filenames(){
			final com.apple.jobjc.Invoke.MsgSend filenames_IMetInst = get_filenames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		filenames_IMetInst.init(nativeBuffer, this);
		filenames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resolvesAliases_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolvesAliases_IMetInst(){
		return ((resolvesAliases_IMetInst != null)
	? (resolvesAliases_IMetInst)
	: (resolvesAliases_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolvesAliases", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean resolvesAliases(){
			final com.apple.jobjc.Invoke.MsgSend resolvesAliases_IMetInst = get_resolvesAliases_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolvesAliases_IMetInst.init(nativeBuffer, this);
		resolvesAliases_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalForDirectory_file_types_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalForDirectory_file_types_IMetInst(){
		return ((runModalForDirectory_file_types_IMetInst != null)
	? (runModalForDirectory_file_types_IMetInst)
	: (runModalForDirectory_file_types_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalForDirectory:file:types:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalForDirectory_file_types(final com.apple.jobjc.foundation.NSString path, final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray fileTypes){
			final com.apple.jobjc.Invoke.MsgSend runModalForDirectory_file_types_IMetInst = get_runModalForDirectory_file_types_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalForDirectory_file_types_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileTypes);
		runModalForDirectory_file_types_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend runModalForTypes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_runModalForTypes_IMetInst(){
		return ((runModalForTypes_IMetInst != null)
	? (runModalForTypes_IMetInst)
	: (runModalForTypes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "runModalForTypes:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long runModalForTypes(final com.apple.jobjc.foundation.NSArray fileTypes){
			final com.apple.jobjc.Invoke.MsgSend runModalForTypes_IMetInst = get_runModalForTypes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		runModalForTypes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileTypes);
		runModalForTypes_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsMultipleSelection_IMetInst(){
		return ((setAllowsMultipleSelection_IMetInst != null)
	? (setAllowsMultipleSelection_IMetInst)
	: (setAllowsMultipleSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsMultipleSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsMultipleSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAllowsMultipleSelection_IMetInst = get_setAllowsMultipleSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsMultipleSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAllowsMultipleSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanChooseDirectories_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanChooseDirectories_IMetInst(){
		return ((setCanChooseDirectories_IMetInst != null)
	? (setCanChooseDirectories_IMetInst)
	: (setCanChooseDirectories_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanChooseDirectories:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanChooseDirectories(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanChooseDirectories_IMetInst = get_setCanChooseDirectories_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanChooseDirectories_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanChooseDirectories_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCanChooseFiles_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCanChooseFiles_IMetInst(){
		return ((setCanChooseFiles_IMetInst != null)
	? (setCanChooseFiles_IMetInst)
	: (setCanChooseFiles_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCanChooseFiles:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setCanChooseFiles(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setCanChooseFiles_IMetInst = get_setCanChooseFiles_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCanChooseFiles_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setCanChooseFiles_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setResolvesAliases_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setResolvesAliases_IMetInst(){
		return ((setResolvesAliases_IMetInst != null)
	? (setResolvesAliases_IMetInst)
	: (setResolvesAliases_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setResolvesAliases:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setResolvesAliases(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setResolvesAliases_IMetInst = get_setResolvesAliases_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setResolvesAliases_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setResolvesAliases_IMetInst.invoke(nativeBuffer);
		
		
	}

}
