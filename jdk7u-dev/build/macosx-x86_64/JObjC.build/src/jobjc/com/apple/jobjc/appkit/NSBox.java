package com.apple.jobjc.appkit;

public  class NSBox extends com.apple.jobjc.appkit.NSView {
	public NSBox(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSBox(final NSBox obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend borderColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderColor_IMetInst(){
		return ((borderColor_IMetInst != null)
	? (borderColor_IMetInst)
	: (borderColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor borderColor(){
			final com.apple.jobjc.Invoke.MsgSend borderColor_IMetInst = get_borderColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderColor_IMetInst.init(nativeBuffer, this);
		borderColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend borderRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderRect_IMetInst(){
		return ((borderRect_IMetInst != null)
	? (borderRect_IMetInst)
	: (borderRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect borderRect(){
			final com.apple.jobjc.Invoke.MsgSend borderRect_IMetInst = get_borderRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		borderRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend borderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderType_IMetInst(){
		return ((borderType_IMetInst != null)
	? (borderType_IMetInst)
	: (borderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long borderType(){
			final com.apple.jobjc.Invoke.MsgSend borderType_IMetInst = get_borderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderType_IMetInst.init(nativeBuffer, this);
		borderType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend borderWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_borderWidth_IMetInst(){
		return ((borderWidth_IMetInst != null)
	? (borderWidth_IMetInst)
	: (borderWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "borderWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double borderWidth(){
			final com.apple.jobjc.Invoke.MsgSend borderWidth_IMetInst = get_borderWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		borderWidth_IMetInst.init(nativeBuffer, this);
		borderWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend boxType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_boxType_IMetInst(){
		return ((boxType_IMetInst != null)
	? (boxType_IMetInst)
	: (boxType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "boxType", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long boxType(){
			final com.apple.jobjc.Invoke.MsgSend boxType_IMetInst = get_boxType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		boxType_IMetInst.init(nativeBuffer, this);
		boxType_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentView_IMetInst(){
		return ((contentView_IMetInst != null)
	? (contentView_IMetInst)
	: (contentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T contentView(){
			final com.apple.jobjc.Invoke.MsgSend contentView_IMetInst = get_contentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentView_IMetInst.init(nativeBuffer, this);
		contentView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend contentViewMargins_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contentViewMargins_IMetInst(){
		return ((contentViewMargins_IMetInst != null)
	? (contentViewMargins_IMetInst)
	: (contentViewMargins_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contentViewMargins", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize contentViewMargins(){
			final com.apple.jobjc.Invoke.MsgSend contentViewMargins_IMetInst = get_contentViewMargins_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contentViewMargins_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		contentViewMargins_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cornerRadius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cornerRadius_IMetInst(){
		return ((cornerRadius_IMetInst != null)
	? (cornerRadius_IMetInst)
	: (cornerRadius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cornerRadius", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double cornerRadius(){
			final com.apple.jobjc.Invoke.MsgSend cornerRadius_IMetInst = get_cornerRadius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cornerRadius_IMetInst.init(nativeBuffer, this);
		cornerRadius_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fillColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fillColor_IMetInst(){
		return ((fillColor_IMetInst != null)
	? (fillColor_IMetInst)
	: (fillColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fillColor", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColor fillColor(){
			final com.apple.jobjc.Invoke.MsgSend fillColor_IMetInst = get_fillColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fillColor_IMetInst.init(nativeBuffer, this);
		fillColor_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColor returnValue = (com.apple.jobjc.appkit.NSColor) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTransparent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTransparent_IMetInst(){
		return ((isTransparent_IMetInst != null)
	? (isTransparent_IMetInst)
	: (isTransparent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTransparent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTransparent(){
			final com.apple.jobjc.Invoke.MsgSend isTransparent_IMetInst = get_isTransparent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTransparent_IMetInst.init(nativeBuffer, this);
		isTransparent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBorderColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderColor_IMetInst(){
		return ((setBorderColor_IMetInst != null)
	? (setBorderColor_IMetInst)
	: (setBorderColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setBorderColor(final com.apple.jobjc.appkit.NSColor borderColor){
			final com.apple.jobjc.Invoke.MsgSend setBorderColor_IMetInst = get_setBorderColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, borderColor);
		setBorderColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBorderType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderType_IMetInst(){
		return ((setBorderType_IMetInst != null)
	? (setBorderType_IMetInst)
	: (setBorderType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBorderType(final long aType){
			final com.apple.jobjc.Invoke.MsgSend setBorderType_IMetInst = get_setBorderType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aType);
		setBorderType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBorderWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBorderWidth_IMetInst(){
		return ((setBorderWidth_IMetInst != null)
	? (setBorderWidth_IMetInst)
	: (setBorderWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBorderWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setBorderWidth(final double borderWidth){
			final com.apple.jobjc.Invoke.MsgSend setBorderWidth_IMetInst = get_setBorderWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBorderWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, borderWidth);
		setBorderWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setBoxType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBoxType_IMetInst(){
		return ((setBoxType_IMetInst != null)
	? (setBoxType_IMetInst)
	: (setBoxType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBoxType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setBoxType(final long boxType){
			final com.apple.jobjc.Invoke.MsgSend setBoxType_IMetInst = get_setBoxType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBoxType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, boxType);
		setBoxType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentView_IMetInst(){
		return ((setContentView_IMetInst != null)
	? (setContentView_IMetInst)
	: (setContentView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContentView(final com.apple.jobjc.appkit.NSView aView){
			final com.apple.jobjc.Invoke.MsgSend setContentView_IMetInst = get_setContentView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aView);
		setContentView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContentViewMargins_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContentViewMargins_IMetInst(){
		return ((setContentViewMargins_IMetInst != null)
	? (setContentViewMargins_IMetInst)
	: (setContentViewMargins_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContentViewMargins:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public void setContentViewMargins(final com.apple.jobjc.foundation.NSSize offsetSize){
			final com.apple.jobjc.Invoke.MsgSend setContentViewMargins_IMetInst = get_setContentViewMargins_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContentViewMargins_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSSize.getStructCoder().push(nativeBuffer, offsetSize);
		setContentViewMargins_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCornerRadius_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCornerRadius_IMetInst(){
		return ((setCornerRadius_IMetInst != null)
	? (setCornerRadius_IMetInst)
	: (setCornerRadius_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCornerRadius:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setCornerRadius(final double cornerRadius){
			final com.apple.jobjc.Invoke.MsgSend setCornerRadius_IMetInst = get_setCornerRadius_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCornerRadius_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, cornerRadius);
		setCornerRadius_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFillColor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFillColor_IMetInst(){
		return ((setFillColor_IMetInst != null)
	? (setFillColor_IMetInst)
	: (setFillColor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFillColor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFillColor(final com.apple.jobjc.appkit.NSColor fillColor){
			final com.apple.jobjc.Invoke.MsgSend setFillColor_IMetInst = get_setFillColor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFillColor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, fillColor);
		setFillColor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFrameFromContentFrame_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFrameFromContentFrame_IMetInst(){
		return ((setFrameFromContentFrame_IMetInst != null)
	? (setFrameFromContentFrame_IMetInst)
	: (setFrameFromContentFrame_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFrameFromContentFrame:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public void setFrameFromContentFrame(final com.apple.jobjc.foundation.NSRect contentFrame){
			final com.apple.jobjc.Invoke.MsgSend setFrameFromContentFrame_IMetInst = get_setFrameFromContentFrame_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFrameFromContentFrame_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.foundation.NSRect.getStructCoder().push(nativeBuffer, contentFrame);
		setFrameFromContentFrame_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTitlePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitlePosition_IMetInst(){
		return ((setTitlePosition_IMetInst != null)
	? (setTitlePosition_IMetInst)
	: (setTitlePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitlePosition:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setTitlePosition(final long aPosition){
			final com.apple.jobjc.Invoke.MsgSend setTitlePosition_IMetInst = get_setTitlePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitlePosition_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, aPosition);
		setTitlePosition_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setTransparent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTransparent_IMetInst(){
		return ((setTransparent_IMetInst != null)
	? (setTransparent_IMetInst)
	: (setTransparent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTransparent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setTransparent(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setTransparent_IMetInst = get_setTransparent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTransparent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setTransparent_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend titleCell_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleCell_IMetInst(){
		return ((titleCell_IMetInst != null)
	? (titleCell_IMetInst)
	: (titleCell_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleCell", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T titleCell(){
			final com.apple.jobjc.Invoke.MsgSend titleCell_IMetInst = get_titleCell_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleCell_IMetInst.init(nativeBuffer, this);
		titleCell_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend titlePosition_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titlePosition_IMetInst(){
		return ((titlePosition_IMetInst != null)
	? (titlePosition_IMetInst)
	: (titlePosition_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titlePosition", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long titlePosition(){
			final com.apple.jobjc.Invoke.MsgSend titlePosition_IMetInst = get_titlePosition_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titlePosition_IMetInst.init(nativeBuffer, this);
		titlePosition_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend titleRect_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_titleRect_IMetInst(){
		return ((titleRect_IMetInst != null)
	? (titleRect_IMetInst)
	: (titleRect_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "titleRect", com.apple.jobjc.foundation.NSRect.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSRect titleRect(){
			final com.apple.jobjc.Invoke.MsgSend titleRect_IMetInst = get_titleRect_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		titleRect_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSRect returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSRect();
		titleRect_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

}
