package com.apple.jobjc.appkit;

public  class NSCollectionViewItem extends com.apple.jobjc.appkit.NSViewController {
	public NSCollectionViewItem(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSCollectionViewItem(final NSCollectionViewItem obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend collectionView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_collectionView_IMetInst(){
		return ((collectionView_IMetInst != null)
	? (collectionView_IMetInst)
	: (collectionView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "collectionView", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSCollectionView collectionView(){
			final com.apple.jobjc.Invoke.MsgSend collectionView_IMetInst = get_collectionView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		collectionView_IMetInst.init(nativeBuffer, this);
		collectionView_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSCollectionView returnValue = (com.apple.jobjc.appkit.NSCollectionView) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend isSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelected_IMetInst(){
		return ((isSelected_IMetInst != null)
	? (isSelected_IMetInst)
	: (isSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelected", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isSelected(){
			final com.apple.jobjc.Invoke.MsgSend isSelected_IMetInst = get_isSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelected_IMetInst.init(nativeBuffer, this);
		isSelected_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setSelected_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelected_IMetInst(){
		return ((setSelected_IMetInst != null)
	? (setSelected_IMetInst)
	: (setSelected_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelected:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelected(final boolean selected){
			final com.apple.jobjc.Invoke.MsgSend setSelected_IMetInst = get_setSelected_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelected_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, selected);
		setSelected_IMetInst.invoke(nativeBuffer);
		
		
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
