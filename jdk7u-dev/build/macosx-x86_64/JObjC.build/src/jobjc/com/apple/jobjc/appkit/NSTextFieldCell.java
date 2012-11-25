package com.apple.jobjc.appkit;

public  class NSTextFieldCell extends com.apple.jobjc.appkit.NSActionCell {
	public NSTextFieldCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTextFieldCell(final NSTextFieldCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowedInputSourceLocales_IMetInst(){
		return ((allowedInputSourceLocales_IMetInst != null)
	? (allowedInputSourceLocales_IMetInst)
	: (allowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowedInputSourceLocales", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray allowedInputSourceLocales(){
			final com.apple.jobjc.Invoke.MsgSend allowedInputSourceLocales_IMetInst = get_allowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		allowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundColor_IMetInst(){
		return ((backgroundColor_IMetInst != null)
	? (backgroundColor_IMetInst)
	: (backgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor backgroundColor(){
			final com.apple.jobjc.Invoke.MsgSend backgroundColor_IMetInst = get_backgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundColor_IMetInst.init(nativeBuffer, this);
		backgroundColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_bezelStyle_IMetInst(){
		return ((bezelStyle_IMetInst != null)
	? (bezelStyle_IMetInst)
	: (bezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "bezelStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long bezelStyle(){
			final com.apple.jobjc.Invoke.MsgSend bezelStyle_IMetInst = get_bezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		bezelStyle_IMetInst.init(nativeBuffer, this);
		bezelStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_drawsBackground_IMetInst(){
		return ((drawsBackground_IMetInst != null)
	? (drawsBackground_IMetInst)
	: (drawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "drawsBackground", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean drawsBackground(){
			final com.apple.jobjc.Invoke.MsgSend drawsBackground_IMetInst = get_drawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		drawsBackground_IMetInst.init(nativeBuffer, this);
		drawsBackground_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowedInputSourceLocales_IMetInst(){
		return ((setAllowedInputSourceLocales_IMetInst != null)
	? (setAllowedInputSourceLocales_IMetInst)
	: (setAllowedInputSourceLocales_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowedInputSourceLocales:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAllowedInputSourceLocales(final com.apple.jobjc.foundation.NSArray localeIdentifiers){
			final com.apple.jobjc.Invoke.MsgSend setAllowedInputSourceLocales_IMetInst = get_setAllowedInputSourceLocales_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowedInputSourceLocales_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localeIdentifiers);
		setAllowedInputSourceLocales_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundColor_IMetInst(){
		return ((setBackgroundColor_IMetInst != null)
	? (setBackgroundColor_IMetInst)
	: (setBackgroundColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBackgroundColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundColor_IMetInst = get_setBackgroundColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setBackgroundColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBezelStyle_IMetInst(){
		return ((setBezelStyle_IMetInst != null)
	? (setBezelStyle_IMetInst)
	: (setBezelStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBezelStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBezelStyle(final long style){
			final com.apple.jobjc.Invoke.MsgSend setBezelStyle_IMetInst = get_setBezelStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBezelStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, style);
		setBezelStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDrawsBackground_IMetInst(){
		return ((setDrawsBackground_IMetInst != null)
	? (setDrawsBackground_IMetInst)
	: (setDrawsBackground_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDrawsBackground:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setDrawsBackground(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setDrawsBackground_IMetInst = get_setDrawsBackground_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDrawsBackground_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setDrawsBackground_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextColor_IMetInst(){
		return ((setTextColor_IMetInst != null)
	? (setTextColor_IMetInst)
	: (setTextColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextColor(final com.apple.jobjc.appkit.NSColor color){
			final com.apple.jobjc.Invoke.MsgSend setTextColor_IMetInst = get_setTextColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		setTextColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUpFieldEditorAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUpFieldEditorAttributes_IMetInst(){
		return ((setUpFieldEditorAttributes_IMetInst != null)
	? (setUpFieldEditorAttributes_IMetInst)
	: (setUpFieldEditorAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUpFieldEditorAttributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSText setUpFieldEditorAttributes(final com.apple.jobjc.appkit.NSText textObj){
			final com.apple.jobjc.Invoke.MsgSend setUpFieldEditorAttributes_IMetInst = get_setUpFieldEditorAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUpFieldEditorAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textObj);
		setUpFieldEditorAttributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSText returnValue = (com.apple.jobjc.appkit.NSText) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setWantsNotificationForMarkedText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWantsNotificationForMarkedText_IMetInst(){
		return ((setWantsNotificationForMarkedText_IMetInst != null)
	? (setWantsNotificationForMarkedText_IMetInst)
	: (setWantsNotificationForMarkedText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWantsNotificationForMarkedText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setWantsNotificationForMarkedText(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setWantsNotificationForMarkedText_IMetInst = get_setWantsNotificationForMarkedText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWantsNotificationForMarkedText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setWantsNotificationForMarkedText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textColor_IMetInst(){
		return ((textColor_IMetInst != null)
	? (textColor_IMetInst)
	: (textColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor textColor(){
			final com.apple.jobjc.Invoke.MsgSend textColor_IMetInst = get_textColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textColor_IMetInst.init(nativeBuffer, this);
		textColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
