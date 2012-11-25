package com.apple.jobjc.appkit;

public  class NSColorPicker extends com.apple.jobjc.foundation.NSObject {
	public NSColorPicker(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSColorPicker(final NSColorPicker obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachColorList_IMetInst(){
		return ((attachColorList_IMetInst != null)
	? (attachColorList_IMetInst)
	: (attachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void attachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend attachColorList_IMetInst = get_attachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		attachColorList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend buttonToolTip_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_buttonToolTip_IMetInst(){
		return ((buttonToolTip_IMetInst != null)
	? (buttonToolTip_IMetInst)
	: (buttonToolTip_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "buttonToolTip", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString buttonToolTip(){
			final com.apple.jobjc.Invoke.MsgSend buttonToolTip_IMetInst = get_buttonToolTip_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		buttonToolTip_IMetInst.init(nativeBuffer, this);
		buttonToolTip_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend colorPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_colorPanel_IMetInst(){
		return ((colorPanel_IMetInst != null)
	? (colorPanel_IMetInst)
	: (colorPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "colorPanel", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSColorPanel colorPanel(){
			final com.apple.jobjc.Invoke.MsgSend colorPanel_IMetInst = get_colorPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		colorPanel_IMetInst.init(nativeBuffer, this);
		colorPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSColorPanel returnValue = (com.apple.jobjc.appkit.NSColorPanel) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_detachColorList_IMetInst(){
		return ((detachColorList_IMetInst != null)
	? (detachColorList_IMetInst)
	: (detachColorList_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "detachColorList:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void detachColorList(final com.apple.jobjc.appkit.NSColorList colorList){
			final com.apple.jobjc.Invoke.MsgSend detachColorList_IMetInst = get_detachColorList_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		detachColorList_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, colorList);
		detachColorList_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithPickerMask_colorPanel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithPickerMask_colorPanel_IMetInst(){
		return ((initWithPickerMask_colorPanel_IMetInst != null)
	? (initWithPickerMask_colorPanel_IMetInst)
	: (initWithPickerMask_colorPanel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithPickerMask:colorPanel:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithPickerMask_colorPanel(final long mask, final com.apple.jobjc.appkit.NSColorPanel owningColorPanel){
			final com.apple.jobjc.Invoke.MsgSend initWithPickerMask_colorPanel_IMetInst = get_initWithPickerMask_colorPanel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithPickerMask_colorPanel_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, owningColorPanel);
		initWithPickerMask_colorPanel_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertNewButtonImage_in_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertNewButtonImage_in_IMetInst(){
		return ((insertNewButtonImage_in_IMetInst != null)
	? (insertNewButtonImage_in_IMetInst)
	: (insertNewButtonImage_in_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertNewButtonImage:in:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertNewButtonImage_in(final com.apple.jobjc.appkit.NSImage newButtonImage, final com.apple.jobjc.appkit.NSButtonCell buttonCell){
			final com.apple.jobjc.Invoke.MsgSend insertNewButtonImage_in_IMetInst = get_insertNewButtonImage_in_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertNewButtonImage_in_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newButtonImage);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, buttonCell);
		insertNewButtonImage_in_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minContentSize_IMetInst(){
		return ((minContentSize_IMetInst != null)
	? (minContentSize_IMetInst)
	: (minContentSize_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minContentSize", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize minContentSize(){
			final com.apple.jobjc.Invoke.MsgSend minContentSize_IMetInst = get_minContentSize_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minContentSize_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		minContentSize_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend provideNewButtonImage_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_provideNewButtonImage_IMetInst(){
		return ((provideNewButtonImage_IMetInst != null)
	? (provideNewButtonImage_IMetInst)
	: (provideNewButtonImage_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "provideNewButtonImage", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSImage provideNewButtonImage(){
			final com.apple.jobjc.Invoke.MsgSend provideNewButtonImage_IMetInst = get_provideNewButtonImage_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		provideNewButtonImage_IMetInst.init(nativeBuffer, this);
		provideNewButtonImage_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setMode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMode_IMetInst(){
		return ((setMode_IMetInst != null)
	? (setMode_IMetInst)
	: (setMode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMode(final long mode){
			final com.apple.jobjc.Invoke.MsgSend setMode_IMetInst = get_setMode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, mode);
		setMode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend viewSizeChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_viewSizeChanged_IMetInst(){
		return ((viewSizeChanged_IMetInst != null)
	? (viewSizeChanged_IMetInst)
	: (viewSizeChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "viewSizeChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void viewSizeChanged(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend viewSizeChanged_IMetInst = get_viewSizeChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		viewSizeChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		viewSizeChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

}
