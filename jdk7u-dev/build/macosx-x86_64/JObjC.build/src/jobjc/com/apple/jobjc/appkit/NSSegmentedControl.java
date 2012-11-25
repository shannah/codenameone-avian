package com.apple.jobjc.appkit;

public  class NSSegmentedControl extends com.apple.jobjc.appkit.NSControl {
	public NSSegmentedControl(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSSegmentedControl(final NSSegmentedControl obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend imageForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageForSegment_IMetInst(){
		return ((imageForSegment_IMetInst != null)
	? (imageForSegment_IMetInst)
	: (imageForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageForSegment:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSImage imageForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend imageForSegment_IMetInst = get_imageForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		imageForSegment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSImage returnValue = (com.apple.jobjc.appkit.NSImage) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend imageScalingForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_imageScalingForSegment_IMetInst(){
		return ((imageScalingForSegment_IMetInst != null)
	? (imageScalingForSegment_IMetInst)
	: (imageScalingForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "imageScalingForSegment:", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long imageScalingForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend imageScalingForSegment_IMetInst = get_imageScalingForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		imageScalingForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		imageScalingForSegment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEnabledForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEnabledForSegment_IMetInst(){
		return ((isEnabledForSegment_IMetInst != null)
	? (isEnabledForSegment_IMetInst)
	: (isEnabledForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEnabledForSegment:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean isEnabledForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend isEnabledForSegment_IMetInst = get_isEnabledForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEnabledForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		isEnabledForSegment_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isSelectedForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isSelectedForSegment_IMetInst(){
		return ((isSelectedForSegment_IMetInst != null)
	? (isSelectedForSegment_IMetInst)
	: (isSelectedForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isSelectedForSegment:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean isSelectedForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend isSelectedForSegment_IMetInst = get_isSelectedForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isSelectedForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		isSelectedForSegment_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend labelForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_labelForSegment_IMetInst(){
		return ((labelForSegment_IMetInst != null)
	? (labelForSegment_IMetInst)
	: (labelForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "labelForSegment:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSString labelForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend labelForSegment_IMetInst = get_labelForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		labelForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		labelForSegment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuForSegment_IMetInst(){
		return ((menuForSegment_IMetInst != null)
	? (menuForSegment_IMetInst)
	: (menuForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuForSegment:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenu menuForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend menuForSegment_IMetInst = get_menuForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		menuForSegment_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend segmentCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_segmentCount_IMetInst(){
		return ((segmentCount_IMetInst != null)
	? (segmentCount_IMetInst)
	: (segmentCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "segmentCount", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long segmentCount(){
			final com.apple.jobjc.Invoke.MsgSend segmentCount_IMetInst = get_segmentCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		segmentCount_IMetInst.init(nativeBuffer, this);
		segmentCount_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend segmentStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_segmentStyle_IMetInst(){
		return ((segmentStyle_IMetInst != null)
	? (segmentStyle_IMetInst)
	: (segmentStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "segmentStyle", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long segmentStyle(){
			final com.apple.jobjc.Invoke.MsgSend segmentStyle_IMetInst = get_segmentStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		segmentStyle_IMetInst.init(nativeBuffer, this);
		segmentStyle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectSegmentWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectSegmentWithTag_IMetInst(){
		return ((selectSegmentWithTag_IMetInst != null)
	? (selectSegmentWithTag_IMetInst)
	: (selectSegmentWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectSegmentWithTag:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public boolean selectSegmentWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend selectSegmentWithTag_IMetInst = get_selectSegmentWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectSegmentWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		selectSegmentWithTag_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedSegment_IMetInst(){
		return ((selectedSegment_IMetInst != null)
	? (selectedSegment_IMetInst)
	: (selectedSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedSegment", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long selectedSegment(){
			final com.apple.jobjc.Invoke.MsgSend selectedSegment_IMetInst = get_selectedSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedSegment_IMetInst.init(nativeBuffer, this);
		selectedSegment_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setEnabled_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEnabled_forSegment_IMetInst(){
		return ((setEnabled_forSegment_IMetInst != null)
	? (setEnabled_forSegment_IMetInst)
	: (setEnabled_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEnabled:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setEnabled_forSegment(final boolean enabled, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setEnabled_forSegment_IMetInst = get_setEnabled_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEnabled_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, enabled);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setEnabled_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImage_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImage_forSegment_IMetInst(){
		return ((setImage_forSegment_IMetInst != null)
	? (setImage_forSegment_IMetInst)
	: (setImage_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImage:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setImage_forSegment(final com.apple.jobjc.appkit.NSImage image, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setImage_forSegment_IMetInst = get_setImage_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImage_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, image);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setImage_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setImageScaling_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setImageScaling_forSegment_IMetInst(){
		return ((setImageScaling_forSegment_IMetInst != null)
	? (setImageScaling_forSegment_IMetInst)
	: (setImageScaling_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setImageScaling:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setImageScaling_forSegment(final long scaling, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setImageScaling_forSegment_IMetInst = get_setImageScaling_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setImageScaling_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, scaling);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setImageScaling_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLabel_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLabel_forSegment_IMetInst(){
		return ((setLabel_forSegment_IMetInst != null)
	? (setLabel_forSegment_IMetInst)
	: (setLabel_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLabel:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setLabel_forSegment(final com.apple.jobjc.foundation.NSString label, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setLabel_forSegment_IMetInst = get_setLabel_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLabel_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, label);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setLabel_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenu_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenu_forSegment_IMetInst(){
		return ((setMenu_forSegment_IMetInst != null)
	? (setMenu_forSegment_IMetInst)
	: (setMenu_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenu:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setMenu_forSegment(final com.apple.jobjc.appkit.NSMenu menu, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setMenu_forSegment_IMetInst = get_setMenu_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenu_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menu);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setMenu_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSegmentCount_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSegmentCount_IMetInst(){
		return ((setSegmentCount_IMetInst != null)
	? (setSegmentCount_IMetInst)
	: (setSegmentCount_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSegmentCount:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSegmentCount(final long count){
			final com.apple.jobjc.Invoke.MsgSend setSegmentCount_IMetInst = get_setSegmentCount_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSegmentCount_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, count);
		setSegmentCount_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSegmentStyle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSegmentStyle_IMetInst(){
		return ((setSegmentStyle_IMetInst != null)
	? (setSegmentStyle_IMetInst)
	: (setSegmentStyle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSegmentStyle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSegmentStyle(final long segmentStyle){
			final com.apple.jobjc.Invoke.MsgSend setSegmentStyle_IMetInst = get_setSegmentStyle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSegmentStyle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segmentStyle);
		setSegmentStyle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelected_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelected_forSegment_IMetInst(){
		return ((setSelected_forSegment_IMetInst != null)
	? (setSelected_forSegment_IMetInst)
	: (setSelected_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelected:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSelected_forSegment(final boolean selected, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setSelected_forSegment_IMetInst = get_setSelected_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelected_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, selected);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setSelected_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectedSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectedSegment_IMetInst(){
		return ((setSelectedSegment_IMetInst != null)
	? (setSelectedSegment_IMetInst)
	: (setSelectedSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectedSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setSelectedSegment(final long selectedSegment){
			final com.apple.jobjc.Invoke.MsgSend setSelectedSegment_IMetInst = get_setSelectedSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectedSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, selectedSegment);
		setSelectedSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setWidth_forSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setWidth_forSegment_IMetInst(){
		return ((setWidth_forSegment_IMetInst != null)
	? (setWidth_forSegment_IMetInst)
	: (setWidth_forSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setWidth:forSegment:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void setWidth_forSegment(final double width, final long segment){
			final com.apple.jobjc.Invoke.MsgSend setWidth_forSegment_IMetInst = get_setWidth_forSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setWidth_forSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		setWidth_forSegment_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend widthForSegment_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_widthForSegment_IMetInst(){
		return ((widthForSegment_IMetInst != null)
	? (widthForSegment_IMetInst)
	: (widthForSegment_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "widthForSegment:", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public double widthForSegment(final long segment){
			final com.apple.jobjc.Invoke.MsgSend widthForSegment_IMetInst = get_widthForSegment_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		widthForSegment_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, segment);
		widthForSegment_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

}
