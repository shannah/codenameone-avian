package com.apple.jobjc.appkit;

public  class NSBundleCategory extends com.apple.jobjc.foundation.NSBundle {
	public NSBundleCategory(final com.apple.jobjc.foundation.NSBundle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	public NSBundleCategory(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBundleCategory(final NSBundleCategory obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend URLForImageResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_URLForImageResource_IMetInst(){
		return ((URLForImageResource_IMetInst != null)
	? (URLForImageResource_IMetInst)
	: (URLForImageResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "URLForImageResource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSURL URLForImageResource(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend URLForImageResource_IMetInst = get_URLForImageResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		URLForImageResource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		URLForImageResource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSURL returnValue = (com.apple.jobjc.foundation.NSURL) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contextHelpForKey_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contextHelpForKey_IMetInst(){
		return ((contextHelpForKey_IMetInst != null)
	? (contextHelpForKey_IMetInst)
	: (contextHelpForKey_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contextHelpForKey:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString contextHelpForKey(final com.apple.jobjc.foundation.NSString key){
			final com.apple.jobjc.Invoke.MsgSend contextHelpForKey_IMetInst = get_contextHelpForKey_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contextHelpForKey_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, key);
		contextHelpForKey_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageForResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageForResource_IMetInst(){
		return ((imageForResource_IMetInst != null)
	? (imageForResource_IMetInst)
	: (imageForResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageForResource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage imageForResource(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend imageForResource_IMetInst = get_imageForResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageForResource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		imageForResource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadNibFile_externalNameTable_withZone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadNibFile_externalNameTable_withZone_IMetInst(){
		return ((loadNibFile_externalNameTable_withZone_IMetInst != null)
	? (loadNibFile_externalNameTable_withZone_IMetInst)
	: (loadNibFile_externalNameTable_withZone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadNibFile:externalNameTable:withZone:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean loadNibFile_externalNameTable_withZone(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSDictionary context, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend loadNibFile_externalNameTable_withZone_IMetInst = get_loadNibFile_externalNameTable_withZone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadNibFile_externalNameTable_withZone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		loadNibFile_externalNameTable_withZone_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadNibNamed_owner_topLevelObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadNibNamed_owner_topLevelObjects_IMetInst(){
		return ((loadNibNamed_owner_topLevelObjects_IMetInst != null)
	? (loadNibNamed_owner_topLevelObjects_IMetInst)
	: (loadNibNamed_owner_topLevelObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadNibNamed:owner:topLevelObjects:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean loadNibNamed_owner_topLevelObjects(final com.apple.jobjc.foundation.NSString nibName, final com.apple.jobjc.ID owner, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSArray> topLevelObjects){
			final com.apple.jobjc.Invoke.MsgSend loadNibNamed_owner_topLevelObjects_IMetInst = get_loadNibNamed_owner_topLevelObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadNibNamed_owner_topLevelObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, topLevelObjects);
		loadNibNamed_owner_topLevelObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForImageResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForImageResource_IMetInst(){
		return ((pathForImageResource_IMetInst != null)
	? (pathForImageResource_IMetInst)
	: (pathForImageResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForImageResource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForImageResource(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend pathForImageResource_IMetInst = get_pathForImageResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForImageResource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		pathForImageResource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend pathForSoundResource_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pathForSoundResource_IMetInst(){
		return ((pathForSoundResource_IMetInst != null)
	? (pathForSoundResource_IMetInst)
	: (pathForSoundResource_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pathForSoundResource:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString pathForSoundResource(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend pathForSoundResource_IMetInst = get_pathForSoundResource_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pathForSoundResource_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		pathForSoundResource_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
