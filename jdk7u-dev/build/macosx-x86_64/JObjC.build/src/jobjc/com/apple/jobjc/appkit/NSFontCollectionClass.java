package com.apple.jobjc.appkit;

public  class NSFontCollectionClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFontCollectionClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFontCollectionClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFontCollectionClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allFontCollectionNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allFontCollectionNames_CMetInst(){
		return ((allFontCollectionNames_CMetInst != null)
	? (allFontCollectionNames_CMetInst)
	: (allFontCollectionNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allFontCollectionNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allFontCollectionNames(){
			final com.apple.jobjc.Invoke.MsgSend allFontCollectionNames_CMetInst = get_allFontCollectionNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allFontCollectionNames_CMetInst.init(nativeBuffer, this);
		allFontCollectionNames_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontCollectionWithAllAvailableDescriptors_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontCollectionWithAllAvailableDescriptors_CMetInst(){
		return ((fontCollectionWithAllAvailableDescriptors_CMetInst != null)
	? (fontCollectionWithAllAvailableDescriptors_CMetInst)
	: (fontCollectionWithAllAvailableDescriptors_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontCollectionWithAllAvailableDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fontCollectionWithAllAvailableDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend fontCollectionWithAllAvailableDescriptors_CMetInst = get_fontCollectionWithAllAvailableDescriptors_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontCollectionWithAllAvailableDescriptors_CMetInst.init(nativeBuffer, this);
		fontCollectionWithAllAvailableDescriptors_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontCollectionWithDescriptors_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontCollectionWithDescriptors_CMetInst(){
		return ((fontCollectionWithDescriptors_CMetInst != null)
	? (fontCollectionWithDescriptors_CMetInst)
	: (fontCollectionWithDescriptors_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontCollectionWithDescriptors:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fontCollectionWithDescriptors(final com.apple.jobjc.foundation.NSArray queryDescriptors){
			final com.apple.jobjc.Invoke.MsgSend fontCollectionWithDescriptors_CMetInst = get_fontCollectionWithDescriptors_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontCollectionWithDescriptors_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, queryDescriptors);
		fontCollectionWithDescriptors_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontCollectionWithLocale_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontCollectionWithLocale_CMetInst(){
		return ((fontCollectionWithLocale_CMetInst != null)
	? (fontCollectionWithLocale_CMetInst)
	: (fontCollectionWithLocale_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontCollectionWithLocale:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fontCollectionWithLocale(final com.apple.jobjc.foundation.NSLocale locale){
			final com.apple.jobjc.Invoke.MsgSend fontCollectionWithLocale_CMetInst = get_fontCollectionWithLocale_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontCollectionWithLocale_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, locale);
		fontCollectionWithLocale_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontCollectionWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontCollectionWithName_CMetInst(){
		return ((fontCollectionWithName_CMetInst != null)
	? (fontCollectionWithName_CMetInst)
	: (fontCollectionWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontCollectionWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T fontCollectionWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend fontCollectionWithName_CMetInst = get_fontCollectionWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontCollectionWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		fontCollectionWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontCollectionWithName_visibility_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontCollectionWithName_visibility_CMetInst(){
		return ((fontCollectionWithName_visibility_CMetInst != null)
	? (fontCollectionWithName_visibility_CMetInst)
	: (fontCollectionWithName_visibility_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontCollectionWithName:visibility:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T fontCollectionWithName_visibility(final com.apple.jobjc.foundation.NSString name, final long visibility){
			final com.apple.jobjc.Invoke.MsgSend fontCollectionWithName_visibility_CMetInst = get_fontCollectionWithName_visibility_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontCollectionWithName_visibility_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, visibility);
		fontCollectionWithName_visibility_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hideFontCollectionWithName_visibility_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hideFontCollectionWithName_visibility_error_CMetInst(){
		return ((hideFontCollectionWithName_visibility_error_CMetInst != null)
	? (hideFontCollectionWithName_visibility_error_CMetInst)
	: (hideFontCollectionWithName_visibility_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hideFontCollectionWithName:visibility:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean hideFontCollectionWithName_visibility_error(final com.apple.jobjc.foundation.NSString name, final long visibility, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend hideFontCollectionWithName_visibility_error_CMetInst = get_hideFontCollectionWithName_visibility_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hideFontCollectionWithName_visibility_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, visibility);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		hideFontCollectionWithName_visibility_error_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend renameFontCollectionWithName_visibility_toName_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_renameFontCollectionWithName_visibility_toName_error_CMetInst(){
		return ((renameFontCollectionWithName_visibility_toName_error_CMetInst != null)
	? (renameFontCollectionWithName_visibility_toName_error_CMetInst)
	: (renameFontCollectionWithName_visibility_toName_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "renameFontCollectionWithName:visibility:toName:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean renameFontCollectionWithName_visibility_toName_error(final com.apple.jobjc.foundation.NSString name, final long visibility, final com.apple.jobjc.foundation.NSString name2, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend renameFontCollectionWithName_visibility_toName_error_CMetInst = get_renameFontCollectionWithName_visibility_toName_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		renameFontCollectionWithName_visibility_toName_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, visibility);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name2);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		renameFontCollectionWithName_visibility_toName_error_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend showFontCollection_withName_visibility_error_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showFontCollection_withName_visibility_error_CMetInst(){
		return ((showFontCollection_withName_visibility_error_CMetInst != null)
	? (showFontCollection_withName_visibility_error_CMetInst)
	: (showFontCollection_withName_visibility_error_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showFontCollection:withName:visibility:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean showFontCollection_withName_visibility_error(final com.apple.jobjc.appkit.NSFontCollection collection, final com.apple.jobjc.foundation.NSString name, final long visibility, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend showFontCollection_withName_visibility_error_CMetInst = get_showFontCollection_withName_visibility_error_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showFontCollection_withName_visibility_error_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collection);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, visibility);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		showFontCollection_withName_visibility_error_CMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
