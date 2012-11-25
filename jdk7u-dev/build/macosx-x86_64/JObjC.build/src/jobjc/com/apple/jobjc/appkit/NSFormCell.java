package com.apple.jobjc.appkit;

public  class NSFormCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSFormCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFormCell(final NSFormCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributedTitle_IMetInst(){
		return ((attributedTitle_IMetInst != null)
	? (attributedTitle_IMetInst)
	: (attributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributedTitle", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString attributedTitle(){
			final com.apple.jobjc.Invoke.MsgSend attributedTitle_IMetInst = get_attributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributedTitle_IMetInst.init(nativeBuffer, this);
		attributedTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initTextCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initTextCell_IMetInst(){
		return ((initTextCell_IMetInst != null)
	? (initTextCell_IMetInst)
	: (initTextCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initTextCell:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initTextCell(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend initTextCell_IMetInst = get_initTextCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initTextCell_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		initTextCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isOpaque_IMetInst(){
		return ((isOpaque_IMetInst != null)
	? (isOpaque_IMetInst)
	: (isOpaque_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isOpaque", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isOpaque(){
			final com.apple.jobjc.Invoke.MsgSend isOpaque_IMetInst = get_isOpaque_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isOpaque_IMetInst.init(nativeBuffer, this);
		isOpaque_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend placeholderAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_placeholderAttributedString_IMetInst(){
		return ((placeholderAttributedString_IMetInst != null)
	? (placeholderAttributedString_IMetInst)
	: (placeholderAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "placeholderAttributedString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSAttributedString placeholderAttributedString(){
			final com.apple.jobjc.Invoke.MsgSend placeholderAttributedString_IMetInst = get_placeholderAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		placeholderAttributedString_IMetInst.init(nativeBuffer, this);
		placeholderAttributedString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSAttributedString returnValue = (com.apple.jobjc.foundation.NSAttributedString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend placeholderString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_placeholderString_IMetInst(){
		return ((placeholderString_IMetInst != null)
	? (placeholderString_IMetInst)
	: (placeholderString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "placeholderString", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString placeholderString(){
			final com.apple.jobjc.Invoke.MsgSend placeholderString_IMetInst = get_placeholderString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		placeholderString_IMetInst.init(nativeBuffer, this);
		placeholderString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend preferredTextFieldWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preferredTextFieldWidth_IMetInst(){
		return ((preferredTextFieldWidth_IMetInst != null)
	? (preferredTextFieldWidth_IMetInst)
	: (preferredTextFieldWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preferredTextFieldWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double preferredTextFieldWidth(){
			final com.apple.jobjc.Invoke.MsgSend preferredTextFieldWidth_IMetInst = get_preferredTextFieldWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preferredTextFieldWidth_IMetInst.init(nativeBuffer, this);
		preferredTextFieldWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributedTitle_IMetInst(){
		return ((setAttributedTitle_IMetInst != null)
	? (setAttributedTitle_IMetInst)
	: (setAttributedTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributedTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributedTitle(final com.apple.jobjc.foundation.NSAttributedString obj){
			final com.apple.jobjc.Invoke.MsgSend setAttributedTitle_IMetInst = get_setAttributedTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributedTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setAttributedTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlaceholderAttributedString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlaceholderAttributedString_IMetInst(){
		return ((setPlaceholderAttributedString_IMetInst != null)
	? (setPlaceholderAttributedString_IMetInst)
	: (setPlaceholderAttributedString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlaceholderAttributedString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlaceholderAttributedString(final com.apple.jobjc.foundation.NSAttributedString string){
			final com.apple.jobjc.Invoke.MsgSend setPlaceholderAttributedString_IMetInst = get_setPlaceholderAttributedString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlaceholderAttributedString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPlaceholderAttributedString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPlaceholderString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPlaceholderString_IMetInst(){
		return ((setPlaceholderString_IMetInst != null)
	? (setPlaceholderString_IMetInst)
	: (setPlaceholderString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPlaceholderString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPlaceholderString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setPlaceholderString_IMetInst = get_setPlaceholderString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPlaceholderString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setPlaceholderString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreferredTextFieldWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreferredTextFieldWidth_IMetInst(){
		return ((setPreferredTextFieldWidth_IMetInst != null)
	? (setPreferredTextFieldWidth_IMetInst)
	: (setPreferredTextFieldWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreferredTextFieldWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setPreferredTextFieldWidth(final double preferredWidth){
			final com.apple.jobjc.Invoke.MsgSend setPreferredTextFieldWidth_IMetInst = get_setPreferredTextFieldWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreferredTextFieldWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, preferredWidth);
		setPreferredTextFieldWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleAlignment_IMetInst(){
		return ((setTitleAlignment_IMetInst != null)
	? (setTitleAlignment_IMetInst)
	: (setTitleAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTitleAlignment(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setTitleAlignment_IMetInst = get_setTitleAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setTitleAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleBaseWritingDirection_IMetInst(){
		return ((setTitleBaseWritingDirection_IMetInst != null)
	? (setTitleBaseWritingDirection_IMetInst)
	: (setTitleBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleBaseWritingDirection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setTitleBaseWritingDirection(final long writingDirection){
			final com.apple.jobjc.Invoke.MsgSend setTitleBaseWritingDirection_IMetInst = get_setTitleBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, writingDirection);
		setTitleBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleFont_IMetInst(){
		return ((setTitleFont_IMetInst != null)
	? (setTitleFont_IMetInst)
	: (setTitleFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleFont(final com.apple.jobjc.appkit.NSFont fontObj){
			final com.apple.jobjc.Invoke.MsgSend setTitleFont_IMetInst = get_setTitleFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fontObj);
		setTitleFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWidth_IMetInst(){
		return ((setTitleWidth_IMetInst != null)
	? (setTitleWidth_IMetInst)
	: (setTitleWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setTitleWidth(final double width){
			final com.apple.jobjc.Invoke.MsgSend setTitleWidth_IMetInst = get_setTitleWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		setTitleWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitleWithMnemonic_IMetInst(){
		return ((setTitleWithMnemonic_IMetInst != null)
	? (setTitleWithMnemonic_IMetInst)
	: (setTitleWithMnemonic_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitleWithMnemonic:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitleWithMnemonic(final com.apple.jobjc.foundation.NSString stringWithAmpersand){
			final com.apple.jobjc.Invoke.MsgSend setTitleWithMnemonic_IMetInst = get_setTitleWithMnemonic_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitleWithMnemonic_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringWithAmpersand);
		setTitleWithMnemonic_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleAlignment_IMetInst(){
		return ((titleAlignment_IMetInst != null)
	? (titleAlignment_IMetInst)
	: (titleAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleAlignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long titleAlignment(){
			final com.apple.jobjc.Invoke.MsgSend titleAlignment_IMetInst = get_titleAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleAlignment_IMetInst.init(nativeBuffer, this);
		titleAlignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleBaseWritingDirection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleBaseWritingDirection_IMetInst(){
		return ((titleBaseWritingDirection_IMetInst != null)
	? (titleBaseWritingDirection_IMetInst)
	: (titleBaseWritingDirection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleBaseWritingDirection", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long titleBaseWritingDirection(){
			final com.apple.jobjc.Invoke.MsgSend titleBaseWritingDirection_IMetInst = get_titleBaseWritingDirection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleBaseWritingDirection_IMetInst.init(nativeBuffer, this);
		titleBaseWritingDirection_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleFont_IMetInst(){
		return ((titleFont_IMetInst != null)
	? (titleFont_IMetInst)
	: (titleFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleFont", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont titleFont(){
			final com.apple.jobjc.Invoke.MsgSend titleFont_IMetInst = get_titleFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleFont_IMetInst.init(nativeBuffer, this);
		titleFont_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleWidth_IMetInst(){
		return ((titleWidth_IMetInst != null)
	? (titleWidth_IMetInst)
	: (titleWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double titleWidth(){
			final com.apple.jobjc.Invoke.MsgSend titleWidth_IMetInst = get_titleWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleWidth_IMetInst.init(nativeBuffer, this);
		titleWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleWidthDouble_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleWidthDouble_IMetInst(){
		return ((titleWidthDouble_IMetInst != null)
	? (titleWidthDouble_IMetInst)
	: (titleWidthDouble_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleWidth:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public double titleWidthDouble(final com.apple.jobjc.foundation.NSSize aSize){
			final com.apple.jobjc.Invoke.MsgSend titleWidthDouble_IMetInst = get_titleWidthDouble_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleWidthDouble_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, aSize);
		titleWidthDouble_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
