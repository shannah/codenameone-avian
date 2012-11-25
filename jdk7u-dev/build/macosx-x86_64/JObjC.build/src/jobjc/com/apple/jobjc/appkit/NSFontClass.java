package com.apple.jobjc.appkit;

public  class NSFontClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSFontClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSFontClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSFontClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend boldSystemFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boldSystemFontOfSize_CMetInst(){
		return ((boldSystemFontOfSize_CMetInst != null)
	? (boldSystemFontOfSize_CMetInst)
	: (boldSystemFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boldSystemFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont boldSystemFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend boldSystemFontOfSize_CMetInst = get_boldSystemFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boldSystemFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		boldSystemFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend controlContentFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_controlContentFontOfSize_CMetInst(){
		return ((controlContentFontOfSize_CMetInst != null)
	? (controlContentFontOfSize_CMetInst)
	: (controlContentFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "controlContentFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont controlContentFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend controlContentFontOfSize_CMetInst = get_controlContentFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		controlContentFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		controlContentFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontWithDescriptor_size_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontWithDescriptor_size_CMetInst(){
		return ((fontWithDescriptor_size_CMetInst != null)
	? (fontWithDescriptor_size_CMetInst)
	: (fontWithDescriptor_size_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontWithDescriptor:size:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont fontWithDescriptor_size(final com.apple.jobjc.appkit.NSFontDescriptor fontDescriptor, final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend fontWithDescriptor_size_CMetInst = get_fontWithDescriptor_size_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontWithDescriptor_size_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontDescriptor);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		fontWithDescriptor_size_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontWithDescriptor_textTransform_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontWithDescriptor_textTransform_CMetInst(){
		return ((fontWithDescriptor_textTransform_CMetInst != null)
	? (fontWithDescriptor_textTransform_CMetInst)
	: (fontWithDescriptor_textTransform_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontWithDescriptor:textTransform:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont fontWithDescriptor_textTransform(final com.apple.jobjc.appkit.NSFontDescriptor fontDescriptor, final com.apple.jobjc.foundation.NSAffineTransform textTransform){
			final com.apple.jobjc.Invoke.MsgSend fontWithDescriptor_textTransform_CMetInst = get_fontWithDescriptor_textTransform_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontWithDescriptor_textTransform_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontDescriptor);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textTransform);
		fontWithDescriptor_textTransform_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontWithName_matrix_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontWithName_matrix_CMetInst(){
		return ((fontWithName_matrix_CMetInst != null)
	? (fontWithName_matrix_CMetInst)
	: (fontWithName_matrix_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontWithName:matrix:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont fontWithName_matrix(final com.apple.jobjc.foundation.NSString fontName, final com.apple.jobjc.Pointer<java.lang.Double> fontMatrix){
			final com.apple.jobjc.Invoke.MsgSend fontWithName_matrix_CMetInst = get_fontWithName_matrix_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontWithName_matrix_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, fontMatrix);
		fontWithName_matrix_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fontWithName_size_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fontWithName_size_CMetInst(){
		return ((fontWithName_size_CMetInst != null)
	? (fontWithName_size_CMetInst)
	: (fontWithName_size_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fontWithName:size:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont fontWithName_size(final com.apple.jobjc.foundation.NSString fontName, final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend fontWithName_size_CMetInst = get_fontWithName_size_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fontWithName_size_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		fontWithName_size_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend labelFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_labelFontOfSize_CMetInst(){
		return ((labelFontOfSize_CMetInst != null)
	? (labelFontOfSize_CMetInst)
	: (labelFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "labelFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont labelFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend labelFontOfSize_CMetInst = get_labelFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		labelFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		labelFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend labelFontSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_labelFontSize_CMetInst(){
		return ((labelFontSize_CMetInst != null)
	? (labelFontSize_CMetInst)
	: (labelFontSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "labelFontSize", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double labelFontSize(){
			final com.apple.jobjc.Invoke.MsgSend labelFontSize_CMetInst = get_labelFontSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		labelFontSize_CMetInst.init(nativeBuffer, this);
		labelFontSize_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuBarFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuBarFontOfSize_CMetInst(){
		return ((menuBarFontOfSize_CMetInst != null)
	? (menuBarFontOfSize_CMetInst)
	: (menuBarFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuBarFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont menuBarFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend menuBarFontOfSize_CMetInst = get_menuBarFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuBarFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		menuBarFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuFontOfSize_CMetInst(){
		return ((menuFontOfSize_CMetInst != null)
	? (menuFontOfSize_CMetInst)
	: (menuFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont menuFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend menuFontOfSize_CMetInst = get_menuFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		menuFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend messageFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_messageFontOfSize_CMetInst(){
		return ((messageFontOfSize_CMetInst != null)
	? (messageFontOfSize_CMetInst)
	: (messageFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "messageFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont messageFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend messageFontOfSize_CMetInst = get_messageFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		messageFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		messageFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paletteFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paletteFontOfSize_CMetInst(){
		return ((paletteFontOfSize_CMetInst != null)
	? (paletteFontOfSize_CMetInst)
	: (paletteFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paletteFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont paletteFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend paletteFontOfSize_CMetInst = get_paletteFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paletteFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		paletteFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredFontNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredFontNames_CMetInst(){
		return ((preferredFontNames_CMetInst != null)
	? (preferredFontNames_CMetInst)
	: (preferredFontNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredFontNames", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray preferredFontNames(){
			final com.apple.jobjc.Invoke.MsgSend preferredFontNames_CMetInst = get_preferredFontNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredFontNames_CMetInst.init(nativeBuffer, this);
		preferredFontNames_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredFontNames_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredFontNames_CMetInst(){
		return ((setPreferredFontNames_CMetInst != null)
	? (setPreferredFontNames_CMetInst)
	: (setPreferredFontNames_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredFontNames:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPreferredFontNames(final com.apple.jobjc.foundation.NSArray fontNameArray){
			final com.apple.jobjc.Invoke.MsgSend setPreferredFontNames_CMetInst = get_setPreferredFontNames_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredFontNames_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontNameArray);
		setPreferredFontNames_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUserFixedPitchFont_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUserFixedPitchFont_CMetInst(){
		return ((setUserFixedPitchFont_CMetInst != null)
	? (setUserFixedPitchFont_CMetInst)
	: (setUserFixedPitchFont_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUserFixedPitchFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setUserFixedPitchFont(final com.apple.jobjc.appkit.NSFont aFont){
			final com.apple.jobjc.Invoke.MsgSend setUserFixedPitchFont_CMetInst = get_setUserFixedPitchFont_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUserFixedPitchFont_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aFont);
		setUserFixedPitchFont_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUserFont_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUserFont_CMetInst(){
		return ((setUserFont_CMetInst != null)
	? (setUserFont_CMetInst)
	: (setUserFont_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUserFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setUserFont(final com.apple.jobjc.appkit.NSFont aFont){
			final com.apple.jobjc.Invoke.MsgSend setUserFont_CMetInst = get_setUserFont_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUserFont_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aFont);
		setUserFont_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend smallSystemFontSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_smallSystemFontSize_CMetInst(){
		return ((smallSystemFontSize_CMetInst != null)
	? (smallSystemFontSize_CMetInst)
	: (smallSystemFontSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "smallSystemFontSize", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double smallSystemFontSize(){
			final com.apple.jobjc.Invoke.MsgSend smallSystemFontSize_CMetInst = get_smallSystemFontSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		smallSystemFontSize_CMetInst.init(nativeBuffer, this);
		smallSystemFontSize_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemFontOfSize_CMetInst(){
		return ((systemFontOfSize_CMetInst != null)
	? (systemFontOfSize_CMetInst)
	: (systemFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont systemFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend systemFontOfSize_CMetInst = get_systemFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		systemFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemFontSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemFontSize_CMetInst(){
		return ((systemFontSize_CMetInst != null)
	? (systemFontSize_CMetInst)
	: (systemFontSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemFontSize", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double systemFontSize(){
			final com.apple.jobjc.Invoke.MsgSend systemFontSize_CMetInst = get_systemFontSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemFontSize_CMetInst.init(nativeBuffer, this);
		systemFontSize_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend systemFontSizeForControlSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemFontSizeForControlSize_CMetInst(){
		return ((systemFontSizeForControlSize_CMetInst != null)
	? (systemFontSizeForControlSize_CMetInst)
	: (systemFontSizeForControlSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemFontSizeForControlSize:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public double systemFontSizeForControlSize(final long controlSize){
			final com.apple.jobjc.Invoke.MsgSend systemFontSizeForControlSize_CMetInst = get_systemFontSizeForControlSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemFontSizeForControlSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, controlSize);
		systemFontSizeForControlSize_CMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleBarFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleBarFontOfSize_CMetInst(){
		return ((titleBarFontOfSize_CMetInst != null)
	? (titleBarFontOfSize_CMetInst)
	: (titleBarFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleBarFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont titleBarFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend titleBarFontOfSize_CMetInst = get_titleBarFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleBarFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		titleBarFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend toolTipsFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toolTipsFontOfSize_CMetInst(){
		return ((toolTipsFontOfSize_CMetInst != null)
	? (toolTipsFontOfSize_CMetInst)
	: (toolTipsFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toolTipsFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont toolTipsFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend toolTipsFontOfSize_CMetInst = get_toolTipsFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toolTipsFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		toolTipsFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend useFont_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_useFont_CMetInst(){
		return ((useFont_CMetInst != null)
	? (useFont_CMetInst)
	: (useFont_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "useFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void useFont(final com.apple.jobjc.foundation.NSString fontName){
			final com.apple.jobjc.Invoke.MsgSend useFont_CMetInst = get_useFont_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		useFont_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontName);
		useFont_CMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend userFixedPitchFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userFixedPitchFontOfSize_CMetInst(){
		return ((userFixedPitchFontOfSize_CMetInst != null)
	? (userFixedPitchFontOfSize_CMetInst)
	: (userFixedPitchFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userFixedPitchFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont userFixedPitchFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend userFixedPitchFontOfSize_CMetInst = get_userFixedPitchFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userFixedPitchFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		userFixedPitchFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend userFontOfSize_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_userFontOfSize_CMetInst(){
		return ((userFontOfSize_CMetInst != null)
	? (userFontOfSize_CMetInst)
	: (userFontOfSize_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "userFontOfSize:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public com.apple.jobjc.appkit.NSFont userFontOfSize(final double fontSize){
			final com.apple.jobjc.Invoke.MsgSend userFontOfSize_CMetInst = get_userFontOfSize_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		userFontOfSize_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, fontSize);
		userFontOfSize_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
