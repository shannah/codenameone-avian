package com.apple.jobjc.appkit;

public  class NSFontManager extends com.apple.jobjc.foundation.NSObject {
	public NSFontManager(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFontManager(final NSFontManager obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend action_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_action_IMetInst(){
		return ((action_IMetInst != null)
	? (action_IMetInst)
	: (action_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "action", com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public com.apple.jobjc.SEL action(){
			final com.apple.jobjc.Invoke.MsgSend action_IMetInst = get_action_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		action_IMetInst.init(nativeBuffer, this);
		action_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.SEL returnValue = (com.apple.jobjc.SEL) (com.apple.jobjc.Coder.SELCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addCollection_options_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addCollection_options_IMetInst(){
		return ((addCollection_options_IMetInst != null)
	? (addCollection_options_IMetInst)
	: (addCollection_options_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addCollection:options:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean addCollection_options(final com.apple.jobjc.foundation.NSString collectionName, final long collectionOptions){
			final com.apple.jobjc.Invoke.MsgSend addCollection_options_IMetInst = get_addCollection_options_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addCollection_options_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionName);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, collectionOptions);
		addCollection_options_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addFontDescriptors_toCollection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addFontDescriptors_toCollection_IMetInst(){
		return ((addFontDescriptors_toCollection_IMetInst != null)
	? (addFontDescriptors_toCollection_IMetInst)
	: (addFontDescriptors_toCollection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addFontDescriptors:toCollection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addFontDescriptors_toCollection(final com.apple.jobjc.foundation.NSArray descriptors, final com.apple.jobjc.foundation.NSString collectionName){
			final com.apple.jobjc.Invoke.MsgSend addFontDescriptors_toCollection_IMetInst = get_addFontDescriptors_toCollection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addFontDescriptors_toCollection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptors);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionName);
		addFontDescriptors_toCollection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addFontTrait_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addFontTrait_IMetInst(){
		return ((addFontTrait_IMetInst != null)
	? (addFontTrait_IMetInst)
	: (addFontTrait_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addFontTrait:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addFontTrait(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend addFontTrait_IMetInst = get_addFontTrait_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addFontTrait_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		addFontTrait_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend availableFontFamilies_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableFontFamilies_IMetInst(){
		return ((availableFontFamilies_IMetInst != null)
	? (availableFontFamilies_IMetInst)
	: (availableFontFamilies_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableFontFamilies", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableFontFamilies(){
			final com.apple.jobjc.Invoke.MsgSend availableFontFamilies_IMetInst = get_availableFontFamilies_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableFontFamilies_IMetInst.init(nativeBuffer, this);
		availableFontFamilies_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableFontNamesMatchingFontDescriptor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableFontNamesMatchingFontDescriptor_IMetInst(){
		return ((availableFontNamesMatchingFontDescriptor_IMetInst != null)
	? (availableFontNamesMatchingFontDescriptor_IMetInst)
	: (availableFontNamesMatchingFontDescriptor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableFontNamesMatchingFontDescriptor:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableFontNamesMatchingFontDescriptor(final com.apple.jobjc.appkit.NSFontDescriptor descriptor){
			final com.apple.jobjc.Invoke.MsgSend availableFontNamesMatchingFontDescriptor_IMetInst = get_availableFontNamesMatchingFontDescriptor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableFontNamesMatchingFontDescriptor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		availableFontNamesMatchingFontDescriptor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableFontNamesWithTraits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableFontNamesWithTraits_IMetInst(){
		return ((availableFontNamesWithTraits_IMetInst != null)
	? (availableFontNamesWithTraits_IMetInst)
	: (availableFontNamesWithTraits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableFontNamesWithTraits:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSArray availableFontNamesWithTraits(final long someTraits){
			final com.apple.jobjc.Invoke.MsgSend availableFontNamesWithTraits_IMetInst = get_availableFontNamesWithTraits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableFontNamesWithTraits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, someTraits);
		availableFontNamesWithTraits_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableFonts_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableFonts_IMetInst(){
		return ((availableFonts_IMetInst != null)
	? (availableFonts_IMetInst)
	: (availableFonts_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableFonts", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableFonts(){
			final com.apple.jobjc.Invoke.MsgSend availableFonts_IMetInst = get_availableFonts_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableFonts_IMetInst.init(nativeBuffer, this);
		availableFonts_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend availableMembersOfFontFamily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_availableMembersOfFontFamily_IMetInst(){
		return ((availableMembersOfFontFamily_IMetInst != null)
	? (availableMembersOfFontFamily_IMetInst)
	: (availableMembersOfFontFamily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "availableMembersOfFontFamily:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray availableMembersOfFontFamily(final com.apple.jobjc.foundation.NSString fam){
			final com.apple.jobjc.Invoke.MsgSend availableMembersOfFontFamily_IMetInst = get_availableMembersOfFontFamily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		availableMembersOfFontFamily_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fam);
		availableMembersOfFontFamily_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend collectionNames_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionNames_IMetInst(){
		return ((collectionNames_IMetInst != null)
	? (collectionNames_IMetInst)
	: (collectionNames_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray collectionNames(){
			final com.apple.jobjc.Invoke.MsgSend collectionNames_IMetInst = get_collectionNames_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionNames_IMetInst.init(nativeBuffer, this);
		collectionNames_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertAttributes_IMetInst(){
		return ((convertAttributes_IMetInst != null)
	? (convertAttributes_IMetInst)
	: (convertAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSDictionary convertAttributes(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend convertAttributes_IMetInst = get_convertAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		convertAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSDictionary returnValue = (com.apple.jobjc.foundation.NSDictionary) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_IMetInst(){
		return ((convertFont_IMetInst != null)
	? (convertFont_IMetInst)
	: (convertFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend convertFont_IMetInst = get_convertFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		convertFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_toFace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_toFace_IMetInst(){
		return ((convertFont_toFace_IMetInst != null)
	? (convertFont_toFace_IMetInst)
	: (convertFont_toFace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:toFace:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont_toFace(final com.apple.jobjc.appkit.NSFont fontObj, final com.apple.jobjc.foundation.NSString typeface){
			final com.apple.jobjc.Invoke.MsgSend convertFont_toFace_IMetInst = get_convertFont_toFace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_toFace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, typeface);
		convertFont_toFace_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_toFamily_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_toFamily_IMetInst(){
		return ((convertFont_toFamily_IMetInst != null)
	? (convertFont_toFamily_IMetInst)
	: (convertFont_toFamily_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:toFamily:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont_toFamily(final com.apple.jobjc.appkit.NSFont fontObj, final com.apple.jobjc.foundation.NSString family){
			final com.apple.jobjc.Invoke.MsgSend convertFont_toFamily_IMetInst = get_convertFont_toFamily_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_toFamily_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, family);
		convertFont_toFamily_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_toHaveTrait_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_toHaveTrait_IMetInst(){
		return ((convertFont_toHaveTrait_IMetInst != null)
	? (convertFont_toHaveTrait_IMetInst)
	: (convertFont_toHaveTrait_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:toHaveTrait:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont_toHaveTrait(final com.apple.jobjc.appkit.NSFont fontObj, final long trait){
			final com.apple.jobjc.Invoke.MsgSend convertFont_toHaveTrait_IMetInst = get_convertFont_toHaveTrait_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_toHaveTrait_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, trait);
		convertFont_toHaveTrait_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_toNotHaveTrait_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_toNotHaveTrait_IMetInst(){
		return ((convertFont_toNotHaveTrait_IMetInst != null)
	? (convertFont_toNotHaveTrait_IMetInst)
	: (convertFont_toNotHaveTrait_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:toNotHaveTrait:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont_toNotHaveTrait(final com.apple.jobjc.appkit.NSFont fontObj, final long trait){
			final com.apple.jobjc.Invoke.MsgSend convertFont_toNotHaveTrait_IMetInst = get_convertFont_toNotHaveTrait_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_toNotHaveTrait_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, trait);
		convertFont_toNotHaveTrait_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFont_toSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFont_toSize_IMetInst(){
		return ((convertFont_toSize_IMetInst != null)
	? (convertFont_toSize_IMetInst)
	: (convertFont_toSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFont:toSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont convertFont_toSize(final com.apple.jobjc.appkit.NSFont fontObj, final double size){
			final com.apple.jobjc.Invoke.MsgSend convertFont_toSize_IMetInst = get_convertFont_toSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFont_toSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, size);
		convertFont_toSize_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertFontTraits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertFontTraits_IMetInst(){
		return ((convertFontTraits_IMetInst != null)
	? (convertFontTraits_IMetInst)
	: (convertFontTraits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertFontTraits:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long convertFontTraits(final long traits){
			final com.apple.jobjc.Invoke.MsgSend convertFontTraits_IMetInst = get_convertFontTraits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertFontTraits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, traits);
		convertFontTraits_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend convertWeight_ofFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_convertWeight_ofFont_IMetInst(){
		return ((convertWeight_ofFont_IMetInst != null)
	? (convertWeight_ofFont_IMetInst)
	: (convertWeight_ofFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "convertWeight:ofFont:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont convertWeight_ofFont(final boolean upFlag, final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend convertWeight_ofFont_IMetInst = get_convertWeight_ofFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		convertWeight_ofFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, upFlag);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		convertWeight_ofFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend currentFontAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_currentFontAction_IMetInst(){
		return ((currentFontAction_IMetInst != null)
	? (currentFontAction_IMetInst)
	: (currentFontAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "currentFontAction", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long currentFontAction(){
			final com.apple.jobjc.Invoke.MsgSend currentFontAction_IMetInst = get_currentFontAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		currentFontAction_IMetInst.init(nativeBuffer, this);
		currentFontAction_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontDescriptorsInCollection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontDescriptorsInCollection_IMetInst(){
		return ((fontDescriptorsInCollection_IMetInst != null)
	? (fontDescriptorsInCollection_IMetInst)
	: (fontDescriptorsInCollection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontDescriptorsInCollection:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray fontDescriptorsInCollection(final com.apple.jobjc.foundation.NSString collectionNames){
			final com.apple.jobjc.Invoke.MsgSend fontDescriptorsInCollection_IMetInst = get_fontDescriptorsInCollection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontDescriptorsInCollection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionNames);
		fontDescriptorsInCollection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontMenu_IMetInst(){
		return ((fontMenu_IMetInst != null)
	? (fontMenu_IMetInst)
	: (fontMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontMenu:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu fontMenu(final boolean create){
			final com.apple.jobjc.Invoke.MsgSend fontMenu_IMetInst = get_fontMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, create);
		fontMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontNamed_hasTraits_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontNamed_hasTraits_IMetInst(){
		return ((fontNamed_hasTraits_IMetInst != null)
	? (fontNamed_hasTraits_IMetInst)
	: (fontNamed_hasTraits_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontNamed:hasTraits:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public boolean fontNamed_hasTraits(final com.apple.jobjc.foundation.NSString fName, final long someTraits){
			final com.apple.jobjc.Invoke.MsgSend fontNamed_hasTraits_IMetInst = get_fontNamed_hasTraits_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontNamed_hasTraits_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fName);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, someTraits);
		fontNamed_hasTraits_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontPanel_IMetInst(){
		return ((fontPanel_IMetInst != null)
	? (fontPanel_IMetInst)
	: (fontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontPanel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFontPanel fontPanel(final boolean create){
			final com.apple.jobjc.Invoke.MsgSend fontPanel_IMetInst = get_fontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, create);
		fontPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFontPanel returnValue = (com.apple.jobjc.appkit.NSFontPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontWithFamily_traits_weight_size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontWithFamily_traits_weight_size_IMetInst(){
		return ((fontWithFamily_traits_weight_size_IMetInst != null)
	? (fontWithFamily_traits_weight_size_IMetInst)
	: (fontWithFamily_traits_weight_size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontWithFamily:traits:weight:size:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont fontWithFamily_traits_weight_size(final com.apple.jobjc.foundation.NSString family, final long traits, final long weight, final double size){
			final com.apple.jobjc.Invoke.MsgSend fontWithFamily_traits_weight_size_IMetInst = get_fontWithFamily_traits_weight_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontWithFamily_traits_weight_size_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, traits);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, weight);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, size);
		fontWithFamily_traits_weight_size_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnabled_IMetInst(){
		return ((isEnabled_IMetInst != null)
	? (isEnabled_IMetInst)
	: (isEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEnabled(){
			final com.apple.jobjc.Invoke.MsgSend isEnabled_IMetInst = get_isEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnabled_IMetInst.init(nativeBuffer, this);
		isEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isMultiple_IMetInst(){
		return ((isMultiple_IMetInst != null)
	? (isMultiple_IMetInst)
	: (isMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isMultiple", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isMultiple(){
			final com.apple.jobjc.Invoke.MsgSend isMultiple_IMetInst = get_isMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isMultiple_IMetInst.init(nativeBuffer, this);
		isMultiple_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localizedNameForFamily_face_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localizedNameForFamily_face_IMetInst(){
		return ((localizedNameForFamily_face_IMetInst != null)
	? (localizedNameForFamily_face_IMetInst)
	: (localizedNameForFamily_face_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localizedNameForFamily:face:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localizedNameForFamily_face(final com.apple.jobjc.foundation.NSString family, final com.apple.jobjc.foundation.NSString faceKey){
			final com.apple.jobjc.Invoke.MsgSend localizedNameForFamily_face_IMetInst = get_localizedNameForFamily_face_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localizedNameForFamily_face_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, family);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, faceKey);
		localizedNameForFamily_face_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend modifyFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modifyFont_IMetInst(){
		return ((modifyFont_IMetInst != null)
	? (modifyFont_IMetInst)
	: (modifyFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modifyFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void modifyFont(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend modifyFont_IMetInst = get_modifyFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modifyFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		modifyFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend modifyFontViaPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_modifyFontViaPanel_IMetInst(){
		return ((modifyFontViaPanel_IMetInst != null)
	? (modifyFontViaPanel_IMetInst)
	: (modifyFontViaPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "modifyFontViaPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void modifyFontViaPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend modifyFontViaPanel_IMetInst = get_modifyFontViaPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		modifyFontViaPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		modifyFontViaPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontFontPanel_IMetInst(){
		return ((orderFrontFontPanel_IMetInst != null)
	? (orderFrontFontPanel_IMetInst)
	: (orderFrontFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontFontPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontFontPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontFontPanel_IMetInst = get_orderFrontFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontFontPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontFontPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend orderFrontStylesPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_orderFrontStylesPanel_IMetInst(){
		return ((orderFrontStylesPanel_IMetInst != null)
	? (orderFrontStylesPanel_IMetInst)
	: (orderFrontStylesPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "orderFrontStylesPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void orderFrontStylesPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend orderFrontStylesPanel_IMetInst = get_orderFrontStylesPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		orderFrontStylesPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		orderFrontStylesPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeCollection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeCollection_IMetInst(){
		return ((removeCollection_IMetInst != null)
	? (removeCollection_IMetInst)
	: (removeCollection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeCollection:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removeCollection(final com.apple.jobjc.foundation.NSString collectionName){
			final com.apple.jobjc.Invoke.MsgSend removeCollection_IMetInst = get_removeCollection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeCollection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collectionName);
		removeCollection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFontDescriptor_fromCollection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFontDescriptor_fromCollection_IMetInst(){
		return ((removeFontDescriptor_fromCollection_IMetInst != null)
	? (removeFontDescriptor_fromCollection_IMetInst)
	: (removeFontDescriptor_fromCollection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFontDescriptor:fromCollection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFontDescriptor_fromCollection(final com.apple.jobjc.appkit.NSFontDescriptor descriptor, final com.apple.jobjc.foundation.NSString collection){
			final com.apple.jobjc.Invoke.MsgSend removeFontDescriptor_fromCollection_IMetInst = get_removeFontDescriptor_fromCollection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFontDescriptor_fromCollection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, descriptor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, collection);
		removeFontDescriptor_fromCollection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeFontTrait_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeFontTrait_IMetInst(){
		return ((removeFontTrait_IMetInst != null)
	? (removeFontTrait_IMetInst)
	: (removeFontTrait_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeFontTrait:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeFontTrait(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend removeFontTrait_IMetInst = get_removeFontTrait_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeFontTrait_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		removeFontTrait_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedFont_IMetInst(){
		return ((selectedFont_IMetInst != null)
	? (selectedFont_IMetInst)
	: (selectedFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont selectedFont(){
			final com.apple.jobjc.Invoke.MsgSend selectedFont_IMetInst = get_selectedFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedFont_IMetInst.init(nativeBuffer, this);
		selectedFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sendAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sendAction_IMetInst(){
		return ((sendAction_IMetInst != null)
	? (sendAction_IMetInst)
	: (sendAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sendAction", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean sendAction(){
			final com.apple.jobjc.Invoke.MsgSend sendAction_IMetInst = get_sendAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sendAction_IMetInst.init(nativeBuffer, this);
		sendAction_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAction_IMetInst(){
		return ((setAction_IMetInst != null)
	? (setAction_IMetInst)
	: (setAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public void setAction(final com.apple.jobjc.SEL aSelector){
			final com.apple.jobjc.Invoke.MsgSend setAction_IMetInst = get_setAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		setAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabled_IMetInst(){
		return ((setEnabled_IMetInst != null)
	? (setEnabled_IMetInst)
	: (setEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEnabled_IMetInst = get_setEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFontMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFontMenu_IMetInst(){
		return ((setFontMenu_IMetInst != null)
	? (setFontMenu_IMetInst)
	: (setFontMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFontMenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFontMenu(final com.apple.jobjc.appkit.NSMenu newMenu){
			final com.apple.jobjc.Invoke.MsgSend setFontMenu_IMetInst = get_setFontMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFontMenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newMenu);
		setFontMenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedAttributes_isMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedAttributes_isMultiple_IMetInst(){
		return ((setSelectedAttributes_isMultiple_IMetInst != null)
	? (setSelectedAttributes_isMultiple_IMetInst)
	: (setSelectedAttributes_isMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedAttributes:isMultiple:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectedAttributes_isMultiple(final com.apple.jobjc.foundation.NSDictionary attributes, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectedAttributes_isMultiple_IMetInst = get_setSelectedAttributes_isMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedAttributes_isMultiple_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectedAttributes_isMultiple_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedFont_isMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedFont_isMultiple_IMetInst(){
		return ((setSelectedFont_isMultiple_IMetInst != null)
	? (setSelectedFont_isMultiple_IMetInst)
	: (setSelectedFont_isMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedFont:isMultiple:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectedFont_isMultiple(final com.apple.jobjc.appkit.NSFont fontObj, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectedFont_isMultiple_IMetInst = get_setSelectedFont_isMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedFont_isMultiple_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectedFont_isMultiple_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTarget_IMetInst(){
		return ((setTarget_IMetInst != null)
	? (setTarget_IMetInst)
	: (setTarget_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTarget:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTarget(final com.apple.jobjc.ID aTarget){
			final com.apple.jobjc.Invoke.MsgSend setTarget_IMetInst = get_setTarget_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTarget_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTarget);
		setTarget_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend target_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_target_IMetInst(){
		return ((target_IMetInst != null)
	? (target_IMetInst)
	: (target_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "target", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T target(){
			final com.apple.jobjc.Invoke.MsgSend target_IMetInst = get_target_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		target_IMetInst.init(nativeBuffer, this);
		target_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend traitsOfFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_traitsOfFont_IMetInst(){
		return ((traitsOfFont_IMetInst != null)
	? (traitsOfFont_IMetInst)
	: (traitsOfFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "traitsOfFont:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long traitsOfFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend traitsOfFont_IMetInst = get_traitsOfFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		traitsOfFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		traitsOfFont_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend weightOfFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_weightOfFont_IMetInst(){
		return ((weightOfFont_IMetInst != null)
	? (weightOfFont_IMetInst)
	: (weightOfFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "weightOfFont:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long weightOfFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend weightOfFont_IMetInst = get_weightOfFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		weightOfFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		weightOfFont_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

}
