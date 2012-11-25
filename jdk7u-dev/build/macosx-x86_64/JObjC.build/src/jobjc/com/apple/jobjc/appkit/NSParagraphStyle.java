package com.apple.jobjc.appkit;

public  class NSParagraphStyle extends com.apple.jobjc.foundation.NSObject {
	public NSParagraphStyle(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSParagraphStyle(final NSParagraphStyle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend alignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignment_IMetInst(){
		return ((alignment_IMetInst != null)
	? (alignment_IMetInst)
	: (alignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long alignment(){
			final com.apple.jobjc.Invoke.MsgSend alignment_IMetInst = get_alignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignment_IMetInst.init(nativeBuffer, this);
		alignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend baseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_baseWritingDirection_IMetInst(){
		return ((baseWritingDirection_IMetInst != null)
	? (baseWritingDirection_IMetInst)
	: (baseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "baseWritingDirection", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long baseWritingDirection(){
			final com.apple.jobjc.Invoke.MsgSend baseWritingDirection_IMetInst = get_baseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		baseWritingDirection_IMetInst.init(nativeBuffer, this);
		baseWritingDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend defaultTabInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultTabInterval_IMetInst(){
		return ((defaultTabInterval_IMetInst != null)
	? (defaultTabInterval_IMetInst)
	: (defaultTabInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultTabInterval", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double defaultTabInterval(){
			final com.apple.jobjc.Invoke.MsgSend defaultTabInterval_IMetInst = get_defaultTabInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultTabInterval_IMetInst.init(nativeBuffer, this);
		defaultTabInterval_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend firstLineHeadIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_firstLineHeadIndent_IMetInst(){
		return ((firstLineHeadIndent_IMetInst != null)
	? (firstLineHeadIndent_IMetInst)
	: (firstLineHeadIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "firstLineHeadIndent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double firstLineHeadIndent(){
			final com.apple.jobjc.Invoke.MsgSend firstLineHeadIndent_IMetInst = get_firstLineHeadIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		firstLineHeadIndent_IMetInst.init(nativeBuffer, this);
		firstLineHeadIndent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headIndent_IMetInst(){
		return ((headIndent_IMetInst != null)
	? (headIndent_IMetInst)
	: (headIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headIndent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double headIndent(){
			final com.apple.jobjc.Invoke.MsgSend headIndent_IMetInst = get_headIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headIndent_IMetInst.init(nativeBuffer, this);
		headIndent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend headerLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_headerLevel_IMetInst(){
		return ((headerLevel_IMetInst != null)
	? (headerLevel_IMetInst)
	: (headerLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "headerLevel", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long headerLevel(){
			final com.apple.jobjc.Invoke.MsgSend headerLevel_IMetInst = get_headerLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		headerLevel_IMetInst.init(nativeBuffer, this);
		headerLevel_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend hyphenationFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_hyphenationFactor_IMetInst(){
		return ((hyphenationFactor_IMetInst != null)
	? (hyphenationFactor_IMetInst)
	: (hyphenationFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "hyphenationFactor", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float hyphenationFactor(){
			final com.apple.jobjc.Invoke.MsgSend hyphenationFactor_IMetInst = get_hyphenationFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		hyphenationFactor_IMetInst.init(nativeBuffer, this);
		hyphenationFactor_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineBreakMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineBreakMode_IMetInst(){
		return ((lineBreakMode_IMetInst != null)
	? (lineBreakMode_IMetInst)
	: (lineBreakMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineBreakMode", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long lineBreakMode(){
			final com.apple.jobjc.Invoke.MsgSend lineBreakMode_IMetInst = get_lineBreakMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineBreakMode_IMetInst.init(nativeBuffer, this);
		lineBreakMode_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineHeightMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineHeightMultiple_IMetInst(){
		return ((lineHeightMultiple_IMetInst != null)
	? (lineHeightMultiple_IMetInst)
	: (lineHeightMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineHeightMultiple", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineHeightMultiple(){
			final com.apple.jobjc.Invoke.MsgSend lineHeightMultiple_IMetInst = get_lineHeightMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineHeightMultiple_IMetInst.init(nativeBuffer, this);
		lineHeightMultiple_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend lineSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_lineSpacing_IMetInst(){
		return ((lineSpacing_IMetInst != null)
	? (lineSpacing_IMetInst)
	: (lineSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "lineSpacing", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double lineSpacing(){
			final com.apple.jobjc.Invoke.MsgSend lineSpacing_IMetInst = get_lineSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		lineSpacing_IMetInst.init(nativeBuffer, this);
		lineSpacing_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maximumLineHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maximumLineHeight_IMetInst(){
		return ((maximumLineHeight_IMetInst != null)
	? (maximumLineHeight_IMetInst)
	: (maximumLineHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maximumLineHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double maximumLineHeight(){
			final com.apple.jobjc.Invoke.MsgSend maximumLineHeight_IMetInst = get_maximumLineHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maximumLineHeight_IMetInst.init(nativeBuffer, this);
		maximumLineHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumLineHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumLineHeight_IMetInst(){
		return ((minimumLineHeight_IMetInst != null)
	? (minimumLineHeight_IMetInst)
	: (minimumLineHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumLineHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double minimumLineHeight(){
			final com.apple.jobjc.Invoke.MsgSend minimumLineHeight_IMetInst = get_minimumLineHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumLineHeight_IMetInst.init(nativeBuffer, this);
		minimumLineHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphSpacing_IMetInst(){
		return ((paragraphSpacing_IMetInst != null)
	? (paragraphSpacing_IMetInst)
	: (paragraphSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphSpacing", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double paragraphSpacing(){
			final com.apple.jobjc.Invoke.MsgSend paragraphSpacing_IMetInst = get_paragraphSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphSpacing_IMetInst.init(nativeBuffer, this);
		paragraphSpacing_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paragraphSpacingBefore_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paragraphSpacingBefore_IMetInst(){
		return ((paragraphSpacingBefore_IMetInst != null)
	? (paragraphSpacingBefore_IMetInst)
	: (paragraphSpacingBefore_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paragraphSpacingBefore", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double paragraphSpacingBefore(){
			final com.apple.jobjc.Invoke.MsgSend paragraphSpacingBefore_IMetInst = get_paragraphSpacingBefore_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paragraphSpacingBefore_IMetInst.init(nativeBuffer, this);
		paragraphSpacingBefore_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tabStops_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tabStops_IMetInst(){
		return ((tabStops_IMetInst != null)
	? (tabStops_IMetInst)
	: (tabStops_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tabStops", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray tabStops(){
			final com.apple.jobjc.Invoke.MsgSend tabStops_IMetInst = get_tabStops_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tabStops_IMetInst.init(nativeBuffer, this);
		tabStops_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tailIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tailIndent_IMetInst(){
		return ((tailIndent_IMetInst != null)
	? (tailIndent_IMetInst)
	: (tailIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tailIndent", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double tailIndent(){
			final com.apple.jobjc.Invoke.MsgSend tailIndent_IMetInst = get_tailIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tailIndent_IMetInst.init(nativeBuffer, this);
		tailIndent_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textBlocks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textBlocks_IMetInst(){
		return ((textBlocks_IMetInst != null)
	? (textBlocks_IMetInst)
	: (textBlocks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textBlocks", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textBlocks(){
			final com.apple.jobjc.Invoke.MsgSend textBlocks_IMetInst = get_textBlocks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textBlocks_IMetInst.init(nativeBuffer, this);
		textBlocks_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textLists_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textLists_IMetInst(){
		return ((textLists_IMetInst != null)
	? (textLists_IMetInst)
	: (textLists_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textLists", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray textLists(){
			final com.apple.jobjc.Invoke.MsgSend textLists_IMetInst = get_textLists_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textLists_IMetInst.init(nativeBuffer, this);
		textLists_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tighteningFactorForTruncation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tighteningFactorForTruncation_IMetInst(){
		return ((tighteningFactorForTruncation_IMetInst != null)
	? (tighteningFactorForTruncation_IMetInst)
	: (tighteningFactorForTruncation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tighteningFactorForTruncation", com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public float tighteningFactorForTruncation(){
			final com.apple.jobjc.Invoke.MsgSend tighteningFactorForTruncation_IMetInst = get_tighteningFactorForTruncation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tighteningFactorForTruncation_IMetInst.init(nativeBuffer, this);
		tighteningFactorForTruncation_IMetInst.invoke(nativeBuffer);
		final float returnValue = (float) (com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.popFloat(nativeBuffer));
		return returnValue;
	}

}
