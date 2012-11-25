package com.apple.jobjc.appkit;

public final class NSBundleCategoryClass extends com.apple.jobjc.foundation.NSBundleClass {
	NSBundleCategoryClass(com.apple.jobjc.JObjCRuntime runtime) {
		super("NSBundle", runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend loadNibFile_externalNameTable_withZone_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadNibFile_externalNameTable_withZone_CMetInst(){
		return ((loadNibFile_externalNameTable_withZone_CMetInst != null)
	? (loadNibFile_externalNameTable_withZone_CMetInst)
	: (loadNibFile_externalNameTable_withZone_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadNibFile:externalNameTable:withZone:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean loadNibFile_externalNameTable_withZone(final com.apple.jobjc.foundation.NSString fileName, final com.apple.jobjc.foundation.NSDictionary context, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSZoneOpaque> zone){
			final com.apple.jobjc.Invoke.MsgSend loadNibFile_externalNameTable_withZone_CMetInst = get_loadNibFile_externalNameTable_withZone_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadNibFile_externalNameTable_withZone_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fileName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, context);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, zone);
		loadNibFile_externalNameTable_withZone_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend loadNibNamed_owner_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_loadNibNamed_owner_CMetInst(){
		return ((loadNibNamed_owner_CMetInst != null)
	? (loadNibNamed_owner_CMetInst)
	: (loadNibNamed_owner_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "loadNibNamed:owner:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean loadNibNamed_owner(final com.apple.jobjc.foundation.NSString nibName, final com.apple.jobjc.ID owner){
			final com.apple.jobjc.Invoke.MsgSend loadNibNamed_owner_CMetInst = get_loadNibNamed_owner_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		loadNibNamed_owner_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nibName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owner);
		loadNibNamed_owner_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
