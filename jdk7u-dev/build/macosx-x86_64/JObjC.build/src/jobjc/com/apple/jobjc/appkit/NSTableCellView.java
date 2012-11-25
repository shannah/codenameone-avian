package com.apple.jobjc.appkit;

public  class NSTableCellView extends com.apple.jobjc.appkit.NSView {
	public NSTableCellView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTableCellView(final NSTableCellView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend backgroundStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_backgroundStyle_IMetInst(){
		return ((backgroundStyle_IMetInst != null)
	? (backgroundStyle_IMetInst)
	: (backgroundStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "backgroundStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long backgroundStyle(){
			final com.apple.jobjc.Invoke.MsgSend backgroundStyle_IMetInst = get_backgroundStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		backgroundStyle_IMetInst.init(nativeBuffer, this);
		backgroundStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend draggingImageComponents_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_draggingImageComponents_IMetInst(){
		return ((draggingImageComponents_IMetInst != null)
	? (draggingImageComponents_IMetInst)
	: (draggingImageComponents_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "draggingImageComponents", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray draggingImageComponents(){
			final com.apple.jobjc.Invoke.MsgSend draggingImageComponents_IMetInst = get_draggingImageComponents_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		draggingImageComponents_IMetInst.init(nativeBuffer, this);
		draggingImageComponents_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageView_IMetInst(){
		return ((imageView_IMetInst != null)
	? (imageView_IMetInst)
	: (imageView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImageView imageView(){
			final com.apple.jobjc.Invoke.MsgSend imageView_IMetInst = get_imageView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageView_IMetInst.init(nativeBuffer, this);
		imageView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImageView returnValue = (com.apple.jobjc.appkit.NSImageView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectValue_IMetInst(){
		return ((objectValue_IMetInst != null)
	? (objectValue_IMetInst)
	: (objectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectValue", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectValue(){
			final com.apple.jobjc.Invoke.MsgSend objectValue_IMetInst = get_objectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectValue_IMetInst.init(nativeBuffer, this);
		objectValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rowSizeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rowSizeStyle_IMetInst(){
		return ((rowSizeStyle_IMetInst != null)
	? (rowSizeStyle_IMetInst)
	: (rowSizeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rowSizeStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long rowSizeStyle(){
			final com.apple.jobjc.Invoke.MsgSend rowSizeStyle_IMetInst = get_rowSizeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rowSizeStyle_IMetInst.init(nativeBuffer, this);
		rowSizeStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setBackgroundStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setBackgroundStyle_IMetInst(){
		return ((setBackgroundStyle_IMetInst != null)
	? (setBackgroundStyle_IMetInst)
	: (setBackgroundStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setBackgroundStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setBackgroundStyle(final long backgroundStyle){
			final com.apple.jobjc.Invoke.MsgSend setBackgroundStyle_IMetInst = get_setBackgroundStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setBackgroundStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, backgroundStyle);
		setBackgroundStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageView_IMetInst(){
		return ((setImageView_IMetInst != null)
	? (setImageView_IMetInst)
	: (setImageView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageView:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImageView(final com.apple.jobjc.appkit.NSImageView imageView){
			final com.apple.jobjc.Invoke.MsgSend setImageView_IMetInst = get_setImageView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, imageView);
		setImageView_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectValue_IMetInst(){
		return ((setObjectValue_IMetInst != null)
	? (setObjectValue_IMetInst)
	: (setObjectValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectValue:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setObjectValue(final com.apple.jobjc.ID objectValue){
			final com.apple.jobjc.Invoke.MsgSend setObjectValue_IMetInst = get_setObjectValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objectValue);
		setObjectValue_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRowSizeStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRowSizeStyle_IMetInst(){
		return ((setRowSizeStyle_IMetInst != null)
	? (setRowSizeStyle_IMetInst)
	: (setRowSizeStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRowSizeStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setRowSizeStyle(final long rowSizeStyle){
			final com.apple.jobjc.Invoke.MsgSend setRowSizeStyle_IMetInst = get_setRowSizeStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRowSizeStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, rowSizeStyle);
		setRowSizeStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTextField_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTextField_IMetInst(){
		return ((setTextField_IMetInst != null)
	? (setTextField_IMetInst)
	: (setTextField_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTextField:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTextField(final com.apple.jobjc.appkit.NSTextField textField){
			final com.apple.jobjc.Invoke.MsgSend setTextField_IMetInst = get_setTextField_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTextField_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, textField);
		setTextField_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend textField_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textField_IMetInst(){
		return ((textField_IMetInst != null)
	? (textField_IMetInst)
	: (textField_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textField", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTextField textField(){
			final com.apple.jobjc.Invoke.MsgSend textField_IMetInst = get_textField_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textField_IMetInst.init(nativeBuffer, this);
		textField_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTextField returnValue = (com.apple.jobjc.appkit.NSTextField) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
