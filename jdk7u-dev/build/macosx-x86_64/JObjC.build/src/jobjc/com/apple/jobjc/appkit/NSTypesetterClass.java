package com.apple.jobjc.appkit;

public  class NSTypesetterClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSTypesetterClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSTypesetterClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSTypesetterClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend defaultTypesetterBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultTypesetterBehavior_CMetInst(){
		return ((defaultTypesetterBehavior_CMetInst != null)
	? (defaultTypesetterBehavior_CMetInst)
	: (defaultTypesetterBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultTypesetterBehavior", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long defaultTypesetterBehavior(){
			final com.apple.jobjc.Invoke.MsgSend defaultTypesetterBehavior_CMetInst = get_defaultTypesetterBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultTypesetterBehavior_CMetInst.init(nativeBuffer, this);
		defaultTypesetterBehavior_CMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst(){
		return ((printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst != null)
	? (printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst)
	: (printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "printingAdjustmentInLayoutManager:forNominallySpacedGlyphRange:packedGlyphs:count:", com.apple.jobjc.foundation.NSSize.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSSize printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count(final com.apple.jobjc.appkit.NSLayoutManager layoutMgr, final com.apple.jobjc.foundation.NSRange nominallySpacedGlyphsRange, final com.apple.jobjc.Pointer<java.lang.Byte> packedGlyphs, final long packedGlyphsCount){
			final com.apple.jobjc.Invoke.MsgSend printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst = get_printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, layoutMgr);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, nominallySpacedGlyphsRange);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, packedGlyphs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, packedGlyphsCount);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		printingAdjustmentInLayoutManager_forNominallySpacedGlyphRange_packedGlyphs_count_CMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSystemTypesetter_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSystemTypesetter_CMetInst(){
		return ((sharedSystemTypesetter_CMetInst != null)
	? (sharedSystemTypesetter_CMetInst)
	: (sharedSystemTypesetter_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSystemTypesetter", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedSystemTypesetter(){
			final com.apple.jobjc.Invoke.MsgSend sharedSystemTypesetter_CMetInst = get_sharedSystemTypesetter_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSystemTypesetter_CMetInst.init(nativeBuffer, this);
		sharedSystemTypesetter_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sharedSystemTypesetterForBehavior_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sharedSystemTypesetterForBehavior_CMetInst(){
		return ((sharedSystemTypesetterForBehavior_CMetInst != null)
	? (sharedSystemTypesetterForBehavior_CMetInst)
	: (sharedSystemTypesetterForBehavior_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sharedSystemTypesetterForBehavior:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public <T extends com.apple.jobjc.ID> T sharedSystemTypesetterForBehavior(final long theBehavior){
			final com.apple.jobjc.Invoke.MsgSend sharedSystemTypesetterForBehavior_CMetInst = get_sharedSystemTypesetterForBehavior_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sharedSystemTypesetterForBehavior_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, theBehavior);
		sharedSystemTypesetterForBehavior_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
