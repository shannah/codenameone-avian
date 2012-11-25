package com.apple.jobjc.appkit;

public  class NSMutableParagraphStyle extends com.apple.jobjc.appkit.NSParagraphStyle {
	public NSMutableParagraphStyle(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMutableParagraphStyle(final NSMutableParagraphStyle obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addTabStop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addTabStop_IMetInst(){
		return ((addTabStop_IMetInst != null)
	? (addTabStop_IMetInst)
	: (addTabStop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addTabStop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addTabStop(final com.apple.jobjc.appkit.NSTextTab anObject){
			final com.apple.jobjc.Invoke.MsgSend addTabStop_IMetInst = get_addTabStop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addTabStop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		addTabStop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeTabStop_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeTabStop_IMetInst(){
		return ((removeTabStop_IMetInst != null)
	? (removeTabStop_IMetInst)
	: (removeTabStop_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeTabStop:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeTabStop(final com.apple.jobjc.appkit.NSTextTab anObject){
			final com.apple.jobjc.Invoke.MsgSend removeTabStop_IMetInst = get_removeTabStop_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeTabStop_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		removeTabStop_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlignment_IMetInst(){
		return ((setAlignment_IMetInst != null)
	? (setAlignment_IMetInst)
	: (setAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAlignment(final long alignment){
			final com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst = get_setAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, alignment);
		setAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBaseWritingDirection_IMetInst(){
		return ((setBaseWritingDirection_IMetInst != null)
	? (setBaseWritingDirection_IMetInst)
	: (setBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBaseWritingDirection(final long writingDirection){
			final com.apple.jobjc.Invoke.MsgSend setBaseWritingDirection_IMetInst = get_setBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		setBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDefaultTabInterval_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDefaultTabInterval_IMetInst(){
		return ((setDefaultTabInterval_IMetInst != null)
	? (setDefaultTabInterval_IMetInst)
	: (setDefaultTabInterval_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDefaultTabInterval:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setDefaultTabInterval(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setDefaultTabInterval_IMetInst = get_setDefaultTabInterval_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDefaultTabInterval_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setDefaultTabInterval_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFirstLineHeadIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFirstLineHeadIndent_IMetInst(){
		return ((setFirstLineHeadIndent_IMetInst != null)
	? (setFirstLineHeadIndent_IMetInst)
	: (setFirstLineHeadIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFirstLineHeadIndent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setFirstLineHeadIndent(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setFirstLineHeadIndent_IMetInst = get_setFirstLineHeadIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFirstLineHeadIndent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setFirstLineHeadIndent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeadIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeadIndent_IMetInst(){
		return ((setHeadIndent_IMetInst != null)
	? (setHeadIndent_IMetInst)
	: (setHeadIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeadIndent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setHeadIndent(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setHeadIndent_IMetInst = get_setHeadIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeadIndent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setHeadIndent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHeaderLevel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHeaderLevel_IMetInst(){
		return ((setHeaderLevel_IMetInst != null)
	? (setHeaderLevel_IMetInst)
	: (setHeaderLevel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHeaderLevel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setHeaderLevel(final long level){
			final com.apple.jobjc.Invoke.MsgSend setHeaderLevel_IMetInst = get_setHeaderLevel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHeaderLevel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, level);
		setHeaderLevel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHyphenationFactor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHyphenationFactor_IMetInst(){
		return ((setHyphenationFactor_IMetInst != null)
	? (setHyphenationFactor_IMetInst)
	: (setHyphenationFactor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHyphenationFactor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setHyphenationFactor(final float aFactor){
			final com.apple.jobjc.Invoke.MsgSend setHyphenationFactor_IMetInst = get_setHyphenationFactor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHyphenationFactor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, aFactor);
		setHyphenationFactor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineBreakMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineBreakMode_IMetInst(){
		return ((setLineBreakMode_IMetInst != null)
	? (setLineBreakMode_IMetInst)
	: (setLineBreakMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineBreakMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setLineBreakMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setLineBreakMode_IMetInst = get_setLineBreakMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineBreakMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setLineBreakMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineHeightMultiple_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineHeightMultiple_IMetInst(){
		return ((setLineHeightMultiple_IMetInst != null)
	? (setLineHeightMultiple_IMetInst)
	: (setLineHeightMultiple_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineHeightMultiple:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineHeightMultiple(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setLineHeightMultiple_IMetInst = get_setLineHeightMultiple_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineHeightMultiple_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setLineHeightMultiple_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLineSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLineSpacing_IMetInst(){
		return ((setLineSpacing_IMetInst != null)
	? (setLineSpacing_IMetInst)
	: (setLineSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLineSpacing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setLineSpacing(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setLineSpacing_IMetInst = get_setLineSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLineSpacing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setLineSpacing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaximumLineHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaximumLineHeight_IMetInst(){
		return ((setMaximumLineHeight_IMetInst != null)
	? (setMaximumLineHeight_IMetInst)
	: (setMaximumLineHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaximumLineHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMaximumLineHeight(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setMaximumLineHeight_IMetInst = get_setMaximumLineHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaximumLineHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setMaximumLineHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumLineHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumLineHeight_IMetInst(){
		return ((setMinimumLineHeight_IMetInst != null)
	? (setMinimumLineHeight_IMetInst)
	: (setMinimumLineHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumLineHeight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMinimumLineHeight(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setMinimumLineHeight_IMetInst = get_setMinimumLineHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumLineHeight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setMinimumLineHeight_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParagraphSpacing_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParagraphSpacing_IMetInst(){
		return ((setParagraphSpacing_IMetInst != null)
	? (setParagraphSpacing_IMetInst)
	: (setParagraphSpacing_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParagraphSpacing:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setParagraphSpacing(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setParagraphSpacing_IMetInst = get_setParagraphSpacing_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParagraphSpacing_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setParagraphSpacing_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParagraphSpacingBefore_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParagraphSpacingBefore_IMetInst(){
		return ((setParagraphSpacingBefore_IMetInst != null)
	? (setParagraphSpacingBefore_IMetInst)
	: (setParagraphSpacingBefore_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParagraphSpacingBefore:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setParagraphSpacingBefore(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setParagraphSpacingBefore_IMetInst = get_setParagraphSpacingBefore_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParagraphSpacingBefore_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setParagraphSpacingBefore_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setParagraphStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setParagraphStyle_IMetInst(){
		return ((setParagraphStyle_IMetInst != null)
	? (setParagraphStyle_IMetInst)
	: (setParagraphStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setParagraphStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setParagraphStyle(final com.apple.jobjc.appkit.NSParagraphStyle obj){
			final com.apple.jobjc.Invoke.MsgSend setParagraphStyle_IMetInst = get_setParagraphStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setParagraphStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setParagraphStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTabStops_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTabStops_IMetInst(){
		return ((setTabStops_IMetInst != null)
	? (setTabStops_IMetInst)
	: (setTabStops_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTabStops:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTabStops(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setTabStops_IMetInst = get_setTabStops_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTabStops_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setTabStops_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTailIndent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTailIndent_IMetInst(){
		return ((setTailIndent_IMetInst != null)
	? (setTailIndent_IMetInst)
	: (setTailIndent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTailIndent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setTailIndent(final double aFloat){
			final com.apple.jobjc.Invoke.MsgSend setTailIndent_IMetInst = get_setTailIndent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTailIndent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, aFloat);
		setTailIndent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextBlocks_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextBlocks_IMetInst(){
		return ((setTextBlocks_IMetInst != null)
	? (setTextBlocks_IMetInst)
	: (setTextBlocks_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextBlocks:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextBlocks(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setTextBlocks_IMetInst = get_setTextBlocks_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextBlocks_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setTextBlocks_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextLists_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextLists_IMetInst(){
		return ((setTextLists_IMetInst != null)
	? (setTextLists_IMetInst)
	: (setTextLists_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextLists:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextLists(final com.apple.jobjc.foundation.NSArray array){
			final com.apple.jobjc.Invoke.MsgSend setTextLists_IMetInst = get_setTextLists_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextLists_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, array);
		setTextLists_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTighteningFactorForTruncation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTighteningFactorForTruncation_IMetInst(){
		return ((setTighteningFactorForTruncation_IMetInst != null)
	? (setTighteningFactorForTruncation_IMetInst)
	: (setTighteningFactorForTruncation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTighteningFactorForTruncation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.FloatCoder.INST)));
	}

	 public void setTighteningFactorForTruncation(final float aFactor){
			final com.apple.jobjc.Invoke.MsgSend setTighteningFactorForTruncation_IMetInst = get_setTighteningFactorForTruncation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTighteningFactorForTruncation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.FloatCoder.INST.push(nativeBuffer, aFactor);
		setTighteningFactorForTruncation_IMetInst.invoke(nativeBuffer);
		
		
	}

}
