package com.apple.jobjc.appkit;

public  class NSImageView extends com.apple.jobjc.appkit.NSControl {
	public NSImageView(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSImageView(final NSImageView obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend allowsCutCopyPaste_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsCutCopyPaste_IMetInst(){
		return ((allowsCutCopyPaste_IMetInst != null)
	? (allowsCutCopyPaste_IMetInst)
	: (allowsCutCopyPaste_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsCutCopyPaste", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsCutCopyPaste(){
			final com.apple.jobjc.Invoke.MsgSend allowsCutCopyPaste_IMetInst = get_allowsCutCopyPaste_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsCutCopyPaste_IMetInst.init(nativeBuffer, this);
		allowsCutCopyPaste_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend animates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_animates_IMetInst(){
		return ((animates_IMetInst != null)
	? (animates_IMetInst)
	: (animates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "animates", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean animates(){
			final com.apple.jobjc.Invoke.MsgSend animates_IMetInst = get_animates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		animates_IMetInst.init(nativeBuffer, this);
		animates_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend image_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_image_IMetInst(){
		return ((image_IMetInst != null)
	? (image_IMetInst)
	: (image_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "image", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage image(){
			final com.apple.jobjc.Invoke.MsgSend image_IMetInst = get_image_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		image_IMetInst.init(nativeBuffer, this);
		image_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageAlignment_IMetInst(){
		return ((imageAlignment_IMetInst != null)
	? (imageAlignment_IMetInst)
	: (imageAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageAlignment", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imageAlignment(){
			final com.apple.jobjc.Invoke.MsgSend imageAlignment_IMetInst = get_imageAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageAlignment_IMetInst.init(nativeBuffer, this);
		imageAlignment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageFrameStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageFrameStyle_IMetInst(){
		return ((imageFrameStyle_IMetInst != null)
	? (imageFrameStyle_IMetInst)
	: (imageFrameStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageFrameStyle", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imageFrameStyle(){
			final com.apple.jobjc.Invoke.MsgSend imageFrameStyle_IMetInst = get_imageFrameStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageFrameStyle_IMetInst.init(nativeBuffer, this);
		imageFrameStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageScaling_IMetInst(){
		return ((imageScaling_IMetInst != null)
	? (imageScaling_IMetInst)
	: (imageScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageScaling", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long imageScaling(){
			final com.apple.jobjc.Invoke.MsgSend imageScaling_IMetInst = get_imageScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageScaling_IMetInst.init(nativeBuffer, this);
		imageScaling_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend setAllowsCutCopyPaste_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsCutCopyPaste_IMetInst(){
		return ((setAllowsCutCopyPaste_IMetInst != null)
	? (setAllowsCutCopyPaste_IMetInst)
	: (setAllowsCutCopyPaste_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsCutCopyPaste:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsCutCopyPaste(final boolean allow){
			final com.apple.jobjc.Invoke.MsgSend setAllowsCutCopyPaste_IMetInst = get_setAllowsCutCopyPaste_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsCutCopyPaste_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allow);
		setAllowsCutCopyPaste_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAnimates_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAnimates_IMetInst(){
		return ((setAnimates_IMetInst != null)
	? (setAnimates_IMetInst)
	: (setAnimates_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAnimates:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAnimates(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAnimates_IMetInst = get_setAnimates_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAnimates_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAnimates_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean yn){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, yn);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_IMetInst(){
		return ((setImage_IMetInst != null)
	? (setImage_IMetInst)
	: (setImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setImage(final com.apple.jobjc.appkit.NSImage newImage){
			final com.apple.jobjc.Invoke.MsgSend setImage_IMetInst = get_setImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newImage);
		setImage_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageAlignment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageAlignment_IMetInst(){
		return ((setImageAlignment_IMetInst != null)
	? (setImageAlignment_IMetInst)
	: (setImageAlignment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageAlignment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImageAlignment(final long newAlign){
			final com.apple.jobjc.Invoke.MsgSend setImageAlignment_IMetInst = get_setImageAlignment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageAlignment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newAlign);
		setImageAlignment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageFrameStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageFrameStyle_IMetInst(){
		return ((setImageFrameStyle_IMetInst != null)
	? (setImageFrameStyle_IMetInst)
	: (setImageFrameStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageFrameStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImageFrameStyle(final long newStyle){
			final com.apple.jobjc.Invoke.MsgSend setImageFrameStyle_IMetInst = get_setImageFrameStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageFrameStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newStyle);
		setImageFrameStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageScaling_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageScaling_IMetInst(){
		return ((setImageScaling_IMetInst != null)
	? (setImageScaling_IMetInst)
	: (setImageScaling_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageScaling:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setImageScaling(final long newScaling){
			final com.apple.jobjc.Invoke.MsgSend setImageScaling_IMetInst = get_setImageScaling_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageScaling_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, newScaling);
		setImageScaling_IMetInst.invoke(nativeBuffer);
		
		
	}

}
