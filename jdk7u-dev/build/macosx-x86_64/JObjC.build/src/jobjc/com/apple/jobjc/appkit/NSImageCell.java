package com.apple.jobjc.appkit;

public  class NSImageCell extends com.apple.jobjc.appkit.NSCell {
	public NSImageCell(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSImageCell(final NSImageCell obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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
