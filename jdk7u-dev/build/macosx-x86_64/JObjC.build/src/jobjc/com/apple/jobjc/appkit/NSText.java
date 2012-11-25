package com.apple.jobjc.appkit;

public  class NSText extends com.apple.jobjc.appkit.NSView {
	public NSText(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSText(final NSText obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend RTFDFromRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_RTFDFromRange_IMetInst(){
		return ((RTFDFromRange_IMetInst != null)
	? (RTFDFromRange_IMetInst)
	: (RTFDFromRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "RTFDFromRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSData RTFDFromRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend RTFDFromRange_IMetInst = get_RTFDFromRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		RTFDFromRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		RTFDFromRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend RTFFromRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_RTFFromRange_IMetInst(){
		return ((RTFFromRange_IMetInst != null)
	? (RTFFromRange_IMetInst)
	: (RTFFromRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "RTFFromRange:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSData RTFFromRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend RTFFromRange_IMetInst = get_RTFFromRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		RTFFromRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		RTFFromRange_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alignCenter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignCenter_IMetInst(){
		return ((alignCenter_IMetInst != null)
	? (alignCenter_IMetInst)
	: (alignCenter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignCenter:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void alignCenter(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend alignCenter_IMetInst = get_alignCenter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignCenter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		alignCenter_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend alignLeft_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignLeft_IMetInst(){
		return ((alignLeft_IMetInst != null)
	? (alignLeft_IMetInst)
	: (alignLeft_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignLeft:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void alignLeft(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend alignLeft_IMetInst = get_alignLeft_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignLeft_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		alignLeft_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend alignRight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alignRight_IMetInst(){
		return ((alignRight_IMetInst != null)
	? (alignRight_IMetInst)
	: (alignRight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alignRight:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void alignRight(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend alignRight_IMetInst = get_alignRight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alignRight_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		alignRight_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend changeFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_changeFont_IMetInst(){
		return ((changeFont_IMetInst != null)
	? (changeFont_IMetInst)
	: (changeFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "changeFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void changeFont(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend changeFont_IMetInst = get_changeFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		changeFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		changeFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend checkSpelling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_checkSpelling_IMetInst(){
		return ((checkSpelling_IMetInst != null)
	? (checkSpelling_IMetInst)
	: (checkSpelling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "checkSpelling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void checkSpelling(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend checkSpelling_IMetInst = get_checkSpelling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		checkSpelling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		checkSpelling_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend copyVoid_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyVoid_IMetInst(){
		return ((copyVoid_IMetInst != null)
	? (copyVoid_IMetInst)
	: (copyVoid_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copy:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void copyVoid(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend copyVoid_IMetInst = get_copyVoid_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyVoid_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		copyVoid_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend copyFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyFont_IMetInst(){
		return ((copyFont_IMetInst != null)
	? (copyFont_IMetInst)
	: (copyFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void copyFont(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend copyFont_IMetInst = get_copyFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		copyFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend copyRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_copyRuler_IMetInst(){
		return ((copyRuler_IMetInst != null)
	? (copyRuler_IMetInst)
	: (copyRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "copyRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void copyRuler(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend copyRuler_IMetInst = get_copyRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		copyRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		copyRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cut_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cut_IMetInst(){
		return ((cut_IMetInst != null)
	? (cut_IMetInst)
	: (cut_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cut:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void cut(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend cut_IMetInst = get_cut_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cut_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		cut_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend delete_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delete_IMetInst(){
		return ((delete_IMetInst != null)
	? (delete_IMetInst)
	: (delete_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delete:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void delete(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend delete_IMetInst = get_delete_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delete_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		delete_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend font_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_font_IMetInst(){
		return ((font_IMetInst != null)
	? (font_IMetInst)
	: (font_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "font", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont font(){
			final com.apple.jobjc.Invoke.MsgSend font_IMetInst = get_font_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		font_IMetInst.init(nativeBuffer, this);
		font_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_importsGraphics_IMetInst(){
		return ((importsGraphics_IMetInst != null)
	? (importsGraphics_IMetInst)
	: (importsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "importsGraphics", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean importsGraphics(){
			final com.apple.jobjc.Invoke.MsgSend importsGraphics_IMetInst = get_importsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		importsGraphics_IMetInst.init(nativeBuffer, this);
		importsGraphics_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isFieldEditor_IMetInst(){
		return ((isFieldEditor_IMetInst != null)
	? (isFieldEditor_IMetInst)
	: (isFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isFieldEditor", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isFieldEditor(){
			final com.apple.jobjc.Invoke.MsgSend isFieldEditor_IMetInst = get_isFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isFieldEditor_IMetInst.init(nativeBuffer, this);
		isFieldEditor_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isHorizontallyResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isHorizontallyResizable_IMetInst(){
		return ((isHorizontallyResizable_IMetInst != null)
	? (isHorizontallyResizable_IMetInst)
	: (isHorizontallyResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isHorizontallyResizable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isHorizontallyResizable(){
			final com.apple.jobjc.Invoke.MsgSend isHorizontallyResizable_IMetInst = get_isHorizontallyResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isHorizontallyResizable_IMetInst.init(nativeBuffer, this);
		isHorizontallyResizable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRichText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRichText_IMetInst(){
		return ((isRichText_IMetInst != null)
	? (isRichText_IMetInst)
	: (isRichText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRichText", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRichText(){
			final com.apple.jobjc.Invoke.MsgSend isRichText_IMetInst = get_isRichText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRichText_IMetInst.init(nativeBuffer, this);
		isRichText_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isRulerVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isRulerVisible_IMetInst(){
		return ((isRulerVisible_IMetInst != null)
	? (isRulerVisible_IMetInst)
	: (isRulerVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isRulerVisible", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isRulerVisible(){
			final com.apple.jobjc.Invoke.MsgSend isRulerVisible_IMetInst = get_isRulerVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isRulerVisible_IMetInst.init(nativeBuffer, this);
		isRulerVisible_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectable_IMetInst(){
		return ((isSelectable_IMetInst != null)
	? (isSelectable_IMetInst)
	: (isSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelectable(){
			final com.apple.jobjc.Invoke.MsgSend isSelectable_IMetInst = get_isSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectable_IMetInst.init(nativeBuffer, this);
		isSelectable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isVerticallyResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isVerticallyResizable_IMetInst(){
		return ((isVerticallyResizable_IMetInst != null)
	? (isVerticallyResizable_IMetInst)
	: (isVerticallyResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isVerticallyResizable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isVerticallyResizable(){
			final com.apple.jobjc.Invoke.MsgSend isVerticallyResizable_IMetInst = get_isVerticallyResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isVerticallyResizable_IMetInst.init(nativeBuffer, this);
		isVerticallyResizable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend maxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_maxSize_IMetInst(){
		return ((maxSize_IMetInst != null)
	? (maxSize_IMetInst)
	: (maxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "maxSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize maxSize(){
			final com.apple.jobjc.Invoke.MsgSend maxSize_IMetInst = get_maxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		maxSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		maxSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minSize_IMetInst(){
		return ((minSize_IMetInst != null)
	? (minSize_IMetInst)
	: (minSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minSize(){
			final com.apple.jobjc.Invoke.MsgSend minSize_IMetInst = get_minSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend paste_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_paste_IMetInst(){
		return ((paste_IMetInst != null)
	? (paste_IMetInst)
	: (paste_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "paste:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void paste(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend paste_IMetInst = get_paste_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		paste_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		paste_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteFont_IMetInst(){
		return ((pasteFont_IMetInst != null)
	? (pasteFont_IMetInst)
	: (pasteFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteFont(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pasteFont_IMetInst = get_pasteFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pasteFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend pasteRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_pasteRuler_IMetInst(){
		return ((pasteRuler_IMetInst != null)
	? (pasteRuler_IMetInst)
	: (pasteRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "pasteRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void pasteRuler(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend pasteRuler_IMetInst = get_pasteRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		pasteRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		pasteRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend readRTFDFromFile_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_readRTFDFromFile_IMetInst(){
		return ((readRTFDFromFile_IMetInst != null)
	? (readRTFDFromFile_IMetInst)
	: (readRTFDFromFile_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "readRTFDFromFile:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean readRTFDFromFile(final com.apple.jobjc.foundation.NSString path){
			final com.apple.jobjc.Invoke.MsgSend readRTFDFromFile_IMetInst = get_readRTFDFromFile_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		readRTFDFromFile_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		readRTFDFromFile_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withRTF_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withRTF_IMetInst(){
		return ((replaceCharactersInRange_withRTF_IMetInst != null)
	? (replaceCharactersInRange_withRTF_IMetInst)
	: (replaceCharactersInRange_withRTF_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withRTF:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withRTF(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSData rtfData){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withRTF_IMetInst = get_replaceCharactersInRange_withRTF_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withRTF_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rtfData);
		replaceCharactersInRange_withRTF_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withRTFD_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withRTFD_IMetInst(){
		return ((replaceCharactersInRange_withRTFD_IMetInst != null)
	? (replaceCharactersInRange_withRTFD_IMetInst)
	: (replaceCharactersInRange_withRTFD_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withRTFD:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withRTFD(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSData rtfdData){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withRTFD_IMetInst = get_replaceCharactersInRange_withRTFD_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withRTFD_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, rtfdData);
		replaceCharactersInRange_withRTFD_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceCharactersInRange_withString_IMetInst(){
		return ((replaceCharactersInRange_withString_IMetInst != null)
	? (replaceCharactersInRange_withString_IMetInst)
	: (replaceCharactersInRange_withString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceCharactersInRange:withString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceCharactersInRange_withString(final com.apple.jobjc.foundation.NSRange range, final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend replaceCharactersInRange_withString_IMetInst = get_replaceCharactersInRange_withString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceCharactersInRange_withString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		replaceCharactersInRange_withString_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend scrollRangeToVisible_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_scrollRangeToVisible_IMetInst(){
		return ((scrollRangeToVisible_IMetInst != null)
	? (scrollRangeToVisible_IMetInst)
	: (scrollRangeToVisible_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "scrollRangeToVisible:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void scrollRangeToVisible(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend scrollRangeToVisible_IMetInst = get_scrollRangeToVisible_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		scrollRangeToVisible_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		scrollRangeToVisible_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectAll_IMetInst(){
		return ((selectAll_IMetInst != null)
	? (selectAll_IMetInst)
	: (selectAll_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectAll:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void selectAll(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend selectAll_IMetInst = get_selectAll_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectAll_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		selectAll_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedRange_IMetInst(){
		return ((selectedRange_IMetInst != null)
	? (selectedRange_IMetInst)
	: (selectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedRange", com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRange selectedRange(){
			final com.apple.jobjc.Invoke.MsgSend selectedRange_IMetInst = get_selectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedRange_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRange returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRange();
		selectedRange_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlignment_IMetInst(){
		return ((setAlignment_IMetInst != null)
	? (setAlignment_IMetInst)
	: (setAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setAlignment(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setAlignment_IMetInst = get_setAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mode);
		setAlignment_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFieldEditor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFieldEditor_IMetInst(){
		return ((setFieldEditor_IMetInst != null)
	? (setFieldEditor_IMetInst)
	: (setFieldEditor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFieldEditor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setFieldEditor(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setFieldEditor_IMetInst = get_setFieldEditor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFieldEditor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setFieldEditor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont obj){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, obj);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFont_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_range_IMetInst(){
		return ((setFont_range_IMetInst != null)
	? (setFont_range_IMetInst)
	: (setFont_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setFont_range(final com.apple.jobjc.appkit.NSFont font, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setFont_range_IMetInst = get_setFont_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setFont_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setHorizontallyResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setHorizontallyResizable_IMetInst(){
		return ((setHorizontallyResizable_IMetInst != null)
	? (setHorizontallyResizable_IMetInst)
	: (setHorizontallyResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setHorizontallyResizable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setHorizontallyResizable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setHorizontallyResizable_IMetInst = get_setHorizontallyResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setHorizontallyResizable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setHorizontallyResizable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImportsGraphics_IMetInst(){
		return ((setImportsGraphics_IMetInst != null)
	? (setImportsGraphics_IMetInst)
	: (setImportsGraphics_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImportsGraphics:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setImportsGraphics(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setImportsGraphics_IMetInst = get_setImportsGraphics_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImportsGraphics_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setImportsGraphics_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMaxSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMaxSize_IMetInst(){
		return ((setMaxSize_IMetInst != null)
	? (setMaxSize_IMetInst)
	: (setMaxSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMaxSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMaxSize(final com.apple.jobjc.foundation.NSSize newMaxSize){
			final com.apple.jobjc.Invoke.MsgSend setMaxSize_IMetInst = get_setMaxSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMaxSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newMaxSize);
		setMaxSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinSize_IMetInst(){
		return ((setMinSize_IMetInst != null)
	? (setMinSize_IMetInst)
	: (setMinSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinSize:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setMinSize(final com.apple.jobjc.foundation.NSSize newMinSize){
			final com.apple.jobjc.Invoke.MsgSend setMinSize_IMetInst = get_setMinSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinSize_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, newMinSize);
		setMinSize_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRichText_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRichText_IMetInst(){
		return ((setRichText_IMetInst != null)
	? (setRichText_IMetInst)
	: (setRichText_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRichText:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setRichText(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setRichText_IMetInst = get_setRichText_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRichText_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setRichText_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectable_IMetInst(){
		return ((setSelectable_IMetInst != null)
	? (setSelectable_IMetInst)
	: (setSelectable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectable_IMetInst = get_setSelectable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedRange_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedRange_IMetInst(){
		return ((setSelectedRange_IMetInst != null)
	? (setSelectedRange_IMetInst)
	: (setSelectedRange_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedRange:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setSelectedRange(final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setSelectedRange_IMetInst = get_setSelectedRange_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedRange_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setSelectedRange_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setString_IMetInst(){
		return ((setString_IMetInst != null)
	? (setString_IMetInst)
	: (setString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setString:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend setString_IMetInst = get_setString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setString_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		setString_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTextColor_range_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextColor_range_IMetInst(){
		return ((setTextColor_range_IMetInst != null)
	? (setTextColor_range_IMetInst)
	: (setTextColor_range_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextColor:range:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSRange.getStructCoder())));
	}

	 public void setTextColor_range(final com.apple.jobjc.appkit.NSColor color, final com.apple.jobjc.foundation.NSRange range){
			final com.apple.jobjc.Invoke.MsgSend setTextColor_range_IMetInst = get_setTextColor_range_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextColor_range_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, color);
		com.apple.jobjc.foundation.NSRange.getStructCoder().push(nativeBuffer, range);
		setTextColor_range_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesFontPanel_IMetInst(){
		return ((setUsesFontPanel_IMetInst != null)
	? (setUsesFontPanel_IMetInst)
	: (setUsesFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesFontPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesFontPanel(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setUsesFontPanel_IMetInst = get_setUsesFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesFontPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setUsesFontPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVerticallyResizable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVerticallyResizable_IMetInst(){
		return ((setVerticallyResizable_IMetInst != null)
	? (setVerticallyResizable_IMetInst)
	: (setVerticallyResizable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVerticallyResizable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setVerticallyResizable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setVerticallyResizable_IMetInst = get_setVerticallyResizable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVerticallyResizable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setVerticallyResizable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showGuessPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showGuessPanel_IMetInst(){
		return ((showGuessPanel_IMetInst != null)
	? (showGuessPanel_IMetInst)
	: (showGuessPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showGuessPanel:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void showGuessPanel(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend showGuessPanel_IMetInst = get_showGuessPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showGuessPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		showGuessPanel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeToFit_IMetInst(){
		return ((sizeToFit_IMetInst != null)
	? (sizeToFit_IMetInst)
	: (sizeToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeToFit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeToFit(){
			final com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst = get_sizeToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeToFit_IMetInst.init(nativeBuffer, this);
		sizeToFit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend string_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_string_IMetInst(){
		return ((string_IMetInst != null)
	? (string_IMetInst)
	: (string_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "string", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString string(){
			final com.apple.jobjc.Invoke.MsgSend string_IMetInst = get_string_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		string_IMetInst.init(nativeBuffer, this);
		string_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend subscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_subscript_IMetInst(){
		return ((subscript_IMetInst != null)
	? (subscript_IMetInst)
	: (subscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "subscript:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void subscript(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend subscript_IMetInst = get_subscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		subscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		subscript_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend superscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_superscript_IMetInst(){
		return ((superscript_IMetInst != null)
	? (superscript_IMetInst)
	: (superscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "superscript:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void superscript(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend superscript_IMetInst = get_superscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		superscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		superscript_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend toggleRuler_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_toggleRuler_IMetInst(){
		return ((toggleRuler_IMetInst != null)
	? (toggleRuler_IMetInst)
	: (toggleRuler_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "toggleRuler:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void toggleRuler(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend toggleRuler_IMetInst = get_toggleRuler_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		toggleRuler_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		toggleRuler_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend underline_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_underline_IMetInst(){
		return ((underline_IMetInst != null)
	? (underline_IMetInst)
	: (underline_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "underline:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void underline(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend underline_IMetInst = get_underline_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		underline_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		underline_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend unscript_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_unscript_IMetInst(){
		return ((unscript_IMetInst != null)
	? (unscript_IMetInst)
	: (unscript_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "unscript:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void unscript(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend unscript_IMetInst = get_unscript_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		unscript_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		unscript_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesFontPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesFontPanel_IMetInst(){
		return ((usesFontPanel_IMetInst != null)
	? (usesFontPanel_IMetInst)
	: (usesFontPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesFontPanel", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesFontPanel(){
			final com.apple.jobjc.Invoke.MsgSend usesFontPanel_IMetInst = get_usesFontPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesFontPanel_IMetInst.init(nativeBuffer, this);
		usesFontPanel_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend writeRTFDToFile_atomically_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_writeRTFDToFile_atomically_IMetInst(){
		return ((writeRTFDToFile_atomically_IMetInst != null)
	? (writeRTFDToFile_atomically_IMetInst)
	: (writeRTFDToFile_atomically_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "writeRTFDToFile:atomically:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean writeRTFDToFile_atomically(final com.apple.jobjc.foundation.NSString path, final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend writeRTFDToFile_atomically_IMetInst = get_writeRTFDToFile_atomically_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		writeRTFDToFile_atomically_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, path);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		writeRTFDToFile_atomically_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
